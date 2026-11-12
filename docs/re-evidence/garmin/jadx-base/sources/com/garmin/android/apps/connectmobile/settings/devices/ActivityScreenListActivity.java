package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.y;
import com.garmin.android.apps.connectmobile.devices.model.z;
import fh1.a1;
import fh1.j;
import i3.e5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import ng1.l1;

/* JADX INFO: loaded from: classes10.dex */
public class ActivityScreenListActivity extends l1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f41771j = 0;

    @Override // ng1.l1
    public final void ea() {
        super.ea();
        for (fb2.e eVar : this.f125964b) {
            if (eVar instanceof j) {
                eVar.l(false);
            }
        }
    }

    public final void ga() {
        List<y> list;
        a1 a1VarA;
        ArrayList arrayList = this.f125964b;
        arrayList.clear();
        z zVarC = this.f125963a.C();
        if (zVarC == null || (list = zVarC.f34343c) == null) {
            finish();
        } else {
            arrayList.add(new fh1.e(this));
            Collections.sort(list, new androidx.browser.trusted.c(19));
            Iterator<y> it = list.iterator();
            while (it.hasNext()) {
                String str = it.next().f34328a;
                if (str != null && (a1VarA = fh1.f.a(str, this)) != null) {
                    a1VarA.f70327e = false;
                    arrayList.add(a1VarA);
                }
            }
        }
        fa();
        ea();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        n23.j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "ActivityScreenListActivity");
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 10) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                this.f125963a = deviceSettingsDTO;
                ga();
            }
        }
    }

    @Override // ng1.l1, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ga();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_item_reorder) {
            return super.onOptionsItemSelected(menuItem);
        }
        DeviceSettingsDTO deviceSettingsDTO = this.f125963a;
        String str = this.f125965c;
        Intent intent = new Intent(this, (Class<?>) ReordableActivityScreenListActivity.class);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        intent.putExtra("GCM_deviceSettingsTitle", str);
        startActivityForResult(intent, 10);
        return true;
    }

    @Override // ng1.l1, java.util.Observer
    public final void update(Observable observable, Object obj) {
        super.update(observable, obj);
        if (obj != null) {
            for (fb2.e eVar : this.f125964b) {
                if (eVar instanceof j) {
                    eVar.l(false);
                    return;
                }
            }
        }
    }
}
