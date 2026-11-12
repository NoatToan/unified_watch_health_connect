package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class drr extends crr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BarChart f15856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Path f15857b;

    public drr(hwq hwqVar, XAxis xAxis, ryp rypVar, BarChart barChart) {
        super(hwqVar, xAxis, rypVar);
        this.f15857b = new Path();
        this.f15856a = barChart;
    }

    @Override // defpackage.crr, defpackage.gt1
    public void computeAxis(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.mViewPortHandler.k() > 10.0f && !this.mViewPortHandler.y()) {
            vye vyeVarG = this.mTrans.g(this.mViewPortHandler.h(), this.mViewPortHandler.f());
            vye vyeVarG2 = this.mTrans.g(this.mViewPortHandler.h(), this.mViewPortHandler.j());
            if (z) {
                f3 = (float) vyeVarG2.d;
                d = vyeVarG.d;
            } else {
                f3 = (float) vyeVarG.d;
                d = vyeVarG2.d;
            }
            float f4 = (float) d;
            vye.c(vyeVarG);
            vye.c(vyeVarG2);
            f = f3;
            f2 = f4;
        }
        computeAxisValues(f, f2);
    }

    @Override // defpackage.crr
    public void computeSize() {
        this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
        fm8 fm8VarB = fmq.b(this.mAxisLabelPaint, this.mXAxis.getLongestLabel());
        float xOffset = (int) (fm8VarB.c + (this.mXAxis.getXOffset() * 3.5f));
        float f = fm8VarB.d;
        fm8 fm8VarT = fmq.t(fm8VarB.c, f, this.mXAxis.getLabelRotationAngle());
        this.mXAxis.mLabelWidth = Math.round(xOffset);
        this.mXAxis.mLabelHeight = Math.round(f);
        XAxis xAxis = this.mXAxis;
        xAxis.mLabelRotatedWidth = (int) (fm8VarT.c + (xAxis.getXOffset() * 3.5f));
        this.mXAxis.mLabelRotatedHeight = Math.round(fm8VarT.d);
        fm8.c(fm8VarT);
    }

    @Override // defpackage.crr
    public void drawGridLine(Canvas canvas, float f, float f2, Path path) {
        path.moveTo(this.mViewPortHandler.i(), f2);
        path.lineTo(this.mViewPortHandler.h(), f2);
        canvas.drawPath(path, this.mGridPaint);
        path.reset();
    }

    @Override // defpackage.crr
    public void drawLabels(Canvas canvas, float f, wye wyeVar) {
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        boolean zIsCenterAxisLabelsEnabled = this.mXAxis.isCenterAxisLabelsEnabled();
        int i = this.mXAxis.mEntryCount * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            if (zIsCenterAxisLabelsEnabled) {
                fArr[i2 + 1] = this.mXAxis.mCenteredEntries[i2 / 2];
            } else {
                fArr[i2 + 1] = this.mXAxis.mEntries[i2 / 2];
            }
        }
        this.mTrans.k(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float f2 = fArr[i3 + 1];
            if (this.mViewPortHandler.F(f2)) {
                fpc valueFormatter = this.mXAxis.getValueFormatter();
                XAxis xAxis = this.mXAxis;
                drawLabel(canvas, valueFormatter.getFormattedValue(xAxis.mEntries[i3 / 2], xAxis), f, f2, wyeVar, labelRotationAngle);
            }
        }
    }

    @Override // defpackage.crr
    public RectF getGridClippingRect() {
        this.mGridClippingRect.set(this.mViewPortHandler.p());
        this.mGridClippingRect.inset(0.0f, -this.mAxis.getGridLineWidth());
        return this.mGridClippingRect;
    }

    @Override // defpackage.crr, defpackage.gt1
    public void renderAxisLabels(Canvas canvas) {
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            float xOffset = this.mXAxis.getXOffset();
            this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mXAxis.getTextColor());
            wye wyeVarC = wye.c(0.0f, 0.0f);
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP) {
                wyeVarC.c = 0.0f;
                wyeVarC.d = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.i() + xOffset, wyeVarC);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP_INSIDE) {
                wyeVarC.c = 1.0f;
                wyeVarC.d = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.i() - xOffset, wyeVarC);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                wyeVarC.c = 1.0f;
                wyeVarC.d = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.h() - xOffset, wyeVarC);
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                wyeVarC.c = 1.0f;
                wyeVarC.d = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.h() + xOffset, wyeVarC);
            } else {
                wyeVarC.c = 0.0f;
                wyeVarC.d = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.i() + xOffset, wyeVarC);
                wyeVarC.c = 1.0f;
                wyeVarC.d = 0.5f;
                drawLabels(canvas, this.mViewPortHandler.h() - xOffset, wyeVarC);
            }
            wye.f(wyeVarC);
        }
    }

    @Override // defpackage.crr, defpackage.gt1
    public void renderAxisLine(Canvas canvas) {
        if (this.mXAxis.isDrawAxisLineEnabled() && this.mXAxis.isEnabled()) {
            this.mAxisLinePaint.setColor(this.mXAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mXAxis.getAxisLineWidth());
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP || this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP_INSIDE || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.mViewPortHandler.i(), this.mViewPortHandler.j(), this.mViewPortHandler.i(), this.mViewPortHandler.f(), this.mAxisLinePaint);
            }
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM_INSIDE || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.mViewPortHandler.h(), this.mViewPortHandler.j(), this.mViewPortHandler.h(), this.mViewPortHandler.f(), this.mAxisLinePaint);
            }
        }
    }

    @Override // defpackage.crr, defpackage.gt1
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines = this.mXAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        float[] fArr = this.mRenderLimitLinesBuffer;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path = this.f15857b;
        path.reset();
        for (int i = 0; i < limitLines.size(); i++) {
            LimitLine limitLine = limitLines.get(i);
            if (limitLine.isEnabled()) {
                int iSave = canvas.save();
                this.mLimitLineClippingRect.set(this.mViewPortHandler.p());
                this.mLimitLineClippingRect.inset(0.0f, -limitLine.g());
                canvas.clipRect(this.mLimitLineClippingRect);
                this.mLimitLinePaint.setStyle(Paint.Style.STROKE);
                this.mLimitLinePaint.setColor(limitLine.f());
                this.mLimitLinePaint.setStrokeWidth(limitLine.g());
                this.mLimitLinePaint.setPathEffect(limitLine.b());
                fArr[1] = limitLine.e();
                this.mTrans.k(fArr);
                path.moveTo(this.mViewPortHandler.h(), fArr[1]);
                path.lineTo(this.mViewPortHandler.i(), fArr[1]);
                canvas.drawPath(path, this.mLimitLinePaint);
                path.reset();
                String strC = limitLine.c();
                if (strC != null && !strC.equals("")) {
                    this.mLimitLinePaint.setStyle(limitLine.h());
                    this.mLimitLinePaint.setPathEffect(null);
                    this.mLimitLinePaint.setColor(limitLine.getTextColor());
                    this.mLimitLinePaint.setStrokeWidth(0.5f);
                    this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
                    float fA = fmq.a(this.mLimitLinePaint, strC);
                    float fE = fmq.e(4.0f) + limitLine.getXOffset();
                    float fG = limitLine.g() + fA + limitLine.getYOffset();
                    LimitLine.LimitLabelPosition limitLabelPositionD = limitLine.d();
                    if (limitLabelPositionD == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(strC, this.mViewPortHandler.i() - fE, (fArr[1] - fG) + fA, this.mLimitLinePaint);
                    } else if (limitLabelPositionD == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(strC, this.mViewPortHandler.i() - fE, fArr[1] + fG, this.mLimitLinePaint);
                    } else if (limitLabelPositionD == LimitLine.LimitLabelPosition.LEFT_TOP) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(strC, this.mViewPortHandler.h() + fE, (fArr[1] - fG) + fA, this.mLimitLinePaint);
                    } else {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(strC, this.mViewPortHandler.I() + fE, fArr[1] + fG, this.mLimitLinePaint);
                    }
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
