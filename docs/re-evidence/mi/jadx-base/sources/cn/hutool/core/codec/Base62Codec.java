package cn.hutool.core.codec;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.p8i;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class Base62Codec implements Serializable {
    private static final byte[] GMP = {48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, APDUConstants.TAG_MORE_DATA, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    private static final byte[] INVERTED = {48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, APDUConstants.TAG_MORE_DATA, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
    private static final int STANDARD_BASE = 256;
    private static final int TARGET_BASE = 62;
    private static final long serialVersionUID = 1;
    private final byte[] alphabet;
    private final byte[] lookup = new byte[256];

    public Base62Codec(byte[] bArr) {
        this.alphabet = bArr;
        for (int i = 0; i < bArr.length; i++) {
            this.lookup[bArr[i]] = (byte) (i & 255);
        }
    }

    private byte[] convert(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(estimateOutputLength(bArr.length, i, i2));
        byte[] byteArray = bArr;
        while (true) {
            if (byteArray.length <= 0) {
                break;
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(byteArray.length);
            int i3 = 0;
            for (byte b2 : byteArray) {
                int i4 = (b2 & 255) + (i3 * i);
                i3 = i4 % i2;
                int i5 = (i4 - i3) / i2;
                if (byteArrayOutputStream2.size() > 0 || i5 > 0) {
                    byteArrayOutputStream2.write(i5);
                }
            }
            byteArrayOutputStream.write(i3);
            byteArray = byteArrayOutputStream2.toByteArray();
        }
        for (int i6 = 0; i6 < bArr.length - 1 && bArr[i6] == 0; i6++) {
            byteArrayOutputStream.write(0);
        }
        return p8i.h(byteArrayOutputStream.toByteArray());
    }

    public static Base62Codec createGmp() {
        return new Base62Codec(GMP);
    }

    public static Base62Codec createInverted() {
        return new Base62Codec(INVERTED);
    }

    private int estimateOutputLength(int i, int i2, int i3) {
        return (int) Math.ceil((Math.log(i2) / Math.log(i3)) * ((double) i));
    }

    private byte[] translate(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = bArr2[bArr[i]];
        }
        return bArr3;
    }

    public byte[] decode(byte[] bArr) {
        return convert(translate(bArr, this.lookup), 62, 256);
    }

    public byte[] encode(byte[] bArr) {
        return translate(convert(bArr, 256, 62), this.alphabet);
    }
}
