package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class StorageMetrics {
    private static final StorageMetrics c = new Builder().build();
    private final long a;
    private final long b;

    public static final class Builder {
        private long a = 0;
        private long b = 0;

        public StorageMetrics build() {
            return new StorageMetrics(this.a, this.b);
        }

        public Builder setCurrentCacheSizeBytes(long j) {
            this.a = j;
            return this;
        }

        public Builder setMaxCacheSizeBytes(long j) {
            this.b = j;
            return this;
        }
    }

    public StorageMetrics(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static StorageMetrics getDefaultInstance() {
        return c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 1)
    public long getCurrentCacheSizeBytes() {
        return this.a;
    }

    @Protobuf(tag = 2)
    public long getMaxCacheSizeBytes() {
        return this.b;
    }
}
