package z0;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public class j0 implements l0.c<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture f200657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f200658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f200659c;

    public j0(h0 h0Var, ListenableFuture listenableFuture, boolean z14) {
        this.f200659c = h0Var;
        this.f200657a = listenableFuture;
        this.f200658b = z14;
    }

    @Override // l0.c
    public final void onFailure(Throwable th3) {
    }

    @Override // l0.c
    public final void onSuccess(Void r14) {
        n0.a aVar;
        h0 h0Var = this.f200659c;
        if (this.f200657a != h0Var.f200634v || (aVar = h0Var.f200636x) == n0.a.INACTIVE) {
            return;
        }
        n0.a aVar2 = this.f200658b ? n0.a.ACTIVE_STREAMING : n0.a.ACTIVE_NON_STREAMING;
        if (aVar2 != aVar) {
            h0Var.f200636x = aVar2;
            h0Var.L().d(aVar2);
        }
    }
}
