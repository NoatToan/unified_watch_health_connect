package my2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.sync.retrofit.SyncRetrofitDelegate", f = "SyncRetrofitDelegate.kt", l = {338}, m = "createApi")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f121550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f121551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f121552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f121553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f121554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f121555f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f121554e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121553d = obj;
        this.f121555f |= Integer.MIN_VALUE;
        a.C2303a c2303a = a.f121522d;
        return this.f121554e.i(0L, this);
    }
}
