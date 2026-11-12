package bd0;

import android.content.IntentSender;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.BLEScanningActivity;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class k implements lu2.a.InterfaceC2186a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BLEScanningActivity f17585a;

    public k(BLEScanningActivity bLEScanningActivity) {
        this.f17585a = bLEScanningActivity;
    }

    @Override // lu2.a.InterfaceC2186a
    public final void a(CharSequence charSequence) {
        int i14 = BLEScanningActivity.A;
        this.f17585a.da(charSequence);
    }

    @Override // lu2.a.InterfaceC2186a
    public final void b(IntentSender intentSender) {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "BLEScanningActivity", "Companion Device -> onAssociationPending SUCCESS");
        int i14 = BLEScanningActivity.A;
        BLEScanningActivity bLEScanningActivity = this.f17585a;
        bLEScanningActivity.getClass();
        i2.f36769a.getClass();
        i2.a.b(a2Var, "BLEScanningActivity", "Companion device -> associate onDeviceFound");
        bLEScanningActivity.f34431w.removeCallbacksAndMessages(null);
        try {
            bLEScanningActivity.startIntentSenderForResult(intentSender, 4, null, 0, 0, 0);
        } catch (IntentSender.SendIntentException e4) {
            i2.f(a2.DEVICES, "BLEScanningActivity", "Companion device -> failed to start device intent: " + e4.getMessage());
        }
    }
}
