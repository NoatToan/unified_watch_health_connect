package androidx.health.connect.client.records;

import android.os.Build;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.impl.platform.records.RecordConvertersKt;
import androidx.health.connect.client.units.Length;
import androidx.health.connect.client.units.LengthKt;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Landroidx/health/connect/client/records/HeightRecord;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "time", "Ljava/time/Instant;", "zoneOffset", "Ljava/time/ZoneOffset;", "height", "Landroidx/health/connect/client/units/Length;", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/units/Length;Landroidx/health/connect/client/records/metadata/Metadata;)V", "getTime", "()Ljava/time/Instant;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "getHeight", "()Landroidx/health/connect/client/units/Length;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeightRecord implements InstantaneousRecord {
    private static final String HEIGHT_FIELD_NAME = "height";
    private final Length height;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final Instant time;
    private final ZoneOffset zoneOffset;
    private static final Length MAX_HEIGHT = LengthKt.getMeters(1.5E-323d);
    private static final String HEIGHT_NAME = "Height";
    public static final AggregateMetric<Length> HEIGHT_AVG = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(HEIGHT_NAME, AggregateMetric.AggregationType.AVERAGE, "height", new HeightRecord$Companion$HEIGHT_AVG$1(Length.INSTANCE));
    public static final AggregateMetric<Length> HEIGHT_MIN = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(HEIGHT_NAME, AggregateMetric.AggregationType.MINIMUM, "height", new HeightRecord$Companion$HEIGHT_MIN$1(Length.INSTANCE));
    public static final AggregateMetric<Length> HEIGHT_MAX = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(HEIGHT_NAME, AggregateMetric.AggregationType.MAXIMUM, "height", new HeightRecord$Companion$HEIGHT_MAX$1(Length.INSTANCE));

    public HeightRecord(Instant instant, ZoneOffset zoneOffset, Length length, androidx.health.connect.client.records.metadata.Metadata metadata) {
        zcp.c(instant, "");
        zcp.c(length, "");
        zcp.c(metadata, "");
        this.time = instant;
        this.zoneOffset = zoneOffset;
        this.height = length;
        this.metadata = metadata;
        if (Build.VERSION.SDK_INT >= 34) {
            RecordConvertersKt.toPlatformRecord(this);
            return;
        }
        Length length2 = length;
        UtilsKt.requireNotLess(length2, length.zero$connect_client_release(), "height");
        UtilsKt.requireNotMore(length2, MAX_HEIGHT, "height");
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public Instant getTime() {
        return this.time;
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public ZoneOffset getZoneOffset() {
        return this.zoneOffset;
    }

    public final Length getHeight() {
        return this.height;
    }

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeightRecord)) {
            return false;
        }
        HeightRecord heightRecord = (HeightRecord) other;
        return zcp.b(this.height, heightRecord.height) && zcp.b(getTime(), heightRecord.getTime()) && zcp.b(getZoneOffset(), heightRecord.getZoneOffset()) && zcp.b(getMetadata(), heightRecord.getMetadata());
    }

    public int hashCode() {
        int iHashCode = this.height.hashCode();
        int iHashCode2 = getTime().hashCode();
        ZoneOffset zoneOffset = getZoneOffset();
        return (((((iHashCode * 31) + iHashCode2) * 31) + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "HeightRecord(time=" + getTime() + ", zoneOffset=" + getZoneOffset() + ", height=" + this.height + ", metadata=" + getMetadata() + g4.l;
    }
}
