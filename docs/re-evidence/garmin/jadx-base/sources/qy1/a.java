package qy1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.domain.event.GetCyclingEventNutritionAndHydrationDataUseCase", f = "GetCyclingEventNutritionAndHydrationDataUseCase.kt", l = {19, 23}, m = "invoke", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public my1.c f148550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f148551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f148552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f148553d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f148552c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148551b = obj;
        this.f148553d |= Integer.MIN_VALUE;
        return this.f148552c.a(null, null, this);
    }
}
