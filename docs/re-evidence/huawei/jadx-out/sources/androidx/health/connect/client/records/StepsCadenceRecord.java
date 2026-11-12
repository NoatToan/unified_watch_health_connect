package androidx.health.connect.client.records;

import androidx.health.connect.client.aggregate.AggregateMetric;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Landroidx/health/connect/client/records/StepsCadenceRecord;", "Landroidx/health/connect/client/records/SeriesRecord;", "Landroidx/health/connect/client/records/StepsCadenceRecord$Sample;", "startTime", "Ljava/time/Instant;", "startZoneOffset", "Ljava/time/ZoneOffset;", "endTime", "endZoneOffset", "samples", "", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Landroidx/health/connect/client/records/metadata/Metadata;)V", "getStartTime", "()Ljava/time/Instant;", "getStartZoneOffset", "()Ljava/time/ZoneOffset;", "getEndTime", "getEndZoneOffset", "getSamples", "()Ljava/util/List;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "Companion", "Sample", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StepsCadenceRecord implements SeriesRecord<Sample> {
    private final Instant endTime;
    private final ZoneOffset endZoneOffset;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final List<Sample> samples;
    private final Instant startTime;
    private final ZoneOffset startZoneOffset;
    private static final String TYPE = "StepsCadenceSeries";
    private static final String RATE_FIELD = "rate";
    public static final AggregateMetric<Double> RATE_AVG = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE, AggregateMetric.AggregationType.AVERAGE, RATE_FIELD);
    public static final AggregateMetric<Double> RATE_MIN = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE, AggregateMetric.AggregationType.MINIMUM, RATE_FIELD);
    public static final AggregateMetric<Double> RATE_MAX = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(TYPE, AggregateMetric.AggregationType.MAXIMUM, RATE_FIELD);

    public StepsCadenceRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List<Sample> list, androidx.health.connect.client.records.metadata.Metadata metadata) {
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(list, "");
        zcp.c(metadata, "");
        this.startTime = instant;
        this.startZoneOffset = zoneOffset;
        this.endTime = instant2;
        this.endZoneOffset = zoneOffset2;
        this.samples = list;
        this.metadata = metadata;
        if (getStartTime().isAfter(getEndTime())) {
            throw new IllegalArgumentException("startTime must not be after endTime.".toString());
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

    @Override // androidx.health.connect.client.records.SeriesRecord
    public List<Sample> getSamples() {
        return this.samples;
    }

    @Override // androidx.health.connect.client.records.Record
    public androidx.health.connect.client.records.metadata.Metadata getMetadata() {
        return this.metadata;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepsCadenceRecord)) {
            return false;
        }
        StepsCadenceRecord stepsCadenceRecord = (StepsCadenceRecord) other;
        return zcp.b(getStartTime(), stepsCadenceRecord.getStartTime()) && zcp.b(getStartZoneOffset(), stepsCadenceRecord.getStartZoneOffset()) && zcp.b(getEndTime(), stepsCadenceRecord.getEndTime()) && zcp.b(getEndZoneOffset(), stepsCadenceRecord.getEndZoneOffset()) && zcp.b(getSamples(), stepsCadenceRecord.getSamples()) && zcp.b(getMetadata(), stepsCadenceRecord.getMetadata());
    }

    public int hashCode() {
        int iHashCode = getStartTime().hashCode();
        ZoneOffset startZoneOffset = getStartZoneOffset();
        int iHashCode2 = startZoneOffset != null ? startZoneOffset.hashCode() : 0;
        int iHashCode3 = getEndTime().hashCode();
        ZoneOffset endZoneOffset = getEndZoneOffset();
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (endZoneOffset != null ? endZoneOffset.hashCode() : 0)) * 31) + getSamples().hashCode()) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "StepsCadenceRecord(startTime=" + getStartTime() + ", startZoneOffset=" + getStartZoneOffset() + ", endTime=" + getEndTime() + ", endZoneOffset=" + getEndZoneOffset() + ", samples=" + getSamples() + ", metadata=" + getMetadata() + g4.l;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Landroidx/health/connect/client/records/StepsCadenceRecord$Sample;", "", "time", "Ljava/time/Instant;", StepsCadenceRecord.RATE_FIELD, "", "<init>", "(Ljava/time/Instant;D)V", "getTime", "()Ljava/time/Instant;", "getRate", "()D", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Sample {
        private final double rate;
        private final Instant time;

        public Sample(Instant instant, double d) {
            zcp.c(instant, "");
            this.time = instant;
            this.rate = d;
            UtilsKt.requireNonNegative(d, StepsCadenceRecord.RATE_FIELD);
            UtilsKt.requireNotMore(Double.valueOf(d), Double.valueOf(10000.0d), StepsCadenceRecord.RATE_FIELD);
        }

        public final Instant getTime() {
            return this.time;
        }

        public final double getRate() {
            return this.rate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sample)) {
                return false;
            }
            Sample sample = (Sample) other;
            return zcp.b(this.time, sample.time) && this.rate == sample.rate;
        }

        public int hashCode() {
            return (this.time.hashCode() * 31) + Double.hashCode(this.rate);
        }

        public String toString() {
            return "Sample(time=" + this.time + ", rate=" + this.rate + g4.l;
        }
    }
}
