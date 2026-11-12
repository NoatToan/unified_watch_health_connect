package com.amap.api.col.p0003sl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapActivity;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.huawei.health.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class ez extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<OfflineMapCity> f2496a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OfflineMapManager f2497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f2498c;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public ez(OfflineMapManager offlineMapManager, OfflineMapActivity offlineMapActivity) {
        this.f2497b = offlineMapManager;
        this.f2498c = offlineMapActivity;
    }

    public final void a(List<OfflineMapCity> list) {
        this.f2496a = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2496a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f2496a.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        final a aVar;
        try {
            final OfflineMapCity offlineMapCity = this.f2496a.get(i);
            if (view == null) {
                aVar = new a();
                view = fg.a(this.f2498c, R.plurals._2130903042_res_0x7f030002);
                aVar.f2502a = (TextView) view.findViewById(R.layout.abc_cascading_menu_item_layout);
                aVar.f2503b = (TextView) view.findViewById(R.layout.abc_list_menu_item_icon);
                aVar.f2504c = (TextView) view.findViewById(R.layout.abc_expanded_menu_layout);
                aVar.d = (ImageView) view.findViewById(R.layout.abc_list_menu_item_checkbox);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            aVar.d.setOnClickListener(new View.OnClickListener() { // from class: com.amap.api.col.3sl.ez.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    aVar.d.setVisibility(8);
                    aVar.f2504c.setVisibility(0);
                    aVar.f2504c.setText("下载中");
                    try {
                        ez.this.f2497b.downloadByCityName(offlineMapCity.getCity());
                    } catch (AMapException e) {
                        e.printStackTrace();
                    }
                }
            });
            aVar.f2504c.setVisibility(0);
            aVar.f2502a.setText(offlineMapCity.getCity());
            double size = ((double) ((int) (((offlineMapCity.getSize() / 1024.0d) / 1024.0d) * 100.0d))) / 100.0d;
            aVar.f2503b.setText(String.valueOf(size) + " M");
            int state = offlineMapCity.getState();
            if (state != -1) {
                if (state == 0 || state == 1) {
                    aVar.d.setVisibility(8);
                    aVar.f2504c.setText("下载中");
                    return view;
                }
                if (state == 2) {
                    aVar.d.setVisibility(8);
                    aVar.f2504c.setText("等待下载");
                    return view;
                }
                if (state == 3) {
                    aVar.d.setVisibility(8);
                    aVar.f2504c.setText("暂停中");
                    return view;
                }
                if (state == 4) {
                    aVar.d.setVisibility(8);
                    aVar.f2504c.setText("已下载");
                    return view;
                }
                if (state != 6) {
                    switch (state) {
                    }
                    return view;
                }
                aVar.d.setVisibility(0);
                aVar.f2504c.setVisibility(8);
                return view;
            }
            aVar.d.setVisibility(8);
            aVar.f2504c.setText("下载失败");
            return view;
        } catch (Exception e) {
            e.printStackTrace();
            return view;
        }
    }

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f2502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f2503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f2504c;
        public ImageView d;

        public a() {
        }
    }
}
