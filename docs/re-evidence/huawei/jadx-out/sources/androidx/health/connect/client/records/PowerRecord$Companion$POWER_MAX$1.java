package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Power;
import defpackage.zcn;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class PowerRecord$Companion$POWER_MAX$1 extends zcn implements Function1<Double, Power> {
    public final Power invoke(double d) {
        return ((Power.Companion) this.receiver).watts(d);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Power invoke(Double d) {
        return invoke(d.doubleValue());
    }

    PowerRecord$Companion$POWER_MAX$1(Object obj) {
        super(1, obj, Power.Companion.class, "watts", "watts(D)Landroidx/health/connect/client/units/Power;", 0);
    }
}
