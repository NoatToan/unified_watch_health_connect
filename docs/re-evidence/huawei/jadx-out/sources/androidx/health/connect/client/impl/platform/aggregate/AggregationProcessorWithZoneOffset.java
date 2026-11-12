package androidx.health.connect.client.impl.platform.aggregate;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.records.InstantaneousRecord;
import androidx.health.connect.client.records.IntervalRecord;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.SeriesRecord;
import defpackage.zcp;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\u001aH\u0096\u0001R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Landroidx/health/connect/client/impl/platform/aggregate/AggregationProcessorWithZoneOffset;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/health/connect/client/records/Record;", "Landroidx/health/connect/client/impl/platform/aggregate/AggregationProcessor;", "delegate", "bucketStartTime", "Ljava/time/Instant;", "<init>", "(Landroidx/health/connect/client/impl/platform/aggregate/AggregationProcessor;Ljava/time/Instant;)V", "getBucketStartTime", "()Ljava/time/Instant;", "zoneOffset", "Ljava/time/ZoneOffset;", "getZoneOffset", "()Ljava/time/ZoneOffset;", "setZoneOffset", "(Ljava/time/ZoneOffset;)V", "minTime", "getMinTime", "setMinTime", "(Ljava/time/Instant;)V", "processRecord", "", "record", "(Landroidx/health/connect/client/records/Record;)V", "getProcessedAggregationResult", "Landroidx/health/connect/client/aggregate/AggregationResult;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AggregationProcessorWithZoneOffset<T extends Record> implements AggregationProcessor<T> {
    private final Instant bucketStartTime;
    private final AggregationProcessor<T> delegate;
    private Instant minTime;
    private ZoneOffset zoneOffset;

    public AggregationProcessorWithZoneOffset(AggregationProcessor<T> aggregationProcessor, Instant instant) {
        zcp.c(aggregationProcessor, "");
        zcp.c(instant, "");
        this.delegate = aggregationProcessor;
        this.bucketStartTime = instant;
    }

    public final Instant getBucketStartTime() {
        return this.bucketStartTime;
    }

    public final ZoneOffset getZoneOffset() {
        return this.zoneOffset;
    }

    public final void setZoneOffset(ZoneOffset zoneOffset) {
        this.zoneOffset = zoneOffset;
    }

    public final Instant getMinTime() {
        return this.minTime;
    }

    public final void setMinTime(Instant instant) {
        this.minTime = instant;
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.AggregationProcessor
    public void processRecord(T record) {
        Instant startTime;
        ZoneOffset startZoneOffset;
        zcp.c(record, "");
        boolean z = record instanceof InstantaneousRecord;
        if (z) {
            startTime = ((InstantaneousRecord) record).getTime();
        } else if (record instanceof SeriesRecord) {
            List samples = ((SeriesRecord) record).getSamples();
            ArrayList arrayList = new ArrayList();
            for (Object obj : samples) {
                if (AggregatorUtils.INSTANCE.getTime$connect_client_release(obj).compareTo(this.bucketStartTime) >= 0) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Instant time$connect_client_release = AggregatorUtils.INSTANCE.getTime$connect_client_release(it.next());
            while (it.hasNext()) {
                Instant time$connect_client_release2 = AggregatorUtils.INSTANCE.getTime$connect_client_release(it.next());
                if (time$connect_client_release.compareTo(time$connect_client_release2) > 0) {
                    time$connect_client_release = time$connect_client_release2;
                }
            }
            startTime = time$connect_client_release;
        } else {
            if (!(record instanceof IntervalRecord)) {
                throw new IllegalStateException(("Unsupported record " + record).toString());
            }
            startTime = ((IntervalRecord) record).getStartTime();
        }
        if (z) {
            startZoneOffset = ((InstantaneousRecord) record).getZoneOffset();
        } else {
            if (!(record instanceof IntervalRecord)) {
                throw new IllegalStateException(("Unsupported record " + record).toString());
            }
            startZoneOffset = ((IntervalRecord) record).getStartZoneOffset();
        }
        Instant instant = this.minTime;
        if (instant == null || startTime.compareTo(instant) < 0) {
            this.minTime = startTime;
            this.zoneOffset = startZoneOffset;
        }
        this.delegate.processRecord(record);
    }

    @Override // androidx.health.connect.client.impl.platform.aggregate.AggregationProcessor
    public AggregationResult getProcessedAggregationResult() {
        return this.delegate.getProcessedAggregationResult();
    }
}
