package com.huami.bloodpressure_ui.ext;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\b\u0010\"\u0016\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0016\u0010\u0005\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\"\u0016\u0010\n\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0016\u0010\u000b\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0002\"\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\b\"\u0016\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\b\"\u0016\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\b\"%\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"%\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"%\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013\"%\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013\"\u001c\u0010!\u001a\u00020\u00068\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001f\u0010 \"\u0016\u0010\"\u001a\u00020\u00068\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\b\"\u0016\u0010#\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0002\"\u0016\u0010$\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0002\"\u0016\u0010%\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0002\"\u0016\u0010&\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0002\"\u0016\u0010'\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0002\"\u0016\u0010(\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0002\"\u0016\u0010)\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0002\"\u0016\u0010*\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0002\"\u001f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00000+8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u001f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00000+8\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/\"\u001f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00000+8\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/\"\u0016\u00107\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\b\"\u0016\u00108\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\b\"\u0016\u00109\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\b\"\u0016\u0010:\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\b¨\u0006;"}, d2 = {"", "BLOOD_PRESSURE_CONTRACT_MIN", "F", "BLOOD_PRESSURE_CONTRACT_MAX", "BLOOD_PRESSURE_RELAX_MIN", "BLOOD_PRESSURE_RELAX_MAX", "", "BLOOD_PRESSURE_AVG_CONTRACT_MIN", LogUtil.I, "BLOOD_PRESSURE_AVG_CONTRACT_MAX", "BLOOD_PRESSURE_AVG_RELEX_MIN", "BLOOD_PRESSURE_AVG_RELEX_MAX", "BLOOD_PRESSURE_STATUS_NORMAL", "BLOOD_PRESSURE_STATUS_HIGH", "BLOOD_PRESSURE_STATUS_LOW", "Lkotlin/Pair;", "a", "Lkotlin/Pair;", "getBLOOD_PRESSURE_RELAX_RANGE", "()Lkotlin/Pair;", "BLOOD_PRESSURE_RELAX_RANGE", "b", "getBLOOD_PRESSURE_DATA_RANGE", "BLOOD_PRESSURE_DATA_RANGE", "c", "getBLOOD_PRESSURE_SBP_DATA_RANGE", "BLOOD_PRESSURE_SBP_DATA_RANGE", GoogleApiAvailabilityLight.a, "getBLOOD_PRESSURE_DBP_DATA_RANGE", "BLOOD_PRESSURE_DBP_DATA_RANGE", "e", "getBLOOD_PRESSURE_OFFSET", "()I", "BLOOD_PRESSURE_OFFSET", "BP_MILLI_SECONDS_IN_MINUTE", "BLOOD_FIRST_RANGE_MIN", "BLOOD_FIRST_RANGE_MAX", "BLOOD_SECOND_RANGE_MIN", "BLOOD_SECOND_RANGE_MAX", "BLOOD_THIRD_RANGE_MIN", "BLOOD_THIRD_RANGE_MAX", "BLOOD_SPECIAL_MIN", "BLOOD_SPECIAL_MAX", "", "f", "Ljava/util/List;", "getBP_FIRST_RANGE_LIST", "()Ljava/util/List;", "BP_FIRST_RANGE_LIST", "g", "getBP_SECOND_RANGE_LIST", "BP_SECOND_RANGE_LIST", "h", "getBP_THIRD_RANGE_LIST", "BP_THIRD_RANGE_LIST", "BLOOD_PRESSURE_DAY_TIME_INTERVAL", "BLOOD_PRESSURE_MINUTES_PER_HOUR", "BLOOD_PRESSURE_HOURS_PER_DAY", "BLOOD_PRESSURE_DAY_MINUTE_COUNT", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureConstKt {
    public static final float BLOOD_FIRST_RANGE_MAX = 160.0f;
    public static final float BLOOD_FIRST_RANGE_MIN = 60.0f;
    public static final int BLOOD_PRESSURE_AVG_CONTRACT_MAX = 135;
    public static final int BLOOD_PRESSURE_AVG_CONTRACT_MIN = 90;
    public static final float BLOOD_PRESSURE_AVG_RELEX_MAX = 85.0f;
    public static final float BLOOD_PRESSURE_AVG_RELEX_MIN = 60.0f;
    public static final float BLOOD_PRESSURE_CONTRACT_MAX = 300.0f;
    public static final float BLOOD_PRESSURE_CONTRACT_MIN = 40.0f;
    public static final int BLOOD_PRESSURE_DAY_MINUTE_COUNT = 288;
    public static final int BLOOD_PRESSURE_DAY_TIME_INTERVAL = 5;
    public static final int BLOOD_PRESSURE_HOURS_PER_DAY = 24;
    public static final int BLOOD_PRESSURE_MINUTES_PER_HOUR = 60;
    public static final float BLOOD_PRESSURE_RELAX_MAX = 200.0f;
    public static final float BLOOD_PRESSURE_RELAX_MIN = 30.0f;
    public static final int BLOOD_PRESSURE_STATUS_HIGH = 1;
    public static final int BLOOD_PRESSURE_STATUS_LOW = -1;
    public static final int BLOOD_PRESSURE_STATUS_NORMAL = 0;
    public static final float BLOOD_SECOND_RANGE_MAX = 200.0f;
    public static final float BLOOD_SECOND_RANGE_MIN = 40.0f;
    public static final float BLOOD_SPECIAL_MAX = 135.0f;
    public static final float BLOOD_SPECIAL_MIN = 85.0f;
    public static final float BLOOD_THIRD_RANGE_MAX = 300.0f;
    public static final float BLOOD_THIRD_RANGE_MIN = 30.0f;
    public static final int BP_MILLI_SECONDS_IN_MINUTE = 60000;

    @NotNull
    private static final Pair<Float, Float> a;

    @NotNull
    private static final Pair<Float, Float> b;

    @NotNull
    private static final Pair<Float, Float> c;

    @NotNull
    private static final Pair<Float, Float> d;
    private static final int e;

    @NotNull
    private static final List<Float> f;

    @NotNull
    private static final List<Float> g;

    @NotNull
    private static final List<Float> h;

    static {
        Float fValueOf = Float.valueOf(30.0f);
        Float fValueOf2 = Float.valueOf(200.0f);
        a = new Pair<>(fValueOf, fValueOf2);
        Float fValueOf3 = Float.valueOf(60.0f);
        Float fValueOf4 = Float.valueOf(300.0f);
        b = new Pair<>(fValueOf3, fValueOf4);
        Float fValueOf5 = Float.valueOf(40.0f);
        c = new Pair<>(fValueOf5, fValueOf4);
        d = new Pair<>(fValueOf, fValueOf2);
        e = 8;
        Float fValueOf6 = Float.valueOf(160.0f);
        f = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf3, Float.valueOf(85.0f), Float.valueOf(110.0f), Float.valueOf(135.0f), fValueOf6});
        g = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf5, Float.valueOf(80.0f), Float.valueOf(120.0f), fValueOf6, fValueOf2});
        h = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, Float.valueOf(97.0f), Float.valueOf(165.0f), Float.valueOf(232.0f), fValueOf4});
    }

    @NotNull
    public static final Pair<Float, Float> getBLOOD_PRESSURE_DATA_RANGE() {
        return b;
    }

    @NotNull
    public static final Pair<Float, Float> getBLOOD_PRESSURE_DBP_DATA_RANGE() {
        return d;
    }

    public static final int getBLOOD_PRESSURE_OFFSET() {
        return e;
    }

    @NotNull
    public static final Pair<Float, Float> getBLOOD_PRESSURE_RELAX_RANGE() {
        return a;
    }

    @NotNull
    public static final Pair<Float, Float> getBLOOD_PRESSURE_SBP_DATA_RANGE() {
        return c;
    }

    @NotNull
    public static final List<Float> getBP_FIRST_RANGE_LIST() {
        return f;
    }

    @NotNull
    public static final List<Float> getBP_SECOND_RANGE_LIST() {
        return g;
    }

    @NotNull
    public static final List<Float> getBP_THIRD_RANGE_LIST() {
        return h;
    }
}
