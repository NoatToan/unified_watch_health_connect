package z32;

import c2.b0;
import c2.j;
import c2.q;
import c2.t;
import c2.u;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import java.util.ArrayList;
import o4.d0;
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
import s5.x0;
import v.h;
import z72.l;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final void a(final d42.a aVar, float f14, float f15, m mVar, int i14) {
        int i15;
        float f16;
        float f17;
        final float f18;
        float f19;
        o0 o0VarE = mVar.E(457403129);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        int i16 = i15 | 432;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            v32.a aVar2 = v32.a.f175413a;
            aVar2.getClass();
            float f22 = v32.a.f175414b;
            aVar2.getClass();
            final float f24 = v32.a.f175415c;
            x1 x1Var = n.f135158a;
            if (aVar == null) {
                o0VarE.C(-1434356712);
                r rVarH = x2.h(r.S, f22);
                h4.d.f81522a.getClass();
                z0 z0VarD = q.d(h4.d.a.f81528f, false);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = k.c(rVarH, o0VarE);
                g.V.getClass();
                e0.a aVar3 = g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(g.a.f81810g, z0VarD, o0VarE);
                b4.c(g.a.f81809f, i2VarA0, o0VarE);
                g.a.b bVar = g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(g.a.f81807d, rVarC, o0VarE);
                u uVar = u.f22885a;
                String strQ = y.Q(o0VarE, R.string.msg_no_data_available);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                d6.h.f57752b.getClass();
                mh.c(strQ, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130046);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(false);
                f19 = f24;
                f18 = f22;
            } else {
                f18 = f22;
                o0VarE.C(-1433949155);
                o0VarE.C(1477764325);
                w13.c cVar = q71.a.f143226i;
                ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
                p13.c.b bVar2 = new p13.c.b();
                while (bVar2.hasNext()) {
                    q71.a aVar4 = (q71.a) bVar2.next();
                    arrayList.add(new l(aVar4.f143228b, aVar4.b(o0VarE), null));
                }
                o0VarE.g0(false);
                z72.k.a(x2.h(r.S, f18), i53.a.e(arrayList), Float.valueOf(aVar.f57472b), d0.a(aVar.f57473c.b(o0VarE)), null, f24, 3.0f, false, false, z3.f.c(960532385, new e23.q() { // from class: z32.a
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        t tVar = (t) obj;
                        m mVar2 = (m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        tVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar2.B(tVar) ? 4 : 2;
                        }
                        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                            x1 x1Var2 = n.f135158a;
                            r rVarQ = x2.q(r.S, f18);
                            float f25 = f24 * 1.5f;
                            g6.f.a aVar5 = g6.f.f75994b;
                            r rVarA = c2.l.A(rVarQ, f25, 0.0f, 2);
                            h4.d.f81522a.getClass();
                            r rVarC2 = tVar.c(rVarA, h4.d.a.f81528f);
                            Object objQ = mVar2.q();
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new yq.d(22);
                                mVar2.K(objQ);
                            }
                            r rVarC3 = v.c((e23.l) objQ, rVarC2, true);
                            h4.g.a aVar6 = h4.d.a.f81537o;
                            j.f22691a.getClass();
                            z zVarA = c2.y.a(j.f22696f, aVar6, mVar2, 54);
                            int iHashCode2 = Long.hashCode(mVar2.getU());
                            i2 i2VarX = mVar2.x();
                            r rVarC4 = k.c(rVarC3, mVar2);
                            g.V.getClass();
                            e0.a aVar7 = g.a.f81805b;
                            if (mVar2.F() == null) {
                                p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar7);
                            } else {
                                mVar2.c();
                            }
                            b4.c(g.a.f81810g, zVarA, mVar2);
                            b4.c(g.a.f81809f, i2VarX, mVar2);
                            g.a.b bVar3 = g.a.f81813j;
                            if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                                h.z(iHashCode2, mVar2, iHashCode2, bVar3);
                            }
                            b4.c(g.a.f81807d, rVarC4, mVar2);
                            b0 b0Var = b0.f22601a;
                            d42.a aVar8 = aVar;
                            String str = aVar8.f57471a;
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            g02.c.a(str, null, 0L, null, 0, false, 1, d92.c.b(j92.f.f97928e, mVar2), 0.0d, mVar2, 1572864, 318);
                            g02.c.a(y.Q(mVar2, aVar8.f57473c.f143227a), null, 0L, null, 0, false, 1, d92.c.f(j92.f.f97932i, mVar2), 0.0d, mVar2, 1572864, 318);
                            mVar2.y();
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 806879232 | ((i16 << 9) & 458752), 400);
                f19 = f24;
                o0VarE.g0(false);
            }
            x1 x1Var2 = n.f135158a;
            f17 = f19;
            f16 = f18;
        } else {
            o0VarE.e();
            f16 = f14;
            f17 = f15;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y01.g(aVar, f16, f17, i14, 1);
        }
    }
}
