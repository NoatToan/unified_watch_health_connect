package m01;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl", f = "NutritionRepositoryImpl.kt", l = {420}, m = "getPregnancyStartingGoalSuggestionOpened", v = 2)
public final class h0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f115596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f115598c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(h hVar, t13.d<? super h0> dVar) {
        super(dVar);
        this.f115597b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f115596a = obj;
        this.f115598c |= Integer.MIN_VALUE;
        return this.f115597b.m(this);
    }
}
