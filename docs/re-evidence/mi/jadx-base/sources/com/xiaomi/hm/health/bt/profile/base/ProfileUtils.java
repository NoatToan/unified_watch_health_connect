package com.xiaomi.hm.health.bt.profile.base;

import android.bluetooth.BluetoothAdapter;
import android.text.TextUtils;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.profile.user.BirthDateExt;
import com.xiaomi.onetrack.util.z;
import com.xiaomi.smarthome.library.common.util.StringUtil;
import defpackage.g4s;
import defpackage.jms;
import defpackage.p;
import defpackage.qd;
import defpackage.sv;
import defpackage.t5t;
import defpackage.tet;
import defpackage.v;
import defpackage.xk;
import defpackage.zk;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes11.dex */
public class ProfileUtils {
    private static final int BFS_SCALE_WEIGHT_BODY_LENGTH = 13;
    private static final int BT_TIMEZONE_MAX = 56;
    private static final int BT_TIMEZONE_MIN = -48;
    private static final int SCALE_WEIGHT_BODY_LENGTH = 20;
    private static final String TAG = "ProfileUtils";

    public static byte[] bytesOfBluetoothAddress(String str) {
        try {
            if (!TextUtils.isEmpty(str) && BluetoothAdapter.checkBluetoothAddress(str)) {
                String[] strArrSplit = str.split(":");
                return new byte[]{(byte) Integer.parseInt(strArrSplit[0], 16), (byte) Integer.parseInt(strArrSplit[1], 16), (byte) Integer.parseInt(strArrSplit[2], 16), (byte) Integer.parseInt(strArrSplit[3], 16), (byte) Integer.parseInt(strArrSplit[4], 16), (byte) Integer.parseInt(strArrSplit[5], 16)};
            }
            return null;
        } catch (Exception e) {
            t5t.m(TAG, "convertMacToDeviceId exception:" + e.getMessage());
            return null;
        }
    }

    public static byte[] bytesOfTime(Calendar calendar) {
        short s = (short) calendar.get(1);
        byte b2 = (byte) (calendar.get(2) + 1);
        byte b3 = (byte) calendar.get(5);
        byte b4 = (byte) calendar.get(11);
        byte b5 = (byte) calendar.get(12);
        byte b6 = (byte) calendar.get(13);
        byte b7 = (byte) (calendar.get(14) / 4);
        byte timezoneKey = (byte) getTimezoneKey(calendar.getTimeZone().getOffset(calendar.getTimeInMillis()));
        byte[] bArr = new byte[2];
        tet.l(bArr, 0, s);
        byte b8 = (byte) (calendar.get(7) - 1);
        t5t.d(TAG, "set date:" + calendar);
        t5t.d(TAG, "year:" + ((int) s) + ",month:" + ((int) b2) + ",day:" + ((int) b3) + ",hour:" + ((int) b4) + ",min:" + ((int) b5) + ",sec:" + ((int) b6) + ",milliseconds:" + ((int) b7) + ",tz:" + ((int) timezoneKey));
        TimeZone timeZone = calendar.getTimeZone();
        int t = (timeZone.useDaylightTime() && timeZone.inDaylightTime(calendar.getTime())) ? p.CTS_AR_CHANGE_OF_DST.getT() : p.CTS_AR_NO_CHANGE.getT();
        return new byte[]{bArr[0], bArr[1], b2, b3, b4, b5, b6, b8, b7, (byte) t, timezoneKey};
    }

    public static byte[] bytesOfUserInfo(UserInfoExt userInfoExt) {
        BirthDateExt birthDate = userInfoExt.getBirthDate();
        short year = birthDate.getYear();
        byte month = birthDate.getMonth();
        byte day = birthDate.getDay();
        short height = userInfoExt.getHeight();
        int weight = userInfoExt.getWeight() * 200;
        int uid = (int) userInfoExt.getUid();
        return new byte[]{sv.PERSON.a(), sv.WRITE.a(), 0, (byte) (year & 255), (byte) ((year >> 8) & 255), month, day, userInfoExt.getGender().getValue(), (byte) (height & 255), (byte) ((height >> 8) & 255), (byte) (weight & 255), (byte) ((weight >> 8) & 255), (byte) (uid & 255), (byte) ((uid >> 8) & 255), (byte) ((uid >> 16) & 255), (byte) ((uid >> 24) & 255)};
    }

    public static int compareVersion(String str, String str2) {
        return getVersionCodeFromVersionName(str) - getVersionCodeFromVersionName(str2);
    }

