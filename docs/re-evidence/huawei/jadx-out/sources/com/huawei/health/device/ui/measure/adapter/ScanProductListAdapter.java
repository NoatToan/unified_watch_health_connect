package com.huawei.health.device.ui.measure.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class ScanProductListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f6380c;
    private ArrayList<HealthDevice> d;
    private String e;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public ScanProductListAdapter(ArrayList<HealthDevice> arrayList, Context context, String str) {
        this.d = null;
        if (context != null) {
            this.f6380c = LayoutInflater.from(context);
            this.d = arrayList;
            this.e = str;
        }
    }

    public void a(ArrayList<HealthDevice> arrayList) {
        this.d = arrayList;
        LogUtil.a("PluginDevice_ScanProductListAdapter", "ScanProductListAdapter porduct size is ", Integer.valueOf(arrayList.size()));
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        ArrayList<HealthDevice> arrayList = this.d;
        if (arrayList == null || i >= arrayList.size()) {
            return null;
        }
        return this.d.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (viewGroup == null) {
            LogUtil.j("R_Weight_PluginDevice_ScanProductListAdapter", "ProductListAdapter getView parent viewGroup is null");
        }
        if (njy.e(this.d, i)) {
            return view;
        }
        HealthDevice healthDevice = this.d.get(i);
        b bVar = null;
        if (view == null) {
            view = this.f6380c.inflate(R.layout.device_search_item_layout, (ViewGroup) null);
            bVar = new b();
            bVar.f6381a = (HealthTextView) view.findViewById(R.id.item_device_name);
            bVar.e = view.findViewById(R.id.item_device_line);
            view.setTag(bVar);
        } else if (view.getTag() instanceof b) {
            bVar = (b) view.getTag();
        }
        if (bVar != null) {
            bVar.e.setVisibility(0);
            if (ResourceManager.c().d(this.e) == null) {
                if (healthDevice.getDeviceName() == null || healthDevice.getDeviceName().length() <= 10) {
                    bVar.f6381a.setText("unknown");
                    return view;
                }
                bVar.f6381a.setText(healthDevice.getDeviceName());
                return view;
            }
            bVar.f6381a.setText(this.d.get(i).getDeviceName());
        }
        return view;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f6381a;
        private View e;
    }
}
