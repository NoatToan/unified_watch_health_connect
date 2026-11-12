package p92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.GarminConsent", f = "GarminConsent.kt", l = {167}, m = "fetchManagedAccountAllConsents")
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f136610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f136611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f136612c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f136611b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136610a = obj;
        this.f136612c |= Integer.MIN_VALUE;
        return this.f136611b.j(false, null, this);
    }
}
