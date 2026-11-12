package com.xiaomi.fitness.heartrate.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import defpackage.o4j;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/view/CircleEmptyView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mMainRect", "Landroid/graphics/Rect;", "mPaint", "Landroid/graphics/Paint;", "mCircleRadius", "mCoverColor", "mXfermode", "Landroid/graphics/Xfermode;", "init", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "inDraw", "drawCircle", "preDraw", "prepareCircle", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CircleEmptyView extends View {
    private int mCircleRadius;
    private final int mCoverColor;

    @Nullable
    private Rect mMainRect;

    @Nullable
    private Paint mPaint;

    @Nullable
    private Xfermode mXfermode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircleEmptyView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawCircle(Canvas canvas) {
        Rect rect = this.mMainRect;
        Intrinsics.checkNotNull(rect);
        int iCenterX = rect.centerX();
        Rect rect2 = this.mMainRect;
        Intrinsics.checkNotNull(rect2);
        float fCenterY = rect2.centerY();
        float f = this.mCircleRadius;
        Paint paint = this.mPaint;
        Intrinsics.checkNotNull(paint);
        canvas.drawCircle(iCenterX, fCenterY, f, paint);
    }

    private final void inDraw(Canvas canvas) {
        Rect rect = this.mMainRect;
        Intrinsics.checkNotNull(rect);
        Paint paint = this.mPaint;
        Intrinsics.checkNotNull(paint);
        canvas.drawRect(rect, paint);
        Paint paint2 = this.mPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setXfermode(this.mXfermode);
        drawCircle(canvas);
        Paint paint3 = this.mPaint;
        Intrinsics.checkNotNull(paint3);
        paint3.setXfermode(null);
    }

    private final void init() {
        setLayerType(1, null);
        this.mMainRect = new Rect();
        Paint paint = new Paint(1);
        this.mPaint = paint;
        Intrinsics.checkNotNull(paint);
        paint.setDither(true);
        Paint paint2 = this.mPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setColor(this.mCoverColor);
        this.mXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    }

    private final void preDraw() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingEnd();
        int height = getHeight() - getPaddingBottom();
        Rect rect = this.mMainRect;
        Intrinsics.checkNotNull(rect);
        rect.set(paddingLeft, paddingTop, width, height);
        prepareCircle();
    }

    private final void prepareCircle() {
        if (this.mCircleRadius > 0) {
            return;
        }
        Rect rect = this.mMainRect;
        Intrinsics.checkNotNull(rect);
        int iWidth = rect.width();
        Rect rect2 = this.mMainRect;
        Intrinsics.checkNotNull(rect2);
        this.mCircleRadius = (Math.min(iWidth, rect2.height()) / 2) - 10;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        preDraw();
        Rect rect = this.mMainRect;
        Intrinsics.checkNotNull(rect);
        float f = rect.left;
        Rect rect2 = this.mMainRect;
        Intrinsics.checkNotNull(rect2);
        float f2 = rect2.top;
        Rect rect3 = this.mMainRect;
        Intrinsics.checkNotNull(rect3);
        float f3 = rect3.right;
        Rect rect4 = this.mMainRect;
        Intrinsics.checkNotNull(rect4);
        int iSaveLayer = canvas.saveLayer(f, f2, f3, rect4.bottom, null, 31);
        inDraw(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircleEmptyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircleEmptyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CircleEmptyView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircleEmptyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o4j.a0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.mCoverColor = typedArrayObtainStyledAttributes.getColor(o4j.c0, -16711936);
        this.mCircleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(o4j.b0, 0);
        typedArrayObtainStyledAttributes.recycle();
        init();
    }
}
