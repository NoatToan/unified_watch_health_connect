package yr;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mc;
import i3.mh;
import java.util.List;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 {
    public static final void a(String str, h4.r rVar, int i14, h4.d.b bVar, p3.m mVar, int i15) {
        h4.r rVar2;
        p3.o0 o0Var;
        h4.d.b bVar2;
        p3.o0 o0VarE = mVar.E(-1354805136);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i15 | (o0VarE.B(str) ? 4 : 2) | 48 | (o0VarE.k(i14) ? 256 : 128) | 3072;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            h4.r.a aVar = h4.r.S;
            h4.d.a aVar2 = h4.d.f81522a;
            aVar2.getClass();
            h4.g.a aVar3 = h4.d.a.f81536n;
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar4 = g6.f.f75994b;
            float f14 = 8;
            h4.r rVarThen = c2.l.C(x2.f(aVar, 1.0f), 16, f14, 0.0f, 0.0f, 12).then(aVar);
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            aVar2.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            b(i14, o0VarE, (i16 >> 6) & 14);
            float f15 = 0;
            h4.r rVarB = c2.l.B(aVar, f14, f15, f15, f15);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(str, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0Var, (i16 & 14) | 48, 0, 131068);
            o0Var.g0(true);
            o0Var.g0(true);
            rVar2 = aVar;
            bVar2 = aVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            o0Var = o0VarE;
            bVar2 = bVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w52.k0(str, rVar2, i14, bVar2, i15);
        }
    }

    public static final void b(int i14, p3.m mVar, int i15) {
        int i16;
        p3.o0 o0VarE = mVar.E(1821698577);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            c2.q.a(u1.n.e(l4.k.b(x2.q(h4.r.S, 16), k2.i.f102406a), n5.a.a(o0VarE, i14), m1.f128891a), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a71.l(i14, i15, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    public static final void c(mc mcVar, nr.y yVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        String string;
        yVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1617141114);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(mcVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(yVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            l72.w wVar = l72.w.f111301a;
            if (yVar instanceof nr.y.c) {
                string = context.getString(R.string.this_activitys_benefit);
                string.getClass();
            } else if (yVar instanceof nr.y.b) {
                string = context.getString(R.string.this_activitys_benefit);
                string.getClass();
            } else if (!(yVar instanceof nr.y.a)) {
                lc.u0.r();
                return;
            } else {
                string = context.getString(R.string.title_this_activitys_score);
                string.getClass();
            }
            z3.e eVarC = z3.f.c(-136012763, new w51.n0(aVar, 21), o0VarE);
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new ya0.l(aVar, 11);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ya0.l(aVar, 11);
                    o0VarE.K(objQ);
                }
            }
            wVar.f(string, null, null, eVarC, (e23.a) objQ, mcVar, true, null, z3.f.c(103975119, new xn.t(yVar, 12), o0VarE), o0VarE, ((i15 << 15) & 458752) | 806882304, 390);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w52.k0(mcVar, yVar, aVar, i14, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    public static final void d(nr.y.a aVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(939459831);
        int i15 = (o0VarE.B(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            l22.a aVar2 = new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            boolean zR = o0VarE.r(aVar2);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new xn.r(aVar2, 27);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new xn.r(aVar2, 27);
                    o0VarE.K(objQ);
                }
            }
            o13.t tVarB = o13.m.b((e23.a) objQ);
            Integer num = aVar.f127588a;
            if (num == null) {
                o0VarE.C(1441268531);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1441268532);
                int iIntValue = num.intValue();
                h4.r.a aVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), o0VarE);
                h82.r.f82497a.j(z3.f.c(-1547785030, new w52.n(iIntValue, tVarB), o0VarE), o0VarE, 54);
                o0VarE.g0(false);
            }
            h82.r rVar = h82.r.f82497a;
            rVar.D(R.string.lbl_more_about_execution_score, o0VarE, 48);
            rVar.l(R.string.workout_execution_score_help_intro_v2, 384, 2, null, o0VarE);
            rVar.o(R.string.workout_execution_score_help_intro_msg1, 384, 2, null, o0VarE);
            rVar.o(R.string.workout_execution_score_help_intro_msg2, 384, 2, null, o0VarE);
            gl.c.f77766a.getClass();
            final long jH = gl.c.a(o0VarE).h();
            final long jD = gl.c.a(o0VarE).d();
            final long jL = gl.c.a(o0VarE).l();
            rVar.j(z3.f.c(-311658832, new e23.p() { // from class: yr.b0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        h82.r rVar2 = h82.r.f82497a;
                        rVar2.t(R.string.workout_execution_score_help_subtitle1, mVar2, 48);
                        rVar2.o(R.string.workout_execution_score_help_msg1, 384, 2, null, mVar2);
                        rVar2.c(mVar2, 6);
                        c0.f(0, jD, gl1.y.Q(mVar2, R.string.workout_execution_score_good), gl1.y.Q(mVar2, R.string.workout_execution_score_interval_good), mVar2);
                        c0.f(0, jH, gl1.y.Q(mVar2, R.string.workout_execution_score_average), gl1.y.Q(mVar2, R.string.workout_execution_score_interval_average), mVar2);
                        c0.f(0, jL, gl1.y.Q(mVar2, R.string.workout_execution_score_low), gl1.y.Q(mVar2, R.string.workout_execution_score_interval_low), mVar2);
                        rVar2.o(R.string.workout_execution_score_help_msg2, 384, 2, null, mVar2);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 54);
            i.f198868a.getClass();
            rVar.j(i.f198870c, o0VarE, 54);
            rVar.c(o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(aVar, i14, 5);
        }
    }

    public static final void e(nr.y.b bVar, p3.m mVar, int i14) {
        boolean z14;
        p3.o0 o0VarE = mVar.E(-730089279);
        int i15 = i14 | (o0VarE.B(bVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Integer num = bVar.f127589a;
            if (num == null) {
                o0VarE.C(-375191219);
                o0VarE.g0(false);
                z14 = false;
            } else {
                o0VarE.C(-375191218);
                int iIntValue = num.intValue();
                h4.d.f81522a.getClass();
                h4.g.b bVar2 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                c2.j.c cVar = c2.j.f22696f;
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarA = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
                bVar3.getClass();
                h4.r rVarC = c2.l.C(rVarA, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                s2 s2VarA = q2.a(cVar, bVar2, o0VarE, 54);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar4 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                Integer num2 = bVar.f127591c;
                if (num2 == null) {
                    o0VarE.C(1268268957);
                } else {
                    o0VarE.C(1268268958);
                    b(num2.intValue(), o0VarE, 0);
                }
                o0VarE.g0(false);
                String strQ = gl1.y.Q(o0VarE, iIntValue);
                bVar3.getClass();
                h4.r rVarC3 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                d92.b.f58624b.getClass();
                z14 = false;
                mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
            Integer num3 = bVar.f127590b;
            if (num3 == null) {
                o0VarE.C(-374545861);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-374545860);
                h82.r.f82497a.o(num3.intValue(), 384, 2, null, o0VarE);
                h4.r.a aVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), o0VarE);
                o0VarE.g0(z14);
            }
            h82.r rVar = h82.r.f82497a;
            rVar.D(R.string.title_more_about_primary_benefit, o0VarE, 48);
            rVar.o(R.string.activities_primary_benefit_desc_1, 384, 2, null, o0VarE);
            g(R.string.activity_anaerobic_label, p13.x.k(cs.a.SPRINT, cs.a.ANAEROBIC), o0VarE, 48);
            g(R.string.lbl_high_aer_lf, p13.x.k(cs.a.VO2MAX, cs.a.THRESHOLD, cs.a.TEMPO), o0VarE, 48);
            g(R.string.activities_low_aerobic_title, p13.x.k(cs.a.BASE, cs.a.RECOVERY), o0VarE, 48);
            rVar.c(o0VarE, 6);
            rVar.o(R.string.activities_primary_benefit_desc_2, 384, 2, null, o0VarE);
            rVar.c(o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(bVar, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00da  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x0126  */
    /* JADX WARN: Code duplicated, block: B:46:0x012d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0131  */
    /* JADX WARN: Code duplicated, block: B:52:0x014c  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c3  */
    public static final void f(int i14, long j8, String str, String str2, p3.m mVar) {
        p3.o0 o0Var;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        boolean z14;
        Object objQ;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        p3.o0 o0VarE = mVar.E(740721211);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97917b;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, f14);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                g6.f.a aVar3 = g6.f.f75994b;
                h4.r rVarQ = x2.q(aVar, 16);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ = o0VarE.q();
                if (z14) {
                    objQ = new j82.d(j8, 28);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new j82.d(j8, 28);
                        o0VarE.K(objQ);
                    }
                }
                u1.n.b(rVarQ, (e23.l) objQ, o0VarE, 6);
                bVar.getClass();
                h4.r rVarC3 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC3, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                s5.x0 x0Var = j92.f.f97932i;
                s5.x0 x0VarB = d92.c.b(x0Var, o0VarE);
                w5.f0.f182097b.getClass();
                mh.c(str, null, 0L, null, 0L, w5.f0.f182105j, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, (i15 & 14) | 1572864, 0, 131006);
                fVar2.getClass();
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131070);
                o0Var = o0VarE;
                o0Var.g0(true);
                o0Var.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var2 = u2.f22900a;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarQ2 = x2.q(aVar, 16);
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            objQ = o0VarE.q();
            if (z14) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j82.d(j8, 28);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new j82.d(j8, 28);
                o0VarE.K(objQ);
            }
            u1.n.b(rVarQ2, (e23.l) objQ, o0VarE, 6);
            bVar.getClass();
            h4.r rVarC4 = c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC4, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            s5.x0 x0Var2 = j92.f.f97932i;
            s5.x0 x0VarB2 = d92.c.b(x0Var2, o0VarE);
            w5.f0.f182097b.getClass();
            mh.c(str, null, 0L, null, 0L, w5.f0.f182105j, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, (i15 & 14) | 1572864, 0, 131006);
            fVar3.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h81.d(i14, 2, j8, str, str2);
        }
    }

    public static final void g(int i14, List<? extends cs.a> list, p3.m mVar, int i15) {
        list.getClass();
        p3.o0 o0VarE = mVar.E(-1031886119);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h82.r.f82497a.t(i14, o0VarE, (i16 & 14) | 48);
            for (cs.a aVar : list) {
                a(gl1.y.Q(o0VarE, aVar.f55443a), null, aVar.f55445c, null, o0VarE, 0);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.a(i14, list, i15);
        }
    }

    public static final void h(nr.y.c cVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1674773705);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Integer num = cVar.f127592a;
            if (num == null) {
                o0VarE.C(1451745593);
            } else {
                o0VarE.C(1451745594);
                h82.r.f82497a.D(num.intValue(), o0VarE, 48);
            }
            o0VarE.g0(false);
            Integer num2 = cVar.f127593b;
            if (num2 == null) {
                o0VarE.C(1451804741);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1451804742);
                h82.r.f82497a.o(num2.intValue(), 384, 2, null, o0VarE);
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), o0VarE);
                o0VarE.g0(false);
            }
            h82.r rVar = h82.r.f82497a;
            rVar.D(R.string.title_more_about_workout_benefit, o0VarE, 48);
            i.f198868a.getClass();
            rVar.j(i.f198869b, o0VarE, 54);
            rVar.c(o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(cVar, i14, 6);
        }
    }
}
