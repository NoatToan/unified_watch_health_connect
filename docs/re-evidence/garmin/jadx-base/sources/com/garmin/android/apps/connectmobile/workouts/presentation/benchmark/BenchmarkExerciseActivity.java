package com.garmin.android.apps.connectmobile.workouts.presentation.benchmark;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import lc.j0;
import lc.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/BenchmarkExerciseActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BenchmarkExerciseActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48361a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.benchmark_exercise_list_activity);
        initActionBar(true, getString(R.string.lbl_benchmark_exercises));
        Fragment fragmentF = getSupportFragmentManager().F(R.id.nav_host_fragment);
        fragmentF.getClass();
        NavHostFragment navHostFragment = (NavHostFragment) fragmentF;
        m0 m0VarU6 = navHostFragment.u6();
        j0 j0VarB = navHostFragment.u6().e().b(R.navigation.nav_workouts);
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("EXTRA_BENCHMARK_KEY") : null;
        if (string != null) {
            Bundle extras2 = getIntent().getExtras();
            double d14 = extras2 != null ? extras2.getDouble("EXTRA_PR_ONE_REP_MAX") : 0.0d;
            Bundle extras3 = getIntent().getExtras();
            boolean z14 = extras3 != null ? extras3.getBoolean("EXTRA_SHOW_RESET_OPTION", true) : true;
            j0VarB.p(R.id.benchmarkExerciseDetails);
            Bundle bundle2 = new Bundle();
            bundle2.putString("BENCHMARK_KEY_EXTRA", string);
            bundle2.putDouble("PR_ONE_REP_MAX_EXTRA", d14);
            bundle2.putBoolean("SHOW_RESET_OPTION", z14);
            Unit unit = Unit.INSTANCE;
            m0VarU6.getClass();
            m0VarU6.f111904b.x(j0VarB, bundle2);
        } else {
            m0VarU6.getClass();
            m0VarU6.f111904b.x(j0VarB, null);
        }
        m0VarU6.a(new nf0.c(2, m0VarU6, this));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/benchmark/BenchmarkExerciseActivity$a;", "", "<init>", "()V", "", "EXTRA_BENCHMARK_KEY", "Ljava/lang/String;", "EXTRA_PR_ONE_REP_MAX_VALUE", "EXTRA_SHOW_RESET_OPTION", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
