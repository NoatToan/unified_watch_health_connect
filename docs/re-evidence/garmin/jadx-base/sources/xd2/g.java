package xd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository", f = "DefaultLivetrackRepository.kt", l = {407, 408}, m = "endGrouptrackSession", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f190149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ae2.e0 f190150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f190151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f190152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f190153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f190154f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f190153e = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190152d = obj;
        this.f190154f |= Integer.MIN_VALUE;
        return this.f190153e.j(0L, null, null, this);
    }
}
