package com.sogou.map.loc;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes18.dex */
public class SGLocService extends Service {
    private f f;
    private f g;
    private final IBinder a = new e(this);
    private l0 b = null;
    private Handler c = null;
    private AtomicLong d = new AtomicLong(0);
    private d2 e = null;
    private b0 h = null;
    private d i = d.SG;
    private long j = 0;

    private long k() {
        return this.e.d.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        return this.e.d.q();
    }

    private boolean m() {
        return true;
    }

    public k2 j(SGLocClient sGLocClient, boolean z) {
        k2 k2Var = new k2();
        try {
            d dVar = sGLocClient.c;
            this.i = dVar;
            this.e.f(dVar);
            this.e.g(sGLocClient.a);
            this.e.e((byte) sGLocClient.d);
            byte bT = sGLocClient.t();
            r0.b("service.doRunTask(" + z + ", " + ((int) bT) + ")");
            if (bT != 1) {
                int i = 0;
                if (bT == 4) {
                    if (z) {
                        sGLocClient.tryAddGpsKeeper();
                    }
                    if (m()) {
                        if (l()) {
                            new r(this, k2Var, 5000L, 0L).j();
                        } else {
                            new a(this, k2Var, false).j();
                        }
                    } else if (l()) {
                        new a(this, k2Var, true).j();
                    } else {
                        k2Var.f(new SGLocation(2, "GPS_NET_OFF"));
                    }
                } else if (bT != 8) {
                    if (z) {
                        sGLocClient.tryAddGpsKeeper();
                    }
                    if (l()) {
                        if (m()) {
                            if (j0.q() - this.j <= 20000) {
                                i = 5000;
                            }
                            new r(this, k2Var, 0L, i).j();
                        } else {
                            new a(this, k2Var, true).j();
                        }
                    } else if (m()) {
                        new a(this, k2Var, false).j();
                    } else {
                        k2Var.f(new SGLocation(2, "GPS_NET_OFF"));
                    }
                } else {
                    if (z) {
                        sGLocClient.tryRmvGpsKeeper();
                    }
                    if (m()) {
                        new a(this, k2Var, false).j();
                    } else {
                        k2Var.f(new SGLocation(2, "NET_OFF"));
                    }
                }
            } else {
                if (z) {
                    sGLocClient.tryAddGpsKeeper();
                }
                if (l()) {
                    new a(this, k2Var, true).j();
                } else {
                    k2Var.f(new SGLocation(2, "GPS_OFF"));
                }
            }
        } catch (Throwable unused) {
        }
        return k2Var;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a;
    }

    @Override // android.app.Service
    public void onCreate() {
        l0 l0Var = new l0(this);
        this.b = l0Var;
        this.c = l0Var.b();
        this.f = new b(this, true);
        this.g = new h(this, false);
        d2 d2Var = new d2(this.b);
        this.e = d2Var;
        d2Var.d();
        l0 l0Var2 = this.b;
        d2 d2Var2 = this.e;
        b0 b0Var = new b0(l0Var2, d2Var2.c, d2Var2.b, d2Var2.d, d2Var2.e);
        this.h = b0Var;
        b0Var.h();
        if (a2.f != 4) {
            r0.b("logLevel: " + a2.f);
        }
        if (j0.o(null)) {
            return;
        }
        r0.b("extra: " + ((String) null));
    }

    @Override // android.app.Service
    public void onDestroy() {
        r0.b("service.onDestroy()");
        d2 d2Var = this.e;
        if (d2Var != null) {
            d2Var.i();
        }
        b0 b0Var = this.h;
        if (b0Var != null) {
            b0Var.k();
        }
        this.b.c();
    }
}
