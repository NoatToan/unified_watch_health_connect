package xd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository", f = "DefaultLivetrackRepository.kt", l = {273}, m = "getShortUrl", v = 2)
public final class z extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f190394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f190395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f190396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f190397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f190398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b bVar, t13.d<? super z> dVar) {
        super(dVar);
        this.f190397d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190396c = obj;
        this.f190398e |= Integer.MIN_VALUE;
        return this.f190397d.t(0L, null, this);
    }
}
