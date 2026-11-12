package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import defpackage.ayq;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.g6i;
import defpackage.i3m;
import defpackage.jf1;
import defpackage.jz5;
import defpackage.k3j;
import defpackage.k47;
import defpackage.k8f;
import defpackage.lf1;
import defpackage.myp;
import defpackage.n8f;
import defpackage.p2m;
import defpackage.pii;
import defpackage.pmi;
import defpackage.r2m;
import defpackage.sy9;
import defpackage.u8g;
import defpackage.yi8;
import defpackage.zi8;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements yi8, i3m, CoordinatorLayout.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f8708r = k3j.l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f8709b;
    public PorterDuff.Mode c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public ColorStateList f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8710k;
    public boolean l;
    public final Rect m;
    public final Rect n;
    public final lf1 o;
    public final zi8 p;
    public com.google.android.material.floatingactionbutton.a q;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: d */
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.onLayoutChild(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(CoordinatorLayout.e eVar) {
            super.onAttachedToLayoutParams(eVar);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        @VisibleForTesting
        public /* bridge */ /* synthetic */ void setInternalAutoHideListener(b bVar) {
            super.setInternalAutoHideListener(bVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class a implements com.google.android.material.floatingactionbutton.a.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f8713a;

        public a(b bVar) {
            this.f8713a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.a.k
        public void a() {
            this.f8713a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.a.k
        public void b() {
            this.f8713a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    public class c implements p2m {
        public c() {
        }

        @Override // defpackage.p2m
        public void a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.m.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.j, i2 + FloatingActionButton.this.j, i3 + FloatingActionButton.this.j, i4 + FloatingActionButton.this.j);
        }

        @Override // defpackage.p2m
        public boolean b() {
            return FloatingActionButton.this.l;
        }

        @Override // defpackage.p2m
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    public class d<T extends FloatingActionButton> implements com.google.android.material.floatingactionbutton.a.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final myp<T> f8716a;

        public d(myp<T> mypVar) {
            this.f8716a = mypVar;
        }

        @Override // com.google.android.material.floatingactionbutton.a.j
        public void a() {
            this.f8716a.a(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.a.j
        public void b() {
            this.f8716a.b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).f8716a.equals(this.f8716a);
        }

        public int hashCode() {
            return this.f8716a.hashCode();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private com.google.android.material.floatingactionbutton.a getImpl() {
        if (this.q == null) {
            this.q = h();
        }
        return this.q;
    }

    public static int q(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.yi8
    public boolean a() {
        return this.p.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().D(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    public void g(myp<? extends FloatingActionButton> mypVar) {
        getImpl().g(new d(mypVar));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f8709b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().s();
    }

    public Drawable getContentBackground() {
        return getImpl().l();
    }

    public int getCustomSize() {
        return this.i;
    }

    public int getExpandedComponentIdHint() {
        return this.p.b();
    }

    public u8g getHideMotionSpec() {
        return getImpl().o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f;
    }

    public r2m getShapeAppearanceModel() {
        return (r2m) g6i.g(getImpl().t());
    }

    public u8g getShowMotionSpec() {
        return getImpl().u();
    }

    public int getSize() {
        return this.h;
    }

    public int getSizeDimension() {
        return k(this.h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.e;
    }

    public boolean getUseCompatPadding() {
        return this.l;
    }

    public final com.google.android.material.floatingactionbutton.a h() {
        return new sy9(this, new c());
    }

    public void hide(b bVar) {
        l(bVar, true);
    }

    @Deprecated
    public boolean i(Rect rect) {
        if (!androidx.core.view.c.U(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        o(rect);
        return true;
    }

    public void j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        o(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().z();
    }

    public final int k(int i) {
        int i2 = this.i;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(pmi.j) : resources.getDimensionPixelSize(pmi.i);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? k(1) : k(0);
    }

    public void l(b bVar, boolean z) {
        getImpl().v(s(bVar), z);
    }

    public boolean m() {
        return getImpl().x();
    }

    public boolean n() {
        return getImpl().y();
    }

    public final void o(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.m;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().A();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().C();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.j = (sizeDimension - this.f8710k) / 2;
        getImpl().e0();
        int iMin = Math.min(q(sizeDimension, i), q(sizeDimension, i2));
        Rect rect = this.m;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.a());
        this.p.d((Bundle) g6i.g(extendableSavedState.f8836b.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.f8836b.put("expandableWidgetHelper", this.p.e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && i(this.n) && !this.n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.d;
        if (colorStateList == null) {
            k47.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(jf1.e(colorForState, mode));
    }

    public void r(b bVar, boolean z) {
        getImpl().b0(s(bVar), z);
    }

    public final com.google.android.material.floatingactionbutton.a.k s(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f8709b != colorStateList) {
            this.f8709b = colorStateList;
            getImpl().K(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.c != mode) {
            this.c = mode;
            getImpl().L(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().M(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().P(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().T(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.i) {
            this.i = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().f0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().n()) {
            getImpl().N(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.p.f(i);
    }

    public void setHideMotionSpec(u8g u8gVar) {
        getImpl().O(u8gVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(u8g.d(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().d0();
            if (this.d != null) {
                p();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.o.i(i);
        p();
    }

    public void setMaxImageSize(int i) {
        this.f8710k = i;
        getImpl().R(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().H();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().H();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setShadowPaddingEnabled(boolean z) {
        getImpl().V(z);
    }

    @Override // defpackage.i3m
    public void setShapeAppearanceModel(r2m r2mVar) {
        getImpl().W(r2mVar);
    }

    public void setShowMotionSpec(u8g u8gVar) {
        getImpl().X(u8gVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(u8g.d(getContext(), i));
    }

    public void setSize(int i) {
        this.i = 0;
        if (i != this.h) {
            this.h = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            p();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            p();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().I();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().I();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().I();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.l != z) {
            this.l = z;
            getImpl().B();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void show(b bVar) {
        r(bVar, true);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f8711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f8712b;
        public boolean c;

        public BaseBehavior() {
            this.c = true;
        }

        private static boolean b(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final void c(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.m;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) floatingActionButton.getLayoutParams();
            int i2 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) eVar).rightMargin) {
                i = rect.right;
            } else {
                i = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) eVar).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) eVar).topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                androidx.core.view.c.b0(floatingActionButton, i2);
            }
            if (i != 0) {
                androidx.core.view.c.a0(floatingActionButton, i);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                g(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!b(view)) {
                return false;
            }
            h(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> listP = coordinatorLayout.p(floatingActionButton);
            int size = listP.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = listP.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (b(view) && h(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (g(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.G(floatingActionButton, i);
            c(coordinatorLayout, floatingActionButton);
            return true;
        }

        public final boolean f(View view, FloatingActionButton floatingActionButton) {
            return this.c && ((CoordinatorLayout.e) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean g(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!f(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f8711a == null) {
                this.f8711a = new Rect();
            }
            Rect rect = this.f8711a;
            jz5.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.l(this.f8712b, false);
                return true;
            }
            floatingActionButton.r(this.f8712b, false);
            return true;
        }

        public final boolean h(View view, FloatingActionButton floatingActionButton) {
            if (!f(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.l(this.f8712b, false);
                return true;
            }
            floatingActionButton.r(this.f8712b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(CoordinatorLayout.e eVar) {
            if (eVar.h == 0) {
                eVar.h = 80;
            }
        }

        @VisibleForTesting
        public void setInternalAutoHideListener(b bVar) {
            this.f8712b = bVar;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b4j.h3);
            this.c = typedArrayObtainStyledAttributes.getBoolean(b4j.i3, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            getImpl().U(this.f);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = f8708r;
        super(n8f.c(context, attributeSet, i, i2), attributeSet, i);
        this.m = new Rect();
        this.n = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayH = c9p.h(context2, attributeSet, b4j.R2, i, i2, new int[0]);
        this.f8709b = k8f.b(context2, typedArrayH, b4j.T2);
        this.c = ayq.k(typedArrayH.getInt(b4j.U2, -1), null);
        this.f = k8f.b(context2, typedArrayH, b4j.e3);
        this.h = typedArrayH.getInt(b4j.Z2, -1);
        this.i = typedArrayH.getDimensionPixelSize(b4j.Y2, 0);
        this.g = typedArrayH.getDimensionPixelSize(b4j.V2, 0);
        float dimension = typedArrayH.getDimension(b4j.W2, 0.0f);
        float dimension2 = typedArrayH.getDimension(b4j.b3, 0.0f);
        float dimension3 = typedArrayH.getDimension(b4j.d3, 0.0f);
        this.l = typedArrayH.getBoolean(b4j.g3, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(pmi.j0);
        setMaxImageSize(typedArrayH.getDimensionPixelSize(b4j.c3, 0));
        u8g u8gVarC = u8g.c(context2, typedArrayH, b4j.f3);
        u8g u8gVarC2 = u8g.c(context2, typedArrayH, b4j.a3);
        r2m r2mVarM = r2m.g(context2, attributeSet, i, i2, r2m.m).m();
        boolean z = typedArrayH.getBoolean(b4j.X2, false);
        setEnabled(typedArrayH.getBoolean(b4j.S2, true));
        typedArrayH.recycle();
        lf1 lf1Var = new lf1(this);
        this.o = lf1Var;
        lf1Var.g(attributeSet, i);
        this.p = new zi8(this);
        getImpl().W(r2mVarM);
        getImpl().w(this.f8709b, this.c, this.f, this.g);
        getImpl().S(dimensionPixelSize);
        getImpl().M(dimension);
        getImpl().P(dimension2);
        getImpl().T(dimension3);
        getImpl().X(u8gVarC);
        getImpl().O(u8gVarC2);
        getImpl().N(z);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
