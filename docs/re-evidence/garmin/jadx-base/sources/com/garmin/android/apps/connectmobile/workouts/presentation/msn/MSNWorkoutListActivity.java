package com.garmin.android.apps.connectmobile.workouts.presentation.msn;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.i2;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/MSNWorkoutListActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MSNWorkoutListActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49457a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 1501 && i15 == -1) {
            setResult(-1);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        initActionBar(getString(R.string.workout_lbl_find_workout), 2);
        b.f49484x.getClass();
        b bVar = new b();
        Bundle bundle2 = new Bundle();
        String stringExtra = getIntent().getStringExtra("GCM_extra_activity_type");
        if (stringExtra != null) {
            bundle2.putString("GCM_extra_activity_type", stringExtra);
            bundle2.putLong("GCM_workout_queue_download_to_device", getIntent().getLongExtra("GCM_workout_queue_download_to_device", -1L));
        }
        long longExtra = getIntent().getLongExtra("GCM_preselected_device_id", -1L);
        if (longExtra > 0) {
            a2 a2Var = a2.WORKOUTS;
            String strE = e.e(longExtra, "Passing preselected device ID to fragment: ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "MSNWorkoutListActivity", strE);
            bundle2.putLong("GCM_preselected_device_id", longExtra);
        }
        bVar.setArguments(bundle2);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.content_frame, bVar, null);
        aVar.e();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/MSNWorkoutListActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
