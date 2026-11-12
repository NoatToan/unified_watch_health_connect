package androidx.health.connect.client.records;

import android.os.Build;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.impl.platform.records.RecordConvertersKt;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Landroidx/health/connect/client/records/WheelchairPushesRecord;", "Landroidx/health/connect/client/records/IntervalRecord;", "startTime", "Ljava/time/Instant;", "startZoneOffset", "Ljava/time/ZoneOffset;", "endTime", "endZoneOffset", "count", "", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;JLandroidx/health/connect/client/records/metadata/Metadata;)V", "getStartTime", "()Ljava/time/Instant;", "getStartZoneOffset", "()Ljava/time/ZoneOffset;", "getEndTime", "getEndZoneOffset", "getCount", "()J", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WheelchairPushesRecord implements IntervalRecord {
    private final long count;
    private final Instant endTime;
    private final ZoneOffset endZoneOffset;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final Instant startTime;
    private final ZoneOffset startZoneOffset;
    public static final AggregateMetric<Long> COUNT_TOTAL = AggregateMetric.INSTANCE.longMetric$connect_client_release("WheelchairPushes", AggregateMetric.AggregationType.TOTAL, "count");

    public WheelchairPushesRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, long j, androidx.health.connect.client.records.metadata.Metadata metadata) {
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
        this.startTime = instant;
        this.startZoneOffset = zoneOffset;
        this.endTime = instant2;
        this.endZoneOffset = zoneOffset2;
        this.count = j;
        this.metadata = metadata;
        if (!getStartTime().isBefore(getEndTime())) {
            throw new IllegalArgumentException("startTime must be before endTime.".toString());
        }
        if (Build.VERSION.SDK_INT >= 34) {
            RecordConvertersKt.toPlatformRecord(this);
        } else {
            UtilsKt.requireNonNegative(j, "count");
            UtilsKt.requireNotMore(Long.valueOf(j), (Comparable) 1000000L, "count");
        }
    }

    @Override // androidx.health.connect.client.records.IntervalRecord
    public Instant getStartTime() {
        return this.startTime;
    }

    @Override // androidx.health.connect.client.records.IntervalRecord
    public ZoneOffset getStartZoneOffset() {
        return this.startZoneOffset;
    }

    @Override // androidx.health.connect.client.records.IntervalRecord
    public Instant getEndTime() {
        return this.endTime;
    }

    @Override // androidx.health.connect.client.records.IntervalRecord
    public ZoneOffset getEndZoneOffset() {
        return this.endZoneOffset;
    }

    public final long getCount() {
        return this.count;
    }

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WheelchairPushesRecord)) {
            return false;
        }
        WheelchairPushesRecord wheelchairPushesRecord = (WheelchairPushesRecord) other;
        return this.count == wheelchairPushesRecord.count && zcp.b(getStartTime(), wheelchairPushesRecord.getStartTime()) && zcp.b(getStartZoneOffset(), wheelchairPushesRecord.getStartZoneOffset()) && zcp.b(getEndTime(), wheelchairPushesRecord.getEndTime()) && zcp.b(getEndZoneOffset(), wheelchairPushesRecord.getEndZoneOffset()) && zcp.b(getMetadata(), wheelchairPushesRecord.getMetadata());
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.count);
        ZoneOffset startZoneOffset = getStartZoneOffset();
        int iHashCode2 = startZoneOffset != null ? startZoneOffset.hashCode() : 0;
        int iHashCode3 = getEndTime().hashCode();
        ZoneOffset endZoneOffset = getEndZoneOffset();
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (endZoneOffset != null ? endZoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "WheelchairPushesRecord(startTime=" + getStartTime() + ", startZoneOffset=" + getStartZoneOffset() + ", endTime=" + getEndTime() + ", endZoneOffset=" + getEndZoneOffset() + ", count=" + this.count + ", metadata=" + getMetadata() + g4.l;
    }
}
