package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import g7.a;

/* JADX INFO: loaded from: classes14.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float totalTrackLengthFraction;
    private float trackLength;
    private boolean useStrokeCap;

    public LinearDrawingDelegate(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
    }

    private void drawLine(Canvas canvas, Paint paint, float f14, float f15, int i14, int i15, int i16) {
        float f16;
        float fA = a.a(f14, 0.0f, 1.0f);
        float fA2 = a.a(f15, 0.0f, 1.0f);
        float fLerp = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fA);
        float fLerp2 = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fA2);
        int iA = (int) ((a.a(fLerp, 0.0f, 0.01f) * i15) / 0.01f);
        float fA3 = 1.0f - a.a(fLerp2, 0.99f, 1.0f);
        float f17 = this.trackLength;
        int i17 = (int) ((fLerp * f17) + iA);
        int i18 = (int) ((fLerp2 * f17) - ((int) ((fA3 * i16) / 0.01f)));
        float f18 = (-f17) / 2.0f;
        if (i17 <= i18) {
            float f19 = this.displayedCornerRadius;
            float f22 = i17 + f19;
            float f24 = i18 - f19;
            float f25 = f19 * 2.0f;
            paint.setColor(i14);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.displayedTrackThickness);
            if (f22 >= f24) {
                drawRoundedBlock(canvas, paint, new PointF(f22 + f18, 0.0f), new PointF(f24 + f18, 0.0f), f25, this.displayedTrackThickness);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.useStrokeCap ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f26 = f22 + f18;
            float f27 = f24 + f18;
            canvas.drawLine(f26, 0.0f, f27, 0.0f, paint);
            if (this.useStrokeCap || this.displayedCornerRadius <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f22 > 0.0f) {
                f16 = f25;
                drawRoundedBlock(canvas, paint, new PointF(f26, 0.0f), f16, this.displayedTrackThickness);
            } else {
                f16 = f25;
            }
            if (f24 < this.trackLength) {
                drawRoundedBlock(canvas, paint, new PointF(f27, 0.0f), f16, this.displayedTrackThickness);
            }
        }
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f14, float f15) {
        float fMin = Math.min(f15, this.displayedTrackThickness);
        float f16 = f14 / 2.0f;
        float fMin2 = Math.min(f16, (this.displayedCornerRadius * fMin) / this.displayedTrackThickness);
        RectF rectF = new RectF((-f14) / 2.0f, (-fMin) / 2.0f, f16, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(Canvas canvas, Rect rect, float f14, boolean z14, boolean z15) {
        this.trackLength = rect.width();
        float f15 = ((LinearProgressIndicatorSpec) this.spec).trackThickness;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - f15) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f16 = this.trackLength / 2.0f;
        float f17 = f15 / 2.0f;
        canvas.clipRect(-f16, -f17, f16, f17);
        S s8 = this.spec;
        this.useStrokeCap = ((LinearProgressIndicatorSpec) s8).trackThickness / 2 == ((LinearProgressIndicatorSpec) s8).trackCornerRadius;
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) s8).trackThickness * f14;
        this.displayedCornerRadius = Math.min(((LinearProgressIndicatorSpec) s8).trackThickness / 2, ((LinearProgressIndicatorSpec) s8).trackCornerRadius) * f14;
        if (z14 || z15) {
            if ((z14 && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (z15 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z14 || (z15 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3)) {
                canvas.translate(0.0f, ((1.0f - f14) * ((LinearProgressIndicatorSpec) this.spec).trackThickness) / 2.0f);
            }
        }
        if (z15 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f14;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(Canvas canvas, Paint paint, int i14, int i15) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i14, i15);
        if (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize <= 0 || iCompositeARGBWithAlpha == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iCompositeARGBWithAlpha);
        PointF pointF = new PointF((this.trackLength / 2.0f) - (this.displayedTrackThickness / 2.0f), 0.0f);
        S s8 = this.spec;
        drawRoundedBlock(canvas, paint, pointF, ((LinearProgressIndicatorSpec) s8).trackStopIndicatorSize, ((LinearProgressIndicatorSpec) s8).trackStopIndicatorSize);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(Canvas canvas, Paint paint, DrawingDelegate.ActiveIndicator activeIndicator, int i14) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i14);
        float f14 = activeIndicator.startFraction;
        float f15 = activeIndicator.endFraction;
        int i15 = activeIndicator.gapSize;
        drawLine(canvas, paint, f14, f15, iCompositeARGBWithAlpha, i15, i15);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(Canvas canvas, Paint paint, float f14, float f15, int i14, int i15, int i16) {
        drawLine(canvas, paint, f14, f15, MaterialColors.compositeARGBWithAlpha(i14, i15), i16, i16);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return ((LinearProgressIndicatorSpec) this.spec).trackThickness;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, PointF pointF, float f14, float f15) {
        drawRoundedBlock(canvas, paint, pointF, null, f14, f15);
    }
}
