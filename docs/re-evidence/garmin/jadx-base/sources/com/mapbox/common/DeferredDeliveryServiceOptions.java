package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class DeferredDeliveryServiceOptions implements Serializable {
    private final long batchFlushTimeout;
    private final long batchLengthToFlush;
    private final String dataStoragePath;
    private final Long maxStorageUsage;
    private final long memoryQueueFlushTimeout;
    private final long memoryQueueLengthToFlush;
    private final Long memoryQueueMaxLength;
    private final DeferredDeliveryOverflowPolicy memoryQueueOverflowPolicy;
    private final long persistentQueueFlushTimeout;
    private final long persistentQueueLengthToFlush;
    private final Long persistentQueueMaxLength;
    private final DeferredDeliveryOverflowPolicy persistentQueueOverflowPolicy;
    private final DeferredDeliveryOverflowPolicy storageOverflowPolicy;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public DeferredDeliveryServiceOptions(Long l14, Long l15, String str, Long l16) {
        this.memoryQueueMaxLength = l14;
        this.persistentQueueMaxLength = l15;
        this.dataStoragePath = str;
        this.maxStorageUsage = l16;
        this.batchLengthToFlush = 180L;
        this.batchFlushTimeout = 180000L;
        this.memoryQueueLengthToFlush = 180L;
        this.memoryQueueFlushTimeout = 180000L;
        DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy = DeferredDeliveryOverflowPolicy.RETIRE_OLDEST;
        this.memoryQueueOverflowPolicy = deferredDeliveryOverflowPolicy;
        this.persistentQueueLengthToFlush = 180L;
        this.persistentQueueFlushTimeout = 180000L;
        this.persistentQueueOverflowPolicy = deferredDeliveryOverflowPolicy;
        this.storageOverflowPolicy = DeferredDeliveryOverflowPolicy.DISCARD_INCOMING;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeferredDeliveryServiceOptions deferredDeliveryServiceOptions = (DeferredDeliveryServiceOptions) obj;
        return this.batchLengthToFlush == deferredDeliveryServiceOptions.batchLengthToFlush && this.batchFlushTimeout == deferredDeliveryServiceOptions.batchFlushTimeout && Objects.equals(this.memoryQueueMaxLength, deferredDeliveryServiceOptions.memoryQueueMaxLength) && this.memoryQueueLengthToFlush == deferredDeliveryServiceOptions.memoryQueueLengthToFlush && this.memoryQueueFlushTimeout == deferredDeliveryServiceOptions.memoryQueueFlushTimeout && Objects.equals(this.memoryQueueOverflowPolicy, deferredDeliveryServiceOptions.memoryQueueOverflowPolicy) && Objects.equals(this.persistentQueueMaxLength, deferredDeliveryServiceOptions.persistentQueueMaxLength) && this.persistentQueueLengthToFlush == deferredDeliveryServiceOptions.persistentQueueLengthToFlush && this.persistentQueueFlushTimeout == deferredDeliveryServiceOptions.persistentQueueFlushTimeout && Objects.equals(this.persistentQueueOverflowPolicy, deferredDeliveryServiceOptions.persistentQueueOverflowPolicy) && Objects.equals(this.dataStoragePath, deferredDeliveryServiceOptions.dataStoragePath) && Objects.equals(this.maxStorageUsage, deferredDeliveryServiceOptions.maxStorageUsage) && Objects.equals(this.storageOverflowPolicy, deferredDeliveryServiceOptions.storageOverflowPolicy);
    }

    public long getBatchFlushTimeout() {
        return this.batchFlushTimeout;
    }

    public long getBatchLengthToFlush() {
        return this.batchLengthToFlush;
    }

    public String getDataStoragePath() {
        return this.dataStoragePath;
    }

    public Long getMaxStorageUsage() {
        return this.maxStorageUsage;
    }

    public long getMemoryQueueFlushTimeout() {
        return this.memoryQueueFlushTimeout;
    }

    public long getMemoryQueueLengthToFlush() {
        return this.memoryQueueLengthToFlush;
    }

    public Long getMemoryQueueMaxLength() {
        return this.memoryQueueMaxLength;
    }

    public DeferredDeliveryOverflowPolicy getMemoryQueueOverflowPolicy() {
        return this.memoryQueueOverflowPolicy;
    }

    public long getPersistentQueueFlushTimeout() {
        return this.persistentQueueFlushTimeout;
    }

    public long getPersistentQueueLengthToFlush() {
        return this.persistentQueueLengthToFlush;
    }

    public Long getPersistentQueueMaxLength() {
        return this.persistentQueueMaxLength;
    }

    public DeferredDeliveryOverflowPolicy getPersistentQueueOverflowPolicy() {
        return this.persistentQueueOverflowPolicy;
    }

    public DeferredDeliveryOverflowPolicy getStorageOverflowPolicy() {
        return this.storageOverflowPolicy;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.batchLengthToFlush), Long.valueOf(this.batchFlushTimeout), this.memoryQueueMaxLength, Long.valueOf(this.memoryQueueLengthToFlush), Long.valueOf(this.memoryQueueFlushTimeout), this.memoryQueueOverflowPolicy, this.persistentQueueMaxLength, Long.valueOf(this.persistentQueueLengthToFlush), Long.valueOf(this.persistentQueueFlushTimeout), this.persistentQueueOverflowPolicy, this.dataStoragePath, this.maxStorageUsage, this.storageOverflowPolicy);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[batchLengthToFlush: ");
        com.google.protobuf.a.h(this.batchLengthToFlush, ", batchFlushTimeout: ", sb3);
        com.google.protobuf.a.h(this.batchFlushTimeout, ", memoryQueueMaxLength: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.memoryQueueMaxLength));
        sb3.append(", memoryQueueLengthToFlush: ");
        com.google.protobuf.a.h(this.memoryQueueLengthToFlush, ", memoryQueueFlushTimeout: ", sb3);
        com.google.protobuf.a.h(this.memoryQueueFlushTimeout, ", memoryQueueOverflowPolicy: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.memoryQueueOverflowPolicy));
        sb3.append(", persistentQueueMaxLength: ");
        sb3.append(RecordUtils.fieldToString(this.persistentQueueMaxLength));
        sb3.append(", persistentQueueLengthToFlush: ");
        com.google.protobuf.a.h(this.persistentQueueLengthToFlush, ", persistentQueueFlushTimeout: ", sb3);
        com.google.protobuf.a.h(this.persistentQueueFlushTimeout, ", persistentQueueOverflowPolicy: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.persistentQueueOverflowPolicy));
        sb3.append(", dataStoragePath: ");
        com.google.protobuf.a.k(this.dataStoragePath, ", maxStorageUsage: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.maxStorageUsage));
        sb3.append(", storageOverflowPolicy: ");
        sb3.append(RecordUtils.fieldToString(this.storageOverflowPolicy));
        sb3.append("]");
        return sb3.toString();
    }

    public DeferredDeliveryServiceOptions(long j8, long j14, Long l14, long j15, long j16, DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy, Long l15, long j17, long j18, DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy2, String str, Long l16, DeferredDeliveryOverflowPolicy deferredDeliveryOverflowPolicy3) {
        this.batchLengthToFlush = j8;
        this.batchFlushTimeout = j14;
        this.memoryQueueMaxLength = l14;
        this.memoryQueueLengthToFlush = j15;
        this.memoryQueueFlushTimeout = j16;
        this.memoryQueueOverflowPolicy = deferredDeliveryOverflowPolicy;
        this.persistentQueueMaxLength = l15;
        this.persistentQueueLengthToFlush = j17;
        this.persistentQueueFlushTimeout = j18;
        this.persistentQueueOverflowPolicy = deferredDeliveryOverflowPolicy2;
        this.dataStoragePath = str;
        this.maxStorageUsage = l16;
        this.storageOverflowPolicy = deferredDeliveryOverflowPolicy3;
    }
}
