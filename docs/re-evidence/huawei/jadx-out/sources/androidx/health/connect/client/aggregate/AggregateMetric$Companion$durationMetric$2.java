package androidx.health.connect.client.aggregate;

import defpackage.zcn;
import defpackage.zcp;
import java.time.Duration;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class AggregateMetric$Companion$durationMetric$2 implements AggregateMetric.Converter.FromLong, FunctionAdapter {
    public static final AggregateMetric$Companion$durationMetric$2 INSTANCE = new AggregateMetric$Companion$durationMetric$2();

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }

    public final Duration invoke(long j) {
        return Duration.ofMillis(j);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return new zcn(1, Duration.class, "ofMillis", "ofMillis(J)Ljava/time/Duration;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AggregateMetric.Converter.FromLong) && (obj instanceof FunctionAdapter)) {
            return zcp.b(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    AggregateMetric$Companion$durationMetric$2() {
    }
}
