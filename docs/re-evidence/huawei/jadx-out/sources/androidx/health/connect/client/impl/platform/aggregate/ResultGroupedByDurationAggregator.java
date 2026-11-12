package androidx.health.connect.client.impl.platform.aggregate;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByDuration;
import androidx.health.connect.client.records.InstantaneousRecord;
import androidx.health.connect.client.records.IntervalRecord;
import androidx.health.connect.client.records.Record;
import defpackage.yyk;
import defpackage.yyv;
import defpackage.yzp;
import defpackage.zay;
import defpackage.zcp;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAmount;
import java.time.zone.ZoneRules;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003B5\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0013H\u0002J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0013H\u0002R\u0012\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/health/connect/client/impl/platform/aggregate/ResultGroupedByDurationAggregator;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/health/connect/client/records/Record;", "Landroidx/health/connect/client/impl/platform/aggregate/Aggregator;", "", "Landroidx/health/connect/client/impl/platform/aggregate/AggregationResultGroupedByDurationWithMinTime;", "timeRange", "Landroidx/health/connect/client/impl/platform/aggregate/TimeRange;", "bucketDuration", "Ljava/time/Duration;", "initProcessor", "Lkotlin/Function1;", "Landroidx/health/connect/client/impl/platform/aggregate/InstantTimeRange;", "Landroidx/health/connect/client/impl/platform/aggregate/AggregationProcessor;", "<init>", "(Landroidx/health/connect/client/impl/platform/aggregate/TimeRange;Ljava/time/Duration;Lkotlin/jvm/functions/Function1;)V", "instantTimeRange", "bucketProcessors", "", "Ljava/time/Instant;", "Landroidx/health/connect/client/impl/platform/aggregate/AggregationProcessorWithZoneOffset;", "filterAndAggregate", "", "record", "(Landroidx/health/connect/client/records/Record;)V", "getResult", "getBucketStartTime", "time", "getBucketTimeRange", "bucketStartTime", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResultGroupedByDurationAggregator<T extends Record> implements Aggregator<T, List<? extends AggregationResultGroupedByDurationWithMinTime>> {
    private final Duration bucketDuration;
    private final Map<Instant, AggregationProcessorWithZoneOffset<T>> bucketProcessors;
    private final Function1<InstantTimeRange, AggregationProcessor<T>> initProcessor;
    private final InstantTimeRange instantTimeRange;
    private final TimeRange<?> timeRange;

    /* JADX WARN: Multi-variable type inference failed */
    public ResultGroupedByDurationAggregator(TimeRange<?> timeRange, Duration duration, Function1<? super InstantTimeRange, ? extends AggregationProcessor<T>> function1) {
        InstantTimeRange instantTimeRange;
        zcp.c(timeRange, "");
        zcp.c(duration, "");
        zcp.c(function1, "");
        this.timeRange = timeRange;
        this.bucketDuration = duration;
        this.initProcessor = function1;
        if (timeRange instanceof InstantTimeRange) {
            instantTimeRange = (InstantTimeRange) timeRange;
        } else {
            if (!(timeRange instanceof LocalTimeRange)) {
                throw new yyv();
            }
            LocalTimeRange localTimeRange = (LocalTimeRange) timeRange;
            Instant instant = localTimeRange.getStartTime().toInstant(ZoneOffset.MAX);
            zcp.b((Object) instant, "");
            Instant instant2 = localTimeRange.getEndTime().toInstant(ZoneOffset.MIN);
            zcp.b((Object) instant2, "");
            instantTimeRange = new InstantTimeRange(instant, instant2);
        }
        this.instantTimeRange = instantTimeRange;
        this.bucketProcessors = new LinkedHashMap();
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.Aggregator
    public void filterAndAggregate(T record) {
        Instant bucketStartTime;
        Instant bucketStartTime2;
        zcp.c(record, "");
        if (!AggregatorUtils.INSTANCE.contributesToAggregation$connect_client_release(record, this.timeRange)) {
            return;
        }
        Instant startTime = this.instantTimeRange.getStartTime();
        boolean z = record instanceof InstantaneousRecord;
        if (z) {
            bucketStartTime = getBucketStartTime(((InstantaneousRecord) record).getTime());
        } else {
            if (!(record instanceof IntervalRecord)) {
                throw new IllegalStateException(("Unsupported value for aggregation: " + record).toString());
            }
            bucketStartTime = getBucketStartTime(((IntervalRecord) record).getStartTime());
        }
        Object objE = zay.e(startTime, bucketStartTime);
        if (z) {
            bucketStartTime2 = (Instant) objE;
        } else {
            if (!(record instanceof IntervalRecord)) {
                throw new IllegalStateException(("Unsupported value for aggregation: " + record).toString());
            }
            bucketStartTime2 = getBucketStartTime(((IntervalRecord) record).getEndTime());
        }
        while (true) {
            Instant instant = (Instant) objE;
            if (instant.compareTo(bucketStartTime2) > 0 || instant.compareTo(this.instantTimeRange.getEndTime()) >= 0) {
                return;
            }
            InstantTimeRange bucketTimeRange = getBucketTimeRange(instant);
            if (AggregatorUtils.INSTANCE.contributesToAggregation$connect_client_release(record, bucketTimeRange)) {
                Map<Instant, AggregationProcessorWithZoneOffset<T>> map = this.bucketProcessors;
                AggregationProcessorWithZoneOffset<T> aggregationProcessorWithZoneOffset = map.get(objE);
                if (aggregationProcessorWithZoneOffset == null) {
                    aggregationProcessorWithZoneOffset = new AggregationProcessorWithZoneOffset<>(this.initProcessor.invoke(bucketTimeRange), instant);
                    map.put((Instant) objE, aggregationProcessorWithZoneOffset);
                }
                aggregationProcessorWithZoneOffset.processRecord(record);
            }
            objE = instant.plus((TemporalAmount) this.bucketDuration);
            zcp.b(objE, "");
        }
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.Aggregator
    public List<? extends AggregationResultGroupedByDurationWithMinTime> getResult() {
        Collection<AggregationProcessorWithZoneOffset<T>> collectionValues = this.bucketProcessors.values();
        ArrayList arrayList = new ArrayList(yzp.e(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            AggregationProcessorWithZoneOffset aggregationProcessorWithZoneOffset = (AggregationProcessorWithZoneOffset) it.next();
            InstantTimeRange bucketTimeRange = getBucketTimeRange(aggregationProcessorWithZoneOffset.getBucketStartTime());
            ZoneOffset zoneOffset = aggregationProcessorWithZoneOffset.getZoneOffset();
            if (zoneOffset == null) {
                ZoneRules rules = ZoneId.systemDefault().getRules();
                Instant minTime = aggregationProcessorWithZoneOffset.getMinTime();
                if (minTime == null) {
                    minTime = Instant.now();
                }
                zoneOffset = rules.getOffset(minTime);
            }
            ZoneOffset zoneOffset2 = zoneOffset;
            AggregationResult processedAggregationResult = aggregationProcessorWithZoneOffset.getProcessedAggregationResult();
            Instant startTime = bucketTimeRange.getStartTime();
            Instant endTime = bucketTimeRange.getEndTime();
            zcp.e(zoneOffset2);
            AggregationResultGroupedByDuration aggregationResultGroupedByDuration = new AggregationResultGroupedByDuration(processedAggregationResult, startTime, endTime, zoneOffset2, false, 16, null);
            Instant minTime2 = aggregationProcessorWithZoneOffset.getMinTime();
            if (minTime2 == null) {
                minTime2 = Instant.MAX;
            }
            zcp.e(minTime2);
            arrayList.add(new AggregationResultGroupedByDurationWithMinTime(aggregationResultGroupedByDuration, minTime2));
        }
        return arrayList;
    }

    private final Instant getBucketStartTime(Instant time) {
        Instant instantPlus = this.instantTimeRange.getStartTime().plus((TemporalAmount) this.bucketDuration.multipliedBy(yyk.b(Duration.between(this.instantTimeRange.getStartTime(), time), this.bucketDuration)));
        zcp.b((Object) instantPlus, "");
        return instantPlus;
    }

    private final InstantTimeRange getBucketTimeRange(Instant bucketStartTime) {
        Instant instantPlus = bucketStartTime.plus((TemporalAmount) this.bucketDuration);
        zcp.b((Object) instantPlus, "");
        Instant instant = (Instant) zay.a(instantPlus, this.instantTimeRange.getEndTime());
        zcp.e(instant);
        return new InstantTimeRange(bucketStartTime, instant);
    }
}
