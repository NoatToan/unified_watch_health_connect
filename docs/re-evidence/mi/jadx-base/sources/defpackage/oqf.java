package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class oqf implements hbm, i, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f29387a;

    public static int k(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean t(e eVar) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static d u(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (d) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void e(Context context, e eVar) {
    }

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return 0;
    }

    public abstract void h(e eVar);

    public boolean i() {
        return true;
    }

    public Rect j() {
        return this.f29387a;
    }

    public abstract void l(View view);

    public void n(Rect rect) {
        this.f29387a = rect;
    }

    public abstract void o(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        u(listAdapter).f1500a.O((MenuItem) listAdapter.getItem(i), this, i() ? 0 : 4);
    }

    public abstract void p(int i);

    public abstract void q(int i);

    public abstract void r(boolean z);

    public abstract void s(int i);

    public abstract void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener);
}
