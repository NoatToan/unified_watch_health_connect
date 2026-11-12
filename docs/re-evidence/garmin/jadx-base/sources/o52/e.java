package o52;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.f0;
import com.garmin.android.apps.connectmobile.workouts.data.model.v;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import java.io.Serializable;
import java.util.List;
import kd0.h7;
import m52.k;

/* JADX INFO: loaded from: classes9.dex */
public interface e {
    Intent A(WorkoutDetailsActivity workoutDetailsActivity, long j8, String str, Integer num, Integer num2, int i14, String str2);

    void B(Activity activity, k kVar, f0 f0Var);

    Object C(int i14, int i15, long j8, v13.c cVar);

    void D(WorkoutDetailsActivity workoutDetailsActivity);

    void E(Activity activity, WorkoutScheduleDTO workoutScheduleDTO);

    Intent F(Context context, double d14, List<v> list, int i14, int i15, int i16);

    boolean G();

    h7 H();

    String i(long j8);

    Object j(v13.c cVar);

    long k(com.garmin.android.apps.connectmobile.workouts.presentation.details.f.c cVar);

    Object l(long j8, v13.c cVar);

    void m();

    void n(Context context);

    Object o(v13.c cVar);

    void p(Context context);

    boolean q();

    Object r(v13.c cVar);

    boolean s();

    void t(Activity activity, WorkoutScheduleDTO workoutScheduleDTO);

    Serializable u(v13.c cVar);

    Object v(long j8, long j14, String str, v13.c cVar);

    Intent w(WorkoutDetailsActivity workoutDetailsActivity, long j8, String str, Integer num, Integer num2, int i14, int i15, String str2);

    Object x(boolean z14, v13.c cVar);

    boolean y();

    void z(WorkoutDetailsActivity workoutDetailsActivity);
}
