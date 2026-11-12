package defpackage;

import android.graphics.Color;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.nfc.utils.HostUtils;
import com.xiaomi.fitness.pay.export.data.response.OrderStatus;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class pf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f30342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f30343b;
    public static String c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f30344k;
    public static int l;
    public static int m;
    public static String[][] n;

    static {
        f30342a = new File("/data/system/server_testing").exists() || new File("/sdcard/server_testing").exists();
        f30343b = "url";
        c = "title";
        d = 11;
        e = Color.parseColor("#bababa");
        f = Color.parseColor("#f0f0f0");
        g = 0;
        h = 1;
        i = 2;
        j = 3;
        f30344k = 0;
        l = 1;
        m = 2;
        n = new String[][]{new String[]{"正在跳转到小米钱包", "正在跳轉到小米錢包", "Loading"}, new String[]{"确定", "確定", "OK"}, new String[]{"取消", "取消", OrderStatus.CANCEL}, new String[]{"请打开相机权限", "請打開相機權限", "Please open camera permission"}};
    }

    public static String a() {
        String str = String.format("%s/html/nfc_faq/index.html?locale=%s#/doorcard.md", HostUtils.INSTANCE.getOperationHost(), LocaleUtil.getCurrentLocale());
        fpe.d("getTransFaq  url:" + str);
        return str;
    }

    public static String b() {
        String str = String.format("%s/html/nfc_faq/index.html?locale=%s#/", HostUtils.INSTANCE.getOperationHost(), LocaleUtil.getCurrentLocale());
        fpe.d("getFaq  url:" + str);
        return str;
    }

    public static String c(String str) {
        String str2 = String.format("%s/html/lingnantong_faq/index.html?locale=%s", HostUtils.INSTANCE.getOperationHost(), str);
        fpe.d("LntFAQ  url:" + str2);
        return str2;
    }

    public static String d(String str, String str2, String str3) {
        String str4 = String.format("%s/html/overseas-bank/index.html?model=%s&locale=%s&region=%s", HostUtils.INSTANCE.getOperationHost(), str, str2, str3);
        fpe.d("master card support bank list url:" + str4);
        return str4;
    }

    public static String e(String str, String str2) {
        String str3 = String.format("%s/html/privacy/index.html?type=watch_privacy_policy&model=%s&locale=%s", HostUtils.INSTANCE.getOperationHost(), str, str2);
        fpe.d("master card proto url:" + str3);
        return str3;
    }

    public static String f(String str, String str2) {
        String str3 = String.format("%s/html/privacy/index.html?type=watch_user_license&model=%s&locale=%s", HostUtils.INSTANCE.getOperationHost(), str, str2);
        fpe.d("master card user license url:" + str3);
        return str3;
    }

    public static String g(int i2) {
        if (n.length < i2) {
            return "";
        }
        Locale locale = Locale.getDefault();
        if (locale.equals(Locale.SIMPLIFIED_CHINESE)) {
            return n[i2][f30344k];
        }
        return locale.equals(Locale.TRADITIONAL_CHINESE) ? n[i2][l] : n[i2][m];
    }

    public static String h() {
        String str = String.format("%s/html/nfc_faq/index.html?locale=%s#/buscard.md", HostUtils.INSTANCE.getOperationHost(), LocaleUtil.getCurrentLocale());
        fpe.d("getTransFaq  url:" + str);
        return str;
    }
}
