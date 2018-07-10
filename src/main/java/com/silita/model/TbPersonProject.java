package com.silita.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TbPersonProject {
    /**
     * 项目部人员ID
     */
    private Integer pkid;

    /**
     * 网站内部ID
     */
    private String innerid;

    /**
     * 关联子项目ID
     */
    private Integer pid;

    /**
     * 企业名称
     */
    private String comName;

    /**
     * 姓名
     */
    private String name;

    /**
     * 注册类别
     */
    private String category;

    /**
     * 证书编号
     */
    private String certNo;

    /**
     * 安全证书编号
     */
    private String safeNo;

    /**
     * 状态
     */
    private String status;

    /**
     * 监理OR施工类型；监理：supervision；施工：build；勘察：design
     */
    private String type;

    /**
     * 人员在项目中担任的角色，项目经理/项目总监/总监理工程师
     */
    private String role;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

}