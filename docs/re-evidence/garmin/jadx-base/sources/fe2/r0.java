package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenSession", f = "DeviceDrivenSession.kt", l = {141, 142, 145, 150}, m = "stop", v = 2)
public final class r0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f70903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f70904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(j0 j0Var, t13.d<? super r0> dVar) {
        super(dVar);
        this.f70904b = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70903a = obj;
        this.f70905c |= Integer.MIN_VALUE;
        return this.f70904b.g(null, this);
    }
}
