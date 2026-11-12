package com.huawei.health.knit.section.chart;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.hwcommonmodel.accessibility.AbstractTouchNode;
import com.huawei.hwcommonmodel.accessibility.ChartTouchHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.common.IHwHealthDataRender;
import com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet;
import defpackage.fri;
import defpackage.ftd;
import defpackage.njy;
import defpackage.qly;
import defpackage.qlz;
import defpackage.qme;
import defpackage.qno;
import defpackage.qqn;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SleepBarChartRenderer extends qlz implements IHwHealthDataRender {
    private Paint aa;
    private OnSleepTimeChangedListener ab;
    private Paint ac;
    private Paint ad;
    private float ae;
    private Paint af;
    private Paint ag;
    private Paint ah;
    private Paint ai;
    private float ak;
    private float al;
    private float an;
    private float f;
    private boolean h;
    private int i;
    private HwHealthBarChart j;
    private boolean k;
    private float l;
    private float m;
    private boolean n;
    private float o;
    private boolean p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private Paint z;

    public interface OnSleepTimeChangedListener {
        void onSleepTimeChangedListener(float f, float f2);
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public boolean isDrawingValuesAllowed(ChartInterface chartInterface) {
        return false;
    }

    public SleepBarChartRenderer(HwHealthBarChart hwHealthBarChart, HwHealthBarDataProvider hwHealthBarDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(hwHealthBarDataProvider, chartAnimator, viewPortHandler);
        this.n = true;
        this.k = true;
        this.p = false;
        this.i = 0;
        this.ac = new Paint();
        this.ad = new Paint();
        this.z = new Paint();
        this.aa = new Paint();
        this.ag = new Paint();
        this.ai = new Paint();
        this.ah = new Paint();
        this.af = new Paint();
        if (hwHealthBarChart == null || hwHealthBarDataProvider == null) {
            return;
        }
        this.j = hwHealthBarChart;
        this.f46467b = hwHealthBarDataProvider;
        this.mHighlightPaint = new Paint(1);
        this.mHighlightPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setColor(Color.rgb(0, 0, 0));
        this.mHighlightPaint.setAlpha(120);
        this.g = new Paint(1);
        this.g.setStyle(Paint.Style.FILL);
        this.e = new Paint(1);
        this.e.setStyle(Paint.Style.STROKE);
        ObserverManagerUtil.d(new e(this), "SLEEP_WEEK_MONTH_YEAR_AVERAGE_DAILY");
    }

    static class e implements Observer {
        private final WeakReference<SleepBarChartRenderer> e;

        e(SleepBarChartRenderer sleepBarChartRenderer) {
            this.e = new WeakReference<>(sleepBarChartRenderer);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            qly barData;
            IHwHealthBarDataSet iHwHealthBarDataSet;
            SleepBarChartRenderer sleepBarChartRenderer = this.e.get();
            if (sleepBarChartRenderer != null && njy.c(objArr, 0) && (barData = sleepBarChartRenderer.f46467b.getBarData()) != null && (iHwHealthBarDataSet = (IHwHealthBarDataSet) barData.getDataSetByIndex(0)) != null && objArr.length >= 2 && (objArr[1] instanceof DataInfos) && ((qme) iHwHealthBarDataSet).e() == ((DataInfos) objArr[1])) {
                Object obj = objArr[0];
                if (obj instanceof Integer) {
                    sleepBarChartRenderer.e(((Integer) obj).intValue());
                }
            }
        }
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        qly barData = this.f46467b.getBarData();
        if (barData == null) {
            LogUtil.e("R_Sleep_SleepBarChartRenderer", "initBuffers() barData is null!");
            return;
        }
        this.f46468c = new qno[barData.getDataSetCount()];
        for (int i = 0; i < this.f46468c.length; i++) {
            IHwHealthBarDataSet iHwHealthBarDataSet = (IHwHealthBarDataSet) barData.getDataSetByIndex(i);
            this.f46468c[i] = new qno(iHwHealthBarDataSet.getEntryCount() * 4 * (iHwHealthBarDataSet.isStacked() ? iHwHealthBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iHwHealthBarDataSet.isStacked());
        }
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        qly barData = this.f46467b.getBarData();
        if (barData == null) {
            LogUtil.e("R_Sleep_SleepBarChartRenderer", "drawData() barData is null!");
            return;
        }
        ChartTouchHelper accessibilityHelper = this.j.getAccessibilityHelper();
        if (accessibilityHelper != null) {
            accessibilityHelper.a().b();
        }
        for (int i = 0; i < barData.getDataSetCount(); i++) {
            IHwHealthBarDataSet iHwHealthBarDataSet = (IHwHealthBarDataSet) barData.getDataSetByIndex(i);
            if (iHwHealthBarDataSet.isVisible()) {
                c(canvas, iHwHealthBarDataSet, i);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x018d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qlz
    public void c(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, int i) {
        IHwHealthBarDataSet iHwHealthBarDataSet2;
        ArrayList arrayList;
        ArrayList arrayList2;
        qly barData = this.f46467b.getBarData();
        if (canvas == null || iHwHealthBarDataSet == null || barData == null || (iHwHealthBarDataSet2 = (IHwHealthBarDataSet) barData.getDataSetByIndex(i)) == null || !iHwHealthBarDataSet2.isHighlightEnabled() || i < 0) {
            return;
        }
        this.e.setColor(iHwHealthBarDataSet.getBarBorderColor());
        this.e.setStrokeWidth(Utils.convertDpToPixel(iHwHealthBarDataSet.getBarBorderWidth()));
        if (this.f46468c == null || this.f46468c.length <= i) {
            LogUtil.j("SleepBarChartRenderer", "drawDataSet invalid parameter");
            return;
        }
        qno qnoVar = this.f46468c[i];
        if (qnoVar == null) {
            return;
        }
        qnoVar.setPhases(this.mAnimator.getPhaseX(), this.mAnimator.getPhaseY());
        qnoVar.setDataSet(i);
        qnoVar.setInverted(false);
        qnoVar.setBarWidth(this.f46467b.getBarData().a());
        qnoVar.b(iHwHealthBarDataSet);
        HwHealthTransformer transformer = this.f46467b.getTransformer(iHwHealthBarDataSet.getAxisDependencyExt());
        transformer.pointValuesToPixel(qnoVar.buffer);
        boolean z = iHwHealthBarDataSet.getColors().size() == 1;
        if (z) {
            this.mRenderPaint.setColor(a(iHwHealthBarDataSet));
        }
        ArrayList arrayList3 = new ArrayList(16);
        ArrayList arrayList4 = new ArrayList(16);
        ArrayList arrayList5 = new ArrayList(16);
        ArrayList arrayList6 = new ArrayList(16);
        ArrayList arrayList7 = new ArrayList(16);
        ArrayList arrayList8 = new ArrayList(16);
        qme qmeVar = (qme) iHwHealthBarDataSet2;
        boolean z2 = qmeVar.e() == DataInfos.CoreSleepYearDetail;
        int i2 = 0;
        int i3 = 0;
        while (i3 < qnoVar.size()) {
            if (this.mViewPortHandler.isInBoundsLeft(qnoVar.buffer[i3])) {
                int i4 = i3 + 2;
                if (this.mViewPortHandler.isInBoundsRight(qnoVar.buffer[i4])) {
                    if (!z) {
                        this.mRenderPaint.setColor(iHwHealthBarDataSet.getColor(i3 / 4));
                    }
                    RectF rectF = this.d;
                    float f = qnoVar.buffer[i3];
                    float f2 = qnoVar.buffer[i3 + 1];
                    ArrayList arrayList9 = arrayList8;
                    float f3 = qnoVar.buffer[i4];
                    arrayList2 = arrayList7;
                    rectF.set(f, f2, f3, qnoVar.buffer[i3 + 3]);
                    int i5 = i3 / 4;
                    HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i5);
                    if (hwHealthBarEntry == null) {
                        return;
                    }
                    fri friVarD = ((ftd) hwHealthBarEntry.acquireModel()).d();
                    int i6 = friVarD.i() == 5 ? 5 : i2;
                    arrayList = arrayList9;
                    d(arrayList3, arrayList4, arrayList5, arrayList, arrayList6, arrayList2, friVarD);
                    e(canvas, this.d, transformer, 2, friVarD, qmeVar.e());
                    ChartTouchHelper accessibilityHelper = this.j.getAccessibilityHelper();
                    if (accessibilityHelper != null) {
                        AbstractTouchNode abstractTouchNodeA = accessibilityHelper.a().a(i5);
                        e(abstractTouchNodeA, hwHealthBarEntry.getX());
                        Rect rect = new Rect();
                        this.d.round(rect);
                        abstractTouchNodeA.setRect(rect);
                    }
                    i2 = i6;
                } else {
                    arrayList = arrayList8;
                    arrayList2 = arrayList7;
                }
            } else {
                arrayList = arrayList8;
                arrayList2 = arrayList7;
            }
            i3 += 4;
            arrayList7 = arrayList2;
            arrayList6 = arrayList6;
            arrayList8 = arrayList;
            arrayList5 = arrayList5;
            arrayList4 = arrayList4;
        }
        ArrayList arrayList10 = arrayList8;
        ArrayList arrayList11 = arrayList7;
        ArrayList arrayList12 = arrayList6;
        ArrayList arrayList13 = arrayList5;
        ArrayList arrayList14 = arrayList4;
        if (this.f46467b.getBarData().getDataSets().get(0) instanceof qme) {
            ObserverManagerUtil.e("SLEEP_BASE_BAR_DREAM_VISIBILITY", Boolean.valueOf(arrayList3.size() > 0), Boolean.valueOf(arrayList14.size() > 0), Boolean.valueOf(arrayList13.size() > 0), Boolean.valueOf(arrayList11.size() > 0), Boolean.valueOf(arrayList12.size() > 0), Boolean.valueOf(arrayList10.size() > 0), ((qme) this.f46467b.getBarData().getDataSets().get(0)).e(), Integer.valueOf(i2));
        }
        if (z2) {
            return;
        }
        d(arrayList3, arrayList14, arrayList13, arrayList10);
    }

    private void e(AbstractTouchNode abstractTouchNode, float f) {
        String formattedValue;
        String strA;
        IAxisValueFormatter valueFormatter = this.j.getXAxis().getValueFormatter();
        if (valueFormatter instanceof HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter) {
            formattedValue = ((HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter) valueFormatter).getFormattedValueForMarkerView(f, this.j.getXAxis());
        } else {
            formattedValue = valueFormatter.getFormattedValue(f, this.j.getXAxis());
        }
        String[] strArr = {qre.f(R.string.IDS_manual_sleep_sleep_time), qre.f(R.string.IDS_hw_show_main_health_page_healthdata_sleep_deepsleep), qre.f(R.string.IDS_hw_show_main_health_page_healthdata_sleep_shallowsleep), qre.f(R.string.IDS_fitness_core_sleep_rem_sleep), qre.f(R.string.IDS_details_sleep_sleep_latency), qre.f(R.string.IDS_fitness_core_sleep_noontime_sleep)};
        int i = (int) this.o;
        int[] iArr = {(i <= 0 || ((int) this.s) <= 0) ? (int) this.y : ((int) this.ak) - ((int) this.an), i, (int) this.s, (int) this.m, (int) this.an, (int) this.u};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 / 60;
            int i5 = i3 % 60;
            if (i4 != 0) {
                if (i5 != 0) {
                    strA = qre.a(com.huawei.health.servicesui.R.string.IDS_h_min_unit, Integer.valueOf(i4), Integer.valueOf(i5));
                } else {
                    strA = qre.e(R.plurals.IDS_hour_string, i4, UnitUtil.e(i4, 1, 0));
                }
            } else if (i5 == 0) {
                strA = "";
            } else {
                strA = qre.a(com.huawei.health.servicesui.R.string.IDS_hw_show_set_target_sport_time_unit, Integer.valueOf(i5));
            }
            if (!TextUtils.isEmpty(strA)) {
                formattedValue = qre.a(com.huawei.health.servicesui.R.string.IDS_two_parts, formattedValue, qre.a(com.huawei.health.servicesui.R.string.IDS_two_parts, strArr[i2], strA));
            }
        }
        abstractTouchNode.setDescription(formattedValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (this.i != i) {
            this.i = i;
            int i2 = i / 60;
            String quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hour_unit, i2, UnitUtil.e(i2, 1, 0));
            int i3 = this.i % 60;
            String string = BaseApplication.getContext().getString(R.string.IDS_two_parts, quantityString, BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_min_unit, i3, UnitUtil.e(i3, 1, 0)));
            if (i > 0) {
                c(i, qqn.b(BaseApplication.getContext(), R.color.health_chart_default_line_color), string);
            } else {
                c(i, qqn.b(BaseApplication.getContext(), R.color.colorBackground), "");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final int i, final int i2, final String str) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.knit.section.chart.SleepBarChartRenderer.5
                @Override // java.lang.Runnable
                public void run() {
                    SleepBarChartRenderer.this.c(i, i2, str);
                }
            });
            return;
        }
        ((CoreSleepBarChartView) this.j).a(i, i2, str);
        this.j.reCalculateDynamicBoardForManualRefLine();
        this.j.refresh();
    }

    private void d(List<Float> list, List<Float> list2, List<Float> list3, List<Float> list4, List<Float> list5, List<Float> list6, fri friVar) {
        if (friVar == null || friVar.f() == 30) {
            return;
        }
        if (friVar.e() > 0.0f) {
            list.add(Float.valueOf(friVar.e()));
        }
        if (friVar.d() > 0.0f) {
            list2.add(Float.valueOf(friVar.d()));
        }
        if (friVar.a() > 0.0f) {
            list3.add(Float.valueOf(friVar.a()));
        }
        if (friVar.c() > 0.0f) {
            list5.add(Float.valueOf(friVar.c()));
        }
        if (friVar.h() > 0.0f) {
            list6.add(Float.valueOf(friVar.h()));
        }
        if (friVar.e() == 0.0f && friVar.d() == 0.0f && friVar.a() == 0.0f && friVar.b() > 0.0f) {
            list4.add(Float.valueOf(friVar.j()));
        }
    }

    private int d(List<Float> list, List<Float> list2, List<Float> list3, List<Float> list4) {
        int size = list.size();
        int size2 = list2.size();
        int size3 = list3.size();
        if (size <= size2) {
            size = size2;
        }
        if (size >= size3) {
            size3 = size;
        }
        int iE = e(list, size3) + e(list2, size3) + e(list3, size3);
        if (njy.e(list4)) {
            return iE;
        }
        Iterator<Float> it = list4.iterator();
        float f = 0.0f;
        int i = 0;
        while (it.hasNext()) {
            float fFloatValue = it.next().floatValue();
            if (fFloatValue >= 180.0f) {
                f += fFloatValue;
                i++;
            }
        }
        return Math.round(((iE * size3) + f) / (size3 + i));
    }

    private int e(List<Float> list, int i) {
        Iterator<Float> it = list.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return list.size() > 0 ? Math.round(fFloatValue / i) : (int) fFloatValue;
    }

    private void e(Canvas canvas, RectF rectF, Transformer transformer, int i, fri friVar, DataInfos dataInfos) {
        float f;
        float[] fArr = {0.0f, 0.0f};
        transformer.pointValuesToPixel(fArr);
        boolean z = true;
        float f2 = fArr[1];
        float fAbs = Math.abs(rectF.top - rectF.bottom);
        float fAbs2 = Math.abs(rectF.right - rectF.left);
        if (fAbs >= 1.0E-7f || rectF.top != f2) {
            float f3 = this.n ? (fAbs2 / 2.0f) + 0.0f : 0.0f;
            if (this.k) {
                f3 += fAbs2 / 2.0f;
            }
            if (fAbs < f3) {
                float f4 = (rectF.top + rectF.bottom) / 2.0f;
                float f5 = f3 / 2.0f;
                rectF.top = f4 - f5;
                rectF.bottom = f4 + f5;
                if (rectF.bottom > f2) {
                    float f6 = rectF.bottom - f2;
                    rectF.bottom -= f6;
                    rectF.top -= f6;
                }
            }
            float fMax = rectF.bottom - rectF.top;
            b(i);
            if (fMax <= 0.0f || !this.n) {
                f = 0.0f;
            } else {
                float f7 = fAbs2 / 2.0f;
                fMax = Math.max(0.0f, fMax - f7);
                f = f7 + 0.0f;
            }
            if (fMax >= 0.0f) {
                c(friVar, dataInfos);
                d(rectF, f, 0.0f, (rectF.bottom - 0.0f) - (rectF.top + f));
                if (i != 1 && LanguageUtil.ba(BaseApplication.getContext())) {
                    float f8 = rectF.left;
                    float f9 = rectF.right;
                    rectF.right = f8;
                    rectF.left = f9;
                }
                float[] fArr2 = {this.u, this.an, this.m, this.s, this.o};
                boolean z2 = ((double) Math.abs(this.r + this.y)) > 1.0E-6d;
                int i2 = 0;
                while (true) {
                    if (i2 < 5) {
                        if (fArr2[i2] > 0.0f) {
                            if (!z2) {
                                break;
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                    z = false;
                    break;
                }
                if (dataInfos == DataInfos.CoreSleepYearDetail && z) {
                    d(canvas, rectF, fAbs2, f, i, 0.0f);
                } else {
                    d(canvas, rectF, fAbs2, f);
                }
            }
        }
    }

    private void d(Canvas canvas, RectF rectF, float f, float f2, int i, float f3) {
        LinearGradient linearGradient;
        float f4 = rectF.bottom - f3;
        if (i == 1) {
            linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f4, a(R.color.color_selected_year_top), a(R.color.color_selected_year_bottom), Shader.TileMode.CLAMP);
        } else {
            linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f4, a(R.color.color_unselected_year_top), a(R.color.color_unselected_year_bottom), Shader.TileMode.CLAMP);
        }
        this.af.setShader(linearGradient);
        float f5 = f / 2.0f;
        canvas.drawArc(new RectF(rectF.left, (rectF.top + f2) - f5, rectF.right, rectF.top + f2 + f5), 0.0f, -180.0f, false, this.af);
        canvas.drawRect(rectF.left, f2 + rectF.top, rectF.right, f4, this.af);
    }

    private void d(Canvas canvas, RectF rectF, float f, float f2) {
        boolean z;
        if (this.h) {
            if (this.r > 0.0f) {
                float f3 = f / 2.0f;
                canvas.drawArc(new RectF(rectF.left, (rectF.top + f2) - f3, rectF.right, rectF.top + f2 + f3), 0.0f, -180.0f, false, this.ai);
                canvas.drawRect(rectF.left, rectF.top + f2, rectF.right, this.t, this.ai);
                if (this.y > 0.0f) {
                    canvas.drawRect(rectF.left, this.t, rectF.right, this.v, this.ah);
                    return;
                }
                return;
            }
            float f4 = f / 2.0f;
            canvas.drawArc(new RectF(rectF.left, (rectF.top + f2) - f4, rectF.right, rectF.top + f2 + f4), 0.0f, -180.0f, false, this.ai);
            canvas.drawRect(rectF.left, rectF.top + f2, rectF.right, this.v, this.ah);
            return;
        }
        if (this.u > 0.0f) {
            float f5 = f / 2.0f;
            canvas.drawArc(new RectF(rectF.left, (rectF.top + f2) - f5, rectF.right, rectF.top + f2 + f5), 0.0f, -180.0f, false, this.ac);
            canvas.drawRect(rectF.left, rectF.top + f2, rectF.right, this.x, this.ac);
        }
        boolean z2 = true;
        if (this.an > 0.0f) {
            float f6 = f / 2.0f;
            canvas.drawArc(new RectF(rectF.left, this.x - f6, rectF.right, this.x + f6), 0.0f, -180.0f, false, this.ad);
            canvas.drawRect(rectF.left, this.x, rectF.right, this.al, this.ad);
            z = true;
        } else {
            z = false;
        }
        if (this.m > 0.0f) {
            if (!z) {
                float f7 = f / 2.0f;
                canvas.drawArc(new RectF(rectF.left, this.al - f7, rectF.right, this.al + f7), 0.0f, -180.0f, false, this.z);
                z = true;
            }
            canvas.drawRect(rectF.left, this.al, rectF.right, this.l, this.z);
        }
        if (this.s > 0.0f) {
            if (z) {
                z2 = z;
            } else {
                float f8 = f / 2.0f;
                canvas.drawArc(new RectF(rectF.left, this.l - f8, rectF.right, this.l + f8), 0.0f, -180.0f, false, this.aa);
            }
            canvas.drawRect(rectF.left, this.l, rectF.right, this.q, this.aa);
            z = z2;
        }
        if (this.o > 0.0f) {
            if (!z) {
                float f9 = f / 2.0f;
                canvas.drawArc(new RectF(rectF.left, this.q - f9, rectF.right, this.q + f9), 0.0f, -180.0f, false, this.ag);
            }
            canvas.drawRect(rectF.left, this.q, rectF.right, this.f, this.ag);
        }
    }

    private void d(RectF rectF, float f, float f2, float f3) {
        boolean z = false;
        boolean z2 = this.o <= 0.0f && this.s <= 0.0f;
        if (this.m <= 0.0f && this.an <= 0.0f) {
            z = true;
        }
        if (this.h) {
            this.v = rectF.bottom - f2;
            this.t = ((this.r / this.ak) * f3) + rectF.top + f;
            return;
        }
        if (z2 && z) {
            this.x = rectF.bottom - f2;
        } else {
            this.x = ((this.u / this.ak) * f3) + rectF.top + f;
        }
        if (this.o <= 0.0f && this.s <= 0.0f && this.m <= 0.0f) {
            this.al = rectF.bottom - f2;
        } else {
            this.al = ((this.an / this.ak) * f3) + this.x;
        }
        if (this.o <= 0.0f && this.s <= 0.0f) {
            this.l = rectF.bottom - f2;
        } else {
            this.l = ((this.m / this.ak) * f3) + this.al;
        }
        if (this.o <= 0.0f) {
            this.q = rectF.bottom - f2;
        } else {
            this.q = ((this.s / this.ak) * f3) + this.l;
        }
        this.f = rectF.bottom - f2;
    }

    private void c(fri friVar, DataInfos dataInfos) {
        this.u = friVar.c();
        this.an = friVar.h();
        this.m = friVar.a();
        this.s = friVar.d();
        float fE = friVar.e();
        this.o = fE;
        if (fE + this.s + this.m + this.an == 0.0f && friVar.b() != 0.0f) {
            this.h = true;
            this.y = friVar.j();
            float fB = friVar.b();
            float f = this.y;
            float f2 = fB - f;
            this.r = f2;
            this.ak = f + f2;
            return;
        }
        if (dataInfos == DataInfos.CoreSleepYearDetail) {
            this.h = false;
            this.y = 0.0f;
            this.r = friVar.b();
        } else {
            this.h = false;
            this.y = 0.0f;
            this.r = 0.0f;
        }
        this.ak = this.o + this.s + this.m + this.an + this.u;
    }

    private void b(int i) {
        if (i == 1) {
            this.ac.setColor(Color.argb(255, 0, 143, 255));
            this.ad.setColor(Color.argb(255, 255, 217, 69));
            this.z.setColor(Color.argb(255, 252, 130, 130));
            this.aa.setColor(Color.argb(255, 198, 75, 228));
            this.ag.setColor(Color.argb(255, 138, 43, 226));
            this.ai.setColor(a(R.color.color_selected_manual_bed));
            this.ah.setColor(a(R.color.color_selected_manual_sleep));
            return;
        }
        this.ac.setColor(a(R.color.color_unselected_noon_sleep));
        this.ad.setColor(a(R.color.color_unselected_awake));
        this.z.setColor(a(R.color.color_unselected_rem));
        this.aa.setColor(a(R.color.color_unselected_shallow));
        this.ag.setColor(a(R.color.color_unselected_deep));
        this.ai.setColor(a(R.color.color_unselected_manual_bed));
        this.ah.setColor(a(R.color.color_unselected_manual_sleep));
    }

    private int a(int i) {
        HwHealthBarChart hwHealthBarChart = this.j;
        if (hwHealthBarChart instanceof CoreSleepBarChartView) {
            return ((CoreSleepBarChartView) hwHealthBarChart).getResources().getColor(i);
        }
        return -1;
    }

    @Override // defpackage.qlz
    public void c(float f, float f2, float f3, float f4, Transformer transformer) {
        this.f46466a.set(f - f4, f2, f + f4, f3);
        transformer.rectToPixelPhase(this.f46466a, this.mAnimator.getPhaseY());
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        if (canvas == null || !isDrawingValuesAllowed(this.f46467b) || this.f46467b.getBarData() == null) {
            return;
        }
        List<T> dataSets = this.f46467b.getBarData().getDataSets();
        float fConvertDpToPixel = Utils.convertDpToPixel(4.5f);
        boolean zIsDrawValueAboveBarEnabled = this.f46467b.isDrawValueAboveBarEnabled();
        for (int i = 0; i < this.f46467b.getBarData().getDataSetCount(); i++) {
            IHwHealthBarDataSet iHwHealthBarDataSet = (IHwHealthBarDataSet) dataSets.get(i);
            if (shouldDrawValues(iHwHealthBarDataSet)) {
                applyValueTextStyle(iHwHealthBarDataSet);
                float fCalcTextHeight = Utils.calcTextHeight(this.mValuePaint, "8");
                this.ae = zIsDrawValueAboveBarEnabled ? -fConvertDpToPixel : fCalcTextHeight + fConvertDpToPixel;
                this.w = zIsDrawValueAboveBarEnabled ? fCalcTextHeight + fConvertDpToPixel : -fConvertDpToPixel;
                BarBuffer barBuffer = this.f46468c[i];
                MPPointF mPPointF = MPPointF.getInstance(iHwHealthBarDataSet.getIconsOffset());
                mPPointF.x = Utils.convertDpToPixel(mPPointF.x);
                mPPointF.y = Utils.convertDpToPixel(mPPointF.y);
                if (!iHwHealthBarDataSet.isStacked()) {
                    a(canvas, iHwHealthBarDataSet, barBuffer, mPPointF);
                } else {
                    c(canvas, iHwHealthBarDataSet, barBuffer, mPPointF);
                }
                MPPointF.recycleInstance(mPPointF);
            }
        }
    }

    private void c(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, BarBuffer barBuffer, MPPointF mPPointF) {
        float f;
        if (barBuffer == null || barBuffer.buffer == null) {
            LogUtil.j("SleepBarChartRenderer", "setIsStacked buffer or buffer.buffer is null");
            return;
        }
        int i = 0;
        int i2 = 0;
        while (i < iHwHealthBarDataSet.getEntryCount() * this.mAnimator.getPhaseX()) {
            HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i);
            int i3 = i2 + 2;
            if (barBuffer.buffer.length <= i3) {
                LogUtil.j("SleepBarChartRenderer", "setIsStacked invalid parameter");
                return;
            }
            float f2 = (barBuffer.buffer[i2] + barBuffer.buffer[i3]) / 2.0f;
            int valueTextColor = iHwHealthBarDataSet.getValueTextColor(i);
            if (!this.mViewPortHandler.isInBoundsRight(f2)) {
                return;
            }
            int i4 = i2 + 1;
            if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i4]) && this.mViewPortHandler.isInBoundsLeft(f2)) {
                if (iHwHealthBarDataSet.isDrawValuesEnabled()) {
                    c(canvas, iHwHealthBarDataSet.getValueFormatter().getFormattedValue(hwHealthBarEntry.getY(), hwHealthBarEntry, i, this.mViewPortHandler), f2, (hwHealthBarEntry.getY() >= 0.0f ? this.ae : this.w) + barBuffer.buffer[i4], valueTextColor);
                }
                if (hwHealthBarEntry.getIcon() != null && iHwHealthBarDataSet.isDrawIconsEnabled()) {
                    Drawable icon = hwHealthBarEntry.getIcon();
                    float f3 = barBuffer.buffer[i4];
                    if (hwHealthBarEntry.getY() >= 0.0f) {
                        f = this.ae;
                    } else {
                        f = this.w;
                    }
                    Utils.drawImage(canvas, icon, (int) (f2 + mPPointF.x), (int) (f3 + f + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                }
                i2 += 4;
                i++;
            }
        }
    }

    private void a(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, BarBuffer barBuffer, MPPointF mPPointF) {
        float f;
        float f2;
        float f3;
        float f4;
        for (int i = 0; i < barBuffer.buffer.length * this.mAnimator.getPhaseX(); i += 4) {
            float f5 = (barBuffer.buffer[i] + barBuffer.buffer[i + 2]) / 2.0f;
            if (!this.mViewPortHandler.isInBoundsRight(f5)) {
                return;
            }
            int i2 = i + 1;
            if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i2]) && this.mViewPortHandler.isInBoundsLeft(f5)) {
                int i3 = i / 4;
                HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i3);
                float y = hwHealthBarEntry.getY();
                if (iHwHealthBarDataSet.isDrawValuesEnabled()) {
                    String formattedValue = iHwHealthBarDataSet.getValueFormatter().getFormattedValue(hwHealthBarEntry.getY(), hwHealthBarEntry, i3, this.mViewPortHandler);
                    if (y >= 0.0f) {
                        f3 = barBuffer.buffer[i2];
                        f4 = this.ae;
                    } else {
                        f3 = barBuffer.buffer[i + 3];
                        f4 = this.w;
                    }
                    c(canvas, formattedValue, f5, f3 + f4, iHwHealthBarDataSet.getValueTextColor(i3));
                }
                if (hwHealthBarEntry.getIcon() != null && iHwHealthBarDataSet.isDrawIconsEnabled()) {
                    Drawable icon = hwHealthBarEntry.getIcon();
                    if (y >= 0.0f) {
                        f = barBuffer.buffer[i2];
                        f2 = this.ae;
                    } else {
                        f = barBuffer.buffer[i + 3];
                        f2 = this.w;
                    }
                    Utils.drawImage(canvas, icon, (int) (f5 + mPPointF.x), (int) (f + f2 + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                }
            }
        }
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        if (this.p) {
            return;
        }
        qly barData = this.f46467b.getBarData();
        if (canvas == null || highlightArr == null || barData == null) {
            return;
        }
        for (Highlight highlight : highlightArr) {
            IHwHealthBarDataSet iHwHealthBarDataSet = (IHwHealthBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iHwHealthBarDataSet != null && iHwHealthBarDataSet.isHighlightEnabled()) {
                this.mHighlightPaint.setColor(b(iHwHealthBarDataSet));
                List<T> entriesForXValue = iHwHealthBarDataSet.getEntriesForXValue(highlight.getX());
                if (entriesForXValue == 0 || entriesForXValue.size() == 0) {
                    return;
                }
                HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) entriesForXValue.get(0);
                if (isInBoundsX(hwHealthBarEntry, iHwHealthBarDataSet)) {
                    Transformer transformer = this.f46467b.getTransformer(iHwHealthBarDataSet.getAxisDependencyExt());
                    ftd ftdVar = (ftd) hwHealthBarEntry.acquireModel();
                    float fB = ftdVar.b();
                    float fC = ftdVar.c();
                    fri friVarD = ftdVar.d();
                    if (this.ab != null && friVarD != null) {
                        float fH = fB - friVarD.h();
                        float fB2 = friVarD.b();
                        if (fB2 != 0.0f) {
                            fH = friVarD.j();
                        }
                        this.ab.onSleepTimeChangedListener(fH, fB2);
                        c(hwHealthBarEntry.getX(), fB, fC, barData.a() / 2.0f, transformer);
                        c(highlight, this.f46466a);
                        e(canvas, this.f46466a, transformer, 1, friVarD, ((qme) iHwHealthBarDataSet).e());
                    }
                }
            }
        }
    }

    public void c(OnSleepTimeChangedListener onSleepTimeChangedListener) {
        this.ab = onSleepTimeChangedListener;
    }

    @Override // defpackage.qlz
    public void c(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerX(), rectF.top);
    }

    @Override // defpackage.qlz
    public HwHealthBarDataProvider e() {
        return this.f46467b;
    }

    @Override // defpackage.qlz, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public void usePaintAsBackground(boolean z) {
        this.p = z;
    }

    @Override // defpackage.qlz, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean isUsePaintAsBackground() {
        return this.p;
    }

    private int a(IHwHealthBarDataSet iHwHealthBarDataSet) {
        if (this.p) {
            return Color.argb(255, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE);
        }
        return iHwHealthBarDataSet.getColor();
    }

    private int b(IHwHealthBarDataSet iHwHealthBarDataSet) {
        if (this.p) {
            return Color.argb(255, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE);
        }
        return iHwHealthBarDataSet.acquireFocusColor();
    }

    @Override // defpackage.qlz, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean hasData() {
        qly barData = this.f46467b.getBarData();
        return (barData == null || barData.getDataSets() == null || barData.getDataSets().size() == 0) ? false : true;
    }

    @Override // defpackage.qlz
    public void d(boolean z, boolean z2) {
        this.n = z;
        this.k = z2;
    }
}
