package q42;

import com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsActivity;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WeightReportsActivity f142670b;

    public /* synthetic */ q(WeightReportsActivity weightReportsActivity, int i14) {
        this.f142669a = i14;
        this.f142670b = weightReportsActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f142669a;
        WeightReportsActivity weightReportsActivity = this.f142670b;
        switch (i14) {
            case 0:
                int i15 = WeightReportsActivity.f47991a;
                return ParametersHolderKt.parametersOf(Boolean.valueOf(weightReportsActivity.getIntent().getBooleanExtra("EXTRA_SHOW_INDEX_S2_WHATS_NEW", false)));
            default:
                int i16 = WeightReportsActivity.f47991a;
                weightReportsActivity.getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
        }
    }
}
