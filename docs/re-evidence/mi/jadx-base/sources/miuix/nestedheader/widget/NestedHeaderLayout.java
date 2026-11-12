package miuix.nestedheader.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.RequiresApi;
import androidx.core.view.ScrollingView;
import defpackage.a43;
import defpackage.b43;
import defpackage.fmi;
import defpackage.hm1;
import defpackage.k5j;
import defpackage.m5g;
import defpackage.n5g;
import defpackage.pu6;
import defpackage.x33;
import defpackage.y33;
import defpackage.z33;
import defpackage.zsi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;

/* JADX INFO: loaded from: classes3.dex */
public class NestedHeaderLayout extends NestedScrollingLayout implements b43 {
    public boolean A0;
    public int B0;
    public String C0;
    public NestedScrollingLayout.b D0;
    public m5g K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public Drawable V;
    public boolean W;
    public float a0;
    public float b0;
    public View c0;
    public View d0;
    public View e0;
    public View f0;
    public View g0;
    public View h0;
    public View i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public Rect z0;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = (i4 - i2) - (i8 - i6);
            if (i9 != 0) {
                NestedHeaderLayout nestedHeaderLayout = NestedHeaderLayout.this;
                if (nestedHeaderLayout.e) {
                    nestedHeaderLayout.k0(true, false, false, false);
                    NestedHeaderLayout nestedHeaderLayout2 = NestedHeaderLayout.this;
                    nestedHeaderLayout2.j0(Math.min(nestedHeaderLayout2.getScrollingProgress() + i9, -NestedHeaderLayout.this.p0));
                }
            }
        }
    }

    public class b implements m5g.a {
        public b() {
        }

        @Override // m5g.a
        public void a(m5g m5gVar) {
            boolean zD = hm1.d(NestedHeaderLayout.this.getContext(), R.attr.isLightTheme, true);
            int[] iArrD = m5g.d(NestedHeaderLayout.this.getContext(), NestedHeaderLayout.this.U, zD ? y33.f39743b : x33.f38632b);
            int[] iArr = zD ? a43.f594a : z33.f40830a;
            if (NestedHeaderLayout.this.W) {
                m5gVar.l(new int[]{iArrD[0]}, new int[]{iArr[0]}, 66);
            } else {
                m5gVar.l(iArrD, iArr, 66);
            }
        }

        @Override // m5g.a
        public void b(boolean z) {
            if (z) {
                NestedHeaderLayout.this.V = new ColorDrawable(0);
            }
        }

        @Override // m5g.a
        public void c(boolean z) {
            if (z) {
                NestedHeaderLayout.this.d0.setBackground(NestedHeaderLayout.this.V);
            } else {
                NestedHeaderLayout.this.d0.setBackground(NestedHeaderLayout.this.U);
            }
            NestedHeaderLayout.S(NestedHeaderLayout.this);
        }
    }

    public class c implements NestedScrollingLayout.b {

        public class a extends TransitionListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f26690a;

            public a(String str) {
                this.f26690a = str;
            }

            @Override // miuix.animation.listener.TransitionListener
            public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
                UpdateInfo updateInfoFindByName = UpdateInfo.findByName(collection, this.f26690a);
                if (updateInfoFindByName == null || !NestedHeaderLayout.this.b0(this.f26690a)) {
                    return;
                }
                NestedHeaderLayout.this.g0(updateInfoFindByName.getIntValue());
            }
        }

        public c() {
        }

        @Override // miuix.nestedheader.widget.NestedScrollingLayout.b
        public void a(int i) {
            if (NestedHeaderLayout.this.w0) {
                e();
            }
        }

        @Override // miuix.nestedheader.widget.NestedScrollingLayout.b
        public void b(int i) {
            if (i == 0) {
                g(true);
            } else {
                f();
            }
        }

        @Override // miuix.nestedheader.widget.NestedScrollingLayout.b
        public void c(int i) {
            if (i == 0) {
                g(false);
            }
        }

        public final void d() {
            String string = Long.toString(SystemClock.elapsedRealtime());
            NestedHeaderLayout.this.C0 = string;
            Folme.useValue(new Object[0]).setTo(string, Integer.valueOf(NestedHeaderLayout.this.f26697r)).to(string, 0, new AnimConfig().setEase(-2, 1.0f, 0.4f).addListeners(new a(string)));
        }

        public final void e() {
            int scrollingFrom = NestedHeaderLayout.this.getScrollingFrom();
            int scrollingTo = NestedHeaderLayout.this.getScrollingTo();
            NestedHeaderLayout nestedHeaderLayout = NestedHeaderLayout.this;
            int i = nestedHeaderLayout.h + scrollingFrom;
            int scrollingProgress = nestedHeaderLayout.getScrollingProgress();
            if (scrollingProgress == 0 || scrollingProgress >= scrollingTo || scrollingProgress <= scrollingFrom) {
                if (NestedHeaderLayout.this.f26697r > 0) {
                    d();
                    return;
                }
                return;
            }
            if (NestedHeaderLayout.this.S && scrollingProgress < i * 0.33f) {
                scrollingTo = (NestedHeaderLayout.this.Z() || scrollingProgress >= i) ? NestedHeaderLayout.this.getHeaderCloseProgress() : NestedHeaderLayout.this.getScrollingFrom();
            } else if (scrollingProgress < scrollingTo * 0.5f) {
                if (!NestedHeaderLayout.this.S && scrollingProgress < 0) {
                    return;
                } else {
                    scrollingTo = 0;
                }
            }
            NestedHeaderLayout.this.X(scrollingTo);
        }

        public final void f() {
            NestedHeaderLayout.this.C0 = Long.toString(SystemClock.elapsedRealtime());
        }

        public final void g(boolean z) {
            NestedHeaderLayout.this.v0 = z;
            if (NestedHeaderLayout.this.v0) {
                f();
            }
        }
    }

    public class d extends TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f26692a;

        public d(String str) {
            this.f26692a = str;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            UpdateInfo updateInfoFindByName = UpdateInfo.findByName(collection, this.f26692a);
            if (updateInfoFindByName == null || !NestedHeaderLayout.this.b0(this.f26692a)) {
                return;
            }
            NestedHeaderLayout.this.h0(updateInfoFindByName.getIntValue());
        }
    }

    public interface e {
    }

    public NestedHeaderLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ e S(NestedHeaderLayout nestedHeaderLayout) {
        nestedHeaderLayout.getClass();
        return null;
    }

    private void W(List<View> list, float f) {
        if (list == null) {
            return;
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, f));
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            it.next().setAlpha(fMax);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(int i) {
        String string = Long.toString(SystemClock.elapsedRealtime());
        this.C0 = string;
        Folme.useValue(new Object[0]).setTo(string, Integer.valueOf(getScrollingProgress())).to(string, Integer.valueOf(i), new AnimConfig().setEase(-2, 1.0f, 0.35f).addListeners(new d(string)));
    }

    private void Y(int i, int i2, boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b0(String str) {
        return (this.v0 || !this.C0.equals(str) || getAcceptedNestedFlingInConsumedProgress()) ? false : true;
    }

    private List<View> c0(View view, boolean z) {
        if (view == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.add(view);
            return arrayList;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        } else {
            arrayList.add(view);
        }
        return arrayList;
    }

    private List<View> d0(View view) {
        return c0(view, this.P == zsi.f41629a || this.h0 != null);
    }

    private List<View> e0(View view) {
        return c0(view, this.Q == zsi.d || this.i0 != null);
    }

    private void f0(View view, View view2, int i, int i2, boolean z) {
        view.layout(view.getLeft(), i, view.getRight(), Math.max(i, view.getMeasuredHeight() + i + i2));
        if (view != view2) {
            int iMax = Math.max(view2.getTop(), 0);
            int top = view2.getTop();
            int measuredHeight = view2.getMeasuredHeight() + iMax;
            if (z) {
                i2 /= 2;
            }
            view2.layout(view2.getLeft(), iMax, view2.getRight(), Math.max(top, measuredHeight + i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(int i) {
        E(i);
        w(i);
    }

    public boolean Z() {
        return getHeaderViewVisible() && getScrollingProgress() >= getHeaderProgressTo();
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout, defpackage.zig
    public void a(int i, int i2) {
        super.a(i, i2);
        if (this.e) {
            j0(Math.min(i, 0));
        } else {
            i0(getScrollingProgress(), this.r0);
        }
    }

    public boolean a0() {
        return this.c;
    }

    @Override // defpackage.b43
    public void e(boolean z) {
        m5g m5gVar = this.K;
        if (m5gVar != null) {
            m5gVar.e(z);
        }
    }

    public final void g0(int i) {
        this.f26697r = i;
        E(getScrollingProgress());
        w(getScrollingProgress());
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    public int getHeaderCloseProgress() {
        return this.c ? getScrollingFrom() + this.h + this.t0 : getScrollingFrom();
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    public int getHeaderProgressFrom() {
        return this.c ? getScrollingFrom() + this.h + this.p0 : getScrollingFrom();
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    public int getHeaderProgressTo() {
        int scrollingFrom;
        int i;
        if (this.c) {
            scrollingFrom = getScrollingFrom() + this.h + this.p0;
            i = this.t0;
        } else {
            scrollingFrom = getScrollingFrom();
            i = this.p0;
        }
        return scrollingFrom + i;
    }

    public View getHeaderView() {
        return this.e0;
    }

    public boolean getHeaderViewVisible() {
        View view = this.e0;
        return view != null && view.getVisibility() == 0;
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout, defpackage.zig
    public int getNestedScrollableValue() {
        return -(this.t0 + this.p0);
    }

    public View getScrollableView() {
        return this.g;
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    public int getScrollableViewMaxHeightWithoutOverlay() {
        int measuredHeight;
        int i;
        View view;
        if (!this.e || (view = this.f0) == null || view.getVisibility() == 0) {
            View view2 = this.f0;
            if (view2 != null && view2.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f0.getLayoutParams();
                this.t0 = this.f0.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            measuredHeight = getMeasuredHeight() - this.h;
            i = this.t0;
        } else {
            measuredHeight = getMeasuredHeight();
            i = this.h;
        }
        return measuredHeight - i;
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    public int getStickyScrollToOnNested() {
        int scrollingFrom;
        int i;
        View view;
        if (this.e && (view = this.f0) != null && view.getVisibility() == 4) {
            scrollingFrom = getScrollingFrom();
            i = this.h;
        } else {
            scrollingFrom = getScrollingFrom() + this.h;
            i = this.t0;
        }
        return scrollingFrom + i;
    }

    public View getStickyView() {
        return this.f0;
    }

    public boolean getStickyViewVisible() {
        View view = this.f0;
        return view != null && view.getVisibility() == 0;
    }

    public boolean getTriggerViewVisible() {
        View view = this.g0;
        return view != null && view.getVisibility() == 0;
    }

    public final void i0(int i, int i2) {
        if (this.d0 != null) {
            int i3 = this.p0;
            if (!this.e) {
                i2 = i3;
            } else if (this.s > this.B0 || (i = i - getStickyScrollToOnNested()) > 0) {
                i = 0;
            }
            if (!this.c) {
                if (getTop() <= 0 && i < (-i2) && !this.A0) {
                    this.A0 = true;
                    this.d0.setVisibility(0);
                } else if ((getTop() > 0 || i >= (-i2)) && this.A0) {
                    this.A0 = false;
                    this.d0.setVisibility(4);
                }
                Rect clipBounds = this.g.getClipBounds();
                if (clipBounds == null) {
                    clipBounds = new Rect();
                }
                clipBounds.set(0, 0, this.g.getWidth(), this.g.getHeight());
                this.g.setClipBounds(clipBounds);
                return;
            }
            if (getTop() <= 0 && i < (-i2) && !this.A0) {
                this.A0 = true;
                this.d0.setVisibility(0);
                e(true);
            } else if ((getTop() > 0 || i >= (-i2)) && this.A0) {
                this.A0 = false;
                this.d0.setVisibility(4);
                e(false);
            }
            if (this.d0.getVisibility() == 0) {
                this.g.setClipBounds(null);
                return;
            }
            int height = this.d0.getHeight();
            if (this.W && this.d0.getClipBounds() != null) {
                height = this.d0.getClipBounds().height();
            }
            Rect clipBounds2 = this.g.getClipBounds();
            if (clipBounds2 == null) {
                clipBounds2 = new Rect();
            }
            clipBounds2.set(0, height - this.g.getTop(), this.g.getWidth(), this.g.getHeight());
            this.g.setClipBounds(clipBounds2);
        }
    }

    public void j0(int i) {
        E(i);
        w(i);
    }

    public final void k0(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        int i2 = 0;
        int i3 = this.c ? -(this.h + (getClipToPadding() ? 0 : getPaddingTop())) : 0;
        this.p0 = 0;
        View view = this.e0;
        if (view == null || view.getVisibility() == 8) {
            z5 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e0.getLayoutParams();
            this.j0 = marginLayoutParams.bottomMargin;
            this.k0 = marginLayoutParams.topMargin;
            int measuredHeight = this.e0.getMeasuredHeight();
            this.q0 = measuredHeight;
            this.p0 = measuredHeight + this.k0 + this.j0;
            View view2 = this.h0;
            if (view2 != null) {
                this.n0 = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).bottomMargin;
            }
            i3 += (int) ((-this.p0) + this.R);
            z5 = true;
        }
        this.t0 = 0;
        View view3 = this.f0;
        if (view3 == null || view3.getVisibility() == 8) {
            i = i3;
            z6 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f0.getLayoutParams();
            int measuredHeight2 = this.f0.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            this.t0 = measuredHeight2;
            if (this.c) {
                i3 += -measuredHeight2;
            }
            i = i3;
            z6 = true;
        }
        View view4 = this.g0;
        if (view4 == null || view4.getVisibility() == 8) {
            z7 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.g0.getLayoutParams();
            this.l0 = marginLayoutParams3.bottomMargin;
            this.m0 = marginLayoutParams3.topMargin;
            this.s0 = this.g0.getMeasuredHeight();
            View view5 = this.i0;
            if (view5 != null) {
                this.o0 = ((ViewGroup.MarginLayoutParams) view5.getLayoutParams()).bottomMargin;
            }
            i2 = this.l0 + this.s0 + this.m0;
            z7 = true;
        }
        if (this.e) {
            int i4 = -this.p0;
            if (z6 && this.f0.getVisibility() == 4) {
                i4 -= this.t0;
            }
            i2 = i4;
        }
        A(i, i2, z5, z7, z6, z, z2, z3, z4);
    }

    @Override // android.view.View
    public void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        i0(getScrollingProgress(), this.r0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c0 = getRootView();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m5g m5gVar = this.K;
        if (m5gVar != null) {
            m5gVar.i();
        }
        if (!n5g.f() || this.L || a0() || this.d != null) {
            return;
        }
        this.c = true;
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout, android.view.View
    @RequiresApi(api = 21)
    public void onFinishInflate() {
        super.onFinishInflate();
        this.e0 = findViewById(this.M);
        this.f0 = findViewById(this.N);
        this.g0 = findViewById(this.O);
        View view = this.f0;
        if (view != null) {
            view.addOnLayoutChangeListener(new a());
        }
        View view2 = this.e0;
        if (view2 == null && this.g0 == null && this.f0 == null) {
            throw new IllegalArgumentException("The headerView or triggerView or stickyView attribute is required and must refer to a valid child.");
        }
        if (view2 != null) {
            View viewFindViewById = view2.findViewById(this.P);
            this.h0 = viewFindViewById;
            if (viewFindViewById == null) {
                this.h0 = this.e0.findViewById(R.id.inputArea);
            }
        }
        View view3 = this.g0;
        if (view3 != null) {
            View viewFindViewById2 = view3.findViewById(this.Q);
            this.i0 = viewFindViewById2;
            if (viewFindViewById2 == null) {
                this.i0 = this.g0.findViewById(R.id.inputArea);
            }
        }
        if (this.d0 == null) {
            View view4 = new View(getContext());
            this.d0 = view4;
            view4.setVisibility(4);
            this.d0.setClickable(true);
            this.d0.setBackground(this.U);
            this.d0.setImportantForAccessibility(4);
            addView(this.d0, indexOfChild(this.g) + 1, new ViewGroup.LayoutParams(-1, -2));
        }
        this.c = true;
        this.K = new m5g(getContext(), this.d0, false, new b());
        this.L = pu6.E() || pu6.C() || pu6.F();
        if (!n5g.f() || this.L) {
            this.c = false;
        } else {
            setSupportBlur(true);
            setEnableBlur(true);
        }
        Boolean bool = this.d;
        if (bool != null) {
            this.c = bool.booleanValue();
        }
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        View childAt;
        super.onMeasure(i, i2);
        View view = this.e0;
        if (!(((view instanceof ViewGroup) && (view instanceof ScrollingView)) || (view instanceof ScrollView)) || (childAt = ((ViewGroup) view).getChildAt(0)) == null || childAt.getMeasuredHeight() <= this.e0.getMeasuredHeight()) {
            return;
        }
        this.e0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
    }

    public void setAcceptTriggerRootViewAlpha(boolean z) {
        this.x0 = z;
    }

    public void setAutoAllClose(boolean z) {
        if (this.G) {
            B(2, 1);
            i(0, this.t, new int[2], new int[2], 1);
            C(1);
        }
        if (getScrollingProgress() > getHeaderCloseProgress()) {
            if (z) {
                X(getHeaderCloseProgress());
            } else {
                h0(getHeaderCloseProgress());
            }
        }
    }

    public void setAutoAllOpen(boolean z) {
        if (this.G) {
            B(2, 1);
            k(0, 0, 0, -this.t, this.f26695b, 1);
            C(1);
        }
        if (getScrollingProgress() < getScrollingTo()) {
            if (z) {
                X(getScrollingTo());
            } else {
                h0(getScrollingTo());
            }
        }
    }

    public void setAutoAnim(boolean z) {
        this.w0 = z;
    }

    public void setAutoHeaderClose(boolean z) {
        if (this.G) {
            B(2, 1);
            i(0, this.t, new int[2], new int[2], 1);
            C(1);
        }
        if (!getHeaderViewVisible() || getScrollingProgress() <= getScrollingFrom()) {
            return;
        }
        if (z) {
            X(getHeaderCloseProgress());
        } else if (getHeaderViewVisible()) {
            h0(getHeaderCloseProgress());
        }
    }

    public void setAutoHeaderOpen(boolean z) {
        if (this.G) {
            B(2, 1);
            k(0, 0, 0, -this.t, this.f26695b, 1);
            C(1);
        }
        if (!getHeaderViewVisible() || getScrollingProgress() >= 0) {
            return;
        }
        if (z) {
            X(getHeaderProgressTo());
        } else {
            h0(getHeaderProgressTo());
        }
    }

    public void setAutoTriggerClose(boolean z) {
        int scrollingFrom;
        if (getTriggerViewVisible() && getHeaderViewVisible() && getScrollingProgress() > 0) {
            scrollingFrom = 0;
        } else {
            scrollingFrom = (!getTriggerViewVisible() || getHeaderViewVisible() || getScrollingProgress() <= getScrollingFrom()) ? -1 : getScrollingFrom();
        }
        if (scrollingFrom != -1 && z) {
            X(scrollingFrom);
        } else if (scrollingFrom != -1) {
            h0(scrollingFrom);
        }
    }

    public void setAutoTriggerOpen(boolean z) {
        if (this.G && !Z()) {
            B(2, 1);
            k(0, 0, 0, -this.t, this.f26695b, 1);
            C(1);
        }
        if (!getTriggerViewVisible() || getScrollingProgress() >= getScrollingTo()) {
            return;
        }
        if (z) {
            X(getScrollingTo());
        } else {
            h0(getScrollingTo());
        }
    }

    public void setEnableBlur(boolean z) {
        m5g m5gVar = this.K;
        if (m5gVar != null) {
            m5gVar.m(z);
        }
    }

    public void setHeaderAutoCloseEnable(boolean z) {
        this.S = z;
    }

    public void setHeaderRootViewAcceptAlpha(boolean z) {
        this.y0 = z;
    }

    public void setHeaderViewVisible(boolean z) {
        View view = this.e0;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            k0(false, false, false, z);
        }
    }

    public void setInSearchMode(boolean z) {
        this.e = z;
        if (z) {
            this.B0 = getNestedScrollableValue();
        } else {
            this.B0 = 0;
        }
        k0(false, false, false, false);
        requestLayout();
    }

    public void setNestedHeaderChangedListener(e eVar) {
    }

    public void setOverlayMode(boolean z) {
        this.d = Boolean.valueOf(z);
        this.c = z;
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    public void setSelfScrollFirst(boolean z) {
        boolean z2 = this.G;
        if (z2 != z && z2 && !Z()) {
            B(2, 1);
            k(0, 0, 0, -this.t, this.f26695b, 1);
            C(1);
            h0(0);
        }
        super.setSelfScrollFirst(z);
    }

    public void setStickyViewVisible(boolean z) {
        View view = this.f0;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            k0(false, false, z, false);
        }
    }

    public void setSupportBlur(boolean z) {
        m5g m5gVar = this.K;
        if (m5gVar != null) {
            m5gVar.o(z);
        }
    }

    public void setTriggerViewVisible(boolean z) {
        View view = this.g0;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            k0(false, z, false, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0296  */
    /* JADX WARN: Code duplicated, block: B:129:0x029a  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    public void w(int i) {
        int iMax;
        float f;
        float f2;
        int iMax2;
        int i2;
        int iMax3;
        boolean z;
        View view;
        int i3;
        int i4;
        float f3;
        float f4;
        float f5;
        float f6;
        super.w(i);
        int paddingTop = !getClipToPadding() ? getPaddingTop() : 0;
        int i5 = this.o ? this.f26697r : 0;
        View view2 = this.e0;
        boolean z2 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        View view3 = this.f0;
        boolean z3 = (view3 == null || view3.getVisibility() == 8) ? false : true;
        View view4 = this.g0;
        boolean z4 = (view4 == null || view4.getVisibility() == 8) ? false : true;
        int i6 = paddingTop + this.h;
        int i7 = z2 ? this.q0 + this.k0 + this.j0 : 0;
        if (z3) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f0.getLayoutParams();
            iMax = this.f0.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        } else {
            iMax = 0;
        }
        if (z4) {
            int i8 = this.m0 + this.l0 + this.s0;
            iMax2 = i - Math.max(0, Math.min(getScrollingTo(), i));
            int iMax4 = Math.max(getScrollingFrom(), Math.min(getScrollingTo(), i));
            int i9 = i6 + i5 + i7 + this.m0;
            if (this.T) {
                i9 += iMax;
            }
            int i10 = i9;
            View view5 = this.i0;
            if (view5 == null) {
                view5 = this.g0;
            }
            View view6 = view5;
            f = 1.0f;
            f2 = 0.0f;
            f0(this.g0, view6, i10, iMax4 - i8, false);
            if (this.i0 == null) {
                f5 = iMax4 - this.l0;
                f6 = this.b0;
            } else {
                f5 = iMax4 - this.o0;
                f6 = this.b0;
            }
            float f7 = f5 / f6;
            float fMax = Math.max(0.0f, Math.min(1.0f, f7));
            if (this.x0) {
                this.g0.setAlpha(fMax);
            } else {
                View view7 = this.g0;
                if ((view7 instanceof ViewGroup) && ((ViewGroup) view7).getChildCount() > 0) {
                    for (int i11 = 0; i11 < ((ViewGroup) this.g0).getChildCount(); i11++) {
                        ((ViewGroup) this.g0).getChildAt(i11).setAlpha(fMax);
                    }
                }
            }
            W(e0(view6), f7 - 1.0f);
        } else {
            f = 1.0f;
            f2 = 0.0f;
            iMax2 = i;
        }
        if (z2) {
            i2 = i6 + i7;
            View view8 = this.h0;
            if (view8 == null) {
                view8 = this.e0;
            }
            View view9 = view8;
            if (getScrollType() == 1) {
                int i12 = -this.e0.getTop();
                int iMax5 = Math.max(-i7, iMax2 + i6 + i5);
                this.e0.offsetTopAndBottom(i12 + iMax5);
                int iMax6 = (this.k0 + this.q0) - Math.max(0, this.h - iMax5);
                Rect clipBounds = this.e0.getClipBounds();
                if (clipBounds == null) {
                    clipBounds = new Rect();
                }
                clipBounds.set(0, this.q0 - iMax6, this.e0.getMeasuredWidth(), this.q0);
                this.e0.setClipBounds(clipBounds);
                this.r0 = iMax6 + this.k0 + this.j0;
            } else {
                f0(this.e0, view9, i6 + i5 + this.k0, iMax2, false);
                if (this.h0 == null) {
                    f3 = iMax2 - this.j0;
                    f4 = this.a0;
                } else {
                    f3 = iMax2 - this.n0;
                    f4 = this.a0;
                }
                float f8 = (f3 + f4) / f4;
                float fMax2 = Math.max(f2, Math.min(f, f8 + f));
                if (this.y0) {
                    this.e0.setAlpha(fMax2);
                } else {
                    View view10 = this.e0;
                    if ((view10 instanceof ViewGroup) && ((ViewGroup) view10).getChildCount() > 0) {
                        for (int i13 = 0; i13 < ((ViewGroup) this.e0).getChildCount(); i13++) {
                            ((ViewGroup) this.e0).getChildAt(i13).setAlpha(fMax2);
                        }
                    }
                }
                W(d0(view9), f8);
                this.r0 = this.e0.getHeight() + this.k0 + this.j0;
            }
        } else {
            i2 = i6;
        }
        int i14 = i7 + i6 + i5;
        if (z3) {
            i2 += iMax;
            int i15 = -this.f0.getTop();
            iMax3 = this.T ? Math.max(i6, iMax2 + i14) : Math.max(i6, i + i14);
            this.f0.offsetTopAndBottom(i15 + iMax3);
        } else {
            iMax3 = this.T ? Math.max(i6, iMax2 + i14) : Math.max(i6, i + i14);
        }
        int i16 = iMax3 + iMax;
        if (z3) {
            if (this.f0.getVisibility() == 4) {
                i16 = iMax3;
                iMax = 0;
            } else if (this.e && (i4 = this.s) < 0) {
                iMax = Math.max(0, iMax + i4);
            }
        }
        int i17 = iMax3 + iMax;
        int iMax7 = i + i2;
        if (!this.c) {
            iMax7 = this.e ? Math.max(iMax7, i17) : Math.min(iMax7, i17);
        }
        this.g.offsetTopAndBottom((-this.g.getTop()) + iMax7);
        int i18 = this.u0;
        if (i - i18 <= 0) {
            if (i - i18 < 0) {
                z = false;
                Y(i18, i, false);
            }
            this.u0 = i;
            D(Z());
            view = this.d0;
            if (view != null) {
                if (this.W) {
                    view.setClickable(z);
                    if (this.c0 != null) {
                        View view11 = this.d0;
                        i3 = 0;
                        view11.layout(view11.getLeft(), 0, this.d0.getLeft() + this.c0.getWidth(), this.c0.getHeight());
                    } else {
                        i3 = 0;
                    }
                    this.z0.set(i3, i3, this.d0.getWidth(), i16);
                    this.d0.setClipBounds(this.z0);
                } else {
                    view.setClickable(true);
                    View view12 = this.d0;
                    view12.layout(view12.getLeft(), z ? 1 : 0, this.d0.getRight(), i16);
                }
                i0(i, this.r0);
            }
        }
        Y(i18, i, true);
        z = false;
        this.u0 = i;
        D(Z());
        view = this.d0;
        if (view != null) {
            if (this.W) {
                view.setClickable(z);
                if (this.c0 != null) {
                    View view13 = this.d0;
                    i3 = 0;
                    view13.layout(view13.getLeft(), 0, this.d0.getLeft() + this.c0.getWidth(), this.c0.getHeight());
                } else {
                    i3 = 0;
                }
                this.z0.set(i3, i3, this.d0.getWidth(), i16);
                this.d0.setClipBounds(this.z0);
            } else {
                view.setClickable(true);
                View view14 = this.d0;
                view14.layout(view14.getLeft(), z ? 1 : 0, this.d0.getRight(), i16);
            }
            i0(i, this.r0);
        }
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    public void x(boolean z, int i, int i2, int i3, int i4) {
        super.x(z, i, i2, i3, i4);
        k0(true, false, false, false);
    }

    public NestedHeaderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedHeaderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = 0;
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = 0;
        this.s0 = 0;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = false;
        this.w0 = true;
        this.x0 = false;
        this.y0 = false;
        this.z0 = new Rect();
        this.A0 = false;
        this.B0 = 0;
        this.C0 = Long.toString(SystemClock.elapsedRealtime());
        this.D0 = new c();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k5j.m);
        this.M = typedArrayObtainStyledAttributes.getResourceId(k5j.q, zsi.f41630b);
        this.N = typedArrayObtainStyledAttributes.getResourceId(k5j.u, zsi.c);
        this.O = typedArrayObtainStyledAttributes.getResourceId(k5j.x, zsi.e);
        this.P = typedArrayObtainStyledAttributes.getResourceId(k5j.o, zsi.f41629a);
        this.Q = typedArrayObtainStyledAttributes.getResourceId(k5j.v, zsi.d);
        this.a0 = typedArrayObtainStyledAttributes.getDimension(k5j.p, context.getResources().getDimension(fmi.f17932a));
        this.b0 = typedArrayObtainStyledAttributes.getDimension(k5j.w, context.getResources().getDimension(fmi.f17932a));
        this.R = typedArrayObtainStyledAttributes.getDimension(k5j.s, 0.0f);
        this.S = typedArrayObtainStyledAttributes.getBoolean(k5j.n, true);
        this.T = typedArrayObtainStyledAttributes.getBoolean(k5j.t, false);
        try {
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(k5j.f23489r);
            this.U = drawable;
            if (drawable == null) {
                Drawable drawableMutate = hm1.h(getContext(), R.attr.windowBackground).mutate();
                this.U = drawableMutate;
                if ((drawableMutate instanceof BitmapDrawable) || (drawableMutate instanceof NinePatchDrawable)) {
                    this.W = true;
                }
            }
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("maskBackground error ");
            sb.append(e2);
        }
        typedArrayObtainStyledAttributes.recycle();
        addOnScrollListener(this.D0);
    }
}
