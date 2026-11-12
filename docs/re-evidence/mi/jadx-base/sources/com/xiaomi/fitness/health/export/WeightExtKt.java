package com.xiaomi.fitness.health.export;

import defpackage.jji;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000b\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0001\"\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"getColorLow", "", "getColorNormal", "getColorHigh", "COMMON_TWO_SEGMENT_COLOR", "", "getCOMMON_TWO_SEGMENT_COLOR", "()[I", "COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH", "getCOMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH", "COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_GOOD", "getCOMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_GOOD", "COMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING", "getCOMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING", "COMMON_FOUR_SEGMENT_COLOR_NORMAL_TO_DANGEROUS", "getCOMMON_FOUR_SEGMENT_COLOR_NORMAL_TO_DANGEROUS", "health-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WeightExtKt {

    @NotNull
    private static final int[] COMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING;

    @NotNull
    private static final int[] COMMON_FOUR_SEGMENT_COLOR_NORMAL_TO_DANGEROUS;

    @NotNull
    private static final int[] COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_GOOD;

    @NotNull
    private static final int[] COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH;

    @NotNull
    private static final int[] COMMON_TWO_SEGMENT_COLOR;

    static {
        int i = jji.d;
        int i2 = jji.e;
        COMMON_TWO_SEGMENT_COLOR = new int[]{i, i2};
        int i3 = jji.c;
        COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH = new int[]{i, i2, i3};
        COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_GOOD = new int[]{i, i2, jji.f22865b};
        int i4 = jji.f;
        COMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING = new int[]{i, i2, i3, i4};
        COMMON_FOUR_SEGMENT_COLOR_NORMAL_TO_DANGEROUS = new int[]{i2, i3, i4, jji.f22864a};
    }

    @NotNull
    public static final int[] getCOMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING() {
        return COMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING;
    }

    @NotNull
    public static final int[] getCOMMON_FOUR_SEGMENT_COLOR_NORMAL_TO_DANGEROUS() {
        return COMMON_FOUR_SEGMENT_COLOR_NORMAL_TO_DANGEROUS;
    }

    @NotNull
    public static final int[] getCOMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_GOOD() {
        return COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_GOOD;
    }

    @NotNull
    public static final int[] getCOMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH() {
        return COMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH;
    }

    @NotNull
    public static final int[] getCOMMON_TWO_SEGMENT_COLOR() {
        return COMMON_TWO_SEGMENT_COLOR;
    }

    public static final int getColorHigh() {
        return COMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING[2];
    }

    public static final int getColorLow() {
        return COMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING[0];
    }

    public static final int getColorNormal() {
        return COMMON_FOUR_SEGMENT_COLOR_LOW_TO_WARNING[1];
    }
}
