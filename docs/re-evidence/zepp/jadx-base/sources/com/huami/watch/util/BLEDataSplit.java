package com.huami.watch.util;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/* JADX INFO: loaded from: classes11.dex */
public class BLEDataSplit {
    private static final byte a = 0;
    private static final byte b = 1;
    private static final byte c = 16;
    private static final byte d = 32;
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static int h = 20;
    private static int i = 3;
    private static int m;
    private static int n;
    private static int j = 20 - 3;
    private static ByteBuf k = Unpooled.buffer(1024000);
    private static ByteBuf l = Unpooled.buffer(1024000);
    public static final Object mLock = new Object();

    private static void a(int i2, byte[] bArr, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        k.writeBytes(bArr);
        int i3 = 0;
        boolean z = true;
        while (true) {
            int i4 = k.readableBytes();
            int i5 = j;
            if (i4 <= i5) {
                int i6 = k.readableBytes() % j;
                byte[] bArr2 = new byte[i6];
                k.readBytes(i6).readBytes(bArr2);
                byte[] bArr3 = new byte[i6 + i];
                bArr3[0] = (byte) (i2 & 255);
                bArr3[1] = 32;
                bArr3[2] = (byte) (i3 & 255);
                b(bArr2, bArr3, bluetoothGatt, bluetoothGattCharacteristic);
                return;
            }
            ByteBuf bytes = k.readBytes(i5);
            byte[] bArr4 = new byte[i5];
            bytes.readBytes(bArr4);
            byte[] bArr5 = new byte[h];
            bArr5[0] = (byte) (i2 & 255);
            bArr5[1] = z ? (byte) 1 : (byte) 16;
            bArr5[2] = (byte) (i3 & 255);
            b(bArr4, bArr5, bluetoothGatt, bluetoothGattCharacteristic);
            i3++;
            z = false;
        }
    }

    private static void b(byte[] bArr, byte[] bArr2, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        System.arraycopy(bArr, 0, bArr2, 3, bArr.length);
        Log.v("", "Write Pack: " + BytesUtil.log(bArr2), new Object[0]);
        bluetoothGattCharacteristic.setValue(bArr2);
        Object obj = mLock;
        synchronized (obj) {
            bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
            try {
                obj.wait(30000L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static byte[] receiveData(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i2 = i;
            if (length > i2) {
                int i3 = bArr[0] & 255;
                byte b2 = bArr[1];
                int i4 = bArr[2] & 255;
                if (b2 == 0) {
                    int length2 = bArr.length - i2;
                    byte[] bArr2 = new byte[length2];
                    System.arraycopy(bArr, 3, bArr2, 0, length2);
                    Log.d("", "Receive Data: " + BytesUtil.log(bArr2), new Object[0]);
                    return bArr2;
                }
                if (b2 == 1) {
                    m = i3;
                    n = 0;
                    l.clear();
                } else {
                    if (i3 != m) {
                        Log.w("", "Receive Err, Current Id: " + m + ", Receive Id: " + i3, new Object[0]);
                        m = 0;
                        n = 0;
                        l.clear();
                        return null;
                    }
                    if (i4 != n) {
                        Log.w("", "Receive Err, Current Index: " + n + ", Receive Index: " + i4, new Object[0]);
                        m = 0;
                        n = 0;
                        l.clear();
                        return null;
                    }
                }
                int length3 = bArr.length - i;
                byte[] bArr3 = new byte[length3];
                System.arraycopy(bArr, 3, bArr3, 0, length3);
                l.writeBytes(bArr3);
                int i5 = n + 1;
                n = i5;
                n = i5 % 256;
                if (b2 == 32) {
                    int i6 = l.readableBytes();
                    ByteBuf bytes = l.readBytes(i6);
                    byte[] bArr4 = new byte[i6];
                    bytes.readBytes(bArr4);
                    Log.d("", "Receive Data, Id: " + i3 + ", " + BytesUtil.log(bArr4), new Object[0]);
                    return bArr4;
                }
            }
        }
        return null;
    }

    public static void sendData(int i2, byte[] bArr, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        Log.d("", "Send Data: " + BytesUtil.log(bArr) + ", MTU: " + h + ", Pack Data Length: " + j, new Object[0]);
        if (bArr.length > j) {
            a(i2, bArr, bluetoothGatt, bluetoothGattCharacteristic);
            return;
        }
        byte[] bArr2 = new byte[bArr.length + i];
        bArr2[0] = (byte) (i2 & 255);
        bArr2[1] = 0;
        bArr2[2] = 0;
        b(bArr, bArr2, bluetoothGatt, bluetoothGattCharacteristic);
    }
}
