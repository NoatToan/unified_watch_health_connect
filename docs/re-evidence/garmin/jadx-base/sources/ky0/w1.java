package ky0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import i3.i7;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import v62.d7;
import v62.l9;
import v62.m9;
import v62.z4;

/* JADX INFO: loaded from: classes9.dex */
public final class w1 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f107755a;

        static {
            int[] iArr = new int[PrivacyType.values().length];
            try {
                iArr[PrivacyType.ONLY_ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrivacyType.MY_CONNECTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrivacyType.MY_GROUPS_AND_CONNECTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrivacyType.EVERYONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f107755a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x033d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r10v10, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r10v11, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r10v12, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r10v14, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r10v16, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v4, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r10v6, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r10v9, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r11v4, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r12v10, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r12v9, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v25, types: [p3.m] */
    public static final void a(boolean z14, sy0.k kVar, sy0.t tVar, PrivacyType privacyType, e23.a<Unit> aVar, p3.m mVar, int i14) {
        ?? r14;
        ry0.m mVar2;
        h4.r.a aVar2;
        int i15;
        ?? r15;
        j92.e eVar;
        ?? r16;
        ?? r17;
        ?? r18;
        ?? r19;
        ?? r110;
        Object obj;
        ?? r111;
        e23.a<Unit> aVar3 = aVar;
        kVar.getClass();
        tVar.getClass();
        aVar3.getClass();
        p3.o0 o0VarE = mVar.E(983074416);
        int i16 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.B(kVar) ? 32 : 16) | (o0VarE.B(tVar) ? 256 : 128) | (o0VarE.k(privacyType.ordinal()) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            b63.o oVarD = ay0.b.d(kVar.f161238f);
            b63.o oVarD2 = ay0.b.d(kVar.f161239g);
            ry0.m mVar3 = kVar.f161248p;
            b12.b bVar = tVar.f161284c;
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar4, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            bVar3.getClass();
            h4.r rVarZ = c2.l.z(rVarE, f14, eVar2.f97918c);
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            u4.d dVarA = null;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            if (z14 || bVar == null) {
                mVar2 = mVar3;
                aVar2 = aVar4;
                p3.o0 o0Var = o0VarE;
                i15 = 0;
                o0Var.C(1771740526);
                o0Var.g0(false);
                r15 = o0Var;
            } else {
                o0VarE.C(1771520457);
                bVar3.getClass();
                aVar2 = aVar4;
                h4.r rVarC2 = c2.l.C(aVar2, 0.0f, 0.0f, eVar2.f97918c, 0.0f, 11);
                bVar3.getClass();
                p3.o0 o0Var2 = o0VarE;
                mVar2 = mVar3;
                i15 = 0;
                b12.k.b(rVarC2, null, j92.b.f97901d.f97905d, bVar, o0Var2, b12.b.f14385f << 9, 18);
                o0Var2.g0(false);
                r15 = o0Var2;
            }
            if (p005kotlin.jvm.internal.s.g(mVar2, ry0.m.c.f155182a)) {
                r15.C(1771816507);
                String strT = gl1.d.T(mVar2.b(), r15, i15);
                gl.c.f77766a.getClass();
                long jB = gl.c.a(r15).b();
                bVar3.getClass();
                ?? r24 = r15;
                ?? r112 = i15;
                es1.c.a(c2.l.C(aVar2, 0.0f, 0.0f, eVar2.f97918c, 0.0f, 11), strT, 0L, jB, r24, 0, 4);
                ?? r113 = r24;
                r113.g0(r112);
                eVar = eVar2;
                r17 = r113;
                r16 = r112;
            } else {
                ?? r114 = i15;
                if (p005kotlin.jvm.internal.s.g(mVar2, ry0.m.a.f155176a)) {
                    r15.C(1772071420);
                    String strT2 = gl1.d.T(mVar2.b(), r15, r114 == true ? 1 : 0);
                    gl.c.f77766a.getClass();
                    long jL = gl.c.a(r15).l();
                    bVar3.getClass();
                    ?? r115 = r15;
                    eVar = eVar2;
                    es1.c.a(c2.l.C(aVar2, 0.0f, 0.0f, eVar2.f97918c, 0.0f, 11), strT2, 0L, jL, r115, 0, 4);
                    ?? r116 = r115;
                    r116.g0(r114);
                    r17 = r116;
                    r16 = r114;
                } else {
                    eVar = eVar2;
                    r15.C(1772295116);
                    r15.g0(r114);
                    r17 = r15;
                    r16 = r114;
                }
            }
            bVar3.getClass();
            j92.c cVar = j92.b.f97901d;
            h4.r rVarQ = x2.q(aVar2, cVar.f97903b);
            s62.a.f157643a.getClass();
            ?? r117 = r17;
            i7.b(u62.h1.a(t62.a.f162797a), null, rVarQ, sn.a.y(r117), r117, 48, 0);
            ?? r118 = r117;
            if (oVarD == null || oVarD2 == null) {
                ?? r25 = r16;
                r118.C(1772942830);
                r118.g0(r25);
                r19 = r25;
                r18 = r118;
            } else {
                r118.C(1772608092);
                String strM = new pi0.e((Context) r118.A(AndroidCompositionLocals_androidKt.f6042b)).m(g22.l.h(oVarD), g22.l.h(oVarD2), pi0.f.SHORT_MONTH_NO_WEEKDAY);
                d92.b.f58624b.getClass();
                s5.x0 x0VarF = d92.c.f(j92.f.f97933j, r118);
                bVar3.getClass();
                h4.r rVarC3 = c2.l.C(aVar2, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                boolean z15 = r16 == true ? 1 : 0;
                mh.c(strM, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, r118, 0, 0, 131068);
                ?? r119 = r118;
                r119.g0(z15);
                r19 = z15;
                r18 = r119;
            }
            c2.l.f(u2Var.a(aVar2, 1.0f, true), r18);
            if (z14) {
                r18.C(-81351335);
                int i17 = a.f107755a[privacyType.ordinal()];
                if (i17 == 1) {
                    dVarA = z4.a(t62.b.f162798a);
                } else if (i17 == 2) {
                    dVarA = l9.a(t62.b.f162798a);
                } else if (i17 == 3) {
                    dVarA = m9.a(t62.b.f162798a);
                } else if (i17 == 4) {
                    dVarA = d7.a(t62.b.f162798a);
                }
                u4.d dVar = dVarA;
                if (dVar == null) {
                    r18.C(1773075912);
                    r18.g0(r19);
                    aVar3 = aVar;
                    r111 = r18;
                } else {
                    r18.C(1773075913);
                    bVar3.getClass();
                    h4.r rVarQ2 = x2.q(aVar2, cVar.f97903b);
                    ?? r120 = (i16 & 57344) == 16384 ? 1 : r19;
                    Object objQ = r18.q();
                    if (r120 == 0) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            aVar3 = aVar;
                            ku1.a aVar6 = new ku1.a(aVar3, 15);
                            r18.K(aVar6);
                            obj = aVar6;
                        } else {
                            aVar3 = aVar;
                            obj = objQ;
                        }
                    } else {
                        aVar3 = aVar;
                        ku1.a aVar7 = new ku1.a(aVar3, 15);
                        r18.K(aVar7);
                        obj = aVar7;
                    }
                    ?? r121 = r18;
                    i7.b(dVar, gl1.y.Q(r18, privacyType.getF28798b()), u1.w.d(rVarQ2, false, null, null, (e23.a) obj, 15), sn.a.y(r18), r121, 0, 0);
                    ?? r122 = r121;
                    Unit unit = Unit.INSTANCE;
                    r122.g0(r19);
                    r111 = r122;
                }
                r111.g0(r19);
                r110 = r111;
            } else {
                aVar3 = aVar;
                r18.C(1773705678);
                r18.g0(r19);
                r110 = r18;
            }
            r110.g0(true);
            r14 = r110;
        } else {
            p3.o0 o0Var3 = o0VarE;
            o0Var3.e();
            r14 = o0Var3;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.m(z14, kVar, tVar, privacyType, (e23.a) aVar3, i14);
        }
    }
}
