package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes4.dex */
public interface vrq {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f37167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final vrq f37168b;

        public a(Handler handler, vrq vrqVar) {
            this.f37167a = vrqVar != null ? (Handler) rk1.e(handler) : null;
            this.f37168b = vrqVar;
        }

        public void A(final Object obj) {
            if (this.f37167a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f37167a.post(new Runnable() { // from class: nrq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28302a.w(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void B(final long j, final int i) {
            Handler handler = this.f37167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: urq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f36065a.x(j, i);
                    }
                });
            }
        }

        public void C(final Exception exc) {
            Handler handler = this.f37167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: qrq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31782a.y(exc);
                    }
                });
            }
        }

        public void D(final wrq wrqVar) {
            Handler handler = this.f37167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: lrq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25384a.z(wrqVar);
                    }
                });
            }
        }

        public void k(final String str, final long j, final long j2) {
            Handler handler = this.f37167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: rrq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32834a.q(str, j, j2);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f37167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: orq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f29635a.r(str);
                    }
                });
            }
        }

        public void m(final ss5 ss5Var) {
            ss5Var.c();
            Handler handler = this.f37167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: prq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30687a.s(ss5Var);
                    }
                });
            }
        }

        public void n(final int i, final long j) {
            Handler handler = this.f37167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mrq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27140a.t(i, j);
                    }
                });
            }
        }

        public void o(final ss5 ss5Var) {
            Handler handler = this.f37167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: srq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33923a.u(ss5Var);
                    }
                });
            }
        }

        public void p(final Format format, final us5 us5Var) {
            Handler handler = this.f37167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: trq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34974a.v(format, us5Var);
                    }
                });
            }
        }

        public final /* synthetic */ void q(String str, long j, long j2) {
            ((vrq) wlq.j(this.f37168b)).r(str, j, j2);
        }

        public final /* synthetic */ void r(String str) {
            ((vrq) wlq.j(this.f37168b)).c(str);
        }

        public final /* synthetic */ void s(ss5 ss5Var) {
            ss5Var.c();
            ((vrq) wlq.j(this.f37168b)).y(ss5Var);
        }

        public final /* synthetic */ void t(int i, long j) {
            ((vrq) wlq.j(this.f37168b)).k(i, j);
        }

        public final /* synthetic */ void u(ss5 ss5Var) {
            ((vrq) wlq.j(this.f37168b)).i(ss5Var);
        }

        public final /* synthetic */ void v(Format format, us5 us5Var) {
            ((vrq) wlq.j(this.f37168b)).u(format);
            ((vrq) wlq.j(this.f37168b)).D(format, us5Var);
        }

        public final /* synthetic */ void w(Object obj, long j) {
            ((vrq) wlq.j(this.f37168b)).C(obj, j);
        }

        public final /* synthetic */ void x(long j, int i) {
            ((vrq) wlq.j(this.f37168b)).p(j, i);
        }

        public final /* synthetic */ void y(Exception exc) {
            ((vrq) wlq.j(this.f37168b)).w(exc);
        }

        public final /* synthetic */ void z(wrq wrqVar) {
            ((vrq) wlq.j(this.f37168b)).onVideoSizeChanged(wrqVar);
        }
    }

    default void C(Object obj, long j) {
    }

    default void D(Format format, us5 us5Var) {
    }

    default void c(String str) {
    }

    default void i(ss5 ss5Var) {
    }

    default void k(int i, long j) {
    }

    default void onVideoSizeChanged(wrq wrqVar) {
    }

    default void p(long j, int i) {
    }

    default void r(String str, long j, long j2) {
    }

    @Deprecated
    default void u(Format format) {
    }

    default void w(Exception exc) {
    }

    default void y(ss5 ss5Var) {
    }
}
