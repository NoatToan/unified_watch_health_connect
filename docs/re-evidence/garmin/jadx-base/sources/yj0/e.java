package yj0;

import a11.j;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.g3;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.b2;
import w51.n0;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e23.a<Unit> aVar, f fVar, p<? super String, ? super String, Unit> pVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1693865411);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(fVar) ? 32 : 16) | (o0VarE.r(pVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            b2 b2Var = fVar.f197488d;
            g3 g3VarC = g3.a.c(g3.f35298f);
            int i16 = g3.f35299g << 3;
            p1 p1VarB = p0.b(b2Var, g3VarC, null, o0VarE, i16, 2);
            p1 p1VarB2 = p0.b(fVar.f197492h, g3.a.b(null), null, o0VarE, i16, 2);
            p1 p1VarB3 = p0.b(fVar.f197490f, g3.a.b(null), null, o0VarE, i16, 2);
            r53.i<Boolean> iVar = fVar.f197493i;
            Boolean bool = Boolean.FALSE;
            p1 p1VarB4 = p0.b(iVar, bool, null, o0VarE, 48, 2);
            p1 p1VarB5 = p0.b(fVar.f197494j, bool, null, o0VarE, 48, 2);
            p1 p1VarB6 = p0.b(fVar.f197495k, bool, null, o0VarE, 48, 2);
            p1 p1VarB7 = p0.b(fVar.f197496l, bool, null, o0VarE, 48, 2);
            fw.p pVar2 = ((g3) p1VarB2.getF182175a()).f35300a;
            fw.p pVar3 = fw.p.LOADING;
            z02.d.a(pVar2 == pVar3 || ((g3) p1VarB3.getF182175a()).f35300a == pVar3 || ((g3) p1VarB.getF182175a()).f35300a == pVar3, z3.f.c(2066083166, new n0(aVar, 20), o0VarE), null, null, null, z3.f.c(-1794920486, new j(p1VarB3, p1VarB, fVar, p1VarB4, p1VarB5, p1VarB6, context, pVar, p1VarB2, p1VarB7), o0VarE), o0VarE, 196656, 28);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xk1.e(aVar, fVar, pVar, i14, 13);
        }
    }
}
