package com.xiaomi.wearable.connection;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/wearable/connection/ExponentialBackoffStrategy;", "Lcom/xiaomi/wearable/connection/RetryStrategy;", "baseInterval", "", "basePeriod", "maxInterval", "<init>", "(III)V", "mCurrentAttempt", "retryStart", "", "getNextBackoff", "getRetryCount", "overLimit", "", "reset", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ExponentialBackoffStrategy implements RetryStrategy {
    private final int baseInterval;
    private final int basePeriod;
    private int mCurrentAttempt;
    private final int maxInterval;

    public ExponentialBackoffStrategy(int i, int i2, int i3) {
        this.baseInterval = i;
        this.basePeriod = i2;
        this.maxInterval = i3;
        reset();
    }

    @Override // com.xiaomi.wearable.connection.RetryStrategy
    public int getNextBackoff() {
        int i = this.mCurrentAttempt;
        int i2 = this.basePeriod;
        if (i <= i2) {
            this.mCurrentAttempt = i + 1;
            return this.baseInterval;
        }
        int iPow = (int) Math.pow(this.baseInterval, (i - i2) + 1);
        this.mCurrentAttempt++;
        int i3 = this.maxInterval;
        return iPow < i3 ? iPow : i3;
    }

    @Override // com.xiaomi.wearable.connection.RetryStrategy
    public int getRetryCount() {
        return this.mCurrentAttempt - 1;
    }

    @Override // com.xiaomi.wearable.connection.RetryStrategy
    public boolean overLimit() {
        return false;
    }

    @Override // com.xiaomi.wearable.connection.RetryStrategy
    public void reset() {
        this.mCurrentAttempt = 1;
    }

    @Override // com.xiaomi.wearable.connection.RetryStrategy
    public void retryStart() {
    }
}
