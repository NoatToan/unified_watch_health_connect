package l43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements t23.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o43.n f109988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f109989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t23.c0 f109990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f109991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o43.i<x33.c, t23.h0> f109992e;

    public c(o43.n nVar, a0 a0Var, t23.c0 c0Var) {
        nVar.getClass();
        a0Var.getClass();
        c0Var.getClass();
        this.f109988a = nVar;
        this.f109989b = a0Var;
        this.f109990c = c0Var;
        this.f109992e = nVar.h(new b(this));
    }

    @Override // t23.i0
    @o13.e
    public final List<t23.h0> a(x33.c cVar) {
        cVar.getClass();
        return p13.x.l(this.f109992e.invoke(cVar));
    }

    @Override // t23.m0
    public final boolean b(x33.c cVar) {
        cVar.getClass();
        o43.i<x33.c, t23.h0> iVar = this.f109992e;
        Object obj = ((o43.e.j) iVar).f129107b.get(cVar);
        return ((obj == null || obj == o43.e.l.COMPUTING) ? d(cVar) : (t23.h0) iVar.invoke(cVar)) == null;
    }

    @Override // t23.m0
    public final void c(x33.c cVar, ArrayList arrayList) {
        cVar.getClass();
        t23.h0 h0VarInvoke = this.f109992e.invoke(cVar);
        if (h0VarInvoke != null) {
            arrayList.add(h0VarInvoke);
        }
    }

    public abstract p005kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a d(x33.c cVar);

    @Override // t23.i0
    public final Collection<x33.c> j(x33.c cVar, e23.l<? super x33.f, Boolean> lVar) {
        cVar.getClass();
        lVar.getClass();
        return p13.l0.f134950a;
    }
}
