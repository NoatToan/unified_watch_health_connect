package h21;

import com.garmin.android.apps.connectmobile.R;
import f72.da;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class k {
    public static final void a(h4.r rVar, p3.m mVar, int i14) {
        h4.r rVar2;
        o0 o0VarE = mVar.E(-284895902);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            s62.a.f157643a.getClass();
            rVar2 = rVar;
            b82.n.c(da.a(t62.c.f162799a), gl1.y.Q(o0VarE, R.string.nutrition_is_not_supported), gl1.y.Q(o0VarE, R.string.nutrition_is_not_supported_child_account), rVar2, null, o0VarE, (i15 << 9) & 7168, 16);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar2, i14, 8);
        }
    }

    public static final void b(e23.a<Unit> aVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-253950069);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(1548958352, new cq0.p(aVar, 26), o0VarE);
            a.f81031a.getClass();
            z02.d.a(false, eVarC, null, null, null, a.f81032b, o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.p(aVar, i14, 27);
        }
    }
}
