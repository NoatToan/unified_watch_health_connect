package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.c;
import defpackage.erc;
import defpackage.fmq;
import defpackage.fu3;
import defpackage.wye;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PieRadarChartBase<T extends fu3<? extends erc<? extends Entry>>> extends Chart<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f7778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f7779b;
    public boolean c;
    public float d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7781b;
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
            f7781b = iArr2;
            try {
                iArr2[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7781b[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7781b[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
            f7780a = iArr3;
            try {
                iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7780a[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public PieRadarChartBase(Context context) {
        super(context);
        this.f7778a = 270.0f;
        this.f7779b = 270.0f;
        this.c = true;
        this.d = 0.0f;
    }

    public float a(float f, float f2) {
        wye centerOffsets = getCenterOffsets();
        float f3 = centerOffsets.c;
        float f4 = f > f3 ? f - f3 : f3 - f;
        float f5 = centerOffsets.d;
        float fSqrt = (float) Math.sqrt(Math.pow(f4, 2.0d) + Math.pow(f2 > f5 ? f2 - f5 : f5 - f2, 2.0d));
        wye.f(centerOffsets);
        return fSqrt;
    }

    public float b(float f, float f2) {
        wye centerOffsets = getCenterOffsets();
        double d = f - centerOffsets.c;
        double d2 = f2 - centerOffsets.d;
        float degrees = (float) Math.toDegrees(Math.acos(d2 / Math.sqrt((d * d) + (d2 * d2))));
        if (f > centerOffsets.c) {
            degrees = 360.0f - degrees;
        }
        float f3 = degrees + 90.0f;
        if (f3 > 360.0f) {
            f3 -= 360.0f;
        }
        wye.f(centerOffsets);
        return f3;
    }

    public abstract int c(float f);

    @Override // com.github.mikephil.charting.charts.Chart
    public void calcMinMax() {
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        float requiredBaseOffset;
        float requiredBaseOffset2;
        float requiredBaseOffset3;
        float fE;
        float f;
        float f2;
        float fMin;
        Legend legend = this.mLegend;
        float requiredBaseOffset4 = 0.0f;
        if (legend == null || !legend.isEnabled() || this.mLegend.v()) {
            requiredBaseOffset = 0.0f;
            requiredBaseOffset2 = 0.0f;
            requiredBaseOffset3 = 0.0f;
        } else {
            float fMin2 = Math.min(this.mLegend.f7786r, this.mViewPortHandler.n() * this.mLegend.n());
            int i = a.c[this.mLegend.q().ordinal()];
            if (i != 1) {
                if (i == 2 && (this.mLegend.s() == Legend.LegendVerticalAlignment.TOP || this.mLegend.s() == Legend.LegendVerticalAlignment.BOTTOM)) {
                    fMin = Math.min(this.mLegend.s + getRequiredLegendOffset(), this.mViewPortHandler.m() * this.mLegend.n());
                    int i2 = a.f7780a[this.mLegend.s().ordinal()];
                    if (i2 == 1) {
                        f2 = fMin;
                        fE = 0.0f;
                        f = 0.0f;
                    } else if (i2 == 2) {
                        f = fMin;
                        fE = 0.0f;
                        f2 = 0.0f;
                    }
                }
                fE = 0.0f;
                f = 0.0f;
                f2 = f;
            } else {
                if (this.mLegend.m() != Legend.LegendHorizontalAlignment.LEFT && this.mLegend.m() != Legend.LegendHorizontalAlignment.RIGHT) {
                    fE = 0.0f;
                } else if (this.mLegend.s() == Legend.LegendVerticalAlignment.CENTER) {
                    fE = fMin2 + fmq.e(13.0f);
                } else {
                    fE = fMin2 + fmq.e(8.0f);
                    Legend legend2 = this.mLegend;
                    float f3 = legend2.s + legend2.t;
                    wye center = getCenter();
                    float width = this.mLegend.m() == Legend.LegendHorizontalAlignment.RIGHT ? (getWidth() - fE) + 15.0f : fE - 15.0f;
                    float f4 = f3 + 15.0f;
                    float fA = a(width, f4);
                    wye wyeVarD = d(center, getRadius(), b(width, f4));
                    float fA2 = a(wyeVarD.c, wyeVarD.d);
                    float fE2 = fmq.e(5.0f);
                    if (f4 < center.d || getHeight() - fE <= getWidth()) {
                        fE = fA < fA2 ? fE2 + (fA2 - fA) : 0.0f;
                    }
                    wye.f(center);
                    wye.f(wyeVarD);
                }
                int i3 = a.f7781b[this.mLegend.m().ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            int i4 = a.f7780a[this.mLegend.s().ordinal()];
                            if (i4 == 1) {
                                fMin = Math.min(this.mLegend.s, this.mViewPortHandler.m() * this.mLegend.n());
                                f2 = fMin;
                                fE = 0.0f;
                                f = 0.0f;
                            } else if (i4 == 2) {
                                fMin = Math.min(this.mLegend.s, this.mViewPortHandler.m() * this.mLegend.n());
                                f = fMin;
                                fE = 0.0f;
                                f2 = 0.0f;
                            }
                        }
                        fE = 0.0f;
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                    }
                    f2 = f;
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                    requiredBaseOffset4 = fE;
                    fE = 0.0f;
                }
            }
            requiredBaseOffset4 += getRequiredBaseOffset();
            requiredBaseOffset = fE + getRequiredBaseOffset();
            requiredBaseOffset3 = f2 + getRequiredBaseOffset();
            requiredBaseOffset2 = f + getRequiredBaseOffset();
        }
        float fE3 = fmq.e(this.d);
        if (this instanceof RadarChart) {
            XAxis xAxis = getXAxis();
            if (xAxis.isEnabled() && xAxis.isDrawLabelsEnabled()) {
                fE3 = Math.max(fE3, xAxis.mLabelRotatedWidth);
            }
        }
        float extraTopOffset = requiredBaseOffset3 + getExtraTopOffset();
        float extraRightOffset = requiredBaseOffset + getExtraRightOffset();
        float extraBottomOffset = requiredBaseOffset2 + getExtraBottomOffset();
        float fMax = Math.max(fE3, requiredBaseOffset4 + getExtraLeftOffset());
        float fMax2 = Math.max(fE3, extraTopOffset);
        float fMax3 = Math.max(fE3, extraRightOffset);
        float fMax4 = Math.max(fE3, Math.max(getRequiredBaseOffset(), extraBottomOffset));
        this.mViewPortHandler.N(fMax, fMax2, fMax3, fMax4);
        if (this.mLogEnabled) {
            StringBuilder sb = new StringBuilder();
            sb.append("offsetLeft: ");
            sb.append(fMax);
            sb.append(", offsetTop: ");
            sb.append(fMax2);
            sb.append(", offsetRight: ");
            sb.append(fMax3);
            sb.append(", offsetBottom: ");
            sb.append(fMax4);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener instanceof c) {
            ((c) chartTouchListener).g();
        }
    }

    public wye d(wye wyeVar, float f, float f2) {
        wye wyeVarC = wye.c(0.0f, 0.0f);
        e(wyeVar, f, f2, wyeVarC);
        return wyeVarC;
    }

    public void e(wye wyeVar, float f, float f2, wye wyeVar2) {
        double d = f;
        double d2 = f2;
        wyeVar2.c = (float) (((double) wyeVar.c) + (Math.cos(Math.toRadians(d2)) * d));
        wyeVar2.d = (float) (((double) wyeVar.d) + (d * Math.sin(Math.toRadians(d2))));
    }

    public boolean f() {
        return this.c;
    }

    public float getDiameter() {
        RectF rectFP = this.mViewPortHandler.p();
        rectFP.left += getExtraLeftOffset();
        rectFP.top += getExtraTopOffset();
        rectFP.right -= getExtraRightOffset();
        rectFP.bottom -= getExtraBottomOffset();
        return Math.min(rectFP.width(), rectFP.height());
    }

    @Override // com.github.mikephil.charting.charts.Chart, defpackage.hu3
    public int getMaxVisibleCount() {
        return this.mData.m();
    }

    public float getMinOffset() {
        return this.d;
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.f7779b;
    }

    public abstract float getRequiredBaseOffset();

    public abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
        return this.f7778a;
    }

    @Override // com.github.mikephil.charting.charts.Chart, defpackage.hu3
    public float getYChartMax() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart, defpackage.hu3
    public float getYChartMin() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mChartTouchListener = new c(this);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == null) {
            return;
        }
        calcMinMax();
        if (this.mLegend != null) {
            this.mLegendRenderer.a(this.mData);
        }
        calculateOffsets();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChartTouchListener chartTouchListener;
        return (!this.mTouchEnabled || (chartTouchListener = this.mChartTouchListener) == null) ? super.onTouchEvent(motionEvent) : chartTouchListener.onTouch(this, motionEvent);
    }

    public void setMinOffset(float f) {
        this.d = f;
    }

    public void setRotationAngle(float f) {
        this.f7779b = f;
        this.f7778a = fmq.q(f);
    }

    public void setRotationEnabled(boolean z) {
        this.c = z;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7778a = 270.0f;
        this.f7779b = 270.0f;
        this.c = true;
        this.d = 0.0f;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7778a = 270.0f;
        this.f7779b = 270.0f;
        this.c = true;
        this.d = 0.0f;
    }
}
