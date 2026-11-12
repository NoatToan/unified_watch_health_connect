package androidx.health.connect.client.records;

import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.units.Temperature;
import androidx.health.connect.client.units.TemperatureDelta;
import androidx.health.connect.client.units.TemperatureKt;
import com.huawei.hms.network.embedded.g4;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcm;
import defpackage.zcp;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 (2\u00020\u0001:\u0002()BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\u0010H\u0016J\b\u0010&\u001a\u00020'H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006*"}, d2 = {"Landroidx/health/connect/client/records/SkinTemperatureRecord;", "Landroidx/health/connect/client/records/IntervalRecord;", "startTime", "Ljava/time/Instant;", "startZoneOffset", "Ljava/time/ZoneOffset;", "endTime", "endZoneOffset", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "deltas", "", "Landroidx/health/connect/client/records/SkinTemperatureRecord$Delta;", "baseline", "Landroidx/health/connect/client/units/Temperature;", "measurementLocation", "", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;Ljava/util/List;Landroidx/health/connect/client/units/Temperature;I)V", "getStartTime", "()Ljava/time/Instant;", "getStartZoneOffset", "()Ljava/time/ZoneOffset;", "getEndTime", "getEndZoneOffset", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "getDeltas", "()Ljava/util/List;", "getBaseline", "()Landroidx/health/connect/client/units/Temperature;", "getMeasurementLocation", "()I", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "", "Companion", "Delta", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SkinTemperatureRecord implements IntervalRecord {
    public static final int MEASUREMENT_LOCATION_FINGER = 1;
    public static final Map<Integer, String> MEASUREMENT_LOCATION_INT_TO_STRING_MAP;
    public static final Map<String, Integer> MEASUREMENT_LOCATION_STRING_TO_INT_MAP;
    public static final int MEASUREMENT_LOCATION_TOE = 2;
    public static final int MEASUREMENT_LOCATION_UNKNOWN = 0;
    public static final int MEASUREMENT_LOCATION_WRIST = 3;
    private final Temperature baseline;
    private final List<Delta> deltas;
    private final Instant endTime;
    private final ZoneOffset endZoneOffset;
    private final int measurementLocation;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final Instant startTime;
    private final ZoneOffset startZoneOffset;
    private static final Temperature MIN_TEMPERATURE = TemperatureKt.getCelsius(0.0d);
    private static final Temperature MAX_TEMPERATURE = TemperatureKt.getCelsius(4.94E-322d);
    private static final String SKIN_TEMPERATURE_TYPE_NAME = "SkinTemperature";
    private static final String TEMPERATURE_DELTA_FIELD_NAME = "temperatureDelta";
    public static final AggregateMetric<TemperatureDelta> TEMPERATURE_DELTA_AVG = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(SKIN_TEMPERATURE_TYPE_NAME, AggregateMetric.AggregationType.AVERAGE, TEMPERATURE_DELTA_FIELD_NAME, new SkinTemperatureRecord$Companion$TEMPERATURE_DELTA_AVG$1(TemperatureDelta.INSTANCE));
    public static final AggregateMetric<TemperatureDelta> TEMPERATURE_DELTA_MIN = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(SKIN_TEMPERATURE_TYPE_NAME, AggregateMetric.AggregationType.MINIMUM, TEMPERATURE_DELTA_FIELD_NAME, new SkinTemperatureRecord$Companion$TEMPERATURE_DELTA_MIN$1(TemperatureDelta.INSTANCE));
    public static final AggregateMetric<TemperatureDelta> TEMPERATURE_DELTA_MAX = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(SKIN_TEMPERATURE_TYPE_NAME, AggregateMetric.AggregationType.MAXIMUM, TEMPERATURE_DELTA_FIELD_NAME, new SkinTemperatureRecord$Companion$TEMPERATURE_DELTA_MAX$1(TemperatureDelta.INSTANCE));

    public SkinTemperatureRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, List<Delta> list, Temperature temperature, int i) {
        zcp.c(instant, "");
        zcp.c(instant2, "");
        zcp.c(metadata, "");
        zcp.c(list, "");
        this.startTime = instant;
        this.startZoneOffset = zoneOffset;
        this.endTime = instant2;
        this.endZoneOffset = zoneOffset2;
        this.metadata = metadata;
        this.deltas = list;
        this.baseline = temperature;
        this.measurementLocation = i;
        if (!getStartTime().isBefore(getEndTime())) {
            throw new IllegalArgumentException("startTime must be before endTime.".toString());
        }
        if (temperature != null) {
            Temperature temperature2 = temperature;
            UtilsKt.requireNotLess(temperature2, MIN_TEMPERATURE, HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE);
            UtilsKt.requireNotMore(temperature2, MAX_TEMPERATURE, HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE);
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            Instant time = ((Delta) next).getTime();
            do {
                Object next2 = it.next();
                Instant time2 = ((Delta) next2).getTime();
                if (time.compareTo(time2) > 0) {
                    next = next2;
                    time = time2;
                }
            } while (it.hasNext());
        }
        if (((Delta) next).getTime().isBefore(getStartTime())) {
            throw new IllegalArgumentException("deltas can not be out of parent time range.".toString());
        }
        Iterator<T> it2 = this.deltas.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next3 = it2.next();
        if (it2.hasNext()) {
            Instant time3 = ((Delta) next3).getTime();
            do {
                Object next4 = it2.next();
                Instant time4 = ((Delta) next4).getTime();
                if (time3.compareTo(time4) < 0) {
                    next3 = next4;
                    time3 = time4;
                }
            } while (it2.hasNext());
        }
        if (!((Delta) next3).getTime().isBefore(getEndTime())) {
            throw new IllegalArgumentException("deltas can not be out of parent time range.".toString());
        }
    }

    public /* synthetic */ SkinTemperatureRecord(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, androidx.health.connect.client.records.metadata.Metadata metadata, List list, Temperature temperature, int i, int i2, zcm zcmVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, metadata, list, (i2 & 64) != 0 ? null : temperature, (i2 & 128) != 0 ? 0 : i);
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

    public final List<Delta> getDeltas() {
        return this.deltas;
    }

    public final Temperature getBaseline() {
        return this.baseline;
    }

    public final int getMeasurementLocation() {
        return this.measurementLocation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkinTemperatureRecord)) {
            return false;
        }
        SkinTemperatureRecord skinTemperatureRecord = (SkinTemperatureRecord) other;
        return zcp.b(getStartTime(), skinTemperatureRecord.getStartTime()) && zcp.b(getEndTime(), skinTemperatureRecord.getEndTime()) && zcp.b(getStartZoneOffset(), skinTemperatureRecord.getStartZoneOffset()) && zcp.b(getEndZoneOffset(), skinTemperatureRecord.getEndZoneOffset()) && zcp.b(this.baseline, skinTemperatureRecord.baseline) && this.measurementLocation == skinTemperatureRecord.measurementLocation && zcp.b(this.deltas, skinTemperatureRecord.deltas) && zcp.b(getMetadata(), skinTemperatureRecord.getMetadata());
    }

    public int hashCode() {
        int iHashCode = getStartTime().hashCode();
        int iHashCode2 = getEndTime().hashCode();
        ZoneOffset startZoneOffset = getStartZoneOffset();
        int iHashCode3 = startZoneOffset != null ? startZoneOffset.hashCode() : 0;
        ZoneOffset endZoneOffset = getEndZoneOffset();
        int iHashCode4 = endZoneOffset != null ? endZoneOffset.hashCode() : 0;
        Temperature temperature = this.baseline;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (temperature != null ? temperature.hashCode() : 0)) * 31) + Integer.hashCode(this.measurementLocation)) * 31) + this.deltas.hashCode()) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "SkinTemperatureRecord(startTime=" + getStartTime() + ", startZoneOffset=" + getStartZoneOffset() + ", endTime=" + getEndTime() + ", endZoneOffset=" + getEndZoneOffset() + ", deltas=" + this.deltas + ", baseline=" + this.baseline + ", measurementLocation=" + this.measurementLocation + ", metadata=" + getMetadata() + g4.l;
    }

    static {
        Map<String, Integer> mapE = zae.e(yyz.c(BodyTemperatureMeasurementLocation.FINGER, 1), yyz.c(BodyTemperatureMeasurementLocation.TOE, 2), yyz.c(BodyTemperatureMeasurementLocation.WRIST, 3));
        MEASUREMENT_LOCATION_STRING_TO_INT_MAP = mapE;
        MEASUREMENT_LOCATION_INT_TO_STRING_MAP = UtilsKt.reverse(mapE);
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Landroidx/health/connect/client/records/SkinTemperatureRecord$Delta;", "", "time", "Ljava/time/Instant;", "delta", "Landroidx/health/connect/client/units/TemperatureDelta;", "<init>", "(Ljava/time/Instant;Landroidx/health/connect/client/units/TemperatureDelta;)V", "getTime", "()Ljava/time/Instant;", "getDelta", "()Landroidx/health/connect/client/units/TemperatureDelta;", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Delta {
        private final TemperatureDelta delta;
        private final Instant time;
        private static final Companion Companion = new Companion(null);
        private static final TemperatureDelta MIN_DELTA_TEMPERATURE = TemperatureDelta.INSTANCE.celsius(-30.0d);
        private static final TemperatureDelta MAX_DELTA_TEMPERATURE = TemperatureDelta.INSTANCE.celsius(30.0d);

        public Delta(Instant instant, TemperatureDelta temperatureDelta) {
            zcp.c(instant, "");
            zcp.c(temperatureDelta, "");
            this.time = instant;
            this.delta = temperatureDelta;
            TemperatureDelta temperatureDelta2 = temperatureDelta;
            UtilsKt.requireNotLess(temperatureDelta2, MIN_DELTA_TEMPERATURE, "delta");
            UtilsKt.requireNotMore(temperatureDelta2, MAX_DELTA_TEMPERATURE, "delta");
        }

        public final TemperatureDelta getDelta() {
            return this.delta;
        }

        public final Instant getTime() {
            return this.time;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!zcp.b(getClass(), other != null ? other.getClass() : null)) {
                return false;
            }
            zcp.e(other, "");
            Delta delta = (Delta) other;
            return zcp.b(this.time, delta.time) && zcp.b(this.delta, delta.delta);
        }

        public int hashCode() {
            return (this.time.hashCode() * 31) + this.delta.hashCode();
        }

        public String toString() {
            return "Delta(time=" + this.time + ", delta=" + this.delta + g4.l;
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/health/connect/client/records/SkinTemperatureRecord$Delta$Companion;", "", "<init>", "()V", "MIN_DELTA_TEMPERATURE", "Landroidx/health/connect/client/units/TemperatureDelta;", "MAX_DELTA_TEMPERATURE", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(zcm zcmVar) {
                this();
            }
        }
    }
}
