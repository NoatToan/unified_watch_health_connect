package com.garmin.android.apps.connectmobile.settings.devices;

import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import ig1.o;

/* JADX INFO: loaded from: classes10.dex */
public class Vivofit4ActivityTrackingSettingActivity extends BaseActivityTrackingAndAutoActivityStart {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.BaseActivityTrackingAndAutoActivityStart
    public final void ha() {
        o oVar = new o(this, this.f41895c, this.f41896d, this.f41897e, this.f41898f, this.f41899g, this.f41914x, this, this, this, this, this, this.f41913w);
        this.f41894b = oVar;
        oVar.g(this, this.f41911t);
        ((LinearLayout) findViewById(R.id.page_content)).addView(this.f41894b.f93305d);
    }
}
