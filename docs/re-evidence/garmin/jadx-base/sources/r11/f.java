package r11;

import b21.l0;
import b63.v;
import c2.n0;
import c2.n3;
import cn1.o;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import gl1.y;
import i3.bc;
import i3.bi;
import i3.d5;
import i3.fe;
import i3.m4;
import i3.si;
import i3.w4;
import i3.x3;
import j10.q;
import org.koin.java.KoinJavaComponent;
import p13.h0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(v21.e eVar, s11.a aVar, fe feVar, i01.a aVar2, i53.c cVar, p pVar, NutritionActivity.g gVar, p3.m mVar, int i14) {
        p pVar2;
        NutritionActivity.g gVar2;
        v21.e eVar2;
        v21.e eVar3;
        aVar.getClass();
        bc bcVar = aVar.f155874b;
        j23.l lVar = aVar.f155875c;
        long j8 = aVar.f155873a;
        feVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(1696580404);
        int i15 = (i14 & 6) == 0 ? i14 | 2 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(feVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(aVar2.ordinal()) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(cVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            pVar2 = pVar;
            i15 |= o0VarE.r(pVar2) ? 131072 : 65536;
        } else {
            pVar2 = pVar;
        }
        if ((1572864 & i14) == 0) {
            gVar2 = gVar;
            i15 |= o0VarE.r(gVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            gVar2 = gVar;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
            } else {
                o0VarE.e();
                eVar3 = eVar;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = Integer.valueOf(((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).N());
                o0VarE.K(objQ);
            }
            int iIntValue = ((Number) objQ).intValue();
            m4 m4VarP = x3.p(Long.valueOf(j8), lVar, bcVar, o0VarE, 0, 10);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.f(new b(m4VarP, 0));
                o0VarE.K(objQ2);
            }
            p3.x3 x3Var = (p3.x3) objQ2;
            d5 d5VarE = w4.e(Long.valueOf(j8), null, null, lVar, 0, bcVar, o0VarE, 48, 20);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.f(new e(d5VarE, 0));
                o0VarE.K(objQ3);
            }
            p3.x3 x3Var2 = (p3.x3) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.f(new qn0.f(15, x3Var, x3Var2));
                o0VarE.K(objQ4);
            }
            p3.x3 x3Var3 = (p3.x3) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(cVar.size() == 1 ? ((b11.i) h0.b0(cVar)).getF14317c() : g22.l.f(v.INSTANCE));
                o0VarE.K(objQ5);
            }
            p1 p1Var = (p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p0.f(new qn0.f(16, cVar, p1Var));
                o0VarE.K(objQ6);
            }
            p3.x3 x3Var4 = (p3.x3) objQ6;
            Object[] objArr = new Object[0];
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = new qy0.a(11);
                o0VarE.K(objQ7);
            }
            p1 p1Var2 = (p1) d4.a.e(objArr, (e23.a) objQ7, o0VarE, 48);
            z3.e eVarC = z3.f.c(914750009, new l0(aVar2, gVar2, pVar2, x3Var3, x3Var, x3Var2, p1Var, 29), o0VarE);
            z3.e eVarC2 = z3.f.c(-504574022, new p21.b(feVar, 7), o0VarE);
            n0 n0Var = n3.f22788a;
            z02.d.a(false, eVarC, eVarC2, null, new n0(0, 0, 0, 0), z3.f.c(-467578819, new fo.b(aVar2, cVar, x3Var4, eVar3, m4VarP, d5VarE, aVar, p1Var2, iIntValue, p1Var, 10), o0VarE), o0VarE, 197040, 9);
            o0VarE = o0VarE;
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-334976619);
                si siVarZ = bi.z(((v) p1Var.getF182175a()).f16219a.getHour(), ((v) p1Var.getF182175a()).f16219a.getMinute(), false, o0VarE, 0, 4);
                String strQ = y.Q(o0VarE, R.string.lbl_select_time);
                String strQ2 = y.Q(o0VarE, R.string.lbl_ok);
                boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                String strQ3 = y.Q(o0VarE, R.string.lbl_cancel);
                boolean zB = o0VarE.B(p1Var2);
                Object objQ8 = o0VarE.q();
                if (zB || objQ8 == c2565a) {
                    objQ8 = new qk0.m(p1Var2, 12);
                    o0VarE.K(objQ8);
                }
                e23.a aVar3 = (e23.a) objQ8;
                boolean zB2 = o0VarE.B(p1Var2);
                Object objQ9 = o0VarE.q();
                if (zB2 || objQ9 == c2565a) {
                    objQ9 = new q(p1Var2, p1Var, 5);
                    o0VarE.K(objQ9);
                }
                g82.e.a(strQ, siVarZ, zBooleanValue, strQ3, aVar3, strQ2, (p) objQ9, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-334214546);
                o0VarE.g0(false);
            }
            eVar2 = eVar3;
        } else {
            o0VarE.e();
            eVar2 = eVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(eVar2, aVar, feVar, aVar2, cVar, pVar, gVar, i14, 17);
        }
    }
}
