package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import defpackage.rk1;
import defpackage.ss5;
import defpackage.us5;
import defpackage.wlq;

/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.a$a, reason: collision with other inner class name */
    public static final class C0182a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f7845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f7846b;

        public C0182a(Handler handler, a aVar) {
            this.f7845a = aVar != null ? (Handler) rk1.e(handler) : null;
            this.f7846b = aVar;
        }

        public final /* synthetic */ void A(int i, long j, long j2) {
            ((a) wlq.j(this.f7846b)).H(i, j, j2);
        }

        public void B(final long j) {
            Handler handler = this.f7845a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: lo1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25254a.y(j);
                    }
                });
            }
        }

        public void C(final boolean z) {
            Handler handler = this.f7845a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ro1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32736a.z(z);
                    }
                });
            }
        }

        public void D(final int i, final long j, final long j2) {
            Handler handler = this.f7845a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: qo1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31686a.A(i, j, j2);
                    }
                });
            }
        }

        public void k(final Exception exc) {
            Handler handler = this.f7845a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ko1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24031a.r(exc);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Handler handler = this.f7845a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: po1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30576a.s(exc);
                    }
                });
            }
        }

        public void m(final String str, final long j, final long j2) {
            Handler handler = this.f7845a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: jo1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22961a.t(str, j, j2);
                    }
                });
            }
        }

        public void n(final String str) {
            Handler handler = this.f7845a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: io1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21932a.u(str);
                    }
                });
            }
        }

        public void o(final ss5 ss5Var) {
            ss5Var.c();
            Handler handler = this.f7845a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: no1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28191a.v(ss5Var);
                    }
                });
            }
        }

        public void p(final ss5 ss5Var) {
            Handler handler = this.f7845a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mo1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27037a.w(ss5Var);
                    }
                });
            }
        }

        public void q(final Format format, final us5 us5Var) {
            Handler handler = this.f7845a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: oo1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f29330a.x(format, us5Var);
                    }
                });
            }
        }

        public final /* synthetic */ void r(Exception exc) {
            ((a) wlq.j(this.f7846b)).m(exc);
        }

        public final /* synthetic */ void s(Exception exc) {
            ((a) wlq.j(this.f7846b)).b(exc);
        }

        public final /* synthetic */ void t(String str, long j, long j2) {
            ((a) wlq.j(this.f7846b)).f(str, j, j2);
        }

        public final /* synthetic */ void u(String str) {
            ((a) wlq.j(this.f7846b)).e(str);
        }

        public final /* synthetic */ void v(ss5 ss5Var) {
            ss5Var.c();
            ((a) wlq.j(this.f7846b)).j(ss5Var);
        }

        public final /* synthetic */ void w(ss5 ss5Var) {
            ((a) wlq.j(this.f7846b)).o(ss5Var);
        }

        public final /* synthetic */ void x(Format format, us5 us5Var) {
            ((a) wlq.j(this.f7846b)).F(format);
            ((a) wlq.j(this.f7846b)).g(format, us5Var);
        }

        public final /* synthetic */ void y(long j) {
            ((a) wlq.j(this.f7846b)).v(j);
        }

        public final /* synthetic */ void z(boolean z) {
            ((a) wlq.j(this.f7846b)).onSkipSilenceEnabledChanged(z);
        }
    }

    @Deprecated
    default void F(Format format) {
    }

    default void H(int i, long j, long j2) {
    }

    default void b(Exception exc) {
    }

    default void e(String str) {
    }

    default void f(String str, long j, long j2) {
    }

    default void g(Format format, us5 us5Var) {
    }

    default void j(ss5 ss5Var) {
    }

    default void m(Exception exc) {
    }

    default void o(ss5 ss5Var) {
    }

    default void onSkipSilenceEnabledChanged(boolean z) {
    }

    default void v(long j) {
    }
}
