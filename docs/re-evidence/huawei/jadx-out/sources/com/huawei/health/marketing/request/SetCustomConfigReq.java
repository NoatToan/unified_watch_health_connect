package com.huawei.health.marketing.request;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes7.dex */
public class SetCustomConfigReq implements IRequest {

    @SerializedName(WatchFaceConstant.INSTALL_CUSTOM_CONFIG_KEY)
    private CustomConfigInfo customConfig;

    public CustomConfigInfo getCustomConfig() {
        return this.customConfig;
    }

    public void setCustomConfig(CustomConfigInfo customConfigInfo) {
        this.customConfig = customConfigInfo;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/profile/user/setCustomConfig";
    }
}
