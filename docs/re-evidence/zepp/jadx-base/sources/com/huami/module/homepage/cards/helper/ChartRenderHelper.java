package com.huami.module.homepage.cards.helper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.GoalLineStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.femalehealth.uilib.helper.ChartHelper;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.helper.ChartRenderHelper;
import com.huami.module.ktx.ContextExtKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.TimeExtKt;
import com.huami.tools.analytics.DbUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/module/homepage/cards/helper/ChartRenderHelper;", "", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "date", "", "b", "Landroid/widget/FrameLayout;", "container", "Lcom/huami/module/homepage/cards/helper/CurveGraphParam;", "param", "", "renderCurveChart", "", "getLatest7DaysDateXLabels", "", "a", LogUtil.I, "ONE_WEEK_DAYS", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class ChartRenderHelper {

    @NotNull
    public static final ChartRenderHelper INSTANCE = new ChartRenderHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int ONE_WEEK_DAYS = 7;

    private ChartRenderHelper() {
    }

    private final String b(Context context, long date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date);
        if (TimeExtKt.isToday(calendar.getTimeInMillis())) {
            return context.getString(R.string.homepage_item_card_today_simple);
        }
        return new SimpleDateFormat(calendar.get(5) == 1 ? ChartHelper.FMT_MM_DD : "dd", Locale.getDefault()).format(calendar.getTime());
    }

    private final float c(View view) {
        int measuredWidth = view.getMeasuredWidth();
        int width = view.getWidth();
        if (measuredWidth == 0) {
            return width != 0 ? width : Resources.getSystem().getDisplayMetrics().widthPixels - NumberExtKt.getDp(20.0f);
        }
        return measuredWidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(FrameLayout frameLayout, CurveGraphParam curveGraphParam, Context context, int i, int i2) {
        int i3 = R.id.homepage_cards_vertical_lines;
        View view = (LinearLayout) frameLayout.findViewById(i3);
        if (view != null) {
            frameLayout.removeView(view);
        }
        if (curveGraphParam.getVerticalLineCount() <= 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(i3);
        Integer verticalLineHeight = curveGraphParam.getVerticalLineHeight();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, verticalLineHeight == null ? -1 : verticalLineHeight.intValue());
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(i2);
        Unit unit = Unit.INSTANCE;
        frameLayout.addView(linearLayout, layoutParams);
        int verticalLineCount = curveGraphParam.getVerticalLineCount();
        if (1 > verticalLineCount) {
            return;
        }
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            View view2 = new View(context);
            view2.setBackgroundColor(Color.parseColor("#08000000"));
            linearLayout.addView(view2, new LinearLayout.LayoutParams(NumberExtKt.getDp(1), -1));
            if (i4 < curveGraphParam.getVerticalLineCount()) {
                linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(0, -1, 1.0f));
            }
            if (i4 == verticalLineCount) {
                return;
            } else {
                i4 = i5;
            }
        }
    }

    @NotNull
    public final List<String> getLatest7DaysDateXLabels(@NotNull Context context) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        for (int i = 0; i < 7; i++) {
            arrayList.add(INSTANCE.b(context, calendar.getTimeInMillis()));
            calendar.add(6, -1);
        }
        return CollectionsKt___CollectionsKt.reversed(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004a A[PHI: r1
      0x004a: PHI (r1v1 java.lang.Float) = (r1v0 java.lang.Float), (r1v21 java.lang.Float) binds: [B:3:0x0014, B:9:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100 A[LOOP:3: B:45:0x00fa->B:47:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc A[SYNTHETIC] */
    public final void renderCurveChart(@NotNull final FrameLayout container, @NotNull final CurveGraphParam param) {
        final float fFloatValue;
        float fFloatValue2;
        final float f;
        final SparseArray sparseArray;
        final SparseArray sparseArray2;
        float value;
        float f2;
        boolean z;
        final Context context = container.getContext();
        final float fC = c(container);
        ChartProvider chartProvider = new ChartProvider(context, true);
        Float maxValue = param.getMaxValue();
        if (maxValue == null) {
            List<CurveChartPoint> points = param.getPoints();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(points, 10));
            Iterator<T> it2 = points.iterator();
            while (it2.hasNext()) {
                arrayList.add(Float.valueOf(((CurveChartPoint) it2.next()).getValue()));
            }
            maxValue = CollectionsKt___CollectionsKt.m3963maxOrNull((Iterable<Float>) arrayList);
            if (maxValue == null) {
                fFloatValue = 230.0f;
            } else {
                fFloatValue = maxValue.floatValue();
            }
        } else {
            fFloatValue = maxValue.floatValue();
        }
        Float minValue = param.getMinValue();
        if (minValue == null) {
            List<CurveChartPoint> points2 = param.getPoints();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(points2, 10));
            Iterator<T> it3 = points2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Float.valueOf(((CurveChartPoint) it3.next()).getValue()));
            }
            Float fM3967minOrNull = CollectionsKt___CollectionsKt.m3967minOrNull((Iterable<Float>) arrayList2);
            if (fM3967minOrNull == null) {
                f = 0.0f;
            } else {
                fFloatValue2 = fM3967minOrNull.floatValue();
                if (fFloatValue2 == fFloatValue) {
                    fFloatValue2 = 0.0f;
                }
            }
            sparseArray = new SparseArray();
            for (CurveChartPoint curveChartPoint : param.getPoints()) {
                if (param.getKeepMinimumHeight()) {
                    value = (fFloatValue + f) / 2;
                    f2 = fFloatValue - f;
                    if (f2 == 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        value += (fFloatValue - value) * ((curveChartPoint.getValue() - f) / f2);
                    }
                } else {
                    value = curveChartPoint.getValue();
                }
                sparseArray.put(curveChartPoint.getIndex(), new ChartData(curveChartPoint.getIndex(), value));
            }
            sparseArray2 = new SparseArray();
            for (XLabel xLabel : param.getXLabels()) {
                sparseArray2.put(xLabel.getIndex(), new XAxisData(xLabel.getIndex(), xLabel.getLabel()));
            }
            final int dp = NumberExtKt.getDp(15);
            final int dp2 = NumberExtKt.getDp(15);
            chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.module.homepage.cards.helper.ChartRenderHelper.renderCurveChart.2
                @Override // com.huami.chart.chart.IChartProvider
                @NotNull
                /* JADX INFO: renamed from: getChartContainer */
                public ViewGroup getE() {
                    return container;
                }

                @Override // com.huami.chart.chart.IChartProvider
                @NotNull
                /* JADX INFO: renamed from: getChartDataList */
                public ChartDataList getF() {
                    List<XLabel> xLabels = param.getXLabels();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(xLabels, 10));
                    Iterator<T> it4 = xLabels.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(Integer.valueOf(((XLabel) it4.next()).getIndex()));
                    }
                    Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList3);
                    int iIntValue = num == null ? 0 : num.intValue();
                    List<CurveChartPoint> points3 = param.getPoints();
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(points3, 10));
                    Iterator<T> it5 = points3.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(Integer.valueOf(((CurveChartPoint) it5.next()).getIndex()));
                    }
                    Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList4);
                    int iIntValue2 = num2 == null ? 0 : num2.intValue();
                    List<XLabel> xLabels2 = param.getXLabels();
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(xLabels2, 10));
                    Iterator<T> it6 = xLabels2.iterator();
                    while (it6.hasNext()) {
                        arrayList5.add(Integer.valueOf(((XLabel) it6.next()).getIndex()));
                    }
                    Integer num3 = (Integer) CollectionsKt.minOrNull((Iterable) arrayList5);
                    int iIntValue3 = num3 == null ? -1 : num3.intValue();
                    List<CurveChartPoint> points4 = param.getPoints();
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(points4, 10));
                    Iterator<T> it7 = points4.iterator();
                    while (it7.hasNext()) {
                        arrayList6.add(Integer.valueOf(((CurveChartPoint) it7.next()).getIndex()));
                    }
                    Integer num4 = (Integer) CollectionsKt.minOrNull((Iterable) arrayList6);
                    Integer numValueOf = Integer.valueOf(Math.min(iIntValue3, num4 == null ? -1 : num4.intValue()));
                    if (!(numValueOf.intValue() != -1)) {
                        numValueOf = null;
                    }
                    int iIntValue4 = numValueOf != null ? numValueOf.intValue() : 0;
                    ChartDataList chartDataList = new ChartDataList(sparseArray);
                    float f3 = fFloatValue;
                    float f4 = f;
                    chartDataList.setStart(iIntValue4);
                    chartDataList.setEnd(Math.max(iIntValue, iIntValue2));
                    chartDataList.setMaxValue(f3);
                    chartDataList.setMinValue(f4);
                    return chartDataList;
                }

                @Override // com.huami.chart.chart.IChartProvider
                @NotNull
                public DrawConfig getDrawConfig() {
                    DrawConfig.Builder canvasWidth = new DrawConfig.Builder(context).setDataMarginTop(NumberExtKt.getDp(8.0f)).setDataMarginLeft(dp).setDataMarginRight(dp2).setCanvasWidth(fC);
                    Integer verticalLineHeight = param.getVerticalLineHeight();
                    Float fValueOf = verticalLineHeight == null ? null : Float.valueOf(verticalLineHeight.intValue());
                    return canvasWidth.setCanvasHeight(fValueOf == null ? NumberExtKt.getDp(80.0f) : fValueOf.floatValue()).create();
                }

                @Override // com.huami.chart.chart.IChartProvider
                @NotNull
                public RenderConfig getRenderConfig() {
                    RenderConfig.Builder builder = new RenderConfig.Builder();
                    LineStyle.Builder shadowColors = new LineStyle.Builder(context).setLineStyle(param.getLineStyle()).setLineWidth(NumberExtKt.getDp(1.5f)).setLineColor(param.getLineColor()).setShadowColors(new int[]{param.getGradientStartColor(), param.getGradientEndColor()});
                    CurveGraphParam curveGraphParam = param;
                    if (!curveGraphParam.getSubIndex().isEmpty()) {
                        LineStyle.Builder subIndex = shadowColors.setSubIndex(new ArrayList<>(curveGraphParam.getSubIndex()));
                        Integer subLineColor = curveGraphParam.getSubLineColor();
                        LineStyle.Builder subLinecolor = subIndex.setSubLinecolor(subLineColor == null ? Color.parseColor("#334a8dff") : subLineColor.intValue());
                        List<Integer> subLineShaderColors = curveGraphParam.getSubLineShaderColors();
                        int[] intArray = subLineShaderColors == null ? null : CollectionsKt___CollectionsKt.toIntArray(subLineShaderColors);
                        if (intArray == null) {
                            intArray = new int[]{Color.parseColor("#334a8dff"), 0};
                        }
                        subLinecolor.setSubShadowColors(intArray).setShadowBeforeIndex(false);
                    }
                    List<Integer> lineVerticalGradientStartColor = curveGraphParam.getLineVerticalGradientStartColor();
                    if (lineVerticalGradientStartColor != null) {
                        Float maxValue2 = curveGraphParam.getMaxValue();
                        float fFloatValue3 = maxValue2 == null ? 1.0f : maxValue2.floatValue();
                        Float minValue2 = curveGraphParam.getMinValue();
                        float fFloatValue4 = minValue2 == null ? 1.0f : minValue2.floatValue();
                        float dp3 = NumberExtKt.getDp(60.0f) / fFloatValue3;
                        if (!(dp3 == 0.0f)) {
                            shadowColors.setLineShader(new LinearGradient(0.0f, 0.0f, 0.0f, NumberExtKt.getDp(60.0f) - (fFloatValue4 * dp3), CollectionsKt___CollectionsKt.toIntArray(lineVerticalGradientStartColor), (float[]) null, Shader.TileMode.CLAMP));
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    return builder.setLineStyle(shadowColors.create()).setGoalLineStyle(new GoalLineStyle.Builder(context).setGoals(CollectionsKt___CollectionsKt.toFloatArray(param.getGoalLines())).setGoalLineStyle(2).setGoalLineMarginStart(dp).setGoalLineMarginEnd(dp2).setDashLineInterval(new float[]{12.0f, 7.0f}).setGoalLineColor(new int[]{ContextExtKt.loadColor(context, R.color.s3)}).setGoalLineWidth(ChartUtil.dp2px(context, 1.0f)).create()).setAxisStyle(new AxisStyle.Builder(context).setAxisStyle(32).setXLabelColor(ContextExtKt.loadColor(context, R.color.s2)).setXLabelMarginTop(NumberExtKt.getDp(5.0f)).setXAxisData(sparseArray2).setIndentHeadAndTail(true).setXLabelSize(NumberExtKt.getSp(12.0f)).setXAxisMarginLeft(dp).setXAxisMarginRight(dp2).create()).create();
                }
            }, false, false, false);
            container.post(new Runnable() { // from class: zn0
                @Override // java.lang.Runnable
                public final void run() {
                    ChartRenderHelper.d(container, param, context, dp, dp2);
                }
            });
        }
        fFloatValue2 = minValue.floatValue();
        f = fFloatValue2;
        sparseArray = new SparseArray();
        while (r1.hasNext()) {
            if (param.getKeepMinimumHeight()) {
                value = (fFloatValue + f) / 2;
                f2 = fFloatValue - f;
                if (f2 == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    value += (fFloatValue - value) * ((curveChartPoint.getValue() - f) / f2);
                }
            } else {
                value = curveChartPoint.getValue();
            }
            sparseArray.put(curveChartPoint.getIndex(), new ChartData(curveChartPoint.getIndex(), value));
        }
        sparseArray2 = new SparseArray();
        while (r0.hasNext()) {
            sparseArray2.put(xLabel.getIndex(), new XAxisData(xLabel.getIndex(), xLabel.getLabel()));
        }
        final int dp3 = NumberExtKt.getDp(15);
        final int dp4 = NumberExtKt.getDp(15);
        chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.module.homepage.cards.helper.ChartRenderHelper.renderCurveChart.2
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer */
            public ViewGroup getE() {
                return container;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList */
            public ChartDataList getF() {
                List<XLabel> xLabels = param.getXLabels();
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(xLabels, 10));
                Iterator<T> it4 = xLabels.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(Integer.valueOf(((XLabel) it4.next()).getIndex()));
                }
                Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList3);
                int iIntValue = num == null ? 0 : num.intValue();
                List<CurveChartPoint> points3 = param.getPoints();
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(points3, 10));
                Iterator<T> it5 = points3.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(Integer.valueOf(((CurveChartPoint) it5.next()).getIndex()));
                }
                Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList4);
                int iIntValue2 = num2 == null ? 0 : num2.intValue();
                List<XLabel> xLabels2 = param.getXLabels();
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(xLabels2, 10));
                Iterator<T> it6 = xLabels2.iterator();
                while (it6.hasNext()) {
                    arrayList5.add(Integer.valueOf(((XLabel) it6.next()).getIndex()));
                }
                Integer num3 = (Integer) CollectionsKt.minOrNull((Iterable) arrayList5);
                int iIntValue3 = num3 == null ? -1 : num3.intValue();
                List<CurveChartPoint> points4 = param.getPoints();
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(points4, 10));
                Iterator<T> it7 = points4.iterator();
                while (it7.hasNext()) {
                    arrayList6.add(Integer.valueOf(((CurveChartPoint) it7.next()).getIndex()));
                }
                Integer num4 = (Integer) CollectionsKt.minOrNull((Iterable) arrayList6);
                Integer numValueOf = Integer.valueOf(Math.min(iIntValue3, num4 == null ? -1 : num4.intValue()));
                if (!(numValueOf.intValue() != -1)) {
                    numValueOf = null;
                }
                int iIntValue4 = numValueOf != null ? numValueOf.intValue() : 0;
                ChartDataList chartDataList = new ChartDataList(sparseArray);
                float f3 = fFloatValue;
                float f4 = f;
                chartDataList.setStart(iIntValue4);
                chartDataList.setEnd(Math.max(iIntValue, iIntValue2));
                chartDataList.setMaxValue(f3);
                chartDataList.setMinValue(f4);
                return chartDataList;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                DrawConfig.Builder canvasWidth = new DrawConfig.Builder(context).setDataMarginTop(NumberExtKt.getDp(8.0f)).setDataMarginLeft(dp3).setDataMarginRight(dp4).setCanvasWidth(fC);
                Integer verticalLineHeight = param.getVerticalLineHeight();
                Float fValueOf = verticalLineHeight == null ? null : Float.valueOf(verticalLineHeight.intValue());
                return canvasWidth.setCanvasHeight(fValueOf == null ? NumberExtKt.getDp(80.0f) : fValueOf.floatValue()).create();
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                RenderConfig.Builder builder = new RenderConfig.Builder();
                LineStyle.Builder shadowColors = new LineStyle.Builder(context).setLineStyle(param.getLineStyle()).setLineWidth(NumberExtKt.getDp(1.5f)).setLineColor(param.getLineColor()).setShadowColors(new int[]{param.getGradientStartColor(), param.getGradientEndColor()});
                CurveGraphParam curveGraphParam = param;
                if (!curveGraphParam.getSubIndex().isEmpty()) {
                    LineStyle.Builder subIndex = shadowColors.setSubIndex(new ArrayList<>(curveGraphParam.getSubIndex()));
                    Integer subLineColor = curveGraphParam.getSubLineColor();
                    LineStyle.Builder subLinecolor = subIndex.setSubLinecolor(subLineColor == null ? Color.parseColor("#334a8dff") : subLineColor.intValue());
                    List<Integer> subLineShaderColors = curveGraphParam.getSubLineShaderColors();
                    int[] intArray = subLineShaderColors == null ? null : CollectionsKt___CollectionsKt.toIntArray(subLineShaderColors);
                    if (intArray == null) {
                        intArray = new int[]{Color.parseColor("#334a8dff"), 0};
                    }
                    subLinecolor.setSubShadowColors(intArray).setShadowBeforeIndex(false);
                }
                List<Integer> lineVerticalGradientStartColor = curveGraphParam.getLineVerticalGradientStartColor();
                if (lineVerticalGradientStartColor != null) {
                    Float maxValue2 = curveGraphParam.getMaxValue();
                    float fFloatValue3 = maxValue2 == null ? 1.0f : maxValue2.floatValue();
                    Float minValue2 = curveGraphParam.getMinValue();
                    float fFloatValue4 = minValue2 == null ? 1.0f : minValue2.floatValue();
                    float dp5 = NumberExtKt.getDp(60.0f) / fFloatValue3;
                    if (!(dp5 == 0.0f)) {
                        shadowColors.setLineShader(new LinearGradient(0.0f, 0.0f, 0.0f, NumberExtKt.getDp(60.0f) - (fFloatValue4 * dp5), CollectionsKt___CollectionsKt.toIntArray(lineVerticalGradientStartColor), (float[]) null, Shader.TileMode.CLAMP));
                    }
                }
                Unit unit = Unit.INSTANCE;
                return builder.setLineStyle(shadowColors.create()).setGoalLineStyle(new GoalLineStyle.Builder(context).setGoals(CollectionsKt___CollectionsKt.toFloatArray(param.getGoalLines())).setGoalLineStyle(2).setGoalLineMarginStart(dp3).setGoalLineMarginEnd(dp4).setDashLineInterval(new float[]{12.0f, 7.0f}).setGoalLineColor(new int[]{ContextExtKt.loadColor(context, R.color.s3)}).setGoalLineWidth(ChartUtil.dp2px(context, 1.0f)).create()).setAxisStyle(new AxisStyle.Builder(context).setAxisStyle(32).setXLabelColor(ContextExtKt.loadColor(context, R.color.s2)).setXLabelMarginTop(NumberExtKt.getDp(5.0f)).setXAxisData(sparseArray2).setIndentHeadAndTail(true).setXLabelSize(NumberExtKt.getSp(12.0f)).setXAxisMarginLeft(dp3).setXAxisMarginRight(dp4).create()).create();
            }
        }, false, false, false);
        container.post(new Runnable() { // from class: zn0
            @Override // java.lang.Runnable
            public final void run() {
                ChartRenderHelper.d(container, param, context, dp3, dp4);
            }
        });
    }
}
