package androidx.health.connect.client.impl.platform.records;

import android.health.connect.AggregateRecordsGroupedByDurationResponse;
import android.health.connect.AggregateRecordsGroupedByPeriodResponse;
import android.health.connect.AggregateRecordsResponse;
import android.health.connect.datatypes.AggregationType;
import android.health.connect.datatypes.DataOrigin;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByDuration;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod;
import androidx.health.connect.client.units.Energy;
import androidx.health.connect.client.units.Mass;
import defpackage.ask;
import defpackage.dsk;
import defpackage.esk;
import defpackage.ink;
import defpackage.iqb;
import defpackage.isk;
import defpackage.jqb;
import defpackage.ksk;
import defpackage.nqb;
import defpackage.nsk;
import defpackage.srk;
import defpackage.urk;
import defpackage.wrk;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a^\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u001a\u0010\u0006\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072$\b\u0002\u0010\t\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u000e\u0012\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\u00030\u0007H\u0001\u001a.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\rH\u0001\u001a.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\r2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\rH\u0001\u001a$\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00050\u00152\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u001a$\u0010\u0013\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u00050\u00172\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u001a4\u0010\u0013\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u00050\u00172\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019\u001a$\u0010\u0013\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00050\u001b2\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¨\u0006\u001c"}, d2 = {"buildAggregationResult", "Landroidx/health/connect/client/aggregate/AggregationResult;", "metrics", "", "Landroidx/health/connect/client/aggregate/AggregateMetric;", "", "aggregationValueGetter", "Lkotlin/Function1;", "Landroid/health/connect/datatypes/AggregationType;", "platformDataOriginsGetter", "Landroid/health/connect/datatypes/DataOrigin;", "Landroidx/health/connect/client/impl/platform/records/PlatformDataOrigin;", "getDoubleMetricValues", "", "", "", "metricValueMap", "getLongMetricValues", "", "toSdkResponse", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "Landroid/health/connect/AggregateRecordsGroupedByDurationResponse;", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "Landroid/health/connect/AggregateRecordsGroupedByPeriodResponse;", "bucketStartTime", "Ljava/time/LocalDateTime;", "bucketEndTime", "Landroid/health/connect/AggregateRecordsResponse;", "connect-client_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@RequiresApi(api = 34)
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nResponseConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseConverters.kt\nandroidx/health/connect/client/impl/platform/records/ResponseConvertersKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,143:1\n1855#2:144\n1856#2:146\n1446#2,2:147\n1549#2:149\n1620#2,3:150\n1448#2,3:153\n1#3:145\n215#4,2:156\n215#4,2:158\n*S KotlinDebug\n*F\n+ 1 ResponseConverters.kt\nandroidx/health/connect/client/impl/platform/records/ResponseConvertersKt\n*L\n81#1:144\n81#1:146\n88#1:147,2\n89#1:149\n89#1:150,3\n88#1:153,3\n99#1:156,2\n115#1:158,2\n*E\n"})
public final class ResponseConvertersKt {

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.platform.records.ResponseConvertersKt$toSdkResponse$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class C12311 extends FunctionReferenceImpl implements Function1<AggregationType<Object>, Object> {
        public C12311(Object obj) {
            super(1, obj, isk.a(), "get", "get(Landroid/health/connect/datatypes/AggregationType;)Ljava/lang/Object;", 0);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull AggregationType<Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return iqb.a(this.receiver).get(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(AggregationType<Object> aggregationType) {
            return invoke2(ink.a(aggregationType));
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.platform.records.ResponseConvertersKt$toSdkResponse$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<AggregationType<Object>, Set<DataOrigin>> {
        public AnonymousClass2(Object obj) {
            super(1, obj, isk.a(), "getDataOrigins", "getDataOrigins(Landroid/health/connect/datatypes/AggregationType;)Ljava/util/Set;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Set<DataOrigin> invoke2(AggregationType<Object> aggregationType) {
            return invoke2(ink.a(aggregationType));
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Set<DataOrigin> invoke2(@NotNull AggregationType<Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return iqb.a(this.receiver).getDataOrigins(p0);
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.platform.records.ResponseConvertersKt$toSdkResponse$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<AggregationType<Object>, Object> {
        public AnonymousClass3(Object obj) {
            super(1, obj, ksk.a(), "get", "get(Landroid/health/connect/datatypes/AggregationType;)Ljava/lang/Object;", 0);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull AggregationType<Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jqb.a(this.receiver).get(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(AggregationType<Object> aggregationType) {
            return invoke2(ink.a(aggregationType));
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.platform.records.ResponseConvertersKt$toSdkResponse$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<AggregationType<Object>, Object> {
        public AnonymousClass4(Object obj) {
            super(1, obj, nsk.a(), "get", "get(Landroid/health/connect/datatypes/AggregationType;)Ljava/lang/Object;", 0);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull AggregationType<Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return nqb.a(this.receiver).get(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(AggregationType<Object> aggregationType) {
            return invoke2(ink.a(aggregationType));
        }
    }

    /* JADX INFO: renamed from: androidx.health.connect.client.impl.platform.records.ResponseConvertersKt$toSdkResponse$5, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<AggregationType<Object>, Object> {
        public AnonymousClass5(Object obj) {
            super(1, obj, nsk.a(), "get", "get(Landroid/health/connect/datatypes/AggregationType;)Ljava/lang/Object;", 0);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull AggregationType<Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return nqb.a(this.receiver).get(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(AggregationType<Object> aggregationType) {
            return invoke2(ink.a(aggregationType));
        }
    }

    @VisibleForTesting
    @NotNull
    public static final AggregationResult buildAggregationResult(@NotNull Set<? extends AggregateMetric<? extends Object>> metrics, @NotNull Function1<? super AggregationType<Object>, ? extends Object> aggregationValueGetter, @NotNull Function1<? super AggregationType<Object>, ? extends Set<DataOrigin>> platformDataOriginsGetter) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(aggregationValueGetter, "aggregationValueGetter");
        Intrinsics.checkNotNullParameter(platformDataOriginsGetter, "platformDataOriginsGetter");
        Map mapCreateMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
        Iterator<T> it = metrics.iterator();
        while (it.hasNext()) {
            AggregateMetric aggregateMetric = (AggregateMetric) it.next();
            Object objInvoke2 = aggregationValueGetter.invoke2(RequestConvertersKt.toAggregationType(aggregateMetric));
            if (objInvoke2 != null) {
                mapCreateMapBuilder.put(aggregateMetric, objInvoke2);
            }
        }
        Map mapBuild = MapsKt__MapsJVMKt.build(mapCreateMapBuilder);
        Map<String, Long> longMetricValues = getLongMetricValues(mapBuild);
        Map<String, Double> doubleMetricValues = getDoubleMetricValues(mapBuild);
        HashSet hashSet = new HashSet();
        Iterator<T> it2 = metrics.iterator();
        while (it2.hasNext()) {
            Set<DataOrigin> setInvoke2 = platformDataOriginsGetter.invoke2(RequestConvertersKt.toAggregationType((AggregateMetric) it2.next()));
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setInvoke2, 10));
            Iterator<T> it3 = setInvoke2.iterator();
            while (it3.hasNext()) {
                arrayList.add(MetadataConvertersKt.toSdkDataOrigin(ask.a(it3.next())));
            }
            CollectionsKt__MutableCollectionsKt.addAll(hashSet, arrayList);
        }
        return new AggregationResult(longMetricValues, doubleMetricValues, hashSet);
    }

    public static /* synthetic */ AggregationResult buildAggregationResult$default(Set set, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1<AggregationType<Object>, Set<? extends DataOrigin>>() { // from class: androidx.health.connect.client.impl.platform.records.ResponseConvertersKt.buildAggregationResult.1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Set<? extends DataOrigin> invoke2(AggregationType<Object> aggregationType) {
                    return invoke2(ink.a(aggregationType));
                }

                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Set<DataOrigin> invoke2(@NotNull AggregationType<Object> aggregationType) {
                    Intrinsics.checkNotNullParameter(aggregationType, "<anonymous parameter 0>");
                    return SetsKt__SetsKt.emptySet();
                }
            };
        }
        return buildAggregationResult(set, function1, function2);
    }

    @VisibleForTesting
    @NotNull
    public static final Map<String, Double> getDoubleMetricValues(@NotNull Map<AggregateMetric<Object>, ? extends Object> metricValueMap) {
        Intrinsics.checkNotNullParameter(metricValueMap, "metricValueMap");
        Map mapCreateMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
        for (Map.Entry<AggregateMetric<Object>, ? extends Object> entry : metricValueMap.entrySet()) {
            AggregateMetric<Object> key = entry.getKey();
            Object value = entry.getValue();
            if (AggregationMappingsKt.getDOUBLE_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey$connect_client_release = key.getMetricKey$connect_client_release();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                mapCreateMapBuilder.put(metricKey$connect_client_release, (Double) value);
            } else if (AggregationMappingsKt.getENERGY_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey$connect_client_release2 = key.getMetricKey$connect_client_release();
                Energy.Companion companion = Energy.INSTANCE;
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.health.connect.datatypes.units.Energy");
                mapCreateMapBuilder.put(metricKey$connect_client_release2, Double.valueOf(companion.calories(dsk.a(value).getInCalories()).getKilocalories()));
            } else if (AggregationMappingsKt.getLENGTH_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey$connect_client_release3 = key.getMetricKey$connect_client_release();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.health.connect.datatypes.units.Length{ androidx.health.connect.client.impl.platform.records.PlatformRecordAliasesKt.PlatformLength }");
                mapCreateMapBuilder.put(metricKey$connect_client_release3, Double.valueOf(srk.a(value).getInMeters()));
            } else if (AggregationMappingsKt.getGRAMS_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey$connect_client_release4 = key.getMetricKey$connect_client_release();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.health.connect.datatypes.units.Mass{ androidx.health.connect.client.impl.platform.records.PlatformRecordAliasesKt.PlatformMass }");
                mapCreateMapBuilder.put(metricKey$connect_client_release4, Double.valueOf(urk.a(value).getInGrams()));
            } else if (AggregationMappingsKt.getKILOGRAMS_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey$connect_client_release5 = key.getMetricKey$connect_client_release();
                Mass.Companion companion2 = Mass.INSTANCE;
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.health.connect.datatypes.units.Mass{ androidx.health.connect.client.impl.platform.records.PlatformRecordAliasesKt.PlatformMass }");
                mapCreateMapBuilder.put(metricKey$connect_client_release5, Double.valueOf(companion2.grams(urk.a(value).getInGrams()).getKilograms()));
            } else if (AggregationMappingsKt.getPOWER_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey$connect_client_release6 = key.getMetricKey$connect_client_release();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.health.connect.datatypes.units.Power{ androidx.health.connect.client.impl.platform.records.PlatformRecordAliasesKt.PlatformPower }");
                mapCreateMapBuilder.put(metricKey$connect_client_release6, Double.valueOf(wrk.a(value).getInWatts()));
            } else if (AggregationMappingsKt.getVOLUME_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey$connect_client_release7 = key.getMetricKey$connect_client_release();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.health.connect.datatypes.units.Volume");
                mapCreateMapBuilder.put(metricKey$connect_client_release7, Double.valueOf(esk.a(value).getInLiters()));
            }
        }
        return MapsKt__MapsJVMKt.build(mapCreateMapBuilder);
    }

    @VisibleForTesting
    @NotNull
    public static final Map<String, Long> getLongMetricValues(@NotNull Map<AggregateMetric<Object>, ? extends Object> metricValueMap) {
        Intrinsics.checkNotNullParameter(metricValueMap, "metricValueMap");
        Map mapCreateMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
        for (Map.Entry<AggregateMetric<Object>, ? extends Object> entry : metricValueMap.entrySet()) {
            AggregateMetric<Object> key = entry.getKey();
            Object value = entry.getValue();
            if (AggregationMappingsKt.getDURATION_AGGREGATION_METRIC_TYPE_MAP().containsKey(key) || AggregationMappingsKt.getLONG_AGGREGATION_METRIC_TYPE_MAP().containsKey(key)) {
                String metricKey$connect_client_release = key.getMetricKey$connect_client_release();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                mapCreateMapBuilder.put(metricKey$connect_client_release, (Long) value);
            }
        }
        return MapsKt__MapsJVMKt.build(mapCreateMapBuilder);
    }

    @NotNull
    public static final AggregationResult toSdkResponse(@NotNull AggregateRecordsResponse<Object> aggregateRecordsResponse, @NotNull Set<? extends AggregateMetric<? extends Object>> metrics) {
        Intrinsics.checkNotNullParameter(aggregateRecordsResponse, "<this>");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return buildAggregationResult(metrics, new C12311(aggregateRecordsResponse), new AnonymousClass2(aggregateRecordsResponse));
    }

    @NotNull
    public static final AggregationResultGroupedByDuration toSdkResponse(@NotNull AggregateRecordsGroupedByDurationResponse<Object> aggregateRecordsGroupedByDurationResponse, @NotNull Set<? extends AggregateMetric<? extends Object>> metrics) {
        Intrinsics.checkNotNullParameter(aggregateRecordsGroupedByDurationResponse, "<this>");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        AggregationResult aggregationResultBuildAggregationResult$default = buildAggregationResult$default(metrics, new AnonymousClass3(aggregateRecordsGroupedByDurationResponse), null, 4, null);
        Instant startTime = aggregateRecordsGroupedByDurationResponse.getStartTime();
        Intrinsics.checkNotNullExpressionValue(startTime, "startTime");
        Instant endTime = aggregateRecordsGroupedByDurationResponse.getEndTime();
        Intrinsics.checkNotNullExpressionValue(endTime, "endTime");
        ZoneOffset zoneOffset = aggregateRecordsGroupedByDurationResponse.getZoneOffset(RequestConvertersKt.toAggregationType((AggregateMetric) CollectionsKt___CollectionsKt.first(metrics)));
        if (zoneOffset == null) {
            zoneOffset = ZoneId.systemDefault().getRules().getOffset(aggregateRecordsGroupedByDurationResponse.getStartTime());
        }
        Intrinsics.checkNotNullExpressionValue(zoneOffset, "getZoneOffset(metrics.fi…ules.getOffset(startTime)");
        return new AggregationResultGroupedByDuration(aggregationResultBuildAggregationResult$default, startTime, endTime, zoneOffset);
    }

    @NotNull
    public static final AggregationResultGroupedByPeriod toSdkResponse(@NotNull AggregateRecordsGroupedByPeriodResponse<Object> aggregateRecordsGroupedByPeriodResponse, @NotNull Set<? extends AggregateMetric<? extends Object>> metrics) {
        Intrinsics.checkNotNullParameter(aggregateRecordsGroupedByPeriodResponse, "<this>");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        AggregationResult aggregationResultBuildAggregationResult$default = buildAggregationResult$default(metrics, new AnonymousClass4(aggregateRecordsGroupedByPeriodResponse), null, 4, null);
        LocalDateTime startTime = aggregateRecordsGroupedByPeriodResponse.getStartTime();
        Intrinsics.checkNotNullExpressionValue(startTime, "startTime");
        LocalDateTime endTime = aggregateRecordsGroupedByPeriodResponse.getEndTime();
        Intrinsics.checkNotNullExpressionValue(endTime, "endTime");
        return new AggregationResultGroupedByPeriod(aggregationResultBuildAggregationResult$default, startTime, endTime);
    }

    @NotNull
    public static final AggregationResultGroupedByPeriod toSdkResponse(@NotNull AggregateRecordsGroupedByPeriodResponse<Object> aggregateRecordsGroupedByPeriodResponse, @NotNull Set<? extends AggregateMetric<? extends Object>> metrics, @NotNull LocalDateTime bucketStartTime, @NotNull LocalDateTime bucketEndTime) {
        Intrinsics.checkNotNullParameter(aggregateRecordsGroupedByPeriodResponse, "<this>");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(bucketStartTime, "bucketStartTime");
        Intrinsics.checkNotNullParameter(bucketEndTime, "bucketEndTime");
        return new AggregationResultGroupedByPeriod(buildAggregationResult$default(metrics, new AnonymousClass5(aggregateRecordsGroupedByPeriodResponse), null, 4, null), bucketStartTime, bucketEndTime);
    }
}
