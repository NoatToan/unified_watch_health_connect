package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.netinfo.types.CellularGeneration;
import com.reactnativecommunity.netinfo.types.ConnectionType;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(24)
public class xjg extends df4 {
    public final b h;
    public Network i;
    public NetworkCapabilities j;

    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            xjg.this.i = network;
            xjg xjgVar = xjg.this;
            xjgVar.j = xjgVar.b().getNetworkCapabilities(network);
            xjg.this.l();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            xjg.this.i = network;
            xjg.this.j = networkCapabilities;
            xjg.this.l();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            xjg.this.i = network;
            xjg xjgVar = xjg.this;
            xjgVar.j = xjgVar.b().getNetworkCapabilities(network);
            xjg.this.l();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i) {
            xjg.this.i = network;
            xjg xjgVar = xjg.this;
            xjgVar.j = xjgVar.b().getNetworkCapabilities(network);
            xjg.this.l();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            xjg.this.i = null;
            xjg.this.j = null;
            xjg.this.l();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            xjg.this.i = null;
            xjg.this.j = null;
            xjg.this.l();
        }
    }

    public xjg(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.i = null;
        this.j = null;
        this.h = new b();
    }

    @Override // defpackage.df4
    @SuppressLint({"MissingPermission"})
    public void e() {
        try {
            b().registerDefaultNetworkCallback(this.h);
        } catch (SecurityException unused) {
        }
    }

    @Override // defpackage.df4
    public void g() {
        try {
            b().unregisterNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void l() {
        ConnectionType connectionType = ConnectionType.UNKNOWN;
        NetworkCapabilities networkCapabilities = this.j;
        CellularGeneration cellularGenerationFromNetworkInfo = null;
        boolean z = false;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(2)) {
                connectionType = ConnectionType.BLUETOOTH;
            } else if (this.j.hasTransport(0)) {
                connectionType = ConnectionType.CELLULAR;
            } else if (this.j.hasTransport(3)) {
                connectionType = ConnectionType.ETHERNET;
            } else if (this.j.hasTransport(1)) {
                connectionType = ConnectionType.WIFI;
            } else if (this.j.hasTransport(4)) {
                connectionType = ConnectionType.VPN;
            }
            if (this.j.hasCapability(12) && this.j.hasCapability(16)) {
                z = true;
            }
            if (this.i != null && connectionType == ConnectionType.CELLULAR) {
                cellularGenerationFromNetworkInfo = CellularGeneration.fromNetworkInfo(b().getNetworkInfo(this.i));
            }
        } else {
            connectionType = ConnectionType.NONE;
        }
        h(connectionType, cellularGenerationFromNetworkInfo, z);
    }
}
