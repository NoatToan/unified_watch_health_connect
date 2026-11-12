package com.huawei.hianalytics;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q f11598b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f11599a;

    public static q a() {
        q qVar;
        synchronized (q.class) {
            if (f11598b == null) {
                f11598b = new q();
            }
            qVar = f11598b;
        }
        return qVar;
    }
}
