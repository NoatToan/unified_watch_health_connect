package u21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.MealCalorieGoalsViewModel", f = "MealCalorieGoalsViewModel.kt", l = {174}, m = "fetchMeals", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f168100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f168101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f168102c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f168101b = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f168100a = obj;
        this.f168102c |= Integer.MIN_VALUE;
        int i14 = p.f168081n;
        return this.f168101b.y4(this);
    }
}
