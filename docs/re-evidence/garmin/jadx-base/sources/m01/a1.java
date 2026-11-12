package m01;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl", f = "NutritionRepositoryImpl.kt", l = {448}, m = "setUserPreference", v = 2)
public final class a1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f115533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f115534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f115535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f115536d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(h hVar, t13.d<? super a1> dVar) {
        super(dVar);
        this.f115535c = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f115534b = obj;
        this.f115536d |= Integer.MIN_VALUE;
        int i14 = h.f115593c;
        return this.f115535c.X0(null, false, this);
    }
}
