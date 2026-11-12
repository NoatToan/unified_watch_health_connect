package com.xiaomi.fitness.watch.face.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.noi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0017J\b\u0010'\u001a\u00020(H\u0002J\u001a\u0010)\u001a\u00020(2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020(0+J\u0010\u00100\u001a\u00020(2\u0006\u00101\u001a\u000202H\u0014J \u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020$H\u0002J(\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u0011H\u0002J\u0018\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000fH\u0014R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020(\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010-\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/watch/face/view/PaletteView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "paletteBit", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "Landroid/graphics/Bitmap;", "paint", "Landroid/graphics/Paint;", "circleSize", "", "circleX", "", "circleY", "circleRadius", "colorPoint", "Landroid/graphics/PointF;", "northPoint", "southPoint", "ringRadius", "ringStroke", "ringStrokeHalf", "ringMaxR", "ringPoint", "ringNorthP", "ringSouthP", "retPointF", "lastX", "lastY", "touchSlop", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "onColorChange", "", "setOnColorChange", "action", "Lkotlin/Function1;", "colorChangeBlock", "color", "getColor", "()I", "onDraw", "canvas", "Landroid/graphics/Canvas;", "constrain", "x", "y", "indicator", "distance", "x1", "y1", "x2", "y2", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaletteView extends View {
    private final float circleRadius;
    private final int circleSize;
    private final float circleX;
    private final float circleY;

    @Nullable
    private Function1<? super Integer, Unit> colorChangeBlock;

    @NotNull
    private final PointF colorPoint;
    private int lastX;
    private int lastY;

    @NotNull
    private final PointF northPoint;

    @NotNull
    private final Paint paint;
    private final Bitmap paletteBit;

    @NotNull
    private final PointF retPointF;
    private final float ringMaxR;

    @NotNull
    private final PointF ringNorthP;

    @NotNull
    private final PointF ringPoint;
    private final float ringRadius;

    @NotNull
    private final PointF ringSouthP;
    private final float ringStroke;
    private final float ringStrokeHalf;

    @NotNull
    private final PointF southPoint;
    private final int touchSlop;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PaletteView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final PointF constrain(float x, float y, boolean indicator) {
        float f;
        PointF pointF;
        PointF pointF2;
        double d;
        double dAcos;
        if (indicator) {
            f = this.ringMaxR;
            pointF = this.ringSouthP;
            pointF2 = this.ringNorthP;
        } else {
            f = this.circleX;
            pointF = this.southPoint;
            pointF2 = this.northPoint;
        }
        int iDistance = distance(this.circleX, this.circleY, x, y);
        if (iDistance < f) {
            PointF pointF3 = this.retPointF;
            pointF3.x = x;
            pointF3.y = y;
        } else {
            if (x > this.circleX) {
                int iDistance2 = distance(pointF.x, pointF.y, x, y);
                d = 90;
                dAcos = Math.acos((((iDistance * iDistance) + (f * f)) - (iDistance2 * iDistance2)) / ((iDistance * 2) * f));
            } else {
                int iDistance3 = distance(pointF2.x, pointF2.y, x, y);
                d = 270;
                dAcos = Math.acos((((iDistance * iDistance) + (f * f)) - (iDistance3 * iDistance3)) / ((iDistance * 2) * f));
            }
            double d2 = (d - (dAcos * 57.29577951308232d)) * 0.017453292519943295d;
            double d3 = f;
            double dCos = ((double) this.circleX) + (Math.cos(d2) * d3);
            double dSin = ((double) this.circleY) + (d3 * Math.sin(d2));
            PointF pointF4 = this.retPointF;
            pointF4.x = (float) dCos;
            pointF4.y = (float) dSin;
        }
        return this.retPointF;
    }

    private final int distance(float x1, float y1, float x2, float y2) {
        float f = x1 - x2;
        float f2 = y1 - y2;
        return (int) Math.sqrt((f * f) + (f2 * f2));
    }

    private final void onColorChange() {
        Function1<? super Integer, Unit> function1 = this.colorChangeBlock;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(getColor()));
        }
    }

    public final int getColor() {
        PointF pointF = this.colorPoint;
        float f = pointF.x;
        float f2 = pointF.y;
        int iDistance = distance(f, f2, this.circleX, this.circleY);
        Logger.d("ColorPickerView", "getRGB: x = " + f + "; y = " + f2 + "; size = " + this.circleRadius);
        if (iDistance <= this.circleRadius && f2 < this.paletteBit.getHeight() && f < this.paletteBit.getWidth()) {
            return this.paletteBit.getPixel((int) f, (int) f2);
        }
        return -1;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawBitmap(this.paletteBit, 0.0f, 0.0f, this.paint);
        PointF pointF = this.ringPoint;
        canvas.drawCircle(pointF.x, pointF.y, this.ringRadius, this.paint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i = this.circleSize;
        setMeasuredDimension(i, i);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        float x = event.getX();
        float y = event.getY();
        int action = event.getAction();
        if (action == 0) {
            this.lastX = (int) x;
            this.lastY = (int) y;
            this.colorPoint.set(constrain(x, y, false));
            this.ringPoint.set(constrain(x, y, true));
            onColorChange();
            invalidate();
        } else if ((action == 1 || action == 2) && (Math.abs(x - this.lastX) > this.touchSlop || Math.abs(y - this.lastY) > this.touchSlop)) {
            this.colorPoint.set(constrain(x, y, false));
            this.ringPoint.set(constrain(x, y, true));
            onColorChange();
            invalidate();
            this.lastX = (int) x;
            this.lastY = (int) y;
        }
        return true;
    }

    public final void setOnColorChange(@NotNull Function1<? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.colorChangeBlock = action;
        if (action != null) {
            action.invoke2(-1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaletteView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), noi.Q);
        this.paletteBit = bitmapDecodeResource;
        Paint paint = new Paint(1);
        this.paint = paint;
        int width = bitmapDecodeResource.getWidth();
        this.circleSize = width;
        float f = width / 2.0f;
        this.circleX = f;
        this.circleY = f;
        this.circleRadius = f;
        this.colorPoint = new PointF(f, f);
        this.northPoint = new PointF(f, 0.0f);
        this.southPoint = new PointF(f, width);
        float fDip2px = DisplayUtil.dip2px(12.5f);
        this.ringRadius = fDip2px;
        float fDip2px2 = DisplayUtil.dip2px(2.0f);
        this.ringStroke = fDip2px2;
        float f2 = fDip2px2 / 2;
        this.ringStrokeHalf = f2;
        this.ringMaxR = (f - fDip2px) - f2;
        this.ringPoint = new PointF(f, f);
        this.ringNorthP = new PointF(f, fDip2px + f2);
        this.ringSouthP = new PointF(f, (width - fDip2px) - f2);
        this.retPointF = new PointF(f, f);
        this.lastX = Integer.MIN_VALUE;
        this.lastY = Integer.MIN_VALUE;
        this.touchSlop = DisplayUtil.dip2px(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fDip2px2);
        paint.setColor(-16777216);
    }

    public /* synthetic */ PaletteView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
