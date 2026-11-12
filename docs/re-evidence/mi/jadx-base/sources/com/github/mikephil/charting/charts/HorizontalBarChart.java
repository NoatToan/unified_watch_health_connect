package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import defpackage.drr;
import defpackage.fmq;
import defpackage.gpc;
import defpackage.jac;
import defpackage.kac;
import defpackage.r7c;
import defpackage.rac;
import defpackage.ryp;
import defpackage.syp;
import defpackage.utr;
import defpackage.w02;
import defpackage.wye;

/* JADX INFO: loaded from: classes4.dex */
public class HorizontalBarChart extends BarChart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RectF f7772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f7773b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7775b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[Legend.LegendOrientation.values().length];
            c = iArr;
            try {
                iArr[Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Legend.LegendHorizontalAlignment.values().length];
            f7775b = iArr2;
            try {
                iArr2[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7775b[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7775b[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
            f7774a = iArr3;
            try {
                iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7774a[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public HorizontalBarChart(Context context) {
        super(context);
        this.f7772a = new RectF();
        this.f7773b = new float[2];
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void calculateLegendOffsets(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        Legend legend = this.mLegend;
        if (legend == null || !legend.isEnabled() || this.mLegend.v()) {
            return;
        }
        int i = a.c[this.mLegend.q().ordinal()];
        if (i == 1) {
            int i2 = a.f7775b[this.mLegend.m().ordinal()];
            if (i2 == 1) {
                rectF.left += Math.min(this.mLegend.f7786r, this.mViewPortHandler.n() * this.mLegend.n()) + this.mLegend.getXOffset();
                return;
            }
            if (i2 == 2) {
                rectF.right += Math.min(this.mLegend.f7786r, this.mViewPortHandler.n() * this.mLegend.n()) + this.mLegend.getXOffset();
                return;
            }
            if (i2 != 3) {
                return;
            }
            int i3 = a.f7774a[this.mLegend.s().ordinal()];
            if (i3 == 1) {
                rectF.top += Math.min(this.mLegend.s, this.mViewPortHandler.m() * this.mLegend.n()) + this.mLegend.getYOffset();
                return;
            } else {
                if (i3 != 2) {
                    return;
                }
                rectF.bottom += Math.min(this.mLegend.s, this.mViewPortHandler.m() * this.mLegend.n()) + this.mLegend.getYOffset();
                return;
            }
        }
        if (i != 2) {
            return;
        }
        int i4 = a.f7774a[this.mLegend.s().ordinal()];
        if (i4 == 1) {
            rectF.top += Math.min(this.mLegend.s, this.mViewPortHandler.m() * this.mLegend.n()) + this.mLegend.getYOffset();
            if (this.mAxisLeft.isEnabled() && this.mAxisLeft.isDrawLabelsEnabled()) {
                rectF.top += this.mAxisLeft.f(this.mAxisRendererLeft.getPaintAxisLabels());
                return;
            }
            return;
        }
        if (i4 != 2) {
            return;
        }
        rectF.bottom += Math.min(this.mLegend.s, this.mViewPortHandler.m() * this.mLegend.n()) + this.mLegend.getYOffset();
        if (this.mAxisRight.isEnabled() && this.mAxisRight.isDrawLabelsEnabled()) {
            rectF.bottom += this.mAxisRight.f(this.mAxisRendererRight.getPaintAxisLabels());
        }
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        calculateLegendOffsets(this.f7772a);
        RectF rectF = this.f7772a;
        float f = rectF.left + 0.0f;
        float f2 = rectF.top + 0.0f;
        float f3 = rectF.right + 0.0f;
        float f4 = rectF.bottom + 0.0f;
        if (this.mAxisLeft.p()) {
            f2 += this.mAxisLeft.f(this.mAxisRendererLeft.getPaintAxisLabels());
        }
        if (this.mAxisRight.p()) {
            f4 += this.mAxisRight.f(this.mAxisRendererRight.getPaintAxisLabels());
        }
        XAxis xAxis = this.mXAxis;
        float f5 = xAxis.mLabelRotatedWidth;
        if (xAxis.isEnabled()) {
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                f += f5;
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP) {
                f3 += f5;
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                f += f5;
                f3 += f5;
            }
        }
        float extraTopOffset = f2 + getExtraTopOffset();
        float extraRightOffset = f3 + getExtraRightOffset();
        float extraBottomOffset = f4 + getExtraBottomOffset();
        float extraLeftOffset = f + getExtraLeftOffset();
        float fE = fmq.e(this.mMinOffset);
        this.mViewPortHandler.N(Math.max(fE, extraLeftOffset), Math.max(fE, extraTopOffset), Math.max(fE, extraRightOffset), Math.max(fE, extraBottomOffset));
        if (this.mLogEnabled) {
            StringBuilder sb = new StringBuilder();
            sb.append("offsetLeft: ");
            sb.append(extraLeftOffset);
            sb.append(", offsetTop: ");
            sb.append(extraTopOffset);
            sb.append(", offsetRight: ");
            sb.append(extraRightOffset);
            sb.append(", offsetBottom: ");
            sb.append(extraBottomOffset);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Content: ");
            sb2.append(this.mViewPortHandler.p().toString());
        }
        prepareOffsetMatrix();
        prepareValuePxMatrix();
    }

    @Override // com.github.mikephil.charting.charts.BarChart
    public void getBarBounds(BarEntry barEntry, RectF rectF) {
        gpc gpcVar = (gpc) ((w02) this.mData).k(barEntry);
        if (gpcVar == null) {
            rectF.set(Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
            return;
        }
        float y = barEntry.getY();
        float x = barEntry.getX();
        float fY = ((w02) this.mData).y() / 2.0f;
        float f = x - fY;
        float f2 = x + fY;
        float f3 = y >= 0.0f ? y : 0.0f;
        if (y > 0.0f) {
            y = 0.0f;
        }
        rectF.set(f3, f, y, f2);
        getTransformer(gpcVar.m0()).p(rectF);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, defpackage.b12
    public float getHighestVisibleX() {
        getTransformer(YAxis.AxisDependency.LEFT).h(this.mViewPortHandler.h(), this.mViewPortHandler.j(), this.posForGetHighestVisibleX);
        return (float) Math.min(this.mXAxis.mAxisMaximum, this.posForGetHighestVisibleX.d);
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.Chart
    public r7c getHighlightByTouchPoint(float f, float f2) {
        if (this.mData == 0) {
            return null;
        }
        return getHighlighter().a(f2, f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, defpackage.b12
    public float getLowestVisibleX() {
        getTransformer(YAxis.AxisDependency.LEFT).h(this.mViewPortHandler.h(), this.mViewPortHandler.f(), this.posForGetLowestVisibleX);
        return (float) Math.max(this.mXAxis.mAxisMinimum, this.posForGetLowestVisibleX.d);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public float[] getMarkerPosition(r7c r7cVar) {
        return new float[]{r7cVar.f(), r7cVar.e()};
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public wye getPosition(Entry entry, YAxis.AxisDependency axisDependency) {
        if (entry == null) {
            return null;
        }
        float[] fArr = this.f7773b;
        fArr[0] = entry.getY();
        fArr[1] = entry.getX();
        getTransformer(axisDependency).k(fArr);
        return wye.c(fArr[0], fArr[1]);
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        this.mViewPortHandler = new rac();
        super.init();
        this.mLeftAxisTransformer = new syp(this.mViewPortHandler);
        this.mRightAxisTransformer = new syp(this.mViewPortHandler);
        this.mRenderer = new jac(this, this.mAnimator, this.mViewPortHandler);
        setHighlighter(new kac(this));
        this.mAxisRendererLeft = new utr(this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new utr(this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new drr(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer, this);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void prepareValuePxMatrix() {
        ryp rypVar = this.mRightAxisTransformer;
        YAxis yAxis = this.mAxisRight;
        float f = yAxis.mAxisMinimum;
        float f2 = yAxis.mAxisRange;
        XAxis xAxis = this.mXAxis;
        rypVar.m(f, f2, xAxis.mAxisRange, xAxis.mAxisMinimum);
        ryp rypVar2 = this.mLeftAxisTransformer;
        YAxis yAxis2 = this.mAxisLeft;
        float f3 = yAxis2.mAxisMinimum;
        float f4 = yAxis2.mAxisRange;
        XAxis xAxis2 = this.mXAxis;
        rypVar2.m(f3, f4, xAxis2.mAxisRange, xAxis2.mAxisMinimum);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRange(float f, float f2) {
        float f3 = this.mXAxis.mAxisRange;
        this.mViewPortHandler.U(f3 / f, f3 / f2);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMaximum(float f) {
        this.mViewPortHandler.W(this.mXAxis.mAxisRange / f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMinimum(float f) {
        this.mViewPortHandler.S(this.mXAxis.mAxisRange / f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRange(float f, float f2, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.T(getAxisRange(axisDependency) / f, getAxisRange(axisDependency) / f2);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRangeMaximum(float f, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.V(getAxisRange(axisDependency) / f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRangeMinimum(float f, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.R(getAxisRange(axisDependency) / f);
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7772a = new RectF();
        this.f7773b = new float[2];
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7772a = new RectF();
        this.f7773b = new float[2];
    }
}
