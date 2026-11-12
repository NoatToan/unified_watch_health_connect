package xg1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.v1;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.UserDevicesActivity;
import com.garmin.android.apps.connectmobile.cannedtextreply.CannedTextReplyActivity;
import com.garmin.android.apps.connectmobile.consent.ConsentDeleteDataActivity;
import com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity;
import com.garmin.android.apps.connectmobile.consent.UploadConsentRedirectActivity;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.setup.BLEDeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.BLEDeviceSetupWizardActivity;
import com.garmin.android.apps.connectmobile.moveiq.MoveIQEventDetailsActivity;
import com.garmin.android.apps.connectmobile.promotions.CampaignInfoFullScreenActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music.Vivoactive3MusicAppearanceActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive3musiclte.Vivoactive3MusicLteAppearanceActivity;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.HRZonesConfigActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.HRZonesConfigVivosmart3Activity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.HRZonesConfigVivosportActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import o53.s0;
import xk1.v;
import xn2.h0;
import yr.o0;
import z10.d1;
import zb0.a0;
import zb0.n0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f190902b;

    public /* synthetic */ l(com.garmin.android.apps.connectmobile.devices.model.t tVar, ab2.a aVar) {
        this.f190901a = 19;
        this.f190902b = tVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f9  */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, o13.l] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        String string;
        Editable text;
        String str;
        int i15 = this.f190901a;
        intent = null;
        intent = null;
        intent = null;
        Intent intent = null;
        Object obj = this.f190902b;
        switch (i15) {
            case 0:
                m mVar = (m) obj;
                m.a aVar = m.f190903g;
                dialogInterface.getClass();
                EditText editText = mVar.f190905a;
                if (editText == null || (text = editText.getText()) == null || (string = text.toString()) == null) {
                    string = "";
                }
                int i16 = string.length() > 0 ? Integer.parseInt(string) : 0;
                View view2 = mVar.f190909e;
                SwitchCompat switchCompat = view2 != null ? (SwitchCompat) view2.findViewById(R.id.addGoalButton) : null;
                if (i16 > 0 || (switchCompat != null && switchCompat.isChecked())) {
                    h hVar = m.f190904h;
                    if (hVar != null) {
                        hVar.d(i16, switchCompat != null && switchCompat.isChecked());
                    }
                    if (mVar.f190910f != null) {
                        n nVar = new n();
                        nVar.f190912a = i16;
                        nVar.f190913b = switchCompat != null && switchCompat.isChecked();
                        i<n> iVar = mVar.f190910f;
                        iVar.getClass();
                        iVar.a(nVar);
                    }
                }
                dialogInterface.dismiss();
                return;
            case 1:
                xh1.j jVar = (xh1.j) obj;
                NumberPicker numberPicker = jVar.f191071d;
                if (numberPicker == null) {
                    p005kotlin.jvm.internal.s.m("minutesPicker");
                    throw null;
                }
                int value = numberPicker.getValue() * 60;
                NumberPicker numberPicker2 = jVar.f191072e;
                if (numberPicker2 == null) {
                    p005kotlin.jvm.internal.s.m("secondsPicker");
                    throw null;
                }
                int value2 = numberPicker2.getValue() + value;
                l3.f23124b.getClass();
                jVar.f191070c.invoke(Long.valueOf(value2 > 0 ? (int) Math.round((100.0d / ((double) value2)) * ((double) 1000)) : 0));
                dialogInterface.dismiss();
                return;
            case 2:
                HRZonesConfigActivity.a aVar2 = HRZonesConfigActivity.f44028j;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                ((HRZonesConfigActivity) obj).finish();
                return;
            case 3:
                int i17 = HRZonesConfigVivosmart3Activity.f44037h;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                ((HRZonesConfigVivosmart3Activity) obj).finish();
                return;
            case 4:
                int i18 = HRZonesConfigVivosportActivity.f44047j;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                ((HRZonesConfigVivosportActivity) obj).finish();
                return;
            case 5:
                xk1.j jVar2 = (xk1.j) obj;
                dialogInterface.getClass();
                vk1.d.a aVar3 = vk1.d.f178596a;
                int i19 = jVar2.f191233d;
                PowerZonesDTO powerZonesDTO = jVar2.f191230a;
                powerZonesDTO.getClass();
                aVar3.getClass();
                vk1.e eVarC = vk1.d.a.c(powerZonesDTO);
                powerZonesDTO.f43987b = vk1.d.a.b(i19, eVarC);
                int[] iArr = (eVarC != null ? vk1.d.a.C3337a.f178597a[eVarC.ordinal()] : -1) == 3 ? new int[]{0, 65, 80, 90, 100, 115, 130} : new int[]{0, 55, 75, 90, 105, 120, 150};
                int i24 = iArr[0];
                powerZonesDTO.f43995j = i24;
                powerZonesDTO.f43996k = iArr[1];
                powerZonesDTO.f43997l = iArr[2];
                powerZonesDTO.f43998m = iArr[3];
                powerZonesDTO.f43999n = iArr[4];
                powerZonesDTO.f44000o = iArr[5];
                if (iArr.length > 6) {
                    powerZonesDTO.f44001p = iArr[6];
                }
                powerZonesDTO.f43988c = vk1.d.a.a(i24, powerZonesDTO.f43987b);
                powerZonesDTO.f43989d = vk1.d.a.a(powerZonesDTO.f43996k, powerZonesDTO.f43987b);
                powerZonesDTO.f43990e = vk1.d.a.a(powerZonesDTO.f43997l, powerZonesDTO.f43987b);
                powerZonesDTO.f43991f = vk1.d.a.a(powerZonesDTO.f43998m, powerZonesDTO.f43987b);
                powerZonesDTO.f43992g = vk1.d.a.a(powerZonesDTO.f43999n, powerZonesDTO.f43987b);
                powerZonesDTO.f43993h = vk1.d.a.a(powerZonesDTO.f44000o, powerZonesDTO.f43987b);
                powerZonesDTO.f43994i = vk1.d.a.a(powerZonesDTO.f44001p, powerZonesDTO.f43987b);
                xk1.j.v6(jVar2);
                jVar2.f191231b = true;
                jVar2.C6();
                jVar2.f191232c = true;
                dialogInterface.dismiss();
                return;
            case 6:
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c cVar = (com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c) obj;
                dialogInterface.getClass();
                vk1.f fVar = cVar.f44131a;
                fVar.getClass();
                vk1.c.i(fVar);
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c.v6(cVar);
                cVar.f44133c = true;
                cVar.E6();
                dialogInterface.dismiss();
                return;
            case 7:
                ((h0) ((xn2.h) obj).b()).n();
                dialogInterface.dismiss();
                return;
            case 8:
                SpinnerDialogView.b((SpinnerDialogView) obj, dialogInterface, i14);
                return;
            case 9:
                CampaignInfoFullScreenActivity campaignInfoFullScreenActivity = (CampaignInfoFullScreenActivity) obj;
                ff2.c cVar2 = campaignInfoFullScreenActivity.f41035b;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("interactor");
                    throw null;
                }
                kf2.a aVar4 = kf2.a.EMAIL_ME;
                ff2.a aVar5 = campaignInfoFullScreenActivity.f41036c;
                if (aVar5 == null) {
                    p005kotlin.jvm.internal.s.m("campaign");
                    throw null;
                }
                cVar2.c(aVar4, aVar5.getCampaignId());
                dialogInterface.dismiss();
                return;
            case 10:
                Vivoactive3MusicAppearanceActivity vivoactive3MusicAppearanceActivity = ((Vivoactive3MusicAppearanceActivity.a) obj).f43166a;
                vivoactive3MusicAppearanceActivity.setResult(999);
                vivoactive3MusicAppearanceActivity.finish();
                return;
            case 11:
                int i25 = yn2.b.G0;
                dialogInterface.dismiss();
                ((vn2.t) obj).invoke(dialogInterface);
                return;
            case 12:
                int i26 = yn2.b.G0;
                ((yn2.b) obj).getF52032a().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.garmin.com/ja-JP/?faq=VGrIr1k7y04yGjCpwyBjlA")));
                return;
            case 13:
                dialogInterface.dismiss();
                ((yp2.c) ((yp2.f) obj).getView()).c();
                return;
            case 14:
                ConsentDeleteDataActivity.a aVar6 = ConsentDeleteDataActivity.f32160d;
                dialogInterface.getClass();
                ((v92.i.b) ((v92.i) obj)).f176397c.invoke(Boolean.TRUE);
                return;
            case 15:
                d1 d1Var = d1.f200951a;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                ((v92.i.b) obj).f176397c.invoke(Boolean.TRUE);
                return;
            case 16:
                d1 d1Var2 = d1.f200951a;
                ((o0) obj).invoke();
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                    return;
                }
                return;
            case 17:
                ProductImprovementConsentActivity productImprovementConsentActivity = (ProductImprovementConsentActivity) obj;
                productImprovementConsentActivity.setResult(0);
                productImprovementConsentActivity.finish();
                return;
            case 18:
                UploadConsentRedirectActivity uploadConsentRedirectActivity = (UploadConsentRedirectActivity) obj;
                UploadConsentRedirectActivity.a aVar7 = UploadConsentRedirectActivity.f32243t;
                dialogInterface.dismiss();
                com.garmin.android.apps.connectmobile.devices.model.l lVar = uploadConsentRedirectActivity.f32245r;
                lVar.getClass();
                n0.a(lVar.getDeviceUnitId(), UploadConsentRedirectActivity.f32244v);
                uploadConsentRedirectActivity.finish();
                return;
            case 19:
                ((com.garmin.android.apps.connectmobile.devices.model.t) obj).b();
                return;
            case 20:
                a0 a0Var = (a0) obj;
                Context context = a0Var.f203422a;
                com.garmin.android.apps.connectmobile.devices.model.l lVar2 = a0Var.f203424c;
                bd0.a aVar8 = a0Var.f203423b;
                if (aVar8 == null || lVar2 == null) {
                    if (intent == null) {
                        UserDevicesActivity.ca(context);
                    } else {
                        context.startActivity(intent);
                    }
                } else if (d1.f()) {
                    context.getClass();
                    d1.o(context, new v(12));
                } else if (x80.d.c(lVar2.getPartNumberPartial())) {
                    bm2.a aVarB = aVar8.b();
                    com.garmin.android.apps.connectmobile.devices.model.l lVar3 = a0Var.f203424c;
                    DeviceSetupActivity.a aVar9 = DeviceSetupActivity.f33758b;
                    aVar9.getClass();
                    context.getClass();
                    DeviceSetupActivity.a.e(aVar9, context, aVarB, lVar3, null, 24);
                } else {
                    u0 u0Var = (u0) u0.f203782n6.get(lVar2.getPartNumberPartial());
                    if (u0Var != null && (str = u0Var.f203855b) != null) {
                        if (x80.d.b(lVar2.getPartNumberPartial())) {
                            intent = new Intent(context, (Class<?>) BLEDeviceSetupWizardActivity.class);
                            intent.putExtra("GCM_deviceDTO", lVar2);
                            intent.putExtra("GCM_bleDevice", aVar8);
                        } else {
                            intent = new Intent(context, (Class<?>) BLEDeviceSetupActivity.class);
                            intent.putExtra("extra_device_dto", lVar2);
                            intent.putExtra("extra_ble_device", aVar8);
                            intent.putExtra("extra_setup_strategy_classname", str);
                        }
                    }
                    if (intent == null) {
                        UserDevicesActivity.ca(context);
                    } else {
                        context.startActivity(intent);
                    }
                }
                dialogInterface.dismiss();
                return;
            case 21:
                Vivoactive3MusicLteAppearanceActivity vivoactive3MusicLteAppearanceActivity = ((Vivoactive3MusicLteAppearanceActivity.a) obj).f43177a;
                vivoactive3MusicLteAppearanceActivity.setResult(999);
                vivoactive3MusicLteAppearanceActivity.finish();
                return;
            case 22:
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j jVar3 = (com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j) obj;
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.a aVar10 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.f29365e;
                g22.e.l(jVar3);
                ap.d dVar = jVar3.f29366a;
                if (dVar == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                int i27 = jVar3.f29369d;
                w9.a aVarA = v1.a(dVar);
                x53.c cVar3 = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new ap.e(dVar, i27, null), 2);
                return;
            case 23:
                MoveIQEventDetailsActivity moveIQEventDetailsActivity = (MoveIQEventDetailsActivity) obj;
                MoveIQEventDetailsActivity.a aVar11 = MoveIQEventDetailsActivity.f39211k;
                dialogInterface.getClass();
                gs1.f fVar2 = moveIQEventDetailsActivity.f39219h;
                if (fVar2 != null) {
                    moveIQEventDetailsActivity.showProgressOverlay();
                    zx0.j jVar4 = (zx0.j) moveIQEventDetailsActivity.f39212a.getValue();
                    jVar4.getClass();
                    ge1.b.T(v1.a(jVar4), null, null, new zx0.h(jVar4, fVar2, null), 3);
                }
                dialogInterface.dismiss();
                return;
            default:
                CannedTextReplyActivity cannedTextReplyActivity = ((com.garmin.android.apps.connectmobile.cannedtextreply.c) obj).f31308a;
                if (cannedTextReplyActivity != null) {
                    cannedTextReplyActivity.f31275k = -1;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ l(Object obj, int i14) {
        this.f190901a = i14;
        this.f190902b = obj;
    }
}
