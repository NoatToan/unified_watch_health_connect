package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.g;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.firebase.perf.v1.GaugeMetric;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private ApplicationProcessState applicationProcessState;
    private final ConfigResolver configResolver;
    private final Lazy<CpuGaugeCollector> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final Lazy<ScheduledExecutorService> gaugeManagerExecutor;
    private GaugeMetadataManager gaugeMetadataManager;
    private final Lazy<MemoryGaugeCollector> memoryGaugeCollector;
    private String sessionId;
    private final TransportManager transportManager;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private static final GaugeManager instance = new GaugeManager();

    /* JADX INFO: renamed from: com.google.firebase.perf.session.gauges.GaugeManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$perf$v1$ApplicationProcessState;

        static {
            int[] iArr = new int[ApplicationProcessState.values().length];
            $SwitchMap$com$google$firebase$perf$v1$ApplicationProcessState = iArr;
            try {
                iArr[ApplicationProcessState.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$perf$v1$ApplicationProcessState[ApplicationProcessState.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new Lazy((Provider) new g(6)), TransportManager.getInstance(), ConfigResolver.getInstance(), null, new Lazy((Provider) new g(7)), new Lazy((Provider) new g(8)));
    }

    private long getCpuGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
        long sessionsCpuCaptureFrequencyBackgroundMs;
        int i14 = AnonymousClass1.$SwitchMap$com$google$firebase$perf$v1$ApplicationProcessState[applicationProcessState.ordinal()];
        if (i14 != 1) {
            sessionsCpuCaptureFrequencyBackgroundMs = i14 != 2 ? -1L : this.configResolver.getSessionsCpuCaptureFrequencyForegroundMs();
        } else {
            sessionsCpuCaptureFrequencyBackgroundMs = this.configResolver.getSessionsCpuCaptureFrequencyBackgroundMs();
        }
        if (CpuGaugeCollector.isInvalidCollectionFrequency(sessionsCpuCaptureFrequencyBackgroundMs)) {
            return -1L;
        }
        return sessionsCpuCaptureFrequencyBackgroundMs;
    }

    private GaugeMetadata getGaugeMetadata() {
        return GaugeMetadata.newBuilder().setDeviceRamSizeKb(this.gaugeMetadataManager.getDeviceRamSizeKb()).setMaxAppJavaHeapMemoryKb(this.gaugeMetadataManager.getMaxAppJavaHeapMemoryKb()).setMaxEncouragedAppJavaHeapMemoryKb(this.gaugeMetadataManager.getMaxEncouragedAppJavaHeapMemoryKb()).build();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
        long sessionsMemoryCaptureFrequencyBackgroundMs;
        int i14 = AnonymousClass1.$SwitchMap$com$google$firebase$perf$v1$ApplicationProcessState[applicationProcessState.ordinal()];
        if (i14 != 1) {
            sessionsMemoryCaptureFrequencyBackgroundMs = i14 != 2 ? -1L : this.configResolver.getSessionsMemoryCaptureFrequencyForegroundMs();
        } else {
            sessionsMemoryCaptureFrequencyBackgroundMs = this.configResolver.getSessionsMemoryCaptureFrequencyBackgroundMs();
        }
        if (MemoryGaugeCollector.isInvalidCollectionFrequency(sessionsMemoryCaptureFrequencyBackgroundMs)) {
            return -1L;
        }
        return sessionsMemoryCaptureFrequencyBackgroundMs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CpuGaugeCollector lambda$new$0() {
        return new CpuGaugeCollector();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MemoryGaugeCollector lambda$new$1() {
        return new MemoryGaugeCollector();
    }

    private boolean startCollectingCpuMetrics(long j8, Timer timer) {
        if (j8 == -1) {
            logger.debug("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        this.cpuGaugeCollector.get().startCollecting(j8, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j8, Timer timer) {
        if (j8 == -1) {
            logger.debug("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        this.memoryGaugeCollector.get().startCollecting(j8, timer);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, ApplicationProcessState applicationProcessState) {
        GaugeMetric.Builder builderNewBuilder = GaugeMetric.newBuilder();
        while (!this.cpuGaugeCollector.get().cpuMetricReadings.isEmpty()) {
            builderNewBuilder.addCpuMetricReadings(this.cpuGaugeCollector.get().cpuMetricReadings.poll());
        }
        while (!this.memoryGaugeCollector.get().memoryMetricReadings.isEmpty()) {
            builderNewBuilder.addAndroidMemoryReadings(this.memoryGaugeCollector.get().memoryMetricReadings.poll());
        }
        builderNewBuilder.setSessionId(str);
        this.transportManager.log(builderNewBuilder.build(), applicationProcessState);
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), timer);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new GaugeMetadataManager(context);
    }

    public boolean logGaugeMetadata(String str, ApplicationProcessState applicationProcessState) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        this.transportManager.log(GaugeMetric.newBuilder().setSessionId(str).setGaugeMetadata(getGaugeMetadata()).build(), applicationProcessState);
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, ApplicationProcessState applicationProcessState) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(applicationProcessState, perfSession.getTimer());
        if (jStartCollectingGauges == -1) {
            logger.warn("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String strSessionId = perfSession.sessionId();
        this.sessionId = strSessionId;
        this.applicationProcessState = applicationProcessState;
        try {
            long j8 = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new b(this, strSessionId, applicationProcessState, 1), j8, j8, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e4) {
            logger.warn("Unable to start collecting Gauges: " + e4.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        ApplicationProcessState applicationProcessState = this.applicationProcessState;
        this.cpuGaugeCollector.get().stopCollecting();
        this.memoryGaugeCollector.get().stopCollecting();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new b(this, str, applicationProcessState, 0), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private static void collectGaugeMetricOnce(CpuGaugeCollector cpuGaugeCollector, MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        cpuGaugeCollector.collectOnce(timer);
        memoryGaugeCollector.collectOnce(timer);
    }

    public GaugeManager(Lazy<ScheduledExecutorService> lazy, TransportManager transportManager, ConfigResolver configResolver, GaugeMetadataManager gaugeMetadataManager, Lazy<CpuGaugeCollector> lazy2, Lazy<MemoryGaugeCollector> lazy3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = lazy;
        this.transportManager = transportManager;
        this.configResolver = configResolver;
        this.gaugeMetadataManager = gaugeMetadataManager;
        this.cpuGaugeCollector = lazy2;
        this.memoryGaugeCollector = lazy3;
    }

    private long startCollectingGauges(ApplicationProcessState applicationProcessState, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(applicationProcessState);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(applicationProcessState);
        if (startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer)) {
            return cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
        }
        return cpuGaugeCollectionFrequencyMs;
    }
}
