package c62;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDeviceDisconnectedException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class r0 extends p005kotlin.jvm.internal.q implements e23.l<g3<? extends b>, Unit> {
    public r0(Object obj) {
        super(1, obj, WorkoutDetailsActivity.class, "handleLoadWorkoutUiResource", "handleLoadWorkoutUiResource(Lcom/garmin/android/apps/connectmobile/UIResource;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Unit invoke(g3<? extends b> g3Var) {
        String str;
        g3<? extends b> g3Var2 = g3Var;
        g3Var2.getClass();
        WorkoutDetailsActivity workoutDetailsActivity = (WorkoutDetailsActivity) this.receiver;
        WorkoutDetailsActivity.a aVar = WorkoutDetailsActivity.f48482f;
        workoutDetailsActivity.getClass();
        fw.p pVar = g3Var2.f35300a;
        T t7 = g3Var2.f35301b;
        int i14 = WorkoutDetailsActivity.b.f48489b[pVar.ordinal()];
        if (i14 == 1) {
            b bVar = (b) t7;
            com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa = workoutDetailsActivity.ea();
            String string = workoutDetailsActivity.getString(R.string.lbl_workouts_loading_details);
            string.getClass();
            if (bVar == null || (str = bVar.f24684b) == null) {
                str = "";
            }
            String string2 = workoutDetailsActivity.getString(R.string.msg_workouts_wear_device, str);
            string2.getClass();
            ge1.b.T(androidx.lifecycle.v1.a(fVarEa), null, null, new i2(fVarEa, string, string2, null), 3);
        } else if (i14 == 2) {
            workoutDetailsActivity.ea().Z4();
            b bVar2 = (b) t7;
            if (bVar2 != null) {
                com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa2 = workoutDetailsActivity.ea();
                ge1.b.T(androidx.lifecycle.v1.a(fVarEa2), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.details.w(fVarEa2, bVar2.f24683a, bVar2.f24685c, bVar2.f24686d, bVar2.f24684b, null), 3);
            }
        } else {
            if (i14 != 3) {
                lc.u0.r();
                return null;
            }
            workoutDetailsActivity.ea().Z4();
            Exception exc = g3Var2.f35303d;
            if (exc instanceof WorkoutDeviceDisconnectedException) {
                workoutDetailsActivity.ea().f5(new com.garmin.android.apps.connectmobile.workouts.presentation.details.b.C0945b(((WorkoutDeviceDisconnectedException) exc).getDeviceName()));
            } else {
                String string3 = workoutDetailsActivity.getString(R.string.txt_error_occurred);
                string3.getClass();
                workoutDetailsActivity.ja(string3);
            }
            String str2 = g3Var2.f35302c;
            com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar2.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "WorkoutDetailsActivity", str2);
        }
        return Unit.INSTANCE;
    }
}
