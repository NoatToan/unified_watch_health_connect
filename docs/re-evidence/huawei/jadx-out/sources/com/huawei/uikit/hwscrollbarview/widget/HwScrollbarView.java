package com.huawei.uikit.hwscrollbarview.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Interpolator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.uikit.hwscrollbarview.R;
import defpackage.xei;
import defpackage.xfs;
import defpackage.xft;
import defpackage.xfw;
import defpackage.xfx;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class HwScrollbarView extends View {
    private static final int A = 1750;
    private static final int B = 250;
    private static final int C = 50;
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 2;
    private static final int G = 48;
    private static final int H = 16;
    protected static final float HALF_FACTOR = 0.5f;
    private static final int I = 255;
    private static final int J = 192;
    private static final int K = 48;
    private static final float L = 35.0f;
    private static final float M = 110.0f;
    private static final int N = 0;
    private static final HwScrollBind O = new xfx();
    private static Method P = null;
    private static Method Q = null;
    private static Method R = null;
    protected static final float REVERSE_FACTOR = -1.0f;
    protected static final String TAG = "HwScrollbarView";
    protected static final int THUMB_TYPE_ARC = 1;
    protected static final int THUMB_TYPE_LINE = 0;
    private static final int w = 15;
    private static final int x = -1;
    private static final int y = 16777215;
    private static final int z = 1750;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29684c;
    private int d;
    private int e;
    private float f;
    private boolean g;
    private int h;
    private View i;
    private WeakReference<ViewTreeObserver> j;
    private OnFastScrollListener k;
    private boolean l;
    private boolean m;
    protected int mMinThumbLength;
    protected float mStartAngle;
    protected float mSweepAngle;
    protected int mThumbAlpha;
    protected Drawable mThumbDrawable;
    protected int mThumbLength;
    protected int mThumbOffset;
    protected Rect mThumbRect;
    protected int mThumbTint;
    protected Rect mThumbTouchHotRect;
    protected int mThumbTouchHotWidth;
    protected int mThumbType;
    protected int mThumbWidth;
    protected Drawable mTrackDrawable;
    protected int mTrackLength;
    protected Rect mTrackRect;
    protected int mTrackTint;
    protected int mTrackWidth;
    private boolean n;
    private HwOverScrollProxy o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private e t;
    private View.OnTouchListener u;
    private ViewTreeObserver.OnGlobalLayoutListener v;

    public interface OnFastScrollListener {
        void onFastScrollChanged(int i, int i2, float f);
    }

    /* JADX INFO: loaded from: classes44.dex */
    @Deprecated
    public interface OnTouchOffsetListener {
        void onTouchOffset(int i, int i2, boolean z);
    }

    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (HwScrollbarView.this.l()) {
                return true;
            }
            HwScrollbarView.this.a(motionEvent);
            return false;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int scrollableViewVerticalScrollRange = HwScrollbarView.this.getScrollableViewVerticalScrollRange();
            int scrollableViewVerticalScrollExtent = HwScrollbarView.this.getScrollableViewVerticalScrollExtent();
            HwScrollbarView.this.n = scrollableViewVerticalScrollRange > scrollableViewVerticalScrollExtent;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HwScrollbarView.this.w();
        }
    }

    static class e implements Runnable {
        private static final float[] d = {255.0f};
        private static final float[] e = {0.0f};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float[] f29687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Interpolator f29688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HwScrollbarView f29689c;
        private int i;
        private long j;

        private e() {
            this.f29687a = new float[1];
            this.f29688b = new Interpolator(1, 2);
            this.i = 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (jCurrentAnimationTimeMillis >= this.j) {
                int i = (int) jCurrentAnimationTimeMillis;
                Interpolator interpolator = this.f29688b;
                interpolator.setKeyFrame(0, i, d);
                interpolator.setKeyFrame(1, i + this.f29689c.f29682a, e);
                this.i = 2;
                this.f29689c.invalidate();
            }
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    static {
        try {
            P = View.class.getDeclaredMethod("computeVerticalScrollRange", new Class[0]);
        } catch (NoSuchMethodException unused) {
            P = null;
            Log.w(TAG, "NoSuchMethodException computeVerticalScrollRange");
        }
        try {
            Q = View.class.getDeclaredMethod("computeVerticalScrollExtent", new Class[0]);
        } catch (NoSuchMethodException unused2) {
            Q = null;
            Log.w(TAG, "NoSuchMethodException computeVerticalScrollExtent");
        }
        try {
            R = View.class.getDeclaredMethod("computeVerticalScrollOffset", new Class[0]);
        } catch (NoSuchMethodException unused3) {
            R = null;
            Log.w(TAG, "NoSuchMethodException computeVerticalScrollOffset");
        }
    }

    public HwScrollbarView(Context context) {
        this(context, null);
    }

    private void d() {
        int i = this.s;
        if (i > 0) {
            d(i);
        } else {
            w();
        }
    }

    private void e() {
        if (k()) {
            setThumbShow(false);
            invalidate();
        }
    }

    private void f() {
        HwOverScrollProxy hwOverScrollProxy = this.o;
        if (hwOverScrollProxy == null) {
            return;
        }
        if (hwOverScrollProxy.isOverScroll()) {
            if (this.p) {
                return;
            }
            m();
        } else if (this.p) {
            n();
        }
    }

    private void g() {
        u();
        invalidate();
    }

    public static HwScrollBind getHwScrollBindImpl() {
        return O;
    }

    private float getScrollProgress() {
        return (this.mThumbOffset * 1.0f) / (this.mTrackLength - this.mThumbLength);
    }

    private boolean h() {
        String language = Locale.getDefault().getLanguage();
        boolean z2 = true;
        boolean z3 = language.contains("ar") || language.contains("fa") || language.contains("iw");
        if (!language.contains("ug") && !language.contains(Constants.URDU_LANG)) {
            z2 = false;
        }
        return z3 | z2;
    }

    private boolean i() {
        return this.h != 0;
    }

    public static HwScrollbarView instantiate(Context context) {
        Object objC = xft.c(context, xft.b(context, HwScrollbarView.class, xft.d(context, 15, 1)), HwScrollbarView.class);
        if (objC instanceof HwScrollbarView) {
            return (HwScrollbarView) objC;
        }
        return null;
    }

    private boolean j() {
        e eVar = this.t;
        return eVar != null && eVar.i == 0;
    }

    private boolean k() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        return this.f29683b != 0;
    }

    private void m() {
        this.p = true;
        this.r = this.mThumbRect.height();
    }

    private void n() {
        q();
    }

    private void o() {
        a(1750);
    }

    private void p() {
        ViewTreeObserver viewTreeObserver;
        WeakReference<ViewTreeObserver> weakReference = this.j;
        if (weakReference == null || this.v == null || (viewTreeObserver = weakReference.get()) == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this.v);
    }

    private void q() {
        this.p = false;
    }

    private void r() {
        removeCallbacks(this.t);
        e eVar = this.t;
        if (eVar != null) {
            eVar.i = 1;
        }
        if (!k()) {
            setThumbShow(true);
        }
        g();
    }

    private void s() {
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mThumbDrawable;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    private void setThumbShow(boolean z2) {
        this.l = z2;
    }

    private void t() {
        updateTrackRect();
        u();
    }

    private void u() {
        if (this.i == null) {
            return;
        }
        a(getScrollableViewVerticalScrollRange(), getScrollableViewVerticalScrollExtent(), getScrollableViewVerticalScrollOffset());
    }

    private void v() {
        int width = getWidth() - getPaddingRight();
        int paddingLeft = width - this.mThumbWidth;
        int paddingTop = getPaddingTop() + this.mThumbOffset;
        int i = this.mThumbLength;
        if (isScrollbarLayoutRtl()) {
            paddingLeft = getPaddingLeft();
            width = this.mThumbWidth + paddingLeft;
        }
        this.mThumbRect.set(paddingLeft, paddingTop, width, i + paddingTop);
        updateThumbTouchHotRect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (isHapticFeedbackEnabled()) {
            xei.c(this, 9, 0);
        }
    }

    protected void adjustOverScrollThumbParameters() {
        int overScrollOffset;
        if (isOverScrolling() && (overScrollOffset = this.o.getOverScrollOffset()) != 0) {
            int i = this.q;
            int iAbs = this.r - Math.abs(overScrollOffset);
            this.mThumbLength = iAbs;
            if (iAbs < i) {
                this.mThumbLength = i;
            }
            if (overScrollOffset > 0) {
                this.mThumbOffset = this.mTrackLength - this.mThumbLength;
            } else {
                this.mThumbOffset = 0;
            }
        }
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        s();
    }

    public int getFadeTime() {
        return this.f29682a;
    }

    public HwOverScrollProxy getHwOverScrollProxy(HwOverScrollProxy hwOverScrollProxy) {
        return this.o;
    }

    public View getScrollableView() {
        return this.i;
    }

    int getScrollableViewVerticalScrollExtent() {
        Method method;
        if (this.i == null || (method = Q) == null) {
            return -1;
        }
        try {
            method.setAccessible(true);
            Object objInvoke = Q.invoke(this.i, new Object[0]);
            if (objInvoke instanceof Integer) {
                return ((Integer) objInvoke).intValue();
            }
            return -1;
        } catch (IllegalAccessException unused) {
            Log.w(TAG, "IllegalAccessException computeVerticalScrollExtent");
            return -1;
        } catch (InvocationTargetException unused2) {
            Log.w(TAG, "InvocationTargetException computeVerticalScrollExtent");
            return -1;
        }
    }

    int getScrollableViewVerticalScrollOffset() {
        Method method;
        if (this.i == null || (method = R) == null) {
            return -1;
        }
        try {
            method.setAccessible(true);
            Object objInvoke = R.invoke(this.i, new Object[0]);
            if (objInvoke instanceof Integer) {
                return ((Integer) objInvoke).intValue();
            }
            return -1;
        } catch (IllegalAccessException unused) {
            Log.w(TAG, "IllegalAccessException computeVerticalScrollOffset");
            return -1;
        } catch (InvocationTargetException unused2) {
            Log.w(TAG, "InvocationTargetException computeVerticalScrollOffset");
            return -1;
        }
    }

    int getScrollableViewVerticalScrollRange() {
        Method method;
        if (this.i == null || (method = P) == null) {
            return -1;
        }
        try {
            method.setAccessible(true);
            Object objInvoke = P.invoke(this.i, new Object[0]);
            if (objInvoke instanceof Integer) {
                return ((Integer) objInvoke).intValue();
            }
            return -1;
        } catch (IllegalAccessException unused) {
            Log.w(TAG, "IllegalAccessException computeVerticalScrollRange");
            return -1;
        } catch (InvocationTargetException unused2) {
            Log.w(TAG, "InvocationTargetException computeVerticalScrollRange");
            return -1;
        }
    }

    public float getStartAngle() {
        return this.mStartAngle;
    }

    public float getSweepAngle() {
        return this.mSweepAngle;
    }

    protected Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    public int getThumbTint() {
        return this.mThumbTint;
    }

    protected boolean isOverScrolling() {
        return this.p;
    }

    protected boolean isScrollbarLayoutRtl() {
        return getLayoutDirection() == 1 || h();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        a(1750);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.n) {
            b(canvas);
            a(canvas);
        }
    }

    protected void onDrawArcThumb(Canvas canvas) {
    }

    protected void onDrawLineThumb(Canvas canvas) {
        Drawable drawable = this.mThumbDrawable;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(this.mThumbRect);
        drawable.mutate().setAlpha(this.mThumbAlpha);
        drawable.draw(canvas);
    }

    protected void onDrawThumb(Canvas canvas) {
        if (this.mThumbType == 1) {
            onDrawArcThumb(canvas);
        } else {
            onDrawLineThumb(canvas);
        }
    }

    protected void onDrawTrack(Canvas canvas) {
        Drawable drawable = this.mTrackDrawable;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(this.mTrackRect);
        drawable.draw(canvas);
    }

    @Override // android.view.View
    public void onHoverChanged(boolean z2) {
        if (z2) {
            r();
        } else {
            o();
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            setHovered(true);
        } else if (action == 10) {
            setHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        if (z2) {
            t();
        }
        super.onLayout(z2, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            mode = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), i2);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        b(i);
        super.onRtlPropertiesChanged(i);
    }

    public void onScrollChanged() {
        if (getVisibility() != 0 || l()) {
            return;
        }
        if (!this.m) {
            this.m = c();
        }
        if (!this.m) {
            e();
            return;
        }
        f();
        r();
        o();
    }

    public void onScrollableViewTouchEvent(View view, MotionEvent motionEvent) {
        if (this.i == view && !l()) {
            a(motionEvent);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && !j() && !i()) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    setPressed(false);
                    this.f29683b = 0;
                    g();
                    o();
                } else if (action == 2) {
                    int i = y2 - this.f29684c;
                    if (this.f29683b == 1 && Math.abs(i) >= this.e) {
                        this.f29683b = 2;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        i += i > 0 ? -this.e : this.e;
                    }
                    if (this.f29683b == 2) {
                        this.f29684c = y2;
                        c(i);
                    }
                } else if (action == 3) {
                    setPressed(false);
                    this.f29683b = 0;
                    g();
                    o();
                }
            } else if (a(x2, y2)) {
                this.f29683b = 1;
                this.f29684c = y2;
                q();
                setPressed(true);
                r();
                d();
            }
            if (this.f29683b != 0) {
                return true;
            }
        }
        return false;
    }

    public void setFadeTime(int i) {
        this.f29682a = i;
    }

    public void setFastScrollable(boolean z2) {
        this.g = z2;
    }

    public void setHwOverScrollProxy(HwOverScrollProxy hwOverScrollProxy) {
        this.o = hwOverScrollProxy;
    }

    public void setOnFastScrollListener(OnFastScrollListener onFastScrollListener) {
        this.k = onFastScrollListener;
    }

    @Deprecated
    public void setOnTouchOffsetListener(OnTouchOffsetListener onTouchOffsetListener) {
    }

    public void setScrollableView(View view, boolean z2) {
        if (view == null) {
            Log.w(TAG, "setScrollableView: view is null");
            return;
        }
        if (this.i != null) {
            return;
        }
        this.i = view;
        if (z2) {
            view.setOnTouchListener(this.u);
        }
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (this.i.isAttachedToWindow()) {
            a();
        }
    }

    protected void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            Drawable drawableWrap = DrawableCompat.wrap(drawable);
            this.mThumbDrawable = drawableWrap;
            int i = this.mThumbTint;
            if (i != 16777215) {
                DrawableCompat.setTint(drawableWrap, i);
            }
            this.mThumbDrawable.setCallback(this);
        }
    }

    public void setThumbTint(int i) {
        this.mThumbTint = i;
    }

    protected void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTrackDrawable = drawable;
        if (drawable != null) {
            Drawable drawableWrap = DrawableCompat.wrap(drawable);
            this.mTrackDrawable = drawableWrap;
            int i = this.mTrackTint;
            if (i != 16777215) {
                DrawableCompat.setTint(drawableWrap, i);
            }
            this.mTrackDrawable.setCallback(this);
        }
    }

    protected void updateThumbTouchHotRect() {
        Rect rect = this.mThumbRect;
        int i = rect.right;
        int i2 = i - this.mThumbTouchHotWidth;
        if (isScrollbarLayoutRtl()) {
            i2 = rect.left;
            i = this.mThumbTouchHotWidth + i2;
        }
        this.mThumbTouchHotRect.set(i2, rect.top, i, rect.bottom);
    }

    protected void updateTrackRect() {
        int i = this.mTrackWidth;
        int width = getWidth() - getPaddingRight();
        int paddingLeft = width - i;
        if (isScrollbarLayoutRtl()) {
            paddingLeft = getPaddingLeft();
            width = paddingLeft + i;
        }
        this.mTrackLength = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        this.mTrackRect.set(paddingLeft, paddingTop, width, this.mTrackLength + paddingTop);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.mThumbDrawable || drawable == this.mTrackDrawable || super.verifyDrawable(drawable);
    }

    public HwScrollbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwScrollbarViewStyle);
    }

    private void b(int i) {
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.setAutoMirrored(true);
            DrawableCompat.setLayoutDirection(this.mThumbDrawable, i);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setAutoMirrored(true);
            DrawableCompat.setLayoutDirection(this.mTrackDrawable, i);
        }
    }

    private void c(int i) {
        if (i == 0) {
            return;
        }
        int i2 = this.mThumbOffset + i;
        int i3 = this.mTrackLength - this.mThumbLength;
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 <= i3) {
            i3 = i2;
        }
        this.mThumbOffset = i3;
        b();
        v();
        invalidate();
    }

    public HwScrollbarView(Context context, AttributeSet attributeSet, int i) {
        super(a(context, i), attributeSet, i);
        this.mThumbAlpha = 255;
        this.mTrackLength = 0;
        this.mThumbLength = 0;
        this.mThumbOffset = 0;
        this.mThumbWidth = 0;
        this.mTrackWidth = 0;
        this.mThumbTouchHotWidth = 0;
        this.mThumbRect = new Rect();
        this.mTrackRect = new Rect();
        this.mThumbTouchHotRect = new Rect();
        this.mThumbType = 0;
        this.f29682a = 250;
        this.f29683b = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = 0;
        this.l = true;
        this.m = true;
        this.n = true;
        this.p = false;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.u = new a();
        this.v = new b();
        a(super.getContext(), attributeSet, i);
    }

    private static Context a(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwScrollbarView);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwScrollbarView, i, R.style.Widget_Emui_HwScrollbarView);
        this.e = viewConfiguration.getScaledTouchSlop();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwScrollbarView_hwMinThumbLength, 48);
        this.mMinThumbLength = dimensionPixelSize;
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwScrollbarView_hwOverScrollMinThumbLength, dimensionPixelSize);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwScrollbarView_hwMinThumbWidth, 16);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwScrollbarView_hwThumbWidth, dimensionPixelSize2);
        this.mThumbWidth = dimensionPixelSize3;
        if (dimensionPixelSize3 < dimensionPixelSize2) {
            this.mThumbWidth = dimensionPixelSize2;
        }
        this.mTrackWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwScrollbarView_hwTrackWidth, this.mThumbWidth);
        this.mThumbTouchHotWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwScrollbarView_hwThumbTouchHotWidth, 16);
        this.mThumbTint = typedArrayObtainStyledAttributes.getColor(R.styleable.HwScrollbarView_hwScrollThumbTint, 16777215);
        this.mTrackTint = typedArrayObtainStyledAttributes.getColor(R.styleable.HwScrollbarView_hwScrollTrackTint, 16777215);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwScrollbarView_hwScrollThumb);
        Drawable drawable2 = drawable;
        if (drawable == null) {
            xfw xfwVar = new xfw();
            xfwVar.b(context, attributeSet, i);
            drawable2 = xfwVar;
        }
        setThumbDrawable(drawable2);
        setTrackDrawable(typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwScrollbarView_hwScrollTrack));
        this.mThumbType = typedArrayObtainStyledAttributes.getInt(R.styleable.HwScrollbarView_hwThumbType, 0);
        this.mStartAngle = typedArrayObtainStyledAttributes.getFloat(R.styleable.HwScrollbarView_hwStartAngle, L);
        this.mSweepAngle = typedArrayObtainStyledAttributes.getFloat(R.styleable.HwScrollbarView_hwSweepAngle, M);
        this.s = typedArrayObtainStyledAttributes.getInteger(R.styleable.HwScrollbarView_hwVibrateDelayTime, 0);
        typedArrayObtainStyledAttributes.recycle();
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        e eVar = new e(null);
        this.t = eVar;
        eVar.f29689c = this;
        if (isInEditMode()) {
            this.mThumbRect = new Rect(0, 0, 48, 192);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(2);
        }
    }

    private void d(int i) {
        postDelayed(new c(), i);
    }

    private void b() {
        if (this.k != null) {
            int scrollableViewVerticalScrollRange = getScrollableViewVerticalScrollRange();
            int scrollableViewVerticalScrollExtent = getScrollableViewVerticalScrollExtent();
            if (scrollableViewVerticalScrollRange == -1 || scrollableViewVerticalScrollExtent == -1) {
                return;
            }
            int scrollableViewVerticalScrollOffset = getScrollableViewVerticalScrollOffset();
            float scrollProgress = getScrollProgress();
            int i = ((int) ((scrollableViewVerticalScrollRange - scrollableViewVerticalScrollExtent) * scrollProgress)) - scrollableViewVerticalScrollOffset;
            int iCompare = Float.compare(scrollProgress - this.f, 0.0f);
            if (iCompare > 0 && i < 0) {
                i = 0;
            }
            if (iCompare < 0 && i > 0) {
                i = 0;
            }
            if (i != 0) {
                this.k.onFastScrollChanged(0, i, scrollProgress);
            }
            this.f = scrollProgress;
        }
    }

    private boolean c() {
        return this.i != null && getScrollableViewVerticalScrollRange() > getScrollableViewVerticalScrollExtent();
    }

    private void b(Canvas canvas) {
        if (this.mTrackDrawable != null && k() && this.mThumbType == 0) {
            onDrawTrack(canvas);
        }
    }

    private void a(int i, int i2, int i3) {
        if (i > 0 && i > i2) {
            int i4 = this.mTrackLength;
            int i5 = (int) (((i2 * 1.0f) / i) * i4);
            int i6 = this.mMinThumbLength;
            if (i5 < i6) {
                i5 = i6;
            }
            if (i5 > i4) {
                i5 = i4;
            }
            this.mThumbLength = i5;
            int i7 = i4 - i5;
            int i8 = (int) (((i3 * 1.0f) / (i - i2)) * i7);
            if (i8 <= i7) {
                i7 = i8;
            }
            this.mThumbOffset = i7;
            if (i7 == 0 || i7 >= i4 - this.r) {
                adjustOverScrollThumbParameters();
            }
            v();
            this.f = getScrollProgress();
            return;
        }
        this.mThumbLength = 0;
        this.mThumbOffset = 0;
        this.mThumbRect.setEmpty();
        setThumbShow(false);
        this.m = false;
    }

    private void a() {
        ViewTreeObserver viewTreeObserver;
        if (this.i == null) {
            return;
        }
        if (this.j == null) {
            this.j = new WeakReference<>(this.i.getViewTreeObserver());
        }
        if (this.v == null || (viewTreeObserver = this.j.get()) == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.v);
    }

    private boolean a(int i, int i2) {
        if (this.g) {
            return this.mThumbTouchHotRect.contains(i, i2);
        }
        return false;
    }

    private void a(Canvas canvas) {
        e eVar;
        int i;
        if (k() && (i = (eVar = this.t).i) != 0) {
            boolean z2 = false;
            if (i == 2) {
                float[] fArr = eVar.f29687a;
                if (eVar.f29688b.timeToValues(fArr) == Interpolator.Result.FREEZE_END) {
                    setThumbShow(false);
                    eVar.i = 0;
                } else {
                    this.mThumbAlpha = Math.round(fArr[0]);
                }
                z2 = true;
            } else {
                this.mThumbAlpha = 255;
            }
            onDrawThumb(canvas);
            if (z2) {
                postInvalidateDelayed(50L);
            }
        }
    }

    private void a(int i) {
        if (k()) {
            this.t.j = AnimationUtils.currentAnimationTimeMillis() + ((long) this.f29682a);
            this.t.i = 1;
            removeCallbacks(this.t);
            postDelayed(this.t, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        int action = motionEvent.getAction();
        int y2 = (int) motionEvent.getY();
        if (action != 1) {
            if (action == 2) {
                if (this.h == 0) {
                    this.d = y2;
                    this.h = 2;
                    if (c()) {
                        this.m = true;
                        r();
                    } else {
                        this.m = false;
                        setThumbShow(false);
                    }
                }
                if (!k() || this.d == y2) {
                    return;
                }
                this.d = y2;
                r();
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.h = 0;
        o();
    }
}
