package com.huawei.ui.device.views.onelevelmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import defpackage.qsp;
import defpackage.rcx;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class OneLevelMenuAddListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashMap<Integer, Boolean> f25056c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f25057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LayoutInflater f25058b;
    private Context e;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthCheckBox f25059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f25060c;
        private ImageView e;

        public HealthCheckBox c() {
            return this.f25059b;
        }
    }

    public OneLevelMenuAddListAdapter(Context context, List<Integer> list) {
        this.f25057a = list;
        this.e = context;
        e();
        this.f25058b = LayoutInflater.from(this.e);
    }

    private void e() {
        if (f25056c == null) {
            f25056c = new HashMap<>(16);
        }
        for (int i = 0; i < this.f25057a.size(); i++) {
            f25056c.put(Integer.valueOf(i), false);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f25057a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i < 0 || i > this.f25057a.size() - 1) {
            return null;
        }
        return this.f25057a.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            int iIntValue = this.f25057a.get(i).intValue();
            d dVar = new d();
            View viewInflate = this.f25058b.inflate(R.layout.activity_one_level_add_menu_item_layout, (ViewGroup) null);
            dVar.f25060c = (HealthTextView) qsp.a(viewInflate, R.id.summary);
            dVar.f25059b = (HealthCheckBox) qsp.a(viewInflate, R.id.isCheckBox);
            dVar.e = (ImageView) qsp.a(viewInflate, R.id.item_line);
            viewInflate.setTag(dVar);
            LogUtil.a("ContactDeleteListAdapter", "ContactDeleteListAdapter getView() arg0=", Integer.valueOf(i), ", mAddList.size()=", Integer.valueOf(this.f25057a.size()));
            if (i == this.f25057a.size() - 1) {
                dVar.e.setVisibility(8);
            } else {
                dVar.e.setVisibility(0);
            }
            dVar.f25060c.setText(rcx.c().a(this.e, iIntValue));
            HashMap<Integer, Boolean> map = f25056c;
            if (map != null && map.get(Integer.valueOf(i)) != null) {
                dVar.f25059b.setChecked(f25056c.get(Integer.valueOf(i)).booleanValue());
            }
            return viewInflate;
        } catch (IndexOutOfBoundsException e) {
            LogUtil.e("ContactDeleteListAdapter", e.getMessage());
            return null;
        }
    }

    public static HashMap<Integer, Boolean> a() {
        return f25056c;
    }
}
