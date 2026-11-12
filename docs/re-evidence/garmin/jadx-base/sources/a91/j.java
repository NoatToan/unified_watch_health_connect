package a91;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.DefaultPersonalizedInsightsStore", f = "DefaultPersonalizedInsightsStore.kt", l = {51}, m = "generate", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f2136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2137c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f2136b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f2135a = obj;
        this.f2137c |= Integer.MIN_VALUE;
        return this.f2136b.G(null, null, null, this);
    }
}
