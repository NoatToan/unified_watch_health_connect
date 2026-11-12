package com.huawei.hms.support.api.client;

import android.os.Bundle;

/* JADX INFO: loaded from: classes34.dex */
public class BundleResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bundle f16499b;

    public BundleResult(int i, Bundle bundle) {
        this.f16498a = i;
        this.f16499b = bundle;
    }

    public int getResultCode() {
        return this.f16498a;
    }

    public Bundle getRspBody() {
        return this.f16499b;
    }

    public void setResultCode(int i) {
        this.f16498a = i;
    }

    public void setRspBody(Bundle bundle) {
        this.f16499b = bundle;
    }
}
