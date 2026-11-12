package androidx.health.connect.client.records;

import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.units.Length;
import androidx.health.connect.client.units.LengthKt;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Landroidx/health/connect/client/records/DistanceRecord;", "Landroidx/health/connect/client/records/IntervalRecord;", "startTime", "Ljava/time/Instant;", "startZoneOffset", "Ljava/time/ZoneOffset;", "endTime", "endZoneOffset", "distance", "Landroidx/health/connect/client/units/Length;", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/units/Length;Landroidx/health/connect/client/records/metadata/Metadata;)V", "getStartTime", "()Ljava/time/Instant;", "getStartZoneOffset", "()Ljava/time/ZoneOffset;", "getEndTime", "getEndZoneOffset", "getDistance", "()Landroidx/health/connect/client/units/Length;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DistanceRecord implements IntervalRecord {
    private final Length distance;
    private final Instant endTime;
    private final ZoneOffset endZoneOffset;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final Instant startTime;
    private final ZoneOffset startZoneOffset;
    private static final Length MAX_DISTANCE = LengthKt.getMeters(4.940656E-318d);
    public static final AggregateMetric<Length> DISTANCE_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release("Distance", AggregateMetric.AggregationType.TOTAL, "distance", new DistanceRecord$Companion$DISTANCE_TOTAL$1(Length.INSTANCE));

    public DistanceRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, Length length, androidx.health.connect.client.records.metadata.Metadata metadata) {
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(length, "");
        zcp.c(metadata, "");
        this.startTime = instant;
        this.startZoneOffset = zoneOffset;
        this.endTime = instant2;
        this.endZoneOffset = zoneOffset2;
        this.distance = length;
        this.metadata = metadata;
        Length length2 = length;
        UtilsKt.requireNotLess(length2, length.zero$connect_client_release(), "distance");
        UtilsKt.requireNotMore(length2, MAX_DISTANCE, "distance");
        if (!getStartTime().isBefore(getEndTime())) {
            throw new IllegalArgumentException("startTime must be before endTime.".toString());
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

    public final Length getDistance() {
        return this.distance;
    }

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DistanceRecord)) {
            return false;
        }
        DistanceRecord distanceRecord = (DistanceRecord) other;
        return zcp.b(this.distance, distanceRecord.distance) && zcp.b(getStartTime(), distanceRecord.getStartTime()) && zcp.b(getStartZoneOffset(), distanceRecord.getStartZoneOffset()) && zcp.b(getEndTime(), distanceRecord.getEndTime()) && zcp.b(getEndZoneOffset(), distanceRecord.getEndZoneOffset()) && zcp.b(getMetadata(), distanceRecord.getMetadata()) && this.distance.getMeters() == distanceRecord.distance.getMeters();
    }

    public int hashCode() {
        int iHashCode = this.distance.hashCode();
        int iHashCode2 = getStartTime().hashCode();
        ZoneOffset startZoneOffset = getStartZoneOffset();
        int iHashCode3 = startZoneOffset != null ? startZoneOffset.hashCode() : 0;
        int iHashCode4 = getEndTime().hashCode();
        ZoneOffset endZoneOffset = getEndZoneOffset();
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (endZoneOffset != null ? endZoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode()) * 31) + Double.hashCode(this.distance.getMeters());
    }

    public String toString() {
        return "DistanceRecord(startTime=" + getStartTime() + ", startZoneOffset=" + getStartZoneOffset() + ", endTime=" + getEndTime() + ", endZoneOffset=" + getEndZoneOffset() + ", distance=" + this.distance + ", metadata=" + getMetadata() + g4.l;
    }
}
