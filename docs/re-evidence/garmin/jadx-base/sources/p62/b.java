package p62;

import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp62/b;", "Lp62/r;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b implements r {
    @Override // p62.r
    public SpinnerDialogView.d b(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return new a(this, j0Var);
    }

    @Override // p62.r
    public final a c(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return new a(this, j0Var);
    }

    public abstract String f(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var);

    public abstract String g(double d14);

    public abstract void h(SpinnerDialogView spinnerDialogView, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var);

    public abstract com.garmin.android.apps.connectmobile.workouts.data.model.j0 i(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, int[] iArr);
}
