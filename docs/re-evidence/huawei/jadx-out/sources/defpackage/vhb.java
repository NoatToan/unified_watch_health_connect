package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import android.os.SystemClock;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vhb {
    private static volatile vhb e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f51089c;

    private vhb() {
    }

    public static vhb b() {
        if (e == null) {
            synchronized (vhb.class) {
                if (e == null) {
                    e = new vhb();
                }
            }
        }
        return e;
    }

    public void c() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f51089c != null) {
            LogUtil.b("FastLiteDeviceConnectionManager", "mDeviceStatusReceiver has registered");
            return;
        }
        this.f51089c = new BroadcastReceiver() { // from class: vhb.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    LogUtil.e("FastLiteDeviceConnectionManager", "mDeviceStatusReceiver onReceive intent is null.");
                    return;
                }
                if (intent.getAction() == null) {
                    LogUtil.e("FastLiteDeviceConnectionManager", "mDeviceStatusReceiver onReceive action is null");
                    return;
                }
                if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                    DeviceInfo deviceInfo = parcelableExtra instanceof DeviceInfo ? (DeviceInfo) parcelableExtra : null;
                    if (deviceInfo != null) {
                        vhb.this.c(deviceInfo);
                    } else {
                        LogUtil.e("FastLiteDeviceConnectionManager", "mDeviceStatusReceiver onReceive deviceInfo is null");
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.f51089c, intentFilter, LocalBroadcast.f36595c, null);
        ThreadPoolManager.c().execute(new Runnable() { // from class: vha
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e();
            }
        });
        LogUtil.b("FastLiteDeviceConnectionManager", "registerDeviceConnectReceiver finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void e() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "FastLiteDeviceConnectionManager");
        LogUtil.b("FastLiteDeviceConnectionManager", "checkDeviceStatus deviceList ", deviceList);
        if (njy.b(deviceList)) {
            vgx.d().e("hasDevice", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceInfo deviceInfo) {
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        if (deviceConnectState == 1) {
            LogUtil.b("FastLiteDeviceConnectionManager", "handleDeviceConnectState, state: DEVICE_CONNECTING");
            return;
        }
        if (deviceConnectState == 2) {
            vgx.d();
        } else if (deviceConnectState == 3 || deviceConnectState == 4) {
            vgx.c();
        }
    }
}
