package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.android.net.wifi.NfcWifiManagerEx;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.mgr.hwwifisyncmgr.WifiConnectReceiver;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Base64;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.HwEncryptUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public class naf implements ParserInterface {
    private static volatile naf d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f42813a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f42814c;
    private WifiConnectReceiver j;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AtomicInteger f42812b = new AtomicInteger(0);

    private naf(Context context) {
        this.f42814c = context;
    }

    public static naf e() {
        naf nafVar;
        synchronized (e) {
            if (d == null) {
                d = new naf(BaseApplication.getContext());
            }
            nafVar = d;
        }
        return nafVar;
    }

    public void a() {
        LogUtil.a("HwWifiSyncMgr", "enter syncWifiBySharedPreference()");
        k();
    }

    public void b() {
        LogUtil.a("HwWifiSyncMgr", "enter registerWifiConnectReceiver");
        synchronized (e) {
            if (f42812b.get() != 0) {
                return;
            }
            try {
                KeyValDbManager.d(BaseApplication.getContext()).b("saved_support_sync_wifi", "1");
                this.j = WifiConnectReceiver.a();
                i();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
                if (EnvironmentInfo.l()) {
                    j();
                    try {
                        NetworkUtil.d(this.f42813a);
                        d(NetworkUtil.h());
                    } catch (SecurityException unused) {
                        LogUtil.e("HwWifiSyncMgr", "registerWifiConnectReceiver registerNetworkCallback exception");
                    }
                    LogUtil.a("HwWifiSyncMgr", "registerWifiConnectReceiver registerNetworkCallback is success");
                } else {
                    intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                }
                BroadcastManagerUtil.c(BaseApplication.getContext(), this.j, intentFilter, LocalBroadcast.f36595c, null);
                f42812b.incrementAndGet();
            } catch (IllegalArgumentException unused2) {
                LogUtil.e("HwWifiSyncMgr", "unRegisterWifiConnectReceiver is failed");
            }
        }
    }

    public void c() {
        LogUtil.a("HwWifiSyncMgr", "enter unRegisterWifiConnectReceiver");
        synchronized (e) {
            if (this.j != null && f42812b.get() == 1) {
                try {
                    BaseApplication.getContext().unregisterReceiver(this.j);
                    if (this.f42813a != null && EnvironmentInfo.l()) {
                        NetworkUtil.e(this.f42813a);
                        this.f42813a = null;
                    }
                    this.j = null;
                    f42812b.decrementAndGet();
                } catch (IllegalArgumentException unused) {
                    LogUtil.e("HwWifiSyncMgr", "unRegisterWifiConnectReceiver is failed");
                }
            }
        }
    }

    public boolean d() {
        if (NfcWifiManagerEx.getWpaSuppConfig((WifiManager) null) != null) {
            return true;
        }
        LogUtil.j("HwWifiSyncMgr", "isCouldGetWifiConfigurationInformation() wifi information is empty");
        return false;
    }

    private void a(byte[] bArr) {
        ReleaseLogUtil.d("R_HwWifiSyncMgr", "parseSyncWifiResult enter.");
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("HwWifiSyncMgr", "parseDeviceData data is error");
            return;
        }
        String strSubstring = strE.substring(0, 2);
        String strSubstring2 = strE.substring(2, 4);
        try {
            int i = Integer.parseInt(strSubstring, 16);
            int i2 = Integer.parseInt(strSubstring2, 16);
            if (i != 1 || i2 != 47) {
                LogUtil.j("HwWifiSyncMgr", "The phone received the wifi data is error.");
                return;
            }
        } catch (NumberFormatException unused) {
            LogUtil.e("HwWifiSyncMgr", "The phone received the wifi data parseInt has exception");
        }
        b(strE.substring(4));
    }

    private void k() {
        if (!nan.b(this.f42814c)) {
            LogUtil.a("HwWifiSyncMgr", "The phone no wifi connection");
        } else if (f()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: naf.5
                @Override // java.lang.Runnable
                public void run() {
                    naf.this.h();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        ReleaseLogUtil.d("R_HwWifiSyncMgr", "dealSynchronizedWifi enter.");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwWifiSyncMgr");
        if (deviceList.isEmpty()) {
            LogUtil.a("HwWifiSyncMgr", "No device connected. ");
            return;
        }
        List<nao> listG = g();
        LogUtil.a("HwWifiSyncMgr", "cachedWifiList size: ", Integer.valueOf(listG.size()));
        for (DeviceInfo deviceInfo : deviceList) {
            Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(this.f42814c).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "HwWifiSyncMgr");
            if (mapQueryDeviceCapability.containsKey(deviceInfo.getDeviceIdentify())) {
                DeviceCapability deviceCapability = mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
                if (deviceCapability == null || !deviceCapability.isSupportSyncWifi()) {
                    LogUtil.a("HwWifiSyncMgr", "Cur device is not support sync wifi capability: ", deviceInfo.toString());
                } else {
                    Iterator<nao> it = listG.iterator();
                    while (it.hasNext()) {
                        e().e(deviceInfo.getDeviceIdentify(), it.next());
                    }
                }
            }
        }
    }

    private void e(String str, String str2, String str3, int i, String str4) {
        DeviceCommand deviceCommandA = a(c(str, str2, str3, i, str4));
        deviceCommandA.setmIdentify(str);
        if (e(str) && TextUtils.isEmpty(str4)) {
            LogUtil.j("HwWifiSyncMgr", "wifiModeCapabilities.isEmpty");
        } else {
            mkf.e(this.f42814c).sendDeviceData(deviceCommandA);
        }
    }

    private boolean e(String str) {
        DeviceInfo deviceInfoC = mgg.c(str, "HwWifiSyncMgr");
        if (deviceInfoC == null || !eey.d(deviceInfoC, 241) || deviceInfoC.getDeviceConnectState() != 2) {
            return false;
        }
        LogUtil.a("HwWifiSyncMgr", "isSupportNewWifiCapability");
        return true;
    }

    private String c(String str, String str2, String str3, int i, String str4) {
        String strA;
        String strA2 = eeq.a(str2);
        String strA3 = eeq.a(str3);
        String strD = eeq.d(i);
        String strA4 = a(1, strA2);
        String strA5 = a(2, strA3);
        String strA6 = a(3, strD);
        if (!e(str)) {
            strA = "";
        } else {
            strA = a(4, eeq.a(str4));
        }
        return strA4 + strA5 + strA6 + strA;
    }

    private String a(int i, String str) {
        return eeq.d(i) + eeq.d(str.length() / 2) + str;
    }

    private DeviceCommand a(String str) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(47);
        byte[] bArrC = eeq.c(str);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setDataLen(bArrC.length);
        return deviceCommand;
    }

    private boolean f() {
        HiUserPreference userPreference = HiHealthManager.d(this.f42814c).getUserPreference("sync_wifi_toggle_status");
        if (userPreference == null) {
            HiHealthManager.d(this.f42814c).setUserPreference(new HiUserPreference("sync_wifi_toggle_status", "1"), true);
            userPreference = HiHealthManager.d(this.f42814c).getUserPreference("sync_wifi_toggle_status");
        }
        if (userPreference == null) {
            LogUtil.j("HwWifiSyncMgr", "The phone sync wifi HiUserPreference is error");
            return false;
        }
        String value = userPreference.getValue();
        if (TextUtils.isEmpty(value)) {
            LogUtil.j("HwWifiSyncMgr", "The phone sync wifi toggle status is error");
            return false;
        }
        if (!"0".equals(value)) {
            return true;
        }
        LogUtil.a("HwWifiSyncMgr", "The phone sync wifi toggle is closed");
        return false;
    }

    private void e(String str, nao naoVar) {
        if (naoVar == null) {
            LogUtil.j("HwWifiSyncMgr", "sendMessageEntity is null");
            return;
        }
        String strE = naoVar.e();
        int iC = naoVar.c();
        String strB = naoVar.b();
        String strA = naoVar.a();
        LogUtil.a("HwWifiSyncMgr", "sendMessageEntity.getWifiModeCapabilities = " + naoVar.a());
        try {
            String str2 = new String(Base64.b(HwEncryptUtil.b(BaseApplication.getContext()).c(1, strB)), StandardCharsets.UTF_8);
            LogUtil.a("HwWifiSyncMgr", "sendCachedWi******age p******d.len = " + str2.length());
            if (strE == null) {
                LogUtil.j("HwWifiSyncMgr", "ssid is null");
            } else {
                LogUtil.a("HwWifiSyncMgr", "sendSsid:", CommonUtil.n(strE));
                e(str, strE, str2, iC, strA);
            }
        } catch (GeneralSecurityException unused) {
            LogUtil.e("HwWifiSyncMgr", "data is not right");
        }
    }

    private void b(String str) {
        try {
            List<eew> listE = new eet().b(str).e();
            if (listE != null && !listE.isEmpty()) {
                if (Integer.parseInt(listE.get(0).b(), 16) == 100000) {
                    LogUtil.a("HwWifiSyncMgr", "The device received wifi data success");
                    return;
                } else {
                    LogUtil.a("HwWifiSyncMgr", "The device received wifi data fail");
                    return;
                }
            }
            LogUtil.j("HwWifiSyncMgr", "The device return tlvList data is error");
        } catch (eeu unused) {
            LogUtil.e("HwWifiSyncMgr", "parseDeviceData TlvException is happened");
        } catch (NumberFormatException unused2) {
            LogUtil.e("HwWifiSyncMgr", "parseDeviceData NumberFormatException is happened");
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        a(bArr);
    }

    private List<nao> g() {
        try {
            List<nao> list = (List) new Gson().fromJson(KeyValDbManager.d(BaseApplication.getContext()).c("cached_wifi_message"), new TypeToken<List<nao>>() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwwifisyncmgr.HwWifiSyncMgr$2
            }.getType());
            if (list == null || list.size() < 1) {
                LogUtil.j("HwWifiSyncMgr", "cachedList is Empty");
                return new ArrayList();
            }
            LogUtil.a("HwWifiSyncMgr", "cachedList;", Integer.valueOf(list.size()));
            return list;
        } catch (JsonSyntaxException unused) {
            LogUtil.e("HwWifiSyncMgr", "get cachedList jsonSyntaxException");
            return Arrays.asList(nan.a());
        } catch (NumberFormatException unused2) {
            LogUtil.e("HwWifiSyncMgr", "sendMessage NumberFormatException");
            return Arrays.asList(nan.a());
        }
    }

    private void j() {
        if (EnvironmentInfo.l()) {
            ConnectivityManager.NetworkCallback networkCallback = this.f42813a;
            if (networkCallback != null) {
                NetworkUtil.e(networkCallback);
                this.f42813a = null;
            }
            this.f42813a = new ConnectivityManager.NetworkCallback() { // from class: naf.2
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    super.onAvailable(network);
                    naf.this.d(true);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    super.onLost(network);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    super.onCapabilitiesChanged(network, networkCapabilities);
                    LogUtil.a("HwWifiSyncMgr", "enter onCapabilitiesChanged");
                    if (networkCapabilities.hasCapability(16)) {
                        LogUtil.a("HwWifiSyncMgr", "currentNetwork is available");
                        naf.this.d(true);
                    } else {
                        LogUtil.a("HwWifiSyncMgr", "currentNetwork is unavailable");
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        if (!z) {
            LogUtil.j("HwWifiSyncMgr", "updateWifiMessageDeal isNetworkConnected is false");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: naf.1
                @Override // java.lang.Runnable
                public void run() {
                    nan.b();
                }
            });
        }
    }

    private void i() {
        LogUtil.a("HwWifiSyncMgr", "initDeviceState");
        for (DeviceInfo deviceInfo : ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwWifiSyncMgr")) {
            String strC = nio.c(deviceInfo.getDeviceIdentify());
            int deviceFactoryReset = deviceInfo.getDeviceFactoryReset();
            LogUtil.a("HwWifiSyncMgr", "initDeviceState deviceId: ", strC, ", type: ", Integer.valueOf(deviceFactoryReset));
            boolean z = true;
            if (deviceFactoryReset != 1) {
                z = false;
            }
            b(strC, z);
        }
    }

    private void b(final String str, boolean z) {
        List<String> listC = WifiConnectReceiver.a().c();
        if (z) {
            if (listC.contains(str)) {
                return;
            }
            listC.add(str);
            return;
        }
        listC.removeIf(new Predicate() { // from class: nai
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((String) obj).equals(str);
            }
        });
    }
}
