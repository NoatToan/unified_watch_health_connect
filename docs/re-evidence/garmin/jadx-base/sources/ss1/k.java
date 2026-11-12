package ss1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsRepoImpl", f = "GarminTrailsRepoImpl.kt", l = {124, 125}, m = "getTrailDetails", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f160676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f160677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f160678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f160679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(z zVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f160678c = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160677b = obj;
        this.f160679d |= Integer.MIN_VALUE;
        return this.f160678c.c3(0L, this);
    }
}
