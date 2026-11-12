package uu1;

import c2.l;
import c2.x2;
import h4.r;
import i3.mh;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static final void a(int i14, r rVar, String str, m mVar) {
        o0 o0Var;
        r rVar2;
        str.getClass();
        o0 o0VarE = mVar.E(-707333676);
        int i15 = i14 | 6;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            r.a aVar = r.S;
            x1 x1Var = n.f135158a;
            r rVarX = x2.x(x2.f(aVar, 1.0f), null, 3);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            r rVarZ = l.z(rVarX, f14, eVar.f97918c);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            d6.h.f57752b.getClass();
            o0Var = o0VarE;
            mh.c(str, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarF, o0Var, (i15 >> 3) & 14, 0, 130044);
            rVar2 = aVar;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.d(rVar2, str, i14, 5, (byte) 0);
        }
    }
}
