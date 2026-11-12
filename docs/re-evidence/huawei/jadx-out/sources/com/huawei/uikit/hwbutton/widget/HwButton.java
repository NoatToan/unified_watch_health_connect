package com.huawei.uikit.hwbutton.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.huawei.uikit.hwbutton.R;
import com.huawei.uikit.hwprogressbar.widget.HwProgressBar;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import defpackage.xcv;
import defpackage.xdb;
import defpackage.xfs;
import defpackage.xfu;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class HwButton extends HwTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29301a;
    private int ab;
    private Rect ac;
    private int ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f29302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f29303c;
    private float d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private HwProgressBar j;
    private String k;
    private float l;
    private String m;
    private int n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private int t;
    private Drawable u;
    private ColorStateList v;
    private Drawable w;
    private Drawable x;
    private Drawable y;

    public HwButton(Context context) {
        this(context, null);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwButton, i, 0);
        this.d = typedArrayObtainStyledAttributes.getFloat(R.styleable.HwButton_hwHoveredZoomScale, 1.0f);
        this.f29302b = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwButton_hwFocusedDrawable);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwButton_hwButtonfocusedPathWidth, 0);
        this.f29301a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwButton_hwFocusedPathPadding, 0);
        this.t = typedArrayObtainStyledAttributes.getColor(R.styleable.HwButton_hwButtonWaitTextColor, 0);
        this.q = typedArrayObtainStyledAttributes.getColor(R.styleable.HwButton_hwButtonWaitIconColor, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwButton_hwButtonWaitIconSize, d(24));
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwButton_hwButtonWaitIconPadding, d(8));
        this.ab = typedArrayObtainStyledAttributes.getColor(R.styleable.HwButton_hwFocusedPathColor, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwButton_hwAuxiliaryEnable, true);
        if (xfu.c(context) && z && Float.compare(xfu.d(context), 1.75f) >= 0) {
            int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.HwButton_hwButtonStyleType, 0);
            if (i2 == 0) {
                this.ad = getResources().getDimensionPixelSize(R.dimen.hwbutton_big_padding_top_or_bottom);
            }
            if (i2 == 1) {
                this.ad = getResources().getDimensionPixelSize(R.dimen.hwbutton_small_padding_top_or_bottom);
            }
            setMaxLines(2);
        }
        this.l = getTextSize();
        typedArrayObtainStyledAttributes.recycle();
        setDefaultFocusHighlightEnabled(false);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x008b, please report this as an issue */
    private void b() {
        int i;
        int i2;
        int i3;
        int i4;
        int iWidth;
        Drawable indeterminateDrawable;
        if (this.o) {
            if (this.j == null) {
                HwProgressBar hwProgressBarC = HwProgressBar.c(getContext());
                this.j = hwProgressBarC;
                if (hwProgressBarC == null) {
                    Log.e("HwButton", "createProgressbar: HwProgressBar instantiate null!");
                    return;
                }
            }
            e();
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                Log.w("HwButton", "HwButton::create progressbar fail");
                return;
            }
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            getLocationOnScreen(iArr);
            viewGroup.getLocationOnScreen(iArr2);
            int iMin = this.f29303c[0];
            int i5 = iArr[0];
            if (iMin != i5) {
                if (iMin == 0) {
                    i2 = i5 - iArr2[0];
                } else {
                    iMin = Math.min(iMin, i5);
                    i = iArr2[0];
                }
                if (this.e) {
                    i3 = this.f29303c[1];
                    i4 = iArr2[1];
                } else {
                    i3 = iArr[1];
                    i4 = iArr2[1];
                }
                iWidth = this.ac.width();
                if (getLayoutDirection() == 1) {
                    i2 += iWidth;
                }
                this.j.offsetLeftAndRight(i2);
                this.j.offsetTopAndBottom(i3 - i4);
                indeterminateDrawable = this.j.getIndeterminateDrawable();
                if (indeterminateDrawable instanceof xdb) {
                    this.j.setAlpha(Color.alpha(this.q) > 0 ? (Color.alpha(this.q) * 1.0f) / 255.0f : 1.0f);
                    ((xdb) indeterminateDrawable).a(this.q);
                }
                viewGroup.getOverlay().add(this.j);
            }
            i = iArr2[0];
            i2 = iMin - i;
            if (this.e) {
                i3 = this.f29303c[1];
                i4 = iArr2[1];
            } else {
                i3 = iArr[1];
                i4 = iArr2[1];
            }
            iWidth = this.ac.width();
            if (getLayoutDirection() == 1) {
                i2 += iWidth;
            }
            this.j.offsetLeftAndRight(i2);
            this.j.offsetTopAndBottom(i3 - i4);
            indeterminateDrawable = this.j.getIndeterminateDrawable();
            if (indeterminateDrawable instanceof xdb) {
                this.j.setAlpha(Color.alpha(this.q) > 0 ? (Color.alpha(this.q) * 1.0f) / 255.0f : 1.0f);
                ((xdb) indeterminateDrawable).a(this.q);
            }
            viewGroup.getOverlay().add(this.j);
        }
    }

    private static Context c(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwButton);
    }

    private void c() {
        if (this.k == null) {
            int i = this.r;
            int i2 = this.ad;
            setPadding(i, i2, this.p, i2);
        } else {
            if (getLayoutDirection() != 1) {
                int i3 = this.r;
                int iconSize = getIconSize();
                int waitingDrawablePadding = getWaitingDrawablePadding();
                int i4 = this.ad;
                setPadding(i3 + iconSize + waitingDrawablePadding, i4, this.p, i4);
                return;
            }
            int i5 = this.r;
            int i6 = this.ad;
            int i7 = this.p;
            int iconSize2 = getIconSize();
            setPadding(i5, i6, i7 + iconSize2 + getWaitingDrawablePadding(), this.ad);
        }
    }

    protected static int d(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    private void d() {
        ViewGroup viewGroup;
        HwProgressBar hwProgressBar = this.j;
        if (hwProgressBar != null) {
            ViewParent parent = hwProgressBar.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.removeView(this.j);
            }
            this.j = null;
        }
    }

    private void setOriDrawableVisible(boolean z) {
        if (z) {
            setCompoundDrawables(this.u, this.w, this.y, this.x);
            return;
        }
        Drawable[] compoundDrawables = getCompoundDrawables();
        if (compoundDrawables.length > 3) {
            this.u = compoundDrawables[0];
            this.w = compoundDrawables[1];
            this.y = compoundDrawables[2];
            this.x = compoundDrawables[3];
        }
        setCompoundDrawables(null, null, null, null);
    }

    protected int c(int i, int i2) {
        int i3;
        int iconSize;
        int width = getWidth();
        if (getLayoutDirection() != 1) {
            return i > width ? this.r : (width / 2) - (i2 / 2);
        }
        if (i > width) {
            i3 = 0 - this.p;
            iconSize = getIconSize();
        } else {
            i3 = 0 - ((width / 2) - (i2 / 2));
            iconSize = getIconSize();
        }
        return i3 - iconSize;
    }

    protected void e(boolean z, int i, int i2) {
        if (z) {
            setEnabled(false);
        } else {
            setEnabled(this.s);
        }
    }

    public int getFocusPathColor() {
        return this.ab;
    }

    public Drawable getFocusedDrawable() {
        return this.f29302b;
    }

    public int getFocusedPathPadding() {
        return this.f29301a;
    }

    public int getFocusedPathWidth() {
        return this.i;
    }

    public float getHoveredZoomScale() {
        return this.d;
    }

    public int getIconSize() {
        return this.f;
    }

    public int getWaitingDrawablePadding() {
        return this.n;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.view.View
    public void onHoverChanged(boolean z) {
        super.onHoverChanged(z);
        if (this.d == 1.0f) {
            return;
        }
        c(z);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo == null) {
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.o) {
            c();
            b();
        }
    }

    public void setClickAnimationEnabled(boolean z) {
    }

    public void setClickSelf(boolean z) {
        this.e = z;
    }

    public void setFocusPathColor(int i) {
        this.ab = i;
    }

    public void setFocusedDrawable(Drawable drawable) {
        this.f29302b = drawable;
    }

    public void setFocusedPathPadding(int i) {
        this.f29301a = i;
    }

    public void setFocusedPathWidth(int i) {
        this.i = i;
    }

    public void setHoveredZoomScale(float f) {
        this.d = f;
    }

    public void setIconSize(int i) {
        this.f = i;
    }

    protected void setParentLocation(int[] iArr) {
        if (iArr == null) {
            return;
        }
        this.f29303c = iArr;
    }

    @Override // com.huawei.uikit.hwtextview.widget.HwTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        requestLayout();
        invalidate();
    }

    public void setWaitingDrawablePadding(int i) {
        this.n = i;
    }

    public void setWaitingEnable(boolean z, String str) {
        if (!z) {
            if (this.o) {
                this.k = null;
                d();
                setOriDrawableVisible(true);
                setText(this.m);
                ColorStateList colorStateList = this.v;
                if (colorStateList != null) {
                    setTextColor(colorStateList);
                    this.v = null;
                }
                int i = this.r;
                int i2 = this.ad;
                setPadding(i, i2, this.p, i2);
                e(false, this.h, this.g);
                this.o = false;
                return;
            }
            return;
        }
        this.k = str;
        if (!this.o) {
            this.r = getPaddingStart();
            this.p = getPaddingEnd();
            this.v = getTextColors();
            this.h = getWidth();
            this.g = getHeight();
            this.s = isEnabled();
            this.m = getText().toString();
            setOriDrawableVisible(false);
        }
        c();
        setText(str);
        int i3 = this.t;
        if (i3 != 0) {
            setTextColor(i3);
        }
        e(true, this.h, this.g);
        this.o = true;
    }

    public HwButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwButtonStyle);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (getAutoSizeTextType() == 0) {
            this.l = f;
        }
        super.setTextSize(i, f);
    }

    public HwButton(Context context, AttributeSet attributeSet, int i) {
        super(c(context, i), attributeSet, i);
        this.v = null;
        this.ad = 0;
        this.ac = new Rect();
        this.f29303c = new int[2];
        this.e = false;
        a(super.getContext(), attributeSet, i);
    }

    private void e() {
        this.j.measure(getWidth(), getHeight());
        int iA = a(this.k);
        int i = this.r;
        int i2 = this.p;
        getHitRect(this.ac);
        int iHeight = this.ac.height() / 2;
        int i3 = this.f / 2;
        int iC = c(i + iA + i2, iA);
        this.j.layout(iC, iHeight - i3, this.f + iC, iHeight + i3);
    }

    private int a(String str) {
        int iMeasureText;
        if (str != null) {
            String string = getText().toString();
            if (Build.VERSION.SDK_INT >= 28 && isAllCaps()) {
                string = string.toUpperCase(Locale.ENGLISH);
            }
            iMeasureText = (int) getPaint().measureText(string);
            if (getTextSize() != 0.0f && this.l != 0.0f) {
                iMeasureText = (int) ((iMeasureText / getTextSize()) * this.l);
            } else {
                Log.w("HwButton", "getButtonContentWidth: wrong para!");
            }
        } else {
            iMeasureText = 0;
        }
        if (iMeasureText != 0) {
            return getIconSize() + getWaitingDrawablePadding() + iMeasureText;
        }
        return getIconSize();
    }

    private void c(boolean z) {
        xcv.a(this, z ? this.d : 1.0f).start();
    }
}
