package com.xiaomi.fitness.watch.face.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.watch.face.view.ColorView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0014J\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0007J(\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0012R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/watch/face/view/ColorView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCircleX", "", "mCircleY", "mFillRadius", "mStrokeRadius", "mPaint", "Landroid/graphics/Paint;", "getMPaint", "()Landroid/graphics/Paint;", "mPaint$delegate", "Lkotlin/Lazy;", "mStrokePaint", "getMStrokePaint", "mStrokePaint$delegate", "mStrokeWidth", "mFillPadding", "mFillRect", "Landroid/graphics/RectF;", "mBorderRect", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setColor", "color", "onSizeChanged", Constants.DEVICE_TYPE_WEAR, "h", "oldw", "oldh", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ColorView extends View {

    @NotNull
    private final RectF mBorderRect;
    private float mCircleX;
    private float mCircleY;
    private final float mFillPadding;
    private final float mFillRadius;

    @NotNull
    private final RectF mFillRect;

    /* JADX INFO: renamed from: mPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPaint;

    /* JADX INFO: renamed from: mStrokePaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mStrokePaint;
    private final float mStrokeRadius;
    private final float mStrokeWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ColorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Paint getMPaint() {
        return (Paint) this.mPaint.getValue();
    }

    private final Paint getMStrokePaint() {
        return (Paint) this.mStrokePaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint mPaint_delegate$lambda$0() {
        return new Paint(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint mStrokePaint_delegate$lambda$1() {
        return new Paint(1);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.mFillRect;
        float f = this.mFillRadius;
        canvas.drawRoundRect(rectF, f, f, getMPaint());
        if (isSelected()) {
            RectF rectF2 = this.mBorderRect;
            float f2 = this.mStrokeRadius;
            canvas.drawRoundRect(rectF2, f2, f2, getMStrokePaint());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        float f = w;
        this.mCircleX = f / 2.0f;
        float f2 = h;
        this.mCircleY = f2 / 2.0f;
        float f3 = this.mStrokeWidth / 2;
        this.mBorderRect.set(f3, f3, f - f3, f2 - f3);
        RectF rectF = this.mFillRect;
        float f4 = this.mFillPadding;
        rectF.set(f4, f4, f - f4, f2 - f4);
    }

    public final void setColor(int color) {
        getMPaint().setColor(color);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ColorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ColorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mFillRadius = DisplayUtil.dip2px(10.0f);
        this.mStrokeRadius = DisplayUtil.dip2px(14.67f);
        this.mPaint = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: a54
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ColorView.mPaint_delegate$lambda$0();
            }
        });
        this.mStrokePaint = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: b54
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ColorView.mStrokePaint_delegate$lambda$1();
            }
        });
        float fDip2px = DisplayUtil.dip2px(2.0f);
        this.mStrokeWidth = fDip2px;
        this.mFillPadding = DisplayUtil.dip2px(5.0f);
        this.mFillRect = new RectF();
        this.mBorderRect = new RectF();
        getMStrokePaint().setColor(-14803426);
        getMStrokePaint().setStrokeWidth(fDip2px);
        getMStrokePaint().setStyle(Paint.Style.STROKE);
    }

    public /* synthetic */ ColorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
