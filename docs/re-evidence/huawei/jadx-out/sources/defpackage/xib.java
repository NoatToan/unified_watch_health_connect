package defpackage;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hiai.awareness.client.AwarenessRequest;
import com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager;
import com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pActionListener;
import com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pBroadcastReceiver;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes20.dex */
public class xib {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile xib f53027c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WifiP2pManager.Channel f53028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwWifiP2pTransferManager f53029b;
    private Context e;
    private WifiManager g;
    private String h;
    private WifiP2pBroadcastReceiver i;
    private String j;
    private WifiP2pManager l;
    private long k = 0;
    private volatile int f = 0;
    private WifiP2pActionListener n = new WifiP2pActionListener() { // from class: xib.3
        @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pActionListener
        public void wifiP2pEnabled(boolean z) {
            if (!z) {
                LogUtil.b("WifiP2pGo", "wifiP2p is not enabled");
                xib.this.f53029b.c(false);
                return;
            }
            xib.this.j = xik.e();
            xib.this.h = xik.b();
            LogUtil.b("WifiP2pGo", "wifiP2pEnabled mSsid is: ", xib.this.j, "wifiP2pEnabled mPassphrase is: ", xib.this.h);
            xib.this.d(1);
        }

        @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pActionListener
        public void onConnectionInfoAvailable(WifiP2pInfo wifiP2pInfo) {
            LogUtil.b("WifiP2pGo", "onConnectionInfoAvailable");
            if (wifiP2pInfo == null || wifiP2pInfo.groupOwnerAddress == null) {
                return;
            }
            String hostAddress = wifiP2pInfo.groupOwnerAddress.getHostAddress();
            if (hostAddress != null) {
                LogUtil.b("WifiP2pGo", "onConnectionInfoAvailable serverSocketIp is: ", hostAddress);
                xib.this.f53029b.a(hostAddress);
            } else {
                LogUtil.b("WifiP2pGo", "onConnectionInfoAvailable serverSocketIp is null");
                xib.this.f53029b.a("");
            }
        }

        @Override // com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pActionListener
        public void onDisconnection() {
            LogUtil.e("WifiP2pGo", "onDisconnection enter.");
        }

        @Override // android.net.wifi.p2p.WifiP2pManager.ChannelListener
        public void onChannelDisconnected() {
            cpk.d("WifiP2pStatusKey", "0");
            LogUtil.b("WifiP2pGo", "onChannelDisconnected enter.");
            xib.this.e();
        }
    };

    protected xib(Context context) {
        this.e = context;
    }

    public void c() {
        this.k = System.currentTimeMillis();
    }

    public static xib b(Context context) {
        xib xibVar;
        synchronized (d) {
            if (f53027c == null) {
                f53027c = new xib(context);
            }
            xibVar = f53027c;
        }
        return xibVar;
    }

    public void b() {
        HwWifiP2pTransferManager hwWifiP2pTransferManagerA = HwWifiP2pTransferManager.a();
        this.f53029b = hwWifiP2pTransferManagerA;
        hwWifiP2pTransferManagerA.v();
        Object systemService = this.f53029b.d().getSystemService("wifip2p");
        if (systemService instanceof WifiP2pManager) {
            LogUtil.b("WifiP2pGo", "initWifiP2p enter.");
            WifiP2pManager wifiP2pManager = (WifiP2pManager) systemService;
            this.l = wifiP2pManager;
            this.f53028a = wifiP2pManager.initialize(this.f53029b.d(), Looper.getMainLooper(), null);
            this.i = new WifiP2pBroadcastReceiver(this.l, this.f53028a, this.n);
            BroadcastManagerUtil.a(BaseApplication.b(), this.i, WifiP2pBroadcastReceiver.e());
            return;
        }
        LogUtil.e("WifiP2pGo", "WifiP2pManager is null, device not support.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final int i) {
        WifiInfo connectionInfo;
        WifiP2pManager.Channel channel = this.f53028a;
        HwWifiP2pTransferManager hwWifiP2pTransferManager = this.f53029b;
        if (hwWifiP2pTransferManager == null || channel == null) {
            LogUtil.b("WifiP2pGo", "channel is null, or mHwWifiP2pTransferManager is null.");
            return;
        }
        if (hwWifiP2pTransferManager.k()) {
            lng.c("WifiP2PTransfer", "Failed to create wifip2p GO due to hotspot open.");
            LogUtil.b("WifiP2pGo", "hotSpot open, not create group.");
            return;
        }
        int frequency = 0;
        if (i == 1) {
            this.f = 0;
        }
        WifiP2pConfig.Builder builderAA_ = znr.aA_();
        builderAA_.setNetworkName(this.j);
        builderAA_.setPassphrase(this.h);
        if (this.e.getSystemService("wifi") instanceof WifiManager) {
            this.g = (WifiManager) this.e.getSystemService("wifi");
        }
        WifiManager wifiManager = this.g;
        if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
            frequency = connectionInfo.getFrequency();
        }
        LogUtil.e("WifiP2pGo", "createGroup frequency: ", Integer.valueOf(frequency));
        if (frequency > 2400 && frequency < 2500) {
            builderAA_.setGroupOperatingFrequency(frequency);
        } else {
            builderAA_.setGroupOperatingBand(1);
        }
        this.l.createGroup(channel, builderAA_.build(), new WifiP2pManager.ActionListener() { // from class: xib.5
            @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
            public void onSuccess() {
                xib.this.h();
            }

            @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
            public void onFailure(int i2) {
                xib.this.d(i, i2);
            }
        });
    }

