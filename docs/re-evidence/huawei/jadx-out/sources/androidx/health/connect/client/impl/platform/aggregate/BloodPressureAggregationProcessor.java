package androidx.health.connect.client.impl.platform.aggregate;

import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.records.BloodPressureRecord;
import androidx.health.connect.client.records.metadata.DataOrigin;
import androidx.health.connect.client.units.Pressure;
import defpackage.yzp;
import defpackage.zae;
import defpackage.zcp;
import defpackage.zdm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u001b\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/health/connect/client/impl/platform/aggregate/BloodPressureAggregationProcessor;", "Landroidx/health/connect/client/impl/platform/aggregate/AggregationProcessor;", "Landroidx/health/connect/client/records/BloodPressureRecord;", "metrics", "", "Landroidx/health/connect/client/aggregate/AggregateMetric;", "<init>", "(Ljava/util/Set;)V", "getMetrics", "()Ljava/util/Set;", "avgDataMap", "", "Landroidx/health/connect/client/units/Pressure;", "Landroidx/health/connect/client/impl/platform/aggregate/AvgData;", "minMaxMap", "", "dataOrigins", "", "Landroidx/health/connect/client/records/metadata/DataOrigin;", "processRecord", "", "record", "getProcessedAggregationResult", "Landroidx/health/connect/client/aggregate/AggregationResult;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodPressureAggregationProcessor implements AggregationProcessor<BloodPressureRecord> {
    private final Map<AggregateMetric<Pressure>, AvgData> avgDataMap;
    private final Set<DataOrigin> dataOrigins;
    private final Set<AggregateMetric<?>> metrics;
    private final Map<AggregateMetric<Pressure>, Double> minMaxMap;

    /* JADX WARN: Multi-variable type inference failed */
    public BloodPressureAggregationProcessor(Set<? extends AggregateMetric<?>> set) {
        zcp.c(set, "");
        this.metrics = set;
        this.avgDataMap = new LinkedHashMap();
        this.minMaxMap = new LinkedHashMap();
        this.dataOrigins = new LinkedHashSet();
        if (!BloodPressureAggregationExtensionsKt.BLOOD_PRESSURE_METRICS.containsAll(set)) {
            StringBuilder sb = new StringBuilder("Invalid set of blood pressure fallback aggregation metrics ");
            Set<? extends AggregateMetric<?>> set2 = set;
            ArrayList arrayList = new ArrayList(yzp.e(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AggregateMetric) it.next()).getMetricKey());
            }
            sb.append(arrayList);
            throw new IllegalStateException(sb.toString().toString());
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            AggregateMetric<Pressure> aggregateMetric = (AggregateMetric) it2.next();
            if (zcp.b(aggregateMetric, BloodPressureRecord.DIASTOLIC_AVG) || zcp.b(aggregateMetric, BloodPressureRecord.SYSTOLIC_AVG)) {
                this.avgDataMap.put(aggregateMetric, new AvgData(0, 0.0d, 3, null));
            } else if (zcp.b(aggregateMetric, BloodPressureRecord.DIASTOLIC_MAX) || zcp.b(aggregateMetric, BloodPressureRecord.DIASTOLIC_MIN) || zcp.b(aggregateMetric, BloodPressureRecord.SYSTOLIC_MAX) || zcp.b(aggregateMetric, BloodPressureRecord.SYSTOLIC_MIN)) {
                this.minMaxMap.put(aggregateMetric, null);
            } else {
                throw new IllegalStateException(("Invalid blood pressure fallback aggregation metric " + aggregateMetric.getMetricKey()).toString());
            }
        }
    }

    public final Set<AggregateMetric<?>> getMetrics() {
        return this.metrics;
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.AggregationProcessor
    public void processRecord(BloodPressureRecord record) {
        zcp.c(record, "");
        double value = record.getDiastolic().getValue();
        double value2 = record.getSystolic().getValue();
        for (AggregateMetric<?> aggregateMetric : this.metrics) {
            if (zcp.b(aggregateMetric, BloodPressureRecord.DIASTOLIC_AVG)) {
                AvgData avgData = this.avgDataMap.get(aggregateMetric);
                zcp.e(avgData);
                avgData.plusAssign(value);
            } else if (zcp.b(aggregateMetric, BloodPressureRecord.DIASTOLIC_MAX)) {
                Map<AggregateMetric<Pressure>, Double> map = this.minMaxMap;
                Double d = map.get(aggregateMetric);
                map.put((AggregateMetric<Pressure>) aggregateMetric, Double.valueOf(Math.max(d != null ? d.doubleValue() : value, value)));
            } else if (zcp.b(aggregateMetric, BloodPressureRecord.DIASTOLIC_MIN)) {
                Map<AggregateMetric<Pressure>, Double> map2 = this.minMaxMap;
                Double d2 = map2.get(aggregateMetric);
                map2.put((AggregateMetric<Pressure>) aggregateMetric, Double.valueOf(Math.min(d2 != null ? d2.doubleValue() : value, value)));
            } else if (zcp.b(aggregateMetric, BloodPressureRecord.SYSTOLIC_AVG)) {
                AvgData avgData2 = this.avgDataMap.get(aggregateMetric);
                zcp.e(avgData2);
                avgData2.plusAssign(value2);
            } else if (zcp.b(aggregateMetric, BloodPressureRecord.SYSTOLIC_MAX)) {
                Map<AggregateMetric<Pressure>, Double> map3 = this.minMaxMap;
                Double d3 = map3.get(aggregateMetric);
                map3.put((AggregateMetric<Pressure>) aggregateMetric, Double.valueOf(Math.max(d3 != null ? d3.doubleValue() : value2, value2)));
            } else if (zcp.b(aggregateMetric, BloodPressureRecord.SYSTOLIC_MIN)) {
                Map<AggregateMetric<Pressure>, Double> map4 = this.minMaxMap;
                Double d4 = map4.get(aggregateMetric);
                map4.put((AggregateMetric<Pressure>) aggregateMetric, Double.valueOf(Math.min(d4 != null ? d4.doubleValue() : value2, value2)));
            }
            this.dataOrigins.add(record.getMetadata().getDataOrigin());
        }
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.AggregationProcessor
    public AggregationResult getProcessedAggregationResult() {
        Map mapE;
        double dAverage;
        if (this.dataOrigins.isEmpty()) {
            mapE = zae.e();
        } else {
            Set<AggregateMetric<?>> set = this.metrics;
            LinkedHashMap linkedHashMap = new LinkedHashMap(zdm.c(zae.e(yzp.e(set, 10)), 16));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                AggregateMetric aggregateMetric = (AggregateMetric) it.next();
                String metricKey = aggregateMetric.getMetricKey();
                if (zcp.b(aggregateMetric, BloodPressureRecord.DIASTOLIC_AVG) || zcp.b(aggregateMetric, BloodPressureRecord.SYSTOLIC_AVG)) {
                    AvgData avgData = this.avgDataMap.get(aggregateMetric);
                    zcp.e(avgData);
                    dAverage = avgData.average();
                } else if (zcp.b(aggregateMetric, BloodPressureRecord.DIASTOLIC_MAX) || zcp.b(aggregateMetric, BloodPressureRecord.DIASTOLIC_MIN) || zcp.b(aggregateMetric, BloodPressureRecord.SYSTOLIC_MAX) || zcp.b(aggregateMetric, BloodPressureRecord.SYSTOLIC_MIN)) {
                    Double d = this.minMaxMap.get(aggregateMetric);
                    zcp.e(d);
                    dAverage = d.doubleValue();
                } else {
                    throw new IllegalStateException(("Invalid blood pressure fallback aggregation type " + aggregateMetric.getMetricKey()).toString());
                }
                linkedHashMap.put(metricKey, Double.valueOf(dAverage));
            }
            mapE = linkedHashMap;
        }
        return new AggregationResult(zae.e(), mapE, this.dataOrigins);
    }
}
