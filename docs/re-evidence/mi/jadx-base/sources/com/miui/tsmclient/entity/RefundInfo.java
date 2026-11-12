package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class RefundInfo {

    @SerializedName("applyRefundAmount")
    private int mApplyRefundAmount;

    @SerializedName("responseCode")
    private String mResponseCode;

    @SerializedName("responseDesc")
    private String mResponseDesc;

    @SerializedName("success")
    private boolean mSuccess = false;

    public int getApplyRefundAmount() {
        return this.mApplyRefundAmount;
    }

    public String getResponseCode() {
        return this.mResponseCode;
    }

    public String getResponseDesc() {
        return this.mResponseDesc;
    }

    public boolean isSuccess() {
        return this.mSuccess;
    }

    public void setResponseCode(String str) {
        this.mResponseCode = str;
    }

    public void setResponseDesc(String str) {
        this.mResponseDesc = str;
    }
}
