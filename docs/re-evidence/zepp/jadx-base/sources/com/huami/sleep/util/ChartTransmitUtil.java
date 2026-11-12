package com.huami.sleep.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.listener.IDataExtendListener;
import com.huami.chart.util.HMColor;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.quotient.SleepQuotientProviderKt;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.service.SleepMode;
import com.huami.sleep.service.bean.SleepDataWithMode;
import com.huami.sleep.util.ChartTransmitUtil;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bc\u0010dJ4\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0016\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rJ\u0016\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002J(\u0010\u001a\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0007J.\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0007JJ\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\"2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0018\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020 0\u0014J\u0016\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0002R\u0019\u0010-\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010/\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b.\u0010,R\u0019\u00101\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b0\u0010,R\u0019\u00104\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010,R\u0019\u00107\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010,R\u0019\u0010:\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,R\u0019\u0010=\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b<\u0010,R\u0019\u0010@\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010*\u001a\u0004\b?\u0010,R\u0019\u0010C\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010*\u001a\u0004\bB\u0010,R\u0019\u0010F\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010*\u001a\u0004\bE\u0010,R\u0019\u0010I\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bG\u0010*\u001a\u0004\bH\u0010,R\u0019\u0010L\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010*\u001a\u0004\bK\u0010,R\u0016\u0010M\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010*R\u0016\u0010N\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010*R\u0016\u0010O\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bO\u0010*R\u0016\u0010P\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010*R\u0016\u0010Q\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bQ\u0010*R\u0016\u0010R\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bR\u0010*R\u0016\u0010S\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bS\u0010*R\u0016\u0010T\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bT\u0010*R\u0016\u0010V\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bU\u0010*R\u0016\u0010W\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bW\u0010*R\u0016\u0010X\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bX\u0010*R\u0016\u0010\\\u001a\u00020Y8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b]\u0010*R\u0016\u0010`\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b_\u0010*R\u0016\u0010b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\ba\u0010*¨\u0006e"}, d2 = {"Lcom/huami/sleep/util/ChartTransmitUtil;", "", "", "start", "end", "normalColor", "highLightColor", "", "value", "Lcom/huami/chart/data/ChartData;", "c", "targetInt", "b", "", "targetDateTime", "baseDateTime", "transmitDateTimeToSpecialInt", "index", "transmitIndexToDateTime", "transmitIndexByZeroClock", "", "Lcom/xiaomi/hm/health/dataprocess/StageSleep;", "stageSleepList", "smallValue", "bigValue", "Lcom/huami/chart/data/ChartDataList;", "fetchMainSleepChartData", "Lcom/huami/sleep/service/bean/SleepDataWithMode;", "fetchMainSleepChartDataWithMode", "selectedDateTime", "tonalityStartTime", "tonalityEndTime", "Lkotlin/Pair;", "tonalityScoreList", "Lkotlin/Triple;", "transmitSleepTonalityData", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "resId", "Landroid/graphics/Bitmap;", "vectorDrawableToBitmap", "a", LogUtil.I, "getNO_WEAR_COLOR", "()I", "NO_WEAR_COLOR", "getDEEP_SLEEP_COLOR", "DEEP_SLEEP_COLOR", "getLIGHT_SLEEP_COLOR", "LIGHT_SLEEP_COLOR", GoogleApiAvailabilityLight.a, "getREM_SLEEP_COLOR", "REM_SLEEP_COLOR", "e", "getAWAKE_SLEEP_COLOR", "AWAKE_SLEEP_COLOR", "f", "getBLANK_SLEEP_COLOR", "BLANK_SLEEP_COLOR", "g", "getEDIT_SLEEP_COLOR", "EDIT_SLEEP_COLOR", "h", "getHIGH_LIGHT_DEEP_SLEEP_COLOR", "HIGH_LIGHT_DEEP_SLEEP_COLOR", "i", "getHIGH_LIGHT_LIGHT_SLEEP_COLOR", "HIGH_LIGHT_LIGHT_SLEEP_COLOR", z.j, "getHIGH_LIGHT_AWAKE_SLEEP_COLOR", "HIGH_LIGHT_AWAKE_SLEEP_COLOR", hl.k, "getHIGH_LIGHT_REM_SLEEP_COLOR", "HIGH_LIGHT_REM_SLEEP_COLOR", "l", "getHIGH_LIGHT_EDIT_SLEEP_COLOR", "HIGH_LIGHT_EDIT_SLEEP_COLOR", "MODE_NO_WEAR", "MODE_DEEP_SLEEP", "MODE_LIGHT_SLEEP", "MODE_REM", "MODE_AWAKE", "MODE_BLANK", "MODE_EDIT", "BASE_INDEX", "m", "SIXTY_THOUSAND", "INVALID_INDEX", "ZERO", "", GoogleApiAvailabilityLight.b, "Ljava/lang/String;", "TAG", "o", "DEFAULT_TONALITY_MIN_VALUE", b.r, "DEFAULT_TONALITY_MAX_VALUE", DTransferConstants.SEARCH_KEY, "DIVIDE_NUM_TEN", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class ChartTransmitUtil {
    public static final int BASE_INDEX = 1440;
    public static final int INVALID_INDEX = -1;
    public static final int MODE_AWAKE = 7;
    public static final int MODE_BLANK = 128;
    public static final int MODE_DEEP_SLEEP = 5;
    public static final int MODE_EDIT = 777;
    public static final int MODE_LIGHT_SLEEP = 4;
    public static final int MODE_NO_WEAR = 3;
    public static final int MODE_REM = 8;
    public static final int ZERO = 0;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int REM_SLEEP_COLOR;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final int AWAKE_SLEEP_COLOR;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final int BLANK_SLEEP_COLOR;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final int EDIT_SLEEP_COLOR;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final int HIGH_LIGHT_DEEP_SLEEP_COLOR;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final int HIGH_LIGHT_LIGHT_SLEEP_COLOR;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final int HIGH_LIGHT_AWAKE_SLEEP_COLOR;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final int HIGH_LIGHT_REM_SLEEP_COLOR;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final int HIGH_LIGHT_EDIT_SLEEP_COLOR;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final int SIXTY_THOUSAND = 60000;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "ChartDataTransmitUtil";

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static final int DEFAULT_TONALITY_MIN_VALUE = 50;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static final int DEFAULT_TONALITY_MAX_VALUE = 100;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final int DIVIDE_NUM_TEN = 10;

    @NotNull
    public static final ChartTransmitUtil INSTANCE = new ChartTransmitUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int NO_WEAR_COLOR = ContextCompat.getColor(KoinExtKt.getAppContext(), R.color.s10);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int DEEP_SLEEP_COLOR = ContextCompat.getColor(KoinExtKt.getAppContext(), R.color.s25);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int LIGHT_SLEEP_COLOR = ContextCompat.getColor(KoinExtKt.getAppContext(), R.color.s16);

    static {
        Context appContext = KoinExtKt.getAppContext();
        int i = R.color.s19;
        REM_SLEEP_COLOR = ContextCompat.getColor(appContext, i);
        AWAKE_SLEEP_COLOR = ContextCompat.getColor(KoinExtKt.getAppContext(), R.color.s34);
        BLANK_SLEEP_COLOR = ContextCompat.getColor(KoinExtKt.getAppContext(), R.color.s4);
        Context appContext2 = KoinExtKt.getAppContext();
        int i2 = R.color.s17;
        EDIT_SLEEP_COLOR = ContextCompat.getColor(appContext2, i2);
        HIGH_LIGHT_DEEP_SLEEP_COLOR = ContextCompat.getColor(KoinExtKt.getAppContext(), R.color.s24);
        HIGH_LIGHT_LIGHT_SLEEP_COLOR = ContextCompat.getColor(KoinExtKt.getAppContext(), R.color.s15);
        HIGH_LIGHT_AWAKE_SLEEP_COLOR = ContextCompat.getColor(KoinExtKt.getAppContext(), R.color.s33);
        HIGH_LIGHT_REM_SLEEP_COLOR = ContextCompat.getColor(KoinExtKt.getAppContext(), i);
        HIGH_LIGHT_EDIT_SLEEP_COLOR = ContextCompat.getColor(KoinExtKt.getAppContext(), i2);
    }

    private ChartTransmitUtil() {
    }

    private final int b(int targetInt) {
        boolean z = false;
        if (targetInt >= 0 && targetInt < 50) {
            z = true;
        }
        if (z) {
            return (targetInt / 10) * 10;
        }
        return 50;
    }

    private final ChartData c(int start, int end, @ColorInt final int normalColor, @ColorInt final int highLightColor, float value) {
        ChartData chartData = new ChartData(new BaseIndex(start, end), value);
        chartData.addExtends(new IDataExtendListener() { // from class: ao0
            @Override // com.huami.chart.listener.IDataExtendListener
            public final Object get(BaseIndex baseIndex) {
                return ChartTransmitUtil.d(normalColor, highLightColor, baseIndex);
            }
        });
        return chartData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(int i, int i2, BaseIndex baseIndex) {
        return new HMColor(i, i2);
    }

    public static /* synthetic */ ChartDataList fetchMainSleepChartData$default(ChartTransmitUtil chartTransmitUtil, List list, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 76.0f;
        }
        if ((i & 4) != 0) {
            f2 = 135.0f;
        }
        return chartTransmitUtil.fetchMainSleepChartData(list, f, f2);
    }

    public static /* synthetic */ List fetchMainSleepChartDataWithMode$default(ChartTransmitUtil chartTransmitUtil, List list, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 76.0f;
        }
        if ((i & 4) != 0) {
            f2 = 135.0f;
        }
        return chartTransmitUtil.fetchMainSleepChartDataWithMode(list, f, f2);
    }

    @NotNull
    public final ChartDataList fetchMainSleepChartData(@NotNull List<? extends StageSleep> stageSleepList, float smallValue, float bigValue) {
        ChartData chartDataC;
        SparseArray sparseArray = new SparseArray();
        int iMin = 0;
        int iMax = 0;
        int i = 0;
        for (Object obj : stageSleepList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            StageSleep stageSleep = (StageSleep) obj;
            if (i == 0) {
                iMin = stageSleep.start;
                iMax = stageSleep.stop;
            } else {
                iMin = Math.min(iMin, stageSleep.start);
                iMax = Math.max(iMax, stageSleep.stop);
            }
            int i3 = stageSleep.mode;
            if (i3 == 3) {
                ChartTransmitUtil chartTransmitUtil = INSTANCE;
                chartDataC = chartTransmitUtil.c(stageSleep.start, stageSleep.stop + 1, chartTransmitUtil.getNO_WEAR_COLOR(), chartTransmitUtil.getNO_WEAR_COLOR(), smallValue);
            } else if (i3 == 4) {
                ChartTransmitUtil chartTransmitUtil2 = INSTANCE;
                chartDataC = chartTransmitUtil2.c(stageSleep.start, stageSleep.stop + 1, chartTransmitUtil2.getLIGHT_SLEEP_COLOR(), chartTransmitUtil2.getHIGH_LIGHT_LIGHT_SLEEP_COLOR(), smallValue);
            } else if (i3 == 5) {
                ChartTransmitUtil chartTransmitUtil3 = INSTANCE;
                chartDataC = chartTransmitUtil3.c(stageSleep.start, stageSleep.stop + 1, chartTransmitUtil3.getDEEP_SLEEP_COLOR(), chartTransmitUtil3.getHIGH_LIGHT_DEEP_SLEEP_COLOR(), bigValue);
            } else if (i3 == 7) {
                ChartTransmitUtil chartTransmitUtil4 = INSTANCE;
                chartDataC = chartTransmitUtil4.c(stageSleep.start, stageSleep.stop + 1, chartTransmitUtil4.getAWAKE_SLEEP_COLOR(), chartTransmitUtil4.getHIGH_LIGHT_AWAKE_SLEEP_COLOR(), bigValue);
            } else if (i3 == 8) {
                ChartTransmitUtil chartTransmitUtil5 = INSTANCE;
                chartDataC = chartTransmitUtil5.c(stageSleep.start, stageSleep.stop + 1, chartTransmitUtil5.getREM_SLEEP_COLOR(), chartTransmitUtil5.getHIGH_LIGHT_REM_SLEEP_COLOR(), bigValue);
            } else if (i3 != 128) {
                ChartTransmitUtil chartTransmitUtil6 = INSTANCE;
                chartDataC = chartTransmitUtil6.c(stageSleep.start, stageSleep.stop + 1, chartTransmitUtil6.getEDIT_SLEEP_COLOR(), chartTransmitUtil6.getHIGH_LIGHT_EDIT_SLEEP_COLOR(), smallValue);
            } else {
                ChartTransmitUtil chartTransmitUtil7 = INSTANCE;
                chartDataC = chartTransmitUtil7.c(stageSleep.start, stageSleep.stop + 1, chartTransmitUtil7.getBLANK_SLEEP_COLOR(), chartTransmitUtil7.getBLANK_SLEEP_COLOR(), bigValue);
            }
            sparseArray.put(chartDataC.getIndex(), chartDataC);
            i = i2;
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(iMin);
        chartDataList.setEnd(iMax);
        chartDataList.setMinValue(0.0f);
        chartDataList.setMaxValue(bigValue);
        return chartDataList;
    }

    @NotNull
    public final List<SleepDataWithMode> fetchMainSleepChartDataWithMode(@NotNull List<? extends StageSleep> stageSleepList, float smallValue, float bigValue) {
        ChartData chartDataC;
        ArrayList arrayList = new ArrayList();
        for (StageSleep stageSleep : stageSleepList) {
            SleepMode sleepMode = SleepMode.EDIT;
            int i = stageSleep.mode;
            if (i == 3) {
                ChartTransmitUtil chartTransmitUtil = INSTANCE;
                chartDataC = chartTransmitUtil.c(stageSleep.start, stageSleep.stop + 1, chartTransmitUtil.getNO_WEAR_COLOR(), chartTransmitUtil.getNO_WEAR_COLOR(), smallValue);
                sleepMode = SleepMode.NO_WEAR;
            } else if (i == 4) {
                ChartTransmitUtil chartTransmitUtil2 = INSTANCE;
                chartDataC = chartTransmitUtil2.c(stageSleep.start, stageSleep.stop + 1, chartTransmitUtil2.getLIGHT_SLEEP_COLOR(), chartTransmitUtil2.getHIGH_LIGHT_LIGHT_SLEEP_COLOR(), smallValue);
                sleepMode = SleepMode.LIGHT;
            } else if (i == 5) {
                ChartTransmitUtil chartTransmitUtil3 = INSTANCE;
                chartDataC = chartTransmitUtil3.c(stageSleep.start, stageSleep.stop + 1, chartTransmitUtil3.getDEEP_SLEEP_COLOR(), chartTransmitUtil3.getHIGH_LIGHT_DEEP_SLEEP_COLOR(), bigValue);
                sleepMode = SleepMode.DEEP;
            } else if (i == 7) {
                ChartTransmitUtil chartTransmitUtil4 = INSTANCE;
                chartDataC = chartTransmitUtil4.c(stageSleep.start, stageSleep.stop + 1, chartTransmitUtil4.getAWAKE_SLEEP_COLOR(), chartTransmitUtil4.getHIGH_LIGHT_AWAKE_SLEEP_COLOR(), bigValue);
                sleepMode = SleepMode.AWAKE;
            } else if (i == 8) {
                ChartTransmitUtil chartTransmitUtil5 = INSTANCE;
                chartDataC = chartTransmitUtil5.c(stageSleep.start, stageSleep.stop + 1, chartTransmitUtil5.getREM_SLEEP_COLOR(), chartTransmitUtil5.getHIGH_LIGHT_REM_SLEEP_COLOR(), bigValue);
                sleepMode = SleepMode.REM;
            } else if (i != 128) {
                ChartTransmitUtil chartTransmitUtil6 = INSTANCE;
                chartDataC = chartTransmitUtil6.c(stageSleep.start, stageSleep.stop + 1, chartTransmitUtil6.getEDIT_SLEEP_COLOR(), chartTransmitUtil6.getHIGH_LIGHT_EDIT_SLEEP_COLOR(), smallValue);
            } else {
                ChartTransmitUtil chartTransmitUtil7 = INSTANCE;
                chartDataC = chartTransmitUtil7.c(stageSleep.start, stageSleep.stop + 1, chartTransmitUtil7.getBLANK_SLEEP_COLOR(), chartTransmitUtil7.getBLANK_SLEEP_COLOR(), bigValue);
                sleepMode = SleepMode.SLEEP_BLANK;
            }
            arrayList.add(new SleepDataWithMode(sleepMode, chartDataC));
        }
        return arrayList;
    }

    public final int getAWAKE_SLEEP_COLOR() {
        return AWAKE_SLEEP_COLOR;
    }

    public final int getBLANK_SLEEP_COLOR() {
        return BLANK_SLEEP_COLOR;
    }

    public final int getDEEP_SLEEP_COLOR() {
        return DEEP_SLEEP_COLOR;
    }

    public final int getEDIT_SLEEP_COLOR() {
        return EDIT_SLEEP_COLOR;
    }

    public final int getHIGH_LIGHT_AWAKE_SLEEP_COLOR() {
        return HIGH_LIGHT_AWAKE_SLEEP_COLOR;
    }

    public final int getHIGH_LIGHT_DEEP_SLEEP_COLOR() {
        return HIGH_LIGHT_DEEP_SLEEP_COLOR;
    }

    public final int getHIGH_LIGHT_EDIT_SLEEP_COLOR() {
        return HIGH_LIGHT_EDIT_SLEEP_COLOR;
    }

    public final int getHIGH_LIGHT_LIGHT_SLEEP_COLOR() {
        return HIGH_LIGHT_LIGHT_SLEEP_COLOR;
    }

    public final int getHIGH_LIGHT_REM_SLEEP_COLOR() {
        return HIGH_LIGHT_REM_SLEEP_COLOR;
    }

    public final int getLIGHT_SLEEP_COLOR() {
        return LIGHT_SLEEP_COLOR;
    }

    public final int getNO_WEAR_COLOR() {
        return NO_WEAR_COLOR;
    }

    public final int getREM_SLEEP_COLOR() {
        return REM_SLEEP_COLOR;
    }

    public final int transmitDateTimeToSpecialInt(long targetDateTime, long baseDateTime) {
        long j = 60000;
        long j2 = (baseDateTime / j) - (targetDateTime / j);
        if (j2 < 1440) {
            return (int) (((long) 1440) - j2);
        }
        return -1;
    }

    public final int transmitIndexByZeroClock(int index) {
        return index + SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN;
    }

    public final long transmitIndexToDateTime(int index, long baseDateTime) {
        return baseDateTime + ((long) ((index + SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN) * 60000));
    }

    @NotNull
    public final Triple<ChartDataList, Integer, Integer> transmitSleepTonalityData(long selectedDateTime, long tonalityStartTime, long tonalityEndTime, @NotNull List<Pair<Long, Integer>> tonalityScoreList) {
        int iTransmitDateTimeToSpecialInt = transmitDateTimeToSpecialInt(tonalityStartTime, selectedDateTime);
        int iTransmitDateTimeToSpecialInt2 = transmitDateTimeToSpecialInt(tonalityEndTime, selectedDateTime);
        SparseArray sparseArray = new SparseArray();
        int iIntValue = 0;
        int iIntValue2 = 0;
        int i = 0;
        for (Object obj : tonalityScoreList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) obj;
            iIntValue2 = i == 0 ? ((Number) pair.getSecond()).intValue() : Math.max(iIntValue2, ((Number) pair.getSecond()).intValue());
            iIntValue = i == 0 ? ((Number) pair.getSecond()).intValue() : Math.min(iIntValue, ((Number) pair.getSecond()).intValue());
            int iTransmitDateTimeToSpecialInt3 = INSTANCE.transmitDateTimeToSpecialInt(((Number) pair.getFirst()).longValue(), selectedDateTime);
            sparseArray.put(iTransmitDateTimeToSpecialInt3, new ChartData(iTransmitDateTimeToSpecialInt3, ((Number) pair.getSecond()).intValue()));
            i = i2;
        }
        Unit unit = Unit.INSTANCE;
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(iTransmitDateTimeToSpecialInt);
        chartDataList.setEnd(iTransmitDateTimeToSpecialInt2);
        chartDataList.setMinValue(INSTANCE.b(iIntValue));
        chartDataList.setMaxValue(100.0f);
        return new Triple<>(chartDataList, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
    }

    @NotNull
    public final Bitmap vectorDrawableToBitmap(@NotNull Context context, int resId) {
        Drawable drawable = ContextCompat.getDrawable(context, resId);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable == null ? 0 : drawable.getIntrinsicWidth(), drawable == null ? 0 : drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (drawable != null) {
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
        return bitmapCreateBitmap;
    }
}
