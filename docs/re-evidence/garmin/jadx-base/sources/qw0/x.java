package qw0;

import b82.g1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.z2;
import o72.a3;
import p3.n1;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class x {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(List list, e23.l lVar, p3.m mVar, int i14, int i15) {
        int i16;
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-160198698);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.r(list) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(i14, o0VarE);
            }
            n1 n1Var = (n1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new a3(n1Var, 3);
                o0VarE.K(objQ2);
            }
            int iO = zf.b.o((e23.l) objQ2, list);
            o0VarE.C(667884076);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new g1(gl1.y.Q(o0VarE, ((Number) ((o13.p) it.next()).f128595b).intValue()), null, null, null, 14, null));
            }
            o0VarE.g0(false);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
            boolean zK = o0VarE.k(iO);
            Object objQ3 = o0VarE.q();
            if (zK || objQ3 == p3.m.a.f135155b) {
                objQ3 = new a51.c(iO, 12);
                o0VarE.K(objQ3);
            }
            e23.a aVar = (e23.a) objQ3;
            boolean zR = o0VarE.r(list) | ((i16 & 896) == 256);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == p3.m.a.f135155b) {
                objQ4 = new p90.h(list, 19, lVar, n1Var);
                o0VarE.K(objQ4);
            }
            z2.a(arrayList, rVarY, null, 0.0f, aVar, (e23.l) objQ4, o0VarE, 384);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.f(lVar, i14, i15, list);
        }
    }

    public static final i53.c b(boolean z14) {
        ArrayList arrayListM = p13.x.m(new o13.p(1, Integer.valueOf(R.string.lbl_map)), new o13.p(4, Integer.valueOf(R.string.map_type_satellite)));
        if (z14) {
            arrayListM.add(new o13.p(3, Integer.valueOf(R.string.map_type_terrain)));
        }
        return i53.a.e(arrayListM);
    }
}
