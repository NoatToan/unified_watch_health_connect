package androidx.health.connect.client.impl.platform.aggregate;

import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.records.NutritionRecord;
import androidx.health.connect.client.records.metadata.DataOrigin;
import androidx.health.connect.client.units.Mass;
import defpackage.yyz;
import defpackage.zae;
import defpackage.zcp;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/health/connect/client/impl/platform/aggregate/TransFatTotalAggregationProcessor;", "Landroidx/health/connect/client/impl/platform/aggregate/AggregationProcessor;", "Landroidx/health/connect/client/records/NutritionRecord;", "timeRange", "Landroidx/health/connect/client/impl/platform/aggregate/TimeRange;", "<init>", "(Landroidx/health/connect/client/impl/platform/aggregate/TimeRange;)V", "total", "", "dataOrigins", "", "Landroidx/health/connect/client/records/metadata/DataOrigin;", "processRecord", "", "record", "getProcessedAggregationResult", "Landroidx/health/connect/client/aggregate/AggregationResult;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransFatTotalAggregationProcessor implements AggregationProcessor<NutritionRecord> {
    private final Set<DataOrigin> dataOrigins;
    private final TimeRange<?> timeRange;
    private double total;

    public TransFatTotalAggregationProcessor(TimeRange<?> timeRange) {
        zcp.c(timeRange, "");
        this.timeRange = timeRange;
        this.dataOrigins = new LinkedHashSet();
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.AggregationProcessor
    public void processRecord(NutritionRecord record) {
        zcp.c(record, "");
        double d = this.total;
        Mass transFat = record.getTransFat();
        zcp.e(transFat);
        this.total = d + (transFat.getGrams() * AggregatorUtils.INSTANCE.sliceFactor$connect_client_release(record, this.timeRange));
        this.dataOrigins.add(record.getMetadata().getDataOrigin());
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.AggregationProcessor
    public AggregationResult getProcessedAggregationResult() {
        return new AggregationResult(zae.e(), this.dataOrigins.isEmpty() ? zae.e() : zae.a(yyz.c(NutritionRecord.TRANS_FAT_TOTAL.getMetricKey(), Double.valueOf(this.total))), this.dataOrigins);
    }
}
