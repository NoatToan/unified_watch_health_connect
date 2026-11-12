package defpackage;

import android.R;
import android.content.Context;
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
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import miuix.animation.ViewHoverListener;
import miuix.animation.utils.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public class che extends PopupWindow {
    public WeakReference<View> A;
    public boolean B;
    public DataSetObserver C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5335b;
    public boolean c;
    public boolean d;
    public final Rect e;
    public WeakReference<View> f;
    public Context g;
    public FrameLayout h;
    public View i;
    public ListView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ListAdapter f5336k;
    public AdapterView.OnItemClickListener l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5337r;
    public Rect s;
    public int t;
    public g u;
    public int v;
    public int w;
    public PopupWindow.OnDismissListener x;
    public boolean y;
    public int z;

    public class a extends DataSetObserver {
        public a() {
        }

        public final /* synthetic */ void b(View view) {
            FrameLayout frameLayout = che.this.h;
            if (frameLayout == null || !frameLayout.isAttachedToWindow()) {
                return;
            }
            che.this.Q(view);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            final View viewY;
            che.this.u.c = false;
            if (!che.this.isShowing() || (viewY = che.this.y()) == null) {
                return;
            }
            viewY.post(new Runnable() { // from class: bhe
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4216a.b(viewY);
                }
            });
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FrameLayout frameLayout = che.this.h;
            if (frameLayout == null || !frameLayout.isAttachedToWindow()) {
                return;
            }
            che.this.Q(che.this.A != null ? (View) che.this.A.get() : null);
        }
    }

    public class c implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5340a = -1;

        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean zC;
            int measuredHeight = che.this.i.getMeasuredHeight();
            int i9 = this.f5340a;
            if (i9 == -1 || i9 != measuredHeight) {
                if (che.this.j.getAdapter() != null) {
                    View viewY = che.this.y();
                    Rect rect = new Rect();
                    if (viewY != null) {
                        dyq.b(che.this.z(viewY), rect);
                    } else {
                        Point point = tc8.i(che.this.g).c;
                        rect.set(0, 0, point.x, point.y);
                    }
                    zC = che.this.C(i4 - i2, rect);
                } else {
                    zC = true;
                }
                che.this.i.setEnabled(zC);
                che.this.j.setVerticalScrollBarEnabled(zC);
                this.f5340a = measuredHeight;
            }
        }
    }

    public class d implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5342a = -1;

        public d() {
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
            int iPointToPosition = che.this.j.pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3 || action == 6) {
                    this.f5342a = -1;
                    che.this.j.postDelayed(new Runnable() { // from class: dhe
                        @Override // java.lang.Runnable
                        public final void run() {
                            che.d.b(view);
                        }
                    }, ViewConfiguration.getPressedStateDuration());
                }
            } else if (iPointToPosition != -1 && (firstVisiblePosition = iPointToPosition - che.this.j.getFirstVisiblePosition()) != (i = this.f5342a)) {
                if (i != -1) {
                    che.this.j.getChildAt(this.f5342a).setPressed(false);
                }
                che.this.j.getChildAt(firstVisiblePosition).setPressed(true);
                this.f5342a = firstVisiblePosition;
            }
            return false;
        }
    }

    public class e extends ViewOutlineProvider {
        public e() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view.getWidth() == 0 || view.getHeight() == 0) {
                return;
            }
            outline.setAlpha(hm1.i(view.getContext(), zhi.P, 0.3f));
            if (view.getBackground() != null) {
                view.getBackground().getOutline(outline);
            }
        }
    }

    public class f extends FrameLayout {
        public f(Context context) {
            super(context);
        }

        @Override // android.view.View
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            che.this.x(configuration);
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5347b;
        public boolean c;

        public g() {
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        public void a(int i) {
            this.f5346a = i;
            this.c = true;
        }

        public String toString() {
            return "ContentSize{ w= " + this.f5346a + " h= " + this.f5347b + " }";
        }
    }

    public che(Context context, View view) {
        super(context);
        this.m = 8388661;
        this.n = -1;
        this.t = 0;
        this.y = true;
        this.z = 0;
        this.B = false;
        this.C = new a();
        this.g = context;
        a aVar = null;
        setBackgroundDrawable(null);
        setHeight(-2);
        this.f = new WeakReference<>(view);
        Resources resources = context.getResources();
        rkr rkrVarI = tc8.i(this.g);
        StringBuilder sb = new StringBuilder();
        sb.append("new windowInfo w ");
        sb.append(rkrVarI.c.x);
        sb.append(" h ");
        sb.append(rkrVarI.c.y);
        this.f5337r = context.getResources().getDimensionPixelSize(dmi.F);
        Rect rect = new Rect();
        this.s = rect;
        int i = this.f5337r;
        rect.set(i, i, i, i);
        if (view != null) {
            Rect rect2 = new Rect();
            dyq.b(view, rect2);
            Point point = rkrVarI.c;
            Rect rect3 = new Rect(0, 0, point.x, point.y);
            Point point2 = rkrVarI.c;
            R(view, rect2, rect3, new Rect(0, 0, point2.x, point2.y));
        }
        int width = view != null ? view.getWidth() : rkrVarI.c.x;
        int height = view != null ? view.getHeight() : rkrVarI.c.y;
        this.o = Math.min(width, resources.getDimensionPixelSize(dmi.l0));
        this.p = Math.min(width, resources.getDimensionPixelSize(dmi.m0));
        this.q = Math.min(height, resources.getDimensionPixelSize(dmi.k0));
        float f2 = this.g.getResources().getDisplayMetrics().density;
        int i2 = (int) (8.0f * f2);
        this.f5334a = i2;
        this.f5335b = i2;
        this.e = new Rect();
        this.u = new g(aVar);
        setFocusable(true);
        setOutsideTouchable(true);
        f fVar = new f(context);
        this.h = fVar;
        fVar.setClipChildren(false);
        this.h.setClipToPadding(false);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: yge
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f40155a.D(view2);
            }
        });
        H(context);
        setAnimationStyle(z2j.d);
        super.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: zge
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f41251a.E();
            }
        });
        this.t = context.getResources().getDimensionPixelSize(dmi.G);
        this.z = this.g.getResources().getColor(rki.e);
        if (zvf.f41714a) {
            this.v = (int) (f2 * 32.0f);
        } else {
            this.v = hm1.g(this.g, zhi.O);
            this.w = context.getResources().getDimensionPixelSize(dmi.j0);
        }
    }

    public static void s(View view) {
        WindowManager.LayoutParams layoutParams;
        if (view == null || (layoutParams = (WindowManager.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.flags |= 2;
        layoutParams.dimAmount = dyq.f(view.getContext()) ? gw6.f19395b : gw6.f19394a;
        ((WindowManager) view.getContext().getSystemService("window")).updateViewLayout(view, layoutParams);
    }

    public Rect A() {
        Rect rect = new Rect();
        zlr.f(zlr.h(this.g), this.g, rect);
        return rect;
    }

    public final Rect B(View view) {
        Rect rect = new Rect();
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        view.getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    public boolean C(int i, Rect rect) {
        int iT = t(rect);
        int i2 = this.u.f5347b;
        return i2 > i || i2 > iT;
    }

    public final /* synthetic */ void D(View view) {
        dismiss();
    }

    public final /* synthetic */ void E() {
        PopupWindow.OnDismissListener onDismissListener = this.x;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final /* synthetic */ void F(AdapterView adapterView, View view, int i, long j) {
        int headerViewsCount = i - this.j.getHeaderViewsCount();
        if (this.l == null || headerViewsCount < 0 || headerViewsCount >= this.f5336k.getCount()) {
            return;
        }
        this.l.onItemClick(adapterView, view, headerViewsCount, j);
    }

    public final void G(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        int measuredHeight = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            measuredHeight += view.getMeasuredHeight();
            if (!this.u.c) {
                int measuredWidth = view.getMeasuredWidth();
                if (measuredWidth >= i) {
                    this.u.a(i);
                } else if (measuredWidth > i3) {
                    i3 = measuredWidth;
                }
            }
        }
        g gVar = this.u;
        if (!gVar.c) {
            gVar.a(i3);
        }
        this.u.f5347b = measuredHeight;
    }

    public void H(Context context) {
        super.setContentView(this.h);
    }

    public boolean I(View view, ViewGroup viewGroup, Rect rect) {
        if (view == null) {
            return false;
        }
        if (P()) {
            setElevation(this.v + this.w);
        }
        if (this.i == null) {
            this.i = LayoutInflater.from(this.g).inflate(awi.D, (ViewGroup) null);
            Drawable drawableH = hm1.h(this.g, zhi.E);
            if (drawableH != null) {
                drawableH.getPadding(this.e);
                this.i.setBackground(drawableH);
            }
            this.i.addOnLayoutChangeListener(new c());
            this.B = false;
        }
        if (this.h.getChildCount() != 1 || this.h.getChildAt(0) != this.i) {
            this.h.removeAllViews();
            this.h.addView(this.i);
            if (this.B) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.i.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -2;
                layoutParams.gravity = 16;
            }
        }
        ListView listView = (ListView) this.i.findViewById(R.id.list);
        this.j = listView;
        if (listView == null) {
            return false;
        }
        listView.setOnTouchListener(new d());
        this.j.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: ahe
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                this.f1024a.F(adapterView, view2, i, j);
            }
        });
        this.j.setAdapter(this.f5336k);
        setWidth(w(rect));
        int iT = t(rect);
        setHeight(iT > 0 ? Math.min(this.u.f5347b, iT) : -2);
        ((InputMethodManager) this.g.getApplicationContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        return true;
    }

    public void J(View view, int i) {
        if (P()) {
            if (zvf.f41714a) {
                float f2 = view.getContext().getResources().getDisplayMetrics().density;
                zvf.b(view, this.z, 0.0f * f2, f2 * 26.0f, this.v);
            } else {
                view.setElevation(i);
                N(view);
            }
        }
    }

    public void K(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.f5336k;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(this.C);
        }
        this.f5336k = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.C);
        }
    }

    public final void L(int i) {
        int i2 = z2j.d;
        if (i == 51) {
            i2 = z2j.h;
        } else if (i == 83) {
            i2 = z2j.g;
        } else if (i == 53) {
            i2 = z2j.j;
        } else if (i == 85) {
            i2 = z2j.i;
        } else if (i == 48) {
            i2 = z2j.f40813k;
        } else if (i == 80) {
            i2 = z2j.e;
        } else if (i == 17) {
            i2 = z2j.f;
        }
        setAnimationStyle(i2);
    }

    public void M(int i) {
        this.u.f5347b = i;
    }

    public void N(View view) {
        int i = Build.VERSION.SDK_INT;
        if (tc8.n(this.g)) {
            view.setOutlineProvider(null);
            return;
        }
        view.setOutlineProvider(new e());
        if (i >= 28) {
            view.setOutlineSpotShadowColor(this.g.getColor(rki.e));
        }
    }

    public void O(View view) {
        this.B = true;
        super.setContentView(view);
    }

    public final boolean P() {
        return this.y && (Build.VERSION.SDK_INT > 29 || !p80.a(this.g));
    }

    public final void Q(View view) {
        if (view == null) {
            return;
        }
        View viewZ = z(view);
        Rect rect = new Rect();
        dyq.b(viewZ, rect);
        R(viewZ, rect, A(), B(view));
        int iT = t(rect);
        int iW = w(rect);
        int i = this.u.f5347b;
        int i2 = (iT <= 0 || i <= iT) ? i : iT;
        Rect rect2 = new Rect();
        dyq.b(view, rect2);
        update(view, n(view.getLayoutDirection(), rect2, rect), r(rect2, rect), iW, i2);
    }

    public final void R(View view, Rect rect, Rect rect2, Rect rect3) {
        int i;
        int i2;
        int i3;
        int i4;
        DisplayCutout displayCutout;
        int i5 = Build.VERSION.SDK_INT;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets != null) {
            if (i5 >= 30) {
                Insets insets = rootWindowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
                this.s.set(insets.left, insets.top, insets.right, insets.bottom);
            } else {
                Rect rect4 = new Rect();
                if (i5 >= 28 && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
                    rect4.set(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                }
                this.s.set(Math.max(rect4.left, rootWindowInsets.getSystemWindowInsetLeft()), Math.max(rect4.top, rootWindowInsets.getSystemWindowInsetTop()), Math.max(rect4.right, rootWindowInsets.getSystemWindowInsetRight()), Math.max(rect4.bottom, rootWindowInsets.getSystemWindowInsetBottom()));
            }
        }
        if (i5 >= 30) {
            i2 = rect3.left - rect2.left;
            i3 = rect2.right - rect3.right;
            i4 = rect3.top - rect2.top;
            i = rect2.bottom - rect3.bottom;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        Rect rect5 = this.s;
        rect5.left = Math.max(this.f5337r, (rect5.left - rect.left) - i2);
        Rect rect6 = this.s;
        rect6.right = Math.max(this.f5337r, (rect6.right - Math.max(0, rect3.width() - rect.right)) - i3);
        Rect rect7 = this.s;
        rect7.top = Math.max(this.f5337r, (rect7.top - rect.top) - i4);
        Rect rect8 = this.s;
        rect8.bottom = Math.max(this.f5337r, (rect8.bottom - Math.max(0, rect3.height() - rect.bottom)) - i);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        nem.d(this.g, this);
    }

    public final int n(int i, Rect rect, Rect rect2) {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.m, i) & 7;
        if (absoluteGravity != 1) {
            return absoluteGravity != 5 ? p(rect, rect2) : q(rect, rect2);
        }
        return o(rect, rect2);
    }

    public final int o(Rect rect, Rect rect2) {
        int i;
        boolean z;
        int iCenterX = rect.centerX();
        int i2 = rect.left;
        int i3 = this.u.f5346a;
        int i4 = i2 + i3;
        int i5 = (i3 / 2) + i2;
        int i6 = rect2.right;
        Rect rect3 = this.s;
        int i7 = rect3.right;
        if (i4 > i6 - i7) {
            i = (i6 - i7) - i4;
            z = true;
        } else {
            i = 0;
            z = false;
        }
        if (z) {
            return i;
        }
        int i8 = iCenterX - i5;
        return i2 + i8 >= rect2.left + rect3.left ? i8 : i;
    }

    public final int p(Rect rect, Rect rect2) {
        boolean z;
        int i;
        int i2 = rect.left;
        boolean z2 = this.c;
        int i3 = (z2 ? this.f5334a : 0) + i2 + this.u.f5346a;
        int i4 = rect2.right;
        Rect rect3 = this.s;
        int i5 = rect3.right;
        if (i3 > i4 - i5) {
            i = (i4 - i5) - i3;
            z = true;
        } else {
            z = false;
            i = 0;
        }
        if (z) {
            return i;
        }
        int i6 = z2 ? this.f5334a : 0;
        int i7 = i2 + i6;
        int i8 = rect2.left;
        int i9 = rect3.left;
        int i10 = i7 < i8 + i9 ? (i8 + i9) - i7 : i6;
        return i10 != 0 ? i10 - this.e.left : i10;
    }

    public final int q(Rect rect, Rect rect2) {
        boolean z;
        int i;
        int i2 = rect.right;
        boolean z2 = this.c;
        int i3 = ((z2 ? this.f5334a : 0) + i2) - this.u.f5346a;
        int i4 = rect2.left;
        Rect rect3 = this.s;
        int i5 = rect3.left;
        if (i3 < i4 + i5) {
            i = (i4 + i5) - i3;
            z = true;
        } else {
            z = false;
            i = 0;
        }
        if (z) {
            return i;
        }
        int i6 = z2 ? this.f5334a : 0;
        int i7 = i2 + i6;
        int i8 = rect2.right;
        int i9 = rect3.right;
        int i10 = i7 > i8 - i9 ? (i8 - i9) - i7 : i6;
        return i10 != 0 ? i10 + this.e.right : i10;
    }

    public final int r(Rect rect, Rect rect2) {
        int i = this.d ? this.f5335b : (-rect.height()) - this.e.top;
        int iT = t(rect2);
        int iMin = iT > 0 ? Math.min(this.u.f5347b, iT) : this.u.f5347b;
        int i2 = rect2.bottom;
        int i3 = this.s.bottom;
        int i4 = (i2 - i3) - rect.bottom;
        int i5 = (rect.top - i3) - rect2.top;
        if (iMin + i > i4) {
            int iHeight = 0;
            if (i4 < i5) {
                iHeight = (this.d ? rect.height() : 0) + iMin;
            } else if (this.d) {
                iHeight = rect.height();
            }
            i -= iHeight;
        }
        int i6 = rect.bottom + i;
        int i7 = rect2.top;
        int i8 = this.s.top;
        if (i6 < i7 + i8) {
            int i9 = (i7 + i8) - i6;
            setHeight(iMin - i9);
            i += i9;
        }
        int i10 = i6 + iMin;
        int i11 = rect2.bottom;
        int i12 = this.s.bottom;
        if (i10 > i11 - i12) {
            setHeight(iMin - (i10 - (i11 - i12)));
        }
        return i;
    }

    @Override // android.widget.PopupWindow
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.x = onDismissListener;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.l = onItemClickListener;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
        this.A = new WeakReference<>(view);
        nem.e(this.g, this);
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View view, int i, int i2, int i3) {
        int i4;
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int width = getWidth() > 0 ? getWidth() : this.u.f5346a;
        int height = getHeight() > 0 ? getHeight() : this.u.f5347b;
        Rect rect2 = new Rect();
        rect2.set(i2, i3, width + i2, height + i3);
        StringBuilder sb = new StringBuilder();
        sb.append("showAtLocation getWidth ");
        sb.append(getWidth());
        sb.append(" getHeight ");
        sb.append(getHeight());
        if (rect2.top > rect.centerY()) {
            i4 = 48;
        } else {
            i4 = rect2.bottom <= rect.centerY() ? 80 : 0;
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
        int i7 = this.n;
        if (i7 != -1) {
            L(i7);
        } else {
            L(i4);
        }
        super.showAtLocation(view, i, i2, i3);
        J(this.i, this.v + this.w);
        this.h.setElevation(0.0f);
        nem.e(this.g, this);
    }

    public int t(Rect rect) {
        int i = this.q;
        int iHeight = rect.height();
        Rect rect2 = this.s;
        return Math.min(i, (iHeight - rect2.top) - rect2.bottom);
    }

    public int u(Rect rect) {
        int i = this.o;
        int iWidth = rect.width();
        Rect rect2 = this.s;
        return Math.min(i, (iWidth - rect2.left) - rect2.right);
    }

    @Override // android.widget.PopupWindow
    public void update(int i, int i2, int i3, int i4, boolean z) {
        KeyEvent.Callback callbackY = y();
        if ((callbackY instanceof ViewHoverListener) && ((ViewHoverListener) callbackY).isHover()) {
            LogUtils.debug("popupWindow update return", callbackY);
        } else {
            LogUtils.debug("popupWindow update execute", callbackY);
            super.update(i, i2, i3, i4, z);
        }
    }

    public int v(Rect rect) {
        int i = this.p;
        int iWidth = rect.width();
        Rect rect2 = this.s;
        return Math.min(i, (iWidth - rect2.left) - rect2.right);
    }

    public int w(Rect rect) {
        if (!this.u.c) {
            G(this.f5336k, null, this.g, u(rect));
        }
        int iMax = Math.max(this.u.f5346a, v(rect));
        Rect rect2 = this.e;
        int i = iMax + rect2.left + rect2.right;
        this.u.a(i);
        return i;
    }

    public final void x(Configuration configuration) {
        this.h.post(new b());
    }

    public final View y() {
        WeakReference<View> weakReference = this.A;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final View z(View view) {
        View view2 = this.f.get();
        return view2 != null ? view2 : view.getRootView();
    }
}
