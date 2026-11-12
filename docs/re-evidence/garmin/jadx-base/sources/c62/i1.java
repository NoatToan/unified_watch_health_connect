package c62;

import l72.v2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class i1 {
    public static final void a(h1 h1Var, l52.i.a aVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar, e23.a aVar2, e23.q qVar, p3.m mVar, int i14) {
        int i15;
        Object obj;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-958395790);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(h1Var) : o0VarE.r(h1Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            obj = qVar;
            i15 |= o0VarE.r(obj) ? 16384 : 8192;
        } else {
            obj = qVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData();
            Object obj2 = obj;
            o0Var = o0VarE;
            w52.u.a(aVar.getDepth(), 384, 0, v2.a(h4.r.S, aVar.getDepth() == 0, new bk0.i(5), o0VarE, 6), o0Var, z3.f.c(1858584414, new a42.c((Object) eVar, (Object) j0Var, (Object) h1Var, (Object) aVar, (o13.h) aVar2, obj2, 10), o0VarE));
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(h1Var, aVar, eVar, aVar2, qVar, i14, 7);
        }
    }
}
