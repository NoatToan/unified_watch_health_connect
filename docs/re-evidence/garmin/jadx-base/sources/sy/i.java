package sy;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.v1;
import androidx.recyclerview.widget.RecyclerView;
import aq.s1;
import c.q;
import c83.a0;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.draggableimagepreviewer.DraggableImagePreviewer;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.performance.stats.TrainingEffectDetailActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.viewbinder.BenchmarkExerciseOneRepMaxView;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsFragment;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.SettableFuture;
import e13.o;
import fg0.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import l72.i3;
import lc.u0;
import mz1.e0;
import o13.p;
import o53.j0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Weeks;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import org.slf4j.Marker;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p5.h0;
import p5.k0;
import q03.r;
import s21.n;
import t21.u;
import ta0.g1;
import ta0.p0;
import ta0.q0;
import tn2.i0;
import tn2.t;
import tn2.w;
import tn2.x0;
import tn2.y0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f161177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f161178c;

    public /* synthetic */ i(w wVar, ul2.c cVar, byte[] bArr) {
        this.f161176a = 15;
        this.f161177b = cVar;
        this.f161178c = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x020c  */
    /* JADX WARN: Code duplicated, block: B:132:0x027a  */
    /* JADX WARN: Code duplicated, block: B:134:0x027e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0285  */
    /* JADX WARN: Code duplicated, block: B:139:0x028b  */
    /* JADX WARN: Code duplicated, block: B:141:0x028f  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:176:0x0310  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        ef0.e eVar;
        byte[] bArrQ;
        xw1.d dVar;
        List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar;
        List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list2;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar2;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.f> list3;
        GCMComplexTwoLineButton gCMComplexTwoLineButton;
        View view2;
        p pVar;
        String string;
        GCMComplexTwoLineButton gCMComplexTwoLineButton2;
        int i14 = this.f161176a;
        int i15 = 29;
        int i16 = 5;
        int i17 = 6;
        int i18 = 8;
        int i19 = 10;
        int i24 = 3;
        int i25 = 2;
        int i26 = 0;
        int i27 = 1;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = this.f161178c;
        Object obj5 = this.f161177b;
        switch (i14) {
            case 0:
                e23.l lVar = (e23.l) obj5;
                k kVar = (k) obj4;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (s.g(i3Var.f111063a, "HELP")) {
                    lVar.invoke(kVar.f161184e);
                }
                return Unit.INSTANCE;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((e23.p) obj5).invoke(Integer.valueOf(((s21.i) obj4).f156125a), bool);
                return Unit.INSTANCE;
            case 2:
                ((e23.p) obj5).invoke(Integer.valueOf(((s21.j) obj4).f156129a), Integer.valueOf((int) ((Float) obj).floatValue()));
                return Unit.INSTANCE;
            case 3:
                String str = (String) obj;
                str.getClass();
                ((e23.p) obj5).invoke((n) obj4, str);
                return Unit.INSTANCE;
            case 4:
                ((CustomLineChart) obj).getClass();
                qz.a.b((tz.a) obj5, (ClimbDTO) obj4, "", 4);
                return Unit.INSTANCE;
            case 5:
                k0 k0Var = (k0) obj;
                int i28 = BenchmarkExerciseOneRepMaxView.f48406i;
                k0Var.getClass();
                Context context = ((BenchmarkExerciseOneRepMaxView) obj4).getContext();
                context.getClass();
                h0.n(k0Var, oi0.c.A(context, new u(i15), (String) obj5));
                return Unit.INSTANCE;
            case 6:
                t53.b bVar3 = (t53.b) obj5;
                SettableFuture<Object> settableFuture = bVar3.f162557b;
                j0 j0Var = (j0) obj4;
                Throwable th3 = (Throwable) obj;
                if (th3 == null) {
                    settableFuture.set(j0Var.W());
                } else if (th3 instanceof CancellationException) {
                    settableFuture.set(new t53.a((CancellationException) th3));
                } else if (settableFuture.setException(th3)) {
                    bVar3.f162558c = true;
                }
                return Unit.INSTANCE;
            case 7:
                q qVar = (q) obj5;
                TrainingEffectDetailActivity trainingEffectDetailActivity = (TrainingEffectDetailActivity) obj4;
                long jLongValue = ((Long) obj).longValue();
                TrainingEffectDetailActivity.a aVar = TrainingEffectDetailActivity.f40000v;
                aq.b bVar4 = new aq.b();
                bVar4.f11823b = jLongValue;
                am.h hVar = am.h.VIEW_EDIT;
                if (hVar != null) {
                    bVar4.f11824c = hVar;
                }
                qVar.a(bVar4.a(trainingEffectDetailActivity), null);
                return Unit.INSTANCE;
            case 8:
                q0 q0Var = (q0) obj5;
                q qVar2 = (q) obj4;
                Map map = (Map) obj;
                map.getClass();
                j22.b.f96736a.getClass();
                j22.h hVarF = j22.b.F(map);
                p0.c("onActivityResult: requestBluetoothPermissionLauncher bluetoothPermissionStatus[" + hVarF + "]");
                int i29 = p0.a.f163418b[hVarF.ordinal()];
                if (i29 == 1) {
                    q0Var.x4();
                } else if (i29 != 2) {
                    p0.c("onActivityResult: requestBluetoothPermissionLauncher bluetooth permission denied");
                } else {
                    p0.d(qVar2);
                }
                return Unit.INSTANCE;
            case 9:
                ta0.k0 k0Var2 = (ta0.k0) obj5;
                yl2.b bVar5 = (yl2.b) obj;
                bVar5.getClass();
                l90.b bVar6 = ((va0.b.C3294b) ((va0.b) obj4)).f176573b;
                k0Var2.getClass();
                bVar6.getClass();
                ge1.b.T(v1.a(k0Var2), null, null, new ta0.j0(k0Var2, bVar5, bVar6, null), 3);
                return Unit.INSTANCE;
            case 10:
                nv.e eVar2 = (nv.e) obj;
                eVar2.getClass();
                g1.b((e23.p) obj4, (Context) obj5, eVar2);
                return Unit.INSTANCE;
            case 11:
                ub0.l lVar2 = (ub0.l) obj5;
                tb0.p pVar2 = (tb0.p) obj4;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
                lottieAnimationView.getClass();
                int i30 = lVar2 != null ? tb0.e.b.f163619a[lVar2.ordinal()] : -1;
                if (i30 == 1) {
                    lottieAnimationView.pauseAnimation();
                } else if (i30 == 2) {
                    lottieAnimationView.resumeAnimation();
                } else if (pVar2.f163668a) {
                    int i34 = pVar2.f163671d;
                    lottieAnimationView.setMinAndMaxFrame(i34, i34);
                } else {
                    lottieAnimationView.setMinAndMaxFrame(pVar2.f163676i, pVar2.f163677j);
                    lottieAnimationView.playAnimation();
                }
                return Unit.INSTANCE;
            case 12:
                e23.l lVar3 = (e23.l) obj5;
                ImageView imageView = (ImageView) obj;
                imageView.getClass();
                jt2.a aVarC = ((hv.a) obj4).c(0);
                if (aVarC != null) {
                    aVarC.f100855a = new s1(lVar3, 15);
                    imageView.setImageDrawable(aVarC);
                    aVarC.a(500);
                }
                return Unit.INSTANCE;
            case 13:
                ef0.b bVar7 = (ef0.b) obj5;
                tm0.c cVar = (tm0.c) obj4;
                g3 g3Var = (g3) obj;
                int i35 = tm0.c.f165349i;
                g3Var.getClass();
                int i36 = tm0.c.b.f165358a[g3Var.f35300a.ordinal()];
                if (i36 == 1) {
                    eVar = ef0.e.SUCCESS;
                } else if (i36 == 2) {
                    String string2 = cVar.getString(R.string.social_photo_upload_retry_message);
                    string2.getClass();
                    cVar.y6(string2, false);
                    a2 a2Var = a2.GENERAL;
                    String strD = com.airbnb.lottie.animation.keyframe.a.d(g3Var.f35303d, "Upload image failed with exception: ");
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "CreatePostFragment", strD);
                    eVar = ef0.e.ERROR;
                } else {
                    if (i36 != 3) {
                        u0.r();
                        return null;
                    }
                    eVar = ef0.e.LOADING;
                }
                bVar7.getClass();
                eVar.getClass();
                bVar7.f63940b = eVar;
                DraggableImagePreviewer draggableImagePreviewer = cVar.f165352c;
                if (draggableImagePreviewer == null) {
                    s.m("photoPicker");
                    throw null;
                }
                com.garmin.android.apps.connectmobile.draggableimagepreviewer.a aVar2 = draggableImagePreviewer.f34728a;
                aVar2.getClass();
                ArrayList arrayList = aVar2.f34731b;
                int iIndexOf = arrayList.indexOf(bVar7);
                if (iIndexOf > -1) {
                    aVar2.notifyItemChanged(iIndexOf);
                    ef0.d dVar2 = aVar2.f34733d;
                    if (dVar2 != null) {
                        dVar2.a(p13.h0.b1(arrayList));
                    }
                }
                return Unit.INSTANCE;
            case 14:
                r0 r0Var = (r0) obj5;
                com.garmin.android.apps.connectmobile.activities.health.presentation.c cVar2 = (com.garmin.android.apps.connectmobile.activities.health.presentation.c) obj4;
                String str2 = (String) obj;
                int i37 = com.garmin.android.apps.connectmobile.activities.health.presentation.c.f29045e;
                str2.getClass();
                sn.h hVar2 = (sn.h) r0Var.f105810a;
                String strD2 = hVar2 != null ? hVar2.d() : null;
                sn.h hVar3 = (sn.h) r0Var.f105810a;
                String calendarDate = hVar3 != null ? hVar3.getCalendarDate() : null;
                if (strD2 != null && calendarDate != null) {
                    cVar2.f29046a.A4(new com.garmin.android.apps.connectmobile.activities.health.presentation.b.f(strD2, calendarDate, str2));
                }
                return Unit.INSTANCE;
            case 15:
                ul2.c cVar3 = (ul2.c) obj5;
                byte[] bArr = (byte[]) obj4;
                Boolean bool2 = (Boolean) obj;
                Logger logger = w.f165679d;
                bool2.getClass();
                if (!bool2.booleanValue()) {
                    return r.f(Boolean.FALSE);
                }
                pn2.a.f138690a.getClass();
                switch (w.g.f165730b[pn2.a.e().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        tn2.f.f165551a.getClass();
                        byte[] bArrA = hb2.d.a("1006");
                        bArrA.getClass();
                        byte[] bArrQ2 = p13.s.q(bArrA, bArr);
                        byte[] bArrA2 = hb2.d.a("018F10018000");
                        bArrA2.getClass();
                        bArrQ = p13.s.q(bArrQ2, bArrA2);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        tn2.f.f165551a.getClass();
                        byte[] bArrA3 = hb2.d.a("1006");
                        bArrA3.getClass();
                        byte[] bArrQ3 = p13.s.q(bArrA3, bArr);
                        byte[] bArrA4 = hb2.d.a("010BAA018000");
                        bArrA4.getClass();
                        bArrQ = p13.s.q(bArrQ3, bArrA4);
                        break;
                    default:
                        u0.r();
                        return null;
                }
                o oVarM = as2.h.m(cVar3, w.q(bArrQ), "");
                r22.a aVar3 = new r22.a(new tn2.m(i26), 28);
                int i38 = w03.b.f181178a;
                return new o(oVarM, aVar3);
            case 16:
                byte[] bArr2 = (byte[]) obj4;
                byte[] bArr3 = (byte[]) obj;
                Logger logger2 = w.f165679d;
                bArr3.getClass();
                bArr2.getClass();
                return new w.e((w.e.a) obj5, bArr2, bArr3);
            case 17:
                String str3 = (String) obj5;
                ps2.n nVar = (ps2.n) obj4;
                Optional optional = (Optional) obj;
                Logger logger3 = w.f165679d;
                optional.getClass();
                if (optional.isPresent()) {
                    byte[] bArr4 = ((hs2.c) optional.get()).f85441a;
                    byte[] bytes = str3.getBytes(d53.c.f57666b);
                    bytes.getClass();
                    if (Arrays.equals(bArr4, bytes)) {
                        ps2.g gVar = new ps2.g(nVar, i25);
                        int i39 = w03.b.f181178a;
                        return new z03.d(gVar);
                    }
                }
                return z03.f.f200765a;
            case 18:
                w.d dVar3 = (w.d) obj5;
                w wVar = (w) obj4;
                ul2.c cVar4 = (ul2.c) obj;
                Logger logger4 = w.f165679d;
                cVar4.getClass();
                e13.n nVarF = r.f(new w.f(null, null, null, null, null, null, null, null, null, null, 1023, null));
                tn2.n nVar2 = new tn2.n(new tn2.q(dVar3, wVar, cVar4, i26), 11);
                int i44 = w03.b.f181178a;
                return new e13.h(new e13.j(new e13.j(new e13.j(new e13.j(new e13.j(new e13.j(new e13.j(new e13.j(new e13.j(nVarF, nVar2), new tn2.n(new tn2.r(dVar3, wVar, cVar4, i25), 12)), new tn2.n(new tn2.q(dVar3, wVar, cVar4, i24), 14)), new tn2.n(new tn2.q(dVar3, wVar, cVar4, 4), 15)), new tn2.n(new tn2.r(dVar3, wVar, cVar4, i24), 16)), new tn2.n(new tn2.q(dVar3, wVar, cVar4, i27), 7)), new tn2.n(new tn2.r(dVar3, wVar, cVar4, i26), i18)), new tn2.n(new tn2.q(dVar3, wVar, cVar4, i25), 9)), new tn2.n(new tn2.r(dVar3, wVar, cVar4, i27), i19)), new hq2.c(cVar4, i17));
            case 19:
                com.garmin.device.nfc.h[] hVarArr = (com.garmin.device.nfc.h[]) obj;
                Logger logger5 = tn2.r0.f165631n;
                hVarArr.getClass();
                com.garmin.device.nfc.h[] hVarArr2 = (com.garmin.device.nfc.h[]) p13.s.t(hVarArr, tn2.r0.p((rn2.i) obj4));
                e13.p pVarB = ks2.e.b(((tn2.r0) obj5).f165632a.f165680a);
                tn2.n nVar3 = new tn2.n(new t(hVarArr2, i26), 24);
                int i45 = w03.b.f181178a;
                return new e13.k(pVarB, nVar3);
            case 20:
                e23.l lVar4 = (e23.l) obj5;
                tn2.r0 r0Var2 = (tn2.r0) obj4;
                rn2.p pVar3 = (rn2.p) obj;
                Logger logger6 = tn2.r0.f165631n;
                pVar3.getClass();
                lVar4.invoke(70);
                rn2.i iVarB = pVar3.getCardInfo();
                iVarB.getClass();
                a73.h hVar4 = new a73.h(r0Var2, i19);
                int i46 = w03.b.f181178a;
                z03.a aVarD = new e13.k(new e13.j(new e13.m(hVar4), new tn2.k0(new i0(r0Var2, i27), i16)), new tn2.k0(new rp.b(lVar4, i15, r0Var2, iVarB), 28)).d(new z03.h(new p62.e(r0Var2, i19, iVarB, lVar4)));
                w03.b.a(iVarB, "completionValue is null");
                return new z03.s(aVarD, null, iVarB);
            case 21:
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                return ((tn2.r0.d) obj5).e(a0Var, (String) obj4);
            case 22:
                y0 y0Var = (y0) obj5;
                List list4 = (List) obj;
                Logger logger7 = y0.f165733f;
                list4.getClass();
                Logger logger8 = y0.f165733f;
                logger8.trace("Device card list fetched");
                logger8.trace("start evaluateCardStatus");
                com.airbnb.lottie.k kVar2 = new com.airbnb.lottie.k(((rn2.j) obj4).b(), i16, list4, y0Var);
                int i47 = w03.b.f181178a;
                return new e13.k(new e13.b(kVar2), new tn2.p0(new x0(y0Var, i26), 17));
            case 23:
                fj2.a aVar4 = (fj2.a) obj5;
                PaymentCardDetailsFragment paymentCardDetailsFragment = (PaymentCardDetailsFragment) obj4;
                fj2.h hVar5 = (fj2.h) obj;
                Logger logger9 = PaymentCardDetailsFragment.f52189m;
                if (hVar5 == null) {
                    return Unit.INSTANCE;
                }
                if (aVar4 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    String strD3 = hVar5.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String();
                    if (strD3 != null) {
                        sb3.append(Marker.ANY_NON_NULL_MARKER);
                        sb3.append(strD3);
                    }
                    sb3.append(StringUtils.SPACE);
                    String strG = hVar5.getPhoneNumber();
                    if (strG != null) {
                        sb3.append(strG);
                    }
                    aVar4.f71862q = sb3.toString();
                }
                RecyclerView recyclerView = paymentCardDetailsFragment.f52200k;
                if (recyclerView == null) {
                    s.m("recyclerView");
                    throw null;
                }
                RecyclerView.h adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    RecyclerView recyclerView2 = paymentCardDetailsFragment.f52200k;
                    if (recyclerView2 == null) {
                        s.m("recyclerView");
                        throw null;
                    }
                    RecyclerView.h adapter2 = recyclerView2.getAdapter();
                    adapter.notifyItemChanged((adapter2 != null ? adapter2.getItemCount() : 1) - 1);
                }
                return Unit.INSTANCE;
            case 24:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar5 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.a) obj5;
                g3 g3Var2 = (g3) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                if (zBooleanValue) {
                    androidx.fragment.app.m activity = aVar5.getActivity();
                    if (activity != null) {
                        e0 e0VarZ6 = aVar5.z6();
                        x xVar = e0VarZ6.f204394k;
                        e0VarZ6.f204394k = xVar != null ? x.b(xVar, null, null, null, null, null, null, null, Boolean.TRUE, 511) : null;
                        TrainingInitiativeEventActivity.a aVar6 = TrainingInitiativeEventActivity.f45718o;
                        x xVar2 = aVar5.z6().f204394k;
                        aVar6.getClass();
                        Intent intent = new Intent(activity, (Class<?>) TrainingInitiativeEventActivity.class);
                        Bundle bundle = new Bundle();
                        am.a2.b(bundle, "extra_garmin_coach_dto", xVar2);
                        bundle.putBoolean("GCM_extra_is_garmin_coach_flow", true);
                        intent.putExtras(bundle);
                        activity.startActivityForResult(intent, 150);
                        activity.setResult(-1);
                        activity.finish();
                    }
                } else {
                    e0 e0VarZ7 = aVar5.z6();
                    x xVar3 = aVar5.z6().f204394k;
                    long athletePlanId = (xVar3 == null || (dVar = xVar3.f71372h) == null) ? -1L : dVar.getAthletePlanId();
                    gg0.d dVar4 = (gg0.d) g3Var2.f35301b;
                    if (dVar4 == null) {
                        dVar4 = gg0.d.DELETED;
                    }
                    e0VarZ7.R4(athletePlanId, true, dVar4);
                }
                return Unit.INSTANCE;
            case 25:
                my1.h hVar6 = (my1.h) obj5;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d dVar5 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.d) obj4;
                long jLongValue2 = ((Long) obj).longValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.d.f45888e;
                if (hVar6 != null && (list = hVar6.f121520d) != null) {
                    for (Object obj6 : list) {
                        Long l14 = ((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) obj6).f39764a;
                        if (l14 != null && l14.longValue() == jLongValue2) {
                            obj3 = obj6;
                            bVar = (com.garmin.android.apps.connectmobile.pacepro.data.dto.b) obj3;
                            if (bVar != null) {
                                jy1.b bVar8 = dVar5.f45890b;
                                androidx.fragment.app.m mVarRequireActivity = dVar5.requireActivity();
                                mVarRequireActivity.getClass();
                                bVar8.l(mVarRequireActivity, bVar);
                            }
                        }
                    }
                    bVar = (com.garmin.android.apps.connectmobile.pacepro.data.dto.b) obj3;
                    if (bVar != null) {
                        jy1.b bVar9 = dVar5.f45890b;
                        androidx.fragment.app.m mVarRequireActivity2 = dVar5.requireActivity();
                        mVarRequireActivity2.getClass();
                        bVar9.l(mVarRequireActivity2, bVar);
                    }
                }
                return Unit.INSTANCE;
            case 26:
                my1.f fVar = (my1.f) obj5;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d dVar6 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.d) obj4;
                long jLongValue3 = ((Long) obj).longValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.d.f45888e;
                if (fVar != null && (list2 = fVar.f121508a) != null) {
                    for (Object obj7 : list2) {
                        Long l15 = ((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) obj7).f39764a;
                        if (l15 != null && l15.longValue() == jLongValue3) {
                            obj2 = obj7;
                            bVar2 = (com.garmin.android.apps.connectmobile.pacepro.data.dto.b) obj2;
                            if (bVar2 != null) {
                                jy1.b bVar10 = dVar6.f45890b;
                                androidx.fragment.app.m mVarRequireActivity3 = dVar6.requireActivity();
                                mVarRequireActivity3.getClass();
                                bVar10.l(mVarRequireActivity3, bVar2);
                            }
                        }
                    }
                    bVar2 = (com.garmin.android.apps.connectmobile.pacepro.data.dto.b) obj2;
                    if (bVar2 != null) {
                        jy1.b bVar11 = dVar6.f45890b;
                        androidx.fragment.app.m mVarRequireActivity4 = dVar6.requireActivity();
                        mVarRequireActivity4.getClass();
                        bVar11.l(mVarRequireActivity4, bVar2);
                    }
                }
                return Unit.INSTANCE;
            case 27:
                fg0.k kVar3 = (fg0.k) obj5;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar3 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.e) obj4;
                ww1.g gVar2 = (ww1.g) obj;
                if (gVar2 == null || !gVar2.f187763a) {
                    rt1.q qVar3 = rt1.q.f154552a;
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                    list3 = eVar3.w6().J1;
                    qVar3.getClass();
                    if (rt1.q.a(kVar3, list3) || gVar2 == null) {
                        gCMComplexTwoLineButton = eVar3.f45930b;
                        if (gCMComplexTwoLineButton == null) {
                            s.m("mGarminCoachPlans");
                            throw null;
                        }
                        gCMComplexTwoLineButton.setVisibility(8);
                        view2 = eVar3.f45931c;
                        if (view2 == null) {
                            s.m("listSpacer");
                            throw null;
                        }
                        view2.setVisibility(8);
                    } else {
                        eVar3.f45939k = gVar2;
                        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = eVar3.f45930b;
                        if (gCMComplexTwoLineButton3 == null) {
                            s.m("mGarminCoachPlans");
                            throw null;
                        }
                        gCMComplexTwoLineButton3.setButtonTopLabel(eVar3.getString(R.string.lbl_adaptive_training_plan));
                        Drawable drawable = a7.b.getDrawable(eVar3.requireContext(), R.drawable.plus);
                        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
                        if (drawableMutate != null) {
                            drawableMutate.setTint(a7.b.getColor(eVar3.requireContext(), R.color.gcm_icon_primary_action));
                        }
                        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = eVar3.f45930b;
                        if (gCMComplexTwoLineButton4 == null) {
                            s.m("mGarminCoachPlans");
                            throw null;
                        }
                        gCMComplexTwoLineButton4.setRightIcon(drawableMutate);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = eVar3.f45930b;
                        if (gCMComplexTwoLineButton5 == null) {
                            s.m("mGarminCoachPlans");
                            throw null;
                        }
                        gCMComplexTwoLineButton5.setVisibility(0);
                        View view3 = eVar3.f45931c;
                        if (view3 == null) {
                            s.m("listSpacer");
                            throw null;
                        }
                        view3.setVisibility(0);
                    }
                } else {
                    fg0.j eventCustomization = kVar3.getEventCustomization();
                    Long trainingPlanId = eventCustomization != null ? eventCustomization.getTrainingPlanId() : null;
                    Long l16 = gVar2.f187764b;
                    ww1.i iVar = gVar2.f187765c;
                    if (s.g(trainingPlanId, l16)) {
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar10 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                        eVar3.getClass();
                        xw1.d dVar7 = gVar2.f187766d;
                        if (iVar != null ? iVar.k() : dVar7 != null ? dVar7.a0() : false) {
                            GCMComplexTwoLineButton gCMComplexTwoLineButton6 = eVar3.f45930b;
                            if (gCMComplexTwoLineButton6 == null) {
                                s.m("mGarminCoachPlans");
                                throw null;
                            }
                            gCMComplexTwoLineButton6.setRightIcon(eVar3.v6());
                            string = eVar3.getString(R.string.lbl_completed);
                        } else {
                            int i48 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c;
                            if (dVar7 != null) {
                                DateTime dateTimeNow = DateTime.now();
                                dateTimeNow.getClass();
                                pVar = new p(Integer.valueOf(dVar7.j(i48, dateTimeNow)), Integer.valueOf(dVar7.A(i48)));
                            } else if (iVar != null) {
                                DateTime startDate = iVar.getStartDate();
                                if (startDate == null) {
                                    startDate = DateTime.now();
                                }
                                DateTime dateTimeD = iVar.d();
                                fy1.i.a aVar11 = fy1.i.f73924a;
                                startDate.getClass();
                                DateTime dateTimeNow2 = DateTime.now();
                                dateTimeNow2.getClass();
                                aVar11.getClass();
                                fy1.a.f73883a.getClass();
                                pVar = new p(Integer.valueOf(fy1.a.C1500a.a(i48, startDate, dateTimeNow2)), Integer.valueOf(Weeks.weeksBetween(g22.k.o(i48, startDate), dateTimeD != null ? g22.k.b(i48, dateTimeD) : null).getWeeks() + 1));
                            } else {
                                pVar = null;
                            }
                            string = pVar != null ? eVar3.getString(R.string.week_num_of_num, String.valueOf(((Number) pVar.f128594a).intValue()), String.valueOf(((Number) pVar.f128595b).intValue())) : "";
                        }
                        string.getClass();
                        GCMComplexTwoLineButton gCMComplexTwoLineButton7 = eVar3.f45930b;
                        if (gCMComplexTwoLineButton7 == null) {
                            s.m("mGarminCoachPlans");
                            throw null;
                        }
                        String strB = gVar2.b();
                        gCMComplexTwoLineButton7.setButtonBottomLeftLabel(eVar3.getString(R.string.string_space_dot_space_string_pattern, strB != null ? strB : "", string));
                        GCMComplexTwoLineButton gCMComplexTwoLineButton8 = eVar3.f45930b;
                        if (gCMComplexTwoLineButton8 == null) {
                            s.m("mGarminCoachPlans");
                            throw null;
                        }
                        gCMComplexTwoLineButton8.setRightIcon(null);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton9 = eVar3.f45930b;
                        if (gCMComplexTwoLineButton9 == null) {
                            s.m("mGarminCoachPlans");
                            throw null;
                        }
                        gCMComplexTwoLineButton9.setVisibility(0);
                        View view4 = eVar3.f45931c;
                        if (view4 == null) {
                            s.m("listSpacer");
                            throw null;
                        }
                        view4.setVisibility(0);
                        fg0.k kVar4 = eVar3.f45937i;
                        if (kVar4 == null) {
                            s.m("eventDTO");
                            throw null;
                        }
                        fg0.j eventCustomization2 = kVar4.getEventCustomization();
                        if ((eventCustomization2 != null && eventCustomization2.t()) == true) {
                            gCMComplexTwoLineButton2 = eVar3.f45933e;
                            if (gCMComplexTwoLineButton2 != null) {
                                s.m("mEditEventGoal");
                                throw null;
                            }
                            gCMComplexTwoLineButton2.setOnClickListener(null);
                        } else {
                            fg0.k kVar5 = eVar3.f45937i;
                            if (kVar5 == null) {
                                s.m("eventDTO");
                                throw null;
                            }
                            fg0.j eventCustomization3 = kVar5.getEventCustomization();
                            if (eventCustomization3 != null && eventCustomization3.u()) {
                                i26 = 1;
                            }
                            if (i26 != 0 || eVar3.w6().f204395l) {
                                gCMComplexTwoLineButton2 = eVar3.f45933e;
                                if (gCMComplexTwoLineButton2 != null) {
                                    s.m("mEditEventGoal");
                                    throw null;
                                }
                                gCMComplexTwoLineButton2.setOnClickListener(null);
                            }
                        }
                    } else {
                        rt1.q qVar4 = rt1.q.f154552a;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                        list3 = eVar3.w6().J1;
                        qVar4.getClass();
                        if (rt1.q.a(kVar3, list3)) {
                            gCMComplexTwoLineButton = eVar3.f45930b;
                            if (gCMComplexTwoLineButton == null) {
                                s.m("mGarminCoachPlans");
                                throw null;
                            }
                            gCMComplexTwoLineButton.setVisibility(8);
                            view2 = eVar3.f45931c;
                            if (view2 == null) {
                                s.m("listSpacer");
                                throw null;
                            }
                            view2.setVisibility(8);
                        } else {
                            gCMComplexTwoLineButton = eVar3.f45930b;
                            if (gCMComplexTwoLineButton == null) {
                                s.m("mGarminCoachPlans");
                                throw null;
                            }
                            gCMComplexTwoLineButton.setVisibility(8);
                            view2 = eVar3.f45931c;
                            if (view2 == null) {
                                s.m("listSpacer");
                                throw null;
                            }
                            view2.setVisibility(8);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 28:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.k kVar6 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.k) obj4;
                e23.l lVar5 = (e23.l) obj5;
                Long l17 = (Long) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                if (l17 != null) {
                    kVar6.C6().D6(Integer.valueOf((int) l17.longValue()));
                }
                lVar5.invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var2 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.a0) obj5;
                View view5 = (View) obj4;
                fw.m mVar = (fw.m) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                fw.p pVar4 = mVar.f73769b;
                List list5 = (List) mVar.f73770c;
                int i49 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.b.f45826a[pVar4.ordinal()];
                if (i49 == 1) {
                    g22.e.f(a0Var2);
                    ((androidx.lifecycle.y0) a0Var2.F6().f46405e1.getValue()).m(list5);
                    a0Var2.H1 = a0Var2.f45783e;
                    a0Var2.K6(view5);
                } else if (i49 == 2) {
                    g22.e.f(a0Var2);
                    g22.e.c(a0Var2);
                } else {
                    if (i49 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.l(a0Var2);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(Object obj, e23.l lVar, int i14) {
        this.f161176a = i14;
        this.f161178c = obj;
        this.f161177b = lVar;
    }

    public /* synthetic */ i(int i14, Object obj, Object obj2) {
        this.f161176a = i14;
        this.f161177b = obj;
        this.f161178c = obj2;
    }
}
