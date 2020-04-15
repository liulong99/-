package com.stu.manage.demo.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 年级和班级
 *
 * @author 刘龙
 */

@Data
public class GradeClass {
    @NotNull
    private String gradeId;
    @NotNull
    private String classId;
}
