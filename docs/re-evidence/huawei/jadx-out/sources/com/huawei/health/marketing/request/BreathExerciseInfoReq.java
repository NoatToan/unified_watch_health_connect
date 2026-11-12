package com.huawei.health.marketing.request;

import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes7.dex */
public class BreathExerciseInfoReq implements IRequest {
    private String ids;

    public String getIds() {
        return this.ids;
    }

    public void setIds(String str) {
        this.ids = str;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("messageCenterUrl") + "/messageCenter/getBreathTrainingList";
    }
}
