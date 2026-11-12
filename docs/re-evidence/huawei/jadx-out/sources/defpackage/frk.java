package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.TypedValue;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet;

/* JADX INFO: loaded from: classes7.dex */
public class frk extends qmm {
    private static boolean i = true;
    private int k;
    private boolean l;
    private String[] m;
    private Paint o;

    public frk(Context context, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        super(context, viewPortHandler, yAxis, transformer, hwHealthBaseBarLineChart);
        this.l = false;
        this.d = context;
        this.f46486a = hwHealthBaseBarLineChart;
        this.f46487b = new qng();
    }

    public static void d(boolean z) {
        i = z;
    }

    private boolean f() {
        return i;
    }

    @Override // defpackage.qmm, com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        if (this.mYAxis.isEnabled()) {
            if (this.mYAxis.isDrawGridLinesEnabled()) {
                canvas.clipRect(new RectF(0.0f, 0.0f, this.mViewPortHandler.getChartWidth(), this.mViewPortHandler.getChartHeight()));
                this.mGridPaint.setColor(this.mYAxis.getGridColor());
                this.mGridPaint.setStrokeWidth(this.mYAxis.getGridLineWidth());
                this.mGridPaint.setPathEffect(this.mYAxis.getGridDashPathEffect());
                Path path = this.mRenderGridLinesPath;
                path.reset();
                d(canvas, path);
                canvas.restoreToCount(canvas.save());
            }
            if (this.mYAxis.isDrawZeroLineEnabled()) {
                drawZeroLine(canvas);
            }
        }
    }

    private void d(Canvas canvas, Path path) {
        float xOffset;
        float xOffset2;
        if (this.l) {
            this.mGridPaint.setColor(this.g);
            float[] fArr = {0.0f, this.k};
            this.mTrans.pointValuesToPixel(fArr);
            if (this.o != null) {
                canvas.drawPath(b(path, fArr[1]), this.o);
            } else {
                canvas.drawPath(b(path, fArr[1]), this.mGridPaint);
            }
            path.reset();
            if (f()) {
                int color = this.d.getResources().getColor(R.color.health_chart_default_line_color);
                this.mGridPaint.setPathEffect(null);
                this.mGridPaint.setColor(color);
                HwHealthYAxis axisFirstParty = this.f46486a.getAxisFirstParty();
                HwHealthYAxis axisSecondParty = this.f46486a.getAxisSecondParty();
                if (!this.e) {
                    xOffset2 = axisFirstParty.getXOffset() + 0.0f;
                    xOffset = axisSecondParty.getXOffset() + 0.0f;
                } else {
                    float xOffset3 = axisSecondParty.getXOffset() + 0.0f;
                    xOffset = axisFirstParty.getXOffset() + 0.0f;
                    xOffset2 = xOffset3;
                }
                float fConvertDpToPixel = Utils.convertDpToPixel(16.0f);
                Path path2 = new Path();
                path2.moveTo(xOffset2 + fConvertDpToPixel, this.f46486a.getViewPortHandler().contentBottom());
                path2.lineTo((this.mViewPortHandler.getChartWidth() - xOffset) - fConvertDpToPixel, this.f46486a.getViewPortHandler().contentBottom());
                canvas.drawPath(path2, this.mGridPaint);
                path.reset();
                this.mGridPaint.setPathEffect(this.mYAxis.getGridDashPathEffect());
                this.mGridPaint.setColor(this.mYAxis.getGridColor());
            }
        }
    }

    @Override // defpackage.qmm, com.github.mikephil.charting.renderer.YAxisRenderer
    public Path linePath(Path path, int i2, float[] fArr) {
        return b(path, fArr[i2 + 1]);
    }

    @Override // defpackage.qmm
    protected Path b(Path path, float f) {
        float xOffset;
        float xOffset2;
        HwHealthYAxis axisFirstParty = this.f46486a.getAxisFirstParty();
        HwHealthYAxis axisSecondParty = this.f46486a.getAxisSecondParty();
        float fConvertDpToPixel = Utils.convertDpToPixel(16.0f);
        float fConvertDpToPixel2 = Utils.convertDpToPixel(16.0f);
        if (!this.e) {
            xOffset = fConvertDpToPixel + axisFirstParty.getXOffset();
            xOffset2 = axisSecondParty.getXOffset();
        } else {
            xOffset = fConvertDpToPixel + axisSecondParty.getXOffset();
            xOffset2 = axisFirstParty.getXOffset();
        }
        float fConvertDpToPixel3 = Utils.convertDpToPixel(0.0f);
        path.moveTo(xOffset + fConvertDpToPixel3, f);
        path.lineTo((this.mViewPortHandler.getChartWidth() - (fConvertDpToPixel2 + xOffset2)) - fConvertDpToPixel3, f);
        return path;
    }

    @Override // defpackage.qmm
    protected float b() {
        return TypedValue.applyDimension(1, 5.0f, this.d.getResources().getDisplayMetrics()) * (-1.0f);
    }

    @Override // defpackage.qmm, com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        float fOffsetLeft;
        float fContentLeft;
        float fConvertDpToPixel;
        if (this.mAxis.getAxisMaximum() != 2000000.0f && this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependencyB = ((HwHealthYAxis) this.mYAxis).b();
            if (hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY) {
                return;
            }
            float requiredWidthSpace = ((HwHealthYAxis) this.mAxis).getRequiredWidthSpace(null);
            boolean zE = qmh.e(this.d);
            boolean z = false;
            boolean z2 = zE || this.e;
            boolean z3 = hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY && !z2;
            boolean z4 = hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY && z2;
            boolean z5 = hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY && !z2;
            if (hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY && z2) {
                z = true;
            }
            if (z3 || z4) {
                this.mAxisLabelPaint.setTextAlign(Paint.Align.LEFT);
                fOffsetLeft = (this.mViewPortHandler.offsetLeft() - requiredWidthSpace) + Utils.convertDpToPixel(16.0f);
            } else if (z5 || z) {
                if (!zE) {
                    this.mAxisLabelPaint.setTextAlign(Paint.Align.RIGHT);
                    fContentLeft = this.mViewPortHandler.contentRight() + requiredWidthSpace;
                    fConvertDpToPixel = Utils.convertDpToPixel(16.0f);
                } else {
                    this.mAxisLabelPaint.setTextAlign(Paint.Align.LEFT);
                    fContentLeft = this.mViewPortHandler.contentLeft();
                    fConvertDpToPixel = Utils.convertDpToPixel(10.0f);
                }
                fOffsetLeft = fContentLeft - fConvertDpToPixel;
            } else {
                LogUtil.a("SleepYAxisRenderer", "dependency = ", hwHealthAxisDependencyB, "isDrawReverse = ", Boolean.valueOf(z2));
                fOffsetLeft = 0.0f;
            }
            a(canvas, fOffsetLeft);
        }
    }

    private void a(Canvas canvas, float f) {
        String formattedValue;
        if (!this.l || this.k == Integer.MIN_VALUE) {
            return;
        }
        Rect rect = new Rect();
        String[] strArr = this.m;
        if (strArr != null && strArr.length != 0) {
            if (TextUtils.isEmpty(strArr[0])) {
                formattedValue = "";
            } else {
                formattedValue = this.m[0];
            }
        } else {
            formattedValue = this.mYAxis.getValueFormatter().getFormattedValue(this.k, this.mYAxis);
        }
        this.mAxisLabelPaint.getTextBounds(formattedValue, 0, formattedValue.length(), rect);
        float[] fArr = {0.0f, this.k};
        this.mTrans.pointValuesToPixel(fArr);
        float fB = b();
        float f2 = fArr[1];
        if (this.o != null) {
            this.mAxisLabelPaint.setColor(this.o.getColor());
        } else {
            String[] strArr2 = this.m;
            if (strArr2 != null && strArr2.length != 0) {
                this.mAxisLabelPaint.setColor(this.d.getResources().getColor(R.color.textColorSecondary));
                this.mAxisLabelPaint.setTextSize(e(10.0f));
            } else {
                this.mAxisLabelPaint.setColor(this.g);
            }
        }
        Paint.FontMetrics fontMetrics = this.mAxisLabelPaint.getFontMetrics();
        Math.ceil(fontMetrics.descent - fontMetrics.ascent);
        qme qmeVar = (qme) this.f46486a.getData().getDataSets().get(0);
        if (this.k != 0) {
            ObserverManagerUtil.e("SLEEP_AVERAGE_ICON_OFFSET", Float.valueOf(fArr[1] - 0.5f), qmeVar.e());
        } else {
            ObserverManagerUtil.e("SLEEP_AVERAGE_ICON_OFFSET", Float.valueOf(0.0f), qmeVar.e());
        }
        canvas.drawText(formattedValue, f, f2 + fB, this.mAxisLabelPaint);
    }

    private int e(float f) {
        return (int) ((this.d.getResources().getDisplayMetrics().density * f) + ((f >= 0.0f ? 1 : -1) * 0.5f));
    }

    @Override // defpackage.qmm
    public void c(boolean z) {
        this.e = z;
    }

    @Override // defpackage.qmm, com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLine(Canvas canvas) {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawAxisLineEnabled()) {
            this.mAxisLinePaint.setColor(this.mYAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mYAxis.getAxisLineWidth());
            if (((HwHealthYAxis) this.mYAxis).b() == HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY) {
                return;
            }
            HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependencyB = ((HwHealthYAxis) this.mYAxis).b();
            boolean zE = qmh.e(this.d);
            if (this.e) {
                zE = !zE;
            }
            boolean z = false;
            boolean z2 = hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY && !zE;
            boolean z3 = hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY && zE;
            boolean z4 = hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY && !zE;
            if (hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY && zE) {
                z = true;
            }
            if (z2 || z3) {
                canvas.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            } else if (z4 || z) {
                canvas.drawLine(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            } else {
                LogUtil.a("SleepYAxisRenderer", "dependency = ", hwHealthAxisDependencyB, ",isDrawReverse = ", Boolean.valueOf(zE));
            }
        }
    }

    @Override // defpackage.qmm, com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxis(float f, float f2, boolean z) {
        if (Math.abs(f2 - Float.MAX_VALUE) < 1.0E-7f || Math.abs(Float.MAX_VALUE + f) < 1.0E-7f) {
            super.computeAxis(f, f2, z);
            return;
        }
        HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependencyB = ((HwHealthYAxis) this.mAxis).b();
        HwHealthBaseBarLineData hwHealthBaseBarLineData = (HwHealthBaseBarLineData) this.f46486a.getData();
        if (hwHealthAxisDependencyB == null || hwHealthBaseBarLineData == null) {
            LogUtil.e("R_Sleep_SleepYAxisRenderer", "computeAxis dependency null or chart chartData null, return");
            return;
        }
        IHwHealthBarLineDataSet dataSet = hwHealthBaseBarLineData.getDataSet(hwHealthAxisDependencyB);
        if (dataSet == null) {
            super.computeAxis(f, f2, z);
            return;
        }
        this.mAxis.setLabelCount(dataSet.getLabelCount(), true);
        super.computeAxis(f, f2, z);
    }

    public void a(int i2, int i3, String... strArr) {
        this.l = true;
        this.k = i2;
        this.g = i3;
        this.m = strArr;
    }

    @Override // defpackage.qmm
    public void c(int i2, Paint paint) {
        this.l = true;
        this.k = i2;
        this.o = paint;
    }

    @Override // defpackage.qmm
    public void e_() {
        this.l = false;
        this.o = null;
    }

    @Override // defpackage.qmm
    public boolean h() {
        return this.l;
    }

    @Override // defpackage.qmm
    public float c() {
        return this.k;
    }

    @Override // defpackage.qmm
    public void e() {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled() && this.mAxis.getAxisMaximum() != 2000000.0f && this.l) {
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            if (((HwHealthYAxis) this.mYAxis).b() == HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY) {
                return;
            }
            Rect rect = new Rect();
            String formattedValue = this.mYAxis.getValueFormatter().getFormattedValue(this.k, this.mYAxis);
            this.mAxisLabelPaint.getTextBounds(formattedValue, 0, formattedValue.length(), rect);
            this.mTrans.pointValuesToPixel(new float[]{0.0f, this.k});
        }
    }

    @Override // defpackage.qmm
    public float a() {
        return this.k;
    }
}
