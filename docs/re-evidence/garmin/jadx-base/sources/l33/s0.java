package l33;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class s0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f109804a;

    public s0(u0 u0Var) {
        this.f109804a = u0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        x33.f fVar = (x33.f) obj;
        k23.l<Object>[] lVarArr = u0.f109809m;
        fVar.getClass();
        ArrayList arrayList = new ArrayList();
        u0 u0Var = this.f109804a;
        t23.r0 r0VarInvoke = u0Var.f109815g.invoke(fVar);
        if (r0VarInvoke != null) {
            arrayList.add(r0VarInvoke);
        }
        u0Var.n(arrayList, fVar);
        t23.l lVarQ = u0Var.q();
        int i14 = b43.i.f15728a;
        if (b43.i.l(lVarQ, t23.f.ANNOTATION_CLASS)) {
            return p13.h0.b1(arrayList);
        }
        k33.i iVar = u0Var.f109810b;
        return p13.h0.b1(iVar.f102785a.f102768r.c(iVar, arrayList));
    }
}
