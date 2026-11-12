package ss1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsRepoImpl", f = "GarminTrailsRepoImpl.kt", l = {222, 225}, m = "getTrailExtraInfo", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qs1.d f160706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f160707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f160708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f160709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f160710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f160711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f160712g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z zVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f160711f = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160710e = obj;
        this.f160712g |= Integer.MIN_VALUE;
        int i14 = z.f160773c;
        return this.f160711f.b(null, 0L, this);
    }
}
