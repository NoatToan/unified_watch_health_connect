package androidx.health.connect.client.impl.platform.aggregate;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.impl.platform.TimeExtensionsKt;
import androidx.health.connect.client.records.SeriesRecord;
import androidx.health.connect.client.records.metadata.DataOrigin;
import defpackage.yzp;
import defpackage.zae;
import defpackage.zaj;
import defpackage.zcp;
import defpackage.zdm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020*H\u0016R\u001b\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030$0#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/health/connect/client/impl/platform/aggregate/SeriesAggregationProcessor;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/health/connect/client/records/SeriesRecord;", "Landroidx/health/connect/client/impl/platform/aggregate/AggregationProcessor;", "recordType", "Lkotlin/reflect/KClass;", "metrics", "", "Landroidx/health/connect/client/aggregate/AggregateMetric;", "timeRange", "Landroidx/health/connect/client/impl/platform/aggregate/TimeRange;", "<init>", "(Lkotlin/reflect/KClass;Ljava/util/Set;Landroidx/health/connect/client/impl/platform/aggregate/TimeRange;)V", "getMetrics", "()Ljava/util/Set;", "getTimeRange", "()Landroidx/health/connect/client/impl/platform/aggregate/TimeRange;", "avgData", "Landroidx/health/connect/client/impl/platform/aggregate/AvgData;", "getAvgData", "()Landroidx/health/connect/client/impl/platform/aggregate/AvgData;", "min", "", "getMin", "()Ljava/lang/Double;", "setMin", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "max", "getMax", "setMax", "dataOrigins", "", "Landroidx/health/connect/client/records/metadata/DataOrigin;", "aggregateInfo", "Landroidx/health/connect/client/impl/platform/aggregate/AggregateMetricsInfo;", "", "processRecord", "", "record", "(Landroidx/health/connect/client/records/SeriesRecord;)V", "getProcessedAggregationResult", "Landroidx/health/connect/client/aggregate/AggregationResult;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SeriesAggregationProcessor<T extends SeriesRecord<?>> implements AggregationProcessor<T> {
    private final AggregateMetricsInfo<? extends Comparable<?>> aggregateInfo;
    private final AvgData avgData;
    private final Set<DataOrigin> dataOrigins;
    private Double max;
    private final Set<AggregateMetric<?>> metrics;
    private Double min;
    private final TimeRange<?> timeRange;

    /* JADX WARN: Multi-variable type inference failed */
    public SeriesAggregationProcessor(KClass<T> kClass, Set<? extends AggregateMetric<?>> set, TimeRange<?> timeRange) {
        zcp.c(kClass, "");
        zcp.c(set, "");
        zcp.c(timeRange, "");
        this.metrics = set;
        this.timeRange = timeRange;
        this.avgData = new AvgData(0, 0.0d, 3, null);
        this.dataOrigins = new LinkedHashSet();
        AggregateMetricsInfo<? extends Comparable<?>> aggregateMetricsInfo = (AggregateMetricsInfo) SeriesRecordAggregationExtensionsKt.RECORDS_TO_AGGREGATE_METRICS_INFO_MAP.get(kClass);
        if (aggregateMetricsInfo == null) {
            throw new IllegalArgumentException("Non supported fallback series record " + kClass);
        }
        this.aggregateInfo = aggregateMetricsInfo;
        if (zaj.e((Object[]) new AggregateMetric[]{aggregateMetricsInfo.getAverageMetric(), aggregateMetricsInfo.getMinMetric(), aggregateMetricsInfo.getMaxMetric()}).containsAll(set)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid set of metrics ");
        Set<? extends AggregateMetric<?>> set2 = set;
        ArrayList arrayList = new ArrayList(yzp.e(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AggregateMetric) it.next()).getMetricKey());
        }
        sb.append(arrayList);
        throw new IllegalStateException(sb.toString().toString());
    }

    public final Set<AggregateMetric<?>> getMetrics() {
        return this.metrics;
    }

    public final TimeRange<?> getTimeRange() {
        return this.timeRange;
    }

    public final AvgData getAvgData() {
        return this.avgData;
    }

    public final Double getMin() {
        return this.min;
    }

    public final void setMin(Double d) {
        this.min = d;
    }

    public final Double getMax() {
        return this.max;
    }

    public final void setMax(Double d) {
        this.max = d;
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.AggregationProcessor
    public void processRecord(T record) {
        zcp.c(record, "");
        List samples = record.getSamples();
        ArrayList arrayList = new ArrayList();
        for (Object obj : samples) {
            if (TimeExtensionsKt.isWithin(AggregatorUtils.INSTANCE.getTime$connect_client_release(obj), this.timeRange, record.getStartZoneOffset())) {
                arrayList.add(obj);
            }
        }
        for (Object obj2 : arrayList) {
            this.avgData.plusAssign(AggregatorUtils.INSTANCE.getValue$connect_client_release(obj2));
            Double d = this.min;
            this.min = Double.valueOf(Math.min(d != null ? d.doubleValue() : AggregatorUtils.INSTANCE.getValue$connect_client_release(obj2), AggregatorUtils.INSTANCE.getValue$connect_client_release(obj2)));
            Double d2 = this.max;
            this.max = Double.valueOf(Math.max(d2 != null ? d2.doubleValue() : AggregatorUtils.INSTANCE.getValue$connect_client_release(obj2), AggregatorUtils.INSTANCE.getValue$connect_client_release(obj2)));
        }
        this.dataOrigins.add(record.getMetadata().getDataOrigin());
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.AggregationProcessor
    public AggregationResult getProcessedAggregationResult() {
        Map mapE;
        double dDoubleValue;
        if (this.dataOrigins.isEmpty()) {
            mapE = zae.e();
        } else {
            Set<AggregateMetric<?>> set = this.metrics;
            LinkedHashMap linkedHashMap = new LinkedHashMap(zdm.c(zae.e(yzp.e(set, 10)), 16));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                AggregateMetric aggregateMetric = (AggregateMetric) it.next();
                String metricKey = aggregateMetric.getMetricKey();
                if (zcp.b(aggregateMetric, this.aggregateInfo.getAverageMetric())) {
                    dDoubleValue = this.avgData.average();
                } else if (zcp.b(aggregateMetric, this.aggregateInfo.getMaxMetric())) {
                    Double d = this.max;
                    zcp.e(d);
                    dDoubleValue = d.doubleValue();
                } else {
                    if (!zcp.b(aggregateMetric, this.aggregateInfo.getMinMetric())) {
                        throw new IllegalStateException(("Invalid fallback aggregation metric " + aggregateMetric.getMetricKey()).toString());
                    }
                    Double d2 = this.min;
                    zcp.e(d2);
                    dDoubleValue = d2.doubleValue();
                }
                linkedHashMap.put(metricKey, Double.valueOf(dDoubleValue));
            }
            mapE = linkedHashMap;
        }
        return new AggregationResult(zae.e(), mapE, this.dataOrigins);
    }
}
