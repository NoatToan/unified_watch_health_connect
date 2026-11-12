package com.huawei.health.device.ui.measure.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dwf;
import defpackage.dxw;
import defpackage.ecj;
import defpackage.qlo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class WifiDeviceShareMemberInfoAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<dwf.c> f6404c;
    private String d;
    private Context e;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public WifiDeviceShareMemberInfoAdapter(Context context, String str, List<dwf.c> list) {
        new ArrayList(16);
        this.e = context;
        this.f6404c = list;
        this.d = str;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f6404c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i < 0 || i >= this.f6404c.size()) {
            return null;
        }
        return this.f6404c.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        d dVar;
        if (i < 0 || i > this.f6404c.size()) {
            return view;
        }
        if (view == null) {
            dVar = new d();
            viewInflate = LayoutInflater.from(this.e).inflate(R.layout.item_wifi_device_share_layout, (ViewGroup) null);
            dVar.f6405a = (ImageView) viewInflate.findViewById(R.id.share_member_header_img);
            dVar.f6406c = (HealthTextView) viewInflate.findViewById(R.id.share_member_header_title_tv);
            dVar.d = (HealthTextView) viewInflate.findViewById(R.id.share_member_sub_title_tv);
            dVar.e = (ImageView) viewInflate.findViewById(R.id.arrow_img);
            viewInflate.setTag(dVar);
        } else if (view.getTag() instanceof d) {
            viewInflate = view;
            dVar = (d) view.getTag();
        } else {
            viewInflate = view;
            dVar = null;
        }
        if (dVar != null) {
            dwf.c cVar = this.f6404c.get(i);
            ecj.e(null, dVar.f6405a, qlo.b(this.e.getResources(), new qlo.e(null, cVar.e(), true)));
            if (!TextUtils.isEmpty(cVar.d())) {
                dVar.f6406c.setText(cVar.d());
            } else {
                dVar.f6406c.setText(cVar.b());
            }
            DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.d);
            stringBuffer.append("_");
            stringBuffer.append(cVar.e());
            String strE = deviceCloudSharePreferencesManager.e(stringBuffer.toString());
            if (!TextUtils.isEmpty(strE)) {
                dVar.f6406c.setText(strE);
            }
            dVar.d.setText(cVar.b());
            if (cVar.a() == 1) {
                dVar.d.setText(R.string.IDS_device_wifi_share_account_administrator);
            }
            dVar.e.setVisibility(0);
        }
        return viewInflate;
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f6405a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f6406c;
        private HealthTextView d;
        private ImageView e;

        d() {
        }
    }
}
