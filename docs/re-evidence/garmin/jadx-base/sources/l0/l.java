package l0;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture f107815a;

    public l(ListenableFuture listenableFuture) {
        this.f107815a = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f107815a.cancel(true);
    }
}
