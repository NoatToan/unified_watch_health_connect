package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import com.google.android.exoplayer2.source.k;
import defpackage.rk1;
import defpackage.wlq;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public interface b {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k.a f7893b;
        public final CopyOnWriteArrayList<C0184a> c;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.b$a$a, reason: collision with other inner class name */
        public static final class C0184a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f7894a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public b f7895b;

            public C0184a(Handler handler, b bVar) {
                this.f7894a = handler;
                this.f7895b = bVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void g(Handler handler, b bVar) {
            rk1.e(handler);
            rk1.e(bVar);
            this.c.add(new C0184a(handler, bVar));
        }

        public void h() {
            for (C0184a c0184a : this.c) {
                final b bVar = c0184a.f7895b;
                wlq.E0(c0184a.f7894a, new Runnable() { // from class: w57
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37627a.n(bVar);
                    }
                });
            }
        }

        public void i() {
            for (C0184a c0184a : this.c) {
                final b bVar = c0184a.f7895b;
                wlq.E0(c0184a.f7894a, new Runnable() { // from class: u57
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f35395a.o(bVar);
                    }
                });
            }
        }

        public void j() {
            for (C0184a c0184a : this.c) {
                final b bVar = c0184a.f7895b;
                wlq.E0(c0184a.f7894a, new Runnable() { // from class: v57
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f36492a.p(bVar);
                    }
                });
            }
        }

        public void k(final int i) {
            for (C0184a c0184a : this.c) {
                final b bVar = c0184a.f7895b;
                wlq.E0(c0184a.f7894a, new Runnable() { // from class: t57
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34325a.q(bVar, i);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            for (C0184a c0184a : this.c) {
                final b bVar = c0184a.f7895b;
                wlq.E0(c0184a.f7894a, new Runnable() { // from class: r57
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32199a.r(bVar, exc);
                    }
                });
            }
        }

        public void m() {
            for (C0184a c0184a : this.c) {
                final b bVar = c0184a.f7895b;
                wlq.E0(c0184a.f7894a, new Runnable() { // from class: s57
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33313a.s(bVar);
                    }
                });
            }
        }

        public final /* synthetic */ void n(b bVar) {
            bVar.l(this.f7892a, this.f7893b);
        }

        public final /* synthetic */ void o(b bVar) {
            bVar.s(this.f7892a, this.f7893b);
        }

        public final /* synthetic */ void p(b bVar) {
            bVar.q(this.f7892a, this.f7893b);
        }

        public final /* synthetic */ void q(b bVar, int i) {
            bVar.t(this.f7892a, this.f7893b);
            bVar.n(this.f7892a, this.f7893b, i);
        }

        public final /* synthetic */ void r(b bVar, Exception exc) {
            bVar.z(this.f7892a, this.f7893b, exc);
        }

        public final /* synthetic */ void s(b bVar) {
            bVar.G(this.f7892a, this.f7893b);
        }

        public void t(b bVar) {
            for (C0184a c0184a : this.c) {
                if (c0184a.f7895b == bVar) {
                    this.c.remove(c0184a);
                }
            }
        }

        @CheckResult
        public a u(int i, k.a aVar) {
            return new a(this.c, i, aVar);
        }

        public a(CopyOnWriteArrayList<C0184a> copyOnWriteArrayList, int i, k.a aVar) {
            this.c = copyOnWriteArrayList;
            this.f7892a = i;
            this.f7893b = aVar;
        }
    }

    default void G(int i, k.a aVar) {
    }

    default void l(int i, k.a aVar) {
    }

    default void n(int i, k.a aVar, int i2) {
    }

    default void q(int i, k.a aVar) {
    }

    default void s(int i, k.a aVar) {
    }

    @Deprecated
    default void t(int i, k.a aVar) {
    }

    default void z(int i, k.a aVar, Exception exc) {
    }
}
