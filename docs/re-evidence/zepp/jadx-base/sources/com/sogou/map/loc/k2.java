package com.sogou.map.loc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
class k2 {
    private a0 a = a0.pending;
    private List b = new LinkedList();
    private List c = new LinkedList();
    private Object d = null;
    private Object e = null;

    public final synchronized k2 a(u uVar) {
        if (d()) {
            uVar.a(this.d);
            return this;
        }
        if (g()) {
            return this;
        }
        this.b.add(uVar);
        return this;
    }

    public final synchronized k2 b(u uVar, u uVar2) {
        return a(uVar).e(uVar2);
    }

    public final synchronized k2 c(Object obj) {
        if (h()) {
            return this;
        }
        this.d = obj;
        this.a = a0.resolved;
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((u) it2.next()).a(obj);
        }
        this.b.clear();
        return this;
    }

    public final synchronized boolean d() {
        return this.a == a0.resolved;
    }

    public final synchronized k2 e(u uVar) {
        if (g()) {
            uVar.a(this.e);
            return this;
        }
        if (d()) {
            return this;
        }
        this.c.add(uVar);
        return this;
    }

    public final synchronized k2 f(Object obj) {
        if (h()) {
            return this;
        }
        this.e = obj;
        this.a = a0.rejected;
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            ((u) it2.next()).a(obj);
        }
        this.c.clear();
        return this;
    }

    public final synchronized boolean g() {
        return this.a == a0.rejected;
    }

    public final synchronized boolean h() {
        a0 a0Var;
        a0Var = this.a;
        return a0Var == a0.rejected || a0Var == a0.resolved;
    }

    public final synchronized Object i() {
        return this.e;
    }
}
