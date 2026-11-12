package m01;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl", f = "NutritionRepositoryImpl.kt", l = {436}, m = "getNutritionV2WhatsNewUpdatesOpened", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f115583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f115585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h hVar, t13.d<? super f0> dVar) {
        super(dVar);
        this.f115584b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f115583a = obj;
        this.f115585c |= Integer.MIN_VALUE;
        return this.f115584b.m0(this);
    }
}
