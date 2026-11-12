package com.huami.sky.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.ui.R;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R*\u0010\"\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\r\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\"\u0010&\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\"\u0010*\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\"\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\r\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u0011R\"\u00102\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\r\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010\u0011R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u0006="}, d2 = {"Lcom/huami/sky/ui/view/SkyCirclePageIndicator;", "Landroid/view/View;", "", "measureSpec", "b", "a", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", LogUtil.I, "getCount", "()I", "setCount", "(I)V", "count", "", "value", "F", "getRadius", "()F", "setRadius", "(F)V", "radius", "c", "getGap", "setGap", "gap", GoogleApiAvailabilityLight.a, "getIndex", "setIndex", "index", "e", "getRoundRectWidth", "setRoundRectWidth", "roundRectWidth", "f", "getRoundRectRadius", "setRoundRectRadius", "roundRectRadius", "g", "getIndexColor", "setIndexColor", "indexColor", "h", "getUnIndexColor", "setUnIndexColor", "unIndexColor", "Landroid/graphics/Paint;", "i", "Landroid/graphics/Paint;", "paint", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyCirclePageIndicator extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int count;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float radius;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float gap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float roundRectWidth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float roundRectRadius;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int indexColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int unIndexColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Paint paint;

    public SkyCirclePageIndicator(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.roundRectRadius = 3.0f;
        this.indexColor = -1;
        this.unIndexColor = -7829368;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        Unit unit = Unit.INSTANCE;
        this.paint = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SkyCirclePageIndicator, 0, 0);
        setRadius(typedArrayObtainStyledAttributes.getDimension(R.styleable.SkyCirclePageIndicator_radius, 0.0f));
        this.gap = typedArrayObtainStyledAttributes.getDimension(R.styleable.SkyCirclePageIndicator_gap, 0.0f);
        this.roundRectRadius = typedArrayObtainStyledAttributes.getDimension(R.styleable.SkyCirclePageIndicator_roundRectRadius, 0.0f);
        this.indexColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SkyCirclePageIndicator_indexColor, -1);
        this.unIndexColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SkyCirclePageIndicator_unIndexColor, -7829368);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final int a(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((2 * this.radius) + getPaddingTop() + getPaddingBottom() + 1);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    private final int b(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == 1073741824) {
            return size;
        }
        float paddingLeft = getPaddingLeft() + getPaddingRight();
        int i = this.count;
        int i2 = (int) (paddingLeft + ((i - 1) * 2 * this.radius) + ((i - 1) * this.gap) + this.roundRectWidth + 1);
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }

    public final int getCount() {
        return this.count;
    }

    public final float getGap() {
        return this.gap;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getIndexColor() {
        return this.indexColor;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final float getRoundRectRadius() {
        return this.roundRectRadius;
    }

    public final float getRoundRectWidth() {
        return this.roundRectWidth;
    }

    public final int getUnIndexColor() {
        return this.unIndexColor;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        float f;
        super.onDraw(canvas);
        int i = this.count;
        if (i <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i2 == this.index) {
                this.paint.setColor(this.indexColor);
                float f2 = 2;
                float paddingStart = getPaddingStart() + (((this.radius * f2) + this.gap) * i2);
                float f3 = paddingStart + this.roundRectWidth;
                float paddingTop = getPaddingTop();
                float f4 = paddingTop + (f2 * this.radius);
                if (canvas != null) {
                    float f5 = this.roundRectRadius;
                    canvas.drawRoundRect(paddingStart, paddingTop, f3, f4, f5, f5, this.paint);
                }
            } else {
                this.paint.setColor(this.unIndexColor);
                if (i2 < this.index) {
                    float paddingStart2 = getPaddingStart();
                    float f6 = this.radius;
                    f = paddingStart2 + f6 + (((f6 * 2) + this.gap) * i2);
                } else {
                    float paddingStart3 = getPaddingStart();
                    float f7 = this.radius;
                    float f8 = this.gap;
                    f = paddingStart3 + f7 + (((f7 * 2) + f8) * (i2 - 1)) + this.roundRectWidth + f8;
                }
                float paddingTop2 = getPaddingTop();
                float f9 = this.radius;
                float f10 = paddingTop2 + f9;
                if (canvas != null) {
                    canvas.drawCircle(f, f10, f9, this.paint);
                }
            }
            if (i3 >= i) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(b(widthMeasureSpec), a(heightMeasureSpec));
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setGap(float f) {
        this.gap = f;
    }

    public final void setIndex(int i) {
        this.index = i;
        invalidate();
    }

    public final void setIndexColor(int i) {
        this.indexColor = i;
    }

    public final void setRadius(float f) {
        this.radius = f;
        this.roundRectWidth = f * 5.0f;
    }

    public final void setRoundRectRadius(float f) {
        this.roundRectRadius = f;
    }

    public final void setRoundRectWidth(float f) {
        this.roundRectWidth = f;
    }

    public final void setUnIndexColor(int i) {
        this.unIndexColor = i;
    }
}
