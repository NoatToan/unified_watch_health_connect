package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.braintreepayments.api.Scheduler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes21.dex */
class uv implements Scheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f50598a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f50599c;

    uv() {
        this(new Handler(Looper.getMainLooper()), Executors.newCachedThreadPool());
    }

    uv(Handler handler, ExecutorService executorService) {
        this.f50599c = handler;
        this.f50598a = executorService;
    }

    @Override // com.braintreepayments.api.Scheduler
    public void runOnBackground(Runnable runnable) {
        this.f50598a.submit(runnable);
    }

    @Override // com.braintreepayments.api.Scheduler
    public void runOnMain(Runnable runnable) {
        this.f50599c.post(runnable);
    }
}
