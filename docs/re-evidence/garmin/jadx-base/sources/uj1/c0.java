package uj1;

import android.content.Context;
import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSSettingsLauncherActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e f171496b;

    public /* synthetic */ c0(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e eVar, int i14) {
        this.f171495a = i14;
        this.f171496b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f171495a;
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e eVar = this.f171496b;
        switch (i14) {
            case 0:
                wj1.a aVar = (wj1.a) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                aVar.getClass();
                eVar.w6(aVar);
                break;
            case 1:
                wj1.a aVar3 = (wj1.a) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                aVar3.getClass();
                eVar.w6(aVar3);
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar5 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                if (zBooleanValue) {
                    ((vi1.a) KoinJavaComponent.get$default(vi1.a.class, null, null, 6, null)).a().i(false);
                }
                eVar.v6().a5(zBooleanValue);
                break;
            case 3:
                String str = (String) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar6 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                str.getClass();
                eVar.v6().W4(str);
                break;
            case 4:
                o13.p pVar = (o13.p) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                pVar.getClass();
                Integer num = (Integer) pVar.f128594a;
                Integer num2 = (Integer) pVar.f128595b;
                if (num != null && num2 != null) {
                    int iIntValue = num.intValue();
                    int iIntValue2 = num2.intValue();
                    androidx.appcompat.app.e.a aVar8 = new androidx.appcompat.app.e.a(eVar.requireContext());
                    aVar8.setTitle(iIntValue);
                    aVar8.setMessage(iIntValue2);
                    aVar8.setCancelable(false);
                    if (iIntValue == R.string.lte_not_activated && (iIntValue2 == R.string.safety_features_wizard_lte_activation_2 || iIntValue2 == R.string.lte_enable_assistance_plus)) {
                        aVar8.setPositiveButton(R.string.lte_set_up_button_title, new sa2.b(eVar, 9));
                        aVar8.setNegativeButton(R.string.lbl_cancel, new ty1.o(14));
                        aVar8.create().show();
                    } else {
                        aVar8.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                        aVar8.create().show();
                    }
                }
                break;
            case 5:
                wj1.a aVar9 = (wj1.a) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar10 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                aVar9.getClass();
                eVar.w6(aVar9);
                break;
            case 6:
                o13.p pVar2 = (o13.p) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar11 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                pVar2.getClass();
                sd2.f fVar = (sd2.f) pVar2.f128594a;
                int iIntValue3 = ((Number) pVar2.f128595b).intValue();
                RTSSettingsLauncherActivity.a aVar12 = RTSSettingsLauncherActivity.f34352a;
                Context contextRequireContext = eVar.requireContext();
                contextRequireContext.getClass();
                aVar12.getClass();
                eVar.startActivity(RTSSettingsLauncherActivity.a.a(contextRequireContext, fVar, iIntValue3, true, null, null));
                break;
            default:
                Long l14 = (Long) obj;
                l14.getClass();
                eVar.f43782e.a(l14, null);
                break;
        }
        return Unit.INSTANCE;
    }
}
