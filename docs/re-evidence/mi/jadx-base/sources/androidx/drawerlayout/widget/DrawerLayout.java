package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RestrictTo;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import defpackage.fbh;
import defpackage.k47;
import defpackage.kmi;
import defpackage.lii;
import defpackage.m80;
import defpackage.ni4;
import defpackage.p3b;
import defpackage.psq;
import defpackage.q80;
import defpackage.rbd;
import defpackage.v5j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements fbh {
    public static final int[] L = {R.attr.colorPrimaryDark};
    public static final int[] M = {R.attr.layout_gravity};
    public static final boolean N;
    public static final boolean O;
    public static boolean P;
    public CharSequence A;
    public Object B;
    public boolean C;
    public Drawable D;
    public Drawable E;
    public Drawable F;
    public Drawable G;
    public final ArrayList<View> H;
    public Rect I;
    public Matrix J;
    public final q80 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2267b;
    public int c;
    public int d;
    public float e;
    public Paint f;
    public final psq g;
    public final psq h;
    public final f i;
    public final f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2268k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2269r;
    public e s;
    public List<e> t;
    public float u;
    public float v;
    public Drawable w;
    public Drawable x;
    public Drawable y;
    public CharSequence z;

    public class a implements q80 {
        public a() {
        }

        @Override // defpackage.q80
        public boolean a(View view, q80.a aVar) {
            if (!DrawerLayout.this.C(view) || DrawerLayout.this.r(view) == 2) {
                return false;
            }
            DrawerLayout.this.f(view);
            return true;
        }
    }

    public class b implements View.OnApplyWindowInsetsListener {
        public b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).Q(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class c extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f2275a = new Rect();

        public c() {
        }

        public final void a(m80 m80Var, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.A(childAt)) {
                    m80Var.c(childAt);
                }
            }
        }

        public final void b(m80 m80Var, m80 m80Var2) {
            Rect rect = this.f2275a;
            m80Var2.l(rect);
            m80Var.e0(rect);
            m80Var.N0(m80Var2.U());
            m80Var.y0(m80Var2.w());
            m80Var.i0(m80Var2.o());
            m80Var.m0(m80Var2.r());
            m80Var.o0(m80Var2.J());
            m80Var.r0(m80Var2.L());
            m80Var.b0(m80Var2.E());
            m80Var.G0(m80Var2.R());
            m80Var.a(m80Var2.i());
        }

        @Override // androidx.core.view.a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewP = DrawerLayout.this.p();
            if (viewP == null) {
                return true;
            }
            CharSequence charSequenceS = DrawerLayout.this.s(DrawerLayout.this.t(viewP));
            if (charSequenceS == null) {
                return true;
            }
            text.add(charSequenceS);
            return true;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            if (DrawerLayout.N) {
                super.onInitializeAccessibilityNodeInfo(view, m80Var);
            } else {
                m80 m80VarW = m80.W(m80Var);
                super.onInitializeAccessibilityNodeInfo(view, m80VarW);
                m80Var.I0(view);
                Object objG = androidx.core.view.c.G(view);
                if (objG instanceof View) {
                    m80Var.A0((View) objG);
                }
                b(m80Var, m80VarW);
                m80VarW.Z();
                a(m80Var, (ViewGroup) view);
            }
            m80Var.i0("androidx.drawerlayout.widget.DrawerLayout");
            m80Var.q0(false);
            m80Var.r0(false);
            m80Var.a0(m80.a.e);
            m80Var.a0(m80.a.f);
        }

        @Override // androidx.core.view.a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.N || DrawerLayout.A(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class d extends androidx.core.view.a {
        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            if (DrawerLayout.A(view)) {
                return;
            }
            m80Var.A0(null);
        }
    }

    public interface e {
        void a(View view);

        void b(View view);

        void c(int i);

        void d(View view, float f);
    }

    public class f extends psq.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public psq f2278b;
        public final Runnable c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.b();
            }
        }

        public f(int i) {
            this.f2277a = i;
        }

        public final void a() {
            View viewN = DrawerLayout.this.n(this.f2277a == 3 ? 5 : 3);
            if (viewN != null) {
                DrawerLayout.this.f(viewN);
            }
        }

        public void b() {
            View viewN;
            int width;
            int iY = this.f2278b.y();
            boolean z = this.f2277a == 3;
            if (z) {
                viewN = DrawerLayout.this.n(3);
                width = (viewN != null ? -viewN.getWidth() : 0) + iY;
            } else {
                viewN = DrawerLayout.this.n(5);
                width = DrawerLayout.this.getWidth() - iY;
            }
            if (viewN != null) {
                if (((!z || viewN.getLeft() >= width) && (z || viewN.getLeft() <= width)) || DrawerLayout.this.r(viewN) != 0) {
                    return;
                }
                LayoutParams layoutParams = (LayoutParams) viewN.getLayoutParams();
                this.f2278b.R(viewN, width, viewN.getTop());
                layoutParams.c = true;
                DrawerLayout.this.invalidate();
                a();
                DrawerLayout.this.b();
            }
        }

        public void c() {
            DrawerLayout.this.removeCallbacks(this.c);
        }

        @Override // psq.c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            if (DrawerLayout.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // psq.c
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        public void d(psq psqVar) {
            this.f2278b = psqVar;
        }

        @Override // psq.c
        public int getViewHorizontalDragRange(View view) {
            if (DrawerLayout.this.D(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // psq.c
        public void onEdgeDragStarted(int i, int i2) {
            View viewN = (i & 1) == 1 ? DrawerLayout.this.n(3) : DrawerLayout.this.n(5);
            if (viewN == null || DrawerLayout.this.r(viewN) != 0) {
                return;
            }
            this.f2278b.c(viewN, i2);
        }

        @Override // psq.c
        public boolean onEdgeLock(int i) {
            return false;
        }

        @Override // psq.c
        public void onEdgeTouched(int i, int i2) {
            DrawerLayout.this.postDelayed(this.c, 160L);
        }

        @Override // psq.c
        public void onViewCaptured(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).c = false;
            a();
        }

        @Override // psq.c
        public void onViewDragStateChanged(int i) {
            DrawerLayout.this.V(i, this.f2278b.w());
        }

        @Override // psq.c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.c(view, 3) ? i + width : DrawerLayout.this.getWidth() - i) / width;
            DrawerLayout.this.S(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // psq.c
        public void onViewReleased(View view, float f, float f2) {
            int i;
            float fU = DrawerLayout.this.u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && fU > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && fU > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f2278b.P(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // psq.c
        public boolean tryCaptureView(View view, int i) {
            return DrawerLayout.this.D(view) && DrawerLayout.this.c(view, this.f2277a) && DrawerLayout.this.r(view) == 0;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        N = true;
        O = true;
        P = i >= 29;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public static boolean A(View view) {
        return (androidx.core.view.c.y(view) == 4 || androidx.core.view.c.y(view) == 2) ? false : true;
    }

    public static String w(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public boolean B(View view) {
        return ((LayoutParams) view.getLayoutParams()).f2270a == 0;
    }

    public boolean C(View view) {
        if (D(view)) {
            return (((LayoutParams) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean D(View view) {
        int iB = p3b.b(((LayoutParams) view.getLayoutParams()).f2270a, androidx.core.view.c.A(view));
        return ((iB & 3) == 0 && (iB & 5) == 0) ? false : true;
    }

    public boolean E(View view) {
        if (D(view)) {
            return ((LayoutParams) view.getLayoutParams()).f2271b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean F(float f2, float f3, View view) {
        if (this.I == null) {
            this.I = new Rect();
        }
        view.getHitRect(this.I);
        return this.I.contains((int) f2, (int) f3);
    }

    public final void G(Drawable drawable, int i) {
        if (drawable == null || !k47.h(drawable)) {
            return;
        }
        k47.m(drawable, i);
    }

    public void H(View view, float f2) {
        float fU = u(view);
        float width = view.getWidth();
        int i = ((int) (width * f2)) - ((int) (fU * width));
        if (!c(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        S(view, f2);
    }

    public void I(int i) {
        J(i, true);
    }

    public void J(int i, boolean z) {
        View viewN = n(i);
        if (viewN != null) {
            L(viewN, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i));
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z) {
        if (!D(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.m) {
            layoutParams.f2271b = 1.0f;
            layoutParams.d = 1;
            U(view, true);
            T(view);
        } else if (z) {
            layoutParams.d |= 2;
            if (c(view, 3)) {
                this.g.R(view, 0, view.getTop());
            } else {
                this.h.R(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            H(view, 1.0f);
            V(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void M(e eVar) {
        List<e> list;
        if (eVar == null || (list = this.t) == null) {
            return;
        }
        list.remove(eVar);
    }

    public final Drawable N() {
        int iA = androidx.core.view.c.A(this);
        if (iA == 0) {
            Drawable drawable = this.D;
            if (drawable != null) {
                G(drawable, iA);
                return this.D;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                G(drawable2, iA);
                return this.E;
            }
        }
        return this.F;
    }

    public final Drawable O() {
        int iA = androidx.core.view.c.A(this);
        if (iA == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                G(drawable, iA);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.D;
            if (drawable2 != null) {
                G(drawable2, iA);
                return this.D;
            }
        }
        return this.G;
    }

    public final void P() {
        if (O) {
            return;
        }
        this.x = N();
        this.y = O();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void Q(Object obj, boolean z) {
        this.B = obj;
        this.C = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void R(int i, int i2) {
        View viewN;
        int iB = p3b.b(i2, androidx.core.view.c.A(this));
        if (i2 == 3) {
            this.n = i;
        } else if (i2 == 5) {
            this.o = i;
        } else if (i2 == 8388611) {
            this.p = i;
        } else if (i2 == 8388613) {
            this.q = i;
        }
        if (i != 0) {
            (iB == 3 ? this.g : this.h).b();
        }
        if (i != 1) {
            if (i == 2 && (viewN = n(iB)) != null) {
                K(viewN);
                return;
            }
            return;
        }
        View viewN2 = n(iB);
        if (viewN2 != null) {
            f(viewN2);
        }
    }

    public void S(View view, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 == layoutParams.f2271b) {
            return;
        }
        layoutParams.f2271b = f2;
        l(view, f2);
    }

    public final void T(View view) {
        m80.a aVar = m80.a.y;
        androidx.core.view.c.k0(view, aVar.b());
        if (!C(view) || r(view) == 2) {
            return;
        }
        androidx.core.view.c.m0(view, aVar, null, this.K);
    }

    public final void U(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || D(childAt)) && !(z && childAt == view)) {
                androidx.core.view.c.C0(childAt, 4);
            } else {
                androidx.core.view.c.C0(childAt, 1);
            }
        }
    }

    public void V(int i, View view) {
        int i2;
        int iB = this.g.B();
        int iB2 = this.h.B();
        if (iB == 1 || iB2 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (iB != 2 && iB2 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f2 = ((LayoutParams) view.getLayoutParams()).f2271b;
            if (f2 == 0.0f) {
                j(view);
            } else if (f2 == 1.0f) {
                k(view);
            }
        }
        if (i2 != this.f2268k) {
            this.f2268k = i2;
            List<e> list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.t.get(size).c(i2);
                }
            }
        }
    }

    public void a(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.t == null) {
            this.t = new ArrayList();
        }
        this.t.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!D(childAt)) {
                this.H.add(childAt);
            } else if (C(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            int size = this.H.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.H.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.H.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (o() != null || D(view)) {
            androidx.core.view.c.C0(view, 4);
        } else {
            androidx.core.view.c.C0(view, 1);
        }
        if (N) {
            return;
        }
        androidx.core.view.c.r0(view, this.f2266a);
    }

    public void b() {
        if (this.f2269r) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f2269r = true;
    }

    public boolean c(View view, int i) {
        return (t(view) & i) == i;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.fbh
    public void close() {
        d(8388611);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i).getLayoutParams()).f2271b);
        }
        this.e = fMax;
        boolean zN = this.g.n(true);
        boolean zN2 = this.h.n(true);
        if (zN || zN2) {
            androidx.core.view.c.h0(this);
        }
    }

    public void d(int i) {
        e(i, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (F(x, y, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean zB = B(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zB) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && D(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f2 = this.e;
        if (f2 > 0.0f && zB) {
            int i4 = this.d;
            this.f.setColor((i4 & 16777215) | (((int) ((((-16777216) & i4) >>> 24) * f2)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.f);
        } else if (this.x != null && c(view, 3)) {
            int intrinsicWidth = this.x.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.g.y(), 1.0f));
            this.x.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.x.setAlpha((int) (fMax * 255.0f));
            this.x.draw(canvas);
        } else if (this.y != null && c(view, 5)) {
            int intrinsicWidth2 = this.y.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.h.y(), 1.0f));
            this.y.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.y.setAlpha((int) (fMax2 * 255.0f));
            this.y.draw(canvas);
        }
        return zDrawChild;
    }

    public void e(int i, boolean z) {
        View viewN = n(i);
        if (viewN != null) {
            g(viewN, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z) {
        if (!D(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.m) {
            layoutParams.f2271b = 0.0f;
            layoutParams.d = 0;
        } else if (z) {
            layoutParams.d |= 4;
            if (c(view, 3)) {
                this.g.R(view, -view.getWidth(), view.getTop());
            } else {
                this.h.R(view, getWidth(), view.getTop());
            }
        } else {
            H(view, 0.0f);
            V(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (O) {
            return this.f2267b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.w;
    }

    public void h() {
        i(false);
    }

    public void i(boolean z) {
        int childCount = getChildCount();
        boolean zR = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (D(childAt) && (!z || layoutParams.c)) {
                zR |= c(childAt, 3) ? this.g.R(childAt, -childAt.getWidth(), childAt.getTop()) : this.h.R(childAt, getWidth(), childAt.getTop());
                layoutParams.c = false;
            }
        }
        this.i.c();
        this.j.c();
        if (zR) {
            invalidate();
        }
    }

    public void j(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.d & 1) == 1) {
            layoutParams.d = 0;
            List<e> list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.t.get(size).b(view);
                }
            }
            U(view, false);
            T(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    public void k(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.d & 1) == 0) {
            layoutParams.d = 1;
            List<e> list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.t.get(size).a(view);
                }
            }
            U(view, true);
            T(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void l(View view, float f2) {
        List<e> list = this.t;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.t.get(size).d(view, f2);
            }
        }
    }

    public final boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventV = v(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventV);
            motionEventV.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    public View n(int i) {
        int iB = p3b.b(i, androidx.core.view.c.A(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((t(childAt) & 7) == iB) {
                return childAt;
            }
        }
        return null;
    }

    public View o() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.C || this.w == null) {
            return;
        }
        Object obj = this.B;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.w.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.w.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewU;
        int actionMasked = motionEvent.getActionMasked();
        boolean zQ = this.g.Q(motionEvent) | this.h.Q(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i(true);
                this.f2269r = false;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i(true);
                    this.f2269r = false;
                }
            } else if (this.g.e(3)) {
                this.i.c();
                this.j.c();
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.u = x;
            this.v = y;
            z = this.e > 0.0f && (viewU = this.g.u((int) x, (int) y)) != null && B(viewU);
            this.f2269r = false;
        }
        return zQ || z || y() || this.f2269r;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !z()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewP = p();
        if (viewP != null && r(viewP) == 0) {
            h();
        }
        return viewP != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f2;
        int i5;
        boolean z2 = true;
        this.l = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i8, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f3 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.f2271b * f3));
                        f2 = (measuredWidth + i5) / f3;
                    } else {
                        float f4 = measuredWidth;
                        int i9 = i6 - ((int) (layoutParams.f2271b * f4));
                        f2 = (i6 - i9) / f4;
                        i5 = i9;
                    }
                    boolean z3 = f2 != layoutParams.f2271b ? z2 : false;
                    int i10 = layoutParams.f2270a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i14 > i11 - i15) {
                                i12 = (i11 - i15) - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z3) {
                        S(childAt, f2);
                    }
                    int i18 = layoutParams.f2271b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (P && (rootWindowInsets = getRootWindowInsets()) != null) {
            rbd rbdVarI = WindowInsetsCompat.x(rootWindowInsets).i();
            psq psqVar = this.g;
            psqVar.M(Math.max(psqVar.x(), rbdVarI.f32378a));
            psq psqVar2 = this.h;
            psqVar2.M(Math.max(psqVar2.x(), rbdVarI.c));
        }
        this.l = false;
        this.m = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z = this.B != null && androidx.core.view.c.x(this);
        int iA = androidx.core.view.c.A(this);
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int iB = p3b.b(layoutParams.f2270a, iA);
                    if (androidx.core.view.c.x(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.B;
                        if (iB == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iB == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.B;
                        if (iB == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iB == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!D(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (O) {
                        float fV = androidx.core.view.c.v(childAt);
                        float f2 = this.f2267b;
                        if (fV != f2) {
                            androidx.core.view.c.z0(childAt, f2);
                        }
                    }
                    int iT = t(childAt) & 7;
                    boolean z4 = iT == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(iT) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.c + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View viewN;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        int i = savedState.f2272b;
        if (i != 0 && (viewN = n(i)) != null) {
            K(viewN);
        }
        int i2 = savedState.c;
        if (i2 != 3) {
            R(i2, 3);
        }
        int i3 = savedState.d;
        if (i3 != 3) {
            R(i3, 5);
        }
        int i4 = savedState.e;
        if (i4 != 3) {
            R(i4, 8388611);
        }
        int i5 = savedState.f;
        if (i5 != 3) {
            R(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        P();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                savedState.f2272b = layoutParams.f2270a;
                break;
            }
        }
        savedState.c = this.n;
        savedState.d = this.o;
        savedState.e = this.p;
        savedState.f = this.q;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewO;
        this.g.G(motionEvent);
        this.h.G(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.u = x;
            this.v = y;
            this.f2269r = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            View viewU = this.g.u((int) x2, (int) y2);
            if (viewU != null && B(viewU)) {
                float f2 = x2 - this.u;
                float f3 = y2 - this.v;
                int iA = this.g.A();
                z = (f2 * f2) + (f3 * f3) >= ((float) (iA * iA)) || (viewO = o()) == null || r(viewO) == 2;
            }
            i(z);
        } else if (action == 3) {
            i(true);
            this.f2269r = false;
        }
        return true;
    }

    @Override // defpackage.fbh
    public void open() {
        I(8388611);
    }

    public View p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (D(childAt) && E(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i) {
        int iA = androidx.core.view.c.A(this);
        if (i == 3) {
            int i2 = this.n;
            if (i2 != 3) {
                return i2;
            }
            int i3 = iA == 0 ? this.p : this.q;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.o;
            if (i4 != 3) {
                return i4;
            }
            int i5 = iA == 0 ? this.q : this.p;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.p;
            if (i6 != 3) {
                return i6;
            }
            int i7 = iA == 0 ? this.n : this.o;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.q;
        if (i8 != 3) {
            return i8;
        }
        int i9 = iA == 0 ? this.o : this.n;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    public int r(View view) {
        if (D(view)) {
            return q(((LayoutParams) view.getLayoutParams()).f2270a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.l) {
            return;
        }
        super.requestLayout();
    }

    public CharSequence s(int i) {
        int iB = p3b.b(i, androidx.core.view.c.A(this));
        if (iB == 3) {
            return this.z;
        }
        if (iB == 5) {
            return this.A;
        }
        return null;
    }

    public void setDrawerElevation(float f2) {
        this.f2267b = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (D(childAt)) {
                androidx.core.view.c.z0(childAt, this.f2267b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.s;
        if (eVar2 != null) {
            M(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.s = eVar;
    }

    public void setDrawerLockMode(int i) {
        R(i, 3);
        R(i, 5);
    }

    public void setScrimColor(int i) {
        this.d = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.w = new ColorDrawable(i);
        invalidate();
    }

    public int t(View view) {
        return p3b.b(((LayoutParams) view.getLayoutParams()).f2270a, androidx.core.view.c.A(this));
    }

    public float u(View view) {
        return ((LayoutParams) view.getLayoutParams()).f2271b;
    }

    public final MotionEvent v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.J == null) {
                this.J = new Matrix();
            }
            matrix.invert(this.J);
            motionEventObtain.transform(this.J);
        }
        return motionEventObtain;
    }

    public final boolean y() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        return p() != null;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lii.f25102a);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2266a = new d();
        this.d = -1728053248;
        this.f = new Paint();
        this.m = true;
        this.n = 3;
        this.o = 3;
        this.p = 3;
        this.q = 3;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.K = new a();
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.c = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        f fVar = new f(3);
        this.i = fVar;
        f fVar2 = new f(5);
        this.j = fVar2;
        psq psqVarO = psq.o(this, 1.0f, fVar);
        this.g = psqVarO;
        psqVarO.N(1);
        psqVarO.O(f3);
        fVar.d(psqVarO);
        psq psqVarO2 = psq.o(this, 1.0f, fVar2);
        this.h = psqVarO2;
        psqVarO2.N(2);
        psqVarO2.O(f3);
        fVar2.d(psqVarO2);
        setFocusableInTouchMode(true);
        androidx.core.view.c.C0(this, 1);
        androidx.core.view.c.r0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (androidx.core.view.c.x(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(L);
            try {
                this.w = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, v5j.f36507b, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(v5j.c)) {
                this.f2267b = typedArrayObtainStyledAttributes2.getDimension(v5j.c, 0.0f);
            } else {
                this.f2267b = getResources().getDimension(kmi.f23985a);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.H = new ArrayList<>();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setStatusBarBackground(int i) {
        this.w = i != 0 ? ni4.e(getContext(), i) : null;
        invalidate();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f2271b;
        public boolean c;
        public int d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2270a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.M);
            this.f2270a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f2270a = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f2270a = 0;
            this.f2270a = layoutParams.f2270a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2270a = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2270a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2272b;
        public int c;
        public int d;
        public int e;
        public int f;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2272b = 0;
            this.f2272b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2272b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f2272b = 0;
        }
    }
}
