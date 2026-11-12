package com.huawei.health.ecologydevice.open;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHealth;
import android.bluetooth.BluetoothHealthAppConfiguration;
import android.bluetooth.BluetoothHealthCallback;
import android.bluetooth.BluetoothProfile;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.MeasureController;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dmu;
import defpackage.dxw;
import defpackage.enm;

/* JADX INFO: loaded from: classes7.dex */
public abstract class HdpMeasureController extends MeasureController {
    private static final String TAG = "HdpMeasureController";
    private static final int WAIT_SERVICE_CONNECTION_TIME = 500;
    protected IHealthDeviceCallback mBaseResponseCallback;
    private BluetoothHealth mBluetoothHealth;
    protected dmu mDevice;
    private BluetoothHealthAppConfiguration mHwHealthAppConfig;
    private final BluetoothHealthCallback mHwHealthCallback = new BluetoothHealthCallback() { // from class: com.huawei.health.ecologydevice.open.HdpMeasureController.1
        @Override // android.bluetooth.BluetoothHealthCallback
        public void onHealthAppConfigurationStatusChange(BluetoothHealthAppConfiguration bluetoothHealthAppConfiguration, int i) {
            LogUtil.a(HdpMeasureController.TAG, "onHealthAppConfigurationStatusChange status is ", Integer.valueOf(i));
            if (i == 1) {
                HdpMeasureController.this.mHwHealthAppConfig = null;
            } else if (i == 0) {
                HdpMeasureController.this.mHwHealthAppConfig = bluetoothHealthAppConfiguration;
            } else {
                LogUtil.j(HdpMeasureController.TAG, "onHealthAppConfigurationStatusChange: status irregular : ", Integer.valueOf(i));
            }
        }

        @Override // android.bluetooth.BluetoothHealthCallback
        public void onHealthChannelStateChange(BluetoothHealthAppConfiguration bluetoothHealthAppConfiguration, BluetoothDevice bluetoothDevice, int i, int i2, ParcelFileDescriptor parcelFileDescriptor, int i3) {
            if (bluetoothHealthAppConfiguration != null) {
                if (i == 0 && i2 == 2 && bluetoothHealthAppConfiguration.equals(HdpMeasureController.this.mHwHealthAppConfig)) {
                    HdpMeasureController.this.mChannelId = i3;
                    dxw.c(HdpMeasureController.this.new c(i, i2, parcelFileDescriptor, i3));
                    return;
                }
                return;
            }
            LogUtil.j(HdpMeasureController.TAG, "onHealthChannelStateChange config is null");
        }
    };
    private final BluetoothProfile.ServiceListener mHwServiceListener = new BluetoothProfile.ServiceListener() { // from class: com.huawei.health.ecologydevice.open.HdpMeasureController.5
        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            if (i == 3) {
                try {
                    if (bluetoothProfile instanceof BluetoothHealth) {
                        HdpMeasureController.this.mBluetoothHealth = (BluetoothHealth) bluetoothProfile;
                        HdpMeasureController.this.mBluetoothHealth.registerSinkAppConfiguration("HDP", HdpMeasureController.this.getDataType(), HdpMeasureController.this.mHwHealthCallback);
                        enm.b(HdpMeasureController.this.mDevice.getAddress(), 1);
                    }
                } catch (SecurityException e) {
                    LogUtil.e(HdpMeasureController.TAG, "onServiceConnected SecurityException:", ExceptionUtils.c(e));
                }
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i) {
            if (i == 3) {
                try {
                    HdpMeasureController.this.mBluetoothHealth = null;
                    enm.b(HdpMeasureController.this.mDevice.getAddress(), 0);
                } catch (SecurityException e) {
                    LogUtil.e(HdpMeasureController.TAG, "onServiceDisconnected SecurityException:", ExceptionUtils.c(e));
                }
            }
        }
    };
    private int mChannelId = 0;

    protected abstract int getDataType();

    protected abstract void handleHealthChannelStateChange(int i, int i2, ParcelFileDescriptor parcelFileDescriptor, int i3);

    @Override // com.huawei.health.device.open.MeasureController
    public boolean prepare(HealthDevice healthDevice, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        if (!(healthDevice instanceof dmu) || iHealthDeviceCallback == null) {
            return false;
        }
        this.mDevice = (dmu) healthDevice;
        this.mBaseResponseCallback = iHealthDeviceCallback;
        BluetoothAdapter.getDefaultAdapter().getProfileProxy(dxw.d(), this.mHwServiceListener, 3);
        try {
            Thread.sleep(500L);
            return true;
        } catch (InterruptedException e) {
            LogUtil.e(TAG, e.getMessage());
            return true;
        }
    }

    @Override // com.huawei.health.device.open.MeasureController
    public boolean start() {
        try {
            BluetoothHealth bluetoothHealth = this.mBluetoothHealth;
            if (bluetoothHealth == null || this.mHwHealthAppConfig == null) {
                return false;
            }
            return bluetoothHealth.connectChannelToSource(this.mDevice.a(), this.mHwHealthAppConfig);
        } catch (SecurityException e) {
            LogUtil.e(TAG, "start SecurityException:", ExceptionUtils.c(e));
            return false;
        }
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void ending() {
        BluetoothHealth bluetoothHealth;
        try {
            dmu dmuVar = this.mDevice;
            if (dmuVar == null || (bluetoothHealth = this.mBluetoothHealth) == null) {
                return;
            }
            bluetoothHealth.disconnectChannel(dmuVar.a(), this.mHwHealthAppConfig, this.mChannelId);
            this.mBluetoothHealth.unregisterAppConfiguration(this.mHwHealthAppConfig);
            this.mBluetoothHealth = null;
        } catch (SecurityException e) {
            LogUtil.e(TAG, "ending SecurityException:", ExceptionUtils.c(e));
        }
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void cleanup() {
        ending();
        this.mDevice = null;
        this.mBluetoothHealth = null;
        this.mHwHealthAppConfig = null;
    }

    final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6573a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f6575c;
        private int d;
        private ParcelFileDescriptor e;

        c(int i, int i2, ParcelFileDescriptor parcelFileDescriptor, int i3) {
            this.f6575c = i;
            this.f6573a = i2;
            this.e = parcelFileDescriptor;
            this.d = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            HdpMeasureController.this.handleHealthChannelStateChange(this.f6575c, this.f6573a, this.e, this.d);
        }
    }
}
