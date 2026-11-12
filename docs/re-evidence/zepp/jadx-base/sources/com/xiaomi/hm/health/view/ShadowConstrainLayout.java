package com.xiaomi.hm.health.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"B\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b!\u0010#B\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b!\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/view/ShadowConstrainLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "a", "Landroid/graphics/RectF;", "getRectF", "Landroid/graphics/Canvas;", "canvas", "draw", "", "isOpaque", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mPaint", "", "b", LogUtil.I, "shadowColor", "", "c", "F", "shadowBlur", GoogleApiAvailabilityLight.a, "shadowRadius", "e", "shadowDx", "f", "shadowDy", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public class ShadowConstrainLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Paint mPaint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int shadowColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float shadowBlur;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float shadowRadius;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float shadowDx;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float shadowDy;

    public ShadowConstrainLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.mPaint = paint;
        this.shadowColor = Color.parseColor("#0A000000");
        this.shadowBlur = 30.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ShadowConstrainLayout);
        this.shadowColor = typedArrayObtainStyledAttributes.getColor(1, this.shadowColor);
        this.shadowRadius = typedArrayObtainStyledAttributes.getDimension(4, ViewUtils.dp2px(context, 6.0f));
        this.shadowBlur = typedArrayObtainStyledAttributes.getDimension(0, ViewUtils.dp2px(context, 12.0f));
        this.shadowDx = typedArrayObtainStyledAttributes.getDimension(2, this.shadowDx);
        this.shadowDy = typedArrayObtainStyledAttributes.getDimension(3, ViewUtils.dp2px(context, 1.0f));
        typedArrayObtainStyledAttributes.recycle();
        setLayerType(1, null);
        paint.setAntiAlias(true);
        paint.setColor(this.shadowColor);
        paint.setMaskFilter(new BlurMaskFilter(this.shadowBlur, BlurMaskFilter.Blur.NORMAL));
        int iDp2px = (int) ViewUtils.dp2px(context, 6.0f);
        setPadding(iDp2px, iDp2px, iDp2px, iDp2px);
    }

    private final void a() {
        Drawable background = getBackground();
        if (background == null || (background instanceof InsetDrawable)) {
            return;
        }
        setBackground(new InsetDrawable(background, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom()));
    }

    private final RectF getRectF() {
        return new RectF(getPaddingLeft() + this.shadowDx, getPaddingTop() + this.shadowDy, (getWidth() - getPaddingRight()) + this.shadowDx, (getHeight() - getPaddingBottom()) + this.shadowDy);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View
    public void draw(@Nullable Canvas canvas) {
        a();
        if (canvas != null) {
            RectF rectF = getRectF();
            float f = this.shadowRadius;
            canvas.drawRoundRect(rectF, f, f, this.mPaint);
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    public boolean isOpaque() {
        return false;
    }

    public ShadowConstrainLayout(@NotNull Context context) {
        this(context, null);
    }

    public ShadowConstrainLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
