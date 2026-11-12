package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class MemoryGaugeCollector {
    public static final long INVALID_MEMORY_COLLECTION_FREQUENCY = -1;
    private static final int UNSET_MEMORY_METRIC_COLLECTION_RATE = -1;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private long memoryMetricCollectionRateMs;
    private final ScheduledExecutorService memoryMetricCollectorExecutor;
    private ScheduledFuture memoryMetricCollectorJob;
    public final ConcurrentLinkedQueue<AndroidMemoryReading> memoryMetricReadings;
    private final Runtime runtime;

    public MemoryGaugeCollector(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.memoryMetricCollectorJob = null;
        this.memoryMetricCollectionRateMs = -1L;
        this.memoryMetricCollectorExecutor = scheduledExecutorService;
        this.memoryMetricReadings = new ConcurrentLinkedQueue<>();
        this.runtime = runtime;
    }

    private int getCurrentUsedAppJavaHeapMemoryKb() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.runtime.totalMemory() - this.runtime.freeMemory()));
    }

    public static boolean isInvalidCollectionFrequency(long j8) {
        return j8 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleMemoryMetricCollectionOnce$1(Timer timer) {
        AndroidMemoryReading androidMemoryReadingSyncCollectMemoryMetric = syncCollectMemoryMetric(timer);
        if (androidMemoryReadingSyncCollectMemoryMetric != null) {
            this.memoryMetricReadings.add(androidMemoryReadingSyncCollectMemoryMetric);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleMemoryMetricCollectionWithRate$0(Timer timer) {
        AndroidMemoryReading androidMemoryReadingSyncCollectMemoryMetric = syncCollectMemoryMetric(timer);
        if (androidMemoryReadingSyncCollectMemoryMetric != null) {
            this.memoryMetricReadings.add(androidMemoryReadingSyncCollectMemoryMetric);
        }
    }

    private synchronized void scheduleMemoryMetricCollectionOnce(Timer timer) {
        try {
            this.memoryMetricCollectorExecutor.schedule(new c(this, timer, 1), 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e4) {
            logger.warn("Unable to collect Memory Metric: " + e4.getMessage());
        }
    }

    private synchronized void scheduleMemoryMetricCollectionWithRate(long j8, Timer timer) {
        this.memoryMetricCollectionRateMs = j8;
        try {
            this.memoryMetricCollectorJob = this.memoryMetricCollectorExecutor.scheduleAtFixedRate(new c(this, timer, 0), 0L, j8, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e4) {
            logger.warn("Unable to start collecting Memory Metrics: " + e4.getMessage());
        }
    }

    private AndroidMemoryReading syncCollectMemoryMetric(Timer timer) {
        if (timer == null) {
            return null;
        }
        return AndroidMemoryReading.newBuilder().setClientTimeUs(timer.getCurrentTimestampMicros()).setUsedAppJavaHeapMemoryKb(getCurrentUsedAppJavaHeapMemoryKb()).build();
    }

    public void collectOnce(Timer timer) {
        scheduleMemoryMetricCollectionOnce(timer);
    }

    public void startCollecting(long j8, Timer timer) {
        if (isInvalidCollectionFrequency(j8)) {
            return;
        }
        if (this.memoryMetricCollectorJob == null) {
            scheduleMemoryMetricCollectionWithRate(j8, timer);
        } else if (this.memoryMetricCollectionRateMs != j8) {
            stopCollecting();
            scheduleMemoryMetricCollectionWithRate(j8, timer);
        }
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.memoryMetricCollectorJob;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.memoryMetricCollectorJob = null;
        this.memoryMetricCollectionRateMs = -1L;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public MemoryGaugeCollector() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }
}
