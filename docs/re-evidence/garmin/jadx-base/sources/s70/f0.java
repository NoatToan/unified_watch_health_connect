package s70;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.p2;
import v62.z7;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 {
    /* JADX WARN: Code duplicated, block: B:49:0x011f  */
    public static final void a(h4.r rVar, z90.a aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        u4.d dVarA;
        String strA;
        String strJ;
        String strJ2;
        p3.o0 o0VarE = mVar.E(536511108);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.s sVar = l72.s.f111232a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVar, f14, eVar.f97920e, f15, 0.0f, 8);
            l72.s.b bVar2 = l72.s.b.INFO;
            boolean z14 = aVar instanceof z90.a.d;
            s62.a aVar3 = s62.a.f157643a;
            if (z14) {
                aVar3.getClass();
                t62.b.f162798a.getClass();
                dVarA = d72.f.a(z7.f176105a);
            } else {
                aVar3.getClass();
                dVarA = f72.o0.a(t62.c.f162799a);
            }
            u4.d dVar = dVarA;
            if (z14) {
                o0VarE.C(1629694550);
                strA = g22.n.a(gl1.y.Q(o0VarE, R.string.software_update_banner_title));
                o0VarE.g0(false);
            } else {
                o0VarE.C(1629803856);
                strA = g22.n.a(gl1.y.Q(o0VarE, R.string.software_update_banner_error_title));
                o0VarE.g0(false);
            }
            String str = strA;
            if (z14) {
                o0VarE.C(1629983222);
                strJ = gl1.y.P(R.string.software_update_banner_msg, new Object[]{((z90.a.d) aVar).f203116a.f143495c.f111521f}, o0VarE);
                o0VarE.g0(false);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1630122536, R.string.software_update_banner_error_msg, o0VarE, false);
            }
            String str2 = strJ;
            if (aVar instanceof z90.a.C3788a) {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 191137030, R.string.lbl_retry, o0VarE, false);
            } else {
                o0VarE.C(1630319385);
                o0VarE.g0(false);
                strJ2 = null;
            }
            boolean z15 = ((i15 & 112) == 32) | ((i15 & 896) == 256);
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new rk0.f(25, aVar, aVar2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rk0.f(25, aVar, aVar2);
                    o0VarE.K(objQ);
                }
            }
            sVar.d(rVarC, bVar2, dVar, str, str2, strJ2, (e23.a) objQ, null, o0VarE, 48, 384);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rx1.u(rVar, aVar, aVar2, i14, 6);
        }
    }
}
