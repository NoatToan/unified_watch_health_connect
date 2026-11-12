package com.mi.health.course.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.work.WorkInfo;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.passport.ui.internal.MenuBuilder;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.c4j;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0007J\u0016\u0010\u001e\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0014R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/mi/health/course/widget/CircleProgressBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bgColor", "progressColor", "strokeWidth", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "progressTotal", "radius", "centerX", "centerY", "circleRect", "Landroid/graphics/RectF;", "paint", "Landroid/graphics/Paint;", "onSizeChanged", "", Constants.DEVICE_TYPE_WEAR, "h", "oldw", "oldh", "setProgress", "setColor", "onDraw", "canvas", "Landroid/graphics/Canvas;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CircleProgressBar extends View {
    private int bgColor;
    private float centerX;
    private float centerY;

    @NotNull
    private final RectF circleRect;

    @NotNull
    private final Paint paint;
    private int progress;
    private int progressColor;
    private final int progressTotal;
    private float radius;
    private final float strokeWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircleProgressBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.paint.setColor(this.bgColor);
        canvas.drawCircle(this.centerX, this.centerY, this.radius, this.paint);
        this.paint.setColor(this.progressColor);
        canvas.drawArc(this.circleRect, -90.0f, (this.progress * 360.0f) / this.progressTotal, false, this.paint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        float fMin = (Math.min(w, h) - this.strokeWidth) / 2.0f;
        this.radius = fMin;
        float f = w / 2.0f;
        this.centerX = f;
        float f2 = h / 2.0f;
        this.centerY = f2;
        this.circleRect.set(f - fMin, f2 - fMin, f + fMin, f2 + fMin);
    }

    public final void setColor(int bgColor, int progressColor) {
        this.bgColor = bgColor;
        this.progressColor = progressColor;
        invalidate();
    }

    public final void setProgress(int progress) {
        this.progress = progress;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircleProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircleProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.circleRect = new RectF();
        Paint paint = new Paint(1);
        this.paint = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c4j.X, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.bgColor = typedArrayObtainStyledAttributes.getColor(c4j.Z, WorkInfo.STOP_REASON_NOT_STOPPED);
        this.progressColor = typedArrayObtainStyledAttributes.getColor(c4j.a0, MenuBuilder.CATEGORY_MASK);
        float dimension = typedArrayObtainStyledAttributes.getDimension(c4j.b0, 0.0f);
        this.strokeWidth = dimension;
        this.progressTotal = typedArrayObtainStyledAttributes.getInt(c4j.c0, 100);
        this.progress = typedArrayObtainStyledAttributes.getInt(c4j.Y, 0);
        typedArrayObtainStyledAttributes.recycle();
        paint.setColor(this.bgColor);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dimension);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public /* synthetic */ CircleProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
