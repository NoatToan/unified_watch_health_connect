package com.huawei.uikit.hwprogressbar.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import com.huawei.uikit.animations.drawable.HwGravitationalLoadingDrawable;
import com.huawei.uikit.hwcommon.anim.HwCubicBezierInterpolator;
import com.huawei.uikit.hwprogressbar.R;
import defpackage.xcx;
import defpackage.xdb;
import defpackage.xeh;
import defpackage.xey;
import defpackage.xez;
import defpackage.xfb;
import defpackage.xfs;
import defpackage.xft;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class HwProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f29516a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f29517c = b();
    private static final DecelerateInterpolator e = new DecelerateInterpolator(0.8f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29518b;
    protected int d;
    private int f;
    private int g;
    private int h;
    private int i;
    private xfb j;
    private ObjectAnimator k;
    private boolean l;
    private float m;
    private Method n;
    private xez o;
    private long p;
    private HwGravitationalLoadingDrawable.a q;
    private Field r;
    private int s;
    private OnVisualProgressChangedListener t;
    private OnSetProgressAnimationDurationListener u;
    private final Property<HwProgressBar, Float> v;

    public interface OnSetProgressAnimationDurationListener {
        long getAnimationDuration(float f);
    }

    public interface OnVisualProgressChangedListener {
        void onVisualProgressChanged(HwProgressBar hwProgressBar, float f);
    }

    public HwProgressBar(Context context) {
        this(context, null);
    }

    protected static int b() {
        if (f29516a == null) {
            f29516a = xeh.c("getInt", new Class[]{String.class, Integer.TYPE}, "android.os.SystemProperties");
        }
        Method method = f29516a;
        if (method == null) {
            return 200;
        }
        Object objC = xeh.c((Object) null, method, new Object[]{"hw_sc.platform.ux_level", 200});
        if (objC instanceof Integer) {
            return ((Integer) objC).intValue();
        }
        return 200;
    }

    private void b(Context context, AttributeSet attributeSet, int i) {
        int i2 = R.style.Widget_Emui_HwProgressBar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwGravitationalLoadingAnimation, i, i2);
        this.s = typedArrayObtainStyledAttributes.getInteger(R.styleable.HwGravitationalLoadingAnimation_hwProgressBarDuration, 1200);
        this.q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwGravitationalLoadingAnimation_hwProgressBarGlowingEnabled, false) ? HwGravitationalLoadingDrawable.a.a(context, attributeSet, i, i2) : HwGravitationalLoadingDrawable.a.d(context, attributeSet, i, i2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static HwProgressBar c(Context context) {
        Object objC = xft.c(context, xft.b(context, HwProgressBar.class, xft.d(context, 15, 1)), HwProgressBar.class);
        if (objC instanceof HwProgressBar) {
            return (HwProgressBar) objC;
        }
        return null;
    }

    private void e(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwLowFrameLoadingDrawable, i, R.style.Widget_Emui_HwProgressBar);
        int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.HwLowFrameLoadingDrawable_hwLowFrameLoadingDuration, 600);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(R.styleable.HwLowFrameLoadingDrawable_hwDrawableBitmapSize, 50);
        typedArrayObtainStyledAttributes.recycle();
        setIndeterminateDrawable(new xcx(getResources(), integer2, integer));
    }

    private boolean f() {
        return getLayoutDirection() == 1;
    }

    private int getBuildSdkVersion() {
        return Build.VERSION.SDK_INT;
    }

    private Drawable getProgressLayerDrawable() {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable == null || !(progressDrawable instanceof LayerDrawable)) {
            return null;
        }
        return ((LayerDrawable) progressDrawable).findDrawableByLayerId(android.R.id.progress);
    }

    private int getVisualProgress() {
        Drawable progressLayerDrawable = getProgressLayerDrawable();
        if (progressLayerDrawable != null) {
            return progressLayerDrawable.getLevel();
        }
        return 0;
    }

    private void h() {
        int min = getBuildSdkVersion() >= 26 ? getMin() : 0;
        int max = getMax() - min;
        float progress = max > 0 ? (getProgress() - min) / max : 0.0f;
        float fFloatValue = this.v.get(this).floatValue();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, this.v, Float.compare(fFloatValue, 1.0f) != 0 ? fFloatValue : 0.0f, progress);
        this.k = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setAutoCancel(true);
        this.k.setDuration(b(progress));
        this.k.setInterpolator(e);
        this.k.start();
    }

    private void i() {
        Drawable progressLayerDrawable;
        if (this.o == null || (progressLayerDrawable = getProgressLayerDrawable()) == null) {
            return;
        }
        Rect bounds = progressLayerDrawable.getBounds();
        int iB = b(progressLayerDrawable);
        int i = ((bounds.top + bounds.bottom) - iB) / 2;
        this.o.setBounds(bounds.left, i, bounds.right, iB + i);
    }

    private void l() {
        xez xezVar;
        if (c() && (xezVar = this.o) != null) {
            xezVar.d();
        }
    }

    private void m() {
        xez xezVar;
        if (c() && (xezVar = this.o) != null) {
            xezVar.a();
            setFlickerLevel(getVisualProgress());
        }
    }

    private void setFlickerLevel(int i) {
        xez xezVar = this.o;
        if (xezVar == null || !xezVar.e()) {
            return;
        }
        this.o.setLevel(i);
    }

    protected void c(Context context, AttributeSet attributeSet, int i) {
        synchronized (this) {
            if (d(context, attributeSet, i)) {
                e(context, attributeSet, i);
                return;
            }
            b(context, attributeSet, i);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwProgressBar, i, R.style.Widget_Emui_HwProgressBar);
            try {
                try {
                    this.f29518b = typedArrayObtainStyledAttributes.getInt(R.styleable.HwProgressBar_hwProgressBarRingType, 0);
                    this.d = typedArrayObtainStyledAttributes.getColor(R.styleable.HwProgressBar_hwFillColor, -11711155);
                    this.g = typedArrayObtainStyledAttributes.getColor(R.styleable.HwProgressBar_hwProgressBarRingTrackColor, getResources().getColor(R.color.emui_control_normal_dark));
                    this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwProgressBar_hwProgressBarRingWidth, 0);
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwProgressBar_hwProgressBarTickWidth, 0);
                    this.h = typedArrayObtainStyledAttributes.getColor(R.styleable.HwProgressBar_hwFlickerColor, 1728053247);
                    this.l = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwProgressBar_hwFlickerEnable, false);
                    e();
                    j();
                    d();
                    if (this.r == null && this.n == null) {
                        g();
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Resources.NotFoundException unused) {
                    Log.e("HwProgressBar", "Resource not found in initialize.");
                    typedArrayObtainStyledAttributes.recycle();
                }
                if (getImportantForAccessibility() == 0) {
                    setImportantForAccessibility(1);
                }
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public boolean c() {
        return this.l;
    }

    protected void e() {
        if (f29517c >= 200) {
            setIndeterminateDrawable(xdb.e(this.d, this.q, getResources().getDisplayMetrics(), this.s));
        } else {
            setIndeterminateDrawable(new xey(getResources(), getMinimumWidth() > getMinimumHeight() ? getMinimumHeight() : getMinimumWidth(), this.d));
        }
        setInterpolator(new HwCubicBezierInterpolator(0.38f, 0.1f, 0.0f, 0.93f));
    }

    @Override // android.widget.ProgressBar, android.view.View
    public CharSequence getAccessibilityClassName() {
        return !isIndeterminate() ? ProgressBar.class.getName() : "";
    }

    public int getFlickerColor() {
        return this.h;
    }

    @Override // android.widget.ProgressBar, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable == this.o) {
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDraw(Canvas canvas) {
        synchronized (this) {
            if (canvas == null) {
                return;
            }
            if (this.j != null) {
                a();
            } else {
                super.onDraw(canvas);
                a(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo != null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (isIndeterminate()) {
                return;
            }
            accessibilityNodeInfo.setFocusable(true);
            accessibilityNodeInfo.setContentDescription(String.format(Locale.ROOT, "%d%%", Integer.valueOf(getProgress())));
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i();
    }

    public void setFillColor(int i) {
        synchronized (this) {
            this.d = i;
            xfb xfbVar = this.j;
            if (xfbVar != null) {
                xfbVar.e(i);
            }
        }
    }

    public void setFlickerColor(int i) {
        this.h = i;
        xez xezVar = this.o;
        if (xezVar != null) {
            xezVar.d(i);
        }
    }

    public void setFlickerEnable(boolean z) {
        setFlickerEnable(z, false);
    }

    public void setOnSetProgressAnimationDurationListener(OnSetProgressAnimationDurationListener onSetProgressAnimationDurationListener) {
        this.u = onSetProgressAnimationDurationListener;
    }

    public void setOnVisualProgressChangedListener(OnVisualProgressChangedListener onVisualProgressChangedListener) {
        this.t = onVisualProgressChangedListener;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        synchronized (this) {
            super.setProgress(i);
            e(i, false);
        }
    }

    public void setRingTrackColor(int i) {
        synchronized (this) {
            this.g = i;
            xfb xfbVar = this.j;
            if (xfbVar != null) {
                xfbVar.d(i);
            }
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.o;
    }

    class d extends Property<HwProgressBar, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(HwProgressBar hwProgressBar, Float f) {
            if (hwProgressBar == null) {
                return;
            }
            hwProgressBar.d(android.R.id.progress, f.floatValue());
            hwProgressBar.m = f.floatValue();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Float get(HwProgressBar hwProgressBar) {
            return Float.valueOf(hwProgressBar.m);
        }
    }

    public HwProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwProgressBarStyle);
    }

    public void setFlickerEnable(boolean z, boolean z2) {
        if (this.l == z) {
            return;
        }
        this.l = z;
        xez xezVar = this.o;
        if (xezVar == null) {
            return;
        }
        if (z) {
            m();
        } else if (z2) {
            xezVar.c();
        } else {
            xezVar.d();
        }
    }

    public HwProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(d(context, i), attributeSet, i);
        this.l = false;
        this.p = 0L;
        this.v = new d(Float.class, "visual_progress");
        a(super.getContext(), attributeSet, i);
    }

    private void e(int i, boolean z) {
        int max;
        if (this.j != null) {
            a();
        }
        int min = getBuildSdkVersion() >= 26 ? getMin() : 0;
        if (i > min && i < getMax()) {
            m();
        } else {
            l();
        }
        if (z || !c() || (max = getMax() - min) == 0) {
            return;
        }
        setFlickerLevel((int) (((i - min) / max) * 10000.0f));
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i, boolean z) {
        super.setProgress(i, z);
        if (z) {
            h();
        }
        e(i, z);
    }

    private void d() {
        if (f29517c < 200) {
            return;
        }
        xez xezVar = new xez();
        this.o = xezVar;
        xezVar.d(this.h);
        this.o.setCallback(this);
        i();
        if (getProgress() <= (getBuildSdkVersion() >= 26 ? getMin() : 0) || getProgress() >= getMax() || !c()) {
            return;
        }
        this.o.setLevel(getVisualProgress());
        this.o.a();
    }

    private void j() {
        int i = this.f29518b;
        if (i == 1 || i == 2) {
            int max = getMax();
            if (max == 0) {
                Log.e("HwProgressBar", "The max is 0 in initRingDrawable.");
                return;
            }
            xfb xfbVar = new xfb();
            this.j = xfbVar;
            xfbVar.c(this.f29518b);
            this.j.e(this.d);
            this.j.d(this.g);
            this.j.a(this.i);
            this.j.b(this.f);
            this.j.b(getProgress() / max);
            setBackground(this.j);
        }
    }

    private void g() {
        this.n = null;
        this.r = null;
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        c(context, attributeSet, i);
    }

    private long b(float f) {
        OnSetProgressAnimationDurationListener onSetProgressAnimationDurationListener = this.u;
        if (onSetProgressAnimationDurationListener != null) {
            return onSetProgressAnimationDurationListener.getAnimationDuration(f);
        }
        long jAbs = Float.compare(f, this.m) != 0 ? (long) Math.abs((f - this.m) * 2000.0f) : 0L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Float.compare(f, 1.0f) == 0) {
            jAbs = Math.min(300L, jAbs);
        } else if (this.p != 0 && Float.compare(f, 0.0f) > 0) {
            jAbs = Math.min(Math.max(jAbs, jCurrentTimeMillis - this.p), 5000L);
        }
        this.p = jCurrentTimeMillis;
        return jAbs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, float f) {
        this.m = f;
        Drawable progressDrawable = getProgressDrawable();
        if ((progressDrawable instanceof LayerDrawable) && (progressDrawable = ((LayerDrawable) progressDrawable).findDrawableByLayerId(i)) == null) {
            progressDrawable = getProgressDrawable();
        }
        int i2 = (int) (10000.0f * f);
        setFlickerLevel(i2);
        if (progressDrawable != null) {
            progressDrawable.setLevel(i2);
        } else {
            invalidate();
        }
        OnVisualProgressChangedListener onVisualProgressChangedListener = this.t;
        if (onVisualProgressChangedListener != null) {
            onVisualProgressChangedListener.onVisualProgressChanged(this, f);
        }
    }

    private void a(Canvas canvas) {
        if ((c() || this.o != null) && !isIndeterminate()) {
            if (this.o == null) {
                d();
            }
            int iSave = canvas.save();
            if (f()) {
                canvas.translate(getWidth() - getPaddingRight(), getPaddingTop());
                canvas.scale(-1.0f, 1.0f);
            } else {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            xez xezVar = this.o;
            if (xezVar != null) {
                xezVar.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        }
    }

    private static Context d(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwProgressBar);
    }

    private boolean d(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwProgressBar, i, R.style.Widget_Emui_HwProgressBar);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwProgressBar_hwLowFrameLoading, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    private void a() {
        int max = getMax();
        if (max == 0) {
            Log.e("HwProgressBar", "The max is 0 in setProgress.");
        } else {
            this.j.b(getProgress() / max);
        }
    }

    private int b(Drawable drawable) {
        if (drawable == null) {
            return 0;
        }
        Rect bounds = drawable.getBounds();
        if (bounds.width() <= 0 || bounds.height() <= 0) {
            return 0;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bounds.right, bounds.bottom, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int level = drawable.getLevel();
        drawable.setLevel(10000);
        drawable.draw(canvas);
        drawable.setLevel(level);
        int i = 0;
        for (int i2 = 0; i2 < bitmapCreateBitmap.getHeight(); i2++) {
            if (bitmapCreateBitmap.getPixel(bounds.right / 2, i2) != 0) {
                i++;
            }
        }
        return i;
    }
}
