package u21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupWeightViewModel", f = "NutritionSetupWeightViewModel.kt", l = {151}, m = "fetchAndSetCurrentWeight", v = 2)
public final class f1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f167958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f167959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f167960c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(e1 e1Var, t13.d<? super f1> dVar) {
        super(dVar);
        this.f167959b = e1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f167958a = obj;
        this.f167960c |= Integer.MIN_VALUE;
        return this.f167959b.x4(null, this);
    }
}
