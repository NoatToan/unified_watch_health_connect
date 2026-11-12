package com.google.firebase.perf.config;

import android.content.Context;
import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.ImmutableBundle;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.Utils;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigResolver {
    private static volatile ConfigResolver instance;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private DeviceCacheManager deviceCacheManager;
    private ImmutableBundle metadataBundle;
    private final RemoteConfigManager remoteConfigManager;

    public ConfigResolver(RemoteConfigManager remoteConfigManager, ImmutableBundle immutableBundle, DeviceCacheManager deviceCacheManager) {
        this.remoteConfigManager = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.metadataBundle = immutableBundle == null ? new ImmutableBundle() : immutableBundle;
        this.deviceCacheManager = deviceCacheManager == null ? DeviceCacheManager.getInstance() : deviceCacheManager;
    }

    public static void clearInstance() {
        instance = null;
    }

    private Optional<Boolean> getDeviceCacheBoolean(ConfigurationFlag<Boolean> configurationFlag) {
        return this.deviceCacheManager.getBoolean(configurationFlag.getDeviceCacheFlag());
    }

    private Optional<Double> getDeviceCacheDouble(ConfigurationFlag<Double> configurationFlag) {
        return this.deviceCacheManager.getDouble(configurationFlag.getDeviceCacheFlag());
    }

    private Optional<Long> getDeviceCacheLong(ConfigurationFlag<Long> configurationFlag) {
        return this.deviceCacheManager.getLong(configurationFlag.getDeviceCacheFlag());
    }

    private Optional<String> getDeviceCacheString(ConfigurationFlag<String> configurationFlag) {
        return this.deviceCacheManager.getString(configurationFlag.getDeviceCacheFlag());
    }

    public static synchronized ConfigResolver getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigResolver(null, null, null);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return instance;
    }

    private boolean getIsSdkEnabled() {
        ConfigurationConstants.SdkEnabled sdkEnabled = ConfigurationConstants.SdkEnabled.getInstance();
        Optional<Boolean> deviceCacheBoolean = getDeviceCacheBoolean(sdkEnabled);
        Optional<Boolean> remoteConfigBoolean = getRemoteConfigBoolean(sdkEnabled);
        if (!remoteConfigBoolean.isAvailable()) {
            return deviceCacheBoolean.isAvailable() ? deviceCacheBoolean.get().booleanValue() : sdkEnabled.getDefault().booleanValue();
        }
        if (this.remoteConfigManager.isLastFetchFailed()) {
            return false;
        }
        Boolean bool = remoteConfigBoolean.get();
        if (deviceCacheBoolean == null || !deviceCacheBoolean.isAvailable() || deviceCacheBoolean.get() != bool) {
            this.deviceCacheManager.setValue(sdkEnabled.getDeviceCacheFlag(), bool.booleanValue());
        }
        return bool.booleanValue();
    }

    private boolean getIsSdkVersionDisabled() {
        ConfigurationConstants.SdkDisabledVersions sdkDisabledVersions = ConfigurationConstants.SdkDisabledVersions.getInstance();
        Optional<String> deviceCacheString = getDeviceCacheString(sdkDisabledVersions);
        Optional<String> remoteConfigString = getRemoteConfigString(sdkDisabledVersions);
        if (!remoteConfigString.isAvailable()) {
            return deviceCacheString.isAvailable() ? isFireperfSdkVersionInList(deviceCacheString.get()) : isFireperfSdkVersionInList(sdkDisabledVersions.getDefault());
        }
        String str = remoteConfigString.get();
        if (deviceCacheString == null || !deviceCacheString.isAvailable() || !deviceCacheString.get().equals(str)) {
            this.deviceCacheManager.setValue(sdkDisabledVersions.getDeviceCacheFlag(), str);
        }
        return isFireperfSdkVersionInList(str);
    }

    private Optional<Boolean> getMetadataBoolean(ConfigurationFlag<Boolean> configurationFlag) {
        return this.metadataBundle.getBoolean(configurationFlag.getMetadataFlag());
    }

    private Optional<Double> getMetadataDouble(ConfigurationFlag<Double> configurationFlag) {
        return this.metadataBundle.getDouble(configurationFlag.getMetadataFlag());
    }

    private Optional<Long> getMetadataLong(ConfigurationFlag<Long> configurationFlag) {
        return this.metadataBundle.getLong(configurationFlag.getMetadataFlag());
    }

    private Optional<Boolean> getRemoteConfigBoolean(ConfigurationFlag<Boolean> configurationFlag) {
        return this.remoteConfigManager.getBoolean(configurationFlag.getRemoteConfigFlag());
    }

    private Optional<Double> getRemoteConfigDouble(ConfigurationFlag<Double> configurationFlag) {
        return this.remoteConfigManager.getDouble(configurationFlag.getRemoteConfigFlag());
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

    private boolean isEventCountValid(long j8) {
        return j8 >= 0;
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

    private boolean isGaugeCaptureFrequencyMsValid(long j8) {
        return j8 >= 0;
    }

    private boolean isSamplingRateValid(double d14) {
        return 0.0d <= d14 && d14 <= 1.0d;
    }

    private boolean isSessionsMaxDurationMinutesValid(long j8) {
        return j8 > 0;
    }

    private boolean isTimeRangeSecValid(long j8) {
        return j8 > 0;
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

    public double getFragmentSamplingRate() {
        ConfigurationConstants.FragmentSamplingRate fragmentSamplingRate = ConfigurationConstants.FragmentSamplingRate.getInstance();
        Optional<Double> metadataDouble = getMetadataDouble(fragmentSamplingRate);
        if (metadataDouble.isAvailable()) {
            double dDoubleValue = metadataDouble.get().doubleValue() / 100.0d;
            if (isSamplingRateValid(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Optional<Double> remoteConfigDouble = getRemoteConfigDouble(fragmentSamplingRate);
        if (remoteConfigDouble.isAvailable() && isSamplingRateValid(remoteConfigDouble.get().doubleValue())) {
            this.deviceCacheManager.setValue(fragmentSamplingRate.getDeviceCacheFlag(), remoteConfigDouble.get().doubleValue());
            return remoteConfigDouble.get().doubleValue();
        }
        Optional<Double> deviceCacheDouble = getDeviceCacheDouble(fragmentSamplingRate);
        return (deviceCacheDouble.isAvailable() && isSamplingRateValid(deviceCacheDouble.get().doubleValue())) ? deviceCacheDouble.get().doubleValue() : fragmentSamplingRate.getDefault().doubleValue();
    }

    public boolean getIsExperimentTTIDEnabled() {
        ConfigurationConstants.ExperimentTTID experimentTTID = ConfigurationConstants.ExperimentTTID.getInstance();
        Optional<Boolean> metadataBoolean = getMetadataBoolean(experimentTTID);
        return metadataBoolean.isAvailable() ? metadataBoolean.get().booleanValue() : experimentTTID.getDefault().booleanValue();
    }

    public Boolean getIsPerformanceCollectionDeactivated() {
        ConfigurationConstants.CollectionDeactivated collectionDeactivated = ConfigurationConstants.CollectionDeactivated.getInstance();
        Optional<Boolean> metadataBoolean = getMetadataBoolean(collectionDeactivated);
        return metadataBoolean.isAvailable() ? metadataBoolean.get() : collectionDeactivated.getDefault();
    }

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

    public double getNetworkRequestSamplingRate() {
        ConfigurationConstants.NetworkRequestSamplingRate networkRequestSamplingRate = ConfigurationConstants.NetworkRequestSamplingRate.getInstance();
        Optional<Double> remoteConfigDouble = getRemoteConfigDouble(networkRequestSamplingRate);
        if (remoteConfigDouble.isAvailable() && isSamplingRateValid(remoteConfigDouble.get().doubleValue())) {
            this.deviceCacheManager.setValue(networkRequestSamplingRate.getDeviceCacheFlag(), remoteConfigDouble.get().doubleValue());
            return remoteConfigDouble.get().doubleValue();
        }
        Optional<Double> deviceCacheDouble = getDeviceCacheDouble(networkRequestSamplingRate);
        if (deviceCacheDouble.isAvailable() && isSamplingRateValid(deviceCacheDouble.get().doubleValue())) {
            return deviceCacheDouble.get().doubleValue();
        }
        return this.remoteConfigManager.isLastFetchFailed() ? networkRequestSamplingRate.getDefaultOnRcFetchFail().doubleValue() : networkRequestSamplingRate.getDefault().doubleValue();
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
        if (deviceCacheLong.isAvailable() && isGaugeCaptureFrequencyMsValid(deviceCacheLong.get().longValue())) {
            return deviceCacheLong.get().longValue();
        }
        return this.remoteConfigManager.isLastFetchFailed() ? sessionsCpuCaptureFrequencyForegroundMs.getDefaultOnRcFetchFail().longValue() : sessionsCpuCaptureFrequencyForegroundMs.getDefault().longValue();
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
        if (deviceCacheLong.isAvailable() && isGaugeCaptureFrequencyMsValid(deviceCacheLong.get().longValue())) {
            return deviceCacheLong.get().longValue();
        }
        return this.remoteConfigManager.isLastFetchFailed() ? sessionsMemoryCaptureFrequencyForegroundMs.getDefaultOnRcFetchFail().longValue() : sessionsMemoryCaptureFrequencyForegroundMs.getDefault().longValue();
    }

    public double getSessionsSamplingRate() {
        ConfigurationConstants.SessionsSamplingRate sessionsSamplingRate = ConfigurationConstants.SessionsSamplingRate.getInstance();
        Optional<Double> metadataDouble = getMetadataDouble(sessionsSamplingRate);
        if (metadataDouble.isAvailable()) {
            double dDoubleValue = metadataDouble.get().doubleValue() / 100.0d;
            if (isSamplingRateValid(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Optional<Double> remoteConfigDouble = getRemoteConfigDouble(sessionsSamplingRate);
        if (remoteConfigDouble.isAvailable() && isSamplingRateValid(remoteConfigDouble.get().doubleValue())) {
            this.deviceCacheManager.setValue(sessionsSamplingRate.getDeviceCacheFlag(), remoteConfigDouble.get().doubleValue());
            return remoteConfigDouble.get().doubleValue();
        }
        Optional<Double> deviceCacheDouble = getDeviceCacheDouble(sessionsSamplingRate);
        if (deviceCacheDouble.isAvailable() && isSamplingRateValid(deviceCacheDouble.get().doubleValue())) {
            return deviceCacheDouble.get().doubleValue();
        }
        return this.remoteConfigManager.isLastFetchFailed() ? sessionsSamplingRate.getDefaultOnRcFetchFail().doubleValue() : sessionsSamplingRate.getDefault().doubleValue();
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

    public double getTraceSamplingRate() {
        ConfigurationConstants.TraceSamplingRate traceSamplingRate = ConfigurationConstants.TraceSamplingRate.getInstance();
        Optional<Double> remoteConfigDouble = getRemoteConfigDouble(traceSamplingRate);
        if (remoteConfigDouble.isAvailable() && isSamplingRateValid(remoteConfigDouble.get().doubleValue())) {
            this.deviceCacheManager.setValue(traceSamplingRate.getDeviceCacheFlag(), remoteConfigDouble.get().doubleValue());
            return remoteConfigDouble.get().doubleValue();
        }
        Optional<Double> deviceCacheDouble = getDeviceCacheDouble(traceSamplingRate);
        if (deviceCacheDouble.isAvailable() && isSamplingRateValid(deviceCacheDouble.get().doubleValue())) {
            return deviceCacheDouble.get().doubleValue();
        }
        return this.remoteConfigManager.isLastFetchFailed() ? traceSamplingRate.getDefaultOnRcFetchFail().doubleValue() : traceSamplingRate.getDefault().doubleValue();
    }

    public boolean isCollectionEnabledConfigValueAvailable() {
        return getDeviceCacheBoolean(ConfigurationConstants.CollectionEnabled.getInstance()).isAvailable() || getRemoteConfigBoolean(ConfigurationConstants.SdkEnabled.getInstance()).isAvailable();
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

    public void setDeviceCacheManager(DeviceCacheManager deviceCacheManager) {
        this.deviceCacheManager = deviceCacheManager;
    }

    public void setIsPerformanceCollectionEnabled(Boolean bool) {
        String deviceCacheFlag;
        if (getIsPerformanceCollectionDeactivated().booleanValue() || (deviceCacheFlag = ConfigurationConstants.CollectionEnabled.getInstance().getDeviceCacheFlag()) == null) {
            return;
        }
        DeviceCacheManager deviceCacheManager = this.deviceCacheManager;
        if (bool != null) {
            deviceCacheManager.setValue(deviceCacheFlag, Boolean.TRUE.equals(bool));
        } else {
            deviceCacheManager.clear(deviceCacheFlag);
        }
    }

    public void setMetadataBundle(ImmutableBundle immutableBundle) {
        this.metadataBundle = immutableBundle;
    }
}
