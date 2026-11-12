package miui.bluetooth.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.ParcelUuid;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes23.dex */
public class MiBleDeviceManager {
    public static final String ACTION_BLE_EVENT = "miui.bluetooth.BLE_EVENT";
    public static final int BLE_EVENT_AWAKE = 5;
    public static final int BLE_EVENT_CLICK = 1;
    public static final int BLE_EVENT_CUSTOM = 256;
    public static final int BLE_EVENT_DOUBLE_CLICK = 2;
    public static final int BLE_EVENT_LINK_LOSS = 6;
    public static final int BLE_EVENT_LONG_CLICK = 3;
    public static final int BLE_EVENT_SLEEP = 4;
    public static final int BLE_EVENT_UNKNOWN = 0;
    public static final String BLE_IMMEDIATE_ALERT_PERMISSION = "miui.permission.BLE_IMMEDIATE_ALERT";
    public static final String EXTRA_DEVICE = "miui.bluetooth.extras.DEVICE";
    public static final String EXTRA_EVENT = "miui.bluetooth.extras.EVENT";
    public static final String EXTRA_EVENT_DATA = "miui.bluetooth.extras.EVENT_DATA";
    public static final int SERVICE_VERSION_UNKNOWN = -1;
    public static final String SETTING_BIND_DEVICE = "device_type";
    public static final String SETTING_IMMEDIATE_ALERT_ALARM_ENABLED = "alert_alarm_enabled";
    public static final String SETTING_IMMEDIATE_ALERT_INCALL_DELAYED = "alert_incall_delayed";
    public static final String SETTING_IMMEDIATE_ALERT_INCALL_ENABLED = "alert_incall_enabled";
    public static final String SETTING_IMMEDIATE_ALERT_INCALL_IN_CONTACTS_ENABLED = "alert_incall_enabled_in_contacts";
    public static final String SETTING_IMMEDIATE_ALERT_INCALL_NO_CONTACTS_ENABLED = "alert_incall_enabled_no_contacts";
    public static final String SETTING_IMMEDIATE_ALERT_SMS_ENABLED = "alert_sms_enabled";
    public static final String SETTING_IMMEDIATE_ALERT_SMS_IN_CONTACTS_ENABLED = "alert_sms_enabled_in_contacts";
    public static final String SETTING_IMMEDIATE_ALERT_SMS_NO_CONTACTS_ENABLED = "alert_sms_enabled_no_contacts";
    public static final int TYPE_MI_BAND = 1;
    public static final int TYPE_MI_KEY = 69;
    public static final int TYPE_UNKNOWN = 0;
    private static final String g = "MiBleDeviceManager";
    private static final boolean h = true;
    private Context a;
    private IMiBleDeviceManager b;
    private MiBleDeviceManagerListener c;
    private ParcelUuid d;
    private IBinder e;
    private ServiceConnection f = new a();

    public interface MiBleDeviceManagerListener {
        void onDestroy();

        void onInit(MiBleDeviceManager miBleDeviceManager);
    }

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MiBleDeviceManager.this.e(IMiBleDeviceManager.Stub.asInterface(iBinder));
            if (MiBleDeviceManager.this.c != null) {
                MiBleDeviceManager.this.c.onInit(MiBleDeviceManager.this);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            MiBleDeviceManager.this.e(null);
            if (MiBleDeviceManager.this.c != null) {
                MiBleDeviceManager.this.c.onDestroy();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MiBleDeviceManager.this.c.onDestroy();
        }
    }

    public class c extends IScanDeviceCallback.Stub {
        public final /* synthetic */ int c;
        public final /* synthetic */ BluetoothAdapter.LeScanCallback d;

        public c(int i, BluetoothAdapter.LeScanCallback leScanCallback) {
            this.c = i;
            this.d = leScanCallback;
        }

        @Override // miui.bluetooth.ble.IScanDeviceCallback
        public void onScanDevice(int i, BluetoothDevice bluetoothDevice, int i2, byte[] bArr) throws RemoteException {
            if (i == this.c) {
                this.d.onLeScan(bluetoothDevice, i2, bArr);
            }
        }
    }

    private MiBleDeviceManager(Context context, MiBleDeviceManagerListener miBleDeviceManagerListener) {
        if (context == null || context.getApplicationContext() == null) {
            throw new IllegalArgumentException("context not valid");
        }
        this.d = new ParcelUuid(UUID.randomUUID());
        this.e = new Binder();
        this.a = context.getApplicationContext();
        this.c = miBleDeviceManagerListener;
    }

    private boolean c() {
        if (this.b != null) {
            return true;
        }
        Log.w(g, "Manager is not ready");
        return false;
    }

