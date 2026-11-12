package v01;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetRecipeUseCase", f = "GetRecipeUseCase.kt", l = {71}, m = "getLanguageAndRegion", v = 2)
public final class g1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f174382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f174383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f174384c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(j1 j1Var, t13.d<? super g1> dVar) {
        super(dVar);
        this.f174383b = j1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f174382a = obj;
        this.f174384c |= Integer.MIN_VALUE;
        return j1.a(this.f174383b, null, this);
    }
}
