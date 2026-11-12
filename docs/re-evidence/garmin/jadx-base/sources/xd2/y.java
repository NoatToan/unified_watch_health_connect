package xd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository", f = "DefaultLivetrackRepository.kt", l = {502}, m = "getSessionViewablePeriod", v = 2)
public final class y extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f190391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f190392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f190393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b bVar, t13.d<? super y> dVar) {
        super(dVar);
        this.f190392b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190391a = obj;
        this.f190393c |= Integer.MIN_VALUE;
        return this.f190392b.g(0L, this);
    }
}
