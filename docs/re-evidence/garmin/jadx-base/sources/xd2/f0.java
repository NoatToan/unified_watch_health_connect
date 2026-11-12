package xd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository", f = "DefaultLivetrackRepository.kt", l = {128, 149}, m = "setLivetrackLocalDeviceSettings", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f190143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ge2.a f190144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public be2.f f190145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f190146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f190147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f190148f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(b bVar, t13.d<? super f0> dVar) {
        super(dVar);
        this.f190147e = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190146d = obj;
        this.f190148f |= Integer.MIN_VALUE;
        return this.f190147e.D(0L, null, this);
    }
}
