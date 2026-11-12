package p92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.GarminConsent", f = "GarminConsent.kt", l = {122}, m = "fetchConsent")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f136587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q92.x f136588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f136589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f136590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f136591e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f136590d = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136589c = obj;
        this.f136591e |= Integer.MIN_VALUE;
        return this.f136590d.c(null, this);
    }
}
