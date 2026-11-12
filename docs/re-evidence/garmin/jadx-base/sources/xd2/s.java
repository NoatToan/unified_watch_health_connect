package xd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository", f = "DefaultLivetrackRepository.kt", l = {512, 516}, m = "getLivetrackPublisher", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f190328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public be2.e f190329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f190330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f190331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f190332e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(b bVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f190331d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190330c = obj;
        this.f190332e |= Integer.MIN_VALUE;
        return this.f190331d.z(0L, this);
    }
}
