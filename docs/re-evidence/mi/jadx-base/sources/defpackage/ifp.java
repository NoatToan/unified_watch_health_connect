package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.XAxis;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;

/* JADX INFO: loaded from: classes7.dex */
public class ifp extends crr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hwq f21097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21098b;
    public xd5 c;

    public ifp(hwq hwqVar, XAxis xAxis, ryp rypVar, String str, xd5 xd5Var) {
        super(hwqVar, xAxis, rypVar);
        this.f21097a = hwqVar;
        this.f21098b = str;
        this.c = xd5Var;
    }

    public void a(xd5 xd5Var) {
        this.c = xd5Var;
    }

    @Override // defpackage.crr, defpackage.gt1
    public void computeAxisValues(float f, float f2) {
        ft1 ft1Var = this.mAxis;
        if ((ft1Var instanceof hfp) && this.c.f) {
            int labelCount = ft1Var.getLabelCount();
            double dAbs = Math.abs(f2 - f);
            if (labelCount == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
                ft1 ft1Var2 = this.mAxis;
                ft1Var2.mEntries = new float[0];
                ft1Var2.mCenteredEntries = new float[0];
                ft1Var2.mEntryCount = 0;
                return;
            }
        } else {
            super.computeAxisValues(f, f2);
        }
        computeSize();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    @Override // defpackage.crr
    public void drawLabels(Canvas canvas, float f, wye wyeVar) {
        boolean z;
        float fH;
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        boolean zIsCenterAxisLabelsEnabled = this.mXAxis.isCenterAxisLabelsEnabled();
        int i = this.mXAxis.mEntryCount * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            if (zIsCenterAxisLabelsEnabled) {
                fArr[i2] = this.mXAxis.mCenteredEntries[i2 / 2];
            } else {
                fArr[i2] = this.mXAxis.mEntries[i2 / 2];
            }
        }
        this.mTrans.k(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float fI = fArr[i3];
            if (this.f21097a.E(fI)) {
                fpc valueFormatter = this.mXAxis.getValueFormatter();
                XAxis xAxis = this.mXAxis;
                int i4 = i3 / 2;
                valueFormatter.getFormattedValue(xAxis.mEntries[i4], xAxis);
                int i5 = (int) this.mXAxis.mEntries[i4];
                boolean z2 = true;
                if (AppUtil.isRTLDirection()) {
                    float[] fArr2 = this.mXAxis.mEntries;
                    i5 = (int) fArr2[(fArr2.length - 1) - i4];
                }
                int i6 = i5 % 60;
                int i7 = (i5 / 60) % 60;
                int i8 = i5 / 3600;
                String str = String.format("%02d:%02d:%02d", Integer.valueOf((i8 % 24) + ((i8 / 24) * 24)), Integer.valueOf(i7), Integer.valueOf(i6));
                if (this.mXAxis.isAvoidFirstLastClippingEnabled()) {
                    if (!AppUtil.isRTLDirection()) {
                        int i9 = this.mXAxis.mEntryCount;
                        if (i4 != i9 - 1 || i9 <= 1) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else if (i3 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (AppUtil.isRTLDirection()) {
                        int i10 = this.mXAxis.mEntryCount;
                        if (i4 != i10 - 1 || i10 <= 1) {
                            z2 = false;
                        }
                    } else if (i3 != 0) {
                        z2 = false;
                    }
                    if (z) {
                        float fD = fmq.d(this.mAxisLabelPaint, str);
                        if (AppUtil.isRTLDirection()) {
                            fI = fD;
                        } else {
                            fH = fD / 2.0f;
                            fI -= fH;
                        }
                    } else if (z2) {
                        float fD2 = fmq.d(this.mAxisLabelPaint, str);
                        if (AppUtil.isRTLDirection()) {
                            fI = this.f21097a.i();
                            fH = this.f21097a.h();
                            fI -= fH;
                        } else {
                            fI += fD2 / 2.0f;
                        }
                    }
                }
                drawLabel(canvas, str, AppUtil.isRTLDirection() ? this.f21097a.i() - fI : fI, f, wyeVar, labelRotationAngle);
            }
        }
    }

    @Override // defpackage.crr, defpackage.gt1
    public void renderAxisLabels(Canvas canvas) {
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            float yOffset = this.mXAxis.getYOffset();
            this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mXAxis.getTextColor());
            wye wyeVarC = wye.c(0.0f, 0.0f);
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP) {
                wyeVarC.c = 0.5f;
                wyeVarC.d = 1.0f;
                drawLabels(canvas, this.f21097a.j() - yOffset, wyeVarC);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP_INSIDE) {
                wyeVarC.c = 0.5f;
                wyeVarC.d = 1.0f;
                drawLabels(canvas, this.f21097a.j() + yOffset + this.mXAxis.mLabelRotatedHeight, wyeVarC);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                wyeVarC.c = AppUtil.isRTLDirection() ? 0.05f : 0.5f;
                wyeVarC.d = 0.0f;
                drawLabels(canvas, this.f21097a.f() + (yOffset * 2.0f), wyeVarC);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                wyeVarC.c = 0.5f;
                wyeVarC.d = 0.0f;
                drawLabels(canvas, (this.f21097a.f() - yOffset) - this.mXAxis.mLabelRotatedHeight, wyeVarC);
            } else {
                wyeVarC.c = 0.5f;
                wyeVarC.d = 1.0f;
                drawLabels(canvas, this.f21097a.j() - yOffset, wyeVarC);
                wyeVarC.c = 0.5f;
                wyeVarC.d = 0.0f;
                drawLabels(canvas, this.f21097a.f() + yOffset, wyeVarC);
            }
            int color = this.mAxisLabelPaint.getColor();
            int alpha = this.mAxisLabelPaint.getAlpha();
            this.mAxisLabelPaint.setColor(-1);
            this.mAxisLabelPaint.setAlpha(3);
            RectF rectF = new RectF();
            rectF.set(0.0f, this.f21097a.f() + DisplayUtil.dip2px(0.5f), DisplayUtil.getScreenWidth(), this.f21097a.f() + this.f21097a.H() + DisplayUtil.dip2px(1.0f));
            canvas.drawRect(rectF, this.mAxisLabelPaint);
            this.mAxisLabelPaint.setColor(color);
            this.mAxisLabelPaint.setAlpha(alpha);
            wye.f(wyeVarC);
        }
    }

    @Override // defpackage.crr, defpackage.gt1
    public void renderAxisLine(Canvas canvas) {
        if (this.mXAxis.isDrawAxisLineEnabled() && this.mXAxis.isEnabled()) {
            this.mAxisLinePaint.setColor(this.mXAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mXAxis.getAxisLineWidth());
            this.mAxisLinePaint.setPathEffect(this.mXAxis.getAxisLineDashPathEffect());
        }
    }

    @Override // defpackage.crr, defpackage.gt1
    public void renderGridLines(Canvas canvas) {
        if (this.mXAxis.isDrawGridLinesEnabled() && this.mXAxis.isEnabled()) {
            int iSave = canvas.save();
            canvas.clipRect(getGridClippingRect());
            if (this.mRenderGridLinesBuffer.length != this.mAxis.mEntryCount * 2) {
                this.mRenderGridLinesBuffer = new float[this.mXAxis.mEntryCount * 2];
            }
            float[] fArr = this.mRenderGridLinesBuffer;
            for (int i = 0; i < fArr.length; i += 2) {
                float[] fArr2 = this.mXAxis.mEntries;
                int i2 = i / 2;
                fArr[i] = fArr2[i2];
                fArr[i + 1] = fArr2[i2];
            }
            this.mTrans.k(fArr);
            setupGridPaint();
            Path path = this.mRenderGridLinesPath;
            path.reset();
            for (int i3 = 0; i3 < fArr.length; i3 += 2) {
                drawGridLine(canvas, fArr[i3], fArr[i3 + 1], path);
            }
            canvas.restoreToCount(iSave);
        }
    }
}
