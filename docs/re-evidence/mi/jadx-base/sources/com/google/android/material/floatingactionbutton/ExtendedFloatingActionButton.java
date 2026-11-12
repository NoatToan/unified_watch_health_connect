package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import defpackage.ad1;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.jz5;
import defpackage.k3j;
import defpackage.n8f;
import defpackage.p92;
import defpackage.pii;
import defpackage.r2m;
import defpackage.u8g;
import defpackage.ygi;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final int H = k3j.B;
    public static final Property<View, Float> I = new d(Float.class, "width");
    public static final Property<View, Float> J = new e(Float.class, "height");
    public static final Property<View, Float> K = new f(Float.class, "paddingStart");
    public static final Property<View, Float> L = new g(Float.class, "paddingEnd");
    public int A;
    public int B;
    public final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> C;
    public boolean D;
    public boolean E;
    public boolean F;
    public ColorStateList G;
    public int t;
    public final ad1 u;
    public final com.google.android.material.floatingactionbutton.b v;
    public final com.google.android.material.floatingactionbutton.b w;
    public final com.google.android.material.floatingactionbutton.b x;
    public final com.google.android.material.floatingactionbutton.b y;
    public final int z;

    public class a implements l {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public ViewGroup.LayoutParams a() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.B;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.A;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.A + ExtendedFloatingActionButton.this.B;
        }
    }

    public class b implements l {
        public b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public ViewGroup.LayoutParams a() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.floatingactionbutton.b f8707b;

        public c(com.google.android.material.floatingactionbutton.b bVar, j jVar) {
            this.f8707b = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8706a = true;
            this.f8707b.h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8707b.onAnimationEnd();
            if (this.f8706a) {
                return;
            }
            this.f8707b.f(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f8707b.onAnimationStart(animator);
            this.f8706a = false;
        }
    }

    public class d extends Property<View, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    public class e extends Property<View, Float> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    public class f extends Property<View, Float> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(androidx.core.view.c.F(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            androidx.core.view.c.J0(view, f.intValue(), view.getPaddingTop(), androidx.core.view.c.E(view), view.getPaddingBottom());
        }
    }

    public class g extends Property<View, Float> {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(androidx.core.view.c.E(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            androidx.core.view.c.J0(view, androidx.core.view.c.F(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    public class h extends p92 {
        public final l g;
        public final boolean h;

        public h(ad1 ad1Var, l lVar, boolean z) {
            super(ExtendedFloatingActionButton.this, ad1Var);
            this.g = lVar;
            this.h = z;
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public boolean b() {
            return this.h == ExtendedFloatingActionButton.this.D || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public int d() {
            return this.h ? ygi.f : ygi.e;
        }

        @Override // defpackage.p92, com.google.android.material.floatingactionbutton.b
        public AnimatorSet e() {
            u8g u8gVarL = l();
            if (u8gVarL.j("width")) {
                PropertyValuesHolder[] propertyValuesHolderArrG = u8gVarL.g("width");
                propertyValuesHolderArrG[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.g.getWidth());
                u8gVarL.l("width", propertyValuesHolderArrG);
            }
            if (u8gVarL.j("height")) {
                PropertyValuesHolder[] propertyValuesHolderArrG2 = u8gVarL.g("height");
                propertyValuesHolderArrG2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.g.getHeight());
                u8gVarL.l("height", propertyValuesHolderArrG2);
            }
            if (u8gVarL.j("paddingStart")) {
                PropertyValuesHolder[] propertyValuesHolderArrG3 = u8gVarL.g("paddingStart");
                propertyValuesHolderArrG3[0].setFloatValues(androidx.core.view.c.F(ExtendedFloatingActionButton.this), this.g.getPaddingStart());
                u8gVarL.l("paddingStart", propertyValuesHolderArrG3);
            }
            if (u8gVarL.j("paddingEnd")) {
                PropertyValuesHolder[] propertyValuesHolderArrG4 = u8gVarL.g("paddingEnd");
                propertyValuesHolderArrG4[0].setFloatValues(androidx.core.view.c.E(ExtendedFloatingActionButton.this), this.g.getPaddingEnd());
                u8gVarL.l("paddingEnd", propertyValuesHolderArrG4);
            }
            if (u8gVarL.j("labelOpacity")) {
                PropertyValuesHolder[] propertyValuesHolderArrG5 = u8gVarL.g("labelOpacity");
                boolean z = this.h;
                propertyValuesHolderArrG5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                u8gVarL.l("labelOpacity", propertyValuesHolderArrG5);
            }
            return super.k(u8gVarL);
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void f(j jVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void g() {
            ExtendedFloatingActionButton.this.D = this.h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.g.a().width;
            layoutParams.height = this.g.a().height;
            androidx.core.view.c.J0(ExtendedFloatingActionButton.this, this.g.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.g.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // defpackage.p92, com.google.android.material.floatingactionbutton.b
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.E = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.g.a().width;
            layoutParams.height = this.g.a().height;
        }

        @Override // defpackage.p92, com.google.android.material.floatingactionbutton.b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.D = this.h;
            ExtendedFloatingActionButton.this.E = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    public class i extends p92 {
        public boolean g;

        public i(ad1 ad1Var) {
            super(ExtendedFloatingActionButton.this, ad1Var);
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public boolean b() {
            return ExtendedFloatingActionButton.this.w();
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public int d() {
            return ygi.g;
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void f(j jVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void g() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // defpackage.p92, com.google.android.material.floatingactionbutton.b
        public void h() {
            super.h();
            this.g = true;
        }

        @Override // defpackage.p92, com.google.android.material.floatingactionbutton.b
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.t = 0;
            if (this.g) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // defpackage.p92, com.google.android.material.floatingactionbutton.b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.t = 1;
        }
    }

    public static abstract class j {
    }

    public class k extends p92 {
        public k(ad1 ad1Var) {
            super(ExtendedFloatingActionButton.this, ad1Var);
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public boolean b() {
            return ExtendedFloatingActionButton.this.x();
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public int d() {
            return ygi.h;
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void f(j jVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void g() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // defpackage.p92, com.google.android.material.floatingactionbutton.b
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.t = 0;
        }

        @Override // defpackage.p92, com.google.android.material.floatingactionbutton.b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.t = 2;
        }
    }

    public interface l {
        ViewGroup.LayoutParams a();

        int getHeight();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w() {
        if (getVisibility() == 0) {
            return this.t == 1;
        }
        return this.t != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x() {
        if (getVisibility() != 0) {
            return this.t == 2;
        }
        return this.t != 1;
    }

    public final boolean A() {
        return (androidx.core.view.c.U(this) || (!x() && this.F)) && !isInEditMode();
    }

    public void B(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.C;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @VisibleForTesting
    public int getCollapsedSize() {
        int i2 = this.z;
        return i2 < 0 ? (Math.min(androidx.core.view.c.F(this), androidx.core.view.c.E(this)) * 2) + getIconSize() : i2;
    }

    public u8g getExtendMotionSpec() {
        return this.w.a();
    }

    public u8g getHideMotionSpec() {
        return this.y.a();
    }

    public u8g getShowMotionSpec() {
        return this.x.a();
    }

    public u8g getShrinkMotionSpec() {
        return this.v.a();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.D && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.D = false;
            this.v.g();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.F = z;
    }

    public void setExtendMotionSpec(u8g u8gVar) {
        this.w.c(u8gVar);
    }

    public void setExtendMotionSpecResource(int i2) {
        setExtendMotionSpec(u8g.d(getContext(), i2));
    }

    public void setExtended(boolean z) {
        if (this.D == z) {
            return;
        }
        com.google.android.material.floatingactionbutton.b bVar = z ? this.w : this.v;
        if (bVar.b()) {
            return;
        }
        bVar.g();
    }

    public void setHideMotionSpec(u8g u8gVar) {
        this.y.c(u8gVar);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(u8g.d(getContext(), i2));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(i2, i3, i4, i5);
        if (!this.D || this.E) {
            return;
        }
        this.A = androidx.core.view.c.F(this);
        this.B = androidx.core.view.c.E(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(i2, i3, i4, i5);
        if (!this.D || this.E) {
            return;
        }
        this.A = i2;
        this.B = i4;
    }

    public void setShowMotionSpec(u8g u8gVar) {
        this.x.c(u8gVar);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(u8g.d(getContext(), i2));
    }

    public void setShrinkMotionSpec(u8g u8gVar) {
        this.v.c(u8gVar);
    }

    public void setShrinkMotionSpecResource(int i2) {
        setShrinkMotionSpec(u8g.d(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i2) {
        super.setTextColor(i2);
        z();
    }

    public final void y(com.google.android.material.floatingactionbutton.b bVar, j jVar) {
        if (bVar.b()) {
            return;
        }
        if (!A()) {
            bVar.g();
            bVar.f(jVar);
            return;
        }
        measure(0, 0);
        AnimatorSet animatorSetE = bVar.e();
        animatorSetE.addListener(new c(bVar, jVar));
        Iterator<Animator.AnimatorListener> it = bVar.i().iterator();
        while (it.hasNext()) {
            animatorSetE.addListener(it.next());
        }
        animatorSetE.start();
    }

    public final void z() {
        this.G = getTextColors();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.y);
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f8702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8703b;
        public boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f8703b = false;
            this.c = true;
        }

        public static boolean c(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.y(this.c ? extendedFloatingActionButton.w : extendedFloatingActionButton.x, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                h(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!c(view)) {
                return false;
            }
            i(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> listP = coordinatorLayout.p(extendedFloatingActionButton);
            int size = listP.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = listP.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (c(view) && i(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (h(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.G(extendedFloatingActionButton, i);
            return true;
        }

        public final boolean f(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f8703b || this.c) && ((CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        public void g(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.y(this.c ? extendedFloatingActionButton.v : extendedFloatingActionButton.y, null);
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!f(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f8702a == null) {
                this.f8702a = new Rect();
            }
            Rect rect = this.f8702a;
            jz5.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                g(extendedFloatingActionButton);
                return true;
            }
            a(extendedFloatingActionButton);
            return true;
        }

        public final boolean i(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!f(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                g(extendedFloatingActionButton);
                return true;
            }
            a(extendedFloatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(CoordinatorLayout.e eVar) {
            if (eVar.h == 0) {
                eVar.h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b4j.O2);
            this.f8703b = typedArrayObtainStyledAttributes.getBoolean(b4j.P2, false);
            this.c = typedArrayObtainStyledAttributes.getBoolean(b4j.Q2, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        int i3 = H;
        super(n8f.c(context, attributeSet, i2, i3), attributeSet, i2);
        this.t = 0;
        ad1 ad1Var = new ad1();
        this.u = ad1Var;
        k kVar = new k(ad1Var);
        this.x = kVar;
        i iVar = new i(ad1Var);
        this.y = iVar;
        this.D = true;
        this.E = false;
        this.F = false;
        Context context2 = getContext();
        this.C = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayH = c9p.h(context2, attributeSet, b4j.I2, i2, i3, new int[0]);
        u8g u8gVarC = u8g.c(context2, typedArrayH, b4j.M2);
        u8g u8gVarC2 = u8g.c(context2, typedArrayH, b4j.L2);
        u8g u8gVarC3 = u8g.c(context2, typedArrayH, b4j.K2);
        u8g u8gVarC4 = u8g.c(context2, typedArrayH, b4j.N2);
        this.z = typedArrayH.getDimensionPixelSize(b4j.J2, -1);
        this.A = androidx.core.view.c.F(this);
        this.B = androidx.core.view.c.E(this);
        ad1 ad1Var2 = new ad1();
        h hVar = new h(ad1Var2, new a(), true);
        this.w = hVar;
        h hVar2 = new h(ad1Var2, new b(), false);
        this.v = hVar2;
        kVar.c(u8gVarC);
        iVar.c(u8gVarC2);
        hVar.c(u8gVarC3);
        hVar2.c(u8gVarC4);
        typedArrayH.recycle();
        setShapeAppearanceModel(r2m.g(context2, attributeSet, i2, i3, r2m.m).m());
        z();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        z();
    }
}
