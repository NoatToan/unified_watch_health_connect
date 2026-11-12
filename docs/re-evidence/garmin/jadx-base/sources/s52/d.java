package s52;

import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkExerciseDetailsFragment;
import fw.p;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Ls52/d;", "Le32/e;", "Lfw/m;", "", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends e32.e<fw.m<? extends Unit>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BenchmarkExerciseDetailsFragment f157402a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f157403a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f157403a = iArr;
        }
    }

    public d(BenchmarkExerciseDetailsFragment benchmarkExerciseDetailsFragment) {
        this.f157402a = benchmarkExerciseDetailsFragment;
    }

    @Override // e32.e
    public final void a(fw.m<? extends Unit> mVar) {
        fw.m<? extends Unit> mVar2 = mVar;
        int i14 = a.f157403a[mVar2.f73769b.ordinal()];
        BenchmarkExerciseDetailsFragment benchmarkExerciseDetailsFragment = this.f157402a;
        if (i14 == 1) {
            benchmarkExerciseDetailsFragment.G6();
            return;
        }
        if (i14 == 2) {
            benchmarkExerciseDetailsFragment.w6();
            g22.e.a(benchmarkExerciseDetailsFragment, mVar2.f73771d);
            return;
        }
        if (i14 != 3) {
            u0.r();
            return;
        }
        benchmarkExerciseDetailsFragment.w6();
        h hVarK6 = benchmarkExerciseDetailsFragment.K6();
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVar = benchmarkExerciseDetailsFragment.f48371p;
        String benchmarkCategoryKey = bVar != null ? bVar.getBenchmarkCategoryKey() : null;
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVar2 = benchmarkExerciseDetailsFragment.f48371p;
        String benchmarkKey = bVar2 != null ? bVar2.getBenchmarkKey() : null;
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVar3 = benchmarkExerciseDetailsFragment.f48371p;
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVar4 = new com.garmin.android.apps.connectmobile.workouts.data.model.b(null, benchmarkKey, benchmarkCategoryKey, null, null, null, null, null, new ArrayList(), bVar3 != null ? bVar3.getBenchmarkName() : null, 249, null);
        List<com.garmin.android.apps.connectmobile.workouts.data.model.l> listJ = bVar4.j();
        if (listJ != null) {
            h.y4(listJ, hVarK6.f157415f, bVar4);
        }
        benchmarkExerciseDetailsFragment.f48371p = bVar4;
        benchmarkExerciseDetailsFragment.f48372q = benchmarkExerciseDetailsFragment.J6();
        benchmarkExerciseDetailsFragment.U6();
    }
}
