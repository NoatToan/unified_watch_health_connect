package p92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.GarminConsent", f = "GarminConsent.kt", l = {253}, m = "grantThirdPartyConsent")
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f136633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f136634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f136635c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o oVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f136634b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136633a = obj;
        this.f136635c |= Integer.MIN_VALUE;
        return this.f136634b.r(null, null, this);
    }
}
