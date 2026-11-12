package com.miui.tsmclient.net.doorcardv3.response;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.entity.doorcardv3.CalTaskData;

/* JADX INFO: loaded from: classes6.dex */
public class CheckUserCalTaskResponse extends CommonResponseInfo {

    @SerializedName("data")
    private CalTaskData mData;

    public CalTaskData getData() {
        return this.mData;
    }
}
