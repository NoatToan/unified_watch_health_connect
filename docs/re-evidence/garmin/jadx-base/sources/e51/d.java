package e51;

import b21.n9;
import c.w;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import cw1.p0;
import dh0.j;
import e23.q;
import o51.i;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final void a(i iVar, boolean z14, q<? super t41.h, ? super Integer, ? super Double, Unit> qVar, e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0Var;
        iVar.getClass();
        qVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-284037312);
        int i15 = i14 | (o0VarE.B(iVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(qVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new j(27);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new j(28);
                o0VarE.K(objQ2);
            }
            n1 n1Var = (n1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            Object[] objArr3 = new Object[0];
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new j(29);
                o0VarE.K(objQ3);
            }
            n1 n1Var2 = (n1) d4.a.e(objArr3, (e23.a) objQ3, o0VarE, 48);
            Object[] objArr4 = new Object[0];
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new c(0);
                o0VarE.K(objQ4);
            }
            n1 n1Var3 = (n1) d4.a.e(objArr4, (e23.a) objQ4, o0VarE, 48);
            int i16 = z14 ? 149 : PsExtractor.VIDEO_STREAM_MASK;
            boolean z15 = (i15 & 7168) == 2048;
            Object objQ5 = o0VarE.q();
            if (z15 || objQ5 == c2565a) {
                objQ5 = new p0(aVar, 29);
                o0VarE.K(objQ5);
            }
            w.a(0, 1, (e23.a) objQ5, o0VarE, false);
            a.f63045a.getClass();
            o0Var = o0VarE;
            z02.d.a(false, a.f63046b, null, null, null, z3.f.c(28610071, new n9(iVar, i16, z14, n1Var, qVar, n1Var3, n1Var2, p1Var), o0VarE), o0Var, 196656, 29);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.g(iVar, z14, qVar, aVar, i14, 8);
        }
    }
}
