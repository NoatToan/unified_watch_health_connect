package com.huawei.watchface.mvp.model.datatype;

/* JADX INFO: loaded from: classes20.dex */
public class InstallWatchFaceBean {
    private String actionUrl;
    private String cnTitle;
    private String couponId;
    private String fileSize;
    private String fileUrl;
    private String hashCode;
    private int installationType;
    private boolean isOneClick;
    private boolean isThreePay;
    private boolean isUpdate;
    private boolean isZip;
    private String msg;
    private String price;
    private String productId;
    private String resourceType;
    private String showDialog;
    private String symbolType;
    private String title;
    private String version;
    private String versionCode;
    private boolean vipFreeWatchFace;
    private String watchFaceHiTopId;
    private String watchScreen;

    public InstallWatchFaceBean(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.watchFaceHiTopId = str;
        this.version = str2;
        this.fileUrl = str3;
        this.fileSize = str4;
        this.hashCode = str5;
        this.watchScreen = str6;
        this.isUpdate = z;
    }

    public String getActionUrl() {
        return this.actionUrl;
    }

    public String getCnTitle() {
        return this.cnTitle;
    }

    public String getCouponId() {
        return this.couponId;
    }

    public String getFileSize() {
        return this.fileSize;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public String getHashCode() {
        return this.hashCode;
    }

    public int getInstallationType() {
        return this.installationType;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getPrice() {
        return this.price;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public String getShowDialog() {
        return this.showDialog;
    }

    public String getSymbolType() {
        return this.symbolType;
    }

    public String getTitle() {
        return this.title;
    }

    public String getVersion() {
        return this.version;
    }

    public String getVersionCode() {
        return this.versionCode;
    }

    public String getWatchFaceHiTopId() {
        return this.watchFaceHiTopId;
    }

    public String getWatchScreen() {
        return this.watchScreen;
    }

    public boolean isOneClick() {
        return this.isOneClick;
    }

    public boolean isThreePay() {
        return this.isThreePay;
    }

    public boolean isUpdate() {
        return this.isUpdate;
    }

    public boolean isVipFreeWatchFace() {
        return this.vipFreeWatchFace;
    }

    public boolean isZip() {
        return this.isZip;
    }

    public void setActionUrl(String str) {
        this.actionUrl = str;
    }

    public void setCnTitle(String str) {
        this.cnTitle = str;
    }

    public void setCouponId(String str) {
        this.couponId = str;
    }

    public void setFileSize(String str) {
        this.fileSize = str;
    }

    public void setFileUrl(String str) {
        this.fileUrl = str;
    }

    public void setHashCode(String str) {
        this.hashCode = str;
    }

    public void setInstallationType(int i) {
        this.installationType = i;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setOneClick(boolean z) {
        this.isOneClick = z;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setResourceType(String str) {
        this.resourceType = str;
    }

    public void setShowDialog(String str) {
        this.showDialog = str;
    }

    public void setSymbolType(String str) {
        this.symbolType = str;
    }

    public void setThreePay(boolean z) {
        this.isThreePay = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUpdate(boolean z) {
        this.isUpdate = z;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setVersionCode(String str) {
        this.versionCode = str;
    }

    public void setVipFreeWatchFace(boolean z) {
        this.vipFreeWatchFace = z;
    }

    public void setWatchFaceHiTopId(String str) {
        this.watchFaceHiTopId = str;
    }

    public void setWatchScreen(String str) {
        this.watchScreen = str;
    }

    public void setZip(boolean z) {
        this.isZip = z;
    }

    public InstallWatchFaceBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        this(str, str2, str3, str4, str5, str6, str7, str8, z, 0);
    }

    public InstallWatchFaceBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i) {
        this.watchFaceHiTopId = str;
        this.version = str2;
        this.productId = str3;
        this.price = str4;
        this.showDialog = str5;
        this.symbolType = str6;
        this.versionCode = str7;
        this.couponId = str8;
        this.isThreePay = z;
        this.installationType = i;
    }

    public InstallWatchFaceBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this(str, str2, str3, str4, str5, str6, str7, str8, false);
    }

    public InstallWatchFaceBean() {
    }
}
