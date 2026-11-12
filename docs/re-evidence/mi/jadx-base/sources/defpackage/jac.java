package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.Fill;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jac extends u02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RectF f22588a;

    public jac(x02 x02Var, cu3 cu3Var, hwq hwqVar) {
        super(x02Var, cu3Var, hwqVar);
        this.f22588a = new RectF();
        this.mValuePaint.setTextAlign(Paint.Align.LEFT);
    }

    public void a(Canvas canvas, String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.u02
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
                RectF rectF = this.f22588a;
                rectF.top = x - fY;
                rectF.bottom = x + fY;
                transformer.p(rectF);
                if (this.mViewPortHandler.D(this.f22588a.bottom)) {
                    if (!this.mViewPortHandler.A(this.f22588a.top)) {
                        break;
                    }
                    this.f22588a.left = this.mViewPortHandler.h();
                    this.f22588a.right = this.mViewPortHandler.i();
                    canvas.drawRect(this.f22588a, this.mShadowPaint);
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
            int i5 = i2 + 3;
            if (!this.mViewPortHandler.D(p02Var.f16108b[i5])) {
                return;
            }
            int i6 = i2 + 1;
            if (this.mViewPortHandler.A(p02Var.f16108b[i6])) {
                if (!z3) {
                    this.mRenderPaint.setColor(gpcVar.E0(i2 / 4));
                }
                if (z2) {
                    Fill fillB0 = gpcVar.b0(i4);
                    Paint paint = this.mRenderPaint;
                    float[] fArr = p02Var.f16108b;
                    fillB0.a(canvas, paint, fArr[i2], fArr[i6], fArr[i2 + 2], fArr[i5], zIsInverted ? Fill.Direction.LEFT : Fill.Direction.RIGHT);
                } else {
                    float[] fArr2 = p02Var.f16108b;
                    canvas.drawRect(fArr2[i2], fArr2[i6], fArr2[i2 + 2], fArr2[i5], this.mRenderPaint);
                }
                if (z) {
                    float[] fArr3 = p02Var.f16108b;
                    canvas.drawRect(fArr3[i2], fArr3[i6], fArr3[i2 + 2], fArr3[i5], this.mBarBorderPaint);
                }
            }
            i2 += 4;
            i4++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:154:0x03cd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not found block with instruction: 0x00f8: MOVE (r3v15 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    @Override // defpackage.u02, defpackage.dn5
    public void drawValues(Canvas canvas) {
        List list;
        wye wyeVar;
        float[] fArr;
        float f;
        if (isDrawingValuesAllowed(this.mChart)) {
            List listL = this.mChart.getBarData().l();
            float fE = fmq.e(5.0f);
            boolean zIsDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i = 0;
            while (i < this.mChart.getBarData().j()) {
                gpc gpcVar = (gpc) listL.get(i);
                if (shouldDrawValues(gpcVar)) {
                    boolean zIsInverted = this.mChart.isInverted(gpcVar.m0());
                    applyValueTextStyle(gpcVar);
                    float f2 = 2.0f;
                    float fA = fmq.a(this.mValuePaint, b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD) / 2.0f;
                    k0d k0dVarD0 = gpcVar.d0();
                    p02 p02Var = this.mBarBuffers[i];
                    float fI = this.mAnimator.i();
                    wye wyeVarD = wye.d(gpcVar.P0());
                    wyeVarD.c = fmq.e(wyeVarD.c);
                    wyeVarD.d = fmq.e(wyeVarD.d);
                    if (gpcVar.N()) {
                        list = listL;
                        wyeVar = wyeVarD;
                        ryp transformer = this.mChart.getTransformer(gpcVar.m0());
                        int i2 = 0;
                        int length = 0;
                        while (i2 < gpcVar.O0() * this.mAnimator.h()) {
                            BarEntry barEntry = (BarEntry) gpcVar.i(i2);
                            int iN = gpcVar.n(i2);
                            float[] yVals = barEntry.getYVals();
                            if (yVals == null) {
                                int i3 = length + 1;
                                if (!this.mViewPortHandler.D(p02Var.f16108b[i3])) {
                                    break;
                                }
                                if (this.mViewPortHandler.E(p02Var.f16108b[length]) && this.mViewPortHandler.A(p02Var.f16108b[i3])) {
                                    String strA = k0dVarD0.a(barEntry.getY(), barEntry, i, this.mViewPortHandler);
                                    float fD = fmq.d(this.mValuePaint, strA);
                                    float f3 = zIsDrawValueAboveBarEnabled ? fE : -(fD + fE);
                                    fArr = yVals;
                                    float f4 = zIsDrawValueAboveBarEnabled ? -(fD + fE) : fE;
                                    if (zIsInverted) {
                                        f3 = (-f3) - fD;
                                        f4 = (-f4) - fD;
                                    }
                                    float f5 = f3;
                                    float f6 = f4;
                                    if (gpcVar.l0()) {
                                        a(canvas, strA, p02Var.f16108b[length + 2] + (barEntry.getY() >= 0.0f ? f5 : f6), p02Var.f16108b[i3] + fA, iN);
                                    }
                                    if (barEntry.getIcon() != null && gpcVar.D()) {
                                        Drawable icon = barEntry.getIcon();
                                        float f7 = p02Var.f16108b[length + 2];
                                        if (barEntry.getY() < 0.0f) {
                                            f5 = f6;
                                        }
                                        fmq.f(canvas, icon, (int) (f7 + f5 + wyeVar.c), (int) (p02Var.f16108b[i3] + wyeVar.d), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                    }
                                }
                            } else {
                                i2 = i2;
                                zIsInverted = zIsInverted;
                                fArr = yVals;
                                int length2 = fArr.length * 2;
                                float[] fArr2 = new float[length2];
                                float f8 = -barEntry.getNegativeSum();
                                float f9 = 0.0f;
                                int i4 = 0;
                                int i5 = 0;
                                while (i4 < length2) {
                                    float f10 = fArr[i5];
                                    if (f10 == 0.0f && (f9 == 0.0f || f8 == 0.0f)) {
                                        float f11 = f8;
                                        f8 = f10;
                                        f = f11;
                                    } else if (f10 >= 0.0f) {
                                        f9 += f10;
                                        f = f8;
                                        f8 = f9;
                                    } else {
                                        f = f8 - f10;
                                    }
                                    fArr2[i4] = f8 * fI;
                                    i4 += 2;
                                    i5++;
                                    f8 = f;
                                }
                                transformer.k(fArr2);
                                int i6 = 0;
                                while (true) {
                                    if (i6 < length2) {
                                        float f12 = fArr[i6 / 2];
                                        String strA2 = k0dVarD0.a(f12, barEntry, i, this.mViewPortHandler);
                                        float fD2 = fmq.d(this.mValuePaint, strA2);
                                        float f13 = zIsDrawValueAboveBarEnabled ? fE : -(fD2 + fE);
                                        int i7 = length2;
                                        float f14 = zIsDrawValueAboveBarEnabled ? -(fD2 + fE) : fE;
                                        if (zIsInverted) {
                                            f13 = (-f13) - fD2;
                                            f14 = (-f14) - fD2;
                                        }
                                        boolean z = (f12 == 0.0f && f8 == 0.0f && f9 > 0.0f) || f12 < 0.0f;
                                        float f15 = fArr2[i6];
                                        if (z) {
                                            f13 = f14;
                                        }
                                        float f16 = f15 + f13;
                                        float[] fArr3 = p02Var.f16108b;
                                        float f17 = (fArr3[length + 1] + fArr3[length + 3]) / 2.0f;
                                        if (!this.mViewPortHandler.D(f17)) {
                                            break;
                                        }
                                        if (this.mViewPortHandler.E(f16) && this.mViewPortHandler.A(f17)) {
                                            if (gpcVar.l0()) {
                                                a(canvas, strA2, f16, f17 + fA, iN);
                                            }
                                            if (barEntry.getIcon() != null && gpcVar.D()) {
                                                Drawable icon2 = barEntry.getIcon();
                                                fmq.f(canvas, icon2, (int) (f16 + wyeVar.c), (int) (f17 + wyeVar.d), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                            }
                                        } else {
                                            i6 = i6;
                                            fArr2 = fArr2;
                                        }
                                        i6 += 2;
                                        length2 = i7;
                                        fArr2 = fArr2;
                                    }
                                }
                                if (fArr == null) {
                                    length += 4;
                                } else {
                                    length += fArr.length * 4;
                                }
                                i2++;
                                zIsInverted = zIsInverted;
                            }
                            if (fArr == null) {
                                length += 4;
                            } else {
                                length += fArr.length * 4;
                            }
                            i2++;
                            zIsInverted = zIsInverted;
                        }
                    } else {
                        int i8 = 0;
                        while (i8 < p02Var.f16108b.length * this.mAnimator.h()) {
                            float[] fArr4 = p02Var.f16108b;
                            int i9 = i8 + 1;
                            float f18 = fArr4[i9];
                            float f19 = (fArr4[i8 + 3] + f18) / f2;
                            if (!this.mViewPortHandler.D(f18)) {
                                break;
                            }
                            if (this.mViewPortHandler.E(p02Var.f16108b[i8]) && this.mViewPortHandler.A(p02Var.f16108b[i9])) {
                                BarEntry barEntry2 = (BarEntry) gpcVar.i(i8 / 4);
                                float y = barEntry2.getY();
                                String strA3 = k0dVarD0.a(y, barEntry2, i, this.mViewPortHandler);
                                float fD3 = fmq.d(this.mValuePaint, strA3);
                                float f20 = zIsDrawValueAboveBarEnabled ? fE : -(fD3 + fE);
                                float f21 = zIsDrawValueAboveBarEnabled ? -(fD3 + fE) : fE;
                                float[] fArr5 = p02Var.f16108b;
                                int i10 = i8 + 2;
                                float f22 = f21 - (fArr5[i10] - fArr5[i8]);
                                if (zIsInverted) {
                                    f20 = (-f20) - fD3;
                                    f22 = (-f22) - fD3;
                                }
                                float f23 = f20;
                                float f24 = f22;
                                if (gpcVar.l0()) {
                                    a(canvas, strA3, (y >= 0.0f ? f23 : f24) + p02Var.f16108b[i10], f19 + fA, gpcVar.n(i8 / 2));
                                }
                                if (barEntry2.getIcon() != null && gpcVar.D()) {
                                    Drawable icon3 = barEntry2.getIcon();
                                    float f25 = p02Var.f16108b[i10];
                                    if (y < 0.0f) {
                                        f23 = f24;
                                    }
                                    fmq.f(canvas, icon3, (int) (f25 + f23 + r20.c), (int) (f19 + r20.d), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                }
                            } else {
                                i8 = i8;
                                p02Var = p02Var;
                                listL = listL;
                                fA = fA;
                                k0dVarD0 = k0dVarD0;
                            }
                            i8 += 4;
                            wyeVarD = wyeVarD;
                            p02Var = p02Var;
                            k0dVarD0 = k0dVarD0;
                            listL = listL;
                            fA = fA;
                            f2 = 2.0f;
                        }
                        list = listL;
                        wyeVar = wyeVarD;
                    }
                    wye.f(wyeVar);
                } else {
                    list = listL;
                }
                i++;
                listL = list;
            }
        }
    }

    @Override // defpackage.u02, defpackage.dn5
    public void initBuffers() {
        w02 barData = this.mChart.getBarData();
        this.mBarBuffers = new iac[barData.j()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            gpc gpcVar = (gpc) barData.i(i);
            this.mBarBuffers[i] = new iac(gpcVar.O0() * 4 * (gpcVar.N() ? gpcVar.o() : 1), barData.j(), gpcVar.N());
        }
    }

    @Override // defpackage.dn5
    public boolean isDrawingValuesAllowed(hu3 hu3Var) {
        return ((float) hu3Var.getData().m()) < ((float) hu3Var.getMaxVisibleCount()) * this.mViewPortHandler.s();
    }

    @Override // defpackage.u02
    public void prepareBarHighlight(float f, float f2, float f3, float f4, ryp rypVar) {
        this.mBarRect.set(f2, f - f4, f3, f + f4);
        rypVar.o(this.mBarRect, this.mAnimator.i());
    }

    @Override // defpackage.u02
    public void setHighlightDrawPos(r7c r7cVar, RectF rectF) {
        r7cVar.m(rectF.centerY(), rectF.right);
    }
}
