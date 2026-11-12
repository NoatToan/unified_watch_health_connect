package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService", f = "LivetrackService.kt", l = {591, 592}, m = "setLocalDeviceSettings", v = 2)
public final class v0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f184638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ge2.a f184639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f184640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f184642e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(LivetrackService livetrackService, t13.d<? super v0> dVar) {
        super(dVar);
        this.f184641d = livetrackService;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184640c = obj;
        this.f184642e |= Integer.MIN_VALUE;
        int i14 = LivetrackService.f50160k;
        return this.f184641d.h(0L, null, null, this);
    }
}
