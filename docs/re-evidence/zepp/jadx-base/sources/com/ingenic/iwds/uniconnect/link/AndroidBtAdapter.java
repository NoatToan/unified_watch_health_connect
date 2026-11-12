package com.ingenic.iwds.uniconnect.link;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.ingenic.iwds.utils.IwdsAssert;
import com.ingenic.iwds.utils.IwdsLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes18.dex */
public class AndroidBtAdapter extends Adapter {
    private BluetoothAdapter h;
    private Adapter.DeviceDiscoveryCallbacks i;
    private boolean j;
    private int k;
    private final int l;
    private final int m;
    private final BroadcastReceiver n;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (AndroidBtAdapter.this.j) {
                String action = intent.getAction();
                int i = AndroidBtAdapter.this.k;
                if (i == 0) {
                    if ("android.bluetooth.adapter.action.DISCOVERY_STARTED".equals(action)) {
                        AndroidBtAdapter.this.clearRemoteDevices();
                        AndroidBtAdapter.this.i.onDiscoveryStarted();
                        AndroidBtAdapter.this.k = 1;
                        return;
                    }
                    return;
                }
                if (i != 1) {
                    return;
                }
                if ("android.bluetooth.device.action.FOUND".equals(action)) {
                    AndroidBtDevice androidBtDevice = new AndroidBtDevice((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE"));
                    AndroidBtAdapter.this.addRemoteDevice(androidBtDevice);
                    AndroidBtAdapter.this.i.onDeviceFound(androidBtDevice);
                    AndroidBtAdapter.this.k = 1;
                    return;
                }
                if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
                    AndroidBtAdapter.this.i.onDiscoveryFinished();
                    AndroidBtAdapter.this.j = false;
                    AndroidBtAdapter.this.k = 0;
                }
            }
        }
    }

    public AndroidBtAdapter(Context context, AdapterManager adapterManager) {
        super(context, adapterManager, Adapter.TAG_ANDROID_BT_DATA_CHANNEL);
        this.j = false;
        this.l = 0;
        this.m = 1;
        a aVar = new a();
        this.n = aVar;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.h = defaultAdapter;
        IwdsAssert.dieIf(this, defaultAdapter == null, "Android does not support bluetooth.");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        getContext().registerReceiver(aVar, intentFilter);
    }

    private String d() {
        Class<?> cls = this.h.getClass();
        try {
            Class<?> cls2 = Class.forName("android.bluetooth.IBluetooth");
            Field declaredField = cls.getDeclaredField("mService");
            declaredField.setAccessible(true);
            Method method = cls2.getMethod("getAddress", new Class[0]);
            method.setAccessible(true);
            return (String) method.invoke(declaredField.get(this.h), new Object[0]);
        } catch (Exception unused) {
            IwdsLog.w(this, "Call Bluetooth by reflection failed.");
            return this.h.getAddress();
        }
    }

    @Override // com.ingenic.iwds.uniconnect.link.Adapter
    public void cancelDiscovey() {
        if (isEnabled()) {
            while (!this.h.cancelDiscovery() && isEnabled()) {
            }
            this.j = false;
        }
    }

    @Override // com.ingenic.iwds.uniconnect.link.Adapter
    public void disable() {
        IwdsLog.w(this, "Call m_btAdapter.disable");
        this.h.disable();
    }

    @Override // com.ingenic.iwds.uniconnect.link.Adapter
    public boolean enable() {
        IwdsLog.w(this, "Call m_btAdapter.enable");
        return this.h.enable();
    }

    @Override // com.ingenic.iwds.uniconnect.link.Adapter
    public String getLocalAddress() {
        return Build.VERSION.SDK_INT < 23 ? this.h.getAddress() : d();
    }

    @Override // com.ingenic.iwds.uniconnect.link.Adapter
    public boolean isEnabled() {
        return this.h.isEnabled();
    }

    @Override // com.ingenic.iwds.uniconnect.link.Adapter
    public int startDiscovery(Adapter.DeviceDiscoveryCallbacks deviceDiscoveryCallbacks) {
        boolean zStartDiscovery;
        if (!isEnabled()) {
            IwdsLog.e(this, "BT was disabled");
            return -7;
        }
        if (this.j) {
            IwdsLog.e(this, "device discovery is ongoing(cancel it)");
            return -8;
        }
        cancelDiscovey();
        this.i = deviceDiscoveryCallbacks;
        this.j = true;
        this.k = 0;
        do {
            zStartDiscovery = this.h.startDiscovery();
            if (zStartDiscovery) {
                break;
            }
        } while (isEnabled());
        return !zStartDiscovery ? -4 : 0;
    }
}
