package com.sogou.map.loc;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
abstract class f {
    public k2 a;
    private v b;
    private Set c = new HashSet();
    private boolean d;
    private u e;

    public f(SGLocService sGLocService, boolean z) {
        g gVar = new g(this);
        this.e = gVar;
        this.d = z;
        this.b = new w(gVar, gVar, a2.b);
    }

    private void g() {
        this.a = this.b.b(this.d);
    }

    public abstract void b();

    public final synchronized void c(long j) {
        g();
        boolean zIsEmpty = this.c.isEmpty();
        this.c.add(Long.valueOf(j));
        if (zIsEmpty) {
            b();
        }
    }

    public abstract void d();

    public final synchronized void e(long j) {
        this.c.remove(Long.valueOf(j));
        if (this.c.size() == 0) {
            d();
        }
    }

    public final synchronized k2 f() {
        g();
        return this.a;
    }
}
