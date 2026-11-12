package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicSession", f = "ClassicSession.kt", l = {232, 234}, m = "startOnDevice", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f70746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f70747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f70747b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70746a = obj;
        this.f70748c |= Integer.MIN_VALUE;
        int i14 = b.f70632t;
        return this.f70747b.w(this);
    }
}
