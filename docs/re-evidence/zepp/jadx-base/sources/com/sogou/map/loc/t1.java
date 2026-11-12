package com.sogou.map.loc;

import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
final class t1 implements u {
    private /* synthetic */ r1 a;

    public t1(r1 r1Var) {
        this.a = r1Var;
    }

    @Override // com.sogou.map.loc.u
    public final /* synthetic */ void a(Object obj) {
        this.a.p = null;
        if (this.a.m != null) {
            this.a.m.b(Boolean.FALSE);
        }
        r1 r1Var = this.a;
        r1Var.c(r1Var.t);
        if (this.a.q) {
            Iterator it2 = this.a.s.iterator();
            while (it2.hasNext()) {
                this.a.b.enableNetwork(((Integer) it2.next()).intValue(), false);
            }
            this.a.s.clear();
            this.a.n(false);
            this.a.q = false;
        }
    }
}
