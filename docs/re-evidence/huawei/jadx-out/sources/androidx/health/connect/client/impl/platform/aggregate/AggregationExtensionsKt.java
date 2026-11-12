package androidx.health.connect.client.impl.platform.aggregate;

import android.os.ext.SdkExtensions;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.records.BloodPressureRecord;
import androidx.health.connect.client.records.CyclingPedalingCadenceRecord;
import androidx.health.connect.client.records.NutritionRecord;
import androidx.health.connect.client.records.SpeedRecord;
import androidx.health.connect.client.records.StepsCadenceRecord;
import androidx.health.connect.client.request.AggregateGroupByDurationRequest;
import androidx.health.connect.client.request.AggregateGroupByPeriodRequest;
import androidx.health.connect.client.request.AggregateRequest;
import defpackage.yzp;
import defpackage.zaj;
import defpackage.zcp;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000\u001a$\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000\u001a$\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000\u001a\u0010\u0010\b\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0004H\u0000\"\u001e\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"withFilteredMetrics", "Landroidx/health/connect/client/request/AggregateRequest;", "predicate", "Lkotlin/Function1;", "Landroidx/health/connect/client/aggregate/AggregateMetric;", "", "Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;", "Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;", "isPlatformSupportedMetric", "AGGREGATE_METRICS_ADDED_IN_SDK_EXT_10", "", "getAGGREGATE_METRICS_ADDED_IN_SDK_EXT_10", "()Ljava/util/Set;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AggregationExtensionsKt {
    private static final Set<AggregateMetric<?>> AGGREGATE_METRICS_ADDED_IN_SDK_EXT_10 = zaj.e((Object[]) new AggregateMetric[]{BloodPressureRecord.DIASTOLIC_AVG, BloodPressureRecord.DIASTOLIC_MAX, BloodPressureRecord.DIASTOLIC_MIN, BloodPressureRecord.SYSTOLIC_AVG, BloodPressureRecord.SYSTOLIC_MAX, BloodPressureRecord.SYSTOLIC_MIN, CyclingPedalingCadenceRecord.RPM_AVG, CyclingPedalingCadenceRecord.RPM_MAX, CyclingPedalingCadenceRecord.RPM_MIN, NutritionRecord.TRANS_FAT_TOTAL, SpeedRecord.SPEED_AVG, SpeedRecord.SPEED_MAX, SpeedRecord.SPEED_MIN, StepsCadenceRecord.RATE_AVG, StepsCadenceRecord.RATE_MAX, StepsCadenceRecord.RATE_MIN});

    /* JADX WARN: Multi-variable type inference failed */
    public static final AggregateRequest withFilteredMetrics(AggregateRequest aggregateRequest, Function1<? super AggregateMetric<?>, Boolean> function1) {
        zcp.c(aggregateRequest, "");
        zcp.c(function1, "");
        Set<AggregateMetric<?>> metrics$connect_client_release = aggregateRequest.getMetrics$connect_client_release();
        ArrayList arrayList = new ArrayList();
        for (Object obj : metrics$connect_client_release) {
            if (function1.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return new AggregateRequest(yzp.g((Iterable) arrayList), aggregateRequest.getTimeRangeFilter(), aggregateRequest.getDataOriginFilter$connect_client_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AggregateGroupByPeriodRequest withFilteredMetrics(AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest, Function1<? super AggregateMetric<?>, Boolean> function1) {
        zcp.c(aggregateGroupByPeriodRequest, "");
        zcp.c(function1, "");
        Set<AggregateMetric<?>> metrics$connect_client_release = aggregateGroupByPeriodRequest.getMetrics$connect_client_release();
        ArrayList arrayList = new ArrayList();
        for (Object obj : metrics$connect_client_release) {
            if (function1.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return new AggregateGroupByPeriodRequest(yzp.g((Iterable) arrayList), aggregateGroupByPeriodRequest.getTimeRangeFilter(), aggregateGroupByPeriodRequest.getTimeRangeSlicer(), aggregateGroupByPeriodRequest.getDataOriginFilter$connect_client_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AggregateGroupByDurationRequest withFilteredMetrics(AggregateGroupByDurationRequest aggregateGroupByDurationRequest, Function1<? super AggregateMetric<?>, Boolean> function1) {
        zcp.c(aggregateGroupByDurationRequest, "");
        zcp.c(function1, "");
        Set<AggregateMetric<?>> metrics$connect_client_release = aggregateGroupByDurationRequest.getMetrics$connect_client_release();
        ArrayList arrayList = new ArrayList();
        for (Object obj : metrics$connect_client_release) {
            if (function1.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return new AggregateGroupByDurationRequest(yzp.g((Iterable) arrayList), aggregateGroupByDurationRequest.getTimeRangeFilter(), aggregateGroupByDurationRequest.getTimeRangeSlicer(), aggregateGroupByDurationRequest.getDataOriginFilter$connect_client_release());
    }

    public static final boolean isPlatformSupportedMetric(AggregateMetric<?> aggregateMetric) {
        zcp.c(aggregateMetric, "");
        return SdkExtensions.getExtensionVersion(34) >= 10 || !AGGREGATE_METRICS_ADDED_IN_SDK_EXT_10.contains(aggregateMetric);
    }

    public static final Set<AggregateMetric<?>> getAGGREGATE_METRICS_ADDED_IN_SDK_EXT_10() {
        return AGGREGATE_METRICS_ADDED_IN_SDK_EXT_10;
    }
}
