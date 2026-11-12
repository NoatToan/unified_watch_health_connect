package u21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupRecommendationsViewModel", f = "NutritionSetupRecommendationsViewModel.kt", l = {422}, m = "fetchMicronutrientsSettings", v = 2)
public final class q0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f168103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f168104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f168105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(o0 o0Var, t13.d<? super q0> dVar) {
        super(dVar);
        this.f168104b = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f168103a = obj;
        this.f168105c |= Integer.MIN_VALUE;
        return this.f168104b.C4(this);
    }
}
