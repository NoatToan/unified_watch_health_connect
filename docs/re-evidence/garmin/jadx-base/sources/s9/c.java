package s9;

import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import e23.p;
import java.util.Arrays;
import p3.l0;
import p3.n;
import p3.p0;
import p3.p1;
import p3.u3;
import p3.x1;
import r53.o2;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    public static final p1 a(r53.i iVar, Object obj, b0 b0Var, b0.b bVar, t13.g gVar, p3.m mVar, int i14) {
        x1 x1Var = n.f135158a;
        Object[] objArr = {iVar, b0Var, bVar, gVar};
        boolean zR = ((((i14 & 7168) ^ 3072) > 2048 && mVar.k(bVar.ordinal())) || (i14 & 3072) == 2048) | mVar.r(b0Var) | mVar.r(gVar) | mVar.r(iVar);
        Object objQ = mVar.q();
        p3.m.a aVar = p3.m.f135153a;
        if (zR) {
            Object bVar2 = new b(b0Var, bVar, gVar, iVar, null);
            mVar.K(bVar2);
            objQ = bVar2;
        } else {
            aVar.getClass();
            if (objQ == p3.m.a.f135155b) {
                Object bVar3 = new b(b0Var, bVar, gVar, iVar, null);
                mVar.K(bVar3);
                objQ = bVar3;
            }
        }
        p pVar = (p) objQ;
        Object objQ2 = mVar.q();
        aVar.getClass();
        Object obj2 = p3.m.a.f135155b;
        if (objQ2 == obj2) {
            objQ2 = p0.n(obj);
            mVar.K(objQ2);
        }
        p1 p1Var = (p1) objQ2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zR2 = mVar.r(pVar);
        Object objQ3 = mVar.q();
        if (zR2 || objQ3 == obj2) {
            objQ3 = new u3(pVar, p1Var, null);
            mVar.K(objQ3);
        }
        l0.h(objArrCopyOf, (p) objQ3, mVar);
        return p1Var;
    }

    public static final p1 b(r53.i iVar, Object obj, p3.m mVar, int i14) {
        n0 n0Var = (n0) mVar.A(j.f158018a);
        b0.b bVar = b0.b.STARTED;
        t13.h hVar = t13.h.f161748a;
        x1 x1Var = n.f135158a;
        return a(iVar, obj, n0Var.getF158016a(), bVar, hVar, mVar, (i14 & 14) | (((i14 >> 3) & 8) << 3) | (i14 & 112) | (i14 & 7168) | (i14 & 57344));
    }

    public static final p1 c(o2 o2Var, p3.m mVar) {
        n0 n0Var = (n0) mVar.A(j.f158018a);
        b0.b bVar = b0.b.STARTED;
        t13.h hVar = t13.h.f161748a;
        x1 x1Var = n.f135158a;
        return a(o2Var, o2Var.getValue(), n0Var.getF158016a(), bVar, hVar, mVar, 0);
    }
}
