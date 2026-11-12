package p92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.GarminConsent", f = "GarminConsent.kt", l = {282}, m = "revokeThirdPartyConsent")
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f136657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f136658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f136659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(o oVar, t13.d<? super v> dVar) {
        super(dVar);
        this.f136658b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136657a = obj;
        this.f136659c |= Integer.MIN_VALUE;
        return this.f136658b.w(null, null, this);
    }
}
