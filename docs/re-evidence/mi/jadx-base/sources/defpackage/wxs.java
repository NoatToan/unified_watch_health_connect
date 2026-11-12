package defpackage;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class wxs extends a6t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UUID f38469b;
    public UUID c;
    public BluetoothGattCharacteristic d;

    public wxs(jet jetVar) {
        super(jetVar);
        this.f38469b = tet.F("1802");
        this.c = tet.F("2A06");
        this.d = null;
    }

    public boolean a(short s, short s2, byte b2) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.d;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{-1, (byte) (s & 255), (byte) ((s >> 8) & 255), (byte) (s2 & 255), (byte) ((s2 >> 8) & 255), b2});
    }

    public final boolean b(byte b2) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.d;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{b2});
    }

    @Override // defpackage.a6t
    public boolean deInit() {
        return true;
    }

    public boolean f(int i) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.d;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{-3, 2, (byte) (i & 255), (byte) ((i >> 8) & 255)});
    }

    public boolean g(int i) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.d;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{-3, 1, (byte) (i & 255), (byte) ((i >> 8) & 255)});
    }

    @Override // defpackage.a6t
    public boolean init() {
        BluetoothGattService service = getService(this.f38469b);
        if (service == null) {
            t5t.d(a6t.TAG, this.f38469b + " is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.c);
        this.d = characteristic;
        if (characteristic != null) {
            return true;
        }
        t5t.d(a6t.TAG, this.c + " is null!!!");
        return false;
    }

    public boolean m() {
        return a((short) 600, (short) 200, (byte) 2);
    }

    public boolean n() {
        return b((byte) 3);
    }

    public boolean o() {
        return b((byte) 2);
    }

    public boolean p() {
        return b((byte) -2);
    }

    public boolean q() {
        return b((byte) 4);
    }

    public boolean r() {
        return b((byte) 1);
    }

    public boolean s() {
        return b((byte) 0);
    }
}
