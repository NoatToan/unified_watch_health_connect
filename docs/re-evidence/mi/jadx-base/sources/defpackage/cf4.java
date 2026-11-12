package defpackage;

import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.example.statistics.export.OneTrackConstant;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.reactnativecommunity.yrn.netinfo.types.CellularGeneration;
import com.reactnativecommunity.yrn.netinfo.types.ConnectionType;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f5270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WifiManager f5271b;
    public final TelephonyManager c;
    public final ReactApplicationContext d;
    public ConnectionType e = ConnectionType.UNKNOWN;
    public CellularGeneration f = null;
    public boolean g = false;

    public cf4(ReactApplicationContext reactApplicationContext) {
        this.d = reactApplicationContext;
        this.f5270a = (ConnectivityManager) reactApplicationContext.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        this.f5271b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.c = (TelephonyManager) reactApplicationContext.getSystemService("phone");
    }

    public final WritableMap a() {
        WritableNativeMap writableNativeMap;
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
            } else if (this.e.equals(ConnectionType.WIFI)) {
                writableNativeMap.putString("ssid", "");
                writableNativeMap.putInt("strength", -127);
                writableNativeMap.putString("ipAddress", "");
                writableNativeMap.putString("subnet", "");
            }
        } else {
            writableNativeMap = null;
        }
        writableNativeMap2.putMap("details", writableNativeMap);
        return writableNativeMap2;
    }

    public ConnectivityManager b() {
        return this.f5270a;
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
