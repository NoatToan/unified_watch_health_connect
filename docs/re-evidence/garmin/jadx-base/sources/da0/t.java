package da0;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.h6;
import java.util.ArrayList;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class t {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, c2.j.e eVar, int i14, Object obj, ArrayList arrayList, x0 x0Var, e23.q qVar, e23.l lVar, p3.m mVar, int i15) {
        int i16;
        rVar.getClass();
        eVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-191739294);
        int i17 = i15 | (o0VarE.B(rVar) ? 4 : 2) | 384 | (o0VarE.B(obj) ? 2048 : 1024) | (o0VarE.r(arrayList) ? 16384 : 8192) | (o0VarE.B(x0Var) ? 131072 : 65536) | (o0VarE.r(qVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar) ? 8388608 : 4194304);
        if (o0VarE.n(i17 & 1, (4793491 & i17) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new a11.m(p1Var, 15);
                o0VarE.K(objQ2);
            }
            h6.a(zBooleanValue, (e23.l) objQ2, rVar, z3.f.c(-982946568, new q(rVar, eVar, qVar, obj, i17, x0Var, p1Var, arrayList, lVar), o0VarE), o0VarE, ((i17 << 6) & 896) | 3120, 0);
            i16 = Integer.MAX_VALUE;
        } else {
            o0VarE.e();
            i16 = i14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(rVar, eVar, i16, obj, arrayList, x0Var, qVar, lVar, i15);
        }
    }
}
