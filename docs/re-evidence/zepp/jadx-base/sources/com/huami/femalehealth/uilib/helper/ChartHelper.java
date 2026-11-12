package com.huami.femalehealth.uilib.helper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.listener.BarLineChartTouchListener;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.calculation.Duration;
import com.huami.femalehealth.logiclib.dto.Degree;
import com.huami.femalehealth.logiclib.dto.SymptomType;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.ext.NumberExtKt;
import com.huami.femalehealth.logiclib.vo.SymptomVo;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.widget.chart.FHBarChart;
import com.huami.femalehealth.uilib.widget.chart.formatter.XAxisValueFormatter;
import com.huami.femalehealth.uilib.widget.chart.formatter.YAxisValueFormatter;
import com.huami.femalehealth.uilib.widget.chart.render.HideBottomLineYAxisRender;
import com.huami.femalehealth.uilib.widget.chart.render.RoundedBarChartRenderer;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u000289B\t\b\u0002¢\u0006\u0004\b6\u00107J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J2\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fJ.\u0010\u001e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\u0017J\u000e\u0010#\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u00192\u0006\u0010$\u001a\u00020\u0006J\u000e\u0010'\u001a\u00020&2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010)\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0014J\u0016\u0010+\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020*R\u0016\u0010-\u001a\u00020&8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010.R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010.R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u0016\u00103\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020&8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010,¨\u0006:"}, d2 = {"Lcom/huami/femalehealth/uilib/helper/ChartHelper;", "", "", "chartWidth", "minSpacePx", "barWidthPx", "", "barCount", "Lcom/huami/femalehealth/uilib/helper/ChartHelper$ScaleConfig;", "b", "", "a", "Lcom/huami/femalehealth/logiclib/dto/SymptomType;", "type", "Lcom/github/mikephil/charting/charts/BarChart;", "chart", "Lcom/huami/femalehealth/uilib/helper/ChartHelper$BarChartStyle;", "c", "Lcom/huami/femalehealth/logiclib/vo/SymptomVo;", "e", "", "start", "end", "", GoogleApiAvailabilityLight.a, "", "symptomVoList", "fillSymptomListIfNecessary", "symptomType", "isRTL", "initFemaleHealthSymptomChart", "scaleConfig", "invalidate", "", "scaleHorizontally", "resetChart", "count", "randomTestData", "", "getSymptomName", "time", "formatDateMonthAndDay", "Ljava/util/Date;", "formatHistoryCardDate", "Ljava/lang/String;", "TAG", "F", "MIN_BAR_WIDTH", "MAX_BAR_WIDTH", "NORMAL_BAR_WIDTH", "LABEL_TEXT_SIZE", "ANIMATE_DURATION", LogUtil.I, "FMT_MM_DD", "<init>", "()V", "BarChartStyle", "ScaleConfig", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class ChartHelper {
    public static final int ANIMATE_DURATION = 500;

    @NotNull
    public static final String FMT_MM_DD = "MM/dd";

    @NotNull
    public static final ChartHelper INSTANCE = new ChartHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "ChartHelper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float MIN_BAR_WIDTH = 0.05f;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float MAX_BAR_WIDTH = 0.6f;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float NORMAL_BAR_WIDTH = 0.2f;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float LABEL_TEXT_SIZE = 11.0f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/huami/femalehealth/uilib/helper/ChartHelper$BarChartStyle;", "", "", "a", LogUtil.I, "getBarColor", "()I", "setBarColor", "(I)V", "barColor", "", "b", "F", "getBarChartWidthPx", "()F", "setBarChartWidthPx", "(F)V", "barChartWidthPx", "c", "getMinSpacePx", "setMinSpacePx", "minSpacePx", GoogleApiAvailabilityLight.a, "getBarWidthPx", "setBarWidthPx", "barWidthPx", "<init>", "(IFFF)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class BarChartStyle {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int barColor;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private float barChartWidthPx;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private float minSpacePx;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private float barWidthPx;

        public BarChartStyle(int i, float f, float f2, float f3) {
            this.barColor = i;
            this.barChartWidthPx = f;
            this.minSpacePx = f2;
            this.barWidthPx = f3;
        }

        public final float getBarChartWidthPx() {
            return this.barChartWidthPx;
        }

        public final int getBarColor() {
            return this.barColor;
        }

        public final float getBarWidthPx() {
            return this.barWidthPx;
        }

        public final float getMinSpacePx() {
            return this.minSpacePx;
        }

        public final void setBarChartWidthPx(float f) {
            this.barChartWidthPx = f;
        }

        public final void setBarColor(int i) {
            this.barColor = i;
        }

        public final void setBarWidthPx(float f) {
            this.barWidthPx = f;
        }

        public final void setMinSpacePx(float f) {
            this.minSpacePx = f;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/huami/femalehealth/uilib/helper/ChartHelper$ScaleConfig;", "", "", "toString", "", "a", "F", "getScaleTimes", "()F", "setScaleTimes", "(F)V", "scaleTimes", "b", "getBarWidth", "setBarWidth", "barWidth", "<init>", "(FF)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class ScaleConfig {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private float scaleTimes;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private float barWidth;

        public ScaleConfig(float f, float f2) {
            this.scaleTimes = f;
            this.barWidth = f2;
        }

        public final float getBarWidth() {
            return this.barWidth;
        }

        public final float getScaleTimes() {
            return this.scaleTimes;
        }

        public final void setBarWidth(float f) {
            this.barWidth = f;
        }

        public final void setScaleTimes(float f) {
            this.scaleTimes = f;
        }

        @NotNull
        public String toString() {
            return "scaleTimes=" + this.scaleTimes + ", barWidth=" + this.barWidth;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SymptomType.values().length];
            iArr[SymptomType.BLOOD.ordinal()] = 1;
            iArr[SymptomType.MOOD.ordinal()] = 2;
            iArr[SymptomType.PAIN.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float[] c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, float f2, float[] fArr) {
            super(0);
            this.a = f;
            this.b = f2;
            this.c = fArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "barWidthPx:" + this.a + ", chartWidth:" + this.b + ", barWidthRange: " + Arrays.toString(this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, float f2) {
            super(0);
            this.a = f;
            this.b = f2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "singleAreaWidthPx: " + this.a + ", barWidth:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<SymptomVo> a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;
        public final /* synthetic */ SymptomType d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<SymptomVo> list, long j, long j2, SymptomType symptomType) {
            super(0);
            this.a = list;
            this.b = j;
            this.c = j2;
            this.d = symptomType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fillSymptomListIfNecessary, symptomVoList=" + this.a + ", start=" + NumberExtKt.dateFormat(this.b) + ", end=" + NumberExtKt.dateFormat(this.c) + ", type=" + this.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ List<SymptomVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<SymptomVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("fillSymptomListIfNecessary, ret=", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ float a;
        public final /* synthetic */ BarChartStyle b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f, BarChartStyle barChartStyle) {
            super(0);
            this.a = f;
            this.b = barChartStyle;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getBarChartStyle, labelMaxWidth=" + this.a + ", barChartWidthPx=" + this.b.getBarChartWidthPx();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ ScaleConfig a;
        public final /* synthetic */ int b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ScaleConfig scaleConfig, int i, boolean z) {
            super(0);
            this.a = scaleConfig;
            this.b = i;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "scaleConfig: " + this.a + ", count=" + this.b + ", empty=" + this.c;
        }
    }

    private ChartHelper() {
    }

    private final float[] a(float minSpacePx, float barWidthPx) {
        return new float[]{MIN_BAR_WIDTH, NumberExtKt.limit(barWidthPx / (minSpacePx + barWidthPx), MIN_BAR_WIDTH, 0.6f)};
    }

    private final ScaleConfig b(float chartWidth, float minSpacePx, float barWidthPx, int barCount) {
        float[] fArrA = a(minSpacePx, barWidthPx);
        HMLog.info("xys_ChartHelper", new a(barWidthPx, chartWidth, fArrA));
        float f2 = fArrA[0];
        float f3 = fArrA[1];
        float f4 = barCount;
        float f5 = f4 * barWidthPx;
        if (f5 / f3 > chartWidth) {
            return new ScaleConfig((f5 / 0.2f) / chartWidth, 0.2f);
        }
        float f6 = chartWidth / f4;
        float fLimit = NumberExtKt.limit(barWidthPx / f6, f2, f3);
        HMLog.info("xys_ChartHelper", new b(f6, fLimit));
        return new ScaleConfig(1.0f, fLimit);
    }

    private final BarChartStyle c(SymptomType type, BarChart chart) {
        Paint paint = new Paint();
        paint.setTextSize(11.0f);
        Degree[] degreeArrValues = Degree.values();
        ArrayList arrayList = new ArrayList(degreeArrValues.length);
        for (Degree degree : degreeArrValues) {
            arrayList.add(new YAxisValueFormatter(type).getFormattedValue(degree.getValue()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(paint.measureText((String) it2.next())));
        }
        Float fM3963maxOrNull = CollectionsKt___CollectionsKt.m3963maxOrNull((Iterable<Float>) arrayList2);
        float fFloatValue = fM3963maxOrNull == null ? 0.0f : fM3963maxOrNull.floatValue();
        Context context = chart.getContext();
        int i = R.color.fh_chart_mood_bar_color;
        int resColor = com.huami.femalehealth.uilib.widget.ExtKt.getResColor(context, i);
        float f2 = 2;
        float fDpToPx = ((chart.getResources().getDisplayMetrics().widthPixels - (com.huami.femalehealth.uilib.widget.ExtKt.dpToPx(chart, 15.0f) * f2)) - (com.huami.femalehealth.uilib.widget.ExtKt.dpToPx(chart, 10.0f) * f2)) - fFloatValue;
        ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
        BarChartStyle barChartStyle = new BarChartStyle(resColor, fDpToPx, resourceHelper.getDimen(R.dimen.fh_chart_bar_min_between_space), resourceHelper.getDimen(R.dimen.fh_chart_bar_width_require));
        HMLog.debug("xys_ChartHelper", new e(fFloatValue, barChartStyle));
        int i2 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 == 1) {
            barChartStyle.setBarColor(com.huami.femalehealth.uilib.widget.ExtKt.getResColor(chart.getContext(), R.color.fh_chart_blood_bar_color));
        } else if (i2 == 2) {
            barChartStyle.setBarColor(com.huami.femalehealth.uilib.widget.ExtKt.getResColor(chart.getContext(), i));
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            barChartStyle.setBarColor(com.huami.femalehealth.uilib.widget.ExtKt.getResColor(chart.getContext(), R.color.fh_chart_pain_bar_color));
        }
        return barChartStyle;
    }

    private final boolean d(long start, long end) {
        return AidKt.inDur(AidKt.toMilli(DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null)), new Duration(start, end));
    }

    private final SymptomVo e() {
        return new SymptomVo(Degree.INSTANCE.covertByIntType(Integer.valueOf(Random.Default.nextInt(3) + 1)), SymptomType.INSTANCE.random(), System.currentTimeMillis());
    }

    public static /* synthetic */ ScaleConfig initFemaleHealthSymptomChart$default(ChartHelper chartHelper, BarChart barChart, SymptomType symptomType, List list, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = RTLHelper.INSTANCE.isRTL(barChart.getContext());
        }
        return chartHelper.initFemaleHealthSymptomChart(barChart, symptomType, list, z);
    }

    @NotNull
    public final List<SymptomVo> fillSymptomListIfNecessary(@NotNull List<SymptomVo> symptomVoList, long start, long end, @NotNull SymptomType type) {
        int i;
        Object next;
        HMLog.info("xys_ChartHelper", new c(symptomVoList, start, end, type));
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(symptomVoList);
        long jResetZeroHour = AidKt.resetZeroHour(end);
        DateHelper dateHelper = DateHelper.INSTANCE;
        int iDaysBetween = dateHelper.daysBetween(new Date(start), new Date(Math.min(jResetZeroHour, AidKt.resetZeroHour(dateHelper.today().getTimeInMillis()))));
        if (1 <= iDaysBetween) {
            int i2 = 1;
            i = 0;
            while (true) {
                int i3 = i2 + 1;
                i++;
                long time = AidKt.toDate(DateHelper.INSTANCE.offsetDay(i2, start)).getTime();
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!(AidKt.resetZeroHour(((SymptomVo) next).getDate()) == AidKt.resetZeroHour(time)));
                if (next == null) {
                    arrayList.add(new SymptomVo(Degree.UNSPECIFIED, type, time));
                }
                if (i2 == iDaysBetween) {
                    break;
                }
                i2 = i3;
            }
        } else {
            i = 0;
        }
        HMLog.info("xys_ChartHelper", new d(arrayList));
        return CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.huami.femalehealth.uilib.helper.ChartHelper$fillSymptomListIfNecessary$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SymptomVo) t).getDate()), Long.valueOf(((SymptomVo) t2).getDate()));
            }
        }).subList(0, i);
    }

    @NotNull
    public final String formatDateMonthAndDay(long time) {
        return NumberExtKt.dateFormat(time, ResourceHelper.INSTANCE.getString(R.string.date_Md_pattern));
    }

    @NotNull
    public final String formatHistoryCardDate(@NotNull Date start, @NotNull Date end) {
        int iDaysBetween = DateHelper.INSTANCE.daysBetween(start, end);
        StringBuilder sb = new StringBuilder();
        long time = start.getTime();
        ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
        int i = R.string.fh_time_format;
        sb.append(NumberExtKt.dateFormat(time, resourceHelper.getString(i)));
        sb.append('-');
        sb.append(NumberExtKt.dateFormat(end.getTime(), resourceHelper.getString(i)));
        sb.append('(');
        Resources resources = resourceHelper.getResources();
        sb.append((Object) (resources == null ? null : resources.getQuantityString(R.plurals.fh_time_day_var, iDaysBetween, Integer.valueOf(iDaysBetween))));
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public final String getSymptomName(@NotNull SymptomType type) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return ResourceHelper.INSTANCE.getString(R.string.fh_symptom_name_blood);
        }
        if (i == 2) {
            return ResourceHelper.INSTANCE.getString(R.string.fh_symptom_name_mood);
        }
        if (i == 3) {
            return ResourceHelper.INSTANCE.getString(R.string.fh_symptom_name_pain);
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final ScaleConfig initFemaleHealthSymptomChart(@NotNull BarChart chart, @NotNull SymptomType symptomType, @NotNull List<SymptomVo> symptomVoList, boolean isRTL) {
        YAxis axisLeft;
        if (isRTL) {
            symptomVoList = CollectionsKt___CollectionsKt.reversed(symptomVoList);
        }
        int size = symptomVoList.size();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = symptomVoList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((SymptomVo) next).getDegree() == Degree.UNSPECIFIED) {
                arrayList.add(next);
            }
        }
        boolean z = arrayList.size() == symptomVoList.size();
        BarChartStyle barChartStyleC = c(symptomType, chart);
        chart.getDescription().setEnabled(false);
        chart.setPinchZoom(false);
        chart.setTouchEnabled(true);
        chart.setDragEnabled(true);
        chart.setScaleEnabled(false);
        chart.setDrawBarShadow(false);
        chart.setDrawGridBackground(false);
        chart.getLegend().setEnabled(false);
        chart.setFitBars(false);
        if (chart instanceof FHBarChart) {
            FHBarChart fHBarChart = (FHBarChart) chart;
            fHBarChart.setEmpty(z);
            fHBarChart.setEmptyText(ResourceHelper.INSTANCE.getString(R.string.fh_no_record));
        }
        Paint paint = chart.getPaint(7);
        paint.setTextSize(com.huami.femalehealth.uilib.widget.ExtKt.dpToPx(chart, 12.0f));
        paint.setColor(com.huami.femalehealth.uilib.widget.ExtKt.getResColor(chart.getContext(), R.color.fh_black_alpha_40));
        chart.setRenderer(new RoundedBarChartRenderer(chart, chart.getAnimator(), chart.getViewPortHandler(), (int) ResourceHelper.INSTANCE.getDimen(R.dimen.fh_chart_bar_round_corner_radius)));
        chart.setRendererLeftYAxis(new HideBottomLineYAxisRender(chart, chart.getAxisLeft()));
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : symptomVoList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            SymptomVo symptomVo = (SymptomVo) obj;
            arrayList2.add(new BarEntry(i, symptomVo.getDegree().getValue(), symptomVo));
            i = i2;
        }
        BarDataSet barDataSet = new BarDataSet(arrayList2, "symptoms");
        barDataSet.setColor(barChartStyleC.getBarColor());
        barDataSet.setHighLightColor(barChartStyleC.getBarColor());
        barDataSet.setDrawValues(false);
        chart.setData(new BarData(barDataSet));
        XAxis xAxis = chart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(true);
        Context context = chart.getContext();
        int i3 = R.color.fh_chart_x_axis_color;
        xAxis.setTextColor(com.huami.femalehealth.uilib.widget.ExtKt.getResColor(context, i3));
        xAxis.setTextSize(10.0f);
        xAxis.setAxisLineColor(com.huami.femalehealth.uilib.widget.ExtKt.getResColor(chart.getContext(), i3));
        xAxis.setAxisLineWidth(1.0f);
        xAxis.setLabelCount(size, false);
        xAxis.setGranularity(1.0f);
        xAxis.setValueFormatter(new XAxisValueFormatter(arrayList2));
        if (isRTL) {
            chart.getAxisLeft().setAxisMinimum(0.0f);
            chart.getAxisLeft().setAxisMaximum(SymptomType.values().length);
            chart.getAxisLeft().setSpaceMin(1.0f);
            chart.getAxisLeft().setEnabled(false);
            axisLeft = chart.getAxisRight();
        } else {
            chart.getAxisRight().setEnabled(false);
            axisLeft = chart.getAxisLeft();
        }
        if (z) {
            axisLeft.setDrawGridLines(false);
        } else {
            axisLeft.setDrawGridLines(true);
            axisLeft.enableGridDashedLine(10.0f, 10.0f, 0.0f);
            axisLeft.setDrawGridLinesBehindData(true);
        }
        axisLeft.setGridLineWidth(0.6f);
        axisLeft.setGridColor(com.huami.femalehealth.uilib.widget.ExtKt.getResColor(chart.getContext(), R.color.s3));
        axisLeft.setDrawZeroLine(false);
        axisLeft.setValueFormatter(new YAxisValueFormatter(symptomType));
        axisLeft.setAxisMinimum(0.0f);
        axisLeft.setAxisMaximum(SymptomType.values().length);
        axisLeft.setSpaceMin(1.0f);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setLabelCount(SymptomType.values().length + 1, true);
        axisLeft.setTextColor(com.huami.femalehealth.uilib.widget.ExtKt.getResColor(chart.getContext(), R.color.s2));
        axisLeft.setTextSize(11.0f);
        if (isRTL) {
            chart.moveViewToX(size);
        }
        ScaleConfig scaleConfigB = b(barChartStyleC.getBarChartWidthPx(), barChartStyleC.getMinSpacePx(), barChartStyleC.getBarWidthPx(), size);
        if (scaleConfigB.getScaleTimes() > 1.0f) {
            chart.setOnTouchListener((ChartTouchListener) new BarLineChartTouchListener(chart.getViewPortHandler().getMatrixTouch()) { // from class: com.huami.femalehealth.uilib.helper.ChartHelper.initFemaleHealthSymptomChart.3
                {
                    super(this.o, matrix, 3.0f);
                }

                @Override // com.github.mikephil.charting.listener.BarLineChartTouchListener, android.view.View.OnTouchListener
                @SuppressLint({"ClickableViewAccessibility"})
                public boolean onTouch(@NotNull View v, @NotNull MotionEvent event) {
                    int action = event.getAction();
                    if (action == 0) {
                        v.getParent().requestDisallowInterceptTouchEvent(true);
                        return super.onTouch(v, event);
                    }
                    if (action == 1) {
                        v.getParent().requestDisallowInterceptTouchEvent(false);
                        return super.onTouch(v, event);
                    }
                    if (action != 2) {
                        return super.onTouch(v, event);
                    }
                    v.getParent().requestDisallowInterceptTouchEvent(true);
                    return super.onTouch(v, event);
                }
            });
        }
        HMLog.info("xys_ChartHelper", new f(scaleConfigB, size, z));
        return scaleConfigB;
    }

    @NotNull
    public final List<SymptomVo> randomTestData(int count) {
        ArrayList arrayList = new ArrayList();
        if (count > 0) {
            int i = 0;
            do {
                i++;
                arrayList.add(e());
            } while (i < count);
        }
        return arrayList;
    }

    public final void resetChart(@NotNull BarChart chart) {
        chart.clear();
        chart.getAxisLeft().setDrawGridLines(false);
        chart.setFitBars(true);
        chart.fitScreen();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void scaleHorizontally(@NotNull BarChart chart, @Nullable ScaleConfig scaleConfig, boolean invalidate) {
        Matrix matrix = new Matrix();
        if (scaleConfig != null) {
            ((BarData) chart.getData()).setBarWidth(scaleConfig.getBarWidth());
            matrix.postScale(scaleConfig.getScaleTimes(), 1.0f);
        }
        chart.getViewPortHandler().refresh(matrix, chart, invalidate);
    }
}
