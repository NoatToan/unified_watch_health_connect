package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class LogEventDropped {
    private static final LogEventDropped c = new Builder().build();
    private final long a;
    private final Reason b;

    public static final class Builder {
        private long a = 0;
        private Reason b = Reason.REASON_UNKNOWN;

        public LogEventDropped build() {
            return new LogEventDropped(this.a, this.b);
        }

        public Builder setEventsDroppedCount(long j) {
            this.a = j;
            return this;
        }

        public Builder setReason(Reason reason) {
            this.b = reason;
            return this;
        }
    }

    public enum Reason implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        Reason(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    public LogEventDropped(long j, Reason reason) {
        this.a = j;
        this.b = reason;
    }

    public static LogEventDropped getDefaultInstance() {
        return c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 1)
    public long getEventsDroppedCount() {
        return this.a;
    }

    @Protobuf(tag = 3)
    public Reason getReason() {
        return this.b;
    }
}
