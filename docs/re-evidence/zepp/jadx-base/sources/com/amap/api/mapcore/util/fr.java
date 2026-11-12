package com.amap.api.mapcore.util;

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
import com.huami.watch.hmwatchmanager.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fr extends BaseExpandableListAdapter implements ExpandableListView.OnGroupCollapseListener, ExpandableListView.OnGroupExpandListener {
    private boolean[] a;
    private int b = -1;
    private List<OfflineMapProvince> c;
    private OfflineMapManager d;
    private Context e;

    public final class a {
        public fv a;

        public a() {
        }
    }

    public fr(List<OfflineMapProvince> list, OfflineMapManager offlineMapManager, Context context) {
        this.c = null;
        this.c = list;
        this.d = offlineMapManager;
        this.e = context;
        this.a = new boolean[list.size()];
    }

    public final void a() {
        this.b = -1;
        notifyDataSetChanged();
    }

    public final void b() {
        this.b = 0;
        notifyDataSetChanged();
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i, int i2) {
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        a aVar;
        if (view != null) {
            aVar = (a) view.getTag();
        } else {
            aVar = new a();
            fv fvVar = new fv(this.e, this.d);
            fvVar.a(1);
            View viewA = fvVar.a();
            aVar.a = fvVar;
            viewA.setTag(aVar);
            view = viewA;
        }
        aVar.a.a(this.c.get(i).getCityList().get(i2));
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        return (i == 0 || i == getGroupCount() - 1) ? false : true ? this.c.get(i).getCityList().size() : this.c.get(i).getCityList().size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i) {
        return this.c.get(i).getProvinceName();
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        int i = this.b;
        return i == -1 ? this.c.size() : i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = (RelativeLayout) fz.a(this.e, R.array.amazfit_wear_type);
        }
        TextView textView = (TextView) view.findViewById(R.dimen.abc_alert_dialog_button_bar_height);
        ImageView imageView = (ImageView) view.findViewById(R.dimen.abc_alert_dialog_button_dimen);
        textView.setText(this.c.get(i).getProvinceName());
        if (this.a[i]) {
            imageView.setImageDrawable(fz.a().getDrawable(R.animator.fragment_close_exit));
        } else {
            imageView.setImageDrawable(fz.a().getDrawable(R.animator.fragment_fade_enter));
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    @Override // android.widget.ExpandableListView.OnGroupCollapseListener
    public final void onGroupCollapse(int i) {
        this.a[i] = false;
    }

    @Override // android.widget.ExpandableListView.OnGroupExpandListener
    public final void onGroupExpand(int i) {
        this.a[i] = true;
    }
}
