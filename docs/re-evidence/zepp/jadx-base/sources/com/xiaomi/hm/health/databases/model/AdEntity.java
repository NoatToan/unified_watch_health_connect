package com.xiaomi.hm.health.databases.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class AdEntity implements Serializable {
    private static final long serialVersionUID = 1;
    private String a;
    public String adMonitor;
    public String assets;
    private String b;
    public String badge;
    public String bgBodyUrl;
    public String bgImgUrl;
    private String c;
    public String category;
    public String classifyName;
    public long closeTime;
    public String colorStr;
    public Long createTime;
    private String d;
    public Integer displayCount;
    private String e;
    public Long endTime;
    private String f;
    public String fgBannerUrl;
    public String fgLogoUrl;
    private Integer g;
    private String h;
    public String homeColor;
    private Integer i;
    public Boolean isValidity;
    public Boolean jsbridgeAuth;
    public String jumpStr;
    public Long startTime;
    public String supportType;

    public AdEntity() {
    }

    public String getAdMonitor() {
        return this.adMonitor;
    }

    public String getAssets() {
        return this.assets;
    }

    public String getBadge() {
        return this.badge;
    }

    public String getBgBodyUrl() {
        return this.bgBodyUrl;
    }

    public String getBgImgUrl() {
        return this.bgImgUrl;
    }

    public String getCategory() {
        return this.category;
    }

    public String getClassifyName() {
        return this.classifyName;
    }

    public long getCloseTime() {
        return this.closeTime;
    }

    public String getColorStr() {
        return this.colorStr;
    }

    public Long getCreateTime() {
        return this.createTime;
    }

    public String getDescription() {
        return this.f;
    }

    public Integer getDisplayCount() {
        return this.displayCount;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public String getFgBannerUrl() {
        return this.fgBannerUrl;
    }

    public String getFgLogoUrl() {
        return this.fgLogoUrl;
    }

    public String getHomeColor() {
        return this.homeColor;
    }

    public String getIconUrl() {
        return this.h;
    }

    public String getId() {
        return this.a;
    }

    public String getImgUrl() {
        return this.e;
    }

    public Boolean getIsValidity() {
        return this.isValidity;
    }

    public Boolean getJsbridgeAuth() {
        return this.jsbridgeAuth;
    }

    public String getJumpStr() {
        return this.jumpStr;
    }

    public Integer getMode() {
        return this.g;
    }

    public Long getStartTime() {
        return this.startTime;
    }

    public Integer getStatus() {
        return this.i;
    }

    public String getSubTitle() {
        return this.c;
    }

    public String getSupportType() {
        return this.supportType;
    }

    public String getTarget() {
        return this.d;
    }

    public String getTitle() {
        return this.b;
    }

    public void setAdMonitor(String str) {
        this.adMonitor = str;
    }

    public void setAssets(String str) {
        this.assets = str;
    }

    public void setBadge(String str) {
        this.badge = str;
    }

    public void setBgBodyUrl(String str) {
        this.bgBodyUrl = str;
    }

    public void setBgImgUrl(String str) {
        this.bgImgUrl = str;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setClassifyName(String str) {
        this.classifyName = str;
    }

    public void setCloseTime(long j) {
        this.closeTime = j;
    }

    public void setColorStr(String str) {
        this.colorStr = str;
    }

    public void setCreateTime(Long l) {
        this.createTime = l;
    }

    public void setDescription(String str) {
        this.f = str;
    }

    public void setDisplayCount(Integer num) {
        this.displayCount = num;
    }

    public void setEndTime(Long l) {
        this.endTime = l;
    }

    public void setFgBannerUrl(String str) {
        this.fgBannerUrl = str;
    }

    public void setFgLogoUrl(String str) {
        this.fgLogoUrl = str;
    }

    public void setHomeColor(String str) {
        this.homeColor = str;
    }

    public void setIconUrl(String str) {
        this.h = str;
    }

    public void setId(String str) {
        this.a = str;
    }

    public void setImgUrl(String str) {
        this.e = str;
    }

    public void setIsValidity(Boolean bool) {
        this.isValidity = bool;
    }

    public void setJsbridgeAuth(Boolean bool) {
        this.jsbridgeAuth = bool;
    }

    public void setJumpStr(String str) {
        this.jumpStr = str;
    }

    public void setMode(Integer num) {
        this.g = num;
    }

    public void setStartTime(Long l) {
        this.startTime = l;
    }

    public void setStatus(Integer num) {
        this.i = num;
    }

    public void setSubTitle(String str) {
        this.c = str;
    }

    public void setSupportType(String str) {
        this.supportType = str;
    }

    public void setTarget(String str) {
        this.d = str;
    }

    public void setTitle(String str) {
        this.b = str;
    }

    public String toString() {
        return "AdEntity{id='" + this.a + "', title='" + this.b + "', subTitle='" + this.c + "', target='" + this.d + "', imgUrl='" + this.e + "', description='" + this.f + "', mode=" + this.g + ", iconUrl='" + this.h + "', supportType='" + this.supportType + "', endTime='" + this.endTime + "', badge='" + this.badge + "', category='" + this.category + "', isValidity='" + this.isValidity + "', status='" + this.i + "'}";
    }

    public AdEntity(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, Integer num2, Boolean bool, String str8, String str9, Long l, Long l2, String str10, Integer num3, Long l3, String str11, Boolean bool2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = num;
        this.h = str7;
        this.i = num2;
        this.jsbridgeAuth = bool;
        this.supportType = str8;
        this.classifyName = str9;
        this.endTime = l;
        this.startTime = l2;
        this.badge = str10;
        this.displayCount = num3;
        this.createTime = l3;
        this.category = str11;
        this.isValidity = bool2;
        this.bgImgUrl = str12;
        this.colorStr = str13;
        this.jumpStr = str14;
        this.fgLogoUrl = str15;
        this.bgBodyUrl = str16;
        this.fgBannerUrl = str17;
        this.homeColor = str18;
        this.assets = str19;
        this.adMonitor = str20;
        this.closeTime = j;
    }
}
