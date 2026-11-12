package miuix.appcompat.internal.app.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.awi;
import defpackage.c6q;
import defpackage.dmi;
import defpackage.dyq;
import defpackage.fe0;
import defpackage.g5j;
import defpackage.hm1;
import defpackage.ke0;
import defpackage.md0;
import defpackage.me0;
import defpackage.pwk;
import defpackage.s6g;
import defpackage.vsi;
import defpackage.x08;
import defpackage.yoi;
import defpackage.z1j;
import defpackage.zhi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.IStateStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.physics.DynamicAnimation;
import miuix.animation.physics.SpringAnimation;
import miuix.animation.property.ViewProperty;
import miuix.appcompat.internal.app.widget.actionbar.CollapseTitle;
import miuix.appcompat.internal.app.widget.actionbar.ExpandTitle;
import miuix.appcompat.internal.view.menu.action.ActionMenuPresenter;
import miuix.appcompat.internal.view.menu.action.ActionMenuView;
import miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ActionBarContextView extends miuix.appcompat.internal.app.widget.a implements me0 {
    public TextView A;
    public miuix.appcompat.internal.app.widget.a.b B;
    public miuix.appcompat.internal.app.widget.a.b C;
    public View D;
    public FrameLayout E;
    public int F;
    public int G;
    public int H;
    public ActionBarView I;
    public AnimConfig J;
    public TransitionListener K;
    public boolean L;
    public boolean M;
    public boolean N;
    public Scroller O;
    public Runnable P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f26377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f26378b;
    public Button c;
    public Button d;
    public TextView e;
    public int f;
    public Drawable g;
    public Drawable h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public fe0 f26379k;
    public fe0 l;
    public WeakReference<ActionMode> m;
    public SpringAnimation n;
    public boolean o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<ke0> f26380r;
    public float s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final Handler w;
    public final Runnable x;
    public View.OnClickListener y;
    public int z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f26381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f26382b;
        public boolean c;
        public int d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (a) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, ClassLoader classLoader, a aVar) {
            this(parcel, classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
            TextUtils.writeToParcel(this.f26381a, parcel, 0);
            TextUtils.writeToParcel(this.f26382b, parcel, 0);
            parcel.writeInt(this.d);
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.c = parcel.readInt() != 0;
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f26381a = (CharSequence) creator.createFromParcel(parcel);
            this.f26382b = (CharSequence) creator.createFromParcel(parcel);
            this.d = parcel.readInt();
        }

        @RequiresApi(api = 24)
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt() != 0;
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f26381a = (CharSequence) creator.createFromParcel(parcel);
            this.f26382b = (CharSequence) creator.createFromParcel(parcel);
            this.d = parcel.readInt();
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionBarContextView.this.P != null) {
                ActionBarContextView actionBarContextView = ActionBarContextView.this;
                actionBarContextView.postOnAnimation(actionBarContextView.P);
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x08 x08Var;
            fe0 fe0Var = view.getId() == 16908313 ? ActionBarContextView.this.f26379k : ActionBarContextView.this.l;
            if (ActionBarContextView.this.m == null || (x08Var = (x08) ActionBarContextView.this.m.get()) == null) {
                return;
            }
            x08Var.d((miuix.appcompat.internal.view.menu.d) x08Var.getMenu(), fe0Var);
        }
    }

    public class c extends TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f26385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActionBarOverlayLayout f26386b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ e f;

        public c(boolean z, ActionBarOverlayLayout actionBarOverlayLayout, int i, int i2, int i3, e eVar) {
            this.f26385a = z;
            this.f26386b = actionBarOverlayLayout;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = eVar;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj) {
            if (ActionBarContextView.this.u) {
                return;
            }
            ActionBarContextView.this.I(this.f26385a);
            ActionBarContextView.this.u = true;
            ActionBarContextView.this.L = true;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            ActionBarContextView.this.L = false;
            this.f.a();
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            UpdateInfo updateInfoFindByName = UpdateInfo.findByName(collection, View.TRANSLATION_Y.getName());
            if (updateInfoFindByName == null) {
                return;
            }
            float floatValue = updateInfoFindByName.getFloatValue();
            this.f26386b.M((int) (this.c - floatValue), 1);
            int i = this.d;
            int i2 = this.e;
            ActionBarContextView.this.J(this.f26385a, i == i2 ? 1.0f : (floatValue - i2) / (i - i2));
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionBarContextView.this.O.computeScrollOffset()) {
                ActionBarContextView actionBarContextView = ActionBarContextView.this;
                actionBarContextView.F = actionBarContextView.O.getCurrY() - ActionBarContextView.this.G;
                ActionBarContextView.this.requestLayout();
                if (!ActionBarContextView.this.O.isFinished()) {
                    ActionBarContextView.this.postOnAnimation(this);
                } else if (ActionBarContextView.this.O.getCurrY() == ActionBarContextView.this.G) {
                    ActionBarContextView.this.setExpandState(0);
                } else if (ActionBarContextView.this.O.getCurrY() == ActionBarContextView.this.G + ActionBarContextView.this.E.getMeasuredHeight()) {
                    ActionBarContextView.this.setExpandState(1);
                }
            }
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f26389b;

        public interface a {
            void a();
        }

        public e(int i, a aVar) {
            this.f26388a = i;
            this.f26389b = aVar;
        }

        public void a() {
            int i = this.f26388a - 1;
            this.f26388a = i;
            if (i == 0) {
                this.f26389b.a();
            }
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void O() {
        ActionBarContainer actionBarContainer;
        setBackground(this.h);
        if (!this.mSplitActionBarEnable || (actionBarContainer = this.mSplitView) == null) {
            return;
        }
        actionBarContainer.N(false);
    }

    private void setSplitAnimating(boolean z) {
        ActionBarContainer actionBarContainer = this.mSplitView;
        if (actionBarContainer != null) {
            ((ActionBarOverlayLayout) actionBarContainer.getParent()).setAnimating(z);
        }
    }

    private void x() {
        ActionBarContainer actionBarContainer;
        setBackground(null);
        if (!this.mSplitActionBarEnable || (actionBarContainer = this.mSplitView) == null) {
            return;
        }
        actionBarContainer.N(true);
    }

    private Button z(int i) {
        if (i == 16908313) {
            return this.c;
        }
        if (i == 16908314) {
            return this.d;
        }
        return null;
    }

    public final fe0 A(int i) {
        if (i == 16908313) {
            return this.f26379k;
        }
        if (i == 16908314) {
            return this.l;
        }
        return null;
    }

    public final SpringAnimation B(View view, float f, float f2, float f3) {
        SpringAnimation springAnimation = new SpringAnimation(view, ViewProperty.ALPHA, f3);
        springAnimation.setStartValue(f2);
        springAnimation.getSpring().setStiffness(f);
        springAnimation.getSpring().setDampingRatio(0.9f);
        springAnimation.setMinimumVisibleChange(0.00390625f);
        return springAnimation;
    }

    public boolean C() {
        return this.L;
    }

    public void F(boolean z) {
        setAlpha(z ? 1.0f : 0.0f);
        if (!this.mSplitActionBarEnable) {
            L(z);
            return;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.mSplitView.getParent();
        int collapsedHeight = this.mMenuView.getCollapsedHeight();
        this.mMenuView.setTranslationY(z ? 0.0f : collapsedHeight);
        if (!z) {
            collapsedHeight = 0;
        }
        actionBarOverlayLayout.l(collapsedHeight);
        this.mMenuView.setAlpha(z ? 1.0f : 0.0f);
        L(z);
    }

    public void G(boolean z) {
        int i;
        int i2;
        if (z != this.t || this.n == null) {
            this.t = z;
            this.u = false;
            float f = 1.0f;
            float f2 = 0.0f;
            if (z) {
                f2 = 1.0f;
                f = 0.0f;
            }
            SpringAnimation springAnimationB = B(this, z ? 322.27f : 986.96f, f, f2);
            springAnimationB.setStartDelay(z ? 50L : 0L);
            setAlpha(f);
            this.n = springAnimationB;
            if (!this.mSplitActionBarEnable) {
                final e eVar = new e(1, new e.a() { // from class: zc0
                    @Override // miuix.appcompat.internal.app.widget.ActionBarContextView.e.a
                    public final void a() {
                        this.f41110a.K();
                    }
                });
                springAnimationB.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: ad0
                    @Override // miuix.animation.physics.DynamicAnimation.OnAnimationEndListener
                    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f3, float f4) {
                        eVar.a();
                    }
                });
                springAnimationB.start();
                return;
            }
            final e eVar2 = new e(2, new e.a() { // from class: zc0
                @Override // miuix.appcompat.internal.app.widget.ActionBarContextView.e.a
                public final void a() {
                    this.f41110a.K();
                }
            });
            springAnimationB.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: bd0
                @Override // miuix.animation.physics.DynamicAnimation.OnAnimationEndListener
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f3, float f4) {
                    eVar2.a();
                }
            });
            springAnimationB.start();
            ActionMenuView actionMenuView = this.mMenuView;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) getParent().getParent();
            int collapsedHeight = actionMenuView == null ? 0 : actionMenuView.getCollapsedHeight();
            if (z) {
                i2 = collapsedHeight;
                i = 0;
            } else {
                i = collapsedHeight;
                i2 = 0;
            }
            if (actionMenuView != null) {
                if (this.J == null) {
                    this.J = new AnimConfig().setEase(-2, 0.95f, 0.25f);
                }
                TransitionListener transitionListener = this.K;
                if (transitionListener != null) {
                    this.J.removeListeners(transitionListener);
                }
                AnimConfig animConfig = this.J;
                c cVar = new c(z, actionBarOverlayLayout, collapsedHeight, i, i2, eVar2);
                this.K = cVar;
                animConfig.addListeners(cVar);
                IStateStyle iStateStyleState = Folme.useAt(actionMenuView).state();
                ViewProperty viewProperty = ViewProperty.TRANSLATION_Y;
                iStateStyleState.setTo(viewProperty, Integer.valueOf(i2)).to(viewProperty, Integer.valueOf(i), this.J);
                actionBarOverlayLayout.M(0, 1);
            }
        }
    }

    public void H(boolean z) {
        List<ke0> list = this.f26380r;
        if (list == null) {
            return;
        }
        Iterator<ke0> it = list.iterator();
        while (it.hasNext()) {
            it.next().onStop(z);
        }
    }

    public void I(boolean z) {
        List<ke0> list = this.f26380r;
        if (list == null) {
            return;
        }
        Iterator<ke0> it = list.iterator();
        while (it.hasNext()) {
            it.next().onStart(z);
        }
    }

    public void J(boolean z, float f) {
        List<ke0> list = this.f26380r;
        if (list == null) {
            return;
        }
        Iterator<ke0> it = list.iterator();
        while (it.hasNext()) {
            it.next().onUpdate(z, f);
        }
    }

    public final void K() {
        ActionMenuView actionMenuView;
        setSplitAnimating(false);
        this.u = false;
        H(this.t);
        if (this.p == 2) {
            a();
        }
        this.p = 0;
        this.n = null;
        setVisibility(this.t ? 0 : 8);
        if (this.mSplitView != null && (actionMenuView = this.mMenuView) != null) {
            actionMenuView.setVisibility(this.t ? 0 : 8);
        }
        Folme.clean(this.mMenuView);
    }

    public final void L(boolean z) {
        ActionMenuView actionMenuView;
        H(z);
        setVisibility(z ? 0 : 8);
        if (this.mSplitView == null || (actionMenuView = this.mMenuView) == null) {
            return;
        }
        actionMenuView.setVisibility(z ? 0 : 8);
    }

    public final void M(int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int measuredHeight = this.D.getMeasuredHeight();
        int i5 = ((i4 - i2) - measuredHeight) / 2;
        if (this.D.getVisibility() != 8) {
            View view = this.D;
            dyq.h(this, view, paddingStart, i5, paddingStart + view.getMeasuredWidth(), i5 + this.D.getMeasuredHeight());
        }
        int paddingEnd = (i3 - i) - getPaddingEnd();
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            positionChildInverse(this.mMenuView, paddingEnd, i5, measuredHeight);
        }
        if (this.o) {
            this.p = 1;
            G(true);
            this.o = false;
        } else if (this.mMenuView != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) getParent().getParent();
            if (actionBarOverlayLayout.z()) {
                return;
            }
            actionBarOverlayLayout.M(this.mMenuView.getCollapsedHeight(), 1);
        }
    }

    public void N(boolean z, int i, int i2, int i3, int i4) {
        FrameLayout frameLayout = this.E;
        if (frameLayout == null || frameLayout.getVisibility() != 0 || this.mInnerExpandState == 0) {
            return;
        }
        FrameLayout frameLayout2 = this.E;
        frameLayout2.layout(i, i4 - frameLayout2.getMeasuredHeight(), i3, i4);
        if (dyq.e(this)) {
            i = i3 - this.E.getMeasuredWidth();
        }
        Rect rect = new Rect();
        rect.set(i, this.E.getMeasuredHeight() - (i4 - i2), this.E.getMeasuredWidth() + i, this.E.getMeasuredHeight());
        this.E.setClipBounds(rect);
    }

    public void P(int i, CharSequence charSequence) {
        S(i, null, charSequence, 0);
    }

    public void Q(int i, CharSequence charSequence, int i2) {
        initTitle();
        Button buttonZ = z(i);
        u(buttonZ, charSequence, i2, null);
        t(A(i), charSequence);
        if (!TextUtils.isEmpty(charSequence) || i2 == 0) {
            return;
        }
        T(buttonZ, i2);
    }

    public void R(int i, CharSequence charSequence, int i2, CharSequence charSequence2, int i3) {
        initTitle();
        Button buttonZ = z(i);
        u(buttonZ, charSequence2, i3, charSequence);
        t(A(i), charSequence2);
        if (buttonZ != null) {
            buttonZ.setImportantForAccessibility(i2);
        }
    }

    public void S(int i, CharSequence charSequence, CharSequence charSequence2, int i2) {
        R(i, charSequence, 0, charSequence2, i2);
    }

    public final void T(Button button, int i) {
        if (button == null) {
            return;
        }
        if (yoi.f40379k == i || yoi.f40378b == i || yoi.f40377a == i) {
            button.setContentDescription(getResources().getString(z1j.j));
            return;
        }
        if (yoi.l == i || yoi.f == i || yoi.e == i) {
            button.setContentDescription(getResources().getString(z1j.f40784k));
            return;
        }
        if (yoi.o == i || yoi.j == i || yoi.i == i) {
            button.setContentDescription(getResources().getString(z1j.n));
            return;
        }
        if (yoi.n == i || yoi.d == i || yoi.c == i) {
            button.setContentDescription(getResources().getString(z1j.m));
        } else if (yoi.m == i || yoi.h == i || yoi.g == i) {
            button.setContentDescription(getResources().getString(z1j.l));
        }
    }

    public final void U() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            Folme.useAt(this.mMenuView).state().setTo(new AnimState().add(ViewProperty.TRANSLATION_Y, this.t ? 0 : actionMenuView.getCollapsedHeight()));
        }
    }

    public void V(boolean z) {
        this.v = z;
        if (z) {
            x();
        } else {
            O();
        }
    }

    @Override // defpackage.me0
    public void a() {
        removeAllViews();
        List<ke0> list = this.f26380r;
        if (list != null) {
            list.clear();
            this.f26380r = null;
        }
        if (this.mSplitView != null) {
            ActionMenuView actionMenuView = this.mMenuView;
            if (actionMenuView != null) {
                actionMenuView.o();
            }
            this.mSplitView.removeView(this.mMenuView);
            this.mSplitView.v(this.mMenuView);
        }
        this.mMenuView = null;
        this.m = null;
    }

    public final void addSplitMenuView() {
        this.mActionMenuPresenter.h0(getContext().getResources().getDisplayMetrics().widthPixels, true);
        ActionMenuView actionMenuView = (ActionMenuView) this.mActionMenuPresenter.m(this);
        this.mMenuView = actionMenuView;
        ViewGroup viewGroup = (ViewGroup) actionMenuView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.mMenuView);
            this.mSplitView.v(this.mMenuView);
        }
        ActionMenuView actionMenuView2 = this.mMenuView;
        if (actionMenuView2 != null) {
            actionMenuView2.setSupportBlur(this.mSplitView.t());
            this.mMenuView.setEnableBlur(this.mSplitView.s());
            this.mMenuView.e(this.mSplitView.s() && this.mMenuView.getMeasuredWidth() > 0 && this.mMenuView.getMeasuredHeight() > 0);
            this.mMenuView.q(this.v);
        }
        boolean z = this.mBottomMenuMode == 3;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        if (z) {
            layoutParams.bottomMargin = s6g.d(getContext(), 16.0f);
        }
        Rect rect = this.mPendingInset;
        if (rect != null) {
            if (z) {
                layoutParams.bottomMargin += rect.bottom;
                dyq.i(this.mMenuView, 0);
            } else {
                dyq.i(this.mMenuView, rect.bottom);
            }
        }
        ActionMenuView actionMenuView3 = this.mMenuView;
        if (actionMenuView3 instanceof ResponsiveActionMenuView) {
            ((ResponsiveActionMenuView) actionMenuView3).setSuspendEnabled(z);
        }
        this.mSplitView.addView(this.mMenuView, layoutParams);
        this.mSplitView.u(this.mMenuView);
        requestLayout();
    }

    public final void animateLayoutWithProcess(float f) {
        float fMin = 1.0f - Math.min(1.0f, f * 3.0f);
        int i = this.mInnerExpandState;
        if (i == 2) {
            if (fMin > 0.0f) {
                this.B.a(0.0f, 0, 20, this.mCollapseAnimHideConfig);
            } else {
                this.B.a(1.0f, 0, 0, this.mCollapseAnimShowConfig);
            }
            this.C.a(fMin, 0, 0, this.mMovableAnimNormalConfig);
            return;
        }
        if (i == 1) {
            this.B.a(0.0f, 0, 20, this.mCollapseAnimHideConfig);
            this.C.a(1.0f, 0, 0, this.mMovableAnimNormalConfig);
        } else if (i == 0) {
            this.B.a(1.0f, 0, 0, this.mCollapseAnimShowConfig);
            this.C.a(0.0f, 0, 0, this.mMovableAnimNormalConfig);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void animateToVisibility(int i) {
        super.animateToVisibility(i);
    }

    @Override // defpackage.me0
    public void b(boolean z) {
        w();
        setSplitAnimating(this.j);
        if (!z) {
            if (this.j) {
                G(false);
                return;
            } else {
                F(false);
                return;
            }
        }
        if (!this.j) {
            F(true);
        } else {
            setVisibility(0);
            this.o = true;
        }
    }

    @Override // defpackage.me0
    public void c(ke0 ke0Var) {
        if (ke0Var == null) {
            return;
        }
        if (this.f26380r == null) {
            this.f26380r = new ArrayList();
        }
        this.f26380r.add(ke0Var);
    }

    @Override // defpackage.me0
    public void d(ActionMode actionMode) {
        if (this.m != null) {
            w();
            a();
        }
        initTitle();
        if (this.e.getEllipsize() == TextUtils.TruncateAt.MARQUEE) {
            this.e.requestFocus();
        }
        this.m = new WeakReference<>(actionMode);
        miuix.appcompat.internal.view.menu.d dVar = (miuix.appcompat.internal.view.menu.d) actionMode.getMenu();
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.O(false);
        }
        Object parent = getParent();
        while (true) {
            View view = (View) parent;
            if (view instanceof ActionBarOverlayLayout) {
                ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext(), (ActionBarOverlayLayout) view, awi.K, awi.o);
                this.mActionMenuPresenter = actionMenuPresenter2;
                actionMenuPresenter2.g0(true);
                this.mActionMenuPresenter.c0(true);
                int i = this.mMaxActionMenuItemCount;
                if (i != Integer.MIN_VALUE) {
                    this.mActionMenuPresenter.f0(i);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                dVar.c(this.mActionMenuPresenter);
                if (this.mSplitActionBarEnable) {
                    addSplitMenuView();
                    return;
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.mActionMenuPresenter.m(this);
                this.mMenuView = actionMenuView;
                actionMenuView.setBackground(null);
                addView(this.mMenuView, layoutParams);
                return;
            }
            if (!(view.getParent() instanceof View)) {
                throw new IllegalStateException("ActionBarOverlayLayout not found");
            }
            parent = view.getParent();
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void dismissPopupMenus() {
        super.dismissPopupMenus();
    }

    @Override // defpackage.me0
    public void e() {
        y();
        this.p = 2;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public int getActionBarStyle() {
        return R.attr.actionModeStyle;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ ActionMenuView getActionMenuView() {
        return super.getActionMenuView();
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public float getAnimationProgress() {
        return this.s;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public CollapseTitle getCollapseTitle() {
        return null;
    }

    public int getCollapsedHeight() {
        return this.G;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ int getExpandState() {
        return super.getExpandState();
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public ExpandTitle getExpandTitle() {
        return null;
    }

    public int getExpandedHeight() {
        return this.H;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ ActionMenuView getMenuView() {
        return super.getMenuView();
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public View getSubTitleView(int i) {
        return null;
    }

    public CharSequence getTitle() {
        return this.f26377a;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public View getTitleView(int i) {
        if (i == 0) {
            return this.e;
        }
        if (i != 1) {
            return null;
        }
        return this.A;
    }

    @Override // defpackage.me0
    public int getViewHeight() {
        return getCollapsedHeight();
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.U(false);
    }

    public void initTitle() {
        if (this.f26378b == null) {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(awi.p, (ViewGroup) this, false);
            this.f26378b = linearLayout;
            this.c = (Button) linearLayout.findViewById(R.id.button1);
            this.d = (Button) this.f26378b.findViewById(R.id.button2);
            Button button = this.c;
            if (button != null) {
                button.setOnClickListener(this.y);
                Folme.useAt(this.c).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, new ITouchStyle.TouchType[0]).handleTouchOf(this.c, new AnimConfig[0]);
                Folme.useAt(this.c).hover().setFeedbackRadius(60.0f);
                Folme.useAt(this.c).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.c, new AnimConfig[0]);
            }
            Button button2 = this.d;
            if (button2 != null) {
                button2.setOnClickListener(this.y);
                Folme.useAt(this.d).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, new ITouchStyle.TouchType[0]).handleTouchOf(this.d, new AnimConfig[0]);
                Folme.useAt(this.d).hover().setFeedbackRadius(60.0f);
                Folme.useAt(this.d).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.d, new AnimConfig[0]);
            }
            TextView textView = (TextView) this.f26378b.findViewById(R.id.title);
            this.e = textView;
            if (this.f != 0) {
                textView.setTextAppearance(getContext(), this.f);
            }
            TextView textView2 = new TextView(getContext());
            this.A = textView2;
            if (this.z != 0) {
                textView2.setTextAppearance(getContext(), this.z);
                if (pwk.a() <= 1) {
                    c6q.a(this.A);
                }
            }
        }
        this.e.setText(this.f26377a);
        this.A.setText(this.f26377a);
        this.D = this.f26378b;
        this.B.b(this.e);
        boolean z = !TextUtils.isEmpty(this.f26377a);
        this.f26378b.setVisibility(z ? 0 : 8);
        this.A.setVisibility(z ? 0 : 8);
        if (this.f26378b.getParent() == null) {
            addView(this.f26378b);
        }
        if (this.A.getParent() == null) {
            this.E.addView(this.A);
        }
        if (this.E.getParent() == null) {
            addView(this.E);
        }
        int i = this.mInnerExpandState;
        if (i == 0) {
            this.B.j(1.0f, 0, 0);
            this.C.j(0.0f, 0, 0);
        } else if (i == 1) {
            this.B.j(0.0f, 0, 20);
            this.C.j(1.0f, 0, 0);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.X();
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ boolean isOverflowReserved() {
        return super.isOverflowReserved();
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ boolean isResizable() {
        return super.isResizable();
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ boolean isUserSetExpandState() {
        return super.isUserSetExpandState();
    }

    @Override // miuix.appcompat.internal.app.widget.a, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        TextView textView;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, g5j.M, getActionBarStyle(), 0);
        this.mTitleMinHeight = typedArrayObtainStyledAttributes.getLayoutDimension(g5j.O, 0);
        typedArrayObtainStyledAttributes.recycle();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(dmi.o);
        this.E.setPaddingRelative(dimensionPixelOffset, getResources().getDimensionPixelOffset(dmi.q), dimensionPixelOffset, getResources().getDimensionPixelOffset(dmi.m));
        setPaddingRelative(hm1.g(getContext(), zhi.e), getPaddingTop(), hm1.g(getContext(), zhi.d), getPaddingBottom());
        if (this.f == 0 || (textView = this.e) == null) {
            return;
        }
        textView.setTextAppearance(getContext(), this.f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.U(false);
            this.mActionMenuPresenter.V();
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void onExpandStateChanged(int i, int i2) {
        miuix.appcompat.internal.app.widget.a.b bVar;
        if (i == 2) {
            this.F = 0;
            if (!this.O.isFinished()) {
                this.O.forceFinished(true);
            }
        }
        if (i2 == 2 && (bVar = this.C) != null) {
            bVar.l(0);
        }
        if (i2 == 1) {
            if (this.E.getAlpha() > 0.0f) {
                miuix.appcompat.internal.app.widget.a.b bVar2 = this.B;
                if (bVar2 != null) {
                    bVar2.k(0.0f, 0, 20, true);
                }
                miuix.appcompat.internal.app.widget.a.b bVar3 = this.C;
                if (bVar3 != null) {
                    bVar3.k(1.0f, 0, 0, true);
                }
            }
            miuix.appcompat.internal.app.widget.a.b bVar4 = this.C;
            if (bVar4 != null) {
                bVar4.l(0);
            }
        }
        if (i2 != 0) {
            this.F = getHeight() - this.G;
            return;
        }
        miuix.appcompat.internal.app.widget.a.b bVar5 = this.B;
        if (bVar5 != null) {
            bVar5.k(1.0f, 0, 0, true);
            this.B.l(0);
            this.B.g();
        }
        miuix.appcompat.internal.app.widget.a.b bVar6 = this.C;
        if (bVar6 != null) {
            bVar6.k(0.0f, 0, 0, true);
            this.C.l(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005b  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredHeight;
        int i6 = (int) ((i3 - i) / getContext().getResources().getDisplayMetrics().density);
        int i7 = this.mInnerExpandState;
        if (i7 != 2) {
            if (i7 == 1) {
                measuredHeight = this.E.getMeasuredHeight();
            } else {
                i5 = 0;
            }
            int i8 = i4 - i2;
            M(i, i2, i3, i4 - i5);
            N(z, i, i8 - i5, i3, i8);
            float fMin = Math.min(1.0f, (this.E.getMeasuredHeight() - i5) / this.E.getMeasuredHeight());
            animateLayoutWithProcess(fMin);
            this.mLastProcess = fMin;
            this.mIsInWideMode = i6 > 640;
        }
        measuredHeight = this.F;
        i5 = measuredHeight;
        int i9 = i4 - i2;
        M(i, i2, i3, i4 - i5);
        N(z, i, i9 - i5, i3, i9);
        float fMin2 = Math.min(1.0f, (this.E.getMeasuredHeight() - i5) / this.E.getMeasuredHeight());
        animateLayoutWithProcess(fMin2);
        this.mLastProcess = fMin2;
        this.mIsInWideMode = i6 > 640;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMax;
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.mTitleMaxHeight;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((i3 > 0 ? i3 : View.MeasureSpec.getSize(i2)) - paddingTop, Integer.MIN_VALUE);
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || actionMenuView.getParent() != this) {
            iMax = 0;
        } else {
            paddingLeft = measureChildView(this.mMenuView, paddingLeft, iMakeMeasureSpec, 0);
            iMax = this.mMenuView.getMeasuredHeight();
        }
        if (this.D.getVisibility() != 8) {
            this.D.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), iMakeMeasureSpec);
            iMax = Math.max(iMax, this.D.getMeasuredHeight());
            TextView textView = this.e;
            if (textView != null) {
                textView.setVisibility(v() ? 0 : 4);
            }
        }
        if (this.E.getVisibility() != 8) {
            this.E.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        if (i3 <= 0) {
            this.G = iMax > 0 ? Math.max(iMax, this.mTitleMinHeight) + this.q : 0;
        } else if (iMax >= i3) {
            this.G = i3 + this.q;
        }
        int measuredHeight = this.G + this.E.getMeasuredHeight();
        this.H = measuredHeight;
        int i4 = this.mInnerExpandState;
        if (i4 == 2) {
            setMeasuredDimension(size, this.G + this.F);
        } else if (i4 == 1) {
            setMeasuredDimension(size, measuredHeight);
        } else {
            setMeasuredDimension(size, this.G);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3, int[] iArr2) {
        int i4;
        if (isResizable()) {
            int height = getHeight();
            if (i2 <= 0 || height <= (i4 = this.G)) {
                return;
            }
            int i5 = height - i2;
            int i6 = this.F;
            if (i5 >= i4) {
                this.F = i6 - i2;
            } else {
                this.F = 0;
            }
            iArr[1] = iArr[1] + i2;
            if (this.F != i6) {
                iArr2[1] = i2;
                requestLayout();
            }
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        if (isResizable()) {
            int measuredHeight = this.E.getMeasuredHeight();
            int i6 = this.G + measuredHeight;
            int height = getHeight();
            if (i4 >= 0 || height >= i6) {
                return;
            }
            int i7 = this.F;
            if (height - i4 <= i6) {
                this.F = i7 - i4;
                iArr[1] = iArr[1] + i4;
            } else {
                this.F = measuredHeight;
                iArr[1] = iArr[1] + (-(i6 - height));
            }
            if (this.F != i7) {
                iArr2[1] = i4;
                requestLayout();
            }
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (isResizable()) {
            if (i2 == 0) {
                this.M = true;
            } else {
                this.N = true;
            }
            if (!this.O.isFinished()) {
                this.O.forceFinished(true);
                Runnable runnable = this.P;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
            }
            setExpandState(2);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setTitle(savedState.f26381a);
        P(R.id.button2, savedState.f26382b);
        if (savedState.c) {
            postShowOverflowMenu();
        }
        setExpandState(savedState.d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = isOverflowMenuShowing();
        savedState.f26381a = getTitle();
        Button button = this.d;
        if (button != null) {
            savedState.f26382b = button.getText();
        }
        int i = this.mInnerExpandState;
        if (i == 2) {
            savedState.d = 0;
        } else {
            savedState.d = i;
        }
        return savedState;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return true;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void onStopNestedScroll(View view, int i) {
        if (isResizable()) {
            int measuredHeight = this.E.getMeasuredHeight();
            int height = getHeight();
            if (this.M) {
                this.M = false;
                if (this.N) {
                    return;
                }
            } else if (!this.N) {
                return;
            } else {
                this.N = false;
            }
            int i2 = this.F;
            if (i2 == 0) {
                setExpandState(0);
                return;
            }
            if (i2 == measuredHeight) {
                setExpandState(1);
                return;
            }
            int i3 = this.G;
            if (height > (measuredHeight / 2) + i3) {
                this.O.startScroll(0, height, 0, (i3 + measuredHeight) - height);
            } else {
                this.O.startScroll(0, height, 0, i3 - height);
            }
            this.w.postDelayed(this.x, 17L);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void postShowOverflowMenu() {
        super.postShowOverflowMenu();
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void refreshBottomMenu() {
        if (!this.mSplitActionBarEnable || this.mActionMenuPresenter == null || this.m == null) {
            return;
        }
        addSplitMenuView();
    }

    public void setActionBarView(ActionBarView actionBarView) {
        this.I = actionBarView;
    }

    public void setActionModeAnim(boolean z) {
        this.j = z;
    }

    public void setAnimationProgress(float f) {
        this.s = f;
        J(this.t, f);
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void setBottomMenuMode(int i) {
        super.setBottomMenuMode(i);
    }

    public void setContentInset(int i) {
        this.q = i;
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void setExpandState(int i) {
        super.setExpandState(i);
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void setPendingInset(Rect rect) {
        super.setPendingInset(rect);
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void setResizable(boolean z) {
        super.setResizable(z);
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public void setSplitActionBar(boolean z) {
        if (this.mSplitActionBarEnable != z) {
            if (this.mActionMenuPresenter != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                if (z) {
                    this.mActionMenuPresenter.h0(getContext().getResources().getDisplayMetrics().widthPixels, true);
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                    layoutParams.gravity = this.mIsInWideMode ? 17 : 80;
                    ActionMenuView actionMenuView = (ActionMenuView) this.mActionMenuPresenter.m(this);
                    this.mMenuView = actionMenuView;
                    actionMenuView.setBackground(this.g);
                    ViewGroup viewGroup = (ViewGroup) this.mMenuView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.mMenuView);
                        this.mSplitView.v(this.mMenuView);
                    }
                    this.mSplitView.addView(this.mMenuView, layoutParams);
                    this.mSplitView.u(this.mMenuView);
                } else {
                    ActionMenuView actionMenuView2 = (ActionMenuView) this.mActionMenuPresenter.m(this);
                    this.mMenuView = actionMenuView2;
                    actionMenuView2.setBackground(null);
                    ViewGroup viewGroup2 = (ViewGroup) this.mMenuView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(this.mMenuView);
                    }
                    addView(this.mMenuView, layoutParams);
                }
            }
            super.setSplitActionBar(z);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void setSplitView(ActionBarContainer actionBarContainer) {
        super.setSplitView(actionBarContainer);
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void setSplitWhenNarrow(boolean z) {
        super.setSplitWhenNarrow(z);
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void setSubTitleClickListener(View.OnClickListener onClickListener) {
        super.setSubTitleClickListener(onClickListener);
    }

    public void setTitle(CharSequence charSequence) {
        this.f26377a = charSequence;
        initTitle();
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void setTitleClickable(boolean z) {
        super.setTitleClickable(z);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.i) {
            requestLayout();
        }
        this.i = z;
    }

    @Override // miuix.appcompat.internal.app.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.j0();
    }

    public final void t(fe0 fe0Var, CharSequence charSequence) {
        if (fe0Var == null) {
            return;
        }
        fe0Var.setTitle(charSequence);
    }

    public final void u(Button button, CharSequence charSequence, int i, CharSequence charSequence2) {
        if (button == null) {
            return;
        }
        button.setVisibility((TextUtils.isEmpty(charSequence) && i == 0) ? 8 : 0);
        button.setText(charSequence);
        button.setBackgroundResource(i);
        if (!TextUtils.isEmpty(charSequence2)) {
            button.setContentDescription(charSequence2);
        }
        if (!TextUtils.isEmpty(charSequence) || i == 0) {
            button.setMaxHeight(Integer.MAX_VALUE);
        } else {
            button.setMaxHeight(getContext().getResources().getDimensionPixelSize(dmi.A));
        }
    }

    public final boolean v() {
        boolean z = (!isResizable() && getExpandState() == 0) || this.e.getPaint().measureText(this.f26377a.toString()) <= ((float) this.e.getMeasuredWidth());
        if (!md0.b(getContext()).g() || z) {
            return z;
        }
        return true;
    }

    public void w() {
        SpringAnimation springAnimation = this.n;
        if (springAnimation != null) {
            springAnimation.cancel();
            this.n = null;
        }
        U();
        setSplitAnimating(false);
    }

    public void y() {
        SpringAnimation springAnimation = this.n;
        if (springAnimation != null) {
            springAnimation.skipToEnd();
            this.n = null;
        }
        U();
        setSplitAnimating(false);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    @Override // miuix.appcompat.internal.app.widget.a
    public /* bridge */ /* synthetic */ void setExpandState(int i, boolean z, boolean z2) {
        super.setExpandState(i, z, z2);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = true;
        this.v = false;
        this.w = new Handler(Looper.myLooper());
        this.x = new a();
        this.y = new b();
        this.B = new miuix.appcompat.internal.app.widget.a.b();
        this.C = new miuix.appcompat.internal.app.widget.a.b();
        this.M = false;
        this.N = false;
        this.P = new d();
        this.O = new Scroller(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.setId(vsi.f);
        this.E.setPaddingRelative(context.getResources().getDimensionPixelOffset(dmi.o), context.getResources().getDimensionPixelOffset(dmi.q), context.getResources().getDimensionPixelOffset(dmi.o), context.getResources().getDimensionPixelOffset(dmi.m));
        this.E.setVisibility(0);
        this.C.b(this.E);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g5j.M, i, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(g5j.N);
        this.h = drawable;
        setBackground(drawable);
        this.f = typedArrayObtainStyledAttributes.getResourceId(g5j.P, 0);
        this.z = typedArrayObtainStyledAttributes.getResourceId(g5j.S, 0);
        this.mTitleMinHeight = typedArrayObtainStyledAttributes.getLayoutDimension(g5j.O, 0);
        this.g = typedArrayObtainStyledAttributes.getDrawable(g5j.Q);
        this.f26379k = new fe0(context, 0, R.id.button1, 0, 0, context.getString(R.string.cancel));
        this.l = new fe0(context, 0, R.id.button2, 0, 0, context.getString(z1j.i));
        this.j = typedArrayObtainStyledAttributes.getBoolean(g5j.R, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
