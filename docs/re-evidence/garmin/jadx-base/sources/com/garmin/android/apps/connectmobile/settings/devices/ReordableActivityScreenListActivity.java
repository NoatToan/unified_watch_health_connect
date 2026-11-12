package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.y;
import com.garmin.android.apps.connectmobile.devices.model.z;
import com.mobeta.android.dslv.DragSortListView;
import fh1.a1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ReordableActivityScreenListActivity extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f42164i = 0;

    @Override // com.garmin.android.apps.connectmobile.settings.devices.f, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        a1 a1VarA;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        initActionBar(true, extras.getString("GCM_deviceSettingsTitle"));
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) extras.getParcelable("GCM_deviceSettings");
        this.f42948a = deviceSettingsDTO;
        if (deviceSettingsDTO == null) {
            finish();
            return;
        }
        z zVarC = deviceSettingsDTO.C();
        if (zVarC == null) {
            finish();
            return;
        }
        List<y> list = zVarC.f34343c;
        this.f42949b = list;
        if (list == null) {
            finish();
            return;
        }
        Collections.sort(list, new androidx.browser.trusted.c(21));
        for (y yVar : this.f42949b) {
            String str = yVar.f34328a;
            if (str != null && (a1VarA = fh1.f.a(str, this)) != null) {
                this.f42950c.add(new f.d(this, yVar.f34328a, a1VarA.t(), a1VarA.q(this.f42948a)));
            }
        }
        this.f42951d = (DragSortListView) findViewById(R.id.reorder_list);
        ca();
    }
}
