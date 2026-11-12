package miuix.popupwidget.widget;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.view.WindowInsetsCompat;
import defpackage.zlr;

/* JADX INFO: loaded from: classes3.dex */
public class ListPopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f26787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f26788b;
    public final e c;
    public final d d;
    public int e;
    public Context f;
    public ArrowPopupWindow g;
    public ListAdapter h;
    public c i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26789k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public View q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26790r;
    public View s;
    public Drawable t;
    public AdapterView.OnItemClickListener u;
    public AdapterView.OnItemSelectedListener v;
    public Runnable w;
    public Handler x;
    public Rect y;
    public boolean z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewG = ListPopupWindow.this.g();
            if (viewG == null || viewG.getWindowToken() == null) {
                return;
            }
            ListPopupWindow.this.j();
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            c cVar;
            if (i == -1 || (cVar = ListPopupWindow.this.i) == null) {
                return;
            }
            cVar.f26793a = false;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class c extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f26793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f26794b;

        public c(Context context, boolean z) {
            super(context, null, R.attr.dropDownListViewStyle);
            this.f26794b = z;
            setCacheColorHint(0);
        }

        public final int b(int i, int i2, int i3, int i4, int i5) {
            int listPaddingTop = getListPaddingTop();
            int listPaddingBottom = getListPaddingBottom();
            int dividerHeight = getDividerHeight();
            Drawable divider = getDivider();
            ListAdapter adapter = getAdapter();
            if (adapter == null) {
                return listPaddingTop + listPaddingBottom;
            }
            int measuredHeight = listPaddingTop + listPaddingBottom;
            if (dividerHeight <= 0 || divider == null) {
                dividerHeight = 0;
            }
            int count = adapter.getCount();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            View view = null;
            while (i6 < count) {
                int itemViewType = adapter.getItemViewType(i6);
                if (itemViewType != i7) {
                    view = null;
                    i7 = itemViewType;
                }
                view = adapter.getView(i6, view, this);
                int i9 = view.getLayoutParams().height;
                view.measure(i, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
                if (i6 > 0) {
                    measuredHeight += dividerHeight;
                }
                measuredHeight += view.getMeasuredHeight();
                if (measuredHeight >= i4) {
                    return (i5 < 0 || i6 <= i5 || i8 <= 0 || measuredHeight == i4) ? i4 : i8;
                }
                if (i5 >= 0 && i6 >= i5) {
                    i8 = measuredHeight;
                }
                i6++;
            }
            return measuredHeight;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean hasFocus() {
            return this.f26794b || super.hasFocus();
        }

        @Override // android.view.View
        public boolean hasWindowFocus() {
            return this.f26794b || super.hasWindowFocus();
        }

        @Override // android.view.View
        public boolean isFocused() {
            return this.f26794b || super.isFocused();
        }

        @Override // android.view.View
        public boolean isInTouchMode() {
            return (this.f26794b && this.f26793a) || super.isInTouchMode();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.f();
        }

        public /* synthetic */ d(ListPopupWindow listPopupWindow, a aVar) {
            this();
        }
    }

    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || ListPopupWindow.this.i() || ListPopupWindow.this.g.getContentView() == null) {
                return;
            }
            ListPopupWindow.this.x.removeCallbacks(ListPopupWindow.this.f26787a);
            ListPopupWindow.this.f26787a.run();
        }

        public /* synthetic */ e(ListPopupWindow listPopupWindow, a aVar) {
            this();
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && ListPopupWindow.this.g != null && ListPopupWindow.this.g.isShowing() && x >= 0 && x < ListPopupWindow.this.g.e() && y >= 0 && y < ListPopupWindow.this.g.d()) {
                ListPopupWindow.this.x.postDelayed(ListPopupWindow.this.f26787a, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            ListPopupWindow.this.x.removeCallbacks(ListPopupWindow.this.f26787a);
            return false;
        }

        public /* synthetic */ f(ListPopupWindow listPopupWindow, a aVar) {
            this();
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ListPopupWindow.this.i == null || ListPopupWindow.this.i.getCount() <= ListPopupWindow.this.i.getChildCount()) {
                return;
            }
            int childCount = ListPopupWindow.this.i.getChildCount();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (childCount <= listPopupWindow.e) {
                listPopupWindow.g.setInputMethodMode(2);
                ListPopupWindow.this.j();
            }
        }

        public /* synthetic */ g(ListPopupWindow listPopupWindow, a aVar) {
            this();
        }
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int e() {
        int measuredHeight;
        int iMakeMeasureSpec;
        View view;
        int i = 0;
        if (this.i == null) {
            Context context = this.f;
            this.w = new a();
            c cVar = new c(context, !this.z);
            this.i = cVar;
            Drawable drawable = this.t;
            if (drawable != null) {
                cVar.setSelector(drawable);
            }
            this.i.setAdapter(this.h);
            this.i.setOnItemClickListener(this.u);
            this.i.setFocusable(true);
            this.i.setFocusableInTouchMode(true);
            this.i.setOnItemSelectedListener(new b());
            this.i.setOnScrollListener(this.c);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.v;
            if (onItemSelectedListener != null) {
                this.i.setOnItemSelectedListener(onItemSelectedListener);
            }
            c cVar2 = this.i;
            View view2 = this.q;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i2 = this.f26790r;
                if (i2 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(cVar2, layoutParams);
                } else if (i2 != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid hint position ");
                    sb.append(this.f26790r);
                } else {
                    linearLayout.addView(cVar2, layoutParams);
                    linearLayout.addView(view2);
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(this.f26789k, Integer.MIN_VALUE), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = cVar2;
            }
            this.g.setContentView(view);
        } else {
            View view3 = this.q;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.g.getBackground();
        if (background != null) {
            background.getPadding(this.y);
            Rect rect = this.y;
            int i3 = rect.top;
            i = rect.bottom + i3;
            if (!this.n) {
                this.m = -i3;
            }
        } else {
            this.y.setEmpty();
        }
        int iH = h(g(), this.m);
        if (this.o || this.j == -1) {
            return iH + i;
        }
        int i4 = this.f26789k;
        if (i4 == -2) {
            int i5 = this.f.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.y;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i4 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else {
            int i6 = this.f.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.y;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6 - (rect3.left + rect3.right), 1073741824);
        }
        int iB = this.i.b(iMakeMeasureSpec, 0, -1, iH - measuredHeight, -1);
        if (iB > 0) {
            measuredHeight += i;
        }
        return iB + measuredHeight;
    }

    public void f() {
        c cVar = this.i;
        if (cVar != null) {
            cVar.f26793a = true;
            cVar.requestLayout();
        }
    }

    public View g() {
        return this.s;
    }

    public int h(View view, int i) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int i2 = zlr.i(this.f).y;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        int i3 = this.g.i(((i2 - (rootWindowInsets != null ? WindowInsetsCompat.x(rootWindowInsets).f(WindowInsetsCompat.m.h() | WindowInsetsCompat.m.b()).d : 0)) - (iArr[1] + view.getHeight())) - i, (iArr[1] - rect.top) + i);
        if (this.g.getBackground() == null) {
            return i3;
        }
        this.g.getBackground().getPadding(this.y);
        Rect rect2 = this.y;
        return i3 - (rect2.top + rect2.bottom);
    }

    public boolean i() {
        return this.g.getInputMethodMode() == 2;
    }

    public void j() {
        int iE = e();
        int i = this.f26789k;
        if (i != -1) {
            if (i == -2) {
                this.g.o(g().getWidth());
            } else {
                this.g.o(i);
            }
        }
        int i2 = this.j;
        if (i2 != -1) {
            if (i2 == -2) {
                this.g.m(iE);
            } else {
                this.g.m(i2);
            }
        }
        this.g.setFocusable(true);
        if (this.g.isShowing()) {
            this.g.setOutsideTouchable((this.p || this.o) ? false : true);
            this.g.update(g(), this.l, this.m, this.f26789k, iE);
            return;
        }
        this.g.setWindowLayoutMode(-1, -1);
        this.g.setOutsideTouchable((this.p || this.o) ? false : true);
        this.g.setTouchInterceptor(this.f26788b);
        this.g.s(g(), this.l, this.m);
        this.i.setSelection(-1);
        if (!this.z || this.i.isInTouchMode()) {
            f();
        }
        if (this.z) {
            return;
        }
        this.x.post(this.d);
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.g.setOnDismissListener(onDismissListener);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.u = onItemClickListener;
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.v = onItemSelectedListener;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        a aVar = null;
        this.f26787a = new g(this, aVar);
        this.f26788b = new f(this, aVar);
        this.c = new e(this, aVar);
        this.d = new d(this, aVar);
        this.e = Integer.MAX_VALUE;
        this.j = -2;
        this.f26789k = -2;
        this.o = false;
        this.p = false;
        this.f26790r = 0;
        this.x = new Handler();
        this.y = new Rect();
        this.f = context;
        this.g = new ArrowPopupWindow(context, attributeSet, i);
    }
}
