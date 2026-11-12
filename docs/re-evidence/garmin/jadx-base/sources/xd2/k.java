package xd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository", f = "DefaultLivetrackRepository.kt", l = {319, 320}, m = "endLivetrackSessions", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ae2.e0 f190211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f190212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f190213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f190214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f190215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f190214d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190213c = obj;
        this.f190215e |= Integer.MIN_VALUE;
        return this.f190214d.I(null, 0L, this);
    }
}
