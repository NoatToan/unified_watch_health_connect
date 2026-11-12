package ty;

import c2.l;
import c40.i;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import j21.p;
import j92.e;
import l72.x0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static final void a(String str, String str2, String str3, m mVar, int i14) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        o0 o0VarE = mVar.E(1257755309);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            x0 x0Var = x0.f111346a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            e eVar = j92.b.f97899b;
            r rVarY = l.y(aVar, eVar.f97920e);
            z3.e eVarC = f.c(1472693748, new i(str, str2, 11), o0VarE);
            int i16 = (x0.f111348c << 6) | 48;
            x0Var.e(rVarY, eVarC, o0VarE, i16, 0);
            bVar.getClass();
            r rVarA = l.A(aVar, eVar.f97920e, 0.0f, 2);
            bVar.getClass();
            x0Var.e(l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), f.c(1317997277, new p(str3, 22), o0VarE), o0VarE, i16, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c81.i(i14, 5, str, str2, str3);
        }
    }

    public static final b92.a b(String str, String str2, m mVar) {
        x1 x1Var = n.f135158a;
        return wz1.a.a(y.P(R.string.string_comma_string_pattern, new Object[]{y.P(R.string.string_space_string_pattern, new Object[]{y.Q(mVar, R.string.lbl_average), str}, mVar), str2}, mVar));
    }
}
