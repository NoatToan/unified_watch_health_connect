package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService", f = "LivetrackService.kt", l = {333, 334}, m = "setLivetrackSettings", v = 2)
public final class u0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f184625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ge2.e f184626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f184627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f184629e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(LivetrackService livetrackService, t13.d<? super u0> dVar) {
        super(dVar);
        this.f184628d = livetrackService;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184627c = obj;
        this.f184629e |= Integer.MIN_VALUE;
        return this.f184628d.g(0L, null, null, this);
    }
}
