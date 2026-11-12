package g70;

import am.j;
import b82.y;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.v;
import c2.w;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.i7;
import j92.e;
import l72.y2;
import o4.d0;
import o4.m1;
import o4.s0;
import o70.t;
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
import v.h;
import v62.e1;
import w02.b0;
import w2.a0;
import yz1.z;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static final void a(r rVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-973544921);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            d.f81522a.getClass();
            z0 z0VarD = q.d(d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVar, o0VarE);
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
            b4.c(g.a.f81810g, z0VarD, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            e eVar = j92.b.f97899b;
            float f14 = eVar.f97916a;
            bVar2.getClass();
            l.f(u1.n.e(x2.r(aVar2, f14, eVar.f97920e), j.d(o0VarE), m1.f128891a), o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(rVar, i14, 6);
        }
    }

    public static final void b(r rVar, h61.a aVar, e23.a aVar2, m mVar, int i14) {
        r rVar2;
        int i15;
        e23.a aVar3;
        o0 o0Var;
        long jH;
        z zVar;
        o0 o0VarE = mVar.E(-543263017);
        if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i15 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            aVar3 = aVar2;
            i15 |= o0VarE.r(aVar3) ? 256 : 128;
        } else {
            aVar3 = aVar2;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            z3.e eVarC = f.c(-489708570, new fp0.l(aVar, 5), o0VarE);
            yz1.d dVar = aVar != null ? aVar.f82196a : null;
            t tVar = t.f130069l;
            String strD = tVar.d(a0.s(o0VarE), null);
            u4.d dVarB = t.b(tVar);
            d0 d0VarE = tVar.e(null, o0VarE, 1);
            if (d0VarE == null) {
                o0VarE.C(1910315518);
                jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
            } else {
                o0VarE.C(1910313410);
                o0VarE.g0(false);
                jH = d0VarE.f128833a;
            }
            d0 d0VarA = d0.a(jH);
            if (aVar == null) {
                zVar = z.EMPTY;
            } else {
                zVar = (aVar.f82197b == null && aVar.f82198c == null && aVar.f82199d == null) ? z.EMPTY : z.VALID_DATA;
            }
            o0Var = o0VarE;
            e23.a aVar4 = aVar3;
            yz1.y.c(rVar2, dVar, strD, null, dVarB, d0VarA, 0.0f, 0, null, 0.0f, null, null, null, null, eVarC, aVar4, zVar, gl1.y.Q(o0VarE, R.string.lbl_cycling_ability_start_tracking_activities), null, null, o0Var, i15 & 14, ((i15 << 9) & 458752) | 24576, 802760);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.a0(rVar, aVar, aVar2, i14, 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    public static final void c(final int i14, final Integer num, final long j8, m mVar, int i15) {
        o0 o0Var;
        String strValueOf;
        long jG;
        o0 o0VarE = mVar.E(-1072602970);
        int i16 = i15 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.B(num) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            if (num != null) {
                o0VarE.C(641742317);
                strValueOf = i14 + ", " + gl1.y.Q(o0VarE, R.string.lbl_course_demands) + ": " + num;
                o0VarE.g0(false);
            } else {
                o0VarE.C(641825180);
                o0VarE.g0(false);
                strValueOf = String.valueOf(i14);
            }
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, d.a.f81533k, o0VarE, 0);
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
            b4.c(g.a.f81810g, s2VarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            r rVarA = u2Var.a(aVar, 1.0f, true);
            boolean zB = o0VarE.B(strValueOf);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new fp0.c(strValueOf, 29);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new fp0.c(strValueOf, 29);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            v.a(p5.v.b(rVarA, (e23.l) objQ), d.a.f81527e, false, f.c(-678290976, new e23.q() { // from class: g70.b
                /* JADX WARN: Code duplicated, block: B:21:0x0095  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    w wVar = (w) obj;
                    m mVar2 = (m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    wVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar2.B(wVar) ? 4 : 2;
                    }
                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                        x1 x1Var2 = n.f135158a;
                        y2 y2Var = y2.f111386a;
                        r.a aVar3 = r.S;
                        r rVarF2 = x2.f(aVar3, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        e eVar = j92.b.f97899b;
                        y2Var.a(i14 / 100.0f, 0.0f, 0, 0, 116, j8, 0L, l.z(rVarF2, eVar.f97917b, eVar.f97918c), mVar2);
                        Integer num2 = num;
                        if (num2 != null) {
                            mVar2.C(854999039);
                            float fG = (b0.g(wVar.j(), mVar2) * num2.intValue()) / 100.0f;
                            boolean zI = mVar2.i(fG);
                            Object objQ2 = mVar2.q();
                            if (zI) {
                                objQ2 = new a81.d(fG, 3);
                                mVar2.K(objQ2);
                            } else {
                                m.f135153a.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    objQ2 = new a81.d(fG, 3);
                                    mVar2.K(objQ2);
                                }
                            }
                            c.a(s0.a(aVar3, (e23.l) objQ2), mVar2, 0);
                            mVar2.f();
                        } else {
                            mVar2.C(855186434);
                            mVar2.f();
                        }
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0Var, 3120, 4);
            if (num != null) {
                o0Var.C(1705946474);
                if (i14 < num.intValue() || num.intValue() == 0) {
                    o0Var.C(747770354);
                    d92.b.f58623a.getClass();
                    jG = d92.b.a(o0Var).c().g();
                } else {
                    o0Var.C(747769201);
                    d92.b.f58623a.getClass();
                    jG = d92.b.a(o0Var).f().e();
                }
                o0Var.g0(false);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                r rVarC2 = l.C(aVar, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14);
                bVar2.getClass();
                r rVarC3 = u2Var.c(x2.q(rVarC2, j92.b.f97901d.f97903b), d.a.f81534l);
                s62.a.f157643a.getClass();
                i7.b(e1.a(t62.b.f162798a), null, rVarC3, jG, o0Var, 48, 0);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(1706421208);
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aq.x2(i14, num, j8, i15);
        }
    }
}
