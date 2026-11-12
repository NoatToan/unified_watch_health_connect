package kotlin;

import e23.p;
import h5.o1;
import o13.r;
import p3.c2;
import p3.p0;
import u13.a;
import v13.c;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li5/l1;", "", "Li5/a3;", "initialInterceptor", "parent", "<init>", "(Li5/a3;Li5/l1;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f91257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f91258b;

    public l1(a3 a3Var, l1 l1Var) {
        this.f91257a = l1Var;
        this.f91258b = p0.n(a3Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final a a(o1 o1Var, p pVar, c cVar) {
        g1 g1Var;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i14 = g1Var.f91192c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g1Var.f91192c = i14 - Integer.MIN_VALUE;
            } else {
                g1Var = new g1(this, cVar);
            }
        } else {
            g1Var = new g1(this, cVar);
        }
        Object obj = g1Var.f91190a;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = g1Var.f91192c;
        if (i15 == 0) {
            r.b(obj);
            k1 k1Var = new k1(pVar, this, null);
            g1Var.f91192c = 1;
            if (d3.b(o1Var, this.f91257a, k1Var, g1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        o2.c.f();
        return null;
    }
}
