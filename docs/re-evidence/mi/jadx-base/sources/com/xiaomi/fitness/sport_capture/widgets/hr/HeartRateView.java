package com.xiaomi.fitness.sport_capture.widgets.hr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.work.WorkInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.wwi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 02\u00020\u0001:\u00010B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001cJ\u0018\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001aH\u0014J0\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001aH\u0014J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/widgets/hr/HeartRateView;", "Landroid/view/View;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getAttrs", "()Landroid/util/AttributeSet;", "circleBgPaint", "Landroid/graphics/Paint;", "arcPaint", "startEndCornerPointSpeedPaint", "textPaint", "arrowBitmap", "Landroid/graphics/Bitmap;", "centerX", "", "centerY", "radius", "outRadius", "rectF", "Landroid/graphics/RectF;", "startEndRect", "curHr", "", "curHrSectionStr", "", "curHrSection", "setHr", "", "hr", "section", "sectionStr", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "onDraw", "canvas", "Landroid/graphics/Canvas;", "Companion", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeartRateView extends View {
    private static final int HR_STAGE_BURNED = 2;
    private static final int HR_STAGE_LIMIT = 5;
    private static final int HR_STAGE_NO_OXYGEN = 4;
    private static final int HR_STAGE_OXYGEN = 3;
    private static final int HR_STAGE_WARMUP = 1;
    private static final float HR_TEXT_SIZE = 50.0f;
    private static final float HR_UNIT_TEXT_SIZE = 45.0f;
    private static final int MAX_SPEED = 240;
    private static final float MAX_SWIPE_ANGLE = 300.0f;
    private static final float OPEN_ANGLE = 60.0f;
    private static final float START_ANGLE = 120.0f;

    @NotNull
    private final Paint arcPaint;

    @NotNull
    private final Bitmap arrowBitmap;

    @Nullable
    private final AttributeSet attrs;
    private float centerX;
    private float centerY;

    @NotNull
    private final Paint circleBgPaint;

    @NotNull
    private final Context ctx;
    private int curHr;
    private int curHrSection;

    @NotNull
    private String curHrSectionStr;
    private float outRadius;
    private float radius;

    @NotNull
    private final RectF rectF;

    @NotNull
    private final Paint startEndCornerPointSpeedPaint;

    @NotNull
    private final RectF startEndRect;

    @NotNull
    private final Paint textPaint;

    @NotNull
    private static final int[] warmColors = {Color.parseColor("#331991FA"), Color.parseColor("#1991FA")};

    @NotNull
    private static final int[] burnedColors = {Color.parseColor("#3317D641"), Color.parseColor("#17D641")};

    @NotNull
    private static final int[] oxygenColors = {Color.parseColor("#33FFE61B"), Color.parseColor("#FFE61B")};

    @NotNull
    private static final int[] noOxygenColors = {Color.parseColor("#33FF8A05"), Color.parseColor("#FF8A05")};

    @NotNull
    private static final int[] limitColors = {Color.parseColor("#33FF4343"), Color.parseColor("#FF4343")};
    private static final float DEFAULT_STROKE_WIDTH = 18.0f;
    private static final float SELECTED_STROKE_WIDTH = 20.0f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeartRateView(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        super(ctx, attributeSet);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.attrs = attributeSet;
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#4DADADAD"));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.circleBgPaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(Color.parseColor("#331991FA"));
        paint2.setStyle(Paint.Style.STROKE);
        float f = DEFAULT_STROKE_WIDTH;
        paint2.setStrokeWidth(f);
        this.arcPaint = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(WorkInfo.STOP_REASON_NOT_STOPPED);
        paint3.setStyle(style);
        paint3.setStrokeWidth(f);
        this.startEndCornerPointSpeedPaint = paint3;
        Paint paint4 = new Paint();
        paint4.setTextAlign(Paint.Align.CENTER);
        this.textPaint = paint4;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(ctx.getResources(), wwi.number_arrow);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
        this.arrowBitmap = bitmapDecodeResource;
        this.rectF = new RectF();
        this.startEndRect = new RectF();
        this.curHr = -1;
        this.curHrSectionStr = "";
    }

    @Nullable
    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        float f;
        int i;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawCircle(this.centerX, this.centerY, this.outRadius, this.circleBgPaint);
        this.circleBgPaint.setColor(Color.parseColor("#50616161"));
        canvas.drawCircle(this.centerX, this.centerY, this.outRadius, this.circleBgPaint);
        if (this.curHrSection == 1) {
            this.arcPaint.setColor(warmColors[1]);
            this.arcPaint.setStrokeWidth(SELECTED_STROKE_WIDTH);
            canvas.drawArc(this.rectF, 120.0f, 59.0f, false, this.arcPaint);
            canvas.save();
            canvas.rotate(-120.0f, this.centerX, this.centerY);
            canvas.translate(0.0f, (-this.radius) + 6);
            Bitmap bitmap = this.arrowBitmap;
            canvas.drawBitmap(bitmap, this.centerX - (bitmap.getWidth() / 2), this.centerY - (this.arrowBitmap.getHeight() / 2), (Paint) null);
            canvas.restore();
        } else {
            this.arcPaint.setColor(warmColors[0]);
            this.arcPaint.setStrokeWidth(DEFAULT_STROKE_WIDTH);
            canvas.drawArc(this.rectF, 120.0f, 59.0f, false, this.arcPaint);
        }
        if (this.curHrSection == 2) {
            this.arcPaint.setColor(burnedColors[1]);
            this.arcPaint.setStrokeWidth(SELECTED_STROKE_WIDTH);
            canvas.drawArc(this.rectF, 181.0f, 58.0f, false, this.arcPaint);
            canvas.save();
            canvas.rotate(-60.0f, this.centerX, this.centerY);
            canvas.translate(0.0f, (-this.radius) + 9);
            Bitmap bitmap2 = this.arrowBitmap;
            canvas.drawBitmap(bitmap2, this.centerX - (bitmap2.getWidth() / 2), this.centerY - (this.arrowBitmap.getHeight() / 2), (Paint) null);
            canvas.restore();
        } else {
            this.arcPaint.setColor(burnedColors[0]);
            this.arcPaint.setStrokeWidth(DEFAULT_STROKE_WIDTH);
            canvas.drawArc(this.rectF, 181.0f, 58.0f, false, this.arcPaint);
        }
        if (this.curHrSection == 3) {
            this.arcPaint.setColor(oxygenColors[1]);
            this.arcPaint.setStrokeWidth(SELECTED_STROKE_WIDTH);
            canvas.drawArc(this.rectF, 241.0f, 58.0f, false, this.arcPaint);
            canvas.save();
            canvas.translate(0.0f, (-this.radius) + 6);
            Bitmap bitmap3 = this.arrowBitmap;
            canvas.drawBitmap(bitmap3, this.centerX - (bitmap3.getWidth() / 2), this.centerY - (this.arrowBitmap.getHeight() / 2), (Paint) null);
            canvas.restore();
        } else {
            this.arcPaint.setColor(oxygenColors[0]);
            this.arcPaint.setStrokeWidth(DEFAULT_STROKE_WIDTH);
            canvas.drawArc(this.rectF, 241.0f, 58.0f, false, this.arcPaint);
        }
        if (this.curHrSection == 4) {
            this.arcPaint.setColor(noOxygenColors[1]);
            this.arcPaint.setStrokeWidth(SELECTED_STROKE_WIDTH);
            f = 60.0f;
            canvas.drawArc(this.rectF, 301.0f, 58.0f, false, this.arcPaint);
            canvas.save();
            canvas.rotate(60.0f, this.centerX, this.centerY);
            canvas.translate(0.0f, (-this.radius) + 6);
            Bitmap bitmap4 = this.arrowBitmap;
            canvas.drawBitmap(bitmap4, this.centerX - (bitmap4.getWidth() / 2), this.centerY - (this.arrowBitmap.getHeight() / 2), (Paint) null);
            canvas.restore();
        } else {
            f = 60.0f;
            this.arcPaint.setColor(noOxygenColors[0]);
            this.arcPaint.setStrokeWidth(DEFAULT_STROKE_WIDTH);
            canvas.drawArc(this.rectF, 301.0f, 58.0f, false, this.arcPaint);
        }
        if (this.curHrSection == 5) {
            this.arcPaint.setColor(limitColors[1]);
            this.arcPaint.setStrokeWidth(SELECTED_STROKE_WIDTH);
            canvas.drawArc(this.rectF, 361.0f, 59.0f, false, this.arcPaint);
            canvas.save();
            canvas.rotate(120.0f, this.centerX, this.centerY);
            canvas.translate(0.0f, (-this.radius) + 6);
            Bitmap bitmap5 = this.arrowBitmap;
            canvas.drawBitmap(bitmap5, this.centerX - (bitmap5.getWidth() / 2), this.centerY - (this.arrowBitmap.getHeight() / 2), (Paint) null);
            canvas.restore();
        } else {
            this.arcPaint.setColor(limitColors[0]);
            this.arcPaint.setStrokeWidth(DEFAULT_STROKE_WIDTH);
            canvas.drawArc(this.rectF, 361.0f, 59.0f, false, this.arcPaint);
        }
        canvas.save();
        canvas.rotate(-60.0f, this.centerX, this.centerY);
        canvas.translate(-this.radius, 0.0f);
        if (this.curHrSection == 1) {
            RectF rectF = this.startEndRect;
            float f2 = this.centerX;
            float f3 = SELECTED_STROKE_WIDTH;
            float f4 = 2;
            rectF.left = f2 - (f3 / f4);
            float f5 = this.centerY;
            rectF.top = f5 - (f3 / f4);
            rectF.right = f2 + (f3 / f4);
            rectF.bottom = f5 + (f3 / f4);
            this.startEndCornerPointSpeedPaint.setStrokeWidth(f3);
            this.startEndCornerPointSpeedPaint.setColor(warmColors[1]);
            canvas.drawArc(this.startEndRect, 0.0f, 180.0f, false, this.startEndCornerPointSpeedPaint);
        } else {
            RectF rectF2 = this.startEndRect;
            float f6 = this.centerX;
            float f7 = DEFAULT_STROKE_WIDTH;
            float f8 = 2;
            rectF2.left = f6 - (f7 / f8);
            float f9 = this.centerY;
            rectF2.top = f9 - (f7 / f8);
            rectF2.right = f6 + (f7 / f8);
            rectF2.bottom = f9 + (f7 / f8);
            this.startEndCornerPointSpeedPaint.setStrokeWidth(f7);
            this.startEndCornerPointSpeedPaint.setColor(warmColors[0]);
            canvas.drawArc(this.startEndRect, 0.0f, 180.0f, false, this.startEndCornerPointSpeedPaint);
        }
        canvas.restore();
        canvas.save();
        canvas.rotate(f, this.centerX, this.centerY);
        canvas.translate(this.radius, 0.0f);
        if (this.curHrSection == 5) {
            RectF rectF3 = this.startEndRect;
            float f10 = this.centerX;
            float f11 = SELECTED_STROKE_WIDTH;
            float f12 = 2;
            rectF3.left = f10 - (f11 / f12);
            float f13 = this.centerY;
            rectF3.top = f13 - (f11 / f12);
            rectF3.right = f10 + (f11 / f12);
            rectF3.bottom = f13 + (f11 / f12);
            this.startEndCornerPointSpeedPaint.setStrokeWidth(f11);
            this.startEndCornerPointSpeedPaint.setColor(limitColors[1]);
            canvas.drawArc(this.startEndRect, 0.0f, 180.0f, false, this.startEndCornerPointSpeedPaint);
        } else {
            RectF rectF4 = this.startEndRect;
            float f14 = this.centerX;
            float f15 = DEFAULT_STROKE_WIDTH;
            float f16 = 2;
            rectF4.left = f14 - (f15 / f16);
            float f17 = this.centerY;
            rectF4.top = f17 - (f15 / f16);
            rectF4.right = f14 + (f15 / f16);
            rectF4.bottom = f17 + (f15 / f16);
            this.startEndCornerPointSpeedPaint.setStrokeWidth(f15);
            this.startEndCornerPointSpeedPaint.setColor(limitColors[0]);
            canvas.drawArc(this.startEndRect, 0.0f, 180.0f, false, this.startEndCornerPointSpeedPaint);
        }
        canvas.restore();
        Paint paint = this.textPaint;
        int i2 = this.curHrSection;
        if (i2 == 1) {
            i = warmColors[1];
        } else if (i2 == 2) {
            i = burnedColors[1];
        } else if (i2 == 3) {
            i = oxygenColors[1];
        } else if (i2 != 4) {
            i = i2 != 5 ? -1 : limitColors[1];
        } else {
            i = noOxygenColors[1];
        }
        paint.setColor(i);
        this.textPaint.setTextSize(ExtUtilsKt.getDp(14));
        canvas.drawText(this.curHrSectionStr, this.centerX, this.centerY - ExtUtilsKt.getDp(17), this.textPaint);
        this.textPaint.setColor(-1);
        this.textPaint.setTextSize(ExtUtilsKt.getDp(34));
        int i3 = this.curHr;
        canvas.drawText(i3 > 0 ? String.valueOf(i3) : "--", this.centerX, this.centerY + ExtUtilsKt.getDp(12), this.textPaint);
        this.textPaint.setTextSize(ExtUtilsKt.getDp(14));
        canvas.drawText("BPM", this.centerX, this.centerY + ExtUtilsKt.getDp(25), this.textPaint);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.centerX = getWidth() / 2.0f;
        this.centerY = getHeight() / 2.0f;
        this.radius = (RangesKt___RangesKt.coerceAtMost(getWidth(), getHeight()) / 2) * 0.9f;
        this.outRadius = RangesKt___RangesKt.coerceAtMost(getWidth(), getHeight()) / 2.0f;
        RectF rectF = this.rectF;
        float f = this.centerX;
        float f2 = this.radius;
        rectF.left = f - f2;
        float f3 = this.centerY;
        rectF.top = f3 - f2;
        rectF.right = f + f2;
        rectF.bottom = f3 + f2;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(98, size);
        } else if (mode != 1073741824) {
            size = 98;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(98, size2);
        } else if (mode2 != 1073741824) {
            size2 = 98;
        }
        setMeasuredDimension(size, size2);
    }

    public final void setHr(int hr, int section, @NotNull String sectionStr) {
        Intrinsics.checkNotNullParameter(sectionStr, "sectionStr");
        this.curHr = hr;
        this.curHrSection = section;
        this.curHrSectionStr = sectionStr;
        postInvalidate();
    }

    public /* synthetic */ HeartRateView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
