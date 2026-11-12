package z41;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Arrays;
import o4.f0;
import o4.w;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final void a(h4.r rVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1322324401);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            int[] intArray = ((Resources) o0VarE.A(AndroidCompositionLocals_androidKt.f6043c)).getIntArray(R.array.pacepro_gradient_colors);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                ArrayList arrayList = new ArrayList();
                int length = intArray.length;
                int i16 = 0;
                int i17 = 0;
                while (i16 < length) {
                    int i18 = intArray[i16];
                    int i19 = i17 + 1;
                    d0.v(arrayList, x.k(new o13.p(Float.valueOf(i17 / intArray.length), o4.d0.a(f0.b(i18))), new o13.p(Float.valueOf(i19 / intArray.length), o4.d0.a(f0.b(i18)))));
                    i16++;
                    i17 = i19;
                }
                objQ = (o13.p[]) arrayList.toArray(new o13.p[0]);
                o0VarE.K(objQ);
            }
            o13.p[] pVarArr = (o13.p[]) objQ;
            float f14 = 9;
            g6.f.a aVar = g6.f.f75994b;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            s2 s2VarF = hb.a.f(jVar, j92.b.f97899b.f97920e, bVar, o0VarE, 48);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, s2VarF, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            String strQ = y.Q(o0VarE, R.string.pacepro_lbl_pace_slower);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97935l;
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131070);
            c2.q.a(u1.n.d(x2.h(x2.u(h4.r.S, f14 * intArray.length), f14), w.a.c(w.f129023a, (o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length), 0.0f, 0.0f, 14), null, 6), o0VarE, 0);
            String strQ2 = y.Q(o0VarE, R.string.pacepro_lbl_pace_faster);
            fVar.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar, i14, 29);
        }
    }
}
