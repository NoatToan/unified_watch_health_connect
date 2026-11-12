package v01;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.CreateRecipeUseCaseKt", f = "CreateRecipeUseCase.kt", l = {62}, m = "uploadRecipePhoto", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f174445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f174446b;

    public k(t13.d<? super k> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f174445a = obj;
        this.f174446b |= Integer.MIN_VALUE;
        return l.a(null, null, null, null, this);
    }
}
