package com.huami.core.device.wifi_settings.ui.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.DrawableRes;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.core.device.wifi_settings.R;
import com.huami.core.device.wifi_settings.ui.view.ProgressView;
import com.huami.core.device.wifi_settings.utils.ViewUtils;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u0000 ¥\u00012\u00020\u0001:\u0004¥\u0001¦\u0001B\u0013\b\u0016\u0012\u0007\u0010¡\u0001\u001a\u000209¢\u0006\u0005\b¢\u0001\u0010?B\u001c\b\u0016\u0012\u0007\u0010¡\u0001\u001a\u000209\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001B&\b\u0016\u0012\u0007\u0010¡\u0001\u001a\u000209\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0006\b¢\u0001\u0010¤\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0002J\u0010\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010!\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\u0004J\u0018\u0010!\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"J\u0018\u0010&\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0014J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010(\u001a\u00020\u0006H\u0016J\u000e\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\"J\u0006\u0010+\u001a\u00020\"J\u000e\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0004J\u000e\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\"J\u0006\u00100\u001a\u00020\"J\u0006\u00101\u001a\u00020\"J\u0006\u00102\u001a\u00020\"J\u0006\u00103\u001a\u00020\u0004J\u0006\u00104\u001a\u00020\u0006J\u0006\u00105\u001a\u00020\u0006J\u0006\u00107\u001a\u000206J\u0006\u00108\u001a\u00020\u0006R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010G\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR\"\u0010Q\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010T\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010L\u001a\u0004\bR\u0010N\"\u0004\bS\u0010PR\"\u0010[\u001a\u00020U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010VR$\u0010_\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010V\u001a\u0004\b]\u0010X\"\u0004\b^\u0010ZR\u0016\u0010`\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010BR\u0016\u0010a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010LR\u0016\u0010d\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010cR\u0016\u0010f\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010eR\"\u0010i\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010B\u001a\u0004\bg\u0010D\"\u0004\bh\u0010FR\"\u0010l\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010B\u001a\u0004\bj\u0010D\"\u0004\bk\u0010FR\"\u0010p\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010L\u001a\u0004\bn\u0010N\"\u0004\bo\u0010PR\"\u0010t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010L\u001a\u0004\br\u0010N\"\u0004\bs\u0010PR$\u0010|\u001a\u0004\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R(\u0010\u0083\u0001\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010\u0087\u0001\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010B\u001a\u0005\b\u0085\u0001\u0010D\"\u0005\b\u0086\u0001\u0010FR+\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R)\u0010\u0094\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\t\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R%\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010B\u001a\u0005\b\u0099\u0001\u0010D\"\u0005\b\u009a\u0001\u0010FR.\u0010 \u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u009b\u0001\u0010L\u0012\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0005\b\u009c\u0001\u0010N\"\u0005\b\u009d\u0001\u0010P¨\u0006§\u0001"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/view/ProgressView;", "Landroid/view/View;", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "m", "", "v", GoogleApiAvailabilityLight.b, "i", z.j, GoogleApiAvailabilityLight.a, "Landroid/graphics/Canvas;", "canvas", "f", "h", "Landroid/graphics/RectF;", "rectOval", "g", "e", "l", hl.k, "style", "setStyle", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "", "text", "setText", "resource", "setImageResource", "", AnimatorViewWrapper.SCALE, "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "onDraw", "invalidate", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "setStrokeWidth", "getSweepAngle", "max", "setMax", "value", "setProgress", "getValue", "getMax", "getPercentProgress", "getPercent", "startLoading", "stopLoading", "Landroid/animation/Animator;", "animLoading", "startAnim", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "b", "F", "getMValue", "()F", "setMValue", "(F)V", "mValue", "c", "getMMax", "setMMax", "mMax", LogUtil.I, "getMWidth", "()I", "setMWidth", "(I)V", "mWidth", "getMHeight", "setMHeight", "mHeight", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "getMPaint", "()Landroid/graphics/Paint;", "setMPaint", "(Landroid/graphics/Paint;)V", "mPaint", "mBackgroundPaint", "getMTextPaint", "setMTextPaint", "mTextPaint", "mTextSize", "mTextColor", "Landroid/graphics/Paint$Align;", "Landroid/graphics/Paint$Align;", "mTextAlign", "Landroid/graphics/RectF;", "mRectF", "getMStrokeWidth", "setMStrokeWidth", "mStrokeWidth", "getMRoundRadius", "setMRoundRadius", "mRoundRadius", "o", "getMBackgroundColor", "setMBackgroundColor", "mBackgroundColor", com.google.android.exoplayer2.text.ttml.b.r, "getMProgressColor", "setMProgressColor", "mProgressColor", "Landroid/graphics/SweepGradient;", DTransferConstants.SEARCH_KEY, "Landroid/graphics/SweepGradient;", "getMSweepGradient", "()Landroid/graphics/SweepGradient;", "setMSweepGradient", "(Landroid/graphics/SweepGradient;)V", "mSweepGradient", "r", "Landroid/animation/Animator;", "getMLoadingAnim", "()Landroid/animation/Animator;", "setMLoadingAnim", "(Landroid/animation/Animator;)V", "mLoadingAnim", SOAP.XMLNS, "getOffsetAngle", "setOffsetAngle", "offsetAngle", "t", "Landroid/graphics/drawable/Drawable;", "getMDrawable", "()Landroid/graphics/drawable/Drawable;", "setMDrawable", "(Landroid/graphics/drawable/Drawable;)V", "mDrawable", "u", "Ljava/lang/String;", "mText", "", "Z", "isLoading", "()Z", "setLoading", "(Z)V", "w", "getScale", "setScale", "x", "getMStyle", "setMStyle", "getMStyle$annotations", "()V", "mStyle", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", AlertDialogFragment.STYLE, "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class ProgressView extends View {
    public static final int CYCLE = 0;
    public static final int CYCLE_LOADING = 2;
    public static final int GONE = 4;
    public static final int RECT = 1;
    public static final int RECT_LOADING = 3;
    public static final int START_ANGLE = -90;

    @NotNull
    public static final String TAG = "ProgressView";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private Context mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float mValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float mMax;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mHeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private Paint mPaint;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private Paint mBackgroundPaint;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Paint mTextPaint;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float mTextSize;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int mTextColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private Paint.Align mTextAlign;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private RectF mRectF;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float mStrokeWidth;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float mRoundRadius;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int mBackgroundColor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int mProgressColor;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private SweepGradient mSweepGradient;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    private Animator mLoadingAnim;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private float offsetAngle;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    private Drawable mDrawable;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    private String mText;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean isLoading;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private float scale;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int mStyle;

    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/view/ProgressView$STYLE;", "", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public @interface STYLE {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("PercentProgress:", Float.valueOf(ProgressView.this.getMValue() / ProgressView.this.getMMax()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("style : ", Integer.valueOf(ProgressView.this.getMStyle()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("style : ", Integer.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f) {
            super(0);
            this.a = f;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("value = ", Float.valueOf(this.a));
        }
    }

    public ProgressView(@NotNull Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ProgressView progressView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        progressView.setOffsetAngle(((Float) animatedValue).floatValue() * 360);
        progressView.postInvalidateOnAnimation();
    }

    private final void d() {
        this.mPaint.setShader(null);
        this.mSweepGradient = null;
    }

    private final void e(Canvas canvas) {
        float f = this.mWidth / 2.0f;
        int i = this.mHeight;
        canvas.drawCircle(f, i / 2.0f, (i - this.mStrokeWidth) / 2, this.mBackgroundPaint);
        canvas.drawArc(this.mRectF, -90.0f, getSweepAngle(), false, this.mPaint);
    }

    private final void f(Canvas canvas) {
        Drawable drawable = this.mDrawable;
        if (drawable == null) {
            return;
        }
        ViewUtils viewUtils = ViewUtils.INSTANCE;
        viewUtils.drawBitmapCenter(canvas, this.mRectF.centerX(), this.mRectF.centerY(), getScale(), (DataTypeSource.SPORT_TYPE_BRIDGE & 16) != 0, (DataTypeSource.SPORT_TYPE_BRIDGE & 32) != 0, viewUtils.drawable2Bitmap(drawable), (DataTypeSource.SPORT_TYPE_BRIDGE & 128) != 0 ? null : null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:30:0x0107  */
    /* JADX WARN: Code duplicated, block: B:36:0x0125  */
    /* JADX WARN: Code duplicated, block: B:38:0x0129  */
    /* JADX WARN: Code duplicated, block: B:44:0x0160  */
    /* JADX WARN: Code duplicated, block: B:46:0x0167  */
    /* JADX WARN: Code duplicated, block: B:47:0x0174 A[PHI: r9 r15
      0x0174: PHI (r9v11 float) = (r9v9 float), (r9v12 float) binds: [B:45:0x0165, B:43:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r15v10 android.graphics.RectF) = (r15v8 android.graphics.RectF), (r15v11 android.graphics.RectF) binds: [B:45:0x0165, B:43:0x013d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0180  */
    /* JADX WARN: Code duplicated, block: B:53:0x019a  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a7 A[PHI: r2 r21
      0x01a7: PHI (r2v38 float) = (r2v12 float), (r2v39 float) binds: [B:54:0x019f, B:52:0x0184] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r21v1 float) = (r21v0 float), (r21v2 float) binds: [B:54:0x019f, B:52:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x01db  */
    /* JADX WARN: Code duplicated, block: B:70:0x0204  */
    /* JADX WARN: Code duplicated, block: B:72:0x020b  */
    /* JADX WARN: Code duplicated, block: B:75:0x021e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0236  */
    /* JADX WARN: Code duplicated, block: B:80:0x023b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0242  */
    /* JADX WARN: Code duplicated, block: B:86:0x025d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0263  */
    /* JADX WARN: Code duplicated, block: B:91:0x0274  */
    /* JADX WARN: Code duplicated, block: B:94:0x0298  */
    /* JADX WARN: Code duplicated, block: B:96:0x029d  */
    private final void g(Canvas canvas, RectF rectOval) {
        float f;
        RectF rectF;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        RectF rectF2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        double d2;
        float f18;
        float f19;
        float f20;
        float f21 = this.mRoundRadius;
        canvas.drawRoundRect(rectOval, f21, f21, this.mBackgroundPaint);
        float fCenterX = rectOval.centerX();
        float fCenterY = rectOval.centerY();
        Path path = new Path();
        float sweepAngle = getSweepAngle();
        float f22 = 2;
        float fWidth = rectOval.width() / f22;
        float f23 = this.mRoundRadius;
        float f24 = fWidth - f23;
        double d3 = fWidth;
        float fAtan = (float) ((Math.atan(((double) f24) / d3) / 6.283185307179586d) * ((double) 360));
        double d4 = sweepAngle;
        float fTan = (float) (Math.tan(Math.toRadians(d4)) * d3);
        path.setLastPoint(fCenterX, rectOval.top);
        if (sweepAngle < fAtan) {
            path.rLineTo(fTan, 0.0f);
        } else {
            path.rLineTo(f24, 0.0f);
        }
        RectF rectF3 = new RectF(rectOval);
        rectF3.set(fCenterX - f23, fCenterY - f23, fCenterX + f23, f23 + fCenterY);
        float f25 = -f24;
        rectF3.offset(f24, f25);
        float f26 = 90;
        float f27 = f26 - fAtan;
        if (sweepAngle >= f27 || sweepAngle < fAtan) {
            if (sweepAngle > f27) {
                f = 90.0f;
                path.addArc(rectF3, -90.0f, 90.0f);
            }
            if (sweepAngle >= f27 || sweepAngle >= f) {
                rectF = rectF3;
                f2 = f25;
                if (sweepAngle > 90.0f) {
                    path.moveTo(fCenterX + fWidth, fCenterY - f24);
                    path.rLineTo(0.0f, f24);
                }
            } else {
                rectF = rectF3;
                f2 = f25;
                float fTan2 = f24 - (((float) Math.tan(Math.toRadians(((double) 90) - d4))) * fWidth);
                path.moveTo(fCenterX + fWidth, fCenterY - f24);
                path.rLineTo(0.0f, fTan2);
            }
            f3 = f26 + fAtan;
            f4 = 180;
            f5 = f4 - fAtan;
            if (sweepAngle > 90.0f || sweepAngle >= f3) {
                f6 = f4;
                f7 = fCenterX;
                f8 = f2;
                f9 = 0.0f;
                if (sweepAngle >= f3) {
                    path.rLineTo(0.0f, f24);
                }
            } else {
                f8 = f2;
                f6 = f4;
                f7 = fCenterX;
                f9 = 0.0f;
                path.rLineTo(0.0f, (float) (Math.tan(Math.toRadians(sweepAngle - f26)) * d3));
            }
            if (sweepAngle <= f3 && sweepAngle < f5) {
                rectF.offset(f9, f24 * f22);
                path.addArc(rectF, f9, (((sweepAngle - f26) - fAtan) / (f26 - (f22 * fAtan))) * f26);
            } else if (sweepAngle > f5) {
                rectF.offset(f9, f24 * f22);
                path.addArc(rectF, f9, 90.0f);
            }
            if (sweepAngle >= f5 || sweepAngle >= 180.0f) {
                rectF2 = rectF;
                f10 = f26;
                if (sweepAngle >= 180.0f) {
                    path.moveTo(f7 + f24, fCenterY + fWidth);
                    f11 = f8;
                    path.rLineTo(f11, 0.0f);
                }
                f12 = f6 + fAtan;
                f13 = 270 - fAtan;
                if (sweepAngle > 180.0f || sweepAngle >= f12) {
                    f14 = f11;
                    f15 = 0.0f;
                    if (sweepAngle >= f12) {
                        f16 = f14;
                        path.rLineTo(f16, 0.0f);
                    }
                    if (sweepAngle < f12 && sweepAngle < f13) {
                        rectF2.offset(f16 * f22, f15);
                        path.addArc(rectF2, 90.0f, (((sweepAngle - f6) - fAtan) / (f10 - (f22 * fAtan))) * f10);
                    } else if (sweepAngle > f13) {
                        rectF2.offset(f16 * f22, 0.0f);
                        path.addArc(rectF2, 90.0f, 90.0f);
                    }
                    f17 = 270.0f;
                    if (sweepAngle >= f13 || sweepAngle >= 270.0f) {
                        d2 = d3;
                        if (sweepAngle >= 270.0f) {
                            path.moveTo(f7 - fWidth, fCenterY + f24);
                            path.rLineTo(0.0f, f16);
                        }
                    } else {
                        d2 = d3;
                        float fTan3 = f24 - (((float) Math.tan(Math.toRadians(((double) 90) - ((double) (sweepAngle - f6))))) * fWidth);
                        path.moveTo(f7 - fWidth, fCenterY + f24);
                        path.rLineTo(0.0f, -fTan3);
                        f17 = 270.0f;
                    }
                    f18 = fAtan + f17;
                    f19 = (f10 + f17) - fAtan;
                    if (sweepAngle > f17 || sweepAngle >= f18) {
                        f20 = 0.0f;
                        if (sweepAngle >= f18) {
                            path.rLineTo(0.0f, f16);
                        }
                    } else {
                        f20 = 0.0f;
                        path.rLineTo(0.0f, -((float) (Math.tan(Math.toRadians(sweepAngle - f17)) * d2)));
                    }
                    if (sweepAngle < f18 && sweepAngle < f19) {
                        rectF2.offset(f20, f16 * f22);
                        path.addArc(rectF2, 180.0f, (((sweepAngle - 270.0f) - fAtan) / (f10 - (f22 * fAtan))) * f10);
                    } else if (sweepAngle > f19) {
                        rectF2.offset(0.0f, f16 * f22);
                        path.addArc(rectF2, 180.0f, 90.0f);
                    }
                    if (sweepAngle < f19 && sweepAngle < 360.0f) {
                        float fTan4 = f24 - (((float) Math.tan(Math.toRadians(((double) 90) - ((double) (sweepAngle - 270.0f))))) * fWidth);
                        path.moveTo(f7 - f24, fCenterY - fWidth);
                        path.rLineTo(fTan4, 0.0f);
                    } else if (sweepAngle >= 360.0f) {
                        path.moveTo(f7 - f24, fCenterY - fWidth);
                        path.rLineTo(f24, 0.0f);
                    }
                    canvas.drawPath(path, this.mPaint);
                }
                f14 = f11;
                f15 = 0.0f;
                path.rLineTo(-((float) (Math.tan(Math.toRadians(sweepAngle - f6)) * d3)), 0.0f);
                f16 = f14;
                if (sweepAngle < f12) {
                    if (sweepAngle > f13) {
                        rectF2.offset(f16 * f22, 0.0f);
                        path.addArc(rectF2, 90.0f, 90.0f);
                    }
                } else if (sweepAngle > f13) {
                    rectF2.offset(f16 * f22, 0.0f);
                    path.addArc(rectF2, 90.0f, 90.0f);
                }
                f17 = 270.0f;
                if (sweepAngle >= f13) {
                    d2 = d3;
                    if (sweepAngle >= 270.0f) {
                        path.moveTo(f7 - fWidth, fCenterY + f24);
                        path.rLineTo(0.0f, f16);
                    }
                } else {
                    d2 = d3;
                    if (sweepAngle >= 270.0f) {
                        path.moveTo(f7 - fWidth, fCenterY + f24);
                        path.rLineTo(0.0f, f16);
                    }
                }
                f18 = fAtan + f17;
                f19 = (f10 + f17) - fAtan;
                if (sweepAngle > f17) {
                    f20 = 0.0f;
                    if (sweepAngle >= f18) {
                        path.rLineTo(0.0f, f16);
                    }
                } else {
                    f20 = 0.0f;
                    if (sweepAngle >= f18) {
                        path.rLineTo(0.0f, f16);
                    }
                }
                if (sweepAngle < f18) {
                    if (sweepAngle > f19) {
                        rectF2.offset(0.0f, f16 * f22);
                        path.addArc(rectF2, 180.0f, 90.0f);
                    }
                } else if (sweepAngle > f19) {
                    rectF2.offset(0.0f, f16 * f22);
                    path.addArc(rectF2, 180.0f, 90.0f);
                }
                if (sweepAngle < f19) {
                    if (sweepAngle >= 360.0f) {
                        path.moveTo(f7 - f24, fCenterY - fWidth);
                        path.rLineTo(f24, 0.0f);
                    }
                } else if (sweepAngle >= 360.0f) {
                    path.moveTo(f7 - f24, fCenterY - fWidth);
                    path.rLineTo(f24, 0.0f);
                }
                canvas.drawPath(path, this.mPaint);
            }
            rectF2 = rectF;
            f10 = f26;
            float fTan5 = f24 - (((float) Math.tan(Math.toRadians(((double) 90) - ((double) (sweepAngle - f26))))) * fWidth);
            path.moveTo(f7 + f24, fCenterY + fWidth);
            path.rLineTo(-fTan5, 0.0f);
            f11 = f8;
            f12 = f6 + fAtan;
            f13 = 270 - fAtan;
            if (sweepAngle > 180.0f) {
                f14 = f11;
                f15 = 0.0f;
                if (sweepAngle >= f12) {
                    f16 = f14;
                    path.rLineTo(f16, 0.0f);
                } else {
                    f16 = f14;
                }
            } else {
                f14 = f11;
                f15 = 0.0f;
                if (sweepAngle >= f12) {
                    f16 = f14;
                    path.rLineTo(f16, 0.0f);
                } else {
                    f16 = f14;
                }
            }
            if (sweepAngle < f12) {
                if (sweepAngle > f13) {
                    rectF2.offset(f16 * f22, 0.0f);
                    path.addArc(rectF2, 90.0f, 90.0f);
                }
            } else if (sweepAngle > f13) {
                rectF2.offset(f16 * f22, 0.0f);
                path.addArc(rectF2, 90.0f, 90.0f);
            }
            f17 = 270.0f;
            if (sweepAngle >= f13) {
                d2 = d3;
                if (sweepAngle >= 270.0f) {
                    path.moveTo(f7 - fWidth, fCenterY + f24);
                    path.rLineTo(0.0f, f16);
                }
            } else {
                d2 = d3;
                if (sweepAngle >= 270.0f) {
                    path.moveTo(f7 - fWidth, fCenterY + f24);
                    path.rLineTo(0.0f, f16);
                }
            }
            f18 = fAtan + f17;
            f19 = (f10 + f17) - fAtan;
            if (sweepAngle > f17) {
                f20 = 0.0f;
                if (sweepAngle >= f18) {
                    path.rLineTo(0.0f, f16);
                }
            } else {
                f20 = 0.0f;
                if (sweepAngle >= f18) {
                    path.rLineTo(0.0f, f16);
                }
            }
            if (sweepAngle < f18) {
                if (sweepAngle > f19) {
                    rectF2.offset(0.0f, f16 * f22);
                    path.addArc(rectF2, 180.0f, 90.0f);
                }
            } else if (sweepAngle > f19) {
                rectF2.offset(0.0f, f16 * f22);
                path.addArc(rectF2, 180.0f, 90.0f);
            }
            if (sweepAngle < f19) {
                if (sweepAngle >= 360.0f) {
                    path.moveTo(f7 - f24, fCenterY - fWidth);
                    path.rLineTo(f24, 0.0f);
                }
            } else if (sweepAngle >= 360.0f) {
                path.moveTo(f7 - f24, fCenterY - fWidth);
                path.rLineTo(f24, 0.0f);
            }
            canvas.drawPath(path, this.mPaint);
        }
        path.addArc(rectF3, -90.0f, ((sweepAngle - fAtan) / (f26 - (f22 * fAtan))) * f26);
        f = 90.0f;
        if (sweepAngle >= f27) {
            rectF = rectF3;
            f2 = f25;
            if (sweepAngle > 90.0f) {
                path.moveTo(fCenterX + fWidth, fCenterY - f24);
                path.rLineTo(0.0f, f24);
            }
        } else {
            rectF = rectF3;
            f2 = f25;
            if (sweepAngle > 90.0f) {
                path.moveTo(fCenterX + fWidth, fCenterY - f24);
                path.rLineTo(0.0f, f24);
            }
        }
        f3 = f26 + fAtan;
        f4 = 180;
        f5 = f4 - fAtan;
        if (sweepAngle > 90.0f) {
            f6 = f4;
            f7 = fCenterX;
            f8 = f2;
            f9 = 0.0f;
            if (sweepAngle >= f3) {
                path.rLineTo(0.0f, f24);
            }
        } else {
            f6 = f4;
            f7 = fCenterX;
            f8 = f2;
            f9 = 0.0f;
            if (sweepAngle >= f3) {
                path.rLineTo(0.0f, f24);
            }
        }
        if (sweepAngle <= f3) {
            if (sweepAngle > f5) {
                rectF.offset(f9, f24 * f22);
                path.addArc(rectF, f9, 90.0f);
            }
        } else if (sweepAngle > f5) {
            rectF.offset(f9, f24 * f22);
            path.addArc(rectF, f9, 90.0f);
        }
        if (sweepAngle >= f5) {
            rectF2 = rectF;
            f10 = f26;
            if (sweepAngle >= 180.0f) {
                path.moveTo(f7 + f24, fCenterY + fWidth);
                f11 = f8;
                path.rLineTo(f11, 0.0f);
            } else {
                f11 = f8;
            }
        } else {
            rectF2 = rectF;
            f10 = f26;
            if (sweepAngle >= 180.0f) {
                path.moveTo(f7 + f24, fCenterY + fWidth);
                f11 = f8;
                path.rLineTo(f11, 0.0f);
            } else {
                f11 = f8;
            }
        }
        f12 = f6 + fAtan;
        f13 = 270 - fAtan;
        if (sweepAngle > 180.0f) {
            f14 = f11;
            f15 = 0.0f;
            if (sweepAngle >= f12) {
                f16 = f14;
                path.rLineTo(f16, 0.0f);
            } else {
                f16 = f14;
            }
        } else {
            f14 = f11;
            f15 = 0.0f;
            if (sweepAngle >= f12) {
                f16 = f14;
                path.rLineTo(f16, 0.0f);
            } else {
                f16 = f14;
            }
        }
        if (sweepAngle < f12) {
            if (sweepAngle > f13) {
                rectF2.offset(f16 * f22, 0.0f);
                path.addArc(rectF2, 90.0f, 90.0f);
            }
        } else if (sweepAngle > f13) {
            rectF2.offset(f16 * f22, 0.0f);
            path.addArc(rectF2, 90.0f, 90.0f);
        }
        f17 = 270.0f;
        if (sweepAngle >= f13) {
            d2 = d3;
            if (sweepAngle >= 270.0f) {
                path.moveTo(f7 - fWidth, fCenterY + f24);
                path.rLineTo(0.0f, f16);
            }
        } else {
            d2 = d3;
            if (sweepAngle >= 270.0f) {
                path.moveTo(f7 - fWidth, fCenterY + f24);
                path.rLineTo(0.0f, f16);
            }
        }
        f18 = fAtan + f17;
        f19 = (f10 + f17) - fAtan;
        if (sweepAngle > f17) {
            f20 = 0.0f;
            if (sweepAngle >= f18) {
                path.rLineTo(0.0f, f16);
            }
        } else {
            f20 = 0.0f;
            if (sweepAngle >= f18) {
                path.rLineTo(0.0f, f16);
            }
        }
        if (sweepAngle < f18) {
            if (sweepAngle > f19) {
                rectF2.offset(0.0f, f16 * f22);
                path.addArc(rectF2, 180.0f, 90.0f);
            }
        } else if (sweepAngle > f19) {
            rectF2.offset(0.0f, f16 * f22);
            path.addArc(rectF2, 180.0f, 90.0f);
        }
        if (sweepAngle < f19) {
            if (sweepAngle >= 360.0f) {
                path.moveTo(f7 - f24, fCenterY - fWidth);
                path.rLineTo(f24, 0.0f);
            }
        } else if (sweepAngle >= 360.0f) {
            path.moveTo(f7 - f24, fCenterY - fWidth);
            path.rLineTo(f24, 0.0f);
        }
        canvas.drawPath(path, this.mPaint);
    }

    @STYLE
    public static /* synthetic */ void getMStyle$annotations() {
    }

    private final void h(Canvas canvas) {
        String str = this.mText;
        if (str == null) {
            return;
        }
        ViewUtils.INSTANCE.drawTextCenter(canvas, this.mRectF.centerX(), this.mRectF.centerY(), str, getMTextPaint());
    }

    private final void i() {
        l();
    }

    private final void j() {
        if (this.mSweepGradient == null) {
            SweepGradient sweepGradient = new SweepGradient(this.mWidth / 2, this.mHeight / 2, new int[]{this.mBackgroundColor, this.mProgressColor}, (float[]) null);
            this.mSweepGradient = sweepGradient;
            this.mPaint.setShader(sweepGradient);
        }
        if (this.isLoading) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.offsetAngle, this.mWidth / 2.0f, this.mHeight / 2.0f);
            SweepGradient sweepGradient2 = this.mSweepGradient;
            if (sweepGradient2 == null) {
                return;
            }
            sweepGradient2.setLocalMatrix(matrix);
        }
    }

    private final void k() {
        if (this.mTextPaint == null) {
            this.mTextPaint = new Paint();
        }
        Paint paint = this.mTextPaint;
        if (paint == null) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.mTextColor);
        paint.setTextSize(this.mTextSize);
        paint.setTextAlign(this.mTextAlign);
    }

    private final void l() {
        this.mPaint.setColor(this.mProgressColor);
        this.mPaint.setStrokeWidth(this.mStrokeWidth);
        this.mBackgroundPaint.setColor(this.mBackgroundColor);
        this.mBackgroundPaint.setStrokeWidth(this.mStrokeWidth);
        if (this.mText == null) {
            return;
        }
        k();
    }

    private final void m(AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(attrs, R.styleable.Progress, 0, defStyleAttr);
        this.mMax = typedArrayObtainStyledAttributes.getInteger(R.styleable.Progress_android_max, 100);
        this.mValue = typedArrayObtainStyledAttributes.getInteger(R.styleable.Progress_android_progress, 0);
        int i = typedArrayObtainStyledAttributes.getInt(R.styleable.Progress_style, 0);
        if (i == 0) {
            this.mStyle = 0;
        } else if (i == 1) {
            this.mStyle = 1;
        } else if (i == 2) {
            this.mStyle = 2;
            startLoading();
        } else if (i == 3) {
            this.mStyle = 3;
            startLoading();
        }
        HMLog.debug(TAG, new b());
        int i2 = R.styleable.Progress_strokeWidth;
        ViewUtils viewUtils = ViewUtils.INSTANCE;
        this.mStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i2, n(viewUtils.dp2px(this.mContext, 1.3f)));
        this.mBackgroundColor = typedArrayObtainStyledAttributes.getColor(R.styleable.Progress_backgroundColor, 1157627903);
        this.mProgressColor = typedArrayObtainStyledAttributes.getColor(R.styleable.Progress_progressColor, -1);
        this.mTextColor = typedArrayObtainStyledAttributes.getColor(R.styleable.Progress_android_textColor, -16777216);
        this.mRoundRadius = viewUtils.dp2px(this.mContext, typedArrayObtainStyledAttributes.getDimension(R.styleable.Progress_roundRadius, 20.0f));
        this.mTextSize = viewUtils.dp2px(this.mContext, typedArrayObtainStyledAttributes.getDimension(R.styleable.Progress_android_textSize, 50.0f));
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.Progress_android_src);
        if (drawable != null) {
            setImageDrawable(drawable);
        }
        this.mText = typedArrayObtainStyledAttributes.getString(R.styleable.Progress_android_text);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final int n(double v) {
        return new BigDecimal(v).divide(new BigDecimal("1"), 0, 4).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(ProgressView progressView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        HMLog.debug(TAG, new d(fFloatValue));
        progressView.setProgress(fFloatValue);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final Animator animLoading() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: e46
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProgressView.c(this.a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(3000L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        return valueAnimatorOfFloat;
    }

    public final int getMBackgroundColor() {
        return this.mBackgroundColor;
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @Nullable
    public final Drawable getMDrawable() {
        return this.mDrawable;
    }

    public final int getMHeight() {
        return this.mHeight;
    }

    @Nullable
    public final Animator getMLoadingAnim() {
        return this.mLoadingAnim;
    }

    public final float getMMax() {
        return this.mMax;
    }

    @NotNull
    public final Paint getMPaint() {
        return this.mPaint;
    }

    public final int getMProgressColor() {
        return this.mProgressColor;
    }

    public final float getMRoundRadius() {
        return this.mRoundRadius;
    }

    public final float getMStrokeWidth() {
        return this.mStrokeWidth;
    }

    public final int getMStyle() {
        return this.mStyle;
    }

    @Nullable
    public final SweepGradient getMSweepGradient() {
        return this.mSweepGradient;
    }

    @Nullable
    public final Paint getMTextPaint() {
        return this.mTextPaint;
    }

    public final float getMValue() {
        return this.mValue;
    }

    public final int getMWidth() {
        return this.mWidth;
    }

    public final float getMax() {
        return this.mMax;
    }

    public final float getOffsetAngle() {
        return this.offsetAngle;
    }

    public final int getPercent() {
        return (int) (100 * getPercentProgress());
    }

    public final float getPercentProgress() {
        HMLog.debug(TAG, new a());
        return this.mValue / this.mMax;
    }

    public final float getScale() {
        return this.scale;
    }

    public final float getSweepAngle() {
        return 360 * getPercentProgress();
    }

    public final float getValue() {
        return this.mValue;
    }

    @Override // android.view.View
    public void invalidate() {
        l();
        super.invalidate();
    }

    /* JADX INFO: renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        f(canvas);
        h(canvas);
        int i = this.mStyle;
        if (i == 0) {
            d();
            e(canvas);
            return;
        }
        if (i == 1) {
            d();
            g(canvas, this.mRectF);
            return;
        }
        if (i == 2) {
            j();
            canvas.rotate(-90.0f, this.mWidth / 2.0f, this.mHeight / 2.0f);
            float f = this.mWidth / 2.0f;
            int i2 = this.mHeight;
            canvas.drawCircle(f, i2 / 2.0f, (i2 - this.mStrokeWidth) / 2, this.mPaint);
            return;
        }
        if (i != 3) {
            return;
        }
        j();
        canvas.rotate(-90.0f, this.mWidth / 2.0f, this.mHeight / 2.0f);
        RectF rectF = this.mRectF;
        float f2 = this.mRoundRadius;
        canvas.drawRoundRect(rectF, f2, f2, this.mPaint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        if (mode == 1073741824) {
            this.mWidth = size;
        } else {
            int paddingLeft = getPaddingLeft() + getPaddingRight() + ((int) this.mStrokeWidth) + ((int) ViewUtils.INSTANCE.dp2px(this.mContext, 100.0f));
            if (mode == Integer.MIN_VALUE) {
                this.mWidth = Math.min(paddingLeft, size);
            }
        }
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode2 == 1073741824) {
            this.mHeight = size2;
        } else {
            int paddingTop = getPaddingTop() + getPaddingBottom() + ((int) this.mStrokeWidth) + ((int) ViewUtils.INSTANCE.dp2px(this.mContext, 100.0f));
            if (mode2 == Integer.MIN_VALUE) {
                this.mHeight = Math.min(paddingTop, size2);
            }
        }
        RectF rectF = this.mRectF;
        float f = this.mStrokeWidth;
        float f2 = 2;
        rectF.set(f / f2, f / f2, this.mWidth - (f / f2), this.mHeight - (f / f2));
        setMeasuredDimension(this.mWidth, this.mHeight);
    }

    public final void setImageDrawable(@Nullable Drawable drawable) {
        if (this.mDrawable != drawable) {
            this.mDrawable = drawable;
            invalidate();
        }
    }

    public final void setImageResource(@DrawableRes int resource) {
        setImageDrawable(this.mContext.getResources().getDrawable(resource));
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
    }

    public final void setMBackgroundColor(int i) {
        this.mBackgroundColor = i;
    }

    public final void setMContext(@NotNull Context context) {
        this.mContext = context;
    }

    public final void setMDrawable(@Nullable Drawable drawable) {
        this.mDrawable = drawable;
    }

    public final void setMHeight(int i) {
        this.mHeight = i;
    }

    public final void setMLoadingAnim(@Nullable Animator animator) {
        this.mLoadingAnim = animator;
    }

    public final void setMMax(float f) {
        this.mMax = f;
    }

    public final void setMPaint(@NotNull Paint paint) {
        this.mPaint = paint;
    }

    public final void setMProgressColor(int i) {
        this.mProgressColor = i;
    }

    public final void setMRoundRadius(float f) {
        this.mRoundRadius = f;
    }

    public final void setMStrokeWidth(float f) {
        this.mStrokeWidth = f;
    }

    public final void setMStyle(int i) {
        this.mStyle = i;
    }

    public final void setMSweepGradient(@Nullable SweepGradient sweepGradient) {
        this.mSweepGradient = sweepGradient;
    }

    public final void setMTextPaint(@Nullable Paint paint) {
        this.mTextPaint = paint;
    }

    public final void setMValue(float f) {
        this.mValue = f;
    }

    public final void setMWidth(int i) {
        this.mWidth = i;
    }

    public final void setMax(int max) {
        this.mMax = max;
    }

    public final void setOffsetAngle(float f) {
        this.offsetAngle = f;
    }

    public final void setProgress(float value) {
        this.mValue = value;
        invalidate();
    }

    public final void setScale(float f) {
        this.scale = f;
    }

    public final void setStrokeWidth(float width) {
        this.mStrokeWidth = width;
        invalidate();
    }

    public final void setStyle(@STYLE int style) {
        HMLog.debug(TAG, new c(style));
        this.mStyle = style;
        invalidate();
    }

    public final void setText(@Nullable String text) {
        if (text == null) {
            return;
        }
        this.mText = text;
        invalidate();
    }

    public final void startAnim() {
        setMax(100);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.mMax);
        valueAnimatorOfFloat.setDuration(15000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f46
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProgressView.o(this.a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public final void startLoading() {
        if (this.mLoadingAnim == null) {
            this.mLoadingAnim = animLoading();
        }
        Animator animator = this.mLoadingAnim;
        if (animator == null || animator.isStarted()) {
            return;
        }
        animator.start();
        setLoading(true);
    }

    public final void stopLoading() {
        Animator animator = this.mLoadingAnim;
        if (animator != null && animator.isRunning()) {
            animator.end();
            animator.cancel();
            setLoading(false);
            setMLoadingAnim(null);
        }
    }

    public ProgressView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPaint = new Paint();
        this.mBackgroundPaint = new Paint();
        this.mTextSize = 50.0f;
        this.mTextColor = -16777216;
        this.mTextAlign = Paint.Align.CENTER;
        this.mRectF = new RectF();
        this.offsetAngle = 360.0f;
        this.scale = 1.0f;
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mBackgroundPaint.setAntiAlias(true);
        this.mBackgroundPaint.setStyle(Paint.Style.STROKE);
        this.mContext = context;
        if (attributeSet != null) {
            m(attributeSet, i);
        }
        i();
    }

    public final void setImageResource(@DrawableRes int resource, float scale) {
        this.scale = scale;
        setImageResource(resource);
    }
}
