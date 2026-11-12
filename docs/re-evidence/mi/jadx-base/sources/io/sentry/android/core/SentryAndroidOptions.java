package io.sentry.android.core;

import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import io.sentry.SentryOptions;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class SentryAndroidOptions extends SentryOptions {
    private boolean attachScreenshot;
    private boolean attachViewHierarchy;

    @Nullable
    private a beforeScreenshotCaptureCallback;

    @Nullable
    private a beforeViewHierarchyCaptureCallback;

    @Nullable
    private io.sentry.android.core.internal.util.t frameMetricsCollector;
    private boolean anrEnabled = true;
    private long anrTimeoutIntervalMillis = 5000;
    private boolean anrReportInDebug = false;
    private boolean enableActivityLifecycleBreadcrumbs = true;
    private boolean enableAppLifecycleBreadcrumbs = true;
    private boolean enableSystemEventBreadcrumbs = true;
    private boolean enableAppComponentBreadcrumbs = true;
    private boolean enableNetworkEventBreadcrumbs = true;
    private boolean enableAutoActivityLifecycleTracing = true;
    private boolean enableActivityLifecycleTracingAutoFinish = true;

    @NotNull
    private c1 debugImagesLoader = k1.a();
    private boolean collectAdditionalContext = true;
    private long startupCrashFlushTimeoutMillis = 5000;
    private final long startupCrashDurationThresholdMillis = VibrateModeProgressBar.sLongToLong;
    private boolean enableFramesTracking = true;

    @Nullable
    private String nativeSdkName = null;
    private boolean enableRootCheck = true;
    private boolean enableNdk = true;
    private boolean enableScopeSync = true;
    private boolean reportHistoricalAnrs = false;
    private boolean attachAnrThreadDump = false;
    private boolean enablePerformanceV2 = false;

    public interface a {
    }

    public SentryAndroidOptions() {
        setSentryClientName("sentry.java.android/7.18.0");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
    }

    @NotNull
    private io.sentry.protocol.n createSdkVersion() {
        io.sentry.protocol.n nVarK = io.sentry.protocol.n.k(getSdkVersion(), "sentry.java.android", "7.18.0");
        nVarK.c("maven:io.sentry:sentry-android-core", "7.18.0");
        return nVarK;
    }

    public void enableAllAutoBreadcrumbs(boolean z) {
        this.enableActivityLifecycleBreadcrumbs = z;
        this.enableAppComponentBreadcrumbs = z;
        this.enableSystemEventBreadcrumbs = z;
        this.enableAppLifecycleBreadcrumbs = z;
        this.enableNetworkEventBreadcrumbs = z;
        setEnableUserInteractionBreadcrumbs(z);
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    @Nullable
    public a getBeforeScreenshotCaptureCallback() {
        return null;
    }

    @Nullable
    public a getBeforeViewHierarchyCaptureCallback() {
        return null;
    }

    @NotNull
    public c1 getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    @ApiStatus.Internal
    @Nullable
    public io.sentry.android.core.internal.util.t getFrameMetricsCollector() {
        return this.frameMetricsCollector;
    }

    @ApiStatus.Internal
    @Nullable
    public String getNativeSdkName() {
        return this.nativeSdkName;
    }

    @Deprecated
    public int getProfilingTracesIntervalMillis() {
        return 0;
    }

    @ApiStatus.Internal
    public long getStartupCrashDurationThresholdMillis() {
        return VibrateModeProgressBar.sLongToLong;
    }

    @ApiStatus.Internal
    public long getStartupCrashFlushTimeoutMillis() {
        return this.startupCrashFlushTimeoutMillis;
    }

    public boolean isAnrEnabled() {
        return this.anrEnabled;
    }

    public boolean isAnrReportInDebug() {
        return this.anrReportInDebug;
    }

    public boolean isAttachAnrThreadDump() {
        return this.attachAnrThreadDump;
    }

    public boolean isAttachScreenshot() {
        return this.attachScreenshot;
    }

    public boolean isAttachViewHierarchy() {
        return this.attachViewHierarchy;
    }

    public boolean isCollectAdditionalContext() {
        return this.collectAdditionalContext;
    }

    public boolean isEnableActivityLifecycleBreadcrumbs() {
        return this.enableActivityLifecycleBreadcrumbs;
    }

    public boolean isEnableActivityLifecycleTracingAutoFinish() {
        return this.enableActivityLifecycleTracingAutoFinish;
    }

    public boolean isEnableAppComponentBreadcrumbs() {
        return this.enableAppComponentBreadcrumbs;
    }

    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.enableAppLifecycleBreadcrumbs;
    }

    public boolean isEnableAutoActivityLifecycleTracing() {
        return this.enableAutoActivityLifecycleTracing;
    }

    public boolean isEnableFramesTracking() {
        return this.enableFramesTracking;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableNetworkEventBreadcrumbs() {
        return this.enableNetworkEventBreadcrumbs;
    }

    @ApiStatus.Experimental
    public boolean isEnablePerformanceV2() {
        return this.enablePerformanceV2;
    }

    public boolean isEnableRootCheck() {
        return this.enableRootCheck;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableSystemEventBreadcrumbs() {
        return this.enableSystemEventBreadcrumbs;
    }

    public boolean isReportHistoricalAnrs() {
        return this.reportHistoricalAnrs;
    }

    public void setAnrEnabled(boolean z) {
        this.anrEnabled = z;
    }

    public void setAnrReportInDebug(boolean z) {
        this.anrReportInDebug = z;
    }

    public void setAnrTimeoutIntervalMillis(long j) {
        this.anrTimeoutIntervalMillis = j;
    }

    public void setAttachAnrThreadDump(boolean z) {
        this.attachAnrThreadDump = z;
    }

    public void setAttachScreenshot(boolean z) {
        this.attachScreenshot = z;
    }

    public void setAttachViewHierarchy(boolean z) {
        this.attachViewHierarchy = z;
    }

    public void setBeforeScreenshotCaptureCallback(@NotNull a aVar) {
    }

    public void setBeforeViewHierarchyCaptureCallback(@NotNull a aVar) {
    }

    public void setCollectAdditionalContext(boolean z) {
        this.collectAdditionalContext = z;
    }

    public void setDebugImagesLoader(@NotNull c1 c1Var) {
        if (c1Var == null) {
            c1Var = k1.a();
        }
        this.debugImagesLoader = c1Var;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean z) {
        this.enableActivityLifecycleBreadcrumbs = z;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean z) {
        this.enableActivityLifecycleTracingAutoFinish = z;
    }

    public void setEnableAppComponentBreadcrumbs(boolean z) {
        this.enableAppComponentBreadcrumbs = z;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean z) {
        this.enableAppLifecycleBreadcrumbs = z;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean z) {
        this.enableAutoActivityLifecycleTracing = z;
    }

    public void setEnableFramesTracking(boolean z) {
        this.enableFramesTracking = z;
    }

    public void setEnableNdk(boolean z) {
        this.enableNdk = z;
    }

    public void setEnableNetworkEventBreadcrumbs(boolean z) {
        this.enableNetworkEventBreadcrumbs = z;
    }

    @ApiStatus.Experimental
    public void setEnablePerformanceV2(boolean z) {
        this.enablePerformanceV2 = z;
    }

    public void setEnableRootCheck(boolean z) {
        this.enableRootCheck = z;
    }

    public void setEnableScopeSync(boolean z) {
        this.enableScopeSync = z;
    }

    public void setEnableSystemEventBreadcrumbs(boolean z) {
        this.enableSystemEventBreadcrumbs = z;
    }

    @ApiStatus.Internal
    public void setFrameMetricsCollector(@Nullable io.sentry.android.core.internal.util.t tVar) {
        this.frameMetricsCollector = tVar;
    }

    @ApiStatus.Internal
    public void setNativeSdkName(@Nullable String str) {
        this.nativeSdkName = str;
    }

    @Deprecated
    public void setProfilingTracesIntervalMillis(int i) {
    }

    public void setReportHistoricalAnrs(boolean z) {
        this.reportHistoricalAnrs = z;
    }

    @TestOnly
    public void setStartupCrashFlushTimeoutMillis(long j) {
        this.startupCrashFlushTimeoutMillis = j;
    }
}
