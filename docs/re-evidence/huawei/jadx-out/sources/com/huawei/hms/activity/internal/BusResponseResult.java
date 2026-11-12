package com.huawei.hms.activity.internal;

import android.content.Intent;

/* JADX INFO: loaded from: classes10.dex */
public class BusResponseResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Intent f12690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12691b;

    public int getCode() {
        return this.f12691b;
    }

    public Intent getIntent() {
        return this.f12690a;
    }

    public void setCode(int i) {
        this.f12691b = i;
    }

    public void setIntent(Intent intent) {
        this.f12690a = intent;
    }
}
