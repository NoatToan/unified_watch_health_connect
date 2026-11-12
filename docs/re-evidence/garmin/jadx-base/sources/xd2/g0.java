package xd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository", f = "DefaultLivetrackRepository.kt", l = {96, 109, 116}, m = "setLivetrackSettings", v = 2)
public final class g0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f190155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ge2.e f190156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public be2.f f190157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f190158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f190159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f190160f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(b bVar, t13.d<? super g0> dVar) {
        super(dVar);
        this.f190159e = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190158d = obj;
        this.f190160f |= Integer.MIN_VALUE;
        return this.f190159e.i(0L, null, this);
    }
}
