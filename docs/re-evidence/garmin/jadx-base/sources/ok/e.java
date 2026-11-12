package ok;

import android.os.Handler;
import bk.l;
import j20.x;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Handler f132439g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public nk.b f132442j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f132433a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f132434b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f132435c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f132436d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f132437e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f132438f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f132440h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f132441i = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (e.this.f132440h) {
                try {
                    e eVar = e.this;
                    if (eVar.f132435c != null) {
                        eVar.k(2147483645);
                    }
                    e.this.f132435c.interrupt();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public abstract void a(l lVar, dk.a aVar);

    public final void b() {
        synchronized (this.f132433a) {
            this.f132434b = false;
        }
    }

    public abstract void c();

    public final void d(Long l14) {
        synchronized (this.f132440h) {
            try {
                this.f132435c = Thread.currentThread();
                if (l14 != null) {
                    this.f132439g.postDelayed(this.f132441i, l14.longValue());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        c();
        synchronized (this.f132440h) {
            this.f132439g.removeCallbacks(this.f132441i);
            this.f132435c = null;
        }
        synchronized (this.f132433a) {
            b();
            this.f132442j = null;
        }
    }

    public final void e() {
        synchronized (this.f132433a) {
            this.f132434b = true;
        }
    }

    public abstract String f();

    public final String g() {
        e eVar = this.f132436d;
        if (eVar == null) {
            return f();
        }
        return f() + "-running subTask: " + eVar.g();
    }

    public final int h() {
        e eVar = this.f132436d;
        if (eVar != null) {
            return Math.max(eVar.h(), 0);
        }
        return 0;
    }

    public abstract void i();

    public boolean j() {
        return false;
    }

    public final boolean k(int i14) {
        Object obj = this.f132433a;
        if (i14 != Integer.MAX_VALUE) {
            synchronized (obj) {
                try {
                    e eVar = this.f132436d;
                    if (eVar != null) {
                        this.f132438f = eVar.j();
                    } else {
                        this.f132438f = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return this.f132438f && j();
        }
        synchronized (obj) {
            try {
                e eVar2 = this.f132436d;
                if (eVar2 != null) {
                    this.f132438f = true;
                    eVar2.k(i14);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        i();
        return true;
    }

    public void l(nk.b bVar, e eVar, Handler handler) {
        synchronized (this.f132440h) {
            this.f132439g = handler;
        }
        synchronized (this.f132433a) {
            this.f132442j = bVar;
            this.f132437e = eVar;
            m();
            this.f132436d = null;
            this.f132438f = false;
        }
        n();
    }

    public void m() {
        synchronized (this.f132433a) {
            this.f132434b = false;
        }
    }

    public abstract void n();

    public void o(nk.b bVar, Handler handler) {
        synchronized (this.f132440h) {
            this.f132439g = handler;
        }
        synchronized (this.f132433a) {
            this.f132442j = bVar;
            this.f132436d = null;
            this.f132438f = false;
            this.f132437e = null;
            m();
        }
        n();
    }

    public final void p(l lVar, dk.a aVar) {
        synchronized (this.f132433a) {
            try {
                e eVar = this.f132436d;
                if (eVar != null) {
                    eVar.p(lVar, aVar);
                } else if (this.f132434b) {
                    a(lVar, aVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void q(l lVar, dk.a aVar) {
        synchronized (this.f132433a) {
            p(lVar, aVar);
        }
    }

    public final void r(e eVar, Long l14) {
        if (!Thread.currentThread().equals(this.f132435c)) {
            int i14 = qk.b.f145071a;
            x.h();
            return;
        }
        while (eVar != null) {
            eVar.l(this.f132442j, this, this.f132439g);
            synchronized (this.f132433a) {
                this.f132436d = eVar;
            }
            eVar.g();
            int i15 = qk.b.f145071a;
            this.f132436d.d(l14);
            this.f132436d.g();
            if (this.f132438f) {
                Thread.currentThread().interrupt();
            } else {
                this.f132436d.getClass();
            }
            eVar = null;
        }
        synchronized (this.f132433a) {
            this.f132436d = null;
        }
    }
}
