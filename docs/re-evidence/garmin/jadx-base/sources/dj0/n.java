package dj0;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import i3.mh;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class n {
    public static final void a(r rVar, p3.m mVar, int i14) {
        o0 o0Var;
        r rVar2;
        o0 o0VarE = mVar.E(-1126155106);
        int i15 = i14 | 6;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            r.a aVar = r.S;
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = 2 * eVar.f97922g;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarC = c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13);
            bVar.getClass();
            r rVarA = c2.l.A(rVarC, eVar.f97920e, 0.0f, 2);
            String strQ = y.Q(o0VarE, R.string.txt_empty_page_no_data);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            d6.h.f57752b.getClass();
            o0Var = o0VarE;
            mh.c(strQ, rVarA, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 130044);
            rVar2 = aVar;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar2, i14, 4);
        }
    }
}
