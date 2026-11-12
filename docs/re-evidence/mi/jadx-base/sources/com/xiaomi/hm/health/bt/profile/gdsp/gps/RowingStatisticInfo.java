package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RowingStatisticInfo;", "Ljava/io/Serializable;", "avgFreq", "", "maxFreq", "avgPullingTime", "", "avgPaddleTime", "(IIFF)V", "getAvgFreq", "()I", "getAvgPaddleTime", "()F", "getAvgPullingTime", "getMaxFreq", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RowingStatisticInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private final int avgFreq;
    private final float avgPaddleTime;
    private final float avgPullingTime;
    private final int maxFreq;

    public RowingStatisticInfo(int i, int i2, float f, float f2) {
        this.avgFreq = i;
        this.maxFreq = i2;
        this.avgPullingTime = f;
        this.avgPaddleTime = f2;
    }

    public final int getAvgFreq() {
        return this.avgFreq;
    }

    public final float getAvgPaddleTime() {
        return this.avgPaddleTime;
    }

    public final float getAvgPullingTime() {
        return this.avgPullingTime;
    }

    public final int getMaxFreq() {
        return this.maxFreq;
    }
}
