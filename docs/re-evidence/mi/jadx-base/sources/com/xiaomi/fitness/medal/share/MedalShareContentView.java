package com.xiaomi.fitness.medal.share;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.nji;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0007H\u0014J\u0010\u00102\u001a\u00020-2\u0006\u00103\u001a\u000204H\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R$\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u000e\u0010\"\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001a\u0010)\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010\u0014¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/medal/share/MedalShareContentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "fontHeight", "leftWorldsWidth", "", "getLeftWorldsWidth", "()F", "setLeftWorldsWidth", "(F)V", "value", "", "leftWords", "getLeftWords", "()Ljava/lang/String;", "setLeftWords", "(Ljava/lang/String;)V", "rightWorldWidth", "getRightWorldWidth", "setRightWorldWidth", "rightWorlds", "getRightWorlds", "setRightWorlds", "margin", "leftPath", "Landroid/graphics/Path;", "rightPath", "leftOffset", "getLeftOffset", "setLeftOffset", "rightOffset", "getRightOffset", "setRightOffset", "onSizeChanged", "", Constants.DEVICE_TYPE_WEAR, "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MedalShareContentView extends ConstraintLayout {
    private int fontHeight;
    private float leftOffset;

    @NotNull
    private final Path leftPath;

    @NotNull
    private String leftWords;
    private float leftWorldsWidth;
    private final int margin;

    @NotNull
    private final Paint paint;
    private float rightOffset;

    @NotNull
    private final Path rightPath;
    private float rightWorldWidth;

    @NotNull
    private String rightWorlds;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MedalShareContentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final float getLeftOffset() {
        return this.leftOffset;
    }

    @NotNull
    public final String getLeftWords() {
        return this.leftWords;
    }

    public final float getLeftWorldsWidth() {
        return this.leftWorldsWidth;
    }

    @NotNull
    public final Paint getPaint() {
        return this.paint;
    }

    public final float getRightOffset() {
        return this.rightOffset;
    }

    public final float getRightWorldWidth() {
        return this.rightWorldWidth;
    }

    @NotNull
    public final String getRightWorlds() {
        return this.rightWorlds;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawTextOnPath(this.leftWords, this.leftPath, 0.0f, 0.0f, this.paint);
        canvas.drawTextOnPath(this.rightWorlds, this.rightPath, 0.0f, 0.0f, this.paint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float f = 2;
        this.leftOffset = (getHeight() - this.leftWorldsWidth) / f;
        this.rightOffset = (getHeight() - this.rightWorldWidth) / f;
        this.leftPath.reset();
        this.leftPath.moveTo(this.margin, this.leftOffset);
        this.leftPath.lineTo(this.margin, this.leftOffset + this.leftWorldsWidth);
        this.rightPath.reset();
        this.rightPath.moveTo((getWidth() - this.margin) - this.fontHeight, this.rightOffset);
        this.rightPath.lineTo((getWidth() - this.margin) - this.fontHeight, this.rightOffset + this.rightWorldWidth);
    }

    public final void setLeftOffset(float f) {
        this.leftOffset = f;
    }

    public final void setLeftWords(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.leftWords = value;
        this.leftWorldsWidth = this.paint.measureText(value);
        invalidate();
    }

    public final void setLeftWorldsWidth(float f) {
        this.leftWorldsWidth = f;
    }

    public final void setRightOffset(float f) {
        this.rightOffset = f;
    }

    public final void setRightWorldWidth(float f) {
        this.rightWorldWidth = f;
    }

    public final void setRightWorlds(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.rightWorlds = value;
        this.rightWorldWidth = this.paint.measureText(value);
        Rect rect = new Rect();
        Paint paint = this.paint;
        String str = this.rightWorlds;
        paint.getTextBounds(str, 0, str.length(), rect);
        this.fontHeight = rect.bottom - rect.top;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MedalShareContentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MedalShareContentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MedalShareContentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.paint = paint;
        setWillNotDraw(false);
        paint.setTextSize(DisplayUtil.dip2px(9.33f));
        paint.setColor(getResources().getColor(nji.c));
        this.leftWords = "";
        this.rightWorlds = "";
        this.margin = DisplayUtil.dip2px(13.0f);
        this.leftPath = new Path();
        this.rightPath = new Path();
    }
}
