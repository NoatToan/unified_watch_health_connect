package miuix.nestedheader.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import defpackage.fmi;
import defpackage.k5j;
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
public class LegacyNestedHeaderLayout extends NestedScrollingLayout {
    public int K;
    public int L;
    public int M;
    public int N;
    public float O;
    public float P;
    public float Q;
    public View R;
    public View S;
    public View T;
    public View U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public String n0;
    public NestedScrollingLayout.b o0;

    public class a implements NestedScrollingLayout.b {
        public a() {
        }

        @Override // miuix.nestedheader.widget.NestedScrollingLayout.b
        public void a(int i) {
            if (LegacyNestedHeaderLayout.this.k0) {
                LegacyNestedHeaderLayout.this.V();
            }
        }

        @Override // miuix.nestedheader.widget.NestedScrollingLayout.b
        public void b(int i) {
            if (i == 0) {
                LegacyNestedHeaderLayout.this.Y(true);
            } else {
                LegacyNestedHeaderLayout.this.X();
            }
        }

        @Override // miuix.nestedheader.widget.NestedScrollingLayout.b
        public void c(int i) {
            if (i == 0) {
                LegacyNestedHeaderLayout.this.Y(false);
            }
        }
    }

    public class b extends TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f26685a;

        public b(String str) {
            this.f26685a = str;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            UpdateInfo updateInfoFindByName = UpdateInfo.findByName(collection, this.f26685a);
            if (updateInfoFindByName == null || !LegacyNestedHeaderLayout.this.P(this.f26685a)) {
                return;
            }
            LegacyNestedHeaderLayout.this.U(updateInfoFindByName.getIntValue());
        }
    }

    public interface c {
    }

    public LegacyNestedHeaderLayout(Context context) {
        this(context, null);
    }

    public final void L(List<View> list, float f) {
        if (list == null) {
            return;
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, f));
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            it.next().setAlpha(fMax);
        }
    }

    public final void M(int i) {
        String string = Long.toString(SystemClock.elapsedRealtime());
        this.n0 = string;
        Folme.useValue(new Object[0]).setTo(string, Integer.valueOf(getScrollingProgress())).to(string, Integer.valueOf(i), new AnimConfig().addListeners(new b(string)));
    }

    public final void N(int i, int i2, boolean z) {
    }

    public boolean O() {
        return getHeaderViewVisible() && getScrollingProgress() >= 0;
    }

    public final boolean P(String str) {
        return (this.j0 || !this.n0.equals(str) || getAcceptedNestedFlingInConsumedProgress()) ? false : true;
    }

    public final List<View> Q(View view, boolean z) {
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

    public final List<View> R(View view) {
        return Q(view, this.M == zsi.f41629a || this.T != null);
    }

    public final List<View> S(View view) {
        return Q(view, this.N == zsi.d || this.U != null);
    }

    public final void T(View view, View view2, int i, int i2, boolean z) {
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

    public final void U(int i) {
        E(i);
        w(i);
    }

    public final void V() {
        int scrollingTo;
        if (getScrollingProgress() == 0 || getScrollingProgress() >= getScrollingTo() || getScrollingProgress() <= getScrollingFrom()) {
            return;
        }
        if (getScrollingProgress() <= getScrollingFrom() || getScrollingProgress() >= getScrollingFrom() * 0.5f) {
            scrollingTo = ((((float) getScrollingProgress()) < ((float) getScrollingFrom()) * 0.5f || getScrollingProgress() >= 0) && (getScrollingProgress() <= 0 || ((float) getScrollingProgress()) >= ((float) getScrollingTo()) * 0.5f) && ((float) getScrollingProgress()) >= ((float) getScrollingTo()) * 0.5f && getScrollingProgress() < getScrollingTo()) ? getScrollingTo() : 0;
        } else {
            scrollingTo = getScrollingFrom();
        }
        M(scrollingTo);
    }

    public final void W(boolean z, boolean z2, boolean z3) {
        int i;
        boolean z4;
        int i2;
        int i3;
        View view = this.R;
        boolean z5 = true;
        if (view == null || view.getVisibility() == 8) {
            i = 0;
            z4 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.R.getLayoutParams();
            this.V = marginLayoutParams.bottomMargin;
            this.W = marginLayoutParams.topMargin;
            int measuredHeight = this.R.getMeasuredHeight();
            this.g0 = measuredHeight;
            this.f0 = this.W + measuredHeight + this.V;
            View view2 = this.T;
            if (view2 != null) {
                this.d0 = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).bottomMargin;
            }
            i = (int) (this.O - this.f0);
            z4 = true;
        }
        View view3 = this.S;
        if (view3 == null || view3.getVisibility() == 8) {
            i2 = i;
            i3 = 0;
            z5 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.S.getLayoutParams();
            this.a0 = marginLayoutParams2.bottomMargin;
            this.b0 = marginLayoutParams2.topMargin;
            this.h0 = this.S.getMeasuredHeight();
            View view4 = this.U;
            if (view4 != null) {
                this.e0 = ((ViewGroup.MarginLayoutParams) view4.getLayoutParams()).bottomMargin;
            }
            i3 = this.h0 + this.b0 + this.a0;
            if (!z4) {
                i = -i3;
                i3 = 0;
            }
            i2 = i;
        }
        A(i2, i3, z4, z5, false, z, z2, false, z3);
    }

    public final void X() {
        this.n0 = Long.toString(SystemClock.elapsedRealtime());
    }

    public final void Y(boolean z) {
        this.j0 = z;
        if (z) {
            X();
        }
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    public int getHeaderProgressFrom() {
        return getScrollingFrom() + this.h + this.f0;
    }

    public View getHeaderView() {
        return this.R;
    }

    public boolean getHeaderViewVisible() {
        View view = this.R;
        return view != null && view.getVisibility() == 0;
    }

    public View getScrollableView() {
        return this.g;
    }

    public boolean getTriggerViewVisible() {
        View view = this.S;
        return view != null && view.getVisibility() == 0;
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout, android.view.View
    @RequiresApi(api = 21)
    public void onFinishInflate() {
        super.onFinishInflate();
        this.R = findViewById(this.K);
        View viewFindViewById = findViewById(this.L);
        this.S = viewFindViewById;
        View view = this.R;
        if (view == null && viewFindViewById == null) {
            throw new IllegalArgumentException("The headerView or triggerView attribute is required and must refer to a valid child.");
        }
        if (view != null) {
            View viewFindViewById2 = view.findViewById(this.M);
            this.T = viewFindViewById2;
            if (viewFindViewById2 == null) {
                this.T = this.R.findViewById(R.id.inputArea);
            }
        }
        View view2 = this.S;
        if (view2 != null) {
            View viewFindViewById3 = view2.findViewById(this.N);
            this.U = viewFindViewById3;
            if (viewFindViewById3 == null) {
                this.U = this.S.findViewById(R.id.inputArea);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View view = this.R;
        if (view != null) {
            this.c0 = view.getTop();
        }
    }

    public void setAcceptTriggerRootViewAlpha(boolean z) {
        this.l0 = z;
    }

    public void setAutoAllClose(boolean z) {
        if (!z || getScrollingProgress() <= getScrollingFrom()) {
            U(getScrollingFrom());
        } else {
            M(getScrollingFrom());
        }
    }

    public void setAutoAllOpen(boolean z) {
        if (!z || getScrollingProgress() >= getScrollingTo()) {
            U(getScrollingTo());
        } else {
            M(getScrollingTo());
        }
    }

    public void setAutoAnim(boolean z) {
        this.k0 = z;
    }

    public void setAutoHeaderClose(boolean z) {
        if (!getHeaderViewVisible() || getScrollingProgress() <= getScrollingFrom()) {
            return;
        }
        if (z) {
            M(getScrollingFrom());
        } else if (getHeaderViewVisible()) {
            U(getScrollingFrom());
        }
    }

    public void setAutoHeaderOpen(boolean z) {
        if (!getHeaderViewVisible() || getScrollingProgress() >= 0) {
            return;
        }
        if (z) {
            M(0);
        } else {
            U(0);
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
            M(scrollingFrom);
        } else if (scrollingFrom != -1) {
            U(scrollingFrom);
        }
    }

    public void setAutoTriggerOpen(boolean z) {
        if (!getTriggerViewVisible() || getScrollingProgress() >= getScrollingTo()) {
            return;
        }
        if (z) {
            M(getScrollingTo());
        } else {
            U(getScrollingTo());
        }
    }

    public void setHeaderRootViewAcceptAlpha(boolean z) {
        this.m0 = z;
    }

    public void setHeaderViewVisible(boolean z) {
        View view = this.R;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            W(false, false, z);
        }
    }

    public void setNestedHeaderChangedListener(c cVar) {
    }

    public void setTriggerViewVisible(boolean z) {
        View view = this.S;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            W(false, z, false);
        }
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    public void w(int i) {
        int iMax;
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        float f3;
        float f4;
        super.w(i);
        View view = this.S;
        if (view == null || view.getVisibility() == 8) {
            iMax = i;
            i2 = 0;
        } else {
            iMax = i - Math.max(0, Math.min(getScrollingTo(), i));
            int iMax2 = Math.max(getScrollingFrom(), Math.min(getScrollingTo(), i));
            int i5 = this.b0;
            View view2 = this.R;
            if (view2 == null || view2.getVisibility() == 8) {
                int i6 = this.b0 + this.a0 + this.h0;
                i3 = iMax2 + i6;
                i4 = i5;
                i2 = i6;
            } else {
                i3 = iMax2;
                i4 = this.f0 + this.b0;
                i2 = 0;
            }
            View view3 = this.U;
            if (view3 == null) {
                view3 = this.S;
            }
            View view4 = view3;
            T(this.S, view4, i4, ((i3 - this.a0) - this.b0) - this.h0, false);
            if (this.U == null) {
                f3 = i3 - this.a0;
                f4 = this.Q;
            } else {
                f3 = i3 - this.e0;
                f4 = this.Q;
            }
            float f5 = f3 / f4;
            float fMax = Math.max(0.0f, Math.min(1.0f, f5));
            if (this.l0) {
                this.S.setAlpha(fMax);
            } else {
                View view5 = this.S;
                if ((view5 instanceof ViewGroup) && ((ViewGroup) view5).getChildCount() > 0) {
                    for (int i7 = 0; i7 < ((ViewGroup) this.S).getChildCount(); i7++) {
                        ((ViewGroup) this.S).getChildAt(i7).setAlpha(fMax);
                    }
                }
            }
            L(S(view4), f5 - 1.0f);
        }
        View view6 = this.R;
        if (view6 != null && view6.getVisibility() != 8) {
            int i8 = this.c0 + this.W;
            View view7 = this.T;
            if (view7 == null) {
                view7 = this.R;
            }
            View view8 = view7;
            T(this.R, view8, i8, iMax, false);
            if (this.T == null) {
                f = iMax - this.V;
                f2 = this.P;
            } else {
                f = iMax - this.d0;
                f2 = this.P;
            }
            float f6 = (f + f2) / f2;
            float fMax2 = Math.max(0.0f, Math.min(1.0f, f6 + 1.0f));
            if (this.m0) {
                this.R.setAlpha(fMax2);
            } else {
                View view9 = this.R;
                if ((view9 instanceof ViewGroup) && ((ViewGroup) view9).getChildCount() > 0) {
                    for (int i9 = 0; i9 < ((ViewGroup) this.R).getChildCount(); i9++) {
                        ((ViewGroup) this.R).getChildAt(i9).setAlpha(fMax2);
                    }
                }
            }
            L(R(view8), f6);
            i2 = this.f0;
        }
        View view10 = this.g;
        view10.offsetTopAndBottom((i + i2) - view10.getTop());
        int i10 = this.i0;
        if (i - i10 > 0) {
            N(i10, i, true);
        } else if (i - i10 < 0) {
            N(i10, i, false);
        }
        this.i0 = i;
        D(O());
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    public void x(boolean z, int i, int i2, int i3, int i4) {
        super.x(z, i, i2, i3, i4);
        W(true, false, false);
    }

    public LegacyNestedHeaderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LegacyNestedHeaderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.V = 0;
        this.W = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = false;
        this.k0 = true;
        this.l0 = false;
        this.m0 = false;
        this.n0 = Long.toString(SystemClock.elapsedRealtime());
        this.o0 = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k5j.m);
        this.K = typedArrayObtainStyledAttributes.getResourceId(k5j.q, zsi.f41630b);
        this.L = typedArrayObtainStyledAttributes.getResourceId(k5j.x, zsi.e);
        this.M = typedArrayObtainStyledAttributes.getResourceId(k5j.o, zsi.f41629a);
        this.N = typedArrayObtainStyledAttributes.getResourceId(k5j.v, zsi.d);
        this.P = typedArrayObtainStyledAttributes.getDimension(k5j.p, context.getResources().getDimension(fmi.f17932a));
        this.Q = typedArrayObtainStyledAttributes.getDimension(k5j.w, context.getResources().getDimension(fmi.f17932a));
        this.O = typedArrayObtainStyledAttributes.getDimension(k5j.s, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        addOnScrollListener(this.o0);
    }
}
