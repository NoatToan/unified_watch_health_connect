package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicTerminator", f = "ClassicTerminator.kt", l = {39}, m = "terminateSessionById", v = 2)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f70928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f70929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70930c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q qVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f70929b = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70928a = obj;
        this.f70930c |= Integer.MIN_VALUE;
        return this.f70929b.c(null, this);
    }
}
