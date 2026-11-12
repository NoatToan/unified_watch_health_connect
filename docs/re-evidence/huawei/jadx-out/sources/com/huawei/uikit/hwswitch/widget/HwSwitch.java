package com.huawei.uikit.hwswitch.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.Log;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.Switch;
import com.huawei.hms.hwid.f$$ExternalSyntheticApiModelOutline0;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.uikit.hwcommon.anim.HwCubicBezierInterpolator;
import com.huawei.uikit.hwswitch.R;
import defpackage.xeh;
import defpackage.xfs;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class HwSwitch extends Switch {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Property<HwSwitch, Float> f29769c = new b("thumbPos");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f29770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ObjectAnimator f29771b;
    private Drawable d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private float l;
    private int m;
    private int n;
    private int o;
    private int p;
    private float q;
    private final Rect r;
    private float s;
    private VelocityTracker t;
    private int x;

    class b extends FloatProperty<HwSwitch> {
        b(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(HwSwitch hwSwitch) {
            if (hwSwitch == null) {
                return null;
            }
            return Float.valueOf(hwSwitch.l);
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void setValue(HwSwitch hwSwitch, float f) {
            if (hwSwitch == null) {
                Log.w("HwSwitch", "setValue: HwSwitch object is null!");
            } else {
                hwSwitch.setThumbPosition(f);
            }
        }
    }

    public HwSwitch(Context context) {
        this(context, null);
    }

    private float b(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    private void b() {
        Object objC = xeh.c(this, "mSwitchWidth", (Class<?>) Switch.class);
        if (objC instanceof Integer) {
            this.e = ((Integer) objC).intValue();
        }
        Object objC2 = xeh.c(this, "mSwitchHeight", (Class<?>) Switch.class);
        if (objC2 instanceof Integer) {
            this.p = ((Integer) objC2).intValue();
        }
    }

    private void c() {
        if (this.d == null) {
            Object objC = xeh.c(this, "mThumbDrawable", (Class<?>) Switch.class);
            if (objC instanceof Drawable) {
                this.d = (Drawable) objC;
            }
        }
        if (this.f29770a == null) {
            Object objC2 = xeh.c(this, "mTrackDrawable", (Class<?>) Switch.class);
            if (objC2 instanceof Drawable) {
                this.f29770a = (Drawable) objC2;
            }
        }
        Object objC3 = xeh.c(this, "mThumbWidth", (Class<?>) Switch.class);
        if (objC3 instanceof Integer) {
            this.g = ((Integer) objC3).intValue();
        }
    }

    private void d() {
        Drawable.Callback callback = this.d.getCallback();
        this.d.setCallback(null);
        this.d.setBounds(0, 0, 0, 0);
        this.d.setCallback(callback);
    }

    private void e() {
        ObjectAnimator objectAnimator = this.f29771b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean g() {
        return this.l > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((!h() ? this.l : 1.0f - this.l) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Insets insetsM1362m;
        Drawable drawable = this.f29770a;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.r;
        drawable.getPadding(rect);
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            Object objB = xeh.b(drawable2, "getOpticalInsets", null, null, DrawableContainer.class);
            insetsM1362m = f$$ExternalSyntheticApiModelOutline0.m$1(objB) ? f$$ExternalSyntheticApiModelOutline0.m1362m(objB) : Insets.NONE;
        } else {
            insetsM1362m = Insets.NONE;
        }
        Object objC = xeh.c(this, "mSwitchWidth", (Class<?>) Switch.class);
        if (objC instanceof Integer) {
            this.e = ((Integer) objC).intValue();
        }
        int i = this.e;
        int i2 = this.g;
        int i3 = rect.left;
        int i4 = rect.right;
        int i5 = insetsM1362m.left;
        int i6 = insetsM1362m.right;
        int i7 = this.n;
        return (((((i - i2) - i3) - i4) - i5) - i6) - (i7 + i7);
    }

    private boolean h() {
        String language = Locale.getDefault().getLanguage();
        return (language.contains("ar") || language.contains("fa") || language.contains("iw")) || (language.contains("ug") || language.contains(Constants.URDU_LANG) || i());
    }

    private boolean j(MotionEvent motionEvent) {
        float f;
        float x = motionEvent.getX();
        int thumbScrollRange = getThumbScrollRange();
        float f2 = x - this.q;
        if (thumbScrollRange != 0) {
            f = f2 / thumbScrollRange;
        } else {
            f = f2 > 0.0f ? 1.0f : -1.0f;
        }
        if (i()) {
            f = -f;
        }
        float fB = b(this.l + f, 0.0f, 1.0f);
        if (fB == this.l) {
            return true;
        }
        this.q = x;
        setThumbPosition(fB);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThumbPosition(float f) {
        this.l = f;
        invalidate();
    }

    public int getFocusedPathColor() {
        return this.x;
    }

    @Override // android.widget.Switch, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        c();
        a(canvas);
        super.onDraw(canvas);
        d();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    @Override // android.widget.Switch, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        c();
        b();
        int i6 = 0;
        if (this.d != null) {
            Rect rect = this.r;
            Drawable drawable = this.f29770a;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Object objB = xeh.b(this.d, "getOpticalInsets", null, null, DrawableContainer.class);
            if (f$$ExternalSyntheticApiModelOutline0.m$1(objB)) {
                Insets insetsM1362m = f$$ExternalSyntheticApiModelOutline0.m1362m(objB);
                int i7 = insetsM1362m.left - rect.left;
                if (i7 <= 0) {
                    i7 = 0;
                }
                int i8 = insetsM1362m.right - rect.right;
                i5 = i8 > 0 ? i8 : 0;
                i6 = i7;
            } else {
                i5 = 0;
            }
        } else {
            i5 = 0;
        }
        e(i6, i5);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0028  */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    @Override // android.widget.Switch, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            Log.w("HwSwitch", "onTouchEvent: MotionEvent motionEvent is null!");
            return false;
        }
        this.t.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a(motionEvent);
        } else if (actionMasked == 1) {
            if (this.k == 2) {
                e(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.k = 0;
            this.t.clear();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.k == 2) {
                    e(motionEvent);
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.k = 0;
                this.t.clear();
            }
        } else if (c(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Switch, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (isAttachedToWindow() && isLaidOut()) {
            b(zIsChecked);
        } else {
            e();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    public void setFocusedPathColor(int i) {
        this.x = i;
    }

    protected void setSwitchWidth(int i) {
        this.e = i;
    }

    public HwSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwSwitchStyle);
    }

    public HwSwitch(Context context, AttributeSet attributeSet, int i) {
        super(b(context, i), attributeSet, i);
        this.e = 0;
        this.g = 0;
        this.f = 0;
        this.i = 0;
        this.j = 0;
        this.h = 0;
        this.n = 0;
        this.k = 0;
        this.o = 0;
        this.m = 0;
        this.t = VelocityTracker.obtain();
        this.r = new Rect();
        b(getContext(), attributeSet, i);
    }

    private static Context b(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwSwitch);
    }

    private boolean c(MotionEvent motionEvent) {
        int i = this.k;
        if (i == 1) {
            return b(motionEvent);
        }
        if (i != 2) {
            return false;
        }
        j(motionEvent);
        return true;
    }

    private void b(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwSwitch, i, R.style.Widget_Emui_HwSwitch);
        this.n = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.HwSwitch_hwLayoutPadding, (getResources().getDisplayMetrics().density * 2.0f) + 0.5f);
        this.x = typedArrayObtainStyledAttributes.getColor(R.styleable.HwSwitch_hwFocusedPathColor, -14331913);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        if (viewConfiguration != null) {
            this.o = viewConfiguration.getScaledTouchSlop();
            this.m = viewConfiguration.getScaledMinimumFlingVelocity();
        }
    }

    private void d(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private boolean b(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Object objC = xeh.c(this, "mTouchSlop", (Class<?>) Switch.class);
        if (objC instanceof Integer) {
            this.o = ((Integer) objC).intValue();
        }
        if (Math.abs(x - this.q) <= this.o && Math.abs(y - this.s) <= this.o) {
            return false;
        }
        this.k = 2;
        getParent().requestDisallowInterceptTouchEvent(true);
        this.q = x;
        this.s = y;
        return true;
    }

    private void a(Canvas canvas) {
        Rect rect = this.r;
        int i = this.f;
        int i2 = this.i;
        int i3 = this.h;
        int thumbOffset = i + getThumbOffset() + this.n;
        a();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.getPadding(rect);
            int i4 = thumbOffset - rect.left;
            int i5 = thumbOffset + this.g + rect.right;
            Drawable.Callback callback = this.d.getCallback();
            this.d.setCallback(null);
            this.d.setBounds(i4, i2, i5, i3);
            this.d.setCallback(callback);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i4, i2, i5, i3);
            }
        }
    }

    private void e(MotionEvent motionEvent) {
        this.k = 0;
        boolean zG = true;
        boolean z = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z) {
            this.t.computeCurrentVelocity(1000);
            float xVelocity = this.t.getXVelocity();
            Object objC = xeh.c(this, "mMinFlingVelocity", (Class<?>) Switch.class);
            if (objC instanceof Integer) {
                this.m = ((Integer) objC).intValue();
            }
            if (Math.abs(xVelocity) > this.m) {
                if (!h() ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    zG = false;
                }
            } else {
                zG = g();
            }
        } else {
            zG = zIsChecked;
        }
        if (zG != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(zG);
        d(motionEvent);
    }

    private boolean i() {
        return getLayoutDirection() == 1;
    }

    private void a() {
        Insets insetsM1362m;
        Rect rect = this.r;
        int i = this.f;
        int i2 = this.j;
        int i3 = this.i;
        int i4 = this.h;
        Drawable drawable = this.d;
        if (drawable != null) {
            Object objB = xeh.b(drawable, "getOpticalInsets", null, null, DrawableContainer.class);
            if (f$$ExternalSyntheticApiModelOutline0.m$1(objB)) {
                insetsM1362m = f$$ExternalSyntheticApiModelOutline0.m1362m(objB);
            } else {
                insetsM1362m = Insets.NONE;
            }
        } else {
            insetsM1362m = Insets.NONE;
        }
        Drawable drawable2 = this.f29770a;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            if (insetsM1362m != Insets.NONE) {
                int i5 = insetsM1362m.left;
                int i6 = rect.left;
                if (i5 > i6) {
                    i += i5 - i6;
                }
                int i7 = insetsM1362m.top;
                int i8 = rect.top;
                if (i7 > i8) {
                    i3 += i7 - i8;
                }
                int i9 = insetsM1362m.right;
                int i10 = rect.right;
                if (i9 > i10) {
                    i2 -= i9 - i10;
                }
                int i11 = insetsM1362m.bottom;
                int i12 = rect.bottom;
                if (i11 > i12) {
                    i4 -= i11 - i12;
                }
            }
            this.f29770a.setBounds(i, i3, i2, i4);
        }
    }

    private void e(int i, int i2) {
        if (i()) {
            int paddingLeft = getPaddingLeft() + i;
            this.f = paddingLeft;
            this.j = ((paddingLeft + this.e) - i) - i2;
        } else {
            int width = (getWidth() - getPaddingRight()) - i2;
            this.j = width;
            this.f = (width - this.e) + i + i2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            int i3 = this.p;
            int i4 = paddingTop - (i3 / 2);
            this.i = i4;
            this.h = i4 + i3;
            return;
        }
        if (gravity == 48) {
            int paddingTop2 = getPaddingTop();
            this.i = paddingTop2;
            this.h = paddingTop2 + this.p;
        } else if (gravity != 80) {
            this.i = 0;
            this.h = 0;
        } else {
            int height = getHeight() - getPaddingBottom();
            this.h = height;
            this.i = height - this.p;
        }
    }

    private void b(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f29769c, z ? 1.0f : 0.0f);
        this.f29771b = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.f29771b.setInterpolator(new HwCubicBezierInterpolator(0.1f, 1.0f, 0.9f, 1.0f));
        this.f29771b.setAutoCancel(true);
        this.f29771b.start();
    }

    private boolean d(float f, float f2) {
        if (this.d == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.d.getPadding(this.r);
        Object objC = xeh.c(this, "mTouchSlop", (Class<?>) Switch.class);
        if (objC instanceof Integer) {
            this.o = ((Integer) objC).intValue();
        }
        int i = this.i;
        int i2 = this.o;
        int i3 = (this.f + thumbOffset) - i2;
        int i4 = this.g;
        Rect rect = this.r;
        return f > ((float) i3) && f < ((float) ((((i4 + i3) + rect.left) + rect.right) + i2)) && f2 > ((float) (i - i2)) && f2 < ((float) (this.h + i2));
    }

    private void a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (isEnabled() && d(x, y)) {
            this.k = 1;
            this.q = x;
            this.s = y;
        }
    }
}
