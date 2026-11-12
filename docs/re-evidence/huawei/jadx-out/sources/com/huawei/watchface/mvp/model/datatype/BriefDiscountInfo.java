package com.huawei.watchface.mvp.model.datatype;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes45.dex */
public class BriefDiscountInfo {
    private String discountCode;
    private String discountEndTime;
    private String discountId;
    private String discountPrice;
    private String discountType;
    private String fullDownUrls;
    private String givePrice;
    private String isActiveDiscount;
    private String markText;
    private String markUrl;
    private String priority;
    private String startTime;

    @SerializedName("UPDATEDATE")
    private String updateDate;

    public String getDiscountCode() {
        return this.discountCode;
    }

    public String getDiscountEndTime() {
        return this.discountEndTime;
    }

    public String getDiscountId() {
        return this.discountId;
    }

    public String getDiscountPrice() {
        return this.discountPrice;
    }

    public String getDiscountType() {
        return this.discountType;
    }

    public String getFullDownUrls() {
        return this.fullDownUrls;
    }

    public String getGivePrice() {
        return this.givePrice;
    }

    public String getIsActiveDiscount() {
        return this.isActiveDiscount;
    }

    public String getMarkText() {
        return this.markText;
    }

    public String getMarkUrl() {
        return this.markUrl;
    }

    public String getPriority() {
        return this.priority;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getUpdateDate() {
        return this.updateDate;
    }

    public void setDiscountCode(String str) {
        this.discountCode = str;
    }

    public void setDiscountEndTime(String str) {
        this.discountEndTime = str;
    }

    public void setDiscountId(String str) {
        this.discountId = str;
    }

    public void setDiscountPrice(String str) {
        this.discountPrice = str;
    }

    public void setDiscountType(String str) {
        this.discountType = str;
    }

    public void setFullDownUrls(String str) {
        this.fullDownUrls = str;
    }

    public void setGivePrice(String str) {
        this.givePrice = str;
    }

    public void setIsActiveDiscount(String str) {
        this.isActiveDiscount = str;
    }

    public void setMarkText(String str) {
        this.markText = str;
    }

    public void setMarkUrl(String str) {
        this.markUrl = str;
    }

    public void setPriority(String str) {
        this.priority = str;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setUpdateDate(String str) {
        this.updateDate = str;
    }
}
