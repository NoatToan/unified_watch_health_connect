package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.k0;
import com.garmin.android.apps.connectmobile.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public ViewTreeObserver A;
    public PopupWindow.OnDismissListener B;
    public boolean C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f4726g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f4734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f4735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4737r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4738t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4739v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4740w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f4742y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public n.a f4743z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f4727h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f4728i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f4729j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f4730k = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f4731l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4732m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4733n = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4741x = false;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            d dVar = d.this;
            boolean zA = dVar.a();
            ArrayList arrayList = dVar.f4728i;
            if (!zA || arrayList.size() <= 0 || ((C0073d) arrayList.get(0)).f4747a.A) {
                return;
            }
            View view2 = dVar.f4735p;
            if (view2 == null || !view2.isShown()) {
                dVar.dismiss();
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0073d) it.next()).f4747a.show();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view2) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view2) {
            d dVar = d.this;
            ViewTreeObserver viewTreeObserver = dVar.A;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    dVar.A = view2.getViewTreeObserver();
                }
                dVar.A.removeGlobalOnLayoutListener(dVar.f4729j);
            }
            view2.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements j0 {
        public c() {
        }

        @Override // androidx.appcompat.widget.j0
        public final void d(h hVar, MenuItem menuItem) {
            d.this.f4726g.removeCallbacksAndMessages(hVar);
        }

        @Override // androidx.appcompat.widget.j0
        public final void f(h hVar, j jVar) {
            d dVar = d.this;
            dVar.f4726g.removeCallbacksAndMessages(null);
            ArrayList arrayList = dVar.f4728i;
            int size = arrayList.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    i14 = -1;
                    break;
                } else if (hVar == ((C0073d) arrayList.get(i14)).f4748b) {
                    break;
                } else {
                    i14++;
                }
            }
            if (i14 == -1) {
                return;
            }
            int i15 = i14 + 1;
            dVar.f4726g.postAtTime(new e(this, i15 < arrayList.size() ? (C0073d) arrayList.get(i15) : null, jVar, hVar), hVar, SystemClock.uptimeMillis() + 200);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    public static class C0073d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k0 f4747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f4748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4749c;

        public C0073d(k0 k0Var, h hVar, int i14) {
            this.f4747a = k0Var;
            this.f4748b = hVar;
            this.f4749c = i14;
        }
    }

    public d(Context context, View view2, int i14, int i15, boolean z14) {
        this.f4721b = context;
        this.f4734o = view2;
        this.f4723d = i14;
        this.f4724e = i15;
        this.f4725f = z14;
        this.f4736q = view2.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f4722c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4726g = new Handler();
    }

    @Override // androidx.appcompat.view.menu.q
    public final boolean a() {
        ArrayList arrayList = this.f4728i;
        return arrayList.size() > 0 && ((C0073d) arrayList.get(0)).f4747a.B.isShowing();
    }

    @Override // androidx.appcompat.view.menu.l
    public final void b(h hVar) {
        hVar.addMenuPresenter(this, this.f4721b);
        if (a()) {
            l(hVar);
        } else {
            this.f4727h.add(hVar);
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public final void d(View view2) {
        if (this.f4734o != view2) {
            this.f4734o = view2;
            this.f4733n = Gravity.getAbsoluteGravity(this.f4732m, view2.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public final void dismiss() {
        ArrayList arrayList = this.f4728i;
        int size = arrayList.size();
        if (size > 0) {
            C0073d[] c0073dArr = (C0073d[]) arrayList.toArray(new C0073d[size]);
            for (int i14 = size - 1; i14 >= 0; i14--) {
                C0073d c0073d = c0073dArr[i14];
                if (c0073d.f4747a.B.isShowing()) {
                    c0073d.f4747a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public final d0 e() {
        ArrayList arrayList = this.f4728i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0073d) am.j.f(1, arrayList)).f4747a.f5134c;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void f(boolean z14) {
        this.f4741x = z14;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void g(int i14) {
        if (this.f4732m != i14) {
            this.f4732m = i14;
            this.f4733n = Gravity.getAbsoluteGravity(i14, this.f4734o.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public final void h(int i14) {
        this.f4737r = true;
        this.f4739v = i14;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void i(PopupWindow.OnDismissListener onDismissListener) {
        this.B = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void j(boolean z14) {
        this.f4742y = z14;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void k(int i14) {
        this.f4738t = true;
        this.f4740w = i14;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0101  */
    /* JADX WARN: Code duplicated, block: B:57:0x0109  */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:64:0x0145  */
    /* JADX WARN: Code duplicated, block: B:66:0x0153  */
    /* JADX WARN: Code duplicated, block: B:67:0x0156  */
    /* JADX WARN: Code duplicated, block: B:68:0x0158  */
    /* JADX WARN: Code duplicated, block: B:71:0x0160  */
    /* JADX WARN: Code duplicated, block: B:73:0x0163  */
    /* JADX WARN: Code duplicated, block: B:74:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0172  */
    /* JADX WARN: Code duplicated, block: B:79:0x0174  */
    /* JADX WARN: Code duplicated, block: B:80:0x017c  */
    /* JADX WARN: Code duplicated, block: B:82:0x017f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0184  */
    /* JADX WARN: Code duplicated, block: B:85:0x0190  */
    /* JADX WARN: Code duplicated, block: B:87:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x019c  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ab  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void l(h hVar) {
        boolean z14;
        char c14;
        C0073d c0073d;
        View childAt;
        Rect rect;
        Rect rect2;
        int i14;
        androidx.appcompat.widget.p pVar;
        d0 d0Var;
        int[] iArr;
        Rect rect3;
        int i15;
        boolean z15;
        int i16;
        Method method;
        MenuItem item;
        g gVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f4721b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        g gVar2 = new g(hVar, layoutInflaterFrom, this.f4725f, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f4741x) {
            gVar2.f4766c = true;
        } else if (a()) {
            int size = hVar.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    z14 = false;
                    break;
                }
                MenuItem item2 = hVar.getItem(i17);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z14 = true;
                    break;
                }
                i17++;
            }
            gVar2.f4766c = z14;
        }
        int iC = l.c(gVar2, context, this.f4722c);
        k0 k0Var = new k0(context, null, this.f4723d, this.f4724e);
        k0Var.E = this.f4731l;
        k0Var.f5147p = this;
        k0Var.B.setOnDismissListener(this);
        k0Var.f5146o = this.f4734o;
        k0Var.f5143l = this.f4733n;
        k0Var.A = true;
        k0Var.B.setFocusable(true);
        k0Var.B.setInputMethodMode(2);
        k0Var.n(gVar2);
        k0Var.p(iC);
        k0Var.f5143l = this.f4733n;
        ArrayList arrayList = this.f4728i;
        if (arrayList.size() > 0) {
            c0073d = (C0073d) am.j.f(1, arrayList);
            h hVar2 = c0073d.f4748b;
            int size2 = hVar2.size();
            int i18 = 0;
            while (true) {
                if (i18 >= size2) {
                    item = null;
                    break;
                }
                item = hVar2.getItem(i18);
                if (item.hasSubMenu() && hVar == item.getSubMenu()) {
                    break;
                } else {
                    i18++;
                }
            }
            if (item == null) {
                childAt = null;
                c14 = 0;
            } else {
                d0 d0Var2 = c0073d.f4747a.f5134c;
                ListAdapter adapter = d0Var2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    gVar = (g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    gVar = (g) adapter;
                    headersCount = 0;
                }
                int count = gVar.getCount();
                int i19 = 0;
                while (true) {
                    c14 = 0;
                    if (i19 >= count) {
                        i19 = -1;
                        break;
                    } else if (item == gVar.getItem(i19)) {
                        break;
                    } else {
                        i19++;
                    }
                }
                if (i19 != -1 && (firstVisiblePosition = (i19 + headersCount) - d0Var2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < d0Var2.getChildCount()) {
                    childAt = d0Var2.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                i14 = Build.VERSION.SDK_INT;
                pVar = k0Var.B;
                if (i14 <= 28) {
                    method = k0.F;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[1];
                            objArr[c14] = Boolean.FALSE;
                            method.invoke(pVar, objArr);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    k0.b.a(pVar, c14);
                }
                k0.a.a(k0Var.B, null);
                d0Var = ((C0073d) arrayList.get(arrayList.size() - 1)).f4747a.f5134c;
                iArr = new int[2];
                d0Var.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.f4735p.getWindowVisibleDisplayFrame(rect3);
                if (this.f4736q == 1) {
                    if (d0Var.getWidth() + iArr[0] + iC > rect3.right) {
                        i15 = 0;
                    } else {
                        i15 = 1;
                    }
                } else if (iArr[0] - iC < 0) {
                    i15 = 1;
                } else {
                    i15 = 0;
                }
                if (i15 == 1) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                this.f4736q = i15;
                k0Var.f5146o = childAt;
                if ((this.f4733n & 5) == 5) {
                    i16 = 0;
                    if (z15) {
                        iC = childAt.getWidth();
                    } else {
                        iC = 0 - iC;
                    }
                } else if (z15) {
                    i16 = 0;
                } else {
                    i16 = 0;
                    iC = 0 - childAt.getWidth();
                }
                k0Var.f5137f = iC;
                k0Var.f5142k = true;
                k0Var.f5141j = true;
                k0Var.g(i16);
            } else {
                if (this.f4737r) {
                    k0Var.f5137f = this.f4739v;
                }
                if (this.f4738t) {
                    k0Var.g(this.f4740w);
                }
                rect = this.f4810a;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                k0Var.f5155z = rect2;
            }
            arrayList.add(new C0073d(k0Var, hVar, this.f4736q));
            k0Var.show();
            d0 d0Var3 = k0Var.f5134c;
            d0Var3.setOnKeyListener(this);
            if (c0073d == null || !this.f4742y || hVar.getHeaderTitle() == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) d0Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(hVar.getHeaderTitle());
            d0Var3.addHeaderView(frameLayout, null, false);
            k0Var.show();
            return;
        }
        c14 = 0;
        c0073d = null;
        childAt = null;
        if (childAt != null) {
            i14 = Build.VERSION.SDK_INT;
            pVar = k0Var.B;
            if (i14 <= 28) {
                method = k0.F;
                if (method != null) {
                    Object[] objArr2 = new Object[1];
                    objArr2[c14] = Boolean.FALSE;
                    method.invoke(pVar, objArr2);
                }
            } else {
                k0.b.a(pVar, c14);
            }
            k0.a.a(k0Var.B, null);
            d0Var = ((C0073d) arrayList.get(arrayList.size() - 1)).f4747a.f5134c;
            iArr = new int[2];
            d0Var.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.f4735p.getWindowVisibleDisplayFrame(rect3);
            if (this.f4736q == 1) {
                if (d0Var.getWidth() + iArr[0] + iC > rect3.right) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
            } else if (iArr[0] - iC < 0) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            if (i15 == 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f4736q = i15;
            k0Var.f5146o = childAt;
            if ((this.f4733n & 5) == 5) {
                i16 = 0;
                if (z15) {
                    iC = childAt.getWidth();
                } else {
                    iC = 0 - iC;
                }
            } else if (z15) {
                i16 = 0;
            } else {
                i16 = 0;
                iC = 0 - childAt.getWidth();
            }
            k0Var.f5137f = iC;
            k0Var.f5142k = true;
            k0Var.f5141j = true;
            k0Var.g(i16);
        } else {
            if (this.f4737r) {
                k0Var.f5137f = this.f4739v;
            }
            if (this.f4738t) {
                k0Var.g(this.f4740w);
            }
            rect = this.f4810a;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            k0Var.f5155z = rect2;
        }
        arrayList.add(new C0073d(k0Var, hVar, this.f4736q));
        k0Var.show();
        d0 d0Var4 = k0Var.f5134c;
        d0Var4.setOnKeyListener(this);
        if (c0073d == null) {
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final void onCloseMenu(h hVar, boolean z14) {
        ArrayList arrayList = this.f4728i;
        int size = arrayList.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                i14 = -1;
                break;
            } else if (hVar == ((C0073d) arrayList.get(i14)).f4748b) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 < 0) {
            return;
        }
        int i15 = i14 + 1;
        if (i15 < arrayList.size()) {
            ((C0073d) arrayList.get(i15)).f4748b.close(false);
        }
        C0073d c0073d = (C0073d) arrayList.remove(i14);
        h hVar2 = c0073d.f4748b;
        k0 k0Var = c0073d.f4747a;
        hVar2.removeMenuPresenter(this);
        if (this.C) {
            k0.a.b(k0Var.B, null);
            k0Var.B.setAnimationStyle(0);
        }
        k0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f4736q = ((C0073d) arrayList.get(size2 - 1)).f4749c;
        } else {
            this.f4736q = this.f4734o.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z14) {
                ((C0073d) arrayList.get(0)).f4748b.close(false);
                return;
            }
            return;
        }
        dismiss();
        n.a aVar = this.f4743z;
        if (aVar != null) {
            aVar.onCloseMenu(hVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.A.removeGlobalOnLayoutListener(this.f4729j);
            }
            this.A = null;
        }
        this.f4735p.removeOnAttachStateChangeListener(this.f4730k);
        this.B.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0073d c0073d;
        ArrayList arrayList = this.f4728i;
        int size = arrayList.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                c0073d = null;
                break;
            }
            c0073d = (C0073d) arrayList.get(i14);
            if (!c0073d.f4747a.B.isShowing()) {
                break;
            } else {
                i14++;
            }
        }
        if (c0073d != null) {
            c0073d.f4748b.close(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view2, int i14, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i14 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.n
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean onSubMenuSelected(s sVar) {
        for (C0073d c0073d : this.f4728i) {
            if (sVar == c0073d.f4748b) {
                c0073d.f4747a.f5134c.requestFocus();
                return true;
            }
        }
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        b(sVar);
        n.a aVar = this.f4743z;
        if (aVar != null) {
            aVar.a(sVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void setCallback(n.a aVar) {
        this.f4743z = aVar;
    }

    @Override // androidx.appcompat.view.menu.q
    public final void show() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f4727h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l((h) it.next());
        }
        arrayList.clear();
        View view2 = this.f4734o;
        this.f4735p = view2;
        if (view2 != null) {
            boolean z14 = this.A == null;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.A = viewTreeObserver;
            if (z14) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f4729j);
            }
            this.f4735p.addOnAttachStateChangeListener(this.f4730k);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final void updateMenuView(boolean z14) {
        Iterator it = this.f4728i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0073d) it.next()).f4747a.f5134c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((g) adapter).notifyDataSetChanged();
        }
    }
}
