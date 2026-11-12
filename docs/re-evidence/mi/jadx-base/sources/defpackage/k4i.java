package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import miuix.smooth.SmoothFrameLayout2;
import miuix.springback.view.SpringBackLayout;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class k4i extends PopupWindow {
    public float A;
    public int B;
    public boolean C;
    public boolean D;
    public final DataSetObserver E;
    public boolean F;
    public ViewTreeObserver.OnGlobalLayoutListener G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FrameLayout f23423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f23424b;
    public ListAdapter c;
    public n4i d;
    public hwc e;
    public ListView f;
    public SpringBackLayout g;
    public WeakReference<View> h;
    public WeakReference<View> i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23425k;
    public int l;
    public int m;
    public h n;
    public final Context o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23426r;
    public int s;
    public boolean t;
    public PopupWindow.OnDismissListener u;
    public int v;
    public AdapterView.OnItemClickListener w;
    public boolean x;
    public int y;
    public boolean z;

    public class a extends DataSetObserver {
        public a() {
        }

        public final /* synthetic */ void b(View view) {
            FrameLayout frameLayout = k4i.this.f23423a;
            if (frameLayout == null || !frameLayout.isAttachedToWindow()) {
                return;
            }
            k4i.this.g0(view);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            final View viewF;
            k4i.this.n.c = false;
            if (!k4i.this.isShowing() || (viewF = k4i.this.F()) == null) {
                return;
            }
            viewF.post(new Runnable() { // from class: j4i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22409a.b(viewF);
                }
            });
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            k4i k4iVar = k4i.this;
            k4iVar.h0(k4iVar.d);
            k4i k4iVar2 = k4i.this;
            k4iVar2.g0(k4iVar2.F());
        }
    }

    public class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f23429a;

        public c(View view) {
            this.f23429a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            k4i k4iVar = k4i.this;
            k4iVar.h0(k4iVar.d);
            this.f23429a.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public class d implements View.OnLayoutChangeListener {
        public d() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean zB;
            if (k4i.this.f.getAdapter() != null) {
                k4i k4iVar = k4i.this;
                zB = k4iVar.e.b(i4 - i2, k4iVar.d);
            } else {
                zB = true;
            }
            k4i.this.g.setEnabled(zB);
            k4i.this.f.setVerticalScrollBarEnabled(zB);
        }
    }

    public class e implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23432a = -1;

        public e() {
        }

        public static /* synthetic */ void b(View view) {
            if (view instanceof ViewGroup) {
                try {
                    int childCount = ((ViewGroup) view).getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        ((ViewGroup) view).getChildAt(i).setPressed(false);
                    }
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("list onTouch error ");
                    sb.append(e);
                }
            }
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(final View view, MotionEvent motionEvent) {
            int firstVisiblePosition;
            int i;
            View childAt;
            int iPointToPosition = k4i.this.f.pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3 || action == 6) {
                    this.f23432a = -1;
                    k4i.this.f.postDelayed(new Runnable() { // from class: l4i
                        @Override // java.lang.Runnable
                        public final void run() {
                            k4i.e.b(view);
                        }
                    }, ViewConfiguration.getPressedStateDuration());
                }
            } else if (iPointToPosition != -1 && (firstVisiblePosition = iPointToPosition - k4i.this.f.getFirstVisiblePosition()) != (i = this.f23432a)) {
                if (i != -1 && (childAt = k4i.this.f.getChildAt(this.f23432a)) != null) {
                    childAt.setPressed(false);
                }
                k4i.this.f.getChildAt(firstVisiblePosition).setPressed(true);
                this.f23432a = firstVisiblePosition;
            }
            return false;
        }
    }

    public class f extends ViewOutlineProvider {
        public f() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view.getWidth() == 0 || view.getHeight() == 0) {
                return;
            }
            outline.setAlpha(hm1.i(view.getContext(), cii.f, 0.3f));
            if (view.getBackground() != null) {
                view.getBackground().getOutline(outline);
            }
        }
    }

    public class g extends FrameLayout {
        public g(Context context) {
            super(context);
        }

        @Override // android.view.View
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            if (k4i.this.C) {
                k4i.this.dismiss();
            }
            k4i.this.C(configuration);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            k4i.this.D();
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23437b;
        public boolean c;

        public h() {
        }

        public /* synthetic */ h(a aVar) {
            this();
        }

        public String toString() {
            return "ContentSize{ w= " + this.f23436a + " h= " + this.f23437b + " }";
        }
    }

    public k4i(Context context) {
        this(context, null);
    }

    public static Activity G(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static boolean M(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    public static Rect j0(Context context, View view, int i) {
        DisplayCutout displayCutout;
        Rect rect = new Rect();
        rect.set(i, 0, i, i);
        Rect rect2 = new Rect();
        dyq.b(view, rect2);
        int i2 = Build.VERSION.SDK_INT;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets != null) {
            if (i2 >= 30) {
                Insets insets = rootWindowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
                rect.set(insets.left, insets.top, insets.right, insets.bottom);
            } else {
                Rect rect3 = new Rect();
                if (i2 >= 28 && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
                    rect3.set(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                }
                rect.set(Math.max(rect3.left, rootWindowInsets.getSystemWindowInsetLeft()), Math.max(rect3.top, rootWindowInsets.getSystemWindowInsetTop()), Math.max(rect3.right, rootWindowInsets.getSystemWindowInsetRight()), Math.max(rect3.bottom, rootWindowInsets.getSystemWindowInsetBottom()));
            }
        }
        rkr rkrVarI = tc8.i(context);
        rect.left = Math.max(i, rect.left - rect2.left);
        rect.right = Math.max(i, rect.right - Math.max(0, rkrVarI.c.x - rect2.right));
        rect.top = Math.max(i, rect.top - rect2.top);
        rect.bottom = Math.max(i, rect.bottom - Math.max(0, rkrVarI.c.y - rect2.bottom));
        return rect;
    }

    public int A(Rect rect, Rect rect2) {
        return Math.min(this.f23425k, (rect.width() - rect2.left) - rect2.right);
    }

    public void B() {
        ListAdapter listAdapter = this.c;
        if (listAdapter != null) {
            this.d.n = J(listAdapter, null, this.o);
        } else {
            H(this.d);
        }
        this.e.c(this.d);
    }

    public final void C(Configuration configuration) {
        int i;
        View viewF = F();
        if (isShowing() && this.z && (i = configuration.densityDpi) != this.y) {
            this.y = i;
            f0(null);
            if (M(G(this.o))) {
                E();
                this.f23423a.removeAllViews();
                this.f23424b = null;
                if (R(viewF)) {
                    showAsDropDown(viewF);
                }
            }
        }
        if (viewF != null && !this.F) {
            this.F = true;
            viewF.getViewTreeObserver().addOnGlobalLayoutListener(this.G);
        }
        this.n.c = false;
    }

    public final void D() {
        WeakReference<View> weakReference;
        if (!this.F || (weakReference = this.i) == null) {
            return;
        }
        this.F = false;
        weakReference.get().getViewTreeObserver().removeOnGlobalLayoutListener(this.G);
    }

    public final void E() {
        PopupWindow.OnDismissListener onDismissListener = this.u;
        this.u = null;
        dismiss();
        this.u = onDismissListener;
    }

    public View F() {
        WeakReference<View> weakReference = this.i;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void H(n4i n4iVar) {
        if (this.f23424b != null) {
            n4iVar.o.set(0, 0, 0, 0);
            this.f23424b.measure(0, 0);
            n4iVar.o.set(0, 0, this.f23424b.getMeasuredWidth(), this.f23424b.getMeasuredHeight());
        }
    }

    public View I() {
        WeakReference<View> weakReference = this.h;
        if (weakReference != null && weakReference.get() != null) {
            return this.h.get();
        }
        WeakReference<View> weakReference2 = this.i;
        if (weakReference2 != null) {
            return weakReference2.get().getRootView();
        }
        return null;
    }

    public int[][] J(ListAdapter listAdapter, ViewGroup viewGroup, Context context) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.f27537a, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, count, 2);
        int i = 0;
        View view = null;
        for (int i2 = 0; i2 < count; i2++) {
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i2, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iArr[i2][0] = view.getMeasuredWidth();
            iArr[i2][1] = view.getMeasuredHeight();
        }
        return iArr;
    }

    public ListView K() {
        return this.f;
    }

    public int L() {
        return this.B;
    }

    public final /* synthetic */ void N(View view) {
        dismiss();
    }

    public final /* synthetic */ void O() {
        PopupWindow.OnDismissListener onDismissListener = this.u;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final /* synthetic */ void P(AdapterView adapterView, View view, int i, long j) {
        int headerViewsCount = i - this.f.getHeaderViewsCount();
        if (this.w == null || headerViewsCount < 0 || headerViewsCount >= this.c.getCount()) {
            return;
        }
        this.w.onItemClick(adapterView, view, headerViewsCount, j);
    }

    public void Q() {
        super.setContentView(this.f23423a);
    }

    public boolean R(View view) {
        if (view == null) {
            return false;
        }
        boolean z = !view.getLocalVisibleRect(new Rect());
        if (!this.D && z) {
            return false;
        }
        this.i = new WeakReference<>(view);
        h0(this.d);
        if (c0()) {
            setElevation(this.p + this.q);
        }
        if (this.f23424b == null) {
            this.f23424b = LayoutInflater.from(this.o).inflate(fwi.f18319b, (ViewGroup) null);
            Drawable drawableH = hm1.h(this.o, cii.c);
            if (drawableH != null) {
                this.f23424b.setBackground(drawableH);
            }
            this.g = (SpringBackLayout) this.f23424b.findViewById(cti.d);
            this.f23424b.addOnLayoutChangeListener(new d());
        }
        if (this.f23423a.getChildCount() != 1 || this.f23423a.getChildAt(0) != this.f23424b) {
            this.f23423a.removeAllViews();
            this.f23423a.addView(this.f23424b);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23424b.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            layoutParams.gravity = 16;
        }
        ListView listView = (ListView) this.f23424b.findViewById(R.id.list);
        this.f = listView;
        if (listView != null) {
            listView.setOnTouchListener(new e());
            this.f.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: g4i
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                    this.f18583a.P(adapterView, view2, i, j);
                }
            });
            this.f.setAdapter(this.c);
        }
        B();
        setWidth(this.d.g);
        if (this.x) {
            ((InputMethodManager) this.o.getApplicationContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        return true;
    }

    public void S(View view, int i) {
        if (c0()) {
            if (zvf.f41714a) {
                float f2 = view.getContext().getResources().getDisplayMetrics().density;
                zvf.b(view, this.v, 0.0f * f2, f2 * 26.0f, this.p);
            } else {
                view.setElevation(i);
                a0(view);
            }
        }
    }

    public void T(View view) {
        if (F() != view) {
            D();
        }
        dyq.b(view, this.d.q);
        this.i = new WeakReference<>(view);
    }

    public void U(int i) {
        int i2 = c3j.f4894b;
        if (i == 51) {
            i2 = c3j.f;
        } else if (i == 83) {
            i2 = c3j.e;
        } else if (i == 53) {
            i2 = c3j.h;
        } else if (i == 85) {
            i2 = c3j.g;
        } else if (i == 48) {
            i2 = c3j.i;
        } else if (i == 80) {
            i2 = c3j.c;
        } else if (i == 17) {
            i2 = c3j.d;
        }
        super.setAnimationStyle(i2);
    }

    public void V(boolean z) {
        this.C = z;
    }

    public void W(View view) {
        if (view == null) {
            return;
        }
        this.h = new WeakReference<>(view);
        if (view.isAttachedToWindow()) {
            h0(this.d);
        } else {
            view.addOnAttachStateChangeListener(new c(view));
        }
    }

    public void X(float f2) {
        this.A = f2;
    }

    public void Y(boolean z) {
        this.t = z;
    }

    public void Z(int i) {
        this.l = i;
    }

    public void a0(View view) {
        int i = Build.VERSION.SDK_INT;
        if (tc8.n(this.o)) {
            view.setOutlineProvider(null);
            return;
        }
        view.setOutlineProvider(new f());
        if (i >= 28) {
            view.setOutlineSpotShadowColor(this.o.getColor(vki.f36981a));
        }
    }

    public void b(int i) {
        n4i n4iVar = this.d;
        n4iVar.m = true;
        n4iVar.f27539k = i;
    }

    public void b0(int i) {
        this.B = i;
    }

    public final boolean c0() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.o.getSystemService("accessibility");
        boolean z = accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
        if (this.t) {
            return Build.VERSION.SDK_INT > 29 || z;
        }
        return false;
    }

    public void d0(View view) {
        if (view == null) {
            return;
        }
        if (F() != view) {
            T(view);
        }
        if (R(view)) {
            showAsDropDown(view);
        }
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        D();
        nem.d(this.o, this);
    }

    public int e() {
        return this.d.f27539k;
    }

    public void e0(View view, int i) {
        n(i);
        showAsDropDown(view);
    }

    public int f() {
        return this.d.j;
    }

    public final void f0(View view) {
        if (view == null) {
            view = I();
        }
        Resources resources = this.o.getResources();
        rkr rkrVarI = tc8.i(this.o);
        int width = view != null ? view.getWidth() : rkrVarI.c.x;
        int height = view != null ? view.getHeight() : rkrVarI.c.y;
        this.j = Math.min(width, resources.getDimensionPixelSize(hmi.p));
        this.f23425k = Math.min(width, resources.getDimensionPixelSize(hmi.q));
        this.l = Math.min(height, resources.getDimensionPixelSize(hmi.o));
        this.m = resources.getDimensionPixelSize(hmi.f20242r);
    }

    public void g(int i) {
        n4i n4iVar = this.d;
        n4iVar.l = true;
        n4iVar.j = i;
    }

    public void g0(View view) {
        if (isShowing()) {
            B();
            dyq.b(view, this.d.q);
            int iA = this.e.a(this.d);
            int iD = this.e.d(this.d);
            setWidth(this.d.g);
            setHeight(this.d.h);
            n4i n4iVar = this.d;
            update(iA, iD, n4iVar.g, n4iVar.h);
        }
    }

    public void h0(n4i n4iVar) {
        View viewF = F();
        View viewI = I();
        if (viewF == null || viewI == null) {
            return;
        }
        Rect rectI0 = i0(viewI);
        dyq.b(viewI, n4iVar.p);
        dyq.b(viewF, n4iVar.q);
        Rect rect = n4iVar.p;
        Point pointL = tc8.l(this.o);
        rect.set(Math.max(0, rect.left), Math.max(0, rect.top), Math.min(pointL.x, rect.right), Math.min(pointL.y, rect.bottom));
        int iZ = z(rect, rectI0);
        int iA = A(rect, rectI0);
        int iY = y(rect, rectI0);
        n4iVar.f27540r = rectI0;
        n4iVar.f27537a = iZ;
        n4iVar.f27538b = iA;
        n4iVar.c = iY;
        n4iVar.s = viewI.getLayoutDirection();
    }

    public Rect i0(View view) {
        return j0(this.o, view, this.m);
    }

    public void j(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.c;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(this.E);
        }
        this.c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.E);
        }
    }

    public void m(View view, ViewGroup viewGroup) {
        if (I() != viewGroup) {
            W(viewGroup);
        }
        d0(view);
    }

    public void n(int i) {
        if (i != -1) {
            this.d.i = i;
        }
    }

    @Override // android.widget.PopupWindow
    public void setAnimationStyle(int i) {
        this.s = i;
        super.setAnimationStyle(i);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(View view) {
        if (view instanceof SmoothFrameLayout2) {
            this.f23424b = view;
        } else {
            SmoothFrameLayout2 smoothFrameLayout2 = new SmoothFrameLayout2(this.o);
            smoothFrameLayout2.setCornerRadius(this.o.getResources().getDimensionPixelSize(hmi.j));
            smoothFrameLayout2.addView(view);
            this.f23424b = smoothFrameLayout2;
        }
        this.f23423a.removeAllViews();
        this.f23423a.addView(this.f23424b);
        super.setContentView(this.f23423a);
    }

    @Override // android.widget.PopupWindow
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.u = onDismissListener;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.w = onItemClickListener;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        this.z = true;
        StringBuilder sb = new StringBuilder();
        sb.append("showAsDropDown popupwindowspec:");
        sb.append(this.d);
        n4i n4iVar = this.d;
        Rect rect = n4iVar.q;
        int iA = this.e.a(n4iVar);
        int iD = this.e.d(this.d);
        n4i n4iVar2 = this.d;
        int i = n4iVar2.g;
        int i2 = n4iVar2.h;
        Rect rect2 = new Rect();
        rect2.set(0, 0, i, i2);
        setWidth(i);
        setHeight(i2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("showWithAnchor getWidth ");
        sb2.append(i);
        sb2.append(" getHeight ");
        sb2.append(i2);
        int absoluteGravity = Gravity.getAbsoluteGravity(this.d.i, view.getLayoutDirection()) & 112;
        rect2.offsetTo(iA, iD);
        if (this.s == -1) {
            int i3 = 48;
            if (Math.abs(rect2.centerY() - rect.centerY()) <= 10 ? absoluteGravity == 80 : rect2.centerY() <= rect.centerY()) {
                i3 = 80;
            }
            if (Math.abs(rect2.centerX() - rect.centerX()) > 10) {
                i3 = rect2.centerX() > rect.centerX() ? i3 | 3 : i3 | 5;
            }
            int i4 = this.f23426r;
            if (i4 != -1) {
                U(i4);
            } else {
                U(i3);
            }
        }
        if (!isShowing()) {
            HapticCompat.e(view, alb.A, alb.n);
        }
        super.showAtLocation(I(), 0, iA, iD);
        S(this.f23424b, this.p + this.q);
        this.f23423a.setElevation(0.0f);
        x(this.f23423a.getRootView());
        nem.e(this.o, this);
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View view, int i, int i2, int i3) {
        int i4 = 0;
        this.z = false;
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int width = getWidth() > 0 ? getWidth() : this.n.f23436a;
        int height = getHeight() > 0 ? getHeight() : this.n.f23437b;
        Rect rect2 = new Rect();
        rect2.set(i2, i3, width + i2, height + i3);
        if (this.s == -1) {
            if (rect2.top > rect.centerY()) {
                i4 = 48;
            } else if (rect2.bottom <= rect.centerY()) {
                i4 = 80;
            }
            int i5 = rect2.left;
            int i6 = rect.left;
            if (i5 >= i6 && rect2.right > rect.right) {
                i4 |= 3;
            } else if (rect2.right <= rect.right && i5 < i6) {
                i4 |= 5;
            }
            if (i4 == 0 && rect.contains(rect2)) {
                i4 = 17;
            }
            int i7 = this.f23426r;
            if (i7 != -1) {
                U(i7);
            } else {
                U(i4);
            }
        }
        if (!isShowing()) {
            HapticCompat.e(this.f23423a, alb.A, alb.n);
        }
        super.showAtLocation(view, i, i2, i3);
        S(this.f23424b, this.p + this.q);
        this.f23423a.setElevation(0.0f);
        x(this.f23423a.getRootView());
        nem.e(this.o, this);
    }

    public void x(View view) {
        WindowManager.LayoutParams layoutParams;
        if (view == null || (layoutParams = (WindowManager.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.flags |= this.B;
        float f2 = this.A;
        if (f2 == Float.MAX_VALUE) {
            f2 = dyq.f(view.getContext()) ? gw6.f19395b : gw6.f19394a;
        }
        layoutParams.dimAmount = f2;
        ((WindowManager) view.getContext().getSystemService("window")).updateViewLayout(view, layoutParams);
    }

    public int y(Rect rect, Rect rect2) {
        return Math.min(this.l, (rect.height() - rect2.top) - rect2.bottom);
    }

    public int z(Rect rect, Rect rect2) {
        return Math.min(this.j, (rect.width() - rect2.left) - rect2.right);
    }

    public k4i(Context context, View view) {
        this(context, view, null);
    }

    public k4i(Context context, View view, hwc hwcVar) {
        super(context);
        this.f23426r = -1;
        this.s = -1;
        this.t = true;
        this.v = 0;
        this.x = true;
        this.z = false;
        this.A = Float.MAX_VALUE;
        this.B = 2;
        this.C = false;
        this.D = false;
        this.E = new a();
        this.F = false;
        this.G = new b();
        this.o = context;
        this.y = context.getResources().getConfiguration().densityDpi;
        a aVar = null;
        setBackgroundDrawable(null);
        f0(view);
        this.d = new n4i();
        this.e = hwcVar;
        if (hwcVar == null) {
            this.e = new o4i();
        }
        if (view != null) {
            W(view);
        }
        this.n = new h(aVar);
        setFocusable(true);
        setOutsideTouchable(true);
        g gVar = new g(context);
        this.f23423a = gVar;
        gVar.setClipChildren(false);
        this.f23423a.setClipToPadding(false);
        this.f23423a.setOnClickListener(new View.OnClickListener() { // from class: h4i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f19682a.N(view2);
            }
        });
        Q();
        super.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: i4i
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f20776a.O();
            }
        });
        float f2 = context.getResources().getDisplayMetrics().density;
        this.v = context.getResources().getColor(vki.f36981a);
        if (zvf.f41714a) {
            this.p = (int) (f2 * 32.0f);
        } else {
            this.p = hm1.g(context, cii.e);
            this.q = context.getResources().getDimensionPixelSize(hmi.n);
        }
        this.A = hm1.i(context, cii.d, Float.MAX_VALUE);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        g(i);
        b(i2);
        showAsDropDown(view);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        g(i);
        b(i2);
        n(i3);
        showAsDropDown(view);
    }
}
