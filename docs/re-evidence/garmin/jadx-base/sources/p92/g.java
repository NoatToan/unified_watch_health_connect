package p92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.GarminConsent", f = "GarminConsent.kt", l = {309}, m = "fetchConsentText")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f136592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f136593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f136594c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f136593b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136592a = obj;
        this.f136594c |= Integer.MIN_VALUE;
        return this.f136593b.f(null, null, this);
    }
}
