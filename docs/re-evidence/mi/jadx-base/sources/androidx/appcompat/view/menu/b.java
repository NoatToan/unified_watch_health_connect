package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.MenuPopupWindow;
import defpackage.mqf;
import defpackage.mwi;
import defpackage.oqf;
import defpackage.p3b;
import defpackage.smi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends oqf implements i, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int B = mwi.g;
    public boolean A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1486b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Handler g;
    public View o;
    public View p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1488r;
    public boolean s;
    public int t;
    public int u;
    public boolean w;
    public i.a x;
    public ViewTreeObserver y;
    public PopupWindow.OnDismissListener z;
    public final List<e> h = new ArrayList();
    public final List<d> i = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f1487k = new ViewOnAttachStateChangeListenerC0009b();
    public final mqf l = new c();
    public int m = 0;
    public int n = 0;
    public boolean v = false;
    public int q = z();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.isShowing() || b.this.i.size() <= 0 || b.this.i.get(0).f1494a.y()) {
                return;
            }
            View view = b.this.p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator<d> it = b.this.i.iterator();
            while (it.hasNext()) {
                it.next().f1494a.a();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0009b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0009b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.y.removeGlobalOnLayoutListener(bVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements mqf {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f1492a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MenuItem f1493b;
            public final /* synthetic */ e c;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.f1492a = dVar;
                this.f1493b = menuItem;
                this.c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f1492a;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.f1495b.e(false);
                    b.this.A = false;
                }
                if (this.f1493b.isEnabled() && this.f1493b.hasSubMenu()) {
                    this.c.N(this.f1493b, 4);
                }
            }
        }

        public c() {
        }

        @Override // defpackage.mqf
        public void k(e eVar, MenuItem menuItem) {
            b.this.g.removeCallbacksAndMessages(null);
            int size = b.this.i.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (eVar == b.this.i.get(i).f1495b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            b.this.g.postAtTime(new a(i2 < b.this.i.size() ? b.this.i.get(i2) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // defpackage.mqf
        public void l(e eVar, MenuItem menuItem) {
            b.this.g.removeCallbacksAndMessages(eVar);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuPopupWindow f1494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f1495b;
        public final int c;

        public d(MenuPopupWindow menuPopupWindow, e eVar, int i) {
            this.f1494a = menuPopupWindow;
            this.f1495b = eVar;
            this.c = i;
        }

        public ListView a() {
            return this.f1494a.m();
        }
    }

    public b(Context context, View view, int i, int i2, boolean z) {
        this.f1486b = context;
        this.o = view;
        this.d = i;
        this.e = i2;
        this.f = z;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(smi.d));
        this.g = new Handler();
    }

    public final int A(int i) {
        List<d> list = this.i;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.p.getWindowVisibleDisplayFrame(rect);
        if (this.q == 1) {
            return (iArr[0] + listViewA.getWidth()) + i > rect.right ? 0 : 1;
        }
        return iArr[0] - i < 0 ? 1 : 0;
    }

    public final void B(e eVar) {
        d dVar;
        View viewY;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1486b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f, B);
        if (!isShowing() && this.v) {
            dVar2.d(true);
        } else if (isShowing()) {
            dVar2.d(oqf.t(eVar));
        }
        int iK = oqf.k(dVar2, null, this.f1486b, this.c);
        MenuPopupWindow menuPopupWindowV = v();
        menuPopupWindowV.j(dVar2);
        menuPopupWindowV.C(iK);
        menuPopupWindowV.D(this.n);
        if (this.i.size() > 0) {
            List<d> list = this.i;
            dVar = list.get(list.size() - 1);
            viewY = y(dVar, eVar);
        } else {
            dVar = null;
            viewY = null;
        }
        if (viewY != null) {
            menuPopupWindowV.P(false);
            menuPopupWindowV.M(null);
            int iA = A(iK);
            boolean z = iA == 1;
            this.q = iA;
            menuPopupWindowV.A(viewY);
            if ((this.n & 5) != 5) {
                iK = z ? viewY.getWidth() : 0 - iK;
            } else if (!z) {
                iK = 0 - viewY.getWidth();
            }
            menuPopupWindowV.g(iK);
            menuPopupWindowV.H(true);
            menuPopupWindowV.b(0);
        } else {
            if (this.f1488r) {
                menuPopupWindowV.g(this.t);
            }
            if (this.s) {
                menuPopupWindowV.b(this.u);
            }
            menuPopupWindowV.E(j());
        }
        this.i.add(new d(menuPopupWindowV, eVar, this.q));
        menuPopupWindowV.a();
        ListView listViewM = menuPopupWindowV.m();
        listViewM.setOnKeyListener(this);
        if (dVar == null && this.w && eVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(mwi.n, (ViewGroup) listViewM, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.z());
            listViewM.addHeaderView(frameLayout, null, false);
            menuPopupWindowV.a();
        }
    }

    @Override // defpackage.hbm
    public void a() {
        if (isShowing()) {
            return;
        }
        Iterator<e> it = this.h.iterator();
        while (it.hasNext()) {
            B(it.next());
        }
        this.h.clear();
        View view = this.o;
        this.p = view;
        if (view != null) {
            boolean z = this.y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            this.p.addOnAttachStateChangeListener(this.f1487k);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z) {
        int iW = w(eVar);
        if (iW < 0) {
            return;
        }
        int i = iW + 1;
        if (i < this.i.size()) {
            this.i.get(i).f1495b.e(false);
        }
        d dVarRemove = this.i.remove(iW);
        dVarRemove.f1495b.Q(this);
        if (this.A) {
            dVarRemove.f1494a.N(null);
            dVarRemove.f1494a.B(0);
        }
        dVarRemove.f1494a.dismiss();
        int size = this.i.size();
        if (size > 0) {
            this.q = this.i.get(size - 1).c;
        } else {
            this.q = z();
        }
        if (size != 0) {
            if (z) {
                this.i.get(0).f1495b.e(false);
                return;
            }
            return;
        }
        dismiss();
        i.a aVar = this.x;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.y.removeGlobalOnLayoutListener(this.j);
            }
            this.y = null;
        }
        this.p.removeOnAttachStateChangeListener(this.f1487k);
        this.z.onDismiss();
    }

    @Override // defpackage.hbm
    public void dismiss() {
        int size = this.i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.i.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.f1494a.isShowing()) {
                    dVar.f1494a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(i.a aVar) {
        this.x = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g(k kVar) {
        for (d dVar : this.i) {
            if (kVar == dVar.f1495b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!kVar.hasVisibleItems()) {
            return false;
        }
        h(kVar);
        i.a aVar = this.x;
        if (aVar != null) {
            aVar.c(kVar);
        }
        return true;
    }

    @Override // defpackage.oqf
    public void h(e eVar) {
        eVar.c(this, this.f1486b);
        if (isShowing()) {
            B(eVar);
        } else {
            this.h.add(eVar);
        }
    }

    @Override // defpackage.oqf
    public boolean i() {
        return false;
    }

    @Override // defpackage.hbm
    public boolean isShowing() {
        return this.i.size() > 0 && this.i.get(0).f1494a.isShowing();
    }

    @Override // defpackage.oqf
    public void l(View view) {
        if (this.o != view) {
            this.o = view;
            this.n = p3b.b(this.m, androidx.core.view.c.A(view));
        }
    }

    @Override // defpackage.hbm
    public ListView m() {
        if (this.i.isEmpty()) {
            return null;
        }
        List<d> list = this.i;
        return list.get(list.size() - 1).a();
    }

    @Override // defpackage.oqf
    public void o(boolean z) {
        this.v = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.i.get(i);
            if (!dVar.f1494a.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.f1495b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // defpackage.oqf
    public void p(int i) {
        if (this.m != i) {
            this.m = i;
            this.n = p3b.b(i, androidx.core.view.c.A(this.o));
        }
    }

    @Override // defpackage.oqf
    public void q(int i) {
        this.f1488r = true;
        this.t = i;
    }

    @Override // defpackage.oqf
    public void r(boolean z) {
        this.w = z;
    }

    @Override // defpackage.oqf
    public void s(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // defpackage.oqf
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.i
    public void updateMenuView(boolean z) {
        Iterator<d> it = this.i.iterator();
        while (it.hasNext()) {
            oqf.u(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    public final MenuPopupWindow v() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f1486b, null, this.d, this.e);
        menuPopupWindow.O(this.l);
        menuPopupWindow.setOnItemClickListener(this);
        menuPopupWindow.setOnDismissListener(this);
        menuPopupWindow.A(this.o);
        menuPopupWindow.D(this.n);
        menuPopupWindow.G(true);
        menuPopupWindow.F(2);
        return menuPopupWindow;
    }

    public final int w(e eVar) {
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            if (eVar == this.i.get(i).f1495b) {
                return i;
            }
        }
        return -1;
    }

    public final MenuItem x(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View y(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemX = x(dVar.f1495b, eVar);
        if (menuItemX == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            if (menuItemX == dVar2.getItem(i)) {
                break;
            }
            i++;
        }
        if (i != -1 && (firstVisiblePosition = (i + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int z() {
        return androidx.core.view.c.A(this.o) == 1 ? 0 : 1;
    }
}
