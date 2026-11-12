package com.huawei.hwcloudmodel.model.userprofile;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes10.dex */
public class DeleteAccountCheckReq implements IRequest {

    @SerializedName("languageCode")
    private String languageCode = "";

    public String getlanguageCode() {
        return this.languageCode;
    }

    public void setlanguageCode(String str) {
        this.languageCode = str;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/profile/user/deleteAccountCheck";
    }
}
