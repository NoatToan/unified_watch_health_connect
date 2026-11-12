package miui.bluetooth.ble;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelUuid;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.UUID;

/* JADX INFO: loaded from: classes23.dex */
public class MiBleProfile {
    public static final String ACTION_MIBLE_SERVICE = "miui.bluetooth.mible.Service";
    public static final String ACTION_SELECT_DEVICE = "miui.bluetooth.action.PICK_DEVICE";
    public static final boolean DBG = true;
    public static final String EXTRA_MIBLE_PROPERTY = "miui.bluetooth.extra.MIBLE_PROPERTY";
    public static final int PROPERTY_ALARM_CLOCK = 106;
    public static final int PROPERTY_ALERT_NOTIFICATION = 8;
    public static final int PROPERTY_BATTERY = 6;
    public static final int PROPERTY_DEVICE_CONTROL = 2;
    public static final int PROPERTY_DEVICE_INFO = 101;
    public static final int PROPERTY_FIRMWARE = 3;
    public static final int PROPERTY_IMMEDIATE_ALERT = 5;
    public static final int PROPERTY_LINK_LOSS = 7;
    public static final int PROPERTY_MI_BAND_EVENT = 108;
    public static final int PROPERTY_MI_KEY = 107;

    @Deprecated
    public static final int PROPERTY_PAY = 4;
    public static final int PROPERTY_SPORT_ACTIVITIES = 104;
    public static final int PROPERTY_SPORT_STEPS = 103;
    public static final int PROPERTY_THEME_COLOR = 105;
    public static final int PROPERTY_UNDEFINED = 0;

    @Deprecated
    public static final int PROPERTY_UNLOCK = 1;
    public static final int PROPERTY_USER_INFO = 102;
    public static final int SERVICE_VERSION_UNKNOWN = -1;
    public static final int STATUS_CONNECTED = 2;
    public static final int STATUS_CONNECTING = 1;
    public static final int STATUS_DISCONNECTED = 0;
    public static final int STATUS_DISCONNECTING = 3;
    public static final int STATUS_ERROR = -1;
    public static final int STATUS_READY = 4;
    public static final String TAG = "MiBleProfile";
    private static final int i = 1;
    private static final int j = 2;
    private final IBinder a;
    private boolean b;
    private SparseArray<IPropertyNotifyCallback> c;
    private Handler d;
    private int e;
    private ServiceConnection f;
    private IBluetoothMiBleCallback g;
    private IBluetoothMiBlePropertyCallback h;
    public IProfileStateChangeCallback mCallback;
    public final ParcelUuid mClientId;
    public Context mContext;
    public String mDevice;
    public IBluetoothMiBle mService;

    public interface IProfileStateChangeCallback {
        void onState(int i);
    }

