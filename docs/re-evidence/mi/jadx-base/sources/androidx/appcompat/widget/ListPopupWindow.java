package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.b67;
import defpackage.hbm;
import defpackage.m4i;
import defpackage.qii;
import defpackage.z5j;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements hbm {
    public static Method G;
    public static Method H;
    public Runnable A;
    public final Handler B;
    public final Rect C;
    public Rect D;
    public boolean E;
    public PopupWindow F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f1618b;
    public b67 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1619k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public View p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DataSetObserver f1620r;
    public View s;
    public Drawable t;
    public AdapterView.OnItemClickListener u;
    public AdapterView.OnItemSelectedListener v;
    public final i w;
    public final h x;
    public final g y;
    public final e z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewQ = ListPopupWindow.this.q();
            if (viewQ == null || viewQ.getWindowToken() == null) {
                return;
            }
            ListPopupWindow.this.a();
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            b67 b67Var;
            if (i == -1 || (b67Var = ListPopupWindow.this.c) == null) {
                return;
            }
            b67Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @RequiresApi(24)
    public static class c {
        public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    @RequiresApi(29)
    public static class d {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.o();
        }
    }

    public class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.isShowing()) {
                ListPopupWindow.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    public class g implements AbsListView.OnScrollListener {
        public g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || ListPopupWindow.this.x() || ListPopupWindow.this.F.getContentView() == null) {
                return;
            }
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            listPopupWindow.B.removeCallbacks(listPopupWindow.w);
            ListPopupWindow.this.w.run();
        }
    }

    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.F) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.F.getWidth() && y >= 0 && y < ListPopupWindow.this.F.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.B.postDelayed(listPopupWindow.w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
            listPopupWindow2.B.removeCallbacks(listPopupWindow2.w);
            return false;
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b67 b67Var = ListPopupWindow.this.c;
            if (b67Var == null || !androidx.core.view.c.T(b67Var) || ListPopupWindow.this.c.getCount() <= ListPopupWindow.this.c.getChildCount()) {
                return;
            }
            int childCount = ListPopupWindow.this.c.getChildCount();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (childCount <= listPopupWindow.o) {
                listPopupWindow.F.setInputMethodMode(2);
                ListPopupWindow.this.a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, qii.H);
    }

    public void A(View view) {
        this.s = view;
    }

    public void B(int i2) {
        this.F.setAnimationStyle(i2);
    }

    public void C(int i2) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            L(i2);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.e = rect.left + rect.right + i2;
    }

    public void D(int i2) {
        this.l = i2;
    }

    public void E(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void F(int i2) {
        this.F.setInputMethodMode(i2);
    }

    public void G(boolean z) {
        this.E = z;
        this.F.setFocusable(z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void H(boolean z) {
        this.f1619k = true;
        this.j = z;
    }

    public final void I(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.F, z);
            return;
        }
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    public void J(int i2) {
        this.q = i2;
    }

    public void K(int i2) {
        b67 b67Var = this.c;
        if (!isShowing() || b67Var == null) {
            return;
        }
        b67Var.setListSelectionHidden(false);
        b67Var.setSelection(i2);
        if (b67Var.getChoiceMode() != 0) {
            b67Var.setItemChecked(i2, true);
        }
    }

    public void L(int i2) {
        this.e = i2;
    }

    @Override // defpackage.hbm
    public void a() {
        int iN = n();
        boolean zX = x();
        m4i.b(this.F, this.h);
        if (this.F.isShowing()) {
            if (androidx.core.view.c.T(q())) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = q().getWidth();
                }
                int i2 = this.d;
                if (i2 == -1) {
                    if (!zX) {
                        iN = -1;
                    }
                    if (zX) {
                        this.F.setWidth(this.e == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.e == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    iN = i2;
                }
                this.F.setOutsideTouchable((this.n || this.m) ? false : true);
                this.F.update(q(), this.f, this.g, width < 0 ? -1 : width, iN < 0 ? -1 : iN);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = q().getWidth();
        }
        int i3 = this.d;
        if (i3 == -1) {
            iN = -1;
        } else if (i3 != -2) {
            iN = i3;
        }
        this.F.setWidth(width2);
        this.F.setHeight(iN);
        I(true);
        this.F.setOutsideTouchable((this.n || this.m) ? false : true);
        this.F.setTouchInterceptor(this.x);
        if (this.f1619k) {
            m4i.a(this.F, this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = H;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception unused) {
                }
            }
        } else {
            d.a(this.F, this.D);
        }
        m4i.c(this.F, q(), this.f, this.g, this.l);
        this.c.setSelection(-1);
        if (!this.E || this.c.isInTouchMode()) {
            o();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.z);
    }

    public void b(int i2) {
        this.g = i2;
        this.i = true;
    }

    @Override // defpackage.hbm
    public void dismiss() {
        this.F.dismiss();
        z();
        this.F.setContentView(null);
        this.c = null;
        this.B.removeCallbacks(this.w);
    }

    public int e() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    public int f() {
        return this.f;
    }

    public void g(int i2) {
        this.f = i2;
    }

    public Drawable getBackground() {
        return this.F.getBackground();
    }

    @Override // defpackage.hbm
    public boolean isShowing() {
        return this.F.isShowing();
    }

    public void j(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1620r;
        if (dataSetObserver == null) {
            this.f1620r = new f();
        } else {
            ListAdapter listAdapter2 = this.f1618b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1618b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1620r);
        }
        b67 b67Var = this.c;
        if (b67Var != null) {
            b67Var.setAdapter(this.f1618b);
        }
    }

    @Override // defpackage.hbm
    public ListView m() {
        return this.c;
    }

    public final int n() {
        int measuredHeight;
        int i2;
        int iMakeMeasureSpec;
        View view;
        int i3;
        if (this.c == null) {
            Context context = this.f1617a;
            this.A = new a();
            b67 b67VarP = p(context, !this.E);
            this.c = b67VarP;
            Drawable drawable = this.t;
            if (drawable != null) {
                b67VarP.setSelector(drawable);
            }
            this.c.setAdapter(this.f1618b);
            this.c.setOnItemClickListener(this.u);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new b());
            this.c.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.v;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            b67 b67Var = this.c;
            View view2 = this.p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.q;
                if (i4 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(b67Var, layoutParams);
                } else if (i4 != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid hint position ");
                    sb.append(this.q);
                } else {
                    linearLayout.addView(b67Var, layoutParams);
                    linearLayout.addView(view2);
                }
                int i5 = this.e;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = b67Var;
            }
            this.F.setContentView(view);
        } else {
            View view3 = this.p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.i) {
                this.g = -i6;
            }
        } else {
            this.C.setEmpty();
            i2 = 0;
        }
        int iR = r(q(), this.g, this.F.getInputMethodMode() == 2);
        if (this.m || this.d == -1) {
            return iR + i2;
        }
        int i7 = this.e;
        if (i7 == -2) {
            int i8 = this.f1617a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i7 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else {
            int i9 = this.f1617a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.c.d(iMakeMeasureSpec, 0, -1, iR - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i2 + this.c.getPaddingTop() + this.c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    public void o() {
        b67 b67Var = this.c;
        if (b67Var != null) {
            b67Var.setListSelectionHidden(true);
            b67Var.requestLayout();
        }
    }

    public b67 p(Context context, boolean z) {
        return new b67(context, z);
    }

    public View q() {
        return this.s;
    }

    public final int r(View view, int i2, boolean z) {
        return c.a(this.F, view, i2, z);
    }

    public Object s() {
        if (isShowing()) {
            return this.c.getSelectedItem();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.u = onItemClickListener;
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.v = onItemSelectedListener;
    }

    public long t() {
        if (isShowing()) {
            return this.c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int u() {
        if (isShowing()) {
            return this.c.getSelectedItemPosition();
        }
        return -1;
    }

    public View v() {
        if (isShowing()) {
            return this.c.getSelectedView();
        }
        return null;
    }

    public int w() {
        return this.e;
    }

    public boolean x() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean y() {
        return this.E;
    }

    public final void z() {
        View view = this.p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.p);
            }
        }
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qii.H);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.d = -2;
        this.e = -2;
        this.h = 1002;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.o = Integer.MAX_VALUE;
        this.q = 0;
        this.w = new i();
        this.x = new h();
        this.y = new g();
        this.z = new e();
        this.C = new Rect();
        this.f1617a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5j.v1, i2, i3);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(z5j.w1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(z5j.x1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i2, i3);
        this.F = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
