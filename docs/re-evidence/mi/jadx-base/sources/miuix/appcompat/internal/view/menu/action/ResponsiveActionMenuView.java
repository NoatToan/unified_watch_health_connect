package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.a43;
import defpackage.dmi;
import defpackage.dyq;
import defpackage.e3n;
import defpackage.g5j;
import defpackage.hm1;
import defpackage.m5g;
import defpackage.n5g;
import defpackage.rki;
import defpackage.s6g;
import defpackage.s72;
import defpackage.x33;
import defpackage.xi4;
import defpackage.y33;
import defpackage.z33;
import defpackage.zhi;
import defpackage.zvf;
import java.util.Collection;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.appcompat.internal.view.OutDropShadowView;

/* JADX INFO: loaded from: classes3.dex */
public class ResponsiveActionMenuView extends ActionMenuView {
    public final m5g A;
    public OutDropShadowView B;
    public View.OnLayoutChangeListener C;
    public int D;
    public AttributeSet E;
    public View F;
    public int G;
    public Rect H;
    public boolean I;
    public boolean[] J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public ViewOutlineProvider O;
    public AnimConfig P;
    public final Context f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26525k;
    public int l;
    public int m;
    public int n;
    public int o;
    public float p;
    public float q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f26526r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public Drawable x;
    public Drawable y;
    public Drawable z;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ResponsiveActionMenuView.this.n);
        }
    }

    public class b extends TransitionListener {
        public b() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            ResponsiveActionMenuView.this.G = UpdateInfo.findByName(collection, "target").getIntValue();
            ResponsiveActionMenuView.this.requestLayout();
        }
    }

    public class c implements m5g.a {
        public c() {
        }

        @Override // m5g.a
        public void a(m5g m5gVar) {
            boolean zD = hm1.d(ResponsiveActionMenuView.this.getContext(), zhi.F, true);
            m5gVar.l(m5g.d(ResponsiveActionMenuView.this.getContext(), ResponsiveActionMenuView.this.g ? ResponsiveActionMenuView.this.z : ResponsiveActionMenuView.this.x, zD ? y33.f39743b : x33.f38632b), zD ? a43.f594a : z33.f40830a, 66);
        }

        @Override // m5g.a
        public void b(boolean z) {
        }

        @Override // m5g.a
        public void c(boolean z) {
            ResponsiveActionMenuView.this.L = z;
            ResponsiveActionMenuView.this.P();
        }
    }

    public ResponsiveActionMenuView(Context context) {
        this(context, null);
    }

    private boolean E(View view) {
        return view == this.F;
    }

    private int getActionMenuItemCount() {
        int childCount = getChildCount();
        return indexOfChild(this.F) != -1 ? childCount - 1 : childCount;
    }

    private Rect getCustomViewClipBounds() {
        if (this.H == null) {
            this.H = new Rect();
        }
        this.H.set(0, 0, this.F.getMeasuredWidth(), this.F.getMeasuredHeight() - this.G);
        return this.H;
    }

    private int getMaxChildrenTotalHeight() {
        int iB;
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (!E(childAt) && (childAt instanceof LinearLayout) && i < (iB = B((LinearLayout) childAt))) {
                i = iB;
            }
        }
        return i;
    }

    public void A(View view) {
        if (zvf.f41714a && this.J == null) {
            this.J = new boolean[2];
            for (int i = 0; i < 2; i++) {
                Object parent = view.getParent();
                if (!(parent instanceof ViewGroup)) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                this.J[i] = viewGroup.getClipChildren();
                viewGroup.setClipChildren(false);
                view = (View) parent;
            }
        }
    }

    public final int B(LinearLayout linearLayout) {
        int childCount = linearLayout.getChildCount();
        int measuredHeight = 0;
        for (int i = 0; i < childCount; i++) {
            measuredHeight += linearLayout.getChildAt(i).getMeasuredHeight();
        }
        return measuredHeight;
    }

    public void C() {
        if (this.F == null || this.K) {
            return;
        }
        Folme.useValue(new Object[0]).setTo("target", Float.valueOf(0.0f)).to("target", Float.valueOf(this.F.getMeasuredHeight()), this.P);
        this.K = true;
    }

    public boolean D() {
        return this.A.g();
    }

    public boolean F() {
        return this.g;
    }

    public final void G() {
        if (this.I) {
            setTranslationY(dyq.d(this));
        }
    }

    public final /* synthetic */ void H(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        OutDropShadowView outDropShadowView = this.B;
        if (outDropShadowView != null) {
            outDropShadowView.layout(getLeft(), getTop(), getRight(), getBottom());
        }
    }

    public final void I(int i, int i2, boolean z) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!E(childAt)) {
                if (childAt instanceof LinearLayout) {
                    ((LinearLayout) childAt).setGravity(1);
                }
                if (z) {
                    childAt.setPadding(0, 0, 0, 0);
                } else {
                    childAt.setPadding(0, (!s6g.p(this) || (s6g.n(this.f) && !s6g.q(this.f))) ? this.v : this.u, 0, 0);
                }
                childAt.measure(i, i2);
            }
        }
    }

    public final void J() {
        K(this.E);
        P();
    }

    public final void K(AttributeSet attributeSet) {
        Context context = this.f;
        if (context == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            this.N = s72.i(xi4.a(context));
            typedArrayObtainStyledAttributes = this.f.obtainStyledAttributes(attributeSet, g5j.n2, zhi.Q, 0);
            this.x = typedArrayObtainStyledAttributes.getDrawable(this.N ? g5j.p2 : g5j.o2);
            this.z = typedArrayObtainStyledAttributes.getDrawable(this.N ? g5j.q2 : g5j.r2);
            typedArrayObtainStyledAttributes.recycle();
            if (n5g.f()) {
                this.y = new ColorDrawable(0);
            }
        } catch (Throwable th) {
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th;
        }
    }

    public void L() {
        View view = this.F;
        if (view == null || view.getParent() == null) {
            return;
        }
        removeView(this.F);
        this.G = 0;
        this.F = null;
        this.K = false;
    }

    public final void M(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (!E(childAt) && (childAt instanceof LinearLayout)) {
                ((LinearLayout) childAt).setPadding(0, i, 0, 0);
            }
        }
    }

    public final void N(View view) {
        boolean[] zArr;
        if (!zvf.f41714a || (zArr = this.J) == null) {
            return;
        }
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            Object parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                break;
            }
            ((ViewGroup) parent).setClipChildren(this.J[i]);
            view = (View) parent;
        }
        this.J = null;
    }

    public void O() {
        if (this.F == null || !this.K) {
            return;
        }
        Folme.useValue(new Object[0]).setTo("target", Float.valueOf(this.F.getMeasuredHeight())).to("target", Float.valueOf(0.0f), this.P);
        this.K = false;
    }

    public final void P() {
        if (this.g) {
            setOutlineProvider(this.O);
            setBackground(this.L ? this.y : this.z);
            return;
        }
        setOutlineProvider(null);
        if (this.e) {
            setBackground(null);
        } else {
            setBackground(this.L ? this.y : this.x);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, miuix.appcompat.internal.view.menu.i
    public boolean b(int i) {
        View childAt = getChildAt(i);
        if (E(childAt)) {
            return false;
        }
        ActionMenuView.LayoutParams layoutParams = (ActionMenuView.LayoutParams) childAt.getLayoutParams();
        return (layoutParams == null || !layoutParams.f26511a) && super.b(i);
    }

    @Override // defpackage.b43
    public void e(boolean z) {
        this.A.e(z);
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public void f() {
        setBackground(null);
    }

    public int getBottomMenuCustomViewOffset() {
        return this.G;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public int getCollapsedHeight() {
        if (this.i) {
            return 0;
        }
        int iD = dyq.d(this);
        View view = (View) getParent();
        int measuredHeight = view != null ? view.getMeasuredHeight() : 0;
        if (measuredHeight <= 0) {
            return 0;
        }
        return Math.max(measuredHeight, iD);
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public boolean m() {
        return this.h;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public void n(int i, float f, boolean z, boolean z2) {
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public void o() {
        super.o();
        e(false);
        N(this);
        OutDropShadowView outDropShadowView = this.B;
        if (outDropShadowView != null) {
            outDropShadowView.b();
            ViewGroup viewGroup = (ViewGroup) getParent();
            viewGroup.removeView(this.B);
            viewGroup.removeOnLayoutChangeListener(this.C);
            this.B = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (zvf.f41714a) {
            if (F()) {
                A(this);
                zvf.b(this, this.o, this.q, this.f26526r, this.n);
                return;
            } else {
                N(this);
                zvf.a(this);
                return;
            }
        }
        if (!F()) {
            OutDropShadowView outDropShadowView = this.B;
            if (outDropShadowView != null) {
                outDropShadowView.b();
                ViewGroup viewGroup = (ViewGroup) getParent();
                viewGroup.removeOnLayoutChangeListener(this.C);
                viewGroup.removeView(this.B);
                this.B = null;
                return;
            }
            return;
        }
        if (this.B == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
            OutDropShadowView outDropShadowView2 = new OutDropShadowView(getContext());
            this.B = outDropShadowView2;
            outDropShadowView2.setShadowHostViewRadius(this.n);
            ViewGroup viewGroup2 = (ViewGroup) getParent();
            viewGroup2.addView(this.B, layoutParams);
            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: psk
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    this.f30711a.H(view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            };
            this.C = onLayoutChangeListener;
            viewGroup2.addOnLayoutChangeListener(onLayoutChangeListener);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m5g m5gVar = this.A;
        if (m5gVar != null) {
            m5gVar.i();
        }
        int i = configuration.densityDpi;
        if (i == this.D) {
            if (this.N != s72.i(xi4.a(this.f))) {
                this.N = s72.i(this.f);
                J();
                return;
            }
            return;
        }
        this.D = i;
        this.j = this.M ? s6g.d(this.f, 16.0f) : s6g.d(this.f, 11.0f);
        this.l = s6g.d(this.f, 16.0f);
        this.m = s6g.d(this.f, 196.0f);
        this.u = s6g.d(this.f, 8.0f);
        this.v = s6g.d(this.f, 5.0f);
        this.w = s6g.d(this.f, 2.0f);
        Resources resources = getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(dmi.B);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(dmi.C);
        if (this.M) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        this.f26525k = dimensionPixelSize;
        this.n = resources.getDimensionPixelSize(dmi.v0);
        this.p = resources.getDimensionPixelSize(dmi.w0);
        this.q = resources.getDimensionPixelSize(dmi.x0);
        this.f26526r = resources.getDimensionPixelSize(dmi.y0);
        if (zvf.f41714a) {
            if (F()) {
                zvf.b(this, this.o, this.q, this.f26526r, this.p);
            } else {
                zvf.a(this);
            }
        }
        J();
        OutDropShadowView outDropShadowView = this.B;
        if (outDropShadowView != null) {
            outDropShadowView.setShadowHostViewRadius(this.n);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        e(false);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[PHI: r3
      0x0054: PHI (r3v1 int) = (r3v0 int), (r3v0 int), (r3v4 int) binds: [B:11:0x002e, B:13:0x0034, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredHeight2 = 0;
        if (this.h) {
            View view = this.F;
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            View view2 = this.F;
            dyq.h(this, view2, 0, 0, view2.getMeasuredWidth(), this.F.getMeasuredHeight());
            return;
        }
        View view3 = this.F;
        boolean z2 = false;
        if (view3 == null || view3.getVisibility() == 8) {
            i5 = measuredHeight2;
        } else {
            View view4 = this.F;
            dyq.h(this, view4, 0, 0, view4.getMeasuredWidth(), this.F.getMeasuredHeight());
            measuredHeight2 = this.F.getMeasuredHeight() - this.G;
            if (measuredHeight2 < 0) {
                i5 = 0;
            } else {
                i5 = measuredHeight2;
            }
        }
        int childCount = getChildCount();
        int actionMenuItemCount = getActionMenuItemCount();
        int paddingStart = getPaddingStart() + ((((measuredWidth - getPaddingStart()) - getPaddingEnd()) - ((this.s * actionMenuItemCount) + ((actionMenuItemCount - 1) * this.j))) / 2);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (!E(childAt)) {
                dyq.h(this, childAt, paddingStart, i5, paddingStart + childAt.getMeasuredWidth(), measuredHeight);
                paddingStart += childAt.getMeasuredWidth() + this.j;
            }
        }
        if (D() && measuredWidth > 0 && measuredHeight > 0) {
            z2 = true;
        }
        e(z2);
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        this.h = false;
        this.i = false;
        int paddingBottom = getPaddingBottom();
        int paddingTop = getPaddingTop() + paddingBottom;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        int actionMenuItemCount = getActionMenuItemCount();
        int size = View.MeasureSpec.getSize(i);
        if (childCount == 0 || actionMenuItemCount == 0) {
            this.t = 0;
            View view = this.F;
            if (view == null || view.getVisibility() == 8) {
                this.i = true;
                setMeasuredDimension(0, 0);
            } else {
                this.h = true;
                ActionMenuView.LayoutParams layoutParams = (ActionMenuView.LayoutParams) this.F.getLayoutParams();
                if (this.g) {
                    this.F.measure(View.MeasureSpec.makeMeasureSpec(size - (this.l * 2), 1073741824), ViewGroup.getChildMeasureSpec(i2, paddingTop, ((LinearLayout.LayoutParams) layoutParams).height));
                } else {
                    this.F.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), ViewGroup.getChildMeasureSpec(i2, paddingTop, ((LinearLayout.LayoutParams) layoutParams).height));
                }
                this.F.setClipBounds(getCustomViewClipBounds());
                int measuredWidth = this.F.getMeasuredWidth();
                int measuredHeight = (this.F.getMeasuredHeight() + paddingTop) - this.G;
                setMeasuredDimension(measuredWidth, measuredHeight >= 0 ? measuredHeight : 0);
            }
            G();
            return;
        }
        if (this.g) {
            this.s = s6g.d(this.f, 115.0f);
            int iD = s6g.d(this.f, 80.0f);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE);
            int i3 = (actionMenuItemCount - 1) * this.j;
            int i4 = (this.s * actionMenuItemCount) + i3;
            int i5 = this.l;
            if (i4 >= size - (i5 * 2)) {
                this.s = (((size - paddingLeft) - (i5 * 2)) - i3) / actionMenuItemCount;
            }
            I(View.MeasureSpec.makeMeasureSpec(this.s, 1073741824), iMakeMeasureSpec, true);
            M((iD - (getMaxChildrenTotalHeight() + (this.w * 2))) / 2);
            this.t = iD;
            size = Math.max((this.s * actionMenuItemCount) + paddingLeft + i3, this.m);
        } else {
            int i6 = ((size - paddingLeft) - ((actionMenuItemCount - 1) * this.j)) / actionMenuItemCount;
            this.s = i6;
            int i7 = this.f26525k + paddingBottom;
            I(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824), this.g);
            this.t = i7;
        }
        int measuredHeight2 = this.t + paddingTop;
        if (!this.g) {
            measuredHeight2 -= paddingBottom;
        }
        View view2 = this.F;
        if (view2 != null && view2.getVisibility() != 8) {
            this.F.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), ViewGroup.getChildMeasureSpec(i2, paddingTop, ((LinearLayout.LayoutParams) ((ActionMenuView.LayoutParams) this.F.getLayoutParams())).height));
            this.F.setClipBounds(getCustomViewClipBounds());
            measuredHeight2 = (measuredHeight2 + this.F.getMeasuredHeight()) - this.G;
        }
        setMeasuredDimension(size, measuredHeight2);
        G();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        e(false);
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public void p() {
        P();
    }

    public void setBottomMenuCustomViewTranslationYWithPx(int i) {
        if (this.F == null || i < 0) {
            return;
        }
        this.G = i;
        requestLayout();
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public void setEnableBlur(boolean z) {
        this.A.m(z);
        e(z && getMeasuredWidth() > 0 && getMeasuredHeight() > 0);
    }

    public void setHidden(boolean z) {
        this.I = z;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public void setSupportBlur(boolean z) {
        this.A.o(z);
    }

    public void setSuspendEnabled(boolean z) {
        if (this.g != z) {
            this.g = z;
            this.A.k();
            this.A.j();
        }
        P();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        OutDropShadowView outDropShadowView = this.B;
        if (outDropShadowView != null) {
            outDropShadowView.setTranslationY(f);
        }
    }

    public void z(View view) {
        if (view == null) {
            return;
        }
        this.F = view;
        addView(view);
    }

    public ResponsiveActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = false;
        this.h = false;
        this.i = false;
        this.B = null;
        this.C = null;
        this.G = 0;
        this.I = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.O = new a();
        this.P = new AnimConfig().setEase(-2, 0.9f, 0.25f).addListeners(new b());
        boolean z = hm1.d(context, zhi.H, true) && s6g.f(context) == 2;
        this.M = z;
        this.j = z ? s6g.d(context, 16.0f) : s6g.d(context, 11.0f);
        Resources resources = context.getResources();
        this.f26525k = this.M ? resources.getDimensionPixelSize(dmi.C) : resources.getDimensionPixelSize(dmi.B);
        this.l = s6g.d(context, 16.0f);
        this.m = s6g.d(context, 196.0f);
        this.u = s6g.d(context, 8.0f);
        this.v = s6g.d(context, 5.0f);
        this.w = s6g.d(context, 2.0f);
        this.n = context.getResources().getDimensionPixelSize(dmi.v0);
        this.o = context.getResources().getColor(rki.f);
        this.p = context.getResources().getDimensionPixelSize(dmi.w0);
        this.q = context.getResources().getDimensionPixelSize(dmi.x0);
        this.f26526r = context.getResources().getDimensionPixelSize(dmi.y0);
        this.D = context.getResources().getDisplayMetrics().densityDpi;
        this.f = context;
        this.E = attributeSet;
        setClickable(true);
        K(attributeSet);
        setClipToPadding(false);
        setWillNotDraw(false);
        e3n.e(this, true);
        this.A = new m5g(context, this, false, new c());
    }
}
