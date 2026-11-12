package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Mass;
import defpackage.zcn;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class NutritionRecord$Companion$VITAMIN_E_TOTAL$1 extends zcn implements Function1<Double, Mass> {
    public final Mass invoke(double d) {
        return ((Mass.Companion) this.receiver).grams(d);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Mass invoke(Double d) {
        return invoke(d.doubleValue());
    }

    NutritionRecord$Companion$VITAMIN_E_TOTAL$1(Object obj) {
        super(1, obj, Mass.Companion.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
    }
}
