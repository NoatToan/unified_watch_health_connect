package xd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository", f = "DefaultLivetrackRepository.kt", l = {297}, m = "getTrackPointUploadFrequencySeconds", v = 2)
public final class b0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f190053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f190054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f190055c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(b bVar, t13.d<? super b0> dVar) {
        super(dVar);
        this.f190054b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190053a = obj;
        this.f190055c |= Integer.MIN_VALUE;
        return this.f190054b.r(0L, this);
    }
}
