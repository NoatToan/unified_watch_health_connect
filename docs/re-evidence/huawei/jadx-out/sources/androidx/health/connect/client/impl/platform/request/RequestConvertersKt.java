package androidx.health.connect.client.impl.platform.request;

import android.health.connect.AggregateRecordsRequest;
import android.health.connect.LocalTimeRangeFilter;
import android.health.connect.ReadRecordsRequestUsingFilters;
import android.health.connect.TimeInstantRangeFilter;
import android.health.connect.TimeRangeFilter;
import android.health.connect.changelog.ChangeLogTokenRequest;
import android.health.connect.datatypes.AggregationType;
import android.health.connect.datatypes.Record;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.impl.platform.aggregate.AggregationExtensionsKt;
import androidx.health.connect.client.impl.platform.aggregate.AggregationMappingsKt;
import androidx.health.connect.client.impl.platform.records.MetadataConvertersKt;
import androidx.health.connect.client.impl.platform.records.RecordConvertersKt;
import androidx.health.connect.client.records.FhirVersion$$ExternalSyntheticApiModelOutline0;
import androidx.health.connect.client.records.metadata.DataOrigin;
import androidx.health.connect.client.request.AggregateGroupByDurationRequest;
import androidx.health.connect.client.request.AggregateGroupByPeriodRequest;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.connect.client.request.ChangesTokenRequest;
import androidx.health.connect.client.request.ReadRecordsRequest;
import defpackage.zcp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0007\u001a\n\u0010\u0000\u001a\u00020\n*\u00020\u000b\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u000e\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u000f\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u0010\u001a\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012*\b\u0012\u0004\u0012\u00020\r0\u0013¨\u0006\u0014"}, d2 = {"toPlatformRequest", "Landroid/health/connect/ReadRecordsRequestUsingFilters;", "Landroid/health/connect/datatypes/Record;", "Landroidx/health/connect/client/request/ReadRecordsRequest;", "Landroidx/health/connect/client/records/Record;", "toPlatformTimeRangeFilter", "Landroid/health/connect/TimeRangeFilter;", "Landroidx/health/connect/client/time/TimeRangeFilter;", "toPlatformLocalTimeRangeFilter", "Landroid/health/connect/LocalTimeRangeFilter;", "Landroid/health/connect/changelog/ChangeLogTokenRequest;", "Landroidx/health/connect/client/request/ChangesTokenRequest;", "Landroid/health/connect/AggregateRecordsRequest;", "", "Landroidx/health/connect/client/request/AggregateRequest;", "Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;", "Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;", "toAggregationType", "Landroid/health/connect/datatypes/AggregationType;", "Landroidx/health/connect/client/aggregate/AggregateMetric;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RequestConvertersKt {
    public static final ReadRecordsRequestUsingFilters<? extends Record> toPlatformRequest(ReadRecordsRequest<? extends androidx.health.connect.client.records.Record> readRecordsRequest) {
        zcp.c(readRecordsRequest, "");
        FhirVersion$$ExternalSyntheticApiModelOutline0.m445m();
        ReadRecordsRequestUsingFilters.Builder pageSize = FhirVersion$$ExternalSyntheticApiModelOutline0.m((Class) RecordConvertersKt.toPlatformRecordClass(readRecordsRequest.getRecordType())).setTimeRangeFilter(toPlatformTimeRangeFilter(readRecordsRequest.getTimeRangeFilter())).setPageSize(readRecordsRequest.getPageSize());
        Iterator<T> it = readRecordsRequest.getDataOriginFilter().iterator();
        while (it.hasNext()) {
            pageSize.addDataOrigins(MetadataConvertersKt.toPlatformDataOrigin((DataOrigin) it.next()));
        }
        String pageToken = readRecordsRequest.getPageToken();
        if (pageToken != null) {
            pageSize.setPageToken(Long.parseLong(pageToken));
        }
        if (readRecordsRequest.getPageToken() == null) {
            pageSize.setAscending(readRecordsRequest.getAscendingOrder());
        }
        ReadRecordsRequestUsingFilters<? extends Record> readRecordsRequestUsingFiltersBuild = pageSize.build();
        zcp.b((Object) readRecordsRequestUsingFiltersBuild, "");
        return readRecordsRequestUsingFiltersBuild;
    }

    public static final TimeRangeFilter toPlatformTimeRangeFilter(androidx.health.connect.client.time.TimeRangeFilter timeRangeFilter) {
        zcp.c(timeRangeFilter, "");
        if (timeRangeFilter.isBasedOnLocalTime$connect_client_release()) {
            return FhirVersion$$ExternalSyntheticApiModelOutline0.m421m((Object) toPlatformLocalTimeRangeFilter(timeRangeFilter));
        }
        TimeInstantRangeFilter timeInstantRangeFilterBuild = FhirVersion$$ExternalSyntheticApiModelOutline0.m420m().setStartTime(timeRangeFilter.getStartTime()).setEndTime(timeRangeFilter.getEndTime()).build();
        zcp.b((Object) timeInstantRangeFilterBuild, "");
        return FhirVersion$$ExternalSyntheticApiModelOutline0.m421m((Object) timeInstantRangeFilterBuild);
    }

    public static final LocalTimeRangeFilter toPlatformLocalTimeRangeFilter(androidx.health.connect.client.time.TimeRangeFilter timeRangeFilter) {
        zcp.c(timeRangeFilter, "");
        LocalTimeRangeFilter localTimeRangeFilterBuild = FhirVersion$$ExternalSyntheticApiModelOutline0.m417m().setStartTime(timeRangeFilter.getLocalStartTime()).setEndTime(timeRangeFilter.getLocalEndTime()).build();
        zcp.b((Object) localTimeRangeFilterBuild, "");
        return localTimeRangeFilterBuild;
    }

    public static final ChangeLogTokenRequest toPlatformRequest(ChangesTokenRequest changesTokenRequest) {
        zcp.c(changesTokenRequest, "");
        ChangeLogTokenRequest.Builder builderM423m = FhirVersion$$ExternalSyntheticApiModelOutline0.m423m();
        Iterator<T> it = changesTokenRequest.getDataOriginFilters().iterator();
        while (it.hasNext()) {
            builderM423m.addDataOriginFilter(MetadataConvertersKt.toPlatformDataOrigin((DataOrigin) it.next()));
        }
        Iterator<T> it2 = changesTokenRequest.getRecordTypes().iterator();
        while (it2.hasNext()) {
            builderM423m.addRecordType(RecordConvertersKt.toPlatformRecordClass((KClass) it2.next()));
        }
        ChangeLogTokenRequest changeLogTokenRequestBuild = builderM423m.build();
        zcp.b((Object) changeLogTokenRequestBuild, "");
        return changeLogTokenRequestBuild;
    }

    public static final AggregateRecordsRequest<Object> toPlatformRequest(AggregateRequest aggregateRequest) {
        zcp.c(aggregateRequest, "");
        FhirVersion$$ExternalSyntheticApiModelOutline0.m446m$1();
        AggregateRecordsRequest.Builder builderM = FhirVersion$$ExternalSyntheticApiModelOutline0.m(toPlatformTimeRangeFilter(aggregateRequest.getTimeRangeFilter()));
        Iterator<T> it = aggregateRequest.getDataOriginFilter$connect_client_release().iterator();
        while (it.hasNext()) {
            builderM.addDataOriginsFilter(MetadataConvertersKt.toPlatformDataOrigin((DataOrigin) it.next()));
        }
        Set<AggregateMetric<?>> metrics$connect_client_release = aggregateRequest.getMetrics$connect_client_release();
        ArrayList arrayList = new ArrayList();
        for (Object obj : metrics$connect_client_release) {
            if (AggregationExtensionsKt.isPlatformSupportedMetric((AggregateMetric) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            builderM.addAggregationType(toAggregationType((AggregateMetric) it2.next()));
        }
        AggregateRecordsRequest<Object> aggregateRecordsRequestBuild = builderM.build();
        zcp.b((Object) aggregateRecordsRequestBuild, "");
        return aggregateRecordsRequestBuild;
    }

    public static final AggregateRecordsRequest<Object> toPlatformRequest(AggregateGroupByDurationRequest aggregateGroupByDurationRequest) {
        zcp.c(aggregateGroupByDurationRequest, "");
        FhirVersion$$ExternalSyntheticApiModelOutline0.m446m$1();
        AggregateRecordsRequest.Builder builderM = FhirVersion$$ExternalSyntheticApiModelOutline0.m(toPlatformTimeRangeFilter(aggregateGroupByDurationRequest.getTimeRangeFilter()));
        Iterator<T> it = aggregateGroupByDurationRequest.getDataOriginFilter$connect_client_release().iterator();
        while (it.hasNext()) {
            builderM.addDataOriginsFilter(MetadataConvertersKt.toPlatformDataOrigin((DataOrigin) it.next()));
        }
        Set<AggregateMetric<?>> metrics$connect_client_release = aggregateGroupByDurationRequest.getMetrics$connect_client_release();
        ArrayList arrayList = new ArrayList();
        for (Object obj : metrics$connect_client_release) {
            if (AggregationExtensionsKt.isPlatformSupportedMetric((AggregateMetric) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            builderM.addAggregationType(toAggregationType((AggregateMetric) it2.next()));
        }
        AggregateRecordsRequest<Object> aggregateRecordsRequestBuild = builderM.build();
        zcp.b((Object) aggregateRecordsRequestBuild, "");
        return aggregateRecordsRequestBuild;
    }

    public static final AggregateRecordsRequest<Object> toPlatformRequest(AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest) {
        zcp.c(aggregateGroupByPeriodRequest, "");
        FhirVersion$$ExternalSyntheticApiModelOutline0.m446m$1();
        AggregateRecordsRequest.Builder builderM = FhirVersion$$ExternalSyntheticApiModelOutline0.m(FhirVersion$$ExternalSyntheticApiModelOutline0.m421m((Object) toPlatformLocalTimeRangeFilter(aggregateGroupByPeriodRequest.getTimeRangeFilter())));
        Iterator<T> it = aggregateGroupByPeriodRequest.getDataOriginFilter$connect_client_release().iterator();
        while (it.hasNext()) {
            builderM.addDataOriginsFilter(MetadataConvertersKt.toPlatformDataOrigin((DataOrigin) it.next()));
        }
        Set<AggregateMetric<?>> metrics$connect_client_release = aggregateGroupByPeriodRequest.getMetrics$connect_client_release();
        ArrayList arrayList = new ArrayList();
        for (Object obj : metrics$connect_client_release) {
            if (AggregationExtensionsKt.isPlatformSupportedMetric((AggregateMetric) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            builderM.addAggregationType(toAggregationType((AggregateMetric) it2.next()));
        }
        AggregateRecordsRequest<Object> aggregateRecordsRequestBuild = builderM.build();
        zcp.b((Object) aggregateRecordsRequestBuild, "");
        return aggregateRecordsRequestBuild;
    }

    public static final AggregationType<Object> toAggregationType(AggregateMetric<? extends Object> aggregateMetric) {
        zcp.c(aggregateMetric, "");
        AggregationType<Object> aggregationTypeM424m = FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) AggregationMappingsKt.getDOUBLE_AGGREGATION_METRIC_TYPE_MAP().get(aggregateMetric));
        if (aggregationTypeM424m != null || (aggregationTypeM424m = FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) AggregationMappingsKt.getDURATION_AGGREGATION_METRIC_TYPE_MAP().get(aggregateMetric))) != null || (aggregationTypeM424m = FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) AggregationMappingsKt.getENERGY_AGGREGATION_METRIC_TYPE_MAP().get(aggregateMetric))) != null || (aggregationTypeM424m = FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) AggregationMappingsKt.getGRAMS_AGGREGATION_METRIC_TYPE_MAP().get(aggregateMetric))) != null || (aggregationTypeM424m = FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) AggregationMappingsKt.getLENGTH_AGGREGATION_METRIC_TYPE_MAP().get(aggregateMetric))) != null || (aggregationTypeM424m = FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) AggregationMappingsKt.getLONG_AGGREGATION_METRIC_TYPE_MAP().get(aggregateMetric))) != null || (aggregationTypeM424m = FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) AggregationMappingsKt.getKILOGRAMS_AGGREGATION_METRIC_TYPE_MAP().get(aggregateMetric))) != null || (aggregationTypeM424m = FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) AggregationMappingsKt.getPOWER_AGGREGATION_METRIC_TYPE_MAP().get(aggregateMetric))) != null || (aggregationTypeM424m = FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) AggregationMappingsKt.getPRESSURE_AGGREGATION_METRIC_TYPE_MAP().get(aggregateMetric))) != null || (aggregationTypeM424m = FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) AggregationMappingsKt.getTEMPERATURE_DELTA_METRIC_TYPE_MAP().get(aggregateMetric))) != null || (aggregationTypeM424m = FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) AggregationMappingsKt.getVELOCITY_AGGREGATION_METRIC_TYPE_MAP().get(aggregateMetric))) != null) {
            return aggregationTypeM424m;
        }
        AggregationType<Object> aggregationTypeM424m2 = FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) AggregationMappingsKt.getVOLUME_AGGREGATION_METRIC_TYPE_MAP().get(aggregateMetric));
        if (aggregationTypeM424m2 != null) {
            return aggregationTypeM424m2;
        }
        throw new IllegalArgumentException("Unsupported aggregation type " + aggregateMetric.getMetricKey());
    }
}
