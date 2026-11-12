package j21;

import c2.x2;
import com.google.firebase.messaging.Constants;
import i3.mh;
import i3.ve;
import l72.v2;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final void a(h4.r rVar, String str, String str2, b92.a aVar, boolean z14, e23.p pVar, e23.p pVar2, e23.a aVar2, p3.m mVar, int i14, int i15) {
        int i16;
        int i17;
        o0 o0Var;
        boolean z15;
        str.getClass();
        o0 o0VarE = mVar.E(-929230829);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str2) ? 256 : 128;
        }
        int i18 = i16 | 3072;
        if ((i14 & 24576) == 0) {
            i18 |= (32768 & i14) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 16384 : 8192;
        }
        int i19 = i18 | 807075840;
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.r(aVar2) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if (o0VarE.n(i19 & 1, ((306783379 & i19) == 306783378 && (i17 & 3) == 2) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            String str3 = aVar != null ? aVar.f16961a.get(Constants.ScionAnalytics.PARAM_LABEL) : null;
            String str4 = aVar != null ? aVar.f16961a.get("label_secondary") : null;
            h4.r rVarA = v2.a(x2.f(rVar, 1.0f), aVar2 != null, new hv0.d(8, aVar2, aVar), o0VarE, 0);
            o0VarE.C(362408059);
            d92.b.f58623a.getClass();
            long jE = d92.b.a(o0VarE).c().e();
            o0VarE.g0(false);
            o0Var = o0VarE;
            ve.a(rVarA, null, jE, 0L, 0.0f, 0.0f, null, z3.f.c(-846871890, new hl1.j(pVar, pVar2, str3, str, str2, str4, 8), o0VarE), o0Var, 12582912, 122);
            z15 = true;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z15 = z14;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.q(rVar, str, str2, aVar, z15, pVar, pVar2, aVar2, i14, i15);
        }
    }

    public static final void b(String str, String str2, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1915724303);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(true) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(str, v2.a(v2.a(h4.r.S, false, new ih0.a(24), o0VarE, 6), str2 != null, new as.s(str2, 28), o0VarE, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0Var, i15 & 14, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.o(str, str2, i14, 14);
        }
    }
}
