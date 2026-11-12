package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import java.util.Calendar;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public class jms extends kis {
    public static UUID d0 = tet.F("181B");
    public static UUID e0 = tet.F("FEE0");
    public UUID c0;

    public jms(Context context, BluetoothDevice bluetoothDevice, zh.a aVar) {
        super(context, bluetoothDevice, aVar);
        this.c0 = tet.F("2A9C");
    }

    public static WeightAdvData H1(byte[] bArr, boolean z, boolean z2) {
        boolean z3;
        int i;
        t5t.d("BaseProfile", "value = " + tet.x(bArr));
        if (bArr == null || bArr.length < 13) {
            t5t.m("BaseProfile", "measurement value is wrong!!!");
            return null;
        }
        float f = ((bArr[12] & 255) << 8) | (bArr[11] & 255);
        byte b2 = bArr[1];
        boolean z4 = (b2 & 32) != 0;
        boolean z5 = (b2 & 128) != 0;
        boolean z6 = (bArr[0] & 4) != 0;
        StringBuilder sb = new StringBuilder();
        sb.append("measure is overload = ");
        int i2 = (int) f;
        sb.append(i2 == 65520);
        t5t.m("BaseProfile", sb.toString());
        if (i2 == 65520) {
            i = 0;
            z3 = false;
        } else {
            if (((bArr[1] & 64) >> 6) == 1) {
                f /= 100.0f;
                i = 16;
            } else if ((bArr[0] & 1) == 1) {
                f /= 100.0f;
                i = 1;
            } else {
                f /= 200.0f;
                z3 = z4;
                i = 0;
            }
            z3 = z4;
        }
        Calendar calendar = Calendar.getInstance(xk.f39201a.a(0));
        calendar.clear();
        calendar.set(1, (bArr[2] & 255) | ((bArr[3] & 255) << 8));
        calendar.set(2, bArr[4] - 1);
        calendar.set(5, bArr[5]);
        calendar.set(11, bArr[6]);
        calendar.set(12, bArr[7]);
        calendar.set(13, bArr[8]);
        int i3 = ((bArr[10] & 255) << 8) | (bArr[9] & 255);
        boolean z7 = (bArr[1] & 2) != 0;
        WeightAdvData weightAdvData = new WeightAdvData(i, f, calendar.getTimeInMillis(), z3, z, z2, z5);
        weightAdvData.setPart(z6);
        weightAdvData.setImpedance(i3);
        weightAdvData.setImpedanceStable(z7);
        t5t.m("BaseProfile", "WeightAdvData:" + weightAdvData);
        return weightAdvData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J1(byte[] bArr) {
        t5t.m("BaseProfile", "--------------------------");
        t5t.m("BaseProfile", "m_CharMeasurement:" + tet.x(bArr));
        t5t.m("BaseProfile", "--------------------------");
        WeightAdvData weightAdvDataH1 = H1(bArr, true, false);
        kis.a aVar = this.a0;
        if (aVar == null || weightAdvDataH1 == null) {
            return;
        }
        aVar.m(weightAdvDataH1);
    }

    @Override // defpackage.kis, defpackage.yus, defpackage.jet
    public boolean B0() {
        BluetoothGattCharacteristic characteristic;
        super.B0();
        BluetoothGattService bluetoothGattServiceP = p(d0);
        if (bluetoothGattServiceP == null) {
            return false;
        }
        BluetoothGattCharacteristic characteristic2 = bluetoothGattServiceP.getCharacteristic(ats.hc);
        this.Y = characteristic2;
        if (characteristic2 == null || (characteristic = bluetoothGattServiceP.getCharacteristic(this.c0)) == null) {
            return false;
        }
        boolean zE = E(characteristic, new zh.b() { // from class: fms
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f17942a.J1(bArr);
            }
        });
        if (!I1()) {
            return zE;
        }
        boolean zK1 = K1(false);
        t5t.d("BaseProfile", "set user mode:" + zK1);
        return zK1;
    }

    public final boolean I1() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.Z;
        if (bluetoothGattCharacteristic == null) {
            return true;
        }
        byte[] bArrS0 = S0(bluetoothGattCharacteristic);
        t5t.m("BaseProfile", "getMode:" + tet.x(bArrS0));
        if (bArrS0 == null || bArrS0.length < 2) {
            return true;
        }
        return (((bArrS0[1] & 255) << 8) | (bArrS0[0] & 255)) == 3;
    }

    public final boolean K1(boolean z) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.Z;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        return R0(bluetoothGattCharacteristic, new byte[]{6, (byte) ((z ? 10 : 11) & 255), (byte) 0, 0});
    }

    @Override // defpackage.kis, defpackage.fj
    public UUID e() {
        return d0;
    }

    @Override // defpackage.kis, defpackage.fj
    public ej g() {
        return new ex();
    }
}
