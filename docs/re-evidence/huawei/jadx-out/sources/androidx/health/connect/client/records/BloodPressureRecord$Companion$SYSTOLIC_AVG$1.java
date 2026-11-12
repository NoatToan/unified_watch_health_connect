package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Pressure;
import defpackage.zcn;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class BloodPressureRecord$Companion$SYSTOLIC_AVG$1 extends zcn implements Function1<Double, Pressure> {
    public final Pressure invoke(double d) {
        return ((Pressure.Companion) this.receiver).millimetersOfMercury(d);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Pressure invoke(Double d) {
        return invoke(d.doubleValue());
    }

    BloodPressureRecord$Companion$SYSTOLIC_AVG$1(Object obj) {
        super(1, obj, Pressure.Companion.class, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;", 0);
    }
}
