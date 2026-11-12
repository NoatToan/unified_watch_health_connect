package wt2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.net.ephemeris.gdi.EphemerisDataHandler", f = "EphemerisDataHandler.kt", l = {435, 471, 475}, m = "requestGpsEphemerisEpo")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f187184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f187185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f187186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f187187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f187188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f187189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f187190g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f187189f = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f187188e = obj;
        this.f187190g |= Integer.MIN_VALUE;
        a.C3482a c3482a = a.f187141k;
        return this.f187189f.j(null, null, false, this);
    }
}
