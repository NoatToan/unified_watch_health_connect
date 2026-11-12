package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Velocity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class SpeedRecord$Companion$SPEED_AVG$1 extends FunctionReferenceImpl implements Function1<Double, Velocity> {
    public SpeedRecord$Companion$SPEED_AVG$1(Object obj) {
        super(1, obj, Velocity.Companion.class, "metersPerSecond", "metersPerSecond(D)Landroidx/health/connect/client/units/Velocity;", 0);
    }

    @NotNull
    public final Velocity invoke(double d) {
        return ((Velocity.Companion) this.receiver).metersPerSecond(d);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Velocity invoke2(Double d) {
        return invoke(d.doubleValue());
    }
}
