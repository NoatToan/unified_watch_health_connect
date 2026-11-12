package p92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.GarminConsent", f = "GarminConsent.kt", l = {429}, m = "fetchDeviceUploadConsent")
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f136607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f136608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f136609c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f136608b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136607a = obj;
        this.f136609c |= Integer.MIN_VALUE;
        return this.f136608b.i(this);
    }
}
