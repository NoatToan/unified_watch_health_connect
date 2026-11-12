package com.garmin.android.apps.connectmobile.settings.devices.fr945;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.z;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import js0.d;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/fr945/FR945AppearanceActivity;", "Lcom/garmin/android/apps/connectmobile/connectiq/z;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FR945AppearanceActivity extends z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f43019d = 0;

    @Override // com.garmin.android.apps.connectmobile.connectiq.z, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_connect_iq_appearance);
        super.initActionBar(true, R.string.appearance_title);
        ((GCMComplexOneLineButton) findViewById(R.id.custom_bttn_watchfaces)).setOnClickListener(new d(this, 9));
        ((GCMComplexOneLineButton) findViewById(R.id.custom_bttn_widgets)).setVisibility(8);
    }
}
