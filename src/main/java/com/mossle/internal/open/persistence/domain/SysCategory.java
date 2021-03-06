package com.mossle.internal.open.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SysCategory 系统分类.
 * 
 * @author Lingo
 */
@Entity
@Table(name = "SYS_CATEGORY")
public class SysCategory implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** 主键. */
    private Long id;

    /** 外键，上级分类. */
    private SysCategory sysCategory;

    /** 编码. */
    private String code;

    /** 名称. */
    private String name;

    /** 图标. */
    private String logo;

    /** 排序. */
    private Integer priority;

    /** 状态. */
    private String status;

    /** 备注. */
    private String descn;

    /** 创建时间. */
    private Date createTime;

    /** 创建人. */
    private String userId;

    /** 租户. */
    private String tenantId;

    /** . */
    private Set<SysCategory> sysCategories = new HashSet<SysCategory>(0);

    /** . */
    private Set<SysInfo> sysInfos = new HashSet<SysInfo>(0);

    /** . */
    private Set<SysEntry> sysEntries = new HashSet<SysEntry>(0);

    public SysCategory() {
    }

    public SysCategory(Long id) {
        this.id = id;
    }

    public SysCategory(Long id, SysCategory sysCategory, String code,
            String name, String logo, Integer priority, String status,
            String descn, Date createTime, String userId, String tenantId,
            Set<SysCategory> sysCategories, Set<SysInfo> sysInfos,
            Set<SysEntry> sysEntries) {
        this.id = id;
        this.sysCategory = sysCategory;
        this.code = code;
        this.name = name;
        this.logo = logo;
        this.priority = priority;
        this.status = status;
        this.descn = descn;
        this.createTime = createTime;
        this.userId = userId;
        this.tenantId = tenantId;
        this.sysCategories = sysCategories;
        this.sysInfos = sysInfos;
        this.sysEntries = sysEntries;
    }

    /** @return 主键. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            主键.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return 外键，上级分类. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    public SysCategory getSysCategory() {
        return this.sysCategory;
    }

    /**
     * @param sysCategory
     *            外键，上级分类.
     */
    public void setSysCategory(SysCategory sysCategory) {
        this.sysCategory = sysCategory;
    }

    /** @return 编码. */
    @Column(name = "CODE", length = 50)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            编码.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return 名称. */
    @Column(name = "NAME", length = 50)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            名称.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return 图标. */
    @Column(name = "LOGO", length = 200)
    public String getLogo() {
        return this.logo;
    }

    /**
     * @param logo
     *            图标.
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /** @return 排序. */
    @Column(name = "PRIORITY")
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @param priority
     *            排序.
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /** @return 状态. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            状态.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return 备注. */
    @Column(name = "DESCN", length = 200)
    public String getDescn() {
        return this.descn;
    }

    /**
     * @param descn
     *            备注.
     */
    public void setDescn(String descn) {
        this.descn = descn;
    }

    /** @return 创建时间. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            创建时间.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return 创建人. */
    @Column(name = "USER_ID", length = 64)
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            创建人.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** @return 租户. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            租户.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sysCategory")
    public Set<SysCategory> getSysCategories() {
        return this.sysCategories;
    }

    /**
     * @param sysCategories
     *            .
     */
    public void setSysCategories(Set<SysCategory> sysCategories) {
        this.sysCategories = sysCategories;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sysCategory")
    public Set<SysInfo> getSysInfos() {
        return this.sysInfos;
    }

    /**
     * @param sysInfos
     *            .
     */
    public void setSysInfos(Set<SysInfo> sysInfos) {
        this.sysInfos = sysInfos;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sysCategory")
    public Set<SysEntry> getSysEntries() {
        return this.sysEntries;
    }

    /**
     * @param sysEntries
     *            .
     */
    public void setSysEntries(Set<SysEntry> sysEntries) {
        this.sysEntries = sysEntries;
    }
}
