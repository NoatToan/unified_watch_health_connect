package androidx.health.connect.client.impl.platform.aggregate;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod;
import androidx.health.connect.client.records.CyclingPedalingCadenceRecord;
import androidx.health.connect.client.records.SeriesRecord;
import androidx.health.connect.client.records.SpeedRecord;
import androidx.health.connect.client.records.StepsCadenceRecord;
import androidx.health.connect.client.request.AggregateGroupByDurationRequest;
import androidx.health.connect.client.request.AggregateGroupByPeriodRequest;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.connect.client.request.ReadRecordsRequest;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcp;
import defpackage.zcv;
import java.time.Duration;
import java.time.Period;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0007\u001a\u00020\b\"\u000e\b\u0000\u0010\t\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0003*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0080H¢\u0006\u0002\u0010\r\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\"\u000e\b\u0000\u0010\t\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0003*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0010H\u0080H¢\u0006\u0002\u0010\u0011\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e\"\u000e\b\u0000\u0010\t\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0003*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0013H\u0080H¢\u0006\u0002\u0010\u0014\"4\u0010\u0000\u001a(\u0012\u0012\u0012\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"RECORDS_TO_AGGREGATE_METRICS_INFO_MAP", "", "Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/SeriesRecord;", "", "Landroidx/health/connect/client/impl/platform/aggregate/AggregateMetricsInfo;", "", "aggregateSeries", "Landroidx/health/connect/client/aggregate/AggregationResult;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/health/connect/client/HealthConnectClient;", "aggregateRequest", "Landroidx/health/connect/client/request/AggregateRequest;", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/health/connect/client/impl/platform/aggregate/AggregationResultGroupedByDurationWithMinTime;", "Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SeriesRecordAggregationExtensionsKt {
    private static final Map<KClass<? extends SeriesRecord<Object>>, AggregateMetricsInfo<? extends Comparable<?>>> RECORDS_TO_AGGREGATE_METRICS_INFO_MAP = zae.e(yyz.c(zcv.b(CyclingPedalingCadenceRecord.class), new AggregateMetricsInfo(CyclingPedalingCadenceRecord.RPM_AVG, CyclingPedalingCadenceRecord.RPM_MIN, CyclingPedalingCadenceRecord.RPM_MAX)), yyz.c(zcv.b(SpeedRecord.class), new AggregateMetricsInfo(SpeedRecord.SPEED_AVG, SpeedRecord.SPEED_MIN, SpeedRecord.SPEED_MAX)), yyz.c(zcv.b(StepsCadenceRecord.class), new AggregateMetricsInfo(StepsCadenceRecord.RATE_AVG, StepsCadenceRecord.RATE_MIN, StepsCadenceRecord.RATE_MAX)));

    public static final /* synthetic */ <T extends SeriesRecord<?>> Object aggregateSeries(HealthConnectClient healthConnectClient, AggregateRequest aggregateRequest, Continuation<? super AggregationResult> continuation) {
        TimeRange<?> timeRangeCreateTimeRange = TimeRangeFilterUtilsKt.createTimeRange(aggregateRequest.getTimeRangeFilter());
        zcp.b(4, ExifInterface.GPS_DIRECTION_TRUE);
        ReadRecordsRequest readRecordsRequest = new ReadRecordsRequest(zcv.b(SeriesRecord.class), TimeRangeFilterUtilsKt.withBufferedStart(aggregateRequest.getTimeRangeFilter()), aggregateRequest.getDataOriginFilter$connect_client_release(), false, 0, null, 56, null);
        zcp.b(4, ExifInterface.GPS_DIRECTION_TRUE);
        return HealthConnectClientAggregationExtensionsKt.aggregate(healthConnectClient, readRecordsRequest, new ResultAggregator(timeRangeCreateTimeRange, new SeriesAggregationProcessor(zcv.b(SeriesRecord.class), aggregateRequest.getMetrics$connect_client_release(), timeRangeCreateTimeRange)), continuation);
    }

    public static final /* synthetic */ <T extends SeriesRecord<?>> Object aggregateSeries(HealthConnectClient healthConnectClient, final AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest, Continuation<? super List<AggregationResultGroupedByPeriod>> continuation) {
        zcp.b(4, ExifInterface.GPS_DIRECTION_TRUE);
        ReadRecordsRequest readRecordsRequest = new ReadRecordsRequest(zcv.b(SeriesRecord.class), TimeRangeFilterUtilsKt.withBufferedStart(aggregateGroupByPeriodRequest.getTimeRangeFilter()), aggregateGroupByPeriodRequest.getDataOriginFilter$connect_client_release(), false, 0, null, 56, null);
        LocalTimeRange localTimeRangeCreateLocalTimeRange = TimeRangeFilterUtilsKt.createLocalTimeRange(aggregateGroupByPeriodRequest.getTimeRangeFilter());
        Period timeRangeSlicer = aggregateGroupByPeriodRequest.getTimeRangeSlicer();
        zcp.d();
        return HealthConnectClientAggregationExtensionsKt.aggregate(healthConnectClient, readRecordsRequest, new ResultGroupedByPeriodAggregator(localTimeRangeCreateLocalTimeRange, timeRangeSlicer, new Function1<LocalTimeRange, AggregationProcessor<T>>() { // from class: androidx.health.connect.client.impl.platform.aggregate.SeriesRecordAggregationExtensionsKt.aggregateSeries.3
            @Override // kotlin.jvm.functions.Function1
            public final AggregationProcessor<T> invoke(LocalTimeRange localTimeRange) {
                zcp.c(localTimeRange, "");
                zcp.b(4, ExifInterface.GPS_DIRECTION_TRUE);
                return new SeriesAggregationProcessor(zcv.b(SeriesRecord.class), aggregateGroupByPeriodRequest.getMetrics$connect_client_release(), localTimeRange);
            }

            {
                super(1);
            }
        }), continuation);
    }

    public static final /* synthetic */ <T extends SeriesRecord<?>> Object aggregateSeries(HealthConnectClient healthConnectClient, final AggregateGroupByDurationRequest aggregateGroupByDurationRequest, Continuation<? super List<AggregationResultGroupedByDurationWithMinTime>> continuation) {
        zcp.b(4, ExifInterface.GPS_DIRECTION_TRUE);
        ReadRecordsRequest readRecordsRequest = new ReadRecordsRequest(zcv.b(SeriesRecord.class), TimeRangeFilterUtilsKt.withBufferedStart(aggregateGroupByDurationRequest.getTimeRangeFilter()), aggregateGroupByDurationRequest.getDataOriginFilter$connect_client_release(), false, 0, null, 56, null);
        TimeRange<?> timeRangeCreateTimeRange = TimeRangeFilterUtilsKt.createTimeRange(aggregateGroupByDurationRequest.getTimeRangeFilter());
        Duration timeRangeSlicer = aggregateGroupByDurationRequest.getTimeRangeSlicer();
        zcp.d();
        return HealthConnectClientAggregationExtensionsKt.aggregate(healthConnectClient, readRecordsRequest, new ResultGroupedByDurationAggregator(timeRangeCreateTimeRange, timeRangeSlicer, new Function1<InstantTimeRange, AggregationProcessor<T>>() { // from class: androidx.health.connect.client.impl.platform.aggregate.SeriesRecordAggregationExtensionsKt.aggregateSeries.5
            @Override // kotlin.jvm.functions.Function1
            public final AggregationProcessor<T> invoke(InstantTimeRange instantTimeRange) {
                zcp.c(instantTimeRange, "");
                zcp.b(4, ExifInterface.GPS_DIRECTION_TRUE);
                return new SeriesAggregationProcessor(zcv.b(SeriesRecord.class), aggregateGroupByDurationRequest.getMetrics$connect_client_release(), instantTimeRange);
            }

            {
                super(1);
            }
        }), continuation);
    }
}
