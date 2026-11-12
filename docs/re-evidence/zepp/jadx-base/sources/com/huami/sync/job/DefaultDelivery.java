package com.huami.sync.job;

import android.os.Handler;
import androidx.exifinterface.media.ExifInterface;
import com.huami.sync.job.DefaultDelivery;
import com.huami.sync.job.Job;
import com.twitter.sdk.android.tweetcomposer.g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\t\u001a\u00020\b2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\f\u001a\u00020\b2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\nR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/huami/sync/job/DefaultDelivery;", "Lcom/huami/sync/job/Job;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/sync/job/Delivery;", "", "Lcom/huami/sync/job/JobHandlerListener;", "listeners", "job", "", "prepare", "(Ljava/util/List;Lcom/huami/sync/job/Job;)V", g.g, "finish", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "responsePoster", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;)V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class DefaultDelivery<T extends Job<T>> implements Delivery<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Executor responsePoster;

    public DefaultDelivery(@NotNull final Handler handler) {
        this.responsePoster = new Executor() { // from class: k51
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                DefaultDelivery.h(handler, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(List list, Job job) {
        LoggingKt.log(Intrinsics.stringPlus("deliveryCancel,current thread:", Thread.currentThread().getName()));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((JobHandlerListener) it2.next()).onCancel(job);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(List list, Job job) {
        LoggingKt.log(Intrinsics.stringPlus("deliveryFinish,current thread:", Thread.currentThread().getName()));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((JobHandlerListener) it2.next()).onFinish(job);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Job job, DefaultDelivery defaultDelivery, List list) {
        if (job.getIsCancel()) {
            LoggingKt.log("job is cancel when deliveryPrepare");
            defaultDelivery.cancel(list, job);
        } else {
            LoggingKt.log(Intrinsics.stringPlus("deliveryPrepare,current thread:", Thread.currentThread().getName()));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((JobHandlerListener) it2.next()).onPrepare(job);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Handler handler, Runnable runnable) {
        handler.post(runnable);
    }

    @Override // com.huami.sync.job.Delivery
    public void cancel(@NotNull final List<? extends JobHandlerListener<T>> listeners, @NotNull final T job) {
        this.responsePoster.execute(new Runnable() { // from class: i51
            @Override // java.lang.Runnable
            public final void run() {
                DefaultDelivery.e(listeners, job);
            }
        });
    }

    @Override // com.huami.sync.job.Delivery
    public void finish(@NotNull final List<? extends JobHandlerListener<T>> listeners, @NotNull final T job) {
        if (!job.getIsCancel()) {
            this.responsePoster.execute(new Runnable() { // from class: j51
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDelivery.f(listeners, job);
                }
            });
        } else {
            LoggingKt.log("job is cancel when deliveryFinish");
            cancel(listeners, job);
        }
    }

    @Override // com.huami.sync.job.Delivery
    public void prepare(@NotNull final List<? extends JobHandlerListener<T>> listeners, @NotNull final T job) {
        this.responsePoster.execute(new Runnable() { // from class: h51
            @Override // java.lang.Runnable
            public final void run() {
                DefaultDelivery.g(job, this, listeners);
            }
        });
    }
}
