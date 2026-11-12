package z61;

import am.r1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import d92.b;
import e23.l;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i53.c;
import j92.e;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.w;
import ug2.p;
import v.h;
import w3.x;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static final void a(c<v61.a> cVar, boolean z14, l<? super Long, Unit> lVar, m mVar, int i14) {
        cVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1744735041);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(r.S, 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            d.f81522a.getClass();
            z zVarA = y.a(kVar, d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            g.V.getClass();
            e0.a aVar = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
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
            o0VarE.C(-578795336);
            for (v61.a aVar2 : cVar) {
                r.a aVar3 = r.S;
                b.f58623a.getClass();
                j92.b bVar2 = b.f58625c;
                bVar2.getClass();
                e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar2.getClass();
                b(c2.l.z(aVar3, f14, eVar.f97917b), aVar2, z14, lVar, o0VarE, (i15 << 3) & 8064);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.l(cVar, z14, lVar, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x0100  */
    public static final void b(r rVar, v61.a aVar, boolean z14, l<? super Long, Unit> lVar, m mVar, int i14) {
        int i15;
        boolean z15;
        o0 o0VarE = mVar.E(-1503613804);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 256 : 128;
        } else {
            z15 = z14;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String str = aVar.f175807g;
            boolean zB = o0VarE.B(str);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zB) {
                objQ = x.j(context, str);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = x.j(context, str);
                    o0VarE.K(objQ);
                }
            }
            String str2 = (String) objQ;
            boolean zB2 = o0VarE.B(str);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = x.k(context, str);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = x.k(context, str);
                    o0VarE.K(objQ2);
                }
            }
            String str3 = (String) objQ2;
            int i16 = i15 & 112;
            boolean z16 = i16 == 32;
            Object objQ3 = o0VarE.q();
            if (z16) {
                objQ3 = r1.i(context, aVar.f175806f, aVar.f175804d, aVar.f175805e);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = r1.i(context, aVar.f175806f, aVar.f175804d, aVar.f175805e);
                    o0VarE.K(objQ3);
                }
            }
            String str4 = (String) objQ3;
            str4.getClass();
            boolean z17 = ((i15 & 7168) == 2048) | (i16 == 32);
            Object objQ4 = o0VarE.q();
            if (z17) {
                objQ4 = new z10.d(5, lVar, aVar);
                o0VarE.K(objQ4);
            } else {
                aVar2.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = new z10.d(5, lVar, aVar);
                    o0VarE.K(objQ4);
                }
            }
            l72.l.f(f.c(-1990571025, new p(aVar, z15, str2, str3, str4, 17), o0VarE), w.d(rVar, false, null, null, (e23.a) objQ4, 15), false, null, o0VarE, 6, 28);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new yy1.g(rVar, aVar, z14, lVar, i14);
        }
    }
}
