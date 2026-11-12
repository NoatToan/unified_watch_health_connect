package androidx.health.connect.client.impl.platform.aggregate;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.records.Record;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import defpackage.zcp;
import java.time.temporal.Temporal;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00060\u0005B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/health/connect/client/impl/platform/aggregate/ResultAggregator;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/health/connect/client/records/Record;", WatchFaceProvider.POSITION_LABEL_U, "Ljava/time/temporal/Temporal;", "Landroidx/health/connect/client/impl/platform/aggregate/Aggregator;", "Landroidx/health/connect/client/aggregate/AggregationResult;", "timeRange", "Landroidx/health/connect/client/impl/platform/aggregate/TimeRange;", "processor", "Landroidx/health/connect/client/impl/platform/aggregate/AggregationProcessor;", "<init>", "(Landroidx/health/connect/client/impl/platform/aggregate/TimeRange;Landroidx/health/connect/client/impl/platform/aggregate/AggregationProcessor;)V", "filterAndAggregate", "", "record", "(Landroidx/health/connect/client/records/Record;)V", "getResult", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResultAggregator<T extends Record, U extends Temporal> implements Aggregator<T, AggregationResult> {
    private final AggregationProcessor<T> processor;
    private final TimeRange<U> timeRange;

    public ResultAggregator(TimeRange<U> timeRange, AggregationProcessor<T> aggregationProcessor) {
        zcp.c(timeRange, "");
        zcp.c(aggregationProcessor, "");
        this.timeRange = timeRange;
        this.processor = aggregationProcessor;
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.Aggregator
    public void filterAndAggregate(T record) {
        zcp.c(record, "");
        if (AggregatorUtils.INSTANCE.contributesToAggregation$connect_client_release(record, this.timeRange)) {
            this.processor.processRecord(record);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.health.connect.client.impl.platform.aggregate.Aggregator
    public AggregationResult getResult() {
        return this.processor.getProcessedAggregationResult();
    }
}
