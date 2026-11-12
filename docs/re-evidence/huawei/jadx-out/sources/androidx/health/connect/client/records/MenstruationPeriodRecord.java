package androidx.health.connect.client.records;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Landroidx/health/connect/client/records/MenstruationPeriodRecord;", "Landroidx/health/connect/client/records/IntervalRecord;", "startTime", "Ljava/time/Instant;", "startZoneOffset", "Ljava/time/ZoneOffset;", "endTime", "endZoneOffset", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;)V", "getStartTime", "()Ljava/time/Instant;", "getStartZoneOffset", "()Ljava/time/ZoneOffset;", "getEndTime", "getEndZoneOffset", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MenstruationPeriodRecord implements IntervalRecord {
    private static final Companion Companion = new Companion(null);
    private static final Duration MAX_DURATION = Duration.ofDays(31);
    private final Instant endTime;
    private final ZoneOffset endZoneOffset;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final Instant startTime;
    private final ZoneOffset startZoneOffset;

    public MenstruationPeriodRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata) {
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
        this.startTime = instant;
        this.startZoneOffset = zoneOffset;
        this.endTime = instant2;
        this.endZoneOffset = zoneOffset2;
        this.metadata = metadata;
        if (!getStartTime().isBefore(getEndTime())) {
            throw new IllegalArgumentException("startTime must be before endTime.".toString());
        }
        if (Duration.between(getStartTime(), getEndTime()).compareTo(MAX_DURATION) > 0) {
            throw new IllegalArgumentException("Period must not exceed 31 days".toString());
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

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstruationPeriodRecord)) {
            return false;
        }
        MenstruationPeriodRecord menstruationPeriodRecord = (MenstruationPeriodRecord) other;
        return zcp.b(getStartTime(), menstruationPeriodRecord.getStartTime()) && zcp.b(getStartZoneOffset(), menstruationPeriodRecord.getStartZoneOffset()) && zcp.b(getEndTime(), menstruationPeriodRecord.getEndTime()) && zcp.b(getEndZoneOffset(), menstruationPeriodRecord.getEndZoneOffset()) && zcp.b(getMetadata(), menstruationPeriodRecord.getMetadata());
    }

    public int hashCode() {
        int iHashCode = getStartTime().hashCode();
        ZoneOffset startZoneOffset = getStartZoneOffset();
        int iHashCode2 = startZoneOffset != null ? startZoneOffset.hashCode() : 0;
        int iHashCode3 = getEndTime().hashCode();
        ZoneOffset endZoneOffset = getEndZoneOffset();
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (endZoneOffset != null ? endZoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "MenstruationPeriodRecord(startTime=" + getStartTime() + ", startZoneOffset=" + getStartZoneOffset() + ", endTime=" + getEndTime() + ", endZoneOffset=" + getEndZoneOffset() + ", metadata=" + getMetadata() + g4.l;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/health/connect/client/records/MenstruationPeriodRecord$Companion;", "", "<init>", "()V", "MAX_DURATION", "Ljava/time/Duration;", "kotlin.jvm.PlatformType", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }
}
