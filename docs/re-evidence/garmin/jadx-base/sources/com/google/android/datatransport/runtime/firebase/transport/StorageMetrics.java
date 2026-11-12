package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* JADX INFO: loaded from: classes13.dex */
public final class StorageMetrics {
    private static final StorageMetrics DEFAULT_INSTANCE = new Builder().build();
    private final long current_cache_size_bytes_;
    private final long max_cache_size_bytes_;

    public static final class Builder {
        private long current_cache_size_bytes_ = 0;
        private long max_cache_size_bytes_ = 0;

        public StorageMetrics build() {
            return new StorageMetrics(this.current_cache_size_bytes_, this.max_cache_size_bytes_);
        }

        public Builder setCurrentCacheSizeBytes(long j8) {
            this.current_cache_size_bytes_ = j8;
            return this;
        }

        public Builder setMaxCacheSizeBytes(long j8) {
            this.max_cache_size_bytes_ = j8;
            return this;
        }
    }

    public StorageMetrics(long j8, long j14) {
        this.current_cache_size_bytes_ = j8;
        this.max_cache_size_bytes_ = j14;
    }

    public static StorageMetrics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 1)
    public long getCurrentCacheSizeBytes() {
        return this.current_cache_size_bytes_;
    }

    @Protobuf(tag = 2)
    public long getMaxCacheSizeBytes() {
        return this.max_cache_size_bytes_;
    }
}
