package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class mbw {
    public static int c(int i) {
        return (int) (((((i / 10.0f) - 32.0f) * 50.0f) / 9.0f) + 0.5f);
    }

    public static boolean a() {
        DeviceInfo deviceInfoD = mgg.d("HwTemperatureUtil");
        if (deviceInfoD == null) {
            LogUtil.j("HwTemperatureUtil", "isSupportSyncIconMain deviceInfo is null");
            return false;
        }
        boolean zD = eey.d(deviceInfoD, 29);
        LogUtil.a("HwTemperatureUtil", "isDeviceSportTemperatureMain isSupportTemperature : ", Boolean.valueOf(zD));
        return zD;
    }

    public static boolean d() {
        DeviceInfo deviceInfoD = mgg.d("HwTemperatureUtil");
        if (deviceInfoD == null) {
            LogUtil.j("HwTemperatureUtil", "isSupportSyncIconMain deviceInfo is null");
            return false;
        }
        boolean zD = eey.d(deviceInfoD, 186);
        LogUtil.a("HwTemperatureUtil", "isDeviceSportTempClassificationMain isSupportTempClassification : ", Boolean.valueOf(zD));
        return zD;
    }

    public static boolean b() {
        DeviceInfo deviceInfoD = mgg.d("HwTemperatureUtil");
        if (deviceInfoD == null) {
            LogUtil.j("HwTemperatureUtil", "isSupportSyncIconMain deviceInfo is null");
            return false;
        }
        boolean zD = eey.d(deviceInfoD, 67);
        LogUtil.a("HwTemperatureUtil", "isDeviceSupportTemperatureStudy isSupportTemperatureStudy : ", Boolean.valueOf(zD));
        return zD;
    }

    public static String d(String str) {
        float f;
        try {
            f = ((Float.parseFloat(str) * 9.0f) / 5.0f) + 32.0f;
        } catch (NumberFormatException unused) {
            LogUtil.e("HwTemperatureUtil", "celsiusToFahrenheit, NumberFormatException");
            f = 0.0f;
        }
        return b("0.0").format(f);
    }

    private static DecimalFormat b(String str) {
        DecimalFormat decimalFormat = new DecimalFormat(str);
        decimalFormat.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.ENGLISH));
        return decimalFormat;
    }

    public static DecimalFormat e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwTemperatureUtil", "pattern is null");
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat(str);
        decimalFormat.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.getDefault()));
        return decimalFormat;
    }

    public static String d(float f) {
        return b("0.0").format(((f - 32.0f) * 5.0f) / 9.0f);
    }

    public static String a(String str) {
        float f;
        try {
            f = Float.parseFloat(str);
            LogUtil.a("HwTemperatureUtil", "formatTempValue tempValue : ", str);
            if (f >= 340.0f) {
                f /= 10.0f;
            }
        } catch (NumberFormatException unused) {
            LogUtil.e("HwTemperatureUtil", "celsiusToFahrenheit, NumberFormatException");
            f = 0.0f;
        }
        return b("0.0").format(f);
    }

    public static int[] c(int i, int i2) {
        int i3 = i2 - i;
        int i4 = i3 + 1;
        int[] iArr = new int[i4];
        iArr[0] = i;
        iArr[i3] = i2;
        for (int i5 = 1; i5 < i4; i5++) {
            iArr[i5] = iArr[i5 - 1] + 1;
        }
        return iArr;
    }

    public static int[] a(int i, int i2, boolean z) {
        if (!z) {
            return c(i, i2);
        }
        int i3 = i2 - i;
        int i4 = i3 + 1;
        int[] iArr = new int[i4];
        iArr[0] = i2;
        iArr[i3] = i;
        for (int i5 = 1; i5 < i4; i5++) {
            iArr[i5] = iArr[i5 - 1] - 1;
        }
        return iArr;
    }

    public static float[] b(int i, int i2, boolean z) {
        int[] iArrA = a(i, i2, z);
        int length = iArrA.length;
        float[] fArr = new float[length];
        for (int i3 = 0; i3 < length; i3++) {
            fArr[i3] = (float) (((double) iArrA[i3]) * 0.1d);
        }
        return fArr;
    }

    public static String c(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            return deviceInfo.getDeviceName() + "_" + deviceInfo.getSoftVersion() + "_dbTempStudyStatusKey";
        }
        return "";
    }

    public static String c(String str) {
        return BaseApplication.getAppPackage() + "." + str;
    }
}
