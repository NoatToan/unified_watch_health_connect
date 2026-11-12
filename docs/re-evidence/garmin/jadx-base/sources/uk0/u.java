package uk0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.t2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import gv0.d0;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import u1.y1;

/* JADX INFO: loaded from: classes8.dex */
public final class u {
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:49:0x0113  */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static final void a(a aVar, boolean z14, h4.r rVar, e23.q<? super t2, ? super p3.m, ? super Integer, Unit> qVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14, int i15) {
        e23.q<? super t2, ? super p3.m, ? super Integer, Unit> qVar2;
        boolean z15;
        o0 o0Var;
        p2 p2VarI0;
        e23.q<? super t2, ? super p3.m, ? super Integer, Unit> qVar3;
        String strB;
        String strC;
        z3.e eVarC;
        int i16;
        o0 o0VarE = mVar.E(-318947524);
        int i17 = (o0VarE.B(aVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.h(z14) ? 32 : 16;
        }
        int i18 = i17 | (o0VarE.B(rVar) ? 256 : 128);
        int i19 = i15 & 8;
        if (i19 == 0) {
            if ((i14 & 3072) == 0) {
                qVar2 = qVar;
                i18 |= o0VarE.r(qVar2) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(pVar)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i18 |= i16;
            }
            if ((i18 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i18 & 1, z15)) {
                if (i19 != 0) {
                    qVar3 = null;
                } else {
                    qVar3 = qVar2;
                }
                x1 x1Var = p3.n.f135158a;
                strB = aVar.b((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                r rVar2 = r.f171870a;
                String str = aVar.f171797c;
                String str2 = aVar.f171798d;
                String str3 = aVar.f171799e;
                rVar2.getClass();
                strC = r.c(str, str2, str3, o0VarE);
                eVarC = z3.f.c(-1966395761, new u91.i(12, qVar3, aVar), o0VarE);
                if (strC == null) {
                    o0VarE.C(-1297110231);
                    l72.p2.f111205a.g(strB, rVar, null, eVarC, pVar, false, z14, null, o0VarE, ((i18 >> 3) & 112) | 3072 | (57344 & i18) | ((i18 << 15) & 3670016), 420);
                    o0VarE.g0(false);
                    o0Var = o0VarE;
                } else {
                    o0VarE.C(-1296866447);
                    l72.p2.f111205a.h(strB, strC, null, rVar, null, false, z14, eVarC, pVar, null, null, o0VarE, ((i18 << 3) & 7168) | 12582912 | ((i18 << 15) & 3670016) | ((i18 << 12) & 234881024), 0, 1588);
                    o0Var = o0VarE;
                    o0Var.g0(false);
                }
                qVar2 = qVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a82.a(aVar, z14, rVar, qVar2, pVar, i14, i15);
            }
        }
        i18 |= 3072;
        qVar2 = qVar;
        if ((i14 & 24576) == 0) {
            if (o0VarE.r(pVar)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i18 |= i16;
        }
        if ((i18 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i18 & 1, z15)) {
            if (i19 != 0) {
                qVar3 = null;
            } else {
                qVar3 = qVar2;
            }
            x1 x1Var2 = p3.n.f135158a;
            strB = aVar.b((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            r rVar3 = r.f171870a;
            String str4 = aVar.f171797c;
            String str5 = aVar.f171798d;
            String str6 = aVar.f171799e;
            rVar3.getClass();
            strC = r.c(str4, str5, str6, o0VarE);
            eVarC = z3.f.c(-1966395761, new u91.i(12, qVar3, aVar), o0VarE);
            if (strC == null) {
                o0VarE.C(-1297110231);
                l72.p2.f111205a.g(strB, rVar, null, eVarC, pVar, false, z14, null, o0VarE, ((i18 >> 3) & 112) | 3072 | (57344 & i18) | ((i18 << 15) & 3670016), 420);
                o0VarE.g0(false);
                o0Var = o0VarE;
            } else {
                o0VarE.C(-1296866447);
                l72.p2.f111205a.h(strB, strC, null, rVar, null, false, z14, eVarC, pVar, null, null, o0VarE, ((i18 << 3) & 7168) | 12582912 | ((i18 << 15) & 3670016) | ((i18 << 12) & 234881024), 0, 1588);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
            qVar2 = qVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.a(aVar, z14, rVar, qVar2, pVar, i14, i15);
        }
    }

    public static final void b(a aVar, boolean z14, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        z3.e eVar;
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1105874343);
        int i15 = (o0VarE.B(aVar) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarB = j2.b.b(h4.r.S, z14, false, null, aVar2, 14);
            if (z14) {
                c.f171805a.getClass();
                eVar = c.f171806b;
            } else {
                eVar = null;
            }
            o0Var = o0VarE;
            a(aVar, z14, rVarB, null, eVar, o0Var, i15 & 126, 8);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.l(aVar, z14, aVar2, i14, 6);
        }
    }

    public static final void c(int i14, e23.a aVar, String str, p3.m mVar, boolean z14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-1650316659);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            l72.p2 p2Var = l72.p2.f111205a;
            h4.r.a aVar2 = h4.r.S;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new y1(15);
                o0VarE.K(objQ);
            }
            p2Var.g(str, j2.b.b(p5.v.c((e23.l) objQ, aVar2, true), z14, false, null, aVar, 14), null, null, z3.f.c(-10825768, new rw0.g(z14, 9), o0VarE), false, z14, null, o0VarE, (i15 & 14) | 100687872 | ((i15 << 15) & 3670016), TsExtractor.TS_STREAM_TYPE_AC4);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d0(str, z14, aVar, i14, 1);
        }
    }
}
