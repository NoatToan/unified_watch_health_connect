package defpackage;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import java.io.ByteArrayOutputStream;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"NewApi"})
public class lbs extends a6t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f24877b;
    public final UUID c;
    public final UUID d;
    public final byte e;
    public final byte f;
    public final byte g;
    public final byte h;
    public final byte i;
    public final byte j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BluetoothGattCharacteristic f24878k;
    public BluetoothGattCharacteristic l;
    public byte[] m;
    public byte[] n;

    public lbs(jet jetVar) {
        super(jetVar);
        this.f24877b = tet.C(5424);
        this.c = tet.C(5425);
        this.d = tet.C(5426);
        this.e = (byte) 0;
        this.f = (byte) 1;
        this.g = (byte) 3;
        this.h = (byte) 4;
        this.i = (byte) 5;
        this.j = (byte) 6;
        this.f24878k = null;
        this.l = null;
        this.m = null;
        this.n = null;
    }

    public boolean b(int i, int i2) {
        byte[] bArr = {4, 0, 0};
        tet.l(bArr, 1, (short) (i & 65535));
        qe qeVarC = c(bArr, i2);
        return qeVarC != null && qeVarC.d((byte) 4);
    }

    public boolean c(int i, yd ydVar, boolean z, int i2) {
        qe qeVarI;
        int i3 = (i << 8) | 1;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(tet.p(i3));
            if (ydVar != yd.FIRMWARE) {
                byteArrayOutputStream.write(ydVar.a());
            }
            if (z) {
                byteArrayOutputStream.write(tet.s((short) i2));
            }
        } catch (Exception e) {
            t5t.d(a6t.TAG, "Exception:" + e.getMessage());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (ydVar == yd.FIRMWARE_GPS_CEP || ydVar == yd.FIRMWARE_GPS) {
            int i4 = ydVar == yd.FIRMWARE_GPS ? 30 : 3;
            qe qeVarI2 = null;
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 >= i4 || (qeVarI2 = i(byteArray)) == null || qeVarI2.f() != 9) {
                    break;
                }
                try {
                    Thread.sleep(10000L);
                } catch (Exception e2) {
                    t5t.d(a6t.TAG, "sleep exception:" + e2.getMessage());
                }
                i5 = i6;
            }
            qeVarI = qeVarI2;
        } else {
            qeVarI = i(byteArray);
        }
        t5t.d(a6t.TAG, "type:" + ydVar + ",response:" + qeVarI);
        return qeVarI != null && qeVarI.d((byte) 1);
    }

    @Override // defpackage.a6t
    public boolean deInit() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f24878k;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        unregisterNotification(bluetoothGattCharacteristic);
        return false;
    }

    public boolean f(int i) {
        if (this.n == null) {
            waiting(this.l, 15000);
        }
        byte[] bArr = this.n;
        if (bArr == null) {
            return false;
        }
        int i2 = ((bArr[5] & 255) << 24) | (bArr[2] & 255) | ((bArr[3] & 255) << 8) | ((bArr[4] & 255) << 16);
        this.n = null;
        return i == i2;
    }

    public final qe i(byte[] bArr) {
        return c(bArr, 15000);
    }

    @Override // defpackage.a6t
    public boolean init() {
        BluetoothGattService service = getService(this.f24877b);
        if (service == null) {
            t5t.d(a6t.TAG, "service dfu is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.c);
        this.f24878k = characteristic;
        if (characteristic == null) {
            t5t.d(a6t.TAG, "BluetoothGattCharacteristic cpt is null!!!");
            return false;
        }
        if (!registerNotification(characteristic, new zh.b() { // from class: ibs
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f20989a.lambda$init$0(bArr);
            }
        })) {
            t5t.d(a6t.TAG, "registerNotification for cpt failed!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(this.d);
        this.l = characteristic2;
        if (characteristic2 != null) {
            return true;
        }
        t5t.d(a6t.TAG, "BluetoothGattCharacteristic pkt is null!!!");
        return false;
    }

    public boolean j(byte[] bArr) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.l;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, bArr);
    }

    public final /* synthetic */ void lambda$init$0(byte[] bArr) {
        t5t.d(a6t.TAG, "cpt response: " + tet.x(bArr));
        if (bArr != null && bArr.length == 6 && bArr[1] == 6) {
            this.n = bArr;
            watingNotify(this.l);
        } else {
            this.m = bArr;
            watingNotify(this.f24878k);
        }
    }

    public boolean m() {
        if (this.m == null) {
            waiting(this.f24878k, 15000);
        }
        qe qeVarG = qe.g(this.m);
        return qeVarG != null && qeVarG.d((byte) 3);
    }

    public boolean n() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f24878k;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{0});
    }

    public int o() {
        qe qeVarI = i(new byte[]{1, 0, 0, 0, yd.FIRMWARE_QUERY.a()});
        if (qeVarI == null) {
            return 0;
        }
        t5t.m(a6t.TAG, "response:" + qeVarI);
        return qeVarI.f();
    }

    public boolean p() {
        qe qeVarI = i(new byte[]{5});
        return qeVarI != null && qeVarI.d((byte) 5);
    }

    public boolean startTransfer() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f24878k;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{3});
    }

    public boolean stopTransfer(int i) {
        byte[] bArr = {4, 0, 0};
        tet.l(bArr, 1, (short) (i & 65535));
        return write(this.f24878k, bArr);
    }

    public final qe c(byte[] bArr, int i) {
        t5t.m(a6t.TAG, "sendCommand:" + tet.x(bArr));
        this.m = null;
        if (!write(this.f24878k, bArr)) {
            t5t.d(a6t.TAG, "Fail to sendCommand:" + tet.x(bArr));
            return null;
        }
        if (this.m == null) {
            waiting(this.f24878k, i);
        }
        qe qeVarG = qe.g(this.m);
        this.m = null;
        return qeVarG;
    }
}
