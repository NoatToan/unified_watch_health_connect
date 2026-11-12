package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f1500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1501b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.f1500a = eVar;
        this.f = i;
        a();
    }

    public void a() {
        g gVarX = this.f1500a.x();
        if (gVarX != null) {
            ArrayList<g> arrayListB = this.f1500a.B();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                if (arrayListB.get(i) == gVarX) {
                    this.f1501b = i;
                    return;
                }
            }
        }
        this.f1501b = -1;
    }

    public e b() {
        return this.f1500a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i) {
        ArrayList<g> arrayListB = this.d ? this.f1500a.B() : this.f1500a.G();
        int i2 = this.f1501b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayListB.get(i);
    }

    public void d(boolean z) {
        this.c = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> arrayListB = this.d ? this.f1500a.B() : this.f1500a.G();
        return this.f1501b < 0 ? arrayListB.size() : arrayListB.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1500a.H() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        MenuView.ItemView itemView = (MenuView.ItemView) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.e(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
