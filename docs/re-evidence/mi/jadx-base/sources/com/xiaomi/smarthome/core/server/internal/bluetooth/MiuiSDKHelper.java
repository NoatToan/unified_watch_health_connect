package com.xiaomi.smarthome.core.server.internal.bluetooth;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.xiaomi.fitness.mijia.sdk.MiBleDeviceManager;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.common.util.AsyncTaskUtils;
import com.xiaomi.smarthome.library.util.GlobalHandlerManager;
import defpackage.ouf;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class MiuiSDKHelper implements ouf.b {
    private static final boolean MIKEY_ENABLED = true;
    private ouf mMiBleDeviceManager;
    private int mServiceVersion;

    public static class MikeyHelperHolder {
        private static MiuiSDKHelper instance = new MiuiSDKHelper();

        private MikeyHelperHolder() {
        }
    }

    public static MiuiSDKHelper getInstance() {
        return MikeyHelperHolder.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initMiBleDeviceManager() {
        ouf.f(BluetoothContextManager.getContext(), this);
    }

    private void preRandomUUID() {
        AsyncTaskUtils.exe(new AsyncTask<Void, Void, Void>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.MiuiSDKHelper.1
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                UUID.randomUUID();
                return null;
            }

            @Override // android.os.AsyncTask
            public void onPostExecute(Void r2) {
                GlobalHandlerManager.getInstance().getGlobalWorkerHandler().post(new Runnable() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.MiuiSDKHelper.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            MiuiSDKHelper.this.initMiBleDeviceManager();
                        } catch (Throwable th) {
                            BluetoothLog.e(th);
                        }
                    }
                });
            }
        }, new Void[0]);
    }

    public boolean bindDevice(String str, byte[] bArr) {
        boolean zC;
        if (isTokenBindSupported()) {
            try {
                zC = this.mMiBleDeviceManager.c(str, bArr);
            } catch (Throwable th) {
                BluetoothLog.e(th);
                zC = false;
            }
        } else {
            zC = false;
        }
        BluetoothLog.w(String.format("bindDevice %s return %b", str, Boolean.valueOf(zC)));
        return zC;
    }

    public boolean isAlertSupported() {
        return this.mMiBleDeviceManager != null && this.mServiceVersion >= 15;
    }

    public boolean isMikeyAddress(String str) {
        ouf oufVar;
        return isMikeySupported() && !TextUtils.isEmpty(str) && (oufVar = this.mMiBleDeviceManager) != null && oufVar.g(str) == 69;
    }

    public boolean isMikeySupported() {
        return this.mMiBleDeviceManager != null && this.mServiceVersion >= 3;
    }

    public boolean isTokenBindSupported() {
        return this.mMiBleDeviceManager != null && this.mServiceVersion >= 13;
    }

    @Override // ouf.b
    public void onDestroy() {
        this.mMiBleDeviceManager = null;
    }

    @Override // ouf.b
    public void onInit(ouf oufVar) {
        if (oufVar != null) {
            this.mMiBleDeviceManager = oufVar;
            try {
                this.mServiceVersion = oufVar.h();
            } catch (Throwable th) {
                BluetoothLog.e(th);
            }
        }
    }

    public boolean setAlertConfigs(String str, int i, boolean z) {
        String str2;
        if (!isAlertSupported()) {
            return false;
        }
        if (i == 1) {
            str2 = "alert_incall_enabled_in_contacts";
        } else if (i == 2) {
            str2 = "alert_incall_enabled_no_contacts";
        } else if (i == 3) {
            str2 = MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_ALARM_ENABLED;
        } else if (i == 4) {
            str2 = "alert_sms_enabled_in_contacts";
        } else {
            if (i != 5) {
                return false;
            }
            str2 = "alert_sms_enabled_no_contacts";
        }
        return this.mMiBleDeviceManager.l(str, str2, z);
    }

    public boolean unbindDevice(String str) {
        boolean zM;
        ouf oufVar = this.mMiBleDeviceManager;
        if (oufVar != null) {
            try {
                zM = oufVar.m(str);
            } catch (Throwable th) {
                BluetoothLog.e(th);
                zM = false;
            }
        } else {
            zM = false;
        }
        BluetoothLog.w(String.format("unbindDevice %s return %b", str, Boolean.valueOf(zM)));
        return zM;
    }

    private MiuiSDKHelper() {
        preRandomUUID();
    }
}
