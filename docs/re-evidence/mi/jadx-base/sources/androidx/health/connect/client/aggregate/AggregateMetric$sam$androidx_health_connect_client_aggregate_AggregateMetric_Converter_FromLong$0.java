package androidx.health.connect.client.aggregate;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class AggregateMetric$sam$androidx_health_connect_client_aggregate_AggregateMetric_Converter_FromLong$0 implements AggregateMetric.a.b, FunctionAdapter {
    private final /* synthetic */ Function1 function;

    public AggregateMetric$sam$androidx_health_connect_client_aggregate_AggregateMetric_Converter_FromLong$0(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof AggregateMetric.a.b) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    @NotNull
    public final Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* synthetic */ Object invoke(long j) {
        return this.function.invoke(Long.valueOf(j));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }
}
