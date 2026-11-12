package com.huami.sync.job;

import android.os.Process;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sync.job.Job;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003BG\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0016¢\u0006\u0004\b \u0010!J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\b\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006J\u0006\u0010\t\u001a\u00020\u0004R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/huami/sync/job/JobDispatcher;", "Lcom/huami/sync/job/Job;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Thread;", "", "run", "Lcom/huami/sync/job/Action;", "action", "setAction", "quit", "Ljava/util/concurrent/BlockingQueue;", "a", "Ljava/util/concurrent/BlockingQueue;", "jobQueue", "Lcom/huami/sync/job/Interceptor;", "b", "Lcom/huami/sync/job/Interceptor;", "interceptor", "Lcom/huami/sync/job/Delivery;", "c", "Lcom/huami/sync/job/Delivery;", "delivery", "", "Lcom/huami/sync/job/JobHandlerListener;", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "jobHandlerListeners", "e", "Lcom/huami/sync/job/Action;", "", "f", "Z", "<init>", "(Ljava/util/concurrent/BlockingQueue;Lcom/huami/sync/job/Interceptor;Lcom/huami/sync/job/Delivery;Ljava/util/List;)V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class JobDispatcher<T extends Job<T>> extends Thread {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BlockingQueue<T> jobQueue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Interceptor<T> interceptor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Delivery<T> delivery;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<JobHandlerListener<T>> jobHandlerListeners;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Action<T> action;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private volatile boolean quit;

    /* JADX WARN: Multi-variable type inference failed */
    public JobDispatcher(@NotNull BlockingQueue<T> blockingQueue, @Nullable Interceptor<T> interceptor, @NotNull Delivery<T> delivery, @NotNull List<? extends JobHandlerListener<T>> list) {
        this.jobQueue = blockingQueue;
        this.interceptor = interceptor;
        this.delivery = delivery;
        this.jobHandlerListeners = list;
    }

    public final void quit() {
        this.quit = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        LoggingKt.log(Intrinsics.stringPlus("start new dispatcher:", getName()));
        Process.setThreadPriority(10);
        while (true) {
            try {
                T tTake = this.jobQueue.take();
                LoggingKt.log(Intrinsics.stringPlus("job-queue-take,current thread:", getName()));
                if (tTake == null) {
                    LoggingKt.log(Intrinsics.stringPlus("element is null,current thread:", getName()));
                } else if (tTake.getIsCancel()) {
                    LoggingKt.log("job is cancel when run");
                    LoggingKt.log(Intrinsics.stringPlus("element is canceled,current thread:", getName()));
                    this.delivery.cancel(this.jobHandlerListeners, tTake);
                } else {
                    Interceptor<T> interceptor = this.interceptor;
                    if (!(interceptor == null ? false : interceptor.onIntercept(tTake))) {
                        this.delivery.prepare(this.jobHandlerListeners, tTake);
                        if (this.action == null) {
                            LoggingKt.log(Intrinsics.stringPlus("action is null,current thread:", getName()));
                        } else {
                            LoggingKt.log(Intrinsics.stringPlus("job run start,current thread:", getName()));
                            Action<T> action = this.action;
                            if (action != null) {
                                action.call(tTake);
                            }
                            LoggingKt.log(Intrinsics.stringPlus("job run finish,current thread:", getName()));
                            tTake.finish();
                            LoggingKt.log(Intrinsics.stringPlus("element is finished,current thread:", getName()));
                            this.delivery.finish(this.jobHandlerListeners, tTake);
                        }
                    }
                }
            } catch (InterruptedException unused) {
                if (this.quit) {
                    return;
                }
            }
        }
    }

    public final void setAction(@Nullable Action<T> action) {
        this.action = action;
    }
}
