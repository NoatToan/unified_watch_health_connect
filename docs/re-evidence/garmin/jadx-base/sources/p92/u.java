package p92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.GarminConsent", f = "GarminConsent.kt", l = {239}, m = "revokeManagedAccountConsent")
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f136651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q92.x f136652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s92.l f136653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f136654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f136655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f136656f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(o oVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f136655e = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136654d = obj;
        this.f136656f |= Integer.MIN_VALUE;
        return this.f136655e.v(null, null, null, this);
    }
}
