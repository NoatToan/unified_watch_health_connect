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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.g1;
import androidx.core.view.m1;
import androidx.core.view.s0;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n23.j;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] E = {R.attr.colorPrimaryDark};
    public static final int[] F = {R.attr.layout_gravity};
    public static final boolean I;
    public final ArrayList<View> A;
    public Rect B;
    public Matrix C;
    public final a D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f6938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f6941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f6942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.customview.widget.c f6943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.customview.widget.c f6944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f6945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f6946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6948k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6951n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6952o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6953p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6954q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e f6955r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f6956t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f6957v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f6958w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f6959x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public WindowInsets f6960y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6961z;

    public class a implements l7.h {
        public a() {
        }

        @Override // l7.h
        public final boolean perform(View view2, l7.h.a aVar) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            if (!DrawerLayout.l(view2) || drawerLayout.h(view2) == 2) {
                return false;
            }
            drawerLayout.c(view2, true);
            return true;
        }
    }

    public class b implements View.OnApplyWindowInsetsListener {
        public b(DrawerLayout drawerLayout) {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
            DrawerLayout drawerLayout = (DrawerLayout) view2;
            boolean z14 = false;
            boolean z15 = windowInsets.getSystemWindowInsetTop() > 0;
            drawerLayout.f6960y = windowInsets;
            drawerLayout.f6961z = z15;
            if (!z15 && drawerLayout.getBackground() == null) {
                z14 = true;
            }
            drawerLayout.setWillNotDraw(z14);
            drawerLayout.requestLayout();
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class c extends androidx.core.view.a {
        public c() {
            new Rect();
        }

        @Override // androidx.core.view.a
        public final boolean dispatchPopulateAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view2, accessibilityEvent);
            }
            accessibilityEvent.getText();
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewF = drawerLayout.f();
            if (viewF == null) {
                return true;
            }
            int i14 = drawerLayout.i(viewF);
            drawerLayout.getClass();
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            Gravity.getAbsoluteGravity(i14, drawerLayout.getLayoutDirection());
            return true;
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view2, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
            int[] iArr = DrawerLayout.E;
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.n("androidx.drawerlayout.widget.DrawerLayout");
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f110563a;
            accessibilityNodeInfo.setFocusable(false);
            accessibilityNodeInfo.setFocused(false);
            fVar.k(l7.f.a.f110566e);
            fVar.k(l7.f.a.f110567f);
        }

        @Override // androidx.core.view.a
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view2, AccessibilityEvent accessibilityEvent) {
            int[] iArr = DrawerLayout.E;
            return super.onRequestSendAccessibilityEvent(viewGroup, view2, accessibilityEvent);
        }
    }

    public static final class d extends androidx.core.view.a {
        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            int[] iArr = DrawerLayout.E;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            if (view2.getImportantForAccessibility() == 4 || view2.getImportantForAccessibility() == 2) {
                fVar.f110564b = -1;
                fVar.f110563a.setParent(null);
            }
        }
    }

    public interface e {
        void onDrawerClosed(View view2);

        void onDrawerOpened(View view2);

        void onDrawerSlide(View view2, float f14);

        void onDrawerStateChanged(int i14);
    }

    public static abstract class h implements e {
        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void onDrawerClosed(View view2) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void onDrawerOpened(View view2) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void onDrawerSlide(View view2, float f14) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void onDrawerStateChanged(int i14) {
        }
    }

    public class i extends androidx.customview.widget.c.AbstractC0092c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.customview.widget.c f6974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f6975c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                View viewE;
                int width;
                i iVar = i.this;
                DrawerLayout drawerLayout = DrawerLayout.this;
                int i14 = iVar.f6974b.f6644o;
                int i15 = iVar.f6973a;
                boolean z14 = i15 == 3;
                if (z14) {
                    viewE = drawerLayout.e(3);
                    width = (viewE != null ? -viewE.getWidth() : 0) + i14;
                } else {
                    viewE = drawerLayout.e(5);
                    width = drawerLayout.getWidth() - i14;
                }
                if (viewE != null) {
                    if (((!z14 || viewE.getLeft() >= width) && (z14 || viewE.getLeft() <= width)) || drawerLayout.h(viewE) != 0) {
                        return;
                    }
                    f fVar = (f) viewE.getLayoutParams();
                    iVar.f6974b.u(viewE, width, viewE.getTop());
                    fVar.f6966c = true;
                    drawerLayout.invalidate();
                    DrawerLayout drawerLayout2 = DrawerLayout.this;
                    View viewE2 = drawerLayout2.e(i15 == 3 ? 5 : 3);
                    if (viewE2 != null) {
                        drawerLayout2.c(viewE2, true);
                    }
                    if (drawerLayout.f6954q) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i16 = 0; i16 < childCount; i16++) {
                        drawerLayout.getChildAt(i16).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    drawerLayout.f6954q = true;
                }
            }
        }

        public i(int i14) {
            this.f6973a = i14;
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final int clampViewPositionHorizontal(View view2, int i14, int i15) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.a(3, view2)) {
                return Math.max(-view2.getWidth(), Math.min(i14, 0));
            }
            int width = drawerLayout.getWidth();
            return Math.max(width - view2.getWidth(), Math.min(i14, width));
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final int clampViewPositionVertical(View view2, int i14, int i15) {
            return view2.getTop();
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final int getViewHorizontalDragRange(View view2) {
            DrawerLayout.this.getClass();
            if (DrawerLayout.m(view2)) {
                return view2.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final void onEdgeDragStarted(int i14, int i15) {
            int i16 = i14 & 1;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewE = i16 == 1 ? drawerLayout.e(3) : drawerLayout.e(5);
            if (viewE == null || drawerLayout.h(viewE) != 0) {
                return;
            }
            this.f6974b.c(i15, viewE);
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final boolean onEdgeLock(int i14) {
            return false;
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final void onEdgeTouched(int i14, int i15) {
            DrawerLayout.this.postDelayed(this.f6975c, 160L);
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final void onViewCaptured(View view2, int i14) {
            ((f) view2.getLayoutParams()).f6966c = false;
            int i15 = this.f6973a == 3 ? 5 : 3;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewE = drawerLayout.e(i15);
            if (viewE != null) {
                drawerLayout.c(viewE, true);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final void onViewDragStateChanged(int i14) {
            DrawerLayout.this.u(i14, this.f6974b.f6649t);
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final void onViewPositionChanged(View view2, int i14, int i15, int i16, int i17) {
            int width = view2.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            float width2 = (drawerLayout.a(3, view2) ? i14 + width : drawerLayout.getWidth() - i14) / width;
            drawerLayout.r(width2, view2);
            view2.setVisibility(width2 == 0.0f ? 4 : 0);
            drawerLayout.invalidate();
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final void onViewReleased(View view2, float f14, float f15) {
            int i14;
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            float f16 = ((f) view2.getLayoutParams()).f6965b;
            int width = view2.getWidth();
            if (drawerLayout.a(3, view2)) {
                i14 = (f14 > 0.0f || (f14 == 0.0f && f16 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = drawerLayout.getWidth();
                if (f14 < 0.0f || (f14 == 0.0f && f16 > 0.5f)) {
                    width2 -= width;
                }
                i14 = width2;
            }
            this.f6974b.s(i14, view2.getTop());
            drawerLayout.invalidate();
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final boolean tryCaptureView(View view2, int i14) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            return DrawerLayout.m(view2) && drawerLayout.a(this.f6973a, view2) && drawerLayout.h(view2) == 0;
        }
    }

    static {
        I = Build.VERSION.SDK_INT >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        new d();
        this.f6940c = -1728053248;
        this.f6942e = new Paint();
        this.f6949l = true;
        this.f6950m = 3;
        this.f6951n = 3;
        this.f6952o = 3;
        this.f6953p = 3;
        this.D = new a();
        setDescendantFocusability(GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
        float f14 = getResources().getDisplayMetrics().density;
        this.f6939b = (int) ((64.0f * f14) + 0.5f);
        float f15 = f14 * 400.0f;
        i iVar = new i(3);
        this.f6945h = iVar;
        i iVar2 = new i(5);
        this.f6946i = iVar2;
        androidx.customview.widget.c cVarI = androidx.customview.widget.c.i(this, 1.0f, iVar);
        this.f6943f = cVarI;
        cVarI.f6646q = 1;
        cVarI.f6643n = f15;
        iVar.f6974b = cVarI;
        androidx.customview.widget.c cVarI2 = androidx.customview.widget.c.i(this, 1.0f, iVar2);
        this.f6944g = cVarI2;
        cVarI2.f6646q = 2;
        cVarI2.f6643n = f15;
        iVar2.f6974b = cVarI2;
        setFocusableInTouchMode(true);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        setImportantForAccessibility(1);
        s0.r(this, new c());
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new b(this));
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(E);
            try {
                this.f6959x = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes.recycle();
                throw th3;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, z7.a.f202771a, i14, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f6938a = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f6938a = getResources().getDimension(com.garmin.android.apps.connectmobile.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.A = new ArrayList<>();
        } catch (Throwable th4) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th4;
        }
    }

    public static String j(int i14) {
        if ((i14 & 3) == 3) {
            return "LEFT";
        }
        return (i14 & 5) == 5 ? "RIGHT" : Integer.toHexString(i14);
    }

    public static boolean k(View view2) {
        return ((f) view2.getLayoutParams()).f6964a == 0;
    }

    public static boolean l(View view2) {
        if (m(view2)) {
            return (((f) view2.getLayoutParams()).f6967d & 1) == 1;
        }
        org.apache.commons.lang3.e.l("View ", view2, " is not a drawer");
        return false;
    }

    public static boolean m(View view2) {
        int i14 = ((f) view2.getLayoutParams()).f6964a;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, view2.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public static boolean n(View view2) {
        if (m(view2)) {
            return ((f) view2.getLayoutParams()).f6965b > 0.0f;
        }
        org.apache.commons.lang3.e.l("View ", view2, " is not a drawer");
        return false;
    }

    public final boolean a(int i14, View view2) {
        return (i(view2) & i14) == i14;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i14, int i15) {
        ArrayList<View> arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        boolean z14 = false;
        while (true) {
            arrayList2 = this.A;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (!m(childAt)) {
                arrayList2.add(childAt);
            } else if (l(childAt)) {
                childAt.addFocusables(arrayList, i14, i15);
                z14 = true;
            }
            i16++;
        }
        if (!z14) {
            int size = arrayList2.size();
            for (int i17 = 0; i17 < size; i17++) {
                View view2 = arrayList2.get(i17);
                if (view2.getVisibility() == 0) {
                    view2.addFocusables(arrayList, i14, i15);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view2, int i14, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view2, i14, layoutParams);
        int childCount = getChildCount();
        int i15 = 0;
        while (true) {
            if (i15 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i15);
            if ((((f) childAt.getLayoutParams()).f6967d & 1) == 1) {
                break;
            } else {
                i15++;
            }
        }
        if (childAt != null || m(view2)) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            view2.setImportantForAccessibility(4);
        } else {
            WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
            view2.setImportantForAccessibility(1);
        }
    }

    public final void b(int i14) {
        View viewE = e(i14);
        if (viewE != null) {
            c(viewE, true);
        } else {
            j.A(j(i14), "No drawer view found with gravity ");
        }
    }

    public final void c(View view2, boolean z14) {
        if (!m(view2)) {
            org.apache.commons.lang3.e.l("View ", view2, " is not a sliding drawer");
            return;
        }
        f fVar = (f) view2.getLayoutParams();
        if (this.f6949l) {
            fVar.f6965b = 0.0f;
            fVar.f6967d = 0;
        } else if (z14) {
            fVar.f6967d |= 4;
            if (a(3, view2)) {
                this.f6943f.u(view2, -view2.getWidth(), view2.getTop());
            } else {
                this.f6944g.u(view2, getWidth(), view2.getTop());
            }
        } else {
            float f14 = ((f) view2.getLayoutParams()).f6965b;
            float width = view2.getWidth();
            int i14 = ((int) (width * 0.0f)) - ((int) (f14 * width));
            if (!a(3, view2)) {
                i14 = -i14;
            }
            view2.offsetLeftAndRight(i14);
            r(0.0f, view2);
            u(0, view2);
            view2.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i14 = 0; i14 < childCount; i14++) {
            fMax = Math.max(fMax, ((f) getChildAt(i14).getLayoutParams()).f6965b);
        }
        this.f6941d = fMax;
        boolean zH = this.f6943f.h();
        boolean zH2 = this.f6944g.h();
        if (zH || zH2) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            postInvalidateOnAnimation();
        }
    }

    public final void d(boolean z14) {
        int childCount = getChildCount();
        boolean zU = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            f fVar = (f) childAt.getLayoutParams();
            if (m(childAt) && (!z14 || fVar.f6966c)) {
                zU |= a(3, childAt) ? this.f6943f.u(childAt, -childAt.getWidth(), childAt.getTop()) : this.f6944g.u(childAt, getWidth(), childAt.getTop());
                fVar.f6966c = false;
            }
        }
        i iVar = this.f6945h;
        DrawerLayout.this.removeCallbacks(iVar.f6975c);
        i iVar2 = this.f6946i;
        DrawerLayout.this.removeCallbacks(iVar2.f6975c);
        if (zU) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f6941d <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x14 = motionEvent.getX();
        float y14 = motionEvent.getY();
        for (int i14 = childCount - 1; i14 >= 0; i14--) {
            View childAt = getChildAt(i14);
            if (this.B == null) {
                this.B = new Rect();
            }
            childAt.getHitRect(this.B);
            if (this.B.contains((int) x14, (int) y14) && !k(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.C == null) {
                            this.C = new Matrix();
                        }
                        matrix.invert(this.C);
                        motionEventObtain.transform(this.C);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view2, long j8) {
        Drawable background;
        int height = getHeight();
        boolean zK = k(view2);
        int width = getWidth();
        int iSave = canvas.save();
        int i14 = 0;
        if (zK) {
            int childCount = getChildCount();
            int i15 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                if (childAt != view2 && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m(childAt) && childAt.getHeight() >= height) {
                    if (a(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i15) {
                            i15 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i15, 0, width, getHeight());
            i14 = i15;
        }
        boolean zDrawChild = super.drawChild(canvas, view2, j8);
        canvas.restoreToCount(iSave);
        float f14 = this.f6941d;
        if (f14 > 0.0f && zK) {
            int i17 = this.f6940c;
            int i18 = (((int) ((((-16777216) & i17) >>> 24) * f14)) << 24) | (i17 & FlexItem.MAX_SIZE);
            Paint paint = this.f6942e;
            paint.setColor(i18);
            canvas.drawRect(i14, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final View e(int i14) {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if ((i(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (m(childAt) && n(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public final int g(int i14) {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        int layoutDirection = getLayoutDirection();
        if (i14 == 3) {
            int i15 = this.f6950m;
            if (i15 != 3) {
                return i15;
            }
            int i16 = layoutDirection == 0 ? this.f6952o : this.f6953p;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        }
        if (i14 == 5) {
            int i17 = this.f6951n;
            if (i17 != 3) {
                return i17;
            }
            int i18 = layoutDirection == 0 ? this.f6953p : this.f6952o;
            if (i18 != 3) {
                return i18;
            }
            return 0;
        }
        if (i14 == 8388611) {
            int i19 = this.f6952o;
            if (i19 != 3) {
                return i19;
            }
            int i24 = layoutDirection == 0 ? this.f6950m : this.f6951n;
            if (i24 != 3) {
                return i24;
            }
            return 0;
        }
        if (i14 != 8388613) {
            return 0;
        }
        int i25 = this.f6953p;
        if (i25 != 3) {
            return i25;
        }
        int i26 = layoutDirection == 0 ? this.f6951n : this.f6950m;
        if (i26 != 3) {
            return i26;
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public float getDrawerElevation() {
        return this.f6938a;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f6959x;
    }

    public final int h(View view2) {
        if (m(view2)) {
            return g(((f) view2.getLayoutParams()).f6964a);
        }
        org.apache.commons.lang3.e.l("View ", view2, " is not a drawer");
        return 0;
    }

    public final int i(View view2) {
        int i14 = ((f) view2.getLayoutParams()).f6964a;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        return Gravity.getAbsoluteGravity(i14, getLayoutDirection());
    }

    public final void o(int i14) {
        View viewE = e(i14);
        if (viewE != null) {
            p(viewE);
        } else {
            j.A(j(i14), "No drawer view found with gravity ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6949l = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6949l = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f6961z || this.f6959x == null) {
            return;
        }
        WindowInsets windowInsets = this.f6960y;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f6959x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f6959x.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z14;
        View viewK;
        int actionMasked = motionEvent.getActionMasked();
        androidx.customview.widget.c cVar = this.f6943f;
        boolean zT = cVar.t(motionEvent) | this.f6944g.t(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                d(true);
                this.f6954q = false;
            } else if (actionMasked == 2) {
                int length = cVar.f6633d.length;
                for (int i14 = 0; i14 < length; i14++) {
                    if ((cVar.f6640k & (1 << i14)) != 0) {
                        float f14 = cVar.f6635f[i14] - cVar.f6633d[i14];
                        float f15 = cVar.f6636g[i14] - cVar.f6634e[i14];
                        float f16 = (f15 * f15) + (f14 * f14);
                        int i15 = cVar.f6631b;
                        if (f16 > i15 * i15) {
                            i iVar = this.f6945h;
                            DrawerLayout.this.removeCallbacks(iVar.f6975c);
                            i iVar2 = this.f6946i;
                            DrawerLayout.this.removeCallbacks(iVar2.f6975c);
                            break;
                        }
                    }
                }
            } else if (actionMasked == 3) {
                d(true);
                this.f6954q = false;
            }
            z14 = false;
        } else {
            float x14 = motionEvent.getX();
            float y14 = motionEvent.getY();
            this.f6957v = x14;
            this.f6958w = y14;
            z14 = this.f6941d > 0.0f && (viewK = cVar.k((int) x14, (int) y14)) != null && k(viewK);
            this.f6954q = false;
        }
        if (!zT && !z14) {
            int childCount = getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                if (!((f) getChildAt(i16).getLayoutParams()).f6966c) {
                }
            }
            if (!this.f6954q) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i14, KeyEvent keyEvent) {
        if (i14 != 4 || f() == null) {
            return super.onKeyDown(i14, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i14, KeyEvent keyEvent) {
        if (i14 != 4) {
            return super.onKeyUp(i14, keyEvent);
        }
        View viewF = f();
        if (viewF != null && h(viewF) == 0) {
            d(false);
        }
        return viewF != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        WindowInsets rootWindowInsets;
        float f14;
        int i18;
        boolean z15 = true;
        this.f6948k = true;
        int i19 = i16 - i14;
        int childCount = getChildCount();
        int i24 = 0;
        while (i24 < childCount) {
            View childAt = getChildAt(i24);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (k(childAt)) {
                    int i25 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i25, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i25, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(3, childAt)) {
                        float f15 = measuredWidth;
                        i18 = (-measuredWidth) + ((int) (fVar.f6965b * f15));
                        f14 = (measuredWidth + i18) / f15;
                    } else {
                        float f16 = measuredWidth;
                        int i26 = i19 - ((int) (fVar.f6965b * f16));
                        f14 = (i19 - i26) / f16;
                        i18 = i26;
                    }
                    boolean z16 = f14 != fVar.f6965b ? z15 : false;
                    int i27 = fVar.f6964a & 112;
                    if (i27 == 16) {
                        int i28 = i17 - i15;
                        int i29 = (i28 - measuredHeight) / 2;
                        int i30 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i29 < i30) {
                            i29 = i30;
                        } else {
                            int i34 = i29 + measuredHeight;
                            int i35 = i28 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i34 > i35) {
                                i29 = i35 - measuredHeight;
                            }
                        }
                        childAt.layout(i18, i29, measuredWidth + i18, measuredHeight + i29);
                    } else if (i27 != 80) {
                        int i36 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        childAt.layout(i18, i36, measuredWidth + i18, measuredHeight + i36);
                    } else {
                        int i37 = i17 - i15;
                        childAt.layout(i18, (i37 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i18, i37 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    }
                    if (z16) {
                        r(f14, childAt);
                    }
                    int i38 = fVar.f6965b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i38) {
                        childAt.setVisibility(i38);
                    }
                }
            }
            i24++;
            z15 = true;
        }
        if (I && (rootWindowInsets = getRootWindowInsets()) != null) {
            c7.e eVarM = m1.g(null, rootWindowInsets).f6508a.m();
            androidx.customview.widget.c cVar = this.f6943f;
            cVar.f6644o = Math.max(cVar.f6645p, eVarM.f25190a);
            androidx.customview.widget.c cVar2 = this.f6944g;
            cVar2.f6644o = Math.max(cVar2.f6645p, eVarM.f25192c);
        }
        this.f6948k = false;
        this.f6949l = false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public final void onMeasure(int i14, int i15) {
        boolean z14;
        int mode = View.MeasureSpec.getMode(i14);
        int mode2 = View.MeasureSpec.getMode(i15);
        int size = View.MeasureSpec.getSize(i14);
        int size2 = View.MeasureSpec.getSize(i15);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                vb.h.s("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
                return;
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f6960y != null) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            if (getFitsSystemWindows()) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z15 = false;
        boolean z16 = false;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z14) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar.f6964a, layoutDirection);
                    boolean fitsSystemWindows = childAt.getFitsSystemWindows();
                    WindowInsets windowInsetsReplaceSystemWindowInsets = this.f6960y;
                    if (fitsSystemWindows) {
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (k(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else {
                    if (!m(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i16 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    float elevation = childAt.getElevation();
                    float f14 = this.f6938a;
                    if (elevation != f14) {
                        childAt.setElevation(f14);
                    }
                    int i17 = i(childAt) & 7;
                    boolean z17 = i17 == 3;
                    if ((z17 && z15) || (!z17 && z16)) {
                        wr.g.x("Child drawer has absolute gravity ", j(i17), " but this DrawerLayout already has a drawer view along that edge");
                        return;
                    }
                    if (z17) {
                        z15 = true;
                    } else {
                        z16 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i14, this.f6939b + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i15, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewE;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        int i14 = gVar.f6968a;
        if (i14 != 0 && (viewE = e(i14)) != null) {
            p(viewE);
        }
        int i15 = gVar.f6969b;
        if (i15 != 3) {
            q(i15, 3);
        }
        int i16 = gVar.f6970c;
        if (i16 != 3) {
            q(i16, 5);
        }
        int i17 = gVar.f6971d;
        if (i17 != 3) {
            q(i17, 8388611);
        }
        int i18 = gVar.f6972e;
        if (i18 != 3) {
            q(i18, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i14) {
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            f fVar = (f) getChildAt(i14).getLayoutParams();
            int i15 = fVar.f6967d;
            boolean z14 = i15 == 1;
            boolean z15 = i15 == 2;
            if (z14 || z15) {
                gVar.f6968a = fVar.f6964a;
                break;
            }
        }
        gVar.f6969b = this.f6950m;
        gVar.f6970c = this.f6951n;
        gVar.f6971d = this.f6952o;
        gVar.f6972e = this.f6953p;
        return gVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z14;
        View childAt;
        androidx.customview.widget.c cVar = this.f6943f;
        cVar.m(motionEvent);
        this.f6944g.m(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x14 = motionEvent.getX();
            float y14 = motionEvent.getY();
            this.f6957v = x14;
            this.f6958w = y14;
            this.f6954q = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            d(true);
            this.f6954q = false;
            return true;
        }
        float x15 = motionEvent.getX();
        float y15 = motionEvent.getY();
        View viewK = cVar.k((int) x15, (int) y15);
        if (viewK != null && k(viewK)) {
            float f14 = x15 - this.f6957v;
            float f15 = y15 - this.f6958w;
            int i14 = cVar.f6631b;
            if ((f15 * f15) + (f14 * f14) < i14 * i14) {
                int childCount = getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = getChildAt(i15);
                    if ((((f) childAt.getLayoutParams()).f6967d & 1) == 1) {
                        break;
                    }
                    i15++;
                }
                z14 = childAt == null || h(childAt) == 2;
            }
        }
        d(z14);
        return true;
    }

    public final void p(View view2) {
        if (!m(view2)) {
            org.apache.commons.lang3.e.l("View ", view2, " is not a sliding drawer");
            return;
        }
        f fVar = (f) view2.getLayoutParams();
        if (this.f6949l) {
            fVar.f6965b = 1.0f;
            fVar.f6967d = 1;
            t(view2, true);
            s(view2);
        } else {
            fVar.f6967d |= 2;
            if (a(3, view2)) {
                this.f6943f.u(view2, 0, view2.getTop());
            } else {
                this.f6944g.u(view2, getWidth() - view2.getWidth(), view2.getTop());
            }
        }
        invalidate();
    }

    public final void q(int i14, int i15) {
        View viewE;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i15, getLayoutDirection());
        if (i15 == 3) {
            this.f6950m = i14;
        } else if (i15 == 5) {
            this.f6951n = i14;
        } else if (i15 == 8388611) {
            this.f6952o = i14;
        } else if (i15 == 8388613) {
            this.f6953p = i14;
        }
        if (i14 != 0) {
            (absoluteGravity == 3 ? this.f6943f : this.f6944g).b();
        }
        if (i14 != 1) {
            if (i14 == 2 && (viewE = e(absoluteGravity)) != null) {
                p(viewE);
                return;
            }
            return;
        }
        View viewE2 = e(absoluteGravity);
        if (viewE2 != null) {
            c(viewE2, true);
        }
    }

    public final void r(float f14, View view2) {
        f fVar = (f) view2.getLayoutParams();
        if (f14 == fVar.f6965b) {
            return;
        }
        fVar.f6965b = f14;
        ArrayList arrayList = this.f6956t;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((e) this.f6956t.get(size)).onDrawerSlide(view2, f14);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z14) {
        super.requestDisallowInterceptTouchEvent(z14);
        if (z14) {
            d(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f6948k) {
            return;
        }
        super.requestLayout();
    }

    public final void s(View view2) {
        l7.f.a aVar = l7.f.a.f110575n;
        s0.n(aVar.a(), view2);
        if (!l(view2) || h(view2) == 2) {
            return;
        }
        s0.p(view2, aVar, null, this.D);
    }

    public void setDrawerElevation(float f14) {
        this.f6938a = f14;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (m(childAt)) {
                float f15 = this.f6938a;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                childAt.setElevation(f15);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        ArrayList arrayList;
        e eVar2 = this.f6955r;
        if (eVar2 != null && (arrayList = this.f6956t) != null) {
            arrayList.remove(eVar2);
        }
        if (eVar != null) {
            if (this.f6956t == null) {
                this.f6956t = new ArrayList();
            }
            this.f6956t.add(eVar);
        }
        this.f6955r = eVar;
    }

    public void setDrawerLockMode(int i14) {
        q(i14, 3);
        q(i14, 5);
    }

    public void setScrimColor(int i14) {
        this.f6940c = i14;
        invalidate();
    }

    public void setStatusBarBackground(int i14) {
        this.f6959x = i14 != 0 ? a7.b.getDrawable(getContext(), i14) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i14) {
        this.f6959x = new ColorDrawable(i14);
        invalidate();
    }

    public final void t(View view2, boolean z14) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if ((z14 || m(childAt)) && !(z14 && childAt == view2)) {
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public final void u(int i14, View view2) {
        int i15;
        View rootView;
        int i16 = this.f6943f.f6630a;
        int i17 = this.f6944g.f6630a;
        if (i16 == 1 || i17 == 1) {
            i15 = 1;
        } else {
            i15 = 2;
            if (i16 != 2 && i17 != 2) {
                i15 = 0;
            }
        }
        if (view2 != null && i14 == 0) {
            float f14 = ((f) view2.getLayoutParams()).f6965b;
            if (f14 == 0.0f) {
                f fVar = (f) view2.getLayoutParams();
                if ((fVar.f6967d & 1) == 1) {
                    fVar.f6967d = 0;
                    ArrayList arrayList = this.f6956t;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((e) this.f6956t.get(size)).onDrawerClosed(view2);
                        }
                    }
                    t(view2, false);
                    s(view2);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f14 == 1.0f) {
                f fVar2 = (f) view2.getLayoutParams();
                if ((fVar2.f6967d & 1) == 0) {
                    fVar2.f6967d = 1;
                    ArrayList arrayList2 = this.f6956t;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((e) this.f6956t.get(size2)).onDrawerOpened(view2);
                        }
                    }
                    t(view2, true);
                    s(view2);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i15 != this.f6947j) {
            this.f6947j = i15;
            ArrayList arrayList3 = this.f6956t;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((e) this.f6956t.get(size3)).onDrawerStateChanged(i15);
                }
            }
        }
    }

    public static class g extends s7.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6972e;

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6968a = 0;
            this.f6968a = parcel.readInt();
            this.f6969b = parcel.readInt();
            this.f6970c = parcel.readInt();
            this.f6971d = parcel.readInt();
            this.f6972e = parcel.readInt();
        }

        @Override // s7.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeInt(this.f6968a);
            parcel.writeInt(this.f6969b);
            parcel.writeInt(this.f6970c);
            parcel.writeInt(this.f6971d);
            parcel.writeInt(this.f6972e);
        }

        public class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i14) {
                return new g[i14];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }
        }

        public g(Parcelable parcelable) {
            super(parcelable);
            this.f6968a = 0;
        }
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f6959x = drawable;
        invalidate();
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f6965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f6966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6967d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6964a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.F);
            this.f6964a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public f(int i14, int i15) {
            super(i14, i15);
            this.f6964a = 0;
        }

        public f(int i14, int i15, int i16) {
            this(i14, i15);
            this.f6964a = i16;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f6964a = 0;
            this.f6964a = fVar.f6964a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6964a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6964a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.garmin.android.apps.connectmobile.R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }
}
