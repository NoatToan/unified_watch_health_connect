package com.xiaomi.hm.health.device.introduce.webintro;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.device.introduce.webintro.WebIntroLoadingView;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=B\u001b\b\u0016\u0012\u0006\u0010;\u001a\u00020:\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b<\u0010@B#\b\u0016\u0012\u0006\u0010;\u001a\u00020:\u0012\b\u0010?\u001a\u0004\u0018\u00010>\u0012\u0006\u0010A\u001a\u00020\u0004¢\u0006\u0004\b<\u0010BJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014J(\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0014J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0002R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0016\u0010-\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010'R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006C"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/webintro/WebIntroLoadingView;", "Landroid/view/View;", "", "b", "", "loadingRes", "setIcon", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "w", "h", "oldw", "oldh", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "startLoading", "stopLoading", "Landroid/graphics/Paint;", "a", "Landroid/graphics/Paint;", "paint", LogUtil.I, "color", "c", "Landroid/graphics/Bitmap;", GoogleApiAvailabilityLight.a, "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Rect;", "e", "Landroid/graphics/Rect;", "srcRect", "f", "dstRect", "", "g", "F", "strokeWidth", "Landroid/graphics/SweepGradient;", "Landroid/graphics/SweepGradient;", "sweepGradient", "i", "offsetAngle", "Landroid/animation/ValueAnimator;", z.j, "Landroid/animation/ValueAnimator;", "circleAnimator", "Landroid/graphics/Matrix;", hl.k, "Landroid/graphics/Matrix;", "loadingMatrix", "", "l", "Z", "loading", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WebIntroLoadingView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Paint paint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int color;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int loadingRes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Bitmap bitmap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Rect srcRect;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Rect dstRect;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float strokeWidth;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private SweepGradient sweepGradient;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float offsetAngle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private ValueAnimator circleAnimator;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Matrix loadingMatrix;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean loading;

    public WebIntroLoadingView(@NotNull Context context) {
        this(context, null);
    }

    private final void b() {
        if (this.sweepGradient == null) {
            SweepGradient sweepGradient = new SweepGradient(getWidth() / 2.0f, getWidth() / 2.0f, new int[]{0, this.color}, (float[]) null);
            this.sweepGradient = sweepGradient;
            this.paint.setShader(sweepGradient);
        }
        this.loadingMatrix.setRotate(this.offsetAngle, getWidth() / 2.0f, getWidth() / 2.0f);
        this.sweepGradient.setLocalMatrix(this.loadingMatrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(WebIntroLoadingView webIntroLoadingView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        webIntroLoadingView.offsetAngle = ((Float) animatedValue).floatValue() * 360;
        webIntroLoadingView.postInvalidateOnAnimation();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        if (canvas == null) {
            return;
        }
        if (this.loading) {
            b();
            canvas.drawCircle(getWidth() / 2.0f, getWidth() / 2.0f, (getWidth() / 2.0f) - this.strokeWidth, this.paint);
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return;
        }
        canvas.drawBitmap(bitmap, this.srcRect, this.dstRect, this.paint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), this.loadingRes);
        int width = bitmapDecodeResource.getWidth();
        int width2 = (int) (getWidth() * 0.76f);
        float f = width;
        float f2 = width2 / f;
        Matrix matrix = new Matrix();
        float f3 = f / 2.0f;
        matrix.postScale(f2, f2, f3, f3);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width2, width2, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeResource, matrix, new Paint());
        Unit unit = Unit.INSTANCE;
        this.bitmap = bitmapCreateBitmap;
        this.srcRect = new Rect(0, 0, width2, width2);
        int width3 = (int) (((double) getWidth()) * 0.12d);
        int i = width2 + width3;
        this.dstRect = new Rect(width3, width3, i, i);
    }

    public final void setIcon(@DrawableRes int loadingRes) {
        this.loadingRes = loadingRes;
        invalidate();
    }

    public final void startLoading() {
        this.loading = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xp8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                WebIntroLoadingView.c(this.a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(3000L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.start();
        Unit unit = Unit.INSTANCE;
        this.circleAnimator = valueAnimatorOfFloat;
    }

    public final void stopLoading() {
        this.loading = false;
        ValueAnimator valueAnimator = this.circleAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.circleAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
        }
        this.circleAnimator = null;
        invalidate();
    }

    public WebIntroLoadingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WebIntroLoadingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.paint = paint;
        this.color = -1;
        this.loadingRes = -1;
        this.loadingMatrix = new Matrix();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        float fDp2px = ViewUtils.dp2px(getContext(), 1.72f);
        paint.setStrokeWidth(fDp2px);
        Unit unit = Unit.INSTANCE;
        this.strokeWidth = fDp2px;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.WebIntroLoadingView);
        this.color = typedArrayObtainStyledAttributes.getColor(R.styleable.WebIntroLoadingView_loading_color, ContextCompat.getColor(getContext(), R.color.s32));
        this.loadingRes = typedArrayObtainStyledAttributes.getResourceId(R.styleable.WebIntroLoadingView_loading_drawable, R.drawable.web_intro_binding_square);
        typedArrayObtainStyledAttributes.recycle();
    }
}
