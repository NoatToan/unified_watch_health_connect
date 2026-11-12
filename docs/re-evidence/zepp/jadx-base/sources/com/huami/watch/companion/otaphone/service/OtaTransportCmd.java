package com.huami.watch.companion.otaphone.service;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.huami.watch.ota.cloud.RomInfo;
import com.huami.watch.transport.ChannelApi;
import com.huami.watch.transport.ConnectionResult;
import com.huami.watch.transport.DataApi;
import com.huami.watch.transport.HmApiClient;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Wearable;
import com.huami.watch.util.Log;
import com.huami.watch.wifi.WifiTransportHandler;
import com.huami.watch.wifi.WifiTypeInfo;

/* JADX INFO: loaded from: classes16.dex */
public class OtaTransportCmd implements HmApiClient.ConnectionCallbacks, HmApiClient.OnConnectionFailedListener {
    public static final int STATE_ADD_EAP_WIFI = 6;
    public static final int STATE_ADD_HIDEN_WIFI = 4;
    public static final int STATE_CANCEL_PASSWORD_INPUT = 3;
    public static final int STATE_CANCEL_WIFI_ADD = 5;
    public static final int STATE_CHECK_UPGRADE = 2;
    public static final int STATE_DATA_CHANNEL_CHANGED = 7;
    public static final int STATE_INPUT_PASSWORD = 1;
    private static final String f = "OtaTransportCmd";
    private static final String g = "com.huami.watch.otaservice";
    private static HmApiClient h;
    private static OtaTransportCmd i;
    private Context a;
    private callback b;
    private DataApi.DataListener c = new a();
    private ChannelApi.ChannelListener d = new b();
    private Handler e = new c();

    public class a implements DataApi.DataListener {
        public a() {
        }

