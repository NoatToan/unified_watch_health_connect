package com.xiaomi.fitness.chart.mpchart.linechart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.util.AttributeSet;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.LineDataSet;
import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.ae5;
import defpackage.aji;
import defpackage.bge;
import defpackage.crr;
import defpackage.dn5;
import defpackage.du3;
import defpackage.fmq;
import defpackage.hfp;
import defpackage.hrr;
import defpackage.ic8;
import defpackage.ifp;
import defpackage.ni4;
import defpackage.p6o;
import defpackage.q6o;
import defpackage.qd5;
import defpackage.qzi;
import defpackage.ttr;
import defpackage.x44;
import defpackage.xd5;
import defpackage.yd5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 o2\u00020\u0001:\u0001oB'\b\u0017\u0012\u0006\u0010i\u001a\u00020[\u0012\n\b\u0002\u0010k\u001a\u0004\u0018\u00010j\u0012\b\b\u0002\u0010l\u001a\u00020\u0006¢\u0006\u0004\bm\u0010nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ)\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0014¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u0002H\u0014¢\u0006\u0004\b'\u0010\u0004J\u001d\u0010,\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\u00020\u00022\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u0006¢\u0006\u0004\b7\u00108J/\u0010<\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020\f2\b\b\u0002\u0010;\u001a\u00020\f¢\u0006\u0004\b<\u0010=J'\u0010<\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010:\u001a\u00020\f2\b\b\u0002\u0010;\u001a\u00020\f¢\u0006\u0004\b<\u0010>J\u001b\u0010?\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b?\u0010@J\u001b\u0010A\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\bA\u0010@J\u001b\u0010B\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\bB\u0010@J\u001b\u0010C\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\bC\u0010@J3\u0010F\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010;\u001a\u00020\f2\u0006\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\f¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\bH\u0010@J\u001b\u0010I\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\bI\u0010@J\u001d\u0010J\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010\nJO\u0010O\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010L\u001a\u0004\u0018\u00010K2\b\b\u0002\u0010\u0019\u001a\u00020\f2\u0012\b\u0002\u0010M\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00162\b\b\u0002\u0010N\u001a\u00020\u0006H\u0007¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\"H\u0014¢\u0006\u0004\bR\u0010%J\u0017\u0010S\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\bS\u0010%R\"\u0010U\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010\\\u001a\u00020[8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\bb\u0010cR$\u0010d\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u00101¨\u0006p"}, d2 = {"Lcom/xiaomi/fitness/chart/mpchart/linechart/CustomLineChart;", "Lcom/github/mikephil/charting/charts/LineChart;", "", "setLineChartAttr", "()V", "initLineChart", "", "lineColor", "txtColor", "setXY", "(II)V", "updateXAxis", "", "limitValue", "limitColor", "Lcom/github/mikephil/charting/components/LimitLine$LimitLabelPosition;", "position", "setLimitLineInner", "(FILcom/github/mikephil/charting/components/LimitLine$LimitLabelPosition;)V", "range", "getLimitLabelPosition", "(FF)Lcom/github/mikephil/charting/components/LimitLine$LimitLabelPosition;", "", "Lcom/xiaomi/fitness/chart/entrys/SportRecordEntry;", Constants.KEY_RECHARGE_VALUES, "restrictMax", "setYAxisMaxMinimum", "(Ljava/util/List;F)V", "Lcom/github/mikephil/charting/data/LineDataSet;", "set1", "drawableResource", "fillColorResource", "setFill", "(Lcom/github/mikephil/charting/data/LineDataSet;II)V", "Landroid/graphics/Canvas;", "canvas", "drawStartEndPointIfNeed", "(Landroid/graphics/Canvas;)V", "onFinishInflate", "init", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcrr;", "xAxisRenderer", "customXAxis", "(Lcom/github/mikephil/charting/components/XAxis;Lcrr;)V", "", "maxStr", "setMaxStr", "(Ljava/lang/String;)V", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "chartKey", "setChartKey", "(Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;)V", "limitTextColor", "setLimitLineTextColor", "(I)V", "str", "valueRange", Constants.KEY_RECHARGE_MINVALUE, "setLimitLine", "(FLjava/lang/String;FF)V", "(FFF)V", "bindStepRepData", "(Ljava/util/List;)V", "bindStepLengthData", "bindStepDownData", "bindSportOneLevelData", "midValue", Constants.KEY_RECHARGE_MAXVALUE, "bindSportLevelData", "(Ljava/util/List;FFF)V", "bindStepDownUpData", "bindSkippingHeightData", "setYAxisMinMaxValue", "Lcom/github/mikephil/charting/data/LineDataSet$Mode;", "model", "colorList", "duration", "bindData", "(Ljava/util/List;Lcom/github/mikephil/charting/data/LineDataSet$Mode;FLjava/util/List;I)V", PluginDeviceInfo.FICONON, "drawGridBackground", "onDraw", "Lxd5;", "mLineChartAttr", "Lxd5;", "getMLineChartAttr", "()Lxd5;", "setMLineChartAttr", "(Lxd5;)V", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "yAxisMin", "F", "mMaxStr", "Ljava/lang/String;", "getMMaxStr", "()Ljava/lang/String;", "setMMaxStr", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "chart_release"}, k = 1, mv = {2, 0, 0})
public class CustomLineChart extends LineChart {

