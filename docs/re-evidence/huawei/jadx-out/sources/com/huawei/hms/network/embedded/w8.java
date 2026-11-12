package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.net.Socket;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class w8 {
    public static final /* synthetic */ boolean n = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9 f15571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p6 f15572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z8 f15573c;
    public final t6 d;
    public final g7 e;
    public c9.a f;
    public c9.a g;
    public final c9 h;
    public y8 i;
    public boolean j;
    public x7 k;
    public int l;
    public int m;

    public void e() {
        if (!n && Thread.holdsLock(this.f15573c)) {
            throw new AssertionError();
        }
        synchronized (this.f15573c) {
            this.j = true;
        }
    }

    public boolean d() {
        boolean z;
        synchronized (this.f15573c) {
            z = this.j;
        }
        return z;
    }

    public boolean c() {
        boolean z;
        synchronized (this.f15573c) {
            if (this.k == null) {
                if (f()) {
                    this.k = this.f15571a.i.b();
                } else {
                    c9.a aVar = this.f;
                    z = (aVar != null && aVar.f()) || this.h.a();
                }
            }
        }
        return z;
    }

    public c9.a b() {
        return this.f;
    }

    public void a(q7 q7Var, t7 t7Var) throws IOException {
        y8 y8Var;
        c9.a aVar;
        int iE = q7Var.e();
        int iA = q7Var.A();
        int iE2 = q7Var.E();
        int iV = q7Var.v();
        int iP = q7Var.p();
        boolean zB = q7Var.B();
        if (!t7Var.f()) {
            throw new IllegalArgumentException("a normal Request without http2ConnectionIndex");
        }
        if (Integer.parseInt(t7Var.a("Http2ConnectionIndex")) > this.f15573c.a(this.f15572b)) {
            if (this.k == null && ((aVar = this.f) == null || !aVar.f())) {
                this.f = this.h.b();
            }
            synchronized (this.f15573c) {
                x7 x7VarG = this.f.g();
                this.k = x7VarG;
                y8Var = new y8(this.f15573c, x7VarG);
                if (this.f.a()) {
                    y8Var.a(this.f.b(), this.l, iP, this.m);
                    y8Var.a(this.f);
                }
            }
            y8Var.a(iE, iA, iE2, iV, iP, zB, this.d, this.e);
            this.f.a(y8Var.b());
            y8Var.x = System.nanoTime();
            synchronized (this.f15573c) {
                this.f15573c.c(y8Var);
            }
        }
    }

    public y8 a() {
        if (n || Thread.holdsLock(this.f15573c)) {
            return this.i;
        }
        throw new AssertionError();
    }

    public g9 a(q7 q7Var, n7.a aVar, boolean z) {
        try {
            y8 y8VarA = a(aVar.d(), aVar.c(), aVar.b(), q7Var.v(), q7Var.p(), q7Var.B(), z);
            if (y8VarA.g() && y8VarA.m == 0) {
                m7 m7VarK = this.f15571a.getRequest().k();
                q7Var.a(m7VarK.h(), m7VarK.n(), m7VarK.s());
            }
            return y8VarA.a(q7Var, aVar);
        } catch (b9 e) {
            e();
            throw e;
        } catch (IOException e2) {
            e();
            throw new b9(e2);
        }
    }

    private boolean f() {
        y8 y8Var = this.f15571a.i;
        return y8Var != null && y8Var.l == 0 && f8.a(y8Var.b().a().l(), this.f15572b.l());
    }

    private y8 a(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) throws Throwable {
        while (true) {
            y8 y8VarA = a(i, i2, i3, i4, i5, z);
            synchronized (this.f15573c) {
                if (y8VarA.m == 0 && !y8VarA.g()) {
                    return y8VarA;
                }
                if (y8VarA.a(z2)) {
                    return y8VarA;
                }
                y8VarA.h();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    private y8 a(int i, int i2, int i3, int i4, int i5, boolean z) throws Throwable {
        Socket socketC;
        Socket socketReleaseConnectionNoEvents;
        y8 y8Var;
        y8 y8Var2;
        boolean z2;
        x7 x7VarG;
        boolean z3;
        List<x7> listD;
        c9.a aVar;
        c9.a aVarF;
        synchronized (this.f15573c) {
            if (this.f15571a.isCanceled()) {
                throw new IOException("Canceled");
            }
            this.j = false;
            y8 y8Var3 = this.f15571a.i;
            socketC = null;
            socketReleaseConnectionNoEvents = (this.f15571a.i == null || !this.f15571a.i.k) ? null : this.f15571a.releaseConnectionNoEvents();
            if (this.f15571a.i != null) {
                y8Var2 = this.f15571a.i;
                y8Var = null;
            } else {
                y8Var = y8Var3;
                y8Var2 = null;
            }
            if (y8Var2 != null) {
                z2 = false;
                x7VarG = null;
            } else if (this.f15573c.a(this.f15572b, this.f15571a, null, false)) {
                y8Var2 = this.f15571a.i;
                x7VarG = null;
                z2 = true;
            } else {
                x7VarG = this.k;
                if (x7VarG != null) {
                    this.k = null;
                    c9.a aVar2 = this.g;
                    if (aVar2 != null) {
                        this.f = aVar2;
                    }
                } else if (f()) {
                    x7VarG = this.f15571a.i.b();
                } else {
                    z2 = false;
                    x7VarG = null;
                }
                z2 = false;
            }
        }
        f8.a(socketReleaseConnectionNoEvents);
        if (y8Var != null) {
            this.e.connectionReleased(this.d, y8Var);
        }
        if (z2) {
            this.e.connectionAcquired(this.d, y8Var2);
        }
        if (y8Var2 != null && (aVarF = this.f15571a.i.f()) != null) {
            this.g = aVarF;
            return y8Var2;
        }
        if (x7VarG != null || ((aVar = this.f) != null && aVar.f())) {
            z3 = false;
        } else {
            this.f = this.h.b();
            z3 = true;
        }
        synchronized (this.f15573c) {
            if (this.f15571a.isCanceled()) {
                throw new IOException("Canceled");
            }
            if (z3) {
                listD = this.f.d();
                if (this.f15573c.a(this.f15572b, this.f15571a, listD, false)) {
                    y8Var2 = this.f15571a.i;
                    z2 = true;
                }
            } else {
                listD = null;
            }
            if (!z2) {
                if (x7VarG == null) {
                    x7VarG = this.f.g();
                }
                y8Var2 = new y8(this.f15573c, x7VarG);
                y8Var2.a(this.f);
                if (this.f.a()) {
                    y8Var2.a(this.f.b(), this.l, i5, this.m);
                }
                this.i = y8Var2;
            }
        }
        if (!z2) {
            y8Var2.a(i, i2, i3, i4, i5, z, this.d, this.e);
            this.f.a(y8Var2.b());
            synchronized (this.f15573c) {
                this.i = null;
                if (this.f15573c.a(this.f15572b, this.f15571a, listD, true)) {
                    y8Var2.k = true;
                    socketC = y8Var2.c();
                    y8Var2 = this.f15571a.i;
                    this.k = x7VarG;
                } else {
                    this.f15573c.c(y8Var2);
                    this.f15571a.acquireConnectionNoEvents(y8Var2);
                }
            }
            f8.a(socketC);
        }
        this.e.connectionAcquired(this.d, y8Var2);
        return y8Var2;
    }

    public w8(d9 d9Var, z8 z8Var, p6 p6Var, t6 t6Var, g7 g7Var, int i, int i2) {
        this(d9Var, z8Var, p6Var, t6Var, g7Var);
        this.l = i;
        this.m = i2;
    }

    public w8(d9 d9Var, z8 z8Var, p6 p6Var, t6 t6Var, g7 g7Var) {
        this.f15571a = d9Var;
        this.f15573c = z8Var;
        this.f15572b = p6Var;
        this.d = t6Var;
        this.e = g7Var;
        this.h = new c9(p6Var, z8Var.routeDatabase, t6Var, g7Var).a(d9Var.getRequest());
        this.l = 0;
        this.m = 0;
    }
}
