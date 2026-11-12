package as;

import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import nr.c0;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class m {
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    public static final void a(List<c0> list, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 922437730);
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
        int i16 = 1;
        if (o0VarP.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            boolean z15 = (list == null || list.isEmpty()) && !z14;
            Integer numValueOf = Integer.valueOf(R.string.lbl_add_move);
            boolean z16 = (i15 & 896) == 256;
            Object objQ = o0VarP.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z16) {
                objQ = new defpackage.c(aVar, 27);
                o0VarP.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new defpackage.c(aVar, 27);
                    o0VarP.K(objQ);
                }
            }
            e23.a aVar4 = (e23.a) objQ;
            boolean z17 = (i15 & 7168) == 2048;
            Object objQ2 = o0VarP.q();
            if (z17) {
                objQ2 = new defpackage.c(aVar2, 28);
                o0VarP.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new defpackage.c(aVar2, 28);
                    o0VarP.K(objQ2);
                }
            }
            e23.a aVar5 = (e23.a) objQ2;
            b.f12618a.getClass();
            k.c(R.string.lbl_common_moves, numValueOf, z14, aVar4, aVar5, b.f12620c, z15 ? null : new z3.e(-393938391, true, new a31.b(list, i16)), o0VarP, 196608 | ((i15 << 3) & 896), 0);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(list, z14, aVar, aVar2, i14, 0);
        }
    }
}
