package com.huawei.health.manager.reconnect;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
class BtCommonAdapterUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f8114b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static BtCommonAdapterUtil f8115c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BluetoothAdapter f8116a;
    private BtDeviceHfpStateCallback d = null;
    private BroadcastReceiver e = new BroadcastReceiver() { // from class: com.huawei.health.manager.reconnect.BtCommonAdapterUtil.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                LogUtil.j("BtCommonAdapterUtil", "context or intent is null");
                return;
            }
            String action = intent.getAction();
            ReleaseLogUtil.d("DEVMGR_BtCommonAdapterUtil", "EMUI mHfpStateReceiver action: ", action, ", mBtDeviceHfpStateCallback: ", Boolean.valueOf(BtCommonAdapterUtil.this.d == null));
            if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action) || "android.bluetooth.input.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice == null) {
                    LogUtil.j("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtCommonAdapterUtil", "btDevice is null so return.");
                    return;
                }
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                if (BtCommonAdapterUtil.this.d != null && intExtra == 2) {
                    ReleaseLogUtil.d("DEVMGR_BtCommonAdapterUtil", "HFP device connected.");
                    BtCommonAdapterUtil.this.d.onBtDeviceHfpConnected(bluetoothDevice, action);
                }
            }
            BtCommonAdapterUtil.this.a(intent, action);
        }
    };

    private BtCommonAdapterUtil() {
        this.f8116a = null;
        this.f8116a = BluetoothAdapter.getDefaultAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent, String str) {
        if ("android.bluetooth.device.action.ACL_CONNECTED".equals(str)) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice == null) {
                LogUtil.j("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtCommonAdapterUtil", "btDevice is null so return.");
                return;
            }
            BtDeviceHfpStateCallback btDeviceHfpStateCallback = this.d;
            if (btDeviceHfpStateCallback != null) {
                btDeviceHfpStateCallback.onBtDeviceHfpConnected(bluetoothDevice, str);
            }
        }
    }

    public static BtCommonAdapterUtil c() {
        BtCommonAdapterUtil btCommonAdapterUtil;
        synchronized (f8114b) {
            if (f8115c == null) {
                f8115c = new BtCommonAdapterUtil();
            }
            btCommonAdapterUtil = f8115c;
        }
        return btCommonAdapterUtil;
    }

    public void e(BtDeviceHfpStateCallback btDeviceHfpStateCallback) {
        this.d = btDeviceHfpStateCallback;
    }

    public void e() {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.input.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        try {
            BaseApplication.b().registerReceiver(this.e, intentFilter);
        } catch (Exception e) {
            LogUtil.e("BtCommonAdapterUtil", "register HfpStateReceiver: Exception", ExceptionUtils.d((Throwable) e, true, false));
        }
    }

    public void a() {
        try {
            BaseApplication.b().unregisterReceiver(this.e);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("BtCommonAdapterUtil", "unregister HfpStateReceiver: IllegalArgumentException");
        } catch (SecurityException unused2) {
            LogUtil.e("BtCommonAdapterUtil", "unregister HfpStateReceiver: SecurityException");
        }
    }

    public boolean d() {
        try {
            BluetoothAdapter bluetoothAdapter = this.f8116a;
            return bluetoothAdapter != null && bluetoothAdapter.isEnabled() && this.f8116a.getState() == 12;
        } catch (NullPointerException unused) {
            LogUtil.e("BtCommonAdapterUtil", "bt system interface NullPointerException");
            return false;
        }
    }
}
