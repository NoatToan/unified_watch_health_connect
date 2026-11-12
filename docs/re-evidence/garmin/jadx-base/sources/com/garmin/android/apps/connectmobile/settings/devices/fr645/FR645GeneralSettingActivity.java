package com.garmin.android.apps.connectmobile.settings.devices.fr645;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;
import ch1.c1;
import ch1.g3;
import ch1.h6;
import ch1.k2;
import ch1.l6;
import ch1.q2;
import ch1.s2;
import ch1.s4;
import ch1.u;
import ch1.v;
import ch1.w;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import fb2.e;
import fb2.g;
import fb2.r;
import java.util.ArrayList;
import java.util.Observable;
import ng1.k0;
import org.koin.java.KoinJavaComponent;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
public class FR645GeneralSettingActivity extends k0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h6 f43012o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Handler f43013p = null;

    @Override // ng1.k0
    public void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        h6 h6Var = new h6(this, this.f125976b);
        this.f43012o = h6Var;
        arrayList.add(h6Var);
        arrayList.add(new l6(this));
        arrayList.add(new u(this));
        arrayList.add(new q2(this));
        arrayList.add(new v(this, this.f125976b, false));
        arrayList.add(new g3(this));
        arrayList.add(new s4(this));
        arrayList.add(new c1(this));
        arrayList.add(new k2(this));
        if (this.f125977c.X0()) {
            arrayList.add(new s2(this));
        }
    }

    @Override // ng1.k0
    public final void ha() {
        if (this.f125985k != null) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
            ArrayList<e> arrayList = this.f125956m;
            for (e eVar : arrayList) {
                if (eVar.h(this.f125985k) && !(eVar instanceof r) && (eVar instanceof h6)) {
                    if (this.f43012o == null || !eVar.j()) {
                        linearLayout.addView(g.a(this));
                    } else {
                        linearLayout.addView(g.a(this));
                        linearLayout.addView(eVar.a());
                    }
                }
                if (!(eVar instanceof h6)) {
                    linearLayout.addView(eVar.a());
                }
                if (eVar instanceof w) {
                    linearLayout.addView(g.c(this, getString(R.string.device_settings_backlight_gesture_help)));
                }
                if (eVar instanceof v) {
                    linearLayout.addView(g.c(this, getString(R.string.description_auto_upload_on_off)));
                }
                if (eVar instanceof l6) {
                    linearLayout.addView(g.c(this, getString(R.string.device_settings_wrist_heart_rate_help)));
                }
            }
            linearLayout.addView(g.a(this));
            k0.ga(this, arrayList, this.f125985k, this);
            if (arrayList != null) {
                for (e eVar2 : arrayList) {
                    if (eVar2 instanceof v) {
                        eVar2.l(false);
                    }
                }
            }
        }
    }

    @Override // ng1.k0, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.lbl_general);
        Bundle extras = getIntent().getExtras();
        if (this.f125985k == null || extras == null) {
            i2.f(a2.SETTINGS, "FR645GeneralSettingActivity", "Device Settings DTO is null or extras is null");
            finish();
        } else if (this.f43012o != null) {
            this.f43012o.m(km2.a.i(this.f125976b, null, SupportedCapability.WIFI_SETUP.ordinal()));
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
            if (linearLayout.getChildCount() > 0) {
                linearLayout.removeAllViews();
                ha();
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f43013p == null) {
            this.f43013p = new Handler();
        }
        k0.ia(this.f125956m, this.f125985k);
    }

    @Override // ng1.p, com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        Handler handler = this.f43013p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f43013p = null;
        }
    }

    @Override // ng1.p, java.util.Observer
    public void update(Observable observable, Object obj) {
        FR645GeneralSettingActivity fR645GeneralSettingActivity;
        if (obj != null) {
            d0 d0Var = (d0) KoinJavaComponent.get(d0.class);
            if (observable instanceof h6) {
                fR645GeneralSettingActivity = this;
                d0Var.H(fR645GeneralSettingActivity, this.f125976b, this.f125977c.getProductNumber(), this.f125977c.getProductDisplayName(), 2131231956);
            } else {
                fR645GeneralSettingActivity = this;
            }
            if (observable instanceof q2) {
                if (((l80.b) KoinJavaComponent.get(l80.b.class)).a(fR645GeneralSettingActivity.f125976b)) {
                    d0Var.O(this, fR645GeneralSettingActivity.f125976b);
                    return;
                }
                androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this);
                aVar.setTitle(R.string.connect_iq_device_not_connected_title);
                aVar.setMessage(R.string.connect_iq_device_not_connected_msg);
                aVar.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                aVar.create().show();
            }
        }
    }
}
