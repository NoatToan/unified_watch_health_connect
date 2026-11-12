package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService", f = "LivetrackService.kt", l = {361, 362, 363}, m = "updateAutoStartForAllDevices", v = 2)
public final class y0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f184677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f184678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f184680d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(LivetrackService livetrackService, t13.d<? super y0> dVar) {
        super(dVar);
        this.f184679c = livetrackService;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184678b = obj;
        this.f184680d |= Integer.MIN_VALUE;
        return this.f184679c.k(null, false, this);
    }
}
