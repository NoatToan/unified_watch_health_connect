package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.cardview.widget.CardView;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.g8f;
import defpackage.i3m;
import defpackage.k3j;
import defpackage.m8f;
import defpackage.n8f;
import defpackage.of1;
import defpackage.pii;
import defpackage.r2m;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialCardView extends CardView implements Checkable, i3m {
    public static final int[] n = {R.attr.state_checkable};
    public static final int[] o = {R.attr.state_checked};
    public static final int[] p = {pii.Z};
    public static final int q = k3j.u;
    public final g8f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8606k;
    public boolean l;
    public boolean m;

    public interface a {
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.j.j().getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.j.k();
    }

    public ColorStateList getCardForegroundColor() {
        return this.j.l();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.j.m();
    }

    public int getCheckedIconGravity() {
        return this.j.n();
    }

    @Dimension
    public int getCheckedIconMargin() {
        return this.j.o();
    }

    @Dimension
    public int getCheckedIconSize() {
        return this.j.p();
    }

    public ColorStateList getCheckedIconTint() {
        return this.j.q();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.j.A().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.j.A().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.j.A().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.j.A().top;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.j.u();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.j.s();
    }

    public ColorStateList getRippleColor() {
        return this.j.v();
    }

    public r2m getShapeAppearanceModel() {
        return this.j.w();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.j.x();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.j.y();
    }

    @Dimension
    public int getStrokeWidth() {
        return this.j.z();
    }

    public final void i() {
        if (Build.VERSION.SDK_INT > 26) {
            this.j.i();
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.l;
    }

    public boolean j() {
        g8f g8fVar = this.j;
        return g8fVar != null && g8fVar.D();
    }

    public boolean k() {
        return this.m;
    }

    public void l(int i, int i2, int i3, int i4) {
        super.g(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8f.f(this, this.j.j());
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (j()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, n);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, o);
        }
        if (k()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, p);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(j());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.j.H(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f8606k) {
            if (!this.j.C()) {
                this.j.I(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.j.J(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.j.d0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.j.K(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.j.L(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.l != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.j.N(drawable);
    }

    public void setCheckedIconGravity(int i) {
        if (this.j.n() != i) {
            this.j.O(i);
        }
    }

    public void setCheckedIconMargin(@Dimension int i) {
        this.j.P(i);
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.j.P(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(int i) {
        this.j.N(of1.b(getContext(), i));
    }

    public void setCheckedIconSize(@Dimension int i) {
        this.j.Q(i);
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.j.Q(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.j.R(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        g8f g8fVar = this.j;
        if (g8fVar != null) {
            g8fVar.b0();
        }
    }

    public void setDragged(boolean z) {
        if (this.m != z) {
            this.m = z;
            refreshDrawableState();
            i();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.j.f0();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.j.f0();
        this.j.c0();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.j.T(f);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.j.S(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.j.U(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.j.U(of1.a(getContext(), i));
    }

    @Override // defpackage.i3m
    public void setShapeAppearanceModel(r2m r2mVar) {
        setClipToOutline(r2mVar.u(getBoundsAsRectF()));
        this.j.V(r2mVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(@Dimension int i) {
        this.j.X(i);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.j.f0();
        this.j.c0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (j() && isEnabled()) {
            this.l = !this.l;
            refreshDrawableState();
            i();
            this.j.M(this.l);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.H);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.j.J(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.j.W(colorStateList);
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        int i2 = q;
        super(n8f.c(context, attributeSet, i, i2), attributeSet, i);
        this.l = false;
        this.m = false;
        this.f8606k = true;
        TypedArray typedArrayH = c9p.h(getContext(), attributeSet, b4j.L4, i, i2, new int[0]);
        g8f g8fVar = new g8f(this, attributeSet, i, i2);
        this.j = g8fVar;
        g8fVar.J(super.getCardBackgroundColor());
        g8fVar.Y(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        g8fVar.G(typedArrayH);
        typedArrayH.recycle();
    }
}
