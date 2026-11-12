package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.Fill;
import com.xiaomi.smarthome.framework.api.UserConfig;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class u02 extends d12 {
    protected Paint mBarBorderPaint;
    protected p02[] mBarBuffers;
    protected RectF mBarRect;
    private RectF mBarShadowRectBuffer;
    protected x02 mChart;
    protected Paint mShadowPaint;

    public u02(x02 x02Var, cu3 cu3Var, hwq hwqVar) {
        super(cu3Var, hwqVar);
        this.mBarRect = new RectF();
        this.mBarShadowRectBuffer = new RectF();
        this.mChart = x02Var;
        Paint paint = new Paint(1);
        this.mHighlightPaint = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.mHighlightPaint.setColor(Color.rgb(0, 0, 0));
        this.mHighlightPaint.setAlpha(120);
        Paint paint2 = new Paint(1);
        this.mShadowPaint = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.mBarBorderPaint = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // defpackage.dn5
    public void drawData(Canvas canvas) {
        w02 barData = this.mChart.getBarData();
        for (int i = 0; i < barData.j(); i++) {
            gpc gpcVar = (gpc) barData.i(i);
            if (gpcVar.isVisible()) {
                drawDataSet(canvas, gpcVar, i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawDataSet(Canvas canvas, gpc gpcVar, int i) {
        ryp transformer = this.mChart.getTransformer(gpcVar.m0());
        this.mBarBorderPaint.setColor(gpcVar.Y());
        this.mBarBorderPaint.setStrokeWidth(fmq.e(gpcVar.E()));
        int i2 = 0;
        boolean z = gpcVar.E() > 0.0f;
        float fH = this.mAnimator.h();
        float fI = this.mAnimator.i();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(gpcVar.F0());
            float fY = this.mChart.getBarData().y() / 2.0f;
            int iMin = Math.min((int) Math.ceil(gpcVar.O0() * fH), gpcVar.O0());
            for (int i3 = 0; i3 < iMin; i3++) {
                float x = ((BarEntry) gpcVar.i(i3)).getX();
                RectF rectF = this.mBarShadowRectBuffer;
                rectF.left = x - fY;
                rectF.right = x + fY;
                transformer.p(rectF);
                if (this.mViewPortHandler.B(this.mBarShadowRectBuffer.right)) {
                    if (!this.mViewPortHandler.C(this.mBarShadowRectBuffer.left)) {
                        break;
                    }
                    this.mBarShadowRectBuffer.top = this.mViewPortHandler.j();
                    this.mBarShadowRectBuffer.bottom = this.mViewPortHandler.f();
                    canvas.drawRect(this.mBarShadowRectBuffer, this.mShadowPaint);
                }
            }
        }
        p02 p02Var = this.mBarBuffers[i];
        p02Var.b(fH, fI);
        p02Var.g(i);
        p02Var.h(this.mChart.isInverted(gpcVar.m0()));
        p02Var.f(this.mChart.getBarData().y());
        p02Var.e(gpcVar);
        transformer.k(p02Var.f16108b);
        boolean z2 = (gpcVar.a() == null || gpcVar.a().isEmpty()) ? false : true;
        boolean z3 = gpcVar.i0().size() == 1;
        boolean zIsInverted = this.mChart.isInverted(gpcVar.m0());
        if (z3) {
            this.mRenderPaint.setColor(gpcVar.n0());
        }
        int i4 = 0;
        while (i2 < p02Var.c()) {
            int i5 = i2 + 2;
            if (this.mViewPortHandler.B(p02Var.f16108b[i5])) {
                if (!this.mViewPortHandler.C(p02Var.f16108b[i2])) {
                    return;
                }
                if (!z3) {
                    this.mRenderPaint.setColor(gpcVar.E0(i4));
                }
                if (z2) {
                    Fill fillB0 = gpcVar.b0(i4);
                    Paint paint = this.mRenderPaint;
                    float[] fArr = p02Var.f16108b;
                    fillB0.a(canvas, paint, fArr[i2], fArr[i2 + 1], fArr[i5], fArr[i2 + 3], zIsInverted ? Fill.Direction.DOWN : Fill.Direction.UP);
                } else {
                    float[] fArr2 = p02Var.f16108b;
                    canvas.drawRect(fArr2[i2], fArr2[i2 + 1], fArr2[i5], fArr2[i2 + 3], this.mRenderPaint);
                }
                if (z) {
                    float[] fArr3 = p02Var.f16108b;
                    canvas.drawRect(fArr3[i2], fArr3[i2 + 1], fArr3[i5], fArr3[i2 + 3], this.mBarBorderPaint);
                }
            }
            i2 += 4;
            i4++;
        }
    }

    @Override // defpackage.dn5
    public void drawExtras(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dn5
    public void drawHighlighted(Canvas canvas, r7c[] r7cVarArr) {
        float y;
        float f;
        float f2;
        float f3;
        w02 barData = this.mChart.getBarData();
        for (r7c r7cVar : r7cVarArr) {
            gpc gpcVar = (gpc) barData.i(r7cVar.d());
            if (gpcVar != null && gpcVar.R()) {
                BarEntry barEntry = (BarEntry) gpcVar.v0(r7cVar.h(), r7cVar.j());
                if (isInBoundsX(barEntry, gpcVar)) {
                    ryp transformer = this.mChart.getTransformer(gpcVar.m0());
                    this.mHighlightPaint.setColor(gpcVar.N0());
                    this.mHighlightPaint.setAlpha(gpcVar.L0());
                    if (r7cVar.g() < 0 || !barEntry.isStacked()) {
                        y = barEntry.getY();
                        f = 0.0f;
                    } else {
                        if (this.mChart.isHighlightFullBarEnabled()) {
                            y = barEntry.getPositiveSum();
                            f = -barEntry.getNegativeSum();
                        } else {
                            pbj pbjVar = barEntry.getRanges()[r7cVar.g()];
                            f3 = pbjVar.f30209a;
                            f2 = pbjVar.f30210b;
                        }
                        prepareBarHighlight(barEntry.getX(), f3, f2, barData.y() / 2.0f, transformer);
                        setHighlightDrawPos(r7cVar, this.mBarRect);
                        canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                    }
                    f2 = f;
                    f3 = y;
                    prepareBarHighlight(barEntry.getX(), f3, f2, barData.y() / 2.0f, transformer);
                    setHighlightDrawPos(r7cVar, this.mBarRect);
                    canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dn5
    public void drawValues(Canvas canvas) {
        wye wyeVar;
        List list;
        float f;
        float f2;
        float f3;
        float f4;
        boolean z;
        float f5;
        if (isDrawingValuesAllowed(this.mChart)) {
            List listL = this.mChart.getBarData().l();
            float fE = fmq.e(4.5f);
            boolean zIsDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i = 0;
            while (i < this.mChart.getBarData().j()) {
                gpc gpcVar = (gpc) listL.get(i);
                if (shouldDrawValues(gpcVar)) {
                    applyValueTextStyle(gpcVar);
                    boolean zIsInverted = this.mChart.isInverted(gpcVar.m0());
                    float fA = fmq.a(this.mValuePaint, UserConfig.KEY_MI_BRAIN_SETTING);
                    float f6 = zIsDrawValueAboveBarEnabled ? -fE : fA + fE;
                    float f7 = zIsDrawValueAboveBarEnabled ? fA + fE : -fE;
                    if (zIsInverted) {
                        f6 = (-f6) - fA;
                        f7 = (-f7) - fA;
                    }
                    float f8 = f6;
                    float f9 = f7;
                    p02 p02Var = this.mBarBuffers[i];
                    float fI = this.mAnimator.i();
                    wye wyeVarD = wye.d(gpcVar.P0());
                    wyeVarD.c = fmq.e(wyeVarD.c);
                    wyeVarD.d = fmq.e(wyeVarD.d);
                    if (gpcVar.N()) {
                        wyeVar = wyeVarD;
                        list = listL;
                        ryp transformer = this.mChart.getTransformer(gpcVar.m0());
                        int i2 = 0;
                        int length = 0;
                        while (i2 < gpcVar.O0() * this.mAnimator.h()) {
                            BarEntry barEntry = (BarEntry) gpcVar.i(i2);
                            float[] yVals = barEntry.getYVals();
                            float[] fArr = p02Var.f16108b;
                            float f10 = (fArr[length] + fArr[length + 2]) / 2.0f;
                            int iN = gpcVar.n(i2);
                            if (yVals != null) {
                                i2 = i2;
                                fE = fE;
                                zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                                yVals = yVals;
                                transformer = transformer;
                                float f11 = f10;
                                int length2 = yVals.length * 2;
                                float[] fArr2 = new float[length2];
                                float f12 = -barEntry.getNegativeSum();
                                float f13 = 0.0f;
                                int i3 = 0;
                                int i4 = 0;
                                while (i3 < length2) {
                                    float f14 = yVals[i4];
                                    if (f14 == 0.0f && (f13 == 0.0f || f12 == 0.0f)) {
                                        float f15 = f12;
                                        f12 = f14;
                                        f2 = f15;
                                    } else if (f14 >= 0.0f) {
                                        f13 += f14;
                                        f2 = f12;
                                        f12 = f13;
                                    } else {
                                        f2 = f12 - f14;
                                    }
                                    fArr2[i3 + 1] = f12 * fI;
                                    i3 += 2;
                                    i4++;
                                    f12 = f2;
                                }
                                transformer.k(fArr2);
                                int i5 = 0;
                                while (i5 < length2) {
                                    int i6 = i5 / 2;
                                    float f16 = yVals[i6];
                                    float f17 = fArr2[i5 + 1] + (((f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1)) == 0 && (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1)) == 0 && (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1)) > 0) || (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1)) < 0 ? f9 : f8);
                                    if (!this.mViewPortHandler.C(f11)) {
                                        break;
                                    }
                                    if (this.mViewPortHandler.F(f17) && this.mViewPortHandler.B(f11)) {
                                        if (gpcVar.l0()) {
                                            f = f17;
                                            drawValue(canvas, gpcVar.d0(), yVals[i6], barEntry, i, f11, f, iN);
                                        } else {
                                            f = f17;
                                        }
                                        if (barEntry.getIcon() != null && gpcVar.D()) {
                                            Drawable icon = barEntry.getIcon();
                                            fmq.f(canvas, icon, (int) (f11 + wyeVar.c), (int) (f + wyeVar.d), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                        }
                                    } else {
                                        i5 = i5;
                                        fArr2 = fArr2;
                                        length2 = length2;
                                        f11 = f11;
                                    }
                                    i5 += 2;
                                    fArr2 = fArr2;
                                    length2 = length2;
                                    f11 = f11;
                                }
                            } else {
                                if (!this.mViewPortHandler.C(f10)) {
                                    break;
                                }
                                int i7 = length + 1;
                                if (this.mViewPortHandler.F(p02Var.f16108b[i7]) && this.mViewPortHandler.B(f10)) {
                                    if (gpcVar.l0()) {
                                        f3 = f10;
                                        drawValue(canvas, gpcVar.d0(), barEntry.getY(), barEntry, i, f3, p02Var.f16108b[i7] + (barEntry.getY() >= 0.0f ? f8 : f9), iN);
                                    } else {
                                        f3 = f10;
                                    }
                                    if (barEntry.getIcon() != null && gpcVar.D()) {
                                        Drawable icon2 = barEntry.getIcon();
                                        fmq.f(canvas, icon2, (int) (f3 + wyeVar.c), (int) (p02Var.f16108b[i7] + (barEntry.getY() >= 0.0f ? f8 : f9) + wyeVar.d), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                    }
                                } else {
                                    transformer = transformer;
                                    zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                                    fE = fE;
                                    i2 = i2;
                                }
                            }
                            length = yVals == null ? length + 4 : length + (yVals.length * 4);
                            i2++;
                            transformer = transformer;
                            zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                            fE = fE;
                        }
                    } else {
                        int i8 = 0;
                        while (i8 < p02Var.f16108b.length * this.mAnimator.h()) {
                            float[] fArr3 = p02Var.f16108b;
                            float f18 = (fArr3[i8] + fArr3[i8 + 2]) / 2.0f;
                            if (!this.mViewPortHandler.C(f18)) {
                                break;
                            }
                            int i9 = i8 + 1;
                            if (this.mViewPortHandler.F(p02Var.f16108b[i9]) && this.mViewPortHandler.B(f18)) {
                                int i10 = i8 / 4;
                                Entry entry = (BarEntry) gpcVar.i(i10);
                                float y = entry.getY();
                                if (gpcVar.l0()) {
                                    f5 = f18;
                                    drawValue(canvas, gpcVar.d0(), y, entry, i, f5, y >= 0.0f ? p02Var.f16108b[i9] + f8 : p02Var.f16108b[i8 + 3] + f9, gpcVar.n(i10));
                                } else {
                                    f5 = f18;
                                }
                                if (entry.getIcon() != null && gpcVar.D()) {
                                    Drawable icon3 = entry.getIcon();
                                    fmq.f(canvas, icon3, (int) (f5 + wyeVarD.c), (int) ((y >= 0.0f ? p02Var.f16108b[i9] + f8 : p02Var.f16108b[i8 + 3] + f9) + wyeVarD.d), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                }
                            } else {
                                i8 = i8;
                                wyeVarD = wyeVarD;
                                listL = listL;
                                p02Var = p02Var;
                            }
                            i8 += 4;
                            p02Var = p02Var;
                            wyeVarD = wyeVarD;
                            listL = listL;
                        }
                        wyeVar = wyeVarD;
                        list = listL;
                    }
                    f4 = fE;
                    z = zIsDrawValueAboveBarEnabled;
                    wye.f(wyeVar);
                } else {
                    list = listL;
                    f4 = fE;
                    z = zIsDrawValueAboveBarEnabled;
                }
                i++;
                listL = list;
                zIsDrawValueAboveBarEnabled = z;
                fE = f4;
            }
        }
    }

    @Override // defpackage.dn5
    public void initBuffers() {
        w02 barData = this.mChart.getBarData();
        this.mBarBuffers = new p02[barData.j()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            gpc gpcVar = (gpc) barData.i(i);
            this.mBarBuffers[i] = new p02(gpcVar.O0() * 4 * (gpcVar.N() ? gpcVar.o() : 1), barData.j(), gpcVar.N());
        }
    }

    public void prepareBarHighlight(float f, float f2, float f3, float f4, ryp rypVar) {
        this.mBarRect.set(f - f4, f2, f + f4, f3);
        rypVar.n(this.mBarRect, this.mAnimator.i());
    }

    public void setHighlightDrawPos(r7c r7cVar, RectF rectF) {
        r7cVar.m(rectF.centerX(), rectF.top);
    }
}
