package nf0;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.EcgOnboardingActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.filter.EcgFilterActivity;
import com.garmin.android.apps.connectmobile.navigation.more.MoreNavigationRoute;
import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkExerciseActivity;
import lc.h0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements lc.y.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f125781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f125782c;

    public /* synthetic */ c(int i14, Object obj, Object obj2) {
        this.f125780a = i14;
        this.f125781b = obj;
        this.f125782c = obj2;
    }

    @Override // lc.y.c
    public final void m8(lc.y yVar, h0 h0Var, Bundle bundle) {
        int i14 = this.f125780a;
        Object obj = this.f125782c;
        Object obj2 = this.f125781b;
        switch (i14) {
            case 0:
                EcgOnboardingActivity ecgOnboardingActivity = (EcgOnboardingActivity) obj;
                EcgOnboardingActivity.a aVar = EcgOnboardingActivity.f34765b;
                h0Var.getClass();
                h0 h0VarJ = ((lc.y) obj2).f111904b.j();
                ecgOnboardingActivity.updateActionBarTitle((String) (h0VarJ != null ? h0VarJ.f111775d : null));
                break;
            case 1:
                EcgFilterActivity ecgFilterActivity = (EcgFilterActivity) obj;
                EcgFilterActivity.a aVar2 = EcgFilterActivity.f34906c;
                h0Var.getClass();
                h0 h0VarJ2 = ((lc.y) obj2).f111904b.j();
                ecgFilterActivity.updateActionBarTitle((String) (h0VarJ2 != null ? h0VarJ2.f111775d : null));
                break;
            case 2:
                BenchmarkExerciseActivity benchmarkExerciseActivity = (BenchmarkExerciseActivity) obj;
                BenchmarkExerciseActivity.a aVar3 = BenchmarkExerciseActivity.f48361a;
                h0Var.getClass();
                h0 h0VarJ3 = ((lc.y) obj2).f111904b.j();
                benchmarkExerciseActivity.updateActionBarTitle((String) (h0VarJ3 != null ? h0VarJ3.f111775d : null));
                break;
            case 3:
                h0Var.getClass();
                qc.j jVar = h0Var.f111773b;
                String str = jVar.f144347f;
                t0 t0Var = s0.f105811a;
                ((e23.l) obj2).invoke(Boolean.valueOf(p005kotlin.jvm.internal.s.g(str, t0Var.b(DashboardRoute.Dashboard.class).getF16141b())));
                ((com.garmin.android.apps.connectmobile.dashboard.presentation.d) obj).C.k(null, Boolean.valueOf(!p005kotlin.jvm.internal.s.g(jVar.f144347f, t0Var.b(DashboardRoute.Dashboard.class).getF16141b())));
                break;
            default:
                h0Var.getClass();
                qc.j jVar2 = h0Var.f111773b;
                String str2 = jVar2.f144347f;
                t0 t0Var2 = s0.f105811a;
                ((e23.l) obj2).invoke(Boolean.valueOf(p005kotlin.jvm.internal.s.g(str2, t0Var2.b(MoreNavigationRoute.SettingsScreen.class).getF16141b())));
                ((e23.l) obj).invoke(Boolean.valueOf(!p005kotlin.jvm.internal.s.g(jVar2.f144347f, t0Var2.b(MoreNavigationRoute.SettingsScreen.class).getF16141b())));
                break;
        }
    }
}
