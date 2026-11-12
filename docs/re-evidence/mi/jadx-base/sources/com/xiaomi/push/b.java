package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;
import defpackage.d4t;
import defpackage.evs;
import defpackage.hus;
import defpackage.lzs;
import defpackage.obs;
import defpackage.r2t;
import defpackage.rds;
import defpackage.x9s;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14030a;
    public int c;
    public long d;
    public hus e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14031b = false;
    public com.xiaomi.push.a f = com.xiaomi.push.a.b();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f14032a = new b();
    }

    public static b e() {
        return a.f14032a;
    }

    public static hus f() {
        hus husVar;
        b bVar = a.f14032a;
        synchronized (bVar) {
            husVar = bVar.e;
        }
        return husVar;
    }

    public synchronized ft a() {
        ft ftVar;
        ftVar = new ft();
        ftVar.a(obs.j(this.e.f20488a));
        ftVar.f66a = (byte) 0;
        ftVar.f70b = 1;
        ftVar.d((int) (System.currentTimeMillis() / 1000));
        return ftVar;
    }

    public final ft b(com.xiaomi.push.a.C0842a c0842a) {
        if (c0842a.f14028a == 0) {
            Object obj = c0842a.c;
            if (obj instanceof ft) {
                return (ft) obj;
            }
            return null;
        }
        ft ftVarA = a();
        ftVarA.a(fs.CHANNEL_STATS_COUNTER.a());
        ftVarA.c(c0842a.f14028a);
        ftVarA.c(c0842a.f14029b);
        return ftVarA;
    }

    public synchronized fu c() {
        fu fuVarD;
        if (l()) {
            fuVarD = d(!obs.y(this.e.f20488a) ? 375 : 750);
        } else {
            fuVarD = null;
        }
        return fuVarD;
    }

    public final fu d(int i) {
        ArrayList arrayList = new ArrayList();
        fu fuVar = new fu(this.f14030a, arrayList);
        if (!obs.y(this.e.f20488a)) {
            fuVar.a(lzs.B(this.e.f20488a));
        }
        d4t d4tVar = new d4t(i);
        r2t r2tVarA = new kd.a().a(d4tVar);
        try {
            fuVar.b(r2tVarA);
        } catch (jr unused) {
        }
        LinkedList<com.xiaomi.push.a.C0842a> linkedListC = this.f.c();
        while (linkedListC.size() > 0) {
            try {
                ft ftVarB = b(linkedListC.getLast());
                if (ftVarB != null) {
                    ftVarB.b(r2tVarA);
                }
                if (d4tVar.h() > i) {
                    break;
                }
                if (ftVarB != null) {
                    arrayList.add(ftVarB);
                }
                linkedListC.removeLast();
            } catch (jr | NoSuchElementException unused2) {
            }
        }
        return fuVar;
    }

    public final void g() {
        if (!this.f14031b || System.currentTimeMillis() - this.d <= this.c) {
            return;
        }
        this.f14031b = false;
        this.d = 0L;
    }

    public void h(int i) {
        if (i > 0) {
            int i2 = i * 1000;
            if (i2 > 604800000) {
                i2 = 604800000;
            }
            if (this.c == i2 && this.f14031b) {
                return;
            }
            this.f14031b = true;
            this.d = System.currentTimeMillis();
            this.c = i2;
            x9s.B("enable dot duration = " + i2 + " start = " + this.d);
        }
    }

    public synchronized void i(ft ftVar) {
        this.f.e(ftVar);
    }

    public synchronized void j(XMPushService xMPushService) {
        this.e = new hus(xMPushService);
        this.f14030a = "";
        rds.c().j(new evs(this));
    }

    public boolean k() {
        return this.f14031b;
    }

    public boolean l() {
        g();
        return this.f14031b && this.f.a() > 0;
    }
}
