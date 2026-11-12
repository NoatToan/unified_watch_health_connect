package dd0;

import android.content.IntentSender;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.BLEScanningWizardActivity;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class g implements lu2.a.InterfaceC2186a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BLEScanningWizardActivity f59164a;

    public g(BLEScanningWizardActivity bLEScanningWizardActivity) {
        this.f59164a = bLEScanningWizardActivity;
    }

    @Override // lu2.a.InterfaceC2186a
    public final void a(CharSequence charSequence) {
        i2.f(a2.DEVICES, "BLEScanningWizardActivity", "Companion device -> Failed to associate companion device: " + ((Object) charSequence));
        int i14 = BLEScanningWizardActivity.f34476l;
        this.f59164a.ja();
    }

    @Override // lu2.a.InterfaceC2186a
    public final void b(IntentSender intentSender) {
        i2.a(a2.DEVICES, "BLEScanningWizardActivity", "Companion Device -> onAssociationPending SUCCESS");
        try {
            this.f59164a.startIntentSenderForResult(intentSender, 4, null, 0, 0, 0);
        } catch (IntentSender.SendIntentException e4) {
            i2.f(a2.DEVICES, "BLEScanningWizardActivity", "Companion device -> Failed to start companion device intent: " + e4.getMessage());
            int i14 = BLEScanningWizardActivity.f34476l;
            this.f59164a.ja();
        }
    }
}
