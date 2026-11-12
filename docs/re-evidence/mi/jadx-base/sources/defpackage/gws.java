package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bg;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public abstract class gws {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicInteger f19414r = new AtomicInteger(0);
    public static boolean s;
    public jws n;
    public XMPushService o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19415a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19416b = -1;
    public volatile long c = 0;
    public volatile long d = 0;
    public LinkedList<Pair<Integer, Long>> e = new LinkedList<>();
    public final Collection<nws> f = new CopyOnWriteArrayList();
    public final Map<pws, a> g = new ConcurrentHashMap();
    public final Map<pws, a> h = new ConcurrentHashMap();
    public rxs i = null;
    public String j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f19417k = "";
    public int l = 2;
    public final int m = f19414r.getAndIncrement();
    public long p = 0;
    public long q = 0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public pws f19418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public txs f19419b;

        public a(pws pwsVar, txs txsVar) {
            this.f19418a = pwsVar;
            this.f19419b = txsVar;
        }

        public void a(mvs mvsVar) {
            this.f19418a.b(mvsVar);
        }

        public void b(fys fysVar) {
            txs txsVar = this.f19419b;
            if (txsVar == null || txsVar.mo65a(fysVar)) {
                this.f19418a.a(fysVar);
            }
        }
    }

    static {
        s = false;
        try {
            s = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception unused) {
        }
        qws.c();
    }

    public gws(XMPushService xMPushService, jws jwsVar) {
        this.n = jwsVar;
        this.o = xMPushService;
        u();
    }

    public abstract void A(boolean z);

    public boolean B() {
        return this.l == 0;
    }

    public synchronized void C() {
        this.p = SystemClock.elapsedRealtime();
    }

    public boolean D() {
        return this.l == 1;
    }

    public void E() {
        synchronized (this.e) {
            this.e.clear();
        }
    }

    public int a() {
        return this.f19415a;
    }

    public long b() {
        return this.d;
    }

    public jws c() {
        return this.n;
    }

    public String d() {
        return this.n.j();
    }

    public final String e(int i) {
        if (i == 1) {
            return "connected";
        }
        if (i == 0) {
            return "connecting";
        }
        return i == 2 ? "disconnected" : "unknown";
    }

    public Map<pws, a> f() {
        return this.g;
    }

    public final void g(int i) {
        synchronized (this.e) {
            try {
                if (i == 1) {
                    this.e.clear();
                } else {
                    this.e.add(new Pair<>(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis())));
                    if (this.e.size() > 6) {
                        this.e.remove(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h(int i, int i2, Exception exc) {
        int i3 = this.l;
        if (i != i3) {
            x9s.o(String.format("update the connection status. %1$s -> %2$s : %3$s ", e(i3), e(i), ccs.a(i2)));
        }
        if (obs.v(this.o)) {
            g(i);
        }
        if (i == 1) {
            this.o.a(10);
            if (this.l != 0) {
                x9s.o("try set connected while not connecting.");
            }
            this.l = i;
            Iterator<nws> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
            return;
        }
        if (i == 0) {
            if (this.l != 2) {
                x9s.o("try set connecting while not disconnected.");
            }
            this.l = i;
            Iterator<nws> it2 = this.f.iterator();
            while (it2.hasNext()) {
                it2.next().a(this);
            }
            return;
        }
        if (i == 2) {
            this.o.a(10);
            int i4 = this.l;
            if (i4 == 0) {
                Iterator<nws> it3 = this.f.iterator();
                while (it3.hasNext()) {
                    it3.next().a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (i4 == 1) {
                Iterator<nws> it4 = this.f.iterator();
                while (it4.hasNext()) {
                    it4.next().a(this, i2, exc);
                }
            }
            this.l = i;
        }
    }

    public abstract void i(bg.b bVar);

    public void j(nws nwsVar) {
        if (nwsVar == null || this.f.contains(nwsVar)) {
            return;
        }
        this.f.add(nwsVar);
    }

    public void k(pws pwsVar) {
        this.g.remove(pwsVar);
    }

    public void l(pws pwsVar, txs txsVar) {
        if (pwsVar == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        this.g.put(pwsVar, new a(pwsVar, txsVar));
    }

    public abstract void m(fys fysVar);

    public synchronized void n(String str) {
        try {
            if (this.l == 0) {
                x9s.o("setChallenge hash = " + mcs.b(str).substring(0, 8));
                this.j = str;
                h(1, 0, null);
            } else {
                x9s.o("ignore setChallenge because connection was disconnected");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void o(String str, String str2);

    public abstract void p(mvs[] mvsVarArr);

    public boolean q() {
        return false;
    }

    public synchronized boolean r(long j) {
        return this.p >= j;
    }

    public int s() {
        return this.l;
    }

    public String t() {
        return this.n.h();
    }

    public void u() {
        String property;
        if (this.n.f() && this.i == null) {
            Class<?> cls = null;
            try {
                property = System.getProperty("smack.debuggerClass");
            } catch (Throwable unused) {
                property = null;
            }
            if (property != null) {
                try {
                    cls = Class.forName(property);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (cls == null) {
                this.i = new bws(this);
                return;
            }
            try {
                this.i = (rxs) cls.getConstructor(gws.class, Writer.class, Reader.class).newInstance(this);
            } catch (Exception e2) {
                throw new IllegalArgumentException("Can't initialize the configured debugger!", e2);
            }
        }
    }

    public abstract void v(int i, Exception exc);

    public abstract void w(mvs mvsVar);

    public void x(nws nwsVar) {
        this.f.remove(nwsVar);
    }

    public void y(pws pwsVar) {
        this.h.remove(pwsVar);
    }

    public void z(pws pwsVar, txs txsVar) {
        if (pwsVar == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        this.h.put(pwsVar, new a(pwsVar, txsVar));
    }
}
