package androidx.health.connect.client.impl.converters.aggregate;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.platform.client.proto.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/health/connect/client/aggregate/AggregateMetric;", "Landroidx/health/platform/client/proto/z0;", "toProto", "(Landroidx/health/connect/client/aggregate/AggregateMetric;)Landroidx/health/platform/client/proto/z0;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nAggregateMetricToProto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AggregateMetricToProto.kt\nandroidx/health/connect/client/impl/converters/aggregate/AggregateMetricToProtoKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
public final class AggregateMetricToProtoKt {
    @NotNull
    public static final z0 toProto(@NotNull AggregateMetric<?> aggregateMetric) {
        Intrinsics.checkNotNullParameter(aggregateMetric, "<this>");
        z0.a aVarY = z0.S().z(aggregateMetric.getDataTypeName()).y(aggregateMetric.getAggregationType().getAggregationTypeString());
        String aggregationField = aggregateMetric.getAggregationField();
        if (aggregationField != null) {
            aVarY.A(aggregationField);
        }
        z0 z0VarBuild = aVarY.build();
        Intrinsics.checkNotNullExpressionValue(z0VarBuild, "newBuilder()\n        .se…= it } }\n        .build()");
        return z0VarBuild;
    }
}
