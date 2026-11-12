package s70;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotActivity;
import com.garmin.android.apps.connectmobile.calories.presentation.CaloriesReportsActivity;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.device.passcode.DevicePasscodeActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.performance.stats.TrainingEffectDetailActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.fragment.FitPayAdditionalInformationFragment;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import p005kotlin.Unit;
import r53.p2;
import view.NotificationLoadingView;
import yc.t2;
import yc.u2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f157655b;

    public /* synthetic */ b0(Object obj, int i14) {
        this.f157654a = i14;
        this.f157655b = obj;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Entry entryD;
        o61.l lVar;
        Object value;
        Object value2;
        Object value3;
        int i14 = this.f157654a;
        boolean z14 = false;
        z14 = false;
        yc.z0 z0Var = null;
        Object obj2 = this.f157655b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.dashboard.presentation.d dVar = (com.garmin.android.apps.connectmobile.dashboard.presentation.d) obj2;
                f.a aVar = (f.a) obj;
                aVar.getClass();
                if (aVar.f67585a == -1) {
                    dVar.f33550g.b();
                }
                return Unit.INSTANCE;
            case 1:
                ((f.a) obj).getClass();
                ((u0) obj2).f157806a.f194666b.f124369a.T3(true);
                return Unit.INSTANCE;
            case 2:
                ((f.a) obj).getClass();
                y70.l lVar2 = ((v0) obj2).f157811a;
                lVar2.f194668a.G();
                lVar2.f194668a.F();
                return Unit.INSTANCE;
            case 3:
                String str = (String) p13.h0.e0(((Integer) obj).intValue(), ((o70.p) obj2).f130053c);
                return str == null ? "" : str;
            case 4:
                ((f.a) obj).getClass();
                ((z1) obj2).f157846a.f194684b.f124369a.T3(true);
                return Unit.INSTANCE;
            case 5:
                DevicePasscodeActivity devicePasscodeActivity = (DevicePasscodeActivity) obj2;
                int iIntValue = ((Integer) obj).intValue();
                DevicePasscodeActivity.a aVar2 = DevicePasscodeActivity.f33744a;
                devicePasscodeActivity.setResult(iIntValue);
                devicePasscodeActivity.finish();
                return Unit.INSTANCE;
            case 6:
                sc.e eVar = (sc.e) obj2;
                Object obj3 = eVar.f158446b.get(p005kotlin.jvm.internal.s0.f105811a.b(obj.getClass()));
                sc.c cVar = obj3 instanceof sc.c ? (sc.c) obj3 : null;
                Object obj4 = eVar.f158447c.get(obj);
                sc.d dVar2 = obj4 instanceof sc.d ? (sc.d) obj4 : null;
                if (cVar != null) {
                    return new sc.h(obj, cVar.f158438b.invoke((K) obj), cVar.f158439c, cVar.f158440d);
                }
                return dVar2 != null ? new sc.h(obj, dVar2.f158442b, dVar2.f158443c, dVar2.f158444d) : (sc.h) eVar.f158445a.invoke((T) obj);
            case 7:
                ((d4.c) obj2).c(obj);
                return Unit.INSTANCE;
            case 8:
                ue0.l lVar3 = (ue0.l) obj;
                lVar3.getClass();
                ((sg0.o0) obj2).invoke(lVar3);
                return Unit.INSTANCE;
            case 9:
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                e2.f0.b(f0Var, null, new z3.e(990899808, true, new si1.g((ti1.b) obj2, z14 ? 1 : 0)), 3);
                return Unit.INSTANCE;
            case 10:
                ((sk0.h1) obj2).U1();
                return Unit.INSTANCE;
            case 11:
                FitPayAdditionalInformationFragment fitPayAdditionalInformationFragment = (FitPayAdditionalInformationFragment) obj2;
                if (((Boolean) obj).booleanValue()) {
                    com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar = fitPayAdditionalInformationFragment.f51656a;
                    if (bVar == null) {
                        p005kotlin.jvm.internal.s.m("viewModel");
                        throw null;
                    }
                    ge1.b.T(androidx.lifecycle.v1.a(bVar), null, null, new rp2.g(bVar, null), 3);
                }
                return Unit.INSTANCE;
            case 12:
                sy.b bVar2 = (sy.b) obj;
                int i15 = CaloriesReportsActivity.f31240b;
                bVar2.getClass();
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRA_DATA", new com.garmin.android.apps.connectmobile.calories.presentation.a.b(com.garmin.android.apps.connectmobile.calories.presentation.a.c.DEFAULT_VERSION, false, bVar2.f161155b, bVar2.f161156c, bVar2.f161154a, 0, 0, 0, 0, bVar2.f161157d, 482, (p005kotlin.jvm.internal.j) null));
                HelpActivity.a aVar3 = HelpActivity.f36653a;
                ro0.l lVar4 = ro0.l.CALORIE;
                aVar3.getClass();
                HelpActivity.a.d((CaloriesReportsActivity) obj2, lVar4, null, bundle);
                return Unit.INSTANCE;
            case 13:
                Highlight[] highlightArr = (Highlight[]) obj;
                LineDataSet lineDataSet = sz.a.f161311h;
                highlightArr.getClass();
                qz.e eVar2 = ((sz.a) obj2).f161315d;
                int length = highlightArr.length;
                if (length == 1) {
                    return (eVar2 == null || (entryD = eVar2.d(highlightArr[0])) == null) ? new Entry() : entryD;
                }
                if (length == 2 && eVar2 != null) {
                    return eVar2.g(highlightArr);
                }
                return new Entry();
            case 14:
                sz0.u uVar = (sz0.u) obj2;
                yc.s sVar = (yc.s) obj;
                int i16 = sz0.u.E;
                sVar.getClass();
                uVar.w6();
                yc.z0 z0Var2 = sVar.f196385a;
                if (!(z0Var2 instanceof yc.z0.b) || uVar.f34753o) {
                    NotificationLoadingView notificationLoadingView = uVar.f161510t;
                    if (notificationLoadingView == null) {
                        p005kotlin.jvm.internal.s.m("loadingLayout");
                        throw null;
                    }
                    notificationLoadingView.a();
                    wz0.a aVar4 = uVar.d7().f161422j;
                    if (aVar4.f188130b.isEmpty() && aVar4.f188129a.isEmpty()) {
                        z14 = true;
                    }
                    ComposeView composeView = uVar.f161511v;
                    if (composeView == null) {
                        p005kotlin.jvm.internal.s.m("emptyView");
                        throw null;
                    }
                    v22.e.r(composeView, z14);
                    yc.z0 z0Var3 = sVar.f196386b;
                    if (z0Var3 instanceof yc.z0.a) {
                        z0Var = z0Var3;
                    } else if (z0Var2 instanceof yc.z0.a) {
                        z0Var = z0Var2;
                    } else {
                        yc.z0 z0Var4 = sVar.f196387c;
                        if (z0Var4 instanceof yc.z0.a) {
                            z0Var = z0Var4;
                        }
                    }
                    if (z0Var != null) {
                        g22.e.c(uVar);
                    }
                } else {
                    NotificationLoadingView notificationLoadingView2 = uVar.f161510t;
                    if (notificationLoadingView2 == null) {
                        p005kotlin.jvm.internal.s.m("loadingLayout");
                        throw null;
                    }
                    notificationLoadingView2.animatorSet.start();
                    notificationLoadingView2.setVisibility(0);
                }
                return Unit.INSTANCE;
            case 15:
                t30.c cVar2 = (t30.c) obj2;
                Integer num = (Integer) obj;
                int iIntValue2 = num.intValue();
                int i17 = cVar2.f162158v;
                if (i17 != iIntValue2) {
                    e23.p<? super Integer, ? super Integer, Unit> pVar = cVar2.f162160x;
                    if (pVar != null) {
                        pVar.invoke(Integer.valueOf(i17), num);
                    }
                    cVar2.f162158v = iIntValue2;
                }
                return Unit.INSTANCE;
            case 16:
                t30.k kVar = (t30.k) obj2;
                int iIntValue3 = ((Integer) obj).intValue();
                t30.k.b bVar3 = t30.k.f162180q;
                kVar.w6().setState(4);
                t30.k.a aVar5 = kVar.f162184n;
                if (aVar5 != null) {
                    List<ClimbDTO> list = kVar.f162181k;
                    if (list == null) {
                        p005kotlin.jvm.internal.s.m("climbs");
                        throw null;
                    }
                    ClimbDTO climbDTO = list.get(iIntValue3);
                    List<ClimbDTO> list2 = kVar.f162181k;
                    if (list2 == null) {
                        p005kotlin.jvm.internal.s.m("climbs");
                        throw null;
                    }
                    aVar5.b(climbDTO, iIntValue3, list2.size());
                }
                return Unit.INSTANCE;
            case 17:
                ((ListenableFuture) obj2).cancel(false);
                return Unit.INSTANCE;
            case 18:
                TrainingEffectDetailActivity trainingEffectDetailActivity = (TrainingEffectDetailActivity) obj2;
                f.a aVar6 = (f.a) obj;
                TrainingEffectDetailActivity.a aVar7 = TrainingEffectDetailActivity.f40000v;
                aVar6.getClass();
                if (aVar6.f67585a == -1) {
                    trainingEffectDetailActivity.setResult(-1);
                    Intent intent = aVar6.f67586b;
                    if (intent != null) {
                        l2.f37135b.getClass();
                        Bundle bundleA = l2.a.a(intent);
                        if ((bundleA != null ? bundleA.getBoolean("GCM_extra_activity_updated") : false) && (lVar = trainingEffectDetailActivity.f40018q) != null) {
                            trainingEffectDetailActivity.showProgressOverlay();
                            ge1.b.T(o53.f0.w(trainingEffectDetailActivity), null, null, new t61.l(trainingEffectDetailActivity, lVar, null), 3);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 19:
                t70.q qVar = (t70.q) obj2;
                String str2 = (String) obj;
                str2.getClass();
                if (str2.equals("MenuSave")) {
                    qVar.getClass();
                    ge1.b.T(androidx.lifecycle.v1.a(qVar), null, null, new t70.r(qVar, null), 3);
                }
                return Unit.INSTANCE;
            case 20:
                t70.l0 l0Var = (t70.l0) obj2;
                String str3 = (String) obj;
                str3.getClass();
                if (str3.equals("MenuSave")) {
                    ge1.b.T(androidx.lifecycle.v1.a(l0Var), null, null, new t70.o0(l0Var, null), 3);
                }
                return Unit.INSTANCE;
            case 21:
                t70.x0 x0Var = (t70.x0) obj2;
                String str4 = (String) obj;
                str4.getClass();
                if (str4.equals("MenuSave")) {
                    ge1.b.T(androidx.lifecycle.v1.a(x0Var), null, null, new t70.z0(x0Var, null), 3);
                }
                return Unit.INSTANCE;
            case 22:
                t82.a aVar8 = (t82.a) obj2;
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                String str5 = aVar8.f163159b;
                if (str5 == null) {
                    str5 = aVar8.f163158a;
                }
                p5.h0.n(k0Var, str5);
                return Unit.INSTANCE;
            case 23:
                ub0.a aVar9 = (ub0.a) obj;
                aVar9.getClass();
                ((tb0.q) obj2).A4(aVar9);
                return Unit.INSTANCE;
            case 24:
                tb0.x xVar = (tb0.x) obj2;
                Context context = (Context) obj;
                context.getClass();
                LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.setImageAssetsFolder("images/");
                String str6 = xVar.f163725b;
                String str7 = xVar.f163727d;
                if (g22.n.d(str6)) {
                    lottieAnimationView.setAnimationFromJson(xVar.f163725b, null);
                }
                if (g22.n.d(str7)) {
                    lottieAnimationView.setMinAndMaxFrame(str7);
                }
                if (xVar.f163726c != null) {
                    lottieAnimationView.setImageAssetDelegate(new r22.a(xVar, 18));
                }
                return lottieAnimationView;
            case 25:
                ub0.l lVar5 = (ub0.l) obj2;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) obj;
                lottieAnimationView2.getClass();
                int i18 = lVar5 != null ? tb0.l.b.f163646a[lVar5.ordinal()] : -1;
                if (i18 == 1) {
                    lottieAnimationView2.pauseAnimation();
                } else if (i18 != 2) {
                    lottieAnimationView2.playAnimation();
                } else {
                    lottieAnimationView2.resumeAnimation();
                }
                return Unit.INSTANCE;
            case 26:
                ub0.a aVar10 = (ub0.a) obj;
                aVar10.getClass();
                p2 p2Var = ((tb0.y) obj2).f163733e;
                int i19 = tb0.y.a.f163735a[aVar10.ordinal()];
                if (i19 == 1) {
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, ub0.l.PLAYING));
                } else if (i19 == 2) {
                    do {
                        value2 = p2Var.getValue();
                    } while (!p2Var.b(value2, ub0.l.PAUSED));
                } else if (i19 == 3) {
                    do {
                        value3 = p2Var.getValue();
                    } while (!p2Var.b(value3, ub0.l.RESUMED));
                }
                return Unit.INSTANCE;
            case 27:
                HealthSnapshotActivity healthSnapshotActivity = (HealthSnapshotActivity) obj2;
                String str8 = (String) obj;
                HealthSnapshotActivity.a aVar11 = HealthSnapshotActivity.f29015d;
                sn.h hVar = healthSnapshotActivity.ea().x4().getValue().f165466a;
                if (hVar != null && !p005kotlin.jvm.internal.s.g(hVar.getActivityName(), str8)) {
                    healthSnapshotActivity.ea().A4(new com.garmin.android.apps.connectmobile.activities.health.presentation.b.e(hVar.d(), hVar.getCalendarDate(), str8));
                }
                return Unit.INSTANCE;
            case 28:
                tn.v vVar = (tn.v) obj2;
                int i24 = tn.v.f165500h;
                ((tn.s) obj).getClass();
                return new tn.s(yc.o.a(new t2(new u2(20, 0, false, 0, 0, 0, 62, null), null, new sg0.w0(vVar, 24), 2, null).f196485a, androidx.lifecycle.v1.a(vVar)));
            default:
                com.garmin.android.apps.connectmobile.activities.health.presentation.e eVar3 = (com.garmin.android.apps.connectmobile.activities.health.presentation.e) obj2;
                tn.g gVar = (tn.g) obj;
                int i25 = com.garmin.android.apps.connectmobile.activities.health.presentation.e.f29058j;
                gVar.getClass();
                return tn.g.a(gVar, null, yc.o.a(new t2(new u2(20, 0, false, 0, 0, 0, 62, null), null, new sg0.w0(eVar3, 25), 2, null).f196485a, androidx.lifecycle.v1.a(eVar3)), 1);
        }
    }
}
