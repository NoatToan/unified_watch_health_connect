package ub0;

import c2.a0;
import c2.x2;
import i3.mh;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static final void a(a0 a0Var, ba0.a aVar, String str, String str2, p3.m mVar, int i14) {
        int i15;
        String str3;
        o0 o0Var;
        a0Var.getClass();
        aVar.getClass();
        str.getClass();
        o0 o0VarE = mVar.E(-1391977870);
        if ((i14 & 48) == 0) {
            i15 = (o0VarE.B(aVar) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            str3 = str;
            i15 |= o0VarE.B(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1169) != 1168)) {
            x1 x1Var = p3.n.f135158a;
            String str4 = aVar.f16966b;
            String str5 = str4 == null ? str3 : str4;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarF, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97931h;
            x0 x0VarB = d92.c.b(d92.c.e(x0Var), o0VarE);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            mh.c(str5, rVarC, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            String strG = str2 != null ? g22.n.g(str2) : "";
            h4.r rVarF2 = x2.f(aVar2, 1.0f);
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, 0.0f, 0.0f, eVar.f97921f, 7);
            fVar.getClass();
            o0Var = o0VarE;
            mh.c(strG, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97927d, o0VarE), o0Var, 0, 0, 130044);
            String str6 = aVar.f16965a;
            h4.r rVarF3 = x2.f(aVar2, 1.0f);
            bVar.getClass();
            h4.r rVarA = c2.l.A(rVarF3, eVar.f97921f, 0.0f, 2);
            d6.h hVarA = d6.h.a(i16);
            fVar.getClass();
            mh.c(str6, rVarA, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0Var), o0Var, 0, 0, 130044);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(a0Var, aVar, str, str2, i14, 28);
        }
    }
}
