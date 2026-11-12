package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
abstract class c {
    private static final int b = 200;
    private static final int c = 10000;
    private static final long a = 10485760;
    private static final long d = 604800000;
    private static final int e = 81920;
    public static final c f = a().f(a).d(200).b(10000).c(d).e(e).a();

    @AutoValue.Builder
    public static abstract class a {
        public abstract c a();

        public abstract a b(int i);

        public abstract a c(long j);

        public abstract a d(int i);

        public abstract a e(int i);

        public abstract a f(long j);
    }

    public static a a() {
        return new com.google.android.datatransport.runtime.scheduling.persistence.a.b();
    }

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract int e();

    public abstract long f();

    public a g() {
        return a().f(f()).d(d()).b(b()).c(c()).e(e());
    }
}
