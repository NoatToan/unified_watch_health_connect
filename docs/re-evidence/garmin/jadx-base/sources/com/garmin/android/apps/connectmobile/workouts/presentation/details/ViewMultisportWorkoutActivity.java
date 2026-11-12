package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.k1;
import p005kotlin.Metadata;
import w52.v0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/ViewMultisportWorkoutActivity;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/WorkoutDetailsActivity;", "Lw52/v0;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ViewMultisportWorkoutActivity extends WorkoutDetailsActivity implements v0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f48481g = new a(null);

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity
    public final z3.e da() {
        return new z3.e(-2013687098, true, new a61.d(this, 29));
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bv.b.f21239a.getClass();
        bv.b.a();
        if (!k1.f37122a.H()) {
            finish();
        }
        ia();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/ViewMultisportWorkoutActivity$a;", "", "<init>", "()V", "", "REQUEST_CODE_VIEW_WORKOUT_FROM_GSM", "I", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
