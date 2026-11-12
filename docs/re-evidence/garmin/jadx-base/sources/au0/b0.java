package au0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.liveactivity.LiveActivityRepositoryWrapper$registerListener$1", f = "LiveActivityRepositoryWrapper.kt", l = {97, 98, 129, 130}, m = "setupClient", v = 2)
public final class b0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public of2.b0 f12858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0 f12862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12863f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, t13.d<? super b0> dVar) {
        super(dVar);
        this.f12862e = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12861d = obj;
        this.f12863f |= Integer.MIN_VALUE;
        return this.f12862e.a(null, this);
    }
}
