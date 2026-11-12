package com.huawei.health.manager.reconnect;

import android.app.Notification;
import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindaemon.R;
import defpackage.lsb;
import defpackage.yho;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.DeviceUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ReconnectManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f8118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ServiceConnection f8119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BleReconnectScanCallback f8120c;
    private volatile boolean d;
    private final BtDeviceHfpStateCallback e;

    private ReconnectManager() {
        this.d = false;
        this.e = new BtDeviceHfpStateCallback() { // from class: com.huawei.health.manager.reconnect.ReconnectManager.1
            @Override // com.huawei.health.manager.reconnect.BtDeviceHfpStateCallback
            public void onBtDeviceHfpConnected(BluetoothDevice bluetoothDevice, String str) {
                if (ReconnectManager.this.d) {
                    LogUtil.j("ReconnectManager", "onBtDeviceHfpConnected PhoneService running.");
                    return;
                }
                if (bluetoothDevice == null || TextUtils.isEmpty(bluetoothDevice.getAddress())) {
                    LogUtil.j("ReconnectManager", "btDevice is invalid, onBtDeviceHfpConnected fail.");
                    return;
                }
                Map<String, String> map = yho.d().get(bluetoothDevice.getAddress());
                if (map == null) {
                    ReleaseLogUtil.e("DEVMGR_ReconnectManager", "deviceInfo is null, onBtDeviceHfpConnected fail.");
                    return;
                }
                String str2 = map.get("deviceBtType");
                ReleaseLogUtil.d("DEVMGR_ReconnectManager", "Enter onBtDeviceHfpConnected.", CommonUtil.n(bluetoothDevice.getAddress()), ",btType:", str2);
                if ("android.bluetooth.device.action.ACL_CONNECTED".equals(str)) {
                    String str3 = map.get("deviceBtMode");
                    LogUtil.a("ReconnectManager", "onBTDeviceHFPConnected device manufacture:", str3);
                    if (ReconnectManager.this.b(str2, str3)) {
                        ReleaseLogUtil.d("DEVMGR_ReconnectManager", "onBTDeviceHFPConnected connect diana or ble05 device.");
                        ReconnectManager.this.c(bluetoothDevice, 1);
                        return;
                    }
                    return;
                }
                if ("1".equals(str2) || "2".equals(str2)) {
                    ReleaseLogUtil.d("DEVMGR_ReconnectManager", "onBTDeviceHFPConnected. type: ", str2);
                    ReconnectManager.this.c(bluetoothDevice, 2);
                }
            }
        };
        this.f8120c = new BleReconnectScanCallback() { // from class: com.huawei.health.manager.reconnect.ReconnectManager.2
            @Override // com.huawei.health.manager.reconnect.BleReconnectScanCallback
            public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                ReleaseLogUtil.d("DEVMGR_ReconnectManager", "Enter onLeScan, find want device.");
                ReconnectManager.this.c(bluetoothDevice, 3);
            }
        };
        this.f8119b = new ServiceConnection() { // from class: com.huawei.health.manager.reconnect.ReconnectManager.3
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                LogUtil.a("ReconnectManager", "onServiceConnected success!");
                ReconnectManager.this.d = true;
                ReconnectManager.this.e();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                LogUtil.a("ReconnectManager", "onServiceDisconnected success!");
                ReconnectManager.this.d = false;
                ReconnectManager.this.a();
            }
        };
        this.f8118a = new BroadcastReceiver() { // from class: com.huawei.health.manager.reconnect.ReconnectManager.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                LogUtil.a("ReconnectManager", "mDeviceStatusReceiver intent is ", intent.getAction());
                if (context == null) {
                    LogUtil.j("ReconnectManager", "mDeviceStatusReceiver context is null.");
                    return;
                }
                if (!"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    ReleaseLogUtil.d("DEVMGR_ReconnectManager", "mDeviceStatusReceiver is not stateChange.");
                    return;
                }
                Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                if (!(parcelableExtra instanceof DeviceInfo)) {
                    LogUtil.j("ReconnectManager", "mDeviceStatusReceiver DeviceInfo error");
                    return;
                }
                DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                int deviceConnectState = deviceInfo.getDeviceConnectState();
                LogUtil.a("ReconnectManager", "mDeviceStatusReceiver deviceName: ", deviceInfo.getDeviceName(), ", state is ", Integer.valueOf(deviceConnectState));
                if (deviceConnectState == 2) {
                    lsb.a().e(10001);
                    ReconnectManager.this.f();
                }
            }
        };
        LogUtil.a("ReconnectManager", "ReconnectManager create");
    }

    public void b() {
        Context contextB = BaseApplication.b();
        String strE = SharedPreferenceManager.e(contextB, Integer.toString(101010), "FIRST_CREATE_DEMO_SERVICE");
        if (strE == null || strE.isEmpty() || Boolean.toString(Boolean.TRUE.booleanValue()).equals(strE)) {
            LogUtil.a("ReconnectManager", "isFirstInit");
            if (!d(contextB) && NotificationManagerCompat.from(contextB).areNotificationsEnabled() && DeviceUtil.b() && !BaseApplication.h()) {
                LogUtil.a("ReconnectManager", "has nearByPermission,", d(contextB) + "isNotificationEnabled, ", NotificationManagerCompat.from(contextB).areNotificationsEnabled() + "has deviceInfo,", Boolean.valueOf(DeviceUtil.b()));
                j();
                j(contextB);
                SharedPreferenceManager.e(contextB, Integer.toString(101010), "FIRST_CREATE_DEMO_SERVICE", Boolean.toString(Boolean.FALSE.booleanValue()), null);
            }
        }
        LogUtil.a("ReconnectManager", "ReconnectManager init");
        BtCommonAdapterUtil.c().e(this.e);
        a();
    }

    private void j(Context context) {
        String string = context.getResources().getString(R.string.IDS_device_reconnect_remind);
        Notification.Builder builderC = lsb.d().c();
        builderC.setContentText(string);
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        builderC.setStyle(new Notification.BigTextStyle().bigText(string));
        builderC.setContentIntent(c(context));
        builderC.setAutoCancel(true);
        lsb.a().c(10001, builderC.build());
    }

    private PendingIntent c(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.health.MainActivity");
        intent.setFlags(536870912);
        intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE);
        return PendingIntent.getActivity(BaseApplication.b(), 0, intent, 67108864);
    }

    private void j() {
        BroadcastManagerUtil.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), this.f8118a, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        try {
            LogUtil.a("ReconnectManager", "Enter unregisterBindDeviceBroadcast()!");
            com.huawei.hwcommonmodel.application.BaseApplication.getContext().unregisterReceiver(this.f8118a);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("ReconnectManager", "unregisterBindDeviceBroadcast failed");
        }
    }

    public static boolean d(Context context) {
        if (Build.VERSION.SDK_INT <= 30) {
            return true;
        }
        return PermissionUtil.b(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), new String[]{"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"});
    }

    public void a() {
        if (this.d) {
            LogUtil.a("ReconnectManager", "startReconnect PhoneService running.");
            return;
        }
        if (CommonUtil.ai(BaseApplication.b())) {
            LogUtil.a("ReconnectManager", "startReconnect PhoneService running.");
            e(BaseApplication.b());
        } else if (yho.d().isEmpty()) {
            LogUtil.a("ReconnectManager", "ReconnectManager init devices isEmpty");
        } else if (!BtCommonAdapterUtil.c().d()) {
            LogUtil.a("ReconnectManager", "init bluetooth state not on");
        } else {
            BtCommonAdapterUtil.c().e();
            h();
        }
    }

    public void e() {
        BtCommonAdapterUtil.c().a();
        BleReconnectManager.e().j();
    }

    public static ReconnectManager d() {
        return InstanceHolder.f8125b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        if ("010303".equals(str2) && "1".equals(str)) {
            return true;
        }
        return "010505".equals(str2) && "2".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(BluetoothDevice bluetoothDevice, int i) {
        if (bluetoothDevice == null || TextUtils.isEmpty(bluetoothDevice.getAddress())) {
            LogUtil.j("ReconnectManager", "btDevice is invalid, connect fail.");
        } else {
            ReleaseLogUtil.d("DEVMGR_ReconnectManager", "ready to connect device is ", CommonUtil.n(bluetoothDevice.getAddress()), "reconnectType: ", Integer.valueOf(i));
            a(bluetoothDevice, BaseApplication.b());
        }
    }

    private void h() {
        ReleaseLogUtil.d("DEVMGR_ReconnectManager", "startBleReconnect start reconnect ble device.");
        BleReconnectManager.e().e(this.f8120c);
    }

    Map<String, Map<String, String>> c() {
        return this.d ? Collections.EMPTY_MAP : yho.c();
    }

    public void e(final Context context) {
        if (this.d) {
            LogUtil.a("ReconnectManager", "PhoneService isBound.");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.manager.reconnect.ReconnectManager.5
                @Override // java.lang.Runnable
                public void run() {
                    Context context2 = context;
                    context2.bindService(ReconnectManager.this.a(context2), ReconnectManager.this.f8119b, 37);
                }
            });
        }
    }

    public void b(Context context) {
        if (this.d) {
            LogUtil.a("ReconnectManager", "PhoneService isBound.");
        } else if (CommonUtil.ai(context)) {
            LogUtil.a("ReconnectManager", "startReconnect PhoneService running.");
            e(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent a(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.huawei.bone.action.StartPhoneService");
        intent.setPackage(context.getPackageName());
        return intent;
    }

    private void a(BluetoothDevice bluetoothDevice, Context context) {
        if (this.d) {
            LogUtil.j("ReconnectManager", "startPhoneService PhoneService running.");
            return;
        }
        Intent intentA = a(context);
        intentA.putExtra("reconnect", "reconnect");
        try {
            context.startService(intentA);
        } catch (IllegalStateException | SecurityException unused) {
            LogUtil.j("ReconnectManager", "start phone service fail");
        }
    }

    static class InstanceHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final ReconnectManager f8125b = new ReconnectManager();

        private InstanceHolder() {
        }
    }
}
