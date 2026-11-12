package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity.PressureCalibrateActivity;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity.WifiDevicePressureCalibrateGuideActivity;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.adapter.MultiDeviceslistAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class unf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ArrayList<elh> f50396a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ArrayList<dru> f50397b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f50398c = {"e4b0b1d5-2003-4d88-8b5f-c4f64542040b", "a8ba095d-4123-43c4-a30a-0240011c58de"};
    private Context d;
    private boolean e;
    private MultiDeviceslistAdapter f;
    private CustomAlertDialog g;
    private ListView h;
    private CustomAlertDialog.Builder j;

    public unf(Context context, boolean z) {
        this.d = context;
        this.e = z;
        g();
    }

    private void g() {
        d(f50397b);
    }

    private void d(HealthDevice.HealthDeviceKind healthDeviceKind) {
        LogUtil.a("PressureAdjustMultiDevicesDialog", "enter initDevicesList");
        f50397b.clear();
        f50396a.clear();
        ArrayList<String> arrayListD = drw.e().d(healthDeviceKind);
        for (int i = 0; i < arrayListD.size(); i++) {
            elh elhVarD = ResourceManager.c().d(arrayListD.get(i));
            if (elhVarD != null && e(elhVarD.t()) && !elhVarD.l().b().trim().isEmpty()) {
                f50396a.add(elhVarD);
            }
        }
        ArrayList<eby> arrayListD2 = drw.e().d();
        if (arrayListD2 != null && arrayListD2.size() > 0) {
            for (int i2 = 0; i2 < arrayListD2.size(); i2++) {
                eby ebyVar = arrayListD2.get(i2);
                if (e(ebyVar.getProductId())) {
                    dru druVar = new dru();
                    druVar.d(0);
                    druVar.c(ebyVar);
                    f50397b.add(druVar);
                }
            }
            return;
        }
        LogUtil.j("PressureAdjustMultiDevicesDialog", "WiFiDevice is null or WiFiDevice size is 0");
    }

    private void d(List<dru> list) {
        if (h()) {
            LogUtil.a("PressureAdjustMultiDevicesDialog", "initMultiUsersListDialog()");
            View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.pressure_multi_devices_list_layout, (ViewGroup) null);
            this.h = (ListView) viewInflate.findViewById(R.id.pressure_multi_devices_list);
            MultiDeviceslistAdapter multiDeviceslistAdapter = new MultiDeviceslistAdapter(this.d, list);
            this.f = multiDeviceslistAdapter;
            this.h.setAdapter((ListAdapter) multiDeviceslistAdapter);
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.d);
            this.j = builder;
            builder.d(R.string.IDS_device_wifi_pressure_calibrate_multi_devices_title).a(viewInflate).d(R.string.IDS_settings_button_cancal, new e()).e(false);
            this.g = this.j.b();
            this.h.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: unf.4
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    unf.this.b(i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        LogUtil.a("PressureAdjustMultiDevicesDialog", "select MultiUsers position = ", Integer.valueOf(i));
        this.f.notifyDataSetChanged();
        dru item = this.f.getItem(i);
        if (item != null) {
            if (item.e() == 1) {
                une.c(this.d, new IBaseResponseCallback() { // from class: unf.2
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj) {
                        Intent intent = new Intent(unf.this.d, (Class<?>) PressureCalibrateActivity.class);
                        intent.putExtra("pressure_is_have_datas", unf.this.e);
                        iov.d(unf.this.d, intent);
                    }
                });
            } else if (item.e() == 0) {
                try {
                    elh elhVarD = ResourceManager.c().d(((eby) item.i()).getProductId());
                    if (elhVarD != null) {
                        d(elhVarD.t());
                    } else {
                        LogUtil.j("PressureAdjustMultiDevicesDialog", "healthDeviceProductInfo is null");
                    }
                } catch (ClassCastException e2) {
                    LogUtil.e("PressureAdjustMultiDevicesDialog", "Object to WiFiDevice ClassCastException:", e2.getMessage());
                }
            } else {
                LogUtil.a("PressureAdjustMultiDevicesDialog", "getDeviceType not match");
            }
        }
        if (this.g.isShowing()) {
            this.g.dismiss();
        }
    }

    public void e() {
        CustomAlertDialog customAlertDialog;
        if (h() && f50397b.size() > 0 && (customAlertDialog = this.g) != null && !customAlertDialog.isShowing()) {
            this.j.b(a());
            this.g.show();
        }
    }

    public boolean c() {
        d(HealthDevice.HealthDeviceKind.HDK_UNKNOWN);
        DeviceInfo deviceInfoC = mgg.c("PressureAdjustMultiDevicesDialog");
        if (deviceInfoC == null || 2 != deviceInfoC.getDeviceConnectState()) {
            LogUtil.j("PressureAdjustMultiDevicesDialog", "No exist wear device or device is not connected");
        } else if (eej.c() == null || !eej.c().isSupportPressAutoMonitor()) {
            LogUtil.j("PressureAdjustMultiDevicesDialog", "Wear device not support pressure adjust");
        } else {
            dru druVar = new dru();
            druVar.d(1);
            druVar.c(deviceInfoC);
            f50397b.add(druVar);
        }
        LogUtil.a("PressureAdjustMultiDevicesDialog", "isShowMultiDevicesList productInfos size is " + f50397b.size());
        if (f50397b.size() < 2) {
            return false;
        }
        this.f.e(f50397b);
        return true;
    }

    public boolean b() {
        return !njy.e(f50396a);
    }

    public void d() {
        if (njy.e(f50396a)) {
            return;
        }
        Intent intent = new Intent(this.d, (Class<?>) WifiDevicePressureCalibrateGuideActivity.class);
        intent.putExtra("health_wifi_device_userId", MultiUsersManager.INSTANCE.getMainUser().i());
        elh elhVar = f50396a.get(0);
        if (elhVar == null) {
            dyg.d(false, "PressureAdjustMultiDevicesDialog", "startToPressureAdjustByWifiDevicedeviceInfo is null ");
            return;
        }
        dyg.a(false, "PressureAdjustMultiDevicesDialog", "health_wifi_device_productId = " + elhVar.t());
        intent.putExtra("health_wifi_device_productId", elhVar.t());
        iov.d(this.d, intent);
    }

    private void d(String str) {
        Intent intent = new Intent(this.d, (Class<?>) WifiDevicePressureCalibrateGuideActivity.class);
        intent.putExtra("health_wifi_device_userId", MultiUsersManager.INSTANCE.getMainUser().i());
        intent.putExtra("health_wifi_device_productId", str);
        dyg.a(false, "PressureAdjustMultiDevicesDialog", "health_wifi_device_productId = " + str + ", userid = " + MultiUsersManager.INSTANCE.getMainUser().i());
        iov.d(this.d, intent);
    }

    private int a() {
        int iE = era.e(this.h);
        int height = ((WindowManager) this.d.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getHeight() / 2;
        if (iE >= height) {
            iE = height;
        }
        return iE + (f50397b.size() - 1);
    }

    private boolean e(String str) {
        for (String str2 : f50398c) {
            if (str2.equals(str)) {
                LogUtil.a("PressureAdjustMultiDevicesDialog", "isSupportPressureDevcie()=true ", "productType = ", str);
                return true;
            }
        }
        LogUtil.a("PressureAdjustMultiDevicesDialog", "isSupportPressureDevcie()=false ", "productType = ", str);
        return false;
    }

    private boolean h() {
        Context context = this.d;
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    static class e implements DialogInterface.OnClickListener {
        private e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }
}
