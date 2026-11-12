package com.huawei.hianalytics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile e1 f11497a;

    public static e1 a() {
        if (f11497a == null) {
            synchronized (f2.class) {
                if (f11497a == null) {
                    if (t.b()) {
                        f11497a = new a1();
                    } else {
                        f11497a = new c1();
                    }
                }
            }
        }
        return f11497a;
    }
}
