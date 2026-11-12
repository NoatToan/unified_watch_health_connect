package androidx.health.connect.client.impl.platform.response;

import android.health.connect.AggregateRecordsGroupedByDurationResponse;
import android.health.connect.AggregateRecordsGroupedByPeriodResponse;
import android.health.connect.AggregateRecordsResponse;
import android.health.connect.datatypes.AggregationType;
import android.health.connect.datatypes.DataOrigin;
import android.os.ext.SdkExtensions;
import androidx.core.view.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByDuration;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod;
import androidx.health.connect.client.impl.platform.aggregate.AggregationMappingsKt;
import androidx.health.connect.client.impl.platform.records.MetadataConvertersKt;
import androidx.health.connect.client.impl.platform.request.RequestConvertersKt;
import androidx.health.connect.client.records.FhirVersion$$ExternalSyntheticApiModelOutline0;
import androidx.health.connect.client.units.Energy;
import androidx.health.connect.client.units.Mass;
import defpackage.yzp;
import defpackage.zae;
import defpackage.zaj;
import defpackage.zcn;
import defpackage.zcp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\u001a$\u0010\u0002\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007\u001a$\u0010\u0002\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00050\n2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007\u001a$\u0010\u0002\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00050\f2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007\u001a4\u0010\u0002\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00050\f2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e\u001a\\\u0010\u0010\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\u001a\u0010\u0011\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00122\"\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0013\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0015j\u0002`\u00160\u00070\u0012H\u0001\u001a.\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0018\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u0004\u0012\u00020\u00050\u0018H\u0001\u001a.\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001d0\u00182\u0018\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u0004\u0012\u00020\u00050\u0018H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"BUCKET_DATA_ORIGINS_EXTENSION_VERSION", "", "toSdkResponse", "Landroidx/health/connect/client/aggregate/AggregationResult;", "Landroid/health/connect/AggregateRecordsResponse;", "", "metrics", "", "Landroidx/health/connect/client/aggregate/AggregateMetric;", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "Landroid/health/connect/AggregateRecordsGroupedByDurationResponse;", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "Landroid/health/connect/AggregateRecordsGroupedByPeriodResponse;", "bucketStartTime", "Ljava/time/LocalDateTime;", "bucketEndTime", "buildAggregationResult", "aggregationValueGetter", "Lkotlin/Function1;", "Landroid/health/connect/datatypes/AggregationType;", "platformDataOriginsGetter", "Landroid/health/connect/datatypes/DataOrigin;", "Landroidx/health/connect/client/impl/platform/records/PlatformDataOrigin;", "getLongMetricValues", "", "", "", "metricValueMap", "getDoubleMetricValues", "", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ResponseConvertersKt {
    private static final int BUCKET_DATA_ORIGINS_EXTENSION_VERSION = 10;

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.platform.response.ResponseConvertersKt$toSdkResponse$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends zcn implements Function1<AggregationType<Object>, Object> {
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AggregationType<Object> aggregationType) {
            zcp.c(aggregationType, "");
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m72m(this.receiver).get(aggregationType);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(AggregationType<Object> aggregationType) {
            return invoke2(FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) aggregationType));
        }

        AnonymousClass1(Object obj) {
            super(1, obj, FhirVersion$$ExternalSyntheticApiModelOutline0.m440m(), "get", "get(Landroid/health/connect/datatypes/AggregationType;)Ljava/lang/Object;", 0);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.platform.response.ResponseConvertersKt$toSdkResponse$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass2 extends zcn implements Function1<AggregationType<Object>, Set<DataOrigin>> {
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Set<DataOrigin> invoke(AggregationType<Object> aggregationType) {
            return invoke2(FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) aggregationType));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Set<DataOrigin> invoke2(AggregationType<Object> aggregationType) {
            zcp.c(aggregationType, "");
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m72m(this.receiver).getDataOrigins(aggregationType);
        }

        AnonymousClass2(Object obj) {
            super(1, obj, FhirVersion$$ExternalSyntheticApiModelOutline0.m440m(), "getDataOrigins", "getDataOrigins(Landroid/health/connect/datatypes/AggregationType;)Ljava/util/Set;", 0);
        }
    }

    public static final AggregationResult toSdkResponse(AggregateRecordsResponse<Object> aggregateRecordsResponse, Set<? extends AggregateMetric<? extends Object>> set) {
        zcp.c(aggregateRecordsResponse, "");
        zcp.c(set, "");
        return buildAggregationResult(set, new AnonymousClass1(aggregateRecordsResponse), new AnonymousClass2(aggregateRecordsResponse));
    }

    public static final AggregationResultGroupedByDuration toSdkResponse(AggregateRecordsGroupedByDurationResponse<Object> aggregateRecordsGroupedByDurationResponse, Set<? extends AggregateMetric<? extends Object>> set) {
        ResponseConvertersKt$toSdkResponse$platformDataOriginsGetter$2 responseConvertersKt$toSdkResponse$platformDataOriginsGetter$1;
        ZoneOffset zoneOffset;
        zcp.c(aggregateRecordsGroupedByDurationResponse, "");
        zcp.c(set, "");
        if (SdkExtensions.getExtensionVersion(34) < 10) {
            responseConvertersKt$toSdkResponse$platformDataOriginsGetter$1 = new Function1<AggregationType<Object>, Set<? extends DataOrigin>>() { // from class: androidx.health.connect.client.impl.platform.response.ResponseConvertersKt$toSdkResponse$platformDataOriginsGetter$2
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Set<? extends DataOrigin> invoke(AggregationType<Object> aggregationType) {
                    return invoke2(FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) aggregationType));
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Set<DataOrigin> invoke2(AggregationType<Object> aggregationType) {
                    zcp.c(aggregationType, "");
                    return zaj.d();
                }
            };
        } else {
            responseConvertersKt$toSdkResponse$platformDataOriginsGetter$1 = new ResponseConvertersKt$toSdkResponse$platformDataOriginsGetter$1(aggregateRecordsGroupedByDurationResponse);
        }
        AggregationResult aggregationResultBuildAggregationResult = buildAggregationResult(set, new AnonymousClass3(aggregateRecordsGroupedByDurationResponse), responseConvertersKt$toSdkResponse$platformDataOriginsGetter$1);
        Instant startTime = aggregateRecordsGroupedByDurationResponse.getStartTime();
        zcp.b((Object) startTime, "");
        Instant endTime = aggregateRecordsGroupedByDurationResponse.getEndTime();
        zcp.b((Object) endTime, "");
        Iterator<T> it = set.iterator();
        do {
            if (!it.hasNext()) {
                zoneOffset = null;
                break;
            }
            zoneOffset = aggregateRecordsGroupedByDurationResponse.getZoneOffset(RequestConvertersKt.toAggregationType((AggregateMetric) it.next()));
        } while (zoneOffset == null);
        ZoneOffset offset = zoneOffset == null ? ZoneOffset.systemDefault().getRules().getOffset(aggregateRecordsGroupedByDurationResponse.getStartTime()) : zoneOffset;
        zcp.e(offset);
        return new AggregationResultGroupedByDuration(aggregationResultBuildAggregationResult, startTime, endTime, offset, true);
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.platform.response.ResponseConvertersKt$toSdkResponse$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass3 extends zcn implements Function1<AggregationType<Object>, Object> {
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AggregationType<Object> aggregationType) {
            zcp.c(aggregationType, "");
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m(this.receiver).get(aggregationType);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(AggregationType<Object> aggregationType) {
            return invoke2(FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) aggregationType));
        }

        AnonymousClass3(Object obj) {
            super(1, obj, FhirVersion$$ExternalSyntheticApiModelOutline0.m$1(), "get", "get(Landroid/health/connect/datatypes/AggregationType;)Ljava/lang/Object;", 0);
        }
    }

    public static final AggregationResultGroupedByPeriod toSdkResponse(AggregateRecordsGroupedByPeriodResponse<Object> aggregateRecordsGroupedByPeriodResponse, Set<? extends AggregateMetric<? extends Object>> set) {
        zcp.c(aggregateRecordsGroupedByPeriodResponse, "");
        zcp.c(set, "");
        LocalDateTime startTime = aggregateRecordsGroupedByPeriodResponse.getStartTime();
        zcp.b((Object) startTime, "");
        LocalDateTime endTime = aggregateRecordsGroupedByPeriodResponse.getEndTime();
        zcp.b((Object) endTime, "");
        return toSdkResponse(aggregateRecordsGroupedByPeriodResponse, set, startTime, endTime);
    }

    public static final AggregationResultGroupedByPeriod toSdkResponse(AggregateRecordsGroupedByPeriodResponse<Object> aggregateRecordsGroupedByPeriodResponse, Set<? extends AggregateMetric<? extends Object>> set, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        ResponseConvertersKt$toSdkResponse$platformDataOriginsGetter$4 responseConvertersKt$toSdkResponse$platformDataOriginsGetter$3;
        zcp.c(aggregateRecordsGroupedByPeriodResponse, "");
        zcp.c(set, "");
        zcp.c(localDateTime, "");
        zcp.c(localDateTime2, "");
        if (SdkExtensions.getExtensionVersion(34) < 10) {
            responseConvertersKt$toSdkResponse$platformDataOriginsGetter$3 = new Function1<AggregationType<Object>, Set<? extends DataOrigin>>() { // from class: androidx.health.connect.client.impl.platform.response.ResponseConvertersKt$toSdkResponse$platformDataOriginsGetter$4
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Set<? extends DataOrigin> invoke(AggregationType<Object> aggregationType) {
                    return invoke2(FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) aggregationType));
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Set<DataOrigin> invoke2(AggregationType<Object> aggregationType) {
                    zcp.c(aggregationType, "");
                    return zaj.d();
                }
            };
        } else {
            responseConvertersKt$toSdkResponse$platformDataOriginsGetter$3 = new ResponseConvertersKt$toSdkResponse$platformDataOriginsGetter$3(aggregateRecordsGroupedByPeriodResponse);
        }
        return new AggregationResultGroupedByPeriod(buildAggregationResult(set, new AnonymousClass5(aggregateRecordsGroupedByPeriodResponse), responseConvertersKt$toSdkResponse$platformDataOriginsGetter$3), localDateTime, localDateTime2, true);
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.platform.response.ResponseConvertersKt$toSdkResponse$5, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass5 extends zcn implements Function1<AggregationType<Object>, Object> {
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AggregationType<Object> aggregationType) {
            zcp.c(aggregationType, "");
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m71m(this.receiver).get(aggregationType);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(AggregationType<Object> aggregationType) {
            return invoke2(FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) aggregationType));
        }

        AnonymousClass5(Object obj) {
            super(1, obj, FhirVersion$$ExternalSyntheticApiModelOutline0.m$2(), "get", "get(Landroid/health/connect/datatypes/AggregationType;)Ljava/lang/Object;", 0);
        }
    }

    public static final AggregationResult buildAggregationResult(Set<? extends AggregateMetric<? extends Object>> set, Function1<? super AggregationType<Object>, ? extends Object> function1, Function1<? super AggregationType<Object>, ? extends Set<DataOrigin>> function2) {
        zcp.c(set, "");
        zcp.c(function1, "");
        zcp.c(function2, "");
        Map mapC = zae.c();
        Set<? extends AggregateMetric<? extends Object>> set2 = set;
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            AggregateMetric aggregateMetric = (AggregateMetric) it.next();
            Object objInvoke = function1.invoke(RequestConvertersKt.toAggregationType(aggregateMetric));
            if (objInvoke != null) {
                mapC.put(aggregateMetric, objInvoke);
            }
        }
        Map mapC2 = zae.c(mapC);
        Map<String, Long> longMetricValues = getLongMetricValues(mapC2);
        Map<String, Double> doubleMetricValues = getDoubleMetricValues(mapC2);
        HashSet hashSet = new HashSet();
        Iterator<T> it2 = set2.iterator();
        while (it2.hasNext()) {
            Set<DataOrigin> setInvoke = function2.invoke(RequestConvertersKt.toAggregationType((AggregateMetric) it2.next()));
            ArrayList arrayList = new ArrayList(yzp.e(setInvoke, 10));
            Iterator<T> it3 = setInvoke.iterator();
            while (it3.hasNext()) {
                arrayList.add(MetadataConvertersKt.toSdkDataOrigin(FhirVersion$$ExternalSyntheticApiModelOutline0.m425m(it3.next())));
            }
            yzp.e((Collection) hashSet, (Iterable) arrayList);
        }
        return new AggregationResult(longMetricValues, doubleMetricValues, hashSet);
    }

    public static final Map<String, Long> getLongMetricValues(Map<AggregateMetric<Object>, ? extends Object> map) {
        zcp.c(map, "");
        Map mapC = zae.c();
        for (Map.Entry<AggregateMetric<Object>, ? extends Object> entry : map.entrySet()) {
            AggregateMetric<Object> key = entry.getKey();
            Object value = entry.getValue();
            if (AggregationMappingsKt.getDURATION_AGGREGATION_METRIC_TYPE_MAP().containsKey(key) || AggregationMappingsKt.getLONG_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey = key.getMetricKey();
                zcp.e(value, "");
                mapC.put(metricKey, (Long) value);
            }
        }
        return zae.c(mapC);
    }

    public static final Map<String, Double> getDoubleMetricValues(Map<AggregateMetric<Object>, ? extends Object> map) {
        zcp.c(map, "");
        Map mapC = zae.c();
        for (Map.Entry<AggregateMetric<Object>, ? extends Object> entry : map.entrySet()) {
            AggregateMetric<Object> key = entry.getKey();
            Object value = entry.getValue();
            if (AggregationMappingsKt.getDOUBLE_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey = key.getMetricKey();
                zcp.e(value, "");
                mapC.put(metricKey, (Double) value);
            } else if (AggregationMappingsKt.getENERGY_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey2 = key.getMetricKey();
                Energy.Companion companion = Energy.INSTANCE;
                zcp.e(value, "");
                mapC.put(metricKey2, Double.valueOf(companion.calories(FhirVersion$$ExternalSyntheticApiModelOutline0.m430m(value).getInCalories()).getKilocalories()));
            } else if (AggregationMappingsKt.getGRAMS_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey3 = key.getMetricKey();
                zcp.e(value, "");
                mapC.put(metricKey3, Double.valueOf(FhirVersion$$ExternalSyntheticApiModelOutline0.m432m(value).getInGrams()));
            } else if (AggregationMappingsKt.getLENGTH_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey4 = key.getMetricKey();
                zcp.e(value, "");
                mapC.put(metricKey4, Double.valueOf(FhirVersion$$ExternalSyntheticApiModelOutline0.m431m(value).getInMeters()));
            } else if (AggregationMappingsKt.getKILOGRAMS_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey5 = key.getMetricKey();
                Mass.Companion companion2 = Mass.INSTANCE;
                zcp.e(value, "");
                mapC.put(metricKey5, Double.valueOf(companion2.grams(FhirVersion$$ExternalSyntheticApiModelOutline0.m432m(value).getInGrams()).getKilograms()));
            } else if (AggregationMappingsKt.getPRESSURE_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey6 = key.getMetricKey();
                zcp.e(value, "");
                mapC.put(metricKey6, Double.valueOf(FhirVersion$$ExternalSyntheticApiModelOutline0.m434m(value).getInMillimetersOfMercury()));
            } else if (AggregationMappingsKt.getPOWER_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey7 = key.getMetricKey();
                zcp.e(value, "");
                mapC.put(metricKey7, Double.valueOf(FhirVersion$$ExternalSyntheticApiModelOutline0.m433m(value).getInWatts()));
            } else if (AggregationMappingsKt.getTEMPERATURE_DELTA_METRIC_TYPE_MAP().containsKey(key)) {
                if (SdkExtensions.getExtensionVersion(34) < 13) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                String metricKey8 = key.getMetricKey();
                zcp.e(value, "");
                mapC.put(metricKey8, Double.valueOf(FhirVersion$$ExternalSyntheticApiModelOutline0.m435m(value).getInCelsius()));
            } else if (AggregationMappingsKt.getVELOCITY_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey9 = key.getMetricKey();
                zcp.e(value, "");
                mapC.put(metricKey9, Double.valueOf(FhirVersion$$ExternalSyntheticApiModelOutline0.m436m(value).getInMetersPerSecond()));
            } else if (AggregationMappingsKt.getVOLUME_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey10 = key.getMetricKey();
                zcp.e(value, "");
                mapC.put(metricKey10, Double.valueOf(FhirVersion$$ExternalSyntheticApiModelOutline0.m437m(value).getInLiters()));
            }
        }
        return zae.c(mapC);
    }
}
