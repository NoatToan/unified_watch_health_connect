package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService", f = "LivetrackService.kt", l = {345, 346, 347, 348, 349}, m = "sendSettingsToDevice", v = 2)
public final class t0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f184613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f184614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f184616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(LivetrackService livetrackService, t13.d<? super t0> dVar) {
        super(dVar);
        this.f184615c = livetrackService;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184614b = obj;
        this.f184616d |= Integer.MIN_VALUE;
        return this.f184615c.f(0L, null, this);
    }
}
