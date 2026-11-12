package xd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository", f = "DefaultLivetrackRepository.kt", l = {91, 92}, m = "getLivetrackSettings", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f190372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f190373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.y0 f190374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.y0 f190375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.y0 f190376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f190377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f190378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f190379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f190380i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b bVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f190379h = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190378g = obj;
        this.f190380i |= Integer.MIN_VALUE;
        return this.f190379h.F(0L, this, false);
    }
}
