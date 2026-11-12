package com.huawei.hianalytics;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f11563b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static k f11564c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0 f11565a = new l0();

    public static k b() {
        if (f11564c == null) {
            synchronized (k.class) {
                if (f11564c == null) {
                    f11564c = new k();
                }
            }
        }
        return f11564c;
    }

    public final l0 a() {
        if (this.f11565a == null) {
            this.f11565a = new l0();
        }
        return this.f11565a;
    }
}
