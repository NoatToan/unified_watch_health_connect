package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class LogSourceMetrics {
    private static final LogSourceMetrics c = new Builder().build();
    private final String a;
    private final List<LogEventDropped> b;

    public static final class Builder {
        private String a = "";
        private List<LogEventDropped> b = new ArrayList();

        public Builder addLogEventDropped(LogEventDropped logEventDropped) {
            this.b.add(logEventDropped);
            return this;
        }

        public LogSourceMetrics build() {
            return new LogSourceMetrics(this.a, Collections.unmodifiableList(this.b));
        }

        public Builder setLogEventDroppedList(List<LogEventDropped> list) {
            this.b = list;
            return this;
        }

        public Builder setLogSource(String str) {
            this.a = str;
            return this;
        }
    }

    public LogSourceMetrics(String str, List<LogEventDropped> list) {
        this.a = str;
        this.b = list;
    }

    public static LogSourceMetrics getDefaultInstance() {
        return c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logEventDropped")
    public List<LogEventDropped> getLogEventDroppedList() {
        return this.b;
    }

    @Protobuf(tag = 1)
    public String getLogSource() {
        return this.a;
    }
}
