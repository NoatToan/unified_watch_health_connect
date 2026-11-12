package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class crr extends gt1 {
    protected RectF mGridClippingRect;
    protected RectF mLimitLineClippingRect;
    private Path mLimitLinePath;
    float[] mLimitLineSegmentsBuffer;
    protected float[] mRenderGridLinesBuffer;
    protected Path mRenderGridLinesPath;
    protected float[] mRenderLimitLinesBuffer;
    protected XAxis mXAxis;

    public crr(hwq hwqVar, XAxis xAxis, ryp rypVar) {
        super(hwqVar, rypVar, xAxis);
        this.mRenderGridLinesPath = new Path();
        this.mRenderGridLinesBuffer = new float[2];
        this.mGridClippingRect = new RectF();
        this.mRenderLimitLinesBuffer = new float[2];
        this.mLimitLineClippingRect = new RectF();
        this.mLimitLineSegmentsBuffer = new float[4];
        this.mLimitLinePath = new Path();
        this.mXAxis = xAxis;
        this.mAxisLabelPaint.setColor(-16777216);
        this.mAxisLabelPaint.setTextAlign(Paint.Align.CENTER);
        this.mAxisLabelPaint.setTextSize(fmq.e(10.0f));
    }

    @Override // defpackage.gt1
    public void computeAxis(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.mViewPortHandler.k() > 10.0f && !this.mViewPortHandler.x()) {
            vye vyeVarG = this.mTrans.g(this.mViewPortHandler.h(), this.mViewPortHandler.j());
            vye vyeVarG2 = this.mTrans.g(this.mViewPortHandler.i(), this.mViewPortHandler.j());
            if (z) {
                f3 = (float) vyeVarG2.c;
                d = vyeVarG.c;
            } else {
                f3 = (float) vyeVarG.c;
                d = vyeVarG2.c;
            }
            float f4 = (float) d;
            vye.c(vyeVarG);
            vye.c(vyeVarG2);
            f = f3;
            f2 = f4;
        }
        computeAxisValues(f, f2);
    }

    @Override // defpackage.gt1
    public void computeAxisValues(float f, float f2) {
        super.computeAxisValues(f, f2);
        computeSize();
    }

    public void computeSize() {
        String longestLabel = this.mXAxis.getLongestLabel();
        this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
        fm8 fm8VarB = fmq.b(this.mAxisLabelPaint, longestLabel);
        float f = fm8VarB.c;
        float fA = fmq.a(this.mAxisLabelPaint, "Q");
        fm8 fm8VarT = fmq.t(f, fA, this.mXAxis.getLabelRotationAngle());
        this.mXAxis.mLabelWidth = Math.round(f);
        this.mXAxis.mLabelHeight = Math.round(fA);
        this.mXAxis.mLabelRotatedWidth = Math.round(fm8VarT.c);
        this.mXAxis.mLabelRotatedHeight = Math.round(fm8VarT.d);
        fm8.c(fm8VarT);
        fm8.c(fm8VarB);
    }

    public void drawGridLine(Canvas canvas, float f, float f2, Path path) {
        path.moveTo(f, this.mViewPortHandler.f());
        path.lineTo(f, this.mViewPortHandler.j());
        canvas.drawPath(path, this.mGridPaint);
        path.reset();
    }

    public void drawLabel(Canvas canvas, String str, float f, float f2, wye wyeVar, float f3) {
        fmq.g(canvas, str, f, f2, this.mAxisLabelPaint, wyeVar, f3);
    }

    public void drawLabels(Canvas canvas, float f, wye wyeVar) {
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
            float fD = fArr[i3];
            if (this.mViewPortHandler.E(fD)) {
                fpc valueFormatter = this.mXAxis.getValueFormatter();
                XAxis xAxis = this.mXAxis;
                int i4 = i3 / 2;
                String formattedValue = valueFormatter.getFormattedValue(xAxis.mEntries[i4], xAxis);
                if (this.mXAxis.isAvoidFirstLastClippingEnabled()) {
                    int i5 = this.mXAxis.mEntryCount;
                    if (i4 == i5 - 1 && i5 > 1) {
                        float fD2 = fmq.d(this.mAxisLabelPaint, formattedValue);
                        if (fD2 > this.mViewPortHandler.J() * 2.0f && fD + fD2 > this.mViewPortHandler.n()) {
                            fD -= fD2 / 2.0f;
                        }
                    } else if (i3 == 0) {
                        fD += fmq.d(this.mAxisLabelPaint, formattedValue) / 2.0f;
                    }
                }
                drawLabel(canvas, formattedValue, fD, f, wyeVar, labelRotationAngle);
            }
        }
    }

    public RectF getGridClippingRect() {
        this.mGridClippingRect.set(this.mViewPortHandler.p());
        this.mGridClippingRect.inset(-this.mAxis.getGridLineWidth(), 0.0f);
        return this.mGridClippingRect;
    }

    @Override // defpackage.gt1
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
                drawLabels(canvas, this.mViewPortHandler.j() - yOffset, wyeVarC);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP_INSIDE) {
                wyeVarC.c = 0.5f;
                wyeVarC.d = 1.0f;
                drawLabels(canvas, this.mViewPortHandler.j() + yOffset + this.mXAxis.mLabelRotatedHeight, wyeVarC);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                wyeVarC.c = 0.5f;
                wyeVarC.d = 0.0f;
                drawLabels(canvas, this.mViewPortHandler.f() + yOffset, wyeVarC);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                wyeVarC.c = 0.5f;
                wyeVarC.d = 0.0f;
                drawLabels(canvas, (this.mViewPortHandler.f() - yOffset) - this.mXAxis.mLabelRotatedHeight, wyeVarC);
            } else {
                wyeVarC.c = 0.5f;
                wyeVarC.d = 1.0f;
                drawLabels(canvas, this.mViewPortHandler.j() - yOffset, wyeVarC);
                wyeVarC.c = 0.5f;
                wyeVarC.d = 0.0f;
                drawLabels(canvas, this.mViewPortHandler.f() + yOffset, wyeVarC);
            }
            wye.f(wyeVarC);
        }
    }

    @Override // defpackage.gt1
    public void renderAxisLine(Canvas canvas) {
        if (this.mXAxis.isDrawAxisLineEnabled() && this.mXAxis.isEnabled()) {
            this.mAxisLinePaint.setColor(this.mXAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mXAxis.getAxisLineWidth());
            this.mAxisLinePaint.setPathEffect(this.mXAxis.getAxisLineDashPathEffect());
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP || this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP_INSIDE || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.mViewPortHandler.h(), this.mViewPortHandler.j(), this.mViewPortHandler.i(), this.mViewPortHandler.j(), this.mAxisLinePaint);
            }
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM_INSIDE || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.mViewPortHandler.h(), this.mViewPortHandler.f(), this.mViewPortHandler.i(), this.mViewPortHandler.f(), this.mAxisLinePaint);
            }
        }
    }

    @Override // defpackage.gt1
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

    public void renderLimitLineLabel(Canvas canvas, LimitLine limitLine, float[] fArr, float f) {
        String strC = limitLine.c();
        if (strC == null || strC.equals("")) {
            return;
        }
        this.mLimitLinePaint.setStyle(limitLine.h());
        this.mLimitLinePaint.setPathEffect(null);
        this.mLimitLinePaint.setColor(limitLine.getTextColor());
        this.mLimitLinePaint.setStrokeWidth(0.5f);
        this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
        float fG = limitLine.g() + limitLine.getXOffset();
        LimitLine.LimitLabelPosition limitLabelPositionD = limitLine.d();
        if (limitLabelPositionD == LimitLine.LimitLabelPosition.RIGHT_TOP) {
            float fA = fmq.a(this.mLimitLinePaint, strC);
            this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(strC, fArr[0] + fG, this.mViewPortHandler.j() + f + fA, this.mLimitLinePaint);
        } else if (limitLabelPositionD == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
            this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(strC, fArr[0] + fG, this.mViewPortHandler.f() - f, this.mLimitLinePaint);
        } else if (limitLabelPositionD != LimitLine.LimitLabelPosition.LEFT_TOP) {
            this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(strC, fArr[0] - fG, this.mViewPortHandler.f() - f, this.mLimitLinePaint);
        } else {
            this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(strC, fArr[0] - fG, this.mViewPortHandler.j() + f + fmq.a(this.mLimitLinePaint, strC), this.mLimitLinePaint);
        }
    }

    public void renderLimitLineLine(Canvas canvas, LimitLine limitLine, float[] fArr) {
        float[] fArr2 = this.mLimitLineSegmentsBuffer;
        fArr2[0] = fArr[0];
        fArr2[1] = this.mViewPortHandler.j();
        float[] fArr3 = this.mLimitLineSegmentsBuffer;
        fArr3[2] = fArr[0];
        fArr3[3] = this.mViewPortHandler.f();
        this.mLimitLinePath.reset();
        Path path = this.mLimitLinePath;
        float[] fArr4 = this.mLimitLineSegmentsBuffer;
        path.moveTo(fArr4[0], fArr4[1]);
        Path path2 = this.mLimitLinePath;
        float[] fArr5 = this.mLimitLineSegmentsBuffer;
        path2.lineTo(fArr5[2], fArr5[3]);
        this.mLimitLinePaint.setStyle(Paint.Style.STROKE);
        this.mLimitLinePaint.setColor(limitLine.f());
        this.mLimitLinePaint.setStrokeWidth(limitLine.g());
        this.mLimitLinePaint.setPathEffect(limitLine.b());
        canvas.drawPath(this.mLimitLinePath, this.mLimitLinePaint);
    }

    @Override // defpackage.gt1
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines = this.mXAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        float[] fArr = this.mRenderLimitLinesBuffer;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        for (int i = 0; i < limitLines.size(); i++) {
            LimitLine limitLine = limitLines.get(i);
            if (limitLine.isEnabled()) {
                int iSave = canvas.save();
                this.mLimitLineClippingRect.set(this.mViewPortHandler.p());
                this.mLimitLineClippingRect.inset(-limitLine.g(), 0.0f);
                canvas.clipRect(this.mLimitLineClippingRect);
                fArr[0] = limitLine.e();
                fArr[1] = 0.0f;
                this.mTrans.k(fArr);
                renderLimitLineLine(canvas, limitLine, fArr);
                renderLimitLineLabel(canvas, limitLine, fArr, limitLine.getYOffset() + 2.0f);
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void setupGridPaint() {
        this.mGridPaint.setColor(this.mXAxis.getGridColor());
        this.mGridPaint.setStrokeWidth(this.mXAxis.getGridLineWidth());
        this.mGridPaint.setPathEffect(this.mXAxis.getGridDashPathEffect());
    }
}
