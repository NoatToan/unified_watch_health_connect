package t21;

import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import i3.fe;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class t0 {
    public static final void a(String str, fe feVar, e23.a aVar, NutritionActivity.f fVar, p3.m mVar, int i14) {
        int i15;
        str.getClass();
        feVar.getClass();
        p3.o0 o0VarE = mVar.E(-333953214);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(feVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(fVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            z02.d.a(false, z3.f.c(-854374179, new l(3, str, fVar), o0VarE), z3.f.c(-1339319428, new p21.b(feVar, 15), o0VarE), null, null, z3.f.c(1500812121, new s70.a0(aVar, 7), o0VarE), o0VarE, 197040, 25);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(str, feVar, aVar, fVar, i14);
        }
    }
}
