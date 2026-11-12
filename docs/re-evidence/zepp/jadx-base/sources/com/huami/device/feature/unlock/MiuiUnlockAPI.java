package com.huami.device.feature.unlock;

import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.lang.ref.WeakReference;
import miui.bluetooth.ble.MiBleDeviceManager;
import miui.bluetooth.ble.MiBleProfile;
import miui.bluetooth.ble.MiBleUnlockProfile;

/* JADX INFO: loaded from: classes7.dex */
public class MiuiUnlockAPI implements MiBleDeviceManager.MiBleDeviceManagerListener {
    public static final int SET_PASSWORD = 0;
    public static final int SET_UNLOCK = 1;
    private static final String f = "MiuiUnlockAPI";
    private static final int g = 1;
    private static final int h = 500;
    private static final int i = 2;
    private static MiuiUnlockAPI j;
    private Context a;
    private a b;
    private MiBleDeviceManager c;
    private MiBleUnlockProfile d;
    private boolean e = false;

    public static class a extends Handler {
        private final WeakReference<MiuiUnlockAPI> a;

        public a(Looper looper, MiuiUnlockAPI miuiUnlockAPI) {
            super(looper);
            this.a = new WeakReference<>(miuiUnlockAPI);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            MiuiUnlockAPI miuiUnlockAPI = this.a.get();
            if (miuiUnlockAPI == null || message.what != 1) {
                return;
            }
            miuiUnlockAPI.b();
        }
    }

    private MiuiUnlockAPI(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("miuiunlock");
        handlerThread.start();
        this.b = new a(handlerThread.getLooper(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        HMLog.d(f, "MSG_CREATE_MIUI_MANAGER", new Object[0]);
        MiBleDeviceManager.createManager(this.a, this);
    }

    private int c() {
        MiBleDeviceManager miBleDeviceManager = this.c;
        if (miBleDeviceManager == null) {
            HMLog.i(f, "mManager is null!!!", new Object[0]);
            return -1;
        }
        try {
            int serviceVersion = miBleDeviceManager.getServiceVersion();
            HMLog.i(f, "isSupportMiuiUnlock version:" + serviceVersion, new Object[0]);
            return serviceVersion;
        } catch (Throwable th) {
            HMLog.i(f, th.getMessage(), new Object[0]);
            return -1;
        }
    }

    public static MiuiUnlockAPI getInstance(Context context) {
        if (j == null) {
            j = new MiuiUnlockAPI(context.getApplicationContext());
        }
        return j;
    }

    public static String getUnlockWatchAddress(Context context, String str) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "bluetooth_name_to_unlock");
            if (TextUtils.isEmpty(string) || !string.contains(str)) {
                return null;
            }
            String string2 = Settings.Secure.getString(context.getContentResolver(), "bluetooth_address_to_unlock");
            if (Settings.Secure.getInt(context.getContentResolver(), "bluetooth_unlock_status") == 1) {
                return string2;
            }
            return null;
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean hasSetPassword(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.isKeyguardSecure();
    }

    public static boolean hasSetUnlockByDevice(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            HMLog.d(f, "return false as address is empty!!!", new Object[0]);
            return false;
        }
        try {
            int i2 = Settings.Secure.getInt(context.getContentResolver(), "bluetooth_unlock_status");
            String string = Settings.Secure.getString(context.getContentResolver(), "bluetooth_address_to_unlock");
            HMLog.i(f, "isUseUnlock:" + i2 + ",unlockAddress:" + string, new Object[0]);
            return !TextUtils.isEmpty(string) && string.equalsIgnoreCase(str) && i2 == 1;
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isUnlockEnabled(Context context, String str) {
        return hasSetPassword(context) && hasSetUnlockByDevice(context, str);
    }

    public static void toMiuiUnlockSetting(Context context, int i2, String str) {
        Intent intent = new Intent();
        if (i2 == 1) {
            intent.putExtra("android.bluetooth.device.extra.NAME", str);
        }
        intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.MiuiSecurityBluetoothSettings"));
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void connectUnlockProfile(String str, MiBleProfile.IProfileStateChangeCallback iProfileStateChangeCallback) {
        if (this.d == null) {
            try {
                MiBleUnlockProfile miBleUnlockProfile = new MiBleUnlockProfile(this.a, str, iProfileStateChangeCallback);
                this.d = miBleUnlockProfile;
                miBleUnlockProfile.connect();
            } catch (Exception e) {
                e.printStackTrace();
                this.d = null;
            }
        }
    }

    public void disconnectUnlockProfile() {
        MiBleUnlockProfile miBleUnlockProfile = this.d;
        if (miBleUnlockProfile != null) {
            miBleUnlockProfile.unregisterUnlockListener();
            this.d.disconnect();
            this.d = null;
        }
    }

    public void init() {
        HMLog.i(f, PointCategory.INIT, new Object[0]);
        this.b.sendEmptyMessage(1);
    }

    public synchronized boolean isSupportUnlock() {
        return this.e;
    }

    @Override // miui.bluetooth.ble.MiBleDeviceManager.MiBleDeviceManagerListener
    public synchronized void onDestroy() {
        HMLog.i(f, "MiBleDeviceManager onDestroy!", new Object[0]);
        this.c = null;
        if (this.e) {
            this.b.removeMessages(1);
            this.b.sendEmptyMessageDelayed(1, 500L);
        }
        this.e = false;
    }

    @Override // miui.bluetooth.ble.MiBleDeviceManager.MiBleDeviceManagerListener
    public synchronized void onInit(MiBleDeviceManager miBleDeviceManager) {
        HMLog.i(f, "MiBleDeviceManager onInit!", new Object[0]);
        this.c = miBleDeviceManager;
        boolean z = c() >= 2;
        this.e = z;
        if (z) {
            this.b.removeMessages(1);
        }
    }

    public void registerUnlockProfileListener(MiBleUnlockProfile.OnUnlockStateChangeListener onUnlockStateChangeListener) {
        MiBleUnlockProfile miBleUnlockProfile = this.d;
        if (miBleUnlockProfile != null) {
            miBleUnlockProfile.registerUnlockListener(onUnlockStateChangeListener);
        }
    }

    public boolean setUnlockProfileRssi(int i2) {
        MiBleUnlockProfile miBleUnlockProfile = this.d;
        if (miBleUnlockProfile != null) {
            try {
                return miBleUnlockProfile.setRssiThreshold(i2);
            } catch (Exception e) {
                e.printStackTrace();
                HMLog.i(f, "setRssiThreshold Exception e = " + e, new Object[0]);
            }
        }
        return false;
    }

    public synchronized boolean unbindDevice(String str) {
        HMLog.i(f, "unbindDevice:" + str, new Object[0]);
        MiBleDeviceManager miBleDeviceManager = this.c;
        if (miBleDeviceManager == null) {
            HMLog.i(f, "mManager is null!!!", new Object[0]);
            return false;
        }
        try {
            return miBleDeviceManager.unbindDevice(str);
        } catch (Throwable th) {
            HMLog.i(f, th.getMessage(), new Object[0]);
            return false;
        }
    }
}
