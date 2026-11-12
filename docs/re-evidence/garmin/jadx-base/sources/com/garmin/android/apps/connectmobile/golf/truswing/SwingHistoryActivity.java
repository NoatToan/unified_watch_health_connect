package com.garmin.android.apps.connectmobile.golf.truswing;

import android.os.Bundle;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import wl0.d0;

/* JADX INFO: loaded from: classes8.dex */
public class SwingHistoryActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d0 f35790a = null;

    @Override // com.garmin.android.apps.connectmobile.c
    public final void displayFailedMessage(boolean z14) {
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_golf_truswing_history);
        super.initActionBar(true, R.string.golf_swing_analysis_component_title);
        this.f35790a = new d0();
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        aVarB.l(R.id.frag_swing_history_list, this.f35790a, null);
        aVarB.e();
    }
}
