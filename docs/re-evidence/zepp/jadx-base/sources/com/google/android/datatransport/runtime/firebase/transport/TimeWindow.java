package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeWindow {
    private static final TimeWindow c = new Builder().build();
    private final long a;
    private final long b;

    public static final class Builder {
        private long a = 0;
        private long b = 0;

        public TimeWindow build() {
            return new TimeWindow(this.a, this.b);
        }

        public Builder setEndMs(long j) {
            this.b = j;
            return this;
        }

        public Builder setStartMs(long j) {
            this.a = j;
            return this;
        }
    }

    public TimeWindow(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static TimeWindow getDefaultInstance() {
        return c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 2)
    public long getEndMs() {
        return this.b;
    }

    @Protobuf(tag = 1)
    public long getStartMs() {
        return this.a;
    }
}
