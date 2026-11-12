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
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.garmin.android.apps.connectmobile.R;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class i0 implements androidx.appcompat.view.menu.q {
    public static final Method C;
    public static final Method D;
    public boolean A;
    public final p B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f5133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f5134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5142k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5143l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f5144m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f5145n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f5146o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f5147p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f5148q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f5149r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f5150t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f5151v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f5152w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Handler f5153x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f5154y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Rect f5155z;

    public static class a {
        private a() {
        }

        public static int a(PopupWindow popupWindow, View view2, int i14, boolean z14) {
            return popupWindow.getMaxAvailableHeight(view2, i14, z14);
        }
    }

    public static class b {
        private b() {
        }

        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z14) {
            popupWindow.setIsClippedToScreen(z14);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d0 d0Var = i0.this.f5134c;
            if (d0Var != null) {
                d0Var.setListSelectionHidden(true);
                d0Var.requestLayout();
            }
        }
    }

    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            i0 i0Var = i0.this;
            if (i0Var.B.isShowing()) {
                i0Var.show();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            i0.this.dismiss();
        }
    }

    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i14, int i15, int i16) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i14) {
            if (i14 == 1) {
                i0 i0Var = i0.this;
                p pVar = i0Var.B;
                g gVar = i0Var.f5149r;
                if (pVar.getInputMethodMode() == 2 || i0Var.B.getContentView() == null) {
                    return;
                }
                i0Var.f5153x.removeCallbacks(gVar);
                gVar.run();
            }
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view2, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x14 = (int) motionEvent.getX();
            int y14 = (int) motionEvent.getY();
            i0 i0Var = i0.this;
            if (action == 0) {
                p pVar = i0Var.B;
                p pVar2 = i0Var.B;
                if (pVar != null && pVar.isShowing() && x14 >= 0 && x14 < pVar2.getWidth() && y14 >= 0 && y14 < pVar2.getHeight()) {
                    i0Var.f5153x.postDelayed(i0Var.f5149r, 250L);
                    return false;
                }
            }
            if (action != 1) {
                return false;
            }
            i0Var.f5153x.removeCallbacks(i0Var.f5149r);
            return false;
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i0 i0Var = i0.this;
            d0 d0Var = i0Var.f5134c;
            if (d0Var == null || !d0Var.isAttachedToWindow() || i0Var.f5134c.getCount() <= i0Var.f5134c.getChildCount() || i0Var.f5134c.getChildCount() > i0Var.f5144m) {
                return;
            }
            i0Var.B.setInputMethodMode(2);
            i0Var.show();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                C = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                D = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public i0(Context context, AttributeSet attributeSet, int i14, int i15) {
        this.f5135d = -2;
        this.f5136e = -2;
        this.f5139h = 1002;
        this.f5143l = 0;
        this.f5144m = Integer.MAX_VALUE;
        this.f5149r = new g();
        this.f5150t = new f();
        this.f5151v = new e();
        this.f5152w = new c();
        this.f5154y = new Rect();
        this.f5132a = context;
        this.f5153x = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f80436p, i14, i15);
        this.f5137f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f5138g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f5140i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        p pVar = new p(context, attributeSet, i14, i15);
        this.B = pVar;
        pVar.setInputMethodMode(1);
    }

    @Override // androidx.appcompat.view.menu.q
    public final boolean a() {
        return this.B.isShowing();
    }

    public final Drawable b() {
        return this.B.getBackground();
    }

    @Override // androidx.appcompat.view.menu.q
    public final void dismiss() {
        p pVar = this.B;
        pVar.dismiss();
        pVar.setContentView(null);
        this.f5134c = null;
        this.f5153x.removeCallbacks(this.f5149r);
    }

    @Override // androidx.appcompat.view.menu.q
    public final d0 e() {
        return this.f5134c;
    }

    public final void g(int i14) {
        this.f5138g = i14;
        this.f5140i = true;
    }

    public final int i() {
        if (this.f5140i) {
            return this.f5138g;
        }
        return 0;
    }

    public final int j() {
        return this.f5137f;
    }

    public final void k(int i14) {
        this.f5137f = i14;
    }

    public void n(ListAdapter listAdapter) {
        d dVar = this.f5145n;
        if (dVar == null) {
            this.f5145n = new d();
        } else {
            ListAdapter listAdapter2 = this.f5133b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f5133b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f5145n);
        }
        d0 d0Var = this.f5134c;
        if (d0Var != null) {
            d0Var.setAdapter(this.f5133b);
        }
    }

    public d0 o(Context context, boolean z14) {
        return new d0(context, z14);
    }

    public final void p(int i14) {
        Drawable background = this.B.getBackground();
        if (background == null) {
            this.f5136e = i14;
            return;
        }
        Rect rect = this.f5154y;
        background.getPadding(rect);
        this.f5136e = rect.left + rect.right + i14;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.B.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.q
    public final void show() {
        int i14;
        int iMakeMeasureSpec;
        int paddingBottom;
        d0 d0Var;
        d0 d0Var2 = this.f5134c;
        Context context = this.f5132a;
        p pVar = this.B;
        if (d0Var2 == null) {
            new g0(this);
            d0 d0VarO = o(context, !this.A);
            this.f5134c = d0VarO;
            d0VarO.setAdapter(this.f5133b);
            this.f5134c.setOnItemClickListener(this.f5147p);
            this.f5134c.setFocusable(true);
            this.f5134c.setFocusableInTouchMode(true);
            this.f5134c.setOnItemSelectedListener(new h0(this));
            this.f5134c.setOnScrollListener(this.f5151v);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f5148q;
            if (onItemSelectedListener != null) {
                this.f5134c.setOnItemSelectedListener(onItemSelectedListener);
            }
            pVar.setContentView(this.f5134c);
        }
        Drawable background = pVar.getBackground();
        Rect rect = this.f5154y;
        if (background != null) {
            background.getPadding(rect);
            int i15 = rect.top;
            i14 = rect.bottom + i15;
            if (!this.f5140i) {
                this.f5138g = -i15;
            }
        } else {
            rect.setEmpty();
            i14 = 0;
        }
        int iA = a.a(pVar, this.f5146o, this.f5138g, pVar.getInputMethodMode() == 2);
        int i16 = this.f5135d;
        if (i16 == -1) {
            paddingBottom = iA + i14;
        } else {
            int i17 = this.f5136e;
            if (i17 != -2) {
                iMakeMeasureSpec = i17 != -1 ? View.MeasureSpec.makeMeasureSpec(i17, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.f5134c.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f5134c.getPaddingBottom() + this.f5134c.getPaddingTop() + i14 : 0);
        }
        boolean z14 = pVar.getInputMethodMode() == 2;
        pVar.setWindowLayoutType(this.f5139h);
        if (pVar.isShowing()) {
            if (this.f5146o.isAttachedToWindow()) {
                int width = this.f5136e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f5146o.getWidth();
                }
                if (i16 == -1) {
                    i16 = z14 ? paddingBottom : -1;
                    int i18 = this.f5136e;
                    if (z14) {
                        pVar.setWidth(i18 == -1 ? -1 : 0);
                        pVar.setHeight(0);
                    } else {
                        pVar.setWidth(i18 == -1 ? -1 : 0);
                        pVar.setHeight(-1);
                    }
                } else if (i16 == -2) {
                    i16 = paddingBottom;
                }
                pVar.setOutsideTouchable(true);
                int i19 = width;
                View view2 = this.f5146o;
                int i24 = this.f5137f;
                int i25 = this.f5138g;
                int i26 = i19 < 0 ? -1 : i19;
                if (i16 < 0) {
                    i16 = -1;
                }
                pVar.update(view2, i24, i25, i26, i16);
                return;
            }
            return;
        }
        int width2 = this.f5136e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f5146o.getWidth();
        }
        if (i16 == -1) {
            i16 = -1;
        } else if (i16 == -2) {
            i16 = paddingBottom;
        }
        pVar.setWidth(width2);
        pVar.setHeight(i16);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = C;
            if (method != null) {
                try {
                    method.invoke(pVar, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            b.b(pVar, true);
        }
        pVar.setOutsideTouchable(true);
        pVar.setTouchInterceptor(this.f5150t);
        if (this.f5142k) {
            pVar.setOverlapAnchor(this.f5141j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = D;
            if (method2 != null) {
                try {
                    method2.invoke(pVar, this.f5155z);
                } catch (Exception unused2) {
                }
            }
        } else {
            b.a(pVar, this.f5155z);
        }
        pVar.showAsDropDown(this.f5146o, this.f5137f, this.f5138g, this.f5143l);
        this.f5134c.setSelection(-1);
        if ((!this.A || this.f5134c.isInTouchMode()) && (d0Var = this.f5134c) != null) {
            d0Var.setListSelectionHidden(true);
            d0Var.requestLayout();
        }
        if (this.A) {
            return;
        }
        this.f5153x.post(this.f5152w);
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public i0(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
    }

    public i0(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }
}
