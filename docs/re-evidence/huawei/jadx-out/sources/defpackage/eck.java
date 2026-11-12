package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.hms.network.embedded.y;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eck {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f32743c = new Object();
    private static volatile eck e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32744a;
    private CommBaseCallbackInterface d;
    private int f;
    private Context h;
    private d j;
    private WifiManager o;
    private int g = -1;
    private int k = y.f15619c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32745b = false;
    private BroadcastReceiver i = new BroadcastReceiver() { // from class: eck.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                dyg.a(false, "WiFiConnectUtils", "mWiFiConnReceiver intent is null ");
                return;
            }
            dyg.a(false, "WiFiConnectUtils", "mWiFiConnReceiver action ", intent.getAction());
            if ("android.net.wifi.supplicant.STATE_CHANGE".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("supplicantError", -1);
                dyg.a(false, "WiFiConnectUtils", "mWiFiConnReceiver SUPPLICANT_STATE_CHANGED_ACTION. errValue: ", Integer.valueOf(intExtra));
                if (intExtra == 1) {
                    dyg.d(false, "WiFiConnectUtils", "mWiFiConnReceiver SUPPLICANT_STATE_CHANGED_ACTION");
                    eck.this.j.sendEmptyMessage(105);
                    return;
                }
                return;
            }
            if ("android.net.wifi.STATE_CHANGE".equals(intent.getAction()) || "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                dyg.a(false, "WiFiConnectUtils", "mWiFiConnReceiver NETWORK_STATE_CHANGED_ACTION");
                if (networkInfo == null || !NetworkInfo.State.CONNECTED.equals(networkInfo.getState())) {
                    return;
                }
                eck.this.j.sendEmptyMessageDelayed(104, 200L);
                return;
            }
            LogUtil.j("WiFiConnectUtils", "mWiFiConnReceiver receive some unidentified broadcasts action:", intent.getAction());
        }
    };

    private boolean b(int i) {
        return i == 58 || (i == 10 || i == 26);
    }

    private eck(Context context) {
        this.j = null;
        this.h = context.getApplicationContext();
        this.j = new d(this);
        this.o = (WifiManager) this.h.getSystemService("wifi");
    }

    static class d extends StaticHandler<eck> {
        d(eck eckVar) {
            super(eckVar);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessage(eck eckVar, Message message) {
            if (eckVar == null || message == null) {
                return;
            }
            switch (message.what) {
                case 101:
                case 103:
                case 105:
                    eckVar.j();
                    eckVar.d(message.what);
                    break;
                case 102:
                    eckVar.d(message.what);
                    break;
                case 104:
                    eckVar.b();
                    break;
                default:
                    LogUtil.j("WiFiConnectUtils", "TimerHandler what:", Integer.valueOf(message.what));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        int i = this.f;
        if (i > -1) {
            LogUtil.a("WiFiConnectUtils", "removeNetWork networkId:", Integer.valueOf(this.f), "|isRemoveSuccess:", Boolean.valueOf(this.o.removeNetwork(i)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        CommBaseCallbackInterface commBaseCallbackInterface = this.d;
        if (commBaseCallbackInterface != null) {
            commBaseCallbackInterface.onResult(i, null, null);
        }
        e();
    }

    private void d() {
        dyg.a(false, "initData isRegisterReceiver ,", Boolean.valueOf(this.f32745b));
        if (this.f32745b) {
            return;
        }
        dyg.a(false, "initData Register wifi Receiver", new Object[0]);
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
        this.h.registerReceiver(this.i, intentFilter);
        this.f32745b = true;
    }

    public void e() {
        this.k = y.f15619c;
        this.f32744a = null;
        this.g = -1;
        if (this.f32745b) {
            this.h.unregisterReceiver(this.i);
            this.f32745b = false;
        }
        d dVar = this.j;
        if (dVar != null) {
            dVar.removeCallbacksAndMessages(null);
        }
    }

    public static eck e(Context context) {
        eck eckVar;
        synchronized (f32743c) {
            if (context != null) {
                if (e == null) {
                    e = new eck(context.getApplicationContext());
                }
                eckVar = e;
            } else {
                eckVar = e;
            }
            throw th;
        }
        return eckVar;
    }

    public void a(ScanResult scanResult, String str, boolean z, CommBaseCallbackInterface commBaseCallbackInterface) {
        this.d = commBaseCallbackInterface;
        d(scanResult.SSID, str, e(scanResult), z);
    }

    public void c(String str, String str2, int i, boolean z, CommBaseCallbackInterface commBaseCallbackInterface) {
        this.d = commBaseCallbackInterface;
        d(str, str2, i, z);
    }

    private boolean d(String str, String str2, int i, boolean z) {
        if (!this.o.isWifiEnabled()) {
            d(103);
        }
        d();
        WifiConfiguration wifiConfigurationE = e(str, i);
        if (wifiConfigurationE == null) {
            this.f = this.o.addNetwork(c(i, str, str2, new WifiConfiguration()));
        } else {
            int i2 = wifiConfigurationE.networkId;
            if (z) {
                int iUpdateNetwork = this.o.updateNetwork(c(i, str, str2, wifiConfigurationE));
                this.f = iUpdateNetwork;
                if (iUpdateNetwork <= -1) {
                    LogUtil.a("WiFiConnectUtils", "modify wifi config networkId error, use old network connect");
                    this.f = i2;
                }
            } else {
                this.f = wifiConfigurationE.networkId;
            }
        }
        LogUtil.a("WiFiConnectUtils", "connect networkId is:", Integer.valueOf(this.f));
        this.j.sendEmptyMessageDelayed(101, this.k);
        this.f32744a = str;
        int i3 = this.f;
        this.g = i3;
        if (i3 >= 0) {
            boolean zEnableNetwork = this.o.enableNetwork(i3, true);
            dyg.a(false, "WiFiConnectUtils", "connect enableNetwork is:", Boolean.valueOf(zEnableNetwork));
            if (zEnableNetwork) {
                dyg.a(false, "WiFiConnectUtils", "connect saveConfiguration:", Boolean.valueOf(this.o.saveConfiguration()), "--reconnect:", Boolean.valueOf(this.o.reconnect()));
                return true;
            }
        }
        return false;
    }

    public void c() {
        WifiInfo connectionInfo;
        if (!this.o.isWifiEnabled() || (connectionInfo = this.o.getConnectionInfo()) == null) {
            return;
        }
        int networkId = connectionInfo.getNetworkId();
        this.o.disableNetwork(networkId);
        dyg.a(false, "WiFiConnectUtils", " disableCurrentNetwork current netid is: ", Integer.valueOf(networkId));
    }

    public boolean a() {
        if (this.g <= 0) {
            return false;
        }
        c();
        dyg.a(false, "WiFiConnectUtils", "reConnectLastConfig mLastNetid is:", Integer.valueOf(this.g));
        this.o.enableNetwork(this.g, true);
        return this.o.reassociate();
    }

    public WifiConfiguration c(int i, String str, String str2, WifiConfiguration wifiConfiguration) {
        WifiConfiguration wifiConfigurationA = a(str, wifiConfiguration);
        if (i == 0) {
            wifiConfigurationA.wepKeys[0] = "\"\"";
            wifiConfigurationA.allowedKeyManagement.set(0);
            wifiConfigurationA.wepTxKeyIndex = 0;
            return wifiConfigurationA;
        }
        if (i == 1) {
            return e(str2, wifiConfigurationA);
        }
        if (i != 2) {
            if (i != 3) {
                return null;
            }
            wifiConfigurationA.allowedKeyManagement.set(2);
            wifiConfigurationA.allowedKeyManagement.set(3);
            return wifiConfigurationA;
        }
        wifiConfigurationA.allowedAuthAlgorithms.set(0);
        wifiConfigurationA.allowedGroupCiphers.set(2);
        wifiConfigurationA.allowedPairwiseCiphers.set(1);
        wifiConfigurationA.allowedGroupCiphers.set(3);
        wifiConfigurationA.allowedPairwiseCiphers.set(2);
        wifiConfigurationA.status = 2;
        wifiConfigurationA.allowedKeyManagement.set(1);
        if (str2.length() != 0) {
            if (str2.matches("[0-9A-Fa-f]{64}")) {
                wifiConfigurationA.preSharedKey = str2;
                return wifiConfigurationA;
            }
            wifiConfigurationA.preSharedKey = "\"" + str2 + '\"';
        }
        return wifiConfigurationA;
    }

    private WifiConfiguration e(String str, WifiConfiguration wifiConfiguration) {
        wifiConfiguration.wepKeys[0] = "\"" + str + "\"";
        wifiConfiguration.allowedGroupCiphers.set(3);
        wifiConfiguration.allowedGroupCiphers.set(2);
        wifiConfiguration.allowedGroupCiphers.set(0);
        wifiConfiguration.allowedGroupCiphers.set(1);
        wifiConfiguration.allowedKeyManagement.set(0);
        wifiConfiguration.allowedAuthAlgorithms.set(0);
        wifiConfiguration.allowedAuthAlgorithms.set(1);
        int length = str.length();
        if (str.matches("[0-9A-Fa-f]*")) {
            if (b(length)) {
                wifiConfiguration.wepKeys[0] = str;
            } else {
                wifiConfiguration.wepKeys[0] = "\"" + str + '\"';
            }
        } else {
            wifiConfiguration.wepKeys[0] = "\"" + str + '\"';
        }
        wifiConfiguration.wepTxKeyIndex = 0;
        return wifiConfiguration;
    }

    private WifiConfiguration a(String str, WifiConfiguration wifiConfiguration) {
        wifiConfiguration.allowedAuthAlgorithms.clear();
        wifiConfiguration.allowedGroupCiphers.clear();
        wifiConfiguration.allowedKeyManagement.clear();
        wifiConfiguration.allowedPairwiseCiphers.clear();
        wifiConfiguration.allowedProtocols.clear();
        wifiConfiguration.SSID = b(str);
        wifiConfiguration.hiddenSSID = true;
        return wifiConfiguration;
    }

    public String b(String str) {
        return "\"" + str + "\"";
    }

    public WifiConfiguration e(String str, int i) {
        List<WifiConfiguration> listB = ecs.b(this.o);
        if (njy.e(listB)) {
            dyg.a(false, "WiFiConnectUtils", "configs == null");
            return null;
        }
        for (WifiConfiguration wifiConfiguration : listB) {
            dyg.a(false, "WiFiConnectUtils", "isExsitsConfiguration =>", wifiConfiguration.SSID);
            if (wifiConfiguration.SSID.equals("\"" + str + "\"") && i == d(wifiConfiguration)) {
                return wifiConfiguration;
            }
        }
        return null;
    }

    public static int d(WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration == null) {
            dyg.c(false, "WiFiConnectUtils", "config == null");
            return 0;
        }
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            return 2;
        }
        if (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) {
            return 3;
        }
        return wifiConfiguration.wepKeys[0] != null ? 1 : 0;
    }

    public static int e(ScanResult scanResult) {
        if (scanResult == null) {
            dyg.c(false, "WiFiConnectUtils", "scanResult == null");
            return 0;
        }
        if (scanResult.capabilities.contains("WEP") || scanResult.capabilities.contains("wep")) {
            return 1;
        }
        if (scanResult.capabilities.contains("PSK")) {
            return 2;
        }
        if (scanResult.capabilities.contains("SAE")) {
            return 7;
        }
        return scanResult.capabilities.contains("EAP") ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        String strA = ecs.a(this.h);
        if (!TextUtils.isEmpty(strA)) {
            String strC = ecs.c(strA);
            dyg.a(true, "WiFiConnectUtils", "compareConnect current ssid ", strC, "|mConnectSsid = ", this.f32744a);
            String str = this.f32744a;
            if (str != null && str.equals(strC)) {
                if (ecs.h(this.h)) {
                    dyg.a(false, "WiFiConnectUtils", "compareConnect connect success...");
                    this.j.sendEmptyMessage(102);
                    return;
                }
                return;
            }
            a();
            return;
        }
        dyg.a(false, "WiFiConnectUtils", "compareConnect not connect wifi...");
    }

    public void c(Context context, String str, int i) {
        if (context == null) {
            LogUtil.j("WiFiConnectUtils", "clearConfig() context is null");
            return;
        }
        WifiConfiguration wifiConfigurationE = e(str, i);
        if (wifiConfigurationE != null) {
            Object systemService = context.getSystemService("wifi");
            if (systemService instanceof WifiManager) {
                WifiManager wifiManager = (WifiManager) systemService;
                if (wifiConfigurationE.networkId > 0) {
                    wifiManager.disconnect();
                    wifiManager.removeNetwork(wifiConfigurationE.networkId);
                    wifiManager.saveConfiguration();
                } else {
                    wifiManager.disconnect();
                    a(wifiManager, wifiConfigurationE.SSID);
                }
            }
        }
    }

    public void a(WifiManager wifiManager, String str) {
        if (wifiManager == null) {
            LogUtil.j("WiFiConnectUtils", "removeWifiBySsid wifiManager is null");
            return;
        }
        List<WifiConfiguration> listB = ecs.b(wifiManager);
        if (njy.e(listB)) {
            LogUtil.e("WiFiConnectUtils", "removeWifiBySsid wifiConfigs is null");
            return;
        }
        for (WifiConfiguration wifiConfiguration : listB) {
            if (wifiConfiguration.SSID.equals(str)) {
                wifiManager.removeNetwork(wifiConfiguration.networkId);
                wifiManager.saveConfiguration();
            }
        }
    }
}
