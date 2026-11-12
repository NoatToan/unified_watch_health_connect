package defpackage;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public final class vws extends kis {
    public static final UUID e0 = tet.F("181D");
    public static final UUID f0 = tet.F("2A9D");
    public final int c0;
    public final int d0;

    public vws(Context context, BluetoothDevice bluetoothDevice, zh.a aVar) {
        super(context, bluetoothDevice, aVar);
        this.c0 = 3;
        this.d0 = SportSummary.VERSION_103;
        t5t.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J1(byte[] bArr) {
        WeightAdvData weightData;
        if (this.a0 == null || (weightData = ProfileUtils.parseWeightData(bArr, true, false)) == null) {
            return;
        }
        this.a0.m(weightData);
    }

    @Override // defpackage.kis, defpackage.yus, defpackage.jet
    public boolean B0() {
        super.B0();
        UUID uuid = e0;
        BluetoothGattService bluetoothGattServiceP = p(uuid);
        if (bluetoothGattServiceP == null) {
            t5t.d("BaseProfile", uuid + " is null!!!");
            return false;
        }
        UUID uuid2 = f0;
        BluetoothGattCharacteristic characteristic = bluetoothGattServiceP.getCharacteristic(uuid2);
        if (characteristic == null) {
            t5t.d("BaseProfile", uuid2 + " is null!!!");
            return false;
        }
        UUID uuid3 = ats.hc;
        BluetoothGattCharacteristic characteristic2 = bluetoothGattServiceP.getCharacteristic(uuid3);
        this.Y = characteristic2;
        if (characteristic2 == null) {
            t5t.d("BaseProfile", uuid3 + " is null!!!");
            return false;
        }
        if (!E(characteristic, new zh.b() { // from class: tws
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f35148a.J1(bArr);
            }
        })) {
            t5t.d("BaseProfile", "registerNotification:" + uuid2 + " failed!!!");
            return false;
        }
        if (H1() != 3) {
            return true;
        }
        t5t.d("BaseProfile", "set user mode:" + I1());
        return true;
    }

    public final int H1() {
        byte[] bArrS0 = S0(this.Z);
        if (bArrS0 == null || bArrS0.length < 2) {
            t5t.d("BaseProfile", "getSandglassMode failed!!!");
            return -1;
        }
        t5t.d("BaseProfile", "Sandglass mode : " + tet.x(bArrS0));
        return (bArrS0[0] & 255) | ((bArrS0[1] & 255) << 8);
    }

    public final boolean I1() {
        return R0(this.Z, new byte[]{3, 1, 0, 0, 0});
    }

    @Override // defpackage.kis, defpackage.fj
    public UUID e() {
        return e0;
    }

    @Override // defpackage.kis, defpackage.fj
    public ej g() {
        return new hx();
    }
}