    public interface IPropertyNotifyCallback {
        void notifyProperty(int i, byte[] bArr);
    }

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d(MiBleProfile.TAG, "onServiceConnected()");
            MiBleProfile.this.mService = IBluetoothMiBle.Stub.asInterface(iBinder);
            MiBleProfile.this.d.sendMessage(MiBleProfile.this.d.obtainMessage(1, 2, 0));
            try {
                MiBleProfile miBleProfile = MiBleProfile.this;
                IBluetoothMiBle iBluetoothMiBle = miBleProfile.mService;
                IBinder iBinder2 = miBleProfile.a;
                MiBleProfile miBleProfile2 = MiBleProfile.this;
                iBluetoothMiBle.registerClient(iBinder2, miBleProfile2.mDevice, miBleProfile2.mClientId, miBleProfile2.g);
            } catch (RemoteException e) {
                Log.e(MiBleProfile.TAG, "onServiceConnected", e);
                MiBleProfile.this.d.sendMessage(MiBleProfile.this.d.obtainMessage(1, -1, 0));
            }
            if (MiBleProfile.this.b) {
                MiBleProfile.this.b = false;
                MiBleProfile.this.connect();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            MiBleProfile miBleProfile = MiBleProfile.this;
            miBleProfile.mService = null;
            miBleProfile.e = 0;
            MiBleProfile.this.d.sendMessage(MiBleProfile.this.d.obtainMessage(1, 0, 0));
        }
    }

    public class b extends IBluetoothMiBleCallback.Stub {
        public b() {
        }

        @Override // miui.bluetooth.ble.IBluetoothMiBleCallback
        public void onConnectionState(ParcelUuid parcelUuid, int i) throws RemoteException {
            Log.d(MiBleProfile.TAG, "onConnectionState() sate=" + i);
            if (MiBleProfile.this.mClientId.equals(parcelUuid)) {
                MiBleProfile.this.e = i;
                MiBleProfile.this.d.sendMessage(MiBleProfile.this.d.obtainMessage(1, i, 0));
            }
        }
    }

    public class c extends IBluetoothMiBlePropertyCallback.Stub {
        public c() {
        }

        @Override // miui.bluetooth.ble.IBluetoothMiBlePropertyCallback
        public void notifyProperty(ParcelUuid parcelUuid, int i, byte[] bArr) throws RemoteException {
            Log.d(MiBleProfile.TAG, "mPropertyCallback() property=" + i);
            if (MiBleProfile.this.mClientId.equals(parcelUuid)) {
                Message messageObtainMessage = MiBleProfile.this.d.obtainMessage(2);
                messageObtainMessage.arg1 = i;
                messageObtainMessage.obj = bArr;
                MiBleProfile.this.d.sendMessage(messageObtainMessage);
            }
        }
    }

    public class d implements Handler.Callback {
        public d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                IProfileStateChangeCallback iProfileStateChangeCallback = MiBleProfile.this.mCallback;
                if (iProfileStateChangeCallback != null) {
                    iProfileStateChangeCallback.onState(message.arg1);
                }
                return true;
            }
            if (i != 2) {
                return false;
            }
            int i2 = message.arg1;
            IPropertyNotifyCallback iPropertyNotifyCallback = (IPropertyNotifyCallback) MiBleProfile.this.c.get(i2);
            if (iPropertyNotifyCallback != null) {
                iPropertyNotifyCallback.notifyProperty(i2, (byte[]) message.obj);
            }
            return true;
        }
    }

    public MiBleProfile(Context context, String str) {
        this(context, str, null);
    }

    public void connect() {
        IBluetoothMiBle iBluetoothMiBle = this.mService;
        if (iBluetoothMiBle != null) {
            try {
                iBluetoothMiBle.connect(this.mDevice, this.mClientId);
                return;
            } catch (RemoteException e) {
                Log.w(TAG, "connect: ", e);
                Handler handler = this.d;
                handler.sendMessage(handler.obtainMessage(1, -1, 0));
                return;
            }
        }
        this.b = true;
        Intent intent = new Intent(ACTION_MIBLE_SERVICE);
        intent.setClassName("com.xiaomi.bluetooth", "com.android.bluetooth.ble.BluetoothMiBleService");
        intent.setPackage("com.xiaomi.bluetooth");
        boolean zBindService = this.mContext.bindService(intent, this.f, 1);
        if (!zBindService) {
            Intent intent2 = new Intent(ACTION_MIBLE_SERVICE);
            intent2.setClassName("com.android.bluetooth", "com.android.bluetooth.ble.BluetoothMiBleService");
            intent2.setPackage("com.android.bluetooth");
            zBindService = this.mContext.bindService(intent2, this.f, 1);
            intent = intent2;
        }
        if (zBindService) {
            return;
        }
        Log.e(TAG, "connect: bind service error" + intent.toString());
        Handler handler2 = this.d;
        handler2.sendMessage(handler2.obtainMessage(1, -1, 0));
    }

    public void disconnect() {
        IBluetoothMiBle iBluetoothMiBle = this.mService;
        if (iBluetoothMiBle == null) {
            return;
        }
        try {
            iBluetoothMiBle.unregisterClient(this.a, this.mDevice, this.mClientId);
            this.mContext.unbindService(this.f);
        } catch (RemoteException e) {
            Log.w(TAG, "disconnect: ", e);
            Handler handler = this.d;
            handler.sendMessage(handler.obtainMessage(1, -1, 0));
        } catch (IllegalArgumentException e2) {
            Log.w(TAG, "disconnect: ", e2);
            Handler handler2 = this.d;
            handler2.sendMessage(handler2.obtainMessage(1, -1, 0));
        }
    }

    public String getDeviceAddress() {
        return this.mDevice;
    }

    public byte[] getProperty(int i2) {
        IBluetoothMiBle iBluetoothMiBle = this.mService;
        if (iBluetoothMiBle == null) {
            return null;
        }
        try {
            return iBluetoothMiBle.getProperty(this.mDevice, this.mClientId, i2);
        } catch (RemoteException e) {
            Log.e(TAG, "getProperty: ", e);
            return null;
        }
    }

    public int getRssi() {
        if (!isReady()) {
            return Integer.MIN_VALUE;
        }
        try {
            return this.mService.getRssi(this.mDevice, this.mClientId);
        } catch (RemoteException e) {
            Log.e(TAG, "getRssi: ", e);
            return Integer.MIN_VALUE;
        }
    }

    public int getServiceVersion() {
        IBluetoothMiBle iBluetoothMiBle = this.mService;
        if (iBluetoothMiBle == null) {
            return -1;
        }
        try {
            return iBluetoothMiBle.getServiceVersion();
        } catch (RemoteException e) {
            Log.e(TAG, "getServiceVersion", e);
            return -1;
        }
    }

    public boolean isReady() {
        return this.e == 4;
    }

    public boolean isSupportProperty(int i2) {
        try {
            IBluetoothMiBle iBluetoothMiBle = this.mService;
            return iBluetoothMiBle != null && iBluetoothMiBle.supportProperty(this.mDevice, i2);
        } catch (RemoteException e) {
            Log.e(TAG, "isSupportProperty: ", e);
            return false;
        }
    }

    public boolean registerPropertyNotifyCallback(int i2, IPropertyNotifyCallback iPropertyNotifyCallback) {
        boolean zRegisterPropertyCallback;
        this.c.put(i2, iPropertyNotifyCallback);
        IBluetoothMiBle iBluetoothMiBle = this.mService;
        if (iBluetoothMiBle != null) {
            try {
                zRegisterPropertyCallback = iBluetoothMiBle.registerPropertyCallback(this.mDevice, this.mClientId, i2, this.h);
            } catch (RemoteException e) {
                Log.e(TAG, "registerPropertyNotifyCallback: ", e);
                zRegisterPropertyCallback = false;
            }
        } else {
            zRegisterPropertyCallback = false;
        }
        if (zRegisterPropertyCallback) {
            return true;
        }
        this.c.remove(i2);
        return false;
    }

    public void setProfileStateChangeCallback(IProfileStateChangeCallback iProfileStateChangeCallback) {
        this.mCallback = iProfileStateChangeCallback;
    }

    public boolean setProperty(int i2, byte[] bArr) {
        IBluetoothMiBle iBluetoothMiBle = this.mService;
        if (iBluetoothMiBle == null) {
            return false;
        }
        try {
            return iBluetoothMiBle.setProperty(this.mDevice, this.mClientId, i2, bArr);
        } catch (RemoteException e) {
            Log.e(TAG, "setProperty: ", e);
            return false;
        }
    }

    public boolean unregisterPropertyNotifyCallback(int i2) {
        this.c.remove(i2);
        if (this.c.get(i2) != null) {
            return true;
        }
        try {
            IBluetoothMiBle iBluetoothMiBle = this.mService;
            if (iBluetoothMiBle != null) {
                return iBluetoothMiBle.unregisterPropertyCallback(this.mDevice, this.mClientId, i2, this.h);
            }
            return true;
        } catch (RemoteException e) {
            Log.e(TAG, "unregisterPropertyNotifyCallback: ", e);
            return false;
        }
    }

    public MiBleProfile(Context context, String str, IProfileStateChangeCallback iProfileStateChangeCallback) {
        this.mClientId = new ParcelUuid(UUID.randomUUID());
        this.a = new Binder();
        this.b = false;
        this.c = new SparseArray<>();
        this.e = 0;
        this.f = new a();
        this.g = new b();
        this.h = new c();
        this.mDevice = str;
        this.mContext = context;
        this.mCallback = iProfileStateChangeCallback;
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
        } catch (RuntimeException e) {
            Log.e(TAG, "prepare looper failed", e);
        }
        this.d = new Handler(new d());
    }
}
