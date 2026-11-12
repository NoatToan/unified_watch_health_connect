package com.xiaomi.hm.health.bt.profile.base;

import androidx.annotation.Nullable;
import com.xiaomi.hm.health.bt.debug.Debug;

/* JADX INFO: loaded from: classes11.dex */
public class HardwareInfo {
    public static final int COUNTRY_ABROAD = 1;
    public static final int COUNTRY_INDIA = 2;
    public static final int COUNTRY_INLAND = 8;
    public static final int FACTORY_HB = 1;
    public static final int FACTORY_YG = 3;
    public static final int FACTORY_ZD = 2;
    public static final String TAG = "HardwareInfo";
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    private static int[] a(String hardwareRevision) {
        if (isEmpty(hardwareRevision)) {
            return null;
        }
        if (Character.isLetter(hardwareRevision.codePointAt(0))) {
            hardwareRevision = hardwareRevision.substring(1);
        }
        String[] strArrSplit = hardwareRevision.split("\\.");
        if (strArrSplit != null && strArrSplit.length >= 3) {
            try {
                int length = strArrSplit.length;
                return new int[]{Integer.parseInt(strArrSplit[length - 1]), Integer.parseInt(strArrSplit[length - 2]), Integer.parseInt(strArrSplit[length - 3])};
            } catch (Exception e) {
                Debug.fi(TAG, "getHardwareData exception:" + e.getMessage());
            }
        }
        return null;
    }

    public static boolean isEmpty(@Nullable CharSequence str) {
        return str == null || str.length() == 0;
    }

    public static boolean isIndia(String hardwareRevision) {
        Debug.i(TAG, "parseHardwareInfo:" + hardwareRevision);
        int[] iArrA = a(hardwareRevision);
        return iArrA != null && iArrA.length >= 3 && iArrA[1] == 5 && iArrA[2] == 18;
    }

    public static boolean isInland(String hardwareRevision) {
        Debug.i(TAG, "parseHardwareInfo:" + hardwareRevision);
        int[] iArrA = a(hardwareRevision);
        boolean z = false;
        if (iArrA != null && iArrA.length >= 3) {
            z = ((iArrA[1] == 4 || iArrA[1] == 5) && iArrA[2] == 18) ? false : true;
            Debug.i(TAG, "isInland:" + z);
        }
        return z;
    }

    public static boolean isMiLiCincoMarvel(String hardwareRevision) {
        int[] iArrA = a(hardwareRevision);
        return iArrA != null && iArrA.length > 2 && iArrA[1] == 131 && iArrA[0] == 10;
    }

    public static boolean isMiliCincoHkTw(String hardwareRevision) {
        int[] iArrA = a(hardwareRevision);
        return iArrA != null && iArrA.length > 2 && (iArrA[1] & 240) == 112;
    }

    public static boolean isMiliCincoMainLand(String hardwareRevision) {
        return isMiliMainLand(hardwareRevision);
    }

    public static boolean isMiliCincoOversea(String hardwareRevision) {
        int[] iArrA = a(hardwareRevision);
        return iArrA != null && iArrA.length > 2 && (iArrA[1] & 240) == 16;
    }

    public static boolean isMiliCincoRussia(String hardwareRevision) {
        int[] iArrA = a(hardwareRevision);
        return iArrA != null && iArrA.length > 2 && (iArrA[1] & 240) == 64;
    }

    public static boolean isMiliKongmingMainLand(String hardwareRevision) {
        return isMiliMainLand(hardwareRevision);
    }

    public static boolean isMiliKongmingProHk(String hardwareRevision) {
        int[] iArrA = a(hardwareRevision);
        return iArrA != null && iArrA.length > 2 && (iArrA[1] & 240) == 144;
    }

    public static boolean isMiliKongmingProTw(String hardwareRevision) {
        int[] iArrA = a(hardwareRevision);
        return iArrA != null && iArrA.length > 2 && (iArrA[1] & 240) == 112;
    }

    public static boolean isMiliMainLand(String hardwareRevision) {
        int[] iArrA = a(hardwareRevision);
        return iArrA != null && iArrA.length > 2 && (iArrA[1] & 240) == 128;
    }

    public static boolean isMiliPanguMainLand(String hardwareRevision) {
        return isMiliMainLand(hardwareRevision);
    }

    public static boolean isVultureOversea(String hardwareRevision) {
        int[] iArrA = a(hardwareRevision);
        return iArrA != null && iArrA.length > 2 && (iArrA[1] & 240) == 16;
    }

    public static boolean isYD(String hardwareRevision) {
        Debug.i(TAG, "parseHardwareInfo:" + hardwareRevision);
        int[] iArrA = a(hardwareRevision);
        return iArrA != null && iArrA.length >= 3 && iArrA[0] == 5 && iArrA[1] == 4 && iArrA[2] == 18;
    }

    public static HardwareInfo parseHardwareInfo(String hardwareRevision) {
        Debug.i(TAG, "parseHardwareInfo:" + hardwareRevision);
        int[] iArrA = a(hardwareRevision);
        if (iArrA == null || iArrA.length < 3) {
            return null;
        }
        HardwareInfo hardwareInfo = new HardwareInfo();
        hardwareInfo.setHardwareVersion(iArrA[0] & 15);
        hardwareInfo.setPlatformId((iArrA[0] >> 4) & 15);
        hardwareInfo.setFactoryId(iArrA[1] & 15);
        hardwareInfo.setCountryId((iArrA[1] >> 4) & 15);
        hardwareInfo.setProjectId(iArrA[2]);
        Debug.i(TAG, "parseHardwareInfo:" + hardwareInfo);
        return hardwareInfo;
    }

    public int getCountryId() {
        return this.b;
    }

    public int getFactoryId() {
        return this.c;
    }

    public int getHardwareVersion() {
        return this.e;
    }

    public int getPlatformId() {
        return this.d;
    }

    public int getProjectId() {
        return this.a;
    }

    public void setCountryId(int countryId) {
        this.b = countryId;
    }

    public void setFactoryId(int factoryId) {
        this.c = factoryId;
    }

    public void setHardwareVersion(int hardwareVersion) {
        this.e = hardwareVersion;
    }

    public void setPlatformId(int platformId) {
        this.d = platformId;
    }

    public void setProjectId(int projectId) {
        this.a = projectId;
    }

    public String toString() {
        return "HardwareInfo{projectId=" + this.a + ", countryId=" + this.b + ", factoryId=" + this.c + ", platformId=" + this.d + ", hardwareVersion=" + this.e + '}';
    }

    public boolean isInland() {
        return this.b == 8;
    }
}
