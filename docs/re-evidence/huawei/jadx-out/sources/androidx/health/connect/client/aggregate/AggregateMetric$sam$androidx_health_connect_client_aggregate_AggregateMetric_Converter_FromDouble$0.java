package androidx.health.connect.client.aggregate;

import defpackage.zcp;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class AggregateMetric$sam$androidx_health_connect_client_aggregate_AggregateMetric_Converter_FromDouble$0 implements AggregateMetric.Converter.FromDouble, FunctionAdapter {
    private final /* synthetic */ Function1 function;

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }

    public final /* synthetic */ Object invoke(double d) {
        return this.function.invoke(Double.valueOf(d));
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AggregateMetric.Converter.FromDouble) && (obj instanceof FunctionAdapter)) {
            return zcp.b(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    AggregateMetric$sam$androidx_health_connect_client_aggregate_AggregateMetric_Converter_FromDouble$0(Function1 function1) {
        zcp.c(function1, "");
        this.function = function1;
    }
}
