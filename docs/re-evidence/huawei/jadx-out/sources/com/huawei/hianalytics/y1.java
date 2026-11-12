package com.huawei.hianalytics;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class y1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f11732c = new byte[0];
    public static y1 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f11733a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11734b;

    public y1(Context context) {
        this.f11734b = context.createDeviceProtectedStorageContext();
    }

    public final String a() {
        String string;
        synchronized (this.f11733a) {
            string = this.f11734b.getSharedPreferences("qoes_remote_config", 0).getString("ab_base_url", "");
        }
        return string;
    }
}
