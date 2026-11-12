package xd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository", f = "DefaultLivetrackRepository.kt", l = {368, 369}, m = "endLivetrackSessionById", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ae2.e0 f190186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f190187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f190188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f190189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f190190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f190191f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f190190e = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190189d = obj;
        this.f190191f |= Integer.MIN_VALUE;
        return this.f190190e.v(0L, null, null, this);
    }
}
