package cq0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.List;
import java.util.Locale;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class r {
    public static final void a(String str, String str2, List list, e23.a aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(852311083);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            b82.c.c(z3.f.c(2071845525, new q(aVar), o0VarE), z3.f.c(-1854515493, new a42.a(str, 14, str2, list), o0VarE), o0VarE, 54);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.l(str, str2, list, aVar, i14, 25);
        }
    }

    public static final void b(String str, String str2, List list, p3.m mVar, int i14) {
        o0 o0Var;
        List list2 = list;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, 933270776);
        int i15 = i14 | (o0VarK.B(str) ? 4 : 2) | (o0VarK.B(str2) ? 32 : 16) | (o0VarK.r(list2) ? 256 : 128);
        if (o0VarK.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97922g;
            float f16 = eVar.f97920e;
            h4.r rVarA = c2.l.A(aVar, f14, 0.0f, 2);
            String upperCase = gl1.y.Q(o0VarK, R.string.lbl_safety_event_triggered).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(upperCase, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarK), o0VarK, 0, 0, 131068);
            bVar.getClass();
            c2.l.f(x2.h(aVar, eVar.f97919d), o0VarK);
            bVar.getClass();
            h4.r rVarA2 = c2.l.A(aVar, f16, 0.0f, 2);
            fVar.getClass();
            mh.c(str, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97929f), o0VarK), o0VarK, i15 & 14, 0, 131068);
            bVar.getClass();
            c2.l.f(x2.h(aVar, f15), o0VarK);
            bVar.getClass();
            h4.r rVarA3 = c2.l.A(aVar, f16, 0.0f, 2);
            fVar.getClass();
            mh.c(str2, rVarA3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarK), o0VarK, (i15 >> 3) & 14, 0, 131068);
            o0Var = o0VarK;
            tn.k.n(bVar, aVar, f15, o0Var);
            list2 = list;
            b.a(list2, o0Var, (i15 >> 6) & 14);
        } else {
            o0Var = o0VarK;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c50.f(str, str2, list2, i14, 12);
        }
    }
}
