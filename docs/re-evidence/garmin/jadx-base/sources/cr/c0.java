package cr;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import c2.k3;
import c2.m3;
import c2.n3;
import c2.p3;
import java.util.Iterator;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 {
    public static final void a(i53.c<er.a> cVar, p3.m mVar, int i14) {
        h4.r rVarX;
        cVar.getClass();
        o0 o0VarE = mVar.E(-2122363072);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Configuration configuration = (Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a);
            h4.r.a aVar = h4.r.S;
            if (configuration.orientation == 2) {
                o0VarE.C(-1104430349);
                int i16 = k3.f22728a;
                m3.f22753w.getClass();
                c2.g gVar = m3.a.c(o0VarE).f22756b;
                p3.f22815b.getClass();
                rVarX = c2.l.x(aVar, n3.c(n3.d(gVar, p3.f22826m), o0VarE));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1104162478);
                o0VarE.g0(false);
                rVarX = aVar;
            }
            aVar.getClass();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new com.google.maps.android.compose.clustering.d(12);
                o0VarE.K(objQ);
            }
            h4.r rVarB = p5.v.b(rVarX, (e23.l) objQ);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            o0VarE.C(-153533528);
            Iterator<er.a> it = cVar.iterator();
            while (it.hasNext()) {
                d0.a(it.next(), o0VarE, 0);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.p(cVar, i14, 3);
        }
    }

    public static final void b(ComposeView composeView, i53.f fVar) {
        fVar.getClass();
        composeView.setContent(new z3.e(140995266, true, new b82.p(fVar, 1)));
    }
}
