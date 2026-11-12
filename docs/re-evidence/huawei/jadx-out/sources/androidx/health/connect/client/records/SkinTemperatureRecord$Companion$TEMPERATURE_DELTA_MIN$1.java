package androidx.health.connect.client.records;

import androidx.core.text.util.LocalePreferences;
import androidx.health.connect.client.units.TemperatureDelta;
import defpackage.zcn;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class SkinTemperatureRecord$Companion$TEMPERATURE_DELTA_MIN$1 extends zcn implements Function1<Double, TemperatureDelta> {
    public final TemperatureDelta invoke(double d) {
        return ((TemperatureDelta.Companion) this.receiver).celsius(d);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ TemperatureDelta invoke(Double d) {
        return invoke(d.doubleValue());
    }

    SkinTemperatureRecord$Companion$TEMPERATURE_DELTA_MIN$1(Object obj) {
        super(1, obj, TemperatureDelta.Companion.class, LocalePreferences.TemperatureUnit.CELSIUS, "celsius(D)Landroidx/health/connect/client/units/TemperatureDelta;", 0);
    }
}
