package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes13.dex */
public class ote {
    public static <T> String e(T t) {
        if (t == null || t.toString().equals(Constants.NULL)) {
            return "";
        }
        return t.toString().trim();
    }

    public static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            LogUtil.e("DBInteractor", "string2Int exception=", e.getMessage());
            return 0;
        }
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            LogUtil.e("DBInteractor", "parseLong e=", e.getMessage());
            return 0L;
        }
    }

    public static double d(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            LogUtil.e("DBInteractor", "parseDouble e=", e.getMessage());
            return 0.0d;
        }
    }

    public static boolean b(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static String d(String str, String str2, int i) {
        return TextUtils.isEmpty(str2) ? str : paw.c(str, str2, i);
    }
}
