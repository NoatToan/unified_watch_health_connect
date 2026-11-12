package com.garmin.android.apps.connectmobile.forceupdate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import i.c;
import mt0.h0;

/* JADX INFO: loaded from: classes8.dex */
public class ForceUpdateActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f35275a = 0;

    @Override // b.g, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onBackPressed() {
        finish();
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_force_update_activity);
        TextView textView = (TextView) findViewById(R.id.title_text_view);
        TextView textView2 = (TextView) findViewById(R.id.tv_info_message);
        textView.setText(R.string.garmin_connect_name);
        textView2.setText(getString(R.string.forced_update_info_message, getString(R.string.os_app_store_android)));
        ((Button) findViewById(R.id.force_update_btn)).setOnClickListener(new h0(this, 23));
    }
}
