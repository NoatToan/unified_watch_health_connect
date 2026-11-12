package a91;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.DefaultPersonalizedInsightsProvider", f = "DefaultPersonalizedInsightsProvider.kt", l = {216, 219, 225}, m = "displayMessage", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d91.t.e f2105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f2107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f2107c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f2106b = obj;
        this.f2108d |= Integer.MIN_VALUE;
        return a.f(this.f2107c, null, null, this);
    }
}
