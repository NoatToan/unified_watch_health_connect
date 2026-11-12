package i33;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o13.p;
import p13.k0;
import p13.t0;
import p13.w;

/* JADX INFO: loaded from: classes3.dex */
public class m implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f90810a;

    public m(n nVar) {
        this.f90810a = nVar;
    }

    @Override // e23.a
    public final Object invoke() {
        d43.b bVarA;
        k23.l<Object>[] lVarArr = n.f90811h;
        o33.b bVar = this.f90810a.f90791d;
        Map mapB = null;
        if (bVar instanceof o33.d) {
            f fVar = f.f90799a;
            ArrayList elements = ((o33.d) bVar).getElements();
            fVar.getClass();
            bVarA = f.a(elements);
        } else if (bVar instanceof o33.l) {
            f fVar2 = f.f90799a;
            List listC = w.c(bVar);
            fVar2.getClass();
            bVarA = f.a(listC);
        } else {
            bVarA = null;
        }
        if (bVarA != null) {
            d.f90793a.getClass();
            mapB = t0.b(new p(d.f90795c, bVarA));
        }
        if (mapB != null) {
            return mapB;
        }
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        return k0Var;
    }
}
