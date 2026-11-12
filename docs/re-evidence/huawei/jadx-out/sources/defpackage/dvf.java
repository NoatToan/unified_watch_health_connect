package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.common.utils.HexUtils;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.SharedPreferenceManager;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes7.dex */
public class dvf implements EventBus.ICallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32410b;
    private dvi d;
    private HagridDeviceManagerFragment e;

    public void e(dvi dviVar, HagridDeviceManagerFragment hagridDeviceManagerFragment, String str, String str2) {
        this.d = dviVar;
        this.e = hagridDeviceManagerFragment;
        this.f32409a = str;
        this.f32410b = str2;
    }

    @Override // com.huawei.health.device.util.EventBus.ICallback
    public void onEvent(EventBus.d dVar) {
        String strE = dVar.e();
        Bundle bundleB = dVar.b();
        LogUtil.j("HagridDeviceEventManager", "mEventCallback action = ", strE);
        if (bundleB != null) {
            e(strE, bundleB);
            a(strE, bundleB);
        }
    }

    private void e(String str, Bundle bundle) {
        if ("get_device_ssid_result".equals(str)) {
            String string = bundle.getString("deviceSsid");
            if (this.d == null) {
                LogUtil.j("R_Weight_HagridDeviceEventManager", "EVEBUS_GET_DEVICE_SSID_RESULT onEvent myHandler is null.");
                return;
            }
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4", string, null);
            if (this.e.getHuidType() == 1) {
                LogUtil.a("R_Weight_HagridDeviceEventManager", "ssid get success, and get manager success, return");
                return;
            } else {
                this.d.sendEmptyMessage(5);
                return;
            }
        }
        if ("manager_info_success".equals(str)) {
            this.e.setHuidType(1);
            a(bundle);
            return;
        }
        if ("manager_info_failed".equals(str)) {
            LogUtil.j("R_Weight_HagridDeviceEventManager", "get manager info fail !");
            e();
            return;
        }
        if ("set_weight_unit_result".equals(str)) {
            dvr.a().b(bundle);
            return;
        }
        if ("device_reset_result".equals(str)) {
            int i = bundle.getInt("ret");
            LogUtil.a("HagridDeviceEventManager", "set device reset ", Integer.valueOf(i));
            if (i == 0 && (dxm.ai(this.f32410b) || dxm.q(this.f32410b))) {
                dvk.b().b("unbind_local_device", new Bundle());
                return;
            } else {
                dvk.b().b("unbind_local_device", new Bundle());
                return;
            }
        }
        LogUtil.j("R_Weight_HagridDeviceEventManager", "HagridDeviceManagerFragment mEventCallback else procesEventActionOne");
    }

    private void e() {
        if (this.e.getHuidType() == 1) {
            LogUtil.j("R_Weight_HagridDeviceEventManager", "get manager success, no refresh");
            return;
        }
        this.e.setHuidType(2);
        this.e.setHuid(null);
        c(false);
        dvi dviVar = this.d;
        if (dviVar == null) {
            LogUtil.j("R_Weight_HagridDeviceEventManager", "EVEBUS_MANAGER_INFO_FAILED onEvent myHandler is null.");
        } else {
            dviVar.sendEmptyMessage(2);
        }
    }

    private void a(String str, Bundle bundle) {
        if ("get_weight_unit_result".equals(str)) {
            dvr.a().a(bundle);
            return;
        }
        if ("multi_user_auto_cancle_dialog".equals(str)) {
            dvi dviVar = this.d;
            if (dviVar == null) {
                LogUtil.j("R_Weight_HagridDeviceEventManager", "EVEBUS_WIFI_DEVICE_MULTI_USER_DIALOG onEvent myHandler is null.");
                return;
            } else {
                dviVar.obtainMessage(6).sendToTarget();
                return;
            }
        }
        if ("sub_user_unauthorize_notification".equals(str)) {
            c();
            return;
        }
        if ("wifi_scale_auth_refresh".equals(str)) {
            dvi dviVar2 = this.d;
            if (dviVar2 == null) {
                LogUtil.j("R_Weight_HagridDeviceEventManager", "EVEBUS_WIFI_SCALE_AUTH_REFRESH onEvent myHandler is null.");
                return;
            } else {
                dviVar2.obtainMessage(8).sendToTarget();
                this.d.obtainMessage(6).sendToTarget();
                return;
            }
        }
        if ("event_bus_sub_user_exit_device".equals(str)) {
            dvk.b().e(dmp.d().b(this.f32409a, false));
        } else if ("event_bus_config_wifi".equals(str)) {
            LogUtil.j("HagridDeviceEventManager", "EVENTBUS_CONFIG_WIFI onEvent myHandler is null.");
            this.d.sendEmptyMessage(10);
        } else {
            LogUtil.j("R_Weight_HagridDeviceEventManager", "HagridDeviceManagerFragment mEventCallback else procesEventActionTwo");
        }
    }

    private void a(Bundle bundle) {
        byte[] byteArray = null;
        this.e.setHuid(null);
        if (bundle != null) {
            try {
                if (bundle.getByteArray("huid") != null) {
                    byteArray = bundle.getByteArray("huid");
                    String string = bundle.getString("cloudDeviceID");
                    c(byteArray != null && byteArray.length > 0);
                    if (!TextUtils.isEmpty(string)) {
                        string = string.trim();
                    }
                    this.e.setHuid(byteArray);
                    this.e.setDevId(string);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.e("HagridDeviceEventManager", "HagridDeviceManagerFragment dealEventReceiveManageInfo ArrayIndexOutOfBoundsException");
            }
        }
        if (byteArray != null) {
            String strB = elx.a().b(byteArray);
            LogUtil.d("HagridDeviceEventManager", "main huid ", strB);
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            if (!TextUtils.isEmpty(strB) && !TextUtils.isEmpty(accountInfo)) {
                try {
                    boolean zStartsWith = strB.startsWith(HexUtils.c(accountInfo.getBytes("UTF-8")));
                    this.e.setMainUser(zStartsWith);
                    LogUtil.a("HagridDeviceEventManager", "mIsMainUser: ", Boolean.valueOf(zStartsWith));
                } catch (UnsupportedEncodingException e) {
                    LogUtil.e("HagridDeviceEventManager", "dealEventReceiveManageInfo error :", e.getMessage());
                }
            }
            LogUtil.a("HagridDeviceEventManager", "mIsMainUser: ");
        } else {
            LogUtil.j("R_Weight_HagridDeviceEventManager", "dealEventReceiveManageInfo huid is null");
        }
        if (this.d == null) {
            this.d = new dvi(this.e);
        }
        this.d.sendEmptyMessage(2);
    }

    private void c(boolean z) {
        DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d());
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("device_has_manager");
        stringBuffer.append(this.f32409a);
        deviceCloudSharePreferencesManager.c(stringBuffer.toString(), z);
    }

    public void c() {
        if (this.e.getWiFiDevice() == null) {
            LogUtil.j("R_Weight_HagridDeviceEventManager", "getAuthorizeSubUserFromCloud mWiFiDevice is null");
        } else if (b()) {
            LogUtil.j("R_Weight_HagridDeviceEventManager", "getAuthorizeSubUserFromCloud is sub devices");
        } else {
            ean.a(this.e.getWiFiDevice().e(), new CommBaseCallbackInterface() { // from class: dvg
                @Override // com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface
                public final void onResult(int i, String str, Object obj) {
                    this.f32411b.c(i, str, obj);
                }
            });
        }
    }

    /* synthetic */ void c(int i, String str, Object obj) {
        dvi dviVar;
        if (i == 0 && obj != null && (dviVar = this.d) != null) {
            dviVar.obtainMessage(6).sendToTarget();
        } else {
            LogUtil.j("HagridDeviceEventManager", "getAuthorizeSubUserFromCloud errCode:", Integer.valueOf(i));
        }
    }

    private boolean b() {
        if (this.e.getWiFiDevice() == null || this.e.getWiFiDevice().a().m() != 2) {
            return false;
        }
        MeasurableDevice measurableDeviceB = dmp.d().b(this.f32409a, true);
        return measurableDeviceB == null || (measurableDeviceB instanceof eby);
    }
}
