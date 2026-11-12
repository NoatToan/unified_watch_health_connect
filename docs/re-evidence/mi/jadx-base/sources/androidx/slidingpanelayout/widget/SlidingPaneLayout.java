package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.ChangeBounds;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import defpackage.fbh;
import defpackage.m80;
import defpackage.ni4;
import defpackage.psq;
import defpackage.rbd;
import defpackage.tlh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup implements fbh {
    public static boolean y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2993b;
    public Drawable c;
    public Drawable d;
    public boolean e;
    public View f;
    public float g;
    public float h;
    public int i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2994k;
    public float l;
    public float m;
    public final List<e> n;
    public e o;
    public final psq p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2995r;
    public final Rect s;
    public final ArrayList<c> t;
    public int u;
    public FoldingFeature v;
    public FoldingFeatureObserver.OnFoldingFeatureChangeListener w;
    public FoldingFeatureObserver x;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2998b;
        public int c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
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
            parcel.writeInt(this.f2998b ? 1 : 0);
            parcel.writeInt(this.c);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2998b = parcel.readInt() != 0;
            this.c = parcel.readInt();
        }
    }

    public class a implements FoldingFeatureObserver.OnFoldingFeatureChangeListener {
        public a() {
        }

        @Override // androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener
        public void onFoldingFeatureChange(FoldingFeature foldingFeature) {
            SlidingPaneLayout.this.v = foldingFeature;
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.b0(300L);
            changeBounds.d0(tlh.a(0.2f, 0.0f, 0.0f, 1.0f));
            androidx.transition.c.b(SlidingPaneLayout.this, changeBounds);
            SlidingPaneLayout.this.requestLayout();
        }
    }

    public class b extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f3000a = new Rect();

        public b() {
        }

        private void a(m80 m80Var, m80 m80Var2) {
            Rect rect = this.f3000a;
            m80Var2.l(rect);
            m80Var.e0(rect);
            m80Var.N0(m80Var2.U());
            m80Var.y0(m80Var2.w());
            m80Var.i0(m80Var2.o());
            m80Var.m0(m80Var2.r());
            m80Var.o0(m80Var2.J());
            m80Var.j0(m80Var2.H());
            m80Var.q0(m80Var2.K());
            m80Var.r0(m80Var2.L());
            m80Var.b0(m80Var2.E());
            m80Var.G0(m80Var2.R());
            m80Var.v0(m80Var2.O());
            m80Var.a(m80Var2.i());
            m80Var.x0(m80Var2.v());
        }

        public boolean b(View view) {
            return SlidingPaneLayout.this.k(view);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            m80 m80VarW = m80.W(m80Var);
            super.onInitializeAccessibilityNodeInfo(view, m80VarW);
            a(m80Var, m80VarW);
            m80VarW.Z();
            m80Var.i0("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            m80Var.I0(view);
            Object objG = androidx.core.view.c.G(view);
            if (objG instanceof View) {
                m80Var.A0((View) objG);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!b(childAt) && childAt.getVisibility() == 0) {
                    androidx.core.view.c.C0(childAt, 1);
                    m80Var.c(childAt);
                }
            }
        }

        @Override // androidx.core.view.a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (b(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f3002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SlidingPaneLayout f3003b;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3002a.getParent() == this.f3003b) {
                this.f3002a.setLayerType(0, null);
                this.f3003b.j(this.f3002a);
            }
            this.f3003b.t.remove(this);
        }
    }

    public class d extends psq.c {
        public d() {
        }

        public final boolean a() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.j || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.m() && SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            return SlidingPaneLayout.this.m() || SlidingPaneLayout.this.getLockMode() != 2;
        }

        @Override // psq.c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f.getLayoutParams();
            if (SlidingPaneLayout.this.l()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + SlidingPaneLayout.this.f.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.i);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.i + paddingLeft);
        }

        @Override // psq.c
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // psq.c
        public int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.this.i;
        }

        @Override // psq.c
        public void onEdgeDragStarted(int i, int i2) {
            if (a()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.p.c(slidingPaneLayout.f, i2);
            }
        }

        @Override // psq.c
        public void onEdgeTouched(int i, int i2) {
            if (a()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.p.c(slidingPaneLayout.f, i2);
            }
        }

        @Override // psq.c
        public void onViewCaptured(View view, int i) {
            SlidingPaneLayout.this.u();
        }

        @Override // psq.c
        public void onViewDragStateChanged(int i) {
            if (SlidingPaneLayout.this.p.B() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.g != 1.0f) {
                    slidingPaneLayout.e(slidingPaneLayout.f);
                    SlidingPaneLayout.this.q = true;
                } else {
                    slidingPaneLayout.x(slidingPaneLayout.f);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.d(slidingPaneLayout2.f);
                    SlidingPaneLayout.this.q = false;
                }
            }
        }

        @Override // psq.c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.p(i);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // psq.c
        public void onViewReleased(View view, float f, float f2) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.l()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.g > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.i;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.this.g > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.i;
                }
            }
            SlidingPaneLayout.this.p.P(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // psq.c
        public boolean tryCaptureView(View view, int i) {
            if (a()) {
                return ((LayoutParams) view.getLayoutParams()).f2997b;
            }
            return false;
        }
    }

    public interface e {
        void onPanelClosed(View view);

        void onPanelOpened(View view);

        void onPanelSlide(View view, float f);
    }

    public static class f extends FrameLayout {
        public f(View view) {
            super(view.getContext());
            addView(view);
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        y = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    public static Activity g(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private rbd getSystemGestureInsets() {
        WindowInsetsCompat windowInsetsCompatH;
        if (!y || (windowInsetsCompatH = androidx.core.view.c.H(this)) == null) {
            return null;
        }
        return windowInsetsCompatH.i();
    }

    public static Rect h(FoldingFeature foldingFeature, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getWidth());
        Rect rect2 = new Rect(foldingFeature.getBounds());
        boolean zIntersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !zIntersect) {
            return null;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return rect2;
    }

    public static int i(View view) {
        return view instanceof f ? androidx.core.view.c.C(((f) view).getChildAt(0)) : androidx.core.view.c.C(view);
    }

    public static int o(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return (((ViewGroup.MarginLayoutParams) layoutParams).width != 0 || layoutParams.f2996a <= 0.0f) ? View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824) : ViewGroup.getChildMeasureSpec(i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height);
    }

    private void setFoldingFeatureObserver(FoldingFeatureObserver foldingFeatureObserver) {
        this.x = foldingFeatureObserver;
        foldingFeatureObserver.setOnFoldingFeatureChangeListener(this.w);
    }

    public static boolean y(View view) {
        return view.isOpaque();
    }

    public void a(e eVar) {
        this.n.add(eVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new f(view), i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    public boolean b() {
        return c(0);
    }

    public final boolean c(int i) {
        if (!this.e) {
            this.q = false;
        }
        if (!this.f2995r && !v(1.0f, i)) {
            return false;
        }
        this.q = false;
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.fbh
    public void close() {
        b();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.p.n(true)) {
            if (this.e) {
                androidx.core.view.c.h0(this);
            } else {
                this.p.a();
            }
        }
    }

    public void d(View view) {
        Iterator<e> it = this.n.iterator();
        while (it.hasNext()) {
            it.next().onPanelClosed(view);
        }
        sendAccessibilityEvent(32);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int right;
        super.draw(canvas);
        Drawable drawable = l() ? this.d : this.c;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (l()) {
            right = childAt.getRight();
            i = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i2 = left - intrinsicWidth;
            i = left;
            right = i2;
        }
        drawable.setBounds(right, top, i, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (l() ^ m()) {
            this.p.N(1);
            rbd systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                psq psqVar = this.p;
                psqVar.M(Math.max(psqVar.x(), systemGestureInsets.f32378a));
            }
        } else {
            this.p.N(2);
            rbd systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                psq psqVar2 = this.p;
                psqVar2.M(Math.max(psqVar2.x(), systemGestureInsets2.c));
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.e && !layoutParams.f2997b && this.f != null) {
            canvas.getClipBounds(this.s);
            if (l()) {
                Rect rect = this.s;
                rect.left = Math.max(rect.left, this.f.getRight());
            } else {
                Rect rect2 = this.s;
                rect2.right = Math.min(rect2.right, this.f.getLeft());
            }
            canvas.clipRect(this.s);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    public void e(View view) {
        Iterator<e> it = this.n.iterator();
        while (it.hasNext()) {
            it.next().onPanelOpened(view);
        }
        sendAccessibilityEvent(32);
    }

    public void f(View view) {
        Iterator<e> it = this.n.iterator();
        while (it.hasNext()) {
            it.next().onPanelSlide(view, this.g);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.f2993b;
    }

    public final int getLockMode() {
        return this.u;
    }

    public int getParallaxDistance() {
        return this.f2994k;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.f2992a;
    }

    public void j(View view) {
        androidx.core.view.c.F0(view, ((LayoutParams) view.getLayoutParams()).d);
    }

    public boolean k(View view) {
        if (view == null) {
            return false;
        }
        return this.e && ((LayoutParams) view.getLayoutParams()).c && this.g > 0.0f;
    }

    public boolean l() {
        return androidx.core.view.c.A(this) == 1;
    }

    public boolean m() {
        return !this.e || this.g == 0.0f;
    }

    public boolean n() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Activity activityG;
        super.onAttachedToWindow();
        this.f2995r = true;
        if (this.x == null || (activityG = g(getContext())) == null) {
            return;
        }
        this.x.registerLayoutStateChangeCallback(activityG);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2995r = true;
        FoldingFeatureObserver foldingFeatureObserver = this.x;
        if (foldingFeatureObserver != null) {
            foldingFeatureObserver.unregisterLayoutStateChangeCallback();
        }
        int size = this.t.size();
        for (int i = 0; i < size; i++) {
            this.t.get(i).run();
        }
        this.t.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.e && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.q = this.p.F(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.e || (this.j && actionMasked != 0)) {
            this.p.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.p.b();
            return false;
        }
        if (actionMasked == 0) {
            this.j = false;
            float x = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.l = x;
            this.m = y2;
            if (this.p.F(this.f, (int) x, (int) y2) && k(this.f)) {
                z = true;
            }
            return this.p.Q(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x2 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float fAbs = Math.abs(x2 - this.l);
            float fAbs2 = Math.abs(y3 - this.m);
            if (fAbs > this.p.A() && fAbs2 > fAbs) {
                this.p.b();
                this.j = true;
                return false;
            }
        }
        z = false;
        if (this.p.Q(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean zL = l();
        int i10 = i3 - i;
        int paddingRight = zL ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zL ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f2995r) {
            this.g = (this.e && this.q) ? 0.0f : 1.0f;
        }
        int i11 = paddingRight;
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 8) {
                i5 = i11;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f2997b) {
                    int i13 = i10 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i13) - i11) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.i = iMin;
                    int i14 = zL ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.c = ((i11 + i14) + iMin) + (measuredWidth / 2) > i13;
                    int i15 = (int) (iMin * this.g);
                    this.g = i15 / iMin;
                    i5 = i11 + i14 + i15;
                    i6 = 0;
                } else if (!this.e || (i7 = this.f2994k) == 0) {
                    i5 = paddingRight;
                    i6 = 0;
                } else {
                    i6 = (int) ((1.0f - this.g) * i7);
                    i5 = paddingRight;
                }
                if (zL) {
                    i9 = (i10 - i5) + i6;
                    i8 = i9 - measuredWidth;
                } else {
                    i8 = i5 - i6;
                    i9 = i8 + measuredWidth;
                }
                childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                FoldingFeature foldingFeature = this.v;
                paddingRight += childAt.getWidth() + Math.abs((foldingFeature != null && foldingFeature.getOrientation() == FoldingFeature.Orientation.VERTICAL && this.v.isSeparating()) ? this.v.getBounds().width() : 0);
            }
            i12++;
            i11 = i5;
        }
        if (this.f2995r) {
            if (this.e && this.f2994k != 0) {
                s(this.g);
            }
            x(this.f);
        }
        this.f2995r = false;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x007c A[PHI: r15
      0x007c: PHI (r15v5 float) = (r15v1 float), (r15v6 float) binds: [B:16:0x0073, B:18:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int iMin;
        int i3;
        int iMax;
        int iMakeMeasureSpec;
        int iMax2;
        int i4;
        int iMakeMeasureSpec2;
        int measuredHeight;
        boolean z;
        int i5;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        ?? r8 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int iMax3 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        this.f = null;
        int i6 = 0;
        boolean z2 = false;
        int i7 = iMax3;
        float f2 = 0.0f;
        while (true) {
            i3 = 8;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int i8 = size;
            if (childAt.getVisibility() == 8) {
                layoutParams.c = r8;
            } else {
                float f3 = layoutParams.f2996a;
                if (f3 > 0.0f) {
                    f2 += f3;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width != 0) {
                        iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), (int) r8);
                        i4 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                        if (i4 == -2) {
                            if (mode == 0) {
                                i5 = mode;
                            } else {
                                i5 = Integer.MIN_VALUE;
                            }
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i5);
                        } else if (i4 == -1) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                        } else {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                        }
                        childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                        int measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                        if (measuredHeight > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight;
                            }
                        }
                        i7 -= measuredWidth;
                        if (i6 != 0) {
                            if (i7 < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            layoutParams.f2997b = z;
                            z2 |= z;
                            if (z) {
                                this.f = childAt;
                            }
                        }
                    }
                } else {
                    iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), (int) r8);
                    i4 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                    if (i4 == -2) {
                        if (mode == 0) {
                            i5 = mode;
                        } else {
                            i5 = Integer.MIN_VALUE;
                        }
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i5);
                    } else if (i4 == -1) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    }
                    childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight > iMin) {
                        if (mode2 == Integer.MIN_VALUE) {
                            iMin = Math.min(measuredHeight, paddingTop);
                        } else if (mode2 == 0) {
                            iMin = measuredHeight;
                        }
                    }
                    i7 -= measuredWidth2;
                    if (i6 != 0) {
                        if (i7 < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        layoutParams.f2997b = z;
                        z2 |= z;
                        if (z) {
                            this.f = childAt;
                        }
                    }
                }
            }
            i6++;
            size = i8;
            r8 = 0;
        }
        int i9 = size;
        int i10 = i7;
        if (z2 || f2 > 0.0f) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt2 = getChildAt(i11);
                if (childAt2.getVisibility() != i3) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    int measuredWidth3 = (((ViewGroup.MarginLayoutParams) layoutParams2).width != 0 || layoutParams2.f2996a <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z2) {
                        iMax = iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (layoutParams2.f2996a > 0.0f) {
                        iMax = measuredWidth3 + ((int) ((layoutParams2.f2996a * Math.max(0, i10)) / f2));
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMax = measuredWidth3;
                        iMakeMeasureSpec = 0;
                    }
                    int iO = o(childAt2, i2, getPaddingTop() + getPaddingBottom());
                    if (measuredWidth3 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iO);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                            }
                            iMin = measuredHeight2;
                        }
                    }
                }
                i11++;
                i3 = 8;
            }
        }
        ArrayList<Rect> arrayListW = w();
        if (arrayListW != null && !z2) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt3 = getChildAt(i12);
                if (childAt3.getVisibility() != 8) {
                    Rect rect = arrayListW.get(i12);
                    LayoutParams layoutParams3 = (LayoutParams) childAt3.getLayoutParams();
                    int i13 = ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), iMakeMeasureSpec3);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1 || (i(childAt3) != 0 && rect.width() < i(childAt3))) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax3 - i13, 1073741824), iMakeMeasureSpec3);
                        if (i12 != 0) {
                            layoutParams3.f2997b = true;
                            this.f = childAt3;
                            z2 = true;
                        }
                    } else {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), iMakeMeasureSpec3);
                    }
                }
            }
        }
        setMeasuredDimension(i9, iMin + getPaddingTop() + getPaddingBottom());
        this.e = z2;
        if (this.p.B() == 0 || z2) {
            return;
        }
        this.p.a();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        if (savedState.f2998b) {
            q();
        } else {
            b();
        }
        this.q = savedState.f2998b;
        setLockMode(savedState.c);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2998b = n() ? m() : this.q;
        savedState.c = this.u;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f2995r = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e) {
            return super.onTouchEvent(motionEvent);
        }
        this.p.G(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.l = x;
            this.m = y2;
        } else if (actionMasked == 1 && k(this.f)) {
            float x2 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float f2 = x2 - this.l;
            float f3 = y3 - this.m;
            int iA = this.p.A();
            if ((f2 * f2) + (f3 * f3) < iA * iA && this.p.F(this.f, (int) x2, (int) y3)) {
                c(0);
            }
        }
        return true;
    }

    @Override // defpackage.fbh
    public void open() {
        q();
    }

    public void p(int i) {
        if (this.f == null) {
            this.g = 0.0f;
            return;
        }
        boolean zL = l();
        LayoutParams layoutParams = (LayoutParams) this.f.getLayoutParams();
        int width = this.f.getWidth();
        if (zL) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = (i - ((zL ? getPaddingRight() : getPaddingLeft()) + (zL ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / this.i;
        this.g = paddingRight;
        if (this.f2994k != 0) {
            s(paddingRight);
        }
        f(this.f);
    }

    public boolean q() {
        return r(0);
    }

    public final boolean r(int i) {
        if (!this.e) {
            this.q = true;
        }
        if (!this.f2995r && !v(0.0f, i)) {
            return false;
        }
        this.q = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view.getParent() instanceof f) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.e) {
            return;
        }
        this.q = view == this.f;
    }

    public final void s(float f2) {
        boolean zL = l();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f) {
                float f3 = 1.0f - this.h;
                int i2 = this.f2994k;
                this.h = f2;
                int i3 = ((int) (f3 * i2)) - ((int) ((1.0f - f2) * i2));
                if (zL) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
            }
        }
    }

    @Deprecated
    public void setCoveredFadeColor(int i) {
        this.f2993b = i;
    }

    public final void setLockMode(int i) {
        this.u = i;
    }

    @Deprecated
    public void setPanelSlideListener(e eVar) {
        e eVar2 = this.o;
        if (eVar2 != null) {
            t(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.o = eVar;
    }

    public void setParallaxDistance(int i) {
        this.f2994k = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.c = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.d = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(ni4.e(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(ni4.e(getContext(), i));
    }

    @Deprecated
    public void setSliderFadeColor(int i) {
        this.f2992a = i;
    }

    public void t(e eVar) {
        this.n.remove(eVar);
    }

    public void u() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public boolean v(float f2, int i) {
        int paddingLeft;
        if (!this.e) {
            return false;
        }
        boolean zL = l();
        LayoutParams layoutParams = (LayoutParams) this.f.getLayoutParams();
        if (zL) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + (f2 * this.i)) + this.f.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + (f2 * this.i));
        }
        psq psqVar = this.p;
        View view = this.f;
        if (!psqVar.R(view, paddingLeft, view.getTop())) {
            return false;
        }
        u();
        androidx.core.view.c.h0(this);
        return true;
    }

    public final ArrayList<Rect> w() {
        Rect rectH;
        FoldingFeature foldingFeature = this.v;
        if (foldingFeature == null || !foldingFeature.isSeparating() || this.v.getBounds().left == 0 || this.v.getBounds().top != 0 || (rectH = h(this.v, this)) == null) {
            return null;
        }
        Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rectH.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new ArrayList<>(Arrays.asList(rect, new Rect(Math.min(width, rectH.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
    }

    public void x(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        View view2 = view;
        boolean zL = l();
        int width = zL ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zL ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !y(view)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount && (childAt = getChildAt(i)) != view2) {
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zL ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zL ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zL = zL;
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int[] e = {R.attr.layout_weight};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f2996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2997b;
        public boolean c;
        public Paint d;

        public LayoutParams() {
            super(-1, -1);
            this.f2996a = 0.0f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f2996a = 0.0f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2996a = 0.0f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2996a = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2996a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e);
            this.f2996a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2992a = 0;
        this.g = 1.0f;
        this.n = new CopyOnWriteArrayList();
        this.f2995r = true;
        this.s = new Rect();
        this.t = new ArrayList<>();
        this.w = new a();
        float f2 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        androidx.core.view.c.r0(this, new b());
        androidx.core.view.c.C0(this, 1);
        psq psqVarO = psq.o(this, 0.5f, new d());
        this.p = psqVarO;
        psqVarO.O(f2 * 400.0f);
        setFoldingFeatureObserver(new FoldingFeatureObserver(WindowInfoTracker.getOrCreate(context), ni4.h(context)));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
