package my2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.sync.retrofit.SyncRetrofitDelegate", f = "SyncRetrofitDelegate.kt", l = {167, 168}, m = "ackDeviceMessage")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f121529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f121530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f121531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f121532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f121533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f121534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f121535g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f121534f = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121533e = obj;
        this.f121535g |= Integer.MIN_VALUE;
        return this.f121534f.c(0L, 0L, null, null, this);
    }
}
