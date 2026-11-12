package com.garmin.androiddynamicsettings.app.presentationlayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import ci2.l;
import com.garmin.android.apps.connectmobile.R;
import hi2.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mh2.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import zh2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/presentationlayer/SettingsActivity;", "Lcom/garmin/androiddynamicsettings/app/presentationlayer/b;", "<init>", "()V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SettingsActivity extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f50676m;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f50675l = new d("SettingsActivity", null, 2, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f50677n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f50678o = 1;

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        l lVar = this.f50676m;
        if (lVar == null) {
            s.m("settingsCoordinator");
            throw null;
        }
        d dVar = lVar.f27710d;
        nh2.d dVar2 = lVar.f27712f;
        if (i15 == -1) {
            String stringExtra = intent != null ? intent.getStringExtra("activityForResult") : null;
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra("SETTINGS_CONTROLS_MENU_BUNDLE") : null;
            ArrayList arrayList = (ArrayList) (serializableExtra instanceof ArrayList ? serializableExtra : null);
            if (stringExtra != null) {
                dVar.getClass();
                if (i14 == 963) {
                    com.garmin.androiddynamicsettings.app.util.a.f50704a.getClass();
                    HashMap mapC = com.garmin.androiddynamicsettings.app.util.a.C1021a.c(stringExtra);
                    for (String str : mapC.keySet()) {
                        Map<String, Object> map = dVar2.f126168h;
                        str.getClass();
                        map.put(str, mapC.get(str));
                    }
                } else if (i14 == 9630) {
                    com.garmin.androiddynamicsettings.app.util.a.f50704a.getClass();
                    HashMap mapC2 = com.garmin.androiddynamicsettings.app.util.a.C1021a.c(stringExtra);
                    Map<String, Object> map2 = dVar2.f126168h;
                    String str2 = m.ALARMS.f118678a;
                    map2.put(str2, mapC2.get(str2));
                }
            }
            if (arrayList != null) {
                arrayList.toString();
                dVar.getClass();
                if (i14 == 9631) {
                    dVar2.f126168h.put(m.CONTROLS_MENU_LIST.f118678a, arrayList);
                }
            }
        }
        ii2.b bVar = lVar.f27711e;
        bVar.f93792b.getClass();
        bVar.f93793c.j(bVar.f93791a.f126168h);
    }

    @Override // b.g, android.app.Activity
    public final void onBackPressed() {
        this.f50675l.getClass();
        if (getSupportFragmentManager().M() != 0) {
            super.onBackPressed();
            return;
        }
        l lVar = this.f50676m;
        if (lVar != null) {
            lVar.b(false);
        } else {
            s.m("settingsCoordinator");
            throw null;
        }
    }

    @Override // com.garmin.androiddynamicsettings.app.presentationlayer.b, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dsl_activity_settings);
        d dVar = this.f50675l;
        dVar.getClass();
        e.f204807a.getClass();
        if (e.f204809c == null) {
            dVar.b("No Tunnel");
            Toast.makeText(this, R.string.txt_something_went_wrong_try_again, 0).show();
            finish();
            return;
        }
        R9(true);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("DynamicSettingInitializer_Section");
            String string2 = extras.getString("DynamicSettingInitializer_SectionDeepLinkKey");
            if (string != null) {
                this.f50676m = new l(this, string, string2);
            }
        }
    }

    @Override // com.garmin.androiddynamicsettings.app.presentationlayer.b, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        b.f50687j.getClass();
        if (itemId != b.f50688k) {
            return super.onOptionsItemSelected(menuItem);
        }
        l lVar = this.f50676m;
        if (lVar != null) {
            lVar.b(true);
            return true;
        }
        s.m("settingsCoordinator");
        throw null;
    }
}
