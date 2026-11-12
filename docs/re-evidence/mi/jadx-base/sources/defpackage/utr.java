package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class utr extends ttr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Path f36129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Path f36130b;
    public float[] c;

    public utr(hwq hwqVar, YAxis yAxis, ryp rypVar) {
        super(hwqVar, yAxis, rypVar);
        this.f36129a = new Path();
        this.f36130b = new Path();
        this.c = new float[4];
        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
    }

    @Override // defpackage.gt1
    public void computeAxis(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.mViewPortHandler.g() > 10.0f && !this.mViewPortHandler.x()) {
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

    @Override // defpackage.ttr
    public void drawYLabels(Canvas canvas, float f, float[] fArr, float f2) {
        this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
        this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
        int i = this.mYAxis.m() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
        float fC = this.mYAxis.c();
        for (int i2 = !this.mYAxis.l() ? 1 : 0; i2 < i; i2++) {
            canvas.drawText(this.mYAxis.getFormattedLabel(i2), fArr[i2 * 2], (f - f2) + fC, this.mAxisLabelPaint);
        }
    }

    @Override // defpackage.ttr
    public void drawZeroLine(Canvas canvas) {
        int iSave = canvas.save();
        this.mZeroLineClippingRect.set(this.mViewPortHandler.p());
        this.mZeroLineClippingRect.inset(-this.mYAxis.k(), 0.0f);
        canvas.clipRect(this.mLimitLineClippingRect);
        vye vyeVarE = this.mTrans.e(0.0f, 0.0f);
        this.mZeroLinePaint.setColor(this.mYAxis.j());
        this.mZeroLinePaint.setStrokeWidth(this.mYAxis.k());
        Path path = this.f36129a;
        path.reset();
        path.moveTo(((float) vyeVarE.c) - 1.0f, this.mViewPortHandler.j());
        path.lineTo(((float) vyeVarE.c) - 1.0f, this.mViewPortHandler.f());
        canvas.drawPath(path, this.mZeroLinePaint);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.ttr
    public RectF getGridClippingRect() {
        this.mGridClippingRect.set(this.mViewPortHandler.p());
        this.mGridClippingRect.inset(-this.mAxis.getGridLineWidth(), 0.0f);
        return this.mGridClippingRect;
    }

    @Override // defpackage.ttr
    public float[] getTransformedPositions() {
        int length = this.mGetTransformedPositionsBuffer.length;
        int i = this.mYAxis.mEntryCount;
        if (length != i * 2) {
            this.mGetTransformedPositionsBuffer = new float[i * 2];
        }
        float[] fArr = this.mGetTransformedPositionsBuffer;
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2] = this.mYAxis.mEntries[i2 / 2];
        }
        this.mTrans.k(fArr);
        return fArr;
    }

    @Override // defpackage.ttr
    public Path linePath(Path path, int i, float[] fArr) {
        path.moveTo(fArr[i], this.mViewPortHandler.j());
        path.lineTo(fArr[i], this.mViewPortHandler.f());
        return path;
    }

    @Override // defpackage.ttr, defpackage.gt1
    public void renderAxisLabels(Canvas canvas) {
        float f;
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            float[] transformedPositions = getTransformedPositions();
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            this.mAxisLabelPaint.setTextAlign(Paint.Align.CENTER);
            float fE = fmq.e(2.5f);
            float fA = fmq.a(this.mAxisLabelPaint, "Q");
            YAxis.AxisDependency axisDependencyA = this.mYAxis.a();
            YAxis.YAxisLabelPosition yAxisLabelPositionB = this.mYAxis.b();
            if (axisDependencyA == YAxis.AxisDependency.LEFT) {
                f = (yAxisLabelPositionB == YAxis.YAxisLabelPosition.OUTSIDE_CHART ? this.mViewPortHandler.j() : this.mViewPortHandler.j()) - fE;
            } else {
                f = (yAxisLabelPositionB == YAxis.YAxisLabelPosition.OUTSIDE_CHART ? this.mViewPortHandler.f() : this.mViewPortHandler.f()) + fA + fE;
            }
            drawYLabels(canvas, f, transformedPositions, this.mYAxis.getYOffset());
        }
    }

    @Override // defpackage.ttr, defpackage.gt1
    public void renderAxisLine(Canvas canvas) {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawAxisLineEnabled()) {
            this.mAxisLinePaint.setColor(this.mYAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mYAxis.getAxisLineWidth());
            if (this.mYAxis.a() == YAxis.AxisDependency.LEFT) {
                canvas.drawLine(this.mViewPortHandler.h(), this.mViewPortHandler.j(), this.mViewPortHandler.i(), this.mViewPortHandler.j(), this.mAxisLinePaint);
            } else {
                canvas.drawLine(this.mViewPortHandler.h(), this.mViewPortHandler.f(), this.mViewPortHandler.i(), this.mViewPortHandler.f(), this.mAxisLinePaint);
            }
        }
    }

    @Override // defpackage.ttr, defpackage.gt1
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines = this.mYAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        float[] fArr = this.c;
        float f = 0.0f;
        fArr[0] = 0.0f;
        char c = 1;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        Path path = this.f36130b;
        path.reset();
        int i = 0;
        while (i < limitLines.size()) {
            LimitLine limitLine = limitLines.get(i);
            if (limitLine.isEnabled()) {
                int iSave = canvas.save();
                this.mLimitLineClippingRect.set(this.mViewPortHandler.p());
                this.mLimitLineClippingRect.inset(-limitLine.g(), f);
                canvas.clipRect(this.mLimitLineClippingRect);
                fArr[0] = limitLine.e();
                fArr[2] = limitLine.e();
                this.mTrans.k(fArr);
                fArr[c] = this.mViewPortHandler.j();
                fArr[3] = this.mViewPortHandler.f();
                path.moveTo(fArr[0], fArr[c]);
                path.lineTo(fArr[2], fArr[3]);
                this.mLimitLinePaint.setStyle(Paint.Style.STROKE);
                this.mLimitLinePaint.setColor(limitLine.f());
                this.mLimitLinePaint.setPathEffect(limitLine.b());
                this.mLimitLinePaint.setStrokeWidth(limitLine.g());
                canvas.drawPath(path, this.mLimitLinePaint);
                path.reset();
                String strC = limitLine.c();
                if (strC != null && !strC.equals("")) {
                    this.mLimitLinePaint.setStyle(limitLine.h());
                    this.mLimitLinePaint.setPathEffect(null);
                    this.mLimitLinePaint.setColor(limitLine.getTextColor());
                    this.mLimitLinePaint.setTypeface(limitLine.getTypeface());
                    this.mLimitLinePaint.setStrokeWidth(0.5f);
                    this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
                    float fG = limitLine.g() + limitLine.getXOffset();
                    float fE = fmq.e(2.0f) + limitLine.getYOffset();
                    LimitLine.LimitLabelPosition limitLabelPositionD = limitLine.d();
                    if (limitLabelPositionD == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                        float fA = fmq.a(this.mLimitLinePaint, strC);
                        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(strC, fArr[0] + fG, this.mViewPortHandler.j() + fE + fA, this.mLimitLinePaint);
                    } else if (limitLabelPositionD == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(strC, fArr[0] + fG, this.mViewPortHandler.f() - fE, this.mLimitLinePaint);
                    } else if (limitLabelPositionD == LimitLine.LimitLabelPosition.LEFT_TOP) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(strC, fArr[0] - fG, this.mViewPortHandler.j() + fE + fmq.a(this.mLimitLinePaint, strC), this.mLimitLinePaint);
                    } else {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(strC, fArr[0] - fG, this.mViewPortHandler.f() - fE, this.mLimitLinePaint);
                    }
                }
                canvas.restoreToCount(iSave);
            }
            i++;
            f = 0.0f;
            c = 1;
        }
    }
}
