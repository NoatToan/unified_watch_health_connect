package com.miui.tsmclient.sesdk;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class ServiceFeeRefundInfo implements IJsonDeserializer<ServiceFeeRefundInfo> {
    public static final int APPLY_FAIL = 2;
    public static final int APPLY_SUCCESS = 1;
    public static final int INITIALIZE = 0;
    public static final int NOT_TO_REFUND_DATE = 3;

    @SerializedName("refundDesc")
    private String mRefundDesc;

    @SerializedName("refundTicket")
    private String mRefundTicket;

    @SerializedName("returnCardDesc")
    private String mReturnCardDesc;

    @SerializedName("returnCardTicket")
    private String mReturnCardTicket;

    @SerializedName("status")
    private int mStatus;

    public static ServiceFeeRefundInfo fromJson(String str) {
        return (ServiceFeeRefundInfo) new Gson().fromJson(str, ServiceFeeRefundInfo.class);
    }

    public String getRefundDesc() {
        return this.mRefundDesc;
    }

    public String getRefundTicket() {
        return this.mRefundTicket;
    }

    public String getReturnCardDesc() {
        return this.mReturnCardDesc;
    }

    public String getReturnCardTicket() {
        return this.mReturnCardTicket;
    }

    public int getStatus() {
        return this.mStatus;
    }
}
