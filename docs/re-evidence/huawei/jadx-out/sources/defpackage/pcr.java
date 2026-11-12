package defpackage;

import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.ChoreographedMultiActions;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.EquipmentWorkoutAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.RoadBook;
import com.huawei.pluginfitnessadvice.WorkoutPackageInfo;
import com.huawei.pluginfitnessadvice.cloudmodelparse.CloudDataParse;

/* JADX INFO: loaded from: classes41.dex */
public class pcr {
    private static CloudDataParse<AtomicAction> e = new pcw();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static CloudDataParse<AtomicAction> f45178a = new pdb();
    private static CloudDataParse<FitWorkout> d = new pdj();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static CloudDataParse<FitWorkout> f45179b = new pdc();

    public static CloudDataParse<AtomicAction> d(int i) {
        if (i == 1) {
            return e;
        }
        return f45178a;
    }

    public static CloudDataParse<FitWorkout> b(int i) {
        if (i == 1 || i == 5) {
            return d;
        }
        return f45179b;
    }

    public static CloudDataParse<ChoreographedMultiActions> e(int i) {
        return new pcu(i);
    }

    public static CloudDataParse<ChoreographedSingleAction> c(int i) {
        return new pct(i);
    }

    public static CloudDataParse<Topic> e() {
        return new pdd();
    }

    public static CloudDataParse<EquipmentWorkoutAction> c() {
        return new pcy();
    }

    public static CloudDataParse<WorkoutPackageInfo> b() {
        return new pdi();
    }

    public static CloudDataParse<pco> a() {
        return new pde();
    }

    public static CloudDataParse<RoadBook> d() {
        return new pdf();
    }
}