        @Override // com.huami.watch.transport.DataApi.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
        }
    }

    public class b implements ChannelApi.ChannelListener {
        public b() {
        }

        @Override // com.huami.watch.transport.ChannelApi.ChannelListener
        public void onChannelChanged(boolean z) {
            if (z) {
                OtaTransportCmd.this.e.obtainMessage(7, 1).sendToTarget();
            } else {
                OtaTransportCmd.this.e.obtainMessage(7, 0).sendToTarget();
            }
        }
    }

    public class c extends Handler {
        public c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    String str = (String) message.obj;
                    if (OtaTransportCmd.this.b != null) {
                        OtaTransportCmd.this.b.actionAddWifiPassword(str);
                    }
                    break;
                case 2:
                    if (OtaTransportCmd.this.b != null) {
                        OtaTransportCmd.this.b.actionCheckUpgrade();
                    }
                    break;
                case 3:
                    if (OtaTransportCmd.this.b != null) {
                        OtaTransportCmd.this.b.actionCancelPasswordInput();
                    }
                    break;
                case 4:
                    if (OtaTransportCmd.this.b != null) {
                        OtaTransportCmd.this.b.actionAddHidenWifi();
                    }
                    break;
                case 5:
                    if (OtaTransportCmd.this.b != null) {
                        OtaTransportCmd.this.b.actionCancelWifiAdd();
                    }
                    break;
                case 6:
                    String str2 = (String) message.obj;
                    if (OtaTransportCmd.this.b != null) {
                        OtaTransportCmd.this.b.actionAddEapWifi(str2);
                    }
                    break;
                case 7:
                    int iIntValue = ((Integer) message.obj).intValue();
                    if (OtaTransportCmd.this.b != null) {
                        OtaTransportCmd.this.b.dataChannelChanged(iIntValue == 1);
                    }
                    break;
            }
            super.handleMessage(message);
        }
    }

    public interface callback {
        void actionAddEapWifi(String str);

        void actionAddHidenWifi();

        void actionAddWifiPassword(String str);

        void actionCancelPasswordInput();

        void actionCancelWifiAdd();

        void actionCheckUpgrade();

        void dataChannelChanged(boolean z);
    }

    private OtaTransportCmd(Context context) {
        this.a = context;
        if (h == null) {
            HmApiClient hmApiClientBuild = new HmApiClient.Builder(context).addConnectionCallbacks(this).addOnConnectionFailedListener(this).setModuleName("com.huami.watch.otaservice").build();
            h = hmApiClientBuild;
            hmApiClientBuild.connect();
        }
    }

    public static OtaTransportCmd getInstance(Context context) {
        if (i == null) {
            i = new OtaTransportCmd(context.getApplicationContext());
        }
        return i;
    }

    public void cmdCancePasswordInput() {
        if (h == null) {
            return;
        }
        Wearable.DataApi.sendData(h, WifiTransportHandler.BuildCancelWifiPassword("com.huami.watch.otaservice"), null);
    }

    public void cmdCancelWifiAdd() {
        if (h == null) {
            return;
        }
        Wearable.DataApi.sendData(h, WifiTransportHandler.BuildCancelWifiItemAdd("com.huami.watch.otaservice"), null);
    }

    public void cmdPhoneDisconnect() {
        if (h == null) {
            return;
        }
        Wearable.DataApi.sendData(h, WifiTransportHandler.BuildPhoneWifiDisconnect("com.huami.watch.otaservice"), null);
    }

    public void cmdSendHidenWifi(WifiTypeInfo wifiTypeInfo) {
        if (h == null) {
            return;
        }
        Wearable.DataApi.sendData(h, WifiTransportHandler.BuildSendWifiTypeInfo("com.huami.watch.otaservice", wifiTypeInfo), null);
    }

    public void cmdSendPassword(String str, String str2) {
        if (h == null) {
            return;
        }
        Wearable.DataApi.sendData(h, WifiTransportHandler.BuildSendPasswordHandler("com.huami.watch.otaservice", str, str2), null);
    }

    public void cmdSendRomInfo(RomInfo romInfo) {
        if (h == null) {
            return;
        }
        Wearable.DataApi.sendData(h, WifiTransportHandler.BuildSendRomInfo("com.huami.watch.otaservice", romInfo), null);
    }

    public void connect() {
        HmApiClient hmApiClient = h;
        if (hmApiClient == null) {
            return;
        }
        hmApiClient.connect();
    }

    public void destroy() {
        if (h != null) {
            Wearable.DataApi.removeListener(h, this.c);
            Wearable.ChannelApi.removeListener(h, this.d);
            h = null;
        }
        i = null;
    }

    public void disConnect() {
        HmApiClient hmApiClient = h;
        if (hmApiClient == null) {
            return;
        }
        hmApiClient.disconnect();
    }

    public Handler getHandler() {
        return this.e;
    }

    public boolean isConnected() {
        HmApiClient hmApiClient = h;
        if (hmApiClient == null) {
            return false;
        }
        return hmApiClient.isConnected();
    }

    @Override // com.huami.watch.transport.HmApiClient.ConnectionCallbacks
    public void onServicesConnected(Bundle bundle) {
        Log.d(f, "Connected transport services", new Object[0]);
        if (h != null) {
            Wearable.DataApi.addListener(h, this.c);
            Wearable.ChannelApi.addListener(h, this.d);
        }
    }

    @Override // com.huami.watch.transport.HmApiClient.OnConnectionFailedListener
    public void onServicesConnectionFailed(ConnectionResult connectionResult) {
        Log.d(f, "Connect Failed transport services", new Object[0]);
    }

    @Override // com.huami.watch.transport.HmApiClient.ConnectionCallbacks
    public void onServicesDisConnected(ConnectionResult connectionResult) {
        Log.d(f, "DisConnected transport services", new Object[0]);
    }

    public void registerCallback(callback callbackVar) {
        HmApiClient hmApiClient = h;
        if (hmApiClient != null && !hmApiClient.isConnected()) {
            h.connect();
        }
        this.b = callbackVar;
        Log.i(f, "register callback", new Object[0]);
    }

    public void unregisterCallback() {
        this.b = null;
    }
}
