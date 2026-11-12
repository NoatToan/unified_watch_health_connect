package com.huawei.wisesecurity.kfs.entity;

import defpackage.ynv;

/* JADX INFO: loaded from: classes46.dex */
public interface KfsCallback<Response extends ynv> {
    void onFailure(Throwable th);

    void onSuccess(Response response);
}
