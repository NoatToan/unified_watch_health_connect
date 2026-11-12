package com.huawei.hwcloudmodel.model.userprofile;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes10.dex */
public class DeleteAllUserProfileReq implements IRequest {

    @SerializedName(ParsedFieldTag.KAKA_TASK_SCENARIO)
    private int scenario = 0;

    public int getScenario() {
        return this.scenario;
    }

    public void setScenario(int i) {
        this.scenario = i;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/profile/user/deleteAllUserProfile";
    }
}
