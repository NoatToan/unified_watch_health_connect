package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.miui.tsmclient.service.DKFRequestService;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class oft extends a6t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f29124b;
    public final UUID c;
    public final UUID d;
    public BluetoothGattCharacteristic e;
    public BluetoothGattCharacteristic f;
    public volatile zh.b g;
    public volatile int h;
    public AtomicInteger i;

    public oft(jet jetVar) {
        super(jetVar);
        this.f29124b = tet.C(5424);
        this.c = tet.C(5425);
        this.d = tet.C(5426);
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 1;
        this.i = new AtomicInteger(-1);
    }

    public static /* synthetic */ void b(qe qeVar, CountDownLatch countDownLatch, byte[] bArr) {
        qeVar.b(bArr);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(byte[] bArr) {
        t5t.d(a6t.TAG, "cpt response: " + tet.x(bArr));
        if (bArr != null && bArr.length == 3 && bArr[0] == 16 && bArr[1] == 32) {
            this.h = bArr[2];
            return;
        }
        if (bArr == null || bArr.length != 6 || bArr[0] != 16 || bArr[1] != 6) {
            if (this.g != null) {
                this.g.e(bArr);
            }
        } else {
            this.i.set(((bArr[5] & 255) << 24) | (bArr[2] & 255) | ((bArr[3] & 255) << 8) | ((bArr[4] & 255) << 16));
            watingNotify(this.f);
        }
    }

    public long[] c(byte b2, int i, long j, short s, int i2, byte b3, int i3, boolean z, int i4) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(b2);
        byteArrayOutputStream.write(tet.p(i));
        byteArrayOutputStream.write(tet.p((int) j));
        if (s >= 0) {
            byteArrayOutputStream.write(tet.s(s));
        }
        if (i2 >= 0) {
            byteArrayOutputStream.write((byte) (i2 & 255));
        }
        if (i4 >= 0) {
            byteArrayOutputStream.write(tet.p(i4));
        }
        if (b2 == yd.FIRMWARE_VOICE.a()) {
            byteArrayOutputStream.write(b3);
            byteArrayOutputStream.write(tet.p(i3));
        }
        qe qeVarI = i(byteArrayOutputStream.toByteArray());
        if (qeVarI == null || !qeVarI.d((byte) 1)) {
            return null;
        }
        byte[] bArrI = qeVarI.i();
        return new long[]{(bArrI[0] & 255) | ((bArrI[1] & 255) << 8) | ((bArrI[2] & 255) << 16) | ((bArrI[3] & 255) << 24), ((long) (((bArrI[7] & 255) << 24) | (bArrI[4] & 255) | ((bArrI[5] & 255) << 8) | ((bArrI[6] & 255) << 16))) & 4294967295L};
    }

    public long[] d(byte b2, int i, long j, short s, int i2, int i3) {
        return c(b2, i, j, s, i2, (byte) 0, 0, false, i3);
    }

    @Override // defpackage.a6t
    public boolean deInit() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.e;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        unregisterNotification(bluetoothGattCharacteristic);
        return false;
    }

    public boolean f(byte b2) {
        qe qeVarI = i(new byte[]{3, b2});
        return qeVarI != null && qeVarI.d((byte) 3);
    }

    public boolean g(int i) {
        if (this.i.get() == -1) {
            waiting(this.f, 15000);
        }
        boolean z = this.i.get() == i;
        t5t.d(a6t.TAG, "notifySize:" + this.i.get() + ",writeSize:" + i);
        this.i.set(-1);
        return z;
    }

    public boolean h(int i) {
        qe qeVarC = c(new byte[]{4}, i);
        return qeVarC != null && qeVarC.d((byte) 4);
    }

    public final qe i(byte[] bArr) {
        return c(bArr, 15000);
    }

    @Override // defpackage.a6t
    public boolean init() {
        BluetoothGattService service = getService(this.f29124b);
        if (service == null) {
            t5t.d(a6t.TAG, "service dfu is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.c);
        this.e = characteristic;
        if (characteristic == null) {
            t5t.d(a6t.TAG, "BluetoothGattCharacteristic cpt is null!!!");
            return false;
        }
        if (!registerNotification(characteristic, new zh.b() { // from class: nft
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f27895a.lambda$init$0(bArr);
            }
        })) {
            t5t.d(a6t.TAG, "registerNotification for cpt failed!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(this.d);
        this.f = characteristic2;
        if (characteristic2 == null) {
            t5t.d(a6t.TAG, "BluetoothGattCharacteristic pkt is null!!!");
            return false;
        }
        this.i.set(-1);
        return true;
    }

    public boolean j(byte[] bArr) {
        return write(this.f, bArr);
    }

    public boolean m() {
        return write(this.e, new byte[]{0});
    }

    public boolean n() {
        qe qeVarI = i(new byte[]{5});
        return qeVarI != null && qeVarI.d((byte) 5);
    }

    public u5t o() {
        qe qeVarI = i(new byte[]{DKFRequestService.o});
        if (qeVarI == null || !qeVarI.d(DKFRequestService.o)) {
            return null;
        }
        return u5t.b(qeVarI.i());
    }

    public int p() {
        return this.h;
    }

    public int q() {
        qe qeVarI = i(new byte[]{1, yd.FIRMWARE_QUERY.a()});
        if (qeVarI == null) {
            return 0;
        }
        t5t.m(a6t.TAG, "response:" + qeVarI);
        return qeVarI.f();
    }

    public final qe c(byte[] bArr, int i) {
        t5t.m(a6t.TAG, "sendCommand:" + tet.x(bArr));
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final qe qeVar = new qe();
        this.g = new zh.b() { // from class: mft
            @Override // zh.b
            public final void e(byte[] bArr2) {
                oft.b(qeVar, countDownLatch, bArr2);
            }
        };
        try {
            if (write(this.e, bArr)) {
                countDownLatch.await(i, TimeUnit.MILLISECONDS);
            }
        } catch (Exception e) {
            t5t.d(a6t.TAG, "sendCommand exception:" + e.getMessage());
        }
        this.g = null;
        return qeVar;
    }
}
