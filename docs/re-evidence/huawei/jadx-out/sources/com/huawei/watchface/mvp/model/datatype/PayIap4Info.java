package com.huawei.watchface.mvp.model.datatype;

/* JADX INFO: loaded from: classes45.dex */
public class PayIap4Info {
    private String applicationId;
    private String countryCode;
    private DeveloperPayload developerPayload;
    private String packageName;
    private String priceType;
    private String productId;
    private ReservedInfor reservedInfor;

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public DeveloperPayload getDeveloperPayload() {
        return this.developerPayload;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPriceType() {
        return this.priceType;
    }

    public String getProductId() {
        return this.productId;
    }

    public ReservedInfor getReservedInfor() {
        return this.reservedInfor;
    }

    public void setApplicationId(String str) {
        this.applicationId = str;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setDeveloperPayload(DeveloperPayload developerPayload) {
        this.developerPayload = developerPayload;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPriceType(String str) {
        this.priceType = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setReservedInfor(ReservedInfor reservedInfor) {
        this.reservedInfor = reservedInfor;
    }
}
