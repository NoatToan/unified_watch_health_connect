package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
abstract class z2 {
    private static final z2 a;
    private static final z2 b;

    static {
        y2 y2Var = null;
        a = new b3();
        b = new a3();
    }

    private z2() {
    }

    public static z2 c() {
        return a;
    }

    public static z2 d() {
        return b;
    }

    public abstract void a(Object obj, long j);

    public abstract <L> void b(Object obj, Object obj2, long j);
}
