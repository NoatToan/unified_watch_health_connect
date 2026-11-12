package com.xiaomi.hm.health.bt.model.starsky;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sky.lib.constant.WebConstant;
import defpackage.b;
import kotlin.Metadata;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/starsky/StarSkyRrInterval;", "", "", "toString", "", "component1", "", "component2", "timestamp", WebConstant.QueryParam.RR_INTERVAL, "copy", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", LogUtil.I, "getRrInterval", "()I", "<init>", "(JI)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StarSkyRrInterval {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int rrInterval;

    public StarSkyRrInterval(long j, int i) {
        this.timestamp = j;
        this.rrInterval = i;
    }

    public static /* synthetic */ StarSkyRrInterval copy$default(StarSkyRrInterval starSkyRrInterval, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = starSkyRrInterval.timestamp;
        }
        if ((i2 & 2) != 0) {
            i = starSkyRrInterval.rrInterval;
        }
        return starSkyRrInterval.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRrInterval() {
        return this.rrInterval;
    }

    @NotNull
    public final StarSkyRrInterval copy(long timestamp, int rrInterval) {
        return new StarSkyRrInterval(timestamp, rrInterval);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StarSkyRrInterval)) {
            return false;
        }
        StarSkyRrInterval starSkyRrInterval = (StarSkyRrInterval) other;
        return this.timestamp == starSkyRrInterval.timestamp && this.rrInterval == starSkyRrInterval.rrInterval;
    }

    public final int getRrInterval() {
        return this.rrInterval;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (b.a(this.timestamp) * 31) + this.rrInterval;
    }

    @NotNull
    public String toString() {
        return "StarSkyRrInterval<timestamp=" + this.timestamp + ", rrInterval=" + this.rrInterval + Typography.greater;
    }
}
