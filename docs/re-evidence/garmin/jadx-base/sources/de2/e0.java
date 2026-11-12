package de2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.device.LiveTrackDataHandler", f = "LiveTrackDataHandler.kt", l = {220}, m = "startLiveTrack$livetrack_release", v = 2)
public final class e0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f59276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f59277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f59278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f59279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f59280e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(b0 b0Var, t13.d<? super e0> dVar) {
        super(dVar);
        this.f59279d = b0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f59278c = obj;
        this.f59280e |= Integer.MIN_VALUE;
        return this.f59279d.b(0L, null, this);
    }
}
