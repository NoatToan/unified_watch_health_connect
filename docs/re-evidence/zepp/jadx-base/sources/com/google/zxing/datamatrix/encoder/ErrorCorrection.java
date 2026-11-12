package com.google.zxing.datamatrix.encoder;

import com.baseflow.permissionhandler.m;
import com.huami.account.ui.areas.SelectAreaActivity;
import com.huami.applet.AppletConfig;
import com.huami.ecg.core.model.constant.EcgConst;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.bt.profile.page.PageType;
import it.sauronsoftware.ftp4j.FTPCodes;

/* JADX INFO: loaded from: classes4.dex */
public final class ErrorCorrection {
    private static final int c = 301;
    private static final int[] a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    private static final int[][] b = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, DataTypeSource.SPORT_TYPE_MODERN_DANCE, 166, SelectAreaActivity.REQUEST_SELECT_AREA_ONLY, 248, 116, 255, 110, 61}, new int[]{175, 138, 205, 12, 194, 168, 39, Constant.PLAIN_TEXT_MAX_LENGTH, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, DataTypeSource.SPORT_TYPE_DISCO, 83, DataTypeSource.SPORT_TYPE_MODERN_DANCE}, new int[]{83, com.huami.widget.wheelview.Constant.WEIGHT_DEFAULT_IMPERIAL, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, 225, 48, 90, 188}, new int[]{15, com.huami.widget.wheelview.Constant.WEIGHT_DEFAULT_IMPERIAL, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, PageType.PAGE_SHORTCUT, 79, 108, 82, 27, DataTypeSource.SPORT_TYPE_CHECKERS, DataTypeSource.SPORT_TYPE_DISCO, 172}, new int[]{52, 190, 88, 205, 109, 39, DataTypeSource.SPORT_TYPE_BRIDGE, 21, 155, 197, 251, SelectAreaActivity.REQUEST_SELECT_AREA_ONLY, 155, 21, 5, 172, 254, 124, 12, DataTypeSource.SPORT_TYPE_DOWNHILL, DataTypeSource.SPORT_TYPE_BOULDERING, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, 103, DataTypeSource.SPORT_TYPE_CHECKERS, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, 110, 213, 141, 136, 120, 151, 233, 168, 93, 255}, new int[]{Constant.PLAIN_TEXT_MAX_LENGTH, 127, 242, 218, 130, 250, 162, DataTypeSource.SPORT_TYPE_DOWNHILL, 102, 120, 84, DataTypeSource.SPORT_TYPE_SHOOT, 220, 251, 80, DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING, AppletConfig.DEFAULT_DEVICE_SOURCE, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, DataTypeSource.SPORT_TYPE_BOULDERING, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, Mtu.ATT_MTU_MAX, 105, 122, 2, Constant.PLAIN_TEXT_MAX_LENGTH, 133, 242, 8, 175, 95, 100, 9, 167, 105, FTPCodes.HELP_MESSAGE, 111, 57, 121, 21, 1, PageType.PAGE_SHORTCUT, 57, 54, 101, 248, 202, 69, 50, 150, 177, FTPCodes.DATA_CONNECTION_CLOSING, 5, 9, 5}, new int[]{Constant.PLAIN_TEXT_MAX_LENGTH, 132, 172, SelectAreaActivity.REQUEST_SELECT_AREA_ONLY, 96, 32, 117, 22, 238, 133, 238, 231, 205, 188, 237, 87, DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER, 106, 16, 147, 118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, 138, DataTypeSource.SPORT_TYPE_DISCO, 240, 82, 44, DataTypeSource.SPORT_TYPE_BRIDGE, 87, DataTypeSource.SPORT_TYPE_TAP_DANCE, 147, 160, 175, 69, 213, 92, PageType.PAGE_SHORTCUT, 225, 19}, new int[]{175, 9, SelectAreaActivity.REQUEST_SELECT_AREA_ONLY, 238, 12, 17, 220, 208, 100, 29, 175, 170, FTPCodes.USER_LOGGED_IN, 192, FTPCodes.NAME_SYSTEM_TIME, 235, 150, 159, 36, SelectAreaActivity.REQUEST_SELECT_AREA_ONLY, 38, 200, 132, 54, 228, 146, 218, EcgConst.ECG_FULL_MEASURE_SECOND_TIME, 117, 203, 29, 232, 144, 238, 22, 150, 201, 117, 62, 207, 164, 13, 137, Constant.PLAIN_TEXT_MAX_LENGTH, 127, 67, Mtu.ATT_MTU_MAX, 28, 155, 43, 203, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, m.d, 39, 118, 202, 188, 201, 189, 143, 108, 196, 37, DataTypeSource.SPORT_TYPE_MODERN_DANCE, 112, 134, FTPCodes.USER_LOGGED_IN, Constant.PLAIN_TEXT_MAX_LENGTH, 63, 197, 190, 250, 106, DataTypeSource.SPORT_TYPE_MODERN_DANCE, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, DataTypeSource.SPORT_TYPE_BRIDGE, 170, 4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 11, 204}, new int[]{220, 228, DataTypeSource.SPORT_TYPE_CHESS, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, 213, 136, 248, 180, EcgConst.ECG_FULL_MEASURE_SECOND_TIME, 197, 158, 177, 68, 122, 93, 213, 15, 160, FTPCodes.ENTER_PASSIVE_MODE, 236, 66, 139, 153, DataTypeSource.SPORT_TYPE_MODERN_DANCE, 202, 167, DataTypeSource.SPORT_TYPE_SHOOT, 25, 220, 232, 96, m.d, 231, 136, SelectAreaActivity.REQUEST_SELECT_AREA_ONLY, 239, DataTypeSource.SPORT_TYPE_DOWNHILL, 241, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, DataTypeSource.SPORT_TYPE_DISCO}};
    private static final int[] d = new int[256];
    private static final int[] e = new int[255];

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            e[i2] = i;
            d[i] = i2;
            i <<= 1;
            if (i >= 256) {
                i ^= 301;
            }
        }
    }

    private ErrorCorrection() {
    }

    private static String a(CharSequence charSequence, int i) {
        return b(charSequence, 0, charSequence.length(), i);
    }

    private static String b(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 0;
        while (true) {
            int[] iArr = a;
            if (i4 >= iArr.length) {
                i4 = -1;
                break;
            }
            if (iArr[i4] == i3) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i3)));
        }
        int[] iArr2 = b[i4];
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = 0;
        }
        for (int i6 = i; i6 < i + i2; i6++) {
            int i7 = i3 - 1;
            int iCharAt = cArr[i7] ^ charSequence.charAt(i6);
            while (i7 > 0) {
                if (iCharAt == 0 || iArr2[i7] == 0) {
                    cArr[i7] = cArr[i7 - 1];
                } else {
                    char c2 = cArr[i7 - 1];
                    int[] iArr3 = e;
                    int[] iArr4 = d;
                    cArr[i7] = (char) (c2 ^ iArr3[(iArr4[iCharAt] + iArr4[iArr2[i7]]) % 255]);
                }
                i7--;
            }
            if (iCharAt == 0 || iArr2[0] == 0) {
                cArr[0] = 0;
            } else {
                int[] iArr5 = e;
                int[] iArr6 = d;
                cArr[0] = (char) iArr5[(iArr6[iCharAt] + iArr6[iArr2[0]]) % 255];
            }
        }
        char[] cArr2 = new char[i3];
        for (int i8 = 0; i8 < i3; i8++) {
            cArr2[i8] = cArr[(i3 - i8) - 1];
        }
        return String.valueOf(cArr2);
    }

    public static String encodeECC200(String str, SymbolInfo symbolInfo) {
        if (str.length() != symbolInfo.getDataCapacity()) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb = new StringBuilder(symbolInfo.getDataCapacity() + symbolInfo.getErrorCodewords());
        sb.append(str);
        int interleavedBlockCount = symbolInfo.getInterleavedBlockCount();
        if (interleavedBlockCount == 1) {
            sb.append(a(str, symbolInfo.getErrorCodewords()));
        } else {
            sb.setLength(sb.capacity());
            int[] iArr = new int[interleavedBlockCount];
            int[] iArr2 = new int[interleavedBlockCount];
            int[] iArr3 = new int[interleavedBlockCount];
            int i = 0;
            while (i < interleavedBlockCount) {
                int i2 = i + 1;
                iArr[i] = symbolInfo.getDataLengthForInterleavedBlock(i2);
                iArr2[i] = symbolInfo.getErrorLengthForInterleavedBlock(i2);
                iArr3[i] = 0;
                if (i > 0) {
                    iArr3[i] = iArr3[i - 1] + iArr[i];
                }
                i = i2;
            }
            for (int i3 = 0; i3 < interleavedBlockCount; i3++) {
                StringBuilder sb2 = new StringBuilder(iArr[i3]);
                for (int i4 = i3; i4 < symbolInfo.getDataCapacity(); i4 += interleavedBlockCount) {
                    sb2.append(str.charAt(i4));
                }
                String strA = a(sb2.toString(), iArr2[i3]);
                int i5 = i3;
                int i6 = 0;
                while (i5 < iArr2[i3] * interleavedBlockCount) {
                    sb.setCharAt(symbolInfo.getDataCapacity() + i5, strA.charAt(i6));
                    i5 += interleavedBlockCount;
                    i6++;
                }
            }
        }
        return sb.toString();
    }
}
