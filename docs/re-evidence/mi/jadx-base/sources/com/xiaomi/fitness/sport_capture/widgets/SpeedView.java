package com.xiaomi.fitness.sport_capture.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.work.WorkInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import defpackage.wwi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013J\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0014J0\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020!H\u0014J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/sport_capture/widgets/SpeedView;", "Landroid/view/View;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "circleBgPaint", "Landroid/graphics/Paint;", "outerPaint", "startEndCornerPaint", "startEndCornerPointSpeedPaint", "curSpeedPaint", "speedPaint", "speedUnitPaint", "arrowBitmap", "Landroid/graphics/Bitmap;", "centerX", "", "centerY", "radius", "outRadius", "rectF", "Landroid/graphics/RectF;", "outRect", "startEndRect", "curSpeed", "setSpeed", "", "speed", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "onDraw", "canvas", "Landroid/graphics/Canvas;", "Companion", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpeedView extends View {
    private static final int MAX_SPEED = 50;
    private static final float MAX_SWIPE_ANGLE = 300.0f;
    private static final float OPEN_ANGLE = 60.0f;
    private static final float SPEED_TEXT_SIZE = 50.0f;
    private static final float SPEED_UNIT_TEXT_SIZE = 45.0f;
    private static final float START_ANGLE = 120.0f;
    private static final float STROKE_WIDTH = 18.0f;

    @NotNull
    private final Bitmap arrowBitmap;
    private float centerX;
    private float centerY;

    @NotNull
    private final Paint circleBgPaint;
    private float curSpeed;

    @NotNull
    private final Paint curSpeedPaint;
    private float outRadius;

    @NotNull
    private final RectF outRect;

    @NotNull
    private final Paint outerPaint;
    private float radius;

    @NotNull
    private final RectF rectF;

    @NotNull
    private final Paint speedPaint;

    @NotNull
    private final Paint speedUnitPaint;

    @NotNull
    private final Paint startEndCornerPaint;

    @NotNull
    private final Paint startEndCornerPointSpeedPaint;

    @NotNull
    private final RectF startEndRect;

    public /* synthetic */ SpeedView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawCircle(this.centerX, this.centerY, this.outRadius, this.circleBgPaint);
        this.circleBgPaint.setColor(Color.parseColor("#50616161"));
        canvas.drawCircle(this.centerX, this.centerY, this.outRadius, this.circleBgPaint);
        canvas.drawArc(this.rectF, 120.0f, 300.0f, false, this.outerPaint);
        float f = 50;
        canvas.drawArc(this.rectF, 120.0f, (this.curSpeed / f) * 300.0f, false, this.curSpeedPaint);
        canvas.save();
        canvas.rotate((((this.curSpeed / f) * 300) + 120.0f) - 270.0f, this.centerX, this.centerY);
        canvas.translate(0.0f, (-this.radius) + 9);
        Bitmap bitmap = this.arrowBitmap;
        canvas.drawBitmap(bitmap, this.centerX - (bitmap.getWidth() / 2), this.centerY - (this.arrowBitmap.getHeight() / 2), (Paint) null);
        canvas.restore();
        canvas.drawText(String.valueOf((int) this.curSpeed), this.centerX, this.centerY - 25.0f, this.speedPaint);
        canvas.drawText("KM/H", this.centerX, this.centerY + 25.0f, this.speedUnitPaint);
        canvas.save();
        canvas.rotate(-60.0f, this.centerX, this.centerY);
        canvas.translate(-this.radius, 0.0f);
        if (this.curSpeed > 0.0f) {
            canvas.drawArc(this.startEndRect, 0.0f, 180.0f, false, this.startEndCornerPointSpeedPaint);
        } else {
            canvas.drawArc(this.startEndRect, 0.0f, 180.0f, false, this.startEndCornerPaint);
        }
        canvas.restore();
        canvas.save();
        canvas.rotate(60.0f, this.centerX, this.centerY);
        canvas.translate(this.radius, 0.0f);
        if (this.curSpeed >= 50.0f) {
            canvas.drawArc(this.startEndRect, 0.0f, 180.0f, false, this.startEndCornerPointSpeedPaint);
        } else {
            canvas.drawArc(this.startEndRect, 0.0f, 180.0f, false, this.startEndCornerPaint);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.centerX = getWidth() / 2.0f;
        this.centerY = getHeight() / 2.0f;
        this.radius = (RangesKt___RangesKt.coerceAtMost(getWidth(), getHeight()) / 2) * 0.9f;
        float fCoerceAtMost = RangesKt___RangesKt.coerceAtMost(getWidth(), getHeight()) / 2.0f;
        this.outRadius = fCoerceAtMost;
        RectF rectF = this.rectF;
        float f = this.centerX;
        float f2 = this.radius;
        rectF.left = f - f2;
        float f3 = this.centerY;
        rectF.top = f3 - f2;
        rectF.right = f + f2;
        rectF.bottom = f2 + f3;
        RectF rectF2 = this.outRect;
        rectF2.left = f - fCoerceAtMost;
        rectF2.top = f3 - fCoerceAtMost;
        rectF2.right = f + fCoerceAtMost;
        rectF2.bottom = fCoerceAtMost + f3;
        RectF rectF3 = this.startEndRect;
        rectF3.left = f - 9.0f;
        rectF3.top = f3 - 9.0f;
        rectF3.right = f + 9.0f;
        rectF3.bottom = f3 + 9.0f;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(100, size);
        } else if (mode != 1073741824) {
            size = 100;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(100, size2);
        } else if (mode2 != 1073741824) {
            size2 = 100;
        }
        setMeasuredDimension(size, size2);
    }

    public final void setSpeed(float speed) {
        this.curSpeed = speed;
        postInvalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeedView(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        super(ctx, attributeSet);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#4DADADAD"));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.circleBgPaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(Color.parseColor("#7AFFFFFF"));
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setStrokeWidth(STROKE_WIDTH);
        this.outerPaint = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(Color.parseColor("#7AFFFFFF"));
        paint3.setStyle(style);
        paint3.setStrokeWidth(STROKE_WIDTH);
        this.startEndCornerPaint = paint3;
        Paint paint4 = new Paint();
        paint4.setColor(WorkInfo.STOP_REASON_NOT_STOPPED);
        paint4.setStyle(style);
        paint4.setStrokeWidth(STROKE_WIDTH);
        this.startEndCornerPointSpeedPaint = paint4;
        Paint paint5 = new Paint();
        paint5.setColor(WorkInfo.STOP_REASON_NOT_STOPPED);
        paint5.setStyle(style2);
        paint5.setStrokeWidth(STROKE_WIDTH);
        this.curSpeedPaint = paint5;
        Paint paint6 = new Paint();
        paint6.setColor(-1);
        paint6.setTextSize(50.0f);
        Paint.Align align = Paint.Align.CENTER;
        paint6.setTextAlign(align);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        paint6.setTypeface(typeface);
        this.speedPaint = paint6;
        Paint paint7 = new Paint();
        paint7.setColor(-1);
        paint7.setTextSize(SPEED_UNIT_TEXT_SIZE);
        paint7.setTextAlign(align);
        paint7.setTypeface(typeface);
        this.speedUnitPaint = paint7;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(ctx.getResources(), wwi.number_arrow);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
        this.arrowBitmap = bitmapDecodeResource;
        this.centerX = -1.0f;
        this.centerY = -1.0f;
        this.radius = -1.0f;
        this.outRadius = -1.0f;
        this.rectF = new RectF();
        this.outRect = new RectF();
        this.startEndRect = new RectF();
    }
}
