package com.stu.manage.demo.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 登录验证成功返回
 *
 * @author 刘龙
 */


@Data
public class LoginToken {
    @NotNull
    private String name;
    private String token;
}
