package bv0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class o2 {
    public static final void a(sc.f<sc.j> fVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4) {
        fVar.getClass();
        aVar4.getClass();
        sc.j jVar = (sc.j) p13.h0.n0(fVar);
        if (p005kotlin.jvm.internal.s.g(jVar, a.f.INSTANCE)) {
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        if (p005kotlin.jvm.internal.s.g(jVar, a.m.INSTANCE)) {
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (p005kotlin.jvm.internal.s.g(jVar, a.y.INSTANCE)) {
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (jVar instanceof a.o) {
            aVar4.invoke();
        }
        aVar4.invoke();
    }
}
