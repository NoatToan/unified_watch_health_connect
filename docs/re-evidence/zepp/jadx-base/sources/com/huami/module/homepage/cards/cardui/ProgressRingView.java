package com.huami.module.homepage.cards.cardui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.ColorInt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.cardui.ProgressRingView;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 22\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u0010/\u001a\u00020\u0005¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J(\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0014J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0010\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0005R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010 \u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u0010\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0016\u0010*\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u0016¨\u00063"}, d2 = {"Lcom/huami/module/homepage/cards/cardui/ProgressRingView;", "Landroid/view/View;", "", GoogleApiAvailabilityLight.a, "b", "", "w", "h", "oldw", "oldh", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "colorInt", "setProgressColor", "maxValue", "setMaxValue", "value", "setValue", "", "a", "F", "progressAnim", LogUtil.I, "progressColor", "c", "stroke", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "ringPaint", "e", "progressPaint", "Landroid/graphics/Path;", "f", "Landroid/graphics/Path;", "ringPath", "Landroid/graphics/RectF;", "g", "Landroid/graphics/RectF;", "rectF", "i", "maxAngle", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", z.j, "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class ProgressRingView extends View {

    @Deprecated
    public static final long PROGRESS_ANIM_DURATION = 600;

    @Deprecated
    public static final float PROGRESS_CIRCLE_ANGLE = 360.0f;

    @Deprecated
    public static final float PROGRESS_CIRCLE_ANGLE_LIMIT = 353.0f;

    @Deprecated
    public static final double PROGRESS_COLOR_ALPHA = 0.12d;

    @Deprecated
    public static final int PROGRESS_MAX_VALUE = 8000;

    @Deprecated
    public static final float PROGRESS_START_ANGLE = -90.0f;

    @NotNull
    private static final a j = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float progressAnim;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int progressColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float stroke;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Paint ringPaint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Paint progressPaint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Path ringPath;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private RectF rectF;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int maxValue;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float maxAngle;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007¨\u0006\u0012"}, d2 = {"com/huami/module/homepage/cards/cardui/ProgressRingView$a", "", "", "PROGRESS_ANIM_DURATION", "J", "", "PROGRESS_CIRCLE_ANGLE", "F", "PROGRESS_CIRCLE_ANGLE_LIMIT", "", "PROGRESS_COLOR_ALPHA", LogUtil.D, "", "PROGRESS_MAX_VALUE", LogUtil.I, "PROGRESS_START_ANGLE", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmOverloads
    public ProgressRingView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public ProgressRingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ProgressRingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void b() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: d46
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProgressRingView.c(this.a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ProgressRingView progressRingView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        progressRingView.progressAnim = ((Float) animatedValue).floatValue();
        progressRingView.invalidate();
    }

    private final void d() {
        this.progressPaint.setColor(this.progressColor);
        this.ringPaint.setColor(NumberExtKt.addAlpha(this.progressColor, 0.12d));
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.ringPath, this.ringPaint);
        RectF rectF = this.rectF;
        if (rectF == null) {
            rectF = null;
        }
        canvas.drawArc(rectF, -90.0f, this.maxAngle * this.progressAnim, false, this.progressPaint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.ringPath.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - (this.stroke / 2.0f), Path.Direction.CCW);
        float f = this.stroke;
        this.rectF = new RectF(f / 2.0f, f / 2.0f, getWidth() - (this.stroke / 2.0f), getHeight() - (this.stroke / 2.0f));
    }

    @NotNull
    public final ProgressRingView setMaxValue(int maxValue) {
        if (this.maxValue != maxValue) {
            this.maxValue = maxValue;
            this.progressAnim = 0.0f;
        }
        return this;
    }

    @NotNull
    public final ProgressRingView setProgressColor(@ColorInt int colorInt) {
        this.progressColor = colorInt;
        return this;
    }

    @NotNull
    public final ProgressRingView setValue(int value) {
        int i = this.maxValue;
        float fFloatValue = 353.0f;
        if (value >= i) {
            fFloatValue = 360.0f;
        } else {
            Float fValueOf = Float.valueOf((value / i) * 360.0f);
            if (!(fValueOf.floatValue() < 353.0f)) {
                fValueOf = null;
            }
            if (fValueOf != null) {
                fFloatValue = fValueOf.floatValue();
            }
        }
        if (this.maxAngle == fFloatValue) {
            return this;
        }
        this.maxAngle = fFloatValue;
        d();
        if (this.progressAnim == 0.0f) {
            b();
        } else {
            invalidate();
        }
        return this;
    }

    @JvmOverloads
    public ProgressRingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.progressColor = ViewExtKt.loadColor(this, R.color.s30);
        this.stroke = NumberExtKt.getDp(8.0f);
        Paint paint = new Paint(1);
        paint.setStrokeWidth(this.stroke);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(NumberExtKt.addAlpha(this.progressColor, 0.12d));
        Unit unit = Unit.INSTANCE;
        this.ringPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStrokeWidth(this.stroke);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(this.progressColor);
        this.progressPaint = paint2;
        this.ringPath = new Path();
        this.maxValue = 8000;
        this.maxAngle = -1.0f;
    }
}
