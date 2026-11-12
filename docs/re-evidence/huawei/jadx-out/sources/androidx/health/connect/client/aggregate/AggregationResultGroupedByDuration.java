package androidx.health.connect.client.aggregate;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "", "result", "Landroidx/health/connect/client/aggregate/AggregationResult;", "startTime", "Ljava/time/Instant;", "endTime", "zoneOffset", "Ljava/time/ZoneOffset;", "shouldSkipValidation", "", "<init>", "(Landroidx/health/connect/client/aggregate/AggregationResult;Ljava/time/Instant;Ljava/time/Instant;Ljava/time/ZoneOffset;Z)V", "getResult", "()Landroidx/health/connect/client/aggregate/AggregationResult;", "getStartTime", "()Ljava/time/Instant;", "getEndTime", "getZoneOffset", "()Ljava/time/ZoneOffset;", "equals", "other", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AggregationResultGroupedByDuration {
    private final Instant endTime;
    private final AggregationResult result;
    private final Instant startTime;
    private final ZoneOffset zoneOffset;

    public AggregationResultGroupedByDuration(AggregationResult aggregationResult, Instant instant, Instant instant2, ZoneOffset zoneOffset, boolean z) {
        zcp.c(aggregationResult, "");
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(zoneOffset, "");
        this.result = aggregationResult;
        this.startTime = instant;
        this.endTime = instant2;
        this.zoneOffset = zoneOffset;
        if (!z && !instant.isBefore(instant2)) {
            throw new IllegalArgumentException("start time must be before end time".toString());
        }
    }

    public /* synthetic */ AggregationResultGroupedByDuration(AggregationResult aggregationResult, Instant instant, Instant instant2, ZoneOffset zoneOffset, boolean z, int i, zcm zcmVar) {
        this(aggregationResult, instant, instant2, zoneOffset, (i & 16) != 0 ? false : z);
    }

    public final AggregationResult getResult() {
        return this.result;
    }

    public final Instant getStartTime() {
        return this.startTime;
    }

    public final Instant getEndTime() {
        return this.endTime;
    }

    public final ZoneOffset getZoneOffset() {
        return this.zoneOffset;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!zcp.b(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        zcp.e(other, "");
        AggregationResultGroupedByDuration aggregationResultGroupedByDuration = (AggregationResultGroupedByDuration) other;
        return zcp.b(this.result, aggregationResultGroupedByDuration.result) && zcp.b(this.startTime, aggregationResultGroupedByDuration.startTime) && zcp.b(this.endTime, aggregationResultGroupedByDuration.endTime) && zcp.b(this.zoneOffset, aggregationResultGroupedByDuration.zoneOffset);
    }

    public int hashCode() {
        int iHashCode = this.result.hashCode();
        return (((((iHashCode * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode()) * 31) + this.zoneOffset.hashCode();
    }

    public String toString() {
        return "AggregationResultGroupedByDuration(result=" + this.result + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", zoneOffset=" + this.zoneOffset + g4.l;
    }
}
