package p92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.GarminConsent", f = "GarminConsent.kt", l = {361}, m = "optOutFeature")
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f136641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q92.d f136642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f136643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f136644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f136645e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o oVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f136644d = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136643c = obj;
        this.f136645e |= Integer.MIN_VALUE;
        return this.f136644d.t(null, this);
    }
}
