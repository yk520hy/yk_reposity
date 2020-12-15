package com.yk;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

public class CodeGenerator {
    @Test
    public void getCode() {
        // 1、创建代码生成器
        AutoGenerator mpg = new AutoGenerator();

        GlobalConfig gc = new GlobalConfig();
        System.getProperty("user.dir");
        gc.setOutputDir("E:\\education\\service\\service_edu" + "/src/main/java");
        gc.setAuthor("yk");
        gc.setOpen(false);
        gc.setFileOverride(false);

        gc.setServiceName("%sService");

        gc.setIdType(IdType.ID_WORKER_STR);
        gc.setDateType(DateType.ONLY_DATE);
        gc.setSwagger2(true);

        mpg.setGlobalConfig(gc);

        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://8.129.70.245:3306/education");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123456");
        dataSourceConfig.setDbType(DbType.MYSQL);
        mpg.setDataSource(dataSourceConfig);

        PackageConfig pc = new PackageConfig();
        pc.setModuleName("eduService");
        pc.setParent("com.yk");
        pc.setController("controller");
        pc.setService("service");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);

        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("edu_teacher");
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setTablePrefix(pc.getModuleName()+"_");
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setRestControllerStyle(true);
        strategyConfig.setControllerMappingHyphenStyle(true);
        mpg.setStrategy(strategyConfig);

        mpg.execute();



    }
}
