package androidx.health.connect.client.impl.platform.aggregate;

import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod;
import androidx.health.connect.client.records.NutritionRecord;
import androidx.health.connect.client.request.AggregateGroupByDurationRequest;
import androidx.health.connect.client.request.AggregateGroupByPeriodRequest;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.connect.client.request.ReadRecordsRequest;
import defpackage.zcp;
import defpackage.zcv;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080@¢\u0006\u0002\u0010\u0005\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0080@¢\u0006\u0002\u0010\t\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\n0\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000bH\u0080@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"aggregateNutritionTransFatTotal", "Landroidx/health/connect/client/aggregate/AggregationResult;", "Landroidx/health/connect/client/HealthConnectClient;", "aggregateRequest", "Landroidx/health/connect/client/request/AggregateRequest;", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/health/connect/client/impl/platform/aggregate/AggregationResultGroupedByDurationWithMinTime;", "Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NutritionAggregationExtensionsKt {
    public static final Object aggregateNutritionTransFatTotal(HealthConnectClient healthConnectClient, AggregateRequest aggregateRequest, Continuation<? super AggregationResult> continuation) {
        TimeRange<?> timeRangeCreateTimeRange = TimeRangeFilterUtilsKt.createTimeRange(aggregateRequest.getTimeRangeFilter());
        return HealthConnectClientAggregationExtensionsKt.aggregate(healthConnectClient, new ReadRecordsRequest(zcv.b(NutritionRecord.class), TimeRangeFilterUtilsKt.withBufferedStart(aggregateRequest.getTimeRangeFilter()), aggregateRequest.getDataOriginFilter$connect_client_release(), false, 0, null, 56, null), new ResultAggregator(timeRangeCreateTimeRange, new TransFatTotalAggregationProcessor(timeRangeCreateTimeRange)), continuation);
    }

    public static final Object aggregateNutritionTransFatTotal(HealthConnectClient healthConnectClient, AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest, Continuation<? super List<AggregationResultGroupedByPeriod>> continuation) {
        return HealthConnectClientAggregationExtensionsKt.aggregate(healthConnectClient, new ReadRecordsRequest(zcv.b(NutritionRecord.class), TimeRangeFilterUtilsKt.withBufferedStart(aggregateGroupByPeriodRequest.getTimeRangeFilter()), aggregateGroupByPeriodRequest.getDataOriginFilter$connect_client_release(), false, 0, null, 56, null), new ResultGroupedByPeriodAggregator(TimeRangeFilterUtilsKt.createLocalTimeRange(aggregateGroupByPeriodRequest.getTimeRangeFilter()), aggregateGroupByPeriodRequest.getTimeRangeSlicer(), new Function1<LocalTimeRange, AggregationProcessor<NutritionRecord>>() { // from class: androidx.health.connect.client.impl.platform.aggregate.NutritionAggregationExtensionsKt.aggregateNutritionTransFatTotal.3
            @Override // kotlin.jvm.functions.Function1
            public final AggregationProcessor<NutritionRecord> invoke(LocalTimeRange localTimeRange) {
                zcp.c(localTimeRange, "");
                return new TransFatTotalAggregationProcessor(localTimeRange);
            }
        }), continuation);
    }

    public static final Object aggregateNutritionTransFatTotal(HealthConnectClient healthConnectClient, AggregateGroupByDurationRequest aggregateGroupByDurationRequest, Continuation<? super List<AggregationResultGroupedByDurationWithMinTime>> continuation) {
        return HealthConnectClientAggregationExtensionsKt.aggregate(healthConnectClient, new ReadRecordsRequest(zcv.b(NutritionRecord.class), TimeRangeFilterUtilsKt.withBufferedStart(aggregateGroupByDurationRequest.getTimeRangeFilter()), aggregateGroupByDurationRequest.getDataOriginFilter$connect_client_release(), false, 0, null, 56, null), new ResultGroupedByDurationAggregator(TimeRangeFilterUtilsKt.createTimeRange(aggregateGroupByDurationRequest.getTimeRangeFilter()), aggregateGroupByDurationRequest.getTimeRangeSlicer(), new Function1<InstantTimeRange, AggregationProcessor<NutritionRecord>>() { // from class: androidx.health.connect.client.impl.platform.aggregate.NutritionAggregationExtensionsKt.aggregateNutritionTransFatTotal.5
            @Override // kotlin.jvm.functions.Function1
            public final AggregationProcessor<NutritionRecord> invoke(InstantTimeRange instantTimeRange) {
                zcp.c(instantTimeRange, "");
                return new TransFatTotalAggregationProcessor(instantTimeRange);
            }
        }), continuation);
    }
}
