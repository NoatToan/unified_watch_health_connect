package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Dimension;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import defpackage.ayq;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.k3j;
import defpackage.k47;
import defpackage.k8f;
import defpackage.l8f;
import defpackage.m8f;
import defpackage.myp;
import defpackage.n8f;
import defpackage.pii;
import defpackage.pmi;
import defpackage.r2m;
import defpackage.w43;
import defpackage.ygi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final int q0 = k3j.s;
    public Integer R;
    public final int S;
    public final l8f T;
    public Animator U;
    public Animator V;
    public int W;
    public int a0;
    public boolean b0;
    public final boolean c0;
    public final boolean d0;
    public final boolean e0;
    public int f0;
    public ArrayList<j> g0;
    public int h0;
    public boolean i0;
    public boolean j0;
    public Behavior k0;
    public int l0;
    public int m0;
    public int n0;
    public AnimatorListenerAdapter o0;
    public myp<FloatingActionButton> p0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8554b;
        public boolean c;

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

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f8554b);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8554b = parcel.readInt();
            this.c = parcel.readInt() != 0;
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (BottomAppBar.this.i0) {
                return;
            }
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.L0(bottomAppBar.W, BottomAppBar.this.j0);
        }
    }

    public class b implements myp<FloatingActionButton> {
        public b() {
        }

        @Override // defpackage.myp
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(FloatingActionButton floatingActionButton) {
            BottomAppBar.this.T.c0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // defpackage.myp
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().h() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().p(translationX);
                BottomAppBar.this.T.invalidateSelf();
            }
            float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().c() != fMax) {
                BottomAppBar.this.getTopEdgeTreatment().i(fMax);
                BottomAppBar.this.T.invalidateSelf();
            }
            BottomAppBar.this.T.c0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    public class c implements ayq.e {
        public c() {
        }

        @Override // ayq.e
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, ayq.f fVar) {
            boolean z;
            if (BottomAppBar.this.c0) {
                BottomAppBar.this.l0 = windowInsetsCompat.j();
            }
            boolean z2 = false;
            if (BottomAppBar.this.d0) {
                z = BottomAppBar.this.n0 != windowInsetsCompat.k();
                BottomAppBar.this.n0 = windowInsetsCompat.k();
            } else {
                z = false;
            }
            if (BottomAppBar.this.e0) {
                boolean z3 = BottomAppBar.this.m0 != windowInsetsCompat.l();
                BottomAppBar.this.m0 = windowInsetsCompat.l();
                z2 = z3;
            }
            if (z || z2) {
                BottomAppBar.this.A0();
                BottomAppBar.this.Q0();
                BottomAppBar.this.P0();
            }
            return windowInsetsCompat;
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.E0();
            BottomAppBar.this.U = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.F0();
        }
    }

    public class e extends FloatingActionButton.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8559a;

        public class a extends FloatingActionButton.b {
            public a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.E0();
            }
        }

        public e(int i) {
            this.f8559a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.J0(this.f8559a));
            floatingActionButton.show(new a());
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.E0();
            BottomAppBar.this.i0 = false;
            BottomAppBar.this.V = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.F0();
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f8564b;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;

        public g(ActionMenuView actionMenuView, int i, boolean z) {
            this.f8564b = actionMenuView;
            this.c = i;
            this.d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8563a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f8563a) {
                return;
            }
            boolean z = BottomAppBar.this.h0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.O0(bottomAppBar.h0);
            BottomAppBar.this.U0(this.f8564b, this.c, this.d, z);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f8565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f8566b;
        public final /* synthetic */ boolean c;

        public h(ActionMenuView actionMenuView, int i, boolean z) {
            this.f8565a = actionMenuView;
            this.f8566b = i;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f8565a;
            actionMenuView.setTranslationX(BottomAppBar.this.I0(actionMenuView, this.f8566b, this.c));
        }
    }

    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.o0.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonG0 = BottomAppBar.this.G0();
            if (floatingActionButtonG0 != null) {
                floatingActionButtonG0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    public interface j {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    public BottomAppBar(Context context) {
        this(context, null);
    }

    private Drawable N0(Drawable drawable) {
        if (drawable == null || this.R == null) {
            return drawable;
        }
        Drawable drawableR = k47.r(drawable.mutate());
        k47.n(drawableR, this.R.intValue());
        return drawableR;
    }

    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.l0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return J0(this.W);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.n0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.m0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w43 getTopEdgeTreatment() {
        return (w43) this.T.E().p();
    }

    public final void A0() {
        Animator animator = this.V;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.U;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public void B0(int i2, List<Animator> list) {
        FloatingActionButton floatingActionButtonG0 = G0();
        if (floatingActionButtonG0 == null || floatingActionButtonG0.m()) {
            return;
        }
        F0();
        floatingActionButtonG0.hide(new e(i2));
    }

    public final void C0(int i2, List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(G0(), EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, J0(i2));
        objectAnimatorOfFloat.setDuration(300L);
        list.add(objectAnimatorOfFloat);
    }

    public final void D0(int i2, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, SleepAnalyzerAlpha.NAME_ALPHA, 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - I0(actionMenuView, i2, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, SleepAnalyzerAlpha.NAME_ALPHA, 0.0f);
            objectAnimatorOfFloat.addListener(new g(actionMenuView, i2, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
            list.add(animatorSet);
        }
    }

    public final void E0() {
        ArrayList<j> arrayList;
        int i2 = this.f0 - 1;
        this.f0 = i2;
        if (i2 != 0 || (arrayList = this.g0) == null) {
            return;
        }
        Iterator<j> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final void F0() {
        ArrayList<j> arrayList;
        int i2 = this.f0;
        this.f0 = i2 + 1;
        if (i2 != 0 || (arrayList = this.g0) == null) {
            return;
        }
        Iterator<j> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public final FloatingActionButton G0() {
        View viewH0 = H0();
        if (viewH0 instanceof FloatingActionButton) {
            return (FloatingActionButton) viewH0;
        }
        return null;
    }

    public final View H0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).q(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public int I0(ActionMenuView actionMenuView, int i2, boolean z) {
        if (i2 != 1 || !z) {
            return 0;
        }
        boolean zJ = ayq.j(this);
        int measuredWidth = zJ ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f1402a & 8388615) == 8388611) {
                measuredWidth = zJ ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((zJ ? actionMenuView.getRight() : actionMenuView.getLeft()) + (zJ ? this.m0 : -this.n0));
    }

    public final float J0(int i2) {
        boolean zJ = ayq.j(this);
        if (i2 == 1) {
            return ((getMeasuredWidth() / 2) - (this.S + (zJ ? this.n0 : this.m0))) * (zJ ? -1 : 1);
        }
        return 0.0f;
    }

    public final boolean K0() {
        FloatingActionButton floatingActionButtonG0 = G0();
        return floatingActionButtonG0 != null && floatingActionButtonG0.n();
    }

    public final void L0(int i2, boolean z) {
        if (!androidx.core.view.c.U(this)) {
            this.i0 = false;
            O0(this.h0);
            return;
        }
        Animator animator = this.V;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!K0()) {
            i2 = 0;
            z = false;
        }
        D0(i2, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.V = animatorSet;
        animatorSet.addListener(new f());
        this.V.start();
    }

    public final void M0(int i2) {
        if (this.W == i2 || !androidx.core.view.c.U(this)) {
            return;
        }
        Animator animator = this.U;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.a0 == 1) {
            C0(i2, arrayList);
        } else {
            B0(i2, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.U = animatorSet;
        animatorSet.addListener(new d());
        this.U.start();
    }

    public void O0(int i2) {
        if (i2 != 0) {
            this.h0 = 0;
            getMenu().clear();
            x(i2);
        }
    }

    public final void P0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.V != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (K0()) {
            T0(actionMenuView, this.W, this.j0);
        } else {
            T0(actionMenuView, 0, false);
        }
    }

    public final void Q0() {
        getTopEdgeTreatment().p(getFabTranslationX());
        View viewH0 = H0();
        this.T.c0((this.j0 && K0()) ? 1.0f : 0.0f);
        if (viewH0 != null) {
            viewH0.setTranslationY(getFabTranslationY());
            viewH0.setTranslationX(getFabTranslationX());
        }
    }

    public void R0(int i2, int i3) {
        this.h0 = i3;
        this.i0 = true;
        L0(i2, this.j0);
        M0(i2);
        this.W = i2;
    }

    public boolean S0(int i2) {
        float f2 = i2;
        if (f2 == getTopEdgeTreatment().g()) {
            return false;
        }
        getTopEdgeTreatment().n(f2);
        this.T.invalidateSelf();
        return true;
    }

    public final void T0(ActionMenuView actionMenuView, int i2, boolean z) {
        U0(actionMenuView, i2, z, false);
    }

    public final void U0(ActionMenuView actionMenuView, int i2, boolean z, boolean z2) {
        h hVar = new h(actionMenuView, i2, z);
        if (z2) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.T.I();
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().c();
    }

    public int getFabAlignmentMode() {
        return this.W;
    }

    public int getFabAnimationMode() {
        return this.a0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e();
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f();
    }

    public boolean getHideOnScroll() {
        return this.b0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8f.f(this, this.T);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            A0();
            Q0();
        }
        P0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.W = savedState.f8554b;
        this.j0 = savedState.c;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f8554b = this.W;
        savedState.c = this.j0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        k47.o(this.T, colorStateList);
    }

    public void setCradleVerticalOffset(@Dimension float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().i(f2);
            this.T.invalidateSelf();
            Q0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        this.T.a0(f2);
        getBehavior().e(this, this.T.D() - this.T.C());
    }

    public void setFabAlignmentMode(int i2) {
        R0(i2, 0);
    }

    public void setFabAnimationMode(int i2) {
        this.a0 = i2;
    }

    public void setFabCornerSize(@Dimension float f2) {
        if (f2 != getTopEdgeTreatment().d()) {
            getTopEdgeTreatment().j(f2);
            this.T.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@Dimension float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().k(f2);
            this.T.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().l(f2);
            this.T.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.b0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(N0(drawable));
    }

    public void setNavigationIconTint(int i2) {
        this.R = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final void z0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.o0);
        floatingActionButton.f(new i());
        floatingActionButton.g(this.p0);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.k0 == null) {
            this.k0 = new Behavior();
        }
        return this.k0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect e;
        public WeakReference<BottomAppBar> f;
        public int g;
        public final View.OnLayoutChangeListener h;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.j(Behavior.this.e);
                int iHeight = Behavior.this.e.height();
                bottomAppBar.S0(iHeight);
                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.e)));
                CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
                if (Behavior.this.g == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(pmi.U) - ((floatingActionButton.getMeasuredHeight() - iHeight) / 2));
                    ((ViewGroup.MarginLayoutParams) eVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) eVar).rightMargin = bottomAppBar.getRightInset();
                    if (ayq.j(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin += bottomAppBar.S;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin += bottomAppBar.S;
                    }
                }
            }
        }

        public Behavior() {
            this.h = new a();
            this.e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f = new WeakReference<>(bottomAppBar);
            View viewH0 = bottomAppBar.H0();
            if (viewH0 != null && !androidx.core.view.c.U(viewH0)) {
                CoordinatorLayout.e eVar = (CoordinatorLayout.e) viewH0.getLayoutParams();
                eVar.d = 49;
                this.g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                if (viewH0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewH0;
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(ygi.j);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(ygi.i);
                    }
                    floatingActionButton.addOnLayoutChangeListener(this.h);
                    bottomAppBar.z0(floatingActionButton);
                }
                bottomAppBar.Q0();
            }
            coordinatorLayout.G(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.h = new a();
            this.e = new Rect();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(Context context, AttributeSet attributeSet, int i2) {
        int i3 = q0;
        super(n8f.c(context, attributeSet, i2, i3), attributeSet, i2);
        l8f l8fVar = new l8f();
        this.T = l8fVar;
        this.f0 = 0;
        this.h0 = 0;
        this.i0 = false;
        this.j0 = true;
        this.o0 = new a();
        this.p0 = new b();
        Context context2 = getContext();
        TypedArray typedArrayH = c9p.h(context2, attributeSet, b4j.Z, i2, i3, new int[0]);
        ColorStateList colorStateListB = k8f.b(context2, typedArrayH, b4j.a0);
        if (typedArrayH.hasValue(b4j.i0)) {
            setNavigationIconTint(typedArrayH.getColor(b4j.i0, -1));
        }
        int dimensionPixelSize = typedArrayH.getDimensionPixelSize(b4j.b0, 0);
        float dimensionPixelOffset = typedArrayH.getDimensionPixelOffset(b4j.e0, 0);
        float dimensionPixelOffset2 = typedArrayH.getDimensionPixelOffset(b4j.f0, 0);
        float dimensionPixelOffset3 = typedArrayH.getDimensionPixelOffset(b4j.g0, 0);
        this.W = typedArrayH.getInt(b4j.c0, 0);
        this.a0 = typedArrayH.getInt(b4j.d0, 0);
        this.b0 = typedArrayH.getBoolean(b4j.h0, false);
        this.c0 = typedArrayH.getBoolean(b4j.j0, false);
        this.d0 = typedArrayH.getBoolean(b4j.k0, false);
        this.e0 = typedArrayH.getBoolean(b4j.l0, false);
        typedArrayH.recycle();
        this.S = getResources().getDimensionPixelOffset(pmi.T);
        l8fVar.setShapeAppearanceModel(r2m.a().B(new w43(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).m());
        l8fVar.i0(2);
        l8fVar.e0(Paint.Style.FILL);
        l8fVar.Q(context2);
        setElevation(dimensionPixelSize);
        k47.o(l8fVar, colorStateListB);
        androidx.core.view.c.v0(this, l8fVar);
        ayq.c(this, attributeSet, i2, i3, new c());
    }
}
