package pj2;

import com.google.common.util.concurrent.FutureCallback;

/* JADX INFO: loaded from: classes11.dex */
public class u implements FutureCallback<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f138112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f138113b;

    public u(v vVar, Runnable runnable) {
        this.f138113b = vVar;
        this.f138112a = runnable;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(Throwable th3) {
        this.f138113b.f138121e.warn("requestMtu Failed . {}", th3.getMessage(), th3);
        this.f138112a.run();
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(Void r14) {
        this.f138112a.run();
    }
}
