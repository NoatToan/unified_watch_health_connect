package of0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.FirstTimeUseFragment;
import com.garmin.android.apps.connectmobile.i2;
import nf0.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirstTimeUseFragment f131674b;

    public /* synthetic */ e(FirstTimeUseFragment firstTimeUseFragment, int i14) {
        this.f131673a = i14;
        this.f131674b = firstTimeUseFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f131673a;
        FirstTimeUseFragment firstTimeUseFragment = this.f131674b;
        switch (i14) {
            case 0:
                int i15 = FirstTimeUseFragment.f34793m;
                ht.a aVar = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new o13.p("ButtonClicked", "Retry"));
                aVar.getClass();
                ht.a.a(bundleA, "ECGVideoPopupRetry");
                firstTimeUseFragment.z6().M4();
                break;
            case 1:
                int i16 = FirstTimeUseFragment.f34793m;
                ht.a aVar2 = ht.a.f85464a;
                Bundle bundleA2 = h7.c.a(new o13.p("ButtonClicked", "Cancel"));
                aVar2.getClass();
                ht.a.a(bundleA2, "ECGVideoPopupRetry");
                firstTimeUseFragment.z6().K4();
                break;
            case 2:
                int i17 = FirstTimeUseFragment.f34793m;
                firstTimeUseFragment.z6().K4();
                break;
            case 3:
                int i18 = FirstTimeUseFragment.f34793m;
                firstTimeUseFragment.H6();
                break;
            case 4:
                int i19 = FirstTimeUseFragment.f34793m;
                a2 a2Var = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "FirstTimeUseFragment", "[displayEcgAppActivationFailedDialog] exit onboarding -> ECG activation failed");
                firstTimeUseFragment.z6().K4();
                break;
            case 5:
                int i24 = FirstTimeUseFragment.f34793m;
                firstTimeUseFragment.H6();
                break;
            case 6:
                int i25 = FirstTimeUseFragment.f34793m;
                a2 a2Var2 = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "FirstTimeUseFragment", "[displayDeviceNotConnectedDialog] exit onboarding -> device not connected");
                firstTimeUseFragment.z6().K4();
                break;
            case 7:
                int i26 = FirstTimeUseFragment.f34793m;
                firstTimeUseFragment.H6();
                break;
            case 8:
                int i27 = FirstTimeUseFragment.f34793m;
                a2 a2Var3 = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var3, "FirstTimeUseFragment", "[displayUnableToLaunchEcgAppDialog] exit onboarding -> unable to launch ECG app");
                firstTimeUseFragment.z6().K4();
                break;
            case 9:
                int i28 = FirstTimeUseFragment.f34793m;
                firstTimeUseFragment.H6();
                break;
            case 10:
                int i29 = FirstTimeUseFragment.f34793m;
                a2 a2Var4 = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "FirstTimeUseFragment", "[displayDeviceBusyDialog] exit onboarding -> unable to launch ECG app");
                firstTimeUseFragment.z6().K4();
                break;
            case 11:
                int i30 = FirstTimeUseFragment.f34793m;
                a2 a2Var5 = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var5, "FirstTimeUseFragment", "[showNoBluetoothDialog] open bluetooth settings");
                firstTimeUseFragment.f34797l.a(new Intent("android.settings.BLUETOOTH_SETTINGS"), null);
                break;
            case 12:
                int i34 = FirstTimeUseFragment.f34793m;
                a2 a2Var6 = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var6, "FirstTimeUseFragment", "[showNoBluetoothDialog] exit onboarding -> unable to launch ECG app");
                firstTimeUseFragment.z6().K4();
                break;
            default:
                int i35 = FirstTimeUseFragment.f34793m;
                a2 a2Var7 = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var7, "FirstTimeUseFragment", "[displayEcgAppEnabledDialog] exit onboarding -> ECG app enabled");
                nf0.o oVarZ6 = firstTimeUseFragment.z6();
                ge1.b.T(v1.a(oVarZ6), null, null, new w(oVarZ6, null), 3);
                firstTimeUseFragment.z6().K4();
                break;
        }
    }
}
