package com.xiaomi.fitness.trail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.dki;
import defpackage.jrk;
import defpackage.opi;
import defpackage.xr5;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u000e\u0010 \u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/trail/widget/TimePercentView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bgColor", "percentColor", "paint", "Landroid/graphics/Paint;", "rect", "Landroid/graphics/RectF;", "radius", "", "percent", "txtYOffset", "txtXOffset", "isRtl", "", "onSizeChanged", "", Constants.DEVICE_TYPE_WEAR, "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setPercent", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimePercentView extends View {
    private final int bgColor;
    private final boolean isRtl;

    @NotNull
    private final Paint paint;
    private int percent;
    private final int percentColor;
    private float radius;

    @NotNull
    private final RectF rect;
    private final float txtXOffset;
    private final float txtYOffset;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TimePercentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float height = getHeight();
        this.rect.set(0.0f, 0.0f, getWidth(), height);
        float f = 2;
        this.radius = height / f;
        this.paint.setColor(this.bgColor);
        RectF rectF = this.rect;
        float f2 = this.radius;
        canvas.drawRoundRect(rectF, f2, f2, this.paint);
        this.paint.setColor(this.percentColor);
        float width = (getWidth() * this.percent) / 100.0f;
        if (width >= this.radius * f) {
            if (this.isRtl) {
                this.rect.left = getWidth() - width;
                this.rect.right = getWidth();
            } else {
                this.rect.right = width;
            }
            RectF rectF2 = this.rect;
            float f3 = this.radius;
            canvas.drawRoundRect(rectF2, f3, f3, this.paint);
        } else {
            canvas.save();
            if (this.isRtl) {
                canvas.clipRect(getWidth() - width, 0.0f, getWidth(), height);
            } else {
                canvas.clipRect(0.0f, 0.0f, width, height);
            }
            RectF rectF3 = this.rect;
            float f4 = this.radius;
            canvas.drawRoundRect(rectF3, f4, f4, this.paint);
            canvas.restore();
        }
        this.paint.setColor(-1);
        String strH = xr5.h(this.percent);
        if (!this.isRtl) {
            canvas.drawText(strH, this.txtXOffset, this.txtYOffset, this.paint);
        } else {
            canvas.drawTextRun((CharSequence) strH, 0, strH.length(), 0, strH.length(), (getWidth() - this.paint.measureText(strH)) - this.txtXOffset, this.txtYOffset, false, this.paint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
    }

    public final void setPercent(int percent) {
        this.percent = percent;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TimePercentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TimePercentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgColor = ExtUtilsKt.getColor(dki.h1);
        this.percentColor = ExtUtilsKt.getColor(dki.M0);
        Paint paint = new Paint(1);
        paint.setTextSize(ExtUtilsKt.getDp(9));
        paint.setTypeface(jrk.h(context, opi.f29367b));
        this.paint = paint;
        this.rect = new RectF();
        this.txtYOffset = ExtUtilsKt.getDp(13);
        this.txtXOffset = ExtUtilsKt.getDp(8);
        this.isRtl = AppUtil.isRTLDirection();
    }

    public /* synthetic */ TimePercentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
