package com.huawei.health.device.api;

import com.huawei.hwbasemgr.ResponseCallback;
import defpackage.dnj;

/* JADX INFO: loaded from: classes7.dex */
public interface MultiUsersManagerApi {
    dnj getCurrentUser();

    void getCurrentUserForUserInfo(ResponseCallback<dnj> responseCallback);
}
