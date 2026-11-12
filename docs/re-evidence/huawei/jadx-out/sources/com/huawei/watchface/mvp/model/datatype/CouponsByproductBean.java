package com.huawei.watchface.mvp.model.datatype;

import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class CouponsByproductBean {
    private List<CouponAndPrice> couponAndPrice;
    private String resultcode;
    private String resultinfo;

    public class CouponAndPrice {
        private CouponMap couponMap;
        private String originalPrice;
        private String realPrice;

        public CouponAndPrice(CouponsByproductBean couponsByproductBean) {
        }

        public CouponMap getCouponMap() {
            return this.couponMap;
        }

        public String getOriginalPrice() {
            return this.originalPrice;
        }

        public String getRealPrice() {
            return this.realPrice;
        }

        public void setCouponMap(CouponMap couponMap) {
            this.couponMap = couponMap;
        }

        public void setOriginalPrice(String str) {
            this.originalPrice = str;
        }

        public void setRealPrice(String str) {
            this.realPrice = str;
        }
    }

    public class CouponMap {
        private String beginTime;
        private String couponId;
        private String couponIsAvailable;
        private String couponPrice;
        private String description;
        private String descriptionEN;
        private String discount;
        private String discountType;
        private String endTime;
        private String expiredTime;
        private String fullPirce;
        private String imageUrl;
        private String leftTime;
        private String promotionId;
        private String promotionNameCN;
        private String promotionNameEN;
        private String receiveTime;
        private String serviceStartTime;
        private String status;
        private String symbol;
        private String upperValue;

        public CouponMap(CouponsByproductBean couponsByproductBean) {
        }

        public String getBeginTime() {
            return this.beginTime;
        }

        public String getCouponId() {
            return this.couponId;
        }

        public String getCouponIsAvailable() {
            return this.couponIsAvailable;
        }

        public String getCouponPrice() {
            return this.couponPrice;
        }

        public String getDescription() {
            return this.description;
        }

        public String getDescriptionEN() {
            return this.descriptionEN;
        }

        public String getDiscount() {
            return this.discount;
        }

        public String getDiscountType() {
            return this.discountType;
        }

        public String getEndTime() {
            return this.endTime;
        }

        public String getExpiredTime() {
            return this.expiredTime;
        }

        public String getFullPirce() {
            return this.fullPirce;
        }

        public String getImageUrl() {
            return this.imageUrl;
        }

        public String getLeftTime() {
            return this.leftTime;
        }

        public String getPromotionId() {
            return this.promotionId;
        }

        public String getPromotionNameCN() {
            return this.promotionNameCN;
        }

        public String getPromotionNameEN() {
            return this.promotionNameEN;
        }

        public String getReceiveTime() {
            return this.receiveTime;
        }

        public String getServiceStartTime() {
            return this.serviceStartTime;
        }

        public String getStatus() {
            return this.status;
        }

        public String getSymbol() {
            return this.symbol;
        }

        public String getUpperValue() {
            return this.upperValue;
        }

        public void setBeginTime(String str) {
            this.beginTime = str;
        }

        public void setCouponId(String str) {
            this.couponId = str;
        }

        public void setCouponIsAvailable(String str) {
            this.couponIsAvailable = str;
        }

        public void setCouponPrice(String str) {
            this.couponPrice = str;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setDescriptionEN(String str) {
            this.descriptionEN = str;
        }

        public void setDiscount(String str) {
            this.discount = str;
        }

        public void setDiscountType(String str) {
            this.discountType = str;
        }

        public void setEndTime(String str) {
            this.endTime = str;
        }

        public void setExpiredTime(String str) {
            this.expiredTime = str;
        }

        public void setFullPirce(String str) {
            this.fullPirce = str;
        }

        public void setImageUrl(String str) {
            this.imageUrl = str;
        }

        public void setLeftTime(String str) {
            this.leftTime = str;
        }

        public void setPromotionId(String str) {
            this.promotionId = str;
        }

        public void setPromotionNameCN(String str) {
            this.promotionNameCN = str;
        }

        public void setPromotionNameEN(String str) {
            this.promotionNameEN = str;
        }

        public void setReceiveTime(String str) {
            this.receiveTime = str;
        }

        public void setServiceStartTime(String str) {
            this.serviceStartTime = str;
        }

        public void setStatus(String str) {
            this.status = str;
        }

        public void setSymbol(String str) {
            this.symbol = str;
        }

        public void setUpperValue(String str) {
            this.upperValue = str;
        }
    }

    public List<CouponAndPrice> getCouponAndPrice() {
        return this.couponAndPrice;
    }

    public String getResultcode() {
        return this.resultcode;
    }

    public String getResultinfo() {
        return this.resultinfo;
    }

    public void setCouponAndPrice(List<CouponAndPrice> list) {
        this.couponAndPrice = list;
    }

    public void setResultcode(String str) {
        this.resultcode = str;
    }

    public void setResultinfo(String str) {
        this.resultinfo = str;
    }
}
