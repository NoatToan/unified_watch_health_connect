package androidx.health.connect.client.aggregate;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.android.airsharing.api.PlayInfo;
import com.huawei.hihealth.dictionary.model.HealthDataStatPolicy;
import com.huawei.operation.ble.BleConstants;
import defpackage.enumEntries;
import defpackage.zcm;
import defpackage.zcp;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u0017*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0003\u0015\u0016\u0017B5\b\u0000\u0012\u0010\u0010\u0003\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001e\u0010\u0003\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0018"}, d2 = {"Landroidx/health/connect/client/aggregate/AggregateMetric;", ExifInterface.GPS_DIRECTION_TRUE, "", "converter", "Landroidx/health/connect/client/aggregate/AggregateMetric$Converter;", BleConstants.DATA_TYPE_NAME, "", "aggregationType", "Landroidx/health/connect/client/aggregate/AggregateMetric$AggregationType;", "aggregationField", "<init>", "(Landroidx/health/connect/client/aggregate/AggregateMetric$Converter;Ljava/lang/String;Landroidx/health/connect/client/aggregate/AggregateMetric$AggregationType;Ljava/lang/String;)V", "getConverter$connect_client_release", "()Landroidx/health/connect/client/aggregate/AggregateMetric$Converter;", "getDataTypeName$connect_client_release", "()Ljava/lang/String;", "getAggregationType$connect_client_release", "()Landroidx/health/connect/client/aggregate/AggregateMetric$AggregationType;", "getAggregationField$connect_client_release", "metricKey", "getMetricKey", "Converter", "AggregationType", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AggregateMetric<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String aggregationField;
    private final AggregationType aggregationType;
    private final Converter<?, T> converter;
    private final String dataTypeName;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000*\n\b\u0001\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0002\u0010\u0003 \u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0002\u0005\u0006\u0082\u0001\u0002\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/health/connect/client/aggregate/AggregateMetric$Converter;", ExifInterface.GPS_DIRECTION_TRUE, "", "R", "Lkotlin/Function1;", "FromLong", "FromDouble", "Landroidx/health/connect/client/aggregate/AggregateMetric$Converter$FromDouble;", "Landroidx/health/connect/client/aggregate/AggregateMetric$Converter$FromLong;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Converter<T, R> extends Function1<T, R> {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\bæ\u0080\u0001\u0018\u0000*\n\b\u0003\u0010\u0001 \u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/health/connect/client/aggregate/AggregateMetric$Converter$FromDouble;", "R", "", "Landroidx/health/connect/client/aggregate/AggregateMetric$Converter;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface FromDouble<R> extends Converter<Double, R> {
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\bæ\u0080\u0001\u0018\u0000*\n\b\u0003\u0010\u0001 \u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/health/connect/client/aggregate/AggregateMetric$Converter$FromLong;", "R", "", "Landroidx/health/connect/client/aggregate/AggregateMetric$Converter;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface FromLong<R> extends Converter<Long, R> {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AggregateMetric(Converter<?, ? extends T> converter, String str, AggregationType aggregationType, String str2) {
        zcp.c(converter, "");
        zcp.c(str, "");
        zcp.c(aggregationType, "");
        this.converter = converter;
        this.dataTypeName = str;
        this.aggregationType = aggregationType;
        this.aggregationField = str2;
    }

    public final Converter<?, T> getConverter$connect_client_release() {
        return this.converter;
    }

    /* JADX INFO: renamed from: getDataTypeName$connect_client_release, reason: from getter */
    public final String getDataTypeName() {
        return this.dataTypeName;
    }

    /* JADX INFO: renamed from: getAggregationType$connect_client_release, reason: from getter */
    public final AggregationType getAggregationType() {
        return this.aggregationType;
    }

    /* JADX INFO: renamed from: getAggregationField$connect_client_release, reason: from getter */
    public final String getAggregationField() {
        return this.aggregationField;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Landroidx/health/connect/client/aggregate/AggregateMetric$AggregationType;", "", "aggregationTypeString", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAggregationTypeString", "()Ljava/lang/String;", PlayInfo.KEY_DURATION, "AVERAGE", "MINIMUM", "MAXIMUM", "TOTAL", HealthDataStatPolicy.COUNT, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum AggregationType {
        DURATION("duration"),
        AVERAGE("avg"),
        MINIMUM("min"),
        MAXIMUM("max"),
        TOTAL("total"),
        COUNT("count");

        private static final /* synthetic */ EnumEntries $ENTRIES = enumEntries.c(values());
        private final String aggregationTypeString;

        AggregationType(String str) {
            this.aggregationTypeString = str;
        }

        public final String getAggregationTypeString() {
            return this.aggregationTypeString;
        }

        public static EnumEntries<AggregationType> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000fJI\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0005\"\b\b\u0001\u0010\u0010*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H\u00100\u0012H\u0000¢\u0006\u0002\b\u000fJ+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0015J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Landroidx/health/connect/client/aggregate/AggregateMetric$Companion;", "", "<init>", "()V", "durationMetric", "Landroidx/health/connect/client/aggregate/AggregateMetric;", "Ljava/time/Duration;", BleConstants.DATA_TYPE_NAME, "", "durationMetric$connect_client_release", "aggregationType", "Landroidx/health/connect/client/aggregate/AggregateMetric$AggregationType;", "fieldName", "doubleMetric", "", "doubleMetric$connect_client_release", "R", "mapper", "Lkotlin/Function1;", "longMetric", "", "longMetric$connect_client_release", "countMetric", "countMetric$connect_client_release", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public static final long countMetric$lambda$2(long j) {
            return j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double doubleMetric$lambda$0(double d) {
            return d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long longMetric$lambda$1(long j) {
            return j;
        }

        private Companion() {
        }

        public final AggregateMetric<Duration> durationMetric$connect_client_release(String dataTypeName) {
            zcp.c(dataTypeName, "");
            return new AggregateMetric<>(AggregateMetric$Companion$durationMetric$1.INSTANCE, dataTypeName, AggregationType.DURATION, null);
        }

        public final AggregateMetric<Duration> durationMetric$connect_client_release(String dataTypeName, AggregationType aggregationType, String fieldName) {
            zcp.c(dataTypeName, "");
            zcp.c(aggregationType, "");
            zcp.c(fieldName, "");
            return new AggregateMetric<>(AggregateMetric$Companion$durationMetric$2.INSTANCE, dataTypeName, aggregationType, fieldName);
        }

        public final AggregateMetric<Double> doubleMetric$connect_client_release(String dataTypeName, AggregationType aggregationType, String fieldName) {
            zcp.c(dataTypeName, "");
            zcp.c(aggregationType, "");
            zcp.c(fieldName, "");
            return new AggregateMetric<>(new Converter.FromDouble() { // from class: androidx.health.connect.client.aggregate.AggregateMetric$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Double.valueOf(AggregateMetric.Companion.doubleMetric$lambda$0(((Double) obj).doubleValue()));
                }
            }, dataTypeName, aggregationType, fieldName);
        }

        public final <R> AggregateMetric<R> doubleMetric$connect_client_release(String dataTypeName, AggregationType aggregationType, String fieldName, Function1<? super Double, ? extends R> mapper) {
            zcp.c(dataTypeName, "");
            zcp.c(aggregationType, "");
            zcp.c(fieldName, "");
            zcp.c(mapper, "");
            return new AggregateMetric<>(new AggregateMetric$sam$androidx_health_connect_client_aggregate_AggregateMetric_Converter_FromDouble$0(mapper), dataTypeName, aggregationType, fieldName);
        }

        public final AggregateMetric<Long> longMetric$connect_client_release(String dataTypeName, AggregationType aggregationType, String fieldName) {
            zcp.c(dataTypeName, "");
            zcp.c(aggregationType, "");
            zcp.c(fieldName, "");
            return new AggregateMetric<>(new Converter.FromLong() { // from class: androidx.health.connect.client.aggregate.AggregateMetric$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(AggregateMetric.Companion.longMetric$lambda$1(((Long) obj).longValue()));
                }
            }, dataTypeName, aggregationType, fieldName);
        }

        public final AggregateMetric<Long> countMetric$connect_client_release(String dataTypeName) {
            zcp.c(dataTypeName, "");
            return new AggregateMetric<>(new Converter.FromLong() { // from class: androidx.health.connect.client.aggregate.AggregateMetric$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(AggregateMetric.Companion.countMetric$lambda$2(((Long) obj).longValue()));
                }
            }, dataTypeName, AggregationType.COUNT, null);
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    public final String getMetricKey() {
        String aggregationTypeString = this.aggregationType.getAggregationTypeString();
        if (this.aggregationField == null) {
            return this.dataTypeName + '_' + aggregationTypeString;
        }
        return this.dataTypeName + '_' + this.aggregationField + '_' + aggregationTypeString;
    }
}
