package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f4764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4765b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f4768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4769f;

    public g(h hVar, LayoutInflater layoutInflater, boolean z14, int i14) {
        this.f4767d = z14;
        this.f4768e = layoutInflater;
        this.f4764a = hVar;
        this.f4769f = i14;
        a();
    }

    public final void a() {
        h hVar = this.f4764a;
        j expandedItem = hVar.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<j> nonActionItems = hVar.getNonActionItems();
            int size = nonActionItems.size();
            for (int i14 = 0; i14 < size; i14++) {
                if (nonActionItems.get(i14) == expandedItem) {
                    this.f4765b = i14;
                    return;
                }
            }
        }
        this.f4765b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final j getItem(int i14) {
        boolean z14 = this.f4767d;
        h hVar = this.f4764a;
        ArrayList<j> nonActionItems = z14 ? hVar.getNonActionItems() : hVar.getVisibleItems();
        int i15 = this.f4765b;
        if (i15 >= 0 && i14 >= i15) {
            i14++;
        }
        return nonActionItems.get(i14);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean z14 = this.f4767d;
        h hVar = this.f4764a;
        ArrayList<j> nonActionItems = z14 ? hVar.getNonActionItems() : hVar.getVisibleItems();
        return this.f4765b < 0 ? nonActionItems.size() : nonActionItems.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i14) {
        return i14;
    }

    @Override // android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        if (view2 == null) {
            view2 = this.f4768e.inflate(this.f4769f, viewGroup, false);
        }
        int i15 = getItem(i14).f4774b;
        int i16 = i14 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view2;
        listMenuItemView.setGroupDividerEnabled(this.f4764a.isGroupDividerEnabled() && i15 != (i16 >= 0 ? getItem(i16).f4774b : i15));
        o.a aVar = (o.a) view2;
        if (this.f4766c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.initialize(getItem(i14), 0);
        return view2;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
