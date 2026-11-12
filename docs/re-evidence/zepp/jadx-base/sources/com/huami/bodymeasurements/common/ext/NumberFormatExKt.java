package com.huami.bodymeasurements.common.ext;

import com.huami.moving.ui.animator.AnimatorViewWrapper;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u000b"}, d2 = {"", "", AnimatorViewWrapper.SCALE, "", "formatWithDecimal", "(Ljava/lang/Float;I)Ljava/lang/String;", "formatWithDecimalFloat", "(Ljava/lang/Float;I)Ljava/lang/Float;", "formatToFloatWithDecimal", "value", "a", "common_release"}, k = 2, mv = {1, 5, 1})
public final class NumberFormatExKt {
    private static final float a(float f, int i) {
        return new BigDecimal(String.valueOf(f)).setScale(i, 4).floatValue();
    }

    @Nullable
    public static final String formatToFloatWithDecimal(@NotNull String str, int i) {
        Float floatOrNull = k.toFloatOrNull(str);
        if (floatOrNull == null) {
            return null;
        }
        return formatWithDecimal(Float.valueOf(floatOrNull.floatValue()), i);
    }

    @Nullable
    public static final String formatWithDecimal(@Nullable Float f, int i) {
        if (f == null) {
            return null;
        }
        float fFloatValue = f.floatValue();
        if (Float.isNaN(fFloatValue)) {
            return null;
        }
        return String.valueOf(a(fFloatValue, i));
    }

    @Nullable
    public static final Float formatWithDecimalFloat(@Nullable Float f, int i) {
        if (f == null) {
            return null;
        }
        float fFloatValue = f.floatValue();
        if (Float.isNaN(fFloatValue)) {
            return null;
        }
        return Float.valueOf(a(fFloatValue, i));
    }
}
