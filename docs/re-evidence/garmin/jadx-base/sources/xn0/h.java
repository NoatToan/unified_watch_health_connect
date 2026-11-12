package xn0;

import c2.l;
import fb1.g0;
import h4.r;
import l72.x0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    public static final void a(String str, String str2, String str3, String str4, m mVar, int i14, int i15) {
        int i16;
        String str5;
        str2.getClass();
        o0 o0VarE = mVar.E(1537431607);
        int i17 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 = i17 | 384;
        } else {
            i16 = i17 | (o0VarE.B(str3) ? 256 : 128);
        }
        int i19 = i16 | (o0VarE.B(str4) ? 2048 : 1024);
        if (o0VarE.n(i19 & 1, (i19 & 1171) != 1170)) {
            String str6 = i18 != 0 ? null : str3;
            x1 x1Var = n.f135158a;
            x0 x0Var = x0.f111346a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            x0Var.e(l.A(aVar, j92.b.f97899b.f97920e, 0.0f, 2), z3.f.c(-456698562, new g0(2, str, str2, str6, str4), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
            str5 = str6;
        } else {
            o0VarE.e();
            str5 = str3;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dj0.c(i14, i15, str, str2, str5, str4);
        }
    }
}
