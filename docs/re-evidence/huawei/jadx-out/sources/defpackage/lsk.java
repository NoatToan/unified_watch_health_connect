package defpackage;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lsk {
    public static int a(String str, int i) {
        if (str == null) {
            LogUtil.e("parseIntCheck", "parseIntCheck value is null");
            return -1;
        }
        try {
            return Integer.parseInt(str, i);
        } catch (NumberFormatException unused) {
            LogUtil.e("parseIntCheck", "parseIntCheck value is invalid :", str);
            return -1;
        }
    }

    public static long b(String str) {
        if (str == null) {
            LogUtil.e("parseIntCheck", "parseLongCheck value is null");
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            LogUtil.e("parseIntCheck", "parseLongCheck value is invalid :", str);
            return -1L;
        }
    }
}
