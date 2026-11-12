package fe2;

import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenSession", f = "DeviceDrivenSession.kt", l = {StatusLine.HTTP_PERM_REDIRECT}, m = "startOnDevice", v = 2)
public final class q0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f70896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f70897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70898c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(j0 j0Var, t13.d<? super q0> dVar) {
        super(dVar);
        this.f70897b = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70896a = obj;
        this.f70898c |= Integer.MIN_VALUE;
        return j0.s(this.f70897b, this);
    }
}
