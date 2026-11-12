package m21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FoodSearchViewModel", f = "FoodSearchViewModel.kt", l = {311}, m = "fetchMeals", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f116164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f116165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f116166c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g gVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f116165b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f116164a = obj;
        this.f116166c |= Integer.MIN_VALUE;
        return g.x4(this.f116165b, this);
    }
}
