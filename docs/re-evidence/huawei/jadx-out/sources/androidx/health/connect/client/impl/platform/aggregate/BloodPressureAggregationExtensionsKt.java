package androidx.health.connect.client.impl.platform.aggregate;

import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod;
import androidx.health.connect.client.records.BloodPressureRecord;
import androidx.health.connect.client.request.AggregateGroupByDurationRequest;
import androidx.health.connect.client.request.AggregateGroupByPeriodRequest;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.connect.client.request.ReadRecordsRequest;
import androidx.health.connect.client.units.Pressure;
import defpackage.zaj;
import defpackage.zcp;
import defpackage.zcv;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0080@¢\u0006\u0002\u0010\n\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005*\u00020\u00072\u0006\u0010\b\u001a\u00020\fH\u0080@¢\u0006\u0002\u0010\r\u001a\u001a\u0010\u0004\u001a\u00020\u000e*\u00020\u00072\u0006\u0010\b\u001a\u00020\u000fH\u0080@¢\u0006\u0002\u0010\u0010\"\u001a\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"BLOOD_PRESSURE_METRICS", "", "Landroidx/health/connect/client/aggregate/AggregateMetric;", "Landroidx/health/connect/client/units/Pressure;", "aggregateBloodPressure", "", "Landroidx/health/connect/client/impl/platform/aggregate/AggregationResultGroupedByDurationWithMinTime;", "Landroidx/health/connect/client/HealthConnectClient;", "aggregateRequest", "Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/health/connect/client/aggregate/AggregationResult;", "Landroidx/health/connect/client/request/AggregateRequest;", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BloodPressureAggregationExtensionsKt {
    private static final Set<AggregateMetric<Pressure>> BLOOD_PRESSURE_METRICS = zaj.e((Object[]) new AggregateMetric[]{BloodPressureRecord.DIASTOLIC_AVG, BloodPressureRecord.DIASTOLIC_MAX, BloodPressureRecord.DIASTOLIC_MIN, BloodPressureRecord.SYSTOLIC_AVG, BloodPressureRecord.SYSTOLIC_MAX, BloodPressureRecord.SYSTOLIC_MIN});

    public static final Object aggregateBloodPressure(HealthConnectClient healthConnectClient, final AggregateGroupByDurationRequest aggregateGroupByDurationRequest, Continuation<? super List<AggregationResultGroupedByDurationWithMinTime>> continuation) {
        return HealthConnectClientAggregationExtensionsKt.aggregate(healthConnectClient, new ReadRecordsRequest(zcv.b(BloodPressureRecord.class), aggregateGroupByDurationRequest.getTimeRangeFilter(), aggregateGroupByDurationRequest.getDataOriginFilter$connect_client_release(), false, 0, null, 56, null), new ResultGroupedByDurationAggregator(TimeRangeFilterUtilsKt.createTimeRange(aggregateGroupByDurationRequest.getTimeRangeFilter()), aggregateGroupByDurationRequest.getTimeRangeSlicer(), new Function1<InstantTimeRange, AggregationProcessor<BloodPressureRecord>>() { // from class: androidx.health.connect.client.impl.platform.aggregate.BloodPressureAggregationExtensionsKt.aggregateBloodPressure.2
            @Override // kotlin.jvm.functions.Function1
            public final AggregationProcessor<BloodPressureRecord> invoke(InstantTimeRange instantTimeRange) {
                zcp.c(instantTimeRange, "");
                return new BloodPressureAggregationProcessor(aggregateGroupByDurationRequest.getMetrics$connect_client_release());
            }

            {
                super(1);
            }
        }), continuation);
    }

    public static final Object aggregateBloodPressure(HealthConnectClient healthConnectClient, final AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest, Continuation<? super List<AggregationResultGroupedByPeriod>> continuation) {
        return HealthConnectClientAggregationExtensionsKt.aggregate(healthConnectClient, new ReadRecordsRequest(zcv.b(BloodPressureRecord.class), aggregateGroupByPeriodRequest.getTimeRangeFilter(), aggregateGroupByPeriodRequest.getDataOriginFilter$connect_client_release(), false, 0, null, 56, null), new ResultGroupedByPeriodAggregator(TimeRangeFilterUtilsKt.createLocalTimeRange(aggregateGroupByPeriodRequest.getTimeRangeFilter()), aggregateGroupByPeriodRequest.getTimeRangeSlicer(), new Function1<LocalTimeRange, AggregationProcessor<BloodPressureRecord>>() { // from class: androidx.health.connect.client.impl.platform.aggregate.BloodPressureAggregationExtensionsKt.aggregateBloodPressure.4
            @Override // kotlin.jvm.functions.Function1
            public final AggregationProcessor<BloodPressureRecord> invoke(LocalTimeRange localTimeRange) {
                zcp.c(localTimeRange, "");
                return new BloodPressureAggregationProcessor(aggregateGroupByPeriodRequest.getMetrics$connect_client_release());
            }

            {
                super(1);
            }
        }), continuation);
    }

    public static final Object aggregateBloodPressure(HealthConnectClient healthConnectClient, AggregateRequest aggregateRequest, Continuation<? super AggregationResult> continuation) {
        return HealthConnectClientAggregationExtensionsKt.aggregate(healthConnectClient, new ReadRecordsRequest(zcv.b(BloodPressureRecord.class), aggregateRequest.getTimeRangeFilter(), aggregateRequest.getDataOriginFilter$connect_client_release(), false, 0, null, 56, null), new ResultAggregator(TimeRangeFilterUtilsKt.createTimeRange(aggregateRequest.getTimeRangeFilter()), new BloodPressureAggregationProcessor(aggregateRequest.getMetrics$connect_client_release())), continuation);
    }
}
