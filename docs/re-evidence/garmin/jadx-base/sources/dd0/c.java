package dd0;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.text.TextUtils;
import androidx.lifecycle.v1;
import bd0.h0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.BLEDeviceSetupWizardActivity;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class c implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BLEDeviceSetupWizardActivity f59156a;

    public c(BLEDeviceSetupWizardActivity bLEDeviceSetupWizardActivity) {
        this.f59156a = bLEDeviceSetupWizardActivity;
    }

    @Override // bd0.h0
    public final void A() {
        this.f59156a.ja(9);
    }

    @Override // rm2.a
    public final void B(BluetoothDevice bluetoothDevice) {
    }

    @Override // bd0.h0
    public final void D() {
        BLEDeviceSetupWizardActivity bLEDeviceSetupWizardActivity = this.f59156a;
        bLEDeviceSetupWizardActivity.ia(com.garmin.android.apps.connectmobile.devices.setup.wizard.a.u6("REQUEST_DEVICE_RESET", bLEDeviceSetupWizardActivity.f59153b.E(), bLEDeviceSetupWizardActivity.getString(R.string.lbl_reset_device), bLEDeviceSetupWizardActivity.getString(R.string.pairing_reset_message_1), bLEDeviceSetupWizardActivity.getString(R.string.lbl_reset), bLEDeviceSetupWizardActivity.getString(R.string.lbl_cancel)), null, true);
    }

    @Override // bd0.h0
    public final void E() {
        this.f59156a.ja(7);
    }

    @Override // bd0.h0
    public final void G() {
    }

    @Override // bd0.h0
    public final void I() {
        this.f59156a.ja(6);
    }

    @Override // bd0.h0
    public final void L(yl2.e eVar) {
        this.f59156a.ja(6);
    }

    @Override // bd0.h0
    public final void M() {
        BLEDeviceSetupWizardActivity bLEDeviceSetupWizardActivity = this.f59156a;
        bLEDeviceSetupWizardActivity.ia(com.garmin.android.apps.connectmobile.devices.setup.wizard.a.u6("REPLACE_ACTIVITY_TRACKER", bLEDeviceSetupWizardActivity.f59153b.E(), bLEDeviceSetupWizardActivity.getString(R.string.device_settings_set_as_preferred_activity_tracker_title_question, bLEDeviceSetupWizardActivity.f59152a.getF143516f()), bLEDeviceSetupWizardActivity.getString(R.string.preferred_tracker_conflict_info_1), bLEDeviceSetupWizardActivity.getString(R.string.lbl_yes), bLEDeviceSetupWizardActivity.getString(R.string.preferred_activity_tracker_keep_current_1)), null, true);
    }

    @Override // bd0.h0
    public final void N() {
    }

    @Override // bd0.h0
    public final void O(int i14, Runnable runnable, Intent intent) {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "BLEDeviceSetupWizardActivity", "exitFlow(): has 'runnableToExecuteBeforeFinish' ".concat(runnable != null ? "[yes]" : "[no]"));
        GarminDeviceWakefulService.g("BLEDeviceSetupWizardActivity", false);
        BLEDeviceSetupWizardActivity bLEDeviceSetupWizardActivity = this.f59156a;
        bLEDeviceSetupWizardActivity.setResult(i14);
        bLEDeviceSetupWizardActivity.f34465h = intent;
        if (i14 == -1) {
            bLEDeviceSetupWizardActivity.la();
            if (bLEDeviceSetupWizardActivity.f34462e != null) {
                i2.f36769a.getClass();
                i2.a.b(a2Var, "BLEDeviceSetupWizardActivity", ".exitFlow(): Sending milestone FINISHED_WITH_SUCCESS to device.");
                hk0.a.f().l(hk0.a.EnumC1667a.FINISHED_WITH_SUCCESS, bLEDeviceSetupWizardActivity.f34461d.getF143511a(), null, null);
            } else {
                i2.f36769a.getClass();
                i2.a.f(a2Var, "BLEDeviceSetupWizardActivity", ".exitFlow(): Cannot sending milestone FINISHED_WITH_SUCCESS to device because mBLEDevice object is null! WTF!?");
            }
            if (bLEDeviceSetupWizardActivity.f34465h == null) {
                com.garmin.android.apps.connectmobile.navigation.b.b();
                Intent intent2 = new Intent(bLEDeviceSetupWizardActivity, (Class<?>) DashboardActivity.class);
                bLEDeviceSetupWizardActivity.f34465h = intent2;
                intent2.addFlags(268468224);
            }
        }
        if (runnable != null) {
            bLEDeviceSetupWizardActivity.runOnUiThread(runnable);
        }
        d dVar = bLEDeviceSetupWizardActivity.f34460c;
        dVar.getClass();
        androidx.lifecycle.m.a(v1.a(dVar).f183565a, new e(bLEDeviceSetupWizardActivity, null), 2).f(bLEDeviceSetupWizardActivity, new a4.b(this, 15));
    }

    @Override // bd0.h0
    public final void P() {
    }

    @Override // bd0.h0
    public final void Q() {
    }

    @Override // bd0.h0
    public final void R() {
    }

    @Override // bd0.h0
    public final void S(a0.h hVar) {
        ((cd0.c) hVar.f34b).s(-1, false, null, (Intent) hVar.f35c);
    }

    @Override // bd0.h0
    public final void T() {
    }

    @Override // bd0.h0
    public final void U() {
        this.f59156a.ja(8);
    }

    @Override // bd0.h0
    public final void V() {
        this.f59156a.ja(4);
    }

    @Override // bd0.h0
    public final void X(String str) {
        this.f59156a.ja(9);
    }

    @Override // bd0.h0
    public final void Y() {
        this.f59156a.ja(2);
    }

    @Override // bd0.h0
    public final void Z() {
        this.f59156a.ka();
    }

    @Override // bd0.h0
    public final void a0() {
        this.f59156a.ja(3);
    }

    @Override // bd0.h0
    public final void b() {
    }

    @Override // bd0.h0
    public final void b0() {
    }

    @Override // bd0.h0
    public final void c() {
    }

    @Override // bd0.h0
    public final void d() {
        BLEDeviceSetupWizardActivity bLEDeviceSetupWizardActivity = this.f59156a;
        bLEDeviceSetupWizardActivity.f34466i = true;
        com.garmin.android.apps.connectmobile.devices.setup.wizard.d dVar = (com.garmin.android.apps.connectmobile.devices.setup.wizard.d) bLEDeviceSetupWizardActivity.getSupportFragmentManager().G("DEVICE_SETUP_FRAGMENT");
        if (dVar == null || !dVar.isAdded()) {
            return;
        }
        if (bLEDeviceSetupWizardActivity.f34468k == null) {
            bLEDeviceSetupWizardActivity.f34468k = bLEDeviceSetupWizardActivity.f59153b.w();
        }
        int i14 = bLEDeviceSetupWizardActivity.f34468k != null ? R.string.lbl_next : R.string.lbl_common_continue;
        dVar.f34523e.setImageResource(dVar.f34525g);
        dVar.f34519a.setVisibility(8);
        dVar.f34520b.setVisibility(0);
        dVar.f34521c.setText(dVar.getString(R.string.lbl_setup_successful));
        dVar.f34522d.setVisibility(0);
        dVar.f34522d.setText(i14);
    }

    @Override // bd0.h0
    public final void d0(yl2.e eVar) {
        this.f59156a.ka();
    }

    @Override // bd0.h0
    public final void e(int i14) {
    }

    @Override // bd0.h0
    public final void e0() {
    }

    @Override // bd0.h0
    public final void f() {
        bo1.a.a().getClass();
        bo1.a.b();
        this.f59156a.ja(11);
    }

    @Override // bd0.h0
    public final void g(boolean z14) {
        BLEDeviceSetupWizardActivity bLEDeviceSetupWizardActivity = this.f59156a;
        if (z14) {
            bLEDeviceSetupWizardActivity.ja(10);
        } else {
            bLEDeviceSetupWizardActivity.ka();
        }
    }

    @Override // bd0.h0
    public final void h() {
        this.f59156a.ja(1);
    }

    @Override // bd0.h0
    public final void i(long j8) {
    }

    @Override // rm2.a
    public final void j(BluetoothDevice bluetoothDevice) {
    }

    @Override // bd0.h0
    public final void k(long j8) {
    }

    @Override // bd0.h0
    public final void l(int i14) {
    }

    @Override // bd0.h0
    public final void n() {
    }

    @Override // bd0.h0
    public final void o(String str) {
        this.f59156a.ja(7);
    }

    @Override // bd0.h0
    public final void p(yl2.e eVar) {
        this.f59156a.ka();
    }

    @Override // bd0.h0
    public final void r() {
        this.f59156a.ja(6);
    }

    @Override // bd0.h0
    public final void s(String str) {
        this.f59156a.ja(8);
    }

    @Override // bd0.h0
    public final void u() {
    }

    @Override // bd0.h0
    public final void w() {
        this.f59156a.ja(5);
    }

    @Override // bd0.h0
    public final void y(String str) {
        String strN = TextUtils.isEmpty(str) ? "Failed connecting to device" : fb1.c.n("Failed connecting to device: ", str);
        hk0.a aVarF = hk0.a.f();
        hk0.a.EnumC1667a enumC1667a = hk0.a.EnumC1667a.FINISHED_WITH_FAILURE;
        BLEDeviceSetupWizardActivity bLEDeviceSetupWizardActivity = this.f59156a;
        aVarF.l(enumC1667a, bLEDeviceSetupWizardActivity.f34461d.getF143511a(), null, strN);
        bLEDeviceSetupWizardActivity.ka();
    }

    @Override // bd0.h0
    public final void z() {
        this.f59156a.ja(1);
    }
}
