package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ttr extends gt1 {
    protected Path mDrawZeroLinePath;
    protected float[] mGetTransformedPositionsBuffer;
    protected RectF mGridClippingRect;
    protected RectF mLimitLineClippingRect;
    protected Path mRenderGridLinesPath;
    protected Path mRenderLimitLines;
    protected float[] mRenderLimitLinesBuffer;
    protected YAxis mYAxis;
    protected RectF mZeroLineClippingRect;
    protected Paint mZeroLinePaint;

    public ttr(hwq hwqVar, YAxis yAxis, ryp rypVar) {
        super(hwqVar, rypVar, yAxis);
        this.mRenderGridLinesPath = new Path();
        this.mGridClippingRect = new RectF();
        this.mGetTransformedPositionsBuffer = new float[2];
        this.mDrawZeroLinePath = new Path();
        this.mZeroLineClippingRect = new RectF();
        this.mRenderLimitLines = new Path();
        this.mRenderLimitLinesBuffer = new float[2];
        this.mLimitLineClippingRect = new RectF();
        this.mYAxis = yAxis;
        if (this.mViewPortHandler != null) {
            this.mAxisLabelPaint.setColor(-16777216);
            this.mAxisLabelPaint.setTextSize(fmq.e(10.0f));
            Paint paint = new Paint(1);
            this.mZeroLinePaint = paint;
            paint.setColor(-7829368);
            this.mZeroLinePaint.setStrokeWidth(1.0f);
            this.mZeroLinePaint.setStyle(Paint.Style.STROKE);
        }
    }

    public void drawYLabels(Canvas canvas, float f, float[] fArr, float f2) {
        int i = this.mYAxis.m() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
        float fC = this.mYAxis.c();
        for (int i2 = !this.mYAxis.l() ? 1 : 0; i2 < i; i2++) {
            canvas.drawText(this.mYAxis.getFormattedLabel(i2), f + fC, fArr[(i2 * 2) + 1] + f2, this.mAxisLabelPaint);
        }
    }

    public void drawZeroLine(Canvas canvas) {
        int iSave = canvas.save();
        this.mZeroLineClippingRect.set(this.mViewPortHandler.p());
        this.mZeroLineClippingRect.inset(0.0f, -this.mYAxis.k());
        canvas.clipRect(this.mZeroLineClippingRect);
        vye vyeVarE = this.mTrans.e(0.0f, 0.0f);
        this.mZeroLinePaint.setColor(this.mYAxis.j());
        this.mZeroLinePaint.setStrokeWidth(this.mYAxis.k());
        Path path = this.mDrawZeroLinePath;
        path.reset();
        path.moveTo(this.mViewPortHandler.h(), (float) vyeVarE.d);
        path.lineTo(this.mViewPortHandler.i(), (float) vyeVarE.d);
        canvas.drawPath(path, this.mZeroLinePaint);
        canvas.restoreToCount(iSave);
    }

    public RectF getGridClippingRect() {
        this.mGridClippingRect.set(this.mViewPortHandler.p());
        this.mGridClippingRect.inset(0.0f, -this.mAxis.getGridLineWidth());
        return this.mGridClippingRect;
    }

    public float[] getTransformedPositions() {
        int length = this.mGetTransformedPositionsBuffer.length;
        int i = this.mYAxis.mEntryCount;
        if (length != i * 2) {
            this.mGetTransformedPositionsBuffer = new float[i * 2];
        }
        float[] fArr = this.mGetTransformedPositionsBuffer;
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2 + 1] = this.mYAxis.mEntries[i2 / 2];
        }
        this.mTrans.k(fArr);
        return fArr;
    }

    public Path linePath(Path path, int i, float[] fArr) {
        int i2 = i + 1;
        path.moveTo(this.mViewPortHandler.I(), fArr[i2]);
        path.lineTo(this.mViewPortHandler.i(), fArr[i2]);
        return path;
    }

    @Override // defpackage.gt1
    public void renderAxisLabels(Canvas canvas) {
        float fI;
        float fI2;
        float f;
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            float[] transformedPositions = getTransformedPositions();
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            float xOffset = this.mYAxis.getXOffset();
            float fA = (fmq.a(this.mAxisLabelPaint, "A") / 2.5f) + this.mYAxis.getYOffset();
            YAxis.AxisDependency axisDependencyA = this.mYAxis.a();
            YAxis.YAxisLabelPosition yAxisLabelPositionB = this.mYAxis.b();
            if (axisDependencyA == YAxis.AxisDependency.LEFT) {
                if (yAxisLabelPositionB == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                    this.mAxisLabelPaint.setTextAlign(Paint.Align.RIGHT);
                    fI = this.mViewPortHandler.I();
                    f = fI - xOffset;
                } else {
                    this.mAxisLabelPaint.setTextAlign(Paint.Align.LEFT);
                    fI2 = this.mViewPortHandler.I();
                    f = fI2 + xOffset;
                }
            } else if (yAxisLabelPositionB == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                this.mAxisLabelPaint.setTextAlign(Paint.Align.LEFT);
                fI2 = this.mViewPortHandler.i();
                f = fI2 + xOffset;
            } else {
                this.mAxisLabelPaint.setTextAlign(Paint.Align.RIGHT);
                fI = this.mViewPortHandler.i();
                f = fI - xOffset;
            }
            drawYLabels(canvas, f, transformedPositions, fA);
        }
    }

    @Override // defpackage.gt1
    public void renderAxisLine(Canvas canvas) {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawAxisLineEnabled()) {
            this.mAxisLinePaint.setColor(this.mYAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mYAxis.getAxisLineWidth());
            if (this.mYAxis.a() == YAxis.AxisDependency.LEFT) {
                canvas.drawLine(this.mViewPortHandler.h(), this.mViewPortHandler.j(), this.mViewPortHandler.h(), this.mViewPortHandler.f(), this.mAxisLinePaint);
            } else {
                canvas.drawLine(this.mViewPortHandler.i(), this.mViewPortHandler.j(), this.mViewPortHandler.i(), this.mViewPortHandler.f(), this.mAxisLinePaint);
            }
        }
    }

    @Override // defpackage.gt1
    public void renderGridLines(Canvas canvas) {
        if (this.mYAxis.isEnabled()) {
            if (this.mYAxis.isDrawGridLinesEnabled()) {
                int iSave = canvas.save();
                canvas.clipRect(getGridClippingRect());
                float[] transformedPositions = getTransformedPositions();
                this.mGridPaint.setColor(this.mYAxis.getGridColor());
                this.mGridPaint.setStrokeWidth(this.mYAxis.getGridLineWidth());
                this.mGridPaint.setPathEffect(this.mYAxis.getGridDashPathEffect());
                Path path = this.mRenderGridLinesPath;
                path.reset();
                for (int i = 0; i < transformedPositions.length; i += 2) {
                    canvas.drawPath(linePath(path, i, transformedPositions), this.mGridPaint);
                    path.reset();
                }
                canvas.restoreToCount(iSave);
            }
            if (this.mYAxis.n()) {
                drawZeroLine(canvas);
            }
        }
    }

    @Override // defpackage.gt1
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines = this.mYAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        float[] fArr = this.mRenderLimitLinesBuffer;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path = this.mRenderLimitLines;
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
                    this.mLimitLinePaint.setTypeface(limitLine.getTypeface());
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
