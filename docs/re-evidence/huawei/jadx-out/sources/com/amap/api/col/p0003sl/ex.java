package com.amap.api.col.p0003sl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.huawei.health.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class ex extends BaseExpandableListAdapter implements ExpandableListView.OnGroupCollapseListener, ExpandableListView.OnGroupExpandListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f2485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f2486c;
    private fc d;
    private fe f;
    private OfflineMapManager g;
    private List<OfflineMapProvince> e = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<OfflineMapProvince> f2484a = new ArrayList();

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
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public ex(Context context, fe feVar, OfflineMapManager offlineMapManager, List<OfflineMapProvince> list) {
        this.f2486c = context;
        this.f = feVar;
        this.g = offlineMapManager;
        if (list != null && list.size() > 0) {
            this.e.clear();
            this.e.addAll(list);
            for (OfflineMapProvince offlineMapProvince : this.e) {
                if (offlineMapProvince != null && offlineMapProvince.getDownloadedCityList().size() > 0) {
                    this.f2484a.add(offlineMapProvince);
                }
            }
        }
        this.f2485b = new boolean[this.f2484a.size()];
    }

    public final void a() {
        for (OfflineMapProvince offlineMapProvince : this.e) {
            if (offlineMapProvince.getDownloadedCityList().size() > 0 && !this.f2484a.contains(offlineMapProvince)) {
                this.f2484a.add(offlineMapProvince);
            }
        }
        this.f2485b = new boolean[this.f2484a.size()];
        notifyDataSetChanged();
    }

    public final void b() {
        try {
            for (int size = this.f2484a.size(); size > 0; size--) {
                OfflineMapProvince offlineMapProvince = this.f2484a.get(size - 1);
                if (offlineMapProvince.getDownloadedCityList().size() == 0) {
                    this.f2484a.remove(offlineMapProvince);
                }
            }
            this.f2485b = new boolean[this.f2484a.size()];
            notifyDataSetChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        return this.f2484a.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        return this.f2484a.get(i).getDownloadedCityList().size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i) {
        return this.f2484a.get(i).getProvinceName();
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i, int i2) {
        return this.f2484a.get(i).getDownloadedCityList().get(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = (RelativeLayout) fg.a(this.f2486c, R.plurals._2130903043_res_0x7f030003);
        }
        TextView textView = (TextView) view.findViewById(R.layout.abc_list_menu_item_radio);
        ImageView imageView = (ImageView) view.findViewById(R.layout.abc_popup_menu_header_item_layout);
        textView.setText(this.f2484a.get(i).getProvinceName());
        if (this.f2485b[i]) {
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
            fc fcVar = new fc(this.f2486c, this.g);
            this.d = fcVar;
            fcVar.a(2);
            view = this.d.a();
            aVar.f2489a = this.d;
            view.setTag(aVar);
        }
        OfflineMapProvince offlineMapProvince = this.f2484a.get(i);
        if (i2 < offlineMapProvince.getDownloadedCityList().size()) {
            final OfflineMapCity offlineMapCity = offlineMapProvince.getDownloadedCityList().get(i2);
            aVar.f2489a.a(offlineMapCity);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.amap.api.col.3sl.ex.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ex.this.f.a(offlineMapCity);
                }
            });
        }
        return view;
    }

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public fc f2489a;

        public a() {
        }
    }

    @Override // android.widget.ExpandableListView.OnGroupCollapseListener
    public final void onGroupCollapse(int i) {
        this.f2485b[i] = false;
    }

    @Override // android.widget.ExpandableListView.OnGroupExpandListener
    public final void onGroupExpand(int i) {
        this.f2485b[i] = true;
    }
}
