package com.huawei.health.device.ui.measure.adapter;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class WifiListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<ScanResult> f6407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6408c;
    private Context e;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public WifiListAdapter(Context context, List<ScanResult> list) {
        new ArrayList(16);
        this.f6408c = -1;
        this.e = context;
        this.f6407b = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f6407b.size() > 0) {
            return this.f6407b.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (this.f6407b.size() <= 0 || i >= this.f6407b.size()) {
            return null;
        }
        return this.f6407b.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        e eVar = null;
        if (view == null) {
            e eVar2 = new e();
            View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.wifi_list_item_layout, (ViewGroup) null);
            eVar2.e = (HealthTextView) viewInflate.findViewById(R.id.wifi_name);
            eVar2.d = (HealthRadioButton) viewInflate.findViewById(R.id.wifi_check_img);
            eVar2.f6409b = (HealthDivider) viewInflate.findViewById(R.id.wifi_name_divider_line);
            eVar2.d.setClickable(false);
            viewInflate.setTag(eVar2);
            eVar = eVar2;
            view = viewInflate;
        } else {
            Object tag = view.getTag();
            if (tag instanceof e) {
                eVar = (e) tag;
            }
        }
        if (eVar == null) {
            LogUtil.j("WifiListAdapter", "viewHolder is null");
            return view;
        }
        eVar.e.setText(this.f6407b.get(i).SSID);
        if (this.f6408c == i) {
            eVar.d.setChecked(true);
        } else {
            eVar.d.setChecked(false);
        }
        if (i == this.f6407b.size() - 1) {
            eVar.f6409b.setVisibility(8);
            return view;
        }
        eVar.f6409b.setVisibility(0);
        return view;
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthDivider f6409b;
        private HealthRadioButton d;
        private HealthTextView e;

        e() {
        }
    }

    public void e(int i) {
        this.f6408c = i;
    }
}
