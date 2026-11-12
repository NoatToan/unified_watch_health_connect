package wv0;

import b82.u0;
import c2.x2;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class o {
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void a(h4.r rVar, String str, Boolean bool, e23.a<Unit> aVar, e23.l<? super Boolean, Unit> lVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14, int i15) {
        e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        boolean z14;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        h4.r rVar2;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar4;
        lVar.getClass();
        o0 o0VarE = mVar.E(-469058722);
        int i16 = i14 | 6;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(bool) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        int i17 = i15 & 32;
        if (i17 == 0) {
            if ((196608 & i14) == 0) {
                pVar2 = pVar;
                i16 |= o0VarE.r(pVar2) ? 131072 : 65536;
            }
            if ((74899 & i16) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                rVar = h4.r.S;
                if (i17 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar2;
                }
                x1 x1Var = p3.n.f135158a;
                int i18 = ((i16 >> 3) & 112) | 24576;
                int i19 = i16 >> 6;
                b02.b.c(x2.f(rVar, 1.0f), bool, lVar, pVar4, z3.f.c(-1716043826, new uu1.i(str, aVar, 4), o0VarE), o0VarE, i18 | (i19 & 896) | (i19 & 7168));
                pVar3 = pVar4;
            } else {
                o0VarE.e();
                pVar3 = pVar2;
            }
            rVar2 = rVar;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new u0(rVar2, str, bool, aVar, lVar, pVar3, i14, i15);
            }
        }
        i16 |= 196608;
        pVar2 = pVar;
        if ((74899 & i16) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            rVar = h4.r.S;
            if (i17 != 0) {
                pVar4 = null;
            } else {
                pVar4 = pVar2;
            }
            x1 x1Var2 = p3.n.f135158a;
            int i110 = ((i16 >> 3) & 112) | 24576;
            int i111 = i16 >> 6;
            b02.b.c(x2.f(rVar, 1.0f), bool, lVar, pVar4, z3.f.c(-1716043826, new uu1.i(str, aVar, 4), o0VarE), o0VarE, i110 | (i111 & 896) | (i111 & 7168));
            pVar3 = pVar4;
        } else {
            o0VarE.e();
            pVar3 = pVar2;
        }
        rVar2 = rVar;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u0(rVar2, str, bool, aVar, lVar, pVar3, i14, i15);
        }
    }
}
