package u21;

import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupRecommendationsViewModel", f = "NutritionSetupRecommendationsViewModel.kt", l = {StatusLine.HTTP_TEMP_REDIRECT, 321, 334, 346}, m = "initializeActivityLevelSummary", v = 2)
public final class r0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f168109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f168110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f168111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(o0 o0Var, t13.d<? super r0> dVar) {
        super(dVar);
        this.f168110b = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f168109a = obj;
        this.f168111c |= Integer.MIN_VALUE;
        return o0.x4(this.f168110b, this);
    }
}
