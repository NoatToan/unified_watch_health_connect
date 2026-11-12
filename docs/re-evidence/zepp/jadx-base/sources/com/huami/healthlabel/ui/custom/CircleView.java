package com.huami.healthlabel.ui.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.healthlabel.R;
import com.huami.healthlabel.utils.ext.ColorExtKt;
import com.huami.healthlabel.utils.ext.NumberExtKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0014J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0014R\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006,"}, d2 = {"Lcom/huami/healthlabel/ui/custom/CircleView;", "Landroid/view/View;", "", "select", "", "setSelect", "", "w", "h", "oldw", "oldh", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "a", LogUtil.I, "grayColor", "b", "getCircleColor", "()I", "setCircleColor", "(I)V", "circleColor", "c", "Z", "isSelect", "Landroid/graphics/Paint;", GoogleApiAvailabilityLight.a, "Landroid/graphics/Paint;", "paint", "e", "pathPaint", "Landroid/graphics/Path;", "f", "Landroid/graphics/Path;", "path", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class CircleView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int grayColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int circleColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isSelect;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Paint paint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Paint pathPaint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Path path;

    @JvmOverloads
    public CircleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public CircleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CircleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final int getCircleColor() {
        return this.circleColor;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float dp = NumberExtKt.getDp(12.0f);
        Paint paint = this.paint;
        if (this.isSelect) {
            paint.setColor(getCircleColor());
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(NumberExtKt.getDp(1.0f));
        } else {
            paint.setColor(this.grayColor);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(NumberExtKt.getDp(1.5f));
        }
        Unit unit = Unit.INSTANCE;
        canvas.drawCircle(width, height, dp, paint);
        float width2 = getWidth() / 2.0f;
        float height2 = getHeight() / 2.0f;
        float dp2 = NumberExtKt.getDp(10.0f);
        Paint paint2 = this.paint;
        paint2.setColor(getCircleColor());
        paint2.setStyle(Paint.Style.FILL);
        canvas.drawCircle(width2, height2, dp2, paint2);
        if (this.isSelect) {
            canvas.drawPath(this.path, this.pathPaint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Path path = this.path;
        path.reset();
        path.moveTo((getWidth() / 2.0f) - NumberExtKt.getDp(5.0f), (getHeight() / 2.0f) - NumberExtKt.getDp(0.2f));
        path.lineTo((getWidth() / 2.0f) - NumberExtKt.getDp(1.5f), (getHeight() / 2.0f) + NumberExtKt.getDp(3.5f));
        path.lineTo((getWidth() / 2.0f) + NumberExtKt.getDp(5.0f), (getHeight() / 2.0f) - NumberExtKt.getDp(2.0f));
    }

    public final void setCircleColor(int i) {
        this.circleColor = i;
    }

    public final void setSelect(boolean select) {
        if (select == this.isSelect) {
            return;
        }
        this.isSelect = select;
        invalidate();
    }

    @JvmOverloads
    public CircleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int iColor = ColorExtKt.color(context, R.color.s3);
        this.grayColor = iColor;
        this.circleColor = iColor;
        this.paint = new Paint(1);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStrokeWidth(NumberExtKt.getDp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        Unit unit = Unit.INSTANCE;
        this.pathPaint = paint;
        this.path = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.CircleView, i, 0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        if (indexCount > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.CircleView_circleColor) {
                    this.circleColor = typedArrayObtainStyledAttributes.getColor(index, this.grayColor);
                } else if (index == R.styleable.CircleView_select) {
                    this.isSelect = typedArrayObtainStyledAttributes.getBoolean(index, false);
                }
                if (i3 >= indexCount) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