    @NotNull
    private static final String TAG = "CustomLineChart";
    protected Context mContext;

    @NotNull
    private xd5 mLineChartAttr;

    @Nullable
    private String mMaxStr;
    private final float yAxisMin;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomLineChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bindData$default(CustomLineChart customLineChart, List list, LineDataSet.Mode mode, float f, List list2, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindData");
        }
        if ((i2 & 4) != 0) {
            f = -1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i2 & 16) != 0) {
            i = 0;
        }
        customLineChart.bindData(list, mode, f2, list3, i);
    }

    private final void drawStartEndPointIfNeed(Canvas canvas) {
        T t;
        if (this.mLineChartAttr.z && (this.mRenderer instanceof yd5) && (t = this.mData) != 0) {
            for (T t2 : ((bge) t).l()) {
                if (t2.isVisible()) {
                    dn5 dn5Var = this.mRenderer;
                    Intrinsics.checkNotNull(dn5Var, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChartRenderer");
                    ((yd5) dn5Var).k(canvas, t2);
                }
            }
        }
    }

    private final LimitLine.LimitLabelPosition getLimitLabelPosition(float limitValue, float range) {
        if (AppUtil.isRTLDirection()) {
            if (range != 0.0f && (limitValue * 100) / range >= 10.0f) {
                return LimitLine.LimitLabelPosition.LEFT_BOTTOM;
            }
            return LimitLine.LimitLabelPosition.LEFT_TOP;
        }
        if (range != 0.0f && (limitValue * 100) / range >= 10.0f) {
            return LimitLine.LimitLabelPosition.RIGHT_BOTTOM;
        }
        return LimitLine.LimitLabelPosition.RIGHT_TOP;
    }

    private final void initLineChart() {
        setMinOffset(0.0f);
        setExtraOffsets(this.mLineChartAttr.z ? 6.0f : 0.0f, 4.0f, 0.0f, 12.0f);
        setDrawGridBackground(false);
        getDescription().setEnabled(false);
        setTouchEnabled(true);
        int iA = x44.a(aji.g0);
        int iA2 = x44.a(aji.h0);
        setDrawBorders(false);
        setBorderColor(iA);
        setBorderWidth(0.5f);
        setDragEnabled(false);
        setScaleEnabled(false);
        setScaleYEnabled(false);
        setPinchZoom(true);
        setDrawMarkers(false);
        setNoDataText(getMContext().getString(qzi.common_data_empty));
        getLegend().setEnabled(false);
        setXY(iA, iA2);
    }

    private final void setFill(LineDataSet set1, int drawableResource, int fillColorResource) {
        if (fmq.s() >= 18) {
            set1.r1(ni4.e(getMContext(), drawableResource));
        } else {
            set1.q1(ni4.c(getMContext(), fillColorResource));
        }
    }

    public static /* synthetic */ void setLimitLine$default(CustomLineChart customLineChart, float f, String str, float f2, float f3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLimitLine");
        }
        if ((i & 8) != 0) {
            f3 = 0.0f;
        }
        customLineChart.setLimitLine(f, str, f2, f3);
    }

    private final void setLimitLineInner(float limitValue, int limitColor, LimitLine.LimitLabelPosition position) {
        if (AppUtil.isRTLDirection()) {
            YAxis yAxis = this.mAxisLeft;
            Intrinsics.checkNotNull(yAxis, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.SportYAxis");
            ((p6o) yAxis).E(limitValue, limitColor, position);
        } else {
            YAxis yAxis2 = this.mAxisRight;
            Intrinsics.checkNotNull(yAxis2, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.SportYAxis");
            ((p6o) yAxis2).E(limitValue, limitColor, position);
        }
    }

    private final void setLineChartAttr() {
        ttr ttrVar = this.mAxisRendererRight;
        Intrinsics.checkNotNull(ttrVar, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.SportYAxisRenderer");
        ((q6o) ttrVar).d(this.mLineChartAttr);
        ttr ttrVar2 = this.mAxisRendererLeft;
        Intrinsics.checkNotNull(ttrVar2, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.SportYAxisRenderer");
        ((q6o) ttrVar2).d(this.mLineChartAttr);
        dn5 dn5Var = this.mRenderer;
        Intrinsics.checkNotNull(dn5Var, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChartRenderer");
        ((yd5) dn5Var).m(this.mLineChartAttr);
        dn5 dn5Var2 = this.mRenderer;
        Intrinsics.checkNotNull(dn5Var2, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChartRenderer");
        ((yd5) dn5Var2).n(this.mMaxStr);
        crr crrVar = this.mXAxisRenderer;
        if (crrVar instanceof ifp) {
            Intrinsics.checkNotNull(crrVar, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.TimeXAxisRenderer");
            ((ifp) crrVar).a(this.mLineChartAttr);
        }
        YAxis yAxis = this.mAxisRight;
        Intrinsics.checkNotNull(yAxis, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.SportYAxis");
        ((p6o) yAxis).F(this.mLineChartAttr);
        YAxis yAxis2 = this.mAxisLeft;
        Intrinsics.checkNotNull(yAxis2, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.SportYAxis");
        ((p6o) yAxis2).F(this.mLineChartAttr);
    }

    private final void setXY(int lineColor, int txtColor) {
        updateXAxis(lineColor, txtColor);
        YAxis axisRight = getAxisRight();
        this.mAxisRight = axisRight;
        axisRight.setGridColor(lineColor);
        this.mAxisRight.setAxisLineColor(lineColor);
        this.mAxisRight.setGridDashedLine(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 0.0f));
        this.mAxisRight.setDrawAxisLine(this.mLineChartAttr.d);
        this.mAxisRight.q(false);
        this.mAxisRight.setTextColor(txtColor);
        this.mAxisRight.setTextSize(8.7f);
        this.mAxisRight.t(30.0f);
        if (this.mLineChartAttr.f36277a) {
            this.mAxisRight.setAxisMinimum(this.yAxisMin);
        }
        this.mAxisRight.v(0.0f);
        YAxis axisLeft = getAxisLeft();
        this.mAxisLeft = axisLeft;
        if (this.mLineChartAttr.f36277a) {
            axisLeft.setAxisMinimum(this.yAxisMin);
        }
        this.mAxisLeft.q(false);
        this.mAxisLeft.setEnabled(false);
    }

    private final void setYAxisMaxMinimum(List<? extends SportRecordEntry> values, float restrictMax) {
        YAxis yAxis = this.mAxisLeft;
        Intrinsics.checkNotNull(yAxis, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.SportYAxis");
        ((p6o) yAxis).H(values, restrictMax);
        YAxis yAxis2 = this.mAxisRight;
        Intrinsics.checkNotNull(yAxis2, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.SportYAxis");
        ((p6o) yAxis2).H(values, restrictMax);
    }

    private final void updateXAxis(int lineColor, int txtColor) {
        XAxis xAxis = getXAxis();
        this.mXAxis = xAxis;
        xAxis.setAvoidFirstLastClipping(true);
        this.mXAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        this.mXAxis.setAxisMinimum(0.0f);
        this.mXAxis.setGridColor(lineColor);
        this.mXAxis.setAxisLineColor(lineColor);
        this.mXAxis.setTextColor(txtColor);
        this.mXAxis.setAxisLineColor(lineColor);
        this.mXAxis.setDrawAxisLine(true);
        this.mXAxis.setDrawGridLines(this.mLineChartAttr.e);
        this.mXAxis.setTextSize(10.0f);
        this.mXAxis.setValueFormatter(new hrr(getMContext()));
    }

    @JvmOverloads
    public final void bindData(@NotNull List<? extends SportRecordEntry> values, @Nullable LineDataSet.Mode mode) {
        Intrinsics.checkNotNullParameter(values, "values");
        bindData$default(this, values, mode, 0.0f, null, 0, 28, null);
    }

    public final void bindSkippingHeightData(@NotNull List<? extends SportRecordEntry> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        setYAxisMaxMinimum(values, -1.0f);
        List<ae5> listJ1 = ae5.J1(values);
        int size = listJ1.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(listJ1.get(i));
        }
        setData(new bge(arrayList));
        invalidate();
    }

    public final void bindSportLevelData(@NotNull List<? extends SportRecordEntry> values, float minValue, float midValue, float maxValue) {
        Intrinsics.checkNotNullParameter(values, "values");
        setYAxisMaxMinimum(values, -1.0f);
        List<ae5> listE1 = ae5.E1(values, minValue, midValue, maxValue);
        int size = listE1.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(listE1.get(i));
        }
        setData(new bge(arrayList));
        invalidate();
    }

    public final void bindSportOneLevelData(@NotNull List<? extends SportRecordEntry> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        setYAxisMaxMinimum(values, -1.0f);
        List<ae5> listF1 = ae5.F1(values);
        int size = listF1.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(listF1.get(i));
        }
        setData(new bge(arrayList));
        invalidate();
    }

    public final void bindStepDownData(@NotNull List<? extends SportRecordEntry> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        setYAxisMaxMinimum(values, -1.0f);
        List<ae5> listG1 = ae5.G1(values);
        int size = listG1.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(listG1.get(i));
        }
        setData(new bge(arrayList));
        invalidate();
    }

    public final void bindStepDownUpData(@NotNull List<? extends SportRecordEntry> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        setYAxisMaxMinimum(values, -1.0f);
        List<ae5> listH1 = ae5.H1(values);
        int size = listH1.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(listH1.get(i));
        }
        setData(new bge(arrayList));
        invalidate();
    }

    public final void bindStepLengthData(@NotNull List<? extends SportRecordEntry> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        setYAxisMaxMinimum(values, -1.0f);
        List<ae5> listK1 = ae5.K1(values);
        int size = listK1.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(listK1.get(i));
        }
        setData(new bge(arrayList));
        invalidate();
    }

    public final void bindStepRepData(@NotNull List<? extends SportRecordEntry> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        setYAxisMaxMinimum(values, -1.0f);
        List<ae5> listI1 = ae5.I1(values);
        int size = listI1.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(listI1.get(i));
        }
        setData(new bge(arrayList));
        invalidate();
    }

    public final void customXAxis(@NotNull XAxis xAxis, @NotNull crr xAxisRenderer) {
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        Intrinsics.checkNotNullParameter(xAxisRenderer, "xAxisRenderer");
        this.mXAxis = xAxis;
        this.mXAxisRenderer = xAxisRenderer;
        this.mRenderer = new yd5(this, this.mAnimator, this.mViewPortHandler, AppUtil.isRTLDirection() ? this.mAxisLeft : this.mAxisRight, this.mXAxis, this.mLineChartAttr);
        updateXAxis(x44.a(aji.g0), x44.a(aji.h0));
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void drawGridBackground(@NotNull Canvas c) {
        Intrinsics.checkNotNullParameter(c, "c");
        if (this.mDrawGridBackground) {
            c.drawRect(this.mViewPortHandler.p(), this.mGridBackgroundPaint);
        }
        if (this.mDrawBorders) {
            c.drawRect(this.mViewPortHandler.p(), this.mBorderPaint);
        }
    }

    @NotNull
    public final Context getMContext() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    @NotNull
    public final xd5 getMLineChartAttr() {
        return this.mLineChartAttr;
    }

    @Nullable
    public final String getMMaxStr() {
        return this.mMaxStr;
    }

    @Override // com.github.mikephil.charting.charts.LineChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        Context applicationContext = ApplicationExtKt.getApplication().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.mXAxis = new hfp();
        this.mAxisRight = new p6o(YAxis.AxisDependency.RIGHT);
        this.mAxisLeft = new p6o(YAxis.AxisDependency.LEFT);
        this.mRenderer = new yd5(this, this.mAnimator, this.mViewPortHandler, AppUtil.isRTLDirection() ? this.mAxisLeft : this.mAxisRight, this.mXAxis, this.mLineChartAttr);
        this.mAxisRendererRight = new q6o(this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer, this.mLineChartAttr);
        this.mAxisRendererLeft = new q6o(this.mViewPortHandler, this.mAxisLeft, this.mRightAxisTransformer, this.mLineChartAttr);
        this.mXAxisRenderer = new ifp(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer, applicationContext.getString(qzi.f32030k), this.mLineChartAttr);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        drawStartEndPointIfNeed(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setLineChartAttr();
        initLineChart();
    }

    public final void setChartKey(@NotNull SportRecordKey chartKey) {
        Intrinsics.checkNotNullParameter(chartKey, "chartKey");
        YAxis yAxis = this.mAxisLeft;
        Intrinsics.checkNotNull(yAxis, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.SportYAxis");
        ((p6o) yAxis).q = chartKey;
        YAxis yAxis2 = this.mAxisRight;
        Intrinsics.checkNotNull(yAxis2, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.SportYAxis");
        ((p6o) yAxis2).q = chartKey;
    }

    public final void setLimitLine(float limitValue, @NotNull String str, float valueRange, float minValue) {
        Intrinsics.checkNotNullParameter(str, "str");
        setLimitLineInner(limitValue, this.mLineChartAttr.f39009k, getLimitLabelPosition(minValue < 0.0f ? limitValue - minValue : limitValue, valueRange));
    }

    public final void setLimitLineTextColor(int limitTextColor) {
        this.mLineChartAttr.n = limitTextColor;
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void setMLineChartAttr(@NotNull xd5 xd5Var) {
        Intrinsics.checkNotNullParameter(xd5Var, "<set-?>");
        this.mLineChartAttr = xd5Var;
    }

    public final void setMMaxStr(@Nullable String str) {
        this.mMaxStr = str;
    }

    public final void setMaxStr(@Nullable String maxStr) {
        this.mMaxStr = maxStr;
        dn5 dn5Var = this.mRenderer;
        Intrinsics.checkNotNull(dn5Var, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChartRenderer");
        ((yd5) dn5Var).n(this.mMaxStr);
    }

    public final void setYAxisMinMaxValue(int maxValue, int minValue) {
        YAxis yAxis = this.mAxisLeft;
        Intrinsics.checkNotNull(yAxis, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.SportYAxis");
        float f = maxValue;
        ((p6o) yAxis).f30069r = f;
        YAxis yAxis2 = this.mAxisLeft;
        Intrinsics.checkNotNull(yAxis2, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.SportYAxis");
        float f2 = minValue;
        ((p6o) yAxis2).s = f2;
        YAxis yAxis3 = this.mAxisRight;
        Intrinsics.checkNotNull(yAxis3, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.SportYAxis");
        ((p6o) yAxis3).f30069r = f;
        YAxis yAxis4 = this.mAxisRight;
        Intrinsics.checkNotNull(yAxis4, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.SportYAxis");
        ((p6o) yAxis4).s = f2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomLineChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setLimitLine$default(CustomLineChart customLineChart, float f, float f2, float f3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLimitLine");
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        customLineChart.setLimitLine(f, f2, f3);
    }

    @JvmOverloads
    public final void bindData(@NotNull List<? extends SportRecordEntry> values, @Nullable LineDataSet.Mode mode, float f) {
        Intrinsics.checkNotNullParameter(values, "values");
        bindData$default(this, values, mode, f, null, 0, 24, null);
    }

    public /* synthetic */ CustomLineChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @JvmOverloads
    public final void bindData(@NotNull List<? extends SportRecordEntry> values, @Nullable LineDataSet.Mode mode, float f, @Nullable List<Integer> list) {
        Intrinsics.checkNotNullParameter(values, "values");
        bindData$default(this, values, mode, f, list, 0, 16, null);
    }

    public final void setLimitLine(float limitValue, float valueRange, float minValue) {
        setLimitLineInner(limitValue, this.mLineChartAttr.f39009k, getLimitLabelPosition(minValue < 0.0f ? limitValue - minValue : limitValue, valueRange));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomLineChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setMContext(context);
        this.mLineChartAttr = du3.e(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public final void bindData(@NotNull List<? extends SportRecordEntry> values, @Nullable LineDataSet.Mode model, float restrictMax, @Nullable List<Integer> colorList, int duration) {
        Intrinsics.checkNotNullParameter(values, "values");
        setYAxisMaxMinimum(values, restrictMax);
        if (duration != 0) {
            XAxis xAxis = this.mXAxis;
            if (xAxis instanceof hfp) {
                Intrinsics.checkNotNull(xAxis, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.TimeXAxis");
                ((hfp) xAxis).a(duration);
            }
        }
        bge bgeVar = (bge) getData();
        Collections.sort(values, new ic8());
        if (bgeVar != null && bgeVar.j() > 0) {
            T tI = bgeVar.i(0);
            Intrinsics.checkNotNull(tI, "null cannot be cast to non-null type com.xiaomi.fitness.chart.mpchart.dataset.CustomLineDataSet<*>");
            ae5 ae5Var = (ae5) tI;
            ae5Var.i1(values);
            ae5Var.S0();
            bgeVar.x();
            notifyDataSetChanged();
        } else {
            ae5 ae5Var2 = new ae5(values, "DataSet 1");
            ae5Var2.z1(0.2f);
            ae5Var2.X0(false);
            if (colorList != null) {
                ae5Var2.W0(colorList);
            } else {
                ae5Var2.V0(this.mLineChartAttr.f39009k);
            }
            ae5Var2.C1(new qd5());
            xd5 xd5Var = this.mLineChartAttr;
            setFill(ae5Var2, xd5Var.m, xd5Var.l);
            ae5Var2.m1(false);
            ae5Var2.s1(this.mLineChartAttr.o);
            ae5Var2.B1(this.mLineChartAttr.v);
            ae5Var2.v1(this.mLineChartAttr.f39009k);
            ae5Var2.A1(false);
            ae5Var2.y1(this.mLineChartAttr.p);
            ae5Var2.Y0(false);
            ae5Var2.t1();
            ae5Var2.k1();
            ae5Var2.Z0(false);
            ae5Var2.o1(this.mLineChartAttr.f39010r);
            ae5Var2.D1(model);
            ArrayList arrayList = new ArrayList();
            arrayList.add(ae5Var2);
            setData(new bge(arrayList));
        }
        invalidate();
    }
}
