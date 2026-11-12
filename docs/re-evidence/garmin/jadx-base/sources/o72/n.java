package o72;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.messaging.Constants;
import i3.i7;
import i3.mh;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class n {
    public static final void a(p3.m mVar, int i14) {
        char c14;
        p3.o0 o0VarE = mVar.E(-70946219);
        int i15 = 1;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            float f14 = 8;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarA = c2.l.A(aVar, 0.0f, f14, 1);
            h4.r rVarA2 = c2.l.A(aVar, 16, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            b0.f130314a.getClass();
            z3.e eVar = b0.f130315b;
            z3.e eVar2 = b0.f130316c;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new j(6);
                o0VarE.K(objQ);
            }
            l72.l.c(eVar, eVar2, rVarA, null, false, (e23.a) objQ, o0VarE, 197046, 24);
            l72.l.d("Display Stats No Interaction", null, null, rVarA, null, false, null, o0VarE, 3078, 118);
            l72.l.d("Display Stats - Disabled", null, null, rVarA, null, false, null, o0VarE, 199686, 86);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("onClickLabel", "Open Details");
            b92.a aVarB = c0235a.b();
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new j(17);
                o0VarE.K(objQ2);
            }
            e23.a aVar4 = (e23.a) objQ2;
            int i16 = b92.a.f16960b;
            l72.l.e("Display Stats 2", null, "Data", null, null, null, rVarA, aVarB, false, aVar4, o0VarE, 806879622, 314);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new j(18);
                o0VarE.K(objQ3);
            }
            l72.l.e("Display Stats 3", "24 Jan", "Data", null, null, null, rVarA, null, false, (e23.a) objQ3, o0VarE, 806879670, 440);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new j(19);
                o0VarE.K(objQ4);
            }
            l72.l.e("Display Stats 4", "24 Jan", "Data", "1,300 m", null, null, rVarA, null, false, (e23.a) objQ4, o0VarE, 806882742, 432);
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new j(20);
                o0VarE.K(objQ5);
            }
            l72.l.e("Display Stats 5", "24 Jan", "Data", "1,300 m", "Data 2", "1,301 m", rVarA, null, false, (e23.a) objQ5, o0VarE, 807103926, 384);
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new j(7);
                o0VarE.K(objQ6);
            }
            l72.l.e("Display Stats 5 long long", "24 Jan", "Data long long", "1,300 m", "Data 2", "1,301 m", rVarA, null, false, (e23.a) objQ6, o0VarE, 907767222, 128);
            l72.l.d("Display Stats 6", "24 Jan", b0.f130317d, rVarA, null, false, null, o0VarE, 3510, 112);
            l72.l.d("Display Stats 6", "24 Jan", b0.f130318e, rVarA, null, false, null, o0VarE, 200118, 80);
            b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
            LinkedHashMap linkedHashMap = c0235a2.f16962a;
            linkedHashMap.put(Constants.ScionAnalytics.PARAM_LABEL, "Display Stats 7 weeks");
            linkedHashMap.put("label_secondary", "Average Sleep");
            linkedHashMap.put("value", "8 hours 35 minutes");
            linkedHashMap.put("value_secondary", "Average Duration");
            linkedHashMap.put("value_2", "83 breaths per minutes");
            linkedHashMap.put("value_2_secondary", "Average Respiration");
            b92.a aVarB2 = c0235a2.b();
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = new j(8);
                o0VarE.K(objQ7);
            }
            l72.l.e("Display Stats 7w", "Avg Sleep", "8h 35m", "Avg Duration", "83brpm", "Avg Respiration", rVarA, aVarB2, false, (e23.a) objQ7, o0VarE, 807103926, 256);
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = new j(9);
                o0VarE.K(objQ8);
            }
            l72.l.e("Activity History", "Highly Active Last Few Weeks", "High long-term strain", null, null, null, rVarA, null, false, (e23.a) objQ8, o0VarE, 806879670, 440);
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                objQ9 = new j(10);
                o0VarE.K(objQ9);
            }
            l72.l.e("Wednesday", "30 September", "37", "High", "5", "Low", rVarA, null, false, (e23.a) objQ9, o0VarE, 807103926, 384);
            Object objQ10 = o0VarE.q();
            if (objQ10 == c2565a) {
                c14 = 11;
                objQ10 = new j(11);
                o0VarE.K(objQ10);
            } else {
                c14 = 11;
            }
            l72.l.e("Wednesday", null, "13 brpm", "Awake", "5h 14m", "Avg Duration", rVarA, null, false, (e23.a) objQ10, o0VarE, 807103878, 386);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            Set setB = p13.a1.b(new c92.b.a(c92.a.DELETE, "Delete"));
            Object objQ11 = o0VarE.q();
            if (objQ11 == c2565a) {
                objQ11 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ11);
            }
            o53.b0 b0Var2 = (o53.b0) objQ11;
            l72.q2 q2Var = l72.q2.CARD;
            Object objQ12 = o0VarE.q();
            if (objQ12 == c2565a) {
                objQ12 = new j(13);
                o0VarE.K(objQ12);
            }
            l72.l2.a(setB, b0Var2, false, q2Var, (e23.a) objQ12, b0.f130319f, z3.f.c(-2142681469, new ho0.f(context, i15), o0VarE), o0VarE, 1797120, 4);
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            List listK = p13.x.k(b0.f130320g, b0.f130321h, b0.f130322i);
            o0VarE.C(459373409);
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                l72.l.f(z3.f.c(-547034150, new a3.d((e23.p) it.next(), 24), o0VarE), rVarA, false, null, o0VarE, 54, 28);
            }
            o0VarE = o0VarE;
            h4.r rVar = rVarA;
            o0VarE.g0(false);
            b0.f130314a.getClass();
            List listK2 = p13.x.k(b0.f130323j, b0.f130324k, b0.f130325l);
            o0VarE.C(459410927);
            Iterator it3 = listK2.iterator();
            while (it3.hasNext()) {
                h4.r rVar2 = rVar;
                l72.l.f(z3.f.c(636501201, new a3.d((e23.p) it3.next(), 25), o0VarE), rVar2, false, null, o0VarE, 54, 28);
                rVar = rVar2;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(i14, 11);
        }
    }

    public static final void b(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1692452238);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            h4.r rVarE = u1.n.e(aVar, d92.b.a(o0VarE).e().e(), k2.i.f102406a);
            d92.b.f58625c.getClass();
            h4.r rVarQ = c2.x2.q(rVarE, j92.b.f97901d.f97906e);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarQ, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            s62.a.f157643a.getClass();
            u4.d dVarA = u62.a.a(t62.a.f162797a);
            long j8 = d92.b.a(o0VarE).f().f63508c;
            float f14 = 24;
            g6.f.a aVar3 = g6.f.f75994b;
            i7.b(dVarA, null, uVar.c(c2.x2.u(c2.x2.h(aVar, f14), f14), h4.d.a.f81528f), j8, o0VarE, 48, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(i14, 8);
        }
    }

    public static final void c(p3.m mVar, int i14) {
        p3.o0 o0Var;
        h5.e0.a aVar;
        h5.g.a.b bVar;
        p3.o0 o0VarE = mVar.E(-1857841327);
        p3.c<?> cVar = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.d dVar = c2.j.f22693c;
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = c2.x2.f(aVar2, 1.0f);
            c2.s2 s2VarA = c2.q2.a(dVar, bVar2, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u2 u2Var = c2.u2.f22900a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c("Data", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 6, 0, 131070);
            o0Var = o0VarE;
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81529g, false);
            int iHashCode2 = Long.hashCode(o0Var.U);
            p3.i2 i2VarA1 = o0Var.a0();
            h4.r rVarC2 = h4.k.c(aVar2, o0Var);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                aVar = aVar3;
                o0Var.M(aVar);
            } else {
                aVar = aVar3;
                o0Var.c();
            }
            b4.c(eVar, z0VarD, o0Var);
            b4.c(c1623g, i2VarA1, o0Var);
            if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                bVar = bVar3;
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
            } else {
                bVar = bVar3;
            }
            b4.c(fVar, rVarC2, o0Var);
            c2.u uVar = c2.u.f22885a;
            float f14 = 16;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarY = c2.l.y(aVar2, f14);
            f5.z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode3 = Long.hashCode(o0Var.U);
            p3.i2 i2VarA2 = o0Var.a0();
            h4.r rVarC3 = h4.k.c(rVarY, o0Var);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar);
            } else {
                o0Var.c();
            }
            b4.c(eVar, z0VarD2, o0Var);
            b4.c(c1623g, i2VarA2, o0Var);
            if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0Var, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, o0Var);
            c2.q.a(u1.n.e(l4.k.b(c2.x2.q(aVar2, f14), k2.i.f102406a), d92.b.a(o0Var).f().e(), o4.m1.f128891a), o0Var, 0);
            o0Var.g0(true);
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(i14, 10);
        }
    }

    public static final void d(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(812655460);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            wf.f.a aVar = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            aVar.f184930c = "https://s3.amazonaws.com/garmin-connect-test/profile_images/560b194a-9a5d-4441-8c1e-abcb5fdd4a1e-71.png";
            wf.g.a(aVar);
            wf.f fVarA = aVar.a();
            t4.d dVarA = n5.c.a(2131231969, o0VarE, 0);
            t4.d dVarA2 = n5.c.a(2131231969, o0VarE, 0);
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            jf.r.b(fVarA, "Image Content Description", c2.x2.q(aVar2, j92.b.f97901d.f97906e), dVarA, dVarA2, null, null, null, null, null, null, null, o0VarE, 48, 0, 32736);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(i14, 5);
        }
    }

    public static final void e(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(949126185);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.f0.a aVar = l72.f0.a.f111000a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new j(16);
                o0VarE.K(objQ);
            }
            aVar.f("Action", null, false, (e23.a) objQ, o0VarE, 3078, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(i14, 9);
        }
    }

    public static final void f(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(118325528);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.f0.a aVar = l72.f0.a.f111000a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new j(14);
                o0VarE.K(objQ);
            }
            aVar.j("Action", null, false, (e23.a) objQ, o0VarE, 3078, 6);
            g6.f.a aVar2 = g6.f.f75994b;
            c2.l.f(c2.x2.u(h4.r.S, 16), o0VarE);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new j(15);
                o0VarE.K(objQ2);
            }
            aVar.f("Action", null, false, (e23.a) objQ2, o0VarE, 3078, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(i14, 7);
        }
    }

    public static final void g(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(125044635);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.f0.a aVar = l72.f0.a.f111000a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new j(12);
                o0VarE.K(objQ);
            }
            aVar.j("Action", null, false, (e23.a) objQ, o0VarE, 3078, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(i14, 4);
        }
    }

    public static final void h(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1967924336);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            s62.a.f157643a.getClass();
            u4.d dVarA = u62.a.a(t62.a.f162797a);
            long jD = hb.a.d(d92.b.f58623a, o0VarE);
            h4.r.a aVar = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.c cVar = j92.b.f97901d;
            h4.r rVarH = c2.x2.h(aVar, cVar.f97906e);
            bVar.getClass();
            i7.b(dVarA, null, c2.x2.u(rVarH, cVar.f97906e), jD, o0VarE, 48, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(i14, 6);
        }
    }

    public static final void i(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1908939733);
        p3.c<?> cVar = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarZ = c2.l.z(aVar, 16, 27);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81527e, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            c2.s2 s2VarA = c2.q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.u2 u2Var = c2.u2.f22900a;
            mh.c("Custom content", c2.l.C(aVar, 0.0f, 0.0f, 8, 0.0f, 11), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, o0VarE, 54, 0, 262140);
            b3.b.f15502a.getClass();
            o0VarE = o0VarE;
            i7.b(d3.i.a(), null, null, 0L, o0VarE, 48, 12);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(i14, 3);
        }
    }
}
