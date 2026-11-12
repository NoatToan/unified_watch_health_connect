package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicSession", f = "ClassicSession.kt", l = {310}, m = "startLivetrackOnDevice", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f70731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f70732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70733c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f70732b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70731a = obj;
        this.f70733c |= Integer.MIN_VALUE;
        int i14 = b.f70632t;
        return this.f70732b.v(this);
    }
}
