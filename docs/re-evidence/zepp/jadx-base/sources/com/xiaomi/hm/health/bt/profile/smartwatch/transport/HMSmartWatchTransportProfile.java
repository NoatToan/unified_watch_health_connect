package com.xiaomi.hm.health.bt.profile.smartwatch.transport;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.utils.BytesUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public class HMSmartWatchTransportProfile extends HMBaseProfile {
    private static final String e = "HMSmartWatchTransportProfile";
    private static final byte i = 0;
    private static final byte j = 1;
    private static final byte k = 16;
    private static final byte l = 32;
    private static final int m = 0;
    private static final int n = 1;
    private static final int o = 2;
    private static int u;
    private static int v;
    private BluetoothGattCharacteristic b;
    private BluetoothGattCharacteristic c;
    private DataListener d;
    private static final UUID f = UUID.fromString("0000fed0-0000-3512-2118-0009af100700");
    private static final UUID g = UUID.fromString("00000010-0000-3512-2118-0009af100700");
    private static final UUID h = UUID.fromString("00000011-0000-3512-2118-0009af100700");
    private static int p = 20;
    private static int q = 3;
    private static int r = 20 - 3;
    private static ByteBuf s = Unpooled.buffer(1024000);
    private static ByteBuf t = Unpooled.buffer(1024000);

    public interface DataListener {
        void onReceiveData(byte[] data);
    }

    public HMSmartWatchTransportProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(byte[] bArr) {
        DataListener dataListener;
        byte[] bArrReceiveData = receiveData(bArr);
        if (bArrReceiveData == null || (dataListener = this.d) == null) {
            return;
        }
        dataListener.onReceiveData(bArrReceiveData);
    }

    private void d(int id, byte[] data) {
        if (data == null || data.length == 0) {
            return;
        }
        Log.d("", "Send Data [Id: " + id + "]: " + BytesUtil.log(data) + ", MTU: " + p + ", Pack Data Length: " + r, new Object[0]);
        if (data.length > r) {
            e(id, data);
            return;
        }
        byte[] bArr = new byte[data.length + q];
        bArr[0] = (byte) (id & 255);
        bArr[1] = 0;
        bArr[2] = 0;
        f(data, bArr);
    }

    private void e(int id, byte[] data) {
        s.clear();
        s.writeBytes(data);
        int i2 = 0;
        boolean z = true;
        while (true) {
            int i3 = s.readableBytes();
            int i4 = r;
            if (i3 <= i4) {
                byte[] bArr = new byte[i3];
                s.readBytes(i3).readBytes(bArr);
                byte[] bArr2 = new byte[i3 + q];
                bArr2[0] = (byte) (id & 255);
                bArr2[1] = 32;
                bArr2[2] = (byte) (i2 & 255);
                f(bArr, bArr2);
                s.clear();
                return;
            }
            ByteBuf bytes = s.readBytes(i4);
            byte[] bArr3 = new byte[i4];
            bytes.readBytes(bArr3);
            byte[] bArr4 = new byte[p];
            bArr4[0] = (byte) (id & 255);
            bArr4[1] = z ? (byte) 1 : (byte) 16;
            bArr4[2] = (byte) (i2 & 255);
            f(bArr3, bArr4);
            i2++;
            z = false;
        }
    }

    private void f(byte[] originData, byte[] packData) {
        System.arraycopy(originData, 0, packData, 3, originData.length);
        Log.d("", "Write Pack: " + BytesUtil.log(packData), new Object[0]);
        write(this.b, packData);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        Log.d(e, "DeInit...", new Object[0]);
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.c;
        if (bluetoothGattCharacteristic == null) {
            return true;
        }
        unregisterNotification(bluetoothGattCharacteristic);
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        Log.d(e, "Init...", new Object[0]);
        UUID uuid = f;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            Log.w(e, "Service: " + uuid + " is Null!!", new Object[0]);
            return false;
        }
        UUID uuid2 = g;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.b = characteristic;
        if (characteristic == null) {
            Log.w(e, "Send Characteristic: " + uuid2 + " is Null!!", new Object[0]);
            return false;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.c;
        if (bluetoothGattCharacteristic != null) {
            unregisterNotification(bluetoothGattCharacteristic);
        }
        UUID uuid3 = h;
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(uuid3);
        this.c = characteristic2;
        if (characteristic2 == null) {
            Log.w(e, "Receive Characteristic: " + uuid3 + " is Null!!", new Object[0]);
            return false;
        }
        unregisterNotification(characteristic2);
        boolean zRegisterNotification = registerNotification(this.c, new IGattCallback.INotifyCallback() { // from class: vh3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.c(bArr);
            }
        });
        Log.d(e, "Init Success: " + zRegisterNotification, new Object[0]);
        return zRegisterNotification;
    }

    public byte[] receiveData(byte[] data) {
        Log.d("", "Receive Pack: " + BytesUtil.log(data), new Object[0]);
        if (data != null) {
            int length = data.length;
            int i2 = q;
            if (length > i2) {
                int i3 = data[0] & 255;
                byte b = data[1];
                int i4 = data[2] & 255;
                if (b == 0) {
                    int length2 = data.length - i2;
                    byte[] bArr = new byte[length2];
                    System.arraycopy(data, 3, bArr, 0, length2);
                    Log.d("", "Receive Data: " + BytesUtil.log(bArr), new Object[0]);
                    return bArr;
                }
                if (b == 1) {
                    u = i3;
                    v = 0;
                    t.clear();
                } else {
                    if (i3 != u) {
                        Log.w("", "Receive Err, Current Id: " + u + ", Receive Id: " + i3, new Object[0]);
                        u = 0;
                        v = 0;
                        t.clear();
                        return null;
                    }
                    if (i4 != v) {
                        Log.w("", "Receive Err, Current Index: " + v + ", Receive Index: " + i4, new Object[0]);
                        u = 0;
                        v = 0;
                        t.clear();
                        return null;
                    }
                }
                int length3 = data.length - q;
                byte[] bArr2 = new byte[length3];
                System.arraycopy(data, 3, bArr2, 0, length3);
                t.writeBytes(bArr2);
                int i5 = v + 1;
                v = i5;
                v = i5 % 256;
                if (b == 32) {
                    int i6 = t.readableBytes();
                    ByteBuf bytes = t.readBytes(i6);
                    byte[] bArr3 = new byte[i6];
                    bytes.readBytes(bArr3);
                    u = 0;
                    v = 0;
                    t.clear();
                    Log.d("", "Receive Data [Id: " + i3 + "]: " + BytesUtil.log(bArr3), new Object[0]);
                    return bArr3;
                }
            }
        }
        return null;
    }

    public void send(int id, byte[] data) {
        d(id, data);
    }

    public void setDataListener(DataListener listener) {
        this.d = listener;
    }
}
