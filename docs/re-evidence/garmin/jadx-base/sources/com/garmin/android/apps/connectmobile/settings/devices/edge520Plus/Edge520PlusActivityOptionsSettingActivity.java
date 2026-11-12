package com.garmin.android.apps.connectmobile.settings.devices.edge520Plus;

import android.content.Intent;
import android.text.TextUtils;
import ch1.n;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.audioprompts.ui.AudioPromptsSettingsActivity;
import f.c;
import g.h;
import java.util.Observable;
import ng1.j0;
import tr2.y;
import vg1.f0;
import vg1.k0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class Edge520PlusActivityOptionsSettingActivity extends f0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f42944j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c<Intent> f42945i = registerForActivityResult(new h(), new y(this, 21));

    @Override // vg1.f0
    public final void da() {
        ca(new n(this, this.f178102a.getDeviceUnitId(), false), 0);
    }

    @Override // vg1.f0
    public final k0 fa() {
        return new k0(this, this, 2);
    }

    @Override // vg1.f0
    public final String ga() {
        return getString(R.string.activity_options_title);
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        u0 u0Var;
        String strI = this.f178102a.i();
        if (TextUtils.isEmpty(strI) || (u0Var = (u0) u0.f203782n6.get(strI)) == null) {
            return;
        }
        switch (j0.a.f125951a[u0Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (observable instanceof n) {
                    long deviceUnitId = this.f178102a.getDeviceUnitId();
                    String strI2 = this.f178102a.i();
                    AudioPromptsSettingsActivity.f30263h.getClass();
                    Intent intent = new Intent(this, (Class<?>) AudioPromptsSettingsActivity.class);
                    intent.putExtra("GCM_deviceUnitID", deviceUnitId);
                    intent.putExtra("GCM_deviceProductNbr", strI2);
                    this.f42945i.a(intent, null);
                }
                break;
        }
    }
}
