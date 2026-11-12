package defpackage;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.miot.core.BluetoothExtKt;
import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import com.xiaomi.miot.core.bluetooth.TransferLogger;
import com.xiaomi.miot.core.bluetooth.TransferLoggerKt;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public class rye {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BluetoothDevice f33062b;
    public final c c;
    public volatile wvc d;
    public volatile int e;
    public volatile BluetoothGattCallback i;
    public long f = 0;
    public int g = 0;
    public long h = 0;
    public final ServiceConnection j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f33063k = false;
    public final qvc l = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<BluetoothGattService> f33061a = new ArrayList();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            TransferLoggerKt.logger.i("MIUIBluetoothGatt", "onBindingDied() called with: name = [" + componentName + "]");
            if (rye.this.g == 0) {
                rye.this.h = System.currentTimeMillis();
            }
            rye.this.g++;
            long jCurrentTimeMillis = System.currentTimeMillis() - rye.this.h;
            if (rye.this.g < 3) {
                rye.this.m();
                return;
            }
            if (jCurrentTimeMillis <= 900000) {
                rye.this.c.m();
                return;
            }
            rye.this.g = 1;
            rye.this.h = System.currentTimeMillis();
            rye.this.m();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            rye.this.d = wvc.a.s2(iBinder);
            TransferLoggerKt.logger.i("MIUIBluetoothGatt", "onServiceConnected: " + rye.this.d);
            if (rye.this.d != null) {
                rye.this.c.i();
            } else {
                rye.this.c.m();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            TransferLoggerKt.logger.i("MIUIBluetoothGatt", "onServiceDisconnected() called with: name = [" + componentName + "]");
            rye.this.d = null;
        }
    }

    public class b extends qvc.a {
        public b() {
        }

        @Override // defpackage.qvc
        public void A(BluetoothDevice bluetoothDevice, String str, String str2, String str3, int i, byte[] bArr) throws RemoteException {
            BluetoothGattDescriptor bluetoothGattDescriptorH4 = h4(str, str2, str3);
            if (bluetoothGattDescriptorH4 == null) {
                TransferLoggerKt.logger.d("MIUIBluetoothGatt", "onDescriptorWrite: localDescriptor = null", new Object[0]);
            } else {
                rye.this.i.onDescriptorWrite(null, bluetoothGattDescriptorH4, i);
            }
        }

        @Override // defpackage.qvc
        public void B2(BluetoothDevice bluetoothDevice, String str, String str2, int i, byte[] bArr) throws RemoteException {
            BluetoothGattCharacteristic bluetoothGattCharacteristicS2 = s2(str, str2);
            if (bluetoothGattCharacteristicS2 == null) {
                TransferLoggerKt.logger.d("MIUIBluetoothGatt", "onCharacteristicRead: local = null", new Object[0]);
            } else {
                bluetoothGattCharacteristicS2.setValue(bArr);
                rye.this.i.onCharacteristicRead(null, bluetoothGattCharacteristicS2, i);
            }
        }

        @Override // defpackage.qvc
        public void H1(BluetoothDevice bluetoothDevice, int i) throws RemoteException {
            rye.this.i.onReadRemoteRssi(null, i, 0);
        }

        @Override // defpackage.qvc
        public void K0(BluetoothDevice bluetoothDevice, String str, String str2, String str3, int i, byte[] bArr) throws RemoteException {
            BluetoothGattDescriptor bluetoothGattDescriptorH4 = h4(str, str2, str3);
            if (bluetoothGattDescriptorH4 == null) {
                TransferLoggerKt.logger.d("MIUIBluetoothGatt", "onDescriptorRead: localDescriptor = null", new Object[0]);
            } else {
                rye.this.i.onDescriptorRead(null, bluetoothGattDescriptorH4, i);
            }
        }

        @Override // defpackage.qvc
        public void S3(BluetoothDevice bluetoothDevice, String str, String str2, int i, byte[] bArr) throws RemoteException {
            BluetoothGattCharacteristic bluetoothGattCharacteristicS2 = s2(str, str2);
            if (bluetoothGattCharacteristicS2 == null) {
                TransferLoggerKt.logger.d("MIUIBluetoothGatt", "onCharacteristicWrite: localCharacteristic = null", new Object[0]);
            } else {
                rye.this.i.onCharacteristicWrite(null, bluetoothGattCharacteristicS2, i);
            }
        }

        @Override // defpackage.qvc
        public void V(BluetoothDevice bluetoothDevice, List<BluetoothGattService> list, int i) throws RemoteException {
            TransferLoggerKt.logger.i("MIUIBluetoothGatt", "onServicesDiscovered() called with: device = [" + bluetoothDevice + "], services = [" + list + "], status = [" + i + "]");
            rye.this.f33061a.addAll(list);
            rye.this.i.onServicesDiscovered(null, i);
        }

        public BluetoothGattDescriptor h4(String str, String str2, String str3) {
            for (BluetoothGattService bluetoothGattService : rye.this.f33061a) {
                if (bluetoothGattService.getUuid().toString().equals(str)) {
                    for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                        if (bluetoothGattCharacteristic.getUuid().toString().equals(str2)) {
                            for (BluetoothGattDescriptor bluetoothGattDescriptor : bluetoothGattCharacteristic.getDescriptors()) {
                                if (bluetoothGattDescriptor.getUuid().toString().equals(str3)) {
                                    return bluetoothGattDescriptor;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }

        @Override // defpackage.qvc
        public void o3(int i, int i2, String str) throws RemoteException {
            TransferLoggerKt.logger.i("MIUIBluetoothGatt", "onError() called with: code = [" + i + "], subCode = [" + i2 + "], message = [" + str + "]");
            if (i == 1 || i == 3) {
                if (i2 == 1000) {
                    rye.this.f33063k = true;
                    rye.this.i.onConnectionStateChange(null, 0, 0);
                } else if (i2 == 2000) {
                    try {
                        q1(null, 0, 0, 0L);
                        rye.this.c.m();
                    } catch (Exception e) {
                        TransferLoggerKt.logger.e("MIUIBluetoothGatt", "onError: close cloud", new RuntimeException());
                        e.printStackTrace();
                    }
                }
            }
        }

        @Override // defpackage.qvc
        public void q1(BluetoothDevice bluetoothDevice, int i, int i2, long j) throws RemoteException {
            TransferLogger transferLogger = TransferLoggerKt.logger;
            StringBuilder sb = new StringBuilder();
            sb.append("onPCServiceStatus() called with: device = [");
            sb.append(bluetoothDevice == null ? "" : bluetoothDevice.getAddress());
            sb.append("], status = [");
            sb.append(i);
            sb.append("], newState = [");
            sb.append(i2);
            sb.append("], time = [");
            sb.append(j);
            sb.append("]");
            transferLogger.i("MIUIBluetoothGatt", sb.toString());
            rye.this.e = i;
            if (i2 == 2) {
                rye.this.f = j;
            }
            rye.this.i.onConnectionStateChange(null, i, i2);
        }

        @Override // defpackage.qvc
        public void q2(BluetoothDevice bluetoothDevice, String str, String str2, byte[] bArr) throws RemoteException {
            BluetoothGattCharacteristic bluetoothGattCharacteristicS2 = s2(str, str2);
            if (bluetoothGattCharacteristicS2 == null) {
                TransferLoggerKt.logger.d("MIUIBluetoothGatt", "onCharacteristicChanged: characteristic null", new Object[0]);
            } else {
                bluetoothGattCharacteristicS2.setValue(bArr);
                rye.this.i.onCharacteristicChanged(null, bluetoothGattCharacteristicS2);
            }
        }

        @Override // defpackage.qvc
        public void r3(BluetoothDevice bluetoothDevice, byte[] bArr) throws RemoteException {
        }

        @Override // defpackage.qvc
        @SuppressLint({"NewApi"})
        public void r4(BluetoothDevice bluetoothDevice, int i, int i2) throws RemoteException {
            rye.this.i.onMtuChanged(null, i, i2);
        }

        public BluetoothGattCharacteristic s2(String str, String str2) {
            for (BluetoothGattService bluetoothGattService : rye.this.f33061a) {
                if (bluetoothGattService.getUuid().toString().equals(str)) {
                    for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                        if (bluetoothGattCharacteristic.getUuid().toString().equals(str2)) {
                            return bluetoothGattCharacteristic;
                        }
                    }
                }
            }
            return null;
        }
    }

    public interface c {
        void i();

        void m();
    }

    public rye(BluetoothDevice bluetoothDevice, c cVar) {
        this.f33062b = bluetoothDevice;
        this.c = cVar;
    }

    public boolean A() throws RemoteException {
        return this.d.x4(this.f33062b);
    }

    public boolean B(int i) {
        return false;
    }

    public boolean C(int i) throws RemoteException {
        return this.d.g4(this.f33062b, i);
    }

    public boolean D(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) throws RemoteException {
        if (this.d != null && this.f33062b != null) {
            return this.d.C4(this.f33062b, bluetoothGattCharacteristic.getService().getUuid().toString(), bluetoothGattCharacteristic.getUuid().toString(), z);
        }
        TransferLoggerKt.logger.i("MIUIBluetoothGatt", "setCharacteristicNotification: null service");
        return false;
    }

    public void E(BluetoothGattCallback bluetoothGattCallback) {
        this.i = bluetoothGattCallback;
    }

    public void F(int i, int i2, int i3) {
    }

    public void G() {
        try {
            BluetoothExtKt.context.unbindService(this.j);
        } catch (Exception e) {
            TransferLoggerKt.logger.i("MIUIBluetoothGatt", "unbindService: ", e);
        }
    }

    public boolean H(BluetoothGattCharacteristic bluetoothGattCharacteristic) throws RemoteException {
        if (bluetoothGattCharacteristic == null || bluetoothGattCharacteristic.getService() == null) {
            return false;
        }
        if (this.d != null && this.f33062b != null) {
            return this.d.i0(this.f33062b, bluetoothGattCharacteristic.getService().getUuid().toString(), bluetoothGattCharacteristic.getUuid().toString(), bluetoothGattCharacteristic.getValue());
        }
        TransferLoggerKt.logger.i("MIUIBluetoothGatt", "writeCharacteristic: null service");
        return false;
    }

    public boolean I(BluetoothGattDescriptor bluetoothGattDescriptor) throws RemoteException {
        if (bluetoothGattDescriptor == null) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
        BluetoothGattService service = characteristic.getService();
        if (this.d != null && this.f33062b != null) {
            return this.d.Q4(this.f33062b, service.getUuid().toString(), characteristic.getUuid().toString(), bluetoothGattDescriptor.getUuid().toString(), bluetoothGattDescriptor.getValue(), 0);
        }
        TransferLoggerKt.logger.i("MIUIBluetoothGatt", "writeDescriptor: null service");
        return false;
    }

    public void m() {
        TransferLoggerKt.logger.i("MIUIBluetoothGatt", "bindService() called");
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.bluetooth.peripheral.MiuiPeripheralConnectionService");
        intent.setPackage("com.xiaomi.bluetooth");
        if (BluetoothExtKt.context.bindService(intent, this.j, 1)) {
            return;
        }
        this.c.m();
    }

    public void n() {
        TransferLogger transferLogger = TransferLoggerKt.logger;
        StringBuilder sb = new StringBuilder();
        sb.append("close: ");
        BluetoothDevice bluetoothDevice = this.f33062b;
        sb.append(bluetoothDevice == null ? "" : bluetoothDevice.getAddress());
        transferLogger.i("MIUIBluetoothGatt", sb.toString());
    }

    public boolean o() {
        try {
            boolean zB3 = this.d.B3(this.f33062b, 2);
            TransferLoggerKt.logger.i("MIUIBluetoothGatt", "connectGatt: isRegisted = " + zB3);
            if (zB3) {
                this.d.L(this.f33062b, this.l);
                return true;
            }
            boolean zB2 = this.d.b2(this.f33062b, 2, null, r(), this.l);
            TransferLoggerKt.logger.i("MIUIBluetoothGatt", "connectGatt: register result = " + zB2);
            if (zB2) {
                this.f33063k = false;
            } else if (this.f33063k && (zB2 = this.d.b2(this.f33062b, 2, null, r(), this.l))) {
                this.f33063k = false;
            }
            return zB2;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e2) {
            TransferLoggerKt.logger.i("MIUIBluetoothGatt", "connectGatt: exception " + e2);
            e2.printStackTrace();
            return false;
        }
    }

    public void p() {
        TransferLogger transferLogger = TransferLoggerKt.logger;
        StringBuilder sb = new StringBuilder();
        sb.append("disconnect: ");
        BluetoothDevice bluetoothDevice = this.f33062b;
        sb.append(bluetoothDevice == null ? "" : bluetoothDevice.getAddress());
        transferLogger.i("MIUIBluetoothGatt", sb.toString());
        try {
            this.d.t4(this.f33062b, 2);
            TransferLoggerKt.logger.i("MIUIBluetoothGatt", "disconnect: isregister = " + this.d.B3(this.f33062b, 2));
        } catch (Exception e) {
            e.printStackTrace();
            TransferLoggerKt.logger.i("MIUIBluetoothGatt", "disconnect: exception " + e.getMessage());
        }
    }

    public void q() throws RemoteException {
        this.f33061a.clear();
        if (this.d == null || this.f33062b == null) {
            TransferLoggerKt.logger.i("MIUIBluetoothGatt", "discoverServices: null service");
        }
        this.d.f4(this.f33062b);
    }

    public final String r() {
        return BluetoothManager.get().getChannel() + ".KeepAliveService.START";
    }

    public BluetoothDevice s() {
        return this.f33062b;
    }

    public long t() {
        return this.f;
    }

    public BluetoothGattService u(UUID uuid) {
        for (BluetoothGattService bluetoothGattService : this.f33061a) {
            if (bluetoothGattService.getUuid().equals(uuid)) {
                return bluetoothGattService;
            }
        }
        return null;
    }

    public boolean v() {
        return this.f33063k;
    }

    public boolean w(BluetoothGattCharacteristic bluetoothGattCharacteristic) throws RemoteException {
        if (bluetoothGattCharacteristic == null || bluetoothGattCharacteristic.getService() == null) {
            return false;
        }
        if (this.d != null && this.f33062b != null) {
            return this.d.R(this.f33062b, bluetoothGattCharacteristic.getService().getUuid().toString(), bluetoothGattCharacteristic.getUuid().toString());
        }
        TransferLoggerKt.logger.i("MIUIBluetoothGatt", "readCharacteristic: null service");
        return false;
    }

    public boolean x(BluetoothGattDescriptor bluetoothGattDescriptor) throws RemoteException {
        if (bluetoothGattDescriptor == null) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
        return this.d.w2(this.f33062b, characteristic.getService().getUuid().toString(), characteristic.getUuid().toString(), bluetoothGattDescriptor.getUuid().toString(), 0);
    }

    public void y() {
    }

    public boolean z() throws RemoteException {
        return this.d.G1(this.f33062b);
    }
}
