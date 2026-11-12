package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService", f = "LivetrackService.kt", l = {530, 533}, m = "init", v = 2)
public final class s0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LivetrackService f184601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f184602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f184604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(LivetrackService livetrackService, t13.d<? super s0> dVar) {
        super(dVar);
        this.f184603c = livetrackService;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184602b = obj;
        this.f184604d |= Integer.MIN_VALUE;
        int i14 = LivetrackService.f50160k;
        return this.f184603c.d(this);
    }
}
