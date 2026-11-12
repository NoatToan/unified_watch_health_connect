package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService", f = "LivetrackService.kt", l = {542}, m = "createRepository", v = 2)
public final class i0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f184497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class f184498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f184499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f184500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f184502f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(LivetrackService livetrackService, t13.d<? super i0> dVar) {
        super(dVar);
        this.f184501e = livetrackService;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184500d = obj;
        this.f184502f |= Integer.MIN_VALUE;
        int i14 = LivetrackService.f50160k;
        return this.f184501e.a(this);
    }
}
