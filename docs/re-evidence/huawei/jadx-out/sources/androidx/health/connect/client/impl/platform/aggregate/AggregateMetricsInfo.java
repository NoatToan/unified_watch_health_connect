package androidx.health.connect.client.impl.platform.aggregate;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.aggregate.AggregateMetric;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J?\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0018"}, d2 = {"Landroidx/health/connect/client/impl/platform/aggregate/AggregateMetricsInfo;", ExifInterface.GPS_DIRECTION_TRUE, "", "averageMetric", "Landroidx/health/connect/client/aggregate/AggregateMetric;", "minMetric", "maxMetric", "<init>", "(Landroidx/health/connect/client/aggregate/AggregateMetric;Landroidx/health/connect/client/aggregate/AggregateMetric;Landroidx/health/connect/client/aggregate/AggregateMetric;)V", "getAverageMetric", "()Landroidx/health/connect/client/aggregate/AggregateMetric;", "getMinMetric", "getMaxMetric", "component1", "component2", "component3", "copy", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AggregateMetricsInfo<T> {
    private final AggregateMetric<T> averageMetric;
    private final AggregateMetric<T> maxMetric;
    private final AggregateMetric<T> minMetric;

    /* JADX WARN: Multi-variable type inference failed */
    public AggregateMetricsInfo(AggregateMetric<? extends T> aggregateMetric, AggregateMetric<? extends T> aggregateMetric2, AggregateMetric<? extends T> aggregateMetric3) {
        zcp.c(aggregateMetric, "");
        zcp.c(aggregateMetric2, "");
        zcp.c(aggregateMetric3, "");
        this.averageMetric = aggregateMetric;
        this.minMetric = aggregateMetric2;
        this.maxMetric = aggregateMetric3;
    }

    public final AggregateMetric<T> getAverageMetric() {
        return this.averageMetric;
    }

    public final AggregateMetric<T> getMinMetric() {
        return this.minMetric;
    }

    public final AggregateMetric<T> getMaxMetric() {
        return this.maxMetric;
    }

    public String toString() {
        return "AggregateMetricsInfo(averageMetric=" + this.averageMetric + ", minMetric=" + this.minMetric + ", maxMetric=" + this.maxMetric + g4.l;
    }

    public int hashCode() {
        return (((this.averageMetric.hashCode() * 31) + this.minMetric.hashCode()) * 31) + this.maxMetric.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AggregateMetricsInfo)) {
            return false;
        }
        AggregateMetricsInfo aggregateMetricsInfo = (AggregateMetricsInfo) other;
        return zcp.b(this.averageMetric, aggregateMetricsInfo.averageMetric) && zcp.b(this.minMetric, aggregateMetricsInfo.minMetric) && zcp.b(this.maxMetric, aggregateMetricsInfo.maxMetric);
    }

    public final AggregateMetricsInfo<T> copy(AggregateMetric<? extends T> averageMetric, AggregateMetric<? extends T> minMetric, AggregateMetric<? extends T> maxMetric) {
        zcp.c(averageMetric, "");
        zcp.c(minMetric, "");
        zcp.c(maxMetric, "");
        return new AggregateMetricsInfo<>(averageMetric, minMetric, maxMetric);
    }

    public final AggregateMetric<T> component3() {
        return this.maxMetric;
    }

    public final AggregateMetric<T> component2() {
        return this.minMetric;
    }

    public final AggregateMetric<T> component1() {
        return this.averageMetric;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AggregateMetricsInfo copy$default(AggregateMetricsInfo aggregateMetricsInfo, AggregateMetric aggregateMetric, AggregateMetric aggregateMetric2, AggregateMetric aggregateMetric3, int i, Object obj) {
        if ((i & 1) != 0) {
            aggregateMetric = aggregateMetricsInfo.averageMetric;
        }
        if ((i & 2) != 0) {
            aggregateMetric2 = aggregateMetricsInfo.minMetric;
        }
        if ((i & 4) != 0) {
            aggregateMetric3 = aggregateMetricsInfo.maxMetric;
        }
        return aggregateMetricsInfo.copy(aggregateMetric, aggregateMetric2, aggregateMetric3);
    }
}