    public static MiBleDeviceManager createManager(Context context, MiBleDeviceManagerListener miBleDeviceManagerListener) {
        MiBleDeviceManager miBleDeviceManager = new MiBleDeviceManager(context, miBleDeviceManagerListener);
        miBleDeviceManager.d();
        return miBleDeviceManager;
    }

    private void d() {
        Intent intent = new Intent("miui.bluetooth.mible.DeviceManagerService");
        intent.setComponent(new ComponentName("com.xiaomi.bluetooth", "com.android.bluetooth.ble.app.MiBleDeviceManagerService"));
        boolean zBindService = this.a.bindService(intent, this.f, 1);
        if (!zBindService) {
            intent.setComponent(new ComponentName("com.android.bluetooth", "com.android.bluetooth.ble.app.MiBleDeviceManagerService"));
            zBindService = this.a.bindService(intent, this.f, 1);
        }
        if (zBindService) {
            return;
        }
        Log.e(g, "bind manager service error: " + intent);
        if (this.c != null) {
            new Handler().post(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(IMiBleDeviceManager iMiBleDeviceManager) {
        this.b = iMiBleDeviceManager;
    }

    public static String getSettingKeyForEvent(int i) {
        return String.format("miui_ble_event_%d", Integer.valueOf(i));
    }

    public boolean bindDevice(String str) {
        if (c()) {
            try {
                return this.b.setSettingInteger(str, "device_type", 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public void close() {
        try {
            this.a.unbindService(this.f);
        } catch (Exception e) {
            Log.e(g, "Close manager service error", e);
        }
    }

    public List<String> getBoundDevices() {
        if (!c()) {
            return null;
        }
        try {
            return this.b.getBoundDevices();
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getDeviceType(String str) {
        if (!c()) {
            return 0;
        }
        try {
            return this.b.getDeviceType(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String getRegisterAppForBleEvent(String str, int i) {
        if (!c()) {
            return null;
        }
        try {
            return this.b.getRegisterAppForBleEvent(str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ScanResult getScanResult(String str) {
        if (!c()) {
            return null;
        }
        try {
            return this.b.getScanResult(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getServiceVersion() {
        if (!c()) {
            return -1;
        }
        try {
            return this.b.getServiceVersion();
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public boolean getSettingsBoolean(String str, String str2) {
        if (c()) {
            try {
                return this.b.getSettingInteger(str, str2) != 0;
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public int getSettingsInteger(String str, String str2) {
        if (!c()) {
            return 0;
        }
        try {
            return this.b.getSettingInteger(str, str2);
        } catch (RemoteException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String getSettingsString(String str, String str2) {
        if (!c()) {
            return null;
        }
        try {
            return this.b.getSettingString(str, str2);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean registerAppForBleEvent(String str, int i) {
        if (!c()) {
            return false;
        }
        try {
            return this.b.setSettingString(str, getSettingKeyForEvent(i), this.a.getPackageName());
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean registerBleEventListener(String str, int i, IBleEventCallback iBleEventCallback) {
        if (iBleEventCallback != null && c()) {
            try {
                return this.b.registerBleEventListener(str, i, iBleEventCallback);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean setSettings(String str, String str2, boolean z) {
        if (c()) {
            try {
                return this.b.setSettingInteger(str, str2, z ? 1 : 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean startScanDevice(int i, BluetoothAdapter.LeScanCallback leScanCallback) {
        if (!c()) {
            return false;
        }
        try {
            this.b.startScanDevice(this.e, this.d, i, new c(i, leScanCallback));
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void stopScanDevice() {
        if (c()) {
            try {
                this.b.stopScanDevice(this.d);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean unbindDevice(String str) {
        if (!c()) {
            return false;
        }
        try {
            return this.b.deleteSettings(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean unregisterAppForBleEvent(String str, int i) {
        if (!c()) {
            return false;
        }
        try {
            return this.b.setSettingString(str, getSettingKeyForEvent(i), null);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean unregisterBleEventListener(String str, int i, IBleEventCallback iBleEventCallback) {
        if (!c()) {
            return false;
        }
        try {
            return this.b.unregisterBleEventListener(str, i, iBleEventCallback);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean bindDevice(String str, byte[] bArr) {
        if (!c()) {
            return false;
        }
        try {
            return this.b.setToken(str, bArr);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean setSettings(String str, String str2, int i) {
        if (!c()) {
            return false;
        }
        try {
            return this.b.setSettingInteger(str, str2, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean setSettings(String str, String str2, String str3) {
        if (!c()) {
            return false;
        }
        try {
            return this.b.setSettingString(str, str2, str3);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }
}
