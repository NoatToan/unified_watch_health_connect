package com.huawei.health.device.ui.measure.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dwe;
import defpackage.njy;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class HagridDeviceManagerAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<dwe> f6371b = new ArrayList(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f6372c;
    private LayoutInflater e;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public HagridDeviceManagerAdapter(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("HonourDeviceSettingListAdapter", "HonourDeviceSettingListAdapter context or productId is null");
            return;
        }
        this.f6372c = context;
        this.e = LayoutInflater.from(context);
        this.f6370a = str;
    }

    public void e(List<dwe> list) {
        List<dwe> list2 = this.f6371b;
        if (list2 != null) {
            list2.clear();
            this.f6371b.addAll(list);
            notifyDataSetChanged();
        }
    }

    public void c(dwe dweVar) {
        if (dweVar == null) {
            LogUtil.j("HonourDeviceSettingListAdapter", "refreshItem() item is null.");
            return;
        }
        for (dwe dweVar2 : this.f6371b) {
            if (dweVar2.e() == dweVar.e()) {
                LogUtil.a("HonourDeviceSettingListAdapter", "itemId:", Integer.valueOf(dweVar.e()));
                dweVar2.e(dweVar.d());
                dweVar2.e(dweVar.f());
                dweVar2.a(dweVar.b());
                dweVar2.c(dweVar.a());
                dweVar2.b(dweVar.c());
                dweVar2.c(dweVar.i());
                dweVar2.a(dweVar.g());
            }
        }
        notifyDataSetChanged();
    }

    public boolean d(int i, dwe dweVar) {
        boolean z = false;
        if (dweVar == null) {
            LogUtil.j("HonourDeviceSettingListAdapter", "replaceItem() item is null.");
            return false;
        }
        for (dwe dweVar2 : this.f6371b) {
            if (i == dweVar2.e()) {
                LogUtil.a("HonourDeviceSettingListAdapter", "itemId:", Integer.valueOf(dweVar2.e()));
                dweVar2.d(dweVar.e());
                dweVar2.e(dweVar.d());
                dweVar2.e(dweVar.f());
                dweVar2.a(dweVar.b());
                dweVar2.c(dweVar.a());
                dweVar2.b(dweVar.c());
                dweVar2.c(dweVar.i());
                dweVar2.a(dweVar.g());
                z = true;
                break;
            }
        }
        notifyDataSetChanged();
        return z;
    }

    public void d(int i) {
        for (dwe dweVar : this.f6371b) {
            if (i == dweVar.e()) {
                dweVar.a(false);
                break;
            }
        }
        notifyDataSetChanged();
    }

    public void c(int i, dwe dweVar) {
        Iterator<dwe> it = this.f6371b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (i == it.next().e()) {
                this.f6371b.set(i2, dweVar);
                break;
            }
            i2++;
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<dwe> list = this.f6371b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public dwe getItem(int i) {
        if (njy.e(this.f6371b) || i >= this.f6371b.size()) {
            return null;
        }
        return this.f6371b.get(i);
    }

    public dwe a(int i) {
        for (dwe dweVar : this.f6371b) {
            if (i == dweVar.e()) {
                return dweVar;
            }
        }
        return null;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        c cVar = null;
        if (view == null) {
            view = this.e.inflate(R.layout.item_hagrid_device_manager, (ViewGroup) null);
            cVar = new c();
            cVar.e = (HealthTextView) view.findViewById(R.id.weight_clock_text);
            cVar.f6373a = (HealthTextView) view.findViewById(R.id.text_sub_content);
            cVar.h = (HealthTextView) qsp.a(view, R.id.right_text);
            cVar.d = (ImageView) qsp.a(view, R.id.settings_switch);
            cVar.f6375c = qsp.a(view, R.id.item_layout);
            cVar.f6374b = (ImageView) qsp.a(view, R.id.red_point_img_tips);
            view.setTag(cVar);
        } else {
            Object tag = view.getTag();
            if (tag instanceof c) {
                cVar = (c) tag;
            }
        }
        dwe item = getItem(i);
        if (item != null && cVar != null) {
            if (!item.g()) {
                cVar.f6375c.setVisibility(8);
                return view;
            }
            if (item.e() == 0 || item.e() == 17) {
                cVar.f6375c.setVisibility(8);
                return view;
            }
            if (item.e() == 16) {
                cVar.f6375c.setVisibility(8);
                return view;
            }
            c(i, cVar, item);
            return view;
        }
        LogUtil.j("HonourDeviceSettingListAdapter", "item = null or holder = null");
        return view;
    }

    private void c(int i, c cVar, dwe dweVar) {
        if (cVar == null || dweVar == null) {
            LogUtil.j("HonourDeviceSettingListAdapter", "getViewDefault holder or item is null");
            return;
        }
        cVar.f6375c.setVisibility(0);
        if (TextUtils.isEmpty(dweVar.c())) {
            cVar.h.setVisibility(8);
        } else {
            cVar.h.setVisibility(0);
            cVar.h.setText(dweVar.c());
        }
        cVar.e.setText(dweVar.d());
        if (!TextUtils.isEmpty(dweVar.i()) && !"6d5416d9-2167-41df-ab10-c492e152b44f".equals(this.f6370a)) {
            cVar.f6373a.setVisibility(0);
            cVar.f6373a.setText(dweVar.i());
        } else {
            cVar.f6373a.setVisibility(8);
        }
        if (getItem(i) != null && !getItem(i).f()) {
            cVar.e.setTextColor(this.f6372c.getResources().getColor(R.color.health_band_no_enable_text_color));
        } else {
            cVar.e.setTextColor(this.f6372c.getResources().getColor(R.color.textColorPrimary));
        }
        if (LanguageUtil.ba(this.f6372c)) {
            cVar.d.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            cVar.d.setBackgroundResource(R.drawable.common_ui_arrow_right);
        }
        cVar.f6374b.setVisibility(dweVar.a() ? 0 : 8);
    }

    public void b(int i) {
        LogUtil.a("HonourDeviceSettingListAdapter", "removeTargetItem enter,id: ", Integer.valueOf(i));
        for (int i2 = 0; i2 < this.f6371b.size(); i2++) {
            if (i == this.f6371b.get(i2).e()) {
                this.f6371b.remove(i2);
                break;
            }
        }
        LogUtil.a("HonourDeviceSettingListAdapter", "remove targetItem success.");
        notifyDataSetChanged();
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f6373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f6374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View f6375c;
        ImageView d;
        HealthTextView e;
        HealthTextView h;

        c() {
        }
    }
}
