package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwcommonmodel.accessibility.AbstractTouchNode;
import com.huawei.hwcommonmodel.accessibility.ChartTouchHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.HwEntrys;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.common.IHwHealthDataRender;
import com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public class qlz extends BarLineScatterCandleBubbleRenderer implements IHwHealthDataRender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected RectF f46466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HwHealthBarDataProvider f46467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected qno[] f46468c;
    protected RectF d;
    protected Paint e;
    private boolean f;
    protected Paint g;
    private boolean h;
    private RectF i;
    private boolean j;

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public boolean isDrawingValuesAllowed(ChartInterface chartInterface) {
        return false;
    }

    public qlz(HwHealthBarDataProvider hwHealthBarDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.f46466a = new RectF();
        this.d = new RectF();
        this.j = false;
        this.f = true;
        this.h = true;
        this.i = new RectF();
        if (hwHealthBarDataProvider == null) {
            LogUtil.j("HwHealthBarChartRenderer", "chart == null");
            return;
        }
        this.f46467b = hwHealthBarDataProvider;
        this.mHighlightPaint = new Paint(1);
        this.mHighlightPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setColor(Color.rgb(0, 0, 0));
        this.mHighlightPaint.setAlpha(120);
        Paint paint = new Paint(1);
        this.g = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.e = paint2;
        paint2.setStyle(Paint.Style.STROKE);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        qly barData = this.f46467b.getBarData();
        if (barData == null) {
            LogUtil.e("HwHealthBarChartRenderer", "initBuffers() barData is null!");
            return;
        }
        this.f46468c = new qno[barData.getDataSetCount()];
        for (int i = 0; i < this.f46468c.length; i++) {
            IHwHealthBarDataSet iHwHealthBarDataSet = (IHwHealthBarDataSet) barData.getDataSetByIndex(i);
            this.f46468c[i] = new qno(iHwHealthBarDataSet.getEntryCount() * 4 * (iHwHealthBarDataSet.isStacked() ? iHwHealthBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iHwHealthBarDataSet.isStacked());
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        qly barData = this.f46467b.getBarData();
        if (barData == null) {
            LogUtil.e("HwHealthBarChartRenderer", "drawData() barData is null!");
            return;
        }
        ArrayList<IHwHealthBarDataSet> arrayList = new ArrayList();
        for (int i = 0; i < barData.getDataSetCount(); i++) {
            IHwHealthBarDataSet iHwHealthBarDataSet = (IHwHealthBarDataSet) barData.getDataSetByIndex(i);
            if (iHwHealthBarDataSet.isVisible()) {
                arrayList.add(iHwHealthBarDataSet);
            }
        }
        if (arrayList.size() < 2) {
            for (IHwHealthBarDataSet iHwHealthBarDataSet2 : arrayList) {
                c(canvas, iHwHealthBarDataSet2, barData.getDataSets().indexOf(iHwHealthBarDataSet2));
            }
            return;
        }
        usePaintAsBackground(true);
        c(canvas, (IHwHealthBarDataSet) arrayList.get(0), barData.getDataSets().indexOf(arrayList.get(0)));
        usePaintAsBackground(false);
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            c(canvas, (IHwHealthBarDataSet) arrayList.get(i2), i2);
        }
    }

    protected void c(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, int i) {
        if (canvas == null || iHwHealthBarDataSet == null) {
            LogUtil.j("HwHealthBarChartRenderer", "canvas == null||dataSet ==null");
            return;
        }
        this.e.setColor(iHwHealthBarDataSet.getBarBorderColor());
        this.e.setStrokeWidth(Utils.convertDpToPixel(iHwHealthBarDataSet.getBarBorderWidth()));
        qly barData = this.f46467b.getBarData();
        if (barData == null) {
            LogUtil.j("HwHealthBarChartRenderer", "drawDataSet() barData is null!");
            return;
        }
        HwHealthTransformer transformer = this.f46467b.getTransformer(iHwHealthBarDataSet.getAxisDependencyExt());
        float fA = IHwHealthBarDataSet.BarWidthMode.DEFAULT_WIDTH.equals(iHwHealthBarDataSet.getBarDrawWidthMode()) ? barData.a() : iHwHealthBarDataSet.getBarDrawWidth(transformer);
        float phaseX = this.mAnimator.getPhaseX();
        d(canvas, iHwHealthBarDataSet, transformer, fA / 2.0f, phaseX);
        qno[] qnoVarArr = this.f46468c;
        if (qnoVarArr == null || qnoVarArr.length == 0) {
            LogUtil.j("HwHealthBarChartRenderer", "drawDataSet mBarBuffers == null || mBarBuffers.length == 0");
            return;
        }
        qno qnoVar = qnoVarArr.length > i ? qnoVarArr[i] : null;
        if (qnoVar == null) {
            LogUtil.e("HwHealthBarChartRenderer", "drawData() buffer is null !");
            return;
        }
        qnoVar.setPhases(phaseX, this.mAnimator.getPhaseY());
        qnoVar.setDataSet(i);
        a(canvas, iHwHealthBarDataSet, transformer, qnoVar, fA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, Transformer transformer, float f, float f2) {
        if (this.f46467b.isDrawBarShadowEnabled()) {
            this.g.setColor(iHwHealthBarDataSet.getBarShadowColor());
            int iMin = Math.min((int) Math.ceil(iHwHealthBarDataSet.getEntryCount() * f2), iHwHealthBarDataSet.getEntryCount());
            for (int i = 0; i < iMin; i++) {
                float x = ((HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i)).getX();
                this.i.left = x - f;
                this.i.right = x + f;
                transformer.rectValueToPixel(this.i);
                if (this.mViewPortHandler.isInBoundsLeft(this.i.right)) {
                    if (!this.mViewPortHandler.isInBoundsRight(this.i.left)) {
                        return;
                    }
                    this.i.top = this.mViewPortHandler.contentTop();
                    this.i.bottom = this.mViewPortHandler.contentBottom();
                    float f3 = (this.i.right - this.i.left) / 2.0f;
                    canvas.drawRoundRect(this.i, f3, f3, this.g);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, Transformer transformer, qno qnoVar, float f) {
        ChartTouchHelper accessibilityHelper;
        qnoVar.setInverted(false);
        qnoVar.setBarWidth(f);
        qnoVar.b(iHwHealthBarDataSet);
        transformer.pointValuesToPixel(qnoVar.buffer);
        boolean z = iHwHealthBarDataSet.getColors().size() == 1;
        if (z) {
            this.mRenderPaint.setColor(b(iHwHealthBarDataSet));
        }
        BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider = this.f46467b;
        if (barLineScatterCandleBubbleDataProvider instanceof HwHealthBaseScrollBarLineChart) {
            accessibilityHelper = ((HwHealthBaseScrollBarLineChart) barLineScatterCandleBubbleDataProvider).getAccessibilityHelper();
            if (accessibilityHelper != null) {
                accessibilityHelper.a().b();
            }
        } else {
            accessibilityHelper = null;
        }
        for (int i = 0; i < qnoVar.size(); i += 4) {
            float f2 = qnoVar.buffer[i];
            float f3 = qnoVar.buffer[i + 2];
            float f4 = f3 - f2;
            if (this.mViewPortHandler.isInBoundsX((f2 + f3) / 2.0f)) {
                float f5 = this.mViewPortHandler.getContentRect().left;
                float f6 = this.mViewPortHandler.getContentRect().right;
                if (!this.mViewPortHandler.isInBoundsLeft(f2)) {
                    f3 = f5 + f4;
                    f2 = f5;
                }
                if (this.mViewPortHandler.isInBoundsRight(f3)) {
                    f6 = f3;
                } else {
                    f2 = f6 - f4;
                }
                if (!z || HwHealthBarDataSet.DrawColorMode.DATA_COLOR.equals(iHwHealthBarDataSet.getDrawColorMode())) {
                    this.mRenderPaint.setColor(iHwHealthBarDataSet.getColor(i / 4));
                }
                this.d.set(f2, qnoVar.buffer[i + 1], f6, qnoVar.buffer[i + 3]);
                d(canvas, this.d, this.mRenderPaint, transformer);
                if (accessibilityHelper != null) {
                    int i2 = i / 4;
                    AbstractTouchNode abstractTouchNodeA = accessibilityHelper.a().a(i2);
                    Rect rect = new Rect();
                    this.d.round(rect);
                    abstractTouchNodeA.setRect(rect);
                    d(abstractTouchNodeA, (HwHealthBaseScrollBarLineChart<?>) this.f46467b, (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i2), (HwEntrys.MarkerViewFormatProvider) iHwHealthBarDataSet);
                }
            }
        }
    }

    private void d(AbstractTouchNode abstractTouchNode, HwHealthBaseScrollBarLineChart<?> hwHealthBaseScrollBarLineChart, HwHealthBarEntry hwHealthBarEntry, HwEntrys.MarkerViewFormatProvider markerViewFormatProvider) {
        String formattedValue;
        String strA;
        IAxisValueFormatter valueFormatter = hwHealthBaseScrollBarLineChart.getXAxis().getValueFormatter();
        Object parseTool = hwHealthBaseScrollBarLineChart.getParseTool();
        if (abstractTouchNode == null || valueFormatter == null || parseTool == null) {
            ReleaseLogUtil.e("HwHealthBarChartRenderer", "cant setAccessibilityDescription,", abstractTouchNode, valueFormatter, parseTool);
            return;
        }
        if (valueFormatter instanceof HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter) {
            formattedValue = ((HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter) valueFormatter).getFormattedValueForMarkerView(hwHealthBarEntry.getX(), hwHealthBaseScrollBarLineChart.getXAxis());
        } else {
            formattedValue = valueFormatter.getFormattedValue(hwHealthBarEntry.getX(), hwHealthBaseScrollBarLineChart.getXAxis());
        }
        try {
            strA = (String) Class.forName("com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView").getDeclaredMethod("parse", HwHealthBaseEntry.class).invoke(parseTool, hwHealthBarEntry);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            ReleaseLogUtil.a("HwHealthBarChartRenderer", "reflect error");
            strA = "";
        }
        String strAcquireUnit = markerViewFormatProvider.acquireUnit();
        if (!TextUtils.isEmpty(strA)) {
            if (Pattern.compile("([0-9]+(.[0-9]+)?)\\s?-\\s?([0-9]+(.[0-9]+)?)").matcher(strA).matches()) {
                String[] strArrSplit = strA.split(Constants.LINK);
                if (strArrSplit.length == 2) {
                    strArrSplit[0] = strArrSplit[0].trim();
                    strArrSplit[1] = strArrSplit[1].trim();
                    strA = qre.a(R.string.accessibility_range, strArrSplit[0], strArrSplit[1]);
                }
            }
            formattedValue = qre.a(R.string.IDS_two_parts, formattedValue, strA);
        }
        if (!TextUtils.isEmpty(strAcquireUnit) && !TextUtils.isEmpty(strA)) {
            formattedValue = qre.a(R.string.IDS_two_parts, formattedValue, strAcquireUnit);
        }
        abstractTouchNode.setDescription(formattedValue);
    }

    private void d(Canvas canvas, RectF rectF, Paint paint, Transformer transformer) {
        float[] fArr = {0.0f, 0.0f};
        transformer.pointValuesToPixel(fArr);
        float f = fArr[1];
        float fAbs = Math.abs(rectF.top - rectF.bottom);
        float fAbs2 = Math.abs(rectF.right - rectF.left);
        float fE = e(rectF, fAbs, fAbs2, f);
        if (fE < 1.0E-7f) {
            return;
        }
        float f2 = this.f ? 0.0f + (fAbs2 / 2.0f) : 0.0f;
        if (this.h) {
            f2 += fAbs2 / 2.0f;
        }
        if (fE < f2) {
            float f3 = (rectF.top + rectF.bottom) / 2.0f;
            float f4 = f2 / 2.0f;
            rectF.top = f3 - f4;
            rectF.bottom = f3 + f4;
            if (rectF.bottom > f) {
                float f5 = rectF.bottom - f;
                rectF.bottom -= f5;
                rectF.top -= f5;
            }
        }
        b(canvas, rectF, paint, rectF.bottom - rectF.top, fAbs2);
    }

    protected float e(RectF rectF, float f, float f2, float f3) {
        if (f >= 1.0E-7f || rectF.top != f3) {
            return f;
        }
        return 0.0f;
    }

    protected void b(Canvas canvas, RectF rectF, Paint paint, float f, float f2) {
        float f3;
        float f4;
        float f5;
        if (f <= 0.0f || !this.f) {
            f3 = f;
            f4 = 0.0f;
        } else {
            canvas.save();
            float f6 = f2 / 2.0f;
            canvas.clipRect(rectF.left, rectF.top, rectF.right, rectF.top + f6 + 1.0f);
            canvas.drawRoundRect(new RectF(rectF.left, rectF.top, rectF.right, rectF.top + f2), f6, f6, paint);
            f3 = f - f6;
            f4 = f6 + 0.0f;
            canvas.restore();
        }
        if (f3 <= 0.0f || !this.h) {
            f5 = 0.0f;
        } else {
            canvas.save();
            float f7 = f2 / 2.0f;
            canvas.clipRect(rectF.left, (rectF.bottom - f7) - 1.0f, rectF.right, rectF.bottom);
            canvas.drawRoundRect(new RectF(rectF.left, rectF.bottom - f2, rectF.right, rectF.bottom), f7, f7, paint);
            f3 -= f7;
            f5 = f7 + 0.0f;
            canvas.restore();
        }
        if (f3 > 0.0f) {
            canvas.drawRect(rectF.left, rectF.top + f4, rectF.right, rectF.bottom - f5, paint);
        }
    }

    protected void c(float f, float f2, float f3, float f4, Transformer transformer) {
        this.f46466a.set(f - f4, f2, f + f4, f3);
        transformer.rectToPixelPhase(this.f46466a, this.mAnimator.getPhaseY());
    }

    private boolean d() {
        HwHealthBarDataProvider hwHealthBarDataProvider = this.f46467b;
        if (hwHealthBarDataProvider == null || hwHealthBarDataProvider.getBarData() == null || !isDrawingValuesAllowed(this.f46467b)) {
            return false;
        }
        qno[] qnoVarArr = this.f46468c;
        if (qnoVarArr != null && qnoVarArr.length != 0) {
            return true;
        }
        LogUtil.j("HwHealthBarChartRenderer", "drawValues mBarBuffers == null || mBarBuffers.length == 0");
        return false;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        if (d()) {
            List<T> dataSets = this.f46467b.getBarData().getDataSets();
            float fConvertDpToPixel = Utils.convertDpToPixel(4.5f);
            boolean zIsDrawValueAboveBarEnabled = this.f46467b.isDrawValueAboveBarEnabled();
            float fCalcTextHeight = Utils.calcTextHeight(this.mValuePaint, "8");
            float f = zIsDrawValueAboveBarEnabled ? -fConvertDpToPixel : fCalcTextHeight + fConvertDpToPixel;
            float f2 = zIsDrawValueAboveBarEnabled ? fCalcTextHeight + fConvertDpToPixel : -fConvertDpToPixel;
            for (int i = 0; i < this.f46467b.getBarData().getDataSetCount(); i++) {
                IHwHealthBarDataSet iHwHealthBarDataSet = (IHwHealthBarDataSet) dataSets.get(i);
                if (shouldDrawValues(iHwHealthBarDataSet)) {
                    applyValueTextStyle(iHwHealthBarDataSet);
                    MPPointF mPPointF = MPPointF.getInstance(iHwHealthBarDataSet.getIconsOffset());
                    mPPointF.x = Utils.convertDpToPixel(mPPointF.x);
                    mPPointF.y = Utils.convertDpToPixel(mPPointF.y);
                    b(canvas, iHwHealthBarDataSet, this.f46468c[i], mPPointF, f, f2);
                    MPPointF.recycleInstance(mPPointF);
                }
            }
        }
    }

    private void b(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, BarBuffer barBuffer, MPPointF mPPointF, float f, float f2) {
        if (!iHwHealthBarDataSet.isStacked()) {
            for (int i = 0; i < barBuffer.buffer.length * this.mAnimator.getPhaseX(); i += 4) {
                float f3 = (barBuffer.buffer[i] + barBuffer.buffer[i + 2]) / 2.0f;
                if (!this.mViewPortHandler.isInBoundsRight(f3)) {
                    return;
                }
                int i2 = i + 1;
                if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i2]) && this.mViewPortHandler.isInBoundsLeft(f3)) {
                    int i3 = i / 4;
                    HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i3);
                    float f4 = hwHealthBarEntry.getY() >= 0.0f ? barBuffer.buffer[i2] + f : barBuffer.buffer[i + 3] + f2;
                    if (iHwHealthBarDataSet.isDrawValuesEnabled()) {
                        c(canvas, iHwHealthBarDataSet.getValueFormatter().getFormattedValue(hwHealthBarEntry.getY(), hwHealthBarEntry, i3, this.mViewPortHandler), f3, f4, iHwHealthBarDataSet.getValueTextColor(i3));
                    }
                    if (iHwHealthBarDataSet.isDrawIconsEnabled()) {
                        e(canvas, hwHealthBarEntry.getIcon(), mPPointF, f3, f4);
                    }
                }
            }
            return;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < iHwHealthBarDataSet.getEntryCount() * this.mAnimator.getPhaseX()) {
            float f5 = (barBuffer.buffer[i5] + barBuffer.buffer[i5 + 2]) / 2.0f;
            if (!this.mViewPortHandler.isInBoundsRight(f5)) {
                return;
            }
            int i6 = i5 + 1;
            if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i6]) && this.mViewPortHandler.isInBoundsLeft(f5)) {
                HwHealthBarEntry hwHealthBarEntry2 = (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i4);
                float f6 = barBuffer.buffer[i6] + (hwHealthBarEntry2.getY() >= 0.0f ? f : f2);
                if (iHwHealthBarDataSet.isDrawValuesEnabled()) {
                    c(canvas, iHwHealthBarDataSet.getValueFormatter().getFormattedValue(hwHealthBarEntry2.getY(), hwHealthBarEntry2, i4, this.mViewPortHandler), f5, f6, iHwHealthBarDataSet.getValueTextColor(i4));
                }
                if (iHwHealthBarDataSet.isDrawIconsEnabled()) {
                    e(canvas, hwHealthBarEntry2.getIcon(), mPPointF, f5, f6);
                }
                i5 += 4;
                i4++;
            }
        }
    }

    private void e(Canvas canvas, Drawable drawable, MPPointF mPPointF, float f, float f2) {
        if (drawable == null) {
            return;
        }
        Utils.drawImage(canvas, drawable, (int) (f + mPPointF.x), (int) (f2 + mPPointF.y), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        IHwHealthBarDataSet iHwHealthBarDataSet;
        if (this.j) {
            return;
        }
        qly barData = this.f46467b.getBarData();
        if (barData == null) {
            LogUtil.j("HwHealthBarChartRenderer", "drawHighlighted() barData is null!");
            return;
        }
        for (Highlight highlight : highlightArr) {
            if (barData.getDataSets() != null && (iHwHealthBarDataSet = (IHwHealthBarDataSet) barData.getDataSets().get(barData.getDataSets().size() - 1)) != null && iHwHealthBarDataSet.isHighlightEnabled()) {
                List<HwHealthBarEntry> entriesForXValue = iHwHealthBarDataSet.getEntriesForXValue(highlight.getX(), this.f46467b);
                if (njy.e(entriesForXValue)) {
                    return;
                }
                HwHealthBarEntry hwHealthBarEntry = entriesForXValue.get(0);
                if (isInBoundsX(hwHealthBarEntry, iHwHealthBarDataSet)) {
                    this.mHighlightPaint.setColor(d(hwHealthBarEntry, iHwHealthBarDataSet));
                    Transformer transformer = this.f46467b.getTransformer(iHwHealthBarDataSet.getAxisDependencyExt());
                    c(hwHealthBarEntry.getX(), qnn.d(hwHealthBarEntry.acquireModel()), qnn.b(hwHealthBarEntry.acquireModel()), (IHwHealthBarDataSet.BarWidthMode.DEFAULT_WIDTH.equals(iHwHealthBarDataSet.getBarDrawWidthMode()) ? barData.a() : iHwHealthBarDataSet.getBarDrawWidth(transformer)) / 2.0f, transformer);
                    c(highlight, this.f46466a);
                    d(canvas, this.f46466a, this.mHighlightPaint, transformer);
                }
            }
        }
    }

    protected void c(Highlight highlight, RectF rectF) {
        if (highlight == null || rectF == null) {
            LogUtil.j("HwHealthBarChartRenderer", "high == null||bar == null");
        } else {
            highlight.setDraw(rectF.centerX(), rectF.top);
        }
    }

    public HwHealthBarDataProvider e() {
        return this.f46467b;
    }

    public void usePaintAsBackground(boolean z) {
        this.j = z;
    }

    public boolean isUsePaintAsBackground() {
        return this.j;
    }

    private int b(IHwHealthBarDataSet iHwHealthBarDataSet) {
        if (this.j) {
            return qqn.b(BaseApplication.getContext(), R.color.health_chart_extend_background_color);
        }
        return iHwHealthBarDataSet.getColor();
    }

    private int d(HwHealthBarEntry hwHealthBarEntry, IHwHealthBarDataSet iHwHealthBarDataSet) {
        if (this.j) {
            return qqn.b(BaseApplication.getContext(), R.color.health_chart_extend_background_color);
        }
        return iHwHealthBarDataSet.acquireFocusColor(hwHealthBarEntry);
    }

    public boolean hasData() {
        qly barData = this.f46467b.getBarData();
        return barData != null && njy.b(barData.getDataSets());
    }

    public void d(boolean z, boolean z2) {
        this.f = z;
        this.h = z2;
    }

    @Override // com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public void focusArea(List<qmj> list) {
        throw new RuntimeException("pls not call bar's focusArea,no impl");
    }

    @Override // com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public void disableFocusArea() {
        throw new RuntimeException("pls not call bar's disableFocusArea,no impl");
    }

    public void c(Canvas canvas, String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }
}
