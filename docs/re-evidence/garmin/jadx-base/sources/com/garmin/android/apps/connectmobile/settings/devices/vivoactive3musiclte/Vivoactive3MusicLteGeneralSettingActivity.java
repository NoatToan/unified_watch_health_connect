package com.garmin.android.apps.connectmobile.settings.devices.vivoactive3musiclte;

import android.content.DialogInterface;
import androidx.appcompat.app.e;
import ch1.g3;
import ch1.g5;
import ch1.k2;
import ch1.l0;
import ch1.l6;
import ch1.m0;
import ch1.n6;
import ch1.q2;
import ch1.s2;
import ch1.s4;
import ch1.u;
import ch1.x;
import ch1.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music.Vivoactive3MusicGeneralSettingActivity;
import java.util.ArrayList;
import java.util.Observable;
import l80.b;
import org.koin.java.KoinJavaComponent;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
public class Vivoactive3MusicLteGeneralSettingActivity extends Vivoactive3MusicGeneralSettingActivity {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music.Vivoactive3MusicGeneralSettingActivity, ng1.k0
    public final void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        arrayList.add(new l6(this));
        arrayList.add(new x(this, true));
        arrayList.add(new z(this));
        arrayList.add(new g5(this));
        arrayList.add(new n6(this));
        arrayList.add(new u(this));
        arrayList.add(new q2(this));
        arrayList.add(new g3(this));
        arrayList.add(new l0(this));
        arrayList.add(new s4(this));
        arrayList.add(new m0(this));
        arrayList.add(new k2(this));
        if (this.f125977c.X0()) {
            arrayList.add(new s2(this));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music.Vivoactive3MusicGeneralSettingActivity, ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj == null || !(observable instanceof q2)) {
            return;
        }
        if (((b) KoinJavaComponent.get(b.class)).a(this.f125976b)) {
            ((d0) KoinJavaComponent.get(d0.class)).O(this, this.f125976b);
            return;
        }
        e.a aVar = new e.a(this);
        aVar.setTitle(R.string.connect_iq_device_not_connected_title);
        aVar.setMessage(R.string.connect_iq_device_not_connected_msg);
        aVar.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
        aVar.create().show();
    }
}
