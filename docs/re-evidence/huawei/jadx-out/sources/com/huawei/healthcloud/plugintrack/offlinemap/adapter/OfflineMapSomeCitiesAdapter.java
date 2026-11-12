package com.huawei.healthcloud.plugintrack.offlinemap.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.offlinemap.ui.activity.OfflineMapTabActivity;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jce;
import defpackage.jcf;
import defpackage.njy;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class OfflineMapSomeCitiesAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<OfflineMapCity> f10505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f10506b;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public OfflineMapSomeCitiesAdapter(Activity activity, List<OfflineMapCity> list) {
        this.f10505a = new ArrayList(10);
        if (activity != null) {
            this.f10506b = activity;
        }
        if (list != null) {
            this.f10505a = list;
        }
    }

    public void c(List<OfflineMapCity> list) {
        this.f10505a = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<OfflineMapCity> list = this.f10505a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (njy.c(this.f10505a, i)) {
            return this.f10505a.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        jcf jcfVar;
        if (view == null) {
            view = RelativeLayout.inflate(this.f10506b, R.layout.track_offlinemap_child_some, null);
            jcfVar = new jcf(view);
        } else {
            jcfVar = (jcf) view.getTag();
        }
        jcfVar.e(this.f10505a, i);
        if (njy.c(this.f10505a, i)) {
            OfflineMapCity offlineMapCity = this.f10505a.get(i);
            int state = offlineMapCity.getState();
            int i2 = offlineMapCity.getcompleteCode();
            String city = offlineMapCity.getCity();
            String str = String.format(a(R.string.IDS_motiontrack_offlinemap_city_size), new DecimalFormat("0.0").format(offlineMapCity.getSize() / 1048576.0f));
            jcfVar.e().setText(city);
            jcfVar.b().setText(str);
            jcfVar.a().setIdleText(a(R.string.IDS_motiontrack_offlinemap_download_start));
            LogUtil.d("OfflineMapSomeCitiesAdapter", "getView() city:", city, "formatSize:", str, ",state:", Integer.valueOf(state), ",progress:", Integer.valueOf(i2));
            jcfVar.a().setVisibility(8);
            jcfVar.e(this.f10506b, state, i2);
            if (this.f10506b instanceof OfflineMapTabActivity) {
                jcfVar.a().setOnClickListener(new jce(this.f10506b, state, city));
            }
        }
        return view;
    }

    private String a(int i) {
        return this.f10506b.getResources().getString(i);
    }
}
