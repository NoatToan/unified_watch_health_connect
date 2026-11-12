package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService", f = "LivetrackService.kt", l = {317}, m = "updateDeviceSettings", v = 2)
public final class z0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f184690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f184692c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(LivetrackService livetrackService, t13.d<? super z0> dVar) {
        super(dVar);
        this.f184691b = livetrackService;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184690a = obj;
        this.f184692c |= Integer.MIN_VALUE;
        return this.f184691b.l(0L, null, null, this);
    }
}
