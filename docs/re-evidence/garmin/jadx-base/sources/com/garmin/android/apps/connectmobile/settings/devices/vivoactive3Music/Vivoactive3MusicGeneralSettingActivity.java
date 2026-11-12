package com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;
import ch1.g3;
import ch1.g5;
import ch1.h6;
import ch1.k2;
import ch1.l6;
import ch1.m0;
import ch1.n6;
import ch1.q2;
import ch1.s2;
import ch1.s4;
import ch1.u;
import ch1.v;
import ch1.x;
import ch1.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import fb2.e;
import fb2.g;
import fb2.m;
import fb2.r;
import java.util.ArrayList;
import java.util.Observable;
import km2.a;
import l80.b;
import ng1.k0;
import org.koin.java.KoinJavaComponent;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
public class Vivoactive3MusicGeneralSettingActivity extends k0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f43167o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h6 f43168p;

    @Override // ng1.k0
    public void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        h6 h6Var = new h6(this, this.f125976b);
        this.f43168p = h6Var;
        arrayList.add(h6Var);
        arrayList.add(new l6(this));
        arrayList.add(new x(this, true));
        arrayList.add(new z(this));
        arrayList.add(new g5(this));
        arrayList.add(new n6(this));
        arrayList.add(new u(this));
        arrayList.add(new g3(this));
        arrayList.add(new q2(this));
        arrayList.add(new s4(this));
        arrayList.add(new m0(this));
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
            e eVar = null;
            for (e eVar2 : arrayList) {
                if (eVar2.h(this.f125985k) && !(eVar2 instanceof r)) {
                    if (eVar2 instanceof h6) {
                        if (this.f43168p != null && eVar2.j()) {
                            linearLayout.addView(g.a(this));
                            linearLayout.addView(eVar2.a());
                        }
                    } else if (!(eVar instanceof m) || ((m) eVar).s() == null) {
                        linearLayout.addView(g.a(this));
                    }
                }
                if (!(eVar2 instanceof h6)) {
                    linearLayout.addView(eVar2.a());
                }
                if (eVar2 instanceof x) {
                    linearLayout.addView(g.c(this, getString(R.string.device_settings_backlight_gesture_help)));
                }
                if (eVar2 instanceof l6) {
                    linearLayout.addView(g.c(this, getString(R.string.device_settings_wrist_heart_rate_help)));
                }
                eVar = eVar2;
            }
            linearLayout.addView(g.a(this));
            k0.ga(this, arrayList, this.f125985k, this);
            if (arrayList != null) {
                for (e eVar3 : arrayList) {
                    if (eVar3 instanceof v) {
                        eVar3.l(false);
                    }
                }
            }
        }
    }

    @Override // ng1.k0, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (this.f125985k == null || extras == null) {
            i2.f(a2.SETTINGS, "Vivoactive3MusicGeneralSettingActivity", "Device Settings DTO is null or extras is null");
            finish();
            return;
        }
        initActionBar(true, R.string.lbl_general);
        if (this.f43168p != null) {
            this.f43168p.m(a.i(this.f125976b, null, SupportedCapability.WIFI_SETUP.ordinal()));
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
        if (this.f43167o == null) {
            this.f43167o = new Handler();
        }
        k0.ia(this.f125956m, this.f125985k);
    }

    @Override // ng1.p, com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public void onStop() {
        super.onStop();
        Handler handler = this.f43167o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f43167o = null;
        }
    }

    @Override // ng1.p, java.util.Observer
    public void update(Observable observable, Object obj) {
        Vivoactive3MusicGeneralSettingActivity vivoactive3MusicGeneralSettingActivity;
        if (obj != null) {
            d0 d0Var = (d0) KoinJavaComponent.get(d0.class);
            if (observable instanceof h6) {
                vivoactive3MusicGeneralSettingActivity = this;
                d0Var.H(vivoactive3MusicGeneralSettingActivity, this.f125976b, this.f125977c.getProductNumber(), this.f125977c.getProductDisplayName(), 2131232088);
            } else {
                vivoactive3MusicGeneralSettingActivity = this;
            }
            if (observable instanceof q2) {
                if (((b) KoinJavaComponent.get(b.class)).a(vivoactive3MusicGeneralSettingActivity.f125976b)) {
                    d0Var.O(this, vivoactive3MusicGeneralSettingActivity.f125976b);
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
