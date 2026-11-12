package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class z8 {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final Executor executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), f8.a("OkHttp ConnectionPool", true));
    public boolean cleanupRunning;
    public final long keepAliveDurationNs;
    public final int maxIdleConnections;
    public final Runnable cleanupRunnable = new Runnable() { // from class: com.huawei.hms.network.embedded.z8$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.d();
        }
    };
    public final Deque<y8> connections = new ArrayDeque();
    public final a9 routeDatabase = new a9();
    public final Deque<l7> http2Hosts = new ArrayDeque();
    public final Deque<WeakReference<z6.a>> listenerWrList = new ArrayDeque();

    public void c(y8 y8Var) {
        if (!this.cleanupRunning) {
            this.cleanupRunning = true;
            executor.execute(this.cleanupRunnable);
        }
        this.connections.add(y8Var);
        if (y8Var.g()) {
            a(y8Var);
        }
    }

    public int c() {
        int i;
        synchronized (this) {
            Iterator<y8> it = this.connections.iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().p.isEmpty()) {
                    i++;
                }
            }
        }
        return i;
    }

    public boolean b(String str, int i, String str2) {
        synchronized (this) {
            for (y8 y8Var : this.connections) {
                if (y8Var.g() && str.equals(y8Var.b().a().l().h()) && i == y8Var.b().a().l().n() && str2.equals(y8Var.b().a().l().s()) && !y8Var.k && y8Var.a(true)) {
                    y8Var.x = System.nanoTime();
                    return true;
                }
            }
            return false;
        }
    }

    public boolean b(y8 y8Var) {
        if (!y8Var.k && this.maxIdleConnections != 0) {
            notifyAll();
            return false;
        }
        this.connections.remove(y8Var);
        d(y8Var);
        return true;
    }

    public void b(z6.a aVar) {
        synchronized (this) {
            Iterator<WeakReference<z6.a>> it = this.listenerWrList.iterator();
            while (it.hasNext()) {
                z6.a aVar2 = it.next().get();
                if (aVar2 == null || aVar == aVar2) {
                    it.remove();
                }
            }
        }
    }

    public void b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<y8> it = this.connections.iterator();
            while (it.hasNext()) {
                y8 next = it.next();
                if (next.p.isEmpty()) {
                    next.k = true;
                    arrayList.add(next);
                    it.remove();
                    d(next);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            f8.a(((y8) it2.next()).c());
        }
    }

    public boolean a(p6 p6Var, d9 d9Var, @Nullable List<x7> list, boolean z) {
        y8 y8VarB = b(p6Var);
        if (y8VarB != null) {
            d9Var.acquireConnectionNoEvents(y8VarB);
            return true;
        }
        for (y8 y8Var : this.connections) {
            if (!z || y8Var.g()) {
                if (y8Var.a(p6Var, list)) {
                    d9Var.acquireConnectionNoEvents(y8Var);
                    return true;
                }
            }
        }
        return false;
    }

    public void a(z6.a aVar) {
        synchronized (this) {
            if (aVar == null) {
                return;
            }
            this.listenerWrList.add(new WeakReference<>(aVar));
        }
    }

    public void a(y8 y8Var) {
        synchronized (this) {
            l7 l7VarC = c(y8Var.b().a());
            if (l7VarC == null) {
                l7VarC = new l7(y8Var.b().a());
                this.http2Hosts.push(l7VarC);
            }
            l7VarC.a(y8Var);
        }
    }

    public void a(x7 x7Var, IOException iOException) {
        if (x7Var.b().type() != Proxy.Type.DIRECT) {
            p6 p6VarA = x7Var.a();
            p6VarA.i().connectFailed(p6VarA.l().u(), x7Var.b().address(), iOException);
        }
        this.routeDatabase.b(x7Var);
    }

    public long a(long j) {
        synchronized (this) {
            y8 y8Var = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (y8 y8Var2 : this.connections) {
                if (a(y8Var2, j) <= 0 && (!y8Var2.g() || j - y8Var2.x >= 1000000000)) {
                    i++;
                    long j3 = j - y8Var2.q;
                    if (j3 > j2) {
                        y8Var = y8Var2;
                        j2 = j3;
                    }
                } else {
                    i2++;
                }
            }
            long j4 = this.keepAliveDurationNs;
            if (j2 < j4 && i <= this.maxIdleConnections) {
                if (i > 0) {
                    j4 -= j2;
                } else if (i2 <= 0) {
                    this.cleanupRunning = false;
                    return -1L;
                }
                return j4;
            }
            this.connections.remove(y8Var);
            d(y8Var);
            f8.a(y8Var.c());
            return 0L;
        }
    }

    public int a(String str, int i, String str2) {
        int i2;
        synchronized (this) {
            i2 = 0;
            for (y8 y8Var : this.connections) {
                if (y8Var.g() && str.equals(y8Var.b().a().l().h()) && i == y8Var.b().a().l().n() && str2.equals(y8Var.b().a().l().s()) && !y8Var.k && (y8Var.m == 0 || y8Var.a(true))) {
                    i2++;
                }
            }
        }
        return i2;
    }

    public int a(p6 p6Var) {
        int i;
        synchronized (this) {
            i = 0;
            for (y8 y8Var : this.connections) {
                if (p6Var.equals(y8Var.b().a()) && !y8Var.k && y8Var.g() && (y8Var.m == 0 || y8Var.a(true))) {
                    i++;
                }
            }
        }
        return i;
    }

    public int a() {
        int size;
        synchronized (this) {
            size = this.connections.size();
        }
        return size;
    }

    private void d(y8 y8Var) {
        l7 l7VarC;
        if (y8Var == null || !y8Var.g() || (l7VarC = c(y8Var.b().a())) == null) {
            return;
        }
        l7VarC.b(y8Var);
        if (l7VarC.c()) {
            this.http2Hosts.remove(l7VarC);
            d(y8Var.b().a());
        }
    }

    private void d(p6 p6Var) {
        m7 m7VarL = p6Var.l();
        Iterator<WeakReference<z6.a>> it = this.listenerWrList.iterator();
        while (it.hasNext()) {
            z6.a aVar = it.next().get();
            if (aVar != null) {
                aVar.a(m7VarL.h(), m7VarL.n(), m7VarL.s());
            } else {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        while (true) {
            long jA = a(System.nanoTime());
            if (jA == -1) {
                return;
            }
            if (jA > 0) {
                long j = jA / 1000000;
                synchronized (this) {
                    try {
                        wait(j, (int) (jA - (1000000 * j)));
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    private l7 c(p6 p6Var) {
        for (l7 l7Var : this.http2Hosts) {
            if (p6Var.equals(l7Var.a())) {
                return l7Var;
            }
        }
        return null;
    }

    private y8 b(p6 p6Var) {
        l7 l7VarC = c(p6Var);
        if (l7VarC != null) {
            return l7VarC.b();
        }
        return null;
    }

    private int a(y8 y8Var, long j) {
        List<Reference<d9>> list = y8Var.p;
        int i = 0;
        while (i < list.size()) {
            Reference<d9> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                ma.f().a("A connection to " + y8Var.b().a().l() + " was leaked. Did you forget to close a response body?", ((d9.b) reference).f14710a);
                list.remove(i);
                y8Var.k = true;
                if (list.isEmpty()) {
                    y8Var.q = j - this.keepAliveDurationNs;
                    return 0;
                }
            }
        }
        return list.size();
    }

    public z8(int i, long j, TimeUnit timeUnit) {
        this.maxIdleConnections = i;
        this.keepAliveDurationNs = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
    }
}
