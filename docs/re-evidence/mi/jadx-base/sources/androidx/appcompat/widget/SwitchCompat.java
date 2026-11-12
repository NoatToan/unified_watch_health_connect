package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import defpackage.eyq;
import defpackage.f9p;
import defpackage.i2j;
import defpackage.k47;
import defpackage.l61;
import defpackage.of1;
import defpackage.qii;
import defpackage.s8p;
import defpackage.x47;
import defpackage.xfp;
import defpackage.z5j;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final Property<SwitchCompat, Float> S = new a(Float.class, "thumbPos");
    public static final int[] T = {R.attr.state_checked};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final TextPaint I;
    public ColorStateList J;
    public Layout K;
    public Layout L;
    public TransformationMethod M;
    public ObjectAnimator N;
    public final AppCompatTextHelper O;
    public AppCompatEmojiTextHelper P;
    public c Q;
    public final Rect R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f1660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f1661b;
    public PorterDuff.Mode c;
    public boolean d;
    public boolean e;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1662k;
    public int l;
    public int m;
    public boolean n;
    public CharSequence o;
    public CharSequence p;
    public CharSequence q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f1663r;
    public boolean s;
    public int t;
    public int u;
    public float v;
    public float w;
    public VelocityTracker x;
    public int y;
    public float z;

    public class a extends Property<SwitchCompat, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.z);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    @RequiresApi(18)
    public static class b {
        public static void a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    public static class c extends androidx.emoji2.text.c.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference<SwitchCompat> f1664a;

        public c(SwitchCompat switchCompat) {
            this.f1664a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.c.e
        public void a(Throwable th) {
            SwitchCompat switchCompat = this.f1664a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.c.e
        public void b() {
            SwitchCompat switchCompat = this.f1664a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public static float f(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.P == null) {
            this.P = new AppCompatEmojiTextHelper(this);
        }
        return this.P;
    }

    private boolean getTargetCheckedState() {
        return this.z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((eyq.b(this) ? 1.0f - this.z : this.z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1660a;
        Rect rectD = drawable2 != null ? x47.d(drawable2) : x47.c;
        return ((((this.A - this.C) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.q = charSequence;
        this.f1663r = g(charSequence);
        this.L = null;
        if (this.s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.o = charSequence;
        this.p = g(charSequence);
        this.K = null;
        if (this.s) {
            p();
        }
    }

    public final void a(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, S, z ? 1.0f : 0.0f);
        this.N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        b.a(this.N, true);
        this.N.start();
    }

    public final void b() {
        Drawable drawable = this.f1660a;
        if (drawable != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = k47.r(drawable).mutate();
                this.f1660a = drawableMutate;
                if (this.d) {
                    k47.o(drawableMutate, this.f1661b);
                }
                if (this.e) {
                    k47.p(this.f1660a, this.c);
                }
                if (this.f1660a.isStateful()) {
                    this.f1660a.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable drawableMutate = k47.r(drawable).mutate();
                this.f = drawableMutate;
                if (this.i) {
                    k47.o(drawableMutate, this.g);
                }
                if (this.j) {
                    k47.p(this.f, this.h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.R;
        int i3 = this.D;
        int i4 = this.E;
        int i5 = this.F;
        int i6 = this.G;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1660a;
        Rect rectD = drawable != null ? x47.d(drawable) : x47.c;
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectD != null) {
                int i8 = rectD.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectD.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectD.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectD.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1660a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.C + rect.right;
            this.f1660a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                k47.l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1660a;
        if (drawable != null) {
            k47.k(drawable, f, f2);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            k47.k(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1660a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.M);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!eyq.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (eyq.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return s8p.q(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.s;
    }

    public boolean getSplitTrack() {
        return this.n;
    }

    public int getSwitchMinWidth() {
        return this.l;
    }

    public int getSwitchPadding() {
        return this.m;
    }

    public CharSequence getTextOff() {
        return this.q;
    }

    public CharSequence getTextOn() {
        return this.o;
    }

    public Drawable getThumbDrawable() {
        return this.f1660a;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getThumbPosition() {
        return this.z;
    }

    public int getThumbTextPadding() {
        return this.f1662k;
    }

    public ColorStateList getThumbTintList() {
        return this.f1661b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    public ColorStateList getTrackTintList() {
        return this.g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.h;
    }

    public final boolean h(float f, float f2) {
        if (this.f1660a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1660a.getPadding(this.R);
        int i = this.E;
        int i2 = this.u;
        int i3 = i - i2;
        int i4 = (this.D + thumbOffset) - i2;
        int i5 = this.C + i4;
        Rect rect = this.R;
        return f > ((float) i4) && f < ((float) (((i5 + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.G + i2));
    }

    public final Layout i(CharSequence charSequence) {
        TextPaint textPaint = this.I;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void j() {
        setTextOnInternal(this.o);
        setTextOffInternal(this.q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1660a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.N.end();
        this.N = null;
    }

    public final void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.q;
            if (string == null) {
                string = getResources().getString(i2j.d);
            }
            androidx.core.view.c.N0(this, string);
        }
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.o;
            if (string == null) {
                string = getResources().getString(i2j.e);
            }
            androidx.core.view.c.N0(this, string);
        }
    }

    public void m(Context context, int i) {
        xfp xfpVarT = xfp.t(context, i, z5j.c3);
        ColorStateList colorStateListC = xfpVarT.c(z5j.g3);
        if (colorStateListC != null) {
            this.J = colorStateListC;
        } else {
            this.J = getTextColors();
        }
        int iF = xfpVarT.f(z5j.d3, 0);
        if (iF != 0) {
            float f = iF;
            if (f != this.I.getTextSize()) {
                this.I.setTextSize(f);
                requestLayout();
            }
        }
        o(xfpVarT.k(z5j.e3, -1), xfpVarT.k(z5j.f3, -1));
        if (xfpVarT.a(z5j.l3, false)) {
            this.M = new l61(getContext());
        } else {
            this.M = null;
        }
        setTextOnInternal(this.o);
        setTextOffInternal(this.q);
        xfpVarT.w();
    }

    public void n(Typeface typeface, int i) {
        if (i <= 0) {
            this.I.setFakeBoldText(false);
            this.I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i2 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i;
            this.I.setFakeBoldText((i2 & 1) != 0);
            this.I.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public final void o(int i, int i2) {
        Typeface typeface;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i != 2) {
            typeface = i != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        n(typeface, i2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, T);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.R;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.E;
        int i2 = this.G;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f1660a;
        if (drawable != null) {
            if (!this.n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = x47.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.K : this.L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.J;
            if (colorStateList != null) {
                this.I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.o : this.q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int i5;
        int paddingTop;
        int height;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f1660a != null) {
            Rect rect = this.R;
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = x47.d(this.f1660a);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (eyq.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i5 = this.B;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.B;
            }
            this.D = paddingLeft;
            this.E = paddingTop;
            this.G = height;
            this.F = width;
        }
        int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
        i5 = this.B;
        paddingTop = paddingTop2 - (i5 / 2);
        height = i5 + paddingTop;
        this.D = paddingLeft;
        this.E = paddingTop;
        this.G = height;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.s) {
            if (this.K == null) {
                this.K = i(this.p);
            }
            if (this.L == null) {
                this.L = i(this.f1663r);
            }
        }
        Rect rect = this.R;
        Drawable drawable = this.f1660a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f1660a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f1660a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.C = Math.max(this.s ? Math.max(this.K.getWidth(), this.L.getWidth()) + (this.f1662k * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f1660a;
        if (drawable3 != null) {
            Rect rectD = x47.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.H ? Math.max(this.l, (this.C * 2) + iMax + iMax2) : this.l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.A = iMax3;
        this.B = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.o : this.q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        this.x.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (isEnabled() && h(x, y)) {
                this.t = 1;
                this.v = x;
                this.w = y;
            }
        } else if (actionMasked == 1) {
            if (this.t == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.t = 0;
            this.x.clear();
        } else if (actionMasked == 2) {
            int i = this.t;
            if (i == 1) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (Math.abs(x2 - this.v) > this.u || Math.abs(y2 - this.w) > this.u) {
                    this.t = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.v = x2;
                    this.w = y2;
                    return true;
                }
            } else if (i == 2) {
                float x3 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f2 = x3 - this.v;
                if (thumbScrollRange != 0) {
                    f = f2 / thumbScrollRange;
                } else {
                    f = f2 > 0.0f ? 1.0f : -1.0f;
                }
                if (eyq.b(this)) {
                    f = -f;
                }
                float f3 = f(this.z + f, 0.0f, 1.0f);
                if (f3 != this.z) {
                    this.v = x3;
                    setThumbPosition(f3);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.t == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.t = 0;
            this.x.clear();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (this.Q == null && this.P.b() && androidx.emoji2.text.c.h()) {
            androidx.emoji2.text.c cVarB = androidx.emoji2.text.c.b();
            int iD = cVarB.d();
            if (iD == 3 || iD == 0) {
                c cVar = new c(this);
                this.Q = cVar;
                cVarB.s(cVar);
            }
        }
    }

    public final void q(MotionEvent motionEvent) {
        this.t = 0;
        boolean targetCheckedState = true;
        boolean z = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z) {
            this.x.computeCurrentVelocity(1000);
            float xVelocity = this.x.getXVelocity();
            if (Math.abs(xVelocity) <= this.y) {
                targetCheckedState = getTargetCheckedState();
            } else if (!eyq.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && androidx.core.view.c.U(this)) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(s8p.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
        setTextOnInternal(this.o);
        setTextOffInternal(this.q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.H = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.s != z) {
            this.s = z;
            requestLayout();
            if (z) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.n = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.m = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.I.getTypeface() == null || this.I.getTypeface().equals(typeface)) && (this.I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1660a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1660a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.z = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(of1.b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f1662k = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1661b = colorStateList;
        this.d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(of1.b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        this.i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        this.j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1660a || drawable == this.f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qii.O);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1661b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.x = VelocityTracker.obtain();
        this.H = true;
        this.R = new Rect();
        f9p.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        xfp xfpVarV = xfp.v(context, attributeSet, z5j.N2, i, 0);
        androidx.core.view.c.p0(this, context, z5j.N2, attributeSet, xfpVarV.r(), i, 0);
        Drawable drawableG = xfpVarV.g(z5j.Q2);
        this.f1660a = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = xfpVarV.g(z5j.Z2);
        this.f = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(xfpVarV.p(z5j.O2));
        setTextOffInternal(xfpVarV.p(z5j.P2));
        this.s = xfpVarV.a(z5j.R2, true);
        this.f1662k = xfpVarV.f(z5j.W2, 0);
        this.l = xfpVarV.f(z5j.T2, 0);
        this.m = xfpVarV.f(z5j.U2, 0);
        this.n = xfpVarV.a(z5j.S2, false);
        ColorStateList colorStateListC = xfpVarV.c(z5j.X2);
        if (colorStateListC != null) {
            this.f1661b = colorStateListC;
            this.d = true;
        }
        PorterDuff.Mode modeE = x47.e(xfpVarV.k(z5j.Y2, -1), null);
        if (this.c != modeE) {
            this.c = modeE;
            this.e = true;
        }
        if (this.d || this.e) {
            b();
        }
        ColorStateList colorStateListC2 = xfpVarV.c(z5j.a3);
        if (colorStateListC2 != null) {
            this.g = colorStateListC2;
            this.i = true;
        }
        PorterDuff.Mode modeE2 = x47.e(xfpVarV.k(z5j.b3, -1), null);
        if (this.h != modeE2) {
            this.h = modeE2;
            this.j = true;
        }
        if (this.i || this.j) {
            c();
        }
        int iN = xfpVarV.n(z5j.V2, 0);
        if (iN != 0) {
            m(context, iN);
        }
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.O = appCompatTextHelper;
        appCompatTextHelper.m(attributeSet, i);
        xfpVarV.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
