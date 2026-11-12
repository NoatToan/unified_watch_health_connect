package u21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupRecommendationsViewModel", f = "NutritionSetupRecommendationsViewModel.kt", l = {364}, m = "fetchDailyCaloriesAverage", v = 2)
public final class p0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f168097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f168098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f168099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(o0 o0Var, t13.d<? super p0> dVar) {
        super(dVar);
        this.f168098b = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f168097a = obj;
        this.f168099c |= Integer.MIN_VALUE;
        return this.f168098b.B4(this);
    }
}
