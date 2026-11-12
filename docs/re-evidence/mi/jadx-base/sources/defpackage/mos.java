package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class mos extends a6t {
    public static tss a(jet jetVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, gks gksVar) {
        if (jetVar == null || bluetoothGattCharacteristic == null || gksVar == null) {
            t5t.d(a6t.TAG, "Parameter error!!!");
            return null;
        }
        t5t.d(a6t.TAG, "Generic command:" + tet.x(gksVar.a()));
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final tss tssVar = new tss(gksVar);
        if (!jetVar.E(bluetoothGattCharacteristic, new zh.b() { // from class: ios
            @Override // zh.b
            public final void e(byte[] bArr) {
                mos.b(tssVar, countDownLatch, bArr);
            }
        })) {
            t5t.d(a6t.TAG, "registerNotification " + bluetoothGattCharacteristic.getUuid() + " failed!!!");
            return null;
        }
        if (jetVar.R0(bluetoothGattCharacteristic, gksVar.a())) {
            try {
                countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
            return tssVar;
        }
        t5t.d(a6t.TAG, "write " + bluetoothGattCharacteristic.getUuid() + " failed!!!");
        return null;
    }

    public static /* synthetic */ void b(tss tssVar, CountDownLatch countDownLatch, byte[] bArr) {
        t5t.d(a6t.TAG, "Generic notify:" + tet.x(bArr));
        tssVar.a(bArr);
        if (tssVar.e()) {
            countDownLatch.countDown();
        }
    }
}
