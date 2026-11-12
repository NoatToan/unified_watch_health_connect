package as;

import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import nr.d0;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class o {
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    public static final void a(List<d0> list, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        z3.e eVar;
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 1800371938);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarP.r(list) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarP.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarP.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarP.r(aVar2) ? 2048 : 1024;
        }
        if (o0VarP.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            boolean z15 = (list == null || list.isEmpty()) && !z14;
            Integer numValueOf = Integer.valueOf(R.string.lbl_add_pose);
            boolean z16 = (i15 & 896) == 256;
            Object objQ = o0VarP.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z16) {
                objQ = new defpackage.c(aVar, 29);
                o0VarP.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new defpackage.c(aVar, 29);
                    o0VarP.K(objQ);
                }
            }
            e23.a aVar4 = (e23.a) objQ;
            boolean z17 = (i15 & 7168) == 2048;
            Object objQ2 = o0VarP.q();
            if (z17) {
                objQ2 = new n(aVar2, 0);
                o0VarP.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new n(aVar2, 0);
                    o0VarP.K(objQ2);
                }
            }
            e23.a aVar5 = (e23.a) objQ2;
            if (z15) {
                eVar = null;
            } else {
                c.f12621a.getClass();
                eVar = c.f12623c;
            }
            k.c(R.string.lbl_pose_plural, numValueOf, z14, aVar4, aVar5, eVar, z15 ? null : new z3.e(-1841913687, true, new a31.b(list, i16)), o0VarP, (i15 << 3) & 896, 0);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(list, z14, aVar, aVar2, i14, 1);
        }
    }
}
