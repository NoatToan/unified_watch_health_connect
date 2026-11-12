package com.google.android.datatransport.runtime.scheduling.persistence;

import am.j;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes13.dex */
final class AutoValue_EventStoreConfig extends EventStoreConfig {
    private final int criticalSectionEnterTimeoutMs;
    private final long eventCleanUpAge;
    private final int loadBatchSize;
    private final int maxBlobByteSizePerRow;
    private final long maxStorageSizeInBytes;

    public static final class Builder extends EventStoreConfig.Builder {
        private Integer criticalSectionEnterTimeoutMs;
        private Long eventCleanUpAge;
        private Integer loadBatchSize;
        private Integer maxBlobByteSizePerRow;
        private Long maxStorageSizeInBytes;

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig build() {
            String strConcat = this.maxStorageSizeInBytes == null ? " maxStorageSizeInBytes" : "";
            if (this.loadBatchSize == null) {
                strConcat = strConcat.concat(" loadBatchSize");
            }
            if (this.criticalSectionEnterTimeoutMs == null) {
                strConcat = strConcat.concat(" criticalSectionEnterTimeoutMs");
            }
            if (this.eventCleanUpAge == null) {
                strConcat = strConcat.concat(" eventCleanUpAge");
            }
            if (this.maxBlobByteSizePerRow == null) {
                strConcat = strConcat.concat(" maxBlobByteSizePerRow");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_EventStoreConfig(this.maxStorageSizeInBytes.longValue(), this.loadBatchSize.intValue(), this.criticalSectionEnterTimeoutMs.intValue(), this.eventCleanUpAge.longValue(), this.maxBlobByteSizePerRow.intValue());
            }
            vb.h.z("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setCriticalSectionEnterTimeoutMs(int i14) {
            this.criticalSectionEnterTimeoutMs = Integer.valueOf(i14);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setEventCleanUpAge(long j8) {
            this.eventCleanUpAge = Long.valueOf(j8);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setLoadBatchSize(int i14) {
            this.loadBatchSize = Integer.valueOf(i14);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setMaxBlobByteSizePerRow(int i14) {
            this.maxBlobByteSizePerRow = Integer.valueOf(i14);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        public EventStoreConfig.Builder setMaxStorageSizeInBytes(long j8) {
            this.maxStorageSizeInBytes = Long.valueOf(j8);
            return this;
        }
    }

    private AutoValue_EventStoreConfig(long j8, int i14, int i15, long j14, int i16) {
        this.maxStorageSizeInBytes = j8;
        this.loadBatchSize = i14;
        this.criticalSectionEnterTimeoutMs = i15;
        this.eventCleanUpAge = j14;
        this.maxBlobByteSizePerRow = i16;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EventStoreConfig) {
            EventStoreConfig eventStoreConfig = (EventStoreConfig) obj;
            if (this.maxStorageSizeInBytes == eventStoreConfig.getMaxStorageSizeInBytes() && this.loadBatchSize == eventStoreConfig.getLoadBatchSize() && this.criticalSectionEnterTimeoutMs == eventStoreConfig.getCriticalSectionEnterTimeoutMs() && this.eventCleanUpAge == eventStoreConfig.getEventCleanUpAge() && this.maxBlobByteSizePerRow == eventStoreConfig.getMaxBlobByteSizePerRow()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public int getCriticalSectionEnterTimeoutMs() {
        return this.criticalSectionEnterTimeoutMs;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public long getEventCleanUpAge() {
        return this.eventCleanUpAge;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public int getLoadBatchSize() {
        return this.loadBatchSize;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public int getMaxBlobByteSizePerRow() {
        return this.maxBlobByteSizePerRow;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public long getMaxStorageSizeInBytes() {
        return this.maxStorageSizeInBytes;
    }

    public int hashCode() {
        long j8 = this.maxStorageSizeInBytes;
        int i14 = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.loadBatchSize) * 1000003) ^ this.criticalSectionEnterTimeoutMs) * 1000003;
        long j14 = this.eventCleanUpAge;
        return ((i14 ^ ((int) ((j14 >>> 32) ^ j14))) * 1000003) ^ this.maxBlobByteSizePerRow;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb3.append(this.maxStorageSizeInBytes);
        sb3.append(", loadBatchSize=");
        sb3.append(this.loadBatchSize);
        sb3.append(", criticalSectionEnterTimeoutMs=");
        sb3.append(this.criticalSectionEnterTimeoutMs);
        sb3.append(", eventCleanUpAge=");
        sb3.append(this.eventCleanUpAge);
        sb3.append(", maxBlobByteSizePerRow=");
        return j.q(sb3, this.maxBlobByteSizePerRow, StringSubstitutor.DEFAULT_VAR_END);
    }
}
