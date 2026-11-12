package p92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.GarminConsent", f = "GarminConsent.kt", l = {456}, m = "fetchDataSyncIndicator")
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f136603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f136604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f136605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f136606d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f136605c = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136604b = obj;
        this.f136606d |= Integer.MIN_VALUE;
        return this.f136605c.h(this);
    }
}
