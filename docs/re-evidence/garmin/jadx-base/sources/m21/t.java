package m21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FoodSearchViewModel", f = "FoodSearchViewModel.kt", l = {289}, m = "fetchSuggestions", v = 2)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f116170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f116171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f116172c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(g gVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f116171b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f116170a = obj;
        this.f116172c |= Integer.MIN_VALUE;
        return g.z4(this.f116171b, null, this);
    }
}
