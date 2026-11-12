package com.xiaomi.hm.health.bt.profile.base;

import android.bluetooth.BluetoothAdapter;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.MeasureState;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.profile.user.BirthDateExt;
import com.xiaomi.hm.health.bt.profile.user.UserInfoFlag;
import com.xiaomi.hm.health.bt.profile.weight.AmazfitScaleRecordParser;
import com.xiaomi.hm.health.bt.profile.weight.WeightBfsProfile;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes11.dex */
public class ProfileUtils {
    private static final String a = "ProfileUtils";
    private static final int b = -48;
    private static final int c = 56;
    private static final int d = 20;
    private static final int e = 13;

    public static byte[] bytesOfBluetoothAddress(String address) {
        try {
            if (!TextUtils.isEmpty(address) && BluetoothAdapter.checkBluetoothAddress(address)) {
                String[] strArrSplit = address.split(":");
                return new byte[]{(byte) Integer.parseInt(strArrSplit[0], 16), (byte) Integer.parseInt(strArrSplit[1], 16), (byte) Integer.parseInt(strArrSplit[2], 16), (byte) Integer.parseInt(strArrSplit[3], 16), (byte) Integer.parseInt(strArrSplit[4], 16), (byte) Integer.parseInt(strArrSplit[5], 16)};
            }
            return null;
        } catch (Exception e2) {
            Debug.i(a, "convertMacToDeviceId exception:" + e2.getMessage());
            return null;
        }
    }

    public static byte[] bytesOfTime(Calendar cal) {
        short s = (short) cal.get(1);
        byte b2 = (byte) (cal.get(2) + 1);
        byte b3 = (byte) cal.get(5);
        byte b4 = (byte) cal.get(11);
        byte b5 = (byte) cal.get(12);
        byte b6 = (byte) cal.get(13);
        byte b7 = (byte) (cal.get(14) / 4);
        byte timezoneKey = (byte) getTimezoneKey(cal.getTimeZone().getOffset(cal.getTimeInMillis()));
        byte[] bArr = new byte[2];
        GattUtils.writeLE(bArr, 0, s);
        byte b8 = (byte) (cal.get(7) - 1);
        Debug.fi(a, "set date:" + cal);
        Debug.fi(a, "year:" + ((int) s) + ",month:" + ((int) b2) + ",day:" + ((int) b3) + ",hour:" + ((int) b4) + ",min:" + ((int) b5) + ",sec:" + ((int) b6) + ",milliseconds:" + ((int) b7) + ",tz:" + ((int) timezoneKey));
        TimeZone timeZone = cal.getTimeZone();
        int reason = (timeZone.useDaylightTime() && timeZone.inDaylightTime(cal.getTime())) ? AdjustReason.CTS_AR_CHANGE_OF_DST.getReason() : AdjustReason.CTS_AR_NO_CHANGE.getReason();
        return new byte[]{bArr[0], bArr[1], b2, b3, b4, b5, b6, b8, b7, (byte) reason, timezoneKey};
    }

    public static byte[] bytesOfUserInfo(UserInfoExt info) {
        BirthDateExt birthDate = info.getBirthDate();
        short year = birthDate.getYear();
        byte month = birthDate.getMonth();
        byte day = birthDate.getDay();
        short height = info.getHeight();
        int weight = info.getWeight() * 200;
        int uid = (int) info.getUid();
        return new byte[]{UserInfoFlag.PERSON.getValue(), UserInfoFlag.WRITE.getValue(), 0, (byte) (year & 255), (byte) ((year >> 8) & 255), month, day, info.getGender().getValue(), (byte) (height & 255), (byte) ((height >> 8) & 255), (byte) (weight & 255), (byte) ((weight >> 8) & 255), (byte) (uid & 255), (byte) ((uid >> 8) & 255), (byte) ((uid >> 16) & 255), (byte) ((uid >> 24) & 255)};
    }

    public static int compareVersion(String version1, String version2) {
        return getVersionCodeFromVersionName(version1) - getVersionCodeFromVersionName(version2);
    }

    public static byte[] convertMacToDeviceId(String mac) {
        try {
            if (!TextUtils.isEmpty(mac) && BluetoothAdapter.checkBluetoothAddress(mac)) {
                String[] strArrSplit = mac.split(":");
                return new byte[]{(byte) Integer.parseInt(strArrSplit[0], 16), (byte) Integer.parseInt(strArrSplit[1], 16), (byte) Integer.parseInt(strArrSplit[2], 16), -1, -2, (byte) Integer.parseInt(strArrSplit[3], 16), (byte) Integer.parseInt(strArrSplit[4], 16), (byte) Integer.parseInt(strArrSplit[5], 16)};
            }
            return null;
        } catch (Exception e2) {
            Debug.i(a, "convertMacToDeviceId exception:" + e2.getMessage());
            return null;
        }
    }

