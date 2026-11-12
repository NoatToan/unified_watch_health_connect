package ho;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.j0;
import p005kotlin.Unit;
import p13.h0;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class t {
    public static final void a(h4.r rVar, eo.b bVar, e23.l<? super eo.b, Unit> lVar, p3.m mVar, int i14) {
        rVar.getClass();
        bVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1158456031);
        int i15 = (i14 & 6) == 0 ? (o0VarE.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(bVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                eo.b.f64755c.getClass();
                context.getClass();
                qs.g.f147071e.getClass();
                List listN0 = h0.N0(i53.a.a(qs.g.RACE, qs.g.RECREATION, qs.g.SPECIAL_EVENT, qs.g.TRAINING, qs.g.TRANSPORTATION, qs.g.TOURING, qs.g.GEOCAHING, qs.g.FITNESS, qs.g.UNCATEGORIZED), new eo.c(context));
                ArrayList arrayList = new ArrayList(p13.y.r(listN0, 10));
                Iterator it = listN0.iterator();
                while (it.hasNext()) {
                    arrayList.add(new eo.b.c((qs.g) it.next()));
                }
                objQ = h0.C0(p13.w.c(eo.b.a.f64758d), arrayList);
                o0VarE.K(objQ);
            }
            List<eo.b> list = (List) objQ;
            o0VarE.C(-879704893);
            ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
            for (eo.b bVar2 : list) {
                arrayList2.add(new j0(gl1.y.Q(o0VarE, bVar2.f64756a), null, null, false, p005kotlin.jvm.internal.s.g(bVar2.f64757b, bVar.f64757b), 14, null));
            }
            o0VarE.g0(false);
            i53.c cVarE = i53.a.e(arrayList2);
            f82.d dVar = new f82.d();
            boolean zR = o0VarE.r(list) | ((i15 & 896) == 256);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == p3.m.a.f135155b) {
                objQ2 = new c42.e0(list, lVar, 5);
                o0VarE.K(objQ2);
            }
            e82.a.a(cVarE, rVar, dVar, (e23.p) objQ2, o0VarE, (i15 << 3) & 112, 0);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.p(rVar, bVar, lVar, i14, 3);
        }
    }
}
