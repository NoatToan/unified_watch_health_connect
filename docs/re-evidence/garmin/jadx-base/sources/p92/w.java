package p92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.GarminConsent", f = "GarminConsent.kt", l = {444}, m = "updateDeviceUploadConsent")
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f136660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f136661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f136662c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(o oVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f136661b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136660a = obj;
        this.f136662c |= Integer.MIN_VALUE;
        return this.f136661b.A(false, false, this);
    }
}
