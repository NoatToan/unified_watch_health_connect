package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenSession", f = "DeviceDrivenSession.kt", l = {169}, m = "stopSession", v = 2)
public final class s0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v1 f70917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f70918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f70919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f70920d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(j0 j0Var, t13.d<? super s0> dVar) {
        super(dVar);
        this.f70919c = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70918b = obj;
        this.f70920d |= Integer.MIN_VALUE;
        return this.f70919c.p(null, this);
    }
}
