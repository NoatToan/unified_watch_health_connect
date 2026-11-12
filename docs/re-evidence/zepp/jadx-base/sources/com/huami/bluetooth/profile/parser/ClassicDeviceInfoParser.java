package com.huami.bluetooth.profile.parser;

import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.GeneralDeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.PnP;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class ClassicDeviceInfoParser {
    private static final int a = 51;
    private static final int b = 8;
    private static final int c = 13;
    private static final int d = 9;
    private static final int e = 13;
    private static final int f = 7;

    @Nullable
    public static DeviceInfo parse(@NotNull byte[] data) {
        if (data.length < 51) {
            return null;
        }
        GeneralDeviceInfo generalDeviceInfo = new GeneralDeviceInfo();
        byte[] bArr = new byte[8];
        System.arraycopy(data, 0, bArr, 0, 8);
        generalDeviceInfo.deviceID = String.format("%02X%02X%02X%02X%02X%02X%02X%02X", Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[3]), Byte.valueOf(bArr[4]), Byte.valueOf(bArr[5]), Byte.valueOf(bArr[6]), Byte.valueOf(bArr[7]));
        generalDeviceInfo.bytesOfDeviceID = bArr;
        generalDeviceInfo.serialNumber = ByteArrayKt.toString(data, 8, 13);
        generalDeviceInfo.firmwareRevision = ByteArrayKt.toString(data, 21, 9);
        generalDeviceInfo.hardwareRevision = ByteArrayKt.toString(data, 30, 13);
        byte[] bArr2 = new byte[7];
        System.arraycopy(data, 43, bArr2, 0, 7);
        PnP pnP = new PnP();
        pnP.vendorSource = bArr2[0] & 255;
        pnP.vendorId = ((bArr2[2] & 255) << 8) | (bArr2[1] & 255);
        pnP.productId = ((bArr2[4] & 255) << 8) | (bArr2[3] & 255);
        pnP.productVersion = ((bArr2[6] & 255) << 8) | (bArr2[5] & 255);
        generalDeviceInfo.pnp = pnP;
        generalDeviceInfo.version = data[50] & 255;
        return new DeviceInfo(generalDeviceInfo);
    }
}
