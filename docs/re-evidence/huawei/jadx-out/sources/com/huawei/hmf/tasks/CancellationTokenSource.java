package com.huawei.hmf.tasks;

import com.huawei.hmf.tasks.a.c;

/* JADX INFO: loaded from: classes33.dex */
public class CancellationTokenSource {
    public c impl = new c();

    public CancellationToken getToken() {
        return this.impl;
    }

    public void cancel() {
        this.impl.a();
    }
}
