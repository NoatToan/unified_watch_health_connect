package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CheckResult;
import com.google.android.exoplayer2.Format;
import defpackage.g83;
import defpackage.ljf;
import defpackage.mie;
import defpackage.rk1;
import defpackage.wlq;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public interface l {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k.a f8174b;
        public final CopyOnWriteArrayList<C0195a> c;
        public final long d;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.source.l$a$a, reason: collision with other inner class name */
        public static final class C0195a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f8175a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public l f8176b;

            public C0195a(Handler handler, l lVar) {
                this.f8175a = handler;
                this.f8176b = lVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public void A(mie mieVar, int i, int i2, Format format, int i3, Object obj, long j, long j2) {
            B(mieVar, new ljf(i, i2, format, i3, obj, h(j), h(j2)));
        }

        public void B(final mie mieVar, final ljf ljfVar) {
            for (C0195a c0195a : this.c) {
                final l lVar = c0195a.f8176b;
                wlq.E0(c0195a.f8175a, new Runnable() { // from class: slf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33762a.o(lVar, mieVar, ljfVar);
                    }
                });
            }
        }

        public void C(l lVar) {
            for (C0195a c0195a : this.c) {
                if (c0195a.f8176b == lVar) {
                    this.c.remove(c0195a);
                }
            }
        }

        public void D(int i, long j, long j2) {
            E(new ljf(1, i, null, 3, null, h(j), h(j2)));
        }

        public void E(final ljf ljfVar) {
            final k.a aVar = (k.a) rk1.e(this.f8174b);
            for (C0195a c0195a : this.c) {
                final l lVar = c0195a.f8176b;
                wlq.E0(c0195a.f8175a, new Runnable() { // from class: tlf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34830a.p(lVar, aVar, ljfVar);
                    }
                });
            }
        }

        @CheckResult
        public a F(int i, k.a aVar, long j) {
            return new a(this.c, i, aVar, j);
        }

        public void g(Handler handler, l lVar) {
            rk1.e(handler);
            rk1.e(lVar);
            this.c.add(new C0195a(handler, lVar));
        }

        public final long h(long j) {
            long jD = g83.d(j);
            if (jD == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.d + jD;
        }

        public void i(int i, Format format, int i2, Object obj, long j) {
            j(new ljf(1, i, format, i2, obj, h(j), -9223372036854775807L));
        }

        public void j(final ljf ljfVar) {
            for (C0195a c0195a : this.c) {
                final l lVar = c0195a.f8176b;
                wlq.E0(c0195a.f8175a, new Runnable() { // from class: ulf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f35908a.k(lVar, ljfVar);
                    }
                });
            }
        }

        public final /* synthetic */ void k(l lVar, ljf ljfVar) {
            lVar.a(this.f8173a, this.f8174b, ljfVar);
        }

        public final /* synthetic */ void l(l lVar, mie mieVar, ljf ljfVar) {
            lVar.A(this.f8173a, this.f8174b, mieVar, ljfVar);
        }

        public final /* synthetic */ void m(l lVar, mie mieVar, ljf ljfVar) {
            lVar.h(this.f8173a, this.f8174b, mieVar, ljfVar);
        }

        public final /* synthetic */ void n(l lVar, mie mieVar, ljf ljfVar, IOException iOException, boolean z) {
            lVar.E(this.f8173a, this.f8174b, mieVar, ljfVar, iOException, z);
        }

        public final /* synthetic */ void o(l lVar, mie mieVar, ljf ljfVar) {
            lVar.B(this.f8173a, this.f8174b, mieVar, ljfVar);
        }

        public final /* synthetic */ void p(l lVar, k.a aVar, ljf ljfVar) {
            lVar.x(this.f8173a, aVar, ljfVar);
        }

        public void q(mie mieVar, int i) {
            r(mieVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void r(mie mieVar, int i, int i2, Format format, int i3, Object obj, long j, long j2) {
            s(mieVar, new ljf(i, i2, format, i3, obj, h(j), h(j2)));
        }

        public void s(final mie mieVar, final ljf ljfVar) {
            for (C0195a c0195a : this.c) {
                final l lVar = c0195a.f8176b;
                wlq.E0(c0195a.f8175a, new Runnable() { // from class: rlf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32676a.l(lVar, mieVar, ljfVar);
                    }
                });
            }
        }

        public void t(mie mieVar, int i) {
            u(mieVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void u(mie mieVar, int i, int i2, Format format, int i3, Object obj, long j, long j2) {
            v(mieVar, new ljf(i, i2, format, i3, obj, h(j), h(j2)));
        }

        public void v(final mie mieVar, final ljf ljfVar) {
            for (C0195a c0195a : this.c) {
                final l lVar = c0195a.f8176b;
                wlq.E0(c0195a.f8175a, new Runnable() { // from class: plf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30521a.m(lVar, mieVar, ljfVar);
                    }
                });
            }
        }

        public void w(mie mieVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            y(mieVar, new ljf(i, i2, format, i3, obj, h(j), h(j2)), iOException, z);
        }

        public void x(mie mieVar, int i, IOException iOException, boolean z) {
            w(mieVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        public void y(final mie mieVar, final ljf ljfVar, final IOException iOException, final boolean z) {
            for (C0195a c0195a : this.c) {
                final l lVar = c0195a.f8176b;
                wlq.E0(c0195a.f8175a, new Runnable() { // from class: qlf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31632a.n(lVar, mieVar, ljfVar, iOException, z);
                    }
                });
            }
        }

        public void z(mie mieVar, int i) {
            A(mieVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public a(CopyOnWriteArrayList<C0195a> copyOnWriteArrayList, int i, k.a aVar, long j) {
            this.c = copyOnWriteArrayList;
            this.f8173a = i;
            this.f8174b = aVar;
            this.d = j;
        }
    }

    default void A(int i, k.a aVar, mie mieVar, ljf ljfVar) {
    }

    default void B(int i, k.a aVar, mie mieVar, ljf ljfVar) {
    }

    default void E(int i, k.a aVar, mie mieVar, ljf ljfVar, IOException iOException, boolean z) {
    }

    default void a(int i, k.a aVar, ljf ljfVar) {
    }

    default void h(int i, k.a aVar, mie mieVar, ljf ljfVar) {
    }

    default void x(int i, k.a aVar, ljf ljfVar) {
    }
}
