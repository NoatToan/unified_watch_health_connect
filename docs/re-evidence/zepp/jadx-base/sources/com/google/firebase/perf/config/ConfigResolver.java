package com.google.firebase.perf.config;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.ImmutableBundle;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.Utils;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigResolver {
    private static volatile ConfigResolver instance;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private DeviceCacheManager deviceCacheManager;
    private ImmutableBundle metadataBundle;
    private final RemoteConfigManager remoteConfigManager;

    @VisibleForTesting
    public ConfigResolver(@Nullable RemoteConfigManager remoteConfigManager, @Nullable ImmutableBundle immutableBundle, @Nullable DeviceCacheManager deviceCacheManager) {
        this.remoteConfigManager = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.metadataBundle = immutableBundle == null ? new ImmutableBundle() : immutableBundle;
        this.deviceCacheManager = deviceCacheManager == null ? DeviceCacheManager.getInstance() : deviceCacheManager;
    }

    @VisibleForTesting
    public static void clearInstance() {
        instance = null;
    }

    private Optional<Boolean> getDeviceCacheBoolean(ConfigurationFlag<Boolean> configurationFlag) {
        return this.deviceCacheManager.getBoolean(configurationFlag.getDeviceCacheFlag());
    }

    private Optional<Float> getDeviceCacheFloat(ConfigurationFlag<Float> configurationFlag) {
        return this.deviceCacheManager.getFloat(configurationFlag.getDeviceCacheFlag());
    }

    private Optional<Long> getDeviceCacheLong(ConfigurationFlag<Long> configurationFlag) {
        return this.deviceCacheManager.getLong(configurationFlag.getDeviceCacheFlag());
    }

    private Optional<String> getDeviceCacheString(ConfigurationFlag<String> configurationFlag) {
        return this.deviceCacheManager.getString(configurationFlag.getDeviceCacheFlag());
    }

    public static synchronized ConfigResolver getInstance() {
        if (instance == null) {
            instance = new ConfigResolver(null, null, null);
        }
        return instance;
    }

    private boolean getIsSdkEnabled() {
        ConfigurationConstants.SdkEnabled sdkEnabled = ConfigurationConstants.SdkEnabled.getInstance();
        Optional<Boolean> remoteConfigBoolean = getRemoteConfigBoolean(sdkEnabled);
        if (!remoteConfigBoolean.isAvailable()) {
            Optional<Boolean> deviceCacheBoolean = getDeviceCacheBoolean(sdkEnabled);
            return deviceCacheBoolean.isAvailable() ? deviceCacheBoolean.get().booleanValue() : sdkEnabled.getDefault().booleanValue();
        }
        if (this.remoteConfigManager.isLastFetchFailed()) {
            return false;
        }
        this.deviceCacheManager.setValue(sdkEnabled.getDeviceCacheFlag(), remoteConfigBoolean.get().booleanValue());
        return remoteConfigBoolean.get().booleanValue();
    }

    private boolean getIsSdkVersionDisabled() {
        ConfigurationConstants.SdkDisabledVersions sdkDisabledVersions = ConfigurationConstants.SdkDisabledVersions.getInstance();
        Optional<String> remoteConfigString = getRemoteConfigString(sdkDisabledVersions);
        if (remoteConfigString.isAvailable()) {
            this.deviceCacheManager.setValue(sdkDisabledVersions.getDeviceCacheFlag(), remoteConfigString.get());
            return isFireperfSdkVersionInList(remoteConfigString.get());
        }
        Optional<String> deviceCacheString = getDeviceCacheString(sdkDisabledVersions);
        return deviceCacheString.isAvailable() ? isFireperfSdkVersionInList(deviceCacheString.get()) : isFireperfSdkVersionInList(sdkDisabledVersions.getDefault());
    }

    private Optional<Boolean> getMetadataBoolean(ConfigurationFlag<Boolean> configurationFlag) {
        return this.metadataBundle.getBoolean(configurationFlag.getMetadataFlag());
    }

    private Optional<Float> getMetadataFloat(ConfigurationFlag<Float> configurationFlag) {
        return this.metadataBundle.getFloat(configurationFlag.getMetadataFlag());
    }

    private Optional<Long> getMetadataLong(ConfigurationFlag<Long> configurationFlag) {
        return this.metadataBundle.getLong(configurationFlag.getMetadataFlag());
    }

    private Optional<Boolean> getRemoteConfigBoolean(ConfigurationFlag<Boolean> configurationFlag) {
        return this.remoteConfigManager.getBoolean(configurationFlag.getRemoteConfigFlag());
    }

    private Optional<Float> getRemoteConfigFloat(ConfigurationFlag<Float> configurationFlag) {
        return this.remoteConfigManager.getFloat(configurationFlag.getRemoteConfigFlag());
    }

    private Optional<Long> getRemoteConfigLong(ConfigurationFlag<Long> configurationFlag) {
        return this.remoteConfigManager.getLong(configurationFlag.getRemoteConfigFlag());
    }

    private Optional<String> getRemoteConfigString(ConfigurationFlag<String> configurationFlag) {
        return this.remoteConfigManager.getString(configurationFlag.getRemoteConfigFlag());
    }

    private Long getRemoteConfigValue(ConfigurationFlag<Long> configurationFlag) {
        String remoteConfigFlag = configurationFlag.getRemoteConfigFlag();
        return remoteConfigFlag == null ? configurationFlag.getDefault() : (Long) this.remoteConfigManager.getRemoteConfigValueOrDefault(remoteConfigFlag, configurationFlag.getDefault());
    }

    private boolean isEventCountValid(long j) {
        return j >= 0;
    }

    private boolean isFireperfSdkVersionInList(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(BuildConfig.FIREPERF_VERSION_NAME)) {
                return true;
            }
        }
        return false;
    }

    private boolean isGaugeCaptureFrequencyMsValid(long j) {
        return j >= 0;
    }

    private boolean isSamplingRateValid(float f) {
        return 0.0f <= f && f <= 1.0f;
    }

    private boolean isSessionsMaxDurationMinutesValid(long j) {
        return j > 0;
    }

    private boolean isTimeRangeSecValid(long j) {
        return j > 0;
    }

    public String getAndCacheLogSourceName() {
        String logSourceName;
        ConfigurationConstants.LogSourceName logSourceName2 = ConfigurationConstants.LogSourceName.getInstance();
        if (BuildConfig.ENFORCE_DEFAULT_LOG_SRC.booleanValue()) {
            return logSourceName2.getDefault();
        }
        String remoteConfigFlag = logSourceName2.getRemoteConfigFlag();
        long jLongValue = remoteConfigFlag != null ? ((Long) this.remoteConfigManager.getRemoteConfigValueOrDefault(remoteConfigFlag, -1L)).longValue() : -1L;
        String deviceCacheFlag = logSourceName2.getDeviceCacheFlag();
        if (!ConfigurationConstants.LogSourceName.isLogSourceKnown(jLongValue) || (logSourceName = ConfigurationConstants.LogSourceName.getLogSourceName(jLongValue)) == null) {
            Optional<String> deviceCacheString = getDeviceCacheString(logSourceName2);
            return deviceCacheString.isAvailable() ? deviceCacheString.get() : logSourceName2.getDefault();
        }
        this.deviceCacheManager.setValue(deviceCacheFlag, logSourceName);
        return logSourceName;
    }

    @Nullable
    public Boolean getIsPerformanceCollectionDeactivated() {
        ConfigurationConstants.CollectionDeactivated collectionDeactivated = ConfigurationConstants.CollectionDeactivated.getInstance();
        Optional<Boolean> metadataBoolean = getMetadataBoolean(collectionDeactivated);
        return metadataBoolean.isAvailable() ? metadataBoolean.get() : collectionDeactivated.getDefault();
    }

    @Nullable
    public Boolean getIsPerformanceCollectionEnabled() {
        if (getIsPerformanceCollectionDeactivated().booleanValue()) {
            return Boolean.FALSE;
        }
        ConfigurationConstants.CollectionEnabled collectionEnabled = ConfigurationConstants.CollectionEnabled.getInstance();
        Optional<Boolean> deviceCacheBoolean = getDeviceCacheBoolean(collectionEnabled);
        if (deviceCacheBoolean.isAvailable()) {
            return deviceCacheBoolean.get();
        }
        Optional<Boolean> metadataBoolean = getMetadataBoolean(collectionEnabled);
        if (metadataBoolean.isAvailable()) {
            return metadataBoolean.get();
        }
        return null;
    }

    public boolean getIsServiceCollectionEnabled() {
        return getIsSdkEnabled() && !getIsSdkVersionDisabled();
    }

    public long getNetworkEventCountBackground() {
        ConfigurationConstants.NetworkEventCountBackground networkEventCountBackground = ConfigurationConstants.NetworkEventCountBackground.getInstance();
        Optional<Long> remoteConfigLong = getRemoteConfigLong(networkEventCountBackground);
        if (remoteConfigLong.isAvailable() && isEventCountValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(networkEventCountBackground.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(networkEventCountBackground);
        return (deviceCacheLong.isAvailable() && isEventCountValid(deviceCacheLong.get().longValue())) ? deviceCacheLong.get().longValue() : networkEventCountBackground.getDefault().longValue();
    }

    public long getNetworkEventCountForeground() {
        ConfigurationConstants.NetworkEventCountForeground networkEventCountForeground = ConfigurationConstants.NetworkEventCountForeground.getInstance();
        Optional<Long> remoteConfigLong = getRemoteConfigLong(networkEventCountForeground);
        if (remoteConfigLong.isAvailable() && isEventCountValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(networkEventCountForeground.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(networkEventCountForeground);
        return (deviceCacheLong.isAvailable() && isEventCountValid(deviceCacheLong.get().longValue())) ? deviceCacheLong.get().longValue() : networkEventCountForeground.getDefault().longValue();
    }

    public float getNetworkRequestSamplingRate() {
        ConfigurationConstants.NetworkRequestSamplingRate networkRequestSamplingRate = ConfigurationConstants.NetworkRequestSamplingRate.getInstance();
        Optional<Float> remoteConfigFloat = getRemoteConfigFloat(networkRequestSamplingRate);
        if (remoteConfigFloat.isAvailable() && isSamplingRateValid(remoteConfigFloat.get().floatValue())) {
            this.deviceCacheManager.setValue(networkRequestSamplingRate.getDeviceCacheFlag(), remoteConfigFloat.get().floatValue());
            return remoteConfigFloat.get().floatValue();
        }
        Optional<Float> deviceCacheFloat = getDeviceCacheFloat(networkRequestSamplingRate);
        return (deviceCacheFloat.isAvailable() && isSamplingRateValid(deviceCacheFloat.get().floatValue())) ? deviceCacheFloat.get().floatValue() : networkRequestSamplingRate.getDefault().floatValue();
    }

    public long getRateLimitSec() {
        ConfigurationConstants.RateLimitSec rateLimitSec = ConfigurationConstants.RateLimitSec.getInstance();
        Optional<Long> remoteConfigLong = getRemoteConfigLong(rateLimitSec);
        if (remoteConfigLong.isAvailable() && isTimeRangeSecValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(rateLimitSec.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(rateLimitSec);
        return (deviceCacheLong.isAvailable() && isTimeRangeSecValid(deviceCacheLong.get().longValue())) ? deviceCacheLong.get().longValue() : rateLimitSec.getDefault().longValue();
    }

    public long getSessionsCpuCaptureFrequencyBackgroundMs() {
        ConfigurationConstants.SessionsCpuCaptureFrequencyBackgroundMs sessionsCpuCaptureFrequencyBackgroundMs = ConfigurationConstants.SessionsCpuCaptureFrequencyBackgroundMs.getInstance();
        Optional<Long> metadataLong = getMetadataLong(sessionsCpuCaptureFrequencyBackgroundMs);
        if (metadataLong.isAvailable() && isGaugeCaptureFrequencyMsValid(metadataLong.get().longValue())) {
            return metadataLong.get().longValue();
        }
        Optional<Long> remoteConfigLong = getRemoteConfigLong(sessionsCpuCaptureFrequencyBackgroundMs);
        if (remoteConfigLong.isAvailable() && isGaugeCaptureFrequencyMsValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(sessionsCpuCaptureFrequencyBackgroundMs.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(sessionsCpuCaptureFrequencyBackgroundMs);
        return (deviceCacheLong.isAvailable() && isGaugeCaptureFrequencyMsValid(deviceCacheLong.get().longValue())) ? deviceCacheLong.get().longValue() : sessionsCpuCaptureFrequencyBackgroundMs.getDefault().longValue();
    }

    public long getSessionsCpuCaptureFrequencyForegroundMs() {
        ConfigurationConstants.SessionsCpuCaptureFrequencyForegroundMs sessionsCpuCaptureFrequencyForegroundMs = ConfigurationConstants.SessionsCpuCaptureFrequencyForegroundMs.getInstance();
        Optional<Long> metadataLong = getMetadataLong(sessionsCpuCaptureFrequencyForegroundMs);
        if (metadataLong.isAvailable() && isGaugeCaptureFrequencyMsValid(metadataLong.get().longValue())) {
            return metadataLong.get().longValue();
        }
        Optional<Long> remoteConfigLong = getRemoteConfigLong(sessionsCpuCaptureFrequencyForegroundMs);
        if (remoteConfigLong.isAvailable() && isGaugeCaptureFrequencyMsValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(sessionsCpuCaptureFrequencyForegroundMs.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(sessionsCpuCaptureFrequencyForegroundMs);
        return (deviceCacheLong.isAvailable() && isGaugeCaptureFrequencyMsValid(deviceCacheLong.get().longValue())) ? deviceCacheLong.get().longValue() : sessionsCpuCaptureFrequencyForegroundMs.getDefault().longValue();
    }

    public long getSessionsMaxDurationMinutes() {
        ConfigurationConstants.SessionsMaxDurationMinutes sessionsMaxDurationMinutes = ConfigurationConstants.SessionsMaxDurationMinutes.getInstance();
        Optional<Long> metadataLong = getMetadataLong(sessionsMaxDurationMinutes);
        if (metadataLong.isAvailable() && isSessionsMaxDurationMinutesValid(metadataLong.get().longValue())) {
            return metadataLong.get().longValue();
        }
        Optional<Long> remoteConfigLong = getRemoteConfigLong(sessionsMaxDurationMinutes);
        if (remoteConfigLong.isAvailable() && isSessionsMaxDurationMinutesValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(sessionsMaxDurationMinutes.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(sessionsMaxDurationMinutes);
        return (deviceCacheLong.isAvailable() && isSessionsMaxDurationMinutesValid(deviceCacheLong.get().longValue())) ? deviceCacheLong.get().longValue() : sessionsMaxDurationMinutes.getDefault().longValue();
    }

    public long getSessionsMemoryCaptureFrequencyBackgroundMs() {
        ConfigurationConstants.SessionsMemoryCaptureFrequencyBackgroundMs sessionsMemoryCaptureFrequencyBackgroundMs = ConfigurationConstants.SessionsMemoryCaptureFrequencyBackgroundMs.getInstance();
        Optional<Long> metadataLong = getMetadataLong(sessionsMemoryCaptureFrequencyBackgroundMs);
        if (metadataLong.isAvailable() && isGaugeCaptureFrequencyMsValid(metadataLong.get().longValue())) {
            return metadataLong.get().longValue();
        }
        Optional<Long> remoteConfigLong = getRemoteConfigLong(sessionsMemoryCaptureFrequencyBackgroundMs);
        if (remoteConfigLong.isAvailable() && isGaugeCaptureFrequencyMsValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(sessionsMemoryCaptureFrequencyBackgroundMs.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(sessionsMemoryCaptureFrequencyBackgroundMs);
        return (deviceCacheLong.isAvailable() && isGaugeCaptureFrequencyMsValid(deviceCacheLong.get().longValue())) ? deviceCacheLong.get().longValue() : sessionsMemoryCaptureFrequencyBackgroundMs.getDefault().longValue();
    }

    public long getSessionsMemoryCaptureFrequencyForegroundMs() {
        ConfigurationConstants.SessionsMemoryCaptureFrequencyForegroundMs sessionsMemoryCaptureFrequencyForegroundMs = ConfigurationConstants.SessionsMemoryCaptureFrequencyForegroundMs.getInstance();
        Optional<Long> metadataLong = getMetadataLong(sessionsMemoryCaptureFrequencyForegroundMs);
        if (metadataLong.isAvailable() && isGaugeCaptureFrequencyMsValid(metadataLong.get().longValue())) {
            return metadataLong.get().longValue();
        }
        Optional<Long> remoteConfigLong = getRemoteConfigLong(sessionsMemoryCaptureFrequencyForegroundMs);
        if (remoteConfigLong.isAvailable() && isGaugeCaptureFrequencyMsValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(sessionsMemoryCaptureFrequencyForegroundMs.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(sessionsMemoryCaptureFrequencyForegroundMs);
        return (deviceCacheLong.isAvailable() && isGaugeCaptureFrequencyMsValid(deviceCacheLong.get().longValue())) ? deviceCacheLong.get().longValue() : sessionsMemoryCaptureFrequencyForegroundMs.getDefault().longValue();
    }

    public float getSessionsSamplingRate() {
        ConfigurationConstants.SessionsSamplingRate sessionsSamplingRate = ConfigurationConstants.SessionsSamplingRate.getInstance();
        Optional<Float> metadataFloat = getMetadataFloat(sessionsSamplingRate);
        if (metadataFloat.isAvailable()) {
            float fFloatValue = metadataFloat.get().floatValue() / 100.0f;
            if (isSamplingRateValid(fFloatValue)) {
                return fFloatValue;
            }
        }
        Optional<Float> remoteConfigFloat = getRemoteConfigFloat(sessionsSamplingRate);
        if (remoteConfigFloat.isAvailable() && isSamplingRateValid(remoteConfigFloat.get().floatValue())) {
            this.deviceCacheManager.setValue(sessionsSamplingRate.getDeviceCacheFlag(), remoteConfigFloat.get().floatValue());
            return remoteConfigFloat.get().floatValue();
        }
        Optional<Float> deviceCacheFloat = getDeviceCacheFloat(sessionsSamplingRate);
        return (deviceCacheFloat.isAvailable() && isSamplingRateValid(deviceCacheFloat.get().floatValue())) ? deviceCacheFloat.get().floatValue() : sessionsSamplingRate.getDefault().floatValue();
    }

    public long getTraceEventCountBackground() {
        ConfigurationConstants.TraceEventCountBackground traceEventCountBackground = ConfigurationConstants.TraceEventCountBackground.getInstance();
        Optional<Long> remoteConfigLong = getRemoteConfigLong(traceEventCountBackground);
        if (remoteConfigLong.isAvailable() && isEventCountValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(traceEventCountBackground.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(traceEventCountBackground);
        return (deviceCacheLong.isAvailable() && isEventCountValid(deviceCacheLong.get().longValue())) ? deviceCacheLong.get().longValue() : traceEventCountBackground.getDefault().longValue();
    }

    public long getTraceEventCountForeground() {
        ConfigurationConstants.TraceEventCountForeground traceEventCountForeground = ConfigurationConstants.TraceEventCountForeground.getInstance();
        Optional<Long> remoteConfigLong = getRemoteConfigLong(traceEventCountForeground);
        if (remoteConfigLong.isAvailable() && isEventCountValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(traceEventCountForeground.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(traceEventCountForeground);
        return (deviceCacheLong.isAvailable() && isEventCountValid(deviceCacheLong.get().longValue())) ? deviceCacheLong.get().longValue() : traceEventCountForeground.getDefault().longValue();
    }

    public float getTraceSamplingRate() {
        ConfigurationConstants.TraceSamplingRate traceSamplingRate = ConfigurationConstants.TraceSamplingRate.getInstance();
        Optional<Float> remoteConfigFloat = getRemoteConfigFloat(traceSamplingRate);
        if (remoteConfigFloat.isAvailable() && isSamplingRateValid(remoteConfigFloat.get().floatValue())) {
            this.deviceCacheManager.setValue(traceSamplingRate.getDeviceCacheFlag(), remoteConfigFloat.get().floatValue());
            return remoteConfigFloat.get().floatValue();
        }
        Optional<Float> deviceCacheFloat = getDeviceCacheFloat(traceSamplingRate);
        return (deviceCacheFloat.isAvailable() && isSamplingRateValid(deviceCacheFloat.get().floatValue())) ? deviceCacheFloat.get().floatValue() : traceSamplingRate.getDefault().floatValue();
    }

    public boolean isPerformanceMonitoringEnabled() {
        Boolean isPerformanceCollectionEnabled = getIsPerformanceCollectionEnabled();
        return (isPerformanceCollectionEnabled == null || isPerformanceCollectionEnabled.booleanValue()) && getIsServiceCollectionEnabled();
    }

    public void setApplicationContext(Context context) {
        logger.setLogcatEnabled(Utils.isDebugLoggingEnabled(context));
        this.deviceCacheManager.setContext(context);
    }

    public void setContentProviderContext(Context context) {
        setApplicationContext(context.getApplicationContext());
    }

    @VisibleForTesting
    public void setDeviceCacheManager(DeviceCacheManager deviceCacheManager) {
        this.deviceCacheManager = deviceCacheManager;
    }

    public void setIsPerformanceCollectionEnabled(Boolean bool) {
        String deviceCacheFlag;
        if (getIsPerformanceCollectionDeactivated().booleanValue() || (deviceCacheFlag = ConfigurationConstants.CollectionEnabled.getInstance().getDeviceCacheFlag()) == null) {
            return;
        }
        if (bool != null) {
            this.deviceCacheManager.setValue(deviceCacheFlag, Boolean.TRUE.equals(bool));
        } else {
            this.deviceCacheManager.clear(deviceCacheFlag);
        }
    }

    public void setMetadataBundle(ImmutableBundle immutableBundle) {
        this.metadataBundle = immutableBundle;
    }
}
