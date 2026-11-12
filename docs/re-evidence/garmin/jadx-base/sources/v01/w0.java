package v01;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetNutritionRemindersUseCase", f = "GetNutritionRemindersUseCase.kt", l = {38}, m = "invoke", v = 2)
public final class w0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pd1.a f174574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f174575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f174576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f174577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(b1 b1Var, t13.d<? super w0> dVar) {
        super(dVar);
        this.f174576c = b1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f174575b = obj;
        this.f174577d |= Integer.MIN_VALUE;
        return this.f174576c.a(null, this);
    }
}
