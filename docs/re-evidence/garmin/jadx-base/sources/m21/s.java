package m21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FoodSearchViewModel", f = "FoodSearchViewModel.kt", l = {252}, m = "fetchNutritionSettings", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f116167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f116168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f116169c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g gVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f116168b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f116167a = obj;
        this.f116169c |= Integer.MIN_VALUE;
        return g.y4(this.f116168b, null, this);
    }
}
