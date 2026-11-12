package s82;

import am.j;
import bt1.o;
import c2.x2;
import g6.f;
import h4.r;
import i3.ve;
import k2.i;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r11.k;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final void a(r rVar, String str, String str2, String str3, String str4, Object obj, e23.a aVar, e23.a aVar2, m mVar, int i14) {
        int i15;
        o0 o0Var;
        aVar2.getClass();
        o0 o0VarE = mVar.E(826038983);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(str4) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(obj) ? 131072 : 65536;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i15 & 1, (37823635 & i15) != 37823634)) {
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(rVar, 1.0f);
            long jB = j.B(d92.b.f58623a, o0VarE);
            f.a aVar3 = f.f75994b;
            o0Var = o0VarE;
            ve.a(rVarF, i.a(8), jB, 0L, 0.0f, 0.0f, null, z3.f.c(15596386, new k(str, str2, str3, str4, aVar, aVar2, obj), o0VarE), o0Var, 12582912, 120);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(rVar, str, str2, str3, str4, obj, aVar, aVar2, i14);
        }
    }
}
