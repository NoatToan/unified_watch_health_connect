package com.xiaomi.android.ble;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes7.dex */
abstract class MainThreadBluetoothGattCallback extends BluetoothGattCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f11114a;

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public abstract void n(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr);

    public abstract void B(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i);

    public abstract void C(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i);

    public abstract void D(BluetoothGatt bluetoothGatt, int i, int i2);

    @RequiresApi(api = 26)
    public abstract void E(BluetoothGatt bluetoothGatt, @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS, to = 3200) int i, @IntRange(from = 0, to = 499) int i2, @IntRange(from = 10, to = 3200) int i3, int i4);

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public abstract void s(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr, int i);

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public abstract void t(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr, int i);

    @RequiresApi(api = 21)
    public abstract void H(BluetoothGatt bluetoothGatt, @IntRange(from = 23, to = 517) int i, int i2);

    @RequiresApi(api = 26)
    public abstract void I(BluetoothGatt bluetoothGatt, int i, int i2, int i3);

    @RequiresApi(api = 26)
    public abstract void J(BluetoothGatt bluetoothGatt, int i, int i2, int i3);

    public abstract void K(BluetoothGatt bluetoothGatt, @IntRange(from = -128, to = 20) int i, int i2);

    public abstract void L(BluetoothGatt bluetoothGatt, int i);

    public abstract void M(BluetoothGatt bluetoothGatt, int i);

    public final void N(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f11114a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void O(Handler handler) {
        this.f11114a = handler;
    }

    public final /* synthetic */ void o(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
        try {
            B(bluetoothGatt, bluetoothGattCharacteristic, bArr, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        final byte[] value = bluetoothGattCharacteristic.getValue();
        N(new Runnable() { // from class: com.xiaomi.android.ble.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f11135a.n(bluetoothGatt, bluetoothGattCharacteristic, value);
            }
        });
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final int i) {
        final byte[] value = bluetoothGattCharacteristic.getValue();
        N(new Runnable() { // from class: com.xiaomi.android.ble.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f11149a.o(bluetoothGatt, bluetoothGattCharacteristic, value, i);
            }
        });
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final int i) {
        final byte[] value = bluetoothGattCharacteristic.getValue();
        N(new Runnable() { // from class: com.xiaomi.android.ble.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f11143a.p(bluetoothGatt, bluetoothGattCharacteristic, value, i);
            }
        });
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(final BluetoothGatt bluetoothGatt, final int i, final int i2) {
        N(new Runnable() { // from class: com.xiaomi.android.ble.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f11131a.q(bluetoothGatt, i, i2);
            }
        });
    }

    @Keep
    @RequiresApi(api = 26)
    public final void onConnectionUpdated(final BluetoothGatt bluetoothGatt, @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS, to = 3200) final int i, @IntRange(from = 0, to = 499) final int i2, @IntRange(from = 10, to = 3200) final int i3, final int i4) {
        N(new Runnable() { // from class: com.xiaomi.android.ble.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f11129a.r(bluetoothGatt, i, i2, i3, i4);
            }
        });
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorRead(final BluetoothGatt bluetoothGatt, final BluetoothGattDescriptor bluetoothGattDescriptor, final int i) {
        final byte[] value = bluetoothGattDescriptor.getValue();
        N(new Runnable() { // from class: com.xiaomi.android.ble.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f11133a.s(bluetoothGatt, bluetoothGattDescriptor, value, i);
            }
        });
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorWrite(final BluetoothGatt bluetoothGatt, final BluetoothGattDescriptor bluetoothGattDescriptor, final int i) {
        final byte[] value = bluetoothGattDescriptor.getValue();
        N(new Runnable() { // from class: com.xiaomi.android.ble.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f11137a.t(bluetoothGatt, bluetoothGattDescriptor, value, i);
            }
        });
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @RequiresApi(api = 21)
    public final void onMtuChanged(final BluetoothGatt bluetoothGatt, @IntRange(from = 23, to = 517) final int i, final int i2) {
        N(new Runnable() { // from class: com.xiaomi.android.ble.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f11147a.u(bluetoothGatt, i, i2);
            }
        });
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @RequiresApi(api = 26)
    public final void onPhyRead(final BluetoothGatt bluetoothGatt, final int i, final int i2, final int i3) {
        N(new Runnable() { // from class: com.xiaomi.android.ble.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f11145a.v(bluetoothGatt, i, i2, i3);
            }
        });
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @RequiresApi(api = 26)
    public final void onPhyUpdate(final BluetoothGatt bluetoothGatt, final int i, final int i2, final int i3) {
        N(new Runnable() { // from class: com.xiaomi.android.ble.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f11153a.w(bluetoothGatt, i, i2, i3);
            }
        });
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReadRemoteRssi(final BluetoothGatt bluetoothGatt, @IntRange(from = -128, to = 20) final int i, final int i2) {
        N(new Runnable() { // from class: com.xiaomi.android.ble.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f11139a.x(bluetoothGatt, i, i2);
            }
        });
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReliableWriteCompleted(final BluetoothGatt bluetoothGatt, final int i) {
        N(new Runnable() { // from class: com.xiaomi.android.ble.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f11151a.y(bluetoothGatt, i);
            }
        });
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(final BluetoothGatt bluetoothGatt, final int i) {
        N(new Runnable() { // from class: com.xiaomi.android.ble.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f11141a.z(bluetoothGatt, i);
            }
        });
    }

    public final /* synthetic */ void p(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
        try {
            C(bluetoothGatt, bluetoothGattCharacteristic, bArr, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final /* synthetic */ void q(BluetoothGatt bluetoothGatt, int i, int i2) {
        try {
            D(bluetoothGatt, i, i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final /* synthetic */ void r(BluetoothGatt bluetoothGatt, int i, int i2, int i3, int i4) {
        try {
            E(bluetoothGatt, i, i2, i3, i4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final /* synthetic */ void u(BluetoothGatt bluetoothGatt, int i, int i2) {
        try {
            H(bluetoothGatt, i, i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final /* synthetic */ void v(BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
        try {
            I(bluetoothGatt, i, i2, i3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final /* synthetic */ void w(BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
        try {
            J(bluetoothGatt, i, i2, i3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final /* synthetic */ void x(BluetoothGatt bluetoothGatt, int i, int i2) {
        try {
            K(bluetoothGatt, i, i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final /* synthetic */ void y(BluetoothGatt bluetoothGatt, int i) {
        try {
            L(bluetoothGatt, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final /* synthetic */ void z(BluetoothGatt bluetoothGatt, int i) {
        try {
            M(bluetoothGatt, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
