package com.huawei.healthcloud.plugintrack.offlinemap.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.offlinemap.ui.activity.OfflineMapTabActivity;
import com.huawei.healthcloud.plugintrack.offlinemap.ui.view.CityListBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.jce;
import defpackage.jcf;
import defpackage.njy;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class OfflineMapAllCitiesAdapter extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<OfflineMapProvince> f10501a;
    private Activity d;
    private HashMap<Integer, CityListBean> e;

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public OfflineMapAllCitiesAdapter(Activity activity, ArrayList<OfflineMapProvince> arrayList, HashMap<Integer, CityListBean> map) {
        this.f10501a = new ArrayList<>(10);
        this.e = new HashMap<>(10);
        if (activity != null) {
            this.d = activity;
        }
        if (arrayList != null) {
            this.f10501a = arrayList;
        }
        if (map != null) {
            this.e = map;
        }
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getChild(int i, int i2) {
        if (i < 0 || i >= this.e.size() || !njy.b(this.e.get(Integer.valueOf(i))) || !njy.c(this.e.get(Integer.valueOf(i)), i2) || this.e.get(Integer.valueOf(i)).get(i2) == null) {
            return null;
        }
        return this.e.get(Integer.valueOf(i)).get(i2).getCity();
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        jcf jcfVar;
        OfflineMapCity offlineMapCity = null;
        if (view == null) {
            view = RelativeLayout.inflate(this.d, R.layout.track_offlinemap_child, null);
            jcfVar = new jcf(view);
        } else {
            jcfVar = (jcf) view.getTag();
        }
        if (i >= 0 && i < this.e.size() && this.e.get(Integer.valueOf(i)) != null && i2 >= 0 && i2 < this.e.get(Integer.valueOf(i)).size()) {
            offlineMapCity = this.e.get(Integer.valueOf(i)).get(i2);
        }
        jcfVar.c(this.e.get(Integer.valueOf(i)), i2);
        if (offlineMapCity != null) {
            int state = offlineMapCity.getState();
            int i3 = offlineMapCity.getcompleteCode();
            String city = offlineMapCity.getCity();
            String str = String.format(e(R.string.IDS_motiontrack_offlinemap_city_size), new DecimalFormat("0.0").format(offlineMapCity.getSize() / 1048576.0f));
            jcfVar.e().setText(city);
            jcfVar.b().setText(str);
            jcfVar.a().setIdleText(e(R.string.IDS_motiontrack_offlinemap_download_start));
            LogUtil.d("OfflineMapAllCitiesAdapter", "getView() city:", city, "formatSize:", str, ",state:", Integer.valueOf(state), ",progress:", Integer.valueOf(i3));
            jcfVar.a().setVisibility(8);
            jcfVar.e(this.d, state, i3);
            if (this.d instanceof OfflineMapTabActivity) {
                jcfVar.a().setOnClickListener(new jce(this.d, state, city));
            }
        }
        return view;
    }

    private String e(int i) {
        return this.d.getResources().getString(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        if (i < 0 || i >= this.e.size() || this.e.get(Integer.valueOf(i)) == null) {
            return 0;
        }
        return this.e.get(Integer.valueOf(i)).size();
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getGroup(int i) {
        if (njy.c(this.f10501a, i)) {
            return this.f10501a.get(i).getProvinceName();
        }
        return null;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getGroupType(int i) {
        return super.getGroupType(i);
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getGroupTypeCount() {
        return super.getGroupTypeCount();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.f10501a.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        View viewInflate;
        d dVar;
        if (view == null) {
            dVar = new d();
            viewInflate = RelativeLayout.inflate(this.d, R.layout.track_offlinemap_group, null);
            dVar.f10504c = (HealthTextView) viewInflate.findViewById(R.id.group_text);
            dVar.f10502a = (ImageView) viewInflate.findViewById(R.id.group_image);
            dVar.f10503b = (HealthDivider) viewInflate.findViewById(R.id.offline_group_view);
            dVar.e = (HealthTextView) viewInflate.findViewById(R.id.group_support);
            viewInflate.setTag(dVar);
        } else {
            viewInflate = view;
            dVar = (d) view.getTag();
        }
        if (njy.c(this.f10501a, i)) {
            dVar.f10504c.setText(this.f10501a.get(i).getProvinceName());
            if (i == this.f10501a.size() - 1) {
                dVar.f10503b.setVisibility(8);
            } else {
                dVar.f10503b.setVisibility(0);
            }
        }
        if ("台湾省".equals(this.f10501a.get(i).getProvinceName())) {
            dVar.e.setVisibility(0);
            dVar.f10502a.setVisibility(8);
            return viewInflate;
        }
        dVar.e.setVisibility(8);
        dVar.f10502a.setVisibility(0);
        if (z) {
            dVar.f10502a.setImageResource(R.drawable.ic_health_list_drop_down_arrow_sel);
            return viewInflate;
        }
        dVar.f10502a.setImageResource(R.drawable.ic_health_list_drop_down_arrow_nor);
        return viewInflate;
    }

    public void b(HashMap<Integer, CityListBean> map, ArrayList<OfflineMapProvince> arrayList) {
        this.e = map;
        this.f10501a = arrayList;
        notifyDataSetChanged();
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f10502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthDivider f10503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f10504c;
        private HealthTextView e;

        private d() {
        }
    }
}
