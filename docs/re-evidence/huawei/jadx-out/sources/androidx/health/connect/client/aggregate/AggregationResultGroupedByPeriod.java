package androidx.health.connect.client.aggregate;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import java.time.LocalDateTime;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0016"}, d2 = {"Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "", "result", "Landroidx/health/connect/client/aggregate/AggregationResult;", "startTime", "Ljava/time/LocalDateTime;", "endTime", "shouldSkipValidation", "", "<init>", "(Landroidx/health/connect/client/aggregate/AggregationResult;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;Z)V", "getResult", "()Landroidx/health/connect/client/aggregate/AggregationResult;", "getStartTime", "()Ljava/time/LocalDateTime;", "getEndTime", "equals", "other", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AggregationResultGroupedByPeriod {
    private final LocalDateTime endTime;
    private final AggregationResult result;
    private final LocalDateTime startTime;

    public AggregationResultGroupedByPeriod(AggregationResult aggregationResult, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z) {
        zcp.c(aggregationResult, "");
        zcp.c(localDateTime, "");
        zcp.c(localDateTime2, "");
        this.result = aggregationResult;
        this.startTime = localDateTime;
        this.endTime = localDateTime2;
        if (!z && !localDateTime.isBefore(localDateTime2)) {
            throw new IllegalArgumentException("start time must be before end time".toString());
        }
    }

    public /* synthetic */ AggregationResultGroupedByPeriod(AggregationResult aggregationResult, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z, int i, zcm zcmVar) {
        this(aggregationResult, localDateTime, localDateTime2, (i & 8) != 0 ? false : z);
    }

    public final AggregationResult getResult() {
        return this.result;
    }

    public final LocalDateTime getStartTime() {
        return this.startTime;
    }

    public final LocalDateTime getEndTime() {
        return this.endTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!zcp.b(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        zcp.e(other, "");
        AggregationResultGroupedByPeriod aggregationResultGroupedByPeriod = (AggregationResultGroupedByPeriod) other;
        return zcp.b(this.result, aggregationResultGroupedByPeriod.result) && zcp.b(this.startTime, aggregationResultGroupedByPeriod.startTime) && zcp.b(this.endTime, aggregationResultGroupedByPeriod.endTime);
    }

    public int hashCode() {
        return (((this.result.hashCode() * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode();
    }

    public String toString() {
        return "AggregationResultGroupedByPeriod(result=" + this.result + ", startTime=" + this.startTime + ", endTime=" + this.endTime + g4.l;
    }
}
