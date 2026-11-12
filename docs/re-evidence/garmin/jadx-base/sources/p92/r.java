package p92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.GarminConsent", f = "GarminConsent.kt", l = {347}, m = "optInFeature")
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f136636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q92.d f136637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f136638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f136639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f136640e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(o oVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f136639d = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136638c = obj;
        this.f136640e |= Integer.MIN_VALUE;
        return this.f136639d.s(null, this);
    }
}
