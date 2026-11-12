package m30;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import h5.e0;
import i3.d7;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:53:0x0136  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e0  */
    public static final void a(h4.r rVar, n30.d dVar, final e23.l lVar, p3.m mVar, int i14) {
        long j8;
        long jD;
        final int i15;
        boolean z14;
        long j14;
        long jD2;
        boolean z15;
        final n30.d dVar2 = dVar;
        boolean z16 = dVar2.f123445b;
        boolean z17 = dVar2.f123444a;
        lVar.getClass();
        o0 o0VarE = mVar.E(819369413);
        int i16 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(dVar2) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            h4.r rVarY = c2.l.y(aVar2, f14);
            k2.h hVar = k2.i.f102406a;
            if (z17) {
                j8 = zl.a.b(o0VarE, -811469012, o0VarE).f63508c;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-811467897);
                o0VarE.g0(false);
                gl.c.f77766a.getClass();
                j8 = gl.c.f77767b.f77773c;
            }
            if (z17) {
                jD = zl.a.b(o0VarE, -811465332, o0VarE).f63509d;
            } else {
                o0VarE.C(-811464278);
                jD = d92.b.a(o0VarE).f().d();
            }
            o0VarE.g0(false);
            int i17 = i16 & 112;
            int i18 = i16 & 896;
            boolean z18 = (i17 == 32) | (i18 == 256);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z18) {
                i15 = 0;
                objQ = new e23.a() { // from class: m30.f
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                if (dVar2.f123444a) {
                                    lVar.invoke(n30.a.s.f123381a);
                                }
                                break;
                            default:
                                if (dVar2.f123445b) {
                                    lVar.invoke(n30.a.i.f123356a);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    i15 = 0;
                    objQ = new e23.a() { // from class: m30.f
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    if (dVar2.f123444a) {
                                        lVar.invoke(n30.a.s.f123381a);
                                    }
                                    break;
                                default:
                                    if (dVar2.f123445b) {
                                        lVar.invoke(n30.a.i.f123356a);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                } else {
                    i15 = 0;
                }
            }
            i.f116348a.getClass();
            d7.d((e23.a) objQ, rVarY, hVar, j8, jD, null, i.f116349b, o0VarE, 12582912, 96);
            bVar2.getClass();
            c2.l.f(x2.u(aVar2, f15), o0VarE);
            bVar2.getClass();
            h4.r rVarY2 = c2.l.y(aVar2, f15);
            if (z16) {
                j14 = zl.a.b(o0VarE, -811442708, o0VarE).f63508c;
                z14 = false;
                o0VarE.g0(false);
            } else {
                z14 = false;
                o0VarE.C(-811441593);
                o0VarE.g0(false);
                gl.c.f77766a.getClass();
                j14 = gl.c.f77767b.f77773c;
            }
            if (z16) {
                jD2 = zl.a.b(o0VarE, -811438868, o0VarE).f63509d;
            } else {
                o0VarE.C(-811437814);
                jD2 = d92.b.a(o0VarE).f().d();
            }
            o0VarE.g0(z14);
            boolean z19 = i17 == 32 ? true : z14;
            if (i18 == 256) {
                z14 = true;
            }
            boolean z24 = z19 | z14;
            Object objQ2 = o0VarE.q();
            if (z24) {
                dVar2 = dVar;
                z15 = true;
                final char c14 = 1 == true ? 1 : 0;
                objQ2 = new e23.a() { // from class: m30.f
                    @Override // e23.a
                    public final Object invoke() {
                        switch (c14) {
                            case 0:
                                if (dVar2.f123444a) {
                                    lVar.invoke(n30.a.s.f123381a);
                                }
                                break;
                            default:
                                if (dVar2.f123445b) {
                                    lVar.invoke(n30.a.i.f123356a);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    dVar2 = dVar;
                    z15 = true;
                    final int c15 = 1 == true ? 1 : 0;
                    objQ2 = new e23.a() { // from class: m30.f
                        @Override // e23.a
                        public final Object invoke() {
                            switch (c15) {
                                case 0:
                                    if (dVar2.f123444a) {
                                        lVar.invoke(n30.a.s.f123381a);
                                    }
                                    break;
                                default:
                                    if (dVar2.f123445b) {
                                        lVar.invoke(n30.a.i.f123356a);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                } else {
                    dVar2 = dVar;
                    z15 = true;
                }
            }
            d7.d((e23.a) objQ2, rVarY2, hVar, j14, jD2, null, i.f116350c, o0VarE, 12582912, 96);
            o0VarE.g0(z15);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a(rVar, (Object) dVar2, (Object) lVar, i14, 11);
        }
    }
}
