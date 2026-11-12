package pk1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.NumberPicker;
import androidx.lifecycle.v1;
import androidx.media3.exoplayer.ExoPlayer;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.bikesensors.VectorGeneralSettingsActivity;
import com.garmin.android.apps.connectmobile.connectiq.requests.oauth.ConnectIQOAuthActivity;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DevicePhoneNotificationActivityV3;
import com.garmin.android.apps.connectmobile.settings.devices.common.DevicePhoneNotificationsActivityDefault;
import com.garmin.android.apps.connectmobile.settings.devices.common.DevicePhoneNotificationsWithPrivacyActivity;
import com.garmin.android.apps.connectmobile.settings.view.GCMSettingsItemView;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTTrainingGuidancePlayerActivity;
import com.garmin.device.ciq.http.requests.oauth.ConnectIQOAuthRequest;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f138314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f138315c;

    public /* synthetic */ t(v20.d dVar, String[] strArr) {
        this.f138313a = 15;
        this.f138315c = dVar;
        this.f138314b = strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [T, gg1.n] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f138313a;
        Object obj = this.f138315c;
        Object obj2 = this.f138314b;
        switch (i15) {
            case 0:
                u uVar = (u) obj;
                u.a aVar = u.E;
                String str = ((String[]) obj2)[i14];
                uVar.B.R(str);
                GCMSettingsItemView gCMSettingsItemView = uVar.f138317b;
                if (gCMSettingsItemView == null) {
                    p005kotlin.jvm.internal.s.m("genderView");
                    throw null;
                }
                str.getClass();
                gCMSettingsItemView.setSummary((CharSequence) uVar.E6(str));
                uVar.v6();
                dialogInterface.dismiss();
                return;
            case 1:
                dialogInterface.getClass();
                ((po2.x) obj2).invoke(dialogInterface);
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) obj).getF52032a().startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:4008191899")));
                return;
            case 2:
                dialogInterface.getClass();
                ((e23.l) obj2).invoke(dialogInterface);
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.e) obj).getF52032a().startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:4008191899")));
                return;
            case 3:
                dialogInterface.getClass();
                ((e23.l) obj2).invoke(dialogInterface);
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) obj).getF52032a().startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:4008191899")));
                return;
            case 4:
                PregnancySetupActivity pregnancySetupActivity = (PregnancySetupActivity) obj;
                PregnancySetupActivity.a aVar2 = PregnancySetupActivity.f40934g;
                if (((qb1.a) obj2).f144032d) {
                    dialogInterface.dismiss();
                    return;
                } else {
                    pregnancySetupActivity.ia(false);
                    return;
                }
            case 5:
                Uri uri = Uri.parse((String) obj);
                uri.getClass();
                g22.a.d((Context) obj2, uri);
                dialogInterface.dismiss();
                return;
            case 6:
                so2.a.e eVar = (so2.a.e) obj;
                eVar.f160467c = eVar.f160466b.get(((NumberPicker) obj2).getValue());
                eVar.c();
                return;
            case 7:
                int i16 = tm0.c.f165349i;
                ((tm0.c) obj2).z6((ef0.b) obj);
                dialogInterface.dismiss();
                return;
            case 8:
                e23.a aVar3 = (e23.a) obj;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                e23.l<Boolean, Unit> lVar = ((mv1.e) obj2).f121190f;
                if (lVar != null) {
                    lVar.invoke(Boolean.TRUE);
                }
                aVar3.invoke();
                return;
            case 9:
                tv.k kVar = (tv.k) obj2;
                VectorGeneralSettingsActivity vectorGeneralSettingsActivity = (VectorGeneralSettingsActivity) obj;
                int i17 = VectorGeneralSettingsActivity.f30812w;
                if (kVar != null) {
                    kVar.f(4294967295L);
                }
                vectorGeneralSettingsActivity.f178102a.l();
                dialogInterface.dismiss();
                return;
            case 10:
                String str2 = (String) obj2;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.c cVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.c) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.c.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T;
                if (URLUtil.isHttpUrl(str2) || URLUtil.isHttpsUrl(str2)) {
                    cVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                } else {
                    String strConcat = "http://".concat(str2);
                    if (URLUtil.isValidUrl(strConcat)) {
                        cVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strConcat)));
                    } else {
                        cVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com")));
                    }
                }
                dialogInterface.dismiss();
                return;
            case 11:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                j22.b.f96736a.getClass();
                j22.b.y((com.garmin.android.apps.connectmobile.traininginitiative.ui.l) obj2, 1412, (ArrayList) obj);
                return;
            case 12:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.t tVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.t) obj2;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.t.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.t.f46255f;
                dialogInterface.dismiss();
                tVar.A6().e6((List) obj);
                tVar.f46258d = tVar.A6().I5();
                tVar.A6().C2 = false;
                tVar.C6();
                return;
            case 13:
                ConnectIQOAuthActivity connectIQOAuthActivity = (ConnectIQOAuthActivity) obj2;
                u10.h hVar = (u10.h) obj;
                int i18 = ConnectIQOAuthActivity.f31981g;
                dialogInterface.getClass();
                u10.i iVarDa = connectIQOAuthActivity.da();
                ConnectIQOAuthRequest connectIQOAuthRequest = connectIQOAuthActivity.f31984c;
                if (connectIQOAuthRequest == null) {
                    p005kotlin.jvm.internal.s.m("ciqRequest");
                    throw null;
                }
                i2.a aVar7 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar7.getClass();
                i2.a.b(a2Var, "ConnectIQOAuthViewModel", "Respond with ERROR status Oauth :" + hVar);
                if (hVar != null) {
                    ge1.b.T(v1.a(iVarDa), null, null, new u10.k(iVarDa, connectIQOAuthRequest, hVar, null), 3);
                }
                dialogInterface.dismiss();
                connectIQOAuthActivity.finish();
                return;
            case 14:
                int i19 = com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a.f47119i;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                ((com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.a) obj2).w6((PrivacyType) obj);
                return;
            case 15:
                v20.d dVar = (v20.d) obj;
                String[] strArr = (String[]) obj2;
                com.google.firebase.remoteconfig.internal.b bVar = dVar.f175291a;
                if (bVar != null && strArr != null && strArr.length > 0) {
                    String str3 = strArr[i14];
                    p0 p0Var = (p0) bVar.f53828a;
                    ArrayList arrayList = (ArrayList) bVar.f53829b;
                    r0 r0Var = (r0) bVar.f53830c;
                    com.garmin.android.apps.connectmobile.hydration.presentation.settings.a aVar8 = (com.garmin.android.apps.connectmobile.hydration.presentation.settings.a) bVar.f53831d;
                    View view2 = (View) bVar.f53832e;
                    com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.C0652a c0652a = com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.f36709l;
                    if (i14 != p0Var.f105807a) {
                        q22.b bVar2 = (q22.b) arrayList.get(i14);
                        ?? F = jp0.c.f(bVar2);
                        r0Var.f105810a = F;
                        aVar8.f36710a.s(F.f77282a);
                        Double baseGoalInML = aVar8.f36710a.getBaseGoalInML();
                        double dDoubleValue = baseGoalInML != null ? baseGoalInML.doubleValue() : jp0.c.d((gg1.n) r0Var.f105810a, aVar8.f36713d);
                        double dI = jp0.c.i(bVar2);
                        if (dDoubleValue < dI) {
                            dDoubleValue = dI;
                        }
                        Double d14 = (Double) jp0.c.g().get(bVar2);
                        double dDoubleValue2 = d14 != null ? d14.doubleValue() : dDoubleValue;
                        if (dDoubleValue > dDoubleValue2) {
                            dDoubleValue = dDoubleValue2;
                        }
                        aVar8.f36710a.m(Double.valueOf(dDoubleValue));
                        Context context = view2.getContext();
                        context.getClass();
                        String strM = jp0.c.m(new wp0.a(new l22.a(context)), jp0.c.h((gg1.n) r0Var.f105810a));
                        Context context2 = view2.getContext();
                        context2.getClass();
                        String strL = jp0.c.l(context2, jp0.c.h((gg1.n) r0Var.f105810a));
                        xp0.e eVar2 = aVar8.f36712c;
                        if (eVar2 == null) {
                            p005kotlin.jvm.internal.s.m("settingsViewHolder");
                            throw null;
                        }
                        gg1.n nVar = (gg1.n) r0Var.f105810a;
                        nVar.getClass();
                        eVar2.f191840c.setButtonBottomLeftLabel(eVar2.f191838a.getContext().getString(jp0.c.j(nVar).f142315d));
                        xp0.e eVar3 = aVar8.f36712c;
                        if (eVar3 == null) {
                            p005kotlin.jvm.internal.s.m("settingsViewHolder");
                            throw null;
                        }
                        eVar3.c(Double.valueOf(dDoubleValue), (gg1.n) r0Var.f105810a);
                        xp0.e eVar4 = aVar8.f36712c;
                        if (eVar4 == null) {
                            p005kotlin.jvm.internal.s.m("settingsViewHolder");
                            throw null;
                        }
                        eVar4.f191842e.setText(eVar4.f191838a.getContext().getString(R.string.msg_hydration_goal_ranges, strM, strL));
                    }
                }
                dVar.dismiss();
                return;
            case 16:
                Context context3 = (Context) obj;
                DevicePhoneNotificationActivityV3 devicePhoneNotificationActivityV3 = ((DevicePhoneNotificationActivityV3.a) obj2).f42659a;
                if (devicePhoneNotificationActivityV3.f42652j.Q0()) {
                    if (i14 == 0) {
                        devicePhoneNotificationActivityV3.f42652j.f33863b1.i0("SHOW_ALL");
                    } else if (i14 == 1) {
                        devicePhoneNotificationActivityV3.f42652j.f33863b1.i0("SHOW_CALLS_ONLY");
                    } else if (i14 == 2) {
                        devicePhoneNotificationActivityV3.f42652j.f33863b1.i0("SHOW_CALLS_AND_TEXTS");
                    }
                    wi1.c cVar2 = devicePhoneNotificationActivityV3.f42652j.f33863b1;
                    devicePhoneNotificationActivityV3.f42650h = cVar2.f185502a;
                    devicePhoneNotificationActivityV3.f42646d.setButtonBottomLeftLabel(cVar2.F(context3));
                }
                dialogInterface.dismiss();
                return;
            case 17:
                Context context4 = (Context) obj;
                DevicePhoneNotificationActivityV3 devicePhoneNotificationActivityV4 = ((DevicePhoneNotificationActivityV3.b) obj2).f42660a;
                if (devicePhoneNotificationActivityV4.f42652j.S0()) {
                    DeviceSettingsDTO deviceSettingsDTO = devicePhoneNotificationActivityV4.f42652j;
                    if (i14 == 0) {
                        deviceSettingsDTO.f33865c1.f185503b = "TONE";
                    } else if (i14 == 1) {
                        deviceSettingsDTO.f33865c1.f185503b = "TONE_AND_VIBRATION";
                    } else {
                        deviceSettingsDTO.f33865c1.f185503b = "VIBRATION";
                    }
                    devicePhoneNotificationActivityV4.f42649g.setButtonBottomLeftLabel(deviceSettingsDTO.f33865c1.H(context4));
                }
                dialogInterface.dismiss();
                return;
            case 18:
                Context context5 = (Context) obj;
                DevicePhoneNotificationActivityV3 devicePhoneNotificationActivityV5 = ((DevicePhoneNotificationActivityV3.c) obj2).f42661a;
                if (devicePhoneNotificationActivityV5.f42652j.Q0()) {
                    DeviceSettingsDTO deviceSettingsDTO2 = devicePhoneNotificationActivityV5.f42652j;
                    if (i14 == 0) {
                        deviceSettingsDTO2.f33863b1.f185503b = "TONE";
                    } else if (i14 == 1) {
                        deviceSettingsDTO2.f33863b1.f185503b = "TONE_AND_VIBRATION";
                    } else {
                        deviceSettingsDTO2.f33863b1.f185503b = "VIBRATION";
                    }
                    devicePhoneNotificationActivityV5.f42647e.setButtonBottomLeftLabel(deviceSettingsDTO2.f33863b1.H(context5));
                }
                dialogInterface.dismiss();
                return;
            case 19:
                Context context6 = (Context) obj;
                DevicePhoneNotificationActivityV3 devicePhoneNotificationActivityV6 = ((DevicePhoneNotificationActivityV3.d) obj2).f42662a;
                if (devicePhoneNotificationActivityV6.f42652j.S0()) {
                    if (i14 == 0) {
                        devicePhoneNotificationActivityV6.f42652j.f33865c1.i0("SHOW_ALL");
                    } else if (i14 == 1) {
                        devicePhoneNotificationActivityV6.f42652j.f33865c1.i0("SHOW_CALLS_ONLY");
                    } else if (i14 == 2) {
                        devicePhoneNotificationActivityV6.f42652j.f33865c1.i0("SHOW_CALLS_AND_TEXTS");
                    }
                    wi1.f fVar = devicePhoneNotificationActivityV6.f42652j.f33865c1;
                    devicePhoneNotificationActivityV6.f42651i = fVar.f185502a;
                    devicePhoneNotificationActivityV6.f42648f.setButtonBottomLeftLabel(fVar.F(context6));
                }
                dialogInterface.dismiss();
                return;
            case 20:
                View view3 = (View) obj;
                DevicePhoneNotificationsActivityDefault devicePhoneNotificationsActivityDefault = DevicePhoneNotificationsActivityDefault.this;
                if (devicePhoneNotificationsActivityDefault.f42671i.Q0()) {
                    DeviceSettingsDTO deviceSettingsDTO3 = devicePhoneNotificationsActivityDefault.f42671i;
                    if (i14 == 0) {
                        deviceSettingsDTO3.f33863b1.i0("SHOW_ALL");
                    } else {
                        deviceSettingsDTO3.f33863b1.i0("SHOW_CALLS_ONLY");
                    }
                    wi1.c cVar3 = devicePhoneNotificationsActivityDefault.f42671i.f33863b1;
                    devicePhoneNotificationsActivityDefault.f42669g = cVar3.f185502a;
                    devicePhoneNotificationsActivityDefault.f42665c.setButtonBottomLeftLabel(cVar3.D(view3.getContext()));
                }
                dialogInterface.dismiss();
                return;
            case 21:
                View view4 = (View) obj;
                DevicePhoneNotificationsActivityDefault devicePhoneNotificationsActivityDefault2 = DevicePhoneNotificationsActivityDefault.this;
                if (devicePhoneNotificationsActivityDefault2.f42671i.S0()) {
                    DeviceSettingsDTO deviceSettingsDTO4 = devicePhoneNotificationsActivityDefault2.f42671i;
                    if (i14 == 0) {
                        deviceSettingsDTO4.f33865c1.f185503b = "TONE";
                    } else if (i14 == 1) {
                        deviceSettingsDTO4.f33865c1.f185503b = "TONE_AND_VIBRATION";
                    } else {
                        deviceSettingsDTO4.f33865c1.f185503b = "VIBRATION";
                    }
                    devicePhoneNotificationsActivityDefault2.f42668f.setButtonBottomLeftLabel(deviceSettingsDTO4.f33865c1.H(view4.getContext()));
                }
                dialogInterface.dismiss();
                return;
            case 22:
                View view5 = (View) obj;
                DevicePhoneNotificationsActivityDefault devicePhoneNotificationsActivityDefault3 = DevicePhoneNotificationsActivityDefault.this;
                if (devicePhoneNotificationsActivityDefault3.f42671i.Q0()) {
                    DeviceSettingsDTO deviceSettingsDTO5 = devicePhoneNotificationsActivityDefault3.f42671i;
                    if (i14 == 0) {
                        deviceSettingsDTO5.f33863b1.f185503b = "TONE";
                    } else if (i14 == 1) {
                        deviceSettingsDTO5.f33863b1.f185503b = "TONE_AND_VIBRATION";
                    } else {
                        deviceSettingsDTO5.f33863b1.f185503b = "VIBRATION";
                    }
                    devicePhoneNotificationsActivityDefault3.f42666d.setButtonBottomLeftLabel(deviceSettingsDTO5.f33863b1.H(view5.getContext()));
                }
                dialogInterface.dismiss();
                return;
            case 23:
                View view6 = (View) obj;
                DevicePhoneNotificationsActivityDefault devicePhoneNotificationsActivityDefault4 = DevicePhoneNotificationsActivityDefault.this;
                if (devicePhoneNotificationsActivityDefault4.f42671i.S0()) {
                    DeviceSettingsDTO deviceSettingsDTO6 = devicePhoneNotificationsActivityDefault4.f42671i;
                    if (i14 == 0) {
                        deviceSettingsDTO6.f33865c1.i0("SHOW_ALL");
                    } else {
                        deviceSettingsDTO6.f33865c1.i0("SHOW_CALLS_ONLY");
                    }
                    wi1.f fVar2 = devicePhoneNotificationsActivityDefault4.f42671i.f33865c1;
                    devicePhoneNotificationsActivityDefault4.f42670h = fVar2.f185502a;
                    devicePhoneNotificationsActivityDefault4.f42667e.setButtonBottomLeftLabel(fVar2.D(view6.getContext()));
                }
                dialogInterface.dismiss();
                return;
            case 24:
                Context context7 = (Context) obj;
                DevicePhoneNotificationsWithPrivacyActivity devicePhoneNotificationsWithPrivacyActivity = ((DevicePhoneNotificationsWithPrivacyActivity.a) obj2).f42711a;
                if (devicePhoneNotificationsWithPrivacyActivity.f42703k.Q0()) {
                    if (i14 == 0) {
                        devicePhoneNotificationsWithPrivacyActivity.f42703k.f33863b1.i0("SHOW_ALL");
                    } else if (i14 == 1) {
                        devicePhoneNotificationsWithPrivacyActivity.f42703k.f33863b1.i0("SHOW_CALLS_ONLY");
                    } else if (i14 == 2) {
                        devicePhoneNotificationsWithPrivacyActivity.f42703k.f33863b1.i0("SHOW_CALLS_AND_TEXTS");
                    }
                    wi1.c cVar4 = devicePhoneNotificationsWithPrivacyActivity.f42703k.f33863b1;
                    devicePhoneNotificationsWithPrivacyActivity.f42701i = cVar4.f185502a;
                    devicePhoneNotificationsWithPrivacyActivity.f42697e.setButtonBottomLeftLabel(cVar4.F(context7));
                }
                dialogInterface.dismiss();
                return;
            case 25:
                Context context8 = (Context) obj;
                DevicePhoneNotificationsWithPrivacyActivity devicePhoneNotificationsWithPrivacyActivity2 = ((DevicePhoneNotificationsWithPrivacyActivity.b) obj2).f42712a;
                if (devicePhoneNotificationsWithPrivacyActivity2.f42703k.S0()) {
                    DeviceSettingsDTO deviceSettingsDTO7 = devicePhoneNotificationsWithPrivacyActivity2.f42703k;
                    if (i14 == 0) {
                        deviceSettingsDTO7.f33865c1.f185503b = "TONE";
                    } else if (i14 == 1) {
                        deviceSettingsDTO7.f33865c1.f185503b = "TONE_AND_VIBRATION";
                    } else {
                        deviceSettingsDTO7.f33865c1.f185503b = "VIBRATION";
                    }
                    devicePhoneNotificationsWithPrivacyActivity2.f42700h.setButtonBottomLeftLabel(deviceSettingsDTO7.f33865c1.H(context8));
                }
                dialogInterface.dismiss();
                return;
            case 26:
                Context context9 = (Context) obj;
                DevicePhoneNotificationsWithPrivacyActivity devicePhoneNotificationsWithPrivacyActivity3 = ((DevicePhoneNotificationsWithPrivacyActivity.c) obj2).f42713a;
                if (devicePhoneNotificationsWithPrivacyActivity3.f42703k.Q0()) {
                    DeviceSettingsDTO deviceSettingsDTO8 = devicePhoneNotificationsWithPrivacyActivity3.f42703k;
                    if (i14 == 0) {
                        deviceSettingsDTO8.f33863b1.f185503b = "TONE";
                    } else if (i14 == 1) {
                        deviceSettingsDTO8.f33863b1.f185503b = "TONE_AND_VIBRATION";
                    } else {
                        deviceSettingsDTO8.f33863b1.f185503b = "VIBRATION";
                    }
                    devicePhoneNotificationsWithPrivacyActivity3.f42698f.setButtonBottomLeftLabel(deviceSettingsDTO8.f33863b1.H(context9));
                }
                dialogInterface.dismiss();
                return;
            case 27:
                Context context10 = (Context) obj;
                DevicePhoneNotificationsWithPrivacyActivity devicePhoneNotificationsWithPrivacyActivity4 = ((DevicePhoneNotificationsWithPrivacyActivity.d) obj2).f42714a;
                if (devicePhoneNotificationsWithPrivacyActivity4.f42703k.S0()) {
                    if (i14 == 0) {
                        devicePhoneNotificationsWithPrivacyActivity4.f42703k.f33865c1.i0("SHOW_ALL");
                    } else if (i14 == 1) {
                        devicePhoneNotificationsWithPrivacyActivity4.f42703k.f33865c1.i0("SHOW_CALLS_ONLY");
                    } else if (i14 == 2) {
                        devicePhoneNotificationsWithPrivacyActivity4.f42703k.f33865c1.i0("SHOW_CALLS_AND_TEXTS");
                    }
                    wi1.f fVar3 = devicePhoneNotificationsWithPrivacyActivity4.f42703k.f33865c1;
                    devicePhoneNotificationsWithPrivacyActivity4.f42702j = fVar3.f185502a;
                    devicePhoneNotificationsWithPrivacyActivity4.f42699g.setButtonBottomLeftLabel(fVar3.F(context10));
                }
                dialogInterface.dismiss();
                return;
            case 28:
                float[] fArr = (float[]) obj;
                ExoPlayer exoPlayer = ((FBTTrainingGuidancePlayerActivity) obj2).f45484a;
                if (exoPlayer != null) {
                    exoPlayer.setPlaybackSpeed(fArr[i14]);
                }
                dialogInterface.dismiss();
                return;
            default:
                e23.p pVar = (e23.p) obj2;
                e23.a aVar9 = (e23.a) obj;
                if (pVar != null) {
                    pVar.invoke(null, null);
                }
                aVar9.invoke();
                return;
        }
    }

    public /* synthetic */ t(int i14, Object obj, Object obj2) {
        this.f138313a = i14;
        this.f138314b = obj;
        this.f138315c = obj2;
    }
}
