package androidx.health.connect.client.aggregate;

import androidx.health.connect.client.aggregate.AggregateMetric;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.sync.model.ICalendar;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u0018*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0003\u0019\u0018\u001aB5\b\u0000\u0012\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\fR\u0014\u0010\u0015\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\f¨\u0006\u001b"}, d2 = {"Landroidx/health/connect/client/aggregate/AggregateMetric;", "", "T", "Landroidx/health/connect/client/aggregate/AggregateMetric$a;", "converter", "Landroidx/health/connect/client/aggregate/AggregateMetric$a;", "getConverter$connect_client_release", "()Landroidx/health/connect/client/aggregate/AggregateMetric$a;", "", "dataTypeName", "Ljava/lang/String;", "getDataTypeName$connect_client_release", "()Ljava/lang/String;", "Landroidx/health/connect/client/aggregate/AggregateMetric$AggregationType;", "aggregationType", "Landroidx/health/connect/client/aggregate/AggregateMetric$AggregationType;", "getAggregationType$connect_client_release", "()Landroidx/health/connect/client/aggregate/AggregateMetric$AggregationType;", "aggregationField", "getAggregationField$connect_client_release", "getMetricKey$connect_client_release", "metricKey", "<init>", "(Landroidx/health/connect/client/aggregate/AggregateMetric$a;Ljava/lang/String;Landroidx/health/connect/client/aggregate/AggregateMetric$AggregationType;Ljava/lang/String;)V", "Companion", "AggregationType", PluginDeviceInfo.FMODEL, "connect-client_release"}, k = 1, mv = {1, 8, 0})
public final class AggregateMetric<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String aggregationField;

    @NotNull
    private final AggregationType aggregationType;

    @NotNull
    private final a<?, T> converter;

    @NotNull
    private final String dataTypeName;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/health/connect/client/aggregate/AggregateMetric$AggregationType;", "", "aggregationTypeString", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAggregationTypeString", "()Ljava/lang/String;", ICalendar.Property.DURATION, "AVERAGE", "MINIMUM", "MAXIMUM", "TOTAL", "COUNT", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum AggregationType {
        DURATION("duration"),
        AVERAGE("avg"),
        MINIMUM("min"),
        MAXIMUM(VibrateModeSetFragment.MAX),
        TOTAL(SportDataTypeKt.DIMEN_TOTAL),
        COUNT("count");


        @NotNull
        private final String aggregationTypeString;

        AggregationType(String str) {
            this.aggregationTypeString = str;
        }

        @NotNull
        public final String getAggregationTypeString() {
            return this.aggregationTypeString;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000eJI\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0004\"\b\b\u0001\u0010\u000f*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u000f0\u0011H\u0000¢\u0006\u0002\b\u000eJ\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0014J+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0014J+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0016JI\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0004\"\b\b\u0001\u0010\u000f*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000f0\u0011H\u0000¢\u0006\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Landroidx/health/connect/client/aggregate/AggregateMetric$Companion;", "", "()V", "countMetric", "Landroidx/health/connect/client/aggregate/AggregateMetric;", "", "dataTypeName", "", "countMetric$connect_client_release", "doubleMetric", "", "aggregationType", "Landroidx/health/connect/client/aggregate/AggregateMetric$AggregationType;", "fieldName", "doubleMetric$connect_client_release", "R", "mapper", "Lkotlin/Function1;", "durationMetric", "Ljava/time/Duration;", "durationMetric$connect_client_release", "longMetric", "longMetric$connect_client_release", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

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

        @NotNull
        public final AggregateMetric<Long> countMetric$connect_client_release(@NotNull String dataTypeName) {
            Intrinsics.checkNotNullParameter(dataTypeName, "dataTypeName");
            return new AggregateMetric<>(new a.b() { // from class: nw0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(AggregateMetric.Companion.countMetric$lambda$2(((Long) obj).longValue()));
                }
            }, dataTypeName, AggregationType.COUNT, null);
        }

        @NotNull
        public final AggregateMetric<Double> doubleMetric$connect_client_release(@NotNull String dataTypeName, @NotNull AggregationType aggregationType, @NotNull String fieldName) {
            Intrinsics.checkNotNullParameter(dataTypeName, "dataTypeName");
            Intrinsics.checkNotNullParameter(aggregationType, "aggregationType");
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            return new AggregateMetric<>(new a.InterfaceC0035a() { // from class: pw0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Double.valueOf(AggregateMetric.Companion.doubleMetric$lambda$0(((Double) obj).doubleValue()));
                }
            }, dataTypeName, aggregationType, fieldName);
        }

        @NotNull
        public final AggregateMetric<Duration> durationMetric$connect_client_release(@NotNull String dataTypeName) {
            Intrinsics.checkNotNullParameter(dataTypeName, "dataTypeName");
            return new AggregateMetric<>(AggregateMetric$Companion$durationMetric$1.INSTANCE, dataTypeName, AggregationType.DURATION, null);
        }

        @NotNull
        public final AggregateMetric<Long> longMetric$connect_client_release(@NotNull String dataTypeName, @NotNull AggregationType aggregationType, @NotNull String fieldName) {
            Intrinsics.checkNotNullParameter(dataTypeName, "dataTypeName");
            Intrinsics.checkNotNullParameter(aggregationType, "aggregationType");
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            return new AggregateMetric<>(new a.b() { // from class: ow0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(AggregateMetric.Companion.longMetric$lambda$1(((Long) obj).longValue()));
                }
            }, dataTypeName, aggregationType, fieldName);
        }

        @NotNull
        public final <R> AggregateMetric<R> doubleMetric$connect_client_release(@NotNull String dataTypeName, @NotNull AggregationType aggregationType, @NotNull String fieldName, @NotNull Function1<? super Double, ? extends R> mapper) {
            Intrinsics.checkNotNullParameter(dataTypeName, "dataTypeName");
            Intrinsics.checkNotNullParameter(aggregationType, "aggregationType");
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            return new AggregateMetric<>(new AggregateMetric$sam$androidx_health_connect_client_aggregate_AggregateMetric_Converter_FromDouble$0(mapper), dataTypeName, aggregationType, fieldName);
        }

        @NotNull
        public final <R> AggregateMetric<R> longMetric$connect_client_release(@NotNull String dataTypeName, @NotNull AggregationType aggregationType, @NotNull String fieldName, @NotNull Function1<? super Long, ? extends R> mapper) {
            Intrinsics.checkNotNullParameter(dataTypeName, "dataTypeName");
            Intrinsics.checkNotNullParameter(aggregationType, "aggregationType");
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            return new AggregateMetric<>(new AggregateMetric$sam$androidx_health_connect_client_aggregate_AggregateMetric_Converter_FromLong$0(mapper), dataTypeName, aggregationType, fieldName);
        }

        @NotNull
        public final AggregateMetric<Duration> durationMetric$connect_client_release(@NotNull String dataTypeName, @NotNull AggregationType aggregationType, @NotNull String fieldName) {
            Intrinsics.checkNotNullParameter(dataTypeName, "dataTypeName");
            Intrinsics.checkNotNullParameter(aggregationType, "aggregationType");
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            return new AggregateMetric<>(AggregateMetric$Companion$durationMetric$2.INSTANCE, dataTypeName, aggregationType, fieldName);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000*\n\b\u0001\u0010\u0002 \u0000*\u00020\u0001*\n\b\u0002\u0010\u0003 \u0001*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004:\u0002\u0005\u0006\u0082\u0001\u0002\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/health/connect/client/aggregate/AggregateMetric$a;", "", "T", "R", "Lkotlin/Function1;", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, "Landroidx/health/connect/client/aggregate/AggregateMetric$a$a;", "Landroidx/health/connect/client/aggregate/AggregateMetric$a$b;", "connect-client_release"}, k = 1, mv = {1, 8, 0})
    public interface a<T, R> extends Function1<T, R> {

        /* JADX INFO: renamed from: androidx.health.connect.client.aggregate.AggregateMetric$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\bæ\u0080\u0001\u0018\u0000*\n\b\u0003\u0010\u0002 \u0001*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00030\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/health/connect/client/aggregate/AggregateMetric$a$a;", "", "R", "Landroidx/health/connect/client/aggregate/AggregateMetric$a;", "", "connect-client_release"}, k = 1, mv = {1, 8, 0})
        public interface InterfaceC0035a<R> extends a<Double, R> {
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\bæ\u0080\u0001\u0018\u0000*\n\b\u0003\u0010\u0002 \u0001*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00030\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/health/connect/client/aggregate/AggregateMetric$a$b;", "", "R", "Landroidx/health/connect/client/aggregate/AggregateMetric$a;", "", "connect-client_release"}, k = 1, mv = {1, 8, 0})
        public interface b<R> extends a<Long, R> {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AggregateMetric(@NotNull a<?, ? extends T> converter, @NotNull String dataTypeName, @NotNull AggregationType aggregationType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(dataTypeName, "dataTypeName");
        Intrinsics.checkNotNullParameter(aggregationType, "aggregationType");
        this.converter = converter;
        this.dataTypeName = dataTypeName;
        this.aggregationType = aggregationType;
        this.aggregationField = str;
    }

    @Nullable
    /* JADX INFO: renamed from: getAggregationField$connect_client_release, reason: from getter */
    public final String getAggregationField() {
        return this.aggregationField;
    }

    @NotNull
    /* JADX INFO: renamed from: getAggregationType$connect_client_release, reason: from getter */
    public final AggregationType getAggregationType() {
        return this.aggregationType;
    }

    @NotNull
    public final a<?, T> getConverter$connect_client_release() {
        return this.converter;
    }

    @NotNull
    /* JADX INFO: renamed from: getDataTypeName$connect_client_release, reason: from getter */
    public final String getDataTypeName() {
        return this.dataTypeName;
    }

    @NotNull
    public final String getMetricKey$connect_client_release() {
        String aggregationTypeString = this.aggregationType.getAggregationTypeString();
        if (this.aggregationField == null) {
            return this.dataTypeName + '_' + aggregationTypeString;
        }
        return this.dataTypeName + '_' + this.aggregationField + '_' + aggregationTypeString;
    }
}
