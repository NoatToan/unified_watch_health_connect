package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.CpuMetricReading;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
public class CpuGaugeCollector {
    private static final int CSTIME_POSITION_IN_PROC_PID_STAT = 16;
    private static final int CUTIME_POSITION_IN_PROC_PID_STAT = 15;
    public static final long INVALID_CPU_COLLECTION_FREQUENCY = -1;
    private static final int INVALID_SC_PER_CPU_CLOCK_TICK = -1;
    private static final int STIME_POSITION_IN_PROC_PID_STAT = 14;
    private static final int UNSET_CPU_METRIC_COLLECTION_RATE = -1;
    private static final int UTIME_POSITION_IN_PROC_PID_STAT = 13;
    private final long clockTicksPerSecond;
    private long cpuMetricCollectionRateMs;
    private final ScheduledExecutorService cpuMetricCollectorExecutor;
    private ScheduledFuture cpuMetricCollectorJob;
    public final ConcurrentLinkedQueue<CpuMetricReading> cpuMetricReadings;
    private final String procFileName;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private static final long MICROSECONDS_PER_SECOND = 1000000;

    @SuppressLint({"ThreadPoolCreation"})
    public CpuGaugeCollector() {
        this.cpuMetricCollectorJob = null;
        this.cpuMetricCollectionRateMs = -1L;
        this.cpuMetricReadings = new ConcurrentLinkedQueue<>();
        this.cpuMetricCollectorExecutor = Executors.newSingleThreadScheduledExecutor();
        this.procFileName = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
        this.clockTicksPerSecond = getClockTicksPerSecond();
    }

    private long convertClockTicksToMicroseconds(long j8) {
        return Math.round((j8 / this.clockTicksPerSecond) * MICROSECONDS_PER_SECOND);
    }

    private long getClockTicksPerSecond() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static boolean isInvalidCollectionFrequency(long j8) {
        return j8 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleCpuMetricCollectionOnce$1(Timer timer) {
        CpuMetricReading cpuMetricReadingSyncCollectCpuMetric = syncCollectCpuMetric(timer);
        if (cpuMetricReadingSyncCollectCpuMetric != null) {
            this.cpuMetricReadings.add(cpuMetricReadingSyncCollectCpuMetric);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleCpuMetricCollectionWithRate$0(Timer timer) {
        CpuMetricReading cpuMetricReadingSyncCollectCpuMetric = syncCollectCpuMetric(timer);
        if (cpuMetricReadingSyncCollectCpuMetric != null) {
            this.cpuMetricReadings.add(cpuMetricReadingSyncCollectCpuMetric);
        }
    }

    private synchronized void scheduleCpuMetricCollectionOnce(Timer timer) {
        try {
            this.cpuMetricCollectorExecutor.schedule(new a(this, timer, 1), 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e4) {
            logger.warn("Unable to collect Cpu Metric: " + e4.getMessage());
        }
    }

    private synchronized void scheduleCpuMetricCollectionWithRate(long j8, Timer timer) {
        this.cpuMetricCollectionRateMs = j8;
        try {
            this.cpuMetricCollectorJob = this.cpuMetricCollectorExecutor.scheduleAtFixedRate(new a(this, timer, 0), 0L, j8, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e4) {
            logger.warn("Unable to start collecting Cpu Metrics: " + e4.getMessage());
        }
    }

    private CpuMetricReading syncCollectCpuMetric(Timer timer) {
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.procFileName));
            try {
                long currentTimestampMicros = timer.getCurrentTimestampMicros();
                String[] strArrSplit = bufferedReader.readLine().split(StringUtils.SPACE);
                CpuMetricReading cpuMetricReadingBuild = CpuMetricReading.newBuilder().setClientTimeUs(currentTimestampMicros).setSystemTimeUs(convertClockTicksToMicroseconds(Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[16]))).setUserTimeUs(convertClockTicksToMicroseconds(Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[15]))).build();
                bufferedReader.close();
                return cpuMetricReadingBuild;
            } catch (Throwable th3) {
                try {
                    bufferedReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e4) {
            logger.warn("Unable to read 'proc/[pid]/stat' file: " + e4.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e14) {
            e = e14;
            logger.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e15) {
            e = e15;
            logger.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e16) {
            e = e16;
            logger.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    public void collectOnce(Timer timer) {
        scheduleCpuMetricCollectionOnce(timer);
    }

    public void startCollecting(long j8, Timer timer) {
        long j14 = this.clockTicksPerSecond;
        if (j14 == -1 || j14 == 0 || isInvalidCollectionFrequency(j8)) {
            return;
        }
        if (this.cpuMetricCollectorJob == null) {
            scheduleCpuMetricCollectionWithRate(j8, timer);
        } else if (this.cpuMetricCollectionRateMs != j8) {
            stopCollecting();
            scheduleCpuMetricCollectionWithRate(j8, timer);
        }
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.cpuMetricCollectorJob;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.cpuMetricCollectorJob = null;
        this.cpuMetricCollectionRateMs = -1L;
    }

    public CpuGaugeCollector(ScheduledExecutorService scheduledExecutorService, String str, long j8) {
        this.cpuMetricCollectorJob = null;
        this.cpuMetricCollectionRateMs = -1L;
        this.cpuMetricReadings = new ConcurrentLinkedQueue<>();
        this.cpuMetricCollectorExecutor = scheduledExecutorService;
        this.procFileName = str;
        this.clockTicksPerSecond = j8;
    }
}
