package v01;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.UpdateRecipeUseCase", f = "UpdateRecipeUseCase.kt", l = {70}, m = "deletePhoto", v = 2)
public final class e2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f174344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2 f174345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f174346c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(g2 g2Var, t13.d<? super e2> dVar) {
        super(dVar);
        this.f174345b = g2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f174344a = obj;
        this.f174346c |= Integer.MIN_VALUE;
        return g2.a(this.f174345b, null, this);
    }
}
