package u91;

import com.google.firebase.messaging.Constants;
import l72.p2;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class j {
    public static final void a(aa1.f fVar, e23.a<Unit> aVar, m mVar, int i14) {
        b92.a aVarB;
        z3.e eVarC;
        fVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(700219567);
        int i15 = (o0VarE.B(fVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            String str = fVar.f2274e;
            z3.e eVar = null;
            if (str != null) {
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, str);
                aVarB = c0235a.b();
            } else {
                aVarB = null;
            }
            p2 p2Var = p2.f111205a;
            String str2 = fVar.f2273d;
            if (str2 == null) {
                str2 = "";
            }
            boolean z14 = fVar.f2271b;
            Integer num = fVar.f2272c;
            if (num == null) {
                o0VarE.C(-414511933);
                o0VarE.g0(false);
                eVarC = null;
            } else {
                o0VarE.C(-414511932);
                eVarC = z3.f.c(2113360209, new ba2.e(num.intValue(), 12), o0VarE);
                o0VarE.g0(false);
            }
            if (fVar.f2271b) {
                a.f169525a.getClass();
                eVar = a.f169526b;
            }
            int i16 = b92.a.f16960b;
            p2Var.g(str2, null, aVarB, eVarC, eVar, false, z14, aVar, o0VarE, (i15 << 21) & 234881024, 162);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(fVar, aVar, i14, 0);
        }
    }
}
