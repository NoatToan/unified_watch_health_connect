package androidx.health.connect.client.impl.converters.aggregate;

import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByDuration;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod;
import androidx.health.connect.client.records.metadata.DataOrigin;
import androidx.health.platform.client.proto.DataProto;
import defpackage.zcp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002¨\u0006\u0007"}, d2 = {"toAggregateDataRowGroupByDuration", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "Landroidx/health/platform/client/proto/DataProto$AggregateDataRow;", "toAggregateDataRowGroupByPeriod", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "retrieveAggregateDataRow", "Landroidx/health/connect/client/aggregate/AggregationResult;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProtoToAggregateDataRowKt {
    public static final AggregationResultGroupedByDuration toAggregateDataRowGroupByDuration(DataProto.AggregateDataRow aggregateDataRow) {
        zcp.c(aggregateDataRow, "");
        if (!aggregateDataRow.hasStartTimeEpochMs()) {
            throw new IllegalArgumentException("start time must be set".toString());
        }
        if (!aggregateDataRow.hasEndTimeEpochMs()) {
            throw new IllegalArgumentException("end time must be set".toString());
        }
        AggregationResult aggregationResultRetrieveAggregateDataRow = retrieveAggregateDataRow(aggregateDataRow);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(aggregateDataRow.getStartTimeEpochMs());
        zcp.b((Object) instantOfEpochMilli, "");
        Instant instantOfEpochMilli2 = Instant.ofEpochMilli(aggregateDataRow.getEndTimeEpochMs());
        zcp.b((Object) instantOfEpochMilli2, "");
        ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(aggregateDataRow.getZoneOffsetSeconds());
        zcp.b((Object) zoneOffsetOfTotalSeconds, "");
        return new AggregationResultGroupedByDuration(aggregationResultRetrieveAggregateDataRow, instantOfEpochMilli, instantOfEpochMilli2, zoneOffsetOfTotalSeconds, false, 16, null);
    }

    public static final AggregationResultGroupedByPeriod toAggregateDataRowGroupByPeriod(DataProto.AggregateDataRow aggregateDataRow) {
        zcp.c(aggregateDataRow, "");
        if (!aggregateDataRow.hasStartLocalDateTime()) {
            throw new IllegalArgumentException("start time must be set".toString());
        }
        if (!aggregateDataRow.hasEndLocalDateTime()) {
            throw new IllegalArgumentException("end time must be set".toString());
        }
        AggregationResult aggregationResultRetrieveAggregateDataRow = retrieveAggregateDataRow(aggregateDataRow);
        LocalDateTime localDateTime = LocalDateTime.parse(aggregateDataRow.getStartLocalDateTime());
        zcp.b((Object) localDateTime, "");
        LocalDateTime localDateTime2 = LocalDateTime.parse(aggregateDataRow.getEndLocalDateTime());
        zcp.b((Object) localDateTime2, "");
        return new AggregationResultGroupedByPeriod(aggregationResultRetrieveAggregateDataRow, localDateTime, localDateTime2, false, 8, null);
    }

    public static final AggregationResult retrieveAggregateDataRow(DataProto.AggregateDataRow aggregateDataRow) {
        zcp.c(aggregateDataRow, "");
        Map<String, Long> longValuesMap = aggregateDataRow.getLongValuesMap();
        zcp.b((Object) longValuesMap, "");
        Map<String, Double> doubleValuesMap = aggregateDataRow.getDoubleValuesMap();
        zcp.b((Object) doubleValuesMap, "");
        List<DataProto.DataOrigin> dataOriginsList = aggregateDataRow.getDataOriginsList();
        zcp.b((Object) dataOriginsList, "");
        HashSet hashSet = new HashSet();
        Iterator<T> it = dataOriginsList.iterator();
        while (it.hasNext()) {
            String applicationId = ((DataProto.DataOrigin) it.next()).getApplicationId();
            zcp.b((Object) applicationId, "");
            hashSet.add(new DataOrigin(applicationId));
        }
        return new AggregationResult(longValuesMap, doubleValuesMap, hashSet);
    }
}
