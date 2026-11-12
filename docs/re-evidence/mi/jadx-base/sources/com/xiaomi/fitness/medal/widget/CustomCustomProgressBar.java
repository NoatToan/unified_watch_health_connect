package com.xiaomi.fitness.medal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.ni4;
import defpackage.nji;
import defpackage.p4j;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J(\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0014J\u0016\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007J\u0010\u0010$\u001a\u00020\u00182\b\b\u0001\u0010%\u001a\u00020\u0007J\u0010\u0010&\u001a\u00020\u00182\b\b\u0001\u0010%\u001a\u00020\u0007J\u000e\u0010'\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/medal/widget/CustomCustomProgressBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mWidth", "", "mHeight", "mMaxProgress", "mProgress", "mNormalColor", "mReachColor", "mWidthRate", "mRadius", "mRect", "Landroid/graphics/RectF;", "mPaint", "Landroid/graphics/Paint;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "drawRect", "onSizeChanged", Constants.DEVICE_TYPE_WEAR, "h", "oldw", "oldh", "setValue", BroadcastsKt.SILENT_PUSHING_PROGRESS, "reachColor", "setReachColor", "color", "setNormalColor", "setProgress", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomCustomProgressBar extends View {
    private float mHeight;
    private final int mMaxProgress;
    private int mNormalColor;

    @NotNull
    private final Paint mPaint;
    private int mProgress;
    private float mRadius;
    private int mReachColor;

    @NotNull
    private final RectF mRect;
    private float mWidth;
    private float mWidthRate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomCustomProgressBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawRect(Canvas canvas) {
        RectF rectF = this.mRect;
        float f = this.mHeight;
        rectF.set(0.0f, 0.0f, f, f);
        canvas.drawArc(this.mRect, 90.0f, 180.0f, false, this.mPaint);
        RectF rectF2 = this.mRect;
        float f2 = this.mRadius;
        rectF2.set(f2, 0.0f, this.mWidth - f2, this.mHeight);
        canvas.drawRect(this.mRect, this.mPaint);
        RectF rectF3 = this.mRect;
        float f3 = this.mWidth;
        float f4 = this.mHeight;
        rectF3.set(f3 - f4, 0.0f, f3, f4);
        canvas.drawArc(this.mRect, -90.0f, 180.0f, false, this.mPaint);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.mWidthRate * this.mProgress;
        this.mPaint.setColor(this.mNormalColor);
        drawRect(canvas);
        this.mPaint.setColor(this.mReachColor);
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, f, this.mHeight);
        drawRect(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float f = w;
        this.mWidth = f;
        float f2 = h;
        this.mHeight = f2;
        this.mRadius = f2 / 2;
        this.mWidthRate = f / this.mMaxProgress;
    }

    public final void setNormalColor(int color) {
        this.mNormalColor = color;
        invalidate();
    }

    public final void setProgress(int progress) {
        this.mProgress = progress;
        invalidate();
    }

    public final void setReachColor(int color) {
        this.mReachColor = color;
        invalidate();
    }

    public final void setValue(int progress, int reachColor) {
        this.mProgress = progress;
        this.mReachColor = reachColor;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomCustomProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CustomCustomProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomCustomProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mWidthRate = 1.0f;
        this.mRect = new RectF();
        this.mPaint = new Paint(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p4j.J4);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.mMaxProgress = typedArrayObtainStyledAttributes.getInt(p4j.K4, 100);
        this.mProgress = typedArrayObtainStyledAttributes.getInt(p4j.M4, 50);
        int iC = ni4.c(context, nji.g);
        int iC2 = ni4.c(context, nji.h);
        this.mNormalColor = typedArrayObtainStyledAttributes.getColor(p4j.L4, iC);
        this.mReachColor = typedArrayObtainStyledAttributes.getColor(p4j.N4, iC2);
    }
}
