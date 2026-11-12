package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.devicesdk.entity.CharacterOperationType;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.kit.wsp.task.BleTaskQueueUtil;
import com.huawei.health.device.kit.wsp.task.IAsynBleTaskCallback;
import com.huawei.health.device.kit.wsp.task.ITaskService;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.callback.ConnectStatusCallback;
import com.huawei.health.ecologydevice.callback.DataChangedCallback;
import com.huawei.health.ecologydevice.open.GattMeasureController;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class eis extends GattMeasureController implements ITaskService, ConnectStatusCallback, DataChangedCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static eis f33040c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BluetoothGattCharacteristic f33041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IHealthDeviceCallback f33042b;
    private dsa d;
    private eip f;
    private String g;
    private BluetoothGattCharacteristic h;
    private Map<String, HealthData> i;
    private BluetoothGatt l;
    private boolean o;
    private int q;
    private String r;
    private int s;
    private int t;
    private BluetoothGattCharacteristic u;
    private IAsynBleTaskCallback v;
    private BluetoothGattService w;
    private int x;
    private BleTaskQueueUtil y;
    private HealthDevice.HealthDeviceKind p = HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR;
    private boolean m = true;
    private boolean n = true;
    private char[] k = "0123456789ABCDEF".toCharArray();
    private BluetoothGattCallback j = new BluetoothGattCallback() { // from class: eis.3
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            eis.this.e(bluetoothGatt, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            eis.this.c(bluetoothGatt, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            eis.this.c(bluetoothGattCharacteristic, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            LogUtil.a("GlucoseMeasureController", "onCharacteristicChanged()");
            eis.this.d(bluetoothGattCharacteristic);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            eis.this.b(bluetoothGatt, bluetoothGattDescriptor, i);
        }
    };

    @Override // com.huawei.health.device.kit.wsp.task.ITaskService
    public void disable(dro droVar, IAsynBleTaskCallback iAsynBleTaskCallback) {
    }

    @Override // com.huawei.health.device.open.MeasureController
    public boolean start() {
        return true;
    }

    eis() {
        LogUtil.a("GlucoseMeasureController", "constructed");
        this.f = new eip();
        this.d = new dsa("bloodSugar");
        this.i = new HashMap(16);
        this.y = new BleTaskQueueUtil(this);
        ete.d().d(this.p.name());
    }

    public static eis b() {
        eis eisVar;
        synchronized (e) {
            if (f33040c == null) {
                f33040c = new eis();
            }
            eisVar = f33040c;
        }
        return eisVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        if (this.x != 1) {
            LogUtil.j("GlucoseMeasureController", "doDescriptorWrite mState is disconnected");
            return;
        }
        if (bluetoothGattDescriptor == null) {
            LogUtil.j("GlucoseMeasureController", "doDescriptorWrite bluetoothGattDescriptor is null");
            return;
        }
        String string = bluetoothGattDescriptor.getCharacteristic().getUuid().toString();
        if (i == 0) {
            b(string, bluetoothGatt);
        }
    }

    private void b(String str, BluetoothGatt bluetoothGatt) {
        LogUtil.a("GlucoseMeasureController", "doGattSuccess charUuid:", str);
        if (dmz.j.toString().equalsIgnoreCase(str)) {
            this.v.success(null);
            d(this.l, this.h, true);
            return;
        }
        if (dmz.o.toString().equalsIgnoreCase(str)) {
            try {
                BluetoothGattService service = bluetoothGatt.getService(dmz.p);
                if (service != null) {
                    a(service, bluetoothGatt);
                    return;
                }
                this.h.setValue(new byte[2]);
                this.h.setValue(1, 17, 0);
                this.h.setValue(1, 17, 1);
                this.l.writeCharacteristic(this.h);
                LogUtil.a("GlucoseMeasureController", "doGattSuccess NO_SERVICE_CURRENT_TIME");
                return;
            } catch (SecurityException e2) {
                LogUtil.e("GlucoseMeasureController", "doGattSuccess SecurityException:", ExceptionUtils.c(e2));
                return;
            }
        }
        if (dmz.q.toString().equalsIgnoreCase(str)) {
            c();
        } else {
            LogUtil.a("GlucoseMeasureController", "doGattSuccess other charUuid:", str);
        }
    }

    private void a(BluetoothGattService bluetoothGattService, BluetoothGatt bluetoothGatt) {
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(dmz.q);
        this.f33041a = characteristic;
        if (characteristic != null) {
            try {
                bluetoothGatt.setCharacteristicNotification(characteristic, true);
                BluetoothGattDescriptor descriptor = this.f33041a.getDescriptor(dmz.k);
                if (descriptor != null) {
                    LogUtil.a("GlucoseMeasureController", "doCurrentTimeService GlucoseMeasureController ENABLE_TIME_NOTIFICATION_VALUE");
                    descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                    bluetoothGatt.writeDescriptor(descriptor);
                }
            } catch (SecurityException e2) {
                LogUtil.e("GlucoseMeasureController", "doCurrentTimeService SecurityException:", ExceptionUtils.c(e2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        try {
            String string = bluetoothGattCharacteristic.getUuid().toString();
            LogUtil.a("GlucoseMeasureController", " doCharacteristicWrite statusInt:", Integer.valueOf(i), " uuid:", string);
            if (this.v == null) {
                LogUtil.j("GlucoseMeasureController", " doCharacteristicWrite mTaskCallback is null");
                return;
            }
            if (i == 0 && dmz.q.toString().equalsIgnoreCase(string)) {
                this.h.setValue(new byte[2]);
                this.h.setValue(1, 17, 0);
                this.h.setValue(1, 17, 1);
                this.l.writeCharacteristic(this.h);
            }
        } catch (SecurityException e2) {
            LogUtil.e("GlucoseMeasureController", "doCharacteristicWrite SecurityException:", ExceptionUtils.c(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(BluetoothGatt bluetoothGatt, int i) {
        if (this.x != 1) {
            LogUtil.a("GlucoseMeasureController", "doServiceDiscover mState is disconnected");
            return;
        }
        LogUtil.a("GlucoseMeasureController", "doServiceDiscover status = ", Integer.valueOf(i));
        if (i == 0) {
            BluetoothGattService service = bluetoothGatt.getService(UUID.fromString(dmz.z.toString()));
            this.w = service;
            if (service == null) {
                LogUtil.j("GlucoseMeasureController", "doServiceDiscover failed to get service");
                Bundle bundle = new Bundle();
                bundle.putString(BleConstants.MEASUREKIT_ID, this.mDevice.getMeasureKitUuid());
                LogUtil.a(907127003, "GlucoseMeasureController", bundle, false, "doServiceDiscover No GATT service found");
                return;
            }
            this.y.c(new dro(BleTaskQueueUtil.TaskType.ENABLE_GLUCOSE_MEASUREMENT, null));
            this.y.b();
            return;
        }
        LogUtil.j("GlucoseMeasureController", "doServiceDiscover status: ", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(BluetoothGatt bluetoothGatt, int i) {
        Map<String, HealthData> map;
        if (i == 2) {
            this.o = false;
            LogUtil.a("GlucoseMeasureController", "doConnectionStateChange Connected to GATT server.");
            int iC = this.d.c(dxw.d(), this.g);
            this.q = iC;
            LogUtil.d("GlucoseMeasureController", "doConnectionStateChange newestSequenceNumberInDB is ", Integer.valueOf(iC));
            this.i.clear();
            this.l = bluetoothGatt;
            this.x = 1;
            try {
                bluetoothGatt.discoverServices();
                IHealthDeviceCallback iHealthDeviceCallback = this.f33042b;
                if (iHealthDeviceCallback != null) {
                    iHealthDeviceCallback.onStatusChanged(this.mDevice, 2);
                    return;
                }
                return;
            } catch (SecurityException e2) {
                LogUtil.e("GlucoseMeasureController", "doConnectionStateChange SecurityException:", ExceptionUtils.c(e2));
                return;
            }
        }
        if (i == 0) {
            LogUtil.a("GlucoseMeasureController", "doConnectionStateChange Disconnected from GATT server.");
            if (!this.o && (map = this.i) != null && !map.isEmpty()) {
                LogUtil.d("GlucoseMeasureController", "doConnectionStateChange data has been transferred ", Integer.valueOf(this.i.size()));
                IHealthDeviceCallback iHealthDeviceCallback2 = this.f33042b;
                if (iHealthDeviceCallback2 != null) {
                    iHealthDeviceCallback2.onDataChanged(this.mDevice, d());
                }
                int i2 = this.t;
                if (i2 != 0) {
                    LogUtil.a("GlucoseMeasureController", "GlucoseMeasureController refreshedSequenceNumber is ", Integer.valueOf(i2));
                    this.d.d(dxw.d(), this.g, this.t);
                }
            }
            this.x = 0;
            cleanup();
            IHealthDeviceCallback iHealthDeviceCallback3 = this.f33042b;
            if (iHealthDeviceCallback3 != null) {
                iHealthDeviceCallback3.onStatusChanged(this.mDevice, 3);
                return;
            }
            return;
        }
        LogUtil.a("GlucoseMeasureController", "doConnectionStateChange other state:", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.x != 1) {
            LogUtil.j("GlucoseMeasureController", "doCharacteristicChange mState is disconnected");
            return;
        }
        String string = bluetoothGattCharacteristic.getUuid().toString();
        String strB = b(bluetoothGattCharacteristic.getValue());
        if (dmz.j.toString().equalsIgnoreCase(string)) {
            LogUtil.d("GlucoseMeasureController", "doCharacteristicChange CHARACTERISTIC_GLUCOSE_MEASUREMENT");
            eip eipVar = this.f;
            if (eipVar == null) {
                return;
            }
            HealthData data = eipVar.parseData(bluetoothGattCharacteristic.getValue());
            if (data instanceof emq) {
                emq emqVar = (emq) data;
                int sequenceNumber = emqVar.getSequenceNumber();
                LogUtil.a("GlucoseMeasureController", "doCharacteristicChange current sequenceNumber is ", Integer.valueOf(sequenceNumber));
                int i = this.q;
                if (i == 0 || sequenceNumber > i) {
                    e(sequenceNumber, emqVar);
                }
                this.s = sequenceNumber;
                return;
            }
            return;
        }
        if (dmz.o.toString().equalsIgnoreCase(string)) {
            LogUtil.a("GlucoseMeasureController", "doCharacteristicChange CHARACTERISTIC_RECORD_ACCESS_CONTROL_POINT");
            if (strB.endsWith("06000101")) {
                this.o = true;
                LogUtil.a("GlucoseMeasureController", "doCharacteristicChange data has been completely transferred ", Integer.valueOf(this.i.size()));
                IHealthDeviceCallback iHealthDeviceCallback = this.f33042b;
                if (iHealthDeviceCallback != null) {
                    iHealthDeviceCallback.onDataChanged(this.mDevice, d());
                }
                int i2 = this.t;
                if (i2 != 0) {
                    LogUtil.a("GlucoseMeasureController", "GlucoseMeasureController refreshedSequenceNumber is ", Integer.valueOf(i2));
                    this.d.d(dxw.d(), this.g, this.t);
                    return;
                }
                return;
            }
            return;
        }
        LogUtil.a("GlucoseMeasureController", "doCharacteristicChange other characteristicId", string);
    }

    private void e(int i, emq emqVar) {
        if (this.o) {
            LogUtil.a("GlucoseMeasureController", "doParser current sequenceNumber is ", Integer.valueOf(i), ",本次测量");
            this.i.clear();
            this.t = i;
            boolean zB = b(emqVar, i);
            int i2 = this.t;
            if (i2 != 0) {
                LogUtil.a("GlucoseMeasureController", "doParser ", "GlucoseMeasureController refreshedSequenceNumber is ", Integer.valueOf(i2));
                this.d.d(dxw.d(), this.g, this.t);
            }
            IHealthDeviceCallback iHealthDeviceCallback = this.f33042b;
            if (iHealthDeviceCallback == null || !zB) {
                return;
            }
            iHealthDeviceCallback.onDataChanged(this.mDevice, d());
            return;
        }
        int i3 = this.s;
        if (i3 != 0 && i != i3 + 1) {
            LogUtil.a("GlucoseMeasureController", "doParser ", "GlucoseMeasureController refreshedSequenceNumber is ", Integer.valueOf(this.t), ",lastNumber:", Integer.valueOf(i3), ",sequenceNumber:", Integer.valueOf(i));
            boolean zB2 = b(emqVar, i);
            if (this.t != 0) {
                this.d.d(dxw.d(), this.g, this.t);
            }
            IHealthDeviceCallback iHealthDeviceCallback2 = this.f33042b;
            if (iHealthDeviceCallback2 == null || !zB2) {
                return;
            }
            iHealthDeviceCallback2.onDataChanged(this.mDevice, d());
            return;
        }
        this.t = i;
        b(emqVar, i);
    }

    private boolean b(emq emqVar, int i) {
        if (!a(emqVar)) {
            return false;
        }
        if (this.i == null) {
            this.i = new HashMap(16);
        }
        String strValueOf = String.valueOf(emqVar.getStartTime());
        if (this.i.containsKey(strValueOf)) {
            if (!(this.i.get(strValueOf) instanceof emq)) {
                LogUtil.e("GlucoseMeasureController", "Object invalid type");
                return false;
            }
            if (i > ((emq) this.i.get(strValueOf)).getSequenceNumber()) {
                this.i.put(strValueOf, emqVar);
                return true;
            }
            LogUtil.j("GlucoseMeasureController", "Blood sugar data timestamp exists");
            return false;
        }
        this.i.put(strValueOf, emqVar);
        return true;
    }

    private ArrayList<HealthData> d() {
        return new ArrayList<>(this.i.values());
    }

    private boolean a(emq emqVar) {
        if (emqVar.getBloodSugar() - 33.0f > 1.0E-6d || 1.0f - emqVar.getBloodSugar() > 1.0E-6d) {
            LogUtil.e("GlucoseMeasureController", "Blood sugar value invalid");
            return false;
        }
        if (emqVar.getStartTime() <= System.currentTimeMillis()) {
            return true;
        }
        LogUtil.e("GlucoseMeasureController", "Blood sugar time invalid");
        return false;
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController
    public BluetoothGattCallback getGattCallbackImpl() {
        return this.j;
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public boolean prepare(HealthDevice healthDevice, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        LogUtil.d("GlucoseMeasureController", ParamConstants.CallbackMethod.ON_PREPARE);
        if (healthDevice == null) {
            return false;
        }
        this.g = healthDevice.getAddress();
        if (ete.d().b()) {
            if (super.prepare(healthDevice, iHealthDeviceCallback, bundle)) {
                String name = eis.class.getName();
                this.f33042b = iHealthDeviceCallback;
                this.r = UUID.randomUUID().toString();
                ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).putUdsClassMap(name, b());
                emk.c().d(this.r, new eff(name));
                emk.c().c(this.r, new efd(name, this.y));
                LogUtil.a("GlucoseMeasureController", "GlucoseMeasureController prepare start");
                return true;
            }
        } else if (super.prepare(healthDevice, iHealthDeviceCallback, bundle)) {
            this.f33042b = iHealthDeviceCallback;
            return true;
        }
        return false;
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public void ending() {
        LogUtil.a("GlucoseMeasureController", "ending");
        BluetoothGatt bluetoothGatt = this.l;
        if (bluetoothGatt != null) {
            try {
                bluetoothGatt.disconnect();
            } catch (SecurityException e2) {
                LogUtil.e("GlucoseMeasureController", "ending SecurityException:", ExceptionUtils.c(e2));
                return;
            }
        }
        this.m = true;
        this.n = true;
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void cleanup() {
        LogUtil.a("GlucoseMeasureController", "cleanup");
        BluetoothGatt bluetoothGatt = this.l;
        if (bluetoothGatt != null) {
            try {
                bluetoothGatt.close();
            } catch (SecurityException e2) {
                LogUtil.e("GlucoseMeasureController", "cleanup SecurityException:", ExceptionUtils.c(e2));
                return;
            }
        }
        this.l = null;
        this.h = null;
        this.w = null;
        this.u = null;
        this.f = null;
        this.f33042b = null;
        this.x = 0;
        if (ete.d().b()) {
            emk.c().a();
            emk.c().b(this.r);
            emk.c().a(this.r);
            ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).clearUdsClassMap();
        }
        a();
        this.r = null;
    }

    private static void a() {
        synchronized (e) {
            f33040c = null;
        }
    }

    private void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        LogUtil.a("GlucoseMeasureController", "setCharNotification() enabled:", Boolean.valueOf(z));
        try {
            bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z);
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(dmz.k);
            if (descriptor == null) {
                LogUtil.j("GlucoseMeasureController", "setCharNotification descriptor == null");
                return;
            }
            if (z) {
                descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            } else {
                descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
            }
            bluetoothGatt.writeDescriptor(descriptor);
        } catch (SecurityException e2) {
            LogUtil.e("GlucoseMeasureController", "setCharNotification SecurityException:", ExceptionUtils.c(e2));
        }
    }

    private void d(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        LogUtil.a("GlucoseMeasureController", "setCharIndication() enabled:", Boolean.valueOf(z));
        try {
            bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z);
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(dmz.k);
            if (descriptor == null) {
                LogUtil.j("GlucoseMeasureController", "setCharIndication descriptor == null");
                return;
            }
            if (z) {
                descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
            } else {
                descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
            }
            this.l.writeDescriptor(descriptor);
        } catch (SecurityException e2) {
            LogUtil.e("GlucoseMeasureController", "setCharIndication SecurityException:", ExceptionUtils.c(e2));
        }
    }

    private String b(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = this.k;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public void c() {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        int i3 = calendar.get(5);
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        int i6 = calendar.get(13);
        boolean z = calendar.getFirstDayOfWeek() == 1;
        int i7 = calendar.get(7);
        LogUtil.d("GlucoseMeasureController", "GlucoseMeasureController syncCurrentTime data：", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        if (z && (i7 = i7 - 1) == 0) {
            i7 = 7;
        }
        LogUtil.d("GlucoseMeasureController", "GlucoseMeasureController syncCurrentTime time：", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
        this.y.c(new dro(BleTaskQueueUtil.TaskType.SET_TIME, new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) (i2 & 255), (byte) (i3 & 255), (byte) (i4 & 255), (byte) (i5 & 255), (byte) (i6 & 255), (byte) (i7 & 255), 0, 0}));
        this.y.b();
    }

    private boolean d(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        if (this.l == null || bluetoothGattCharacteristic == null) {
            return false;
        }
        try {
            bluetoothGattCharacteristic.setValue(bArr);
            bluetoothGattCharacteristic.setWriteType(1);
            boolean zWriteCharacteristic = this.l.writeCharacteristic(bluetoothGattCharacteristic);
            LogUtil.a("GlucoseMeasureController", "writeCharacteristic --> ", c(bArr));
            return zWriteCharacteristic;
        } catch (SecurityException e2) {
            LogUtil.e("GlucoseMeasureController", "writeCharacteristic SecurityException:", ExceptionUtils.c(e2));
            return false;
        }
    }

    private String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            LogUtil.j("GlucoseMeasureController", "GlucoseMeasureController bytesToHexString content is null ");
            return null;
        }
        LogUtil.d("GlucoseMeasureController", "GlucoseMeasureController bytesToHexString start to Hex String");
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString + " ");
        }
        return sb.toString();
    }

    @Override // com.huawei.health.device.kit.wsp.task.ITaskService
    public void enable(dro droVar, IAsynBleTaskCallback iAsynBleTaskCallback) {
        LogUtil.a("GlucoseMeasureController", " enter enable");
        if (ete.d().b()) {
            this.v = iAsynBleTaskCallback;
            ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).setCharacteristicNotifyByUds(this.g, dmz.z.toString(), dmz.j.toString(), true);
            return;
        }
        this.u = this.w.getCharacteristic(dmz.j);
        BluetoothGattCharacteristic characteristic = this.w.getCharacteristic(dmz.o);
        this.h = characteristic;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.u;
        if (bluetoothGattCharacteristic != null && characteristic != null) {
            this.v = iAsynBleTaskCallback;
            a(this.l, bluetoothGattCharacteristic, true);
        } else {
            LogUtil.a("GlucoseMeasureController", "enable mTargetMeasurementChar and mGattChar is null");
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // com.huawei.health.device.kit.wsp.task.ITaskService
    public void write(dro droVar, IAsynBleTaskCallback iAsynBleTaskCallback) {
        boolean zD;
        IAsynBleTaskCallback iAsynBleTaskCallback2;
        LogUtil.a("GlucoseMeasureController", " enter write");
        if (ete.d().b()) {
            this.v = iAsynBleTaskCallback;
            zD = d(droVar);
        } else {
            BluetoothGattService service = this.l.getService(dmz.p);
            if (service != null) {
                BluetoothGattCharacteristic characteristic = service.getCharacteristic(dmz.q);
                if (characteristic != null) {
                    this.v = iAsynBleTaskCallback;
                    boolean zD2 = d(characteristic, droVar.d());
                    LogUtil.a("GlucoseMeasureController", "Write key:", droVar.f().toString(), " isSuccess:", Boolean.valueOf(zD2));
                    zD = zD2;
                }
            } else {
                LogUtil.j("GlucoseMeasureController", "write BluetoothGattService is null");
            }
            iAsynBleTaskCallback2 = this.v;
            if (iAsynBleTaskCallback2 != null) {
                iAsynBleTaskCallback2.failed();
            }
        }
        if (zD) {
            return;
        }
        iAsynBleTaskCallback2 = this.v;
        if (iAsynBleTaskCallback2 != null) {
            iAsynBleTaskCallback2.failed();
        }
    }

    private boolean d(dro droVar) {
        if (droVar == null) {
            return false;
        }
        if (!TextUtils.isEmpty(this.g)) {
            cmm cmmVar = new cmm();
            cmmVar.a(droVar.d());
            c(cmmVar, dmz.p.toString(), dmz.q.toString(), this.g, CharacterOperationType.WRITE);
            return true;
        }
        LogUtil.j("GlucoseMeasureController", "writeDataUds : macAddress is null");
        return false;
    }

    private void c(cmm cmmVar, String str, String str2, String str3, CharacterOperationType characterOperationType) {
        if (cmmVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            LogUtil.j("GlucoseMeasureController", "data is null || serviceUuid == null || characterUuid == null || mac == null");
            return;
        }
        synchronized (e) {
            UniteDevice uniteDeviceD = ete.d().d(str3, 2);
            if (uniteDeviceD != null) {
                emk.c().d(uniteDeviceD, emk.c().e(cmmVar, str, str2, characterOperationType));
                LogUtil.a("GlucoseMeasureController", "setDateTime : data frames:", eeq.e(cmmVar.d()));
            } else {
                LogUtil.j("GlucoseMeasureController", "uniteDevice is null");
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceConnected(int i, DeviceInfo deviceInfo) {
        this.o = false;
        LogUtil.a("GlucoseMeasureController", "doDeviceConnected Connected.");
        int iC = this.d.c(dxw.d(), this.g);
        this.q = iC;
        LogUtil.d("GlucoseMeasureController", "doConnectionStateChange newestSequenceNumberInDB is ", Integer.valueOf(iC));
        this.i.clear();
        this.x = 1;
        this.y.c(new dro(BleTaskQueueUtil.TaskType.ENABLE_GLUCOSE_MEASUREMENT, null));
        this.y.b();
        IHealthDeviceCallback iHealthDeviceCallback = this.f33042b;
        if (iHealthDeviceCallback != null) {
            iHealthDeviceCallback.onStatusChanged(this.mDevice, 2);
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceDisconnect(int i) {
        Map<String, HealthData> map;
        LogUtil.a("GlucoseMeasureController", "doDeviceDisconnect enter");
        if (!this.o && (map = this.i) != null && !map.isEmpty()) {
            LogUtil.d("GlucoseMeasureController", "doConnectionStateChange data has been transferred ", Integer.valueOf(this.i.size()));
            IHealthDeviceCallback iHealthDeviceCallback = this.f33042b;
            if (iHealthDeviceCallback != null) {
                iHealthDeviceCallback.onDataChanged(this.mDevice, d());
            }
            int i2 = this.t;
            if (i2 != 0) {
                LogUtil.a("GlucoseMeasureController", "GlucoseMeasureController refreshedSequenceNumber is ", Integer.valueOf(i2));
                this.d.d(dxw.d(), this.g, this.t);
            }
        }
        this.x = 0;
        cleanup();
        IHealthDeviceCallback iHealthDeviceCallback2 = this.f33042b;
        if (iHealthDeviceCallback2 != null) {
            iHealthDeviceCallback2.onStatusChanged(this.mDevice, 3);
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceConnecting(int i) {
        LogUtil.a("GlucoseMeasureController", "doDeviceConnecting enter");
    }

    @Override // com.huawei.health.ecologydevice.callback.DataChangedCallback
    public void onDataChanged(cmm cmmVar) {
        LogUtil.a("GlucoseMeasureController", "onDataChanged enter");
        if (cmmVar == null) {
            LogUtil.j("GlucoseMeasureController", "onDataChanged dataFrame is null");
            return;
        }
        if (cmmVar.d() != null && cmmVar.d().length > 0 && cmmVar.d()[0] == 0) {
            LogUtil.a("GlucoseMeasureController", "frames[0] is 0");
            c(cmmVar);
        }
        String strB = cmmVar.b();
        if (dmz.j.toString().equalsIgnoreCase(strB)) {
            e(cmmVar);
            return;
        }
        if (dmz.o.toString().equalsIgnoreCase(strB)) {
            a(cmmVar);
        } else if (dmz.q.toString().equals(strB)) {
            c();
            c(cmmVar);
        } else {
            LogUtil.j("GlucoseMeasureController", "onDataChanged other uuid");
        }
    }

    private void c(cmm cmmVar) {
        cmmVar.a(new byte[]{1, 1});
        c(cmmVar, dmz.z.toString(), dmz.o.toString(), this.g, CharacterOperationType.WRITE);
    }

    private void e(cmm cmmVar) {
        LogUtil.a("GlucoseMeasureController", "measurementCallback mIsFirstMeasurement is ", Boolean.valueOf(this.m));
        if (this.m) {
            this.v.success(null);
            ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).setCharacteristicNotifyByUds(this.g, dmz.z.toString(), dmz.o.toString(), true);
            this.m = false;
            return;
        }
        eip eipVar = this.f;
        if (eipVar == null) {
            return;
        }
        HealthData data = eipVar.parseData(cmmVar.d());
        if (data instanceof emq) {
            emq emqVar = (emq) data;
            int sequenceNumber = emqVar.getSequenceNumber();
            LogUtil.a("GlucoseMeasureController", "onDataChanged current sequenceNumber is ", Integer.valueOf(sequenceNumber));
            int i = this.q;
            if (i == 0 || sequenceNumber > i) {
                e(sequenceNumber, emqVar);
            }
            this.s = sequenceNumber;
        }
    }

    private void a(cmm cmmVar) {
        if (this.n) {
            ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).setCharacteristicNotifyByUds(this.g, dmz.p.toString(), dmz.q.toString(), true);
            this.n = false;
            return;
        }
        if (b(cmmVar.d()).endsWith("06000101")) {
            this.o = true;
            IHealthDeviceCallback iHealthDeviceCallback = this.f33042b;
            if (iHealthDeviceCallback != null) {
                iHealthDeviceCallback.onDataChanged(this.mDevice, d());
            }
            int i = this.t;
            if (i != 0) {
                LogUtil.a("GlucoseMeasureController", "GlucoseMeasureController refreshedSequenceNumber is ", Integer.valueOf(i));
                this.d.d(dxw.d(), this.g, this.t);
            }
        }
    }
}