    public static String cutString(String str, int byteOfLen) {
        if (!TextUtils.isEmpty(str) && byteOfLen > 0) {
            if (str.getBytes().length <= byteOfLen) {
                return str;
            }
            int length = str.length();
            int i = 0;
            while (i <= length) {
                String strSubstring = str.substring(0, i);
                int length2 = strSubstring.getBytes().length;
                if (length2 > byteOfLen) {
                    return i == 0 ? strSubstring : str.substring(0, i - 1);
                }
                if (length2 == byteOfLen) {
                    return strSubstring;
                }
                i++;
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

    public static int getFw1Size(byte[] fwData) {
        return (fwData[19] & 255) | ((fwData[17] & 255) << 16) | ((fwData[16] & 255) << 24) | ((fwData[18] & 255) << 8);
    }

    public static int getFw1Start(byte[] fwData) {
        return (fwData[15] & 255) | ((fwData[12] & 255) << 24) | ((fwData[13] & 255) << 16) | ((fwData[14] & 255) << 8);
    }

    public static boolean getFw1Valid(byte[] fwData) {
        return getFw1Size(fwData) + getFw1Start(fwData) <= fwData.length && getFw1Size(fwData) > 0;
    }

    public static int getFw1Version(byte[] fwData) {
        return (fwData[11] & 255) | ((fwData[10] & 255) << 8) | ((fwData[8] & 255) << 24) | ((fwData[9] & 255) << 16);
    }

    public static int getFw2Size(byte[] fwData) {
        return (fwData[33] & 255) | ((fwData[30] & 255) << 24) | ((fwData[31] & 255) << 16) | ((fwData[32] & 255) << 8);
    }

    public static int getFw2Start(byte[] fwData) {
        return (fwData[29] & 255) | ((fwData[26] & 255) << 24) | ((fwData[27] & 255) << 16) | ((fwData[28] & 255) << 8);
    }

    public static boolean getFw2Valid(byte[] fwData) {
        return getFw2Size(fwData) + getFw2Start(fwData) <= fwData.length && getFw2Size(fwData) > 0;
    }

    public static int getFw2Version(byte[] fwData) {
        return (fwData[25] & 255) | ((fwData[22] & 255) << 24) | ((fwData[23] & 255) << 16) | ((fwData[24] & 255) << 8);
    }

    public static int getTimeZoneKeyWithDST(Calendar cal) {
        return getTimezoneKey(cal.getTimeZone().getOffset(cal.getTimeInMillis()));
    }

    public static TimeZone getTimezone(byte key) {
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.setRawOffset(getTimezoneOffset(key));
        return timeZone;
    }

    public static TimeZone getTimezoneCompatible(byte key) {
        if (key >= b && key <= 56) {
            return getTimezone(key);
        }
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.setRawOffset(key);
        return timeZone;
    }

    public static int getTimezoneKey(int rawOffset) {
        int i = (rawOffset / 1000) / 60;
        int i2 = i < 0 ? -1 : 1;
        int iAbs = Math.abs(i);
        return (((iAbs / 60) * 4) + ((iAbs % 60) / 15)) * i2;
    }

    public static int getTimezoneOffset(int key) {
        Debug.fi(a, "getTimezoneOffset key:" + key);
        if (key == -128) {
            return 28800000;
        }
        int i = key < 0 ? -1 : 1;
        int iAbs = Math.abs(key);
        int i2 = (((iAbs / 4) * 60) + ((iAbs % 4) * 15)) * 60 * 1000 * i;
        Debug.fi(a, "getTimezoneOffset rawOffset:" + i2);
        return i2;
    }

    public static int getVersionCodeFromFwData(byte[] fwData) {
        return (fwData[1056] & 255) | ((fwData[1059] & 255) << 24) | ((fwData[1058] & 255) << 16) | ((fwData[1057] & 255) << 8);
    }

    public static int getVersionCodeFromFwStream(InputStream fis) throws IOException {
        byte[] bArr = new byte[4];
        fis.skip(1056L);
        fis.read(bArr, 0, 4);
        return ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[0] & 255);
    }

    public static int getVersionCodeFromVersionName(String versionName) {
        Debug.i(a, "fw version:" + versionName);
        try {
            String[] strArrSplit = versionName.replaceAll("[a-zA-Z]", "").split("\\.");
            int length = strArrSplit.length;
            if (length == 0) {
                return -1;
            }
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i |= (Integer.parseInt(strArrSplit[i2]) & 255) << (((length - i2) - 1) * 8);
            }
            return i;
        } catch (Exception e2) {
            Debug.i(a, "exception:" + e2.getMessage());
            return -1;
        }
    }

    public static String getVersionNameFromFwStream(InputStream fis) throws IOException {
        byte[] bArr = new byte[6];
        fis.skip(1056L);
        fis.read(bArr, 0, 6);
        return new String(bArr);
    }

    public static boolean isFwValid(byte[] fwData) {
        long j = (((long) (fwData[0] & 255)) << 24) | (((long) (fwData[1] & 255)) << 16) | (((long) (fwData[2] & 255)) << 8) | ((long) (fwData[3] & 255));
        long j2 = (((long) (fwData[12] & 255)) << 24) | (((long) (fwData[13] & 255)) << 16) | (((long) (fwData[14] & 255)) << 8) | ((long) (fwData[15] & 255));
        long j3 = (((long) (fwData[16] & 255)) << 24) | (((long) (fwData[17] & 255)) << 16) | (((long) (fwData[18] & 255)) << 8) | ((long) (fwData[19] & 255));
        long j4 = (((long) (fwData[26] & 255)) << 24) | (((long) (fwData[27] & 255)) << 16) | (((long) (fwData[28] & 255)) << 8) | ((long) (fwData[29] & 255));
        return j == 2020959083 && j2 + j3 <= j4 && j4 + ((((((long) (fwData[31] & 255)) << 16) | (((long) (fwData[30] & 255)) << 24)) | (((long) (fwData[32] & 255)) << 8)) | ((long) (fwData[33] & 255))) <= ((long) fwData.length);
    }

    public static boolean isValidFirmware(DeviceInfo deviceInfo, String version) {
        return deviceInfo != null && compareVersion(deviceInfo.getFirmwareVersionStr(), version) >= 0;
    }

    public static WeightAdvData parseBfsCategoryData(byte[] value, boolean isMeasurement, boolean isHistory) {
        if (value == null || value.length == 0 || value.length < 13) {
            return null;
        }
        return WeightBfsProfile.parseWeightData(value, isMeasurement, isHistory);
    }

    public static WeightAdvData parseWeightData(byte[] value, boolean isMeasurement, boolean isHistory) {
        float f;
        int i;
        if (value.length == 10) {
            if ((value[0] & 255) != 0) {
                float f2 = ((value[2] & 255) << 8) | (value[1] & 255);
                if ((value[2] & 255) == 255 && (value[1] & 255) == 240) {
                    f = f2;
                    i = 0;
                } else {
                    int i2 = value[0] & 17;
                    f = f2 / (i2 == 0 ? 200.0f : 100.0f);
                    i = i2;
                }
                Calendar calendar = Calendar.getInstance(MKTime.INSTANCE.zoneKeyToTimeZone(0));
                calendar.clear();
                boolean z = (value[0] & 32) != 0;
                boolean z2 = (value[0] & 128) != 0;
                boolean z3 = (value[0] & 64) != 0;
                calendar.set(1, (255 & value[3]) | ((value[4] & 255) << 8));
                calendar.set(2, value[5] - 1);
                calendar.set(5, value[6]);
                calendar.set(11, value[7]);
                calendar.set(12, value[8]);
                calendar.set(13, value[9]);
                WeightAdvData weightAdvData = new WeightAdvData(i, f, calendar.getTimeInMillis(), z, isMeasurement, isHistory, z2);
                weightAdvData.setPart(z3);
                Debug.i(a, "WeightAdvData:" + weightAdvData);
                return weightAdvData;
            }
        }
        Debug.i(a, "wrong weight data,ignore!!!");
        return null;
    }

    @Nullable
    public static WeightAdvData parseWeightDataWithState(byte[] value, boolean isMeasurement, boolean isHistory) {
        WeightAdvData single = new AmazfitScaleRecordParser(HMDeviceSource.VDEVICE.getValue(), null).parseSingle(value);
        if (single == null) {
            return null;
        }
        single.setMeasurement(isMeasurement);
        single.setHistory(isHistory);
        single.setStable(single.getMeasureData().measureState() == MeasureState.MEASURING_WEIGHT && single.getMeasureData().measureResult() == 1);
        single.setAmazfitScale(true);
        Debug.i(a, "WeightAdvData:" + single);
        return single;
    }

    public static boolean revertUpgradeSeq(byte[] fwData) {
        return (fwData[7] & 255) == 1;
    }

    public static int getTimezoneKey(TimeZone timeZone) {
        return getTimezoneKey(timeZone.getRawOffset());
    }
}
