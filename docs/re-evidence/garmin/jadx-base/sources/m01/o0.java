package m01;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl", f = "NutritionRepositoryImpl.kt", l = {444}, m = "getUserPreferenceValue", v = 2)
public final class o0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f115647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f115649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(h hVar, t13.d<? super o0> dVar) {
        super(dVar);
        this.f115648b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f115647a = obj;
        this.f115649c |= Integer.MIN_VALUE;
        int i14 = h.f115593c;
        return this.f115648b.W0(null, this);
    }
}
