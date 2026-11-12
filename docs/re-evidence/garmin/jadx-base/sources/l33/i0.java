package l33;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class i0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f109760a;

    public i0(u0 u0Var) {
        this.f109760a = u0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.l<Object>[] lVarArr = u0.f109809m;
        i43.d dVar = i43.d.f91037l;
        i43.l.f91058a.getClass();
        e23.l<? super x33.f, Boolean> lVar = i43.l.a.f91060b;
        u0 u0Var = this.f109760a;
        u0Var.getClass();
        dVar.getClass();
        List<i43.c> list = dVar.f91044a;
        lVar.getClass();
        b33.b bVar = b33.b.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        i43.d.f91028c.getClass();
        if (dVar.a(i43.d.f91036k)) {
            for (x33.f fVar : u0Var.h(dVar, lVar)) {
                lVar.invoke(fVar);
                t23.h hVarF = u0Var.f(fVar, bVar);
                if (hVarF != null) {
                    linkedHashSet.add(hVarF);
                }
            }
        }
        i43.d.f91028c.getClass();
        if (dVar.a(i43.d.f91033h) && !list.contains(i43.c.a.f91025a)) {
            for (x33.f fVar2 : u0Var.i(dVar, lVar)) {
                lVar.invoke(fVar2);
                linkedHashSet.addAll(u0Var.c(fVar2, bVar));
            }
        }
        i43.d.f91028c.getClass();
        if (dVar.a(i43.d.f91034i) && !list.contains(i43.c.a.f91025a)) {
            for (x33.f fVar3 : u0Var.o(dVar)) {
                lVar.invoke(fVar3);
                linkedHashSet.addAll(u0Var.a(fVar3, bVar));
            }
        }
        return p13.h0.b1(linkedHashSet);
    }
}
