package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class lht extends a6t {
    public static final UUID f = tet.C(18);
    public static final UUID g = tet.C(19);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BluetoothGattCharacteristic f25088b;
    public BluetoothGattCharacteristic c;
    public oht d;
    public int e;

    public lht(jet jetVar) {
        super(jetVar);
        this.f25088b = null;
        this.c = null;
        this.e = 0;
    }

    public static boolean c(jet jetVar) {
        BluetoothGattService bluetoothGattServiceP = jetVar.p(a6t.UUID_SERVICE_MILI_SERVICE);
        return (bluetoothGattServiceP == null || bluetoothGattServiceP.getCharacteristic(f) == null || bluetoothGattServiceP.getCharacteristic(g) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(byte[] bArr) {
        bht bhtVar;
        oht ohtVar;
        t5t.m(a6t.TAG, "charSpeechCtl:" + tet.x(bArr));
        if (bArr == null || bArr.length < 2) {
            return;
        }
        int i = bArr[0] & 255;
        if (i == 1) {
            bhtVar = new bht(i, bArr[1] & 255);
        } else {
            bhtVar = i == 2 ? new bht(i, bArr[1] & 255, bArr[2] & 255) : null;
        }
        if (bhtVar == null || (ohtVar = this.d) == null) {
            return;
        }
        ohtVar.i(bhtVar);
    }

    public void b(oht ohtVar) {
        this.d = ohtVar;
    }

    @Override // defpackage.a6t
    public boolean deInit() {
        unregisterNotification(this.f25088b);
        return true;
    }

    @Override // defpackage.a6t
    public boolean init() {
        UUID uuid = a6t.UUID_SERVICE_MILI_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            t5t.d(a6t.TAG, uuid + " is null!!!");
            return false;
        }
        UUID uuid2 = f;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.f25088b = characteristic;
        if (characteristic == null) {
            t5t.d(a6t.TAG, uuid2 + " is null!!!");
            return false;
        }
        byte[] bArr = read(characteristic);
        if (bArr != null && bArr.length > 0) {
            this.e = bArr[0];
        }
        if (!registerNotification(this.f25088b, new zh.b() { // from class: kht
            @Override // zh.b
            public final void e(byte[] bArr2) {
                this.f23863a.lambda$init$0(bArr2);
            }
        })) {
            t5t.d(a6t.TAG, "registerNotification " + uuid2 + " failed!!!");
            return false;
        }
        UUID uuid3 = g;
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(uuid3);
        this.c = characteristic2;
        if (characteristic2 != null) {
            return true;
        }
        t5t.d(a6t.TAG, uuid3 + " is null!!!");
        return false;
    }
}
