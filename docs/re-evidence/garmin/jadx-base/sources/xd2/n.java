package xd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository", f = "DefaultLivetrackRepository.kt", l = {68, 73, 79}, m = "fetchLivetrackSettings", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f190254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f190255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public be2.f f190256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f190257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f190258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f190259f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b bVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f190258e = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190257d = obj;
        this.f190259f |= Integer.MIN_VALUE;
        return this.f190258e.y(0L, this, false);
    }
}
