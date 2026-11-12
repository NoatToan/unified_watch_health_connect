package com.xiaomi.fitness.training_plan.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.x4j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00020\u0001:\u0001'B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fH\u0014J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0014J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\tJ\u000e\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\tR\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/WidgetValueUnit;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "valueText", "", "unitText", "valueTextSize", "", "unitTextSize", "valueTextColor", "", "unitTextColor", "valuePaint", "Landroid/graphics/Paint;", "unitPaint", "valueBound", "Landroid/graphics/Rect;", "unitBound", "baseLine", "DP_4", "DP_2", "SP_16", "SP_20", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setValue", "value", "setUnit", "unit", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WidgetValueUnit extends View {

    @NotNull
    private static final String TAG = "WidgetValueUnit";
    private final float DP_2;
    private final float DP_4;
    private final float SP_16;
    private final float SP_20;
    private int baseLine;
    private Rect unitBound;
    private Paint unitPaint;
    private String unitText;
    private int unitTextColor;
    private float unitTextSize;
    private Rect valueBound;
    private Paint valuePaint;
    private String valueText;
    private int valueTextColor;
    private float valueTextSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetValueUnit(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.DP_4 = TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
        this.DP_2 = TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.SP_16 = TypedValue.applyDimension(2, 16.0f, getResources().getDisplayMetrics());
        this.SP_20 = TypedValue.applyDimension(2, 20.0f, getResources().getDisplayMetrics());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, x4j.x4);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (i == x4j.B4) {
                this.valueText = String.valueOf(typedArrayObtainStyledAttributes.getString(index));
            } else if (i == x4j.y4) {
                this.unitText = String.valueOf(typedArrayObtainStyledAttributes.getString(index));
            } else if (i == x4j.D4) {
                this.valueTextSize = typedArrayObtainStyledAttributes.getDimension(index, this.SP_20);
            } else if (i == x4j.A4) {
                this.unitTextSize = typedArrayObtainStyledAttributes.getDimension(index, this.SP_16);
            } else if (i == x4j.C4) {
                TypedValue typedValue = new TypedValue();
                typedArrayObtainStyledAttributes.getValue(typedArrayObtainStyledAttributes.getIndex(index), typedValue);
                this.valueTextColor = ViewExtKt.getColor(this, typedValue.resourceId);
            } else if (i == x4j.z4) {
                TypedValue typedValue2 = new TypedValue();
                typedArrayObtainStyledAttributes.getValue(typedArrayObtainStyledAttributes.getIndex(index), typedValue2);
                this.unitTextColor = ViewExtKt.getColor(this, typedValue2.resourceId);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.valuePaint = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.valuePaint;
        Rect rect = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valuePaint");
            paint2 = null;
        }
        paint2.setTextSize(this.valueTextSize);
        Paint paint3 = new Paint();
        this.unitPaint = paint3;
        paint3.setAntiAlias(true);
        Paint paint4 = this.unitPaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unitPaint");
            paint4 = null;
        }
        paint4.setTextSize(this.unitTextSize);
        this.valueBound = new Rect();
        this.unitBound = new Rect();
        Paint paint5 = this.valuePaint;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valuePaint");
            paint5 = null;
        }
        String str = this.valueText;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueText");
            str = null;
        }
        String str2 = this.valueText;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueText");
            str2 = null;
        }
        int length = str2.length();
        Rect rect2 = this.valueBound;
        if (rect2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueBound");
            rect2 = null;
        }
        paint5.getTextBounds(str, 0, length, rect2);
        Paint paint6 = this.unitPaint;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unitPaint");
            paint6 = null;
        }
        String str3 = this.unitText;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unitText");
            str3 = null;
        }
        String str4 = this.unitText;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unitText");
            str4 = null;
        }
        int length2 = str4.length();
        Rect rect3 = this.unitBound;
        if (rect3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unitBound");
        } else {
            rect = rect3;
        }
        paint6.getTextBounds(str3, 0, length2, rect);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Paint paint;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint2 = this.valuePaint;
        Paint paint3 = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valuePaint");
            paint2 = null;
        }
        paint2.setColor(0);
        float width = getWidth();
        float height = getHeight();
        Paint paint4 = this.valuePaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valuePaint");
            paint = null;
        } else {
            paint = paint4;
        }
        canvas.drawRect(0.0f, 0.0f, width, height, paint);
        Paint paint5 = this.valuePaint;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valuePaint");
            paint5 = null;
        }
        paint5.setColor(this.valueTextColor);
        Paint paint6 = this.unitPaint;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unitPaint");
            paint6 = null;
        }
        paint6.setColor(this.unitTextColor);
        String str = this.valueText;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueText");
            str = null;
        }
        float f = this.baseLine;
        Paint paint7 = this.valuePaint;
        if (paint7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valuePaint");
            paint7 = null;
        }
        canvas.drawText(str, 0.0f, f, paint7);
        String str2 = this.unitText;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unitText");
            str2 = null;
        }
        Rect rect = this.valueBound;
        if (rect == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueBound");
            rect = null;
        }
        float fWidth = rect.width() + this.DP_4;
        float f2 = this.baseLine;
        Paint paint8 = this.unitPaint;
        if (paint8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unitPaint");
        } else {
            paint3 = paint8;
        }
        canvas.drawText(str2, fWidth, f2, paint3);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Paint paint = this.valuePaint;
        Rect rect = null;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valuePaint");
            paint = null;
        }
        String str = this.valueText;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueText");
            str = null;
        }
        String str2 = this.valueText;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueText");
            str2 = null;
        }
        int length = str2.length();
        Rect rect2 = this.valueBound;
        if (rect2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueBound");
            rect2 = null;
        }
        paint.getTextBounds(str, 0, length, rect2);
        Paint paint2 = this.unitPaint;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unitPaint");
            paint2 = null;
        }
        String str3 = this.unitText;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unitText");
            str3 = null;
        }
        String str4 = this.unitText;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unitText");
            str4 = null;
        }
        int length2 = str4.length();
        Rect rect3 = this.unitBound;
        if (rect3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unitBound");
            rect3 = null;
        }
        paint2.getTextBounds(str3, 0, length2, rect3);
        Paint paint3 = this.valuePaint;
        if (paint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valuePaint");
            paint3 = null;
        }
        Paint.FontMetricsInt fontMetricsInt = paint3.getFontMetricsInt();
        int i = fontMetricsInt.bottom;
        int i2 = i - fontMetricsInt.top;
        this.baseLine = i2 - i;
        Rect rect4 = this.valueBound;
        if (rect4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueBound");
            rect4 = null;
        }
        int iWidth = rect4.width();
        Rect rect5 = this.unitBound;
        if (rect5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unitBound");
        } else {
            rect = rect5;
        }
        setMeasuredDimension(iWidth + rect.width() + ((int) this.DP_4), i2);
    }

    public final void setUnit(@NotNull String unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unitText = unit;
        requestLayout();
    }

    public final void setValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.valueText = value;
        requestLayout();
    }
}
