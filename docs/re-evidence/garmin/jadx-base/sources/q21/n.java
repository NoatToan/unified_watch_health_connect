package q21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.settings.viewmodel.LegacyNutritionMealGoalsViewModel", f = "LegacyNutritionMealGoalsViewModel.kt", l = {72}, m = "fetchMeals", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f142266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f142267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f142268c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f142267b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f142266a = obj;
        this.f142268c |= Integer.MIN_VALUE;
        return m.x4(this.f142267b, this);
    }
}
