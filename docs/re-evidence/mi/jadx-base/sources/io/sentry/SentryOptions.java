package io.sentry;

import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import defpackage.ae8;
import defpackage.bvg;
import defpackage.c8c;
import defpackage.dul;
import defpackage.dyc;
import defpackage.ej8;
import defpackage.evg;
import defpackage.eyc;
import defpackage.flk;
import defpackage.fvg;
import defpackage.hvl;
import defpackage.iul;
import defpackage.ivg;
import defpackage.jsc;
import defpackage.jul;
import defpackage.jvg;
import defpackage.k67;
import defpackage.kvg;
import defpackage.kvl;
import defpackage.lvc;
import defpackage.r1f;
import defpackage.r67;
import defpackage.svl;
import defpackage.swp;
import defpackage.tvc;
import defpackage.uc8;
import defpackage.ucd;
import defpackage.uug;
import defpackage.xta;
import defpackage.xu6;
import defpackage.xug;
import defpackage.xxc;
import defpackage.xzc;
import defpackage.yzc;
import io.sentry.SentryOptions;
import java.io.File;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public class SentryOptions {
    static final SentryLevel DEFAULT_DIAGNOSTIC_LEVEL = SentryLevel.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";

    @ApiStatus.Internal
    @NotNull
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;

    @NotNull
    private io.sentry.backpressure.b backpressureMonitor;

    @Nullable
    private a beforeBreadcrumb;

    @Nullable
    private b beforeEmitMetricCallback;

    @Nullable
    private c beforeEnvelopeCallback;

    @Nullable
    private d beforeSend;

    @Nullable
    private e beforeSendReplay;

    @Nullable
    private f beforeSendTransaction;

    @NotNull
    private final Set<String> bundleIds;

    @Nullable
    private String cacheDirPath;

    @NotNull
    io.sentry.clientreport.g clientReportRecorder;

    @NotNull
    private IConnectionStatusProvider connectionStatusProvider;
    private int connectionTimeoutMillis;

    @NotNull
    private final List<String> contextTags;

    @ApiStatus.Experimental
    @Nullable
    private g cron;

    @ApiStatus.Internal
    @NotNull
    private final io.sentry.util.m<iul> dateProvider;
    private boolean debug;

    @NotNull
    private io.sentry.internal.debugmeta.a debugMetaLoader;

    @NotNull
    private final List<String> defaultTracePropagationTargets;

    @NotNull
    private SentryLevel diagnosticLevel;

    @Nullable
    private String dist;

    @Nullable
    private String distinctId;

    @Nullable
    private String dsn;

    @Nullable
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableDeduplication;
    private boolean enableDefaultTagsForMetrics;
    private boolean enableExternalConfiguration;
    private boolean enableMetrics;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopePersistence;

    @ApiStatus.Experimental
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpanLocalMetricAggregation;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;

    @Nullable
    private Boolean enableTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;

    @NotNull
    private io.sentry.cache.g envelopeDiskCache;

    @NotNull
    private final io.sentry.util.m<jsc> envelopeReader;

    @Nullable
    private String environment;

    @NotNull
    private final List<ae8> eventProcessors;

    @NotNull
    private dyc executorService;

    @NotNull
    private final ej8 experimental;
    private long flushTimeoutMillis;

    @NotNull
    private xta fullyDisplayedReporter;

    @NotNull
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators;

    @Nullable
    private Long idleTimeout;

    @ApiStatus.Experimental
    @Nullable
    private List<String> ignoredCheckIns;

    @NotNull
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;

    @NotNull
    private final List<String> inAppExcludes;

    @NotNull
    private final List<String> inAppIncludes;

    @NotNull
    private Instrumenter instrumenter;

    @NotNull
    private final List<ucd> integrations;

    @NotNull
    private ILogger logger;

    @NotNull
    private io.sentry.util.thread.a mainThreadChecker;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;

    @NotNull
    private RequestSize maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;

    @NotNull
    private io.sentry.internal.modules.b modulesLoader;

    @NotNull
    private final List<xxc> observers;

    @NotNull
    private final List<lvc> optionsObservers;

    @NotNull
    private final io.sentry.util.m<k67> parsedDsn;

    @NotNull
    private final List<tvc> performanceCollectors;
    private boolean printUncaughtStackTrace;

    @Nullable
    private Double profilesSampleRate;

    @Nullable
    private h profilesSampler;
    private int profilingTracesHz;

    @Nullable
    private String proguardUuid;

    @Nullable
    private i proxy;
    private int readTimeoutMillis;

    @Nullable
    private String release;

    @NotNull
    private flk replayController;

    @Nullable
    private Double sampleRate;

    @Nullable
    private io.sentry.protocol.n sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;

    @Nullable
    private String sentryClientName;

    @NotNull
    private final io.sentry.util.m<eyc> serializer;

    @Nullable
    private String serverName;
    private long sessionFlushTimeoutMillis;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;

    @Nullable
    private String spotlightConnectionUrl;

    @Nullable
    private SSLSocketFactory sslSocketFactory;

    @NotNull
    private final Map<String, String> tags;
    private boolean traceOptionsRequests;

    @Nullable
    private List<String> tracePropagationTargets;
    private boolean traceSampling;

    @Nullable
    private Double tracesSampleRate;

    @Nullable
    private j tracesSampler;

    @NotNull
    private swp transactionPerformanceCollector;

    @NotNull
    private xzc transactionProfiler;

    @NotNull
    private yzc transportFactory;

    @NotNull
    private io.sentry.transport.r transportGate;

    @NotNull
    private final List<io.sentry.internal.viewhierarchy.a> viewHierarchyExporters;

    public enum RequestSize {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    public interface a {
        @Nullable
        io.sentry.a a(@NotNull io.sentry.a aVar, @NotNull c8c c8cVar);
    }

    @ApiStatus.Experimental
    public interface b {
    }

    @ApiStatus.Internal
    public interface c {
        void a(@NotNull jul julVar, @Nullable c8c c8cVar);
    }

    public interface d {
        @Nullable
        s a(@NotNull s sVar, @NotNull c8c c8cVar);
    }

    public interface e {
    }

    public interface f {
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Long f21348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Long f21349b;

        @Nullable
        public String c;

        @Nullable
        public Long d;

        @Nullable
        public Long e;

        @Nullable
        public Long a() {
            return this.f21348a;
        }

        @Nullable
        public Long b() {
            return this.d;
        }

        @Nullable
        public Long c() {
            return this.f21349b;
        }

        @Nullable
        public Long d() {
            return this.e;
        }

        @Nullable
        public String e() {
            return this.c;
        }

        public void f(@Nullable Long l) {
            this.f21348a = l;
        }

        public void g(@Nullable Long l) {
            this.d = l;
        }

        public void h(@Nullable Long l) {
            this.f21349b = l;
        }

        public void i(@Nullable Long l) {
            this.e = l;
        }

        public void j(@Nullable String str) {
            this.c = str;
        }
    }

    public interface h {
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f21350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f21351b;

        @Nullable
        public String c;

        @Nullable
        public String d;

        @Nullable
        public Proxy.Type e;

        public i(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this(str, str2, null, str3, str4);
        }

        @Nullable
        public String a() {
            return this.f21350a;
        }

        @Nullable
        public String b() {
            return this.d;
        }

        @Nullable
        public String c() {
            return this.f21351b;
        }

        @Nullable
        public Proxy.Type d() {
            return this.e;
        }

        @Nullable
        public String e() {
            return this.c;
        }

        public i(@Nullable String str, @Nullable String str2, @Nullable Proxy.Type type, @Nullable String str3, @Nullable String str4) {
            this.f21350a = str;
            this.f21351b = str2;
            this.e = type;
            this.c = str3;
            this.d = str4;
        }
    }

    public interface j {
    }

    public SentryOptions() {
        this(false);
    }

    private void addPackageInfo() {
        kvl.c().b("maven:io.sentry:sentry", "7.18.0");
    }

    @NotNull
    private io.sentry.protocol.n createSdkVersion() {
        io.sentry.protocol.n nVar = new io.sentry.protocol.n("sentry.java", "7.18.0");
        nVar.j("7.18.0");
        return nVar;
    }

    @ApiStatus.Internal
    @NotNull
    public static SentryOptions empty() {
        return new SentryOptions(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ k67 lambda$new$0() {
        return new k67(this.dsn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ eyc lambda$new$1() {
        return new io.sentry.f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jsc lambda$new$2() {
        return new uc8(this.serializer.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ iul lambda$new$3() {
        return new dul();
    }

    public void addBundleId(@Nullable String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(@NotNull String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(@NotNull ae8 ae8Var) {
        this.eventProcessors.add(ae8Var);
    }

    public void addIgnoredExceptionForType(@NotNull Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addInAppExclude(@NotNull String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(@NotNull String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(@NotNull ucd ucdVar) {
        this.integrations.add(ucdVar);
    }

    public void addOptionsObserver(@NotNull lvc lvcVar) {
        this.optionsObservers.add(lvcVar);
    }

    @ApiStatus.Internal
    public void addPerformanceCollector(@NotNull tvc tvcVar) {
        this.performanceCollectors.add(tvcVar);
    }

    public void addScopeObserver(@NotNull xxc xxcVar) {
        this.observers.add(xxcVar);
    }

    @Deprecated
    public void addTracingOrigin(@NotNull String str) {
        if (this.tracePropagationTargets == null) {
            this.tracePropagationTargets = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.tracePropagationTargets.add(str);
    }

    public boolean containsIgnoredExceptionForType(@NotNull Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    @ApiStatus.Internal
    @NotNull
    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    @Nullable
    public a getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    @ApiStatus.Experimental
    @Nullable
    public b getBeforeEmitMetricCallback() {
        return null;
    }

    @ApiStatus.Internal
    @Nullable
    public c getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    @Nullable
    public d getBeforeSend() {
        return this.beforeSend;
    }

    @Nullable
    public e getBeforeSendReplay() {
        return null;
    }

    @Nullable
    public f getBeforeSendTransaction() {
        return null;
    }

    @NotNull
    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    @Nullable
    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    @Nullable
    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    @ApiStatus.Internal
    @NotNull
    public io.sentry.clientreport.g getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    @NotNull
    public IConnectionStatusProvider getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    @NotNull
    public List<String> getContextTags() {
        return this.contextTags;
    }

    @Nullable
    public g getCron() {
        return this.cron;
    }

    @ApiStatus.Internal
    @NotNull
    public iul getDateProvider() {
        return this.dateProvider.a();
    }

    @ApiStatus.Internal
    @NotNull
    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    @NotNull
    public SentryLevel getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    @Nullable
    public String getDist() {
        return this.dist;
    }

    @ApiStatus.Internal
    @Nullable
    public String getDistinctId() {
        return this.distinctId;
    }

    @Nullable
    public String getDsn() {
        return this.dsn;
    }

    @Deprecated
    @Nullable
    public Boolean getEnableTracing() {
        return this.enableTracing;
    }

    @NotNull
    public io.sentry.cache.g getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    @NotNull
    public jsc getEnvelopeReader() {
        return this.envelopeReader.a();
    }

    @Nullable
    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    @NotNull
    public List<ae8> getEventProcessors() {
        return this.eventProcessors;
    }

    @ApiStatus.Internal
    @NotNull
    public dyc getExecutorService() {
        return this.executorService;
    }

    @NotNull
    public ej8 getExperimental() {
        return this.experimental;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    @ApiStatus.Internal
    @NotNull
    public xta getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    @Nullable
    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    @ApiStatus.Experimental
    @Nullable
    public List<String> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    @NotNull
    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    @NotNull
    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    @NotNull
    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    @NotNull
    public Instrumenter getInstrumenter() {
        return this.instrumenter;
    }

    @NotNull
    public List<ucd> getIntegrations() {
        return this.integrations;
    }

    @NotNull
    public ILogger getLogger() {
        return this.logger;
    }

    @NotNull
    public io.sentry.util.thread.a getMainThreadChecker() {
        return this.mainThreadChecker;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    @NotNull
    public RequestSize getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    @ApiStatus.Experimental
    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    @ApiStatus.Internal
    @NotNull
    public io.sentry.internal.modules.b getModulesLoader() {
        return this.modulesLoader;
    }

    @NotNull
    public List<lvc> getOptionsObservers() {
        return this.optionsObservers;
    }

    @Nullable
    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    @ApiStatus.Internal
    @NotNull
    public List<tvc> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    @Nullable
    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    @Nullable
    public h getProfilesSampler() {
        return null;
    }

    @Nullable
    public String getProfilingTracesDirPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    @ApiStatus.Internal
    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    @Nullable
    public String getProguardUuid() {
        return this.proguardUuid;
    }

    @Nullable
    public i getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Nullable
    public String getRelease() {
        return this.release;
    }

    @NotNull
    public flk getReplayController() {
        return this.replayController;
    }

    @Nullable
    public Double getSampleRate() {
        return this.sampleRate;
    }

    @NotNull
    public List<xxc> getScopeObservers() {
        return this.observers;
    }

    @Nullable
    public io.sentry.protocol.n getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public String getSentryClientName() {
        return this.sentryClientName;
    }

    @NotNull
    public eyc getSerializer() {
        return this.serializer.a();
    }

    @Nullable
    public String getServerName() {
        return this.serverName;
    }

    @ApiStatus.Internal
    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    @ApiStatus.ScheduledForRemoval
    @Deprecated
    public long getShutdownTimeout() {
        return this.shutdownTimeoutMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    @ApiStatus.Experimental
    @Nullable
    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @NotNull
    public Map<String, String> getTags() {
        return this.tags;
    }

    @NotNull
    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    @Nullable
    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    @Nullable
    public j getTracesSampler() {
        return null;
    }

    @Deprecated
    @NotNull
    public List<String> getTracingOrigins() {
        return getTracePropagationTargets();
    }

    @ApiStatus.Internal
    @NotNull
    public swp getTransactionPerformanceCollector() {
        return this.transactionPerformanceCollector;
    }

    @NotNull
    public xzc getTransactionProfiler() {
        return this.transactionProfiler;
    }

    @NotNull
    public yzc getTransportFactory() {
        return this.transportFactory;
    }

    @NotNull
    public io.sentry.transport.r getTransportGate() {
        return this.transportGate;
    }

    @NotNull
    public final List<io.sentry.internal.viewhierarchy.a> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return isProfilingEnabled() && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    @ApiStatus.Experimental
    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    @ApiStatus.Experimental
    public boolean isEnableDefaultTagsForMetrics() {
        return isEnableMetrics() && this.enableDefaultTagsForMetrics;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    @ApiStatus.Experimental
    public boolean isEnableMetrics() {
        return this.enableMetrics;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    @ApiStatus.Experimental
    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    @ApiStatus.Experimental
    public boolean isEnableSpanLocalMetricAggregation() {
        return isEnableMetrics() && this.enableSpanLocalMetricAggregation;
    }

    @ApiStatus.Experimental
    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        if (getProfilesSampleRate() != null && getProfilesSampleRate().doubleValue() > 0.0d) {
            return true;
        }
        getProfilesSampler();
        return false;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    @ApiStatus.Experimental
    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        Boolean bool = this.enableTracing;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(@NotNull io.sentry.c cVar) {
        if (cVar.m() != null) {
            setDsn(cVar.m());
        }
        if (cVar.q() != null) {
            setEnvironment(cVar.q());
        }
        if (cVar.A() != null) {
            setRelease(cVar.A());
        }
        if (cVar.l() != null) {
            setDist(cVar.l());
        }
        if (cVar.C() != null) {
            setServerName(cVar.C());
        }
        if (cVar.z() != null) {
            setProxy(cVar.z());
        }
        if (cVar.p() != null) {
            setEnableUncaughtExceptionHandler(cVar.p().booleanValue());
        }
        if (cVar.w() != null) {
            setPrintUncaughtStackTrace(cVar.w().booleanValue());
        }
        if (cVar.o() != null) {
            setEnableTracing(cVar.o());
        }
        if (cVar.F() != null) {
            setTracesSampleRate(cVar.F());
        }
        if (cVar.x() != null) {
            setProfilesSampleRate(cVar.x());
        }
        if (cVar.k() != null) {
            setDebug(cVar.k().booleanValue());
        }
        if (cVar.n() != null) {
            setEnableDeduplication(cVar.n().booleanValue());
        }
        if (cVar.B() != null) {
            setSendClientReports(cVar.B().booleanValue());
        }
        for (Map.Entry entry : new HashMap(cVar.D()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(cVar.v()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(cVar.u()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(cVar.t()).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (cVar.E() != null) {
            setTracePropagationTargets(new ArrayList(cVar.E()));
        }
        Iterator it4 = new ArrayList(cVar.i()).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        if (cVar.y() != null) {
            setProguardUuid(cVar.y());
        }
        if (cVar.r() != null) {
            setIdleTimeout(cVar.r());
        }
        Iterator<String> it5 = cVar.h().iterator();
        while (it5.hasNext()) {
            addBundleId(it5.next());
        }
        if (cVar.I() != null) {
            setEnabled(cVar.I().booleanValue());
        }
        if (cVar.H() != null) {
            setEnablePrettySerializationOutput(cVar.H().booleanValue());
        }
        if (cVar.J() != null) {
            setSendModules(cVar.J().booleanValue());
        }
        if (cVar.s() != null) {
            setIgnoredCheckIns(new ArrayList(cVar.s()));
        }
        if (cVar.G() != null) {
            setEnableBackpressureHandling(cVar.G().booleanValue());
        }
        if (cVar.j() != null) {
            if (getCron() == null) {
                setCron(cVar.j());
                return;
            }
            if (cVar.j().a() != null) {
                getCron().f(cVar.j().a());
            }
            if (cVar.j().c() != null) {
                getCron().h(cVar.j().c());
            }
            if (cVar.j().e() != null) {
                getCron().j(cVar.j().e());
            }
            if (cVar.j().b() != null) {
                getCron().g(cVar.j().b());
            }
            if (cVar.j().d() != null) {
                getCron().i(cVar.j().d());
            }
        }
    }

    @ApiStatus.Internal
    @NotNull
    public k67 retrieveParsedDsn() throws IllegalArgumentException {
        return this.parsedDsn.a();
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    @ApiStatus.Internal
    public void setBackpressureMonitor(@NotNull io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(@Nullable a aVar) {
        this.beforeBreadcrumb = aVar;
    }

    @ApiStatus.Experimental
    public void setBeforeEmitMetricCallback(@Nullable b bVar) {
    }

    @ApiStatus.Internal
    public void setBeforeEnvelopeCallback(@Nullable c cVar) {
        this.beforeEnvelopeCallback = cVar;
    }

    public void setBeforeSend(@Nullable d dVar) {
        this.beforeSend = dVar;
    }

    public void setBeforeSendReplay(@Nullable e eVar) {
    }

    public void setBeforeSendTransaction(@Nullable f fVar) {
    }

    public void setCacheDirPath(@Nullable String str) {
        this.cacheDirPath = str;
    }

    public void setConnectionStatusProvider(@NotNull IConnectionStatusProvider iConnectionStatusProvider) {
        this.connectionStatusProvider = iConnectionStatusProvider;
    }

    public void setConnectionTimeoutMillis(int i2) {
        this.connectionTimeoutMillis = i2;
    }

    @ApiStatus.Experimental
    public void setCron(@Nullable g gVar) {
        this.cron = gVar;
    }

    @ApiStatus.Internal
    public void setDateProvider(@NotNull iul iulVar) {
        this.dateProvider.c(iulVar);
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    @ApiStatus.Internal
    public void setDebugMetaLoader(@Nullable io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.b();
        }
        this.debugMetaLoader = aVar;
    }

    public void setDiagnosticLevel(@Nullable SentryLevel sentryLevel) {
        if (sentryLevel == null) {
            sentryLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = sentryLevel;
    }

    public void setDist(@Nullable String str) {
        this.dist = str;
    }

    @ApiStatus.Internal
    public void setDistinctId(@Nullable String str) {
        this.distinctId = str;
    }

    public void setDsn(@Nullable String str) {
        this.dsn = str;
        this.parsedDsn.b();
        this.dsnHash = io.sentry.util.u.a(this.dsn, this.logger);
    }

    public void setEnableAppStartProfiling(boolean z) {
        this.enableAppStartProfiling = z;
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this.enableAutoSessionTracking = z;
    }

    @ApiStatus.Experimental
    public void setEnableBackpressureHandling(boolean z) {
        this.enableBackpressureHandling = z;
    }

    public void setEnableDeduplication(boolean z) {
        this.enableDeduplication = z;
    }

    @ApiStatus.Experimental
    public void setEnableDefaultTagsForMetrics(boolean z) {
        this.enableDefaultTagsForMetrics = z;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    @ApiStatus.Experimental
    public void setEnableMetrics(boolean z) {
        this.enableMetrics = z;
    }

    public void setEnablePrettySerializationOutput(boolean z) {
        this.enablePrettySerializationOutput = z;
    }

    public void setEnableScopePersistence(boolean z) {
        this.enableScopePersistence = z;
    }

    @ApiStatus.Experimental
    public void setEnableScreenTracking(boolean z) {
        this.enableScreenTracking = z;
    }

    public void setEnableShutdownHook(boolean z) {
        this.enableShutdownHook = z;
    }

    @ApiStatus.Experimental
    public void setEnableSpanLocalMetricAggregation(boolean z) {
        this.enableSpanLocalMetricAggregation = z;
    }

    @ApiStatus.Experimental
    public void setEnableSpotlight(boolean z) {
        this.enableSpotlight = z;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z) {
        this.enableTimeToFullDisplayTracing = z;
    }

    @Deprecated
    public void setEnableTracing(@Nullable Boolean bool) {
        this.enableTracing = bool;
    }

    public void setEnableUncaughtExceptionHandler(boolean z) {
        this.enableUncaughtExceptionHandler = z;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z) {
        this.enableUserInteractionBreadcrumbs = z;
    }

    public void setEnableUserInteractionTracing(boolean z) {
        this.enableUserInteractionTracing = z;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setEnvelopeDiskCache(@Nullable io.sentry.cache.g gVar) {
        if (gVar == null) {
            gVar = io.sentry.transport.s.e();
        }
        this.envelopeDiskCache = gVar;
    }

    public void setEnvelopeReader(@Nullable jsc jscVar) {
        io.sentry.util.m<jsc> mVar = this.envelopeReader;
        if (jscVar == null) {
            jscVar = uug.b();
        }
        mVar.c(jscVar);
    }

    public void setEnvironment(@Nullable String str) {
        this.environment = str;
    }

    @TestOnly
    @ApiStatus.Internal
    public void setExecutorService(@NotNull dyc dycVar) {
        if (dycVar != null) {
            this.executorService = dycVar;
        }
    }

    public void setFlushTimeoutMillis(long j2) {
        this.flushTimeoutMillis = j2;
    }

    @TestOnly
    @ApiStatus.Internal
    public void setFullyDisplayedReporter(@NotNull xta xtaVar) {
        this.fullyDisplayedReporter = xtaVar;
    }

    public void setGestureTargetLocators(@NotNull List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setIdleTimeout(@Nullable Long l) {
        this.idleTimeout = l;
    }

    @ApiStatus.Experimental
    public void setIgnoredCheckIns(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setInstrumenter(@NotNull Instrumenter instrumenter) {
        this.instrumenter = instrumenter;
    }

    public void setLogger(@Nullable ILogger iLogger) {
        this.logger = iLogger == null ? xug.e() : new xu6(this, iLogger);
    }

    public void setMainThreadChecker(@NotNull io.sentry.util.thread.a aVar) {
        this.mainThreadChecker = aVar;
    }

    public void setMaxAttachmentSize(long j2) {
        this.maxAttachmentSize = j2;
    }

    public void setMaxBreadcrumbs(int i2) {
        this.maxBreadcrumbs = i2;
    }

    public void setMaxCacheItems(int i2) {
        this.maxCacheItems = i2;
    }

    public void setMaxDepth(int i2) {
        this.maxDepth = i2;
    }

    public void setMaxQueueSize(int i2) {
        if (i2 > 0) {
            this.maxQueueSize = i2;
        }
    }

    public void setMaxRequestBodySize(@NotNull RequestSize requestSize) {
        this.maxRequestBodySize = requestSize;
    }

    @ApiStatus.Experimental
    public void setMaxSpans(int i2) {
        this.maxSpans = i2;
    }

    public void setMaxTraceFileSize(long j2) {
        this.maxTraceFileSize = j2;
    }

    @ApiStatus.Internal
    public void setModulesLoader(@Nullable io.sentry.internal.modules.b bVar) {
        if (bVar == null) {
            bVar = io.sentry.internal.modules.e.b();
        }
        this.modulesLoader = bVar;
    }

    public void setPrintUncaughtStackTrace(boolean z) {
        this.printUncaughtStackTrace = z;
    }

    public void setProfilesSampleRate(@Nullable Double d2) {
        if (io.sentry.util.s.a(d2)) {
            this.profilesSampleRate = d2;
            return;
        }
        throw new IllegalArgumentException("The value " + d2 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(@Nullable h hVar) {
    }

    @Deprecated
    public void setProfilingEnabled(boolean z) {
        if (getProfilesSampleRate() == null) {
            setProfilesSampleRate(z ? Double.valueOf(1.0d) : null);
        }
    }

    @ApiStatus.Internal
    public void setProfilingTracesHz(int i2) {
        this.profilingTracesHz = i2;
    }

    public void setProguardUuid(@Nullable String str) {
        this.proguardUuid = str;
    }

    public void setProxy(@Nullable i iVar) {
        this.proxy = iVar;
    }

    public void setReadTimeoutMillis(int i2) {
        this.readTimeoutMillis = i2;
    }

    public void setRelease(@Nullable String str) {
        this.release = str;
    }

    public void setReplayController(@Nullable flk flkVar) {
        if (flkVar == null) {
            flkVar = bvg.a();
        }
        this.replayController = flkVar;
    }

    public void setSampleRate(Double d2) {
        if (io.sentry.util.s.c(d2)) {
            this.sampleRate = d2;
            return;
        }
        throw new IllegalArgumentException("The value " + d2 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    @ApiStatus.Internal
    public void setSdkVersion(@Nullable io.sentry.protocol.n nVar) {
        this.sdkVersion = nVar;
    }

    public void setSendClientReports(boolean z) {
        this.sendClientReports = z;
        if (z) {
            this.clientReportRecorder = new io.sentry.clientreport.e(this);
        } else {
            this.clientReportRecorder = new io.sentry.clientreport.i();
        }
    }

    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void setSendModules(boolean z) {
        this.sendModules = z;
    }

    public void setSentryClientName(@Nullable String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(@Nullable eyc eycVar) {
        io.sentry.util.m<eyc> mVar = this.serializer;
        if (eycVar == null) {
            eycVar = fvg.g();
        }
        mVar.c(eycVar);
    }

    public void setServerName(@Nullable String str) {
        this.serverName = str;
    }

    @ApiStatus.Internal
    public void setSessionFlushTimeoutMillis(long j2) {
        this.sessionFlushTimeoutMillis = j2;
    }

    public void setSessionTrackingIntervalMillis(long j2) {
        this.sessionTrackingIntervalMillis = j2;
    }

    @ApiStatus.ScheduledForRemoval
    @Deprecated
    public void setShutdownTimeout(long j2) {
        this.shutdownTimeoutMillis = j2;
    }

    public void setShutdownTimeoutMillis(long j2) {
        this.shutdownTimeoutMillis = j2;
    }

    @ApiStatus.Experimental
    public void setSpotlightConnectionUrl(@Nullable String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(@Nullable SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(@NotNull String str, @NotNull String str2) {
        this.tags.put(str, str2);
    }

    public void setTraceOptionsRequests(boolean z) {
        this.traceOptionsRequests = z;
    }

    @ApiStatus.Internal
    public void setTracePropagationTargets(@Nullable List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z) {
        this.traceSampling = z;
    }

    public void setTracesSampleRate(@Nullable Double d2) {
        if (io.sentry.util.s.d(d2)) {
            this.tracesSampleRate = d2;
            return;
        }
        throw new IllegalArgumentException("The value " + d2 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(@Nullable j jVar) {
    }

    @ApiStatus.Internal
    @Deprecated
    public void setTracingOrigins(@Nullable List<String> list) {
        setTracePropagationTargets(list);
    }

    @ApiStatus.Internal
    public void setTransactionPerformanceCollector(@NotNull swp swpVar) {
        this.transactionPerformanceCollector = swpVar;
    }

    public void setTransactionProfiler(@Nullable xzc xzcVar) {
        if (this.transactionProfiler != jvg.c() || xzcVar == null) {
            return;
        }
        this.transactionProfiler = xzcVar;
    }

    public void setTransportFactory(@Nullable yzc yzcVar) {
        if (yzcVar == null) {
            yzcVar = kvg.b();
        }
        this.transportFactory = yzcVar;
    }

    public void setTransportGate(@Nullable io.sentry.transport.r rVar) {
        if (rVar == null) {
            rVar = io.sentry.transport.u.a();
        }
        this.transportGate = rVar;
    }

    public void setViewHierarchyExporters(@NotNull List<io.sentry.internal.viewhierarchy.a> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    private SentryOptions(boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        this.parsedDsn = new io.sentry.util.m<>(new io.sentry.util.m.a() { // from class: ovl
            @Override // io.sentry.util.m.a
            public final Object a() {
                return this.f29739a.lambda$new$0();
            }
        });
        this.shutdownTimeoutMillis = VibrateModeProgressBar.sLongToLong;
        this.flushTimeoutMillis = 15000L;
        this.sessionFlushTimeoutMillis = 15000L;
        this.logger = xug.e();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.serializer = new io.sentry.util.m<>(new io.sentry.util.m.a() { // from class: pvl
            @Override // io.sentry.util.m.a
            public final Object a() {
                return this.f30831a.lambda$new$1();
            }
        });
        this.envelopeReader = new io.sentry.util.m<>(new io.sentry.util.m.a() { // from class: qvl
            @Override // io.sentry.util.m.a
            public final Object a() {
                return this.f31890a.lambda$new$2();
            }
        });
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = kvg.b();
        this.transportGate = io.sentry.transport.u.a();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = evg.e();
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = io.sentry.transport.s.e();
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = RequestSize.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = jvg.c();
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new io.sentry.clientreport.e(this);
        this.modulesLoader = io.sentry.internal.modules.e.b();
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.b();
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = Instrumenter.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.mainThreadChecker = io.sentry.util.thread.c.b();
        this.traceOptionsRequests = true;
        this.dateProvider = new io.sentry.util.m<>(new io.sentry.util.m.a() { // from class: rvl
            @Override // io.sentry.util.m.a
            public final Object a() {
                return SentryOptions.lambda$new$3();
            }
        });
        this.performanceCollectors = new ArrayList();
        this.transactionPerformanceCollector = ivg.e();
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = xta.a();
        this.connectionStatusProvider = new io.sentry.h();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.backpressureMonitor = io.sentry.backpressure.c.b();
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.enableMetrics = false;
        this.enableDefaultTagsForMetrics = true;
        this.enableSpanLocalMetricAggregation = true;
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = bvg.a();
        this.enableScreenTracking = true;
        this.experimental = new ej8(z);
        if (z) {
            return;
        }
        this.executorService = new hvl();
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList2.add(new SpotlightIntegration());
        copyOnWriteArrayList.add(new r1f(this));
        copyOnWriteArrayList.add(new r67(this));
        if (io.sentry.util.r.c()) {
            copyOnWriteArrayList.add(new svl());
        }
        setSentryClientName("sentry.java/7.18.0");
        setSdkVersion(createSdkVersion());
        addPackageInfo();
    }
}
