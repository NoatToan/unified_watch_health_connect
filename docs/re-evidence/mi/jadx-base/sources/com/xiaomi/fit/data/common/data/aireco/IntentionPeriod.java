package com.xiaomi.fit.data.common.data.aireco;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/data/common/data/aireco/IntentionPeriod;", "", "startTime", "", "endTime", "<init>", "(JJ)V", "getStartTime", "()J", "getEndTime", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntentionPeriod {
    private final long endTime;
    private final long startTime;

    public IntentionPeriod(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }
}
