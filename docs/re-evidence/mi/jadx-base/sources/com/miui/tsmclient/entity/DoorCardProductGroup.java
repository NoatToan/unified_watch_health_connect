package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;

/* JADX INFO: loaded from: classes6.dex */
public class DoorCardProductGroup extends CommonResponseInfo {

    @SerializedName("data")
    private DoorCardProductResult mDoorCardProductResult;

    public DoorCardProductResult getDoorCardProductResult() {
        return this.mDoorCardProductResult;
    }

    @Override // com.miui.tsmclient.common.data.CommonResponseInfo
    public boolean isSuccess() {
        return super.isSuccess() && this.mDoorCardProductResult != null;
    }
}
