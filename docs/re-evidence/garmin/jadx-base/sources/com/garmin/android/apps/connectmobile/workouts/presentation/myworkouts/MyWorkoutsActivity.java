package com.garmin.android.apps.connectmobile.workouts.presentation.myworkouts;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/myworkouts/MyWorkoutsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MyWorkoutsActivity extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49529a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Bundle extras2 = getIntent().getExtras();
        Long l14 = null;
        if (extras2 != null) {
            long j8 = extras2.getLong("extra_device_id");
            Long lValueOf = Long.valueOf(j8);
            if (j8 > 0) {
                l14 = lValueOf;
            }
        }
        if (l14 == null && (extras = getIntent().getExtras()) != null && extras.containsKey("extra_device_id")) {
            a2 a2Var = a2.WORKOUTS;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "MyWorkoutsActivity", "Invalid device ID provided in intent extras.");
            displayFailedMessage();
            finish();
            return;
        }
        i2.f36769a.getClass();
        i2.a.b(a2.WORKOUTS, "MyWorkoutsActivity", "Launching MyWorkoutsActivity with selectedDeviceId: " + l14);
        initComposeScreen(new e(-318400374, true, new k41.e(2, l14, this)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/myworkouts/MyWorkoutsActivity$a;", "", "<init>", "()V", "", "EXTRA_PRESELECTED_DEVICE_ID", "Ljava/lang/String;", "TAG", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
