package com.xiaomi.fitness.aggregation.summary;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/aggregation/summary/SummaryWorker;", "", "<init>", "()V", "WORKER_NAME", "", "workerThread", "Landroid/os/HandlerThread;", "obtainWorkerHandler", "Landroid/os/Handler;", "callback", "Landroid/os/Handler$Callback;", "stopWorker", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SummaryWorker {

    @NotNull
    public static final SummaryWorker INSTANCE = new SummaryWorker();

    @NotNull
    private static final String WORKER_NAME = "sync_to_summary";

    @Nullable
    private static HandlerThread workerThread;

    private SummaryWorker() {
    }

    @NotNull
    public final synchronized Handler obtainWorkerHandler(@NotNull Handler.Callback callback) {
        HandlerThread handlerThread;
        try {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (workerThread == null) {
                HandlerThread handlerThread2 = new HandlerThread(WORKER_NAME);
                workerThread = handlerThread2;
                Intrinsics.checkNotNull(handlerThread2);
                handlerThread2.start();
            }
            handlerThread = workerThread;
            Intrinsics.checkNotNull(handlerThread);
        } catch (Throwable th) {
            throw th;
        }
        return new Handler(handlerThread.getLooper(), callback);
    }

    public final void stopWorker() {
        HandlerThread handlerThread = workerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }
}
