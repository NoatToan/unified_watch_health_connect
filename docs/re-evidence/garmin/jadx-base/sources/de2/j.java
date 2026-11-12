package de2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.device.DefaultDeviceManager", f = "DefaultDeviceManager.kt", l = {141, 143, 145}, m = "startLiveTrack", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f59315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f59316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f59317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g0.b f59318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f59319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f59320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f59321g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f59320f = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f59319e = obj;
        this.f59321g |= Integer.MIN_VALUE;
        return this.f59320f.b(0L, false, null, this);
    }
}
