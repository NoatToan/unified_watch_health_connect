package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;

/* JADX INFO: loaded from: classes14.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {
    private static final float ROUND_CAP_RAMP_DOWN_THRESHHOLD = 0.01f;
    private float adjustedRadius;
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float totalTrackLengthFraction;
    private boolean useStrokeCap;

    public CircularDrawingDelegate(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    private void drawArc(Canvas canvas, Paint paint, float f14, float f15, int i14, int i15, int i16) {
        float f16 = f15 >= f14 ? f15 - f14 : (f15 + 1.0f) - f14;
        float f17 = f14 % 1.0f;
        if (this.totalTrackLengthFraction < 1.0f) {
            float f18 = f17 + f16;
            if (f18 > 1.0f) {
                drawArc(canvas, paint, f17, 1.0f, i14, i15, 0);
                drawArc(canvas, paint, 1.0f, f18, i14, 0, i16);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.displayedCornerRadius / this.adjustedRadius);
        if (f17 == 0.0f && f16 >= 0.99f) {
            f16 += (((degrees * 2.0f) / 360.0f) * (f16 - 0.99f)) / ROUND_CAP_RAMP_DOWN_THRESHHOLD;
        }
        float fLerp = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, f17);
        float fLerp2 = MathUtils.lerp(0.0f, this.totalTrackLengthFraction, f16);
        float degrees2 = (float) Math.toDegrees(i15 / this.adjustedRadius);
        float degrees3 = ((fLerp2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i16 / this.adjustedRadius));
        float f19 = (fLerp * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i14);
        paint.setStrokeWidth(this.displayedTrackThickness);
        float f22 = degrees * 2.0f;
        if (degrees3 < f22) {
            float f24 = degrees3 / f22;
            paint.setStyle(Paint.Style.FILL);
            drawRoundedBlock(canvas, paint, (degrees * f24) + f19, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness, f24);
            return;
        }
        float f25 = this.adjustedRadius;
        RectF rectF = new RectF(-f25, -f25, f25, f25);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.useStrokeCap ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f26 = f19 + degrees;
        canvas.drawArc(rectF, f26, degrees3 - f22, false, paint);
        if (this.useStrokeCap || this.displayedCornerRadius <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        drawRoundedBlock(canvas, paint, f26, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
        drawRoundedBlock(canvas, paint, (f19 + degrees3) - degrees, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, float f14, float f15, float f16, float f17) {
        float fMin = (int) Math.min(f16, this.displayedTrackThickness);
        float f18 = f15 / 2.0f;
        float fMin2 = Math.min(f18, (this.displayedCornerRadius * fMin) / this.displayedTrackThickness);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f15) / 2.0f, fMin / 2.0f, f18);
        canvas.save();
        double d14 = f14;
        canvas.translate((float) (Math.cos(Math.toRadians(d14)) * ((double) this.adjustedRadius)), (float) (Math.sin(Math.toRadians(d14)) * ((double) this.adjustedRadius)));
        canvas.rotate(f14);
        canvas.scale(f17, f17);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    private int getSize() {
        S s8 = this.spec;
        return (((CircularProgressIndicatorSpec) s8).indicatorInset * 2) + ((CircularProgressIndicatorSpec) s8).indicatorSize;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(Canvas canvas, Rect rect, float f14, boolean z14, boolean z15) {
        float fWidth = rect.width() / getPreferredWidth();
        float fHeight = rect.height() / getPreferredHeight();
        S s8 = this.spec;
        float f15 = (((CircularProgressIndicatorSpec) s8).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) s8).indicatorInset;
        canvas.translate((f15 * fWidth) + rect.left, (f15 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((CircularProgressIndicatorSpec) this.spec).indicatorDirection != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f16 = -f15;
        canvas.clipRect(f16, f16, f15, f15);
        S s14 = this.spec;
        this.useStrokeCap = ((CircularProgressIndicatorSpec) s14).trackThickness / 2 <= ((CircularProgressIndicatorSpec) s14).trackCornerRadius;
        this.displayedTrackThickness = ((CircularProgressIndicatorSpec) s14).trackThickness * f14;
        this.displayedCornerRadius = Math.min(((CircularProgressIndicatorSpec) s14).trackThickness / 2, ((CircularProgressIndicatorSpec) s14).trackCornerRadius) * f14;
        S s15 = this.spec;
        float f17 = (((CircularProgressIndicatorSpec) s15).indicatorSize - ((CircularProgressIndicatorSpec) s15).trackThickness) / 2.0f;
        this.adjustedRadius = f17;
        if (z14 || z15) {
            if ((z14 && ((CircularProgressIndicatorSpec) s15).showAnimationBehavior == 2) || (z15 && ((CircularProgressIndicatorSpec) s15).hideAnimationBehavior == 1)) {
                this.adjustedRadius = (((1.0f - f14) * ((CircularProgressIndicatorSpec) s15).trackThickness) / 2.0f) + f17;
            } else if ((z14 && ((CircularProgressIndicatorSpec) s15).showAnimationBehavior == 1) || (z15 && ((CircularProgressIndicatorSpec) s15).hideAnimationBehavior == 2)) {
                this.adjustedRadius = f17 - (((1.0f - f14) * ((CircularProgressIndicatorSpec) s15).trackThickness) / 2.0f);
            }
        }
        if (z15 && ((CircularProgressIndicatorSpec) s15).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f14;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(Canvas canvas, Paint paint, int i14, int i15) {
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(Canvas canvas, Paint paint, DrawingDelegate.ActiveIndicator activeIndicator, int i14) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i14);
        float f14 = activeIndicator.startFraction;
        float f15 = activeIndicator.endFraction;
        int i15 = activeIndicator.gapSize;
        drawArc(canvas, paint, f14, f15, iCompositeARGBWithAlpha, i15, i15);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(Canvas canvas, Paint paint, float f14, float f15, int i14, int i15, int i16) {
        drawArc(canvas, paint, f14, f15, MaterialColors.compositeARGBWithAlpha(i14, i15), i16, i16);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return getSize();
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, float f14, float f15, float f16) {
        drawRoundedBlock(canvas, paint, f14, f15, f16, 1.0f);
    }
}
