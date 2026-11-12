package u21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.MealSettingsViewModel", f = "MealSettingsViewModel.kt", l = {487, 489}, m = "fetchMeals", v = 2)
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f168170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f168171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f168172c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t tVar, t13.d<? super v> dVar) {
        super(dVar);
        this.f168171b = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f168170a = obj;
        this.f168172c |= Integer.MIN_VALUE;
        return t.x4(this.f168171b, this);
    }
}
