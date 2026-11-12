package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RowingStatisticInfo;", "Ljava/io/Serializable;", "", "a", LogUtil.I, "getAvgFreq", "()I", "avgFreq", "b", "getMaxFreq", "maxFreq", "", "c", "F", "getAvgPullingTime", "()F", "avgPullingTime", GoogleApiAvailabilityLight.a, "getAvgPaddleTime", "avgPaddleTime", "<init>", "(IIFF)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class RowingStatisticInfo implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int avgFreq;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int maxFreq;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float avgPullingTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float avgPaddleTime;

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
