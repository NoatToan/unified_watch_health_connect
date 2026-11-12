package com.huawei.health.marketing.request;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class GetCustomConfigReq implements IRequest {

    @SerializedName(WatchFaceConstant.INSTALL_CUSTOM_CONFIG_KEY)
    private ArrayList<String> customConfig;

    public ArrayList<String> getCustomConfig() {
        return this.customConfig;
    }

    public void setCustomConfig(ArrayList<String> arrayList) {
        this.customConfig = arrayList;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/profile/user/getCustomConfig";
    }
}
