package com.garmin.android.apps.connectmobile.settings.activityoptions;

import android.os.Bundle;
import android.text.TextUtils;
import ch1.g1;
import ch1.w5;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import hb2.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import org.json.JSONException;
import org.json.JSONObject;
import rd2.j;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class DisplayBacklightActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f41627b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d80.f f41628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d80.f f41629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DeviceSettingsDTO f41630e;

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        d80.f fVar = this.f41629d;
        if (fVar != null && !fVar.c()) {
            super.onBackPressed();
            return;
        }
        if (!i.a(this) || this.f41630e == null) {
            return;
        }
        showProgressOverlay();
        JSONObject jSONObject = new JSONObject();
        String string = null;
        try {
            jSONObject.put("backlightMode", this.f41630e.E);
            j jVar = rd2.f.a().f152045a;
            long j8 = this.f41626a;
            jVar.getClass();
            u0 u0Var = (u0) u0.f203782n6.get(j.i(j8, null).getProductNumber());
            if (u0Var != null && u0Var == u0.f203849z1) {
                jSONObject.put("backlightSetting", this.f41630e.I());
            }
            string = jSONObject.toString();
        } catch (JSONException e4) {
            lc.u0.v(e4, new StringBuilder("Error creating save json string: "), a2.SETTINGS, "DisplayBacklightActivity");
        }
        if (TextUtils.isEmpty(string)) {
            hideProgressOverlay();
            finish();
            return;
        }
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        long j14 = this.f41626a;
        hg1.b bVar = new hg1.b(this);
        eVarN.getClass();
        this.f41629d = com.garmin.android.apps.connectmobile.settings.devices.e.Q(j14, string, bVar);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_activity_options_dynamic_content);
        initActionBar(true, R.string.device_setting_display);
        this.f41626a = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f41627b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        ArrayList arrayList = this.f41627b;
        arrayList.clear();
        arrayList.add(new g1(this));
        j jVar = rd2.f.a().f152045a;
        long j8 = this.f41626a;
        jVar.getClass();
        u0 u0Var = (u0) u0.f203782n6.get(j.i(j8, null).getProductNumber());
        if (u0Var != null && u0Var == u0.f203849z1) {
            w5 w5Var = new w5(this);
            w5Var.f27437e = "BackLight Gesture";
            arrayList.add(w5Var);
        }
        if (i.a(this)) {
            showProgressOverlay();
            this.f41628c = com.garmin.android.apps.connectmobile.settings.devices.e.N().r(this.f41626a, new hg1.a(this));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        d80.f fVar = this.f41628c;
        if (fVar != null) {
            fVar.a();
        }
        d80.f fVar2 = this.f41629d;
        if (fVar2 != null) {
            fVar2.f58259c = null;
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
    }
}
