package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;

/* JADX INFO: loaded from: classes6.dex */
public class DoorCardProductResponseInfo extends CommonResponseInfo {

    @SerializedName("data")
    private DoorCardProduct mDoorCardProduct;

    public DoorCardProduct getDoorCardProduct() {
        return this.mDoorCardProduct;
    }
}
