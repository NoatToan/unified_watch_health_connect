package kc1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.q;
import c2.u;
import c2.x2;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import f02.w;
import f5.z0;
import f72.na;
import fc1.g;
import g8.i;
import gl.c;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import j21.p;
import java.util.ArrayList;
import java.util.Iterator;
import m92.h0;
import o4.d0;
import o70.t;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
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
import yz1.d;
import yz1.z;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    public static final void a(r rVar, g gVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(-847668553);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(gVar) : o0VarE.r(gVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarE, R.string.pulse_ox_lbl_acclimation);
            c.f77766a.getClass();
            long jG = c.a(o0VarE).g();
            String strQ2 = y.Q(o0VarE, R.string.no_data_label);
            o0VarE.C(1434319994);
            Integer num = gVar.f70409b;
            String str = gVar.f70410c;
            String strP = (num == null || str == null) ? null : oi0.c.P(x.k(y.P(R.string.lbl_value_percent, new Object[]{Integer.valueOf(num.intValue())}, o0VarE), j0.u(DateTime.parse(str).getMinuteOfDay())));
            o0VarE.g0(false);
            if (strP != null) {
                strQ2 = strP;
            }
            d dVar = gVar.f70408a;
            t tVar = t.X;
            u4.d dVarB = t.b(tVar);
            d0 d0VarE = tVar.e(null, o0VarE, 1);
            z zVarX = zf.b.x(gVar);
            String strQ3 = y.Q(o0VarE, R.string.pulseox_card_no_data_state_message);
            e eVarC = f.c(-1239766765, new k41.e(7, strQ2, (Object) gVar), o0VarE);
            e eVarC2 = f.c(2018190130, new d81.z(gVar, jG, 3), o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new ho0.a(context, 16);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ho0.a(context, 16);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            yz1.y.d(rVar, dVar, strQ, null, dVarB, d0VarE, 0.0f, 0, null, 0.0f, null, null, true, 0L, null, eVarC, eVarC2, null, null, (e23.a) objQ, zVarX, strQ3, null, null, o0Var, i15 & 14, 1769856, 0, 13004744);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(rVar, gVar, i14, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    public static final void b(r rVar, fc1.a aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(-1504514259);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarE, R.string.device_settings_pulse_ox);
            String strQ2 = y.Q(o0VarE, R.string.no_data_label);
            o0VarE.C(1565786128);
            Integer num = aVar != null ? aVar.f70394b : null;
            String str = aVar != null ? aVar.f70395c : null;
            String strP = (num == null || str == null) ? null : oi0.c.P(x.k(y.P(R.string.lbl_value_percent, new Object[]{Integer.valueOf(num.intValue())}, o0VarE), j0.u(DateTime.parse(str).getMinuteOfDay())));
            o0VarE.g0(false);
            if (strP != null) {
                strQ2 = strP;
            }
            d dVar = aVar != null ? aVar.f70393a : null;
            s62.a.f157643a.getClass();
            u4.d dVarA = na.a(t62.c.f162799a);
            d0 d0VarE = t.X.e(null, o0VarE, 1);
            z zVarX = zf.b.x(aVar);
            String strQ3 = y.Q(o0VarE, R.string.pulseox_card_no_data_state_message);
            e eVarC = f.c(-839119223, new k41.e(6, strQ2, (Object) aVar), o0VarE);
            e eVarC2 = f.c(310713064, new ik1.c(aVar, 24), o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new ho0.a(context, 15);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ho0.a(context, 15);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            yz1.y.d(rVar, dVar, strQ, null, dVarA, d0VarE, 0.0f, 0, null, 0.0f, null, null, true, 0L, null, eVarC, eVarC2, null, null, (e23.a) objQ, zVarX, strQ3, null, null, o0Var, i15 & 14, 1769856, 0, 13004744);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(rVar, aVar, i14, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    public static final void c(Integer num, Float f14, String str, String str2, m mVar, int i14) {
        boolean z14;
        String strP;
        boolean z15;
        o0 o0VarE = mVar.E(1344775054);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(num) ? 4 : 2) | (o0VarE.B(f14) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarD = x2.d(aVar, 1.0f);
            boolean z16 = (i15 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new jl0.e(str2, 9);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new jl0.e(str2, 9);
                    o0VarE.K(objQ);
                }
            }
            r rVarC = v.c((l) objQ, rVarD, false);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarC, o0VarE);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            if (num == null) {
                o0VarE.C(-115255797);
                z14 = false;
                o0VarE.g0(false);
                strP = null;
            } else {
                z14 = false;
                o0VarE.C(-115255796);
                strP = y.P(R.string.lbl_value_percent, new Object[]{num}, o0VarE);
                o0VarE.g0(false);
            }
            if (strP == null) {
                strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1112093511, R.string.no_value, o0VarE, z14);
            } else {
                o0VarE.C(-1112097045);
                o0VarE.g0(z14);
            }
            z72.k.a(x2.h(aVar, yz1.y.k(o0VarE)), i.F(num, o0VarE), f14, null, null, yz1.y.g(o0VarE), 3.0f, false, false, f.c(-2029642332, new p(strP, 2), o0VarE), o0VarE, ((i15 << 3) & 896) | 806879232, 408);
            if (str == null) {
                o0VarE.C(-114437862);
                o0VarE.g0(false);
                z15 = true;
            } else {
                o0VarE.C(-114437861);
                int minuteOfDay = DateTime.parse(str).getMinuteOfDay() / 60;
                DateTime dateTimeWithTime = DateTime.now().withTime(minuteOfDay, DateTime.parse(str).getMinuteOfDay() - (minuteOfDay * 60), 0, 0);
                j0.f23099a.getClass();
                String strC = dateTimeWithTime == null ? null : j0.C(dateTimeWithTime.getHourOfDay(), dateTimeWithTime.getMinuteOfHour());
                if (strC == null) {
                    o0VarE.C(193944710);
                    o0VarE.g0(false);
                    z15 = true;
                } else {
                    o0VarE.C(193944711);
                    r rVarA = b0Var.a(x2.f(aVar, 1.0f), 1.0f, true);
                    z0 z0VarD = q.d(h4.d.a.f81530h, false);
                    int iHashCode2 = Long.hashCode(o0VarE.U);
                    i2 i2VarA1 = o0VarE.a0();
                    r rVarC3 = k.c(rVarA, o0VarE);
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
                    b4.c(eVar, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC3, o0VarE);
                    u uVar = u.f22885a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    z15 = true;
                    mh.c(strC, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                    Unit unit = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                Unit unit2 = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            o0VarE.g0(z15);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c(num, f14, str, str2, i14);
        }
    }

    public static final i53.c d(ArrayList arrayList, m mVar) {
        long jL;
        x1 x1Var = n.f135158a;
        mVar.C(-1591222043);
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h0.e.a aVar = (h0.e.a) it.next();
            float f14 = aVar.f117347b;
            if (f14 >= 90.0f) {
                mVar.C(108996510);
                w.f67751a.getClass();
                x1 x1Var2 = n.f135158a;
                c.f77766a.getClass();
                jL = c.a(mVar).d();
                mVar.f();
            } else if (f14 >= 80.0f) {
                mVar.C(108998816);
                w.f67751a.getClass();
                x1 x1Var3 = n.f135158a;
                c.f77766a.getClass();
                jL = c.a(mVar).i();
                mVar.f();
            } else if (f14 >= 70.0f) {
                mVar.C(109001179);
                w.f67751a.getClass();
                x1 x1Var4 = n.f135158a;
                c.f77766a.getClass();
                jL = c.a(mVar).h();
                mVar.f();
            } else {
                mVar.C(109002943);
                w.f67751a.getClass();
                x1 x1Var5 = n.f135158a;
                c.f77766a.getClass();
                jL = c.a(mVar).l();
                mVar.f();
            }
            arrayList2.add(new h0.e.c(aVar, jL, null, 4, null));
        }
        mVar.f();
        i53.c cVarE = i53.a.e(arrayList2);
        x1 x1Var6 = n.f135158a;
        return cVarE;
    }
}
