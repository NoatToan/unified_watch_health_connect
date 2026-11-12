package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class RechargeOrderInfo {
    private boolean isUnfinished;

    @SerializedName("amount")
    private int mAmount;

    @SerializedName("orderId")
    private String mOrderId;

    @SerializedName("richStatus")
    private int mRichStatus;

    @SerializedName("statusDesc")
    private String mStatusDesc;

    @SerializedName("time")
    private String mTime;

    @SerializedName("title")
    private String mTitle;

    public int getAmount() {
        return this.mAmount;
    }

    public String getOrderId() {
        return this.mOrderId;
    }

    public String getStatusDesc() {
        return this.mStatusDesc;
    }

    public String getTime() {
        return this.mTime;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public boolean isUnfinished() {
        return this.isUnfinished;
    }

    public void setUnfinished() {
        this.isUnfinished = true;
    }
}
