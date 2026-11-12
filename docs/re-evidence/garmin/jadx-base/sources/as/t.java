package as;

import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import nr.e0;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class t {
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    public static final void a(List<e0> list, String str, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarL = vb.h.l(1610539741, aVar, str, mVar);
        int i15 = i14 | (o0VarL.r(list) ? 4 : 2) | (o0VarL.B(str) ? 32 : 16) | (o0VarL.h(z14) ? 256 : 128) | (o0VarL.r(aVar) ? 2048 : 1024);
        if (o0VarL.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            boolean z15 = (i15 & 7168) == 2048;
            Object objQ = o0VarL.q();
            if (z15) {
                objQ = new n(aVar, 1);
                o0VarL.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new n(aVar, 1);
                    o0VarL.K(objQ);
                }
            }
            k.c(R.string.strength_training_exercises, null, z14, (e23.a) objQ, null, z3.f.c(737337208, new p(str, 0), o0VarL), z3.f.c(500719383, new a31.b(list, 3), o0VarL), o0VarL, (i15 & 896) | 1769472, 18);
        } else {
            o0VarL.e();
        }
        p2 p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.g((Object) list, (Object) str, z14, (Object) aVar, i14, 2);
        }
    }
}