    public static byte[] convertMacToDeviceId(String str) {
        try {
            if (!TextUtils.isEmpty(str) && BluetoothAdapter.checkBluetoothAddress(str)) {
                String[] strArrSplit = str.split(":");
                return new byte[]{(byte) Integer.parseInt(strArrSplit[0], 16), (byte) Integer.parseInt(strArrSplit[1], 16), (byte) Integer.parseInt(strArrSplit[2], 16), -1, -2, (byte) Integer.parseInt(strArrSplit[3], 16), (byte) Integer.parseInt(strArrSplit[4], 16), (byte) Integer.parseInt(strArrSplit[5], 16)};
            }
            return null;
        } catch (Exception e) {
            t5t.m(TAG, "convertMacToDeviceId exception:" + e.getMessage());
            return null;
        }
    }

    public static String cutString(String str, int i) {
        if (!TextUtils.isEmpty(str) && i > 0) {
            if (str.getBytes().length <= i) {
                return str;
            }
            int length = str.length();
            int i2 = 0;
            while (i2 <= length) {
                String strSubstring = str.substring(0, i2);
                int length2 = strSubstring.getBytes().length;
                if (length2 > i) {
                    return i2 == 0 ? strSubstring : str.substring(0, i2 - 1);
                }
                if (length2 == i) {
                    return strSubstring;
                }
                i2++;
            }
        }
        return null;
    }

    public static int getDstOffset(Calendar calendar) {
        TimeZone timeZone = calendar.getTimeZone();
        if (timeZone.inDaylightTime(calendar.getTime())) {
            return timeZone.getDSTSavings();
        }
        return 0;
    }

    public static int getFw1Size(byte[] bArr) {
        return (bArr[19] & 255) | ((bArr[17] & 255) << 16) | ((bArr[16] & 255) << 24) | ((bArr[18] & 255) << 8);
    }

    public static int getFw1Start(byte[] bArr) {
        return (bArr[15] & 255) | ((bArr[12] & 255) << 24) | ((bArr[13] & 255) << 16) | ((bArr[14] & 255) << 8);
    }

    public static boolean getFw1Valid(byte[] bArr) {
        return getFw1Size(bArr) + getFw1Start(bArr) <= bArr.length && getFw1Size(bArr) > 0;
    }

    public static int getFw1Version(byte[] bArr) {
        return (bArr[11] & 255) | ((bArr[10] & 255) << 8) | ((bArr[8] & 255) << 24) | ((bArr[9] & 255) << 16);
    }

    public static int getFw2Size(byte[] bArr) {
        return (bArr[33] & 255) | ((bArr[30] & 255) << 24) | ((bArr[31] & 255) << 16) | ((bArr[32] & 255) << 8);
    }

