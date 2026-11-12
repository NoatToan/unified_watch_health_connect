package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class PayResultInfo {

    @SerializedName("offAmount")
    private long mDiscountAmount;

    @SerializedName("originalAmount")
    private long mTransactionAmount;

    public long getDiscountAmount() {
        return this.mDiscountAmount;
    }

    public long getTransactionAmount() {
        return this.mTransactionAmount;
    }
}
