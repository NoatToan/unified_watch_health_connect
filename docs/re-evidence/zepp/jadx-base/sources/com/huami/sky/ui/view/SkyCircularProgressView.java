package com.huami.sky.ui.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.View;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.ui.R;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.view.SkyCircularProgressView;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.e;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u0000 x2\u00020\u0001:\u0002xyB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bv\u0010wJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\bH\u0014J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0014J(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014J(\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J(\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\u0006\u0010\u001d\u001a\u00020\bJ\u0006\u0010\u001e\u001a\u00020\bJ\u000e\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fR\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010(R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010(R\u0016\u0010,\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010(R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00106R\u0016\u00109\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010A\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010<R*\u0010I\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR*\u0010M\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010D\u001a\u0004\bK\u0010F\"\u0004\bL\u0010HR*\u0010Q\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010D\u001a\u0004\bO\u0010F\"\u0004\bP\u0010HR*\u0010Y\u001a\u00020R2\u0006\u0010B\u001a\u00020R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010_\u001a\u00020:2\u0006\u0010B\u001a\u00020:8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010<\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R*\u0010g\u001a\u00020`2\u0006\u0010B\u001a\u00020`8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0016\u0010i\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010<R\u0016\u0010k\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010<R\u0016\u0010m\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010<R\u0016\u0010o\u001a\u00020`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010bR\u0018\u0010q\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010pR$\u0010t\u001a\u00020:2\u0006\u0010B\u001a\u00020:8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010\\\"\u0004\bs\u0010^R\u0013\u0010u\u001a\u00020`8F@\u0006¢\u0006\u0006\u001a\u0004\bu\u0010d¨\u0006z"}, d2 = {"Lcom/huami/sky/ui/view/SkyCircularProgressView;", "Landroid/view/View;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "c", GoogleApiAvailabilityLight.a, "b", "onDetachedFromWindow", "Landroid/graphics/Canvas;", "canvas", "onDraw", "w", "h", "oldw", "oldh", "onSizeChanged", "left", "top", "right", "bottom", "setPadding", "start", "end", "setPaddingRelative", "startCountTimeAnimation", "cancelCountTimeAnimation", "Lcom/huami/sky/ui/view/SkyCircularProgressView$OnEndListener;", "onEndListener", "addOnEndListener", "Landroid/graphics/Path;", "a", "Landroid/graphics/Path;", "mBorderPath", "mSportPath", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mBorderBottomPaint", "mBorderDrawPaint", "e", "mBgPaint", "Landroid/graphics/PathMeasure;", "f", "Landroid/graphics/PathMeasure;", "mPathMeasure", "Landroid/animation/ValueAnimator;", "g", "Landroid/animation/ValueAnimator;", "mAnimator", "", "[F", "mSportPos", "i", "mSportTan", "", z.j, "F", "mCurrentValue", hl.k, "mLength", "l", "_borderWidth", "value", "m", LogUtil.I, "getBorderDrawColor", "()I", "setBorderDrawColor", "(I)V", "borderDrawColor", GoogleApiAvailabilityLight.b, "getBorderBottomColor", "setBorderBottomColor", "borderBottomColor", "o", "getBackgroundColorCenter", "setBackgroundColorCenter", "backgroundColorCenter", "", b.r, "J", "getCountTime", "()J", "setCountTime", "(J)V", "countTime", DTransferConstants.SEARCH_KEY, "getStartAngle", "()F", "setStartAngle", "(F)V", "startAngle", "", "r", "Z", "getClockwise", "()Z", "setClockwise", "(Z)V", "clockwise", SOAP.XMLNS, "radius", "t", "centerPaintX", "u", "centerPaintY", "v", "onAnimationCancelMark", "Lcom/huami/sky/ui/view/SkyCircularProgressView$OnEndListener;", "mOnEndListener", "getBorderWidth", "setBorderWidth", "borderWidth", "isRunning", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "OnEndListener", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyCircularProgressView extends View {
    private static final int A = -16777216;
    private static final float B = 0.0f;
    private static final boolean C = true;
    private static final long D = 5;
    private static final int x = 0;
    private static final float y = 1.0f;
    private static final int z = -65536;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private Path mBorderPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Path mSportPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private Paint mBorderBottomPaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private Paint mBorderDrawPaint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private Paint mBgPaint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private PathMeasure mPathMeasure;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private ValueAnimator mAnimator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private float[] mSportPos;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private float[] mSportTan;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float mCurrentValue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float mLength;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float _borderWidth;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int borderDrawColor;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int borderBottomColor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int backgroundColorCenter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private long countTime;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float startAngle;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean clockwise;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private float radius;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private float centerPaintX;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private float centerPaintY;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean onAnimationCancelMark;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    private OnEndListener mOnEndListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/huami/sky/ui/view/SkyCircularProgressView$OnEndListener;", "", "", "onAnimationEnd", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public interface OnEndListener {
        void onAnimationEnd();
    }

    @JvmOverloads
    public SkyCircularProgressView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SkyCircularProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SkyCircularProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void b() {
        float fCoerceAtMost = e.coerceAtMost((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        this.centerPaintX = getPaddingLeft() + fCoerceAtMost;
        this.centerPaintY = getPaddingTop() + fCoerceAtMost;
        this.radius = fCoerceAtMost - get_borderWidth();
        this.mBorderPath.reset();
        if (this.clockwise) {
            this.mBorderPath.addCircle(0.0f, 0.0f, this.radius, Path.Direction.CW);
        } else {
            this.mBorderPath.addCircle(0.0f, 0.0f, this.radius, Path.Direction.CCW);
        }
        this.mPathMeasure.setPath(this.mBorderPath, false);
        this.mLength = this.mPathMeasure.getLength();
        invalidate();
    }

    private final void c(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.SkyCircularProgressView, defStyleAttr, 0);
        this._borderWidth = typedArrayObtainStyledAttributes.getDimension(R.styleable.SkyCircularProgressView_borderWidth, SkyExtKt.getDp(1.0f));
        setBorderDrawColor(typedArrayObtainStyledAttributes.getColor(R.styleable.SkyCircularProgressView_borderDrawColor, -65536));
        setBorderBottomColor(typedArrayObtainStyledAttributes.getColor(R.styleable.SkyCircularProgressView_borderBottomColor, -16777216));
        setBackgroundColorCenter(typedArrayObtainStyledAttributes.getColor(R.styleable.SkyCircularProgressView_backgroundColorCenter, 0));
        setStartAngle(typedArrayObtainStyledAttributes.getFloat(R.styleable.SkyCircularProgressView_startAngle, 0.0f));
        setClockwise(typedArrayObtainStyledAttributes.getBoolean(R.styleable.SkyCircularProgressView_clockwise, true));
        setCountTime(typedArrayObtainStyledAttributes.getInt(R.styleable.SkyCircularProgressView_countTime, 5));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = this.mBorderBottomPaint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(get_borderWidth());
        paint.setColor(getBorderBottomColor());
        Paint paint2 = this.mBorderDrawPaint;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(get_borderWidth());
        paint2.setColor(getBorderDrawColor());
        Paint paint3 = this.mBgPaint;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        paint3.setColor(getBackgroundColorCenter());
        d();
    }

    private final void d() {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null) {
            valueAnimator.setDuration(getCountTime());
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(getCountTime());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dx6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SkyCircularProgressView.e(this.a, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.huami.sky.ui.view.SkyCircularProgressView$initAnimation$2$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                this.a.onAnimationCancelMark = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                SkyCircularProgressView.OnEndListener onEndListener;
                if (this.a.mOnEndListener == null || this.a.onAnimationCancelMark || (onEndListener = this.a.mOnEndListener) == null) {
                    return;
                }
                onEndListener.onAnimationEnd();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                this.a.onAnimationCancelMark = false;
            }
        });
        Unit unit = Unit.INSTANCE;
        this.mAnimator = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SkyCircularProgressView skyCircularProgressView, ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedValue() instanceof Float) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            skyCircularProgressView.mCurrentValue = ((Float) animatedValue).floatValue();
        }
        skyCircularProgressView.invalidate();
    }

    public final void addOnEndListener(@NotNull OnEndListener onEndListener) {
        this.mOnEndListener = onEndListener;
    }

    public final void cancelCountTimeAnimation() {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
    }

    public final int getBackgroundColorCenter() {
        return this.backgroundColorCenter;
    }

    public final int getBorderBottomColor() {
        return this.borderBottomColor;
    }

    public final int getBorderDrawColor() {
        return this.borderDrawColor;
    }

    /* JADX INFO: renamed from: getBorderWidth, reason: from getter */
    public final float get_borderWidth() {
        return this._borderWidth;
    }

    public final boolean getClockwise() {
        return this.clockwise;
    }

    public final long getCountTime() {
        return this.countTime;
    }

    public final float getStartAngle() {
        return (this.startAngle + 270) % 360;
    }

    public final boolean isRunning() {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator == null) {
            return false;
        }
        return valueAnimator.isRunning();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mOnEndListener = null;
        if (isRunning()) {
            cancelCountTimeAnimation();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(this.centerPaintX, this.centerPaintY);
        canvas.rotate(getStartAngle());
        canvas.drawCircle(0.0f, 0.0f, this.radius, this.mBgPaint);
        canvas.drawPath(this.mBorderPath, this.mBorderBottomPaint);
        this.mSportPath.reset();
        this.mSportPath.lineTo(0.0f, 0.0f);
        this.mPathMeasure.getSegment(0.0f, this.mLength * this.mCurrentValue, this.mSportPath, true);
        canvas.drawPath(this.mSportPath, this.mBorderDrawPaint);
        this.mPathMeasure.getPosTan(this.mCurrentValue * this.mLength, this.mSportPos, this.mSportTan);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        b();
    }

    public final void setBackgroundColorCenter(int i) {
        this.backgroundColorCenter = i;
        this.mBgPaint.setColor(i);
        invalidate();
    }

    public final void setBorderBottomColor(int i) {
        this.borderBottomColor = i;
        this.mBorderBottomPaint.setColor(i);
        invalidate();
    }

    public final void setBorderDrawColor(int i) {
        this.borderDrawColor = i;
        this.mBorderDrawPaint.setColor(i);
        invalidate();
    }

    public final void setBorderWidth(float f) {
        float dp = SkyExtKt.getDp(f);
        this._borderWidth = dp;
        this.mBorderBottomPaint.setStrokeWidth(dp);
        this.mBorderDrawPaint.setStrokeWidth(this._borderWidth);
        b();
    }

    public final void setClockwise(boolean z2) {
        this.clockwise = z2;
        b();
        invalidate();
    }

    public final void setCountTime(long j) {
        this.countTime = j;
        d();
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(left, top, right, bottom);
        b();
    }

    @Override // android.view.View
    public void setPaddingRelative(int start, int top, int end, int bottom) {
        super.setPaddingRelative(start, top, end, bottom);
        b();
    }

    public final void setStartAngle(float f) {
        this.startAngle = f;
        invalidate();
    }

    public final void startCountTimeAnimation() {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
        valueAnimator.start();
    }

    @JvmOverloads
    public SkyCircularProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBorderPath = new Path();
        this.mSportPath = new Path();
        this.mBorderBottomPaint = new Paint(1);
        this.mBorderDrawPaint = new Paint(1);
        this.mBgPaint = new Paint();
        this.mPathMeasure = new PathMeasure();
        this.mSportPos = new float[2];
        this.mSportTan = new float[2];
        this.clockwise = true;
        c(context, attributeSet, i);
    }
}
