package u21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupWeightViewModel", f = "NutritionSetupWeightViewModel.kt", l = {183}, m = "fetchAndSetWeightGoal", v = 2)
public final class g1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f167975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f167976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f167977c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(e1 e1Var, t13.d<? super g1> dVar) {
        super(dVar);
        this.f167976b = e1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f167975a = obj;
        this.f167977c |= Integer.MIN_VALUE;
        return this.f167976b.y4(null, this);
    }
}
