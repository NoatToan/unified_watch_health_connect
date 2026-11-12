package com.xmlywind.wire.okio;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.nfc.applet.ISeCommandKt;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.UnsupportedEncodingException;
import org.threeten.bp.a;

/* JADX INFO: loaded from: classes22.dex */
final class Base64 {
    private static final byte[] MAP = {65, a.l, a.m, a.n, a.o, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, RaceType.CMD_NEED_RESP, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, ISeCommandKt.RPDU_NEED_JUDGE, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, HMDisplaySetting.TYPE_OSPREY_W, 50, HMDisplaySetting.TYPE_VENICE, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_MAP = {65, a.l, a.m, a.n, a.o, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, RaceType.CMD_NEED_RESP, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, ISeCommandKt.RPDU_NEED_JUDGE, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, HMDisplaySetting.TYPE_OSPREY_W, 50, HMDisplaySetting.TYPE_VENICE, 52, 53, 54, 55, 56, 57, 45, 95};

    private Base64() {
    }

    public static byte[] decode(String str) {
        int i;
        char cCharAt;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                i = cCharAt2 - 'A';
            } else if (cCharAt2 >= 'a' && cCharAt2 <= 'z') {
                i = cCharAt2 - 'G';
            } else if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else {
                if (cCharAt2 == '/' || cCharAt2 == '_') {
                    i = 63;
                } else if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i5 = (i5 << 6) | ((byte) i);
            i3++;
            if (i3 % 4 == 0) {
                int i7 = i4 + 1;
                bArr[i4] = (byte) (i5 >> 16);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (i5 >> 8);
                bArr[i8] = (byte) i5;
                i4 = i8 + 1;
            }
        }
        int i9 = i3 % 4;
        if (i9 != 1) {
            if (i9 == 2) {
                bArr[i4] = (byte) ((i5 << 12) >> 16);
                i4++;
            } else if (i9 == 3) {
                int i10 = i5 << 6;
                int i11 = i4 + 1;
                bArr[i4] = (byte) (i10 >> 16);
                i4 = i11 + 1;
                bArr[i11] = (byte) (i10 >> 8);
            }
            if (i4 == i2) {
                return bArr;
            }
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, 0, bArr2, 0, i4);
            return bArr2;
        }
        return null;
    }

    public static String encode(byte[] bArr) {
        return encode(bArr, MAP);
    }

    private static String encode(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) * 4) / 3];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int i3 = i + 1;
            bArr3[i] = bArr2[(bArr[i2] & 255) >> 2];
            int i4 = i3 + 1;
            int i5 = i2 + 1;
            bArr3[i3] = bArr2[((bArr[i2] & 3) << 4) | ((bArr[i5] & 255) >> 4)];
            int i6 = i4 + 1;
            int i7 = (bArr[i5] & 15) << 2;
            int i8 = i2 + 2;
            bArr3[i4] = bArr2[i7 | ((bArr[i8] & 255) >> 6)];
            i = i6 + 1;
            bArr3[i6] = bArr2[bArr[i8] & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i9 = i + 1;
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(bArr[length] & 3) << 4];
            int i11 = i10 + 1;
            byte b = (byte) 61;
            bArr3[i10] = b;
            i = i11 + 1;
            bArr3[i11] = b;
        } else if (length2 == 2) {
            int i12 = i + 1;
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            int i13 = i12 + 1;
            int i14 = (bArr[length] & 3) << 4;
            int i15 = length + 1;
            bArr3[i12] = bArr2[((bArr[i15] & 255) >> 4) | i14];
            int i16 = i13 + 1;
            bArr3[i13] = bArr2[(bArr[i15] & 15) << 2];
            i = i16 + 1;
            bArr3[i16] = (byte) 61;
        }
        try {
            return new String(bArr3, 0, i, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static String encodeUrl(byte[] bArr) {
        return encode(bArr, URL_MAP);
    }
}
