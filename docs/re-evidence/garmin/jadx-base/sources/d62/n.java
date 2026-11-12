package d62;

import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.WorkoutActivityProfileSelectionActivity;
import java.util.ArrayList;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f58043b;

    public /* synthetic */ n(int i14, ArrayList arrayList) {
        this.f58042a = i14;
        this.f58043b = arrayList;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f58042a;
        ArrayList arrayList = this.f58043b;
        switch (i14) {
            case 0:
                WorkoutActivityProfileSelectionActivity.b bVar = WorkoutActivityProfileSelectionActivity.f48559a;
                return ParametersHolderKt.parametersOf(arrayList);
            case 1:
                return ((k23.p) arrayList.get(0)).getF105782a();
            case 2:
                return Integer.valueOf(arrayList.size());
            case 3:
                return Integer.valueOf(arrayList.size());
            case 4:
                return Integer.valueOf(arrayList.size());
            case 5:
                return Integer.valueOf(arrayList.size());
            case 6:
                return Integer.valueOf(arrayList.size());
            default:
                int i15 = xg0.m.I0;
                return Integer.valueOf(arrayList.size());
        }
    }
}
