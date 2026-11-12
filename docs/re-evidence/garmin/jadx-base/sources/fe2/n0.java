package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenSession", f = "DeviceDrivenSession.kt", l = {380}, m = "getShortUrl", v = 2)
public final class n0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f70860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f70861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70862c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(j0 j0Var, t13.d<? super n0> dVar) {
        super(dVar);
        this.f70861b = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70860a = obj;
        this.f70862c |= Integer.MIN_VALUE;
        int i14 = j0.f70788r;
        return this.f70861b.y(null, this);
    }
}
