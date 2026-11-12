package u21;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupRecommendationsViewModel", f = "NutritionSetupRecommendationsViewModel.kt", l = {WalletConstants.ERROR_CODE_UNKNOWN}, m = "initializeMicroGoals", v = 2)
public final class s0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f168128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f168129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f168130c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(o0 o0Var, t13.d<? super s0> dVar) {
        super(dVar);
        this.f168129b = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f168128a = obj;
        this.f168130c |= Integer.MIN_VALUE;
        return o0.y4(this.f168129b, this);
    }
}
