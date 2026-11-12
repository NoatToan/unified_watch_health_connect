package lv1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import c22.x0;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import java.util.List;
import l30.y0;
import l72.p2;
import mv1.c;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.x1;
import v.h;
import wt1.q;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static final void a(c cVar, e23.a aVar, m mVar, int i14) {
        List<String> list = cVar.f121181a;
        o0 o0VarE = mVar.E(-532871183);
        int i15 = i14 | (o0VarE.r(cVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r rVarF = x2.f(r.S, 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            d.f81522a.getClass();
            z zVarA = y.a(kVar, d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            q.f187120f.getClass();
            String strB = q.a.b(context, list);
            int size = list != null ? list.size() : 0;
            p2 p2Var = p2.f111205a;
            x0.f23314a.getClass();
            String strW = gl1.d.W(size > 1 ? x0.Sb : x0.Qb);
            if (strB == null) {
                strB = "";
            }
            p2Var.h(strW, strB, null, null, null, false, false, null, null, null, aVar, o0VarE, 0, (i15 >> 3) & 14, 1020);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(cVar, aVar, i14, 13);
        }
    }
}
