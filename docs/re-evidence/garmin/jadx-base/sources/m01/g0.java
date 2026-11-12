package m01;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl", f = "NutritionRepositoryImpl.kt", l = {428}, m = "getPregnancyCompletionGoalSuggestionOpened", v = 2)
public final class g0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f115590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f115592c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h hVar, t13.d<? super g0> dVar) {
        super(dVar);
        this.f115591b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f115590a = obj;
        this.f115592c |= Integer.MIN_VALUE;
        return this.f115591b.f0(this);
    }
}
