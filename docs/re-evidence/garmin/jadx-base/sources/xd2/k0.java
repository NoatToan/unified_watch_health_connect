package xd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository", f = "DefaultLivetrackRepository.kt", l = {159, 164}, m = "updateAutoStartForAllDevices", v = 2)
public final class k0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f190216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f190217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f190218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f190219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(b bVar, t13.d<? super k0> dVar) {
        super(dVar);
        this.f190218c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190217b = obj;
        this.f190219d |= Integer.MIN_VALUE;
        return this.f190218c.n(false, this);
    }
}
