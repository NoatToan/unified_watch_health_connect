package androidx.health.connect.client.impl.platform.aggregate;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;
import java.time.Instant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Landroidx/health/connect/client/impl/platform/aggregate/InstantTimeRange;", "Landroidx/health/connect/client/impl/platform/aggregate/TimeRange;", "Ljava/time/Instant;", "startTime", "endTime", "<init>", "(Ljava/time/Instant;Ljava/time/Instant;)V", "getStartTime", "()Ljava/time/Instant;", "getEndTime", "component1", "component2", "copy", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InstantTimeRange implements TimeRange<Instant> {
    private final Instant endTime;
    private final Instant startTime;

    public InstantTimeRange(Instant instant, Instant instant2) {
        zcp.c(instant, "");
        zcp.c(instant2, "");
        this.startTime = instant;
        this.endTime = instant2;
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.TimeRange
    public Instant getStartTime() {
        return this.startTime;
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.TimeRange
    public Instant getEndTime() {
        return this.endTime;
    }

    public String toString() {
        return "InstantTimeRange(startTime=" + this.startTime + ", endTime=" + this.endTime + g4.l;
    }

    public int hashCode() {
        return (this.startTime.hashCode() * 31) + this.endTime.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstantTimeRange)) {
            return false;
        }
        InstantTimeRange instantTimeRange = (InstantTimeRange) other;
        return zcp.b(this.startTime, instantTimeRange.startTime) && zcp.b(this.endTime, instantTimeRange.endTime);
    }

    public final InstantTimeRange copy(Instant startTime, Instant endTime) {
        zcp.c(startTime, "");
        zcp.c(endTime, "");
        return new InstantTimeRange(startTime, endTime);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Instant getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Instant getStartTime() {
        return this.startTime;
    }

    public static /* synthetic */ InstantTimeRange copy$default(InstantTimeRange instantTimeRange, Instant instant, Instant instant2, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = instantTimeRange.startTime;
        }
        if ((i & 2) != 0) {
            instant2 = instantTimeRange.endTime;
        }
        return instantTimeRange.copy(instant, instant2);
    }
}
