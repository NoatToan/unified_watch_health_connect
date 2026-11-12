package com.xiaomi.fitness.sport_eco.view.environmental.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.v4j;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\fJ\b\u0010\u001d\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/environmental/view/EcoProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mProgressModel", "Lcom/xiaomi/fitness/sport_eco/view/environmental/view/EcoProgressModel;", "getMProgressModel", "()Lcom/xiaomi/fitness/sport_eco/view/environmental/view/EcoProgressModel;", "setMProgressModel", "(Lcom/xiaomi/fitness/sport_eco/view/environmental/view/EcoProgressModel;)V", "mColorPaint", "Landroid/graphics/Paint;", "mContext", "rectRadius", "", "getRectRadius", "()F", "setRectRadius", "(F)V", "setModel", "", "model", "initColorBlockPaint", "onDraw", "canvas", "Landroid/graphics/Canvas;", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoProgressView extends View {

    @Nullable
    private Paint mColorPaint;

    @Nullable
    private Context mContext;

    @Nullable
    private EcoProgressModel mProgressModel;
    private float rectRadius;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EcoProgressView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initColorBlockPaint() {
        Paint paint = new Paint();
        this.mColorPaint = paint;
        Intrinsics.checkNotNull(paint);
        paint.reset();
        Paint paint2 = this.mColorPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setAntiAlias(true);
        Paint paint3 = this.mColorPaint;
        Intrinsics.checkNotNull(paint3);
        paint3.setStyle(Paint.Style.FILL);
        Paint paint4 = this.mColorPaint;
        Intrinsics.checkNotNull(paint4);
        paint4.setColor(-16777216);
    }

    @Nullable
    public final EcoProgressModel getMProgressModel() {
        return this.mProgressModel;
    }

    public final float getRectRadius() {
        return this.rectRadius;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.mProgressModel == null) {
            return;
        }
        canvas.save();
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        Paint paint = this.mColorPaint;
        if (paint != null) {
            EcoProgressModel ecoProgressModel = this.mProgressModel;
            Intrinsics.checkNotNull(ecoProgressModel);
            Integer backwardColor = ecoProgressModel.getBackwardColor();
            Intrinsics.checkNotNull(backwardColor);
            paint.setColor(backwardColor.intValue());
        }
        float f = this.rectRadius;
        Paint paint2 = this.mColorPaint;
        Intrinsics.checkNotNull(paint2);
        canvas.drawRoundRect(rectF, f, f, paint2);
        RectF rectF2 = new RectF();
        float width = getWidth();
        EcoProgressModel ecoProgressModel2 = this.mProgressModel;
        Float percent = ecoProgressModel2 != null ? ecoProgressModel2.getPercent() : null;
        Intrinsics.checkNotNull(percent);
        float fFloatValue = width * percent.floatValue();
        if (fFloatValue > getWidth()) {
            fFloatValue = getWidth();
        }
        int width2 = getWidth();
        float f2 = getLayoutDirection() == 1 ? width2 : 0.0f;
        if (getLayoutDirection() == 1) {
            fFloatValue = width2 - fFloatValue;
        }
        rectF2.set(f2, 0.0f, fFloatValue, getHeight());
        Paint paint3 = this.mColorPaint;
        if (paint3 != null) {
            EcoProgressModel ecoProgressModel3 = this.mProgressModel;
            Intrinsics.checkNotNull(ecoProgressModel3);
            Integer forwardColor = ecoProgressModel3.getForwardColor();
            Intrinsics.checkNotNull(forwardColor);
            paint3.setColor(forwardColor.intValue());
        }
        float f3 = this.rectRadius;
        Paint paint4 = this.mColorPaint;
        Intrinsics.checkNotNull(paint4);
        canvas.drawRoundRect(rectF2, f3, f3, paint4);
        canvas.restore();
    }

    public final void setMProgressModel(@Nullable EcoProgressModel ecoProgressModel) {
        this.mProgressModel = ecoProgressModel;
    }

    public final void setModel(@Nullable EcoProgressModel model) {
        this.mProgressModel = model;
        invalidate();
    }

    public final void setRectRadius(float f) {
        this.rectRadius = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EcoProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EcoProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ EcoProgressView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EcoProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v4j.X0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.rectRadius = typedArrayObtainStyledAttributes.getDimension(v4j.Y0, DisplayUtil.INSTANCE.dip2pxF(4.0f));
            typedArrayObtainStyledAttributes.recycle();
        }
        initColorBlockPaint();
    }
}
