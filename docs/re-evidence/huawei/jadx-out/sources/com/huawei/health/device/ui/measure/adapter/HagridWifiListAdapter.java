package com.huawei.health.device.ui.measure.adapter;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ecs;
import defpackage.njy;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class HagridWifiListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6376a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f6378c;
    private Context e;
    private List<ScanResult> j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6377b = false;
    private boolean d = true;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public HagridWifiListAdapter(Context context, List<ScanResult> list) {
        this.e = context;
        this.j = list;
        this.f6378c = LayoutInflater.from(context);
    }

    public void c(boolean z) {
        this.f6377b = z;
    }

    public void e(String str) {
        this.f6376a = str;
    }

    public void a(boolean z) {
        this.d = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (njy.b(this.j)) {
            return this.j.size();
        }
        LogUtil.j("HagridWifiListAdapter", "getCount wifi list is null");
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (njy.c(this.j, i)) {
            return this.j.get(i);
        }
        LogUtil.j("HagridWifiListAdapter", "getItem wifi list is null or position is out of bounds.");
        return null;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        c cVar = null;
        if (view == null) {
            c cVar2 = new c();
            View viewInflate = this.f6378c.inflate(R.layout.hygride_wifi_info_list_item_layout, (ViewGroup) null);
            cVar2.d = (HealthTextView) viewInflate.findViewById(R.id.wifi_item_name_text);
            cVar2.f6379b = (HealthTextView) viewInflate.findViewById(R.id.wifi_item_tip);
            cVar2.e = (ImageView) viewInflate.findViewById(R.id.wifi_signal_strength);
            viewInflate.setTag(cVar2);
            cVar = cVar2;
            view = viewInflate;
        } else {
            Object tag = view.getTag();
            if (tag instanceof c) {
                cVar = (c) tag;
            }
        }
        if (njy.c(this.j, i) && this.j.get(i) != null) {
            cVar.d.setText(this.j.get(i).SSID);
            cVar.d.setTextColor(this.e.getResources().getColor(R.color.textColorPrimary));
            if (this.j.get(i).SSID.equals(ecs.c(ecs.a(this.e))) && ecs.j(this.e)) {
                if (this.j.get(i).SSID.equals(this.f6376a)) {
                    cVar.f6379b.setText(R.string.IDS_device_rope_device_connected);
                } else {
                    cVar.f6379b.setText(R.string.IDS_device_wifi_current);
                }
                if (this.d) {
                    cVar.d.setTextColor(this.e.getResources().getColor(R.color.colorAccent));
                }
            } else if (ecs.a(this.j.get(i))) {
                if (!ecs.d(this.j.get(i))) {
                    cVar.f6379b.setText(R.string.IDS_device_wifi_encrypt);
                } else {
                    cVar.f6379b.setText(R.string.IDS_device_wifi_open);
                }
                if (this.f6377b) {
                    cVar.f6379b.setText(R.string.IDS_device_wifi_save);
                }
                cVar.f6379b.setTextColor(this.e.getResources().getColor(R.color.textColorSecondary));
            } else {
                cVar.f6379b.setText(R.string.IDS_device_wifi_5g);
                cVar.f6379b.setTextColor(this.e.getResources().getColor(R.color.emui_color_gray_4));
                cVar.d.setTextColor(this.e.getResources().getColor(R.color.emui_color_gray_4));
            }
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                cVar.d.setTextDirection(4);
            }
        }
        return e(cVar, view);
    }

    private View e(c cVar, View view) {
        if (cVar == null) {
            LogUtil.j("HagridWifiListAdapter", "viewHolder is null");
            return view;
        }
        cVar.e.setBackgroundResource(R.drawable.ic_wifi);
        return view;
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f6379b;
        private HealthTextView d;
        private ImageView e;

        c() {
        }
    }
}
