package mc1;

import am.i1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import e23.q;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import o4.m1;
import org.joda.time.DateTime;
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
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class i {
    public static final void a(final DateTime dateTime, final double d14, final double d15, final l<? super DateTime, Unit> lVar, m mVar, final int i14) {
        int i15;
        final l<? super DateTime, Unit> lVar2;
        o0 o0Var;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar;
        lVar.getClass();
        o0 o0VarE = mVar.E(988823742);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(dateTime) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.m(d14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.m(d15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            lVar2 = lVar;
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        } else {
            lVar2 = lVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            if (dateTime == null || (d14 <= 0.0d && d15 <= 0.0d)) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new p() { // from class: mc1.g
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i16) {
                            case 0:
                                ((Integer) obj2).intValue();
                                i.a(dateTime, d14, d15, lVar, (m) obj, p0.t(i14 | 1));
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                i.a(dateTime, d14, d15, lVar, (m) obj, p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = Float.valueOf(c22.b.a(context));
                    o0VarE.K(objQ);
                }
                float fFloatValue = ((Number) objQ).floatValue();
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = Boolean.valueOf(fFloatValue >= 1.5f);
                    o0VarE.K(objQ2);
                }
                final boolean zBooleanValue = ((Boolean) objQ2).booleanValue();
                String strQ = y.Q(o0VarE, R.string.lbl_pulse_ox_during_sleep);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                r.a aVar = r.S;
                r rVarF = x2.f(aVar, 1.0f);
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97918c;
                float f15 = eVar.f97920e;
                bVar.getClass();
                float f16 = eVar.f97918c;
                bVar.getClass();
                float f17 = eVar.f97922g;
                bVar.getClass();
                mh.c(strQ, c2.l.B(rVarF, f14, f17, f16, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                r rVarE = u1.n.e(x2.x(x2.f(aVar, 1.0f), null, 3), d92.b.a(o0Var).c().b(), m1.f128891a);
                bVar.getClass();
                b(c2.l.y(rVarE, f15), zBooleanValue, z3.f.c(-990733306, new q() { // from class: mc1.h
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        r rVar = (r) obj;
                        m mVar2 = (m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        rVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar2.B(rVar) ? 4 : 2;
                        }
                        int i17 = iIntValue;
                        if (mVar2.n(i17 & 1, (i17 & 19) != 18)) {
                            x1 x1Var2 = n.f135158a;
                            double d16 = d14;
                            double d17 = d15;
                            boolean z14 = d16 <= 0.0d || d17 <= 0.0d;
                            DateTime dateTime2 = dateTime;
                            boolean z15 = zBooleanValue;
                            l lVar3 = lVar2;
                            if (d16 > 0.0d) {
                                mVar2.C(79462665);
                                ic1.b.a(rVar, dateTime2, Double.valueOf(d16), z14, z15, lVar3, mVar2, (i17 & 14) | 24576);
                                mVar2.f();
                            } else {
                                mVar2.C(79757692);
                                mVar2.f();
                            }
                            if (d17 > 0.0d) {
                                mVar2.C(79807509);
                                DateTime dateTimePlusDays = dateTime2.plusDays(1);
                                dateTimePlusDays.getClass();
                                ic1.b.a(rVar, dateTimePlusDays, Double.valueOf(d17), z14, z15, lVar3, mVar2, (i17 & 14) | 24576);
                                mVar2.f();
                            } else {
                                mVar2.C(80121756);
                                mVar2.f();
                            }
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0Var), o0Var, 432);
            }
            p2VarI0.f135219d = pVar;
        }
        o0Var = o0VarE;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            pVar = new p() { // from class: mc1.g
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i17) {
                        case 0:
                            ((Integer) obj2).intValue();
                            i.a(dateTime, d14, d15, lVar, (m) obj, p0.t(i14 | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            i.a(dateTime, d14, d15, lVar, (m) obj, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void b(r rVar, boolean z14, z3.e eVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1025182298);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            if (z14) {
                o0VarE.C(306754288);
                c2.j jVar = c2.j.f22691a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f14 = j92.b.f97899b.f97918c;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f14);
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                e0.a aVar = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                eVar.invoke(x2.f(r.S, 1.0f), o0VarE, 54);
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                o0VarE.C(306962453);
                c2.j jVar2 = c2.j.f22691a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f15 = j92.b.f97899b.f97918c;
                jVar2.getClass();
                c2.j.i iVarI2 = c2.j.i(f15);
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(iVarI2, h4.d.a.f81533k, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC2 = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                eVar.invoke(u2.f22900a.a(r.S, 1.0f, true), o0VarE, 48);
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(rVar, z14, eVar, i14, 24);
        }
    }
}
