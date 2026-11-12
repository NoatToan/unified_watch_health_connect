package ib0;

import a3.l0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import o4.d0;
import o4.z0;
import p13.x;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:33:0x012a  */
    public static final void a(h4.r rVar, jb0.c cVar, long j8, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(2089937052);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            String strB = cVar != null ? cVar.b() : null;
            if (strB == null || strB.length() == 0) {
                o0VarE.C(1469042744);
                o4.w.a aVar = o4.w.f129023a;
                gl.c.f77766a.getClass();
                z0 z0VarI = o4.w.a.i(aVar, x.k(d0.a(gl.c.a(o0VarE).c()), d0.a(gl.c.a(o0VarE).b())), 0.0f, 14);
                boolean zB = o0VarE.B(z0VarI);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = new ck0.g(z0VarI, 4);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ck0.g(z0VarI, 4);
                        o0VarE.K(objQ);
                    }
                }
                u1.n.b(rVar, (e23.l) objQ, o0VarE, i15 & 14);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1469402592);
                wf.f.a aVar2 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                aVar2.f184930c = strB;
                aVar2.f184935h = cVar.a(j8);
                aVar2.f184933f = cVar.a(j8);
                wf.g.a(aVar2);
                wf.f fVarA = aVar2.a();
                f5.k.f68985a.getClass();
                f5.k.a.C1427a c1427a = f5.k.a.f68987b;
                h4.d.f81522a.getClass();
                h4.g gVar = h4.d.a.f81528f;
                d92.b.f58623a.getClass();
                jf.r.b(fVarA, null, l4.k.b(c2.l.g(rVar, 1.0f), k2.i.f102406a), new t4.c(d92.b.a(o0VarE).c().g(), null), new t4.c(d92.b.a(o0VarE).d().a().c(), null), null, null, null, null, gVar, c1427a, null, o0VarE, 805306416, 6, 31200);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(rVar, cVar, j8, i14, 7);
        }
    }
}
