package com.huawei.uikit.hwseekbar.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.math.MathUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.uikit.hwunifiedinteract.widget.HwGenericEventDetector;
import defpackage.crd;
import defpackage.xeh;
import defpackage.xfs;
import defpackage.xft;
import defpackage.xfu;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class HwSeekBar extends SeekBar {
    private static final int A0 = 10;
    private static final int B0 = 10;
    private static final int C0 = 8;
    private static final float D0 = 2.0f;
    private static final int E0 = 2;
    private static final int F0 = 16;
    private static final int G0 = 600;
    private static final int H0 = 49;
    public static final int HORIZONTAL = 0;
    private static final int I0 = 10000;
    private static final int J0 = 100;
    private static final int K0 = 56;
    private static final int L0 = 60;
    private static final float M0 = 0.5f;
    private static final float N0 = 25.0f;
    private static final float O0 = 28.0f;
    private static final float P0 = 18.0f;
    private static final float Q0 = 20.0f;
    private static final int R0 = 0;
    private static final int S0 = 0;
    private static final float T0 = 0.0f;
    private static final float U0 = 0.5f;
    private static final float V0 = 90.0f;
    public static final int VERTICAL = 1;
    private static final float W0 = 1.0f;
    private static final float X0 = 1.0f;
    private static final String s0 = "HwSeekBar";
    private static final int t0 = -1;
    private static final int u0 = 5;
    private static final int v0 = 10;
    private static final int w0 = 500;
    private static final int x0 = 1;
    private static final int y0 = 2;
    private static final int z0 = 8;
    private int A;
    private int B;
    private int C;
    private int D;
    private Paint E;
    private Paint F;
    private Rect G;
    private int H;
    private float I;
    private boolean J;
    private OnSeekBarChangeListener K;
    private boolean L;
    private HwGenericEventDetector M;
    private boolean N;
    private float O;
    private float P;
    private Method Q;
    private Field R;
    private Interpolator S;
    private boolean T;
    private boolean U;
    private volatile boolean V;
    private boolean W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f29700a;
    private int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PopupWindow f29701b;
    private int b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f29702c;
    private int c0;
    private boolean d;
    private int d0;
    private boolean e;
    private int e0;
    private boolean f;
    private int f0;
    private boolean g;
    private float g0;
    private boolean h;
    private float h0;
    private Method i;
    private float i0;
    private LayerDrawable j;
    private float j0;
    private ScaleDrawable k;
    private float k0;
    private GradientDrawable l;
    private float l0;
    private float m;
    private float m0;
    private TextView n;
    private boolean n0;
    private Drawable o;
    private boolean o0;
    private int p;
    private float p0;
    private int q;
    private Runnable q0;
    private int r;
    private final Property<HwSeekBar, Float> r0;
    private int s;
    private float t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public interface OnSeekBarChangeListener {
        void onProgressChanged(HwSeekBar hwSeekBar, int i, boolean z);

        void onStartTrackingTouch(HwSeekBar hwSeekBar);

        void onStopTrackingTouch(HwSeekBar hwSeekBar);
    }

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f29703b;

        a(boolean z) {
            this.f29703b = z;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            float fFloatValue = animatedValue instanceof Float ? ((Float) animatedValue).floatValue() : 1.0f;
            if (!this.f29703b) {
                HwSeekBar.this.setScaleY(fFloatValue);
            } else {
                HwSeekBar.this.a(fFloatValue);
                HwSeekBar.this.setScaleX(fFloatValue);
            }
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (HwSeekBar.this.o0) {
                HwSeekBar.this.p0 = 0.0f;
            }
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            float fFloatValue = animatedValue instanceof Float ? ((Float) animatedValue).floatValue() : 0.0f;
            if (HwSeekBar.this.e0 == 1) {
                HwSeekBar.this.setTranslationY(fFloatValue);
            } else {
                HwSeekBar.this.setTranslationX(fFloatValue);
            }
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HwSeekBar f29705a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29706c;
        final /* synthetic */ int[] d;

        d(boolean z, int[] iArr, HwSeekBar hwSeekBar) {
            this.f29706c = z;
            this.d = iArr;
            this.f29705a = hwSeekBar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            int iIntValue = animatedValue instanceof Integer ? ((Integer) animatedValue).intValue() : 0;
            HwSeekBar hwSeekBar = HwSeekBar.this;
            if (this.f29706c) {
                iIntValue = Math.min(iIntValue, this.d[1]);
            }
            hwSeekBar.setThumbOffset(iIntValue);
            HwSeekBar hwSeekBar2 = this.f29705a;
            hwSeekBar2.a(R.id.progress, hwSeekBar2.getScale());
            HwSeekBar hwSeekBar3 = this.f29705a;
            hwSeekBar3.O = hwSeekBar3.getScale();
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HwSeekBar.this.m();
            HwSeekBar.this.removeCallbacks(this);
        }
    }

    class i implements HwGenericEventDetector.OnChangeProgressListener {
        i() {
        }

        @Override // com.huawei.uikit.hwunifiedinteract.widget.HwGenericEventDetector.OnChangeProgressListener
        public boolean onChangeProgress(int i, int i2, MotionEvent motionEvent) {
            int iA = HwSeekBar.this.a(i, i2);
            HwSeekBar.this.o();
            int iRound = HwSeekBar.this.d ? Math.round(HwSeekBar.this.t) : 1;
            HwSeekBar.this.k();
            HwSeekBar hwSeekBar = HwSeekBar.this;
            hwSeekBar.e(hwSeekBar.getProgress() + (iA * iRound));
            HwSeekBar hwSeekBar2 = HwSeekBar.this;
            hwSeekBar2.postDelayed(hwSeekBar2.q0, 500L);
            return true;
        }
    }

    public HwSeekBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getScale() {
        int max = getMax();
        if (max > 0) {
            return getProgress() / max;
        }
        return 0.0f;
    }

    private ValueAnimator getTranslationAnimator() {
        float translationY = this.e0 == 1 ? getTranslationY() : getTranslationX();
        if (Float.compare(translationY, 0.0f) == 0 || !this.o0) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    public static HwSeekBar instantiate(Context context) {
        Object objC = xft.c(context, xft.b(context, HwSeekBar.class, xft.d(context, 5, 1)), HwSeekBar.class);
        if (objC instanceof HwSeekBar) {
            return (HwSeekBar) objC;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        OnSeekBarChangeListener onSeekBarChangeListener = this.K;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(this);
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        OnSeekBarChangeListener onSeekBarChangeListener = this.K;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(this);
        }
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        Runnable runnable = this.q0;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    private void p() {
        this.n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.q = this.n.getMeasuredWidth();
        this.r = this.n.getMeasuredHeight();
    }

    private void q() {
        this.j = null;
        this.k = null;
        this.l = null;
        if (getProgressDrawable() instanceof LayerDrawable) {
            this.j = (LayerDrawable) getProgressDrawable();
        }
        LayerDrawable layerDrawable = this.j;
        if (layerDrawable != null) {
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            if (drawableFindDrawableByLayerId instanceof ScaleDrawable) {
                this.k = (ScaleDrawable) drawableFindDrawableByLayerId;
            }
        }
        ScaleDrawable scaleDrawable = this.k;
        if (scaleDrawable != null) {
            Drawable drawable = scaleDrawable.getDrawable();
            if (drawable instanceof GradientDrawable) {
                this.l = (GradientDrawable) drawable;
            }
        }
    }

    private void r() {
        p();
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float scale = isLayoutRtl() ? 1.0f - getScale() : getScale();
        int paddingLeft2 = getPaddingLeft();
        int iRound = Math.round(((width - paddingLeft) - paddingRight) * scale);
        int i2 = this.q / 2;
        int i3 = -getMeasuredHeight();
        int i4 = this.r;
        this.f29701b.update(this, (paddingLeft2 + iRound) - i2, i3 - i4, this.q, i4);
    }

    private void setOrientation(int i2) {
        if (i2 == 0 && Float.compare(getRotation(), 0.0f) != 0) {
            setRotation(0.0f);
            this.e0 = i2;
            return;
        }
        if (i2 == 1) {
            if (Float.compare(getRotation(), isLayoutRtl() ? 90.0f : -90.0f) != 0) {
                setRotation(isLayoutRtl() ? 90.0f : -90.0f);
                this.e0 = i2;
                return;
            }
        }
        Log.i(s0, "The input parameter is illegal or already valid!");
    }

    private void setValueFromPlume(Context context) {
        Method methodC = xeh.c("getBoolean", new Class[]{Context.class, View.class, String.class, Boolean.TYPE}, "huawei.android.widget.HwPlume");
        if (methodC == null) {
            return;
        }
        Object objC = xeh.c((Object) null, methodC, new Object[]{context, this, "seekBarScrollEnabled", Boolean.TRUE});
        if (objC instanceof Boolean) {
            setExtendProgressEnabled(((Boolean) objC).booleanValue());
        }
    }

    protected HwGenericEventDetector createGenericEventDetector() {
        return new HwGenericEventDetector(getContext());
    }

    protected HwGenericEventDetector.OnChangeProgressListener createOnChangeProgressListener() {
        return new i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setAlpha(isEnabled() ? 255 : 76);
        }
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.setState(getDrawableState());
        }
    }

    public int getActivatedHeight() {
        return this.d0;
    }

    public Drawable getFocusedThumbDrawable() {
        int i2 = this.z;
        if (i2 == 0) {
            return null;
        }
        return ContextCompat.getDrawable(this.f29700a, i2);
    }

    @Override // android.view.View
    public int getLayoutDirection() {
        if (Constants.URDU_LANG.equals(Locale.getDefault().getLanguage())) {
            return 0;
        }
        return super.getLayoutDirection();
    }

    public int getNormalHeight() {
        return this.c0;
    }

    public int getOrientation() {
        return this.e0;
    }

    public Drawable getOutLineDrawable() {
        int i2 = this.y;
        if (i2 == 0) {
            return null;
        }
        return ContextCompat.getDrawable(this.f29700a, i2);
    }

    public float getProgressAnimatorDamping() {
        return this.i0;
    }

    public float getProgressAnimatorStiffness() {
        return this.h0;
    }

    public float getScaleAnimatorDamping() {
        return this.m0;
    }

    public float getScaleAnimatorStiffness() {
        return this.l0;
    }

    public float getTouchAnimatorDamping() {
        return this.k0;
    }

    public float getTouchAnimatorStiffness() {
        return this.j0;
    }

    @Override // android.widget.ProgressBar, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (getThumb() == drawable) {
            invalidate();
        }
    }

    public boolean isAdjustCornersEnabled() {
        return this.h;
    }

    public boolean isExtendProgressEnabled() {
        return this.N;
    }

    public boolean isShowTipText() {
        return this.g;
    }

    void l() {
        this.J = true;
        OnSeekBarChangeListener onSeekBarChangeListener = this.K;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(this);
        }
        i();
    }

    void n() {
        this.J = false;
        OnSeekBarChangeListener onSeekBarChangeListener = this.K;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(this);
        }
        j();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        synchronized (this) {
            try {
                if (canvas == null) {
                    Log.w(s0, "onDraw canvas is null");
                    return;
                }
                if (!this.d) {
                    c(canvas);
                    b(canvas);
                } else if (this.e) {
                    int iSave = canvas.save();
                    a(canvas);
                    c(canvas);
                    b(canvas);
                    canvas.restoreToCount(iSave);
                    g();
                } else {
                    a(canvas);
                    c(canvas);
                    b(canvas);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (z || !this.g) {
            return;
        }
        this.f29701b.dismiss();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!this.N) {
            return super.onGenericMotionEvent(motionEvent);
        }
        HwGenericEventDetector hwGenericEventDetector = this.M;
        if (hwGenericEventDetector == null || !hwGenericEventDetector.c(motionEvent)) {
            return super.onGenericMotionEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.AbsSeekBar, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        OnSeekBarChangeListener onSeekBarChangeListener;
        this.V = false;
        int progress = getProgress();
        super.onKeyDown(i2, keyEvent);
        int progress2 = getProgress();
        if (progress != progress2 && (onSeekBarChangeListener = this.K) != null) {
            onSeekBarChangeListener.onProgressChanged(this, progress2, true);
        }
        if (isEnabled()) {
            if (i2 == 21 || i2 == 22) {
                if (progress2 > getMin() && progress2 < getMax()) {
                    d(progress2);
                    return true;
                }
            } else if (i2 == 69 || i2 == 70 || i2 == 81) {
            }
            d(progress2);
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        super.onKeyUp(i2, keyEvent);
        if (!isEnabled()) {
            return false;
        }
        if ((i2 != 21 && i2 != 22 && i2 != 69 && i2 != 70 && i2 != 81) || !this.g) {
            return false;
        }
        this.f29701b.dismiss();
        return false;
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        setOrientation(this.e0);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (motionEvent == null) {
            Log.w(s0, "onTouchEvent: motionEvent is null");
            return false;
        }
        this.V = true;
        int action = motionEvent.getAction();
        if (action == 0) {
            a(motionEvent);
        } else if (action == 1) {
            c(motionEvent);
        } else if (action == 2) {
            b(motionEvent);
        } else if (action == 3) {
            h();
        }
        return true;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z || !this.g) {
            return;
        }
        this.f29701b.dismiss();
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        OnSeekBarChangeListener onSeekBarChangeListener;
        int progress = getProgress();
        boolean zPerformAccessibilityAction = super.performAccessibilityAction(i2, bundle);
        int progress2 = getProgress();
        if (progress != progress2 && (onSeekBarChangeListener = this.K) != null) {
            onSeekBarChangeListener.onProgressChanged(this, progress2, true);
        }
        return zPerformAccessibilityAction;
    }

    public void setActivatedHeight(int i2) {
        this.d0 = i2;
    }

    public void setAdjustCornersEnabled(boolean z) {
        this.h = z;
    }

    public void setExtendProgressEnabled(boolean z) {
        this.N = z;
    }

    public void setNormalHeight(int i2) {
        this.c0 = i2;
    }

    public void setOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        this.K = onSeekBarChangeListener;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i2) {
        synchronized (this) {
            a(i2, false);
        }
    }

    public void setProgressAnimatorParams(float f2, float f3) {
        this.h0 = f2;
        this.i0 = f3;
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        q();
    }

    public void setScaleAnimatorParams(float f2, float f3) {
        this.l0 = f2;
        this.m0 = f3;
    }

    @Override // android.view.View
    public void setScaleX(float f2) {
        super.setScaleX(f2);
        if (this.h && (this.T || this.W)) {
            a(this.j);
            Drawable background = getBackground();
            if (background != null && (background instanceof LayerDrawable)) {
                a((LayerDrawable) background);
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void setScaleY(float f2) {
        super.setScaleY(f2);
        if (this.h && (this.T || this.W)) {
            a(this.j);
            Drawable background = getBackground();
            if (background != null && (background instanceof LayerDrawable)) {
                a((LayerDrawable) background);
            }
        }
        invalidate();
    }

    public void setShowTipText(boolean z) {
        this.g = z;
        if (!z || this.L) {
            return;
        }
        c();
    }

    public void setTip(boolean z, int i2, boolean z2) {
        if (i2 != 0) {
            this.d = true;
            this.e = z;
            this.s = i2;
            this.t = getMax() / this.s;
            this.u = z2 ? this.v : this.w;
            this.o = ContextCompat.getDrawable(this.f29700a, this.x);
            c();
            Paint paint = new Paint();
            this.F = paint;
            paint.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.E = paint2;
            paint2.setAntiAlias(true);
            this.E.setColor(this.D);
            this.E.setTextSize(this.C);
            f();
            this.E.setTypeface(Typeface.create(Constants.FONT, 0));
            if (this.g || !this.T || this.s == 0) {
                setProgress(getProgress());
            } else {
                setProgress(getProgress(), true);
            }
            invalidate();
        }
    }

    public void setTipText(String str) {
        if (this.u != this.v || !this.g || str == null) {
            this.f = false;
            return;
        }
        this.n.setText(str);
        r();
        this.f = true;
    }

    public void setTouchAnimatorParams(float f2, float f3) {
        this.j0 = f2;
        this.k0 = f3;
    }

    public void startScaleAnimation(float f2, float f3, float f4, boolean z) {
        this.o0 = Float.compare(f2, 1.0f) == 0 && Float.compare(f3, 1.0f) == 0;
        this.f0 = getMin();
        this.n0 = z;
        if (z && Float.compare(this.p0, 0.0f) == 0) {
            this.p0 = getScaleX();
            if (getProgress() == this.f0) {
                if (Float.compare(this.p0, 1.0f) >= 0) {
                    f4 = 1.0f;
                }
                this.g0 = f4;
            } else if (getProgress() == getMax()) {
                if (Float.compare(this.p0, 1.0f) <= 0) {
                    f4 = 1.0f;
                }
                this.g0 = f4;
            } else {
                Log.i(s0, "The progress has not reached the limit!");
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        crd crdVar = new crd(this.l0, this.m0);
        animatorSet.setDuration((long) crdVar.getModel().getEstimatedDuration());
        animatorSet.setInterpolator(crdVar);
        animatorSet.playTogether(a(new float[]{getScaleX(), f2}, true), a(new float[]{getScaleY(), f3}, false));
        ValueAnimator translationAnimator = getTranslationAnimator();
        if (translationAnimator != null) {
            animatorSet.playTogether(translationAnimator);
        }
        if (this.o0) {
            animatorSet.addListener(new b());
        }
        animatorSet.start();
    }

    public HwSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.huawei.uikit.hwseekbar.R.attr.hwSeekBarStyle);
    }

    private boolean d() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private void e() {
        if (xft.c(this.f29700a) == 1 && Float.compare(this.P, 1.75f) >= 0) {
            if (Float.compare(this.P, 2.0f) >= 0) {
                this.n.setTextSize(1, O0);
            } else {
                this.n.setTextSize(1, 25.0f);
            }
        }
    }

    private void f() {
        if (xft.c(this.f29700a) == 1 && Float.compare(this.P, 1.75f) >= 0) {
            if (Float.compare(this.P, 2.0f) >= 0) {
                this.E.setTextSize(TypedValue.applyDimension(1, 20.0f, this.f29700a.getResources().getDisplayMetrics()));
            } else {
                this.E.setTextSize(TypedValue.applyDimension(1, P0, this.f29700a.getResources().getDisplayMetrics()));
            }
        }
    }

    private void g() {
        if (xft.c(this.f29700a) == 1 && Build.VERSION.SDK_INT >= 29 && Float.compare(this.P, 1.75f) >= 0) {
            if (Float.compare(this.P, 2.0f) >= 0) {
                setMinHeight(b(60));
            } else {
                setMinHeight(b(56));
            }
        }
    }

    private void h() {
        if (this.W && this.c0 > 0 && this.d0 > 0) {
            b(false);
        }
        if (this.J) {
            n();
            setPressed(false);
        }
        invalidate();
    }

    private void i() {
        if (this.g) {
            this.n.setBackgroundResource(this.u);
            p();
            this.f29701b.showAsDropDown(this, 0, (-getMeasuredHeight()) - this.r, 3);
            r();
        }
    }

    private void j() {
        if (this.g) {
            this.f29701b.dismiss();
        }
    }

    public boolean isLayoutRtl() {
        return getLayoutDirection() == 1;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i2, boolean z) {
        a(i2, z, false);
    }

    public HwSeekBar(Context context, AttributeSet attributeSet, int i2) {
        super(a(context, i2), attributeSet, i2);
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = 0.0f;
        this.p = 0;
        this.G = new Rect();
        this.N = true;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.h0 = 600.0f;
        this.i0 = 49.0f;
        this.j0 = 600.0f;
        this.k0 = 49.0f;
        this.l0 = 600.0f;
        this.m0 = 49.0f;
        this.n0 = false;
        this.o0 = false;
        this.p0 = 0.0f;
        this.q0 = new f();
        this.r0 = new e(Float.class, "visual_progress");
        a(super.getContext(), attributeSet, i2);
    }

    private static int b(int i2) {
        return (int) TypedValue.applyDimension(1, i2, Resources.getSystem().getDisplayMetrics());
    }

    private void c() {
        Drawable drawable;
        TextView textView = new TextView(this.f29700a);
        this.n = textView;
        textView.setTextColor(this.B);
        this.n.setTextSize(0, this.A);
        e();
        this.n.setTypeface(Typeface.SANS_SERIF);
        int i2 = this.u;
        int i3 = this.w;
        if (i2 == i3) {
            try {
                this.u = i3;
                drawable = ContextCompat.getDrawable(this.f29700a, i3);
            } catch (Resources.NotFoundException unused) {
                Log.e(s0, "Throws NotFoundException if the mTipBgId ID does not exist.");
                drawable = null;
            }
            if (drawable != null) {
                this.n.setLayoutParams(new ViewGroup.LayoutParams(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
            } else {
                this.n.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
        } else {
            this.n.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
        this.n.setGravity(17);
        this.n.setSingleLine(true);
        PopupWindow popupWindow = new PopupWindow((View) this.n, -2, -2, false);
        this.f29701b = popupWindow;
        popupWindow.setAnimationStyle(com.huawei.uikit.hwseekbar.R.style.Animation_Emui_HwSeekBar_TipsPopupWindow);
        this.L = true;
    }

    class e extends Property<HwSeekBar, Float> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void set(HwSeekBar hwSeekBar, Float f) {
            if (hwSeekBar == null) {
                Log.w(HwSeekBar.s0, "set: object is null");
            } else {
                hwSeekBar.a(R.id.progress, f.floatValue());
                hwSeekBar.O = f.floatValue();
            }
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Float get(HwSeekBar hwSeekBar) {
            if (hwSeekBar != null) {
                return Float.valueOf(hwSeekBar.O);
            }
            Log.w(HwSeekBar.s0, "get: object is null");
            return Float.valueOf(0.0f);
        }
    }

    private void b(boolean z) {
        float scaleY;
        int i2;
        AnimatorSet animatorSet = new AnimatorSet();
        crd crdVar = new crd(this.j0, this.k0);
        animatorSet.setDuration((long) crdVar.getModel().getEstimatedDuration());
        animatorSet.setInterpolator(crdVar);
        if (z) {
            scaleY = this.c0;
            i2 = this.d0;
        } else {
            scaleY = this.d0 * getScaleY();
            i2 = this.c0;
        }
        animatorSet.playTogether(a(new float[]{getScaleX(), 1.0f}, true), a(new float[]{scaleY / i2, 1.0f}, false), a(z));
        animatorSet.start();
    }

    private static Context a(Context context, int i2) {
        return xfs.c(context, i2, com.huawei.uikit.hwseekbar.R.style.Theme_Emui_HwSeekBar);
    }

    private static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private void d(MotionEvent motionEvent) {
        setPressed(true);
        if (getThumb() != null) {
            invalidate(getThumb().getBounds());
        }
        l();
        e(motionEvent);
        a();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    private void e(MotionEvent motionEvent) {
        float f2;
        float f3;
        float f4;
        int iRound = Math.round(motionEvent.getX());
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i2 = (width - paddingLeft) - paddingRight;
        if (i2 <= 0) {
            a(0, this.V);
            return;
        }
        float f5 = 0.0f;
        if (isLayoutRtl()) {
            if (width - paddingRight < iRound) {
                f4 = 0.0f;
            } else if (iRound < paddingLeft) {
                f4 = 1.0f;
            } else {
                f2 = ((i2 - iRound) + paddingLeft) / i2;
                f3 = this.f29702c;
                float f6 = f2;
                f5 = f3;
                f4 = f6;
            }
        } else if (iRound < paddingLeft) {
            f4 = 0.0f;
        } else if (iRound > width - paddingRight) {
            f4 = 1.0f;
        } else {
            f2 = (iRound - paddingLeft) / i2;
            f3 = this.f29702c;
            float f7 = f2;
            f5 = f3;
            f4 = f7;
        }
        float max = f5 + (f4 * getMax());
        if (!this.g && ((this.T || this.W) && this.s != 0)) {
            a(Math.round(max), true, this.V);
        } else {
            a(Math.round(max), this.V);
        }
    }

    void b(Canvas canvas) {
        Drawable thumb = getThumb();
        if (thumb == null || canvas == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getPaddingLeft() - getThumbOffset(), getPaddingTop());
        float scaleX = getScaleX();
        float scaleY = getScaleY();
        if (this.h && this.T && this.k != null && Float.compare(scaleX * scaleY, 0.0f) != 0) {
            Rect bounds = this.k.getBounds();
            int i2 = bounds.left;
            int i3 = bounds.right;
            float f2 = bounds.bottom - bounds.top;
            float f3 = ((f2 * scaleY) / scaleX) / 2.0f;
            float f4 = f2 / 2.0f;
            float max = getMax() - getMin();
            float progress = Float.compare(max, 0.0f) != 0 ? getProgress() / max : 0.0f;
            float f5 = i2;
            float f6 = i3 - i2;
            float f7 = f5 + f4 + ((f6 - (f4 * 2.0f)) * progress);
            float f8 = f5 + f3 + ((f6 - (f3 * 2.0f)) * progress);
            Rect bounds2 = thumb.getBounds();
            int i4 = bounds2.right;
            int i5 = bounds2.left;
            float f9 = (i4 - i5) / 2.0f;
            float f10 = i5;
            int i6 = bounds2.bottom;
            int i7 = bounds2.top;
            float f11 = (i6 - i7) / 2.0f;
            float f12 = i7;
            if (getLayoutDirection() == 1) {
                canvas.translate(f7 - f8, 0.0f);
            } else {
                canvas.translate(f8 - f7, 0.0f);
            }
            canvas.scale(scaleY / scaleX, 1.0f, f9 + f10, f11 + f12);
        }
        if (this.W) {
            Rect bounds3 = thumb.getBounds();
            int i8 = bounds3.right;
            int i9 = bounds3.left;
            int i10 = bounds3.bottom;
            int i11 = bounds3.top;
            canvas.scale(1.0f, scaleX / scaleY, ((i8 - i9) / 2.0f) + i9, ((i10 - i11) / 2.0f) + i11);
        }
        thumb.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    private void d(int i2) {
        if (this.g) {
            this.n.setBackgroundResource(this.u);
            p();
            int measuredHeight = getMeasuredHeight();
            int i3 = this.r;
            this.n.setText(String.valueOf(i2));
            this.f29701b.showAsDropDown(this, 0, (0 - measuredHeight) - i3, 3);
            r();
        }
    }

    private void a(Context context, AttributeSet attributeSet, int i2) {
        this.f29700a = context;
        this.P = xfu.d(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar, i2, com.huawei.uikit.hwseekbar.R.style.Widget_Emui_HwSeekBar);
        this.g = typedArrayObtainStyledAttributes.getBoolean(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwShowText, false);
        this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwStepTextSize, this.C);
        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwTipTextSize, this.A);
        this.v = typedArrayObtainStyledAttributes.getResourceId(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwBubbleTipBg, 0);
        this.w = typedArrayObtainStyledAttributes.getResourceId(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwSingleTipBg, 0);
        this.x = typedArrayObtainStyledAttributes.getResourceId(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwScaleLineDrawable, 0);
        this.y = typedArrayObtainStyledAttributes.getResourceId(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwOutLineDrawable, 0);
        this.z = typedArrayObtainStyledAttributes.getResourceId(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwFocusedThumbDrawable, 0);
        this.B = typedArrayObtainStyledAttributes.getColor(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwTipTextColor, this.B);
        this.D = typedArrayObtainStyledAttributes.getColor(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwStepTextColor, this.D);
        this.T = typedArrayObtainStyledAttributes.getBoolean(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwSeekBarIsSliderMode, false);
        this.U = typedArrayObtainStyledAttributes.getBoolean(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwSeekBarIsSpacious, false);
        this.W = typedArrayObtainStyledAttributes.getBoolean(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwSeekBarIsTouchMode, false);
        this.h = typedArrayObtainStyledAttributes.getBoolean(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwIsAdjustCornersWithScale, false);
        this.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwSeekBarThumbNormalOffset, 0);
        this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwSeekBarThumbActivatedOffset, 0);
        this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwSeekBarNormalHeight, 0);
        this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwSeekBarActivatedHeight, 0);
        this.h0 = typedArrayObtainStyledAttributes.getFloat(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwProgressAnimatorStiffness, 600.0f);
        this.i0 = typedArrayObtainStyledAttributes.getFloat(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwProgressAnimatorDamping, 49.0f);
        this.j0 = typedArrayObtainStyledAttributes.getFloat(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwTouchAnimatorStiffness, 600.0f);
        this.k0 = typedArrayObtainStyledAttributes.getFloat(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwTouchAnimatorDamping, 49.0f);
        this.l0 = typedArrayObtainStyledAttributes.getFloat(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwScaleAnimatorStiffness, 600.0f);
        this.m0 = typedArrayObtainStyledAttributes.getFloat(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwScaleAnimatorDamping, 49.0f);
        this.e0 = typedArrayObtainStyledAttributes.getInt(com.huawei.uikit.hwseekbar.R.styleable.HwSeekBar_hwSeekBarOrientation, -1);
        typedArrayObtainStyledAttributes.recycle();
        setDefaultFocusHighlightEnabled(false);
        if (this.g) {
            c();
        }
        this.u = this.v;
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        HwGenericEventDetector hwGenericEventDetectorCreateGenericEventDetector = createGenericEventDetector();
        this.M = hwGenericEventDetectorCreateGenericEventDetector;
        if (hwGenericEventDetectorCreateGenericEventDetector != null) {
            hwGenericEventDetectorCreateGenericEventDetector.c(createOnChangeProgressListener());
        }
        setValueFromPlume(context);
        q();
    }

    void c(Canvas canvas) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable == null || canvas == null) {
            return;
        }
        int iSave = canvas.save();
        if (isLayoutRtl()) {
            canvas.translate(getWidth() - getPaddingRight(), getPaddingTop());
            canvas.scale(-1.0f, 1.0f);
        } else {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        progressDrawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    private void c(MotionEvent motionEvent) {
        if (this.W && this.c0 > 0 && this.d0 > 0) {
            b(false);
        }
        if (this.J) {
            e(motionEvent);
            n();
            setPressed(false);
        } else {
            l();
            e(motionEvent);
            n();
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2) {
        if ((getWidth() - getPaddingLeft()) - getPaddingRight() <= 0) {
            setProgress(0);
        } else if (!this.g && this.T && this.s != 0) {
            setProgress(i2, true);
        } else {
            setProgress(i2);
        }
    }

    private void c(int i2) {
        int min = getMin();
        int max = getMax() - min;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, this.r0, max > 0 ? (i2 - min) / max : 0.0f);
        objectAnimatorOfFloat.setAutoCancel(true);
        if (this.s != 0) {
            this.S = AnimationUtils.loadInterpolator(this.f29700a, com.huawei.uikit.hwseekbar.R.interpolator.cubic_bezier_interpolator_type_80_05);
            objectAnimatorOfFloat.setDuration(100L);
        } else {
            crd crdVar = new crd(this.h0, this.i0, 1.0f, this.m);
            this.S = crdVar;
            if (crdVar instanceof crd) {
                this.m = crdVar.getModel().getVelocity();
                objectAnimatorOfFloat.setDuration((long) ((crd) this.S).getModel().getEstimatedDuration());
            }
        }
        objectAnimatorOfFloat.setInterpolator(this.S);
        objectAnimatorOfFloat.start();
        if (this.s == 0) {
            objectAnimatorOfFloat.setCurrentPlayTime(16L);
        }
    }

    private void b(MotionEvent motionEvent) {
        if (this.J) {
            e(motionEvent);
        } else if (Math.abs(motionEvent.getX() - this.I) > this.H) {
            d(motionEvent);
        }
    }

    private ValueAnimator a(boolean z) {
        if (getThumb() == null && (this.b0 <= 0 || this.a0 <= 0)) {
            return null;
        }
        int[] iArr = {getThumbOffset(), z ? this.b0 : this.a0};
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
        valueAnimatorOfInt.addUpdateListener(new d(z, iArr, this));
        return valueAnimatorOfInt;
    }

    private void a(MotionEvent motionEvent) {
        if (this.W && this.c0 > 0 && this.d0 > 0) {
            b(true);
        }
        if (d()) {
            this.I = motionEvent.getX();
        } else {
            d(motionEvent);
        }
    }

    private void a() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private void b() {
        this.Q = null;
        this.R = null;
    }

    private void a(LayerDrawable layerDrawable) {
        if (layerDrawable == null) {
            return;
        }
        for (int i2 = 0; i2 < layerDrawable.getNumberOfLayers(); i2++) {
            Drawable drawable = layerDrawable.getDrawable(i2);
            if (drawable instanceof GradientDrawable) {
                a((GradientDrawable) drawable);
            } else if (drawable instanceof ScaleDrawable) {
                a((ScaleDrawable) drawable);
            } else if (drawable instanceof LayerDrawable) {
                a((LayerDrawable) drawable);
            } else if (drawable instanceof StateListDrawable) {
                a((StateListDrawable) drawable);
            } else {
                Log.i(s0, "preProcessDrawableRadius: not belongs to GradientDrawable and ScaleDrawable and LayerDrawable and StateListDrawable");
            }
        }
    }

    private int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        this.E.getTextBounds(str, 0, str.length(), this.G);
        return this.G.width();
    }

    private void b(float f2) {
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        Drawable thumb = getThumb();
        if (thumb == null) {
            return;
        }
        int intrinsicWidth = thumb.getIntrinsicWidth();
        int thumbOffset = (((width - paddingLeft) - paddingRight) - intrinsicWidth) + (getThumbOffset() * 2);
        int i2 = (int) ((f2 * thumbOffset) + 0.5f);
        Rect bounds = thumb.getBounds();
        int i3 = bounds.top;
        int i4 = bounds.bottom;
        if (isLayoutRtl()) {
            i2 = thumbOffset - i2;
        }
        thumb.setBounds(i2, i3, intrinsicWidth + i2, i4);
    }

    private void a(StateListDrawable stateListDrawable) {
        Drawable current = stateListDrawable.getCurrent();
        if (current instanceof ScaleDrawable) {
            a((ScaleDrawable) current);
            return;
        }
        if (current instanceof InsetDrawable) {
            Drawable drawable = ((InsetDrawable) current).getDrawable();
            if (drawable instanceof GradientDrawable) {
                a((GradientDrawable) drawable);
                return;
            }
            return;
        }
        if (current instanceof ClipDrawable) {
            Drawable drawable2 = ((ClipDrawable) current).getDrawable();
            if (drawable2 instanceof InsetDrawable) {
                Drawable drawable3 = ((InsetDrawable) drawable2).getDrawable();
                if (drawable3 instanceof GradientDrawable) {
                    a((GradientDrawable) drawable3);
                    return;
                }
                return;
            }
            return;
        }
        Log.i(s0, "preProcessDrawableRadius: not belongs to ScaleDrawable and InsetDrawable and ClipDrawable");
    }

    private void a(ScaleDrawable scaleDrawable) {
        Drawable drawable = scaleDrawable.getDrawable();
        if (drawable instanceof GradientDrawable) {
            a((GradientDrawable) drawable);
            return;
        }
        if (drawable instanceof LayerDrawable) {
            a((LayerDrawable) drawable);
            return;
        }
        if (drawable instanceof InsetDrawable) {
            Drawable drawable2 = ((InsetDrawable) drawable).getDrawable();
            if (drawable2 instanceof GradientDrawable) {
                a((GradientDrawable) drawable2);
                return;
            } else {
                Log.i(s0, "preProcessDrawableRadius: Not GradientDrawable");
                return;
            }
        }
        Log.i(s0, "preProcessDrawableRadius: not belongs to GradientDrawable and LayerDrawable and InsetDrawable");
    }

    private void a(GradientDrawable gradientDrawable) {
        if (gradientDrawable == null) {
            return;
        }
        float scaleX = getScaleX();
        float scaleY = getScaleY();
        if (Float.compare(scaleX, 0.0f) == 0 || Float.compare(scaleY, 0.0f) == 0) {
            return;
        }
        gradientDrawable.mutate();
        float cornerRadius = gradientDrawable.getCornerRadius();
        float[] cornerRadii = new float[8];
        if (Float.compare(cornerRadius, 0.0f) == 0) {
            try {
                cornerRadii = gradientDrawable.getCornerRadii();
                if (cornerRadii == null) {
                    return;
                }
            } catch (NullPointerException unused) {
                Log.w(s0, "processDrawableRadius: corner radius is not set");
                return;
            }
        } else {
            Arrays.fill(cornerRadii, cornerRadius);
        }
        for (int i2 = 0; i2 < cornerRadii.length - 1; i2++) {
            if (i2 % 2 == 0) {
                cornerRadii[i2] = (cornerRadii[i2 + 1] * scaleY) / scaleX;
            }
        }
        float f2 = gradientDrawable.getBounds().bottom - gradientDrawable.getBounds().top;
        if (gradientDrawable.equals(this.l)) {
            int i3 = (int) ((f2 * scaleY) / scaleX);
            gradientDrawable.setSize(i3, i3);
            ScaleDrawable scaleDrawable = this.k;
            a(scaleDrawable, scaleDrawable.getBounds());
        }
        gradientDrawable.setCornerRadii(cornerRadii);
    }

    private void a(Object obj, Rect rect) {
        if (this.i == null) {
            this.i = xeh.c("onBoundsChange", new Class[]{Rect.class}, "android.graphics.drawable.ScaleDrawable");
        }
        Method method = this.i;
        if (method == null) {
            return;
        }
        xeh.c(obj, method, new Object[]{rect});
    }

    private void a(int i2, boolean z) {
        OnSeekBarChangeListener onSeekBarChangeListener;
        this.V = z;
        if (this.d && Float.compare(this.t, 0.0f) != 0) {
            float f2 = this.t;
            i2 = Math.round(f2 * Math.round(i2 / f2));
        }
        float max = getMax() - getMin();
        if (Float.compare(max, 0.0f) == 0) {
            this.O = 0.0f;
        } else {
            this.O = i2 / max;
        }
        boolean z2 = this.p != i2;
        this.p = i2;
        super.setProgress(i2);
        int progress = getProgress();
        this.p = progress;
        if (z2 && (onSeekBarChangeListener = this.K) != null) {
            onSeekBarChangeListener.onProgressChanged(this, progress, this.V);
        }
        if (this.g) {
            if (!this.f) {
                this.n.setText(String.valueOf(this.p));
            }
            r();
        }
    }

    private void a(int i2, boolean z, boolean z2) {
        this.V = z2;
        int iA = a(i2);
        boolean z3 = this.p != iA;
        this.p = iA;
        if (z3 && !this.g && (this.T || this.W)) {
            if (z) {
                super.setProgress(iA, true);
                c(iA);
            }
            OnSeekBarChangeListener onSeekBarChangeListener = this.K;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(this, this.p, this.V);
                return;
            }
            return;
        }
        setProgress(iA);
    }

    private void a(int i2, int i3, boolean z) {
        OnSeekBarChangeListener onSeekBarChangeListener;
        if (isIndeterminate()) {
            return;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 > getMax()) {
            i3 = getMax();
        }
        if (i3 != getProgress()) {
            if (this.R == null && this.Q == null) {
                b();
            }
            Field field = this.R;
            if (field != null) {
                try {
                    field.set(this, Integer.valueOf(i3));
                } catch (IllegalAccessException unused) {
                    Log.e(s0, "Field IllegalAccessException");
                }
            }
            Method method = this.Q;
            if (method != null) {
                xeh.c(this, method, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Boolean.FALSE});
            }
            if (z && (onSeekBarChangeListener = this.K) != null) {
                onSeekBarChangeListener.onProgressChanged(this, this.p, this.V);
            }
            if (z && this.g) {
                if (!this.f) {
                    this.n.setText(String.valueOf(this.p));
                }
                r();
            }
        }
    }

    private ValueAnimator a(float[] fArr, boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.addUpdateListener(new a(z));
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f2) {
        if (this.n0) {
            float width = (getWidth() - getPaddingStart()) - getPaddingEnd();
            float f3 = ((this.g0 * width) - (width * f2)) * 0.5f;
            if (getProgress() == this.f0) {
                if (this.e0 == 1) {
                    setTranslationY(-f3);
                    return;
                } else {
                    setTranslationX(f3);
                    return;
                }
            }
            if (getProgress() == getMax()) {
                if (this.e0 == 1) {
                    setTranslationY(f3);
                    return;
                } else {
                    setTranslationX(-f3);
                    return;
                }
            }
            Log.i(s0, "The progress has not reached the limit!");
        }
    }

    private int a(int i2) {
        int iClamp = MathUtils.clamp(i2, getMin(), getMax());
        if (!this.d) {
            return iClamp;
        }
        float f2 = this.t;
        return f2 != 0.0f ? Math.round(f2 * Math.round(iClamp / f2)) : iClamp;
    }

    private void a(Canvas canvas) {
        float paddingStart;
        int paddingLeft;
        int iB;
        Drawable drawable = this.o;
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = this.o.getIntrinsicHeight();
        int width = getWidth();
        if (getPaddingStart() > b(8)) {
            paddingStart = ((width - getPaddingStart()) - getPaddingEnd()) - intrinsicWidth;
            iB = getPaddingLeft();
            paddingLeft = intrinsicWidth / 2;
        } else {
            paddingStart = (((width - getPaddingStart()) - getPaddingEnd()) - b(10)) - b(10);
            paddingLeft = getPaddingLeft();
            iB = b(10);
        }
        int i2 = iB + paddingLeft;
        int i3 = this.s;
        int height = (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2) - (intrinsicHeight / 2);
        if (i3 <= 1) {
            return;
        }
        float f2 = paddingStart / i3;
        if (this.e) {
            a(canvas, i2, height, f2);
            return;
        }
        Bitmap bitmapA = a(this.o);
        if (bitmapA == null) {
            return;
        }
        for (int i4 = 0; i4 <= i3; i4++) {
            if (!this.U || (i4 != 0 && i4 != i3)) {
                canvas.drawBitmap(bitmapA, (i2 + (i4 * f2)) - (intrinsicWidth / 2), height, this.F);
            }
        }
    }

    private void a(Canvas canvas, int i2, int i3, float f2) {
        int iRound;
        int i4 = this.s;
        int intrinsicHeight = this.o.getIntrinsicHeight();
        for (int i5 = 0; i5 <= i4; i5++) {
            if (isLayoutRtl()) {
                iRound = Math.round(this.t * (i4 - i5));
            } else {
                iRound = Math.round(this.t * i5);
            }
            int iA = a(String.valueOf(iRound));
            canvas.drawText(String.valueOf(iRound), (i2 + (i5 * f2)) - (b(String.valueOf(iRound)) / 2), i3 + intrinsicHeight + b(10) + iA, this.E);
        }
    }

    private int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        this.E.getTextBounds(str, 0, str.length(), this.G);
        return this.G.height();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i2, int i3) {
        if (Float.compare(i2, 0.0f) == 0) {
            return i3;
        }
        return isLayoutRtl() ? -i2 : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, float f2) {
        this.O = f2;
        Drawable progressDrawable = getProgressDrawable();
        if ((progressDrawable instanceof LayerDrawable) && (progressDrawable = ((LayerDrawable) progressDrawable).findDrawableByLayerId(i2)) == null) {
            progressDrawable = getProgressDrawable();
        }
        if (progressDrawable != null) {
            progressDrawable.setLevel((int) (10000.0f * f2));
        } else {
            invalidate();
        }
        b(f2);
        invalidate();
    }
}
