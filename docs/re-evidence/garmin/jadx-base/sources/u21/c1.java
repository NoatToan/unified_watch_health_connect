package u21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupViewModel", f = "NutritionSetupViewModel.kt", l = {465, 465}, m = "setUpReminders", v = 2)
public final class c1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l01.k f167920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f167921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f167922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f167923d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(u0 u0Var, t13.d<? super c1> dVar) {
        super(dVar);
        this.f167922c = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f167921b = obj;
        this.f167923d |= Integer.MIN_VALUE;
        return u0.y4(this.f167922c, null, this);
    }
}
