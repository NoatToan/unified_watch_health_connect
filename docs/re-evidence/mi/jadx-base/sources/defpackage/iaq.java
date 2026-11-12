package defpackage;

import com.xiaomi.fitness.common.unit.LengthUnit;
import com.xiaomi.fitness.common.unit.WeightUnit;

/* JADX INFO: loaded from: classes9.dex */
public class iaq {
    public static LengthUnit a(int i) {
        if (i < 0 || i >= LengthUnit.values().length) {
            return null;
        }
        return LengthUnit.values()[i];
    }

    public static WeightUnit b(Integer num) {
        if (num.intValue() < 0 || num.intValue() >= WeightUnit.values().length) {
            return null;
        }
        return WeightUnit.values()[num.intValue()];
    }
}
