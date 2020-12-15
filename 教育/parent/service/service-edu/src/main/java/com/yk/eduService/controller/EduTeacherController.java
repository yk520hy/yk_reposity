package com.yk.eduService.controller;


import com.yk.eduService.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author yk
 * @since 2020-12-15
 */
@RestController
@RequestMapping("/eduService/edu-teacher")
public class EduTeacherController {

    @Autowired
    private EduTeacherService eduTeacherService;

    public
}

