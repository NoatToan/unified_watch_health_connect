package androidx.health.connect.client.impl.platform.aggregate;

import androidx.health.connect.client.aggregate.AggregationResultGroupedByDuration;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;
import java.time.Instant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Landroidx/health/connect/client/impl/platform/aggregate/AggregationResultGroupedByDurationWithMinTime;", "", "aggregationResultGroupedByDuration", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "minTime", "Ljava/time/Instant;", "<init>", "(Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;Ljava/time/Instant;)V", "getAggregationResultGroupedByDuration", "()Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "getMinTime", "()Ljava/time/Instant;", "component1", "component2", "copy", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AggregationResultGroupedByDurationWithMinTime {
    private final AggregationResultGroupedByDuration aggregationResultGroupedByDuration;
    private final Instant minTime;

    public AggregationResultGroupedByDurationWithMinTime(AggregationResultGroupedByDuration aggregationResultGroupedByDuration, Instant instant) {
        zcp.c(aggregationResultGroupedByDuration, "");
        zcp.c(instant, "");
        this.aggregationResultGroupedByDuration = aggregationResultGroupedByDuration;
        this.minTime = instant;
    }

    public final AggregationResultGroupedByDuration getAggregationResultGroupedByDuration() {
        return this.aggregationResultGroupedByDuration;
    }

    public final Instant getMinTime() {
        return this.minTime;
    }

    public String toString() {
        return "AggregationResultGroupedByDurationWithMinTime(aggregationResultGroupedByDuration=" + this.aggregationResultGroupedByDuration + ", minTime=" + this.minTime + g4.l;
    }

    public int hashCode() {
        return (this.aggregationResultGroupedByDuration.hashCode() * 31) + this.minTime.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AggregationResultGroupedByDurationWithMinTime)) {
            return false;
        }
        AggregationResultGroupedByDurationWithMinTime aggregationResultGroupedByDurationWithMinTime = (AggregationResultGroupedByDurationWithMinTime) other;
        return zcp.b(this.aggregationResultGroupedByDuration, aggregationResultGroupedByDurationWithMinTime.aggregationResultGroupedByDuration) && zcp.b(this.minTime, aggregationResultGroupedByDurationWithMinTime.minTime);
    }

    public final AggregationResultGroupedByDurationWithMinTime copy(AggregationResultGroupedByDuration aggregationResultGroupedByDuration, Instant minTime) {
        zcp.c(aggregationResultGroupedByDuration, "");
        zcp.c(minTime, "");
        return new AggregationResultGroupedByDurationWithMinTime(aggregationResultGroupedByDuration, minTime);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Instant getMinTime() {
        return this.minTime;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AggregationResultGroupedByDuration getAggregationResultGroupedByDuration() {
        return this.aggregationResultGroupedByDuration;
    }

    public static /* synthetic */ AggregationResultGroupedByDurationWithMinTime copy$default(AggregationResultGroupedByDurationWithMinTime aggregationResultGroupedByDurationWithMinTime, AggregationResultGroupedByDuration aggregationResultGroupedByDuration, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            aggregationResultGroupedByDuration = aggregationResultGroupedByDurationWithMinTime.aggregationResultGroupedByDuration;
        }
        if ((i & 2) != 0) {
            instant = aggregationResultGroupedByDurationWithMinTime.minTime;
        }
        return aggregationResultGroupedByDurationWithMinTime.copy(aggregationResultGroupedByDuration, instant);
    }
}
