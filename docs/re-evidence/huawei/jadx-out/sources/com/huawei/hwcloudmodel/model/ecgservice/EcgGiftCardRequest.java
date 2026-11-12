package com.huawei.hwcloudmodel.model.ecgservice;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes37.dex */
public class EcgGiftCardRequest implements IRequest {

    @SerializedName("pushType")
    private int mPushType;

    @SerializedName("recordId")
    private long mRecordId;

    public EcgGiftCardRequest(long j, int i) {
        this.mRecordId = j;
        this.mPushType = i;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/healthExpansion/record/v2/getRecordInfo";
    }
}
