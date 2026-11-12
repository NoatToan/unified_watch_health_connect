package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.pay.OrderInfo;

/* JADX INFO: loaded from: classes6.dex */
public class OrderResponseInfo extends CommonResponseInfo {

    @SerializedName("data")
    private OrderInfo mOrderInfo;

    public OrderInfo getOrderInfo() {
        return this.mOrderInfo;
    }
}
