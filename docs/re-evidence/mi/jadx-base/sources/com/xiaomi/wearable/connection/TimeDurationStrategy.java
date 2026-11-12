package com.xiaomi.wearable.connection;

import com.xiaomi.wearable.core.CoreExtKt;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/wearable/connection/TimeDurationStrategy;", "Lcom/xiaomi/wearable/connection/ExponentialBackoffStrategy;", "timeDurationMinute", "", "baseInterval", "basePeriod", "maxInterval", "<init>", "(IIII)V", "retryStart", "", "getRetryStart", "()J", "setRetryStart", "(J)V", "", "getNextBackoff", "getRetryCount", "overLimit", "", "reset", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimeDurationStrategy extends ExponentialBackoffStrategy {

    @NotNull
    private static final String TAG = "TimeDurationStrategy";
    private long retryStart;
    private final int timeDurationMinute;

    public TimeDurationStrategy(int i, int i2, int i3, int i4) {
        super(i2, i3, i4);
        this.timeDurationMinute = i;
    }

    @Override // com.xiaomi.wearable.connection.ExponentialBackoffStrategy, com.xiaomi.wearable.connection.RetryStrategy
    public int getNextBackoff() {
        return super.getNextBackoff();
    }

    @Override // com.xiaomi.wearable.connection.ExponentialBackoffStrategy, com.xiaomi.wearable.connection.RetryStrategy
    public int getRetryCount() {
        return super.getRetryCount();
    }

    public final long getRetryStart() {
        return this.retryStart;
    }

    @Override // com.xiaomi.wearable.connection.ExponentialBackoffStrategy, com.xiaomi.wearable.connection.RetryStrategy
    public boolean overLimit() {
        boolean z = System.currentTimeMillis() - this.retryStart >= TimeUnit.MINUTES.toMillis((long) this.timeDurationMinute);
        CoreExtKt.getLogger().i(TAG, "overLimit: " + z);
        return z;
    }

    @Override // com.xiaomi.wearable.connection.ExponentialBackoffStrategy, com.xiaomi.wearable.connection.RetryStrategy
    public void reset() {
        super.reset();
        this.retryStart = 0L;
    }

    @Override // com.xiaomi.wearable.connection.ExponentialBackoffStrategy, com.xiaomi.wearable.connection.RetryStrategy
    public void retryStart() {
        this.retryStart = System.currentTimeMillis();
    }

    public final void setRetryStart(long j) {
        this.retryStart = j;
    }
}
