package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.RawDataFromCsafeTreadmill;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class nxn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f43900b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f43901c = false;

    public static double c(int i, int i2) {
        if (i2 == 1) {
            return ((double) i) * 1.609344d;
        }
        if (i2 == 2) {
            return ((double) i) * 0.1d * 1.609344d;
        }
        if (i2 == 3) {
            return ((double) i) * 0.01d * 1.609344d;
        }
        if (i2 == 4) {
            return ((double) i) * 0.001d * 1.609344d;
        }
        if (i2 == 5) {
            return ((double) i) * 3.048E-4d;
        }
        if (i2 == 10) {
            return ((double) i) * 0.003048d;
        }
        if (i2 == 69) {
            return i * 0.0011f;
        }
        switch (i2) {
            case 33:
                return i;
            case 34:
                return ((double) i) * 0.1d;
            case 35:
                return ((double) i) * 0.01d;
            case 36:
                return ((double) i) * 0.001d;
            case 37:
                return ((double) i) * 1.0E-4d;
            default:
                return -1.0d;
        }
    }

    public static double e(int i, int i2) {
        if (i2 != 82 && i2 != 83) {
            switch (i2) {
                case 16:
                    return ((double) i) * 1.609344d;
                case 17:
                    return ((double) i) * 0.1d * 1.609344d;
                case 18:
                    return ((double) i) * 0.01d * 1.609344d;
                default:
                    switch (i2) {
                        case 48:
                            return i;
                        case 49:
                            return ((double) i) * 0.1d;
                        case 50:
                            return ((double) i) * 0.01d;
                        case 51:
                            return ((double) (i * 60)) * 0.001d;
                        default:
                            return -1.0d;
                    }
            }
        }
        return i;
    }

    public static void b() {
        f43901c = true;
        f43900b = true;
    }

    public static void e(byte[] bArr, RawDataFromCsafeTreadmill rawDataFromCsafeTreadmill) {
        if (rawDataFromCsafeTreadmill == null || bArr == null) {
            LogUtil.j("Track_IDEQ_CsafeDataAnalyzer", "analysisCsafeCommand, rawDataFromCsafeTreadmill is null");
            return;
        }
        byte[][] bArrA = a(bArr, bArr.length);
        if (bArrA == null || bArrA.length == 0) {
            return;
        }
        d(rawDataFromCsafeTreadmill, bArrA);
    }

    private static boolean d(RawDataFromCsafeTreadmill rawDataFromCsafeTreadmill, byte[][] bArr) {
        if (rawDataFromCsafeTreadmill == null || bArr == null) {
            LogUtil.j("Track_IDEQ_CsafeDataAnalyzer", "analysisCsafeCommand, rawDataFromCsafeTreadmill is null");
            return false;
        }
        byte b2 = bArr[bArr.length - 1][0];
        for (int i = 0; i <= (b2 & 255); i++) {
            byte[] bArr2 = bArr[i];
            int i2 = (bArr2[bArr2.length - 1] & 255) + 1;
            byte b3 = bArr2[2];
            LogUtil.a("Track_IDEQ_CsafeDataAnalyzer", "getCommandFromCsafe validLength=", Integer.valueOf(i2), "command=", Byte.valueOf(b3));
            if (i2 == 4) {
                int i3 = bArr[i][1] & 15;
                rawDataFromCsafeTreadmill.setStateOfTreadmill(i3);
                if (f43900b) {
                    rawDataFromCsafeTreadmill.setFirstStateOfTm(i3);
                    f43900b = false;
                }
            } else if (e(b3, rawDataFromCsafeTreadmill, bArr, i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean e(byte b2, RawDataFromCsafeTreadmill rawDataFromCsafeTreadmill, byte[][] bArr, int i) {
        if (b2 == -91) {
            return g(rawDataFromCsafeTreadmill, bArr, i);
        }
        if (b2 == -80) {
            c(rawDataFromCsafeTreadmill, bArr, i);
            return false;
        }
        if (b2 != -76) {
            switch (b2) {
                case -96:
                    return e(rawDataFromCsafeTreadmill, bArr, i);
                case -95:
                    return d(rawDataFromCsafeTreadmill, bArr, i);
                case -94:
                    return a(rawDataFromCsafeTreadmill, bArr, i);
                case -93:
                    return b(rawDataFromCsafeTreadmill, bArr, i);
                default:
                    return false;
            }
        }
        return i(rawDataFromCsafeTreadmill, bArr, i);
    }

    private static boolean e(RawDataFromCsafeTreadmill rawDataFromCsafeTreadmill, byte[][] bArr, int i) {
        if (rawDataFromCsafeTreadmill == null || bArr == null || i < 0) {
            LogUtil.j("Track_IDEQ_CsafeDataAnalyzer", "isCommandDistance, rawDataFromCsafeTreadmill is null");
            return false;
        }
        byte[] bArr2 = bArr[i];
        if (bArr2[3] == 3 && bArr2[8] == -14) {
            int i2 = bArr2[4] & 255;
            int i3 = bArr2[5] & 255;
            int i4 = bArr2[6] & 255;
            int i5 = bArr2[1] & 15;
            if (i2 >= 255 || i3 >= 255 || i4 >= 60) {
                LogUtil.a("Track_IDEQ_CsafeDataAnalyzer", "analysisCsafeCommand, get a invalid time:", Integer.valueOf(i2), ":", Integer.valueOf(i3), ":", Integer.valueOf(i4));
                return true;
            }
            if (f43901c && i5 != 7) {
                rawDataFromCsafeTreadmill.setStartSecond(i4, i3, i2);
                f43901c = false;
            }
            if (i5 != 7 && i5 != 2 && i5 != 0 && i5 != 1) {
                rawDataFromCsafeTreadmill.setDuringTime(i4, i3, i2);
            }
            rawDataFromCsafeTreadmill.setStateOfTreadmill(i5);
            if (f43900b) {
                rawDataFromCsafeTreadmill.setFirstStateOfTm(i5);
                f43900b = false;
            }
        }
        return false;
    }

    private static boolean d(RawDataFromCsafeTreadmill rawDataFromCsafeTreadmill, byte[][] bArr, int i) {
        if (rawDataFromCsafeTreadmill == null || bArr == null || i < 0) {
            LogUtil.a("Track_IDEQ_CsafeDataAnalyzer", "isCommandDistance, rawDataFromCsafeTreadmill is null");
            return false;
        }
        byte[] bArr2 = bArr[i];
        if (bArr2[3] == 3 && bArr2[8] == -14) {
            byte b2 = bArr2[6];
            int i2 = bArr2[5] & 255;
            int i3 = bArr2[4] & 255;
            int i4 = bArr2[1] & 15;
            if (i2 >= 255 && i3 >= 255) {
                LogUtil.a("Track_IDEQ_CsafeDataAnalyzer", "analysisCsafeCommand, get a invalid distance FF FF");
                return true;
            }
            if (i4 != 7 && i4 != 2 && i4 != 0 && i4 != 1) {
                rawDataFromCsafeTreadmill.setDistance((i2 * 255) + i3, b2 & 255);
            }
            rawDataFromCsafeTreadmill.setStateOfTreadmill(bArr[i][1] & 15);
            if (f43900b) {
                rawDataFromCsafeTreadmill.setFirstStateOfTm(i4);
                f43900b = false;
            }
        }
        return false;
    }

    private static boolean b(RawDataFromCsafeTreadmill rawDataFromCsafeTreadmill, byte[][] bArr, int i) {
        if (rawDataFromCsafeTreadmill == null || bArr == null || i < 0) {
            LogUtil.a("Track_IDEQ_CsafeDataAnalyzer", "isCommandHearRate, rawDataFromCsafeTreadmill is null");
            return false;
        }
        byte[] bArr2 = bArr[i];
        if (bArr2[3] == 2 && bArr2[7] == -14) {
            int i2 = bArr2[5] & 255;
            int i3 = bArr2[4] & 255;
            int i4 = bArr2[1] & 15;
            LogUtil.a("Track_IDEQ_CsafeDataAnalyzer", "isCommandCalorie calorieHigh=", Integer.valueOf(i2), "calorieLow=", Integer.valueOf(i3), "state=", Integer.valueOf(i4));
            if (i2 >= 255 && i3 >= 255) {
                LogUtil.a("Track_IDEQ_CsafeDataAnalyzer", "analysisCsafeCommand, get a invalid calorie FF FF");
                return true;
            }
            if (i4 != 7 && i4 != 2 && i4 != 0 && i4 != 1) {
                rawDataFromCsafeTreadmill.setCalorie((i2 * 255) + i3);
            }
            rawDataFromCsafeTreadmill.setStateOfTreadmill(bArr[i][1] & 15);
            if (f43900b) {
                rawDataFromCsafeTreadmill.setFirstStateOfTm(i4);
                f43900b = false;
            }
        }
        return false;
    }

    private static void c(RawDataFromCsafeTreadmill rawDataFromCsafeTreadmill, byte[][] bArr, int i) {
        if (rawDataFromCsafeTreadmill == null || bArr == null || i < 0) {
            LogUtil.a("Track_IDEQ_CsafeDataAnalyzer", "isCommandHearRate, rawDataFromCsafeTreadmill is null");
            return;
        }
        byte[] bArr2 = bArr[i];
        if (bArr2[3] == 1 && bArr2[6] == -14) {
            int i2 = bArr2[1] & 15;
            if (i2 != 7 && i2 != 2 && i2 != 0 && i2 != 1) {
                rawDataFromCsafeTreadmill.setHeartRateFromTreadmill(bArr2[4] & 255);
            }
            rawDataFromCsafeTreadmill.setStateOfTreadmill(bArr[i][1] & 15);
            if (f43900b) {
                rawDataFromCsafeTreadmill.setFirstStateOfTm(i2);
                f43900b = false;
            }
        }
    }

    private static boolean g(RawDataFromCsafeTreadmill rawDataFromCsafeTreadmill, byte[][] bArr, int i) {
        if (rawDataFromCsafeTreadmill == null || bArr == null || i < 0) {
            LogUtil.j("Track_IDEQ_CsafeDataAnalyzer", "isCommandPower, rawDataFromCsafeTreadmill is null");
            return false;
        }
        byte[] bArr2 = bArr[i];
        if (bArr2[3] == 3 && bArr2[8] == -14) {
            int i2 = bArr2[5] & 255;
            int i3 = bArr2[4] & 255;
            byte b2 = bArr2[6];
            int i4 = bArr2[1] & 15;
            if (i2 >= 255 && i3 >= 255) {
                LogUtil.a("Track_IDEQ_CsafeDataAnalyzer", "analysisCsafeCommand, get a invalid speed FF FF");
                return true;
            }
            if (i4 != 7 && i4 != 2 && i4 != 0 && i4 != 1) {
                rawDataFromCsafeTreadmill.setSpeed((i2 * 255) + i3, b2 & 255);
            }
            rawDataFromCsafeTreadmill.setStateOfTreadmill(bArr[i][1] & 15);
            if (f43900b) {
                rawDataFromCsafeTreadmill.setFirstStateOfTm(i4);
                f43900b = false;
            }
        }
        return false;
    }

    private static boolean i(RawDataFromCsafeTreadmill rawDataFromCsafeTreadmill, byte[][] bArr, int i) {
        if (rawDataFromCsafeTreadmill == null || bArr == null || i < 0) {
            LogUtil.j("Track_IDEQ_CsafeDataAnalyzer", "isCommandPower, rawDataFromCsafeTreadmill is null");
            return false;
        }
        byte[] bArr2 = bArr[i];
        if (bArr2[3] == 3 && bArr2[8] == -14) {
            int i2 = bArr2[5] & 255;
            int i3 = bArr2[4] & 255;
            byte b2 = bArr2[6];
            int i4 = bArr2[1] & 15;
            if (i2 >= 255 && i3 >= 255) {
                LogUtil.a("Track_IDEQ_CsafeDataAnalyzer", "analysisCsafeCommand, get a invalid power FF FF");
                return true;
            }
            if (i4 != 7 && i4 != 2 && i4 != 0 && i4 != 1) {
                rawDataFromCsafeTreadmill.setPower((i2 * 255) + i3, b2 & 255);
            }
            rawDataFromCsafeTreadmill.setStateOfTreadmill(bArr[i][1] & 15);
            if (f43900b) {
                rawDataFromCsafeTreadmill.setFirstStateOfTm(i4);
                f43900b = false;
            }
        }
        return false;
    }

    private static boolean a(RawDataFromCsafeTreadmill rawDataFromCsafeTreadmill, byte[][] bArr, int i) {
        if (rawDataFromCsafeTreadmill == null || bArr == null || i < 0) {
            LogUtil.j("Track_IDEQ_CsafeDataAnalyzer", "isCommandCreep, rawDataFromCsafeTreadmill is null");
            return false;
        }
        byte[] bArr2 = bArr[i];
        if (bArr2[3] == 3 && bArr2[8] == -14) {
            int i2 = bArr2[5] & 255;
            int i3 = bArr2[4] & 255;
            byte b2 = bArr2[6];
            int i4 = bArr2[1] & 15;
            if (i2 >= 255 && i3 >= 255) {
                LogUtil.a("Track_IDEQ_CsafeDataAnalyzer", "analysisCsafeCommand, get a invalid creep FF FF");
                return true;
            }
            if (i4 != 7 && i4 != 2 && i4 != 0 && i4 != 1) {
                rawDataFromCsafeTreadmill.setCreep((i2 * 255) + i3, b2 & 255);
            }
            rawDataFromCsafeTreadmill.setStateOfTreadmill(bArr[i][1] & 15);
            if (f43900b) {
                rawDataFromCsafeTreadmill.setFirstStateOfTm(i4);
                f43900b = false;
            }
        }
        return false;
    }

    private static byte[][] a(byte[] bArr, int i) {
        if (bArr != null && i > 2) {
            LogUtil.a("Track_IDEQ_CsafeDataAnalyzer", "getValidData data=", Arrays.toString(bArr), "length=", Integer.valueOf(i));
            int i2 = i / 2;
            byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2 + 2, i + 1);
            int i3 = 0;
            int i4 = 0;
            int i5 = -1;
            for (int i6 = 0; i6 < i; i6++) {
                byte b2 = bArr[i6];
                if (b2 == -15 && i5 == -1) {
                    i5 = i6;
                }
                if (i5 != -1) {
                    bArr2[i3][i4] = b2;
                    i4++;
                }
                if (i5 != -1 && bArr[i6] == -14) {
                    bArr2[i3][i] = (byte) (i4 - 1);
                    i3++;
                    i4 = 0;
                    i5 = -1;
                }
            }
            int i7 = i3 - 1;
            bArr2[i2 + 1][0] = (byte) i7;
            if (i7 >= 0) {
                return bArr2;
            }
            return (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 0, 0);
        }
        return (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 0, 0);
    }
}
