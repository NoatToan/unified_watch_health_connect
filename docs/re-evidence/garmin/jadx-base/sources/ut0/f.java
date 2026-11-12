package ut0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import e2.i0;
import e2.k0;
import e23.l;
import h4.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.j0;
import o53.b0;
import ot0.g;
import p13.y;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import t13.h;
import ug2.q;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static final void a(List list, List list2, l lVar, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(897419996);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(list2) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            ot0.f.f133732d.getClass();
            context.getClass();
            ArrayList<ot0.f> arrayList = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                String string = context.getString(gVar.f133749a);
                string.getClass();
                arrayList.add(new ot0.f(gVar, string, false));
            }
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            for (ot0.f fVar : arrayList) {
                String str = fVar.f120948a;
                g gVar2 = fVar.f133733c;
                arrayList2.add(new j0(str, null, null, false, list2.contains(gVar2) || (gVar2 == g.ALL_CHALLENGES && list2.isEmpty()), 14, null));
            }
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            r rVarF = x2.f(r.S, 1.0f);
            boolean zR = o0VarE.r(arrayList2) | o0VarE.r(list) | ((i15 & 896) == 256) | o0VarE.r(b0Var) | o0VarE.B(i0VarA);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                q qVar = new q(arrayList2, list, lVar, b0Var, i0VarA);
                o0VarE.K(qVar);
                objQ2 = qVar;
            }
            o0Var = o0VarE;
            e2.c.c(rVarF, i0VarA, null, null, null, null, false, null, (l) objQ2, o0Var, 6, 508);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new tb0.h(list, list2, lVar, i14, 15);
        }
    }
}
