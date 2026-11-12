package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.constant.ConnectState;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;

/* JADX INFO: loaded from: classes23.dex */
public class bxe {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile bxe f1270b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f1271a;

    private bxe() {
    }

    public static bxe d() {
        if (f1270b == null) {
            synchronized (bxe.class) {
                if (f1270b == null) {
                    f1270b = new bxe();
                }
            }
        }
        return f1270b;
    }

    public void c() {
        LogUtil.a("HL_DeviceConnectionManager", "registerDeviceConnectReceiver mDeviceStatusReceiver ", this.f1271a);
        if (this.f1271a != null) {
            return;
        }
        e();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.f1271a, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void e() {
        this.f1271a = new BroadcastReceiver() { // from class: bxe.5
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    LogUtil.j("HL_DeviceConnectionManager", "createDeviceStatusReceiver onReceive intent is null");
                    return;
                }
                String action = intent.getAction();
                LogUtil.a("HL_DeviceConnectionManager", "createDeviceStatusReceiver onReceive action ", action);
                if (TextUtils.isEmpty(action) || !"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                    return;
                }
                Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                DeviceInfo deviceInfo = parcelableExtra instanceof DeviceInfo ? (DeviceInfo) parcelableExtra : null;
                LogUtil.j("HL_DeviceConnectionManager", "createDeviceStatusReceiver onReceive deviceInfo ", deviceInfo);
                if (deviceInfo == null) {
                    return;
                }
                bxe.this.e(deviceInfo);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceInfo deviceInfo) {
        ConnectState connectState;
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        if (deviceConnectState == 1) {
            connectState = ConnectState.CONNECTING;
        } else if (deviceConnectState == 2) {
            connectState = ConnectState.CONNECTED;
        } else if (deviceConnectState == 3 || deviceConnectState == 4) {
            connectState = ConnectState.DISCONNECTED;
        } else {
            LogUtil.j("HL_DeviceConnectionManager", "handleDeviceConnectState deviceInfo ", deviceInfo);
            connectState = null;
        }
        LogUtil.a("HL_DeviceConnectionManager", "handleDeviceConnectState state ", connectState);
        if (connectState == null) {
            return;
        }
        if (connectState == ConnectState.CONNECTED) {
            a(deviceInfo);
        } else if (connectState == ConnectState.DISCONNECTED) {
            d(deviceInfo);
        }
    }

    public void a(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 37);
        LogUtil.a("HL_DeviceConnectionManager", "registerHealthLife isSupportCapability ", Boolean.valueOf(zD));
        bxp.b().b(zD);
        if (zD) {
            bxb.a();
            bxp.b().n();
            bxp.b().o();
        }
    }

    private void d(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 37);
        LogUtil.a("HL_DeviceConnectionManager", "unregisterHealthLife isSupportCapability ", Boolean.valueOf(zD));
        if (zD) {
            bxb.a().a("HL_DeviceConnectionManager");
        }
    }
}
