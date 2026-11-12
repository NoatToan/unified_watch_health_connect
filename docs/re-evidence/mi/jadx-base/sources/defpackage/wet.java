package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.util.SparseArray;
import androidx.work.WorkInfo;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmMonitorGuideActivity;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class wet {
    public static final UUID g = tet.C(32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothGattCharacteristic f37907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jet f37908b = null;
    public SparseArray<kus> c = new SparseArray<>();
    public int d = 0;
    public zh.b e = null;
    public zh.b f = new zh.b() { // from class: uet
        @Override // zh.b
        public final void e(byte[] bArr) {
            this.f35697a.e(bArr);
        }
    };

    public static /* synthetic */ void d(qe qeVar, CountDownLatch countDownLatch, byte[] bArr) {
        qeVar.b(bArr);
        countDownLatch.countDown();
    }

    public int b() {
        return this.d;
    }

    public void c(urs ursVar) {
        t5t.d("HMPieceProfile", "onEvent:" + ursVar);
        kus kusVar = this.c.get(ursVar.a());
        if (kusVar != null) {
            kusVar.c(ursVar);
        }
    }

    public final /* synthetic */ void e(byte[] bArr) {
        t5t.d("HMPieceProfile", "patchWrite notify:" + tet.x(bArr));
        zh.b bVar = this.e;
        if (bVar != null) {
            bVar.e(bArr);
        }
    }

    public synchronized boolean f(jet jetVar, boolean z) {
        this.f37908b = jetVar;
        UUID uuid = a6t.UUID_SERVICE_MILI_SERVICE;
        BluetoothGattService bluetoothGattServiceP = jetVar.p(uuid);
        if (bluetoothGattServiceP == null) {
            t5t.d("HMPieceProfile", uuid + " is null!!!");
            return false;
        }
        UUID uuid2 = g;
        BluetoothGattCharacteristic characteristic = bluetoothGattServiceP.getCharacteristic(uuid2);
        this.f37907a = characteristic;
        if (characteristic == null) {
            t5t.d("HMPieceProfile", uuid2 + " is null!!!");
            return false;
        }
        byte[] bArrS0 = jetVar.S0(characteristic);
        t5t.m("HMPieceProfile", "data:" + tet.x(bArrS0));
        if (bArrS0 != null && bArrS0.length == 1) {
            this.d = bArrS0[0] & 255;
            t5t.d("HMPieceProfile", "piece profile version:" + this.d);
        }
        if (!z) {
            return true;
        }
        return jetVar.E(this.f37907a, this.f);
    }

    public boolean g(byte[] bArr, int i) {
        jls jlsVarH = h(bArr, i);
        t5t.d("HMPieceProfile", "PieceResult:" + jlsVarH);
        if (jlsVarH == null || !jlsVarH.d()) {
            return false;
        }
        if (!jlsVarH.e() && jlsVarH.a() != 255) {
            return false;
        }
        int iC = jlsVarH.c();
        if (iC == 0) {
            return true;
        }
        if (this.c.get(i) != null) {
            t5t.d("HMPieceProfile", "return as same profile async task running!");
            return false;
        }
        kus kusVar = new kus();
        this.c.put(i, kusVar);
        kusVar.b(iC);
        return kusVar.a() != null;
    }

    public final synchronized jls h(byte[] bArr, int i) {
        try {
            t5t.m("HMPieceProfile", "patchWrite origin:" + tet.x(bArr));
            int length = bArr.length;
            int iD = this.d >= 4 ? this.f37908b.y0().d() : 20;
            int i2 = iD - 3;
            int i3 = length / i2;
            int i4 = length % i2;
            int i5 = i3 + (i4 == 0 ? 0 : 1);
            byte b2 = wbt.h;
            int i6 = 0;
            while (true) {
                int i7 = i5 - 1;
                if (i6 >= i7) {
                    if (i4 == 0) {
                        i4 = i2;
                    }
                    byte[] bArr2 = new byte[i4 + 3];
                    bArr2[0] = b2;
                    bArr2[1] = (byte) (i | (i5 > 1 ? WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT : -64));
                    bArr2[2] = (byte) (i7 % 255);
                    System.arraycopy(bArr, i7 * i2, bArr2, 3, i4);
                    t5t.m("HMPieceProfile", "patchWrite:" + tet.x(bArr2));
                    qe qeVarK = k(bArr2);
                    t5t.m("HMPieceProfile", "response:" + qeVarK);
                    if (qeVarK == null) {
                        return null;
                    }
                    return jls.b(qeVarK.j(), b2, bArr2[1] & 255);
                }
                byte[] bArr3 = new byte[iD];
                bArr3[0] = b2;
                bArr3[1] = (byte) ((i6 == 0 ? 0 : 64) | i);
                bArr3[2] = (byte) (i6 % 255);
                System.arraycopy(bArr, i6 * i2, bArr3, 3, i2);
                t5t.m("HMPieceProfile", "patchWrite:" + tet.x(bArr3));
                if (!j(bArr3)) {
                    t5t.m("HMPieceProfile", "writeNoResponse failed!!!");
                    return null;
                }
                i6++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean i() {
        return this.f37907a != null;
    }

    public final boolean j(byte[] bArr) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        jet jetVar = this.f37908b;
        if (jetVar == null || (bluetoothGattCharacteristic = this.f37907a) == null) {
            return false;
        }
        return jetVar.N0(bluetoothGattCharacteristic, bArr);
    }

    public final qe k(byte[] bArr) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        jet jetVar = this.f37908b;
        if (jetVar == null || (bluetoothGattCharacteristic = this.f37907a) == null) {
            return null;
        }
        if (!jetVar.D(bluetoothGattCharacteristic)) {
            return this.f37908b.F0(this.f37907a, bArr, 6000);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final qe qeVar = new qe();
        this.e = new zh.b() { // from class: vet
            @Override // zh.b
            public final void e(byte[] bArr2) {
                wet.d(qeVar, countDownLatch, bArr2);
            }
        };
        this.f37908b.N0(this.f37907a, bArr);
        try {
            countDownLatch.await(SleepRhythmMonitorGuideActivity.INDICATOR_DELAY_DURATION, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        return qeVar;
    }
}
