package androidx.health.connect.client.records;

import android.os.Build;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.impl.platform.records.RecordConvertersKt;
import androidx.health.connect.client.units.Pressure;
import androidx.health.connect.client.units.PressureKt;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcm;
import defpackage.zcp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 *2\u00020\u0001:\u0005&'()*BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020\fH\u0016J\b\u0010$\u001a\u00020%H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\f¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\u00020\f¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006+"}, d2 = {"Landroidx/health/connect/client/records/BloodPressureRecord;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "time", "Ljava/time/Instant;", "zoneOffset", "Ljava/time/ZoneOffset;", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "systolic", "Landroidx/health/connect/client/units/Pressure;", "diastolic", "bodyPosition", "", "measurementLocation", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;Landroidx/health/connect/client/units/Pressure;Landroidx/health/connect/client/units/Pressure;II)V", "getTime", "()Ljava/time/Instant;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "getSystolic", "()Landroidx/health/connect/client/units/Pressure;", "getDiastolic", "getBodyPosition$annotations", "()V", "getBodyPosition", "()I", "getMeasurementLocation$annotations", "getMeasurementLocation", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "", "MeasurementLocation", "BodyPosition", "MeasurementLocations", "BodyPositions", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodPressureRecord implements InstantaneousRecord {
    private static final String BLOOD_PRESSURE_NAME = "BloodPressure";
    public static final Map<Integer, String> BODY_POSITION_INT_TO_STRING_MAP;
    public static final int BODY_POSITION_LYING_DOWN = 3;
    public static final int BODY_POSITION_RECLINING = 4;
    public static final int BODY_POSITION_SITTING_DOWN = 2;
    public static final int BODY_POSITION_STANDING_UP = 1;
    public static final Map<String, Integer> BODY_POSITION_STRING_TO_INT_MAP;
    public static final int BODY_POSITION_UNKNOWN = 0;
    public static final AggregateMetric<Pressure> DIASTOLIC_AVG;
    private static final String DIASTOLIC_FIELD_NAME = "diastolic";
    public static final AggregateMetric<Pressure> DIASTOLIC_MAX;
    public static final AggregateMetric<Pressure> DIASTOLIC_MIN;
    private static final Pressure MAX_DIASTOLIC;
    private static final Pressure MAX_SYSTOLIC;
    public static final Map<Integer, String> MEASUREMENT_LOCATION_INT_TO_STRING_MAP;
    public static final int MEASUREMENT_LOCATION_LEFT_UPPER_ARM = 3;
    public static final int MEASUREMENT_LOCATION_LEFT_WRIST = 1;
    public static final int MEASUREMENT_LOCATION_RIGHT_UPPER_ARM = 4;
    public static final int MEASUREMENT_LOCATION_RIGHT_WRIST = 2;
    public static final Map<String, Integer> MEASUREMENT_LOCATION_STRING_TO_INT_MAP;
    public static final int MEASUREMENT_LOCATION_UNKNOWN = 0;
    private static final Pressure MIN_DIASTOLIC;
    private static final Pressure MIN_SYSTOLIC;
    public static final AggregateMetric<Pressure> SYSTOLIC_AVG;
    private static final String SYSTOLIC_FIELD_NAME = "systolic";
    public static final AggregateMetric<Pressure> SYSTOLIC_MAX;
    public static final AggregateMetric<Pressure> SYSTOLIC_MIN;
    private final int bodyPosition;
    private final Pressure diastolic;
    private final int measurementLocation;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final Pressure systolic;
    private final Instant time;
    private final ZoneOffset zoneOffset;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/BloodPressureRecord$BodyPositions;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface BodyPositions {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/BloodPressureRecord$MeasurementLocations;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface MeasurementLocations {
    }

    public static /* synthetic */ void getBodyPosition$annotations() {
    }

    public static /* synthetic */ void getMeasurementLocation$annotations() {
    }

    public BloodPressureRecord(Instant instant, ZoneOffset zoneOffset, androidx.health.connect.client.records.metadata.Metadata metadata, Pressure pressure, Pressure pressure2, int i, int i2) {
        zcp.c(instant, "");
        zcp.c(metadata, "");
        zcp.c(pressure, "");
        zcp.c(pressure2, "");
        this.time = instant;
        this.zoneOffset = zoneOffset;
        this.metadata = metadata;
        this.systolic = pressure;
        this.diastolic = pressure2;
        this.bodyPosition = i;
        this.measurementLocation = i2;
        if (Build.VERSION.SDK_INT >= 34) {
            RecordConvertersKt.toPlatformRecord(this);
            return;
        }
        Pressure pressure3 = pressure;
        UtilsKt.requireNotLess(pressure3, MIN_SYSTOLIC, "systolic");
        UtilsKt.requireNotMore(pressure3, MAX_SYSTOLIC, "systolic");
        Pressure pressure4 = pressure2;
        UtilsKt.requireNotLess(pressure4, MIN_DIASTOLIC, "diastolic");
        UtilsKt.requireNotMore(pressure4, MAX_DIASTOLIC, "diastolic");
    }

    public /* synthetic */ BloodPressureRecord(Instant instant, ZoneOffset zoneOffset, androidx.health.connect.client.records.metadata.Metadata metadata, Pressure pressure, Pressure pressure2, int i, int i2, int i3, zcm zcmVar) {
        this(instant, zoneOffset, metadata, pressure, pressure2, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2);
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

    public final Pressure getSystolic() {
        return this.systolic;
    }

    public final Pressure getDiastolic() {
        return this.diastolic;
    }

    public final int getBodyPosition() {
        return this.bodyPosition;
    }

    public final int getMeasurementLocation() {
        return this.measurementLocation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureRecord)) {
            return false;
        }
        BloodPressureRecord bloodPressureRecord = (BloodPressureRecord) other;
        return zcp.b(this.systolic, bloodPressureRecord.systolic) && zcp.b(this.diastolic, bloodPressureRecord.diastolic) && this.bodyPosition == bloodPressureRecord.bodyPosition && this.measurementLocation == bloodPressureRecord.measurementLocation && zcp.b(getTime(), bloodPressureRecord.getTime()) && zcp.b(getZoneOffset(), bloodPressureRecord.getZoneOffset()) && zcp.b(getMetadata(), bloodPressureRecord.getMetadata());
    }

    public int hashCode() {
        int iHashCode = this.systolic.hashCode();
        int iHashCode2 = this.diastolic.hashCode();
        int i = this.bodyPosition;
        int i2 = this.measurementLocation;
        int iHashCode3 = getTime().hashCode();
        ZoneOffset zoneOffset = getZoneOffset();
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + i) * 31) + i2) * 31) + iHashCode3) * 31) + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "BloodPressureRecord(time=" + getTime() + ", zoneOffset=" + getZoneOffset() + ", systolic=" + this.systolic + ", diastolic=" + this.diastolic + ", bodyPosition=" + this.bodyPosition + ", measurementLocation=" + this.measurementLocation + ", metadata=" + getMetadata() + g4.l;
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/health/connect/client/records/BloodPressureRecord$MeasurementLocation;", "", "<init>", "()V", "LEFT_WRIST", "", "RIGHT_WRIST", "LEFT_UPPER_ARM", "RIGHT_UPPER_ARM", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MeasurementLocation {
        public static final MeasurementLocation INSTANCE = new MeasurementLocation();
        public static final String LEFT_UPPER_ARM = "left_upper_arm";
        public static final String LEFT_WRIST = "left_wrist";
        public static final String RIGHT_UPPER_ARM = "right_upper_arm";
        public static final String RIGHT_WRIST = "right_wrist";

        private MeasurementLocation() {
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/health/connect/client/records/BloodPressureRecord$BodyPosition;", "", "<init>", "()V", "STANDING_UP", "", "SITTING_DOWN", "LYING_DOWN", "RECLINING", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BodyPosition {
        public static final BodyPosition INSTANCE = new BodyPosition();
        public static final String LYING_DOWN = "lying_down";
        public static final String RECLINING = "reclining";
        public static final String SITTING_DOWN = "sitting_down";
        public static final String STANDING_UP = "standing_up";

        private BodyPosition() {
        }
    }

    static {
        Map<String, Integer> mapE = zae.e(yyz.c(MeasurementLocation.LEFT_UPPER_ARM, 3), yyz.c(MeasurementLocation.LEFT_WRIST, 1), yyz.c(MeasurementLocation.RIGHT_UPPER_ARM, 4), yyz.c(MeasurementLocation.RIGHT_WRIST, 2));
        MEASUREMENT_LOCATION_STRING_TO_INT_MAP = mapE;
        MEASUREMENT_LOCATION_INT_TO_STRING_MAP = UtilsKt.reverse(mapE);
        Map<String, Integer> mapE2 = zae.e(yyz.c(BodyPosition.LYING_DOWN, 3), yyz.c(BodyPosition.RECLINING, 4), yyz.c(BodyPosition.SITTING_DOWN, 2), yyz.c(BodyPosition.STANDING_UP, 1));
        BODY_POSITION_STRING_TO_INT_MAP = mapE2;
        BODY_POSITION_INT_TO_STRING_MAP = UtilsKt.reverse(mapE2);
        MIN_SYSTOLIC = PressureKt.getMillimetersOfMercury(9.9E-323d);
        MAX_SYSTOLIC = PressureKt.getMillimetersOfMercury(9.9E-322d);
        MIN_DIASTOLIC = PressureKt.getMillimetersOfMercury(4.9E-323d);
        MAX_DIASTOLIC = PressureKt.getMillimetersOfMercury(8.9E-322d);
        SYSTOLIC_AVG = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(BLOOD_PRESSURE_NAME, AggregateMetric.AggregationType.AVERAGE, "systolic", new BloodPressureRecord$Companion$SYSTOLIC_AVG$1(Pressure.INSTANCE));
        SYSTOLIC_MIN = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(BLOOD_PRESSURE_NAME, AggregateMetric.AggregationType.MINIMUM, "systolic", new BloodPressureRecord$Companion$SYSTOLIC_MIN$1(Pressure.INSTANCE));
        SYSTOLIC_MAX = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(BLOOD_PRESSURE_NAME, AggregateMetric.AggregationType.MAXIMUM, "systolic", new BloodPressureRecord$Companion$SYSTOLIC_MAX$1(Pressure.INSTANCE));
        DIASTOLIC_AVG = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(BLOOD_PRESSURE_NAME, AggregateMetric.AggregationType.AVERAGE, "diastolic", new BloodPressureRecord$Companion$DIASTOLIC_AVG$1(Pressure.INSTANCE));
        DIASTOLIC_MIN = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(BLOOD_PRESSURE_NAME, AggregateMetric.AggregationType.MINIMUM, "diastolic", new BloodPressureRecord$Companion$DIASTOLIC_MIN$1(Pressure.INSTANCE));
        DIASTOLIC_MAX = AggregateMetric.INSTANCE.doubleMetric$connect_client_release(BLOOD_PRESSURE_NAME, AggregateMetric.AggregationType.MAXIMUM, "diastolic", new BloodPressureRecord$Companion$DIASTOLIC_MAX$1(Pressure.INSTANCE));
    }
}
