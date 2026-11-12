package p92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.GarminConsent", f = "GarminConsent.kt", l = {224}, m = "revokeConsent")
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f136646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q92.x f136647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f136648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f136649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f136650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(o oVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f136649d = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136648c = obj;
        this.f136650e |= Integer.MIN_VALUE;
        return this.f136649d.u(null, null, this);
    }
}
