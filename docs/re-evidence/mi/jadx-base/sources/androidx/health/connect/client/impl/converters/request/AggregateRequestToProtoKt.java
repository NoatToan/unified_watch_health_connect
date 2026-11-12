package androidx.health.connect.client.impl.converters.request;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.impl.converters.aggregate.AggregateMetricToProtoKt;
import androidx.health.connect.client.impl.converters.time.TimeRangeFilterConverterKt;
import androidx.health.connect.client.records.metadata.DataOrigin;
import androidx.health.connect.client.request.AggregateGroupByDurationRequest;
import androidx.health.connect.client.request.AggregateGroupByPeriodRequest;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.platform.client.proto.n;
import androidx.health.platform.client.proto.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0006¢\u0006\u0004\b\u0002\u0010\u0007\u001a'\u0010\r\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\n*\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/health/connect/client/request/AggregateRequest;", "Landroidx/health/platform/client/proto/y0;", "toProto", "(Landroidx/health/connect/client/request/AggregateRequest;)Landroidx/health/platform/client/proto/y0;", "Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;)Landroidx/health/platform/client/proto/y0;", "Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;)Landroidx/health/platform/client/proto/y0;", "", "Landroidx/health/connect/client/records/metadata/DataOrigin;", "", "Landroidx/health/platform/client/proto/n;", "kotlin.jvm.PlatformType", "toProtoList", "(Ljava/util/Set;)Ljava/util/List;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nAggregateRequestToProto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AggregateRequestToProto.kt\nandroidx/health/connect/client/impl/converters/request/AggregateRequestToProtoKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1549#2:58\n1620#2,3:59\n1549#2:62\n1620#2,3:63\n1549#2:66\n1620#2,3:67\n1549#2:70\n1620#2,3:71\n*S KotlinDebug\n*F\n+ 1 AggregateRequestToProto.kt\nandroidx/health/connect/client/impl/converters/request/AggregateRequestToProtoKt\n*L\n34#1:58\n34#1:59,3\n42#1:62\n42#1:63,3\n51#1:66\n51#1:67,3\n56#1:70\n56#1:71,3\n*E\n"})
public final class AggregateRequestToProtoKt {
    @NotNull
    public static final y0 toProto(@NotNull AggregateRequest aggregateRequest) {
        Intrinsics.checkNotNullParameter(aggregateRequest, "<this>");
        y0.a aVarY = y0.Y().C(TimeRangeFilterConverterKt.toProto(aggregateRequest.getTimeRangeFilter())).y(toProtoList(aggregateRequest.getDataOriginFilter$connect_client_release()));
        Set<AggregateMetric<?>> metrics$connect_client_release = aggregateRequest.getMetrics$connect_client_release();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(metrics$connect_client_release, 10));
        Iterator<T> it = metrics$connect_client_release.iterator();
        while (it.hasNext()) {
            arrayList.add(AggregateMetricToProtoKt.toProto((AggregateMetric) it.next()));
        }
        y0 y0VarBuild = aVarY.z(arrayList).build();
        Intrinsics.checkNotNullExpressionValue(y0VarBuild, "newBuilder()\n        .se…oto() })\n        .build()");
        return y0VarBuild;
    }

    private static final List<n> toProtoList(Set<DataOrigin> set) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(n.S().y(((DataOrigin) it.next()).getPackageName()).build());
        }
        return arrayList;
    }

    @NotNull
    public static final y0 toProto(@NotNull AggregateGroupByDurationRequest aggregateGroupByDurationRequest) {
        Intrinsics.checkNotNullParameter(aggregateGroupByDurationRequest, "<this>");
        y0.a aVarY = y0.Y().C(TimeRangeFilterConverterKt.toProto(aggregateGroupByDurationRequest.getTimeRangeFilter())).y(toProtoList(aggregateGroupByDurationRequest.getDataOriginFilter$connect_client_release()));
        Set<AggregateMetric<?>> metrics$connect_client_release = aggregateGroupByDurationRequest.getMetrics$connect_client_release();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(metrics$connect_client_release, 10));
        Iterator<T> it = metrics$connect_client_release.iterator();
        while (it.hasNext()) {
            arrayList.add(AggregateMetricToProtoKt.toProto((AggregateMetric) it.next()));
        }
        y0 y0VarBuild = aVarY.z(arrayList).A(aggregateGroupByDurationRequest.getTimeRangeSlicer().toMillis()).build();
        Intrinsics.checkNotNullExpressionValue(y0VarBuild, "newBuilder()\n        .se…illis())\n        .build()");
        return y0VarBuild;
    }

    @NotNull
    public static final y0 toProto(@NotNull AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest) {
        Intrinsics.checkNotNullParameter(aggregateGroupByPeriodRequest, "<this>");
        y0.a aVarY = y0.Y().C(TimeRangeFilterConverterKt.toProto(aggregateGroupByPeriodRequest.getTimeRangeFilter())).y(toProtoList(aggregateGroupByPeriodRequest.getDataOriginFilter$connect_client_release()));
        Set<AggregateMetric<?>> metrics$connect_client_release = aggregateGroupByPeriodRequest.getMetrics$connect_client_release();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(metrics$connect_client_release, 10));
        Iterator<T> it = metrics$connect_client_release.iterator();
        while (it.hasNext()) {
            arrayList.add(AggregateMetricToProtoKt.toProto((AggregateMetric) it.next()));
        }
        y0 y0VarBuild = aVarY.z(arrayList).B(aggregateGroupByPeriodRequest.getTimeRangeSlicer().toString()).build();
        Intrinsics.checkNotNullExpressionValue(y0VarBuild, "newBuilder()\n        .se…tring())\n        .build()");
        return y0VarBuild;
    }
}
