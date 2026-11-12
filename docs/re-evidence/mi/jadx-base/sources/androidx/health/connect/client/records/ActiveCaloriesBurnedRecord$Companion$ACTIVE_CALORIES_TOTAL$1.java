package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Energy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class ActiveCaloriesBurnedRecord$Companion$ACTIVE_CALORIES_TOTAL$1 extends FunctionReferenceImpl implements Function1<Double, Energy> {
    public ActiveCaloriesBurnedRecord$Companion$ACTIVE_CALORIES_TOTAL$1(Object obj) {
        super(1, obj, Energy.Companion.class, "kilocalories", "kilocalories(D)Landroidx/health/connect/client/units/Energy;", 0);
    }

    @NotNull
    public final Energy invoke(double d) {
        return ((Energy.Companion) this.receiver).kilocalories(d);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Energy invoke2(Double d) {
        return invoke(d.doubleValue());
    }
}
