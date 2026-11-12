package xd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository", f = "DefaultLivetrackRepository.kt", l = {587}, m = "getGarminDeviceHeaders", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f190271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f190272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f190273c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b bVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f190272b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190271a = obj;
        this.f190273c |= Integer.MIN_VALUE;
        return b.J(this.f190272b, 0L, this);
    }
}
