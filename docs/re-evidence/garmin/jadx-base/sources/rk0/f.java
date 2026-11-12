package rk0;

import am.a2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.v1;
import c22.a4;
import c22.e1;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.activity.LactateThresholdSummaryActivity;
import com.garmin.android.apps.connectmobile.solarintensity.presentation.activity.SolarIntensityActivity;
import com.garmin.android.apps.connectmobile.training.itp.ITPWorkoutScheduleActivity;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import o53.c2;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p3.p1;
import r53.p2;
import s70.k1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f153098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f153099c;

    public /* synthetic */ f(int i14, Object obj, Object obj2) {
        this.f153097a = i14;
        this.f153098b = obj;
        this.f153099c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0097  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ba A[LOOP:2: B:18:0x00b4->B:20:0x00ba, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.a
    public final Object invoke() {
        Object value;
        Object value2;
        Boolean boolValueOf;
        boolean z14;
        dy1.q qVar;
        a4 a4Var;
        String uuid;
        vb0.e eVar;
        ArrayList arrayList;
        Iterator it;
        int i14 = this.f153097a;
        boolean z15 = true;
        int i15 = 0;
        Boolean boolValueOf2 = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = this.f153099c;
        Object obj4 = this.f153098b;
        switch (i14) {
            case 0:
                v0.b bVar = (v0.b) obj3;
                ((q0) obj4).b3(bVar.f153282a, bVar.f153283b);
                return Unit.INSTANCE;
            case 1:
                ((q0) obj4).e4(((v0.c) obj3).f153284a);
                return Unit.INSTANCE;
            case 2:
                ((q0) obj4).delete();
                ((p1) obj3).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 3:
                h0 h0Var = (h0) obj4;
                long jLongValue = ((Long) obj3).longValue();
                ReentrantLock reentrantLock = h0Var.f153153h;
                reentrantLock.lock();
                try {
                    c2 c2Var = h0Var.f153152g;
                    if (c2Var == null || !c2Var.isActive()) {
                        p2 p2Var = h0Var.f153149d;
                        do {
                            value = p2Var.getValue();
                        } while (!p2Var.b(value, g0.a((g0) value, null, null, null, u0.InProgress, null, null, false, false, 247)));
                        h0Var.f153152g = ge1.b.T(v1.a(h0Var), null, null, new n0(h0Var, jLongValue, null), 3);
                        Unit unit = Unit.INSTANCE;
                        break;
                    }
                    return Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            case 4:
                rk2.c.C2901c c2901c = rk2.c.f153359i;
                return new jy2.d((my2.a.b) obj4, ((rk2.c) obj3).f153361b.invoke(), null, false, 12, null);
            case 5:
                cl2.a.f27939a.getClass();
                return cl2.a.b((String) obj4, (rs2.c) obj3);
            case 6:
                e23.a aVar = (e23.a) obj3;
                p2 p2Var2 = ((ro0.q) obj4).f153870a;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, ro0.p.a((ro0.p) value2, false, false, false, 5)));
                aVar.invoke();
                return Unit.INSTANCE;
            case 7:
                SolarIntensityActivity solarIntensityActivity = (SolarIntensityActivity) obj3;
                SolarIntensityActivity.a aVar2 = SolarIntensityActivity.f44787a;
                xp1.b bVar2 = (xp1.b) ((yp1.a) obj4).f198694f.f150540a.getValue();
                HelpActivity.a aVar3 = HelpActivity.f36653a;
                ro0.l lVar = ro0.l.SOLAR_INTENSITY;
                if (bVar2 != null) {
                    i53.c<xp1.d> cVar = bVar2.f191855c;
                    if (cVar == null || cVar.isEmpty()) {
                        z14 = false;
                    } else {
                        Iterator<xp1.d> it3 = cVar.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z14 = false;
                            } else if (it3.next().f191864f) {
                                z14 = true;
                            }
                        }
                    }
                    boolValueOf = Boolean.valueOf(z14);
                } else {
                    boolValueOf = null;
                }
                o13.p pVar = new o13.p("EXTRA_HAS_BATTERY_COLD_DATA", boolValueOf);
                if (bVar2 != null) {
                    i53.c<xp1.d> cVar2 = bVar2.f191855c;
                    if (cVar2 == null || cVar2.isEmpty()) {
                        z15 = false;
                    } else {
                        Iterator<xp1.d> it4 = cVar2.iterator();
                        do {
                            if (!it4.hasNext()) {
                                z15 = false;
                            }
                        } while (!it4.next().f191863e);
                    }
                    boolValueOf2 = Boolean.valueOf(z15);
                }
                HelpActivity.a.e(aVar3, solarIntensityActivity, lVar, null, h7.c.a(pVar, new o13.p("EXTRA_HAS_BATTERY_HOT_DATA", boolValueOf2)), 4);
                return Unit.INSTANCE;
            case 8:
                ((e23.l) obj4).invoke((ir0.b) obj3);
                return Unit.INSTANCE;
            case 9:
                Context context = (Context) obj4;
                ht.s sVar = ht.s.f85508a;
                lt.e.k kVar = new lt.e.k(lt.e.a.Tapped, o70.t.C);
                sVar.getClass();
                ht.s.a(kVar);
                LactateThresholdSummaryActivity.f37141p.getClass();
                context.startActivity(LactateThresholdSummaryActivity.a.a(context, (xs0.a) obj3));
                return Unit.INSTANCE;
            case 10:
                ww1.r rVar = (ww1.r) obj3;
                int i16 = rt1.f.a.f154525c;
                e23.l<ww1.r, Unit> lVar2 = ((rt1.f) obj4).f154523a;
                if (lVar2 != null) {
                    lVar2.invoke(rVar);
                }
                return Unit.INSTANCE;
            case 11:
                e23.l lVar3 = (e23.l) obj4;
                tw1.m mVar = (tw1.m) ((g3) obj3).f35301b;
                lVar3.invoke(Long.valueOf(mVar != null ? mVar.getTrainingPlanId() : 0L));
                return Unit.INSTANCE;
            case 12:
                androidx.fragment.app.m mVar2 = (androidx.fragment.app.m) obj4;
                sw1.a aVar4 = (sw1.a) obj3;
                ITPWorkoutScheduleActivity.a aVar5 = ITPWorkoutScheduleActivity.f45592b;
                tw1.m mVar3 = aVar4.f161085a;
                fg0.k kVar2 = aVar4.f161089e;
                List<ActivityListItemDTO> list = aVar4.f161093i;
                aVar5.getClass();
                mVar3.getClass();
                list.getClass();
                Intent intent = new Intent(mVar2, (Class<?>) ITPWorkoutScheduleActivity.class);
                Bundle bundle = new Bundle();
                a2.b(bundle, "EXTRA_TRAINING_PLAN", mVar3);
                a2.b(bundle, "GCM_extra_event", kVar2);
                a2.a("extra_completed_activity_list", bundle, list);
                com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
                mVar2.startActivityForResult(intent, 101);
                return Unit.INSTANCE;
            case 13:
                mx1.b bVar3 = (mx1.b) obj3;
                for (Object obj5 : (i53.c) obj4) {
                    if (((dy1.q) obj5).f61607c == bVar3) {
                        obj2 = obj5;
                        qVar = (dy1.q) obj2;
                        if (qVar != null && (a4Var = qVar.f61605a) != null) {
                            i15 = a4Var.f23006b;
                        }
                        return new p3.a2(i15);
                    }
                }
                qVar = (dy1.q) obj2;
                if (qVar != null) {
                    i15 = a4Var.f23006b;
                }
                return new p3.a2(i15);
            case 14:
                e23.l lVar4 = (e23.l) obj3;
                cy0.r rVarI = ((ry0.c) obj4).f155064a.getUuid();
                if (rVarI != null && (uuid = rVarI.getUuid()) != null) {
                    lVar4.invoke(uuid);
                }
                return Unit.INSTANCE;
            case 15:
                ((q53.i) obj4).i(obj3);
                return Unit.INSTANCE;
            case 16:
                ((com.garmin.android.apps.connectmobile.userprofile.i) obj4).f46772z.m(Boolean.TRUE);
                ((e23.l) obj3).invoke(com.garmin.android.apps.connectmobile.userprofile.i.c.CHALLENGE);
                return Unit.INSTANCE;
            case 17:
                s40.g gVar = (s40.g) obj4;
                PointOfInterestDTO pointOfInterestDTO = (PointOfInterestDTO) obj3;
                c60.e.c cVar3 = gVar.f157057h;
                if (cVar3 != null) {
                    String name = pointOfInterestDTO.getName();
                    if (name == null) {
                        com.garmin.android.apps.connectmobile.courses.model.h hVar = pointOfInterestDTO.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
                        String strB = hVar != null ? dh.b.B(gVar, hVar.f32967c) : null;
                        name = strB == null ? "" : strB;
                    }
                    c60.e.d(cVar3.f24626a, "POIDetailsBottomSheet");
                    cVar3.f24627b.invoke();
                    cVar3.f24628c.invoke(pointOfInterestDTO, name);
                }
                return Unit.INSTANCE;
            case 18:
                ((p1) obj3).setValue(Boolean.FALSE);
                ((t40.a) obj4).f162264c.invoke();
                return Unit.INSTANCE;
            case 19:
                int i17 = s52.g.f157408g;
                h82.c.f((s52.g) obj4, (Context) obj3, "https://familydoctor.org/weight-training-and-weight-lifting-safety/");
                return Unit.INSTANCE;
            case 20:
                ((e23.l) obj4).invoke(new j70.b(((o70.t) obj3).f130082a));
                return Unit.INSTANCE;
            case 21:
                ((n70.g) obj4).a((Context) obj3);
                return Unit.INSTANCE;
            case 22:
                ((com.garmin.android.apps.connectmobile.dashboard.presentation.d) obj4).y4("DeviceMenuSelected", "Add Device");
                ((n70.g) KoinJavaComponent.get$default(n70.g.class, null, null, 6, null)).k((Context) obj3);
                return Unit.INSTANCE;
            case 23:
                ht.s sVar2 = ht.s.f85508a;
                lt.e.l lVar5 = new lt.e.l(lt.e.a.Dismiss);
                sVar2.getClass();
                ht.s.a(lVar5);
                y70.e eVar2 = ((s70.d0) obj4).f157681a;
                String str = ((n80.a) obj3).f124927a;
                str.getClass();
                f12.l lVar6 = eVar2.f194656b.f124370a;
                Set<String> setF1 = p13.h0.f1(lVar6.L1("companion_device_unlinked_dismissed_cards"));
                setF1.add(str);
                Unit unit2 = Unit.INSTANCE;
                lVar6.X1("companion_device_unlinked_dismissed_cards", setF1);
                return Unit.INSTANCE;
            case 24:
                y90.f fVar = ((s70.e0) obj4).f157687a.f194657a;
                q90.c f203116a = ((z90.a) obj3).getF203116a();
                f203116a.getClass();
                if (e1.a() && az0.b.a()) {
                    y90.b bVar4 = fVar.f195281a;
                    long j8 = f203116a.f143493a;
                    Logger logger = bVar4.f195269c;
                    y90.c cVar4 = bVar4.f195267a;
                    z90.a aVarB = cVar4.b(j8);
                    if (aVarB instanceof z90.a.C3788a) {
                        z90.a.C3788a c3788a = (z90.a.C3788a) aVarB;
                        cVar4.c(j8, new z90.a.d(c3788a.f203110a));
                        String str2 = c3788a.f203111b;
                        z90.a aVarB2 = cVar4.b(j8);
                        String f203117b = aVarB2 != null ? aVarB2.getF203117b() : null;
                        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "retry ", " from ", str2);
                        sbK.append(" to ");
                        sbK.append(f203117b);
                        logger.debug(sbK.toString());
                        ge1.b.T(fVar.f195283c, null, null, new y90.e(fVar, f203116a, null), 3);
                    } else {
                        logger.debug(v.h.u(j8, "retry ", ", no update to current: ", aVarB != null ? aVarB.getF203117b() : null));
                    }
                }
                return Unit.INSTANCE;
            case 25:
                e23.a aVar6 = (e23.a) obj3;
                if (((z90.a) obj4) instanceof z90.a.C3788a) {
                    aVar6.invoke();
                }
                return Unit.INSTANCE;
            case 26:
                ((e23.l) obj4).invoke(Long.valueOf(((o70.m) obj3).f130028a));
                return Unit.INSTANCE;
            case 27:
                o70.m mVar4 = (o70.m) obj3;
                y70.n nVar = ((s70.y0) obj4).f157833a;
                mVar4.getClass();
                nVar.f194673b.d(mVar4.f130028a);
                return Unit.INSTANCE;
            case 28:
                ht.s sVar3 = ht.s.f85508a;
                lt.e.l lVar7 = new lt.e.l(lt.e.a.Tapped);
                sVar3.getClass();
                ht.s.a(lVar7);
                ((s70.e1) obj4).f157689b.c((Context) obj3);
                return Unit.INSTANCE;
            default:
                ht.a aVar7 = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new o13.p("Screen", "Home"), new o13.p("Type", "InReachSubscriptionBanner"), new o13.p("Action", "Dismiss"));
                aVar7.getClass();
                ht.a.a(bundleA, "UserAction");
                y70.m mVar5 = ((k1) obj4).f157720a;
                long j14 = ((vb0.a) obj3).f176833a;
                f12.l lVar8 = mVar5.f194671b.f124344a;
                Set<String> setL1 = lVar8.L1("DISMISSED_BANNER_DEVICES");
                ArrayList arrayList2 = new ArrayList(p13.y.r(setL1, 10));
                Iterator<T> it5 = setL1.iterator();
                while (it5.hasNext()) {
                    arrayList2.add((vb0.e) GsonUtil.f47253b.fromJson((String) it5.next(), vb0.e.class));
                }
                for (Object obj6 : arrayList2) {
                    if (((vb0.e) obj6).getUnitId() == j14) {
                        obj = obj6;
                        eVar = (vb0.e) obj;
                        if (eVar == null) {
                            eVar = new vb0.e(j14, 0L, 0L, 6, null);
                        }
                        ArrayList arrayListY0 = p13.h0.y0(arrayList2, eVar);
                        arrayList = new ArrayList(p13.y.r(arrayListY0, 10));
                        it = arrayListY0.iterator();
                        while (it.hasNext()) {
                            arrayList.add(GsonUtil.a((vb0.e) it.next()));
                        }
                        lVar8.X1("DISMISSED_BANNER_DEVICES", p13.h0.g1(arrayList));
                        return Unit.INSTANCE;
                    }
                }
                eVar = (vb0.e) obj;
                if (eVar == null) {
                    eVar = new vb0.e(j14, 0L, 0L, 6, null);
                }
                ArrayList arrayListY1 = p13.h0.y0(arrayList2, eVar);
                arrayList = new ArrayList(p13.y.r(arrayListY1, 10));
                it = arrayListY1.iterator();
                while (it.hasNext()) {
                    arrayList.add(GsonUtil.a((vb0.e) it.next()));
                }
                lVar8.X1("DISMISSED_BANNER_DEVICES", p13.h0.g1(arrayList));
                return Unit.INSTANCE;
        }
    }
}
