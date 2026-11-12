package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.steps.presentation.StepsActivity;
import com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkExerciseActivity;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/a5;", "Lp91/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a5 implements p91.a {
    @Override // p91.a
    public final void a(Activity activity, String str, double d14) {
        activity.getClass();
        BenchmarkExerciseActivity.f48361a.getClass();
        Intent intent = new Intent(activity, (Class<?>) BenchmarkExerciseActivity.class);
        intent.putExtra("EXTRA_BENCHMARK_KEY", str);
        intent.putExtra("EXTRA_PR_ONE_REP_MAX", d14);
        intent.putExtra("EXTRA_SHOW_RESET_OPTION", false);
        activity.startActivity(intent);
    }

    @Override // p91.a
    public final Intent b(long j8, am.h hVar, Context context, String str) {
        context.getClass();
        str.getClass();
        aq.b bVar = new aq.b();
        bVar.f11823b = j8;
        if (hVar != null) {
            bVar.f11824c = hVar;
        }
        bVar.f11827f = str;
        return bVar.a(context);
    }

    @Override // p91.a
    public final Intent c(Context context, DateTime dateTime) {
        context.getClass();
        o82.g gVar = o82.g.f130850c;
        com.garmin.android.apps.connectmobile.u2 u2Var = new com.garmin.android.apps.connectmobile.u2();
        u2Var.f46492a = dateTime;
        u2Var.b(gVar);
        return u2Var.a(context, StepsActivity.class);
    }

    @Override // p91.a
    public final boolean d() {
        return bo1.a.a().c().u();
    }

    @Override // p91.a
    public final boolean e() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("barbell_exercise_pr_enabled");
    }

    @Override // p91.a
    public final Intent f(Context context, DateTime dateTime) {
        context.getClass();
        o82.g gVar = o82.g.f130850c;
        com.garmin.android.apps.connectmobile.u2 u2Var = new com.garmin.android.apps.connectmobile.u2();
        u2Var.f46492a = dateTime;
        u2Var.b(gVar);
        return u2Var.a(context, PushesActivity.class);
    }
}
