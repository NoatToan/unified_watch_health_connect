package androidx.health.connect.client.records;

import android.os.Build;
import androidx.health.connect.client.impl.platform.records.RecordConvertersKt;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0003!\"#B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\u000b¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Landroidx/health/connect/client/records/Vo2MaxRecord;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "time", "Ljava/time/Instant;", "zoneOffset", "Ljava/time/ZoneOffset;", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "vo2MillilitersPerMinuteKilogram", "", "measurementMethod", "", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Landroidx/health/connect/client/records/metadata/Metadata;DI)V", "getTime", "()Ljava/time/Instant;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "getMetadata", "()Landroidx/health/connect/client/records/metadata/Metadata;", "getVo2MillilitersPerMinuteKilogram", "()D", "getMeasurementMethod$annotations", "()V", "getMeasurementMethod", "()I", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "", "Companion", "MeasurementMethod", "MeasurementMethods", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Vo2MaxRecord implements InstantaneousRecord {
    public static final int MEASUREMENT_METHOD_COOPER_TEST = 3;
    public static final int MEASUREMENT_METHOD_HEART_RATE_RATIO = 2;
    public static final Map<Integer, String> MEASUREMENT_METHOD_INT_TO_STRING_MAP;
    public static final int MEASUREMENT_METHOD_METABOLIC_CART = 1;
    public static final int MEASUREMENT_METHOD_MULTISTAGE_FITNESS_TEST = 4;
    public static final int MEASUREMENT_METHOD_OTHER = 0;
    public static final int MEASUREMENT_METHOD_ROCKPORT_FITNESS_TEST = 5;
    public static final Map<String, Integer> MEASUREMENT_METHOD_STRING_TO_INT_MAP;
    private final int measurementMethod;
    private final androidx.health.connect.client.records.metadata.Metadata metadata;
    private final Instant time;
    private final double vo2MillilitersPerMinuteKilogram;
    private final ZoneOffset zoneOffset;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/Vo2MaxRecord$MeasurementMethods;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface MeasurementMethods {
    }

    public static /* synthetic */ void getMeasurementMethod$annotations() {
    }

    public Vo2MaxRecord(Instant instant, ZoneOffset zoneOffset, androidx.health.connect.client.records.metadata.Metadata metadata, double d, int i) {
        zcp.c(instant, "");
        zcp.c(metadata, "");
        this.time = instant;
        this.zoneOffset = zoneOffset;
        this.metadata = metadata;
        this.vo2MillilitersPerMinuteKilogram = d;
        this.measurementMethod = i;
        if (Build.VERSION.SDK_INT >= 34) {
            RecordConvertersKt.toPlatformRecord(this);
        } else {
            UtilsKt.requireNonNegative(d, "vo2MillilitersPerMinuteKilogram");
            UtilsKt.requireNotMore(Double.valueOf(d), Double.valueOf(100.0d), "vo2MillilitersPerMinuteKilogram");
        }
    }

    public /* synthetic */ Vo2MaxRecord(Instant instant, ZoneOffset zoneOffset, androidx.health.connect.client.records.metadata.Metadata metadata, double d, int i, int i2, zcm zcmVar) {
        this(instant, zoneOffset, metadata, d, (i2 & 16) != 0 ? 0 : i);
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

    public final double getVo2MillilitersPerMinuteKilogram() {
        return this.vo2MillilitersPerMinuteKilogram;
    }

    public final int getMeasurementMethod() {
        return this.measurementMethod;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vo2MaxRecord)) {
            return false;
        }
        Vo2MaxRecord vo2MaxRecord = (Vo2MaxRecord) other;
        return this.vo2MillilitersPerMinuteKilogram == vo2MaxRecord.vo2MillilitersPerMinuteKilogram && this.measurementMethod == vo2MaxRecord.measurementMethod && zcp.b(getTime(), vo2MaxRecord.getTime()) && zcp.b(getZoneOffset(), vo2MaxRecord.getZoneOffset()) && zcp.b(getMetadata(), vo2MaxRecord.getMetadata());
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.vo2MillilitersPerMinuteKilogram);
        int i = this.measurementMethod;
        int iHashCode2 = getTime().hashCode();
        ZoneOffset zoneOffset = getZoneOffset();
        return (((((((iHashCode * 31) + i) * 31) + iHashCode2) * 31) + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + getMetadata().hashCode();
    }

    public String toString() {
        return "Vo2MaxRecord(time=" + getTime() + ", zoneOffset=" + getZoneOffset() + ", vo2MillilitersPerMinuteKilogram=" + this.vo2MillilitersPerMinuteKilogram + ", measurementMethod=" + this.measurementMethod + ", metadata=" + getMetadata() + g4.l;
    }

    static {
        Map<String, Integer> mapE = zae.e(yyz.c("other", 0), yyz.c(MeasurementMethod.METABOLIC_CART, 1), yyz.c(MeasurementMethod.HEART_RATE_RATIO, 2), yyz.c(MeasurementMethod.COOPER_TEST, 3), yyz.c(MeasurementMethod.MULTISTAGE_FITNESS_TEST, 4), yyz.c(MeasurementMethod.ROCKPORT_FITNESS_TEST, 5));
        MEASUREMENT_METHOD_STRING_TO_INT_MAP = mapE;
        MEASUREMENT_METHOD_INT_TO_STRING_MAP = UtilsKt.reverse(mapE);
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/health/connect/client/records/Vo2MaxRecord$MeasurementMethod;", "", "<init>", "()V", "METABOLIC_CART", "", "HEART_RATE_RATIO", "COOPER_TEST", "MULTISTAGE_FITNESS_TEST", "ROCKPORT_FITNESS_TEST", "OTHER", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MeasurementMethod {
        public static final String COOPER_TEST = "cooper_test";
        public static final String HEART_RATE_RATIO = "heart_rate_ratio";
        public static final MeasurementMethod INSTANCE = new MeasurementMethod();
        public static final String METABOLIC_CART = "metabolic_cart";
        public static final String MULTISTAGE_FITNESS_TEST = "multistage_fitness_test";
        public static final String OTHER = "other";
        public static final String ROCKPORT_FITNESS_TEST = "rockport_fitness_test";

        private MeasurementMethod() {
        }
    }
}