    public static int getFw2Start(byte[] bArr) {
        return (bArr[29] & 255) | ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8);
    }

    public static boolean getFw2Valid(byte[] bArr) {
        return getFw2Size(bArr) + getFw2Start(bArr) <= bArr.length && getFw2Size(bArr) > 0;
    }

    public static int getFw2Version(byte[] bArr) {
        return (bArr[25] & 255) | ((bArr[22] & 255) << 24) | ((bArr[23] & 255) << 16) | ((bArr[24] & 255) << 8);
    }

    public static int getTimeZoneKeyWithDST(Calendar calendar) {
        return getTimezoneKey(calendar.getTimeZone().getOffset(calendar.getTimeInMillis()));
    }

    public static TimeZone getTimezone(byte b2) {
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.setRawOffset(getTimezoneOffset(b2));
        return timeZone;
    }

    public static TimeZone getTimezoneCompatible(byte b2) {
        if (b2 >= -48 && b2 <= 56) {
            return getTimezone(b2);
        }
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.setRawOffset(b2);
        return timeZone;
    }

    public static int getTimezoneKey(int i) {
        int i2 = (i / 1000) / 60;
        int i3 = i2 < 0 ? -1 : 1;
        int iAbs = Math.abs(i2);
        return (((iAbs / 60) * 4) + ((iAbs % 60) / 15)) * i3;
    }

    public static int getTimezoneOffset(int i) {
        t5t.d(TAG, "getTimezoneOffset key:" + i);
        if (i == -128) {
            return 28800000;
        }
        int i2 = i < 0 ? -1 : 1;
        int iAbs = Math.abs(i);
        int i3 = (((iAbs / 4) * 60) + ((iAbs % 4) * 15)) * 60000 * i2;
        t5t.d(TAG, "getTimezoneOffset rawOffset:" + i3);
        return i3;
    }

    public static int getVersionCodeFromFwData(byte[] bArr) {
        return (bArr[1056] & 255) | ((bArr[1059] & 255) << 24) | ((bArr[1058] & 255) << 16) | ((bArr[1057] & 255) << 8);
    }

    public static int getVersionCodeFromFwStream(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4];
        inputStream.skip(1056L);
        inputStream.read(bArr, 0, 4);
        return ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[0] & 255);
    }

    public static int getVersionCodeFromVersionName(String str) {
        t5t.m(TAG, "fw version:" + str);
        try {
            String[] strArrSplit = str.replaceAll(StringUtil.CHAR_ENGLISH, "").split(z.f14007a);
            int length = strArrSplit.length;
            if (length == 0) {
                return -1;
            }
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i |= (Integer.parseInt(strArrSplit[i2]) & 255) << (((length - i2) - 1) * 8);
            }
            return i;
        } catch (Exception e) {
            t5t.m(TAG, "exception:" + e.getMessage());
            return -1;
        }
    }

    public static String getVersionNameFromFwStream(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[6];
        inputStream.skip(1056L);
        inputStream.read(bArr, 0, 6);
        return new String(bArr);
    }

    public static boolean isFwValid(byte[] bArr) {
        long j = (((long) (bArr[0] & 255)) << 24) | (((long) (bArr[1] & 255)) << 16) | (((long) (bArr[2] & 255)) << 8) | ((long) (bArr[3] & 255));
        long j2 = (((long) (bArr[12] & 255)) << 24) | (((long) (bArr[13] & 255)) << 16) | (((long) (bArr[14] & 255)) << 8) | ((long) (bArr[15] & 255));
        long j3 = (((long) (bArr[16] & 255)) << 24) | (((long) (bArr[17] & 255)) << 16) | (((long) (bArr[18] & 255)) << 8) | ((long) (bArr[19] & 255));
        long j4 = (((long) (bArr[26] & 255)) << 24) | (((long) (bArr[27] & 255)) << 16) | (((long) (bArr[28] & 255)) << 8) | ((long) (bArr[29] & 255));
        return j == 2020959083 && j2 + j3 <= j4 && j4 + ((((((long) (bArr[31] & 255)) << 16) | (((long) (bArr[30] & 255)) << 24)) | (((long) (bArr[32] & 255)) << 8)) | ((long) (bArr[33] & 255))) <= ((long) bArr.length);
    }

    public static boolean isValidFirmware(g4s g4sVar, String str) {
        return g4sVar != null && compareVersion(g4sVar.e0(), str) >= 0;
    }

    public static WeightAdvData parseBfsCategoryData(byte[] bArr, boolean z, boolean z2) {
        if (bArr == null || bArr.length == 0 || bArr.length < 13) {
            return null;
        }
        return jms.H1(bArr, z, z2);
    }

    public static WeightAdvData parseWeightData(byte[] bArr, boolean z, boolean z2) {
        int i;
        if (bArr.length == 10) {
            byte b2 = bArr[0];
            if ((b2 & 255) != 0) {
                byte b3 = bArr[2];
                byte b4 = bArr[1];
                float f = ((b3 & 255) << 8) | (b4 & 255);
                if ((b3 & 255) == 255 && (b4 & 255) == 240) {
                    i = 0;
                } else {
                    int i2 = b2 & 17;
                    f /= i2 == 0 ? 200.0f : 100.0f;
                    i = i2;
                }
                float f2 = f;
                Calendar calendar = Calendar.getInstance(xk.f39201a.a(0));
                calendar.clear();
                byte b5 = bArr[0];
                boolean z3 = (b5 & 32) != 0;
                boolean z4 = (b5 & 128) != 0;
                boolean z5 = (b5 & 64) != 0;
                calendar.set(1, ((bArr[4] & 255) << 8) | (bArr[3] & 255));
                calendar.set(2, bArr[5] - 1);
                calendar.set(5, bArr[6]);
                calendar.set(11, bArr[7]);
                calendar.set(12, bArr[8]);
                calendar.set(13, bArr[9]);
                WeightAdvData weightAdvData = new WeightAdvData(i, f2, calendar.getTimeInMillis(), z3, z, z2, z4);
                weightAdvData.setPart(z5);
                t5t.m(TAG, "WeightAdvData:" + weightAdvData);
                return weightAdvData;
            }
        }
        t5t.m(TAG, "wrong weight data,ignore!!!");
        return null;
    }

    public static WeightAdvData parseWeightDataWithState(byte[] bArr, boolean z, boolean z2) {
        WeightAdvData weightAdvDataB = new v(qd.v.b(), null).b(bArr);
        if (weightAdvDataB == null) {
            return null;
        }
        weightAdvDataB.setMeasurement(z);
        weightAdvDataB.setHistory(z2);
        weightAdvDataB.setStable(weightAdvDataB.getMeasureData().g() == zk.MEASURING_WEIGHT && weightAdvDataB.getMeasureData().f() == 1);
        weightAdvDataB.setAmazfitScale(true);
        t5t.m(TAG, "WeightAdvData:" + weightAdvDataB);
        return weightAdvDataB;
    }

    public static boolean revertUpgradeSeq(byte[] bArr) {
        return (bArr[7] & 255) == 1;
    }

    public static int getTimezoneKey(TimeZone timeZone) {
        return getTimezoneKey(timeZone.getRawOffset());
    }
}
