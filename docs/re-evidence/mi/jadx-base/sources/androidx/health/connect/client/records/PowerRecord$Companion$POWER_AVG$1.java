package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Power;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class PowerRecord$Companion$POWER_AVG$1 extends FunctionReferenceImpl implements Function1<Double, Power> {
    public PowerRecord$Companion$POWER_AVG$1(Object obj) {
        super(1, obj, Power.Companion.class, "watts", "watts(D)Landroidx/health/connect/client/units/Power;", 0);
    }

    @NotNull
    public final Power invoke(double d) {
        return ((Power.Companion) this.receiver).watts(d);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Power invoke2(Double d) {
        return invoke(d.doubleValue());
    }
}
