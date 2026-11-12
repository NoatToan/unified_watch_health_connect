package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
abstract class i3 {
    private static final i3 a;
    private static final i3 b;

    static {
        f3 f3Var = null;
        a = new g3(f3Var);
        b = new h3(f3Var);
    }

    public /* synthetic */ i3(f3 f3Var) {
    }

    public static i3 c() {
        return a;
    }

    public static i3 d() {
        return b;
    }

    public abstract void a(Object obj, long j);

    public abstract <L> void b(Object obj, Object obj2, long j);
}
