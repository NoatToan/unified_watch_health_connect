package com.huawei.watchface.mvp.model.datatype;

/* JADX INFO: loaded from: classes45.dex */
public class VipOrderBean<T> {
    private String applicationId;
    private String memberOriPrice;
    private String memberSettlePrice;
    private T payInfo;
    private String productName;
    private String resourceOriPrice;
    private String resourceSettlePrice;
    private String resultcode;
    private String resultinfo;
    private String tradeId;
    private String validTime;

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getMemberOriPrice() {
        return this.memberOriPrice;
    }

    public String getMemberSettlePrice() {
        return this.memberSettlePrice;
    }

    public T getPayInfo() {
        return this.payInfo;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getResourceOriPrice() {
        return this.resourceOriPrice;
    }

    public String getResourceSettlePrice() {
        return this.resourceSettlePrice;
    }

    public String getResultcode() {
        return this.resultcode;
    }

    public String getResultinfo() {
        return this.resultinfo;
    }

    public String getTradeId() {
        return this.tradeId;
    }

    public String getValidTime() {
        return this.validTime;
    }

    public void setApplicationId(String str) {
        this.applicationId = str;
    }

    public void setMemberOriPrice(String str) {
        this.memberOriPrice = str;
    }

    public void setMemberSettlePrice(String str) {
        this.memberSettlePrice = str;
    }

    public void setPayInfo(T t) {
        this.payInfo = t;
    }

    public void setProductName(String str) {
        this.productName = str;
    }

    public void setResourceOriPrice(String str) {
        this.resourceOriPrice = str;
    }

    public void setResourceSettlePrice(String str) {
        this.resourceSettlePrice = str;
    }

    public void setResultcode(String str) {
        this.resultcode = str;
    }

    public void setResultinfo(String str) {
        this.resultinfo = str;
    }

    public void setTradeId(String str) {
        this.tradeId = str;
    }

    public void setValidTime(String str) {
        this.validTime = str;
    }
}
