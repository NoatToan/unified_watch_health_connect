package androidx.health.connect.client.records;

import android.os.Build;
import androidx.health.connect.client.impl.platform.records.RecordConvertersKt;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Landroidx/health/connect/client/records/HeartRateVariabilityRmssdRecord;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "time", "Ljava/time/Instant;", "zoneOffset", "Ljava/time/ZoneOffset;", "heartRateVariabilityMillis", "", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;DLandroidx/health/connect/client/records/metadata/Metadata;)V", "getTime", "()Ljava/time/Instant;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "getHeartRateVariabilityMillis", "()D", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeartRateVariabilityRmssdRecord implements InstantaneousRecord {
    public static final double MAX_HRV_RMSSD = 200.0d;
    public static final double MIN_HRV_RMSSD = 1.0d;
    private final double heartRateVariabilityMillis;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final Instant time;
    private final ZoneOffset zoneOffset;

    public HeartRateVariabilityRmssdRecord(Instant instant, ZoneOffset zoneOffset, double d, androidx.health.connect.client.records.metadata.Metadata metadata) {
        zcp.c(instant, "");
        zcp.c(metadata, "");
        this.time = instant;
        this.zoneOffset = zoneOffset;
        this.heartRateVariabilityMillis = d;
        this.metadata = metadata;
        if (Build.VERSION.SDK_INT >= 34) {
            RecordConvertersKt.toPlatformRecord(this);
        } else {
            UtilsKt.requireInRange(Double.valueOf(d), Double.valueOf(1.0d), Double.valueOf(200.0d), "heartRateVariabilityMillis");
        }
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public Instant getTime() {
        return this.time;
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public ZoneOffset getZoneOffset() {
        return this.zoneOffset;
    }

    public final double getHeartRateVariabilityMillis() {
        return this.heartRateVariabilityMillis;
    }

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateVariabilityRmssdRecord)) {
            return false;
        }
        HeartRateVariabilityRmssdRecord heartRateVariabilityRmssdRecord = (HeartRateVariabilityRmssdRecord) other;
        return this.heartRateVariabilityMillis == heartRateVariabilityRmssdRecord.heartRateVariabilityMillis && zcp.b(getTime(), heartRateVariabilityRmssdRecord.getTime()) && zcp.b(getZoneOffset(), heartRateVariabilityRmssdRecord.getZoneOffset()) && zcp.b(getMetadata(), heartRateVariabilityRmssdRecord.getMetadata());
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.heartRateVariabilityMillis);
        int iHashCode2 = getTime().hashCode();
        ZoneOffset zoneOffset = getZoneOffset();
        return (((((iHashCode * 31) + iHashCode2) * 31) + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "HeartRateVariabilityRmssdRecord(time=" + getTime() + ", zoneOffset=" + getZoneOffset() + ", heartRateVariabilityMillis=" + this.heartRateVariabilityMillis + ", metadata=" + getMetadata() + g4.l;
    }
}
