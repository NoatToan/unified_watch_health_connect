package org.junit.runners.model;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes23.dex */
public class TestTimedOutException extends Exception {
    private static final long serialVersionUID = 31935685163547539L;
    private final TimeUnit a;
    private final long b;

    public TestTimedOutException(long j, TimeUnit timeUnit) {
        super(String.format("test timed out after %d %s", Long.valueOf(j), timeUnit.name().toLowerCase()));
        this.a = timeUnit;
        this.b = j;
    }

    public TimeUnit getTimeUnit() {
        return this.a;
    }

    public long getTimeout() {
        return this.b;
    }
}
