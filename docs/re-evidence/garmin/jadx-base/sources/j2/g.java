package j2;

import h4.r;
import i3.gb;
import kotlin.k2;
import p5.l;
import u1.b1;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final r a(r rVar, boolean z14, a2.j jVar, gb gbVar, boolean z15, l lVar, e23.l lVar2) {
        r rVarA;
        if (gbVar != null) {
            rVarA = new d(z14, jVar, gbVar, false, z15, lVar, lVar2, null);
        } else if (gbVar == null) {
            rVarA = new d(z14, jVar, null, false, z15, lVar, lVar2, null);
        } else if (jVar != null) {
            rVarA = b1.a(r.S, jVar, gbVar).then(new d(z14, jVar, null, false, z15, lVar, lVar2, null));
        } else {
            rVarA = h4.k.a(r.S, k2.f91249a, new e(gbVar, z14, z15, lVar, lVar2));
        }
        return rVar.then(rVarA);
    }

    public static r b(r rVar, boolean z14, boolean z15, l lVar, e23.l lVar2, int i14) {
        if ((i14 & 2) != 0) {
            z15 = true;
        }
        return rVar.then(new d(z14, null, null, true, z15, lVar, lVar2, null));
    }

    public static final r c(r rVar, r5.a aVar, gb gbVar, boolean z14, l lVar, e23.a aVar2) {
        r rVarA;
        if (gbVar != null) {
            rVarA = new j(aVar, null, gbVar, false, z14, lVar, aVar2, null);
        } else if (gbVar == null) {
            rVarA = new j(aVar, null, null, false, z14, lVar, aVar2, null);
        } else {
            rVarA = h4.k.a(r.S, k2.f91249a, new f(gbVar, aVar, z14, lVar, aVar2));
        }
        return rVar.then(rVarA);
    }
}
