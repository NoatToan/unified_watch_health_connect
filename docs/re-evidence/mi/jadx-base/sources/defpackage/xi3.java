package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.CandleEntry;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class xi3 extends ige {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vi3 f39149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f39150b;
    public float[] c;
    public float[] d;
    public float[] e;
    public float[] f;

    public xi3(vi3 vi3Var, cu3 cu3Var, hwq hwqVar) {
        super(cu3Var, hwqVar);
        this.f39150b = new float[8];
        this.c = new float[4];
        this.d = new float[4];
        this.e = new float[4];
        this.f = new float[4];
        this.f39149a = vi3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(Canvas canvas, vpc vpcVar) {
        int iE0;
        ryp transformer = this.f39149a.getTransformer(vpcVar.m0());
        float fI = this.mAnimator.i();
        float fA0 = vpcVar.A0();
        boolean zU = vpcVar.u();
        this.mXBounds.a(this.f39149a, vpcVar);
        this.mRenderPaint.setStrokeWidth(vpcVar.u0());
        int i = this.mXBounds.f14945a;
        while (true) {
            d12.a aVar = this.mXBounds;
            if (i > aVar.c + aVar.f14945a) {
                return;
            }
            CandleEntry candleEntry = (CandleEntry) vpcVar.i(i);
            if (candleEntry != null) {
                float x = candleEntry.getX();
                float fH = candleEntry.h();
                float fC = candleEntry.c();
                float fD = candleEntry.d();
                float fE = candleEntry.e();
                if (zU) {
                    float[] fArr = this.f39150b;
                    fArr[0] = x;
                    fArr[2] = x;
                    fArr[4] = x;
                    fArr[6] = x;
                    if (fH > fC) {
                        fArr[1] = fD * fI;
                        fArr[3] = fH * fI;
                        fArr[5] = fE * fI;
                        fArr[7] = fC * fI;
                    } else if (fH < fC) {
                        fArr[1] = fD * fI;
                        fArr[3] = fC * fI;
                        fArr[5] = fE * fI;
                        fArr[7] = fH * fI;
                    } else {
                        fArr[1] = fD * fI;
                        float f = fH * fI;
                        fArr[3] = f;
                        fArr[5] = fE * fI;
                        fArr[7] = f;
                    }
                    transformer.k(fArr);
                    if (!vpcVar.h0()) {
                        this.mRenderPaint.setColor(vpcVar.M0() == 1122867 ? vpcVar.E0(i) : vpcVar.M0());
                    } else if (fH > fC) {
                        this.mRenderPaint.setColor(vpcVar.T() == 1122867 ? vpcVar.E0(i) : vpcVar.T());
                    } else if (fH < fC) {
                        this.mRenderPaint.setColor(vpcVar.t() == 1122867 ? vpcVar.E0(i) : vpcVar.t());
                    } else {
                        this.mRenderPaint.setColor(vpcVar.q0() == 1122867 ? vpcVar.E0(i) : vpcVar.q0());
                    }
                    this.mRenderPaint.setStyle(Paint.Style.STROKE);
                    canvas.drawLines(this.f39150b, this.mRenderPaint);
                    float[] fArr2 = this.c;
                    fArr2[0] = (x - 0.5f) + fA0;
                    fArr2[1] = fC * fI;
                    fArr2[2] = (x + 0.5f) - fA0;
                    fArr2[3] = fH * fI;
                    transformer.k(fArr2);
                    if (fH > fC) {
                        if (vpcVar.T() == 1122867) {
                            this.mRenderPaint.setColor(vpcVar.E0(i));
                        } else {
                            this.mRenderPaint.setColor(vpcVar.T());
                        }
                        this.mRenderPaint.setStyle(vpcVar.y0());
                        float[] fArr3 = this.c;
                        canvas.drawRect(fArr3[0], fArr3[3], fArr3[2], fArr3[1], this.mRenderPaint);
                    } else if (fH < fC) {
                        if (vpcVar.t() == 1122867) {
                            this.mRenderPaint.setColor(vpcVar.E0(i));
                        } else {
                            this.mRenderPaint.setColor(vpcVar.t());
                        }
                        this.mRenderPaint.setStyle(vpcVar.I());
                        float[] fArr4 = this.c;
                        canvas.drawRect(fArr4[0], fArr4[1], fArr4[2], fArr4[3], this.mRenderPaint);
                    } else {
                        if (vpcVar.q0() == 1122867) {
                            this.mRenderPaint.setColor(vpcVar.E0(i));
                        } else {
                            this.mRenderPaint.setColor(vpcVar.q0());
                        }
                        float[] fArr5 = this.c;
                        canvas.drawLine(fArr5[0], fArr5[1], fArr5[2], fArr5[3], this.mRenderPaint);
                    }
                } else {
                    float[] fArr6 = this.d;
                    fArr6[0] = x;
                    fArr6[1] = fD * fI;
                    fArr6[2] = x;
                    fArr6[3] = fE * fI;
                    float[] fArr7 = this.e;
                    fArr7[0] = (x - 0.5f) + fA0;
                    float f2 = fH * fI;
                    fArr7[1] = f2;
                    fArr7[2] = x;
                    fArr7[3] = f2;
                    float[] fArr8 = this.f;
                    fArr8[0] = (0.5f + x) - fA0;
                    float f3 = fC * fI;
                    fArr8[1] = f3;
                    fArr8[2] = x;
                    fArr8[3] = f3;
                    transformer.k(fArr6);
                    transformer.k(this.e);
                    transformer.k(this.f);
                    if (fH > fC) {
                        iE0 = vpcVar.T() == 1122867 ? vpcVar.E0(i) : vpcVar.T();
                    } else if (fH < fC) {
                        iE0 = vpcVar.t() == 1122867 ? vpcVar.E0(i) : vpcVar.t();
                    } else {
                        iE0 = vpcVar.q0() == 1122867 ? vpcVar.E0(i) : vpcVar.q0();
                    }
                    this.mRenderPaint.setColor(iE0);
                    float[] fArr9 = this.d;
                    canvas.drawLine(fArr9[0], fArr9[1], fArr9[2], fArr9[3], this.mRenderPaint);
                    float[] fArr10 = this.e;
                    canvas.drawLine(fArr10[0], fArr10[1], fArr10[2], fArr10[3], this.mRenderPaint);
                    float[] fArr11 = this.f;
                    canvas.drawLine(fArr11[0], fArr11[1], fArr11[2], fArr11[3], this.mRenderPaint);
                }
            }
            i++;
        }
    }

    @Override // defpackage.dn5
    public void drawData(Canvas canvas) {
        for (T t : this.f39149a.getCandleData().l()) {
            if (t.isVisible()) {
                a(canvas, t);
            }
        }
    }

    @Override // defpackage.dn5
    public void drawExtras(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dn5
    public void drawHighlighted(Canvas canvas, r7c[] r7cVarArr) {
        ui3 candleData = this.f39149a.getCandleData();
        for (r7c r7cVar : r7cVarArr) {
            mtc mtcVar = (vpc) candleData.i(r7cVar.d());
            if (mtcVar != null && mtcVar.R()) {
                CandleEntry candleEntry = (CandleEntry) mtcVar.v0(r7cVar.h(), r7cVar.j());
                if (isInBoundsX(candleEntry, mtcVar)) {
                    vye vyeVarE = this.f39149a.getTransformer(mtcVar.m0()).e(candleEntry.getX(), ((candleEntry.e() * this.mAnimator.i()) + (candleEntry.d() * this.mAnimator.i())) / 2.0f);
                    r7cVar.m((float) vyeVarE.c, (float) vyeVarE.d);
                    drawHighlightLines(canvas, (float) vyeVarE.c, (float) vyeVarE.d, mtcVar);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dn5
    public void drawValues(Canvas canvas) {
        if (isDrawingValuesAllowed(this.f39149a)) {
            List<T> listL = this.f39149a.getCandleData().l();
            for (int i = 0; i < listL.size(); i++) {
                vpc vpcVar = (vpc) listL.get(i);
                if (shouldDrawValues(vpcVar) && vpcVar.O0() >= 1) {
                    applyValueTextStyle(vpcVar);
                    ryp transformer = this.f39149a.getTransformer(vpcVar.m0());
                    this.mXBounds.a(this.f39149a, vpcVar);
                    float fH = this.mAnimator.h();
                    float fI = this.mAnimator.i();
                    d12.a aVar = this.mXBounds;
                    float[] fArrB = transformer.b(vpcVar, fH, fI, aVar.f14945a, aVar.f14946b);
                    float fE = fmq.e(5.0f);
                    wye wyeVarD = wye.d(vpcVar.P0());
                    wyeVarD.c = fmq.e(wyeVarD.c);
                    wyeVarD.d = fmq.e(wyeVarD.d);
                    int i2 = 0;
                    while (i2 < fArrB.length) {
                        float f = fArrB[i2];
                        float f2 = fArrB[i2 + 1];
                        if (!this.mViewPortHandler.C(f)) {
                            break;
                        }
                        if (this.mViewPortHandler.B(f) && this.mViewPortHandler.F(f2)) {
                            int i3 = i2 / 2;
                            CandleEntry candleEntry = (CandleEntry) vpcVar.i(this.mXBounds.f14945a + i3);
                            if (vpcVar.l0()) {
                                drawValue(canvas, vpcVar.d0(), candleEntry.d(), candleEntry, i, f, f2 - fE, vpcVar.n(i3));
                            }
                            if (candleEntry.getIcon() != null && vpcVar.D()) {
                                Drawable icon = candleEntry.getIcon();
                                fmq.f(canvas, icon, (int) (f + wyeVarD.c), (int) (f2 + wyeVarD.d), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            }
                        } else {
                            i2 = i2;
                            wyeVarD = wyeVarD;
                        }
                        i2 += 2;
                        wyeVarD = wyeVarD;
                    }
                    wye.f(wyeVarD);
                }
            }
        }
    }

    @Override // defpackage.dn5
    public void initBuffers() {
    }
}
