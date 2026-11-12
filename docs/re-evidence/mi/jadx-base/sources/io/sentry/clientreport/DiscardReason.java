package io.sentry.clientreport;

import com.xiaomi.passport.StatConstants;
import org.jetbrains.annotations.ApiStatus;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public enum DiscardReason {
    QUEUE_OVERFLOW("queue_overflow"),
    CACHE_OVERFLOW("cache_overflow"),
    RATELIMIT_BACKOFF("ratelimit_backoff"),
    NETWORK_ERROR(StatConstants.ERROR_NETWORK),
    SAMPLE_RATE("sample_rate"),
    BEFORE_SEND("before_send"),
    EVENT_PROCESSOR("event_processor"),
    BACKPRESSURE("backpressure");

    private final String reason;

    DiscardReason(String str) {
        this.reason = str;
    }

    public String getReason() {
        return this.reason;
    }
}
