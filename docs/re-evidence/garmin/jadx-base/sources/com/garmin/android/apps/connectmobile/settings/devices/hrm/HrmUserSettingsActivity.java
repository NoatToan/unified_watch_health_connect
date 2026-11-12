package com.garmin.android.apps.connectmobile.settings.devices.hrm;

import android.os.Bundle;
import ch1.c3;
import ch1.e6;
import ch1.o1;
import com.garmin.android.apps.connectmobile.R;
import ig1.h0;
import ig1.s;
import java.util.ArrayList;
import java.util.Observable;
import ng1.l0;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/hrm/HrmUserSettingsActivity;", "Lng1/l0;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HrmUserSettingsActivity extends l0 {
    @Override // ng1.l0
    public final void da() {
        ArrayList arrayList = this.f125961r;
        arrayList.clear();
        arrayList.add(new c3(this));
        arrayList.add(new h0(this));
        arrayList.add(new o1(this));
        arrayList.add(new e6(this));
        arrayList.add(new s(this));
        l0.ea(this, arrayList, this.f125995i, this);
    }

    @Override // ng1.l0, ng1.q, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.devices_settings_user_settings);
    }

    @Override // ng1.l0, java.util.Observer
    @e
    public final void update(Observable observable, Object obj) {
    }
}
