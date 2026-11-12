package com.huawei.health.tradeservice.cloud;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes32.dex */
public class AwardListReq implements IRequest {
    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("activityUrl") + "/activity/award/myAward";
    }
}
