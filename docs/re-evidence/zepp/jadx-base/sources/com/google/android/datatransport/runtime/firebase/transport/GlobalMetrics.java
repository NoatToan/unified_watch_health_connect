package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class GlobalMetrics {
    private static final GlobalMetrics b = new Builder().build();
    private final StorageMetrics a;

    public static final class Builder {
        private StorageMetrics a = null;

        public GlobalMetrics build() {
            return new GlobalMetrics(this.a);
        }

        public Builder setStorageMetrics(StorageMetrics storageMetrics) {
            this.a = storageMetrics;
            return this;
        }
    }

    public GlobalMetrics(StorageMetrics storageMetrics) {
        this.a = storageMetrics;
    }

    public static GlobalMetrics getDefaultInstance() {
        return b;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Encodable.Ignore
    public StorageMetrics getStorageMetrics() {
        StorageMetrics storageMetrics = this.a;
        return storageMetrics == null ? StorageMetrics.getDefaultInstance() : storageMetrics;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "storageMetrics")
    public StorageMetrics getStorageMetricsInternal() {
        return this.a;
    }
}
