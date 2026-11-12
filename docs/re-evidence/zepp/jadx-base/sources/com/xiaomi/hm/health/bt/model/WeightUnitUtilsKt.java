package com.xiaomi.hm.health.bt.model;

import com.huami.moving.ui.animator.AnimatorViewWrapper;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\t\u001a\u0016\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002\u001a\u001e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002\"%\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"%\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"", "value", "", AnimatorViewWrapper.SCALE, "scaleFloat", "unit", "getUnitScaleToKg", "weight", "unitFrom", "unitTo", "convertTo", "", "a", "Ljava/util/Map;", "getKgToOtherUnit", "()Ljava/util/Map;", "kgToOtherUnit", "b", "getUnitScale", "unitScale", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class WeightUnitUtilsKt {

    @NotNull
    private static final Map<Integer, Float> a = r.mapOf(TuplesKt.to(0, Float.valueOf(1.0f)), TuplesKt.to(16, Float.valueOf(2.0f)), TuplesKt.to(1, Float.valueOf(2.20462f)), TuplesKt.to(17, Float.valueOf(0.15747304f)), TuplesKt.to(2, Float.valueOf(1000.0f)), TuplesKt.to(3, Float.valueOf(35.27396f)));

    @NotNull
    private static final Map<Integer, Integer> b = r.mapOf(TuplesKt.to(0, 2), TuplesKt.to(16, 2), TuplesKt.to(1, 2), TuplesKt.to(17, 2));

    public static final float convertTo(float f, int i, int i2) {
        float unitScaleToKg = (f / getUnitScaleToKg(i)) * getUnitScaleToKg(i2);
        Integer num = b.get(Integer.valueOf(i2));
        return scaleFloat(unitScaleToKg, num == null ? 2 : num.intValue());
    }

    @NotNull
    public static final Map<Integer, Float> getKgToOtherUnit() {
        return a;
    }

    @NotNull
    public static final Map<Integer, Integer> getUnitScale() {
        return b;
    }

    public static final float getUnitScaleToKg(int i) {
        Float f = a.get(Integer.valueOf(i));
        if (f == null) {
            return 1.0f;
        }
        return f.floatValue();
    }

    public static final float scaleFloat(float f, int i) {
        return new BigDecimal(f).setScale(i, 4).floatValue();
    }
}
