package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class MemoryMonitorObserverConfig implements Serializable {
    private final long maxUsedMemoryPercentThreshold;
    private final long maxUsedMemoryThreshold;
    private final boolean sendAppRunningInBackgroundNotification;
    private final long thresholdReachedNotificationTimeout;

    public static final class Builder {
        private boolean sendAppRunningInBackgroundNotification = true;
        private long maxUsedMemoryPercentThreshold = 75;
        private long maxUsedMemoryThreshold = 0;
        private long thresholdReachedNotificationTimeout = 300000;

        public MemoryMonitorObserverConfig build() {
            return new MemoryMonitorObserverConfig(this.sendAppRunningInBackgroundNotification, this.maxUsedMemoryPercentThreshold, this.maxUsedMemoryThreshold, this.thresholdReachedNotificationTimeout);
        }

        public Builder maxUsedMemoryPercentThreshold(long j8) {
            this.maxUsedMemoryPercentThreshold = j8;
            return this;
        }

        public Builder maxUsedMemoryThreshold(long j8) {
            this.maxUsedMemoryThreshold = j8;
            return this;
        }

        public Builder sendAppRunningInBackgroundNotification(boolean z14) {
            this.sendAppRunningInBackgroundNotification = z14;
            return this;
        }

        public Builder thresholdReachedNotificationTimeout(long j8) {
            this.thresholdReachedNotificationTimeout = j8;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    private MemoryMonitorObserverConfig() {
        this.sendAppRunningInBackgroundNotification = true;
        this.maxUsedMemoryPercentThreshold = 75L;
        this.maxUsedMemoryThreshold = 0L;
        this.thresholdReachedNotificationTimeout = 300000L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MemoryMonitorObserverConfig.class != obj.getClass()) {
            return false;
        }
        MemoryMonitorObserverConfig memoryMonitorObserverConfig = (MemoryMonitorObserverConfig) obj;
        return this.sendAppRunningInBackgroundNotification == memoryMonitorObserverConfig.sendAppRunningInBackgroundNotification && this.maxUsedMemoryPercentThreshold == memoryMonitorObserverConfig.maxUsedMemoryPercentThreshold && this.maxUsedMemoryThreshold == memoryMonitorObserverConfig.maxUsedMemoryThreshold && this.thresholdReachedNotificationTimeout == memoryMonitorObserverConfig.thresholdReachedNotificationTimeout;
    }

    public long getMaxUsedMemoryPercentThreshold() {
        return this.maxUsedMemoryPercentThreshold;
    }

    public long getMaxUsedMemoryThreshold() {
        return this.maxUsedMemoryThreshold;
    }

    public boolean getSendAppRunningInBackgroundNotification() {
        return this.sendAppRunningInBackgroundNotification;
    }

    public long getThresholdReachedNotificationTimeout() {
        return this.thresholdReachedNotificationTimeout;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.sendAppRunningInBackgroundNotification), Long.valueOf(this.maxUsedMemoryPercentThreshold), Long.valueOf(this.maxUsedMemoryThreshold), Long.valueOf(this.thresholdReachedNotificationTimeout));
    }

    public Builder toBuilder() {
        return new Builder().sendAppRunningInBackgroundNotification(this.sendAppRunningInBackgroundNotification).maxUsedMemoryPercentThreshold(this.maxUsedMemoryPercentThreshold).maxUsedMemoryThreshold(this.maxUsedMemoryThreshold).thresholdReachedNotificationTimeout(this.thresholdReachedNotificationTimeout);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[sendAppRunningInBackgroundNotification: ");
        sb3.append(RecordUtils.fieldToString(Boolean.valueOf(this.sendAppRunningInBackgroundNotification)));
        sb3.append(", maxUsedMemoryPercentThreshold: ");
        com.google.protobuf.a.h(this.maxUsedMemoryPercentThreshold, ", maxUsedMemoryThreshold: ", sb3);
        com.google.protobuf.a.h(this.maxUsedMemoryThreshold, ", thresholdReachedNotificationTimeout: ", sb3);
        sb3.append(RecordUtils.fieldToString(Long.valueOf(this.thresholdReachedNotificationTimeout)));
        sb3.append("]");
        return sb3.toString();
    }

    private MemoryMonitorObserverConfig(boolean z14, long j8, long j14, long j15) {
        this.sendAppRunningInBackgroundNotification = z14;
        this.maxUsedMemoryPercentThreshold = j8;
        this.maxUsedMemoryThreshold = j14;
        this.thresholdReachedNotificationTimeout = j15;
    }
}
