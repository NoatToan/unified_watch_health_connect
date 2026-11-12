package rx.android.schedulers;

import android.os.Handler;
import java.util.Objects;
import rx.Scheduler;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public final class HandlerScheduler extends a {
    private HandlerScheduler(Handler handler) {
        super(handler);
    }

    @Deprecated
    public static HandlerScheduler from(Handler handler) {
        Objects.requireNonNull(handler, "handler == null");
        return new HandlerScheduler(handler);
    }

    @Override // rx.android.schedulers.a, rx.Scheduler
    public /* bridge */ /* synthetic */ Scheduler.Worker createWorker() {
        return super.createWorker();
    }
}
