package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Percentage;
import androidx.health.connect.client.units.PercentageKt;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Landroidx/health/connect/client/records/BodyFatRecord;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "time", "Ljava/time/Instant;", "zoneOffset", "Ljava/time/ZoneOffset;", "percentage", "Landroidx/health/connect/client/units/Percentage;", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/units/Percentage;Landroidx/health/connect/client/records/metadata/Metadata;)V", "getTime", "()Ljava/time/Instant;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "getPercentage", "()Landroidx/health/connect/client/units/Percentage;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BodyFatRecord implements InstantaneousRecord {
    private static final Companion Companion = new Companion(null);
    private static final Percentage MAX_PERCENTAGE = PercentageKt.getPercent(4.94E-322d);
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final Percentage percentage;
    private final Instant time;
    private final ZoneOffset zoneOffset;

    public BodyFatRecord(Instant instant, ZoneOffset zoneOffset, Percentage percentage, androidx.health.connect.client.records.metadata.Metadata metadata) {
        zcp.c(instant, "");
        zcp.c(percentage, "");
        zcp.c(metadata, "");
        this.time = instant;
        this.zoneOffset = zoneOffset;
        this.percentage = percentage;
        this.metadata = metadata;
        UtilsKt.requireNonNegative(percentage.getValue(), "percentage");
        UtilsKt.requireNotMore(percentage, MAX_PERCENTAGE, "percentage");
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public Instant getTime() {
        return this.time;
    }

    @Override // androidx.health.connect.client.records.InstantaneousRecord
    public ZoneOffset getZoneOffset() {
        return this.zoneOffset;
    }

    public final Percentage getPercentage() {
        return this.percentage;
    }

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BodyFatRecord)) {
            return false;
        }
        BodyFatRecord bodyFatRecord = (BodyFatRecord) other;
        return zcp.b(this.percentage, bodyFatRecord.percentage) && zcp.b(getTime(), bodyFatRecord.getTime()) && zcp.b(getZoneOffset(), bodyFatRecord.getZoneOffset()) && zcp.b(getMetadata(), bodyFatRecord.getMetadata());
    }

    public int hashCode() {
        int iHashCode = this.percentage.hashCode();
        int iHashCode2 = getTime().hashCode();
        ZoneOffset zoneOffset = getZoneOffset();
        return (((((iHashCode * 31) + iHashCode2) * 31) + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "BodyFatRecord(time=" + getTime() + ", zoneOffset=" + getZoneOffset() + ", percentage=" + this.percentage + ", metadata=" + getMetadata() + g4.l;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/health/connect/client/records/BodyFatRecord$Companion;", "", "<init>", "()V", "MAX_PERCENTAGE", "Landroidx/health/connect/client/units/Percentage;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }
}
