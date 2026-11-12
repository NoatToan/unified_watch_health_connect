package defpackage;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.health.IDetectCommonCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.utils.service.UpdateService;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.share.HiHealthError;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes10.dex */
public class mmr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mmr f41933a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41934c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f41935b;
    private e d;
    private Context e = BaseApplication.getContext();

    private mmr() {
    }

    public static mmr e() {
        mmr mmrVar;
        synchronized (f41934c) {
            if (f41933a == null) {
                f41933a = new mmr();
            }
            mmrVar = f41933a;
        }
        return mmrVar;
    }

    public void c(int i, IDetectCommonCallback iDetectCommonCallback) {
        boolean zB;
        if (iDetectCommonCallback == null) {
            LogUtil.j("RemoteDetectManager", "isSwitchOn callback is null");
            return;
        }
        if (i == 1) {
            zB = eei.b();
        } else if (i == 2) {
            zB = NotificationContentProviderUtil.b();
        } else {
            if (i != 3) {
                LogUtil.j("RemoteDetectManager", "isSwitchOn switchType is undefined");
                a(iDetectCommonCallback, 2, null, "param invalid");
                return;
            }
            zB = mir.a();
        }
        LogUtil.a("RemoteDetectManager", "isSwitchOn switchType:", Integer.valueOf(i), " isSwitch:", Boolean.valueOf(zB));
        a(iDetectCommonCallback, 0, Arrays.asList(Boolean.valueOf(zB)), "");
    }

    public void e(int i, IDetectCommonCallback iDetectCommonCallback) {
        List<String> listJ;
        if (iDetectCommonCallback == null) {
            LogUtil.j("RemoteDetectManager", "getList callback is null");
            return;
        }
        LogUtil.a("RemoteDetectManager", "getList enter listType:", Integer.valueOf(i));
        if (i == 0) {
            listJ = NotificationContentProviderUtil.j();
        } else {
            if (i != 1) {
                LogUtil.j("RemoteDetectManager", "getList listType is undefined");
                a(iDetectCommonCallback, 2, null, "param invalid");
                return;
            }
            listJ = d();
        }
        LogUtil.a("RemoteDetectManager", "getList resultList:", listJ.stream().collect(Collectors.joining(" ")));
        a(iDetectCommonCallback, 0, listJ, "");
    }

    public void a(String str, int i, IDetectCommonCallback iDetectCommonCallback) {
        String deviceIdentify;
        LogUtil.j("RemoteDetectManager", "goIntoPage enter pageType:", Integer.valueOf(i), " callback:", Boolean.valueOf(iDetectCommonCallback == null), " deviceUdid:", Boolean.valueOf(TextUtils.isEmpty(str)));
        if (iDetectCommonCallback == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            a(iDetectCommonCallback, 2, null, "param invalid");
            return;
        }
        List<DeviceInfo> listC = c();
        if (listC.isEmpty()) {
            LogUtil.a("RemoteDetectManager", "goIntoPage disconnected");
            a(iDetectCommonCallback, HiHealthError.ERR_WRONG_DEVICE, null, "device disconnection");
            return;
        }
        Iterator<DeviceInfo> it = listC.iterator();
        while (true) {
            if (!it.hasNext()) {
                deviceIdentify = "";
                break;
            }
            DeviceInfo next = it.next();
            String udidFromDevice = next.getUdidFromDevice();
            if (TextUtils.isEmpty(udidFromDevice)) {
                udidFromDevice = next.getDeviceUdid();
            }
            if (str.equals(udidFromDevice)) {
                deviceIdentify = next.getDeviceIdentify();
                break;
            }
        }
        if (TextUtils.isEmpty(deviceIdentify)) {
            LogUtil.a("RemoteDetectManager", "goIntoPage identify is empty");
            a(iDetectCommonCallback, 156, null, "device udid is not same");
            return;
        }
        if (i == 0) {
            d(deviceIdentify);
        } else {
            if (i != 1) {
                LogUtil.j("RemoteDetectManager", "goIntoPage pageType is undefined");
                a(iDetectCommonCallback, 2, null, "param invalid");
                return;
            }
            a(deviceIdentify);
        }
        a(iDetectCommonCallback, 0, null, "");
    }

    public void a(int i, IDetectCommonCallback iDetectCommonCallback) {
        if (iDetectCommonCallback == null) {
            LogUtil.j("RemoteDetectManager", "isLatestVersion callback is null");
            return;
        }
        LogUtil.a("RemoteDetectManager", "isLatestVersion softwareType:", Integer.valueOf(i));
        if (!CommonUtil.ab(this.e)) {
            LogUtil.j("RemoteDetectManager", "isLatestVersion network disconnected");
            a(iDetectCommonCallback, 1004, null, "network exception");
        } else if (i == 1) {
            b(iDetectCommonCallback);
        } else if (i != 2) {
            LogUtil.j("RemoteDetectManager", "isLatestVersion softwareType is undefined");
            a(iDetectCommonCallback, 2, null, "param invalid");
        } else {
            e(iDetectCommonCallback);
        }
    }

    private void b(IDetectCommonCallback iDetectCommonCallback) {
        LogUtil.a("RemoteDetectManager", "startDetectApp enter");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_app_check_new_version_state");
        e eVar = new e(iDetectCommonCallback);
        this.d = eVar;
        BroadcastManagerUtil.d(this.e, eVar, intentFilter, LocalBroadcast.f36595c, null);
        Intent intent = new Intent(this.e, (Class<?>) UpdateService.class);
        intent.setAction("action_app_manual_update_new_version");
        try {
            this.e.startService(intent);
        } catch (IllegalStateException unused) {
            LogUtil.e("RemoteDetectManager", "startDetectApp IllegalStateException");
        }
    }

    private void e(IDetectCommonCallback iDetectCommonCallback) {
        DeviceInfo deviceInfoA = a();
        if (deviceInfoA == null) {
            LogUtil.j("RemoteDetectManager", "startDetectDevice not device connected");
            a(iDetectCommonCallback, HiHealthError.ERR_WRONG_DEVICE, null, "device disconnection");
            return;
        }
        LogUtil.a("RemoteDetectManager", "startDetectDevice enter");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_app_check_new_version_state");
        c cVar = new c(iDetectCommonCallback);
        this.f41935b = cVar;
        BroadcastManagerUtil.d(this.e, cVar, intentFilter, LocalBroadcast.f36595c, null);
        Intent intent = new Intent(this.e, (Class<?>) HwUpdateService.class);
        intent.putExtra("extra_band_imei", deviceInfoA.getDeviceIdentify());
        intent.setAction("action_band_manual_update_new_version");
        try {
            this.e.startService(intent);
        } catch (IllegalStateException unused) {
            LogUtil.e("RemoteDetectManager", "startDetectDevice IllegalStateException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Intent intent, IDetectCommonCallback iDetectCommonCallback) {
        int intExtra = intent.getIntExtra("state", -1);
        int intExtra2 = intent.getIntExtra("result", -1);
        String stringExtra = intent.getStringExtra("content");
        LogUtil.a("RemoteDetectManager", "appParseState intent state:", Integer.valueOf(intExtra), " result:", Integer.valueOf(intExtra2), " content:", stringExtra);
        if (intExtra == 11) {
            a(iDetectCommonCallback, 0, Arrays.asList(true), "");
            b();
            return;
        }
        if (intExtra == 12) {
            String strA = a(this.e);
            LogUtil.a("RemoteDetectManager", "appParseState appNewVersion:", stringExtra, " currentVersion:", strA);
            if (CommonUtil.ap() || (CommonUtil.af(this.e) && stringExtra.contains("Beta"))) {
                a(iDetectCommonCallback, 0, Arrays.asList(true), "");
                b();
                return;
            } else {
                if (CommonUtil.e(stringExtra, strA) > 0) {
                    a(iDetectCommonCallback, 0, Arrays.asList(false), "");
                } else {
                    a(iDetectCommonCallback, 0, Arrays.asList(true), "");
                }
                b();
                return;
            }
        }
        LogUtil.a("RemoteDetectManager", "appParseState default");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent, IDetectCommonCallback iDetectCommonCallback) {
        int intExtra = intent.getIntExtra("state", -1);
        int intExtra2 = intent.getIntExtra("result", -1);
        LogUtil.a("RemoteDetectManager", "deviceParseState intent state:", Integer.valueOf(intExtra), " result:", Integer.valueOf(intExtra2), " content:", intent.getStringExtra("content"));
        if (intExtra == 11) {
            a(iDetectCommonCallback, 0, Arrays.asList(true), "");
            f();
        } else if (intExtra == 12) {
            a(iDetectCommonCallback, 0, Arrays.asList(false), "");
            f();
        } else {
            LogUtil.a("RemoteDetectManager", "deviceParseState default");
        }
    }

    private void a(IDetectCommonCallback iDetectCommonCallback, int i, List list, String str) {
        try {
            iDetectCommonCallback.onResponse(i, list, str);
        } catch (RemoteException unused) {
            LogUtil.a("RemoteDetectManager", "setResponse RemoteException");
        }
    }

    private void b() {
        e eVar = this.d;
        if (eVar != null) {
            this.e.unregisterReceiver(eVar);
            this.d = null;
        }
    }

    private void f() {
        c cVar = this.f41935b;
        if (cVar != null) {
            this.e.unregisterReceiver(cVar);
            this.f41935b = null;
        }
    }

    private String a(Context context) {
        int iIndexOf;
        String strA = CommonUtil.a(context);
        return (TextUtils.isEmpty(strA) || (iIndexOf = strA.indexOf(Constants.LINK)) <= 0) ? strA : strA.substring(0, iIndexOf);
    }

    private List<DeviceInfo> c() {
        ArrayList arrayList = new ArrayList(16);
        for (DeviceInfo deviceInfo : ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "getConnectedDevices")) {
            if (deviceInfo.getDeviceConnectState() == 2) {
                arrayList.add(deviceInfo);
            }
        }
        return arrayList;
    }

    private DeviceInfo a() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "getConnectedDevices");
        if (deviceList != null && deviceList.size() != 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (!cod.a(deviceInfo.getProductType())) {
                    return deviceInfo;
                }
            }
        }
        return null;
    }

    private List<String> d() {
        ArrayList arrayList = new ArrayList(16);
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (this.e.checkSelfPermission(str) == 0) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private void d(String str) {
        LogUtil.a("RemoteDetectManager", "intoNotificationActivity enter");
        try {
            Intent intent = new Intent();
            intent.setPackage(this.e.getPackageName());
            intent.setClassName(this.e, "com.huawei.ui.homewear21.home.WearHomeActivity");
            intent.putExtra("key_page_id", 0);
            intent.putExtra("device_id", str);
            intent.addFlags(268435456);
            this.e.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("RemoteDetectManager", "intoNotificationActivity ActivityNotFoundException");
        }
    }

    private void a(String str) {
        LogUtil.a("RemoteDetectManager", "intoFirmwareUpgradeActivity enter");
        try {
            Intent intent = new Intent();
            intent.setPackage(this.e.getPackageName());
            intent.setClassName(this.e, "com.huawei.ui.homewear21.home.WearHomeActivity");
            intent.putExtra("key_page_id", 1);
            intent.putExtra("device_id", str);
            intent.addFlags(268435456);
            this.e.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("RemoteDetectManager", "intoFirmwareUpgradeActivity ActivityNotFoundException");
        }
    }

    class e extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IDetectCommonCallback f41938b;

        e(IDetectCommonCallback iDetectCommonCallback) {
            this.f41938b = iDetectCommonCallback;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || this.f41938b == null) {
                LogUtil.j("RemoteDetectManager", "AppDetectionReceiver intent or mCallback is null");
                return;
            }
            if (!"type_check_app".equals(intent.getStringExtra("key_check_type"))) {
                LogUtil.a("RemoteDetectManager", "AppDetectionReceiver not app check, return");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("RemoteDetectManager", "AppDetectionReceiver action: ", action);
            if ("action_app_check_new_version_state".equals(action)) {
                mmr.this.e(intent, this.f41938b);
            }
        }
    }

    class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IDetectCommonCallback f41936b;

        c(IDetectCommonCallback iDetectCommonCallback) {
            this.f41936b = iDetectCommonCallback;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || this.f41936b == null) {
                LogUtil.j("RemoteDetectManager", "DeviceDetectionReceiver intent or mCallback is null");
                return;
            }
            if ("type_check_app".equals(intent.getStringExtra("key_check_type"))) {
                LogUtil.a("RemoteDetectManager", "DeviceDetectionReceiver is app check, return");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("RemoteDetectManager", "DeviceDetectionReceiver action: ", action);
            if ("action_app_check_new_version_state".equals(action)) {
                mmr.this.d(intent, this.f41936b);
            }
        }
    }
}
