package org.apache.commons.lang3;

import com.google.common.base.Ascii;
import org.apache.commons.lang3.math.NumberUtils;

/* JADX INFO: loaded from: classes3.dex */
public enum JavaVersion {
    JAVA_0_9(1.5f, "0.9"),
    JAVA_1_1(1.1f, "1.1"),
    JAVA_1_2(1.2f, "1.2"),
    JAVA_1_3(1.3f, "1.3"),
    JAVA_1_4(1.4f, "1.4"),
    JAVA_1_5(1.5f, "1.5"),
    JAVA_1_6(1.6f, "1.6"),
    JAVA_1_7(1.7f, "1.7"),
    JAVA_1_8(1.8f, "1.8"),
    JAVA_1_9(9.0f, "9"),
    JAVA_9(9.0f, "9"),
    JAVA_10(10.0f, "10"),
    JAVA_11(11.0f, "11"),
    JAVA_12(12.0f, "12"),
    JAVA_13(13.0f, "13"),
    JAVA_14(14.0f, "14"),
    JAVA_15(15.0f, "15"),
    JAVA_16(16.0f, "16"),
    JAVA_17(17.0f, "17"),
    JAVA_RECENT(maxVersion(), Float.toString(maxVersion()));

    private final String name;
    private final float value;

    JavaVersion(float f14, String str) {
        this.value = f14;
        this.name = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static JavaVersion get(String str) {
        if (str == null) {
            return null;
        }
        byte b14 = -1;
        switch (str.hashCode()) {
            case 57:
                if (str.equals("9")) {
                    b14 = 0;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    b14 = 1;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    b14 = 2;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    b14 = 3;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    b14 = 4;
                }
                break;
            case 1571:
                if (str.equals("14")) {
                    b14 = 5;
                }
                break;
            case 1572:
                if (str.equals("15")) {
                    b14 = 6;
                }
                break;
            case 1573:
                if (str.equals("16")) {
                    b14 = 7;
                }
                break;
            case 1574:
                if (str.equals("17")) {
                    b14 = 8;
                }
                break;
            case 47611:
                if (str.equals("0.9")) {
                    b14 = 9;
                }
                break;
            case 48564:
                if (str.equals("1.1")) {
                    b14 = 10;
                }
                break;
            case 48565:
                if (str.equals("1.2")) {
                    b14 = Ascii.VT;
                }
                break;
            case 48566:
                if (str.equals("1.3")) {
                    b14 = Ascii.FF;
                }
                break;
            case 48567:
                if (str.equals("1.4")) {
                    b14 = Ascii.CR;
                }
                break;
            case 48568:
                if (str.equals("1.5")) {
                    b14 = Ascii.SO;
                }
                break;
            case 48569:
                if (str.equals("1.6")) {
                    b14 = Ascii.SI;
                }
                break;
            case 48570:
                if (str.equals("1.7")) {
                    b14 = Ascii.DLE;
                }
                break;
            case 48571:
                if (str.equals("1.8")) {
                    b14 = 17;
                }
                break;
        }
        switch (b14) {
            case 0:
                return JAVA_9;
            case 1:
                return JAVA_10;
            case 2:
                return JAVA_11;
            case 3:
                return JAVA_12;
            case 4:
                return JAVA_13;
            case 5:
                return JAVA_14;
            case 6:
                return JAVA_15;
            case 7:
                return JAVA_16;
            case 8:
                return JAVA_17;
            case 9:
                return JAVA_0_9;
            case 10:
                return JAVA_1_1;
            case 11:
                return JAVA_1_2;
            case 12:
                return JAVA_1_3;
            case 13:
                return JAVA_1_4;
            case 14:
                return JAVA_1_5;
            case 15:
                return JAVA_1_6;
            case 16:
                return JAVA_1_7;
            case 17:
                return JAVA_1_8;
            default:
                float floatVersion = toFloatVersion(str);
                if (((double) floatVersion) - 1.0d < 1.0d) {
                    int iMax = Math.max(str.indexOf(46), str.indexOf(44));
                    if (Float.parseFloat(str.substring(iMax + 1, Math.max(str.length(), str.indexOf(44, iMax)))) > 0.9f) {
                        return JAVA_RECENT;
                    }
                } else if (floatVersion > 10.0f) {
                    return JAVA_RECENT;
                }
                return null;
        }
    }

    public static JavaVersion getJavaVersion(String str) {
        return get(str);
    }

    private static float maxVersion() {
        float floatVersion = toFloatVersion(System.getProperty("java.specification.version", "99.0"));
        if (floatVersion > 0.0f) {
            return floatVersion;
        }
        return 99.0f;
    }

    private static float toFloatVersion(String str) {
        if (!str.contains(".")) {
            return NumberUtils.toFloat(str, -1.0f);
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 2) {
            return -1.0f;
        }
        return NumberUtils.toFloat(strArrSplit[0] + '.' + strArrSplit[1], -1.0f);
    }

    public boolean atLeast(JavaVersion javaVersion) {
        return this.value >= javaVersion.value;
    }

    public boolean atMost(JavaVersion javaVersion) {
        return this.value <= javaVersion.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
