package com.huami.bloodoxygen.ui.utils;

import com.huami.moving.ui.animator.AnimatorViewWrapper;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0012\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001\u001a$\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u000b\u001a\u00020\n\"\u00020\u0001H\u0002\u001a$\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u000b\u001a\u00020\n\"\u00020\u0001H\u0002\u001a\u0012\u0010\u000e\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¨\u0006\u000f"}, d2 = {"", "", AnimatorViewWrapper.SCALE, "", "formatWithDecimal", "(Ljava/lang/Float;I)Ljava/lang/String;", "formatWithDecimalFloat", "(Ljava/lang/Float;I)F", "formatToFloatWithDecimal", "value", "", "mode", "b", "a", "c", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class DataExKt {
    private static final float a(float f, int i, int... iArr) {
        return new BigDecimal(String.valueOf(f)).setScale(i, c(iArr)).floatValue();
    }

    private static final String b(float f, int i, int... iArr) {
        float fA = (iArr == null || iArr.length != 1) ? a(f, i, new int[0]) : a(f, i, iArr[0]);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), "%." + i + "f", Arrays.copyOf(new Object[]{Float.valueOf(fA)}, 1));
    }

    private static final int c(int[] iArr) {
        if (iArr == null || iArr.length != 1 || iArr[0] < 0 || iArr[0] > 6) {
            return 1;
        }
        return iArr[0];
    }

    @NotNull
    public static final String formatToFloatWithDecimal(@NotNull String str, int i) {
        String withDecimal;
        Float floatOrNull = k.toFloatOrNull(str);
        return (floatOrNull == null || (withDecimal = formatWithDecimal(Float.valueOf(floatOrNull.floatValue()), i)) == null) ? "" : withDecimal;
    }

    @NotNull
    public static final String formatWithDecimal(@Nullable Float f, int i) {
        if (f == null) {
            return "";
        }
        float fFloatValue = f.floatValue();
        return Float.isNaN(fFloatValue) ? "" : b(fFloatValue, i, 4);
    }

    public static final float formatWithDecimalFloat(@Nullable Float f, int i) {
        if (f == null) {
            return 0.0f;
        }
        float fFloatValue = f.floatValue();
        if (Float.isNaN(fFloatValue)) {
            return 0.0f;
        }
        return a(fFloatValue, i, 4);
    }
}
