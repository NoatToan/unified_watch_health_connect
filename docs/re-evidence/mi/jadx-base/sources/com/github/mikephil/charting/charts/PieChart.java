package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import defpackage.cwc;
import defpackage.dn5;
import defpackage.fmq;
import defpackage.hwh;
import defpackage.iwh;
import defpackage.kwh;
import defpackage.r7c;
import defpackage.wye;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PieChart extends PieRadarChartBase<iwh> {
    public RectF e;
    public boolean f;
    public float[] g;
    public float[] h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7776k;
    public boolean l;
    public CharSequence m;
    public wye n;
    public float o;
    public float p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f7777r;
    public float s;
    public float t;

    public PieChart(Context context) {
        super(context);
        this.e = new RectF();
        this.f = true;
        this.g = new float[1];
        this.h = new float[1];
        this.i = true;
        this.j = false;
        this.f7776k = false;
        this.l = false;
        this.m = "";
        this.n = wye.c(0.0f, 0.0f);
        this.o = 50.0f;
        this.p = 55.0f;
        this.q = true;
        this.f7777r = 100.0f;
        this.s = 360.0f;
        this.t = 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public int c(float f) {
        float fQ = fmq.q(f - getRotationAngle());
        int i = 0;
        while (true) {
            float[] fArr = this.h;
            if (i >= fArr.length) {
                return -1;
            }
            if (fArr[i] > fQ) {
                return i;
            }
            i++;
        }
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void calcMinMax() {
        h();
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        super.calculateOffsets();
        if (this.mData == 0) {
            return;
        }
        float diameter = getDiameter() / 2.0f;
        wye centerOffsets = getCenterOffsets();
        float fS = ((iwh) this.mData).y().s();
        RectF rectF = this.e;
        float f = centerOffsets.c;
        float f2 = centerOffsets.d;
        rectF.set((f - diameter) + fS, (f2 - diameter) + fS, (f + diameter) - fS, (f2 + diameter) - fS);
        wye.f(centerOffsets);
    }

    public final float g(float f, float f2) {
        return (f / f2) * this.s;
    }

    public float[] getAbsoluteAngles() {
        return this.h;
    }

    public wye getCenterCircleBox() {
        return wye.c(this.e.centerX(), this.e.centerY());
    }

    public CharSequence getCenterText() {
        return this.m;
    }

    public wye getCenterTextOffset() {
        wye wyeVar = this.n;
        return wye.c(wyeVar.c, wyeVar.d);
    }

    public float getCenterTextRadiusPercent() {
        return this.f7777r;
    }

    public RectF getCircleBox() {
        return this.e;
    }

    public float[] getDrawAngles() {
        return this.g;
    }

    public float getHoleRadius() {
        return this.o;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public float[] getMarkerPosition(r7c r7cVar) {
        wye centerCircleBox = getCenterCircleBox();
        float radius = getRadius();
        float holeRadius = (radius / 10.0f) * 3.6f;
        if (k()) {
            holeRadius = (radius - ((radius / 100.0f) * getHoleRadius())) / 2.0f;
        }
        float f = radius - holeRadius;
        float rotationAngle = getRotationAngle();
        int iH = (int) r7cVar.h();
        float f2 = this.g[iH] / 2.0f;
        double d = f;
        float fCos = (float) ((Math.cos(Math.toRadians(((this.h[iH] + rotationAngle) - f2) * this.mAnimator.i())) * d) + ((double) centerCircleBox.c));
        float fSin = (float) ((d * Math.sin(Math.toRadians(((rotationAngle + this.h[iH]) - f2) * this.mAnimator.i()))) + ((double) centerCircleBox.d));
        wye.f(centerCircleBox);
        return new float[]{fCos, fSin};
    }

    public float getMaxAngle() {
        return this.s;
    }

    public float getMinAngleForSlices() {
        return this.t;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        RectF rectF = this.e;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, this.e.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredBaseOffset() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredLegendOffset() {
        return this.mLegendRenderer.d().getTextSize() * 2.0f;
    }

    public float getTransparentCircleRadius() {
        return this.p;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    @Deprecated
    public XAxis getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    public final void h() {
        int iM = ((iwh) this.mData).m();
        if (this.g.length != iM) {
            this.g = new float[iM];
        } else {
            for (int i = 0; i < iM; i++) {
                this.g[i] = 0.0f;
            }
        }
        if (this.h.length != iM) {
            this.h = new float[iM];
        } else {
            for (int i2 = 0; i2 < iM; i2++) {
                this.h[i2] = 0.0f;
            }
        }
        float fA = ((iwh) this.mData).A();
        List<cwc> listL = ((iwh) this.mData).l();
        float f = this.t;
        boolean z = f != 0.0f && ((float) iM) * f <= this.s;
        float[] fArr = new float[iM];
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < ((iwh) this.mData).j(); i4++) {
            cwc cwcVar = listL.get(i4);
            for (int i5 = 0; i5 < cwcVar.O0(); i5++) {
                float fG = g(Math.abs(cwcVar.i(i5).getY()), fA);
                if (z) {
                    float f4 = this.t;
                    float f5 = fG - f4;
                    if (f5 <= 0.0f) {
                        fArr[i3] = f4;
                        f2 += -f5;
                    } else {
                        fArr[i3] = fG;
                        f3 += f5;
                    }
                }
                this.g[i3] = fG;
                if (i3 == 0) {
                    this.h[i3] = fG;
                } else {
                    float[] fArr2 = this.h;
                    fArr2[i3] = fArr2[i3 - 1] + fG;
                }
                i3++;
            }
        }
        if (z) {
            for (int i6 = 0; i6 < iM; i6++) {
                float f6 = fArr[i6];
                float f7 = f6 - (((f6 - this.t) / f3) * f2);
                fArr[i6] = f7;
                if (i6 == 0) {
                    this.h[0] = fArr[0];
                } else {
                    float[] fArr3 = this.h;
                    fArr3[i6] = fArr3[i6 - 1] + f7;
                }
            }
            this.g = fArr;
        }
    }

    public boolean i() {
        return this.q;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new hwh(this, this.mAnimator, this.mViewPortHandler);
        this.mXAxis = null;
        this.mHighlighter = new kwh(this);
    }

    public boolean j() {
        return this.f;
    }

    public boolean k() {
        return this.i;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.j;
    }

    public boolean n() {
        return this.f7776k;
    }

    public boolean o(int i) {
        if (!valuesToHighlight()) {
            return false;
        }
        int i2 = 0;
        while (true) {
            r7c[] r7cVarArr = this.mIndicesToHighlight;
            if (i2 >= r7cVarArr.length) {
                return false;
            }
            if (((int) r7cVarArr[i2].h()) == i) {
                return true;
            }
            i2++;
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        dn5 dn5Var = this.mRenderer;
        if (dn5Var != null && (dn5Var instanceof hwh)) {
            ((hwh) dn5Var).releaseBitmap();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        this.mRenderer.drawData(canvas);
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
        }
        this.mRenderer.drawExtras(canvas);
        this.mRenderer.drawValues(canvas);
        this.mLegendRenderer.e(canvas);
        drawDescription(canvas);
        drawMarkers(canvas);
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.m = "";
        } else {
            this.m = charSequence;
        }
    }

    public void setCenterTextColor(int i) {
        ((hwh) this.mRenderer).f().setColor(i);
    }

    public void setCenterTextRadiusPercent(float f) {
        this.f7777r = f;
    }

    public void setCenterTextSize(float f) {
        ((hwh) this.mRenderer).f().setTextSize(fmq.e(f));
    }

    public void setCenterTextSizePixels(float f) {
        ((hwh) this.mRenderer).f().setTextSize(f);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((hwh) this.mRenderer).f().setTypeface(typeface);
    }

    public void setDrawCenterText(boolean z) {
        this.q = z;
    }

    public void setDrawEntryLabels(boolean z) {
        this.f = z;
    }

    public void setDrawHoleEnabled(boolean z) {
        this.i = z;
    }

    public void setDrawRoundedSlices(boolean z) {
        this.l = z;
    }

    @Deprecated
    public void setDrawSliceText(boolean z) {
        this.f = z;
    }

    public void setDrawSlicesUnderHole(boolean z) {
        this.j = z;
    }

    public void setEntryLabelColor(int i) {
        ((hwh) this.mRenderer).g().setColor(i);
    }

    public void setEntryLabelTextSize(float f) {
        ((hwh) this.mRenderer).g().setTextSize(fmq.e(f));
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((hwh) this.mRenderer).g().setTypeface(typeface);
    }

    public void setHoleColor(int i) {
        ((hwh) this.mRenderer).h().setColor(i);
    }

    public void setHoleRadius(float f) {
        this.o = f;
    }

    public void setMaxAngle(float f) {
        if (f > 360.0f) {
            f = 360.0f;
        }
        if (f < 90.0f) {
            f = 90.0f;
        }
        this.s = f;
    }

    public void setMinAngleForSlices(float f) {
        float f2 = this.s;
        if (f > f2 / 2.0f) {
            f = f2 / 2.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.t = f;
    }

    public void setTransparentCircleAlpha(int i) {
        ((hwh) this.mRenderer).i().setAlpha(i);
    }

    public void setTransparentCircleColor(int i) {
        Paint paintI = ((hwh) this.mRenderer).i();
        int alpha = paintI.getAlpha();
        paintI.setColor(i);
        paintI.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f) {
        this.p = f;
    }

    public void setUsePercentValues(boolean z) {
        this.f7776k = z;
    }

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new RectF();
        this.f = true;
        this.g = new float[1];
        this.h = new float[1];
        this.i = true;
        this.j = false;
        this.f7776k = false;
        this.l = false;
        this.m = "";
        this.n = wye.c(0.0f, 0.0f);
        this.o = 50.0f;
        this.p = 55.0f;
        this.q = true;
        this.f7777r = 100.0f;
        this.s = 360.0f;
        this.t = 0.0f;
    }

    public PieChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new RectF();
        this.f = true;
        this.g = new float[1];
        this.h = new float[1];
        this.i = true;
        this.j = false;
        this.f7776k = false;
        this.l = false;
        this.m = "";
        this.n = wye.c(0.0f, 0.0f);
        this.o = 50.0f;
        this.p = 55.0f;
        this.q = true;
        this.f7777r = 100.0f;
        this.s = 360.0f;
        this.t = 0.0f;
    }
}
