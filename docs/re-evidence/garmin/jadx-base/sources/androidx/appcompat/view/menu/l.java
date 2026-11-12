package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements q, n, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f4810a;

    public static int c(ListAdapter listAdapter, Context context, int i14) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i15 = 0;
        int i16 = 0;
        FrameLayout frameLayout = null;
        View view2 = null;
        for (int i17 = 0; i17 < count; i17++) {
            int itemViewType = listAdapter.getItemViewType(i17);
            if (itemViewType != i16) {
                view2 = null;
                i16 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view2 = listAdapter.getView(i17, view2, frameLayout);
            view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view2.getMeasuredWidth();
            if (measuredWidth >= i14) {
                return i14;
            }
            if (measuredWidth > i15) {
                i15 = measuredWidth;
            }
        }
        return i15;
    }

    public abstract void b(h hVar);

    @Override // androidx.appcompat.view.menu.n
    public final boolean collapseItemActionView(h hVar, j jVar) {
        return false;
    }

    public abstract void d(View view2);

    @Override // androidx.appcompat.view.menu.n
    public final boolean expandItemActionView(h hVar, j jVar) {
        return false;
    }

    public abstract void f(boolean z14);

    public abstract void g(int i14);

    @Override // androidx.appcompat.view.menu.n
    public final int getId() {
        return 0;
    }

    public abstract void h(int i14);

    public abstract void i(PopupWindow.OnDismissListener onDismissListener);

    @Override // androidx.appcompat.view.menu.n
    public final void initForMenu(Context context, h hVar) {
    }

    public abstract void j(boolean z14);

    public abstract void k(int i14);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view2, int i14, long j8) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (g) listAdapter).f4764a.performItemAction((MenuItem) listAdapter.getItem(i14), this, !(this instanceof d) ? 0 : 4);
    }
}
