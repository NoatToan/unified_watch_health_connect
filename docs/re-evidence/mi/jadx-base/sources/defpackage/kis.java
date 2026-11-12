package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.weight.IOFMeasurementCallback;
import com.xiaomi.hm.health.bt.profile.weight.OFMeasurement;
import java.util.Calendar;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class kis extends yus implements fj {
    public static final UUID b0 = tet.C(10799);
    public UUID U;
    public UUID V;
    public UUID W;
    public UUID X;
    public BluetoothGattCharacteristic Y;
    public BluetoothGattCharacteristic Z;
    public a a0;

    public interface a {
        void m(WeightAdvData weightAdvData);
    }

    public kis(Context context, BluetoothDevice bluetoothDevice, zh.a aVar) {
        super(context, bluetoothDevice, aVar);
        this.U = tet.C(5424);
        this.V = tet.C(5442);
        this.W = tet.C(5443);
        this.X = tet.F("2A9E");
        this.Y = null;
        this.Z = null;
        this.a0 = null;
    }

    public boolean A1(byte b2) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.Z;
        return bluetoothGattCharacteristic != null && R0(bluetoothGattCharacteristic, new byte[]{6, 4, 0, b2});
    }

    @Override // defpackage.yus, defpackage.jet
    public boolean B0() {
        super.B0();
        BluetoothGattService bluetoothGattServiceP = p(this.U);
        if (bluetoothGattServiceP == null) {
            t5t.d("BaseProfile", this.U + " is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = bluetoothGattServiceP.getCharacteristic(this.W);
        this.I = characteristic;
        if (characteristic == null) {
            t5t.d("BaseProfile", this.W + " is null!!!");
        }
        BluetoothGattCharacteristic characteristic2 = bluetoothGattServiceP.getCharacteristic(this.V);
        this.Z = characteristic2;
        if (characteristic2 != null) {
            return true;
        }
        t5t.d("BaseProfile", this.V + " is null!!!");
        return false;
    }

    public boolean B1(final IOFMeasurementCallback iOFMeasurementCallback, final boolean z) {
        if (this.Z == null) {
            return false;
        }
        byte[] bArr = {6, 15, 0, 0};
        final qe qeVar = new qe();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final CountDownLatch countDownLatch2 = new CountDownLatch(1);
        if (!E(this.Z, new zh.b() { // from class: jis
            @Override // zh.b
            public final void e(byte[] bArr2) {
                this.f22847a.z1(qeVar, countDownLatch, iOFMeasurementCallback, countDownLatch2, z, bArr2);
            }
        })) {
            return false;
        }
        if (!z) {
            try {
                if (countDownLatch2.await(100L, TimeUnit.MILLISECONDS)) {
                    return false;
                }
            } catch (Exception e) {
                t5t.d("BaseProfile", "await exception:" + e.getMessage());
            }
        }
        if (!R0(this.Z, bArr)) {
            a0(this.Z);
            return false;
        }
        try {
            countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            t5t.d("BaseProfile", "await exception:" + e2.getMessage());
        }
        if (qeVar.e((byte) 6, (short) 15)) {
            return true;
        }
        a0(this.Z);
        return false;
    }

    public final synchronized boolean C1(byte[] bArr, byte b2, short s) {
        boolean z;
        z = false;
        if (bArr != null) {
            if (bArr.length >= 5 && (bArr[0] & 255) == 16 && (bArr[1] & 255) == b2 && (bArr[2] & 255) == (s & 255) && (bArr[4] & 255) == 1) {
                z = true;
            }
        }
        return z;
    }

    public boolean D1() {
        qe qeVarP0;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.Z;
        return (bluetoothGattCharacteristic == null || (qeVarP0 = P0(bluetoothGattCharacteristic, new byte[]{6, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, 0, 0})) == null || !C1(qeVarP0.j(), (byte) 6, (short) 18)) ? false : true;
    }

    public boolean E1() {
        return R0(this.Z, new byte[]{6, 17, 0, 0});
    }

    public boolean F1(boolean z) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.Z;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        qe qeVarP0 = P0(bluetoothGattCharacteristic, new byte[]{6, 16, 0, (byte) (!z ? 1 : 0)});
        return qeVarP0 != null && C1(qeVarP0.j(), (byte) 6, (short) 16);
    }

    @Override // defpackage.fj
    @NotNull
    public UUID c() {
        return b0;
    }

    public UUID e() {
        return tet.F("181B");
    }

    public ej g() {
        return new hx();
    }

    @Override // defpackage.fj
    public int h() {
        return 4;
    }

    @Override // defpackage.yus
    public boolean n1(Calendar calendar) {
        t5t.p();
        short s = (short) calendar.get(1);
        byte b2 = (byte) (calendar.get(2) + 1);
        byte b3 = (byte) calendar.get(5);
        byte b4 = (byte) calendar.get(11);
        byte b5 = (byte) calendar.get(12);
        byte b6 = (byte) calendar.get(13);
        byte[] bArr = new byte[2];
        tet.l(bArr, 0, s);
        byte b7 = (byte) calendar.get(7);
        t5t.d("BaseProfile", "set date:" + calendar.getTime().toString());
        t5t.d("BaseProfile", "year:" + ((int) s) + ",month:" + ((int) b2) + ",day:" + ((int) b3) + ",hour:" + ((int) b4) + ",min:" + ((int) b5) + ",sec:" + ((int) b6));
        return R0(this.Y, new byte[]{bArr[0], bArr[1], b2, b3, b4, b5, b6, b7, 0, 0});
    }

    @Override // defpackage.yus
    public ubt t1(byte[] bArr) {
        if (bArr != null && bArr.length == 2 && (bArr[0] & 255) == 1 && (bArr[1] & 255) == 1) {
            return new ubt(1);
        }
        return null;
    }

    public void y1(a aVar) {
        this.a0 = aVar;
    }

    public final /* synthetic */ void z1(qe qeVar, CountDownLatch countDownLatch, IOFMeasurementCallback iOFMeasurementCallback, CountDownLatch countDownLatch2, boolean z, byte[] bArr) {
        t5t.d("BaseProfile", "notify:" + tet.x(bArr));
        if (bArr == null) {
            return;
        }
        if (bArr.length == 5) {
            qeVar.b(bArr);
            countDownLatch.countDown();
            return;
        }
        if (bArr.length != 6 || iOFMeasurementCallback == null) {
            return;
        }
        countDownLatch2.countDown();
        int i = bArr[3] & 255;
        int i2 = ((bArr[4] & 255) | ((bArr[5] & 255) << 8)) * 100;
        if (i == 2) {
            a0(this.Z);
        }
        if (!z) {
            iOFMeasurementCallback.onDataChanged(new OFMeasurement(i, i2));
        } else if (countDownLatch.getCount() <= 0) {
            iOFMeasurementCallback.onDataChanged(new OFMeasurement(i, i2));
        }
    }
}
