package androidx.health.connect.client.records;

import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.units.Energy;
import androidx.health.connect.client.units.Power;
import androidx.health.connect.client.units.PowerKt;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Landroidx/health/connect/client/records/BasalMetabolicRateRecord;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "time", "Ljava/time/Instant;", "zoneOffset", "Ljava/time/ZoneOffset;", "basalMetabolicRate", "Landroidx/health/connect/client/units/Power;", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/units/Power;Landroidx/health/connect/client/records/metadata/Metadata;)V", "getTime", "()Ljava/time/Instant;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "getBasalMetabolicRate", "()Landroidx/health/connect/client/units/Power;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BasalMetabolicRateRecord implements InstantaneousRecord {
    private final Power basalMetabolicRate;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final Instant time;
    private final ZoneOffset zoneOffset;
    private static final Power MAX_BASAL_METABLOIC_RATE = PowerKt.getKilocaloriesPerDay(4.9407E-320d);
    private static final String BASAL_CALORIES_TYPE_NAME = "BasalCaloriesBurned";
    private static final String ENERGY_FIELD_NAME = "energy";
    public static final AggregateMetric<Energy> BASAL_CALORIES_TOTAL = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(BASAL_CALORIES_TYPE_NAME, AggregateMetric.AggregationType.TOTAL, ENERGY_FIELD_NAME, new BasalMetabolicRateRecord$Companion$BASAL_CALORIES_TOTAL$1(Energy.INSTANCE));

    public BasalMetabolicRateRecord(Instant instant, ZoneOffset zoneOffset, Power power, androidx.health.connect.client.records.metadata.Metadata metadata) {
        zcp.c(instant, "");
        zcp.c(power, "");
        zcp.c(metadata, "");
        this.time = instant;
        this.zoneOffset = zoneOffset;
        this.basalMetabolicRate = power;
        this.metadata = metadata;
        Power power2 = power;
        UtilsKt.requireNotLess(power2, power.zero$connect_client_release(), "bmr");
        UtilsKt.requireNotMore(power2, MAX_BASAL_METABLOIC_RATE, "bmr");
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public Instant getTime() {
        return this.time;
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public ZoneOffset getZoneOffset() {
        return this.zoneOffset;
    }

    public final Power getBasalMetabolicRate() {
        return this.basalMetabolicRate;
    }

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasalMetabolicRateRecord)) {
            return false;
        }
        BasalMetabolicRateRecord basalMetabolicRateRecord = (BasalMetabolicRateRecord) other;
        return zcp.b(this.basalMetabolicRate, basalMetabolicRateRecord.basalMetabolicRate) && zcp.b(getTime(), basalMetabolicRateRecord.getTime()) && zcp.b(getZoneOffset(), basalMetabolicRateRecord.getZoneOffset()) && zcp.b(getMetadata(), basalMetabolicRateRecord.getMetadata());
    }

    public int hashCode() {
        int iHashCode = this.basalMetabolicRate.hashCode();
        int iHashCode2 = getTime().hashCode();
        ZoneOffset zoneOffset = getZoneOffset();
        return (((((iHashCode * 31) + iHashCode2) * 31) + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "BasalMetabolicRateRecord(time=" + getTime() + ", zoneOffset=" + getZoneOffset() + ", basalMetabolicRate=" + this.basalMetabolicRate + ", metadata=" + getMetadata() + g4.l;
    }
}
