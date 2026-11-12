package wx1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import ew1.s0;
import gl1.y;
import p13.h0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import t21.b1;
import w51.j0;
import wn1.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class s {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i14, int i15, int i16, boolean z14, boolean z15, boolean z16, i53.c cVar, i53.c cVar2, e23.a aVar, e23.a aVar2, e23.p pVar, e23.l lVar, e23.p pVar2, e23.p pVar3, e23.l lVar2, e23.l lVar3, e23.a aVar3, e23.a aVar4, p3.m mVar, int i17) {
        o0 o0Var;
        cVar.getClass();
        cVar2.getClass();
        aVar.getClass();
        aVar2.getClass();
        pVar.getClass();
        lVar.getClass();
        pVar2.getClass();
        pVar3.getClass();
        lVar2.getClass();
        lVar3.getClass();
        o0 o0VarP = fb1.c.p(aVar3, aVar4, mVar, 1056511688);
        int i18 = i17 | (o0VarP.k(i14) ? 4 : 2) | (o0VarP.k(i15) ? 32 : 16) | (o0VarP.k(i16) ? 256 : 128) | (o0VarP.h(z14) ? 2048 : 1024) | (o0VarP.h(z15) ? 16384 : 8192) | (o0VarP.h(z16) ? 131072 : 65536) | (o0VarP.r(cVar) ? 1048576 : 524288) | (o0VarP.B(cVar2) ? 8388608 : 4194304) | (o0VarP.r(aVar) ? 67108864 : 33554432) | (o0VarP.r(aVar2) ? 536870912 : 268435456);
        int i19 = (o0VarP.r(pVar) ? 4 : 2) | (o0VarP.r(lVar) ? 32 : 16) | (o0VarP.r(pVar2) ? 256 : 128) | (o0VarP.r(pVar3) ? 2048 : 1024) | (o0VarP.r(lVar2) ? 16384 : 8192) | (o0VarP.r(lVar3) ? 131072 : 65536) | (o0VarP.r(aVar3) ? 1048576 : 524288) | (o0VarP.r(aVar4) ? 8388608 : 4194304);
        if (o0VarP.n(i18 & 1, ((i18 & 306783379) == 306783378 && (4793491 & i19) == 4793490) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            Object[] objArr = new Object[0];
            Object objQ = o0VarP.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new d0(26);
                o0VarP.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarP, 48);
            dy1.v vVar = (dy1.v) h0.e0(i16, cVar);
            int i24 = i19 >> 15;
            og2.k.g(y.Q(o0VarP, R.string.lbl_stp_set_training_days), aVar3, aVar4, z16, null, z3.f.c(-1973390183, new s0(vVar, cVar2, i14, i15, lVar3, z14, z15, context, aVar, p1Var, cVar), o0VarP), o0VarP, (i24 & 896) | (i24 & 112) | 196608 | ((i18 >> 6) & 7168), 16);
            o0Var = o0VarP;
            if (!((Boolean) p1Var.getF182175a()).booleanValue() || vVar == null) {
                o0Var.C(1028670970);
                o0Var.g0(false);
            } else {
                o0Var.C(1027606182);
                if (z15) {
                    o0Var.C(1027617032);
                    boolean zB = o0Var.B(p1Var);
                    Object objQ2 = o0Var.q();
                    if (zB || objQ2 == c2565a) {
                        objQ2 = new j0(p1Var, 24);
                        o0Var.K(objQ2);
                    }
                    rx1.h.a(((i18 >> 24) & 112) | ((i19 << 6) & 896) | (i19 & 7168) | (i19 & 57344), vVar, aVar2, (e23.a) objQ2, lVar2, pVar, pVar3, o0Var);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1028178752);
                    boolean zB2 = o0Var.B(p1Var);
                    Object objQ3 = o0Var.q();
                    if (zB2 || objQ3 == c2565a) {
                        objQ3 = new j0(p1Var, 25);
                        o0Var.K(objQ3);
                    }
                    int i25 = i19 << 6;
                    rx1.w.a(((i18 >> 24) & 112) | (i25 & 896) | (i25 & 7168) | (i25 & 57344), vVar, aVar2, (e23.a) objQ3, lVar, pVar, pVar2, o0Var);
                    o0Var.g0(false);
                }
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b1(i14, i15, i16, z14, z15, z16, cVar, cVar2, aVar, aVar2, pVar, lVar, pVar2, pVar3, lVar2, lVar3, aVar3, aVar4, i17);
        }
    }
}
