package androidx.health.connect.client.impl.platform.aggregate;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;
import java.time.LocalDateTime;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Landroidx/health/connect/client/impl/platform/aggregate/LocalTimeRange;", "Landroidx/health/connect/client/impl/platform/aggregate/TimeRange;", "Ljava/time/LocalDateTime;", "startTime", "endTime", "<init>", "(Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)V", "getStartTime", "()Ljava/time/LocalDateTime;", "getEndTime", "component1", "component2", "copy", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocalTimeRange implements TimeRange<LocalDateTime> {
    private final LocalDateTime endTime;
    private final LocalDateTime startTime;

    public LocalTimeRange(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        zcp.c(localDateTime, "");
        zcp.c(localDateTime2, "");
        this.startTime = localDateTime;
        this.endTime = localDateTime2;
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.TimeRange
    public LocalDateTime getStartTime() {
        return this.startTime;
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.TimeRange
    public LocalDateTime getEndTime() {
        return this.endTime;
    }

    public String toString() {
        return "LocalTimeRange(startTime=" + this.startTime + ", endTime=" + this.endTime + g4.l;
    }

    public int hashCode() {
        return (this.startTime.hashCode() * 31) + this.endTime.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalTimeRange)) {
            return false;
        }
        LocalTimeRange localTimeRange = (LocalTimeRange) other;
        return zcp.b(this.startTime, localTimeRange.startTime) && zcp.b(this.endTime, localTimeRange.endTime);
    }

    public final LocalTimeRange copy(LocalDateTime startTime, LocalDateTime endTime) {
        zcp.c(startTime, "");
        zcp.c(endTime, "");
        return new LocalTimeRange(startTime, endTime);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LocalDateTime getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LocalDateTime getStartTime() {
        return this.startTime;
    }

    public static /* synthetic */ LocalTimeRange copy$default(LocalTimeRange localTimeRange, LocalDateTime localDateTime, LocalDateTime localDateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            localDateTime = localTimeRange.startTime;
        }
        if ((i & 2) != 0) {
            localDateTime2 = localTimeRange.endTime;
        }
        return localTimeRange.copy(localDateTime, localDateTime2);
    }
}
