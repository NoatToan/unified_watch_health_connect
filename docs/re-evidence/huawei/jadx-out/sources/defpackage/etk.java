package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class etk {
    public static void e(boolean z, String str, Object... objArr) {
        if (z) {
            LogUtil.d("PDDebug_" + str, objArr);
        } else {
            LogUtil.d("EcologyDevice_" + str, objArr);
        }
    }

    public static void d(boolean z, String str, Object... objArr) {
        if (z) {
            LogUtil.a("PDDebug_" + str, objArr);
        } else {
            LogUtil.a("EcologyDevice_" + str, objArr);
        }
    }

    public static String c(String str) {
        return TextUtils.isEmpty(str) ? str : a(str, 8, 8);
    }

    private static String a(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        if (i >= 0 && i2 >= 0 && length > i + i2) {
            StringBuilder sb = new StringBuilder(str);
            StringBuilder sb2 = new StringBuilder(16);
            for (int i3 = 0; i3 < (length - i) - i2; i3++) {
                sb2.append("*");
            }
            sb.replace(i, length - i2, sb2.toString());
            return sb.toString();
        }
        return "***";
    }
}
