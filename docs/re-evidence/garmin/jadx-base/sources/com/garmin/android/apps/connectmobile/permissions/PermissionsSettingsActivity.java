package com.garmin.android.apps.connectmobile.permissions;

import android.os.Bundle;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import o13.p;
import p005kotlin.Metadata;
import w81.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/permissions/PermissionsSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PermissionsSettingsActivity extends c {
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_permissions_settings);
        initActionBar(true, R.string.lbl_phone_permissions);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.permissions_settings_frame_layout, new b(), null);
        aVar.t();
        ht.a aVar2 = ht.a.f85464a;
        Bundle bundleA = h7.c.a(new p("PageAction", "Opened"));
        aVar2.getClass();
        ht.a.a(bundleA, "PageViewPermissionSettings");
    }
}
