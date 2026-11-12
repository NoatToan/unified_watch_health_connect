package p92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.GarminConsent", f = "GarminConsent.kt", l = {91}, m = "fetchConsent")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f136582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q92.d f136583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f136584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f136585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f136586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f136585d = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136584c = obj;
        this.f136586e |= Integer.MIN_VALUE;
        return this.f136585d.b(null, this);
    }
}
