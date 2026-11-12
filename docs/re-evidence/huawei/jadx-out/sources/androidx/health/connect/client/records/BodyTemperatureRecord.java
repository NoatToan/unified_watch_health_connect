package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Temperature;
import com.huawei.hms.network.embedded.g4;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\u000b¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Landroidx/health/connect/client/records/BodyTemperatureRecord;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "time", "Ljava/time/Instant;", "zoneOffset", "Ljava/time/ZoneOffset;", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE, "Landroidx/health/connect/client/units/Temperature;", "measurementLocation", "", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;Landroidx/health/connect/client/units/Temperature;I)V", "getTime", "()Ljava/time/Instant;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "getTemperature", "()Landroidx/health/connect/client/units/Temperature;", "getMeasurementLocation$annotations", "()V", "getMeasurementLocation", "()I", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BodyTemperatureRecord implements InstantaneousRecord {
    private final int measurementLocation;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final Temperature temperature;
    private final Instant time;
    private final ZoneOffset zoneOffset;

    public static /* synthetic */ void getMeasurementLocation$annotations() {
    }

    public BodyTemperatureRecord(Instant instant, ZoneOffset zoneOffset, androidx.health.connect.client.records.metadata.Metadata metadata, Temperature temperature, int i) {
        zcp.c(instant, "");
        zcp.c(metadata, "");
        zcp.c(temperature, "");
        this.time = instant;
        this.zoneOffset = zoneOffset;
        this.metadata = metadata;
        this.temperature = temperature;
        this.measurementLocation = i;
    }

    public /* synthetic */ BodyTemperatureRecord(Instant instant, ZoneOffset zoneOffset, androidx.health.connect.client.records.metadata.Metadata metadata, Temperature temperature, int i, int i2, zcm zcmVar) {
        this(instant, zoneOffset, metadata, temperature, (i2 & 16) != 0 ? 0 : i);
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public Instant getTime() {
        return this.time;
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public ZoneOffset getZoneOffset() {
        return this.zoneOffset;
    }

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public final Temperature getTemperature() {
        return this.temperature;
    }

    public final int getMeasurementLocation() {
        return this.measurementLocation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BodyTemperatureRecord)) {
            return false;
        }
        BodyTemperatureRecord bodyTemperatureRecord = (BodyTemperatureRecord) other;
        return zcp.b(this.temperature, bodyTemperatureRecord.temperature) && this.measurementLocation == bodyTemperatureRecord.measurementLocation && zcp.b(getTime(), bodyTemperatureRecord.getTime()) && zcp.b(getZoneOffset(), bodyTemperatureRecord.getZoneOffset()) && zcp.b(getMetadata(), bodyTemperatureRecord.getMetadata());
    }

    public int hashCode() {
        int iHashCode = this.temperature.hashCode();
        int i = this.measurementLocation;
        int iHashCode2 = getTime().hashCode();
        ZoneOffset zoneOffset = getZoneOffset();
        return (((((((iHashCode * 31) + i) * 31) + iHashCode2) * 31) + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "BodyTemperatureRecord(time=" + getTime() + ", zoneOffset=" + getZoneOffset() + ", temperature=" + this.temperature + ", measurementLocation=" + this.measurementLocation + ", metadata=" + getMetadata() + g4.l;
    }
}
