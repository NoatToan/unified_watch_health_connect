package com.miui.tsmclient.net.doorcardv3.response;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.entity.doorcardv3.CollectionDataConfig;

/* JADX INFO: loaded from: classes6.dex */
public class PullCollectionDataConfigResponse extends CommonResponseInfo {

    @SerializedName("data")
    private CollectionDataConfig mCollectionDataConfig;

    public CollectionDataConfig getColletDataConfig() {
        return this.mCollectionDataConfig;
    }
}
