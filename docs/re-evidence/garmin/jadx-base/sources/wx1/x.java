package wx1;

import b82.u0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gl1.y;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import w51.j0;
import wn1.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class x {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i14, int i15, int i16, dy1.v vVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.l lVar, e23.p pVar, e23.p pVar2, p3.m mVar) {
        o0 o0Var;
        pVar.getClass();
        lVar.getClass();
        pVar2.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(171396253);
        int i17 = i16 | (o0VarE.k(i15) ? 32 : 16) | (o0VarE.r(vVar) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(pVar2) ? 131072 : 65536) | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar2) ? 8388608 : 4194304) | (o0VarE.r(aVar3) ? 67108864 : 33554432);
        if (o0VarE.n(i17 & 1, (38347923 & i17) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new d0(27);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new d0(28);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            int i18 = i17 >> 18;
            int i19 = (i18 & 112) | 196608 | (i18 & 896);
            o0Var = o0VarE;
            og2.k.g(y.Q(o0VarE, R.string.lbl_stp_workout_steps), aVar2, aVar3, false, null, z3.f.c(-560175444, new u0(i14, i15, vVar, aVar, pVar, p1Var2, lVar, p1Var), o0VarE), o0Var, i19, 24);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(-645018995);
                String str = (String) p1Var2.getF182175a();
                boolean zB = o0Var.B(p1Var);
                Object objQ3 = o0Var.q();
                if (zB || objQ3 == c2565a) {
                    objQ3 = new j0(p1Var, 26);
                    o0Var.K(objQ3);
                }
                rx1.n.a(vVar, str, pVar2, (e23.a) objQ3, o0Var, ((i17 >> 6) & 14) | ((i17 >> 9) & 896));
                o0Var.g0(false);
            } else {
                o0Var.C(-644719163);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(i14, i15, vVar, pVar, lVar, pVar2, aVar, aVar2, aVar3, i16);
        }
    }
}
