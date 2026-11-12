package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;

/* JADX INFO: loaded from: classes6.dex */
public class TransferOutResponseInfo extends CommonResponseInfo {

    @SerializedName("data")
    private TransferOutOrderInfo mTransferOutOrderInfo;

    public TransferOutOrderInfo getTransferOutOrderInfo() {
        return this.mTransferOutOrderInfo;
    }

    public void setTransferOutOrderInfo(TransferOutOrderInfo transferOutOrderInfo) {
        this.mTransferOutOrderInfo = transferOutOrderInfo;
    }
}
