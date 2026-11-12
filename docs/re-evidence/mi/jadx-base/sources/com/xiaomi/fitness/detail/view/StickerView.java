package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0014J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\rJ\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\rJ\u0016\u0010$\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rJ\b\u0010%\u001a\u00020\u001cH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/detail/view/StickerView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "matrix", "Landroid/graphics/Matrix;", "paint", "Landroid/graphics/Paint;", "lastTouchX", "", "lastTouchY", "scale", "rotation", EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, "stickerViewWidth", "getStickerViewWidth", "()F", "setStickerViewWidth", "(F)V", "viewWidth", "getViewWidth", "setViewWidth", "setStickTextValue", "", "sportValue", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setStickerScale", "setStickerRotation", "setStickerTranslation", "applyMatrix", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class StickerView extends View {
    private float lastTouchX;
    private float lastTouchY;

    @NotNull
    private final Matrix matrix;

    @NotNull
    private final Paint paint;
    private float rotation;
    private float scale;
    private float stickerViewWidth;
    private float translationX;
    private float translationY;
    private float viewWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public StickerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyMatrix() {
        this.matrix.reset();
        Matrix matrix = this.matrix;
        float f = this.scale;
        matrix.postScale(f, f);
        this.matrix.postRotate(this.rotation, getWidth() / 2.0f, getHeight() / 2.0f);
        this.matrix.postTranslate(this.translationX, this.translationY);
        invalidate();
    }

    public final float getStickerViewWidth() {
        return this.stickerViewWidth;
    }

    public final float getViewWidth() {
        return this.viewWidth;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
    }

    public void setStickTextValue(@NotNull SportBasicReport sportValue) {
        Intrinsics.checkNotNullParameter(sportValue, "sportValue");
    }

    public final void setStickerRotation(float rotation) {
        this.rotation = rotation;
        applyMatrix();
    }

    public final void setStickerScale(float scale) {
        this.scale = scale;
        applyMatrix();
    }

    public final void setStickerTranslation(float translationX, float translationY) {
        this.translationX = translationX;
        this.translationY = translationY;
        applyMatrix();
    }

    public final void setStickerViewWidth(float f) {
        this.stickerViewWidth = f;
    }

    public final void setViewWidth(float f) {
        this.viewWidth = f;
    }

    public /* synthetic */ StickerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StickerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.matrix = new Matrix();
        Paint paint = new Paint(1);
        this.paint = paint;
        this.scale = 1.0f;
        paint.setAntiAlias(true);
        setClickable(true);
        this.translationX = getX();
        this.translationY = getY();
    }
}
