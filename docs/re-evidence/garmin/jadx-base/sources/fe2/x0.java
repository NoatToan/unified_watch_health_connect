package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenSessionCreator", f = "DeviceDrivenSessionCreator.kt", l = {103}, m = "startLivetrackOnDevice", v = 2)
public final class x0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f70998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f70999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(u0 u0Var, t13.d<? super x0> dVar) {
        super(dVar);
        this.f70999b = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70998a = obj;
        this.f71000c |= Integer.MIN_VALUE;
        int i14 = u0.f70945g;
        return this.f70999b.c(null, null, null, this);
    }
}
