package com.google.android.exoplayer2.upstream;

import defpackage.ljf;
import defpackage.mie;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface h {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mie f8436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ljf f8437b;
        public final IOException c;
        public final int d;

        public a(mie mieVar, ljf ljfVar, IOException iOException, int i) {
            this.f8436a = mieVar;
            this.f8437b = ljfVar;
            this.c = iOException;
            this.d = i;
        }
    }

    default long a(a aVar) {
        return f(aVar.f8437b.f25130a, aVar.f8436a.f, aVar.c, aVar.d);
    }

    @Deprecated
    default long b(int i, long j, IOException iOException, int i2) {
        throw new UnsupportedOperationException();
    }

    default long c(a aVar) {
        return b(aVar.f8437b.f25130a, aVar.f8436a.f, aVar.c, aVar.d);
    }

    default void d(long j) {
    }

    int e(int i);

    @Deprecated
    default long f(int i, long j, IOException iOException, int i2) {
        throw new UnsupportedOperationException();
    }
}
