package wd2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.MultisportEditLegsActivity;
import com.garmin.android.apps.connectmobile.consent.PopularityRoutingConsentActivity;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.devices.settings.dynamic.DSLSettingsException;
import com.garmin.android.apps.connectmobile.feedback.FeedbackActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingSessionDTO;
import com.garmin.android.apps.connectmobile.golf.truswing.view.SwingAnimationControlView;
import com.garmin.android.apps.connectmobile.golf.truswing.view.SwingSeekBar;
import com.garmin.android.apps.connectmobile.hydration.presentation.settings.HydrationGoalSettingsActivity;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.PowerZonesListActivity;
import com.garmin.android.apps.connectmobile.smartscale.ScaleInvitationDeclineActivity;
import com.garmin.android.apps.connectmobile.smartscale.ScaleInvitationGetStartedActivity;
import com.garmin.android.apps.connectmobile.training.atp.create.edit.ATPEditActivity;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import com.garmin.android.library.livetrack.LivetrackService;
import com.garmin.android.library.livetrack.LivetrackService.c;
import com.garmin.feature.garminpay.providers.gpay.ui.onboarding.NewDeviceOnBoardingActivity;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h0 implements androidx.lifecycle.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f184487b;

    public /* synthetic */ h0(Object obj, int i14) {
        this.f184486a = i14;
        this.f184487b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:170:0x0407  */
    /* JADX WARN: Code duplicated, block: B:173:0x041c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0443  */
    /* JADX WARN: Code duplicated, block: B:176:0x0480  */
    /* JADX WARN: Code duplicated, block: B:178:0x0483  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) throws DSLSettingsException {
        int iK;
        boolean z14;
        Boolean hydrationAutoGoalEnabled;
        Double baseGoalInML;
        String displayName;
        com.garmin.android.apps.connectmobile.devices.a aVar;
        li2.f cVar;
        boolean z15;
        boolean z16;
        boolean z17;
        Bundle arguments;
        zb0.u0 u0Var;
        Context contextC;
        com.garmin.android.apps.connectmobile.x xVarA;
        int i14 = this.f184486a;
        final int i15 = 1;
        Object obj2 = this.f184487b;
        switch (i14) {
            case 0:
                LivetrackService livetrackService = (LivetrackService) obj2;
                androidx.lifecycle.w0<ge2.e> w0Var = livetrackService.f50169i;
                ge2.e eVar = (ge2.e) obj;
                if (eVar != null && !eVar.equals(w0Var.d())) {
                    ge1.b.T(livetrackService, null, null, livetrackService.new c(eVar, null), 3);
                }
                w0Var.m(eVar);
                return;
            case 1:
                com.garmin.android.library.livetrack.d dVar = (com.garmin.android.library.livetrack.d) obj;
                int i16 = g1.f184468k;
                dVar.getClass();
                ((g1) obj2).f184473e.m(dVar);
                return;
            case 2:
                com.garmin.android.apps.connectmobile.golf.truswing.a aVar2 = (com.garmin.android.apps.connectmobile.golf.truswing.a) obj2;
                cl0.b bVar = aVar2.E;
                if (!(((v2) obj) instanceof v2.b)) {
                    SwingSessionDTO swingSessionDTO = aVar2.f35804z;
                    bVar.r(swingSessionDTO.f35885d, swingSessionDTO.f35887f);
                    aVar2.i7();
                    aVar2.e7();
                    return;
                }
                if (aVar2.isAdded()) {
                    aVar2.i7();
                    aVar2.e7();
                    bVar.w(aVar2.f35804z.f35885d);
                    return;
                }
                return;
            case 3:
                com.garmin.android.apps.connectmobile.golf.truswing.e eVar2 = (com.garmin.android.apps.connectmobile.golf.truswing.e) obj2;
                v2 v2Var = (v2) obj;
                s2 s2Var = eVar2.f35830b;
                if (s2Var != null) {
                    s2Var.hideProgressOverlay();
                }
                if (v2Var instanceof v2.b) {
                    eVar2.f35824n = (List) ((v2.b) v2Var).f47386a;
                    if (eVar2.f35829a) {
                        eVar2.I6();
                        return;
                    }
                    return;
                }
                if (eVar2.getActivity() != null) {
                    Toast.makeText(eVar2.getActivity(), R.string.txt_error_occurred, 0).show();
                    eVar2.getActivity().finish();
                    return;
                }
                return;
            case 4:
                wl0.d0 d0Var = (wl0.d0) obj2;
                v2 v2Var2 = (v2) obj;
                if (!(v2Var2 instanceof v2.b)) {
                    if (d0Var.getActivity() != null) {
                        Toast.makeText(d0Var.getActivity(), R.string.txt_error_occurred, 0).show();
                    }
                    ArrayList arrayList = new ArrayList(1);
                    SwingSessionDTO swingSessionDTO2 = new SwingSessionDTO();
                    swingSessionDTO2.f35885d = DateTime.now().toString();
                    swingSessionDTO2.f35886e = wl0.h.i().k();
                    arrayList.add(0, swingSessionDTO2);
                    wl0.e0 e0Var = d0Var.f185909w;
                    e0Var.f185917c = arrayList;
                    e0Var.notifyDataSetChanged();
                    d0Var.F6();
                    return;
                }
                com.garmin.android.apps.connectmobile.golf.truswing.model.m mVar = (com.garmin.android.apps.connectmobile.golf.truswing.model.m) ((v2.b) v2Var2).f47386a;
                if (d0Var.getActivity() == null) {
                    return;
                }
                ArrayList<SwingSessionDTO> arrayList2 = mVar.f35980a;
                for (SwingSessionDTO swingSessionDTO3 : arrayList2) {
                    if (DateTime.now().withTimeAtStartOfDay().equals(new DateTime(swingSessionDTO3.f35885d).withTimeAtStartOfDay())) {
                        try {
                            iK = wl0.h.i().k();
                            break;
                        } catch (Exception unused) {
                            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GOLF;
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "Today swing count is null.");
                            iK = 0;
                        }
                        if (swingSessionDTO3.f35886e < iK) {
                            swingSessionDTO3.f35886e = iK;
                        }
                        wl0.e0 e0Var2 = d0Var.f185909w;
                        e0Var2.f185917c = arrayList2;
                        e0Var2.notifyDataSetChanged();
                        d0Var.F6();
                        return;
                    }
                }
                SwingSessionDTO swingSessionDTO4 = new SwingSessionDTO();
                swingSessionDTO4.f35885d = DateTime.now().toString();
                swingSessionDTO4.f35886e = wl0.h.i().k();
                arrayList2.add(0, swingSessionDTO4);
                wl0.e0 e0Var3 = d0Var.f185909w;
                e0Var3.f185917c = arrayList2;
                e0Var3.notifyDataSetChanged();
                d0Var.F6();
                return;
            case 5:
                com.garmin.android.apps.connectmobile.golf.truswing.g gVar = (com.garmin.android.apps.connectmobile.golf.truswing.g) obj2;
                v2 v2Var3 = (v2) obj;
                if (v2Var3 instanceof v2.b) {
                    if (gVar.isAdded()) {
                        SwingSessionDTO swingSessionDTO5 = (SwingSessionDTO) ((v2.b) v2Var3).f47386a;
                        gVar.S6();
                        gVar.f35804z = swingSessionDTO5;
                        gVar.i7();
                        gVar.g7();
                        gVar.K6(swingSessionDTO5.f35886e);
                        gVar.e7();
                        gVar.h7();
                        return;
                    }
                    return;
                }
                if (gVar.isAdded()) {
                    try {
                        z14 = ((v2.a) v2Var3).f47383a instanceof NoNetworkException;
                        break;
                    } catch (Exception unused2) {
                        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GOLF;
                        String str = "Cannot get swings for session " + gVar.P;
                        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.a(a2Var2, str);
                        z14 = false;
                    }
                    gVar.F6();
                    gVar.J6(z14);
                    gVar.e7();
                    if (z14 || !gVar.isAdded() || gVar.getActivity() == null) {
                        return;
                    }
                    gVar.D.C4();
                    return;
                }
                return;
            case 6:
                com.garmin.android.apps.connectmobile.golf.truswing.h hVar = (com.garmin.android.apps.connectmobile.golf.truswing.h) obj2;
                v2 v2Var4 = (v2) obj;
                if (v2Var4 instanceof v2.b) {
                    if (!hVar.isAdded() || hVar.getActivity() == null) {
                        return;
                    }
                    SwingDTO swingDTO = (SwingDTO) ((v2.b) v2Var4).f47386a;
                    hVar.A = swingDTO;
                    if (swingDTO != null) {
                        swingDTO.f35881j = hVar.E;
                        swingDTO.f35875d = hVar.F;
                    }
                    hVar.C = true;
                    if (hVar.f35829a) {
                        hVar.A6();
                        return;
                    }
                    return;
                }
                if (!hVar.isAdded() || hVar.getActivity() == null) {
                    return;
                }
                View view2 = hVar.f35853z;
                if (view2 != null) {
                    view2.setVisibility(0);
                    hVar.f35853z.bringToFront();
                }
                SwingAnimationControlView swingAnimationControlView = hVar.f35834f;
                if (swingAnimationControlView != null) {
                    swingAnimationControlView.setEnabled(false);
                    SwingSeekBar swingSeekBar = hVar.f35834f.f36000a;
                    swingSeekBar.f36009a = null;
                    swingSeekBar.f36010b = null;
                    swingSeekBar.invalidate();
                }
                hVar.D = true;
                return;
            case 7:
                ScaleInvitationDeclineActivity scaleInvitationDeclineActivity = (ScaleInvitationDeclineActivity) obj2;
                fw.m mVar2 = (fw.m) obj;
                int i17 = ScaleInvitationDeclineActivity.f44378d;
                mVar2.getClass();
                int i18 = ScaleInvitationDeclineActivity.a.f44382a[mVar2.f73769b.ordinal()];
                if (i18 == 1) {
                    scaleInvitationDeclineActivity.showProgressOverlay();
                    return;
                }
                if (i18 == 2) {
                    scaleInvitationDeclineActivity.hideProgressOverlay();
                    scaleInvitationDeclineActivity.f44381c = Boolean.TRUE;
                    if (scaleInvitationDeclineActivity.f44380b) {
                        return;
                    }
                    scaleInvitationDeclineActivity.ca();
                    return;
                }
                if (i18 != 3) {
                    lc.u0.r();
                    return;
                }
                com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar3.getClass();
                com.garmin.android.apps.connectmobile.i2.a.e(a2Var3, "Failed to decline an index device invite: ");
                scaleInvitationDeclineActivity.hideProgressOverlay();
                scaleInvitationDeclineActivity.f44381c = Boolean.FALSE;
                if (scaleInvitationDeclineActivity.f44380b) {
                    return;
                }
                scaleInvitationDeclineActivity.ca();
                return;
            case 8:
                ScaleInvitationGetStartedActivity scaleInvitationGetStartedActivity = (ScaleInvitationGetStartedActivity) obj2;
                o13.t tVar = scaleInvitationGetStartedActivity.f44388a;
                fw.m mVar3 = (fw.m) obj;
                int i19 = ScaleInvitationGetStartedActivity.f44387f;
                mVar3.getClass();
                int i24 = ScaleInvitationGetStartedActivity.a.f44394b[mVar3.f73769b.ordinal()];
                if (i24 == 1) {
                    ((Logger) tVar.getValue()).debug("Received loading status...");
                    scaleInvitationGetStartedActivity.showProgressOverlay();
                    return;
                }
                if (i24 == 2) {
                    scaleInvitationGetStartedActivity.hideProgressOverlay();
                    com.garmin.android.apps.connectmobile.smartscale.model.a aVar4 = (com.garmin.android.apps.connectmobile.smartscale.model.a) mVar3.f73770c;
                    scaleInvitationGetStartedActivity.f44392e = aVar4 != null ? aVar4.b() : null;
                    if (scaleInvitationGetStartedActivity.f44390c) {
                        return;
                    }
                    scaleInvitationGetStartedActivity.ca();
                    return;
                }
                if (i24 != 3) {
                    lc.u0.r();
                    return;
                }
                ((Logger) tVar.getValue()).debug("Received error status");
                scaleInvitationGetStartedActivity.hideProgressOverlay();
                Toast.makeText(scaleInvitationGetStartedActivity, R.string.txt_something_went_wrong_try_again, 0).show();
                scaleInvitationGetStartedActivity.finish();
                return;
            case 9:
                PowerZonesListActivity powerZonesListActivity = (PowerZonesListActivity) obj2;
                g3 g3Var = (g3) obj;
                PowerZonesListActivity.a aVar5 = PowerZonesListActivity.f44065e;
                int i25 = PowerZonesListActivity.b.f44070a[g3Var.f35300a.ordinal()];
                if (i25 == 1) {
                    powerZonesListActivity.showProgressOverlay();
                    return;
                }
                if (i25 != 2) {
                    if (i25 == 3) {
                        powerZonesListActivity.hideProgressOverlay();
                        return;
                    } else {
                        lc.u0.r();
                        return;
                    }
                }
                powerZonesListActivity.hideProgressOverlay();
                List list = (List) g3Var.f35301b;
                xk1.o oVar = powerZonesListActivity.f44068c;
                if (oVar == null) {
                    p005kotlin.jvm.internal.s.m("zonesAdapter");
                    throw null;
                }
                ArrayList arrayList3 = oVar.f191271b;
                if (list == null || list.isEmpty()) {
                    return;
                }
                arrayList3.clear();
                arrayList3.addAll(list);
                oVar.notifyDataSetChanged();
                return;
            case 10:
                HydrationGoalSettingsActivity hydrationGoalSettingsActivity = (HydrationGoalSettingsActivity) obj2;
                g3 g3Var2 = (g3) obj;
                HydrationGoalSettingsActivity.a aVar6 = HydrationGoalSettingsActivity.f36691k;
                g3Var2.getClass();
                int i26 = HydrationGoalSettingsActivity.b.f36703a[g3Var2.f35300a.ordinal()];
                if (i26 == 1) {
                    hydrationGoalSettingsActivity.showProgressOverlay();
                    return;
                }
                if (i26 != 2) {
                    if (i26 != 3) {
                        lc.u0.r();
                        return;
                    }
                    hydrationGoalSettingsActivity.hideProgressOverlay();
                    hydrationGoalSettingsActivity.displayFailedMessage();
                    hydrationGoalSettingsActivity.setResult(0);
                    hydrationGoalSettingsActivity.finish();
                    return;
                }
                hydrationGoalSettingsActivity.hideProgressOverlay();
                op0.c cVar2 = (op0.c) g3Var2.f35301b;
                if (cVar2 != null && (baseGoalInML = cVar2.getBaseGoalInML()) != null) {
                    hydrationGoalSettingsActivity.f36695c = baseGoalInML.doubleValue();
                }
                if (cVar2 != null && (hydrationAutoGoalEnabled = cVar2.getHydrationAutoGoalEnabled()) != null) {
                    hydrationGoalSettingsActivity.f36697e = hydrationAutoGoalEnabled;
                }
                Intent intent = new Intent();
                intent.putExtra("GCM_extra_current_daily_goal", hydrationGoalSettingsActivity.f36695c);
                Boolean bool = hydrationGoalSettingsActivity.f36697e;
                if (bool != null) {
                    intent.putExtra("autoGoal", bool.booleanValue());
                }
                hydrationGoalSettingsActivity.setResult(-1, intent);
                hydrationGoalSettingsActivity.finish();
                return;
            case 11:
                final NewDeviceOnBoardingActivity newDeviceOnBoardingActivity = (NewDeviceOnBoardingActivity) obj2;
                Logger logger = NewDeviceOnBoardingActivity.f51701l;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Long l14 = newDeviceOnBoardingActivity.f51702g;
                if (zBooleanValue) {
                    logger.debug("onCreate: device " + l14 + " provisioned successfully, navigating to fitPay webview");
                    Long l15 = newDeviceOnBoardingActivity.f51702g;
                    if (l15 != null) {
                        newDeviceOnBoardingActivity.setResult(-1);
                        newDeviceOnBoardingActivity.finish();
                        return;
                    }
                    logger.error("can not launch webView, isDeviceUnitIdNull: " + (l15 == null));
                    br2.c.h(br2.c.f19585a, newDeviceOnBoardingActivity, new xn.r(newDeviceOnBoardingActivity, i15), null, 4);
                    return;
                }
                logger.error("Provisioning failed for deviceId " + l14);
                final int i27 = 0;
                o13.p pVar = new o13.p(newDeviceOnBoardingActivity.getString(R.string.lbl_try_again), new e23.p() { // from class: xp2.b
                    @Override // e23.p
                    public final Object invoke(Object obj3, Object obj4) {
                        int i28 = i27;
                        NewDeviceOnBoardingActivity newDeviceOnBoardingActivity2 = newDeviceOnBoardingActivity;
                        DialogInterface dialogInterface = (DialogInterface) obj3;
                        ((Integer) obj4).getClass();
                        NewDeviceOnBoardingActivity.a aVar7 = NewDeviceOnBoardingActivity.f51700k;
                        switch (i28) {
                            case 0:
                                dialogInterface.getClass();
                                dialogInterface.dismiss();
                                a aVar8 = newDeviceOnBoardingActivity2.f51705j;
                                if (aVar8 != null) {
                                    Long l16 = newDeviceOnBoardingActivity2.f51702g;
                                    l16.getClass();
                                    aVar8.S3(l16.longValue());
                                }
                                break;
                            default:
                                dialogInterface.getClass();
                                newDeviceOnBoardingActivity2.setResult(0);
                                newDeviceOnBoardingActivity2.finish();
                                dialogInterface.dismiss();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                o13.p pVar2 = new o13.p(newDeviceOnBoardingActivity.getString(R.string.common_button_not_now), new e23.p() { // from class: xp2.b
                    @Override // e23.p
                    public final Object invoke(Object obj3, Object obj4) {
                        int i28 = i15;
                        NewDeviceOnBoardingActivity newDeviceOnBoardingActivity2 = newDeviceOnBoardingActivity;
                        DialogInterface dialogInterface = (DialogInterface) obj3;
                        ((Integer) obj4).getClass();
                        NewDeviceOnBoardingActivity.a aVar7 = NewDeviceOnBoardingActivity.f51700k;
                        switch (i28) {
                            case 0:
                                dialogInterface.getClass();
                                dialogInterface.dismiss();
                                a aVar8 = newDeviceOnBoardingActivity2.f51705j;
                                if (aVar8 != null) {
                                    Long l16 = newDeviceOnBoardingActivity2.f51702g;
                                    l16.getClass();
                                    aVar8.S3(l16.longValue());
                                }
                                break;
                            default:
                                dialogInterface.getClass();
                                newDeviceOnBoardingActivity2.setResult(0);
                                newDeviceOnBoardingActivity2.finish();
                                dialogInterface.dismiss();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                String string = newDeviceOnBoardingActivity.getString(R.string.title_setup_failed);
                string.getClass();
                String string2 = newDeviceOnBoardingActivity.getString(R.string.wallet_message_provisioning_device_failed, newDeviceOnBoardingActivity.f51704i);
                string2.getClass();
                androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, newDeviceOnBoardingActivity, string, string2, pVar, pVar2, null, false, 128);
                if (eVarQ != null) {
                    eVarQ.show();
                    return;
                }
                return;
            case 12:
                xp2.c.G4((xp2.c) obj2, ((Boolean) obj).booleanValue());
                return;
            case 13:
                FeedbackActivity feedbackActivity = (FeedbackActivity) obj2;
                int i28 = FeedbackActivity.f35205a;
                feedbackActivity.hideProgressOverlay();
                feedbackActivity.finish();
                return;
            case 14:
                yt.n nVar = (yt.n) obj2;
                tt.j jVar = (tt.j) obj;
                int i29 = yt.n.f199339p;
                jVar.getClass();
                yt.r rVarY4 = nVar.y4();
                com.garmin.android.apps.connectmobile.annual_report.preprocess.a aVar7 = nVar.f199342c;
                androidx.lifecycle.y0<yt.r> y0Var = nVar.f199345f;
                com.garmin.android.apps.connectmobile.i2.a aVar8 = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar8.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var4, "AnnualReportPlayerViewModel", "reportProcessingStateObserver: preprocessState=[" + jVar + "], getCurrentViewState = [" + rVarY4 + "]");
                int i30 = yt.n.b.f199355a[jVar.ordinal()];
                if (i30 != 1) {
                    if (i30 == 2) {
                        yt.r rVar = yt.r.LOADING;
                        y0Var.j(rVar);
                        com.garmin.android.apps.connectmobile.i2.a.b(a2Var4, "AnnualReportPlayerViewModel", "updateCurrentPlayerViewState " + rVar);
                        return;
                    }
                    if (i30 == 3) {
                        if (nVar.y4() != yt.r.LOADING) {
                            nVar.B4();
                            return;
                        }
                        yt.r rVar2 = yt.r.READY;
                        y0Var.j(rVar2);
                        com.garmin.android.apps.connectmobile.i2.a.b(a2Var4, "AnnualReportPlayerViewModel", "updateCurrentPlayerViewState " + rVar2);
                        return;
                    }
                    if (i30 != 4) {
                        lc.u0.r();
                        return;
                    }
                    if (nVar.f199341b.f192134c.f() != null) {
                        aVar7.getClass();
                        com.garmin.android.apps.connectmobile.annual_report.preprocess.a.d(tt.j.REPORT_READY);
                        return;
                    }
                    yt.r rVar3 = yt.r.ERROR;
                    y0Var.j(rVar3);
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var4, "AnnualReportPlayerViewModel", "updateCurrentPlayerViewState " + rVar3);
                    aVar7.getClass();
                    com.garmin.android.apps.connectmobile.annual_report.preprocess.a.d(tt.j.IDLE);
                    nt.a.f127827a.getClass();
                    ht.s sVar = ht.s.f85508a;
                    lt.a.b bVar2 = new lt.a.b(lt.a.EnumC2181a.API_ERROR_WITHOUT_CACHE_FAILED);
                    sVar.getClass();
                    ht.s.a(bVar2);
                    return;
                }
                return;
            case 15:
                PopularityRoutingConsentActivity popularityRoutingConsentActivity = (PopularityRoutingConsentActivity) obj2;
                q92.v vVar = (q92.v) obj;
                PopularityRoutingConsentActivity.a aVar9 = PopularityRoutingConsentActivity.f32209d;
                if (vVar != null) {
                    q92.y yVar = vVar.f143784b;
                    popularityRoutingConsentActivity.f32210a = yVar;
                    GCMComplexOneLineButton gCMComplexOneLineButton = popularityRoutingConsentActivity.f32211b;
                    if (gCMComplexOneLineButton == null) {
                        p005kotlin.jvm.internal.s.m("mConsentToggle");
                        throw null;
                    }
                    gCMComplexOneLineButton.i(yVar == q92.y.OPT_IN);
                } else {
                    popularityRoutingConsentActivity.displayFailedMessage();
                }
                popularityRoutingConsentActivity.finish();
                return;
            case 16:
                DeviceDetailsActivity deviceDetailsActivity = (DeviceDetailsActivity) obj2;
                sd2.f fVar = (sd2.f) obj;
                int i34 = DeviceDetailsActivity.f33804q;
                deviceDetailsActivity.hideProgressOverlay();
                if (fVar == null) {
                    com.garmin.android.apps.connectmobile.i2.f(com.garmin.android.apps.connectmobile.a2.DEVICES, "DeviceDetailsActivity", am.j.i(deviceDetailsActivity.f33807g, "]", new StringBuilder("deviceReady: deviceDatabaseRecord is null for unit ID [")));
                    deviceDetailsActivity.finish();
                    return;
                }
                if (TextUtils.isEmpty(fVar.getProductNumber())) {
                    com.garmin.android.apps.connectmobile.i2.f(com.garmin.android.apps.connectmobile.a2.DEVICES, "DeviceDetailsActivity", am.j.i(deviceDetailsActivity.f33807g, "]", new StringBuilder("deviceReady: deviceDatabaseRecord.getProductNumber() is null for empty for unit ID [")));
                    deviceDetailsActivity.finish();
                }
                deviceDetailsActivity.f33808h = fVar;
                try {
                    deviceDetailsActivity.f33815o = (zb0.u0) zb0.u0.f203782n6.get(fVar.getProductNumber());
                    break;
                } catch (Exception e4) {
                    com.garmin.android.apps.connectmobile.i2.f(com.garmin.android.apps.connectmobile.a2.DEVICES, "DeviceDetailsActivity", "deviceReady: GarminDeviceEnum.lookupByProductNumber - " + deviceDetailsActivity.f33808h.getProductNumber() + " error:" + e4.getMessage());
                }
                if (deviceDetailsActivity.f33815o == null) {
                    com.garmin.android.apps.connectmobile.i2.f(com.garmin.android.apps.connectmobile.a2.DEVICES, "DeviceDetailsActivity", "deviceReady: GarminDeviceEnum is null for product number: " + deviceDetailsActivity.f33808h.getProductNumber());
                    deviceDetailsActivity.f33815o = zb0.u0.f203733h;
                }
                com.garmin.android.apps.connectmobile.devices.a.C0573a c0573a = com.garmin.android.apps.connectmobile.devices.a.f33827a;
                String productNumber = deviceDetailsActivity.f33808h.getProductNumber();
                c0573a.getClass();
                com.garmin.android.apps.connectmobile.devices.a aVarA = com.garmin.android.apps.connectmobile.devices.a.C0573a.a(productNumber);
                com.garmin.android.apps.connectmobile.devices.a aVar10 = com.garmin.android.apps.connectmobile.devices.a.AGGREGATED;
                if (aVarA == aVar10) {
                    displayName = deviceDetailsActivity.getString(R.string.lbl_device);
                } else {
                    boolean zIsEmpty = TextUtils.isEmpty(deviceDetailsActivity.f33808h.getDisplayName());
                    sd2.f fVar2 = deviceDetailsActivity.f33808h;
                    displayName = !zIsEmpty ? fVar2.getDisplayName() : fVar2.getProductDisplayName();
                }
                gj1.f fVar3 = deviceDetailsActivity.f33810j.f104965b;
                gj1.c cVarA = fVar3 != null ? hj1.b.a(deviceDetailsActivity, fVar3, deviceDetailsActivity.f33807g) : null;
                com.garmin.android.apps.connectmobile.a2 a2Var5 = com.garmin.android.apps.connectmobile.a2.DEVICES;
                StringBuilder sb3 = new StringBuilder("Device : ");
                sb3.append(deviceDetailsActivity.f33807g);
                sb3.append(" PrimaryDevice: ");
                sb3.append(cVarA != null ? cVarA.f77656e : null);
                com.garmin.android.apps.connectmobile.i2.a(a2Var5, "DeviceDetailsActivity", sb3.toString());
                long j8 = deviceDetailsActivity.f33807g;
                SupportedCapability supportedCapability = SupportedCapability.REALTIME_SETTINGS;
                if (km2.a.i(j8, null, supportedCapability.ordinal()) || aVarA == (aVar = com.garmin.android.apps.connectmobile.devices.a.REALTIME)) {
                    String strI = am.j.i(deviceDetailsActivity.f33807g, " Starting Real Time Settings.", new StringBuilder("Device:"));
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var5, "DeviceDetailsActivity", strI);
                    deviceDetailsActivity.showProgressOverlay();
                    new com.garmin.android.apps.connectmobile.devices.settings.realtime.b(deviceDetailsActivity, deviceDetailsActivity.f33808h).a(GDIRealtimeSettingsProto.WellKnownCompositionId.DEVICE_SETTINGS_HOME_VALUE, deviceDetailsActivity.getIntent().getBooleanExtra("GCM_requireNewInstance", true), cVarA, new xw.b(deviceDetailsActivity, 6));
                    return;
                }
                long j14 = deviceDetailsActivity.f33807g;
                if (aVarA != aVar10) {
                    boolean zI = km2.a.i(j14, null, supportedCapability.ordinal());
                    boolean z18 = aVarA == aVar;
                    if (aVarA != com.garmin.android.apps.connectmobile.devices.a.DYNAMIC && (!z18 || zI)) {
                        deviceDetailsActivity.initActionBar(true, displayName);
                        if (((zb0.o) deviceDetailsActivity.getSupportFragmentManager().G("DeviceFullViewFragment")) == null) {
                            String strI2 = am.j.i(deviceDetailsActivity.f33807g, " Starting legacy settings.", new StringBuilder("Device:"));
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.b(a2Var5, "DeviceDetailsActivity", strI2);
                            deviceDetailsActivity.f33810j.f203486f = cVarA;
                            androidx.fragment.app.v supportFragmentManager = deviceDetailsActivity.getSupportFragmentManager();
                            androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                            long j15 = deviceDetailsActivity.f33807g;
                            Bundle bundle = new Bundle();
                            bundle.putLong("GCM_deviceUnitID", j15);
                            zb0.o oVar2 = new zb0.o();
                            oVar2.setArguments(bundle);
                            aVarB.l(R.id.content_frame, oVar2, "DeviceFullViewFragment");
                            aVarB.s(true, true);
                            return;
                        }
                        return;
                    }
                    String strM = am.j.m("Device: ", displayName, " supports dynamic settings, kicking off dynamic settings initializer");
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var5, "DeviceDetailsActivity", strM);
                    deviceDetailsActivity.initActionBar(true, displayName);
                    Context baseContext = deviceDetailsActivity.getBaseContext();
                    ni2.b bVar3 = ni2.b.DEVICE;
                    uc0.a aVar11 = new uc0.a(baseContext, bVar3, deviceDetailsActivity.f33808h, cVarA);
                    if (!deviceDetailsActivity.f33809i) {
                        aVar11.b(deviceDetailsActivity);
                        deviceDetailsActivity.finish();
                        return;
                    }
                    deviceDetailsActivity.showProgressOverlay();
                    yt.f fVar4 = new yt.f(11, deviceDetailsActivity, aVar11);
                    Logger logger2 = uc0.a.f169936e;
                    logger2.debug("launch: initializing dynamic settings lib...");
                    int[] iArr = uc0.a.b.f169941a;
                    ni2.b bVar4 = aVar11.f169938b;
                    if (iArr[bVar4.ordinal()] != 1) {
                        logger2.error("Do not know the sectiontype " + bVar4);
                        return;
                    }
                    sd2.f fVar5 = aVar11.f169939c;
                    if (fVar5 == null) {
                        throw new DSLSettingsException("launch: DeviceRecord must not be null to initialize device settings! ");
                    }
                    uc0.d dVar2 = new uc0.d(deviceDetailsActivity, aVar11.f169939c, null, 4, null);
                    zh2.f fVarA = aVar11.a();
                    if (fVarA == null) {
                        logger2.error("Unable to frame settings data object");
                        return;
                    }
                    zh2.e eVar3 = zh2.e.f204807a;
                    String str2 = bVar3.f126214a;
                    m80.a.C2223a c2223a = m80.a.f117132a;
                    String productNumber2 = fVar5.getProductNumber();
                    c2223a.getClass();
                    boolean zA = m80.a.C2223a.a(productNumber2);
                    eVar3.getClass();
                    str2.getClass();
                    li2.a aVar12 = fVarA.f204825l;
                    zh2.e.f204808b.a("initGCMMyDayDevice: starting Fragment with section type ".concat(str2));
                    zh2.e.f204812f = fVarA;
                    zh2.e.f204809c = dVar2;
                    zh2.e.f204813g = zA;
                    li2.d dVar3 = fVarA.f204824k;
                    if (dVar3 != null && aVar12 != null) {
                        new li2.e();
                        cVar = new li2.c(dVar3, aVar12);
                    }
                    cVar = dVar2;
                    cVar = dVar2;
                    zh2.e.f204810d = cVar;
                    ci2.b bVar5 = new ci2.b(deviceDetailsActivity, str2);
                    zh2.d dVar4 = new zh2.d(fVar4);
                    bVar5.f27686c.getClass();
                    bVar5.f27687d.b(new ci2.a(bVar5, dVar4), bVar5.f27685b);
                    return;
                }
                String strF = androidx.room.a0.f(j14, "Device:", " Starting Aggregated Settings.");
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var5, "DeviceDetailsActivity", strF);
                deviceDetailsActivity.initActionBar(true, displayName);
                if (((com.garmin.android.apps.connectmobile.settings.devices.common.f) deviceDetailsActivity.getSupportFragmentManager().G("DeviceSettingFragment")) == null) {
                    deviceDetailsActivity.f33810j.f203486f = cVarA;
                    androidx.fragment.app.v supportFragmentManager2 = deviceDetailsActivity.getSupportFragmentManager();
                    androidx.fragment.app.a aVarB2 = androidx.core.view.j.b(supportFragmentManager2, supportFragmentManager2);
                    if (deviceDetailsActivity.getIntent() != null) {
                        z15 = false;
                        if (deviceDetailsActivity.getIntent().getBooleanExtra("GCM_openedFromOnboarding", false)) {
                            z16 = true;
                        }
                        if (deviceDetailsActivity.getIntent() == null && deviceDetailsActivity.getIntent().getBooleanExtra("GCM_extra_find_my_edge_notification", z15)) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        long j16 = deviceDetailsActivity.f33807g;
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("GCM_deviceUnitID", j16);
                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar6 = new com.garmin.android.apps.connectmobile.settings.devices.common.f();
                        fVar6.setArguments(bundle2);
                        arguments = fVar6.getArguments();
                        if (arguments != null) {
                            arguments.putBoolean("GCM_openedFromOnboarding", z16);
                            arguments.putBoolean("GCM_extra_find_my_edge_notification", z17);
                        }
                        aVarB2.l(R.id.content_frame, fVar6, "DeviceSettingFragment");
                        if (deviceDetailsActivity.f33810j.A4(deviceDetailsActivity.f33815o, deviceDetailsActivity.f33807g)) {
                            zb0.g gVar2 = deviceDetailsActivity.f33810j;
                            u0Var = deviceDetailsActivity.f33815o;
                            gVar2.getClass();
                            u0Var.getClass();
                            gVar2.f203487g.getClass();
                            contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                            if (zb0.f.b.f203479a[u0Var.ordinal()] == 1) {
                                com.garmin.android.apps.connectmobile.x.a aVar13 = com.garmin.android.apps.connectmobile.x.f49750f;
                                String string3 = contextC.getString(R.string.lbl_update_index_scale);
                                String string4 = contextC.getString(R.string.msg_index_scale_important_update);
                                string4.getClass();
                                xVarA = com.garmin.android.apps.connectmobile.x.a.a(aVar13, string3, string4, contextC.getString(R.string.common_learn_more), 0, 56);
                                xVarA.f49753c = false;
                                String string5 = contextC.getString(R.string.index_smart_scale_2_manual_software_update_procedure_url);
                                string5.getClass();
                                xVarA.f49751a = new z10.d(10, Uri.parse(string5), contextC);
                            } else {
                                xVarA = null;
                            }
                            if (xVarA != null) {
                                aVarB2.j(R.id.content_frame, xVarA, "DeviceSettingFragment", 1);
                            }
                        }
                        aVarB2.s(true, true);
                        deviceDetailsActivity.pa(deviceDetailsActivity.f33808h);
                        return;
                    }
                    z15 = false;
                    z16 = z15;
                    if (deviceDetailsActivity.getIntent() == null) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    long j17 = deviceDetailsActivity.f33807g;
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("GCM_deviceUnitID", j17);
                    com.garmin.android.apps.connectmobile.settings.devices.common.f fVar7 = new com.garmin.android.apps.connectmobile.settings.devices.common.f();
                    fVar7.setArguments(bundle3);
                    arguments = fVar7.getArguments();
                    if (arguments != null) {
                        arguments.putBoolean("GCM_openedFromOnboarding", z16);
                        arguments.putBoolean("GCM_extra_find_my_edge_notification", z17);
                    }
                    aVarB2.l(R.id.content_frame, fVar7, "DeviceSettingFragment");
                    if (deviceDetailsActivity.f33810j.A4(deviceDetailsActivity.f33815o, deviceDetailsActivity.f33807g)) {
                        zb0.g gVar3 = deviceDetailsActivity.f33810j;
                        u0Var = deviceDetailsActivity.f33815o;
                        gVar3.getClass();
                        u0Var.getClass();
                        gVar3.f203487g.getClass();
                        contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                        if (zb0.f.b.f203479a[u0Var.ordinal()] == 1) {
                            com.garmin.android.apps.connectmobile.x.a aVar14 = com.garmin.android.apps.connectmobile.x.f49750f;
                            String string6 = contextC.getString(R.string.lbl_update_index_scale);
                            String string7 = contextC.getString(R.string.msg_index_scale_important_update);
                            string7.getClass();
                            xVarA = com.garmin.android.apps.connectmobile.x.a.a(aVar14, string6, string7, contextC.getString(R.string.common_learn_more), 0, 56);
                            xVarA.f49753c = false;
                            String string8 = contextC.getString(R.string.index_smart_scale_2_manual_software_update_procedure_url);
                            string8.getClass();
                            xVarA.f49751a = new z10.d(10, Uri.parse(string8), contextC);
                        } else {
                            xVarA = null;
                        }
                        if (xVarA != null) {
                            aVarB2.j(R.id.content_frame, xVarA, "DeviceSettingFragment", 1);
                        }
                    }
                    aVarB2.s(true, true);
                    deviceDetailsActivity.pa(deviceDetailsActivity.f33808h);
                    return;
                }
                return;
            case 17:
                zb0.g0 g0Var = (zb0.g0) obj2;
                sd2.f fVar8 = (sd2.f) obj;
                g0Var.f203492c.f76871d = fVar8;
                if (fVar8 != null) {
                    ImageView imageView = g0Var.f203494e;
                    imageView.getClass();
                    zb0.t.c(imageView, fVar8);
                    if (g0Var.f203503n) {
                        g0Var.f203501l.setVisibility(8);
                        gc0.c.b(g0Var.f203500k, fVar8);
                    }
                    ImageView imageView2 = g0Var.f203499j;
                    View view3 = g0Var.f203501l;
                    int i35 = g0Var.f203502m;
                    if (imageView2 != null) {
                        if (hk0.p.m(fVar8)) {
                            imageView2.setVisibility(8);
                            imageView2.setTag(null);
                        } else {
                            view3.setVisibility(8);
                            Rect rect = new Rect();
                            imageView2.setVisibility(0);
                            imageView2.setImageResource(R.drawable.help);
                            imageView2.getHitRect(rect);
                            rect.top -= i35;
                            rect.bottom += i35;
                            rect.left -= i35;
                            rect.right += i35;
                            ((View) imageView2.getParent()).setTouchDelegate(new TouchDelegate(rect, imageView2));
                        }
                    }
                    TextView textView = g0Var.f203495f;
                    if (textView != null) {
                        String displayName2 = !TextUtils.isEmpty(fVar8.getDisplayName()) ? fVar8.getDisplayName() : fVar8.getProductDisplayName();
                        if (TextUtils.isEmpty(displayName2)) {
                            String productDisplayName = fVar8.getProductDisplayName();
                            if (TextUtils.isEmpty(productDisplayName)) {
                                textView.setText(R.string.no_value);
                            } else {
                                textView.setText(productDisplayName);
                            }
                        } else {
                            textView.setText(displayName2);
                        }
                    }
                    gc0.c.a(g0Var.f203496g, fVar8);
                    return;
                }
                return;
            case 18:
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c cVar3 = (com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c) obj2;
                o13.p pVar3 = (o13.p) obj;
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar15 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                pVar3.getClass();
                yo.a aVar16 = (yo.a) pVar3.f128594a;
                List<? extends Object> list2 = (List) pVar3.f128595b;
                switch (com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.b.f29332a[aVar16.ordinal()]) {
                    case 1:
                        g22.e.f(cVar3);
                        return;
                    case 2:
                        g22.e.l(cVar3);
                        return;
                    case 3:
                        g22.e.f(cVar3);
                        ap.d dVar5 = cVar3.f29357f;
                        if (dVar5 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        yo.e eVar4 = dVar5.f11593e;
                        if (list2 == null) {
                            list2 = p13.j0.f134944a;
                        }
                        eVar4.g(list2);
                        return;
                    case 4:
                        g22.e.f(cVar3);
                        Snackbar snackbarMake = Snackbar.make(cVar3.requireView(), cVar3.getString(R.string.activities_trim_error_message), 0);
                        snackbarMake.getClass();
                        v22.c.a(snackbarMake);
                        snackbarMake.show();
                        return;
                    case 5:
                        g22.e.l(cVar3);
                        ap.d dVar6 = cVar3.f29357f;
                        if (dVar6 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        yo.e eVar5 = dVar6.f11593e;
                        if (list2 == null) {
                            list2 = p13.j0.f134944a;
                        }
                        eVar5.g(list2);
                        return;
                    case 6:
                    case 7:
                        g22.e.f(cVar3);
                        MultisportEditLegsActivity.a aVar17 = MultisportEditLegsActivity.f29307b;
                        ap.d dVar7 = cVar3.f29357f;
                        if (dVar7 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        long j18 = dVar7.f11589a;
                        zo.k kVar = zo.k.CONVERT_TO_MULTISPORT;
                        aVar17.getClass();
                        MultisportEditLegsActivity.a.a(cVar3, j18, 1, kVar);
                        return;
                    default:
                        lc.u0.r();
                        return;
                }
            case 19:
                yo2.h hVar2 = (yo2.h) obj;
                Logger logger3 = zp2.b.f206600h;
                hVar2.getClass();
                zp2.b.f206600h.debug("deviceSEUpdateStateChangeObserver: state: " + hVar2);
                for (o53.l1 l1Var : ((zp2.b) obj2).f206601a) {
                    l1Var.getClass();
                    l1Var.c(null);
                }
                return;
            case 20:
                ATPEditActivity aTPEditActivity = (ATPEditActivity) obj2;
                rt1.b bVar6 = (rt1.b) obj;
                ATPEditActivity.a aVar18 = ATPEditActivity.f45202g;
                bVar6.getClass();
                if (bVar6 instanceof rt1.b.c) {
                    aTPEditActivity.G4();
                    return;
                }
                if (!(bVar6 instanceof rt1.b.C2927b)) {
                    if (!(bVar6 instanceof rt1.b.a)) {
                        lc.u0.r();
                        return;
                    } else {
                        aTPEditActivity.t();
                        aTPEditActivity.L0(-1);
                        return;
                    }
                }
                fg0.k kVar2 = ((rt1.b.C2927b) bVar6).f154515a;
                if (kVar2 != null) {
                    zt1.f fVar9 = aTPEditActivity.f45204b;
                    if (fVar9 == null) {
                        p005kotlin.jvm.internal.s.m("presenter");
                        throw null;
                    }
                    zt1.g gVar4 = fVar9.f206972e;
                    xw1.c cVar4 = gVar4.d().f206993a;
                    xw1.n tiEventDTO = cVar4.getTiEventDTO();
                    cVar4.h0(tiEventDTO != null ? xw1.n.b(tiEventDTO, null, kVar2, null, 13) : null);
                    xw1.n tiEventDTO2 = cVar4.getTiEventDTO();
                    cVar4.e0(tiEventDTO2 != null ? tiEventDTO2.d() : null);
                    gVar4.d().f206993a = cVar4;
                }
                zt1.f fVar10 = aTPEditActivity.f45204b;
                if (fVar10 != null) {
                    fVar10.z();
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("presenter");
                    throw null;
                }
            case 21:
                zu1.c cVar5 = (zu1.c) obj2;
                g3 g3Var3 = (g3) obj;
                zu1.c.a aVar19 = zu1.c.f207075i;
                g3Var3.getClass();
                T t7 = g3Var3.f35301b;
                int i36 = zu1.c.b.f207084a[g3Var3.f35300a.ordinal()];
                if (i36 == 1) {
                    wu1.c cVar6 = cVar5.f207078c;
                    if (cVar6 != null) {
                        cVar6.A((jv1.n) t7, cVar5.f207081f, o53.f0.w(cVar5));
                    }
                    g22.e.f(cVar5);
                    ge1.b.T(g22.f.b(cVar5), null, null, new zu1.d((jv1.n) t7, cVar5, null), 3);
                    return;
                }
                if (i36 == 2) {
                    g22.e.a(cVar5, null);
                    g22.e.f(cVar5);
                    return;
                } else if (i36 == 3) {
                    g22.e.l(cVar5);
                    return;
                } else {
                    lc.u0.r();
                    return;
                }
            default:
                zu1.e eVar6 = (zu1.e) obj2;
                g3 g3Var4 = (g3) obj;
                zu1.e.a aVar20 = zu1.e.f207093e;
                g3Var4.getClass();
                int i37 = zu1.e.b.f207098a[g3Var4.f35300a.ordinal()];
                if (i37 == 1) {
                    wu1.f fVar11 = eVar6.f207096c;
                    if (fVar11 != null) {
                        fVar11.A((av1.e) g3Var4.f35301b);
                    }
                    g22.e.f(eVar6);
                    return;
                }
                if (i37 == 2) {
                    g22.e.a(eVar6, null);
                    g22.e.f(eVar6);
                    return;
                } else if (i37 == 3) {
                    g22.e.l(eVar6);
                    return;
                } else {
                    lc.u0.r();
                    return;
                }
        }
    }
}
