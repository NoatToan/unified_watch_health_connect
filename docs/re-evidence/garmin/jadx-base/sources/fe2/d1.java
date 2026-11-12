package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenTerminator", f = "DeviceDrivenTerminator.kt", l = {27, 33, 35, 37, 38, 38, 38, 39, 39}, m = "terminateSessions", v = 2)
public final class d1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f70693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.i0 f70694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o53.i0 f70695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o53.i0 f70696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z0 f70697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f70698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f70699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z0 f70700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f70701i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(z0 z0Var, t13.d<? super d1> dVar) {
        super(dVar);
        this.f70700h = z0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70699g = obj;
        this.f70701i |= Integer.MIN_VALUE;
        return this.f70700h.d(null, this);
    }
}
