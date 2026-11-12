package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Mass;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class NutritionRecord$Companion$POLYUNSATURATED_FAT_TOTAL$1 extends FunctionReferenceImpl implements Function1<Double, Mass> {
    public NutritionRecord$Companion$POLYUNSATURATED_FAT_TOTAL$1(Object obj) {
        super(1, obj, Mass.Companion.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
    }

    @NotNull
    public final Mass invoke(double d) {
        return ((Mass.Companion) this.receiver).grams(d);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Mass invoke2(Double d) {
        return invoke(d.doubleValue());
    }
}
