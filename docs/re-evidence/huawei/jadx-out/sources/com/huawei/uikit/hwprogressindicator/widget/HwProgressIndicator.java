package com.huawei.uikit.hwprogressindicator.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import androidx.media3.ui.DefaultTimeBar;
import com.huawei.uikit.hwprogressindicator.R;
import com.huawei.uikit.hwprogressindicator.graphics.drawable.HwLoadingDrawable;
import defpackage.xfc;
import defpackage.xfs;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class HwProgressIndicator extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final DecelerateInterpolator f29541a = new DecelerateInterpolator(0.8f);
    private Paint aa;
    private int ab;
    private boolean ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private ArgbEvaluator ah;
    private int ai;
    private int aj;
    private Paint ak;
    private boolean al;
    private float am;
    private Paint an;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29543c;
    private xfc d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;
    private HwLoadingDrawable j;
    private OnSmoothProgressDurationListener k;
    private boolean l;
    private long m;
    private float n;
    private ObjectAnimator o;
    private final Property<HwProgressIndicator, Float> p;
    private float q;
    private RectF r;
    private RectF s;
    private int t;
    private int u;
    private int v;
    private float[] w;
    private int x;
    private int[] y;
    private int z;

    public interface OnSmoothProgressDurationListener {
        long getAnimationDuration(float f);
    }

    class a implements HwLoadingDrawable.OnLoadingListener {
        a() {
        }

        @Override // com.huawei.uikit.hwprogressindicator.graphics.drawable.HwLoadingDrawable.OnLoadingListener
        public void onLoadingFinish() {
            HwProgressIndicator.this.f = true;
            if (HwProgressIndicator.this.d != null && HwProgressIndicator.this.e()) {
                HwProgressIndicator.this.d.a();
            }
            HwProgressIndicator.this.b();
        }

        @Override // com.huawei.uikit.hwprogressindicator.graphics.drawable.HwLoadingDrawable.OnLoadingListener
        public void onLoadingStart() {
            HwProgressIndicator.this.f = false;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HwProgressIndicator.this.o();
        }
    }

    public HwProgressIndicator(Context context) {
        this(context, null);
    }

    private void c(Resources resources) {
        int iA = a(resources);
        if (iA == 0) {
            return;
        }
        int iD = (int) ((this.z * d(resources)) / iA);
        setPadding(iD, iD, iD, iD);
    }

    private void g() {
        t();
        s();
    }

    private void g(Resources resources) {
        c(resources);
        int height = getHeight();
        int width = getWidth();
        int iMin = Math.min((height - getPaddingBottom()) - getPaddingTop(), (width - getPaddingLeft()) - getPaddingRight());
        int i = (width - iMin) / 2;
        int i2 = (height - iMin) / 2;
        this.r.set(i, i2, i + iMin, i2 + iMin);
        this.aa.setStrokeWidth(this.z);
        this.ak.setStrokeWidth(this.z);
        float f = this.z / 2.0f;
        HwLoadingDrawable hwLoadingDrawable = this.j;
        if (hwLoadingDrawable != null) {
            hwLoadingDrawable.b(f);
        }
        xfc xfcVar = this.d;
        if (xfcVar != null) {
            xfcVar.a(this.z);
        }
        if (this.x != 0) {
            return;
        }
        h(resources);
        j();
    }

    private void h() {
        xfc xfcVar = this.d;
        if (xfcVar == null || !xfcVar.e()) {
            return;
        }
        this.d.setLevel((int) (this.n * 10000.0f));
    }

    private void h(Resources resources) {
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_large_bar_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_large_blur_width);
        int i = this.z;
        if ((i != dimensionPixelSize || this.ai != dimensionPixelSize2) && dimensionPixelSize != 0) {
            float f = dimensionPixelSize;
            this.ai = (int) ((i * dimensionPixelSize2) / f);
            this.ag = (int) ((this.z * resources.getDimensionPixelSize(R.dimen.hwprogressindicator_large_blur_radius)) / f);
            this.af = (int) ((this.z * resources.getDimensionPixelSize(R.dimen.hwprogressindicator_blur_offset_x)) / f);
            this.ae = (int) ((this.z * resources.getDimensionPixelSize(R.dimen.hwprogressindicator_blur_offset_y)) / f);
            return;
        }
        if (this.ai == -1) {
            this.ai = dimensionPixelSize2;
        }
        if (this.ag <= 0) {
            this.ag = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_large_blur_radius);
        }
        if (this.af == -1) {
            this.af = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_blur_offset_x);
        }
        if (this.ae == -1) {
            this.ae = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_blur_offset_y);
        }
    }

    private void k() {
        m();
        l();
    }

    private void l() {
        xfc xfcVar = this.d;
        if (xfcVar == null || !xfcVar.e()) {
            return;
        }
        this.d.i();
    }

    private void m() {
        HwLoadingDrawable hwLoadingDrawable = this.j;
        if (hwLoadingDrawable == null || !hwLoadingDrawable.a()) {
            return;
        }
        this.j.c();
    }

    private void n() {
        if (this.d == null) {
            return;
        }
        if (e()) {
            this.d.d();
        } else {
            this.d.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.l) {
            this.e = false;
            n();
            this.l = false;
        }
    }

    private void p() {
        this.q = this.n * 360.0f;
    }

    private void q() {
        int iA = a(this.q, 135.0f);
        int iA2 = a(this.q, 225.0f);
        int[] iArr = this.y;
        if (iArr == null) {
            int i = this.ab;
            this.y = new int[]{iA, iA2, i, i};
        } else {
            iArr[0] = iA;
            iArr[1] = iA2;
        }
        float f = ((this.q - 225.0f) / 360.0f) + 0.25f;
        float[] fArr = this.w;
        if (fArr == null) {
            this.w = new float[]{0.0f, 0.25f, f, 1.0f};
        } else {
            fArr[2] = f;
        }
    }

    private void r() {
        if (this.t == 0) {
            ObjectAnimator objectAnimator = this.o;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                this.o.cancel();
            }
            this.n = 0.0f;
        }
    }

    private void s() {
        xfc xfcVar = this.d;
        if (xfcVar == null) {
            return;
        }
        if (this.t == 0) {
            xfcVar.i();
        } else if (this.f && e()) {
            this.d.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisualProgress(float f) {
        this.n = f;
        p();
        invalidate();
    }

    private void t() {
        HwLoadingDrawable hwLoadingDrawable;
        if (this.t != 0) {
            m();
        } else {
            if (!d() || (hwLoadingDrawable = this.j) == null) {
                return;
            }
            hwLoadingDrawable.b();
        }
    }

    public boolean a() {
        return this.g;
    }

    public boolean d() {
        return this.f29543c;
    }

    public boolean e() {
        return this.e;
    }

    public int getBackGroundColor() {
        return this.aj;
    }

    public int[] getIndicatorColors() {
        return new int[]{this.ad, this.ab};
    }

    public int getProgress() {
        return this.t;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        super.invalidateDrawable(drawable);
        if (drawable == this.d || drawable == this.j) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        f();
        i();
        c();
        canvas.rotate(-90.0f, this.r.centerX(), this.r.centerY());
        a(canvas);
        if (this.t <= 0 || !this.f) {
            d(canvas);
        } else {
            c(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent == null) {
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setContentDescription(String.format(Locale.ROOT, "%d%%", Integer.valueOf(this.t)));
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo == null) {
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = String.format(Locale.ROOT, "%d%%", Integer.valueOf(this.t));
        accessibilityNodeInfo.setHintText(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo.setContentDescription(str);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSizeAndState(this.v, i, 0), View.resolveSizeAndState(this.u, i2, 0));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int iE;
        Resources resources = getResources();
        if (resources == null || (iE = e(resources)) == 0) {
            return;
        }
        int iA = a(resources);
        if (this.ac) {
            this.z = (int) ((iA * Math.min(i, i2)) / iE);
            this.z = Math.min(this.z, (int) (resources.getDisplayMetrics().density * 32.0f));
        }
        g(resources);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            g();
        } else {
            k();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int i) {
        super.sendAccessibilityEvent(i);
    }

    public void setBackGroundColor(int i) {
        this.aj = i;
        Paint paint = this.ak;
        if (paint != null) {
            paint.setColor(i);
        }
        invalidate();
    }

    public void setBlurEnabled(boolean z) {
        if (this.x != 0) {
            Log.w("HwProgressIndicator", "setBlurEnabled: in consideration of the style, do not support to change.");
        } else {
            this.al = z;
            invalidate();
        }
    }

    public void setFlickerAnimationEnabled(boolean z) {
        ObjectAnimator objectAnimator;
        if (this.e == z) {
            return;
        }
        if (this.t == 100) {
            this.e = z;
            return;
        }
        if (this.d == null) {
            this.e = z;
            invalidate();
            return;
        }
        if (z || (objectAnimator = this.o) == null || !objectAnimator.isRunning()) {
            this.e = z;
            n();
        } else {
            this.l = true;
        }
        invalidate();
    }

    public void setIndicatorColors(int[] iArr) {
        if (iArr == null || iArr.length != 2) {
            Log.e("HwProgressIndicator", "setIndicatorColors: input parameters is wrong.");
            return;
        }
        this.ad = iArr[0];
        int i = iArr[1];
        this.ab = i;
        int[] iArr2 = this.y;
        if (iArr2 != null && iArr2.length > 3) {
            iArr2[2] = i;
            iArr2[3] = i;
        }
        invalidate();
    }

    public void setProgress(int i) {
        if (this.t == i) {
            return;
        }
        this.t = Math.max(0, Math.min(100, i));
        t();
        s();
        r();
        if (this.f) {
            b();
        }
        if (!a()) {
            this.n = this.t / 100.0f;
        }
        p();
        this.m = this.t == 100 ? 0L : System.currentTimeMillis();
        invalidate();
    }

    public void setSmoothProgressDurationListener(OnSmoothProgressDurationListener onSmoothProgressDurationListener) {
        this.k = onSmoothProgressDurationListener;
    }

    public void setSmoothProgressEnabled(boolean z) {
        if (this.g == z) {
            return;
        }
        if (!z) {
            this.n = this.t / 100.0f;
            p();
        }
        this.g = z;
        xfc xfcVar = this.d;
        if (xfcVar != null) {
            xfcVar.d(z);
        }
    }

    public void setWaitingAnimationEnabled(boolean z) {
        if (this.f29543c == z) {
            return;
        }
        HwLoadingDrawable hwLoadingDrawable = this.j;
        if (hwLoadingDrawable == null) {
            this.f29543c = z;
            if (this.t <= 0) {
                invalidate();
                return;
            }
            return;
        }
        if (!z) {
            hwLoadingDrawable.c();
        } else if (this.t <= 0) {
            hwLoadingDrawable.b();
        }
        this.f29543c = z;
        invalidate();
    }

    class d extends Property<HwProgressIndicator, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(HwProgressIndicator hwProgressIndicator, Float f) {
            if (hwProgressIndicator == null) {
                return;
            }
            hwProgressIndicator.setVisualProgress(f.floatValue());
            hwProgressIndicator.n = f.floatValue();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float get(HwProgressIndicator hwProgressIndicator) {
            return Float.valueOf(hwProgressIndicator.n);
        }
    }

    public HwProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwProgressIndicatorStyle);
    }

    private void b(Resources resources) {
        int i = this.x;
        if (i == 0) {
            this.u = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_large_height);
            this.v = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_large_width);
        } else if (i == 1) {
            this.u = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_middle_height);
            this.v = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_middle_width);
        } else {
            this.u = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_small_height);
            this.v = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_small_width);
        }
    }

    private int e(Resources resources) {
        int i = this.x;
        if (i != 1) {
            return i != 2 ? resources.getDimensionPixelSize(R.dimen.hwprogressindicator_large_width) : resources.getDimensionPixelSize(R.dimen.hwprogressindicator_small_width);
        }
        return resources.getDimensionPixelSize(R.dimen.hwprogressindicator_middle_width);
    }

    public HwProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(a(context, i), attributeSet, i);
        this.t = 0;
        this.r = new RectF();
        this.s = new RectF();
        this.x = 0;
        this.v = -1;
        this.u = -1;
        this.aa = new Paint();
        this.ah = null;
        this.al = false;
        this.ak = new Paint();
        this.d = null;
        this.f = true;
        this.j = null;
        this.n = 0.0f;
        this.l = false;
        this.m = 0L;
        this.p = new d(Float.class, "visual_progress");
        a(getContext(), attributeSet, i);
    }

    private int d(Resources resources) {
        int i = this.x;
        if (i == 1) {
            return resources.getDimensionPixelSize(R.dimen.hwprogressindicator_middle_padding);
        }
        if (i != 2) {
            return resources.getDimensionPixelSize(R.dimen.hwprogressindicator_large_padding);
        }
        return resources.getDimensionPixelSize(R.dimen.hwprogressindicator_small_padding);
    }

    private static Context a(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwProgressIndicator);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        Resources resources = getResources();
        if (resources == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwProgressIndicator, i, R.style.Widget_Emui_HwProgressIndicator);
        this.x = typedArrayObtainStyledAttributes.getInt(R.styleable.HwProgressIndicator_hwSizeMode, 0);
        b(resources);
        b(typedArrayObtainStyledAttributes, resources);
        e(typedArrayObtainStyledAttributes, resources);
        a(typedArrayObtainStyledAttributes);
        c(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private void j() {
        this.an.setMaskFilter(null);
        if (this.ag <= 0) {
            return;
        }
        try {
            this.an.setMaskFilter(new BlurMaskFilter(this.ag, BlurMaskFilter.Blur.NORMAL));
            this.an.setStrokeWidth(this.ai);
        } catch (IllegalArgumentException unused) {
            Log.w("HwProgressIndicator", "IllegalArgumentException");
        }
    }

    private void i() {
        if (d() && this.j == null) {
            HwLoadingDrawable hwLoadingDrawable = new HwLoadingDrawable(this.r, this.h, this.i, this.z / 2.0f);
            this.j = hwLoadingDrawable;
            hwLoadingDrawable.setCallback(this);
            this.j.b(new a());
            if (this.t <= 0) {
                this.j.b();
            }
        }
    }

    private void a(Canvas canvas) {
        if (!this.f) {
            canvas.drawArc(this.r, 0.0f, 360.0f, false, this.ak);
            return;
        }
        RectF rectF = this.r;
        float f = this.q;
        canvas.drawArc(rectF, f, 360.0f - f, false, this.ak);
    }

    private void e(TypedArray typedArray, Resources resources) {
        if (this.x != 0) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            setLayerType(1, null);
        }
        this.al = typedArray.getBoolean(R.styleable.HwProgressIndicator_hwBlurEnable, true);
        this.ai = typedArray.getDimensionPixelSize(R.styleable.HwProgressIndicator_hwBlurWidth, -1);
        this.ag = typedArray.getDimensionPixelSize(R.styleable.HwProgressIndicator_hwBlurRadius, -1);
        this.af = typedArray.getDimensionPixelSize(R.styleable.HwProgressIndicator_hwBlurOffsetX, -1);
        this.ae = typedArray.getDimensionPixelSize(R.styleable.HwProgressIndicator_hwBlurOffsetY, -1);
        this.am = typedArray.getFloat(R.styleable.HwProgressIndicator_hwBlurAlpha, R.dimen.hwprogressindicator_blur_alpha);
        h(resources);
        Paint paint = new Paint();
        this.an = paint;
        paint.setAntiAlias(true);
        this.an.setMaskFilter(new BlurMaskFilter(this.ag, BlurMaskFilter.Blur.NORMAL));
        this.an.setStrokeWidth(this.ai);
        this.an.setStrokeCap(Paint.Cap.ROUND);
        this.an.setStyle(Paint.Style.STROKE);
        this.an.setAlpha((int) (this.am * 255.0f));
    }

    private void d(Canvas canvas) {
        HwLoadingDrawable hwLoadingDrawable = this.j;
        if (hwLoadingDrawable == null || this.f) {
            return;
        }
        hwLoadingDrawable.draw(canvas);
    }

    private void f() {
        int iA;
        float f;
        if (this.t <= 0) {
            return;
        }
        if (Float.compare(this.q, 225.0f) <= 0) {
            iA = this.ab;
            f = this.q / 360.0f;
        } else {
            iA = a(this.q, 225.0f);
            f = 0.625f;
        }
        int iA2 = this.ad;
        if (Float.compare(this.q, 90.0f) < 0) {
            iA2 = a(90.0f, 90.0f - this.q);
        }
        int[] iArr = {iA2, iA, iA2};
        float[] fArr = {0.0f, f, 1.0f};
        this.aa.setShader(new SweepGradient(this.r.centerX(), this.r.centerY(), iArr, fArr));
        if (this.al) {
            this.s.set(this.r);
            this.s.offset(-this.ae, this.af);
            this.an.setShader(new SweepGradient(this.s.centerX(), this.s.centerY(), iArr, fArr));
        }
    }

    private int a(Resources resources) {
        int i = this.x;
        if (i == 1) {
            return resources.getDimensionPixelSize(R.dimen.hwprogressindicator_middle_bar_width);
        }
        if (i != 2) {
            return resources.getDimensionPixelSize(R.dimen.hwprogressindicator_large_bar_width);
        }
        return resources.getDimensionPixelSize(R.dimen.hwprogressindicator_small_bar_width);
    }

    private void b(Canvas canvas) {
        h();
        xfc xfcVar = this.d;
        if (xfcVar != null) {
            xfcVar.draw(canvas);
        }
    }

    private void a(TypedArray typedArray) {
        this.aj = typedArray.getColor(R.styleable.HwProgressIndicator_hwBgColor, 134217728);
        this.ak.setAntiAlias(true);
        this.ak.setStyle(Paint.Style.STROKE);
        this.ak.setStrokeWidth(this.z);
        this.ak.setStrokeCap(Paint.Cap.ROUND);
        this.ak.setColor(this.aj);
    }

    private void b(TypedArray typedArray, Resources resources) {
        this.z = typedArray.getDimensionPixelSize(R.styleable.HwProgressIndicator_hwBarWidth, -1);
        this.ad = typedArray.getColor(R.styleable.HwProgressIndicator_hwProgressIndicatorBeginColor, -7945729);
        this.ab = typedArray.getColor(R.styleable.HwProgressIndicator_hwProgressIndicatorEndColor, -14331913);
        this.ac = typedArray.getBoolean(R.styleable.HwProgressIndicator_hwBarAutoWidth, true);
        if (this.z == -1) {
            this.z = a(resources);
        }
        this.aa.setAntiAlias(true);
        this.aa.setStrokeWidth(this.z);
        this.aa.setStrokeCap(Paint.Cap.ROUND);
        this.aa.setStyle(Paint.Style.STROKE);
    }

    private void c() {
        if (e() && this.d == null) {
            xfc xfcVar = new xfc(this.r, this.z, this.aa);
            this.d = xfcVar;
            xfcVar.d(this.f29542b);
            this.d.d(this.g);
            this.d.setCallback(this);
            if (this.f) {
                this.d.a();
            }
        }
    }

    private void c(TypedArray typedArray) {
        this.e = typedArray.getBoolean(R.styleable.HwProgressIndicator_hwFlickerEnable, true);
        this.f29542b = typedArray.getColor(R.styleable.HwProgressIndicator_hwFlickerColor, DefaultTimeBar.DEFAULT_UNPLAYED_COLOR);
        this.f29543c = typedArray.getBoolean(R.styleable.HwProgressIndicator_hwProgressIndicatorWaitingEnable, true);
        this.h = typedArray.getColor(R.styleable.HwProgressIndicator_hwProgressIndicatorWaitingBeginColor, 8831487);
        this.i = typedArray.getColor(R.styleable.HwProgressIndicator_hwProgressIndicatorWaitingEndColor, -14331913);
        this.g = typedArray.getBoolean(R.styleable.HwProgressIndicator_hwProgressIndicatorSmoothProgressEnable, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.t == 0 || !a()) {
            return;
        }
        float f = this.t / 100.0f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, this.p, f);
        this.o = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setAutoCancel(true);
        this.o.setDuration(a(f));
        this.o.setInterpolator(f29541a);
        this.o.addListener(new b());
        this.o.start();
    }

    private long a(float f) {
        OnSmoothProgressDurationListener onSmoothProgressDurationListener = this.k;
        if (onSmoothProgressDurationListener != null) {
            return onSmoothProgressDurationListener.getAnimationDuration(f);
        }
        long jAbs = Float.compare(f, this.n) != 0 ? (long) (Math.abs(f - this.n) * 2000.0f) : 0L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.t == 100) {
            return Math.min(500L, jAbs);
        }
        long j = this.m;
        return j != 0 ? Math.min(5000L, Math.max(jAbs, jCurrentTimeMillis - j)) : jAbs;
    }

    private void c(Canvas canvas) {
        if (Float.compare(this.q, 225.0f) <= 0) {
            if (this.al) {
                canvas.drawArc(this.s, 0.0f, this.q, false, this.an);
            }
            canvas.drawArc(this.r, 0.0f, this.q, false, this.aa);
            b(canvas);
            return;
        }
        q();
        if (this.al) {
            c(this.s, this.an, canvas, false);
        }
        c(this.r, this.aa, canvas, true);
    }

    private void c(RectF rectF, Paint paint, Canvas canvas, boolean z) {
        canvas.drawArc(rectF, 0.0f, 225.0f, false, paint);
        xfc xfcVar = this.d;
        float fB = xfcVar != null ? xfcVar.b() : 0.0f;
        if (z && Float.compare(fB, 90.0f) < 0) {
            b(canvas);
        }
        canvas.save();
        canvas.rotate(-225.0f, rectF.centerX(), rectF.centerY());
        paint.setShader(new SweepGradient(rectF.centerX(), rectF.centerY(), this.y, this.w));
        canvas.drawArc(rectF, 90.0f, this.q - 225.0f, false, paint);
        canvas.restore();
        if (!z || Float.compare(fB, 90.0f) < 0) {
            return;
        }
        b(canvas);
    }

    private int a(float f, float f2) {
        if (this.ah == null) {
            this.ah = new ArgbEvaluator();
        }
        if (Float.compare(f, 0.0f) == 0) {
            return this.ad;
        }
        return ((Integer) this.ah.evaluate(f2 / f, Integer.valueOf(this.ad), Integer.valueOf(this.ab))).intValue();
    }
}
