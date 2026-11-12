package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
public class ukk extends qmm {
    private static final String[] i = {"60", "70", "80", "85", "90", "95", "100"};

    public ukk(Context context, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        super(context, viewPortHandler, yAxis, transformer, hwHealthBaseBarLineChart);
        this.d = context;
        this.f46486a = hwHealthBaseBarLineChart;
        this.f46487b = new qng();
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public float[] getTransformedPositions() {
        return super.getTransformedPositions();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d9  */
    @Override // defpackage.qmm, com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        int gridColor;
        int iE;
        if (this.mYAxis == null || !this.mYAxis.isEnabled()) {
            return;
        }
        if (this.mYAxis.isDrawGridLinesEnabled()) {
            canvas.clipRect(new RectF(0.0f, 0.0f, this.mViewPortHandler.getChartWidth(), this.mViewPortHandler.getChartHeight()));
            this.mGridPaint.setColor(this.mYAxis.getGridColor());
            this.mGridPaint.setStrokeWidth(qqp.a(this.d, 0.5f));
            Path path = this.mRenderGridLinesPath;
            path.reset();
            float[] transformedPositions = getTransformedPositions();
            boolean z = true;
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{qqp.a(this.d, 2.0f), qqp.a(this.d, 1.0f)}, 0.0f);
            for (int i2 = 0; i2 < transformedPositions.length; i2 += 2) {
                int i3 = i2 + 1;
                if (i3 >= transformedPositions.length || transformedPositions[i3] <= this.f46486a.getContentRect().bottom) {
                    if (this.mYAxis.getAxisMinimum() <= 70.0f) {
                        float f = this.mYAxis.mEntries[i2 / 2];
                        if (f != 95.0f && f != 85.0f) {
                            if (z) {
                                this.mGridPaint.setPathEffect(null);
                                z = false;
                            } else {
                                this.mGridPaint.setPathEffect(dashPathEffect);
                            }
                            gridColor = this.mYAxis.getGridColor();
                            if (((HwHealthYAxis) this.mYAxis).a()) {
                                iE = Color.argb(13, Color.red(gridColor), Color.green(gridColor), Color.blue(gridColor));
                            } else {
                                iE = ((HwHealthYAxis) this.mYAxis).e();
                            }
                            this.mGridPaint.setColor(iE);
                            canvas.drawPath(linePath(path, i2, transformedPositions), this.mGridPaint);
                            path.reset();
                            this.mGridPaint.setColor(gridColor);
                        }
                    } else {
                        if (z) {
                            this.mGridPaint.setPathEffect(null);
                            z = false;
                        } else {
                            this.mGridPaint.setPathEffect(dashPathEffect);
                        }
                        gridColor = this.mYAxis.getGridColor();
                        if (((HwHealthYAxis) this.mYAxis).a()) {
                            iE = Color.argb(13, Color.red(gridColor), Color.green(gridColor), Color.blue(gridColor));
                        } else {
                            iE = ((HwHealthYAxis) this.mYAxis).e();
                        }
                        this.mGridPaint.setColor(iE);
                        canvas.drawPath(linePath(path, i2, transformedPositions), this.mGridPaint);
                        path.reset();
                        this.mGridPaint.setColor(gridColor);
                    }
                }
            }
        }
        if (this.mYAxis.isDrawZeroLineEnabled()) {
            drawZeroLine(canvas);
        }
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
        if (this.mYAxis == null || this.mAxisLabelPaint == null || !this.mYAxis.isDrawLabelsEnabled() || !this.mYAxis.isEnabled()) {
            return;
        }
        this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
        this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
        HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependencyB = ((HwHealthYAxis) this.mYAxis).b();
        if (hwHealthAxisDependencyB == HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY) {
            return;
        }
        float requiredWidthSpace = ((HwHealthYAxis) this.mAxis).getRequiredWidthSpace(null);
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
            this.mAxisLabelPaint.setTextAlign(Paint.Align.LEFT);
            fOffsetLeft = this.mViewPortHandler.offsetLeft() - requiredWidthSpace;
        } else if (z4 || z) {
            this.mAxisLabelPaint.setTextAlign(Paint.Align.RIGHT);
            fOffsetLeft = this.mViewPortHandler.contentRight() + requiredWidthSpace;
        } else {
            LogUtil.a("BloodOxygenAxisRenderer", "dependency = ", hwHealthAxisDependencyB, "isDrawReverse = ", Boolean.valueOf(zE));
            fOffsetLeft = 0.0f;
        }
        drawYLabels(canvas, fOffsetLeft, getTransformedPositions(), (Utils.calcTextHeight(this.mAxisLabelPaint, "A") / 2.5f) + this.mYAxis.getYOffset());
    }

    @Override // defpackage.qmm, com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxis(float f, float f2, boolean z) {
        this.mYAxis.mEntries = tvs.b();
        this.mYAxis.mEntryCount = this.mYAxis.mEntries.length;
    }

    @Override // defpackage.qmm, com.github.mikephil.charting.renderer.YAxisRenderer
    public void drawYLabels(Canvas canvas, float f, float[] fArr, float f2) {
        float fB = b();
        int i2 = 0;
        while (true) {
            String[] strArr = i;
            if (i2 >= strArr.length) {
                return;
            }
            int i3 = (i2 * 2) + 1;
            if (fArr[i3] < this.f46486a.getContentRect().bottom) {
                float f3 = this.mYAxis.mEntries[i2];
                if (this.mYAxis.getAxisMinimum() > 70.0f || (f3 != 95.0f && f3 != 85.0f)) {
                    String strE = strArr[i2] + "%";
                    if (LanguageUtil.c(this.d) || LanguageUtil.x(this.d)) {
                        strE = UnitUtil.e(CommonUtil.n(this.d, strArr[i2]), 2, 0);
                    }
                    if (LanguageUtil.br(this.d) || LanguageUtil.z(this.d)) {
                        strE = strArr[i2] + "%";
                    }
                    if (LanguageUtil.v(this.d)) {
                        strE = "%" + strArr[i2];
                    }
                    canvas.drawText(strE, f, fArr[i3] + fB, this.mAxisLabelPaint);
                }
            }
            i2++;
        }
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
                LogUtil.a("BloodOxygenAxisRenderer", "dependency = ", hwHealthAxisDependencyB, ",isDrawReverse = ", Boolean.valueOf(zE));
            }
        }
    }

    @Override // defpackage.qmm
    public float c() {
        return this.f;
    }

    @Override // defpackage.qmm
    public void e() {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            if (((HwHealthYAxis) this.mYAxis).b() == HwHealthYAxis.HwHealthAxisDependency.THIRD_PARTY) {
                return;
            }
            Rect rect = new Rect();
            String formattedValue = this.mYAxis.getValueFormatter().getFormattedValue(this.f, this.mYAxis);
            LogUtil.a("BloodOxygenAxisRenderer", "considerGridLinesAndManualRefLine() manualText = ", formattedValue);
            this.mAxisLabelPaint.getTextBounds(formattedValue, 0, formattedValue.length(), rect);
            this.mTrans.pointValuesToPixel(new float[]{0.0f, this.f});
        }
    }
}
