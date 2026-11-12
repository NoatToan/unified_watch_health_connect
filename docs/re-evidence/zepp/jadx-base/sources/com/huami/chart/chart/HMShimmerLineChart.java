package com.huami.chart.chart;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.ColorInt;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.chart.provider.DrawAreaManager;
import com.huami.chart.shimmer.Shimmer;
import com.huami.chart.shimmer.ShimmerDrawable;
import com.huami.chart.util.ChartUtil;
import com.huami.tools.analytics.DbUtils;
import com.squareup.picasso.u;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u007f2\u00020\u0001:\u0001\u007fB!\u0012\u0006\u0010y\u001a\u00020x\u0012\u0006\u0010{\u001a\u00020z\u0012\b\b\u0002\u0010|\u001a\u00020\u000f¢\u0006\u0004\b}\u0010~J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J \u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002J0\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0014J\u0012\u0010\u0016\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u0018\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0004H\u0014J\b\u0010\u001b\u001a\u00020\tH\u0014J\b\u0010\u001c\u001a\u00020\tH\u0014J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014J\u0006\u0010 \u001a\u00020\tJ\u0006\u0010!\u001a\u00020\tJ\u0006\u0010\"\u001a\u00020\tJ\u0006\u0010#\u001a\u00020\u000fR\"\u0010&\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00108\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010E\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010K\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010$\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u00103\u001a\u0004\bM\u00105\"\u0004\bN\u00107R\"\u0010S\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u00103\u001a\u0004\bQ\u00105\"\u0004\bR\u00107R\u001d\u0010W\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010HR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020X8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010ZR\u001d\u0010a\u001a\u00020X8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010U\u001a\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010g\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010%R\u001d\u0010l\u001a\u00020h8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010U\u001a\u0004\bj\u0010kR\u001f\u0010q\u001a\u0004\u0018\u00010m8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010U\u001a\u0004\bo\u0010pR%\u0010w\u001a\n s*\u0004\u0018\u00010r0r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010U\u001a\u0004\bu\u0010v¨\u0006\u0080\u0001"}, d2 = {"Lcom/huami/chart/chart/HMShimmerLineChart;", "Lcom/huami/chart/chart/HMDynamicLineChart;", "", "animatedValue", "", "v", "dx", "Landroid/graphics/Canvas;", "canvas", "", "u", "start", "end", "percent", "w", "", u.q, "left", "top", "right", "bottom", "onLayout", "onDraw", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/graphics/drawable/Drawable;", "who", "verifyDrawable", "startShimmer", "cancelShimmer", "stopShimmer", "isShimmerStarted", "F", "Z", "isShowShimmer", "()Z", "setShowShimmer", "(Z)V", "Landroid/graphics/Bitmap;", "G", "Landroid/graphics/Bitmap;", "getShimmerBg", "()Landroid/graphics/Bitmap;", "setShimmerBg", "(Landroid/graphics/Bitmap;)V", "shimmerBg", "H", LogUtil.I, "getWaveColor", "()I", "setWaveColor", "(I)V", "waveColor", "", "J", "getWaveDuration", "()J", "setWaveDuration", "(J)V", "waveDuration", "Ljava/lang/Integer;", "getShimmerBgTintColor", "()Ljava/lang/Integer;", "setShimmerBgTintColor", "(Ljava/lang/Integer;)V", "shimmerBgTintColor", "K", "getWaveRadiusMultiple", "()F", "setWaveRadiusMultiple", "(F)V", "waveRadiusMultiple", "L", "getShimmerWidth", "setShimmerWidth", "shimmerWidth", "M", "getShimmerHeight", "setShimmerHeight", "shimmerHeight", "N", "Lkotlin/Lazy;", "getWaveRadius", "waveRadius", "Landroid/graphics/Paint;", "O", "Landroid/graphics/Paint;", "contentPaint", "P", "shimmerBgPaint", "Q", "getWavePaint", "()Landroid/graphics/Paint;", "wavePaint", "Landroid/graphics/Matrix;", "R", "Landroid/graphics/Matrix;", "shimmerBgMatrix", ExifInterface.LATITUDE_SOUTH, "mStoppedShimmerBecauseVisibility", "Lcom/huami/chart/shimmer/Shimmer;", ExifInterface.GPS_DIRECTION_TRUE, "getShimmer", "()Lcom/huami/chart/shimmer/Shimmer;", "shimmer", "Lcom/huami/chart/shimmer/ShimmerDrawable;", "U", "getShimmerDrawable", "()Lcom/huami/chart/shimmer/ShimmerDrawable;", "shimmerDrawable", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "V", "getWaveAnimation", "()Landroid/animation/ValueAnimator;", "waveAnimation", "Lcom/huami/chart/chart/HMChart;", "hmChart", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "shimmerAutoStart", "<init>", "(Lcom/huami/chart/chart/HMChart;Landroid/content/Context;Z)V", "Companion", "chart_release"}, k = 1, mv = {1, 5, 1})
public final class HMShimmerLineChart extends HMDynamicLineChart {
    private static final int W = 255;
    private static final int m0 = 20;
    private static final int n0 = 5100;
    private static final double o0 = 0.05d;
    private static final double p0 = 0.95d;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean isShowShimmer;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    private Bitmap shimmerBg;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @ColorInt
    private int waveColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private long waveDuration;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @ColorInt
    @Nullable
    private Integer shimmerBgTintColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private float waveRadiusMultiple;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private int shimmerWidth;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private int shimmerHeight;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    private final Lazy waveRadius;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    private final Paint contentPaint;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    private final Paint shimmerBgPaint;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    private final Lazy wavePaint;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    private final Matrix shimmerBgMatrix;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private boolean mStoppedShimmerBecauseVisibility;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    private final Lazy shimmer;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    private final Lazy shimmerDrawable;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    private final Lazy waveAnimation;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/shimmer/Shimmer;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Shimmer> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Shimmer invoke() {
            Shimmer shimmer = new Shimmer();
            shimmer.setAutoStart(this.a);
            return shimmer;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/chart/shimmer/ShimmerDrawable;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ShimmerDrawable> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShimmerDrawable invoke() {
            if (HMShimmerLineChart.this.getIsShowShimmer()) {
                return new ShimmerDrawable(HMShimmerLineChart.this.getShimmer());
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/graphics/Paint;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Paint> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint();
            HMShimmerLineChart hMShimmerLineChart = HMShimmerLineChart.this;
            paint.setAntiAlias(true);
            paint.setColor(hMShimmerLineChart.getWaveColor());
            paint.setStyle(Paint.Style.FILL);
            return paint;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Float> {
        public d() {
            super(0);
        }

        public final float a() {
            return HMShimmerLineChart.this.getWaveRadiusMultiple() * HMShimmerLineChart.this.getPointRadius();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Float invoke() {
            return Float.valueOf(a());
        }
    }

    public /* synthetic */ HMShimmerLineChart(HMChart hMChart, Context context, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hMChart, context, (i & 4) != 0 ? false : z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Shimmer getShimmer() {
        return (Shimmer) this.shimmer.getValue();
    }

    private final ShimmerDrawable getShimmerDrawable() {
        return (ShimmerDrawable) this.shimmerDrawable.getValue();
    }

    private final ValueAnimator getWaveAnimation() {
        return (ValueAnimator) this.waveAnimation.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Paint getWavePaint() {
        return (Paint) this.wavePaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getWaveRadius() {
        return ((Number) this.waveRadius.getValue()).floatValue();
    }

    private final void u(float dx, Canvas canvas) {
        if (dx <= getMEndPointPos()[0] + getPointRadius() && dx >= (getMEndPointPos()[0] - getPointRadius()) - (this.shimmerWidth / 2) && !getWaveAnimation().isRunning()) {
            getWaveAnimation().start();
        }
        if (getWaveAnimation().isRunning()) {
            Object animatedValue = getWaveAnimation().getAnimatedValue();
            Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
            float fFloatValue = f == null ? 0.0f : f.floatValue();
            getWavePaint().setAlpha((int) ((1 - (fFloatValue / getWaveRadius())) * 255));
            canvas.drawCircle(getMEndPointPos()[0], getMEndPointPos()[1], fFloatValue, getWavePaint());
        }
    }

    private final int v(float animatedValue) {
        double d2 = animatedValue;
        if (d2 < o0) {
            return (int) (animatedValue * n0);
        }
        if (d2 > p0) {
            return (int) ((1 - animatedValue) * n0);
        }
        return 255;
    }

    private final float w(float start, float end, float percent) {
        return start + ((end - start) * percent);
    }

    public final void cancelShimmer() {
        ShimmerDrawable shimmerDrawable = getShimmerDrawable();
        if (shimmerDrawable == null) {
            return;
        }
        shimmerDrawable.cancelShimmer();
    }

    @Nullable
    public final Bitmap getShimmerBg() {
        return this.shimmerBg;
    }

    @Nullable
    public final Integer getShimmerBgTintColor() {
        return this.shimmerBgTintColor;
    }

    public final int getShimmerHeight() {
        return this.shimmerHeight;
    }

    public final int getShimmerWidth() {
        return this.shimmerWidth;
    }

    public final int getWaveColor() {
        return this.waveColor;
    }

    public final long getWaveDuration() {
        return this.waveDuration;
    }

    public final float getWaveRadiusMultiple() {
        return this.waveRadiusMultiple;
    }

    public final boolean isShimmerStarted() {
        ShimmerDrawable shimmerDrawable = getShimmerDrawable();
        if (shimmerDrawable == null) {
            return false;
        }
        return shimmerDrawable.isShimmerStarted();
    }

    /* JADX INFO: renamed from: isShowShimmer, reason: from getter */
    public final boolean getIsShowShimmer() {
        return this.isShowShimmer;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ShimmerDrawable shimmerDrawable = getShimmerDrawable();
        if (shimmerDrawable == null) {
            return;
        }
        shimmerDrawable.maybeStartShimmer();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelShimmer();
    }

    @Override // com.huami.chart.chart.HMDynamicLineChart, android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        ShimmerDrawable shimmerDrawable;
        ValueAnimator mValueAnimator;
        if (canvas == null) {
            return;
        }
        float f = -1.0f;
        Bitmap bitmap = this.shimmerBg;
        if (bitmap != null) {
            Bitmap bitmapTintBitmap = getShimmerBgTintColor() != null ? ChartUtil.tintBitmap(bitmap, getShimmerBgTintColor().intValue()) : bitmap;
            this.shimmerBgMatrix.reset();
            ShimmerDrawable shimmerDrawable2 = getShimmerDrawable();
            Object animatedValue = (shimmerDrawable2 == null || (mValueAnimator = shimmerDrawable2.getMValueAnimator()) == null) ? null : mValueAnimator.getAnimatedValue();
            Float f2 = animatedValue instanceof Float ? (Float) animatedValue : null;
            float fFloatValue = f2 == null ? 0.0f : f2.floatValue();
            float fW = w(getShimmer().getTranslateBounds().left - (bitmap.getWidth() / 2), getShimmer().getTranslateBounds().width(), fFloatValue);
            this.shimmerBgMatrix.postTranslate(fW, 0.0f);
            this.shimmerBgPaint.setAlpha(v(fFloatValue));
            ShimmerDrawable shimmerDrawable3 = getShimmerDrawable();
            if (shimmerDrawable3 != null && shimmerDrawable3.isShimmerStarted()) {
                canvas.drawBitmap(bitmapTintBitmap, this.shimmerBgMatrix, this.shimmerBgPaint);
            }
            f = fW;
        }
        canvas.saveLayer(getLeft(), getTop(), getRight(), getBottom(), this.contentPaint, 31);
        super.onDraw(canvas);
        ShimmerDrawable shimmerDrawable4 = getShimmerDrawable();
        if ((shimmerDrawable4 != null && shimmerDrawable4.isShimmerStarted()) && (shimmerDrawable = getShimmerDrawable()) != null) {
            shimmerDrawable.draw(canvas);
        }
        canvas.restore();
        if (getMEndPointPos()[0] <= 0.0f || this.shimmerBg == null) {
            return;
        }
        u(f, canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        ShimmerDrawable shimmerDrawable = getShimmerDrawable();
        if (shimmerDrawable != null) {
            shimmerDrawable.setBounds(0, 0, this.shimmerWidth, this.shimmerHeight);
        }
        DrawAreaManager drawAreaManager = getHmChart().getDrawAreaManager();
        if (getShimmer().getTranslateBounds().isEmpty()) {
            getShimmer().getTranslateBounds().set((int) drawAreaManager.getLeft(), top, (int) drawAreaManager.getRight(), bottom);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        if (getShimmerDrawable() == null) {
            return;
        }
        if (visibility != 0) {
            if (isShimmerStarted()) {
                cancelShimmer();
                this.mStoppedShimmerBecauseVisibility = true;
                return;
            }
            return;
        }
        if (this.mStoppedShimmerBecauseVisibility) {
            ShimmerDrawable shimmerDrawable = getShimmerDrawable();
            if (shimmerDrawable != null) {
                shimmerDrawable.maybeStartShimmer();
            }
            this.mStoppedShimmerBecauseVisibility = false;
        }
    }

    public final void setShimmerBg(@Nullable Bitmap bitmap) {
        this.shimmerBg = bitmap;
    }

    public final void setShimmerBgTintColor(@Nullable Integer num) {
        this.shimmerBgTintColor = num;
    }

    public final void setShimmerHeight(int i) {
        this.shimmerHeight = i;
    }

    public final void setShimmerWidth(int i) {
        this.shimmerWidth = i;
    }

    public final void setShowShimmer(boolean z) {
        this.isShowShimmer = z;
    }

    public final void setWaveColor(int i) {
        this.waveColor = i;
    }

    public final void setWaveDuration(long j) {
        this.waveDuration = j;
    }

    public final void setWaveRadiusMultiple(float f) {
        this.waveRadiusMultiple = f;
    }

    public final void startShimmer() {
        getShimmer().setAutoStart(true);
        ShimmerDrawable shimmerDrawable = getShimmerDrawable();
        if (shimmerDrawable == null) {
            return;
        }
        shimmerDrawable.startShimmer();
    }

    public final void stopShimmer() {
        ShimmerDrawable shimmerDrawable = getShimmerDrawable();
        if (shimmerDrawable == null) {
            return;
        }
        shimmerDrawable.stopShimmer();
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NotNull Drawable who) {
        return super.verifyDrawable(who) || who == getShimmerDrawable();
    }

    public HMShimmerLineChart(@NotNull HMChart hMChart, @NotNull Context context, boolean z) {
        super(hMChart, context);
        this.isShowShimmer = true;
        this.waveColor = -7829368;
        this.waveDuration = 1400L;
        this.waveRadiusMultiple = 3.5f;
        this.shimmerWidth = (int) ChartUtil.dp2px(context, 44.0f);
        this.shimmerHeight = (int) ChartUtil.dp2px(context, 200.0f);
        this.waveRadius = LazyKt__LazyJVMKt.lazy(new d());
        this.contentPaint = new Paint();
        this.shimmerBgPaint = new Paint();
        this.wavePaint = LazyKt__LazyJVMKt.lazy(new c());
        this.shimmerBgMatrix = new Matrix();
        this.shimmer = LazyKt__LazyJVMKt.lazy(new a(z));
        this.shimmerDrawable = LazyKt__LazyJVMKt.lazy(new b());
        this.waveAnimation = LazyKt__LazyJVMKt.lazy(new Function0<ValueAnimator>() { // from class: com.huami.chart.chart.HMShimmerLineChart$waveAnimation$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ValueAnimator invoke() {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.a.getPointRadius(), this.a.getWaveRadius());
                final HMShimmerLineChart hMShimmerLineChart = this.a;
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.setDuration(hMShimmerLineChart.getWaveDuration());
                valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.huami.chart.chart.HMShimmerLineChart$waveAnimation$2$invoke$lambda-1$$inlined$addListener$default$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(@NotNull Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@NotNull Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(@NotNull Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(@NotNull Animator animator) {
                        hMShimmerLineChart.getWavePaint().setAlpha(255);
                    }
                });
                return valueAnimatorOfFloat;
            }
        });
        setWillNotDraw(false);
        ShimmerDrawable shimmerDrawable = getShimmerDrawable();
        if (shimmerDrawable != null) {
            shimmerDrawable.setCallback(this);
        }
        if (getShimmer().getAutoStart()) {
            startShimmer();
        }
    }
}
