package com.sogou.map.loc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
final class z {
    private a0 a = a0.pending;
    private List b = new LinkedList();
    private Object c = null;

    private synchronized boolean c() {
        return this.a == a0.resolved;
    }

    public final synchronized z a(u uVar) {
        if (c()) {
            uVar.a(this.c);
            return this;
        }
        this.b.add(uVar);
        return this;
    }

    public final synchronized z b(Object obj) {
        if (c()) {
            return this;
        }
        this.c = obj;
        this.a = a0.resolved;
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((u) it2.next()).a(obj);
        }
        this.b.clear();
        return this;
    }
}
