package ad;

import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.StartWorkoutCapableDeviceSelectionActivity;
import java.util.List;
import k23.p;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.y0;
import p13.d0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f2715b;

    public /* synthetic */ b(List list, int i14) {
        this.f2714a = i14;
        this.f2715b = list;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f2714a;
        List list = this.f2715b;
        switch (i14) {
            case 0:
                return new a(list);
            case 1:
                return ParametersHolderKt.parametersOf(list);
            case 2:
                return ParametersHolderKt.parametersOf(list);
            case 3:
                return list;
            case 4:
                StartWorkoutCapableDeviceSelectionActivity.a aVar = StartWorkoutCapableDeviceSelectionActivity.f48554a;
                return ParametersHolderKt.parametersOf(list);
            case 5:
                h2.b.a aVar2 = h2.b.M;
                Object obj = list.get(2);
                obj.getClass();
                return (Integer) obj;
            case 6:
                return ((p) list.get(0)).getF105782a();
            case 7:
                return ((p) list.get(0)).getF105782a();
            case 8:
                return Integer.valueOf(list.size());
            case 9:
                return Integer.valueOf(list.size());
            case 10:
                return Integer.valueOf(list.size());
            default:
                if (y0.g(list)) {
                    d0.G(list);
                }
                return Unit.INSTANCE;
        }
    }
}
