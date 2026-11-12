package de2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.device.LiveTrackDataHandler", f = "LiveTrackDataHandler.kt", l = {180}, m = "stopLiveTrack$livetrack_release", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f59284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f59285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f59286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(b0 b0Var, t13.d<? super f0> dVar) {
        super(dVar);
        this.f59285b = b0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f59284a = obj;
        this.f59286c |= Integer.MIN_VALUE;
        return this.f59285b.e(this);
    }
}
