package com.garmin.android.apps.connectmobile.settings.devices.indexbpm;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import ch1.e6;
import ch1.o1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import h82.c;
import ig1.h0;
import ig1.s;
import java.util.ArrayList;
import ng1.l0;
import p005kotlin.Metadata;
import pk1.k;
import ro0.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/indexbpm/IndexBpmUserSettingsActivity;", "Lng1/l0;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IndexBpmUserSettingsActivity extends l0 {
    @Override // ng1.l0
    public final void da() {
        ArrayList arrayList = this.f125961r;
        arrayList.clear();
        arrayList.add(new h0(this));
        arrayList.add(new o1(this));
        arrayList.add(new e6(this));
        arrayList.add(new s(this));
        l0.ea(this, arrayList, this.f125995i, this);
    }

    @Override // ng1.l0, ng1.q, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.devices_settings_user_settings);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.help_3_0, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == R.id.menu_item_help) {
            k.f138297g.getClass();
            c.f82428d.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_ACTION", "DEFAULT_ACTION");
            bundle.putBoolean("EXTRA_INDEX_BPM", true);
            HelpActivity.a.e(HelpActivity.f36653a, this, l.INDEX_DEVICES_USER_SETTINGS, null, bundle, 4);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
