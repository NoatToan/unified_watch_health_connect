package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenSession", f = "DeviceDrivenSession.kt", l = {365}, m = "createAnonymousSession", v = 2)
public final class k0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f70821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f70822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j0 j0Var, t13.d<? super k0> dVar) {
        super(dVar);
        this.f70822b = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70821a = obj;
        this.f70823c |= Integer.MIN_VALUE;
        int i14 = j0.f70788r;
        return this.f70822b.t(this);
    }
}
