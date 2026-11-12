package p40;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import f5.z0;
import i3.i7;
import i3.mh;
import java.util.Set;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import v62.c6;
import v62.n1;

/* JADX INFO: loaded from: classes8.dex */
public final class x {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135772a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.courses.model.f.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T1_CLIMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T2_CLIMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T3_CLIMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T4_CLIMB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f135772a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, q40.b bVar, boolean z14, k kVar, k kVar2, ov1.u uVar, p3.m mVar, int i14) {
        k kVar3;
        h5.g.a.b bVar2;
        t4.d dVarA;
        boolean z15;
        u2 u2Var;
        float f14;
        int i15;
        Object obj;
        boolean z16;
        rVar.getClass();
        com.garmin.android.apps.connectmobile.courses.model.f fVar = bVar.f142580g;
        p3.o0 o0VarE = mVar.E(-1125086982);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.r(bVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(kVar) ? 2048 : 1024) | (o0VarE.r(kVar2) ? 16384 : 8192) | (o0VarE.r(uVar) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (i16 & 74899) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(rVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            h4.g.b bVar3 = h4.d.a.f81533k;
            s2 s2VarA = q2.a(c0343j, bVar3, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarA = u2Var2.a(aVar2, 0.8f, true);
            h4.g.b bVar5 = h4.d.a.f81534l;
            h4.r rVarC2 = u2Var2.c(rVarA, bVar5);
            d92.b.f58623a.getClass();
            j92.b bVar6 = d92.b.f58625c;
            bVar6.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f15 = eVar2.f97920e;
            float f16 = eVar2.f97920e;
            float f17 = eVar2.f97917b;
            h4.r rVarA2 = c2.l.A(rVarC2, 0.0f, f15, 1);
            bVar6.getClass();
            c2.z zVarA = c2.y.a(c2.j.i(f17), h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarA2, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
            }
            b4.c(fVar2, rVarC3, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String str = bVar.f142575b;
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
            bVar6.getClass();
            h4.r.a aVar3 = aVar2;
            mh.c(str, c2.l.A(aVar2, f16, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            h4.r rVarF2 = x2.f(aVar3, 1.0f);
            bVar6.getClass();
            h4.r rVarA3 = c2.l.A(rVarF2, f16, 0.0f, 2);
            bVar6.getClass();
            s2 s2VarA2 = q2.a(c2.j.i(f17), bVar3, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC4 = h4.k.c(rVarA3, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                bVar2 = bVar4;
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            } else {
                bVar2 = bVar4;
            }
            b4.c(fVar2, rVarC4, o0VarE);
            Set<com.garmin.android.apps.connectmobile.courses.model.f> set = u40.f.f168568a;
            fVar.getClass();
            com.garmin.android.apps.connectmobile.courses.model.h hVar = fVar.f32928g;
            u4.d dVar = hVar != null ? hVar.f32966b : null;
            if (dVar != null) {
                o0VarE.C(1623524279);
                dVarA = u4.p.b(dVar, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1623609002);
                dVarA = n5.c.a(fVar.f32923b, o0VarE, 0);
                o0VarE.g0(false);
            }
            String strT = gl1.d.T(fVar.a(), o0VarE, 0);
            bVar6.getClass();
            j92.c cVar2 = j92.b.f97901d;
            float f18 = cVar2.f97904c;
            float f19 = cVar2.f97905d;
            i7.a(dVarA, strT, u2Var2.c(x2.q(aVar3, f18), bVar5), sn.a.y(o0VarE), o0VarE, 0, 0);
            String strB = b(fVar, o0VarE);
            fVar3.getClass();
            mh.c(strB, u2Var2.c(aVar3, bVar5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
            h4.r rVarC5 = u2Var2.c(u2Var2.a(aVar3, 0.1f, true), bVar5);
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode4 = Long.hashCode(o0VarE.U);
            i2 i2VarA3 = o0VarE.a0();
            h4.r rVarC6 = h4.k.c(rVarC5, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA3, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar2);
            }
            b4.c(fVar2, rVarC6, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            if (z14) {
                o0VarE.C(256412828);
                s62.a.f157643a.getClass();
                u4.d dVarA2 = c6.a(t62.b.f162798a);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_menu);
                long jD = d92.b.a(o0VarE).f().d();
                bVar6.getClass();
                f14 = f19;
                h4.r rVarC7 = uVar2.c(x2.q(aVar3, f14), h4.d.a.f81528f);
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new om0.h(p1Var, 20);
                    o0VarE.K(objQ3);
                }
                i7.b(dVarA2, strQ, u1.w.d(rVarC7, false, null, null, (e23.a) objQ3, 15), jD, o0VarE, 0, 0);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(256943269);
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    long jG = d92.b.a(o0VarE).c().g();
                    Object objQ4 = o0VarE.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new om0.h(p1Var, 22);
                        o0VarE.K(objQ4);
                    }
                    e23.a aVar4 = (e23.a) objQ4;
                    obj = bVar;
                    z3.e eVarC = z3.f.c(-1092822251, new mw0.h(kVar, obj, p1Var, p1Var2, 7), o0VarE);
                    i15 = 16;
                    z15 = false;
                    u2Var = u2Var2;
                    aVar3 = aVar3;
                    i3.u.a(zBooleanValue, aVar4, null, 0L, null, null, null, jG, 0.0f, 0.0f, eVarC, o0VarE, 48, 48, 1916);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    z15 = false;
                    u2Var = u2Var2;
                    i15 = 16;
                    obj = bVar;
                    o0VarE.C(258910994);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z15);
            } else {
                z15 = false;
                u2Var = u2Var2;
                f14 = f19;
                i15 = 16;
                obj = bVar;
                o0VarE.C(258924882);
                o0VarE.g0(false);
            }
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(259017014);
                g82.c cVar3 = g82.c.f76436a;
                String strQ2 = gl1.y.Q(o0VarE, R.string.remove_course_point);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_remove);
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                c.f135642a.getClass();
                z3.e eVar3 = c.f135646e;
                boolean zR = ((i16 & 57344) == 16384) | o0VarE.r(obj);
                Object objQ5 = o0VarE.q();
                if (zR || objQ5 == c2565a) {
                    kVar3 = kVar2;
                    objQ5 = new nw0.p(kVar3, i15, obj, p1Var2);
                    o0VarE.K(objQ5);
                } else {
                    kVar3 = kVar2;
                }
                e23.a<Unit> aVar5 = (e23.a) objQ5;
                Object objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = new om0.h(p1Var2, 23);
                    o0VarE.K(objQ6);
                }
                e23.a<Unit> aVar6 = (e23.a) objQ6;
                Object objQ7 = o0VarE.q();
                if (objQ7 == c2565a) {
                    objQ7 = new om0.h(p1Var2, 24);
                    o0VarE.K(objQ7);
                }
                p3.o0 o0Var = o0VarE;
                cVar3.b(null, strQ2, eVar3, strQ3, aVar5, strQ4, aVar6, false, (e23.a) objQ7, o0Var, 102236544, 129);
                o0VarE = o0Var;
                z16 = false;
                o0VarE.g0(false);
            } else {
                z16 = z15;
                kVar3 = kVar2;
                o0VarE.C(260041874);
                o0VarE.g0(z16);
            }
            o0VarE.g0(true);
            s62.a.f157643a.getClass();
            u4.d dVarA3 = n1.a(t62.b.f162798a);
            String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_close);
            long jY = sn.a.y(o0VarE);
            h4.r rVarA4 = u2Var.a(aVar3, 0.15f, true);
            bVar6.getClass();
            h4.r rVarC8 = u2Var.c(x2.q(rVarA4, f14), bVar5);
            if ((i16 & 458752) == 131072) {
                z16 = true;
            }
            Object objQ8 = o0VarE.q();
            if (z16 || objQ8 == c2565a) {
                objQ8 = new ov1.u(uVar, 9);
                o0VarE.K(objQ8);
            }
            i7.b(dVarA3, strQ5, u1.w.d(rVarC8, false, null, null, (e23.a) objQ8, 15), jY, o0VarE, 0, 0);
            o0VarE.g0(true);
        } else {
            kVar3 = kVar2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ck0.h(rVar, bVar, z14, kVar, kVar3, uVar, i14, 19);
        }
    }

    public static final String b(com.garmin.android.apps.connectmobile.courses.model.f fVar, p3.m mVar) {
        fVar.getClass();
        int i14 = fVar.f32925d;
        x1 x1Var = p3.n.f135158a;
        int i15 = a.f135772a[fVar.ordinal()];
        if (i15 == 1) {
            mVar.C(305344276);
            String strP = gl1.y.P(i14, new Object[]{IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE}, mVar);
            mVar.f();
            return strP;
        }
        if (i15 == 2) {
            mVar.C(305347220);
            String strP2 = gl1.y.P(i14, new Object[]{"2"}, mVar);
            mVar.f();
            return strP2;
        }
        if (i15 == 3) {
            mVar.C(305350164);
            String strP3 = gl1.y.P(i14, new Object[]{"3"}, mVar);
            mVar.f();
            return strP3;
        }
        if (i15 != 4) {
            mVar.C(305355239);
            String strT = gl1.d.T(fVar.a(), mVar, 0);
            mVar.f();
            return strT;
        }
        mVar.C(305353108);
        String strP4 = gl1.y.P(i14, new Object[]{"4"}, mVar);
        mVar.f();
        return strP4;
    }
}
