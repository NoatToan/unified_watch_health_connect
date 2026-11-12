package o53;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final u13.a a(t13.d dVar) {
        l0 l0Var;
        if (dVar instanceof l0) {
            l0Var = (l0) dVar;
            int i14 = l0Var.f129367b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l0Var.f129367b = i14 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(dVar);
            }
        } else {
            l0Var = new l0(dVar);
        }
        Object obj = l0Var.f129366a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = l0Var.f129367b;
        if (i15 == 0) {
            o13.r.b(obj);
            l0Var.f129367b = 1;
            k kVar = new k(u13.f.b(l0Var), 1);
            kVar.q();
            if (kVar.p() == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }

    public static final Object b(long j8, t13.d<? super Unit> dVar) throws Throwable {
        if (j8 <= 0) {
            return Unit.INSTANCE;
        }
        k kVar = new k(u13.f.b(dVar), 1);
        kVar.q();
        if (j8 < Long.MAX_VALUE) {
            d(kVar.f129362e).C(j8, kVar);
        }
        Object objP = kVar.p();
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    public static final Object c(long j8, t13.d<? super Unit> dVar) throws Throwable {
        Object objB = b(e(j8), dVar);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    public static final k0 d(t13.g gVar) {
        t13.g.a aVar = gVar.get(t13.e.f161746w0);
        k0 k0Var = aVar instanceof k0 ? (k0) aVar : null;
        return k0Var == null ? h0.f129344a : k0Var;
    }

    public static final long e(long j8) {
        e53.c.a aVar = e53.c.f63094b;
        boolean z14 = j8 > 0;
        if (z14) {
            return e53.c.e(e53.c.h(j8, e53.e.f(999999L, e53.f.NANOSECONDS)));
        }
        if (!z14) {
            return 0L;
        }
        lc.u0.r();
        return 0L;
    }
}
