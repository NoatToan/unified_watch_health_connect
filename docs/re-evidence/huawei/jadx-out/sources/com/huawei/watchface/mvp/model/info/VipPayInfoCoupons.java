package com.huawei.watchface.mvp.model.info;

import com.huawei.watchface.mvp.model.datatype.VipPackageBean;

/* JADX INFO: loaded from: classes45.dex */
public class VipPayInfoCoupons extends VipPackageBean {
    private String couponId;
    private String deviceModel;
    private int orderChannel;
    private String orderType;
    private String productId;
    private String promotionId;
    private String promotionName;
    private String reportedPrice;
    private String sign;

    public void copyInfo(VipPackageBean vipPackageBean) {
        if (vipPackageBean != null) {
            setProductCode(vipPackageBean.getProductCode());
            setProductType(vipPackageBean.getProductType());
            setUserType(vipPackageBean.getUserType());
            setProductName(vipPackageBean.getProductName());
            setPrice(vipPackageBean.getPrice());
            setProductDesc(vipPackageBean.getProductDesc());
            setSymbol(vipPackageBean.getSymbol());
            setDiscountPrice(vipPackageBean.getDiscountPrice());
            setCurrency(vipPackageBean.getCurrency());
            setValidDay(vipPackageBean.getValidDay());
            setCanRenewFlag(vipPackageBean.getCanRenewFlag());
            setRenewCode(vipPackageBean.getRenewCode());
            setExtendInfo(vipPackageBean.getExtendInfo());
            setSuspension(vipPackageBean.getSuspension());
            setPromotiondesc(vipPackageBean.getPromotiondesc());
            setPromotionurl(vipPackageBean.getPromotionurl());
            setMarkUrl(vipPackageBean.getMarkUrl());
            setSendCount(vipPackageBean.getSendCount());
            setRelProductCode(vipPackageBean.getRelProductCode());
            setRelProductDes(vipPackageBean.getRelProductDes());
            setRedirectUrl(vipPackageBean.getRedirectUrl());
            setPromotionPackage(vipPackageBean.getPromotionPackage());
            setMagicExtendInfo(vipPackageBean.getMagicExtendInfo());
        }
    }

    public String getCouponId() {
        return this.couponId;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public int getOrderChannel() {
        return this.orderChannel;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    public String getPromotionName() {
        return this.promotionName;
    }

    public String getReportedPrice() {
        return this.reportedPrice;
    }

    public String getSign() {
        return this.sign;
    }

    public void setCouponId(String str) {
        this.couponId = str;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setOrderChannel(int i) {
        this.orderChannel = i;
    }

    public void setOrderType(String str) {
        this.orderType = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setPromotionId(String str) {
        this.promotionId = str;
    }

    public void setPromotionName(String str) {
        this.promotionName = str;
    }

    public void setReportedPrice(String str) {
        this.reportedPrice = str;
    }

    public void setSign(String str) {
        this.sign = str;
    }
}
