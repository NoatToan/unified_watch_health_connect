package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.huami.bluetooth.profile.channel.module.device_feature.DeviceFeatureModule;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import java.util.BitSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class hgt extends a6t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UUID f20061b = tet.C(20);

    public static Feature a(yus yusVar) {
        if (!yusVar.q1(DeviceFeatureModule.class)) {
            return b(yusVar);
        }
        DeviceFeatureModule deviceFeatureModule = (DeviceFeatureModule) yusVar.i1(DeviceFeatureModule.class);
        if (deviceFeatureModule != null) {
            return deviceFeatureModule.getFeature();
        }
        return null;
    }

    public static Feature b(jet jetVar) {
        BluetoothGattCharacteristic bluetoothGattCharacteristicC = c(jetVar);
        if (bluetoothGattCharacteristicC == null) {
            t5t.d(a6t.TAG, "device feature characteristic is null!!!");
            return null;
        }
        tss tssVarA = mos.a(jetVar, bluetoothGattCharacteristicC, new gks(15));
        if (tssVarA == null || !tssVarA.d()) {
            t5t.d(a6t.TAG, "get device feature command failed!!!");
            return null;
        }
        byte[] bArrB = tssVarA.b();
        t5t.m(a6t.TAG, "featureBytes:" + tet.x(bArrB));
        if (bArrB != null && bArrB.length >= 2) {
            return i(bArrB);
        }
        t5t.d(a6t.TAG, "wrong data of device feature response!!!");
        return null;
    }

    public static BluetoothGattCharacteristic c(jet jetVar) {
        if (jetVar == null) {
            t5t.d(a6t.TAG, "gattPeripheral is null!!!");
            return null;
        }
        UUID uuid = ats.Wb;
        BluetoothGattService bluetoothGattServiceP = jetVar.p(uuid);
        if (bluetoothGattServiceP == null) {
            t5t.d(a6t.TAG, uuid + " is null!!!");
            return null;
        }
        UUID uuid2 = f20061b;
        BluetoothGattCharacteristic characteristic = bluetoothGattServiceP.getCharacteristic(uuid2);
        if (characteristic == null) {
            t5t.d(a6t.TAG, uuid2 + " is null!!!");
        }
        return characteristic;
    }

    public static boolean d(yus yusVar) {
        return yusVar.q1(DeviceFeatureModule.class) || f(yusVar);
    }

    public static boolean f(jet jetVar) {
        return c(jetVar) != null;
    }

    public static Feature i(byte[] bArr) {
        int i;
        Feature feature = new Feature();
        feature.setAllDatas(bArr);
        int i2 = bArr[0];
        int i3 = bArr[1];
        feature.setVersion(i2);
        feature.setGroup(i3);
        if ((i3 & 1) != 0) {
            int i4 = bArr[2];
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, 3, bArr2, 0, i4);
            i = i4 + 3;
            feature.add(1, BitSet.valueOf(bArr2));
        } else {
            i = 2;
        }
        if ((i3 & 2) != 0) {
            int i5 = i + 1;
            int i6 = bArr[i];
            byte[] bArr3 = new byte[i6];
            System.arraycopy(bArr, i5, bArr3, 0, i6);
            i = i6 + i5;
            feature.add(2, BitSet.valueOf(bArr3));
        }
        if ((i3 & 4) != 0) {
            int i7 = i + 1;
            int i8 = bArr[i];
            byte[] bArr4 = new byte[i8];
            System.arraycopy(bArr, i7, bArr4, 0, i8);
            i = i8 + i7;
            feature.add(4, BitSet.valueOf(bArr4));
        }
        if ((i3 & 8) != 0) {
            int i9 = i + 1;
            int i10 = bArr[i] / 2;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i9 + 1;
                int i13 = bArr[i9] & 255;
                i9 += 2;
                feature.add(i11, ((bArr[i12] & 255) << 8) | i13);
            }
            i = i9;
        }
        if ((i3 & 16) != 0) {
            int i14 = i + 1;
            int i15 = bArr[i];
            byte[] bArr5 = new byte[i15];
            System.arraycopy(bArr, i14, bArr5, 0, i15);
            feature.add(16, BitSet.valueOf(bArr5));
        }
        return feature;
    }
}
