package androidx.health.connect.client.impl.platform.aggregate;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod;
import androidx.health.connect.client.impl.platform.TimeExtensionsKt;
import androidx.health.connect.client.records.InstantaneousRecord;
import androidx.health.connect.client.records.IntervalRecord;
import androidx.health.connect.client.records.Record;
import defpackage.zay;
import defpackage.zcp;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003B1\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/health/connect/client/impl/platform/aggregate/ResultGroupedByPeriodAggregator;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/health/connect/client/records/Record;", "Landroidx/health/connect/client/impl/platform/aggregate/Aggregator;", "", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "timeRange", "Landroidx/health/connect/client/impl/platform/aggregate/LocalTimeRange;", "bucketPeriod", "Ljava/time/Period;", "initProcessor", "Lkotlin/Function1;", "Landroidx/health/connect/client/impl/platform/aggregate/AggregationProcessor;", "<init>", "(Landroidx/health/connect/client/impl/platform/aggregate/LocalTimeRange;Ljava/time/Period;Lkotlin/jvm/functions/Function1;)V", "bucketProcessors", "", "Ljava/time/LocalDateTime;", "filterAndAggregate", "", "record", "(Landroidx/health/connect/client/records/Record;)V", "getResult", "getBucketStartTime", "time", "getBucketTimeRange", "bucketStartTime", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResultGroupedByPeriodAggregator<T extends Record> implements Aggregator<T, List<? extends AggregationResultGroupedByPeriod>> {
    private final Period bucketPeriod;
    private final Map<LocalDateTime, AggregationProcessor<T>> bucketProcessors;
    private final Function1<LocalTimeRange, AggregationProcessor<T>> initProcessor;
    private final LocalTimeRange timeRange;

    /* JADX WARN: Multi-variable type inference failed */
    public ResultGroupedByPeriodAggregator(LocalTimeRange localTimeRange, Period period, Function1<? super LocalTimeRange, ? extends AggregationProcessor<T>> function1) {
        zcp.c(localTimeRange, "");
        zcp.c(period, "");
        zcp.c(function1, "");
        this.timeRange = localTimeRange;
        this.bucketPeriod = period;
        this.initProcessor = function1;
        this.bucketProcessors = new LinkedHashMap();
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.Aggregator
    public void filterAndAggregate(T record) {
        LocalDateTime bucketStartTime;
        LocalDateTime bucketStartTime2;
        zcp.c(record, "");
        if (AggregatorUtils.INSTANCE.contributesToAggregation$connect_client_release(record, this.timeRange)) {
            LocalDateTime startTime = this.timeRange.getStartTime();
            boolean z = record instanceof InstantaneousRecord;
            if (z) {
                InstantaneousRecord instantaneousRecord = (InstantaneousRecord) record;
                bucketStartTime = getBucketStartTime(TimeExtensionsKt.toLocalTimeWithDefaultZoneFallback(instantaneousRecord.getTime(), instantaneousRecord.getZoneOffset()));
            } else if (record instanceof IntervalRecord) {
                IntervalRecord intervalRecord = (IntervalRecord) record;
                bucketStartTime = getBucketStartTime(TimeExtensionsKt.toLocalTimeWithDefaultZoneFallback(intervalRecord.getStartTime(), intervalRecord.getStartZoneOffset()));
            } else {
                throw new IllegalStateException(("Unsupported value for aggregation: " + record).toString());
            }
            LocalDateTime localDateTimePlus = (LocalDateTime) zay.e(startTime, bucketStartTime);
            if (z) {
                bucketStartTime2 = localDateTimePlus;
            } else if (record instanceof IntervalRecord) {
                IntervalRecord intervalRecord2 = (IntervalRecord) record;
                bucketStartTime2 = getBucketStartTime(TimeExtensionsKt.toLocalTimeWithDefaultZoneFallback(intervalRecord2.getEndTime(), intervalRecord2.getEndZoneOffset()));
            } else {
                throw new IllegalStateException(("Unsupported value for aggregation: " + record).toString());
            }
            while (localDateTimePlus.compareTo((ChronoLocalDateTime<?>) bucketStartTime2) <= 0 && localDateTimePlus.compareTo((ChronoLocalDateTime<?>) this.timeRange.getEndTime()) < 0) {
                LocalTimeRange bucketTimeRange = getBucketTimeRange(localDateTimePlus);
                if (AggregatorUtils.INSTANCE.contributesToAggregation$connect_client_release(record, bucketTimeRange)) {
                    Map<LocalDateTime, AggregationProcessor<T>> map = this.bucketProcessors;
                    AggregationProcessor<T> aggregationProcessorInvoke = map.get(localDateTimePlus);
                    if (aggregationProcessorInvoke == null) {
                        aggregationProcessorInvoke = this.initProcessor.invoke(bucketTimeRange);
                        map.put(localDateTimePlus, aggregationProcessorInvoke);
                    }
                    aggregationProcessorInvoke.processRecord(record);
                }
                localDateTimePlus = localDateTimePlus.plus((TemporalAmount) this.bucketPeriod);
                zcp.b((Object) localDateTimePlus, "");
            }
        }
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.Aggregator
    public List<? extends AggregationResultGroupedByPeriod> getResult() {
        Map<LocalDateTime, AggregationProcessor<T>> map = this.bucketProcessors;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<LocalDateTime, AggregationProcessor<T>> entry : map.entrySet()) {
            LocalDateTime key = entry.getKey();
            arrayList.add(new AggregationResultGroupedByPeriod(entry.getValue().getProcessedAggregationResult(), key, getBucketTimeRange(key).getEndTime(), false, 8, null));
        }
        return arrayList;
    }

    private final LocalDateTime getBucketStartTime(LocalDateTime time) {
        LocalDateTime startTime = this.timeRange.getStartTime();
        while (time.compareTo((ChronoLocalDateTime<?>) startTime) >= 0) {
            startTime = startTime.plus((TemporalAmount) this.bucketPeriod);
            zcp.b((Object) startTime, "");
        }
        LocalDateTime localDateTimeMinus = startTime.minus((TemporalAmount) this.bucketPeriod);
        zcp.b((Object) localDateTimeMinus, "");
        return localDateTimeMinus;
    }

    private final LocalTimeRange getBucketTimeRange(LocalDateTime bucketStartTime) {
        LocalDateTime localDateTimePlus = bucketStartTime.plus((TemporalAmount) this.bucketPeriod);
        zcp.b((Object) localDateTimePlus, "");
        LocalDateTime localDateTime = (LocalDateTime) zay.a(localDateTimePlus, this.timeRange.getEndTime());
        zcp.e(localDateTime);
        return new LocalTimeRange(bucketStartTime, localDateTime);
    }
}
