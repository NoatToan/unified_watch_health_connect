package com.xiaomi.push;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bd;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes22.dex */
public abstract class bt {
    public static boolean a;
    private static final AtomicInteger l = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public bu f52a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public XMPushService f54a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f50a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f51a = -1;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public volatile long f57b = 0;
    public volatile long c = 0;
    private LinkedList<Pair<Integer, Long>> h = new LinkedList<>();
    private final Collection<bv> i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final Map<bx, a> f56a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public final Map<bx, a> f59b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ce f53a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f55a = "";

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f58b = "";
    private int j = 2;
    public final int b = l.getAndIncrement();
    private long k = 0;
    public long d = 0;

    public static class a {
        private bx a;
        private cf b;

        public a(bx bxVar, cf cfVar) {
            this.a = bxVar;
            this.b = cfVar;
        }

        public void a(bi biVar) {
            this.a.a(biVar);
        }

        public void a(cj cjVar) {
            cf cfVar = this.b;
            if (cfVar == null || cfVar.mo3604a(cjVar)) {
                this.a.a(cjVar);
            }
        }
    }

    static {
        a = false;
        try {
            a = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception unused) {
        }
        by.m3614a();
    }

    public bt(XMPushService xMPushService, bu buVar) {
        this.f52a = buVar;
        this.f54a = xMPushService;
        m3608b();
    }

    private String b(int i) {
        if (i == 1) {
            return Status.PRE_CONNECT_STATE_CONNECTED;
        }
        if (i == 0) {
            return "connecting";
        }
        return i == 2 ? "disconnected" : "unknown";
    }

    private void c(int i) {
        synchronized (this.h) {
            try {
                if (i == 1) {
                    this.h.clear();
                } else {
                    this.h.add(new Pair<>(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis())));
                    if (this.h.size() > 6) {
                        this.h.remove(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int a() {
        return this.j;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public bu m3605a() {
        return this.f52a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String mo3606a() {
        return this.f52a.c();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Map<bx, a> m3607a() {
        return this.f56a;
    }

    public void a(int i, int i2, Exception exc) {
        int i3 = this.j;
        if (i != i3) {
            com.xiaomi.channel.commonutils.logger.b.m3434a(String.format("update the connection status. %1$s -> %2$s : %3$s ", b(i3), b(i), bd.a(i2)));
        }
        if (y.m3842a((Context) this.f54a)) {
            c(i);
        }
        if (i == 1) {
            this.f54a.a(10);
            if (this.j != 0) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("try set connected while not connecting.");
            }
            this.j = i;
            Iterator<bv> it2 = this.i.iterator();
            while (it2.hasNext()) {
                it2.next().b(this);
            }
            return;
        }
        if (i == 0) {
            if (this.j != 2) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("try set connecting while not disconnected.");
            }
            this.j = i;
            Iterator<bv> it3 = this.i.iterator();
            while (it3.hasNext()) {
                it3.next().a(this);
            }
            return;
        }
        if (i == 2) {
            this.f54a.a(10);
            int i4 = this.j;
            if (i4 == 0) {
                Iterator<bv> it4 = this.i.iterator();
                while (it4.hasNext()) {
                    it4.next().a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (i4 == 1) {
                Iterator<bv> it5 = this.i.iterator();
                while (it5.hasNext()) {
                    it5.next().a(this, i2, exc);
                }
            }
            this.j = i;
        }
    }

    public void a(bv bvVar) {
        if (bvVar == null || this.i.contains(bvVar)) {
            return;
        }
        this.i.add(bvVar);
    }

    public void a(bx bxVar, cf cfVar) {
        Objects.requireNonNull(bxVar, "Packet listener is null.");
        this.f56a.put(bxVar, new a(bxVar, cfVar));
    }

    public abstract void a(cj cjVar);

    public abstract void a(com.xiaomi.push.service.az.b bVar);

    public synchronized void a(String str) {
        if (this.j == 0) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("setChallenge hash = " + ac.a(str).substring(0, 8));
            this.f55a = str;
            a(1, 0, null);
        } else {
            com.xiaomi.channel.commonutils.logger.b.m3434a("ignore setChallenge because connection was disconnected");
        }
    }

    public abstract void a(String str, String str2);

    public abstract void a(bi[] biVarArr);

    /* JADX INFO: renamed from: a */
    public boolean mo3603a() {
        return false;
    }

    public synchronized boolean a(long j) {
        return this.k >= j;
    }

    public String b() {
        return this.f52a.b();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m3608b() {
        String property;
        if (this.f52a.m3612a() && this.f53a == null) {
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
                this.f53a = new br(this);
                return;
            }
            try {
                this.f53a = (ce) cls.getConstructor(bt.class, Writer.class, Reader.class).newInstance(this);
            } catch (Exception e2) {
                throw new IllegalArgumentException("Can't initialize the configured debugger!", e2);
            }
        }
    }

    public abstract void b(int i, Exception exc);

    public abstract void b(bi biVar);

    public void b(bv bvVar) {
        this.i.remove(bvVar);
    }

    public void b(bx bxVar, cf cfVar) {
        Objects.requireNonNull(bxVar, "Packet listener is null.");
        this.f59b.put(bxVar, new a(bxVar, cfVar));
    }

    public abstract void b(boolean z);

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3609b() {
        return this.j == 0;
    }

    public synchronized void c() {
        this.k = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m3610c() {
        return this.j == 1;
    }

    public void d() {
        synchronized (this.h) {
            this.h.clear();
        }
    }
}
