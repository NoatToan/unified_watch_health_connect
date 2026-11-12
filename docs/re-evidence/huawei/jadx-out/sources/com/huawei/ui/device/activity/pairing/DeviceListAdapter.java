package com.huawei.ui.device.activity.pairing;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbtsdk.btdatatype.datatype.BluetoothDeviceNode;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.CompileParameterUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LayoutInflater f24594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f24595c = new ArrayList(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f24593a = new ArrayList(12);

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public DeviceListAdapter() {
    }

    public DeviceListAdapter(Context context) {
        if (context != null) {
            this.f24594b = LayoutInflater.from(context);
        }
    }

    public void a(List<BluetoothDeviceNode> list) {
        if (list == null) {
            return;
        }
        this.f24593a.clear();
        try {
            Iterator<BluetoothDeviceNode> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    BluetoothDeviceNode next = it.next();
                    a aVar = new a();
                    BluetoothDevice btDevice = next.getBtDevice();
                    if (TextUtils.isEmpty(next.getNodeId())) {
                        if (btDevice.getName() == null) {
                            aVar.d(next.getRecordName());
                        } else {
                            aVar.d(btDevice.getName());
                        }
                        aVar.b(btDevice.getAddress());
                    } else {
                        aVar.d(next.getDisplayName());
                        aVar.b(next.getNodeId());
                    }
                    aVar.b(true);
                    this.f24593a.add(aVar);
                } else {
                    a aVar2 = new a();
                    aVar2.d(BaseApplication.getContext().getString(R.string.IDS_device_mgr_not_found_device));
                    aVar2.b("");
                    aVar2.b(false);
                    this.f24593a.add(aVar2);
                    notifyDataSetChanged();
                    return;
                }
            }
        } catch (SecurityException e2) {
            LogUtil.e("DeviceListAdapter", "setList SecurityException:", ExceptionUtils.c(e2));
        }
    }

    public void e(List<BluetoothDeviceNode> list, int i) {
        if (list == null) {
            return;
        }
        if (i > this.f24593a.size()) {
            a(list);
            return;
        }
        if (list.size() != this.f24593a.size()) {
            a(list);
            return;
        }
        BluetoothDeviceNode bluetoothDeviceNode = list.get(i);
        BluetoothDevice btDevice = bluetoothDeviceNode.getBtDevice();
        a aVar = new a();
        if (TextUtils.isEmpty(bluetoothDeviceNode.getNodeId())) {
            aVar.d(btDevice.getName());
            aVar.b(btDevice.getAddress());
        } else {
            aVar.d(bluetoothDeviceNode.getDisplayName());
            aVar.b(bluetoothDeviceNode.getNodeId());
        }
        aVar.b(true);
        this.f24593a.add(i, aVar);
        List<a> list2 = this.f24593a;
        if (list2.get(list2.size() - 1).a()) {
            a aVar2 = new a();
            aVar2.d(BaseApplication.getContext().getString(R.string.IDS_device_mgr_not_found_device));
            aVar2.b("");
            aVar2.b(false);
            this.f24593a.add(aVar2);
        }
        LogUtil.a("DeviceListAdapter", "devices.size() : ", Integer.valueOf(list.size()), "devices.size() : mList ", Integer.valueOf(this.f24593a.size()));
        notifyDataSetChanged();
    }

    public void d(List<String> list) {
        if (list == null) {
            return;
        }
        this.f24595c = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f24593a.size();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a getItem(int i) {
        if (i < 0 || i >= this.f24593a.size()) {
            return null;
        }
        return this.f24593a.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        e eVar;
        if (viewGroup == null) {
            LogUtil.j(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "DeviceListAdapter", "container is null");
        }
        if (view == null) {
            view = this.f24594b.inflate(com.huawei.hwbtsdk.R.layout.device_item_layout, (ViewGroup) null);
            eVar = new e();
            eVar.f24600c = (HealthTextView) view.findViewById(com.huawei.hwbtsdk.R.id.item_device_name);
            eVar.f24599b = view.findViewById(com.huawei.hwbtsdk.R.id.item_device_line);
            view.setTag(eVar);
        } else {
            if (!(view.getTag() instanceof e)) {
                LogUtil.e("DeviceListAdapter", "holder is not ViewHolder");
                return view;
            }
            eVar = (e) view.getTag();
        }
        if (i == this.f24593a.size() - 1) {
            eVar.f24599b.setVisibility(8);
        } else {
            eVar.f24599b.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.f24593a.get(i).d())) {
            eVar.f24600c.setText(this.f24593a.get(i).e());
        } else if (e(this.f24593a.get(i).d()) || !this.f24593a.get(i).a()) {
            eVar.f24600c.setText(this.f24593a.get(i).d());
        } else {
            eVar.f24600c.setText(this.f24593a.get(i).e());
        }
        if (i == this.f24593a.size() - 1) {
            eVar.f24600c.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.common_ui_text_color));
            return view;
        }
        eVar.f24600c.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.colorPrimary));
        return view;
    }

    public static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f24599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HealthTextView f24600c;
    }

    private boolean e(String str) {
        boolean zA = true;
        if (TextUtils.isEmpty(str)) {
            if (this.f24595c.size() > 0 && "Blacktip".equalsIgnoreCase(this.f24595c.get(0))) {
                return false;
            }
            LogUtil.j(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "DeviceListAdapter", "isShowDeviceName deviceName is null and return true.");
            return true;
        }
        if (CompileParameterUtil.c("IS_SUPPORT_NEW_ADD_MODE", false)) {
            LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "DeviceListAdapter", "isShowDeviceName use new add device mode.");
        } else {
            zA = a(str);
        }
        LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "DeviceListAdapter", "isShowDeviceName isShowName is ", Boolean.valueOf(zA));
        return zA;
    }

    private boolean a(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        boolean z = false;
        for (String str2 : this.f24595c) {
            if (TextUtils.isEmpty(str2)) {
                z = true;
            } else if (upperCase.contains(str2.toUpperCase(Locale.ENGLISH))) {
                return true;
            }
        }
        return z;
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f24596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f24597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f24598c;

        private a() {
            this.f24598c = true;
        }

        public String d() {
            return this.f24597b;
        }

        public void d(String str) {
            if (str == null) {
                return;
            }
            this.f24597b = str;
        }

        public String e() {
            return this.f24596a;
        }

        public void b(String str) {
            if (str == null) {
                return;
            }
            this.f24596a = str;
        }

        public boolean a() {
            return this.f24598c;
        }

        public void b(boolean z) {
            this.f24598c = z;
        }
    }
}
