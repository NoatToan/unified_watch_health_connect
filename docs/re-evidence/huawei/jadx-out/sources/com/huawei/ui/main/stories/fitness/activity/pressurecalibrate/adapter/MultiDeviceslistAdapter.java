package com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.dru;
import defpackage.eby;
import defpackage.elh;
import defpackage.elo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class MultiDeviceslistAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f26969c;
    private List<dru> d = new ArrayList(16);

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public MultiDeviceslistAdapter(Context context, List<dru> list) {
        this.f26969c = context;
        e(list);
    }

    public final void e(List<dru> list) {
        if (list != null) {
            this.d.clear();
            this.d.addAll(list);
            LogUtil.a("MultiUserslistAdapter", "mList.size() = " + this.d.size());
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.d.size() > 0) {
            return this.d.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public dru getItem(int i) {
        if (this.d.size() <= 0 || i >= this.d.size()) {
            return null;
        }
        return this.d.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        b bVar;
        if (i > this.d.size() || i < 0) {
            return view;
        }
        LogUtil.a("MultiUserslistAdapter", " into getview mList.size())" + this.d.size());
        if (view == null) {
            bVar = new b();
            viewInflate = LayoutInflater.from(this.f26969c).inflate(R.layout.multidevices_list_item_layout, (ViewGroup) null);
            bVar.d = (HealthTextView) viewInflate.findViewById(R.id.multidevices_name);
            bVar.f26970a = (HealthDivider) viewInflate.findViewById(R.id.multidevices_divider_line);
            viewInflate.setTag(bVar);
        } else {
            viewInflate = view;
            bVar = (b) view.getTag();
        }
        dru druVar = this.d.get(i);
        if (druVar.e() == 1) {
            DeviceInfo deviceInfo = (DeviceInfo) druVar.i();
            LogUtil.a("MultiUserslistAdapter", "getView wear device state:" + deviceInfo.getDeviceConnectState());
            LogUtil.a("MultiUserslistAdapter", "getView wear device name:" + deviceInfo.getDeviceName());
            bVar.d.setText(deviceInfo.getDeviceName());
        }
        c(druVar, bVar);
        if (i == this.d.size() - 1) {
            bVar.f26970a.setVisibility(8);
            return viewInflate;
        }
        bVar.f26970a.setVisibility(0);
        return viewInflate;
    }

    private void c(dru druVar, b bVar) {
        String strA;
        if (druVar.e() == 0) {
            try {
                eby ebyVar = (eby) druVar.i();
                String productId = ebyVar.getProductId();
                String strL = ebyVar.a().l();
                if (strL == null || strL.equals("")) {
                    LogUtil.j("MultiUserslistAdapter", "device sn is null");
                    strL = "";
                } else if (strL.length() < 3) {
                    LogUtil.j("MultiUserslistAdapter", "device sn length less than 3");
                } else {
                    strL = Constants.LINK + strL.substring(strL.length() - 3, strL.length());
                }
                elh elhVarD = ResourceManager.c().d(productId);
                if (elhVarD == null) {
                    LogUtil.j("MultiUserslistAdapter", "productInfo is null");
                    return;
                }
                if (elhVarD.d().size() <= 0) {
                    strA = elhVarD.l().d() + System.lineSeparator() + elhVarD.l().e();
                } else {
                    strA = elo.a(elhVarD.t(), elhVarD.l().d());
                }
                bVar.d.setText(strA + strL);
            } catch (ClassCastException unused) {
                LogUtil.e("MultiUserslistAdapter", "Object to WiFiDevice ClassCastException");
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthDivider f26970a;
        private HealthTextView d;

        b() {
        }
    }
}
