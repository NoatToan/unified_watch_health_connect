package wn0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.n0;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import ta0.g0;

/* JADX INFO: loaded from: classes8.dex */
public final class k {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(l lVar, e23.l lVar2, nk0.l lVar3, nk0.l lVar4, nk0.l lVar5, e23.a aVar, nk0.l lVar6, nk0.l lVar7, p3.m mVar, int i14) {
        o0 o0Var;
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1060858645);
        int i15 = i14 | (o0VarE.r(lVar) ? 4 : 2) | (o0VarE.r(lVar2) ? 32 : 16) | (o0VarE.r(lVar3) ? 256 : 128) | (o0VarE.r(lVar4) ? 2048 : 1024) | (o0VarE.r(lVar5) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536) | (o0VarE.r(lVar6) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar7) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(lVar.f186139j, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new n82.f.a(null, null, null, 7, null);
                o0VarE.K(objQ);
            }
            n82.f fVarA = n82.j.a((n82.f.a) objQ, null, o0VarE, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new yd1.a(context);
                o0VarE.K(objQ2);
            }
            yd1.a aVar2 = (yd1.a) objQ2;
            vn0.a aVar3 = ((p) p1VarC.getF182175a()).f186166b;
            boolean zR = o0VarE.r(aVar3) | ((i15 & 112) == 32) | o0VarE.r(lVar);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new h(aVar3, lVar2, lVar, null);
                o0VarE.K(objQ3);
            }
            l0.e((e23.p) objQ3, aVar3, o0VarE);
            boolean z14 = ((p) p1VarC.getF182175a()).f186167c;
            Boolean boolValueOf = Boolean.valueOf(z14);
            boolean zH = o0VarE.h(z14) | o0VarE.r(context) | o0VarE.r(lVar);
            Object objQ4 = o0VarE.q();
            if (zH || objQ4 == c2565a) {
                objQ4 = new i(z14, context, lVar, null);
                o0VarE.K(objQ4);
            }
            l0.e((e23.p) objQ4, boolValueOf, o0VarE);
            n0 n0Var = (n0) o0VarE.A(s9.j.f158018a);
            boolean zR2 = o0VarE.r(lVar) | o0VarE.r(n0Var);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new w02.b(17, n0Var, lVar);
                o0VarE.K(objQ5);
            }
            l0.a(n0Var, (e23.l) objQ5, o0VarE);
            o0Var = o0VarE;
            z02.d.a(((p) p1VarC.getF182175a()).f186165a, z3.f.c(-508963706, new vx1.b(aVar, 16, lVar3, lVar5), o0VarE), null, null, null, z3.f.c(1429583618, new g0(fVarA, aVar2, lVar, lVar4, lVar6, lVar7, 12), o0VarE), o0Var, 196656, 28);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vz1.j(lVar, lVar2, lVar3, lVar4, lVar5, aVar, lVar6, lVar7, i14, 4);
        }
    }
}
