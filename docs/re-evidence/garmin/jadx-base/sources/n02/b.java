package n02;

import com.garmin.android.apps.connectmobile.R;
import d53.w;
import gl1.y;
import l72.c1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.math.MathKt;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final void a(f fVar, e23.l lVar, boolean z14, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        boolean z15;
        fVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1398511430);
        int i15 = i14 | (o0VarE.B(fVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | 384 | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            c1 c1Var = c1.f110940a;
            double d14 = fVar.f122171b;
            o0Var = o0VarE;
            c1Var.a(true, ((int) d14) + "." + w.M(fVar.f122173d, String.valueOf(MathKt.b(fVar.a() * (d14 - ((double) ((int) d14)))))) + StringUtils.SPACE + y.Q(o0VarE, fVar.f122170a.f122179a), null, z3.f.c(26422238, new mw0.i(3, fVar, lVar), o0VarE), null, y.Q(o0VarE, R.string.lbl_ok), false, false, aVar, null, aVar2, o0Var, 3078 | ((i15 << 15) & 234881024), (i15 >> 12) & 14, 724);
            z15 = true;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z15 = z14;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.m(i14, 21, aVar, aVar2, fVar, lVar, z15);
        }
    }
}
