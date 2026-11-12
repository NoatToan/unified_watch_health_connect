package com.huawei.watchface.mvp.model.datatype;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.watchface.x;

/* JADX INFO: loaded from: classes20.dex */
public class WatchFaceOrderBean extends x {
    private String hispaceName;
    public String mCouponId;
    public String mReservedInfor;
    private String paySign;
    private String publicKey;

    @SerializedName("requstParams")
    private RequestParamsBean requestParams;

    @SerializedName("resultcode")
    private String resultCode;

    @SerializedName("resultinfo")
    private String resultInfo;
    private String tradeId;

    public static class RequestParamsBean {
        private String amount;

        @SerializedName(HwPayConstant.KEY_APPLICATIONID)
        private String applicationId;
        private String country;
        private String currency;
        private String environment;
        private String merchantId;
        private String merchantName;

        @SerializedName(HwPayConstant.KEY_PRODUCTDESC)
        private String productDescription;
        private String productName;
        private String requestId;
        private String sdkChannel;
        private String serviceCatalog;
        private String url;

        @SerializedName(HwPayConstant.KEY_URLVER)
        private String urlVersion;

        public String getAmount() {
            return this.amount;
        }

        public String getApplicationId() {
            return this.applicationId;
        }

        public String getCountry() {
            return this.country;
        }

        public String getCurrency() {
            return this.currency;
        }

        public String getEnvironment() {
            return this.environment;
        }

        public String getMerchantId() {
            return this.merchantId;
        }

        public String getMerchantName() {
            return this.merchantName;
        }

        public String getProductDescription() {
            return this.productDescription;
        }

        public String getProductName() {
            return this.productName;
        }

        public String getRequestId() {
            return this.requestId;
        }

        public String getSdkChannel() {
            return this.sdkChannel;
        }

        public String getServiceCatalog() {
            return this.serviceCatalog;
        }

        public String getUrl() {
            return this.url;
        }

        public String getUrlVersion() {
            return this.urlVersion;
        }

        public void setAmount(String str) {
            this.amount = str;
        }

        public void setApplicationId(String str) {
            this.applicationId = str;
        }

        public void setCountry(String str) {
            this.country = str;
        }

        public void setCurrency(String str) {
            this.currency = str;
        }

        public void setEnvironment(String str) {
            this.environment = str;
        }

        public void setMerchantId(String str) {
            this.merchantId = str;
        }

        public void setMerchantName(String str) {
            this.merchantName = str;
        }

        public void setProductDescription(String str) {
            this.productDescription = str;
        }

        public void setProductName(String str) {
            this.productName = str;
        }

        public void setRequestId(String str) {
            this.requestId = str;
        }

        public void setSdkChannel(String str) {
            this.sdkChannel = str;
        }

        public void setServiceCatalog(String str) {
            this.serviceCatalog = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlVersion(String str) {
            this.urlVersion = str;
        }
    }

    public String getHispaceName() {
        return this.hispaceName;
    }

    public String getPaySign() {
        return this.paySign;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public RequestParamsBean getRequestParams() {
        return this.requestParams;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public String getResultInfo() {
        return this.resultInfo;
    }

    public String getTradeId() {
        return this.tradeId;
    }

    public void setHispaceName(String str) {
        this.hispaceName = str;
    }

    public void setPaySign(String str) {
        this.paySign = str;
    }

    public void setPublicKey(String str) {
        this.publicKey = str;
    }

    public void setRequestParams(RequestParamsBean requestParamsBean) {
        this.requestParams = requestParamsBean;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public void setResultInfo(String str) {
        this.resultInfo = str;
    }

    public void setTradeId(String str) {
        this.tradeId = str;
    }
}
