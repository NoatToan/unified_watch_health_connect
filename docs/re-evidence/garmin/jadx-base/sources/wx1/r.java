package wx1;

import b82.w0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f21.k0;
import gl1.y;
import i3.fe;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import w51.j0;

/* JADX INFO: loaded from: classes10.dex */
public final class r {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i14, int i15, fe feVar, dy1.c cVar, boolean z14, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.l lVar, e23.a aVar5, e23.a aVar6, e23.a aVar7, p3.m mVar, int i16) {
        int i17;
        int i18;
        o0 o0Var;
        dy1.c cVar2;
        feVar.getClass();
        cVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        lVar.getClass();
        aVar5.getClass();
        aVar6.getClass();
        aVar7.getClass();
        o0 o0VarE = mVar.E(-332361051);
        if ((i16 & 6) == 0) {
            i17 = (o0VarE.k(i14) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 = i15;
            i17 |= o0VarE.k(i18) ? 32 : 16;
        } else {
            i18 = i15;
        }
        if ((i16 & 384) == 0) {
            i17 |= o0VarE.B(feVar) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= o0VarE.B(cVar) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i17 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if ((i16 & 196608) == 0) {
            i17 |= o0VarE.r(aVar) ? 131072 : 65536;
        }
        if ((i16 & 1572864) == 0) {
            i17 |= o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i16 & 12582912) == 0) {
            i17 |= o0VarE.r(aVar3) ? 8388608 : 4194304;
        }
        if ((i16 & 100663296) == 0) {
            i17 |= o0VarE.r(aVar4) ? 67108864 : 33554432;
        }
        if ((i16 & C.ENCODING_PCM_32BIT) == 0) {
            i17 |= o0VarE.r(lVar) ? 536870912 : 268435456;
        }
        int i19 = i17;
        int i24 = (o0VarE.r(aVar5) ? 4 : 2) | (o0VarE.r(aVar6) ? 32 : 16) | (o0VarE.r(aVar7) ? 256 : 128);
        if (o0VarE.n(i19 & 1, ((i19 & 306783379) == 306783378 && (i24 & 147) == 146) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(null);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            mx1.a.C2299a c2299a = mx1.a.f121347g;
            String str = (String) p1Var2.getF182175a();
            c2299a.getClass();
            mx1.a aVarA = mx1.a.C2299a.a(str);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n(null);
                o0VarE.K(objQ4);
            }
            p1 p1Var4 = (p1) objQ4;
            cVar2 = cVar;
            o0Var = o0VarE;
            og2.k.g(y.Q(o0VarE, cVar.f61536b.size() == 1 ? R.string.lbl_stp_set_benchmark : R.string.lbl_stp_set_benchmarks), aVar6, aVar7, z14, z3.f.c(-121560781, new p21.b(feVar, 28), o0VarE), z3.f.c(1967764148, new w0(i14, i18, cVar, aVar5, aVar, p1Var4, p1Var2, p1Var, p1Var3), o0VarE), o0Var, (i24 & 112) | 221184 | (i24 & 896) | ((i19 >> 3) & 7168), 0);
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0Var.C(-1461433915);
                Object objQ5 = o0Var.q();
                if (objQ5 == c2565a) {
                    objQ5 = new j0(p1Var3, 21);
                    o0Var.K(objQ5);
                }
                int i25 = i19 >> 18;
                og2.k.b(aVar2, aVar3, (e23.a) objQ5, o0Var, (i25 & 112) | (i25 & 14) | 384);
                o0Var.g0(false);
            } else {
                o0Var.C(-1461164835);
                o0Var.g0(false);
            }
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(-1461115235);
                boolean z15 = cVar2.f61535a;
                Object objQ6 = o0Var.q();
                if (objQ6 == c2565a) {
                    objQ6 = new j0(p1Var, 22);
                    o0Var.K(objQ6);
                }
                rx1.s.a(p1Var4, aVarA, z15, lVar, aVar4, (e23.a) objQ6, o0Var, ((i19 >> 18) & 7168) | 196614 | ((i19 >> 12) & 57344));
                o0Var.g0(false);
            } else {
                o0Var.C(-1460709507);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            cVar2 = cVar;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(i14, i15, feVar, cVar2, z14, aVar, aVar2, aVar3, aVar4, lVar, aVar5, aVar6, aVar7, i16);
        }
    }
}
