package com.silita.biaodaa.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TbCompany {
    /**
     * 企业ID
     */
    private Integer comId;

    /**
     * 企业名称
     */
    private String comName;

    /**
     * 组织机构代码
     */
    private String orgCode;

    /**
     * 工商营业执照
     */
    private String businessNum;

    /**
     * 注册地址
     */
    private String regisAddress;

    /**
     * 企业营业地址
     */
    private String comAddress;

    /**
     * 法人
     */
    private String legalPerson;

    /**
     * 经济类型
     */
    private String economicType;

    /**
     * 注册资本
     */
    private String regisCapital;

    /**
     * 技术负责人
     */
    private String skillLeader;

    /**
     * 企业资质
     */
    private String range;

    /**
     * 企业logo
     */
    private String logo;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;


}