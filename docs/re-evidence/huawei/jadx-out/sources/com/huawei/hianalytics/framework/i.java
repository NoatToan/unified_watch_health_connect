package com.huawei.hianalytics.framework;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static i f11522a;

    public static i a() {
        if (f11522a == null) {
            synchronized (i.class) {
                if (f11522a == null) {
                    f11522a = new i();
                }
            }
        }
        return f11522a;
    }
}
