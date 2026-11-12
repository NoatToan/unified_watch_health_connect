package s52;

import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkExerciseDetailsFragment;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.u;
import s5.e0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BenchmarkExerciseDetailsFragment f157401b;

    public /* synthetic */ c(BenchmarkExerciseDetailsFragment benchmarkExerciseDetailsFragment, int i14) {
        this.f157400a = i14;
        this.f157401b = benchmarkExerciseDetailsFragment;
    }

    @Override // e23.a
    public final Object invoke() {
        List<com.garmin.android.apps.connectmobile.workouts.data.model.l> listJ;
        ArrayList arrayListL0;
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr;
        switch (this.f157400a) {
            case 0:
                BenchmarkExerciseDetailsFragment benchmarkExerciseDetailsFragment = this.f157401b;
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar = benchmarkExerciseDetailsFragment.f48368m;
                if (cVar != null) {
                    f.f157406a.getClass();
                    com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF = cVar.F();
                    if (dVarArrF != null) {
                        arrayListL0 = u.l0(dVarArrF);
                        arrayListL0.removeIf(new e(new e0(13), 0));
                    } else {
                        arrayListL0 = null;
                    }
                    if (arrayListL0 != null && (dVarArr = (com.garmin.android.apps.connectmobile.repcounting.model.d[]) arrayListL0.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0])) != null) {
                        cVar.I(dVarArr);
                    }
                }
                f.c<n> cVar2 = benchmarkExerciseDetailsFragment.f48373r;
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar3 = benchmarkExerciseDetailsFragment.f48368m;
                ArrayList arrayList = new ArrayList();
                List<com.garmin.android.apps.connectmobile.workouts.data.model.b> listA4 = benchmarkExerciseDetailsFragment.K6().A4();
                if (listA4 != null) {
                    for (com.garmin.android.apps.connectmobile.workouts.data.model.b bVar : listA4) {
                        String benchmarkKey = bVar.getBenchmarkKey();
                        com.garmin.android.apps.connectmobile.workouts.data.model.b bVar2 = benchmarkExerciseDetailsFragment.f48372q;
                        if (s.g(benchmarkKey, bVar2 != null ? bVar2.getBenchmarkKey() : null)) {
                            bVar = benchmarkExerciseDetailsFragment.f48372q;
                        }
                        com.garmin.android.apps.connectmobile.repcounting.model.c cVar4 = benchmarkExerciseDetailsFragment.f48368m;
                        com.garmin.android.apps.connectmobile.repcounting.model.d dVarD = cVar4 != null ? cVar4.D(bVar != null ? bVar.getBenchmarkCategoryKey() : null, bVar != null ? bVar.getBenchmarkKey() : null) : null;
                        if (dVarD != null && bVar != null && (listJ = bVar.j()) != null) {
                            for (com.garmin.android.apps.connectmobile.workouts.data.model.l lVar : listJ) {
                                com.garmin.android.apps.connectmobile.repcounting.model.c cVar5 = benchmarkExerciseDetailsFragment.f48368m;
                                com.garmin.android.apps.connectmobile.repcounting.model.d dVarD2 = cVar5 != null ? cVar5.D(lVar.getCategoryKey(), lVar.getExerciseKey()) : null;
                                if (dVarD2 != null) {
                                    arrayList.add(new o(dVarD2, dVarD));
                                }
                            }
                        }
                    }
                }
                cVar2.a(new n(cVar3, arrayList), null);
                break;
            default:
                BenchmarkExerciseDetailsFragment benchmarkExerciseDetailsFragment2 = this.f157401b;
                com.garmin.android.apps.connectmobile.workouts.data.model.b bVar3 = benchmarkExerciseDetailsFragment2.f48372q;
                Long l14 = bVar3 != null ? bVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() : null;
                h hVarK6 = benchmarkExerciseDetailsFragment2.K6();
                y0 y0Var = new y0();
                if (l14 != null) {
                    hVarK6.f157412c = ge1.b.T(v1.a(hVarK6), null, null, new i(y0Var, hVarK6, l14, null), 3);
                } else {
                    y0Var.j(fw.m.a.g(fw.m.f73767e, null, 3));
                }
                y0Var.f(benchmarkExerciseDetailsFragment2.getViewLifecycleOwner(), new d(benchmarkExerciseDetailsFragment2));
                break;
        }
        return Unit.INSTANCE;
    }
}
