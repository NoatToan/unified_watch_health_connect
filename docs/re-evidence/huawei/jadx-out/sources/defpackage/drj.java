package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Bundle;
import android.os.Handler;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.open.GattMeasureController;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.picooc.health.formula.Formula;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public class drj extends GattMeasureController {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IHealthDeviceCallback f32247b;
    private BluetoothGatt d;
    private HealthDevice e;
    private List<HealthData> i;
    private BluetoothGattCharacteristic j;
    private int m;
    private BluetoothGattCharacteristic n;
    private BluetoothGattService o;
    private float g = 173.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32248c = 29;
    private int k = 1;
    private boolean f = true;
    private boolean h = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BluetoothGattCallback f32246a = new BluetoothGattCallback() { // from class: drj.2
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            drj.this.a(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            ReleaseLogUtil.d("R_PluginDevice_PicoocMeasureController", "onDescriptorWrite status = ", Integer.valueOf(i));
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            if (drj.this.m != 2) {
                LogUtil.j("PluginDevice_PicoocMeasureController", "onDescriptorWrite state is not connected");
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            if (drj.this.m == 2) {
                drj.this.d(bluetoothGattCharacteristic);
            } else {
                LogUtil.j("PluginDevice_PicoocMeasureController", "onDescriptorWrite state is not connected");
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            LogUtil.a("PluginDevice_PicoocMeasureController", "Enter onServicesDiscovered, status = ", Integer.valueOf(i));
            super.onServicesDiscovered(bluetoothGatt, i);
            if (i == 0) {
                LogUtil.a("PluginDevice_PicoocMeasureController", "onServicesDiscovered GATT_SUCCESS");
                drj.this.d(bluetoothGatt);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(BleConstants.MEASUREKIT_ID, drj.this.mDevice.getMeasureKitUuid());
            LogUtil.a(907127003, "PluginDevice_PicoocMeasureController", bundle, false, "No GATT service found.");
            if (drj.this.f32247b != null) {
                drj.this.f32247b.onStatusChanged(drj.this.e, 8);
            }
        }
    };

    @Override // com.huawei.health.device.open.MeasureController
    public boolean start() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic2;
        try {
            String string = bluetoothGattCharacteristic.getUuid().toString();
            if ("0000fff2-0000-1000-8000-00805f9b34fb".equalsIgnoreCase(string)) {
                LogUtil.d("PluginDevice_PicoocMeasureController", "doCharacteristicChange write data:", Arrays.toString(bluetoothGattCharacteristic.getValue()));
                return;
            }
            if (!"0000fff1-0000-1000-8000-00805f9b34fb".equalsIgnoreCase(string)) {
                LogUtil.j("PluginDevice_PicoocMeasureController", "doCharacteristicChange other characteristicId = ", string);
                return;
            }
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (value == null || value.length <= 0) {
                return;
            }
            byte[] bArrC = Formula.c(value);
            if (bArrC.length > 0 && (bluetoothGattCharacteristic2 = this.n) != null && this.d != null) {
                bluetoothGattCharacteristic2.setValue(bArrC);
                this.d.writeCharacteristic(this.n);
            }
            a(value);
        } catch (SecurityException e) {
            LogUtil.e("PluginDevice_PicoocMeasureController", "doCharacteristicChange SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void a(byte[] bArr) {
        yst ystVarE;
        int i = this.k;
        if (i == 1 || i == 0) {
            ystVarE = Formula.e(bArr, this.g, i, this.f32248c);
        } else {
            ystVarE = Formula.e(bArr, this.g, 1, this.f32248c);
        }
        int iD = ystVarE.d();
        if (iD == 1) {
            if (this.f) {
                this.f = false;
                IHealthDeviceCallback iHealthDeviceCallback = this.f32247b;
                if (iHealthDeviceCallback != null) {
                    iHealthDeviceCallback.onDataChanged(this.e, a(ystVarE));
                }
                LogUtil.d("PluginDevice_PicoocMeasureController", "parserData 发送本次测量数据");
                return;
            }
            return;
        }
        if (iD == 2) {
            e(ystVarE);
            LogUtil.d("PluginDevice_PicoocMeasureController", "parserData 收到一条历史数据");
        } else if (iD == 3 && !njy.e(this.i) && this.h) {
            this.h = false;
            IHealthDeviceCallback iHealthDeviceCallback2 = this.f32247b;
            if (iHealthDeviceCallback2 != null) {
                iHealthDeviceCallback2.onDataChanged(this.e, this.i);
            }
            LogUtil.d("PluginDevice_PicoocMeasureController", "parserData 批量发送历史数据", Integer.valueOf(this.i.size()), "条");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BluetoothGatt bluetoothGatt, int i, int i2) {
        ReleaseLogUtil.d("R_PluginDevice_PicoocMeasureController", "doConnectionStateChange：", Integer.valueOf(i), " newState = ", Integer.valueOf(i2));
        if (i != 0) {
            this.m = 0;
            LogUtil.j("PluginDevice_PicoocMeasureController", "doConnectionStateChange STATUS_DISCONNECTED 2");
            IHealthDeviceCallback iHealthDeviceCallback = this.f32247b;
            if (iHealthDeviceCallback != null) {
                iHealthDeviceCallback.onStatusChanged(this.e, 3);
                return;
            }
            return;
        }
        if (i2 == 2) {
            this.d = bluetoothGatt;
            this.m = 2;
            e();
        } else {
            if (i2 != 0) {
                LogUtil.a("PluginDevice_PicoocMeasureController", "doConnectionStateChange other newState = ", Integer.valueOf(i2));
                return;
            }
            this.m = 0;
            LogUtil.j("PluginDevice_PicoocMeasureController", "doConnectionStateChange STATUS_DISCONNECTED 1");
            IHealthDeviceCallback iHealthDeviceCallback2 = this.f32247b;
            if (iHealthDeviceCallback2 != null) {
                iHealthDeviceCallback2.onStatusChanged(this.e, 3);
            }
            cleanup();
        }
    }

    private void e() {
        new Handler().postDelayed(new Runnable() { // from class: drj.5
            @Override // java.lang.Runnable
            public void run() {
                if (drj.this.d != null) {
                    drj.this.d.discoverServices();
                    return;
                }
                LogUtil.j("PluginDevice_PicoocMeasureController", "startDiscoverService mBluetoothGatt is null");
                if (drj.this.f32247b != null) {
                    drj.this.f32247b.onStatusChanged(drj.this.e, 9);
                }
            }
        }, 500L);
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController
    public BluetoothGattCallback getGattCallbackImpl() {
        return this.f32246a;
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void cleanup() {
        try {
            LogUtil.a("PluginDevice_PicoocMeasureController", "Enter cleanup");
            BluetoothGatt bluetoothGatt = this.d;
            if (bluetoothGatt != null) {
                bluetoothGatt.close();
            }
            this.d = null;
            this.o = null;
            this.n = null;
            this.j = null;
            this.f32247b = null;
        } catch (SecurityException e) {
            LogUtil.e("PluginDevice_PicoocMeasureController", "cleanup SecurityException:", ExceptionUtils.c(e));
        }
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public void ending() {
        LogUtil.a("PluginDevice_PicoocMeasureController", "Enter ending");
        BluetoothGatt bluetoothGatt = this.d;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
        }
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public boolean prepare(HealthDevice healthDevice, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        LogUtil.a("PluginDevice_PicoocMeasureController", "Enter prepare");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        d(countDownLatch);
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            LogUtil.e("PluginDevice_PicoocMeasureController", "PicoocMeasureController prepare:", e.getMessage());
        }
        this.e = healthDevice;
        this.i = new ArrayList();
        this.f = true;
        this.h = true;
        if (!super.prepare(healthDevice, iHealthDeviceCallback, bundle)) {
            return false;
        }
        this.f32247b = iHealthDeviceCallback;
        if (bundle != null) {
            this.g = bundle.getInt("height");
            this.k = bundle.getInt("sex");
            this.f32248c = bundle.getInt("age");
        } else {
            LogUtil.j("PluginDevice_PicoocMeasureController", "prepare bundle is null");
        }
        this.g = etn.e((int) this.g);
        this.k = etn.a(this.k);
        int iD = etn.d(this.f32248c);
        this.f32248c = iD;
        LogUtil.a("PluginDevice_PicoocMeasureController", "PicoocMeasureController prepare info:", Boolean.valueOf(this.g > 0.0f), Boolean.valueOf(this.k == 1), Boolean.valueOf(iD == 29));
        return true;
    }

    private void d(final CountDownLatch countDownLatch) {
        HiHealthManager.d(dxw.d()).fetchUserData(new HiCommonListener() { // from class: drj.3
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                if (obj == null) {
                    countDownLatch.countDown();
                    return;
                }
                dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
                if (currentUser != null) {
                    drj.this.g = currentUser.e();
                    drj.this.k = currentUser.d();
                    drj.this.f32248c = currentUser.c();
                } else if (!(obj instanceof List)) {
                    LogUtil.j("PluginDevice_PicoocMeasureController", "fetchUserData other data");
                } else {
                    for (Object obj2 : (List) obj) {
                        if (obj2 instanceof HiUserInfo) {
                            HiUserInfo hiUserInfo = (HiUserInfo) obj2;
                            if (hiUserInfo.getRelateType() == 0) {
                                drj.this.g = hiUserInfo.getHeight();
                                drj.this.k = hiUserInfo.getGender();
                                drj.this.f32248c = hiUserInfo.getAge();
                                break;
                            }
                        }
                    }
                }
                LogUtil.a("PluginDevice_PicoocMeasureController", "PicoocMeasureController fetchUserData info:", Boolean.valueOf(drj.this.g > 0.0f), Boolean.valueOf(drj.this.k == 1), Boolean.valueOf(drj.this.f32248c == 29));
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.j("PluginDevice_PicoocMeasureController", "PicoocMeasureController onFailure");
            }
        });
    }

    private void e(yst ystVar) {
        if (njy.e(this.i)) {
            return;
        }
        Iterator<HealthData> it = this.i.iterator();
        while (it.hasNext()) {
            if (ystVar.a() == it.next().getStartTime()) {
                return;
            }
        }
        this.i.add(a(ystVar));
    }

    private dso a(yst ystVar) {
        dso dsoVar = new dso();
        dsoVar.setWeight(ystVar.b());
        dsoVar.setBodyFatRat(ystVar.c());
        dsoVar.setStartTime(ystVar.a());
        dsoVar.setEndTime(ystVar.a());
        return dsoVar;
    }

    public void d(BluetoothGatt bluetoothGatt) {
        LogUtil.a("PluginDevice_PicoocMeasureController", "initService service = ", this.o);
        this.d = bluetoothGatt;
        if (this.o != null) {
            LogUtil.a("PluginDevice_PicoocMeasureController", "initService service is exist");
            return;
        }
        BluetoothGattService service = bluetoothGatt.getService(UUID.fromString("0000fff0-0000-1000-8000-00805f9b34fb"));
        this.o = service;
        if (service != null) {
            this.j = service.getCharacteristic(UUID.fromString("0000fff1-0000-1000-8000-00805f9b34fb"));
            this.n = this.o.getCharacteristic(UUID.fromString("0000fff2-0000-1000-8000-00805f9b34fb"));
            this.d.setCharacteristicNotification(this.j, true);
            BluetoothGattDescriptor descriptor = this.j.getDescriptor(UUID.fromString(BleConstants.CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID));
            if (descriptor != null) {
                descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
                this.d.writeDescriptor(descriptor);
            }
        }
    }
}
