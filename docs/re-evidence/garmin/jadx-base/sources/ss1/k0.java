package ss1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsReviewsRepoImpl", f = "GarminTrailsReviewsRepoImpl.kt", l = {103}, m = "getTranslatedReview", v = 2)
public final class k0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f160680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f160681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(v0 v0Var, t13.d<? super k0> dVar) {
        super(dVar);
        this.f160681b = v0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160680a = obj;
        this.f160682c |= Integer.MIN_VALUE;
        return this.f160681b.H0(0L, null, this);
    }
}
