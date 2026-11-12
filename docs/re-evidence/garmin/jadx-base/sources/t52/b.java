package t52;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.viewbinder.BenchmarkExerciseOneRepMaxView;
import e23.l;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BenchmarkExerciseOneRepMaxView f162553b;

    public /* synthetic */ b(BenchmarkExerciseOneRepMaxView benchmarkExerciseOneRepMaxView, int i14) {
        this.f162552a = i14;
        this.f162553b = benchmarkExerciseOneRepMaxView;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f162552a;
        BenchmarkExerciseOneRepMaxView benchmarkExerciseOneRepMaxView = this.f162553b;
        switch (i14) {
            case 0:
                Double d14 = (Double) obj;
                d14.getClass();
                benchmarkExerciseOneRepMaxView.f48411e = d14;
                benchmarkExerciseOneRepMaxView.a(benchmarkExerciseOneRepMaxView.f48411e, Integer.valueOf(benchmarkExerciseOneRepMaxView.f48410d));
                benchmarkExerciseOneRepMaxView.b();
                BenchmarkExerciseOneRepMaxView.a aVar = benchmarkExerciseOneRepMaxView.onValuesChangedListener;
                if (aVar != null) {
                    aVar.a(benchmarkExerciseOneRepMaxView.f48410d, benchmarkExerciseOneRepMaxView.f48411e, benchmarkExerciseOneRepMaxView.f48412f);
                }
                break;
            default:
                k0 k0Var = (k0) obj;
                int i15 = BenchmarkExerciseOneRepMaxView.f48406i;
                k0Var.getClass();
                String string = benchmarkExerciseOneRepMaxView.getContext().getString(R.string.txt_empty_page_no_data);
                string.getClass();
                h0.n(k0Var, string);
                break;
        }
        return Unit.INSTANCE;
    }
}
