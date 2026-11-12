package com.huawei.uikit.hwspinner.widget;

import android.R;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ShowableListMenu;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.OsType;
import defpackage.xeh;

/* JADX INFO: loaded from: classes20.dex */
public class HwListPopupWindow implements ShowableListMenu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f29717a;
    private int aa;
    private Drawable ab;
    private View ac;
    private DataSetObserver ad;
    private final e ae;
    private final i af;
    private final f ag;
    private final a ah;
    private AdapterView.OnItemClickListener ai;
    private Runnable am;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f29719c;
    private boolean d;
    private boolean e;
    private int f;
    private PopupWindow g;
    private boolean h;
    private int i;
    private Rect j;
    private int k;
    private Context l;
    private HwDropDownListView m;
    private int n;
    private ListAdapter o;
    private int p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private int w;
    private boolean x;
    private boolean y;
    private View z;

    class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HwListPopupWindow.this.c();
        }

        /* synthetic */ a(HwListPopupWindow hwListPopupWindow, h hVar) {
            this();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            HwDropDownListView hwDropDownListView;
            if (i == -1 || (hwDropDownListView = HwListPopupWindow.this.m) == null) {
                return;
            }
            hwDropDownListView.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewE = HwListPopupWindow.this.e();
            if (viewE == null || viewE.getWindowToken() == null) {
                return;
            }
            HwListPopupWindow.this.show();
        }
    }

    class d extends DataSetObserver {
        private d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (HwListPopupWindow.this.isShowing()) {
                HwListPopupWindow.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            HwListPopupWindow.this.dismiss();
        }

        /* synthetic */ d(HwListPopupWindow hwListPopupWindow, h hVar) {
            this();
        }
    }

    class e implements AbsListView.OnScrollListener {
        private e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && HwListPopupWindow.this.i() && HwListPopupWindow.this.g.getContentView() != null) {
                HwListPopupWindow.this.f29717a.removeCallbacks(HwListPopupWindow.this.af);
                HwListPopupWindow.this.af.run();
            }
        }

        /* synthetic */ e(HwListPopupWindow hwListPopupWindow, h hVar) {
            this();
        }
    }

    class f implements View.OnTouchListener {
        private f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view == null || motionEvent == null) {
                Log.w("HwListPopupWindow", "setOnTouchListener: onTouch: view or event is null");
                return false;
            }
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            boolean z = action == 0 && HwListPopupWindow.this.g != null && HwListPopupWindow.this.g.isShowing();
            boolean z2 = x >= 0 && x < HwListPopupWindow.this.g.getWidth() && y >= 0 && y < HwListPopupWindow.this.g.getHeight();
            if (z && z2) {
                HwListPopupWindow.this.f29717a.postDelayed(HwListPopupWindow.this.af, 250L);
            }
            if (action == 1) {
                HwListPopupWindow.this.f29717a.removeCallbacks(HwListPopupWindow.this.af);
            }
            return false;
        }

        /* synthetic */ f(HwListPopupWindow hwListPopupWindow, h hVar) {
            this();
        }
    }

    class h extends HwForwardingListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HwListPopupWindow f29721b;

        @Override // com.huawei.uikit.hwspinner.widget.HwForwardingListener
        public ShowableListMenu getPopup() {
            return this.f29721b;
        }
    }

    class i implements Runnable {
        private i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((HwListPopupWindow.this.m != null && HwListPopupWindow.this.m.isAttachedToWindow()) & (HwListPopupWindow.this.m.getCount() > HwListPopupWindow.this.m.getChildCount())) && (HwListPopupWindow.this.m.getChildCount() <= HwListPopupWindow.this.u)) {
                HwListPopupWindow.this.g.setInputMethodMode(2);
                HwListPopupWindow.this.show();
            }
        }

        /* synthetic */ i(HwListPopupWindow hwListPopupWindow, h hVar) {
            this();
        }
    }

    public HwListPopupWindow(Context context) {
        this(context, null, R.attr.listPopupWindowStyle, 0);
    }

    private int g() {
        int i2;
        int i3 = this.k;
        if (i3 >= 0) {
            i2 = Integer.MIN_VALUE;
        } else {
            i3 = 0;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i3, i2);
    }

    private void k() {
        float measuredHeight;
        View view;
        if (this.g == null) {
            return;
        }
        Class cls = Boolean.TYPE;
        xeh.b(this.g, "setShadowEnabled", new Class[]{cls}, new Object[]{Boolean.valueOf(this.e)}, PopupWindow.class);
        if (this.e) {
            Class cls2 = Integer.TYPE;
            xeh.b(this.g, "setShadowStyle", new Class[]{cls2}, new Object[]{Integer.valueOf(this.f29718b)}, PopupWindow.class);
            xeh.b(this.g, "setShadowSize", new Class[]{cls2}, new Object[]{Integer.valueOf(this.i)}, PopupWindow.class);
            xeh.b(this.g, "setShadowColor", new Class[]{cls2}, new Object[]{Integer.valueOf(this.f)}, PopupWindow.class);
            xeh.b(this.g, "setShadowClip", new Class[]{cls}, new Object[]{Boolean.valueOf(this.d)}, PopupWindow.class);
            ListAdapter adapter = this.m.getAdapter();
            if (adapter == null || adapter.getCount() <= 0 || (view = adapter.getView(0, null, this.m)) == null) {
                measuredHeight = -1.0f;
            } else {
                view.measure(0, 0);
                measuredHeight = view.getMeasuredHeight() / 2.0f;
            }
            xeh.b(this.g, "setShadowViewZ", new Class[]{Float.TYPE}, new Object[]{Float.valueOf(measuredHeight)}, PopupWindow.class);
        }
    }

    private void l() {
        View view = this.ac;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.ac);
            }
        }
    }

    protected void a(int i2) {
        this.f = i2;
    }

    public void a(AdapterView.OnItemClickListener onItemClickListener) {
        this.ai = onItemClickListener;
    }

    public void a(boolean z) {
        this.h = z;
        this.g.setFocusable(z);
    }

    protected void b(int i2) {
        this.f29718b = i2;
    }

    public void b(View view) {
        this.z = view;
    }

    public void c() {
        HwDropDownListView hwDropDownListView = this.m;
        if (hwDropDownListView != null) {
            hwDropDownListView.setListSelectionHidden(true);
            xeh.b(hwDropDownListView, "hideSelector", null, null, AbsListView.class);
            hwDropDownListView.requestLayout();
        }
    }

    public void c(int i2) {
        this.g.setInputMethodMode(i2);
    }

    protected void c(boolean z) {
        this.d = z;
    }

    public int d() {
        return this.k;
    }

    public void d(int i2) {
        Drawable background = this.g.getBackground();
        if (background == null) {
            h(i2);
            return;
        }
        background.getPadding(this.f29719c);
        Rect rect = this.f29719c;
        this.k = rect.left + rect.right + i2;
    }

    protected void d(boolean z) {
        this.e = z;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        this.g.dismiss();
        l();
        this.g.setContentView(null);
        this.m = null;
        this.f29717a.removeCallbacks(this.af);
    }

    public View e() {
        return this.z;
    }

    protected void e(int i2) {
        this.i = i2;
    }

    public void e(Drawable drawable) {
        this.ab = drawable;
    }

    public void g(int i2) {
        HwDropDownListView hwDropDownListView = this.m;
        if (!isShowing() || hwDropDownListView == null) {
            return;
        }
        hwDropDownListView.setListSelectionHidden(false);
        hwDropDownListView.setSelection(i2);
        if (hwDropDownListView.getChoiceMode() != 0) {
            hwDropDownListView.setItemChecked(i2, true);
        }
    }

    public Drawable getBackground() {
        return this.g.getBackground();
    }

    public int getHorizontalOffset() {
        return this.t;
    }

    public int getVerticalOffset() {
        if (this.q) {
            return this.p;
        }
        return 0;
    }

    public void h(int i2) {
        this.k = i2;
    }

    public boolean i() {
        return this.g.getInputMethodMode() != 2;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
        return this.g.isShowing();
    }

    public void j(int i2) {
        this.aa = i2;
    }

    public void setAdapter(ListAdapter listAdapter) {
        if (this.ad == null) {
            this.ad = new d(this, null);
        }
        ListAdapter listAdapter2 = this.o;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(this.ad);
        }
        this.o = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.ad);
        }
        HwDropDownListView hwDropDownListView = this.m;
        if (hwDropDownListView != null) {
            hwDropDownListView.setAdapter(this.o);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.g.setBackgroundDrawable(drawable);
    }

    public void setHorizontalOffset(int i2) {
        this.t = i2;
    }

    public void setVerticalOffset(int i2) {
        this.p = i2;
        this.q = true;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        int iA = a();
        boolean zI = i();
        xeh.b(this.g, "setAllowScrollingAnchorParent", new Class[]{Boolean.TYPE}, new Object[]{Boolean.valueOf(zI)}, PopupWindow.class);
        this.g.setWindowLayoutType(this.s);
        k();
        if (this.g.isShowing()) {
            c(zI, iA);
        } else if (e() != null) {
            f(iA);
        }
    }

    public HwListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle, 0);
    }

    private void c(boolean z, int i2) {
        if (e() == null || !e().isAttachedToWindow()) {
            return;
        }
        int width = this.k;
        if (width == -1) {
            width = -1;
        } else if (width == -2) {
            width = e().getWidth();
        }
        int i3 = this.n;
        boolean z2 = false;
        if (i3 == -1) {
            if (z) {
                i2 = -1;
            }
            if (z) {
                this.g.setWidth(this.k == -1 ? -1 : 0);
                this.g.setHeight(-1);
            } else {
                this.g.setWidth(this.k == -1 ? -1 : 0);
                this.g.setHeight(0);
            }
        } else if (i3 != -2) {
            i2 = i3;
        }
        PopupWindow popupWindow = this.g;
        if (!this.x && !this.y) {
            z2 = true;
        }
        popupWindow.setOutsideTouchable(z2);
        this.g.update(e(), this.t, this.p, width < 0 ? -1 : width, i2 < 0 ? -1 : i2);
        this.g.getContentView().requestFocus(130);
    }

    private int f() {
        Drawable background = this.g.getBackground();
        if (background == null) {
            this.f29719c.setEmpty();
            return 0;
        }
        background.getPadding(this.f29719c);
        Rect rect = this.f29719c;
        int i2 = rect.top;
        int i3 = rect.bottom;
        if (!this.q) {
            this.p = -i2;
        }
        return i3 + i2;
    }

    private void f(int i2) {
        int width = this.k;
        if (width == -1) {
            width = -1;
        } else if (width == -2) {
            width = e().getWidth();
        }
        int i3 = this.n;
        if (i3 == -1) {
            i2 = -1;
        } else if (i3 != -2) {
            i2 = i3;
        }
        this.g.setWidth(width);
        this.g.setHeight(i2);
        xeh.b(this.g, "setClipToScreenEnabled", new Class[]{Boolean.TYPE}, new Object[]{Boolean.TRUE}, PopupWindow.class);
        this.g.setOutsideTouchable((this.x || this.y) ? false : true);
        this.g.setTouchInterceptor(this.ag);
        xeh.b(this.g, "setEpicenterBounds", new Class[]{Rect.class}, new Object[]{this.j}, PopupWindow.class);
        if (this.v) {
            this.g.setOverlapAnchor(this.r);
        }
        this.g.showAsDropDown(e(), this.t, this.p, this.w);
        this.m.setSelection(-1);
        this.g.getContentView().requestFocus(130);
        if (!this.h || this.m.isInTouchMode()) {
            c();
        }
        if (this.h) {
            return;
        }
        this.f29717a.post(this.ah);
    }

    private int h() {
        if (e() == null) {
            return 0;
        }
        int maxAvailableHeight = this.g.getMaxAvailableHeight(e(), this.p, this.g.getInputMethodMode() == 2);
        return (d(this.l) && this.aa == 0) ? maxAvailableHeight - a(this.l) : maxAvailableHeight;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public HwDropDownListView getListView() {
        return this.m;
    }

    public HwListPopupWindow(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public HwListPopupWindow(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.n = -2;
        this.k = -2;
        this.s = 1002;
        this.q = false;
        this.r = false;
        this.v = false;
        this.w = 0;
        this.y = false;
        this.x = false;
        this.u = Integer.MAX_VALUE;
        this.aa = 0;
        h hVar = null;
        this.af = new i(this, hVar);
        this.ag = new f(this, hVar);
        this.ae = new e(this, hVar);
        this.ah = new a(this, hVar);
        this.f29719c = new Rect();
        this.h = false;
        this.l = context;
        this.f29717a = new Handler(context.getMainLooper());
        this.t = 0;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.huawei.uikit.hwspinner.R.dimen.hwspinner_dropdown_vertical_offset);
        this.p = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.q = true;
        }
        PopupWindow popupWindow = new PopupWindow(context, attributeSet, i2, i3);
        this.g = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    private int a() {
        int iE;
        View view;
        if (this.m == null) {
            Context context = this.l;
            c(context);
            HwDropDownListView hwDropDownListView = this.m;
            View view2 = this.ac;
            iE = 0;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i2 = this.aa;
                if (i2 == 0) {
                    view = hwDropDownListView;
                    linearLayout.addView(view2);
                    linearLayout.addView(hwDropDownListView, layoutParams);
                } else if (i2 == 1) {
                    linearLayout.addView(hwDropDownListView, layoutParams);
                    linearLayout.addView(view2);
                }
                view2.measure(g(), 0);
                iE = e(view2);
                view = linearLayout;
            }
            view = hwDropDownListView;
            this.g.setContentView(view);
        } else {
            iE = e(this.ac);
        }
        int iF = f();
        int iH = h();
        if (this.y || this.n == -1) {
            return iH + iF;
        }
        int iE2 = this.m.e(j(), iH - iE);
        if (iE2 > 0) {
            iE += iF + this.m.getPaddingTop() + this.m.getPaddingBottom();
        }
        return iE2 + iE;
    }

    HwDropDownListView a(Context context, boolean z) {
        return new HwDropDownListView(context, z);
    }

    private boolean d(Context context) {
        return context != null && Settings.Global.getInt(context.getContentResolver(), Constants.NAVIGATIONBAR_IS_MIN, 0) == 0;
    }

    private int j() {
        int i2 = this.k;
        if (i2 == -2) {
            int i3 = this.l.getResources().getDisplayMetrics().widthPixels;
            Rect rect = this.f29719c;
            return View.MeasureSpec.makeMeasureSpec(i3 - (rect.left + rect.right), Integer.MIN_VALUE);
        }
        if (i2 != -1) {
            Rect rect2 = this.f29719c;
            return View.MeasureSpec.makeMeasureSpec(i2 - (rect2.left + rect2.right), 1073741824);
        }
        int i4 = this.l.getResources().getDisplayMetrics().widthPixels;
        Rect rect3 = this.f29719c;
        return View.MeasureSpec.makeMeasureSpec(i4 - (rect3.left + rect3.right), 1073741824);
    }

    private int e(View view) {
        int i2 = 0;
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            i2 = layoutParams2.topMargin + layoutParams2.bottomMargin;
        }
        return view.getMeasuredHeight() + i2;
    }

    private int a(Context context) {
        if (context == null || context.getResources() == null) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", OsType.ANDROID));
    }

    private void c(Context context) {
        this.am = new c();
        this.m = a(context, !this.h);
        this.m.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Drawable drawable = this.ab;
        if (drawable != null) {
            this.m.setSelector(drawable);
        } else {
            this.m.setSelector(com.huawei.uikit.hwspinner.R.drawable.hwspinner_list_selector_emui);
        }
        this.m.setAdapter(this.o);
        this.m.setOnItemClickListener(this.ai);
        this.m.setFocusable(true);
        this.m.setFocusableInTouchMode(true);
        this.m.setOnItemSelectedListener(new b());
        this.m.setOnScrollListener(this.ae);
    }
}
