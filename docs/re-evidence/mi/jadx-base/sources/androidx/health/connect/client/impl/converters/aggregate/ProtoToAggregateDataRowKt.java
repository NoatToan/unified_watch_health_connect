package androidx.health.connect.client.impl.converters.aggregate;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByDuration;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod;
import androidx.health.connect.client.records.metadata.DataOrigin;
import androidx.health.platform.client.proto.l;
import androidx.health.platform.client.proto.n;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/health/platform/client/proto/l;", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "toAggregateDataRowGroupByDuration", "(Landroidx/health/platform/client/proto/l;)Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "toAggregateDataRowGroupByPeriod", "(Landroidx/health/platform/client/proto/l;)Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "Landroidx/health/connect/client/aggregate/AggregationResult;", "retrieveAggregateDataRow", "(Landroidx/health/platform/client/proto/l;)Landroidx/health/connect/client/aggregate/AggregationResult;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nProtoToAggregateDataRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtoToAggregateDataRow.kt\nandroidx/health/connect/client/impl/converters/aggregate/ProtoToAggregateDataRowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1#2:63\n1620#3,3:64\n*S KotlinDebug\n*F\n+ 1 ProtoToAggregateDataRow.kt\nandroidx/health/connect/client/impl/converters/aggregate/ProtoToAggregateDataRowKt\n*L\n60#1:64,3\n*E\n"})
public final class ProtoToAggregateDataRowKt {
    @NotNull
    public static final AggregationResult retrieveAggregateDataRow(@NotNull l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Map<String, Long> longValuesMap = lVar.T();
        Intrinsics.checkNotNullExpressionValue(longValuesMap, "longValuesMap");
        Map<String, Double> doubleValuesMap = lVar.Q();
        Intrinsics.checkNotNullExpressionValue(doubleValuesMap, "doubleValuesMap");
        List<n> dataOriginsList = lVar.O();
        Intrinsics.checkNotNullExpressionValue(dataOriginsList, "dataOriginsList");
        HashSet hashSet = new HashSet();
        Iterator<T> it = dataOriginsList.iterator();
        while (it.hasNext()) {
            String strQ = ((n) it.next()).Q();
            Intrinsics.checkNotNullExpressionValue(strQ, "it.applicationId");
            hashSet.add(new DataOrigin(strQ));
        }
        return new AggregationResult(longValuesMap, doubleValuesMap, hashSet);
    }

    @NotNull
    public static final AggregationResultGroupedByDuration toAggregateDataRowGroupByDuration(@NotNull l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (!lVar.a0()) {
            throw new IllegalArgumentException("start time must be set".toString());
        }
        if (!lVar.Y()) {
            throw new IllegalArgumentException("end time must be set".toString());
        }
        AggregationResult aggregationResultRetrieveAggregateDataRow = retrieveAggregateDataRow(lVar);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(lVar.V());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(startTimeEpochMs)");
        Instant instantOfEpochMilli2 = Instant.ofEpochMilli(lVar.S());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(endTimeEpochMs)");
        ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(lVar.W());
        Intrinsics.checkNotNullExpressionValue(zoneOffsetOfTotalSeconds, "ofTotalSeconds(zoneOffsetSeconds)");
        return new AggregationResultGroupedByDuration(aggregationResultRetrieveAggregateDataRow, instantOfEpochMilli, instantOfEpochMilli2, zoneOffsetOfTotalSeconds);
    }

    @NotNull
    public static final AggregationResultGroupedByPeriod toAggregateDataRowGroupByPeriod(@NotNull l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (!lVar.Z()) {
            throw new IllegalArgumentException("start time must be set".toString());
        }
        if (!lVar.X()) {
            throw new IllegalArgumentException("end time must be set".toString());
        }
        AggregationResult aggregationResultRetrieveAggregateDataRow = retrieveAggregateDataRow(lVar);
        LocalDateTime localDateTime = LocalDateTime.parse(lVar.U());
        Intrinsics.checkNotNullExpressionValue(localDateTime, "parse(startLocalDateTime)");
        LocalDateTime localDateTime2 = LocalDateTime.parse(lVar.R());
        Intrinsics.checkNotNullExpressionValue(localDateTime2, "parse(endLocalDateTime)");
        return new AggregationResultGroupedByPeriod(aggregationResultRetrieveAggregateDataRow, localDateTime, localDateTime2);
    }
}
