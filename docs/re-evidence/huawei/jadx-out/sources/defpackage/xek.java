package defpackage;

import android.app.Activity;
import android.util.Log;

/* JADX INFO: loaded from: classes20.dex */
public class xek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f52780a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final String[] e = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};

    public static String[] b(int i, String[] strArr, String[] strArr2, String[] strArr3) {
        int i2 = 0;
        if (strArr == null || strArr.length == 0) {
            return new String[0];
        }
        if (strArr2 == null) {
            return new String[0];
        }
        if (strArr3 == null) {
            return new String[0];
        }
        String[] strArr4 = (String[]) strArr.clone();
        if (i < 5) {
            int length = strArr2.length;
            while (true) {
                length--;
                if (length <= strArr2.length - 5) {
                    break;
                }
                strArr4[(strArr.length - 1) - i2] = strArr2[length];
                i2++;
            }
        } else {
            if (i <= strArr.length - 5) {
                Log.e("DatePickerUtils", "error index");
                return strArr4;
            }
            if (strArr3.length >= 5 && strArr4.length >= 5) {
                System.arraycopy(strArr3, 0, strArr4, 0, 5);
            }
        }
        return strArr4;
    }

    public static boolean e(Activity activity) {
        if (activity == null) {
            return false;
        }
        return activity.isInMultiWindowMode();
    }
}
