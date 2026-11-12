package com.huami.bodymeasurements.temperature.model;

import android.graphics.Color;
import android.util.SparseArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.ext.NumberFormatExKt;
import com.huami.bodymeasurements.temperature.model.converter.TempUnitConverter;
import com.huami.chart.data.YAxisData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\t\u001a\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\"\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005\"\u0016\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\"\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\f\u0010\r\"\u0019\u0010\u0011\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\r\"\u0019\u0010\u0014\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\r\"\u0019\u0010\u0017\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\r\"\u0016\u0010\u0018\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0005\"\u0016\u0010\u0019\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0005\"\u0016\u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0005\"\u0016\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0016\u0010\u001e\u001a\u00020\u001b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d\"\u0016\u0010\u001f\u001a\u00020\u001b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\"\u0016\u0010 \u001a\u00020\u001b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u001d\"\u0016\u0010!\u001a\u00020\u001b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\u001d\"\u0016\u0010\"\u001a\u00020\u001b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u001d\"\u0016\u0010#\u001a\u00020\u001b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\u001d¨\u0006$"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/YAxisData;", "getTempYAxisData", "", "TEMPERATURE_MIN", "F", "TEMPERATURE_MAX", "TEMPERATURE_NORMAL_MAX", "", "ALL_DAY_PIECE_DURATION", LogUtil.I, "a", "getNORMAL_COLOR", "()I", "NORMAL_COLOR", "b", "getNORMAL_END_COLOR", "NORMAL_END_COLOR", "c", "getABNORMAL_COLOR", "ABNORMAL_COLOR", GoogleApiAvailabilityLight.a, "getABNORMAL_END_COLOR", "ABNORMAL_END_COLOR", "POINT_RADIUS", "BAR_OFFSET", "DEFAULT_TEMP_VALUE", "", TempConstantsKt.HEALTH_BODYTEM_V, "Ljava/lang/String;", TempConstantsKt.HEALTH_BODYTEM_T, TempConstantsKt.HEALTH_BODYTEM_DAY_C, TempConstantsKt.HEALTH_BODYTEM_WEEK_C, TempConstantsKt.HEALTH_BODYTEM_MONTH_C, TempConstantsKt.HEALTH_BODYTEM_YEAR_C, "PHONE_SOURCE", "temperature_release"}, k = 2, mv = {1, 5, 1})
public final class TempConstantsKt {
    public static final int ALL_DAY_PIECE_DURATION = 300000;
    public static final float BAR_OFFSET = 0.24f;
    public static final float DEFAULT_TEMP_VALUE = 0.0f;

    @NotNull
    public static final String HEALTH_BODYTEM_DAY_C = "HEALTH_BODYTEM_DAY_C";

    @NotNull
    public static final String HEALTH_BODYTEM_MONTH_C = "HEALTH_BODYTEM_MONTH_C";

    @NotNull
    public static final String HEALTH_BODYTEM_T = "HEALTH_BODYTEM_T";

    @NotNull
    public static final String HEALTH_BODYTEM_V = "HEALTH_BODYTEM_V";

    @NotNull
    public static final String HEALTH_BODYTEM_WEEK_C = "HEALTH_BODYTEM_WEEK_C";

    @NotNull
    public static final String HEALTH_BODYTEM_YEAR_C = "HEALTH_BODYTEM_YEAR_C";

    @NotNull
    public static final String PHONE_SOURCE = "Android";
    public static final float POINT_RADIUS = 4.0f;
    public static final float TEMPERATURE_MAX = 42.0f;
    public static final float TEMPERATURE_MIN = 35.0f;
    public static final float TEMPERATURE_NORMAL_MAX = 37.2f;
    private static final int a = Color.parseColor("#1AAF4C");
    private static final int b = Color.parseColor("#38D883");
    private static final int c = Color.parseColor("#FFBA00");
    private static final int d = Color.parseColor("#FFDE00");

    public static final int getABNORMAL_COLOR() {
        return c;
    }

    public static final int getABNORMAL_END_COLOR() {
        return d;
    }

    public static final int getNORMAL_COLOR() {
        return a;
    }

    public static final int getNORMAL_END_COLOR() {
        return b;
    }

    @NotNull
    public static final SparseArray<YAxisData> getTempYAxisData() {
        int i = 0;
        ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(Float.valueOf(35.0f), Float.valueOf(36.75f), Float.valueOf(38.5f), Float.valueOf(40.25f), Float.valueOf(42.0f));
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        int size = arrayListArrayListOf.size();
        if (size > 0) {
            while (true) {
                int i2 = i + 1;
                float fFloatValue = ((Number) arrayListArrayListOf.get(i)).floatValue();
                sparseArray.put(i, new YAxisData(fFloatValue, TempUnitConverter.INSTANCE.getTempWithUnitString(NumberFormatExKt.formatWithDecimalFloat(Float.valueOf(fFloatValue), 1).floatValue())));
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return sparseArray;
    }
}
