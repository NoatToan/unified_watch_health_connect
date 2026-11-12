package m30;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import h5.e0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class w {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(n30.e eVar, com.garmin.android.apps.connectmobile.courses.model.i iVar, e23.l<? super n30.e, Unit> lVar, p3.m mVar, int i14) {
        iVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(870998957);
        int i15 = i14 | (o0VarE.B(eVar) ? 4 : 2) | (o0VarE.k(iVar.ordinal()) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(b60.a.a(context, null, eVar.f123446a, eVar.f123447b, eVar.f123448c, eVar.f123449d, Double.valueOf(eVar.f123450e), iVar, eVar.f123451f, eVar.f123452g, false));
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            h4.r.a aVar = h4.r.S;
            h4.r rVarC = wz1.i.c(aVar, o0VarE);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar, j92.b.f97899b.f97920e), o0VarE);
            a60.b bVar2 = (a60.b) p1Var.getF182175a();
            int i16 = 4;
            boolean z14 = ((i15 & 14) == 4) | ((i15 & 896) == 256);
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new ls0.h(lVar, i16, eVar, p1Var);
                o0VarE.K(objQ2);
            }
            z50.k.a(bVar2, (e23.l) objQ2, o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a((Object) eVar, (Object) iVar, (Object) lVar, i14, 14);
        }
    }
}
