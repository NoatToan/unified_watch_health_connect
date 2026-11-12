package com.xiaomi.eco.connection;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/eco/connection/LimitTimesStrategy;", "Lcom/xiaomi/eco/connection/RetryStrategy;", "interval", "", "limit", "<init>", "(II)V", "getInterval", "()I", "getLimit", "retryCount", "retryStart", "", "getNextBackoff", "getRetryCount", "overLimit", "", "reset", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LimitTimesStrategy implements RetryStrategy {
    private final int interval;
    private final int limit;
    private int retryCount;

    public LimitTimesStrategy(int i, int i2) {
        this.interval = i;
        this.limit = i2;
    }

    public final int getInterval() {
        return this.interval;
    }

    public final int getLimit() {
        return this.limit;
    }

    @Override // com.xiaomi.eco.connection.RetryStrategy
    public int getNextBackoff() {
        this.retryCount++;
        return this.interval;
    }

    @Override // com.xiaomi.eco.connection.RetryStrategy
    public int getRetryCount() {
        return this.retryCount;
    }

    @Override // com.xiaomi.eco.connection.RetryStrategy
    public boolean overLimit() {
        return this.retryCount >= this.limit;
    }

    @Override // com.xiaomi.eco.connection.RetryStrategy
    public void reset() {
        this.retryCount = 0;
    }

    @Override // com.xiaomi.eco.connection.RetryStrategy
    public void retryStart() {
    }
}
