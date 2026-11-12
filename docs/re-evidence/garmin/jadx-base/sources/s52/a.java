package s52;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.BenchmarkExerciseDetailsFragment;
import com.google.mlkit.common.MlKitException;
import e23.p;
import gl1.y;
import l72.p2;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f157396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BenchmarkExerciseDetailsFragment f157397c;

    public /* synthetic */ a(boolean z14, BenchmarkExerciseDetailsFragment benchmarkExerciseDetailsFragment, int i14) {
        this.f157395a = i14;
        this.f157396b = z14;
        this.f157397c = benchmarkExerciseDetailsFragment;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f157395a;
        BenchmarkExerciseDetailsFragment benchmarkExerciseDetailsFragment = this.f157397c;
        int i15 = 1;
        Object[] objArr = 0;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = BenchmarkExerciseDetailsFragment.f48362v;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-2020030436, new a(this.f157396b, benchmarkExerciseDetailsFragment, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = BenchmarkExerciseDetailsFragment.f48362v;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    p2 p2Var = p2.f111205a;
                    String strQ = y.Q(mVar2, R.string.strength_training_add_exercise);
                    l.f157449a.getClass();
                    z3.e eVar = l.f157450b;
                    boolean zR = mVar2.r(benchmarkExerciseDetailsFragment);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new c(benchmarkExerciseDetailsFragment, objArr == true ? 1 : 0);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new c(benchmarkExerciseDetailsFragment, objArr == true ? 1 : 0);
                            mVar2.K(objQ);
                        }
                    }
                    p2Var.g(strQ, null, null, null, eVar, this.f157396b, false, (e23.a) objQ, mVar2, 24576, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
