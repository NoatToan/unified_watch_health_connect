package miuix.appcompat.internal.app.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import defpackage.a43;
import defpackage.b43;
import defpackage.cd0;
import defpackage.g5j;
import defpackage.hm1;
import defpackage.m5g;
import defpackage.q56;
import defpackage.qd0;
import defpackage.vsi;
import defpackage.wc0;
import defpackage.x33;
import defpackage.y33;
import defpackage.z33;
import defpackage.zhi;
import defpackage.zlr;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import miuix.appcompat.internal.view.menu.action.ActionMenuView;
import miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView;

/* JADX INFO: loaded from: classes3.dex */
public class ActionBarContainer extends FrameLayout implements b43, wc0.a {
    public ActionMenuView A;
    public boolean B;
    public boolean C;
    public Rect D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public float K;
    public int L;
    public int M;
    public int N;
    public cd0 O;
    public List<qd0> P;
    public AnimatorListenerAdapter Q;
    public AnimatorListenerAdapter R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f26368b;
    public ActionBarView c;
    public int d;
    public boolean e;
    public ActionBarContextView f;
    public int g;
    public boolean h;
    public Animator i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f26369k;
    public Drawable[] l;
    public Drawable m;
    public Drawable n;
    public boolean o;
    public boolean p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f26370r;
    public boolean s;
    public final m5g t;
    public boolean u;
    public boolean v;
    public Boolean w;
    public Boolean x;
    public Boolean y;
    public ActionMenuView z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26372b;
        public boolean c;
        public boolean d;
        public boolean e;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
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

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f26371a);
            parcel.writeInt(this.f26372b);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeInt(this.e ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f26371a = parcel.readInt();
            this.f26372b = parcel.readInt();
            this.c = parcel.readInt() != 0;
            this.d = parcel.readInt() != 0;
            this.e = parcel.readInt() != 0;
        }

        @RequiresApi(api = 24)
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f26371a = parcel.readInt();
            this.f26372b = parcel.readInt();
            this.c = parcel.readInt() != 0;
            this.d = parcel.readInt() != 0;
            this.e = parcel.readInt() != 0;
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarContainer.this.setVisibility(8);
            ActionBarContainer.this.i = null;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarContainer.this.i = null;
        }
    }

    public class c implements m5g.a {
        public c() {
        }

        @Override // m5g.a
        public void a(m5g m5gVar) {
            boolean zD = hm1.d(ActionBarContainer.this.getContext(), zhi.F, true);
            m5gVar.l(m5g.d(ActionBarContainer.this.getContext(), ActionBarContainer.this.f26369k, zD ? y33.f39743b : x33.f38632b), zD ? a43.f594a : z33.f40830a, 66);
        }

        @Override // m5g.a
        public void b(boolean z) {
            if (ActionBarContainer.this.o) {
                ActionBarContainer.this.v = z;
                if (ActionBarContainer.this.z != null) {
                    boolean zBooleanValue = ActionBarContainer.this.x != null ? ActionBarContainer.this.x.booleanValue() : ActionBarContainer.this.v;
                    if (z) {
                        ActionBarContainer.this.z.setSupportBlur(true);
                        ActionBarContainer.this.z.setEnableBlur(true);
                    }
                    ActionBarContainer.this.z.e(zBooleanValue);
                }
            }
        }

        @Override // m5g.a
        public void c(boolean z) {
            if (z) {
                ActionBarContainer.this.s = false;
            } else {
                ActionBarContainer.this.s = true;
            }
            if (ActionBarContainer.this.c != null) {
                ActionBarContainer.this.c.setApplyBgBlur(z);
            }
            if (ActionBarContainer.this.f != null) {
                ActionBarContainer.this.f.V(z);
            }
            ActionBarContainer.this.invalidate();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarContainer.this.K(true);
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public void A(ActionMenuView actionMenuView) {
        this.z = actionMenuView;
        if (actionMenuView == null || !t()) {
            return;
        }
        actionMenuView.setSupportBlur(t());
        actionMenuView.setEnableBlur(s());
        Boolean bool = this.x;
        actionMenuView.e((bool != null ? bool.booleanValue() : s()) && getMeasuredWidth() > 0 && getMeasuredHeight() > 0);
    }

    public void B(ActionMenuView actionMenuView) {
        if (this.z == actionMenuView) {
            this.z = null;
        }
    }

    public boolean C(View view, View view2, int i, int i2) {
        ActionBarContextView actionBarContextView = this.f;
        return (actionBarContextView == null || actionBarContextView.getVisibility() != 0) ? this.c.onStartNestedScroll(view, view2, i, i2) : this.f.onStartNestedScroll(view, view2, i, i2);
    }

    public void D(View view, int i) {
        ActionBarContextView actionBarContextView = this.f;
        if (actionBarContextView != null && actionBarContextView.getVisibility() == 0) {
            this.f.onStopNestedScroll(view, i);
        } else {
            if (this.o || getVisibility() == 8) {
                return;
            }
            this.c.onStopNestedScroll(view, i);
        }
    }

    public void E() {
        if (this.c.getMenuView() != null) {
            this.c.getMenuView().startLayoutAnimation();
        }
    }

    public void F() {
        if (this.c.getMenuView() != null) {
            this.c.getMenuView().startLayoutAnimation();
        }
    }

    public void G(qd0 qd0Var) {
        if (qd0Var != null) {
            this.P.remove(qd0Var);
        }
    }

    public void H() {
        if (this.w != null) {
            return;
        }
        e(this.u);
    }

    public final void I() {
        TypedValue typedValueK;
        if (this.o && (typedValueK = hm1.k(getContext(), zhi.f)) != null && typedValueK.type == 6) {
            float fG = zlr.g(getContext());
            this.J = View.MeasureSpec.makeMeasureSpec((int) typedValueK.getFraction(fG, fG), Integer.MIN_VALUE);
        }
    }

    public final void J() {
        ActionBarView actionBarView;
        Drawable[] drawableArr;
        char c2;
        if (this.F || this.o || (actionBarView = this.c) == null || this.f26369k == null || (drawableArr = this.l) == null || drawableArr.length < 3) {
            return;
        }
        if (actionBarView.isTightTitleWithEmbeddedTabs()) {
            int displayOptions = this.c.getDisplayOptions();
            c2 = ((displayOptions & 2) == 0 && (displayOptions & 4) == 0 && (displayOptions & 16) == 0) ? (char) 1 : (char) 2;
        } else {
            c2 = 0;
        }
        Drawable drawable = this.l[c2];
        if (drawable != null) {
            this.f26369k = drawable;
        }
    }

    public void K(boolean z) {
        if (this.j) {
            return;
        }
        this.j = true;
        Animator animator = this.i;
        if (animator != null) {
            animator.cancel();
        }
        setVisibility(0);
        if (!z) {
            setTranslationY(0.0f);
            return;
        }
        if (this.o) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "TranslationY", getHeight(), 0.0f);
            this.i = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(q56.a() ? getContext().getResources().getInteger(R.integer.config_shortAnimTime) : 0L);
            this.i.addListener(this.R);
            this.i.start();
            ActionMenuView actionMenuView = this.z;
            if (actionMenuView != null) {
                actionMenuView.startLayoutAnimation();
            }
        }
    }

    public void L() {
        this.f26370r = true;
    }

    public void M(boolean z) {
        this.y = Boolean.valueOf(z);
        N(z);
    }

    public void N(boolean z) {
        if (z) {
            this.s = false;
        } else {
            this.s = true;
        }
        ActionBarContextView actionBarContextView = this.f;
        if (actionBarContextView != null) {
            actionBarContextView.V(z);
        }
        ActionBarView actionBarView = this.c;
        if (actionBarView != null) {
            actionBarView.setApplyBgBlur(z);
        }
        invalidate();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.B) {
            post(new d());
            this.B = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f26369k;
        if (drawable != null && drawable.isStateful()) {
            this.f26369k.setState(getDrawableState());
        }
        Drawable drawable2 = this.m;
        if (drawable2 != null && drawable2.isStateful()) {
            this.m.setState(getDrawableState());
        }
        Drawable drawable3 = this.n;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.n.setState(getDrawableState());
    }

    @Override // defpackage.b43
    public void e(boolean z) {
        if (this.o) {
            return;
        }
        if (z && getVisibility() == 0) {
            this.t.e(true);
        } else {
            this.t.e(false);
        }
    }

    public cd0 getActionBarCoordinateListener() {
        return this.O;
    }

    public int getCollapsedHeight() {
        int collapsedHeight;
        int i;
        ActionBarContextView actionBarContextView = this.f;
        if (actionBarContextView == null || actionBarContextView.getVisibility() == 8 || this.f.getMeasuredHeight() <= 0) {
            ActionBarView actionBarView = this.c;
            if (actionBarView == null) {
                return 0;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) actionBarView.getLayoutParams();
            collapsedHeight = this.c.getCollapsedHeight();
            i = marginLayoutParams.topMargin;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
            collapsedHeight = this.f.getCollapsedHeight();
            i = marginLayoutParams2.topMargin;
        }
        return collapsedHeight + i;
    }

    public int getExpandedHeight() {
        int expandedHeight;
        int i;
        ActionBarContextView actionBarContextView = this.f;
        if (actionBarContextView == null || actionBarContextView.getVisibility() == 8 || this.f.getMeasuredHeight() <= 0) {
            ActionBarView actionBarView = this.c;
            if (actionBarView == null) {
                return 0;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) actionBarView.getLayoutParams();
            expandedHeight = this.c.getExpandedHeight();
            i = marginLayoutParams.topMargin;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
            expandedHeight = this.f.getExpandedHeight();
            i = marginLayoutParams2.topMargin;
        }
        return expandedHeight + i;
    }

    public int getInsetHeight() {
        if (this.o) {
            return Math.max(Math.max(0, p(this.A)), p(this.z));
        }
        return 0;
    }

    public Rect getPendingInsets() {
        return this.D;
    }

    public Drawable getPrimaryBackground() {
        return this.f26369k;
    }

    public int getSplitCollapsedHeight() {
        if (this.o) {
            return Math.max(Math.max(0, o(this.A)), o(this.z));
        }
        return 0;
    }

    public View getTabContainer() {
        return this.f26368b;
    }

    public void l(qd0 qd0Var) {
        if (qd0Var != null) {
            this.P.add(qd0Var);
        }
    }

    public final void m(View view) {
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        Rect rect = this.D;
        marginLayoutParams.topMargin = rect != null ? rect.top : 0;
        view.setLayoutParams(marginLayoutParams);
    }

    public void n() {
        this.f26370r = false;
    }

    public final int o(ActionMenuView actionMenuView) {
        if (actionMenuView == null || actionMenuView.getVisibility() != 0 || actionMenuView.getAlpha() == 0.0f || actionMenuView.getCollapsedHeight() <= 0) {
            return 0;
        }
        return Math.max(0, actionMenuView.getCollapsedHeight());
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        I();
        m5g m5gVar = this.t;
        if (m5gVar != null) {
            m5gVar.i();
            if (this.t.g() || this.y != null) {
                return;
            }
            N(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setActionBarCoordinateListener(null);
        this.P.clear();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        if (getWidth() == 0 || getHeight() == 0 || this.o || (drawable = this.f26369k) == null || !this.s) {
            return;
        }
        drawable.draw(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ActionBarView) findViewById(vsi.f37187a);
        this.f = (ActionBarContextView) findViewById(vsi.o);
        ActionBarView actionBarView = this.c;
        if (actionBarView != null) {
            actionBarView.bindActionBarTransitionListeners(this.P);
            this.d = this.c.getExpandState();
            this.e = this.c.isResizable();
        }
        ActionBarContextView actionBarContextView = this.f;
        if (actionBarContextView != null) {
            this.g = actionBarContextView.getExpandState();
            this.h = this.f.isResizable();
            this.f.setActionBarView(this.c);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !this.o;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f26367a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:50:0x0106  */
    /* JADX WARN: Code duplicated, block: B:53:0x011b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0124  */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    /* JADX WARN: Code duplicated, block: B:69:0x014d  */
    /* JADX WARN: Code duplicated, block: B:74:0x016b  */
    /* JADX WARN: Code duplicated, block: B:77:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int expandedHeight;
        int collapsedHeight;
        int iMax;
        float f;
        float fMin;
        float f2;
        int i6;
        boolean zUpdateExpandStateOnLayout;
        cd0 cd0Var;
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = (int) (getMeasuredWidth() / getContext().getResources().getDisplayMetrics().density);
        View view = this.f26368b;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight2 = this.f26368b.getMeasuredHeight();
            ActionBarView actionBarView = this.c;
            if (actionBarView == null || actionBarView.getVisibility() != 0 || this.c.getMeasuredHeight() <= 0) {
                Rect rect = this.D;
                measuredHeight2 += rect != null ? rect.top : 0;
                View view2 = this.f26368b;
                int paddingLeft = view2.getPaddingLeft();
                Rect rect2 = this.D;
                view2.setPadding(paddingLeft, rect2 != null ? rect2.top + this.E : this.E, this.f26368b.getPaddingRight(), this.f26368b.getPaddingBottom());
            } else {
                View view3 = this.f26368b;
                view3.setPadding(view3.getPaddingLeft(), this.E, this.f26368b.getPaddingRight(), this.f26368b.getPaddingBottom());
            }
            this.f26368b.layout(i, measuredHeight - measuredHeight2, i3, measuredHeight);
        }
        if (this.o) {
            Drawable drawable = this.n;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            J();
            Drawable drawable2 = this.f26369k;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i3 - i, measuredHeight);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.p = measuredWidth > 640;
        ActionBarContextView actionBarContextView = this.f;
        if (actionBarContextView == null || !this.f26370r) {
            ActionBarView actionBarView2 = this.c;
            if (actionBarView2 != null) {
                this.N = actionBarView2.getMeasuredHeight() - this.c.getCollapsedHeight();
                expandedHeight = this.c.getExpandedHeight();
                collapsedHeight = this.c.getCollapsedHeight();
            } else {
                i5 = 0;
            }
            iMax = Math.max(0, this.N);
            this.N = iMax;
            if (i5 == 0) {
                f = 1.0f;
            } else {
                f = ((i5 - iMax) * 1.0f) / i5;
            }
            this.M = i5;
            fMin = Math.min(1.0f, f);
            if (getTranslationY() < 0.0f) {
                fMin = 0.0f;
            }
            f2 = this.K - fMin;
            i6 = f2 <= 0.0f ? 0 : 1;
            this.L = i6;
            if (this.H && (cd0Var = this.O) != null) {
                cd0Var.a(i6, fMin, this.N + this.I, this.M);
            }
            ActionBarView actionBarView3 = this.c;
            zUpdateExpandStateOnLayout = actionBarView3 != null ? actionBarView3.updateExpandStateOnLayout() : false;
            for (qd0 qd0Var : this.P) {
                qd0Var.b(f2, fMin);
                qd0Var.f(this.L, fMin, this.N);
                if (zUpdateExpandStateOnLayout) {
                    qd0Var.a(this.c.mExpandStateOnLayout);
                }
            }
            this.K = fMin;
            if (z2) {
                invalidate();
            }
        }
        this.N = actionBarContextView.getMeasuredHeight() - this.f.getCollapsedHeight();
        expandedHeight = this.f.getExpandedHeight();
        collapsedHeight = this.f.getCollapsedHeight();
        i5 = expandedHeight - collapsedHeight;
        iMax = Math.max(0, this.N);
        this.N = iMax;
        if (i5 == 0) {
            f = 1.0f;
        } else {
            f = ((i5 - iMax) * 1.0f) / i5;
        }
        this.M = i5;
        fMin = Math.min(1.0f, f);
        if (getTranslationY() < 0.0f) {
            fMin = 0.0f;
        }
        f2 = this.K - fMin;
        if (f2 <= 0.0f) {
        }
        this.L = i6;
        if (this.H) {
            cd0Var.a(i6, fMin, this.N + this.I, this.M);
        }
        ActionBarView actionBarView4 = this.c;
        if (actionBarView4 != null) {
        }
        while (r10.hasNext()) {
            qd0Var.b(f2, fMin);
            qd0Var.f(this.L, fMin, this.N);
            if (zUpdateExpandStateOnLayout) {
                qd0Var.a(this.c.mExpandStateOnLayout);
            }
        }
        this.K = fMin;
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredHeight2;
        Rect rect;
        if (this.o) {
            w(i, i2);
            return;
        }
        View view = this.f26368b;
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), this.E, this.f26368b.getPaddingRight(), this.f26368b.getPaddingBottom());
        }
        m(this.c);
        m(this.f);
        super.onMeasure(i, i2);
        ActionBarView actionBarView = this.c;
        boolean z = (actionBarView == null || actionBarView.getVisibility() == 8 || this.c.getMeasuredHeight() <= 0) ? false : true;
        if (z) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
            measuredHeight = this.c.isCollapsed() ? layoutParams.topMargin : layoutParams.bottomMargin + this.c.getMeasuredHeight() + layoutParams.topMargin;
        } else {
            measuredHeight = 0;
        }
        ActionBarContextView actionBarContextView = this.f;
        if ((actionBarContextView == null || actionBarContextView.getVisibility() == 8 || this.f.getMeasuredHeight() <= 0) ? false : true) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
            measuredHeight2 = this.f.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
        } else {
            measuredHeight2 = 0;
        }
        if (measuredHeight > 0 || measuredHeight2 > 0) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(measuredHeight, measuredHeight2));
        }
        View view2 = this.f26368b;
        if (view2 != null && view2.getVisibility() != 8 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(getMeasuredWidth(), Math.min(measuredHeight + this.f26368b.getMeasuredHeight(), View.MeasureSpec.getSize(i2)) + ((z || (rect = this.D) == null) ? 0 : rect.top));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && childAt.getMeasuredHeight() > 0 && childAt.getMeasuredWidth() > 0) {
                i3++;
            }
        }
        if (i3 == 0) {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // wc0.a
    public void onPageScrollStateChanged(int i) {
    }

    @Override // wc0.a
    public void onPageScrolled(int i, float f, boolean z, boolean z2) {
        ActionMenuView actionMenuView;
        if (!this.o || (actionMenuView = this.z) == null) {
            return;
        }
        actionMenuView.n(i, f, z, z2);
    }

    @Override // wc0.a
    public void onPageSelected(int i) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.f26371a;
        if (i == -1) {
            this.w = null;
        } else if (i == 0) {
            this.w = Boolean.FALSE;
        } else if (i == 1) {
            this.w = Boolean.TRUE;
        }
        int i2 = savedState.f26372b;
        if (i2 == -1) {
            this.x = null;
        } else if (i2 == 0) {
            this.x = Boolean.FALSE;
        } else if (i2 == 1) {
            this.x = Boolean.TRUE;
        }
        if (savedState.c) {
            setSupportBlur(true);
        }
        if (savedState.d) {
            setEnableBlur(true);
        }
        if (savedState.e && s()) {
            e(true);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        int i;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Boolean bool = this.w;
        int i2 = 0;
        if (bool == null) {
            i = -1;
        } else {
            i = bool.booleanValue() ? 1 : 0;
        }
        savedState.f26371a = i;
        Boolean bool2 = this.x;
        if (bool2 == null) {
            i2 = -1;
        } else if (bool2.booleanValue()) {
            i2 = 1;
        }
        savedState.f26372b = i2;
        savedState.c = t();
        savedState.d = s();
        savedState.e = r();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.o && super.onTouchEvent(motionEvent);
    }

    public final int p(ActionMenuView actionMenuView) {
        if (actionMenuView == null || actionMenuView.getVisibility() != 0 || actionMenuView.getAlpha() == 0.0f || actionMenuView.getCollapsedHeight() <= 0) {
            return 0;
        }
        return Math.max(0, (int) (actionMenuView.getCollapsedHeight() - actionMenuView.getTranslationY()));
    }

    public void q(boolean z) {
        if (this.j) {
            this.j = false;
            Animator animator = this.i;
            if (animator != null) {
                animator.cancel();
            }
            if (!z || !this.o) {
                setVisibility(8);
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "TranslationY", 0.0f, getHeight());
            this.i = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(q56.a() ? getContext().getResources().getInteger(R.integer.config_shortAnimTime) : 0L);
            this.i.addListener(this.Q);
            this.i.start();
        }
    }

    public boolean r() {
        return this.t.f();
    }

    public boolean s() {
        return this.t.g();
    }

    public void setActionBarBlur(Boolean bool) {
        if (s()) {
            if (bool == null) {
                this.w = null;
                e(this.u);
                return;
            }
            Boolean bool2 = this.w;
            if (bool2 == null || bool2.booleanValue() != bool.booleanValue()) {
                this.w = bool;
                e(bool.booleanValue());
            }
        }
    }

    public void setActionBarBlurByNestedScrolled(boolean z) {
        this.u = z;
        if (this.w != null) {
            return;
        }
        e(z);
    }

    public void setActionBarContextView(ActionBarContextView actionBarContextView) {
        this.f = actionBarContextView;
        if (actionBarContextView != null) {
            actionBarContextView.setActionBarView(this.c);
            this.g = this.f.getExpandState();
            this.h = this.f.isResizable();
        }
    }

    public void setActionBarCoordinateListener(cd0 cd0Var) {
        this.O = cd0Var;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setCoordinatedOffsetYInSearchModeAnimation(int i) {
        this.I = i;
        cd0 cd0Var = this.O;
        if (cd0Var != null) {
            cd0Var.a(this.L, this.K, this.N + i, this.M);
        }
    }

    public void setEnableBlur(boolean z) {
        this.t.m(z);
    }

    public void setIsMiuixFloating(boolean z) {
        this.G = z;
        ActionBarView actionBarView = this.c;
        if (actionBarView != null) {
            if (z) {
                this.d = actionBarView.getExpandState();
                this.e = this.c.isResizable();
                this.c.setExpandState(0);
                this.c.setResizable(false);
            } else {
                actionBarView.setResizable(this.e);
                this.c.setExpandState(this.d);
            }
        }
        ActionBarContextView actionBarContextView = this.f;
        if (actionBarContextView != null) {
            if (!z) {
                actionBarContextView.setResizable(this.h);
                this.f.setExpandState(this.g);
            } else {
                this.g = actionBarContextView.getExpandState();
                this.h = this.f.isResizable();
                this.f.setExpandState(0);
                this.f.setResizable(false);
            }
        }
    }

    public void setMiuixFloatingOnInit(boolean z) {
        this.G = z;
        ActionBarView actionBarView = this.c;
        if (actionBarView != null && z) {
            this.e = actionBarView.isResizable();
            this.c.setExpandState(0);
            this.c.setResizable(false);
            this.d = this.c.getExpandState();
        }
        ActionBarContextView actionBarContextView = this.f;
        if (actionBarContextView == null || !z) {
            return;
        }
        this.h = actionBarContextView.isResizable();
        this.f.setExpandState(0);
        this.f.setResizable(false);
        this.g = this.f.getExpandState();
    }

    public void setOverlayMode(boolean z) {
        this.H = z;
    }

    public void setPendingInsets(Rect rect) {
        if (this.o) {
            return;
        }
        if (this.D == null) {
            this.D = new Rect();
        }
        if (Objects.equals(this.D, rect)) {
            return;
        }
        this.D.set(rect);
        m(this.c);
        m(this.f);
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f26369k;
        Rect rect = null;
        if (drawable2 != null) {
            Rect bounds = drawable2.getBounds();
            this.f26369k.setCallback(null);
            unscheduleDrawable(this.f26369k);
            rect = bounds;
        }
        this.f26369k = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (rect == null) {
                requestLayout();
            } else {
                this.f26369k.setBounds(rect);
            }
            this.F = true;
        } else {
            this.F = false;
        }
        if (!this.o ? !(this.f26369k != null || this.m != null) : this.n == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitActionBarBlur(Boolean bool) {
        if (this.o) {
            this.x = bool;
            ActionMenuView actionMenuView = this.A;
            if (actionMenuView != null) {
                actionMenuView.e(bool != null ? bool.booleanValue() : this.v);
            }
            ActionMenuView actionMenuView2 = this.z;
            if (actionMenuView2 != null) {
                actionMenuView2.e(bool != null ? bool.booleanValue() : this.v);
            }
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.n);
        }
        this.n = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        boolean z = false;
        if (!this.o ? !(this.f26369k != null || this.m != null) : this.n == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.m);
        }
        this.m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        boolean z = false;
        if (!this.o ? !(this.f26369k != null || this.m != null) : this.n == null) {
            z = true;
        }
        setWillNotDraw(z);
        View view = this.f26368b;
        if (view != null) {
            view.setBackground(this.m);
        }
    }

    public void setSupportBlur(boolean z) {
        this.t.o(z);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f26368b;
        if (view != null) {
            removeView(view);
        }
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
            this.E = scrollingTabContainerView.getPaddingTop();
        } else {
            View view2 = this.f26368b;
            if (view2 != null) {
                view2.setBackground(null);
            }
        }
        this.f26368b = scrollingTabContainerView;
    }

    public void setTransitioning(boolean z) {
        this.f26367a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f26369k;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.n;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public boolean t() {
        return this.t.h();
    }

    public void u(ActionMenuView actionMenuView) {
        this.A = actionMenuView;
        if (actionMenuView == null || !t()) {
            return;
        }
        Boolean bool = this.x;
        actionMenuView.e((bool != null ? bool.booleanValue() : s()) && actionMenuView.getMeasuredWidth() > 0 && actionMenuView.getMeasuredHeight() > 0);
    }

    public void v(ActionMenuView actionMenuView) {
        if (this.A == actionMenuView) {
            this.A = null;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f26369k && !this.o) || (drawable == this.m && this.q) || ((drawable == this.n && this.o) || super.verifyDrawable(drawable));
    }

    @SuppressLint({"WrongCall", "WrongConstant"})
    public final void w(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        }
        int i3 = this.J;
        if (i3 != -1) {
            i2 = i3;
        }
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        int iMax = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            iMax = Math.max(iMax, getChildAt(i4).getMeasuredHeight());
        }
        if (iMax == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        ActionMenuView actionMenuView = this.z;
        if (actionMenuView == null || !actionMenuView.m()) {
            return;
        }
        ActionMenuView actionMenuView2 = this.z;
        if (!(actionMenuView2 instanceof ResponsiveActionMenuView) || ((ResponsiveActionMenuView) actionMenuView2).F()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), iMax);
    }

    public void x(View view, int i, int i2, int[] iArr, int i3, int[] iArr2) {
        ActionBarContextView actionBarContextView = this.f;
        if (actionBarContextView != null && actionBarContextView.getVisibility() == 0) {
            this.f.onNestedPreScroll(view, i, i2, iArr, i3, iArr2);
        } else if (!this.o && getVisibility() != 8) {
            this.c.onNestedPreScroll(view, i, i2, iArr, i3, iArr2);
        }
        if (!this.H || i2 <= 0 || i2 - iArr[1] <= 0) {
            return;
        }
        if (!this.o && getVisibility() == 8) {
            setActionBarBlurByNestedScrolled(true);
            this.c.setExpandState(0);
            cd0 cd0Var = this.O;
            if (cd0Var != null) {
                cd0Var.a(0, 1.0f, 0, this.M);
            }
        }
        if (isLayoutRequested()) {
            return;
        }
        setActionBarBlurByNestedScrolled(true);
    }

    public void y(View view, int i, int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        int i6 = iArr[1];
        ActionBarContextView actionBarContextView = this.f;
        if (actionBarContextView != null && actionBarContextView.getVisibility() == 0) {
            this.f.onNestedScroll(view, i, i2, i3, i4, i5, iArr, iArr2);
        } else if (!this.o && getVisibility() != 8) {
            this.c.onNestedScroll(view, i, i2, i3, i4, i5, iArr, iArr2);
        }
        int i7 = iArr[1] - i6;
        if (!this.H || i4 >= 0 || i7 > 0) {
            return;
        }
        setActionBarBlurByNestedScrolled(false);
        if (this.o || getVisibility() != 8) {
            return;
        }
        this.c.setExpandState(1);
        cd0 cd0Var = this.O;
        if (cd0Var != null) {
            int i8 = this.M;
            cd0Var.a(1, 0.0f, i8, i8);
        }
    }

    public void z(View view, View view2, int i, int i2) {
        ActionBarContextView actionBarContextView = this.f;
        if (actionBarContextView != null && actionBarContextView.getVisibility() == 0) {
            this.f.onNestedScrollAccepted(view, view2, i, i2);
        } else {
            if (this.o || getVisibility() == 8) {
                return;
            }
            this.c.onNestedScrollAccepted(view, view2, i, i2);
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = true;
        this.u = false;
        this.v = false;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.F = false;
        this.J = -1;
        this.K = 0.0f;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = null;
        this.P = new CopyOnWriteArrayList();
        this.Q = new a();
        this.R = new b();
        setBackground(null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g5j.f18626a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(g5j.c);
        this.f26369k = drawable;
        this.l = new Drawable[]{drawable, typedArrayObtainStyledAttributes.getDrawable(g5j.s), typedArrayObtainStyledAttributes.getDrawable(g5j.t)};
        this.C = typedArrayObtainStyledAttributes.getBoolean(g5j.u, false);
        if (getId() == vsi.g0) {
            this.o = true;
            this.n = typedArrayObtainStyledAttributes.getDrawable(g5j.f18629r);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.o) {
            setPadding(0, 0, 0, 0);
        }
        I();
        setWillNotDraw(!this.o ? !(this.f26369k == null && this.m == null) : this.n != null);
        this.s = true;
        this.t = new m5g(context, this, false, new c());
    }
}
