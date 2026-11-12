package defpackage;

import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.example.statistics.export.OneTrackConstant;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.reactnativecommunity.netinfo.types.CellularGeneration;
import com.reactnativecommunity.netinfo.types.ConnectionType;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class df4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f15470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WifiManager f15471b;
    public final TelephonyManager c;
    public final ReactApplicationContext d;
    public ConnectionType e = ConnectionType.UNKNOWN;
    public CellularGeneration f = null;
    public boolean g = false;

    public df4(ReactApplicationContext reactApplicationContext) {
        this.d = reactApplicationContext;
        this.f15470a = (ConnectivityManager) reactApplicationContext.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        this.f15471b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.c = (TelephonyManager) reactApplicationContext.getSystemService("phone");
    }

    public final WritableMap a() {
        WritableNativeMap writableNativeMap;
        WifiInfo connectionInfo;
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putString("type", this.e.label);
        boolean z = (this.e.equals(ConnectionType.NONE) || this.e.equals(ConnectionType.UNKNOWN)) ? false : true;
        writableNativeMap2.putBoolean("isConnected", z);
        writableNativeMap2.putBoolean("isInternetReachable", this.g);
        if (z) {
            writableNativeMap = new WritableNativeMap();
            writableNativeMap.putBoolean("isConnectionExpensive", ze4.a(b()));
            if (this.e.equals(ConnectionType.CELLULAR)) {
                CellularGeneration cellularGeneration = this.f;
                if (cellularGeneration != null) {
                    writableNativeMap.putString("cellularGeneration", cellularGeneration.label);
                }
                String networkOperatorName = this.c.getNetworkOperatorName();
                if (networkOperatorName != null) {
                    writableNativeMap.putString("carrier", networkOperatorName);
                }
            } else if (this.e.equals(ConnectionType.WIFI) && (connectionInfo = this.f15471b.getConnectionInfo()) != null) {
                try {
                    String ssid = connectionInfo.getSSID();
                    if (ssid != null && !ssid.contains("<unknown ssid>")) {
                        writableNativeMap.putString("ssid", ssid.replace("\"", ""));
                    }
                } catch (Exception unused) {
                }
                try {
                    writableNativeMap.putInt("strength", WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
                } catch (Exception unused2) {
                }
                try {
                    byte[] byteArray = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                    mjg.a(byteArray);
                    writableNativeMap.putString("ipAddress", InetAddress.getByAddress(byteArray).getHostAddress());
                } catch (Exception unused3) {
                }
                try {
                    byte[] byteArray2 = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                    mjg.a(byteArray2);
                    int networkPrefixLength = (-1) << (32 - NetworkInterface.getByInetAddress(InetAddress.getByAddress(byteArray2)).getInterfaceAddresses().get(1).getNetworkPrefixLength());
                    writableNativeMap.putString("subnet", String.format("%d.%d.%d.%d", Integer.valueOf((networkPrefixLength >> 24) & 255), Integer.valueOf((networkPrefixLength >> 16) & 255), Integer.valueOf((networkPrefixLength >> 8) & 255), Integer.valueOf(networkPrefixLength & 255)));
                } catch (Exception unused4) {
                }
            }
        } else {
            writableNativeMap = null;
        }
        writableNativeMap2.putMap("details", writableNativeMap);
        return writableNativeMap2;
    }

    public ConnectivityManager b() {
        return this.f15470a;
    }

    public void c(Promise promise) {
        promise.resolve(a());
    }

    public ReactApplicationContext d() {
        return this.d;
    }

    public abstract void e();

    public final void f() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) d().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", a());
    }

    public abstract void g();

    public void h(ConnectionType connectionType, CellularGeneration cellularGeneration, boolean z) {
        boolean z2 = connectionType != this.e;
        boolean z3 = cellularGeneration != this.f;
        boolean z4 = z != this.g;
        if (z2 || z3 || z4) {
            this.e = connectionType;
            this.f = cellularGeneration;
            this.g = z;
            f();
        }
    }
}