    public void a() {
        LogUtil.b("WifiP2pGo", "noCreateGroup");
        WifiP2pManager.Channel channel = this.f53028a;
        if (channel != null) {
            try {
                channel.close();
            } catch (Exception e) {
                LogUtil.d("WifiP2pGo", "noCreateGroup : ", ExceptionUtils.c(e));
            }
        }
        if (this.i != null) {
            try {
                BaseApplication.b().unregisterReceiver(this.i);
            } catch (IllegalArgumentException e2) {
                LogUtil.d("WifiP2pGo", "noCreateGroup : ", ExceptionUtils.c(e2));
            }
        }
        this.f53028a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            Thread.sleep(50L);
        } catch (InterruptedException unused) {
            LogUtil.e("WifiP2pGo", "InterruptedException");
        }
        WifiP2pManager.Channel channel = this.f53028a;
        if (channel == null) {
            LogUtil.e("WifiP2pGo", "channel is null, please check");
        } else {
            this.l.requestGroupInfo(channel, new WifiP2pManager.GroupInfoListener() { // from class: xib.1
                @Override // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
                public void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
                    int frequency;
                    if (wifiP2pGroup != null) {
                        frequency = wifiP2pGroup.getFrequency();
                        LogUtil.b("WifiP2pGo", "wifiP2pGroup.getFrequency:", Integer.valueOf(wifiP2pGroup.getFrequency()));
                    } else {
                        frequency = 0;
                    }
                    if (frequency > 2500) {
                        xib.this.f53029b.c(false);
                        return;
                    }
                    LogUtil.b("WifiP2pGo", "createGroup onSuccess");
                    xib.this.f53029b.d(frequency);
                    xib.this.f53029b.b(xib.this.j);
                    xib.this.f53029b.e(xib.this.h);
                    xib.this.f53029b.c(true);
                    lng.b(System.currentTimeMillis() - xib.this.k);
                    cpk.d("WifiP2pStatusKey", "1");
                }
            });
        }
    }

    private boolean j() {
        LogUtil.b("WifiP2pGo", "permission : ", Integer.valueOf(BaseApplication.b().checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION")));
        return BaseApplication.b().checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2) {
        LogUtil.e("WifiP2pGo", "onFailure : ", Integer.valueOf(i2));
        if (i2 == 0) {
            if (!j()) {
                a();
                LogUtil.b("WifiP2pGo", "no permission.");
                lng.c("WifiP2PTransfer", "No sufficient permission for create wifip2p GO.");
                xgx.d().notification(xgx.d().noCloudVersion() ? 4 : 5);
                this.f53029b.c(false);
                return;
            }
            LogUtil.b("WifiP2pGo", "check app, has background location permission, no permission error, try again.");
        }
        if (i2 != 1 && i2 != 2) {
            if (i == 1) {
                g();
                return;
            }
            return;
        }
        String strE = cpk.e("WifiP2pStatusKey", "");
        LogUtil.b("WifiP2pGo", "wifiStatus : ", strE);
        if (TextUtils.isEmpty(strE) || "1".equals(strE)) {
            g();
        } else {
            a();
            this.f53029b.c(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f == 1) {
            LogUtil.e("WifiP2pGo", "wifi busy, app system remove wifi and try again. Do not deal this disconnect");
            this.f = 0;
        } else {
            if (this.f53029b == null) {
                return;
            }
            LogUtil.b("WifiP2pGo", AwarenessRequest.MessageType.DISCONNECT);
            this.f53029b.b(1015, "wifi change, may user close the wifi, please check.");
            this.f53029b.c();
        }
    }

    public void d() {
        cpk.d("WifiP2pStatusKey", "0");
        LogUtil.b("WifiP2pGo", "disconnectWifi enter.");
        HwWifiP2pTransferManager hwWifiP2pTransferManager = this.f53029b;
        if (hwWifiP2pTransferManager == null) {
            return;
        }
        if (this.i != null) {
            try {
                hwWifiP2pTransferManager.d().unregisterReceiver(this.i);
                LogUtil.b("WifiP2pGo", "unregisterReceiver success.");
            } catch (IllegalArgumentException e) {
                LogUtil.d("WifiP2pGo", "disconnectWifi broadcast : ", cpc.c(e));
            }
        }
        this.f53029b.e(false);
        this.f53029b.c(false);
        WifiP2pManager.Channel channel = this.f53028a;
        if (channel != null) {
            this.l.removeGroup(channel, new WifiP2pManager.ActionListener() { // from class: xib.2
                @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                public void onFailure(int i) {
                    LogUtil.b("WifiP2pGo", "removeGroup onFailure:", Integer.valueOf(i));
                }

                @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                public void onSuccess() {
                    LogUtil.b("WifiP2pGo", "removeGroup onSuccess");
                }
            });
            this.l.cancelConnect(channel, null);
            this.l.clearLocalServices(channel, null);
            this.l.clearServiceRequests(channel, null);
            try {
                channel.close();
            } catch (NullPointerException unused) {
                LogUtil.d("WifiP2pGo", "system throw NullPointerException.");
            }
        }
        LogUtil.b("WifiP2pGo", "wifi manager clear all.");
    }

    private void g() {
        if (this.f53029b == null) {
            return;
        }
        LogUtil.b("WifiP2pGo", "groupBusyAndTryAgain enter");
        WifiP2pManager.Channel channel = this.f53028a;
        if (channel != null) {
            this.l.removeGroup(channel, new WifiP2pManager.ActionListener() { // from class: xib.4
                @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                public void onFailure(int i) {
                    LogUtil.b("WifiP2pGo", "groupBusyAndTryAgain onFailure:", Integer.valueOf(i));
                    xib.this.f53029b.c(false);
                }

                @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                public void onSuccess() {
                    LogUtil.b("WifiP2pGo", "groupBusyAndTryAgain onSuccess");
                    xib.this.d(2);
                }
            });
        }
    }
}
