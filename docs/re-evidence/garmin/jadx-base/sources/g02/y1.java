package g02;

import ch.qos.logback.core.net.SyslogConstants;
import i3.ej;
import i3.ij;
import i3.ti;
import i3.vi;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class y1 {
    public static final void a(String str, ij ijVar, h4.r rVar, int i14, z3.e eVar, p3.m mVar, int i15) {
        int i16;
        str.getClass();
        ijVar.getClass();
        p3.o0 o0VarE = mVar.E(1799076199);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.r(ijVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.k(i14) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.r(eVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i15 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            vi.f90035a.getClass();
            int i17 = i16 << 3;
            ej.b(vi.a(i14, o0VarE, (i16 >> 9) & 14), z3.f.c(-973785956, new e11.c0(17, ijVar, str), o0VarE), ijVar, rVar, false, z3.f.c(-1672249468, new aa2.o(eVar, 5), o0VarE), o0VarE, (i17 & 896) | 102236208 | (i17 & 7168), SyslogConstants.LOG_LOCAL6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.f0(str, ijVar, rVar, i14, eVar, i15);
        }
    }

    public static final void b(String str, boolean z14, h4.r rVar, int i14, z3.e eVar, p3.m mVar, int i15) {
        String str2;
        z3.e eVar2;
        int i16;
        h4.r rVar2;
        str.getClass();
        p3.o0 o0VarE = mVar.E(-743418139);
        int i17 = (o0VarE.B(str) ? 4 : 2) | i15 | (o0VarE.h(z14) ? 32 : 16) | 1408;
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i15 & 1) == 0 || o0VarE.o0()) {
                rVar = h4.r.S;
                ti.f89828b.getClass();
                i14 = ti.f89829c;
            } else {
                o0VarE.e();
            }
            int i18 = i17 & (-7169);
            h4.r rVar3 = rVar;
            int i19 = i14;
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            str2 = str;
            a(str2, ej.d(((i18 >> 3) & 14) | 48, 4, o0VarE, z14), rVar3, i19, eVar, o0VarE, i18 & 65422);
            eVar2 = eVar;
            rVar2 = rVar3;
            i16 = i19;
        } else {
            str2 = str;
            eVar2 = eVar;
            o0VarE.e();
            i16 = i14;
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(str2, z14, rVar2, i16, eVar2, i15);
        }
    }
}
