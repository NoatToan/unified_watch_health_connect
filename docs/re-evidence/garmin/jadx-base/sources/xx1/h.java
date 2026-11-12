package xx1;

import com.garmin.android.apps.connectmobile.R;
import e23.l;
import gl1.y;
import og2.k;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    public static final void a(Integer num, l<? super Integer, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1080775301);
        int i15 = i14 | (o0VarE.B(num) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            int i16 = i15 >> 6;
            k.g(y.Q(o0VarE, R.string.lbl_set_workouts), aVar2, aVar3, false, null, z3.f.c(-1125242932, new xk1.e(num, 2, aVar, lVar), o0VarE), o0VarE, (i16 & 112) | 196608 | (i16 & 896), 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wv0.e(num, lVar, aVar, aVar2, aVar3, i14);
        }
    }
}
