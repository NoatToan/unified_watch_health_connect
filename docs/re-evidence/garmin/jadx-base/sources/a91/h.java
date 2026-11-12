package a91;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.DefaultPersonalizedInsightsStore", f = "DefaultPersonalizedInsightsStore.kt", l = {21}, m = "fetchPersonalizedMessage", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f2130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f2130b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f2129a = obj;
        this.f2131c |= Integer.MIN_VALUE;
        return this.f2130b.Z0(false, this);
    }
}
