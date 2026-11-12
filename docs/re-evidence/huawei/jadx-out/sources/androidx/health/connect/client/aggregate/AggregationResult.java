package androidx.health.connect.client.aggregate;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.records.metadata.DataOrigin;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yyv;
import defpackage.zae;
import defpackage.zaj;
import defpackage.zcp;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0086\u0002J(\u0010\u0016\u001a\u0004\u0018\u0001H\u0017\"\b\b\u0000\u0010\u0017*\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0015H\u0086\u0002¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0080\u0002¢\u0006\u0002\b\u001bJ\u0013\u0010\u001c\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016R\u001f\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Landroidx/health/connect/client/aggregate/AggregationResult;", "", "longValues", "", "", "", "doubleValues", "", "dataOrigins", "", "Landroidx/health/connect/client/records/metadata/DataOrigin;", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)V", "getLongValues", "()Ljava/util/Map;", "getDoubleValues", "getDataOrigins", "()Ljava/util/Set;", "contains", "", "metric", "Landroidx/health/connect/client/aggregate/AggregateMetric;", "get", ExifInterface.GPS_DIRECTION_TRUE, "(Landroidx/health/connect/client/aggregate/AggregateMetric;)Ljava/lang/Object;", "plus", "other", "plus$connect_client_release", "equals", WatchFaceConstant.HASHCODE, "", "toString", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AggregationResult {
    private final Set<DataOrigin> dataOrigins;
    private final Map<String, Double> doubleValues;
    private final Map<String, Long> longValues;

    public AggregationResult(Map<String, Long> map, Map<String, Double> map2, Set<DataOrigin> set) {
        zcp.c(map, "");
        zcp.c(map2, "");
        zcp.c(set, "");
        this.longValues = map;
        this.doubleValues = map2;
        this.dataOrigins = set;
    }

    public final Map<String, Long> getLongValues() {
        return this.longValues;
    }

    public final Map<String, Double> getDoubleValues() {
        return this.doubleValues;
    }

    public final Set<DataOrigin> getDataOrigins() {
        return this.dataOrigins;
    }

    public final boolean contains(AggregateMetric<?> metric) {
        zcp.c(metric, "");
        AggregateMetric.Converter<?, ?> converter$connect_client_release = metric.getConverter$connect_client_release();
        if (converter$connect_client_release instanceof AggregateMetric.Converter.FromLong) {
            return this.longValues.containsKey(metric.getMetricKey());
        }
        if (converter$connect_client_release instanceof AggregateMetric.Converter.FromDouble) {
            return this.doubleValues.containsKey(metric.getMetricKey());
        }
        throw new yyv();
    }

    public final <T> T get(AggregateMetric<? extends T> metric) {
        zcp.c(metric, "");
        AggregateMetric.Converter<?, ? extends T> converter$connect_client_release = metric.getConverter$connect_client_release();
        if (converter$connect_client_release instanceof AggregateMetric.Converter.FromLong) {
            Long l = this.longValues.get(metric.getMetricKey());
            if (l != null) {
                return metric.getConverter$connect_client_release().invoke(l);
            }
            return null;
        }
        if (!(converter$connect_client_release instanceof AggregateMetric.Converter.FromDouble)) {
            throw new yyv();
        }
        Double d = this.doubleValues.get(metric.getMetricKey());
        if (d != null) {
            return metric.getConverter$connect_client_release().invoke(d);
        }
        return null;
    }

    public final AggregationResult plus$connect_client_release(AggregationResult other) {
        zcp.c(other, "");
        return new AggregationResult(zae.a(this.longValues, other.longValues), zae.a(this.doubleValues, other.doubleValues), zaj.e(this.dataOrigins, other.dataOrigins));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!zcp.b(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        zcp.e(other, "");
        AggregationResult aggregationResult = (AggregationResult) other;
        return zcp.b(this.longValues, aggregationResult.longValues) && zcp.b(this.doubleValues, aggregationResult.doubleValues) && zcp.b(this.dataOrigins, aggregationResult.dataOrigins);
    }

    public int hashCode() {
        return (((this.longValues.hashCode() * 31) + this.doubleValues.hashCode()) * 31) + this.dataOrigins.hashCode();
    }

    public String toString() {
        return "AggregationResult(longValues=" + this.longValues + ", doubleValues=" + this.doubleValues + ", dataOrigins=" + this.dataOrigins + g4.l;
    }
}
