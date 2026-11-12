package com.garmin.android.apps.connectmobile.activities.manual;

import am.a2;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.h;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.l2;
import lo.f;
import p005kotlin.Metadata;
import ps.r;
import ps.s0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/manual/ActivitiesEditActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivitiesEditActivity extends c {
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        r rVar = (r) a2.c(bundleA, "GCM_extra_activity_summary");
        h hVarG = rVar != null ? fr.a.g(rVar, (s0) a2.c(bundleA, "GCM_workout_exercise_set")) : null;
        initActionBar(true, (hVarG == null || hVarG.f29452e == 0) ? R.string.title_edit_activity : R.string.multisport_edit_leg_title);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        f fVar = new f();
        l2.a.c(fVar, bundleA);
        aVar2.l(R.id.content_frame, fVar, "FEATURE_FRAGMENT");
        aVar2.e();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }
}
