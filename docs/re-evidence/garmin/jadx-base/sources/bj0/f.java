package bj0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b71.o;
import c2.b0;
import c2.j;
import c2.l;
import c2.t;
import c2.x2;
import c2.y;
import c2.z;
import e23.q;
import h4.g;
import h4.r;
import h5.e0;
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
import p5.v;
import v.h;
import z72.k;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    public static final void a(final gj0.e eVar, r rVar, float f14, float f15, m mVar, int i14) {
        int i15;
        float f16;
        float f17;
        eVar.getClass();
        o0 o0VarE = mVar.E(1454489859);
        if ((i14 & 6) == 0) {
            i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        int i16 = i15 | 3456;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            zi0.a aVar = zi0.a.f204842a;
            aVar.getClass();
            final float f18 = zi0.a.f204843b;
            aVar.getClass();
            final float f19 = zi0.a.f204844c;
            x1 x1Var = n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            k.a(x2.h(rVar, f18), eVar.f77500d, eVar.f77499c, null, null, f19, 3.0f, false, false, z3.f.c(401106871, new q() { // from class: bj0.d
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    t tVar = (t) obj;
                    m mVar2 = (m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar2.B(tVar) ? 4 : 2;
                    }
                    int i17 = 0;
                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                        x1 x1Var2 = n.f135158a;
                        r.a aVar2 = r.S;
                        r rVarQ = x2.q(aVar2, f18);
                        float f22 = f19 * 1.5f;
                        g6.f.a aVar3 = g6.f.f75994b;
                        r rVarA = l.A(rVarQ, f22, 0.0f, 2);
                        h4.d.f81522a.getClass();
                        r rVarC = tVar.c(rVarA, h4.d.a.f81528f);
                        Object objQ = mVar2.q();
                        m.f135153a.getClass();
                        m.a.C2565a c2565a = m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new o(18);
                            mVar2.K(objQ);
                        }
                        r rVarC2 = v.c((e23.l) objQ, rVarC, true);
                        g.a aVar4 = h4.d.a.f81537o;
                        j.f22691a.getClass();
                        z zVarA = y.a(j.f22696f, aVar4, mVar2, 54);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        r rVarC3 = h4.k.c(rVarC2, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar5 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar5);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC3, mVar2);
                        b0 b0Var = b0.f22601a;
                        gj0.e eVar2 = eVar;
                        boolean zR = mVar2.r(eVar2);
                        Context context2 = context;
                        boolean zR2 = zR | mVar2.r(context2);
                        Object objQ2 = mVar2.q();
                        if (zR2 || objQ2 == c2565a) {
                            objQ2 = new e(eVar2, context2, i17);
                            mVar2.K(objQ2);
                        }
                        r rVarC4 = v.c((e23.l) objQ2, aVar2, false);
                        String str = eVar2.f77506j;
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        g02.c.a(str, rVarC4, 0L, null, 0, false, 1, d92.c.b(j92.f.f97928e, mVar2), 0.0d, mVar2, 1572864, 316);
                        if (eVar2.f77507k == null) {
                            mVar2.C(-737051721);
                            mVar2.f();
                        } else {
                            mVar2.C(-737051720);
                            g02.c.a(eVar2.f77507k, null, 0L, null, 0, false, 1, d92.c.f(j92.f.f97932i, mVar2), 0.0d, mVar2, 1572864, 318);
                            mVar2.f();
                        }
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 806879232 | ((i16 << 6) & 458752), 408);
            f16 = f18;
            f17 = f19;
        } else {
            o0VarE.e();
            f16 = f14;
            f17 = f15;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new af1.m(eVar, rVar, f16, f17, i14);
        }
    }
}
