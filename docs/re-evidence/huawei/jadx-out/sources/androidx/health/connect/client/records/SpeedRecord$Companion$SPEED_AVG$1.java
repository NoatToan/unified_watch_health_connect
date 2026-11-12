package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Velocity;
import defpackage.zcn;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class SpeedRecord$Companion$SPEED_AVG$1 extends zcn implements Function1<Double, Velocity> {
    public final Velocity invoke(double d) {
        return ((Velocity.Companion) this.receiver).metersPerSecond(d);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Velocity invoke(Double d) {
        return invoke(d.doubleValue());
    }

    SpeedRecord$Companion$SPEED_AVG$1(Object obj) {
        super(1, obj, Velocity.Companion.class, "metersPerSecond", "metersPerSecond(D)Landroidx/health/connect/client/units/Velocity;", 0);
    }
}
