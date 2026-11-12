package com.garmin.android.apps.connectmobile.settings.devices.approachS62;

import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.e;
import ch1.n6;
import ch1.p0;
import ch1.q2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceNameWidgetActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusGeneralSettingActivity;
import java.util.ArrayList;
import java.util.Observable;
import l80.b;
import ng1.k0;
import org.koin.java.KoinJavaComponent;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
public class ApproachS62GeneralSettingActivity extends Fenix5PlusGeneralSettingActivity {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f42557q = 10;

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusGeneralSettingActivity, ng1.k0
    public final void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        arrayList.add(new n6(this));
        arrayList.add(new q2(this));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        DeviceSettingsDTO deviceSettingsDTO;
        super.onActivityResult(i14, i15, intent);
        if (i14 != this.f42557q || i15 != -1 || intent == null || (deviceSettingsDTO = (DeviceSettingsDTO) intent.getParcelableExtra("GCM_deviceSettings")) == null) {
            return;
        }
        k0.ia(this.f125956m, deviceSettingsDTO);
        this.f125985k = deviceSettingsDTO;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusGeneralSettingActivity, ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable instanceof p0) {
            DeviceNameWidgetActivity.a aVar = DeviceNameWidgetActivity.f42633g;
            DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
            aVar.getClass();
            DeviceNameWidgetActivity.a.a(this, deviceSettingsDTO, this.f42557q);
        } else if (observable instanceof q2) {
            if (((b) KoinJavaComponent.get(b.class)).a(this.f125976b)) {
                ((d0) KoinJavaComponent.get(d0.class)).O(this, this.f125976b);
            } else {
                e.a aVar2 = new e.a(this);
                aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                aVar2.create().show();
            }
        }
        super.update(observable, obj);
    }
}
