package v01;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.SaveMealSettingsUseCase", f = "SaveMealSettingsUseCase.kt", l = {85}, m = "invoke", v = 2)
public final class a2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f174213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f174214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f174215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(b2 b2Var, t13.d<? super a2> dVar) {
        super(dVar);
        this.f174214b = b2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f174213a = obj;
        this.f174215c |= Integer.MIN_VALUE;
        return this.f174214b.a(null, null, null, this);
    }
}
