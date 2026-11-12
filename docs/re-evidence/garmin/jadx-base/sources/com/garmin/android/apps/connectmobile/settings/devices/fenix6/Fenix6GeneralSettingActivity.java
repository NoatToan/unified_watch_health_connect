package com.garmin.android.apps.connectmobile.settings.devices.fenix6;

import ch1.c1;
import ch1.h6;
import ch1.k2;
import ch1.l6;
import ch1.o0;
import ch1.q2;
import ch1.s2;
import ch1.s4;
import ch1.u;
import ch1.v;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.backup.DeviceBackupActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusGeneralSettingActivity;
import java.util.ArrayList;
import java.util.Observable;
import org.koin.java.KoinJavaComponent;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
public class Fenix6GeneralSettingActivity extends Fenix5PlusGeneralSettingActivity {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusGeneralSettingActivity, ng1.k0
    public void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        h6 h6Var = new h6(this, this.f125976b);
        this.f42962o = h6Var;
        arrayList.add(h6Var);
        arrayList.add(new l6(this));
        arrayList.add(new u(this));
        arrayList.add(new q2(this));
        arrayList.add(new v(this, this.f125976b, false));
        arrayList.add(new s4(this, true));
        arrayList.add(new c1(this));
        o0 o0Var = new o0(this);
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        if (deviceSettingsDTO != null && o0Var.h(deviceSettingsDTO)) {
            arrayList.add(o0Var);
        }
        arrayList.add(new k2(this));
        if (this.f125977c.X0()) {
            arrayList.add(new s2(this));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusGeneralSettingActivity, ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable instanceof o0) {
            long j8 = this.f125976b;
            DeviceBackupActivity.f42558c.getClass();
            startActivity(DeviceBackupActivity.a.a(this, j8));
        } else {
            if (!(observable instanceof h6)) {
                super.update(observable, obj);
                return;
            }
            d0 d0Var = (d0) KoinJavaComponent.get(d0.class);
            String productDisplayName = this.f125977c.getProductDisplayName();
            d0Var.o(this, this.f125976b, this.f125977c.getProductNumber(), productDisplayName, this.f125977c.getImageURL());
        }
    }
}
