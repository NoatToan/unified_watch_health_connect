package com.huawei.hwcloudmodel.healthdatacloud.model;

import com.huawei.networkclient.IRequest;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes37.dex */
public class DeleteUserProfileReq implements IRequest {
    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return Utils.b() + "/profile/user/deleteUserProfile";
    }
}
