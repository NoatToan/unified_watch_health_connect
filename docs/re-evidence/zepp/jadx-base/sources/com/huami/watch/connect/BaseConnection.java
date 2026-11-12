package com.huami.watch.connect;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.watch.util.Log;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.IwdsApplication;
import com.ingenic.iwds.app.ConnectionHelper;
import com.ingenic.iwds.uniconnect.ConnectionServiceManager;
import com.ingenic.iwds.uniconnect.link.Adapter;
import com.ingenic.iwds.uniconnect.link.AdapterManager;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseConnection {
    public static final boolean DEBUG = Config.isDebug();
    public Adapter mAdapter;
    public AdapterManager mAdapterManager;
    public Context mAppContext;
    public Connectable mConnectable;
    public ConnectionHelper mConnectionHelper;
    public DeviceDescriptor mDescriptor;
    public IwdsApplication mIwds;

    public class a extends ConnectionHelper {
        public a(Context context) {
            super(context);
        }

        @Override // com.ingenic.iwds.app.ConnectionHelper
        public void onConnectedDevice(DeviceDescriptor deviceDescriptor) {
            Log.d(BaseConnection.this.tag(), "OnConnectedDevice : " + deviceDescriptor, new Object[0]);
            BaseConnection.this.mConnectable.onConnectedDevice(deviceDescriptor);
        }

        @Override // com.ingenic.iwds.app.ConnectionHelper
        public void onDisconnectedDevice(DeviceDescriptor deviceDescriptor) {
            Log.w(BaseConnection.this.tag(), "OnDisconnectedDevice : " + deviceDescriptor, new Object[0]);
            BaseConnection.this.mConnectable.onDisconnectedDevice(deviceDescriptor);
        }

        @Override // com.ingenic.iwds.app.ConnectionHelper
        public void onServiceConnected(ConnectionServiceManager connectionServiceManager) {
            Log.d(BaseConnection.this.tag(), "OnServiceConnected, Manager : " + connectionServiceManager, new Object[0]);
        }

        @Override // com.ingenic.iwds.app.ConnectionHelper
        public void onServiceDisconnected(boolean z) {
            Log.w(BaseConnection.this.tag(), "OnServiceDisconnected, Unexpected : " + z, new Object[0]);
        }
    }

    public BaseConnection(@NonNull Connectable connectable) {
        this.mConnectable = connectable;
    }

    private ConnectionHelper a(Context context) {
        return new a(context);
    }

    public static boolean isAirplaneModeON(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public abstract DeviceDescriptor createDeviceDescriptor(Adapter adapter);

    public Adapter getAdapter() {
        return this.mAdapter;
    }

    public void init(Context context) {
        Log.i(tag(), "Init!!", new Object[0]);
        this.mAppContext = context.getApplicationContext();
        this.mIwds = new IwdsApplication();
        initIWDS();
        initBTAdapter();
        initBTLink();
        ConnectionHelper connectionHelperA = a(this.mAppContext);
        this.mConnectionHelper = connectionHelperA;
        connectionHelperA.start();
    }

    public void initBTAdapter() {
        AdapterManager adapterManager = AdapterManager.getInstance(this.mAppContext);
        this.mAdapterManager = adapterManager;
        this.mAdapter = adapterManager.getAdapter(Adapter.TAG_ANDROID_BT_DATA_CHANNEL);
        Log.i(tag(), "Init BT Adapter : " + this.mAdapter, new Object[0]);
    }

    public void initBTLink() {
        String localAddress = this.mAdapter.getLocalAddress();
        Log.i(tag(), "Init BT Link : " + localAddress, new Object[0]);
        if (!TextUtils.isEmpty(localAddress)) {
            DeviceDescriptor deviceDescriptorCreateDeviceDescriptor = createDeviceDescriptor(this.mAdapter);
            this.mDescriptor = deviceDescriptorCreateDeviceDescriptor;
            this.mConnectable.onCreateDeviceDescription(deviceDescriptorCreateDeviceDescriptor);
            Log.d(tag(), "OnCreateDeviceDescription : " + this.mDescriptor, new Object[0]);
        }
        linkStartServerOrBond();
    }

    public abstract void initIWDS();

    public boolean isBluetoothOn() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
                if (defaultAdapter.isEnabled()) {
                    Log.d(tag(), "Bluetooth State : ON!!", new Object[0]);
                    return true;
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        }
        Log.w(tag(), "Bluetooth State : OFF!!", new Object[0]);
        return false;
    }

    public abstract void linkStartServerOrBond();

    public abstract String tag();
}
