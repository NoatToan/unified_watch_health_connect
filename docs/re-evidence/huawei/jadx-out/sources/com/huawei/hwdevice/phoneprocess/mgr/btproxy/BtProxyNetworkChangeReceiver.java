package com.huawei.hwdevice.phoneprocess.mgr.btproxy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.btproxy.callback.BtProxySleepCallback;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import defpackage.cqj;
import defpackage.eeq;
import defpackage.eey;
import defpackage.mlu;
import defpackage.mlz;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.util.LogUtil;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class BtProxyNetworkChangeReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile BtProxyNetworkChangeReceiver f17458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f17459c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f17460a;
    private int d;
    private int e;
    private int g;
    private int h;
    private Context j = BaseApplication.getContext();
    private DeviceInfo i = null;
    private boolean f = false;
    private boolean n = false;

    private int c(int i) {
        if (i > 0) {
            return i;
        }
        return 0;
    }

    public void a(DeviceInfo deviceInfo) {
        this.i = deviceInfo;
        this.f = mlu.d().a(deviceInfo);
        a(b(deviceInfo));
        LogUtil.a("BtProxyNetworkChangeReceiver", "initNetworkRegister mIsSupportSleepWithoutBtProxy: ", Boolean.valueOf(this.f));
        mlu.d().c(this.i.getDeviceIdentify(), new BtProxySleepCallback() { // from class: mlv
            @Override // com.huawei.hwdevice.phoneprocess.mgr.btproxy.callback.BtProxySleepCallback
            public final void onSleepStatusCallback(int i) {
                this.f41898a.b(i);
            }
        });
        l();
        n();
        try {
            NetworkUtil.d(this.f17460a);
        } catch (RuntimeException unused) {
            LogUtil.c("BtProxyNetworkChangeReceiver", "NetworkUtil registerNetworkCallback exception");
        }
        c(NetworkUtil.i());
        LogUtil.a("BtProxyNetworkChangeReceiver", "NetworkUtil registerNetworkCallback is success");
    }

    public /* synthetic */ void b(int i) {
        LogUtil.a("BtProxyNetworkChangeReceiver", "registerSleepStatusListen callback sleepStatus: ", Integer.valueOf(i));
        if (i == 0) {
            i();
        }
    }

    public static BtProxyNetworkChangeReceiver a() {
        BtProxyNetworkChangeReceiver btProxyNetworkChangeReceiver;
        synchronized (f17459c) {
            LogUtil.a("BtProxyNetworkChangeReceiver", "getInstance()");
            if (f17458b == null) {
                f17458b = new BtProxyNetworkChangeReceiver();
            }
            btProxyNetworkChangeReceiver = f17458b;
        }
        return btProxyNetworkChangeReceiver;
    }

    private void n() {
        this.f17460a = new ConnectivityManager.NetworkCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.btproxy.BtProxyNetworkChangeReceiver.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                super.onAvailable(network);
                if (Build.VERSION.SDK_INT < 28) {
                    LogUtil.a("BtProxyNetworkChangeReceiver", "onAvailable sendNetworkAvailableToDevice");
                    BtProxyNetworkChangeReceiver.this.e();
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                super.onLost(network);
                BtProxyNetworkChangeReceiver btProxyNetworkChangeReceiver = BtProxyNetworkChangeReceiver.this;
                NetworkInfo networkInfoC = btProxyNetworkChangeReceiver.c(btProxyNetworkChangeReceiver.j);
                if (networkInfoC == null || networkInfoC.getType() != 7) {
                    LogUtil.a("BtProxyNetworkChangeReceiver", "currentNetwork is unavailable is Lost");
                    BtProxyNetworkChangeReceiver.this.d();
                } else {
                    LogUtil.a("BtProxyNetworkChangeReceiver", "onLost: currentNetwork is blueTooth");
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                super.onCapabilitiesChanged(network, networkCapabilities);
                LogUtil.a("BtProxyNetworkChangeReceiver", "enter onCapabilitiesChanged");
                BtProxyNetworkChangeReceiver.this.c(networkCapabilities.hasCapability(16));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        if (z) {
            LogUtil.a("BtProxyNetworkChangeReceiver", "currentNetwork is available");
            e();
        } else {
            LogUtil.d("BtProxyNetworkChangeReceiver", "currentNetwork is unavailable");
            d();
        }
    }

    public void e() {
        if (!f()) {
            LogUtil.d("BtProxyNetworkChangeReceiver", "sendNetworkAvailableToDevice return");
            return;
        }
        this.g = o();
        String strE = SharedPreferenceManager.e(this.j, Integer.toString(52), "before_network_type");
        String strE2 = SharedPreferenceManager.e(this.j, Integer.toString(52), "before_network _status");
        if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(strE2)) {
            return;
        }
        this.d = CommonUtil.v(strE);
        int iV = CommonUtil.v(strE2);
        this.e = iV;
        LogUtil.a("BtProxyNetworkChangeReceiver", "beforeNetwork status is:", Integer.valueOf(iV), "beforeNetwork type is:", Integer.valueOf(this.d));
        int i = this.e;
        if (i == 3 && this.h == 3) {
            LogUtil.a("BtProxyNetworkChangeReceiver", "network is not connected and status is not changed");
            return;
        }
        if (i == 4 && this.h == 4 && this.d == this.g) {
            LogUtil.a("BtProxyNetworkChangeReceiver", "network status is connect and network type is not changed");
        } else {
            a(this.d, this.g);
            d(this.g);
        }
    }

    private boolean f() {
        if (!this.f) {
            return true;
        }
        if (mlu.d().d(this.i.getDeviceIdentify()) != 0) {
            return false;
        }
        LogUtil.a("BtProxyNetworkChangeReceiver", "wake up or time is above nine or app is foreground");
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            LogUtil.d("BtProxyNetworkChangeReceiver", "intent is null");
            return;
        }
        String action = intent.getAction();
        LogUtil.a("BtProxyNetworkChangeReceiver", "receive action: ", action);
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action) || "android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            ConnectivityManager connectivityManager = context.getSystemService("connectivity") instanceof ConnectivityManager ? (ConnectivityManager) context.getSystemService("connectivity") : null;
            if (connectivityManager == null) {
                LogUtil.d("BtProxyNetworkChangeReceiver", "connectivityManager is null");
                return;
            }
            if (connectivityManager.getActiveNetworkInfo() == null) {
                LogUtil.d("BtProxyNetworkChangeReceiver", "network info is null");
                d();
                return;
            }
            if (!CommonUtil.ab(this.j)) {
                LogUtil.a("BtProxyNetworkChangeReceiver", "currentNetwork is unavailable");
                d();
                return;
            }
            this.g = o();
            String strE = SharedPreferenceManager.e(this.j, Integer.toString(52), "before_network_type");
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            int iV = CommonUtil.v(strE);
            this.d = iV;
            LogUtil.a("BtProxyNetworkChangeReceiver", "beforeNetwork is:", Integer.valueOf(iV), "currentNetwork is:", Integer.valueOf(this.g));
            a(this.d, this.g);
            d(this.g);
        }
    }

    private void i() {
        LogUtil.a("BtProxyNetworkChangeReceiver", "out sleep. CommonUtil.isNetworkConnected: ", Boolean.valueOf(CommonUtil.ab(this.j)));
        if (!CommonUtil.ab(this.j)) {
            d();
        } else {
            e();
        }
    }

    public void d() {
        if (!f()) {
            LogUtil.d("BtProxyNetworkChangeReceiver", "sendNetworkUnavailableToDevice return");
            return;
        }
        String str = eeq.d(10) + eeq.d(1) + eeq.d(3);
        LogUtil.a("BtProxyNetworkChangeReceiver", str);
        byte[] bArrC = eeq.c(str);
        k();
        d(bArrC);
    }

    private void a(int i, int i2) {
        if (!f()) {
            LogUtil.d("BtProxyNetworkChangeReceiver", "sendNetworkTypeToDevice return");
            return;
        }
        cqj cqjVar = new cqj();
        cqjVar.g(10, 4).g(11, i).g(12, i2);
        if (c(this.i)) {
            try {
                String strH = h();
                int iC = c(CommonUtil.o(this.j));
                cqjVar.b(14, strH).g(15, iC).b(16, g());
            } catch (Exception unused) {
                LogUtil.c("BtProxyNetworkChangeReceiver", "Exception occurs when getBtProxyNetworkStatus");
            }
        }
        byte[] bArrE = cqjVar.e();
        LogUtil.a("BtProxyNetworkChangeReceiver", eeq.e(bArrE));
        d(bArrE);
    }

    private String h() {
        TelephonyManager telephonyManager = (TelephonyManager) ContextCompat.getSystemService(this.j, TelephonyManager.class);
        if (telephonyManager != null) {
            return telephonyManager.getSimOperator();
        }
        return "";
    }

    private String g() {
        WifiInfo connectionInfo;
        WifiManager wifiManager = (WifiManager) this.j.getSystemService("wifi");
        String bssid = (wifiManager == null || !wifiManager.isWifiEnabled() || (connectionInfo = wifiManager.getConnectionInfo()) == null) ? null : connectionInfo.getBSSID();
        if ("02:00:00:00:00:00".equals(bssid) || bssid == null || bssid.isEmpty()) {
            return "d#" + m();
        }
        return "b#" + bssid;
    }

    private String m() {
        ConnectivityManager connectivityManagerN = CommonUtils.n();
        if (connectivityManagerN == null) {
            LogUtil.c("BtProxyNetworkChangeReceiver", "ConnectivityManager is null");
            return "null|null|null";
        }
        Network activeNetwork = connectivityManagerN.getActiveNetwork();
        if (activeNetwork == null) {
            LogUtil.c("BtProxyNetworkChangeReceiver", "Network is null");
            return "null|null|null";
        }
        LinkProperties linkProperties = connectivityManagerN.getLinkProperties(activeNetwork);
        if (linkProperties == null) {
            LogUtil.c("BtProxyNetworkChangeReceiver", "LinkProperties is null");
            return "null|null|null";
        }
        return b(linkProperties) + "|" + a(linkProperties) + "|" + d(linkProperties);
    }

    private String b(LinkProperties linkProperties) {
        InetAddress address;
        String strC = null;
        String strD = null;
        for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
            if (linkAddress != null && (address = linkAddress.getAddress()) != null && !address.isLinkLocalAddress()) {
                int prefixLength = linkAddress.getPrefixLength();
                if (address instanceof Inet4Address) {
                    strD = d(address.getHostAddress(), prefixLength);
                } else if (address instanceof Inet6Address) {
                    strC = c(address.getHostAddress(), prefixLength);
                }
            }
        }
        return strC != null ? strC : strD;
    }

    public static String a(LinkProperties linkProperties) {
        InetAddress gateway;
        for (RouteInfo routeInfo : linkProperties.getRoutes()) {
            if (routeInfo != null && routeInfo.isDefaultRoute() && (gateway = routeInfo.getGateway()) != null) {
                return gateway.getHostAddress();
            }
        }
        return null;
    }

    private String d(LinkProperties linkProperties) {
        List<InetAddress> dnsServers = linkProperties.getDnsServers();
        if (dnsServers.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < dnsServers.size(); i++) {
            InetAddress inetAddress = dnsServers.get(i);
            if (inetAddress != null) {
                arrayList.add(inetAddress.getHostAddress());
                if (arrayList.size() >= 2) {
                    break;
                }
            }
        }
        Collections.sort(arrayList);
        return TextUtils.join(",", arrayList);
    }

    private String d(String str, int i) {
        try {
            int i2 = 0;
            int i3 = 0;
            for (String str2 : str.split("\\.")) {
                i3 = (i3 << 8) | Integer.parseInt(str2);
            }
            if (i != 0) {
                i2 = (-1) << (32 - i);
            }
            int i4 = i3 & i2;
            return (((i4 >> 24) & 255) + "." + ((i4 >> 16) & 255) + "." + ((i4 >> 8) & 255) + "." + (i4 & 255)) + "/" + i;
        } catch (Exception e) {
            LogUtil.c("BtProxyNetworkChangeReceiver", "calculateIPv4Subnet failed", e);
            return null;
        }
    }

    private String c(String str, int i) {
        try {
            int i2 = 0;
            StringBuilder sb = new StringBuilder(b(str).replace(":", "").substring(0, i / 4));
            while (sb.length() < 32) {
                sb.append('0');
            }
            StringBuilder sb2 = new StringBuilder();
            while (i2 < 32) {
                if (i2 > 0) {
                    sb2.append(':');
                }
                int i3 = i2 + 4;
                sb2.append(sb.substring(i2, i3));
                i2 = i3;
            }
            return c(sb2.toString()) + "/" + i;
        } catch (Exception e) {
            LogUtil.c("BtProxyNetworkChangeReceiver", "calculateIPv6Subnet failed", e);
            return null;
        }
    }

    private String b(String str) {
        if (str.contains("::")) {
            String[] strArrSplit = str.split("::");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit.length > 1 ? strArrSplit[1] : "";
            int length = str2.isEmpty() ? 0 : str2.split(":").length;
            int length2 = str3.isEmpty() ? 0 : str3.split(":").length;
            StringBuilder sb = new StringBuilder();
            if (!str2.isEmpty()) {
                sb.append(str2);
            }
            for (int i = 0; i < (8 - length) - length2; i++) {
                if (sb.length() > 0) {
                    sb.append(':');
                }
                sb.append("0");
            }
            if (!str3.isEmpty()) {
                sb.append(':');
                sb.append(str3);
            }
            str = sb.toString();
        }
        String[] strArrSplit2 = str.split(":");
        StringBuilder sb2 = new StringBuilder();
        int length3 = strArrSplit2.length;
        for (int i2 = 0; i2 < length3; i2++) {
            String str4 = strArrSplit2[i2];
            if (sb2.length() > 0) {
                sb2.append(':');
            }
            while (str4.length() < 4) {
                str4 = "0" + str4;
            }
            sb2.append(str4);
        }
        return sb2.toString();
    }

    private String c(String str) {
        String[] strArrSplit = str.split(":");
        int i = 0;
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            strArrSplit[i2] = strArrSplit[i2].replaceFirst("^0+(?!$)", "");
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        for (int i7 = 0; i7 < strArrSplit.length; i7++) {
            if (strArrSplit[i7].equals("0")) {
                if (i5 == -1) {
                    i5 = i7;
                }
                i3++;
            } else {
                if (i3 <= i4 || i3 <= 1) {
                    i3 = i4;
                    i5 = i6;
                }
                i4 = i3;
                i6 = i5;
                i3 = 0;
                i5 = -1;
            }
        }
        if (i3 <= i4 || i3 <= 1) {
            i3 = i4;
            i5 = i6;
        }
        StringBuilder sb = new StringBuilder();
        while (i < strArrSplit.length) {
            if (i == i5) {
                sb.append("::");
                i += i3 - 1;
            } else {
                sb.append(strArrSplit[i]);
                if (i < strArrSplit.length - 1 && i != i5 - 1) {
                    sb.append(":");
                }
            }
            i++;
        }
        return sb.toString();
    }

    private void d(int i) {
        SharedPreferenceManager.e(this.j, Integer.toString(52), "before_network _status", Integer.toString(4), new StorageParams());
        SharedPreferenceManager.e(this.j, Integer.toString(52), "before_network_type", Integer.toString(i), new StorageParams());
    }

    private void k() {
        this.h = 3;
        SharedPreferenceManager.e(this.j, Integer.toString(52), "before_network _status", Integer.toString(3), new StorageParams());
    }

    private int o() {
        int i;
        this.h = 4;
        NetworkInfo networkInfoC = c(this.j);
        if (networkInfoC == null) {
            LogUtil.d("BtProxyNetworkChangeReceiver", "get net work type error");
            return -1;
        }
        int type = networkInfoC.getType();
        if (type == 7) {
            i = 2;
        } else if (type == 0) {
            i = 0;
        } else {
            i = type == 1 ? 1 : 5;
        }
        LogUtil.a("BtProxyNetworkChangeReceiver", "current networkType is ", Integer.valueOf(i));
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NetworkInfo c(Context context) {
        if (!(context.getSystemService("connectivity") instanceof ConnectivityManager)) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        LogUtil.d("BtProxyNetworkChangeReceiver", "get network info is error, connectivityManager is null");
        return null;
    }

    private void d(byte[] bArr) {
        mlz.d().c(bArr, 1);
    }

    public void j() {
        ConnectivityManager.NetworkCallback networkCallback = this.f17460a;
        if (networkCallback != null) {
            try {
                NetworkUtil.e(networkCallback);
                LogUtil.a("BtProxyNetworkChangeReceiver", "NetworkUtil unregisterNetworkCallback is success");
            } catch (IllegalArgumentException unused) {
                LogUtil.c("BtProxyNetworkChangeReceiver", "unregisterNetworkCallback is failed");
            }
        }
    }

    private void l() {
        LogUtil.a("BtProxyNetworkChangeReceiver", "initNetWorkStatusAndType enter.");
        SharedPreferenceManager.e(this.j, Integer.toString(52), "before_network _status", Integer.toString(-1), new StorageParams());
        SharedPreferenceManager.e(this.j, Integer.toString(52), "before_network_type", Integer.toString(-1), new StorageParams());
    }

    public static void c() {
        if (f17458b == null) {
            LogUtil.d("BtProxyNetworkChangeReceiver", "current instance is null");
        } else {
            f17458b = null;
        }
    }

    public boolean b() {
        return this.n;
    }

    public void a(boolean z) {
        this.n = z;
    }

    public boolean b(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, MachineControlPointResponse.OP_CODE_EXTENSION_MULTI_DATA);
    }

    public boolean c(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 321);
    }
}
