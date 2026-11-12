package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.yrn.netinfo.types.CellularGeneration;
import com.reactnativecommunity.yrn.netinfo.types.ConnectionType;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(24)
public class zjg extends cf4 {
    public final a h;
    public Network i;
    public NetworkCapabilities j;

    public class a extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            zjg.this.i = network;
            zjg zjgVar = zjg.this;
            zjgVar.j = zjgVar.b().getNetworkCapabilities(network);
            zjg.this.l();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            zjg.this.i = network;
            zjg.this.j = networkCapabilities;
            zjg.this.l();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            zjg.this.i = network;
            zjg zjgVar = zjg.this;
            zjgVar.j = zjgVar.b().getNetworkCapabilities(network);
            zjg.this.l();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i) {
            zjg.this.i = network;
            zjg zjgVar = zjg.this;
            zjgVar.j = zjgVar.b().getNetworkCapabilities(network);
            zjg.this.l();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            zjg.this.i = null;
            zjg.this.j = null;
            zjg.this.l();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            zjg.this.i = null;
            zjg.this.j = null;
            zjg.this.l();
        }

        public a() {
        }
    }

    public zjg(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.h = new a();
        this.i = null;
        this.j = null;
    }

    @Override // defpackage.cf4
    @SuppressLint({"MissingPermission"})
    public void e() {
        try {
            b().registerDefaultNetworkCallback(this.h);
        } catch (SecurityException unused) {
        }
    }

    @Override // defpackage.cf4
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
