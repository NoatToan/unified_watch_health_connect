package com.amap.api.col.p0003sl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.huawei.health.R;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class ey extends BaseExpandableListAdapter implements ExpandableListView.OnGroupCollapseListener, ExpandableListView.OnGroupExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean[] f2491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2492b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<OfflineMapProvince> f2493c;
    private OfflineMapManager d;
    private Context e;

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i, int i2) {
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public ey(List<OfflineMapProvince> list, OfflineMapManager offlineMapManager, Context context) {
        this.f2493c = list;
        this.d = offlineMapManager;
        this.e = context;
        this.f2491a = new boolean[list.size()];
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        int i = this.f2492b;
        return i == -1 ? this.f2493c.size() : i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i) {
        return this.f2493c.get(i).getProvinceName();
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        if (a(i)) {
            return this.f2493c.get(i).getCityList().size();
        }
        return this.f2493c.get(i).getCityList().size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = (RelativeLayout) fg.a(this.e, R.plurals._2130903043_res_0x7f030003);
        }
        TextView textView = (TextView) view.findViewById(R.layout.abc_list_menu_item_radio);
        ImageView imageView = (ImageView) view.findViewById(R.layout.abc_popup_menu_header_item_layout);
        textView.setText(this.f2493c.get(i).getProvinceName());
        if (this.f2491a[i]) {
            imageView.setImageDrawable(fg.a().getDrawable(R.string._2130837509_res_0x7f020005));
            return view;
        }
        imageView.setImageDrawable(fg.a().getDrawable(R.string._2130837510_res_0x7f020006));
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        a aVar;
        if (view != null) {
            aVar = (a) view.getTag();
        } else {
            aVar = new a();
            fc fcVar = new fc(this.e, this.d);
            fcVar.a(1);
            View viewA = fcVar.a();
            aVar.f2494a = fcVar;
            viewA.setTag(aVar);
            view = viewA;
        }
        aVar.f2494a.a(this.f2493c.get(i).getCityList().get(i2));
        return view;
    }

    private boolean a(int i) {
        return (i == 0 || i == getGroupCount() - 1) ? false : true;
    }

    public final void a() {
        this.f2492b = -1;
        notifyDataSetChanged();
    }

    public final void b() {
        this.f2492b = 0;
        notifyDataSetChanged();
    }

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public fc f2494a;

        public a() {
        }
    }

    @Override // android.widget.ExpandableListView.OnGroupCollapseListener
    public final void onGroupCollapse(int i) {
        this.f2491a[i] = false;
    }

    @Override // android.widget.ExpandableListView.OnGroupExpandListener
    public final void onGroupExpand(int i) {
        this.f2491a[i] = true;
    }
}
