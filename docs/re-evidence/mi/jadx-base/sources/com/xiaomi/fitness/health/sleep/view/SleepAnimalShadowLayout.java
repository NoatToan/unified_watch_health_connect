package com.xiaomi.fitness.health.sleep.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import defpackage.n4j;
import defpackage.ni4;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB)\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0014J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/health/sleep/view/SleepAnimalShadowLayout;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mPaint", "Landroid/graphics/Paint;", "mRectF", "Landroid/graphics/RectF;", "mShadowColor", "mShadowRadius", "", "mShadowDx", "mShadowDy", "mShadowSide", "mShadowShape", "updateShadowColor", "", "color", "init", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepAnimalShadowLayout extends RelativeLayout {
    public static final int ALL = 4369;
    public static final int BOTTOM = 4096;
    public static final int LEFT = 1;
    public static final int RIGHT = 256;
    public static final int SHAPE_OVAL = 16;
    public static final int SHAPE_RECTANGLE = 1;
    public static final int TOP = 16;

    @NotNull
    private final Paint mPaint;

    @NotNull
    private final RectF mRectF;
    private int mShadowColor;
    private float mShadowDx;
    private float mShadowDy;
    private float mShadowRadius;
    private int mShadowShape;
    private int mShadowSide;

    @JvmOverloads
    public SleepAnimalShadowLayout(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    private final void init(AttributeSet attrs) {
        setLayerType(1, null);
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, n4j.U4);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.mShadowColor = typedArrayObtainStyledAttributes.getColor(n4j.V4, ni4.c(getContext(), R.color.black));
        this.mShadowRadius = typedArrayObtainStyledAttributes.getDimension(n4j.Y4, 0.0f);
        this.mShadowDx = typedArrayObtainStyledAttributes.getDimension(n4j.W4, 0.0f);
        this.mShadowDy = typedArrayObtainStyledAttributes.getDimension(n4j.X4, 0.0f);
        this.mShadowShape = typedArrayObtainStyledAttributes.getInt(n4j.Z4, 1);
        typedArrayObtainStyledAttributes.recycle();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setColor(0);
        this.mPaint.setShadowLayer(this.mShadowRadius, this.mShadowDx, this.mShadowDy, this.mShadowColor);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.mPaint.setShadowLayer(this.mShadowRadius, this.mShadowDx, this.mShadowDy, this.mShadowColor);
        int i = this.mShadowShape;
        if (i == 1) {
            canvas.drawRect(this.mRectF, this.mPaint);
        } else if (i == 16) {
            canvas.drawCircle(this.mRectF.centerX(), this.mRectF.centerY(), Math.min(this.mRectF.width(), this.mRectF.height()) / 2, this.mPaint);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        float f = this.mShadowRadius;
        float f2 = this.mShadowDx + f;
        float f3 = f + this.mShadowDy;
        int measuredWidth = (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        RectF rectF = this.mRectF;
        rectF.left = f2;
        rectF.top = f3;
        rectF.right = measuredWidth + f2;
        rectF.bottom = measuredHeight + f3;
        int i = (int) f2;
        int i2 = (int) f3;
        setPadding(i, i2, i, i2);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void updateShadowColor(int color) {
        this.mShadowColor = color;
        postInvalidate();
    }

    @JvmOverloads
    public SleepAnimalShadowLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SleepAnimalShadowLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @JvmOverloads
    public SleepAnimalShadowLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPaint = new Paint(1);
        this.mRectF = new RectF();
        this.mShadowSide = ALL;
        this.mShadowShape = 1;
        init(attributeSet);
    }
}
