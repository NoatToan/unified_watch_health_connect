package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class q6o extends ttr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hwq f31180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xd5 f31181b;

    public q6o(hwq hwqVar, YAxis yAxis, ryp rypVar, xd5 xd5Var) {
        super(hwqVar, yAxis, rypVar);
        this.f31180a = hwqVar;
        this.f31181b = xd5Var;
    }

    public final RectF a(float[] fArr, Canvas canvas, String str) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(x44.a(aji.w));
        RectF rectF = new RectF();
        rectF.set(c(str), fArr[0], b(str), fArr[1]);
        float fDip2px = DisplayUtil.dip2px(8.0f);
        canvas.drawRoundRect(rectF, fDip2px, fDip2px, paint);
        return rectF;
    }

    public final float b(String str) {
        return AppUtil.isRTLDirection() ? this.f31180a.h() + DisplayUtil.dip2px(4.0f) + this.mLimitLinePaint.measureText(str) + DisplayUtil.dip2px(2.0f) : this.f31180a.i() - DisplayUtil.dip2px(4.0f);
    }

    public final float c(String str) {
        return AppUtil.isRTLDirection() ? this.f31180a.h() + DisplayUtil.dip2px(4.0f) : (this.f31180a.i() - this.mLimitLinePaint.measureText(str)) - DisplayUtil.dip2px(6.0f);
    }

    @Override // defpackage.gt1
    public void computeAxisValues(float f, float f2) {
        ft1 ft1Var = this.mAxis;
        if (!(ft1Var instanceof p6o) || !this.f31181b.g) {
            super.computeAxisValues(f, f2);
            return;
        }
        int labelCount = ft1Var.getLabelCount();
        double dAbs = Math.abs(f2 - f);
        if (labelCount == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            ft1 ft1Var2 = this.mAxis;
            ft1Var2.mEntries = new float[0];
            ft1Var2.mCenteredEntries = new float[0];
            ft1Var2.mEntryCount = 0;
        }
    }

    public void d(xd5 xd5Var) {
        this.f31181b = xd5Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    @Override // defpackage.ttr
    public void drawYLabels(Canvas canvas, float f, float[] fArr, float f2) {
        boolean z;
        float f3;
        int i = !this.mYAxis.l() ? 1 : 0;
        int i2 = this.mYAxis.m() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
        float fAbs = i2 > i ? Math.abs(Math.abs(this.mYAxis.mEntries[i + 1]) - Math.abs(this.mYAxis.mEntries[i])) : 0.0f;
        for (int i3 = i; i3 < i2; i3++) {
            String formattedLabel = this.mYAxis.getFormattedLabel(i3);
            if (i3 == i2 - 1) {
                YAxis yAxis = this.mYAxis;
                float fAbs2 = Math.abs(Math.abs(yAxis.getAxisMaximum()) - Math.abs(yAxis.mEntries[i3]));
                if (fAbs2 >= 0.0f) {
                    f3 = fAbs / fAbs2;
                    z = true;
                } else {
                    if (fAbs2 == 0.0f) {
                        z = false;
                    } else {
                        z = true;
                    }
                    f3 = 0.0f;
                }
            } else {
                z = true;
                f3 = 0.0f;
            }
            if (i3 == i) {
                YAxis yAxis2 = this.mYAxis;
                float fAbs3 = Math.abs(Math.abs(yAxis2.getAxisMinimum()) - Math.abs(yAxis2.mEntries[i3]));
                if (fAbs3 > 0.0f) {
                    f3 = fAbs / fAbs3;
                } else if (fAbs3 == 0.0f) {
                    z = true;
                }
            }
            if (f3 <= 5.0f && z) {
                canvas.drawText(formattedLabel, f, fArr[(i3 * 2) + 1] + f2, this.mAxisLabelPaint);
            }
        }
    }

    @Override // defpackage.ttr, defpackage.gt1
    public void renderAxisLine(Canvas canvas) {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawAxisLineEnabled()) {
            this.mAxisLinePaint.setColor(this.mYAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mYAxis.getAxisLineWidth());
            canvas.drawLine(this.f31180a.h(), this.f31180a.j(), this.f31180a.h(), this.f31180a.f(), this.mAxisLinePaint);
            canvas.drawLine(this.f31180a.i(), this.f31180a.j(), this.f31180a.i(), this.f31180a.f(), this.mAxisLinePaint);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    @Override // defpackage.ttr, defpackage.gt1
    public void renderGridLines(Canvas canvas) {
        boolean z;
        float f;
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawAxisLineEnabled()) {
            if (this.mYAxis.isDrawGridLinesEnabled()) {
                int iSave = canvas.save();
                canvas.clipRect(getGridClippingRect());
                float[] transformedPositions = getTransformedPositions();
                this.mGridPaint.setColor(this.mYAxis.getGridColor());
                this.mGridPaint.setStrokeWidth(this.mYAxis.getGridLineWidth());
                this.mGridPaint.setPathEffect(this.mYAxis.getGridDashPathEffect());
                Path path = this.mRenderGridLinesPath;
                path.reset();
                YAxis yAxis = this.mYAxis;
                int i = yAxis.mEntryCount;
                float fAbs = i > 0 ? Math.abs(Math.abs(yAxis.mEntries[1]) - Math.abs(this.mYAxis.mEntries[0])) : 0.0f;
                int i2 = 0;
                for (int i3 = 0; i2 < transformedPositions.length && i3 < i; i3++) {
                    if (i3 == 0) {
                        YAxis yAxis2 = this.mYAxis;
                        float fAbs2 = Math.abs(Math.abs(yAxis2.getAxisMinimum()) - Math.abs(yAxis2.mEntries[i3]));
                        if (fAbs2 > 0.0f) {
                            f = fAbs / fAbs2;
                            z = true;
                        } else {
                            if (fAbs2 == 0.0f) {
                                z = false;
                            } else {
                                z = true;
                            }
                            f = 0.0f;
                        }
                    } else {
                        z = true;
                        f = 0.0f;
                    }
                    if (i3 == i - 1) {
                        YAxis yAxis3 = this.mYAxis;
                        float fAbs3 = Math.abs(Math.abs(yAxis3.getAxisMaximum()) - Math.abs(yAxis3.mEntries[i3]));
                        if (fAbs3 > 0.0f) {
                            f = fAbs / fAbs3;
                        }
                    }
                    if (f <= 5.0f && z) {
                        canvas.drawPath(linePath(path, i2, transformedPositions), this.mGridPaint);
                    }
                    path.reset();
                    i2 += 2;
                }
                canvas.restoreToCount(iSave);
            }
            if (this.mYAxis.n()) {
                drawZeroLine(canvas);
            }
        }
    }

    @Override // defpackage.ttr, defpackage.gt1
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
                this.mLimitLineClippingRect.set(this.f31180a.p());
                this.mLimitLineClippingRect.inset(0.0f, -limitLine.g());
                canvas.clipRect(this.mLimitLineClippingRect);
                this.mLimitLinePaint.setStyle(Paint.Style.STROKE);
                this.mLimitLinePaint.setColor(limitLine.f());
                this.mLimitLinePaint.setStrokeWidth(limitLine.g());
                this.mLimitLinePaint.setPathEffect(limitLine.b());
                fArr[1] = limitLine.e();
                this.mTrans.k(fArr);
                path.moveTo(this.f31180a.h(), fArr[1]);
                path.lineTo(this.f31180a.i(), fArr[1]);
                canvas.drawPath(path, this.mLimitLinePaint);
                path.reset();
                String strC = limitLine.c();
                if (strC != null && !strC.equals("")) {
                    float fSp2px = DisplayUtil.sp2px(9.0f);
                    this.mLimitLinePaint.setStyle(limitLine.h());
                    this.mLimitLinePaint.setPathEffect(null);
                    this.mLimitLinePaint.setColor(limitLine.getTextColor());
                    this.mLimitLinePaint.setTypeface(limitLine.getTypeface());
                    this.mLimitLinePaint.setStrokeWidth(1.6f);
                    this.mLimitLinePaint.setTextSize(fSp2px);
                    float fI = o8p.i(this.mLimitLinePaint);
                    float fE = fmq.e(4.0f) + limitLine.getXOffset();
                    limitLine.g();
                    limitLine.getYOffset();
                    LimitLine.LimitLabelPosition limitLabelPositionD = limitLine.d();
                    if (limitLabelPositionD == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                        float fDip2px = fArr[1] - DisplayUtil.dip2px(2.0f);
                        canvas.drawText(strC, this.f31180a.i() - fE, o8p.h(a(new float[]{(fDip2px - fI) - DisplayUtil.dip2px(2.0f), fDip2px}, canvas, strC), this.mLimitLinePaint), this.mLimitLinePaint);
                    } else if (limitLabelPositionD == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                        float fDip2px2 = fArr[1] + DisplayUtil.dip2px(2.0f);
                        canvas.drawText(strC, this.f31180a.i() - fE, o8p.h(a(new float[]{fDip2px2, fI + fDip2px2 + DisplayUtil.dip2px(2.0f)}, canvas, strC), this.mLimitLinePaint), this.mLimitLinePaint);
                    } else if (limitLabelPositionD == LimitLine.LimitLabelPosition.LEFT_BOTTOM) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                        float fDip2px3 = fArr[1] + DisplayUtil.dip2px(2.0f);
                        canvas.drawText(strC, this.f31180a.I() + fE, o8p.h(a(new float[]{fDip2px3, fI + fDip2px3 + DisplayUtil.dip2px(2.0f)}, canvas, strC), this.mLimitLinePaint), this.mLimitLinePaint);
                    } else if (limitLabelPositionD == LimitLine.LimitLabelPosition.LEFT_TOP) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                        float fDip2px4 = fArr[1] - DisplayUtil.dip2px(2.0f);
                        canvas.drawText(strC, this.f31180a.h() + fE, o8p.h(a(new float[]{(fDip2px4 - fI) - DisplayUtil.dip2px(2.0f), fDip2px4}, canvas, strC), this.mLimitLinePaint), this.mLimitLinePaint);
                    }
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
