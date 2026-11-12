package com.huawei.unitedevice.hwwifip2ptransfermgr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.BadParcelableException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes20.dex */
public class WifiP2pBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WifiP2pManager f29875a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WifiP2pManager.Channel f29876c;
    private WifiP2pActionListener d;

    public WifiP2pBroadcastReceiver(WifiP2pManager wifiP2pManager, WifiP2pManager.Channel channel, WifiP2pActionListener wifiP2pActionListener) {
        this.f29875a = wifiP2pManager;
        this.f29876c = channel;
        this.d = wifiP2pActionListener;
    }

    public static IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.p2p.PEERS_CHANGED");
        intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.p2p.THIS_DEVICE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        return intentFilter;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        byte b2;
        if (intent == null) {
            LogUtil.d("WifiP2pBroadcastReceiver", "intent is null");
            return;
        }
        LogUtil.b("WifiP2pBroadcastReceiver", "Action is: ", intent.getAction());
        if (TextUtils.isEmpty(intent.getAction())) {
            LogUtil.e("WifiP2pBroadcastReceiver", "action is empty.");
            return;
        }
        String action = intent.getAction();
        action.hashCode();
        int iHashCode = action.hashCode();
        if (iHashCode != -1772632330) {
            if (iHashCode != 941935981) {
                if (iHashCode == 1695662461 && action.equals("android.net.wifi.p2p.STATE_CHANGED")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (action.equals("com.huawei.bone.action.CONNECTION_STATE_CHANGED")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (action.equals("android.net.wifi.p2p.CONNECTION_STATE_CHANGE")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            c(intent);
            return;
        }
        if (b2 == 1) {
            a(intent);
        } else if (b2 != 2) {
            LogUtil.e("WifiP2pBroadcastReceiver", "unknown action.");
        } else {
            e(intent);
        }
    }

    private void c(Intent intent) {
        try {
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (networkInfo == null) {
                LogUtil.e("WifiP2pBroadcastReceiver", "error, can not get network info.");
            } else if (!networkInfo.isConnected()) {
                LogUtil.b("WifiP2pBroadcastReceiver", "Disconnect P2P");
            } else {
                this.f29875a.requestConnectionInfo(this.f29876c, new WifiP2pManager.ConnectionInfoListener() { // from class: com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pBroadcastReceiver.4
                    @Override // android.net.wifi.p2p.WifiP2pManager.ConnectionInfoListener
                    public void onConnectionInfoAvailable(WifiP2pInfo wifiP2pInfo) {
                        if (wifiP2pInfo != null) {
                            LogUtil.b("WifiP2pBroadcastReceiver", "get WiFip2p info success");
                        } else {
                            LogUtil.b("WifiP2pBroadcastReceiver", "WiFip2p info is null");
                        }
                        WifiP2pBroadcastReceiver.this.d.onConnectionInfoAvailable(wifiP2pInfo);
                    }
                });
                LogUtil.b("WifiP2pBroadcastReceiver", "Connected P2P");
            }
        } catch (BadParcelableException unused) {
            LogUtil.d("WifiP2pBroadcastReceiver", "android.net.wifi.p2p.CONNECTION_STATE_CHANGE", " exception, no care this.");
        }
    }

    private void e(Intent intent) {
        int intExtra = intent.getIntExtra("wifi_p2p_state", -1);
        if (intExtra == 2) {
            this.d.wifiP2pEnabled(true);
        }
        if (intExtra == 1) {
            ThreadPoolManager.c().a("WifiP2pBroadcastReceiver", new Runnable() { // from class: com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pBroadcastReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    if (HwWifiP2pTransferManager.a().p()) {
                        LogUtil.b("WifiP2pBroadcastReceiver", "user close wifi button.");
                        if (HwWifiP2pTransferManager.a().m() == 0) {
                            HwWifiP2pTransferManager.a().b(1020, "ready pair wifi, but button close by user");
                        } else {
                            HwWifiP2pTransferManager.a().b(1022, "wifi button close by user");
                        }
                        HwWifiP2pTransferManager.a().c();
                    }
                }
            });
        }
    }

    private void a(Intent intent) {
        Parcelable parcelableExtra;
        try {
            parcelableExtra = intent.getParcelableExtra("deviceinfo");
        } catch (BadParcelableException unused) {
            LogUtil.d("WifiP2pBroadcastReceiver", "fuzzy test exception, no care this.");
            parcelableExtra = null;
        }
        if (parcelableExtra instanceof DeviceInfo) {
            return;
        }
        LogUtil.b("WifiP2pBroadcastReceiver", "device info is wrong, please check.");
    }
}
