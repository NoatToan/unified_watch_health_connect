package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.Dimension;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.c;
import androidx.customview.view.AbsSavedState;
import defpackage.ayq;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.f8f;
import defpackage.i3m;
import defpackage.k3j;
import defpackage.k47;
import defpackage.k8f;
import defpackage.m8f;
import defpackage.n8f;
import defpackage.of1;
import defpackage.pii;
import defpackage.r2m;
import defpackage.s8p;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialButton extends AppCompatButton implements Checkable, i3m {
    public static final int[] q = {R.attr.state_checkable};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f8595r = {R.attr.state_checked};
    public static final int s = k3j.t;
    public final f8f d;
    public final LinkedHashSet<a> e;
    public b f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8596k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public int p;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8597b;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void c(Parcel parcel) {
            this.f8597b = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f8597b ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            c(parcel);
        }
    }

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    public boolean a() {
        f8f f8fVar = this.d;
        return f8fVar != null && f8fVar.p();
    }

    public void addOnCheckedChangeListener(a aVar) {
        this.e.add(aVar);
    }

    public final boolean b() {
        int i = this.p;
        return i == 3 || i == 4;
    }

    public final boolean c() {
        int i = this.p;
        return i == 1 || i == 2;
    }

    public final boolean d() {
        int i = this.p;
        return i == 16 || i == 32;
    }

    public final boolean e() {
        return c.A(this) == 1;
    }

    public final boolean f() {
        f8f f8fVar = this.d;
        return (f8fVar == null || f8fVar.o()) ? false : true;
    }

    public final void g() {
        if (c()) {
            s8p.j(this, this.i, null, null, null);
        } else if (b()) {
            s8p.j(this, null, null, this.i, null);
        } else if (d()) {
            s8p.j(this, null, this.i, null, null);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.p;
    }

    public int getIconPadding() {
        return this.m;
    }

    public int getIconSize() {
        return this.j;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    @Dimension
    public int getInsetBottom() {
        return this.d.c();
    }

    @Dimension
    public int getInsetTop() {
        return this.d.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.d.h();
        }
        return null;
    }

    public r2m getShapeAppearanceModel() {
        if (f()) {
            return this.d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.d.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.d.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.d.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.d.m() : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable drawableMutate = k47.r(drawable).mutate();
            this.i = drawableMutate;
            k47.o(drawableMutate, this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                k47.p(this.i, mode);
            }
            int intrinsicWidth = this.j;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.j;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i = this.f8596k;
            int i2 = this.l;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.i.setVisible(true, z);
        }
        if (z) {
            g();
            return;
        }
        Drawable[] drawableArrA = s8p.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        if ((!c() || drawable3 == this.i) && ((!b() || drawable5 == this.i) && (!d() || drawable4 == this.i))) {
            return;
        }
        g();
    }

    public final void i(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f8596k = 0;
                if (this.p == 16) {
                    this.l = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.j;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.i.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.m) - getPaddingBottom()) / 2;
                if (this.l != textHeight) {
                    this.l = textHeight;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.l = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i3 = this.p;
        if (i3 == 1 || i3 == 3 || ((i3 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i3 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f8596k = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.j;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.i.getIntrinsicWidth();
        }
        int textWidth = ((((i - getTextWidth()) - c.E(this)) - intrinsicWidth) - this.m) - c.F(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textWidth /= 2;
        }
        if (e() != (this.p == 4)) {
            textWidth = -textWidth;
        }
        if (this.f8596k != textWidth) {
            this.f8596k = textWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.n;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            m8f.f(this, this.d.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, q);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f8595r);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f8597b);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f8597b = this.n;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void removeOnCheckedChangeListener(a aVar) {
        this.e.remove(aVar);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (f()) {
            this.d.r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
        } else {
            this.d.s();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? of1.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (f()) {
            this.d.t(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.n != z) {
            this.n = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.n);
            }
            if (this.o) {
                return;
            }
            this.o = true;
            Iterator<a> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.n);
            }
            this.o = false;
        }
    }

    public void setCornerRadius(int i) {
        if (f()) {
            this.d.u(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        if (f()) {
            this.d.f().a0(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.p != i) {
            this.p = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.m != i) {
            this.m = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? of1.b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.j != i) {
            this.j = i;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(of1.a(getContext(), i));
    }

    public void setInsetBottom(@Dimension int i) {
        this.d.v(i);
    }

    public void setInsetTop(@Dimension int i) {
        this.d.w(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.d.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (f()) {
            setRippleColor(of1.a(getContext(), i));
        }
    }

    @Override // defpackage.i3m
    public void setShapeAppearanceModel(r2m r2mVar) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.y(r2mVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (f()) {
            this.d.z(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.d.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (f()) {
            setStrokeColor(of1.a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (f()) {
            this.d.B(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.d.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.d.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.n);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.C);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = s;
        super(n8f.c(context, attributeSet, i, i2), attributeSet, i);
        this.e = new LinkedHashSet<>();
        this.n = false;
        this.o = false;
        Context context2 = getContext();
        TypedArray typedArrayH = c9p.h(context2, attributeSet, b4j.T3, i, i2, new int[0]);
        this.m = typedArrayH.getDimensionPixelSize(b4j.g4, 0);
        this.g = ayq.k(typedArrayH.getInt(b4j.j4, -1), PorterDuff.Mode.SRC_IN);
        this.h = k8f.b(getContext(), typedArrayH, b4j.i4);
        this.i = k8f.e(getContext(), typedArrayH, b4j.e4);
        this.p = typedArrayH.getInteger(b4j.f4, 1);
        this.j = typedArrayH.getDimensionPixelSize(b4j.h4, 0);
        f8f f8fVar = new f8f(this, r2m.e(context2, attributeSet, i, i2).m());
        this.d = f8fVar;
        f8fVar.q(typedArrayH);
        typedArrayH.recycle();
        setCompoundDrawablePadding(this.m);
        h(this.i != null);
    }
}
