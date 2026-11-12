package androidx.health.connect.client.impl.platform.aggregate;

import androidx.health.connect.client.impl.converters.datatype.RecordsTypeNameMapKt;
import androidx.health.connect.client.impl.platform.TimeExtensionsKt;
import androidx.health.connect.client.records.BloodPressureRecord;
import androidx.health.connect.client.records.CyclingPedalingCadenceRecord;
import androidx.health.connect.client.records.IntervalRecord;
import androidx.health.connect.client.records.NutritionRecord;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.SeriesRecord;
import androidx.health.connect.client.records.SpeedRecord;
import androidx.health.connect.client.records.StepsCadenceRecord;
import defpackage.yyv;
import defpackage.zay;
import defpackage.zcp;
import defpackage.zcv;
import java.time.Instant;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0002\b\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\r2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0002\b\u000eR\u0018\u0010\u000f\u001a\u00020\u0010*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\f*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/health/connect/client/impl/platform/aggregate/AggregatorUtils;", "", "<init>", "()V", "contributesToAggregation", "", "record", "Landroidx/health/connect/client/records/Record;", "timeRange", "Landroidx/health/connect/client/impl/platform/aggregate/TimeRange;", "contributesToAggregation$connect_client_release", "sliceFactor", "", "Landroidx/health/connect/client/records/IntervalRecord;", "sliceFactor$connect_client_release", "time", "Ljava/time/Instant;", "getTime$connect_client_release", "(Ljava/lang/Object;)Ljava/time/Instant;", "value", "getValue$connect_client_release", "(Ljava/lang/Object;)D", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AggregatorUtils {
    public static final AggregatorUtils INSTANCE = new AggregatorUtils();

    private AggregatorUtils() {
    }

    public final boolean contributesToAggregation$connect_client_release(Record record, TimeRange<?> timeRange) {
        zcp.c(record, "");
        zcp.c(timeRange, "");
        if (record instanceof BloodPressureRecord) {
            BloodPressureRecord bloodPressureRecord = (BloodPressureRecord) record;
            return TimeExtensionsKt.isWithin(bloodPressureRecord.getTime(), timeRange, bloodPressureRecord.getZoneOffset());
        }
        if (record instanceof NutritionRecord) {
            return ((NutritionRecord) record).getTransFat() != null && sliceFactor$connect_client_release((IntervalRecord) record, timeRange) > 0.0d;
        }
        if (record instanceof SeriesRecord) {
            SeriesRecord seriesRecord = (SeriesRecord) record;
            List samples = seriesRecord.getSamples();
            if ((samples instanceof Collection) && samples.isEmpty()) {
                return false;
            }
            Iterator it = samples.iterator();
            while (it.hasNext()) {
                if (TimeExtensionsKt.isWithin(INSTANCE.getTime$connect_client_release(it.next()), timeRange, seriesRecord.getStartZoneOffset())) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException(("Unsupported record type for aggregation fallback: " + RecordsTypeNameMapKt.getRECORDS_CLASS_NAME_MAP().get(zcv.b(record.getClass()))).toString());
    }

    public final double sliceFactor$connect_client_release(IntervalRecord record, TimeRange<?> timeRange) {
        Instant instantWithDefaultZoneFallback;
        Instant instantWithDefaultZoneFallback2;
        zcp.c(record, "");
        zcp.c(timeRange, "");
        boolean z = timeRange instanceof InstantTimeRange;
        if (z) {
            instantWithDefaultZoneFallback = ((InstantTimeRange) timeRange).getStartTime();
        } else {
            if (!(timeRange instanceof LocalTimeRange)) {
                throw new yyv();
            }
            instantWithDefaultZoneFallback = TimeExtensionsKt.toInstantWithDefaultZoneFallback(((LocalTimeRange) timeRange).getStartTime(), record.getStartZoneOffset());
        }
        if (z) {
            instantWithDefaultZoneFallback2 = ((InstantTimeRange) timeRange).getEndTime();
        } else {
            if (!(timeRange instanceof LocalTimeRange)) {
                throw new yyv();
            }
            instantWithDefaultZoneFallback2 = TimeExtensionsKt.toInstantWithDefaultZoneFallback(((LocalTimeRange) timeRange).getEndTime(), record.getEndZoneOffset());
        }
        return Math.max(0.0d, TimeExtensionsKt.div(TimeExtensionsKt.minus((Instant) zay.a(record.getEndTime(), instantWithDefaultZoneFallback2), (Instant) zay.e(record.getStartTime(), instantWithDefaultZoneFallback)), TimeExtensionsKt.getDuration(record)));
    }

    public final Instant getTime$connect_client_release(Object obj) {
        zcp.c(obj, "");
        if (obj instanceof CyclingPedalingCadenceRecord.Sample) {
            return ((CyclingPedalingCadenceRecord.Sample) obj).getTime();
        }
        if (obj instanceof SpeedRecord.Sample) {
            return ((SpeedRecord.Sample) obj).getTime();
        }
        if (obj instanceof StepsCadenceRecord.Sample) {
            return ((StepsCadenceRecord.Sample) obj).getTime();
        }
        throw new IllegalStateException(("Unsupported type for time: " + obj).toString());
    }

    public final double getValue$connect_client_release(Object obj) {
        zcp.c(obj, "");
        if (obj instanceof CyclingPedalingCadenceRecord.Sample) {
            return ((CyclingPedalingCadenceRecord.Sample) obj).getRevolutionsPerMinute();
        }
        if (obj instanceof SpeedRecord.Sample) {
            return ((SpeedRecord.Sample) obj).getSpeed().getMetersPerSecond();
        }
        if (obj instanceof StepsCadenceRecord.Sample) {
            return ((StepsCadenceRecord.Sample) obj).getRate();
        }
        throw new IllegalStateException(("Unsupported type for value: " + obj).toString());
    }
}
