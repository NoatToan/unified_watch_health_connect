package com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus;

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
import java.util.Locale;
import java.util.Observable;
import km2.a;
import l80.b;
import ng1.k0;
import org.koin.java.KoinJavaComponent;
import zb0.d0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class Fenix5PlusGeneralSettingActivity extends k0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h6 f42962o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Handler f42963p = null;

    @Override // ng1.k0
    public void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        h6 h6Var = new h6(this, this.f125976b);
        this.f42962o = h6Var;
        arrayList.add(h6Var);
        arrayList.add(new l6(this));
        u0 u0Var = u0.M2;
        u0 u0Var2 = this.f125980f;
        if (u0Var != u0Var2 && u0.Y2 != u0Var2) {
            arrayList.add(new u(this));
            arrayList.add(new q2(this));
        }
        arrayList.add(new v(this, this.f125976b, false));
        arrayList.add(new g3(this));
        arrayList.add(new s4(this, true));
        arrayList.add(new c1(this));
        arrayList.add(new k2(this));
        if (this.f125977c.X0()) {
            u0 u0Var3 = this.f125980f;
            String lowerCase = this.f125981g.toLowerCase(Locale.ENGLISH);
            if (u0Var3 == u0Var && lowerCase.contains("esports")) {
                return;
            }
            arrayList.add(new s2(this));
        }
    }

    @Override // ng1.k0
    public final void ha() {
        if (this.f125985k != null) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
            ArrayList<e> arrayList = this.f125956m;
            for (e eVar : arrayList) {
                if (eVar.h(this.f125985k) && !(eVar instanceof r)) {
                    if (!(eVar instanceof h6)) {
                        linearLayout.addView(g.a(this));
                    } else if (this.f42962o != null && eVar.j()) {
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
        }
    }

    @Override // ng1.k0, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.lbl_general);
        Bundle extras = getIntent().getExtras();
        if (this.f125985k == null || extras == null) {
            i2.f(a2.SETTINGS, "Fenix5PlusGeneralSet", "Device Settings DTO is null or extras is null");
            finish();
        } else if (this.f42962o != null) {
            this.f42962o.m(a.i(this.f125976b, null, SupportedCapability.WIFI_SETUP.ordinal()));
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
        if (this.f42963p == null) {
            this.f42963p = new Handler();
        }
        k0.ia(this.f125956m, this.f125985k);
    }

    @Override // ng1.p, com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        Handler handler = this.f42963p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f42963p = null;
        }
    }

    @Override // ng1.p, java.util.Observer
    public void update(Observable observable, Object obj) {
        Fenix5PlusGeneralSettingActivity fenix5PlusGeneralSettingActivity;
        if (obj != null) {
            d0 d0Var = (d0) KoinJavaComponent.get(d0.class);
            if (observable instanceof h6) {
                fenix5PlusGeneralSettingActivity = this;
                d0Var.o(fenix5PlusGeneralSettingActivity, this.f125976b, this.f125977c.getProductNumber(), this.f125977c.getProductDisplayName(), this.f125977c.getImageURL());
            } else {
                fenix5PlusGeneralSettingActivity = this;
            }
            if (observable instanceof q2) {
                if (((b) KoinJavaComponent.get(b.class)).a(fenix5PlusGeneralSettingActivity.f125976b)) {
                    d0Var.O(this, fenix5PlusGeneralSettingActivity.f125976b);
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
