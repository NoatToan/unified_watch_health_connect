package i51;

import am.b2;
import b.u;
import b82.i;
import c2.q;
import c2.x2;
import c80.s0;
import com.garmin.android.apps.connectmobile.R;
import d91.s;
import e23.p;
import f5.z0;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.bf;
import i3.i7;
import i3.mc;
import i3.mh;
import i3.pc;
import java.util.ArrayList;
import java.util.List;
import jd0.c0;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.t0;
import p13.w;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import ub1.l;
import v62.n1;
import zd0.g1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91788a;

    public /* synthetic */ b(int i14) {
        this.f91788a = i14;
    }

    /* JADX WARN: Code duplicated, block: B:239:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:253:0x0827  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f91788a;
        m.a aVar = m.f135153a;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                c cVar = c.f91789a;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    String strQ = y.Q(mVar, R.string.pacepro_enter_time_or_pace);
                    u uVar = (u) mVar.A(g02.d.f74342a);
                    boolean zR = mVar.r(uVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new c.a(uVar);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new c.a(uVar);
                            mVar.K(objQ);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) ((k23.g) objQ), null, strQ, mVar, null);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                d dVar = d.f91791a;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    String strQ2 = y.Q(mVar2, R.string.pacepro_lbl_create_strategy);
                    u uVar2 = (u) mVar2.A(g02.d.f74342a);
                    boolean zR2 = mVar2.r(uVar2);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new d.a(uVar2);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new d.a(uVar2);
                            mVar2.K(objQ2);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) ((k23.g) objQ2), null, strQ2, mVar2, null);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                d dVar2 = d.f91791a;
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    Object objQ3 = mVar3.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = new i31.e(4);
                        mVar3.K(objQ3);
                    }
                    e23.a aVar2 = (e23.a) objQ3;
                    Object objQ4 = mVar3.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new i31.e(5);
                        mVar3.K(objQ4);
                    }
                    h.c(aVar2, (e23.a) objQ4, mVar3, 54);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                i62.a aVar3 = i62.a.f91825a;
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    l lVarU = g1.u((g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null), s0.FIND_A_WORKOUT, null, 6);
                    if (lVarU == null) {
                        mVar4.C(1038904975);
                    } else {
                        mVar4.C(-1767602254);
                        r.a aVar4 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        lVarU.a(c2.l.y(aVar4, j92.b.f97899b.f97920e), mVar4, 0);
                    }
                    mVar4.f();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                i62.a aVar5 = i62.a.f91825a;
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    z02.b.a(false, null, null, null, false, i62.a.f91826b, mVar5, 196608, 31);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                k23.d dVar3 = (k23.d) obj;
                List list = (List) obj2;
                dVar3.getClass();
                list.getClass();
                ArrayList arrayListN = y.N(p63.h.f136264a, list, true);
                arrayListN.getClass();
                return y.F(dVar3, arrayListN, new ad.b(list, 6));
            case 6:
                k23.d dVar4 = (k23.d) obj;
                List list2 = (List) obj2;
                dVar4.getClass();
                list2.getClass();
                ArrayList arrayListN2 = y.N(p63.h.f136264a, list2, true);
                arrayListN2.getClass();
                i63.c cVarF = y.F(dVar4, arrayListN2, new ad.b(list2, 7));
                if (cVarF != null) {
                    return j63.a.d(cVarF);
                }
                return null;
            case 7:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                i91.a aVar6 = i91.a.f92320a;
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    i91.h.a(0, 3, null, y.Q(mVar6, R.string.loading_error_sentence_case), y.Q(mVar6, R.string.msg_ai_error), mVar6, null);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 8:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                i91.a aVar7 = i91.a.f92320a;
                if (mVar7.n(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    i91.a.c cVar2 = new i91.a.c();
                    LocalDateTime localDateTimeMinusMinutes = LocalDateTime.now(DateTimeZone.UTC).minusMinutes(35);
                    localDateTimeMinusMinutes.getClass();
                    s sVar = new s("", "Good morning, Andrew", "This is your new personalized insight. It's about two sentences long but maybe slightly longer.", localDateTimeMinusMinutes, "Beta", false, null, null, null, null, w.c(new d91.h(d91.a.INTENSITY_MINUTES, "Intensity Minutes", "View your 4-week average.", null)), 992, null);
                    Object objQ5 = mVar7.q();
                    aVar.getClass();
                    m.a.C2565a c2565a2 = m.a.f135155b;
                    if (objQ5 == c2565a2) {
                        objQ5 = new bf(20);
                        mVar7.K(objQ5);
                    }
                    e23.l lVar = (e23.l) objQ5;
                    Object objQ6 = mVar7.q();
                    if (objQ6 == c2565a2) {
                        objQ6 = new i(9);
                        mVar7.K(objQ6);
                    }
                    i91.h.c(null, sVar, cVar2, null, lVar, (e23.r) objQ6, mVar7, 224256, 1);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 9:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                i91.a aVar8 = i91.a.f92320a;
                if (mVar8.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    i91.a.C1762a c1762a = new i91.a.C1762a();
                    LocalDateTime localDateTimeMinusMinutes2 = LocalDateTime.now(DateTimeZone.UTC).minusMinutes(35);
                    localDateTimeMinusMinutes2.getClass();
                    s sVar2 = new s("", "Good morning, Andrew", "You’re all caught up! Check back later for more insights about your day.", localDateTimeMinusMinutes2, "Beta", false, null, null, null, null, null, 2016, null);
                    Object objQ7 = mVar8.q();
                    aVar.getClass();
                    if (objQ7 == m.a.f135155b) {
                        objQ7 = new bf(21);
                        mVar8.K(objQ7);
                    }
                    i91.h.c(null, sVar2, c1762a, null, (e23.l) objQ7, null, mVar8, 24576, 41);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 10:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                i91.a aVar9 = i91.a.f92320a;
                if (mVar9.n(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(n1.a(t62.b.f162798a), y.Q(mVar9, R.string.lbl_close), null, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar9), mVar9, 0, 4);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 11:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                i91.a aVar10 = i91.a.f92320a;
                if (mVar10.n(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    Object objQ8 = mVar10.q();
                    aVar.getClass();
                    m.a.C2565a c2565a3 = m.a.f135155b;
                    int i15 = 10;
                    if (objQ8 == c2565a3) {
                        objQ8 = new i31.e(i15);
                        mVar10.K(objQ8);
                    }
                    e23.a aVar11 = (e23.a) objQ8;
                    Object objQ9 = mVar10.q();
                    if (objQ9 == c2565a3) {
                        objQ9 = new i31.e(i15);
                        mVar10.K(objQ9);
                    }
                    mc mcVar = new mc(true, aVar11, (e23.a) objQ9, pc.Expanded, null, false, 48, null);
                    Object objQ10 = mVar10.q();
                    if (objQ10 == c2565a3) {
                        objQ10 = new i31.e(11);
                        mVar10.K(objQ10);
                    }
                    e23.a aVar12 = (e23.a) objQ10;
                    Object objQ11 = mVar10.q();
                    if (objQ11 == c2565a3) {
                        objQ11 = new i(8);
                        mVar10.K(objQ11);
                    }
                    i91.h.d("", mcVar, aVar12, (e23.r) objQ11, mVar10, 3462);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 12:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                i91.a aVar13 = i91.a.f92320a;
                if (mVar11.n(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    r.a aVar14 = r.S;
                    d92.b.f58623a.getClass();
                    r rVarQ = x2.q(u1.n.e(aVar14, d92.b.a(mVar11).e().g(), k2.i.f102406a), wz1.b.f188181a);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar11.getU());
                    i2 i2VarX = mVar11.x();
                    r rVarC = k.c(rVarQ, mVar11);
                    h5.g.V.getClass();
                    e0.a aVar15 = h5.g.a.f81805b;
                    if (mVar11.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar15);
                    } else {
                        mVar11.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar11);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar11);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar11.getT() || !p005kotlin.jvm.internal.s.g(mVar11.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar11, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar11);
                    zd0.e.c(0.0f, 0, 14, 0L, c2.u.f22885a.c(aVar14, h4.d.a.f81528f), mVar11);
                    mVar11.y();
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 13:
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                i91.a aVar16 = i91.a.f92320a;
                if (mVar12.n(1 & iIntValue12, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    LocalDateTime localDateTimeMinusMinutes3 = LocalDateTime.now(DateTimeZone.UTC).minusMinutes(35);
                    localDateTimeMinusMinutes3.getClass();
                    s sVar3 = new s("", "Welcome to Active Intelligence", "Your insights will appear here once we have more data. The more you wear and use your watch, the more insights you’ll receive.", localDateTimeMinusMinutes3, "Beta", false, null, null, null, null, null, 2016, null);
                    Object objQ12 = mVar12.q();
                    aVar.getClass();
                    if (objQ12 == m.a.f135155b) {
                        objQ12 = new bf(19);
                        mVar12.K(objQ12);
                    }
                    i91.h.b(null, sVar3, (e23.l) objQ12, mVar12, 384, 1);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 14:
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                i91.a aVar17 = i91.a.f92320a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    i91.h.e(null, new i91.a.b(), mVar13, 0, 1);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 15:
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                i91.a aVar18 = i91.a.f92320a;
                if (mVar14.n(1 & iIntValue14, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    r.a aVar19 = r.S;
                    d92.b.f58623a.getClass();
                    r rVarQ2 = x2.q(u1.n.e(aVar19, d92.b.a(mVar14).e().g(), k2.i.f102406a), wz1.b.f188181a);
                    h4.d.f81522a.getClass();
                    z0 z0VarD2 = q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar14.getU());
                    i2 i2VarX2 = mVar14.x();
                    r rVarC2 = k.c(rVarQ2, mVar14);
                    h5.g.V.getClass();
                    e0.a aVar20 = h5.g.a.f81805b;
                    if (mVar14.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar20);
                    } else {
                        mVar14.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD2, mVar14);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar14);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar14.getT() || !p005kotlin.jvm.internal.s.g(mVar14.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar14, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar14);
                    zd0.e.c(0.0f, 0, 14, 0L, c2.u.f22885a.c(aVar19, h4.d.a.f81528f), mVar14);
                    mVar14.y();
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 16:
                m mVar15 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                i91.a aVar21 = i91.a.f92320a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    Object objQ13 = mVar15.q();
                    aVar.getClass();
                    m.a.C2565a c2565a4 = m.a.f135155b;
                    if (objQ13 == c2565a4) {
                        objQ13 = new i31.e(12);
                        mVar15.K(objQ13);
                    }
                    e23.a aVar22 = (e23.a) objQ13;
                    Object objQ14 = mVar15.q();
                    if (objQ14 == c2565a4) {
                        objQ14 = new i31.e(13);
                        mVar15.K(objQ14);
                    }
                    i91.h.f(null, "es", aVar22, (e23.a) objQ14, mVar15, 3504, 1);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 17:
                m mVar16 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                i91.a aVar23 = i91.a.f92320a;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    String strQ3 = y.Q(mVar16, R.string.rate_this_insight);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar16), mVar16, 0, 0, 131070);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 18:
                Scope scope = (Scope) obj;
                id0.b bVar3 = id0.b.f92665a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                return new bn.b((b2) scope.get((k23.d<?>) t0Var.b(b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zy0.b) scope.get((k23.d<?>) t0Var.b(zy0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope.get((k23.d<?>) t0Var.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 19:
                id0.b bVar4 = id0.b.f92665a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new jd0.a();
            case 20:
                id0.b bVar5 = id0.b.f92665a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new jd0.i();
            case 21:
                id0.b bVar6 = id0.b.f92665a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new jd0.h();
            case 22:
                id0.b bVar7 = id0.b.f92665a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new vq.d();
            case 23:
                id0.b bVar8 = id0.b.f92665a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new jd0.k();
            case 24:
                Scope scope2 = (Scope) obj;
                id0.b bVar9 = id0.b.f92665a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                return new c0((b2) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 25:
                id0.b bVar10 = id0.b.f92665a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (a22.f) ez0.b.a(ez0.b.f67468a, ez0.c.GC, a22.f.class, new c83.h.a[0], null, null, null, 120);
            case 26:
                Scope scope3 = (Scope) obj;
                id0.b bVar11 = id0.b.f92665a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new a22.h((a22.f) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(a22.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 27:
                id0.b bVar12 = id0.b.f92665a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, b2.class, new c83.h.a[0], null, null, null, 120);
            case 28:
                Scope scope4 = (Scope) obj;
                id0.b bVar13 = id0.b.f92665a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                return new m12.e((a22.h) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(a22.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            default:
                id0.b bVar14 = id0.b.f92665a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new jd0.f();
        }
    }
}
