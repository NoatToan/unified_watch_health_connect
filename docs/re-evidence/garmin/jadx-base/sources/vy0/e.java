package vy0;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import c2.x2;
import c80.n0;
import c80.y0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activity.details.presentation.overview.SelectTrailBottomSheet;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.PowerGuideFullscreenMapActivity;
import com.garmin.android.apps.connectmobile.settings.newsfeed.NewsFeedSettingsActivity;
import e2.i0;
import f5.z0;
import i3.ff;
import i3.hf;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import kotlin.t1;
import lc.u0;
import o4.m1;
import o53.c2;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.math.MathKt;
import p008y1.a3;
import p008y1.b2;
import p008y1.c3;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import s5.x0;
import u1.a2;
import u1.d2;
import vn2.b1;
import w51.o0;
import w51.q0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f180705b;

    public /* synthetic */ e(Object obj, int i14) {
        this.f180704a = i14;
        this.f180705b = obj;
    }

    private final Object a(Object obj, Object obj2) {
        EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = (EditPowerGuideStrategyActivity) this.f180705b;
        com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) obj;
        List list = (List) obj2;
        EditPowerGuideStrategyActivity.a aVar = EditPowerGuideStrategyActivity.f40384t;
        eVar.getClass();
        list.getClass();
        PowerGuideFullscreenMapActivity.a aVar2 = PowerGuideFullscreenMapActivity.f40410a;
        ArrayList<Integer> arrayList = new ArrayList<>(list);
        aVar2.getClass();
        Intent intent = new Intent(editPowerGuideStrategyActivity, (Class<?>) PowerGuideFullscreenMapActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("GCM_extra_course_detail", eVar);
        bundle.putIntegerArrayList("extra_colors", arrayList);
        l2.f37135b.getClass();
        l2.a.b().a(intent, bundle);
        editPowerGuideStrategyActivity.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    private final Object b(Object obj, Object obj2) {
        NewsFeedSettingsActivity newsFeedSettingsActivity = (NewsFeedSettingsActivity) this.f180705b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        NewsFeedSettingsActivity.a aVar = NewsFeedSettingsActivity.f43551b;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            xi1.d dVar = (xi1.d) newsFeedSettingsActivity.f43552a.getValue();
            boolean zR = mVar.r(newsFeedSettingsActivity);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new NewsFeedSettingsActivity.b(newsFeedSettingsActivity);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new NewsFeedSettingsActivity.b(newsFeedSettingsActivity);
                    mVar.K(objQ);
                }
            }
            xi1.c.a(dVar, (e23.a) objQ, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        xm0.i iVar = (xm0.i) this.f180705b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        xm0.i.a aVar = xm0.i.f191395n;
        int i14 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            z02.b.a(false, null, null, null, false, z3.f.c(-1672457263, new xm0.h(i14, iVar, s9.c.b(iVar.I6().f191453f, null, mVar, 48)), mVar), mVar, 196608, 31);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        xm0.u.a((xm0.z) this.f180705b, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2) {
        xm0.v vVar = (xm0.v) this.f180705b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(mVar, vVar.f191471b);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131070);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        xn.j.a aVar = xn.j.f191609g;
        ((xn.j) this.f180705b).g((p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object g(Object obj, Object obj2) {
        xr.c cVar = (xr.c) this.f180705b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = xr.c.f191947e;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = p0.c(cVar.u6().M1, mVar, 0);
            p1 p1VarC2 = p0.c(cVar.u6().K1, mVar, 0);
            d2 d2VarA = cVar.f191951d;
            if (d2VarA == null) {
                mVar.C(-670245806);
                d2VarA = a2.a(mVar);
            } else {
                mVar.C(-670246271);
            }
            mVar.f();
            d2 d2Var = d2VarA;
            cVar.f191951d = d2Var;
            z02.b.a(false, null, null, null, false, z3.f.c(-903987449, new w21.d((Object) cVar, (Object) d2Var, (Object) p1VarC, (Object) p1VarC2, 29), mVar), mVar, 196608, 31);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, o13.l] */
    private final Object h(Object obj, Object obj2) {
        SelectTrailBottomSheet selectTrailBottomSheet = (SelectTrailBottomSheet) this.f180705b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(((qr.t) selectTrailBottomSheet.f30107g.getValue()).z5(), mVar);
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.n(null);
                mVar.K(objQ);
            }
            z02.b.a(false, null, null, null, false, z3.f.c(-491445261, new xr.n(selectTrailBottomSheet, (p1) objQ, p1VarC, (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)), mVar), mVar, 196608, 31);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2) {
        a3 a3Var = (a3) this.f180705b;
        ge1.b.T(a3Var.getCoroutineScope(), null, null, new c3(a3Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
        return Boolean.TRUE;
    }

    private final Object j(Object obj, Object obj2) {
        ((y22.j) this.f180705b).M2(((Integer) obj).intValue(), ((Integer) obj2).intValue());
        return Unit.INSTANCE;
    }

    private final Object k(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        y41.e.b((o51.a) this.f180705b, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    private final Object l(Object obj, Object obj2) {
        nt2.e eVar = (nt2.e) this.f180705b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            boolean zR = mVar.r(eVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new lg2.n(eVar, 4);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new lg2.n(eVar, 4);
                    mVar.K(objQ);
                }
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, aVar, false);
            String str = eVar != null ? eVar.f127844a : "";
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(str, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:303:0x0a8e  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strP;
        z72.l lVar;
        int i14;
        int i15;
        boolean zC;
        Object obj3;
        String strK0;
        h4.g.a aVar;
        h4.r.a aVar2;
        int i16 = this.f180704a;
        Object obj4 = this.f180705b;
        switch (i16) {
            case 0:
                return MoreActivity.ma((MoreActivity) obj4, (p3.m) obj, ((Integer) obj2).intValue());
            case 1:
                oz1.b bVar = (oz1.b) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    h4.r rVarF = x2.f(aVar3, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarC = c2.l.C(rVarF, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar4 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, aVar4, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar5);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()) {
                        mVar.C(-67051292);
                        strP = gl1.y.P(R.string.common_n_meters_label, new Object[]{"600"}, mVar);
                        mVar.f();
                    } else {
                        mVar.C(-66953084);
                        strP = gl1.y.P(R.string.common_n_feet_label, new Object[]{"2,000"}, mVar);
                        mVar.f();
                    }
                    Integer minutesSinceLastDive = bVar.getMinutesSinceLastDive();
                    int iIntValue2 = minutesSinceLastDive != null ? minutesSinceLastDive.intValue() : 0;
                    int i17 = iIntValue2 / 60;
                    float f14 = 1 - (i17 / 24.0f);
                    float f15 = f14 - 0.84f;
                    float f16 = 0.16f - f15;
                    if (f14 > 0.83f) {
                        mVar.C(-66198203);
                        gl.c.f77766a.getClass();
                        lVar = new z72.l(0.83f, gl.c.a(mVar).h(), null);
                        mVar.f();
                    } else {
                        mVar.C(-65973949);
                        gl.c.f77766a.getClass();
                        lVar = new z72.l(f14, gl.c.a(mVar).h(), null);
                        mVar.f();
                    }
                    float f17 = 0.83f - f14;
                    if (f17 < 0.0f) {
                        f17 = 0.0f;
                    }
                    z72.l lVar2 = new z72.l(f17, d92.b.a(mVar).e().g(), null);
                    z72.l lVar3 = new z72.l(0.01f, d92.b.a(mVar).c().b(), null);
                    gl.c.f77766a.getClass();
                    i53.f fVarA = i53.a.a(lVar, lVar2, lVar3, new z72.l(f15, gl.c.a(mVar).l(), null));
                    if (f16 > 0.0f) {
                        mVar.C(-64997046);
                        fVarA = fVarA.add(new z72.l(f16, d92.b.a(mVar).e().g(), null));
                        mVar.f();
                    } else {
                        mVar.C(-64728927);
                        mVar.f();
                    }
                    i53.f fVar = fVarA;
                    float f18 = SyslogConstants.LOG_LOCAL6;
                    g6.f.a aVar6 = g6.f.f75994b;
                    h4.r rVarC3 = c2.l.C(x2.q(aVar3, f18), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new b1(22);
                        mVar.K(objQ);
                    }
                    z72.k.a(p5.v.c((e23.l) objQ, rVarC3, true), fVar, null, null, null, 8, 0.0f, false, false, z3.f.c(-1513889971, new as.e(i17, 9), mVar), mVar, 805502976, 476);
                    if (iIntValue2 <= 90) {
                        i14 = -1110423693;
                        i15 = R.string.post_dive_do_not_exercise;
                    } else if (iIntValue2 <= 240) {
                        i14 = -1110420228;
                        i15 = R.string.post_dive_avoid_strenuous_activity;
                    } else {
                        i14 = -1110417279;
                        i15 = R.string.post_dive_avoid_high_intensity_exercise;
                    }
                    String strH = sn.a.h(mVar, i14, i15, mVar);
                    d92.b.f58624b.getClass();
                    mh.c(strH, c2.l.C(aVar3, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar), mVar, 0, 0, 131068);
                    h82.r.f82497a.j(z3.f.c(-927846104, new bg2.b(iIntValue2, strP), mVar), mVar, 54);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                w02.r rVar = (w02.r) obj4;
                b5.a0 a0Var = (b5.a0) obj;
                a0Var.getClass();
                a0Var.a();
                long j8 = ((n4.c) obj2).f123544a;
                z53.b bVar3 = rVar.f181126e;
                w02.c0 c0Var = rVar.f181134m;
                i0 i0Var = rVar.f181122a;
                p3.a2 a2Var = rVar.f181129h;
                int intValue = a2Var.getIntValue();
                b2 b2VarG = rVar.g();
                b2 b2Var = b2.Vertical;
                a2Var.t(MathKt.c(Float.intBitsToFloat((int) (b2VarG == b2Var ? j8 & 4294967295L : j8 >> 32))) + intValue);
                e2.n nVarD = rVar.d();
                if (nVarD != null) {
                    int offset = nVarD.getF62574p() + rVar.e();
                    int size = nVarD.getF62575q() + offset;
                    int iF = w02.r.f(i0Var.j()) - size;
                    float f19 = offset;
                    float f22 = rVar.f181125d;
                    int i18 = 5;
                    if (f19 < f22) {
                        zC = c0Var.c(w02.c0.b.BACKWARD, (1 - j23.t.d((f19 + f22) / (f22 * 2), 0.0f, 1.0f)) * 10, new w02.k(rVar, 4), new w02.x(rVar, null));
                    } else {
                        float f24 = iF;
                        if (f24 < f22) {
                            zC = c0Var.c(w02.c0.b.FORWARD, (1 - j23.t.d((f24 + f22) / (f22 * 2), 0.0f, 1.0f)) * 10, new w02.k(rVar, i18), new w02.y(rVar, null));
                        } else {
                            ge1.b.T(c0Var.f181065b, null, null, new w02.f0(c0Var, null), 3);
                            zC = false;
                        }
                    }
                    if (bVar3.f()) {
                        c2 c2Var = c0Var.f181067d;
                        if ((c2Var == null || !c2Var.isActive()) && !zC) {
                            e2.n nVarC = w02.r.c(rVar, rVar.g() == b2Var ? new n4.d(0.0f, f19, (int) (i0Var.j().a() >> 32), size) : new n4.d(f19, 0.0f, size, (int) (i0Var.j().a() & 4294967295L)), i0Var.j().e(), null, new vu1.b(nVarD, i18), 4);
                            if (nVarC != null) {
                                obj3 = null;
                                ge1.b.T(rVar.f181123b, null, null, new w02.w(rVar, nVarD, nVarC, null), 3);
                            } else {
                                obj3 = null;
                            }
                        } else {
                            obj3 = null;
                        }
                        bVar3.e(obj3);
                    }
                }
                return Unit.INSTANCE;
            case 3:
                m12.s.e eVar2 = (m12.s.e) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    hf.a(eVar2.f115867c, null, null, false, d92.c.a(ff.f88115a, mVar2), mVar2, 48, 92);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                o0.a((b63.u) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                o0.f((q0) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                w51.a aVar7 = (w51.a) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String str = aVar7.f182215b;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar3), mVar3, 0, 0, 131070);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 7:
                zd0.e0 e0Var = (zd0.e0) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f25 = j92.b.f97899b.f97918c;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f25);
                    h4.r.a aVar8 = h4.r.S;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(iVarI, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode2 = Long.hashCode(mVar4.getU());
                    i2 i2VarX2 = mVar4.x();
                    h4.r rVarC4 = h4.k.c(aVar8, mVar4);
                    h5.g.V.getClass();
                    h5.e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar9);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar4);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    String strD = s0.f105811a.b(e0Var.getClass()).D();
                    String str2 = strD == null ? "" : strD;
                    d92.b.f58624b.getClass();
                    mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar4), mVar4, 0, 0, 131070);
                    mh.c(e0Var.e(), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar4), mVar4, 0, 0, 131070);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                wb1.h.a((wb1.o) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                y0 y0Var = (y0) obj4;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    c2.j jVar2 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f26 = eVar3.f97919d;
                    float f27 = eVar3.f97918c;
                    jVar2.getClass();
                    c2.j.i iVarI2 = c2.j.i(f26);
                    h4.r.a aVar10 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar11 = h4.d.a.f81536n;
                    c2.z zVarA3 = c2.y.a(iVarI2, aVar11, mVar5, 0);
                    int iHashCode3 = Long.hashCode(mVar5.getU());
                    i2 i2VarX3 = mVar5.x();
                    h4.r rVarC5 = h4.k.c(aVar10, mVar5);
                    h5.g.V.getClass();
                    h5.e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar12);
                    } else {
                        mVar5.c();
                    }
                    h5.g.a.e eVar4 = h5.g.a.f81810g;
                    b4.c(eVar4, zVarA3, mVar5);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX3, mVar5);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar5, iHashCode3, bVar5);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC5, mVar5);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    c2.z zVarA4 = c2.y.a(c2.j.i(f27), aVar11, mVar5, 0);
                    int iHashCode4 = Long.hashCode(mVar5.getU());
                    i2 i2VarX4 = mVar5.x();
                    h4.r rVarC6 = h4.k.c(aVar10, mVar5);
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar12);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar4, zVarA4, mVar5);
                    b4.c(c1623g, i2VarX4, mVar5);
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar5, iHashCode4, bVar5);
                    }
                    b4.c(fVar2, rVarC6, mVar5);
                    String str3 = y0Var.f25640d;
                    String str4 = str3 == null ? "" : str3;
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97931h;
                    mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar5), mVar5, 0, 0, 131070);
                    String str5 = y0Var.f25641e;
                    mh.c(str5 == null ? "" : str5, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar5), mVar5, 0, 0, 131070);
                    String str6 = y0Var.f25637a;
                    x0 x0Var2 = j92.f.f97933j;
                    mh.c(str6, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar5), mVar5, 0, 0, 131070);
                    mVar5.y();
                    c2.z zVarA5 = c2.y.a(c2.j.i(f27), aVar11, mVar5, 0);
                    int iHashCode5 = Long.hashCode(mVar5.getU());
                    i2 i2VarX5 = mVar5.x();
                    h4.r rVarC7 = h4.k.c(aVar10, mVar5);
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar12);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar4, zVarA5, mVar5);
                    b4.c(c1623g, i2VarX5, mVar5);
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar5, iHashCode5, bVar5);
                    }
                    b4.c(fVar2, rVarC7, mVar5);
                    mh.c("Conditions", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar5), mVar5, 6, 0, 131070);
                    n0 n0Var = y0Var.f25646j;
                    ArrayList arrayList = new ArrayList();
                    Boolean bool = n0Var.f25477b;
                    if (bool != null) {
                        arrayList.add("\thasGCPlusSubscription: " + bool.booleanValue());
                    }
                    Boolean bool2 = n0Var.f25478c;
                    if (bool2 != null) {
                        arrayList.add("\thasPairedDevice: " + bool2.booleanValue());
                    }
                    String str7 = n0Var.f25479d;
                    if (str7 != null) {
                        arrayList.add("\tactivityTypes: ".concat(str7));
                    }
                    String str8 = n0Var.f25480e;
                    if (str8 != null) {
                        arrayList.add("\texcludedActivityTypes: ".concat(str8));
                    }
                    Boolean bool3 = n0Var.f25481f;
                    if (bool3 != null) {
                        arrayList.add("\tisManualActivity: " + bool3.booleanValue());
                    }
                    Boolean bool4 = n0Var.f25482g;
                    if (bool4 != null) {
                        arrayList.add("\tisOwnedActivity: " + bool4.booleanValue());
                    }
                    Boolean bool5 = n0Var.f25483h;
                    if (bool5 != null) {
                        arrayList.add("\tlocationDismissedToday: " + bool5.booleanValue());
                    }
                    String str9 = n0Var.f25484i;
                    if (str9 != null) {
                        arrayList.add("\tusageIndicators: ".concat(str9));
                    }
                    List<String> list = n0Var.f25485j;
                    if (list != null) {
                        arrayList.add("\tgarminCoachPlanSubTypes: " + list);
                    }
                    Boolean bool6 = n0Var.f25486k;
                    if (bool6 != null) {
                        arrayList.add("\thasRecent3DCapableActivity: " + bool6.booleanValue());
                    }
                    Boolean bool7 = n0Var.f25487l;
                    if (bool7 != null) {
                        arrayList.add("\thasSetupNutrition: " + bool7.booleanValue());
                    }
                    Boolean bool8 = n0Var.f25488m;
                    if (bool8 != null) {
                        arrayList.add("\tisNutritionSetup: " + bool8.booleanValue());
                    }
                    Boolean bool9 = n0Var.f25490o;
                    if (bool9 != null) {
                        arrayList.add("\tisIntegratedWithMFP: " + bool9.booleanValue());
                    }
                    Boolean bool10 = n0Var.f25491p;
                    if (bool10 != null) {
                        arrayList.add("\tloggedToMFPInLast90Days: " + bool10.booleanValue());
                    }
                    Boolean bool11 = n0Var.f25492q;
                    if (bool11 != null) {
                        arrayList.add("\thasViewedHealthStatus: " + bool11.booleanValue());
                    }
                    Boolean bool12 = n0Var.f25493r;
                    if (bool12 != null) {
                        arrayList.add("\thasRecentIndexScale1WeighIn: " + bool12.booleanValue());
                    }
                    c80.h0 h0Var = n0Var.f25494s;
                    if (h0Var != null) {
                        arrayList.add("\tautoDismissType: " + h0Var);
                    }
                    c80.g0 g0Var = n0Var.f25495t;
                    if (g0Var != null) {
                        arrayList.add("\tautoDismissParams: " + g0Var);
                    }
                    Boolean bool13 = n0Var.f25496u;
                    if (bool13 != null) {
                        arrayList.add("\thasFollowings: " + bool13.booleanValue());
                    }
                    Integer num = n0Var.f25497v;
                    if (num != null) {
                        arrayList.add("\tminLiveActivityVersion: " + num.intValue());
                    }
                    Boolean bool14 = n0Var.f25498w;
                    if (bool14 != null) {
                        arrayList.add("\tallCoachPlansRequireGCPlus: " + bool14.booleanValue());
                    }
                    Boolean bool15 = n0Var.f25499x;
                    if (bool15 != null) {
                        arrayList.add("\tisPrimaryWearableScreenless: " + bool15.booleanValue());
                    }
                    if (arrayList.isEmpty()) {
                        strK0 = "PromoConditions()";
                    } else {
                        arrayList.add(0, "PromoConditions(");
                        arrayList.add(")");
                        strK0 = p13.h0.k0(arrayList, "\n", null, null, null, 62);
                    }
                    mh.c(strK0, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar5), mVar5, 0, 0, 131070);
                    mVar5.y();
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 10:
                ps.x1 x1Var6 = (ps.x1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                wr.k.a aVar13 = wr.k.f186755l;
                x1Var6.getClass();
                tq.a aVar14 = ((wr.k) obj4).f186757b;
                if (aVar14 == null) {
                    p005kotlin.jvm.internal.s.m("splitsViewModel");
                    throw null;
                }
                androidx.lifecycle.y0<List<ps.x1>> y0Var2 = aVar14.f166002j;
                List<ps.x1> listD = y0Var2.d();
                if (listD != null) {
                    ArrayList arrayList2 = new ArrayList(listD);
                    arrayList2.set(iIntValue7, x1Var6);
                    y0Var2.m(arrayList2);
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                wt0.d.f((tt0.e) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                tt0.e.a aVar15 = (tt0.e.a) obj4;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    wt0.d.f(aVar15, mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ((DialogInterface) obj).getClass();
                ((a42.q) obj4).invoke();
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                x91.s.a((q91.g) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                aa1.j jVar3 = (aa1.j) obj4;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h4.r.a aVar16 = h4.r.S;
                    h4.r rVarB = a2.b(x2.d(aVar16, 1.0f), a2.a(mVar7), true);
                    long jE = vb.h.e(d92.b.f58623a, mVar7);
                    m1.a aVar17 = m1.f128891a;
                    h4.r rVarE = u1.n.e(rVarB, jE, aVar17);
                    c2.j jVar4 = c2.j.f22691a;
                    d92.b.f58625c.getClass();
                    float f28 = j92.b.f97899b.f97920e;
                    jVar4.getClass();
                    c2.j.i iVarI3 = c2.j.i(f28);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar18 = h4.d.a.f81537o;
                    c2.z zVarA6 = c2.y.a(iVarI3, aVar18, mVar7, 48);
                    int iHashCode6 = Long.hashCode(mVar7.getU());
                    i2 i2VarX6 = mVar7.x();
                    h4.r rVarC8 = h4.k.c(rVarE, mVar7);
                    h5.g.V.getClass();
                    h5.e0.a aVar19 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar19);
                    } else {
                        mVar7.c();
                    }
                    h5.g.a.e eVar5 = h5.g.a.f81810g;
                    b4.c(eVar5, zVarA6, mVar7);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX6, mVar7);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar7, iHashCode6, bVar6);
                    }
                    h5.g.a.f fVar3 = h5.g.a.f81807d;
                    b4.c(fVar3, rVarC8, mVar7);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    Integer num2 = jVar3.f2303c;
                    if (num2 == null) {
                        mVar7.C(812146118);
                        mVar7.f();
                        aVar2 = aVar16;
                        aVar = aVar18;
                    } else {
                        mVar7.C(812146119);
                        int iIntValue10 = num2.intValue();
                        float f75992b = ((g6.c) mVar7.A(t1.f91490h)).getF75992b();
                        float f29 = 48;
                        float f34 = ((g6.f) j23.t.i(g6.f.a(f29 * f75992b), j23.s.a(g6.f.a(f29), g6.f.a(80)))).f75997a;
                        j92.c cVar = j92.b.f97901d;
                        float f35 = ((g6.f) j23.t.i(g6.f.a(cVar.f97905d * f75992b), j23.s.a(g6.f.a(cVar.f97905d), g6.f.a(cVar.f97906e)))).f75997a;
                        aVar = aVar18;
                        h4.r rVarE2 = u1.n.e(l4.k.b(x2.q(c2.l.C(aVar16, 0.0f, cVar.f97907f, 0.0f, 0.0f, 13), f34), k2.i.f102406a), d92.b.a(mVar7).e().g(), aVar17);
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode7 = Long.hashCode(mVar7.getU());
                        i2 i2VarX7 = mVar7.x();
                        h4.r rVarC9 = h4.k.c(rVarE2, mVar7);
                        if (mVar7.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar7.z();
                        if (mVar7.getT()) {
                            mVar7.M(aVar19);
                        } else {
                            mVar7.c();
                        }
                        b4.c(eVar5, z0VarD, mVar7);
                        b4.c(c1623g2, i2VarX7, mVar7);
                        if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode7))) {
                            v.h.z(iHashCode7, mVar7, iHashCode7, bVar6);
                        }
                        b4.c(fVar3, rVarC9, mVar7);
                        c2.u uVar = c2.u.f22885a;
                        t4.d dVarA = n5.c.a(iIntValue10, mVar7, 0);
                        long jF = u0.f(mVar7);
                        h4.r rVarQ = x2.q(uVar.c(aVar16, h4.d.a.f81528f), f35);
                        aVar2 = aVar16;
                        i7.a(dVarA, null, rVarQ, jF, mVar7, 48, 0);
                        mVar7.y();
                        Unit unit = Unit.INSTANCE;
                        mVar7.f();
                    }
                    String strQ = gl1.y.Q(mVar7, R.string.msg_no_data_available);
                    d92.b.f58624b.getClass();
                    x0 x0VarE = d92.c.e(d92.c.b(j92.f.f97931h, mVar7));
                    h4.r rVarA = c2.l.A(b0Var4.b(x2.f(aVar2, 1.0f), aVar), f28, 0.0f, 2);
                    d6.h.f57752b.getClass();
                    int i19 = d6.h.f57755e;
                    mh.c(strQ, rVarA, 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, x0VarE, mVar7, 0, 0, 130044);
                    mh.c(jVar3.f2302b, c2.l.A(b0Var4.b(x2.f(aVar2, 1.0f), aVar), f28, 0.0f, 2), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar7), mVar7, 0, 0, 130044);
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 16:
                return a(obj, obj2);
            case 17:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                Logger logger = xc0.g.f189921g;
                dialogInterface.getClass();
                xt2.a aVarM = ((xc0.g) obj4).m();
                if (aVarM != null) {
                    aVarM.c(new xc0.i());
                }
                dialogInterface.cancel();
                return Unit.INSTANCE;
            case 18:
                return b(obj, obj2);
            case 19:
                return c(obj, obj2);
            case 20:
                return d(obj, obj2);
            case 21:
                return e(obj, obj2);
            case 22:
                return f(obj, obj2);
            case 23:
                return g(obj, obj2);
            case 24:
                return h(obj, obj2);
            case 25:
                return i(obj, obj2);
            case 26:
                return j(obj, obj2);
            case 27:
                return k(obj, obj2);
            case 28:
                return l(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                yr.c.a((nr.g.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(Object obj, int i14, int i15) {
        this.f180704a = i15;
        this.f180705b = obj;
    }
}
