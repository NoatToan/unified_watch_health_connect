package com.huawei.wearengine.auth;

/* JADX INFO: loaded from: classes46.dex */
public interface AuthCallback {
    void onCancel();

    void onOk(Permission[] permissionArr);
}
