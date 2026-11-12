package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class vwc {
    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PrivacyWhiteListUtil", "isWhiteUrl currentUrl isEmpty!");
            return false;
        }
        if (str.toLowerCase(Locale.ENGLISH).startsWith("https://") || str.toLowerCase(Locale.ENGLISH).startsWith("http://")) {
            String strC = c(str);
            if (TextUtils.isEmpty(strC)) {
                return false;
            }
            return strC.contains("consumer.huawei.com") || strC.contains("ec.europa.eu") || strC.contains("termstest1.hwcloudtest.cn") || strC.contains("legal.cloud.huawei.com");
        }
        return b(str);
    }

    public static boolean b(String str) {
        return "hwpps://privacy/".equals(str) || Constants.OAID_SETTING_URL.equals(str);
    }

    private static String c(String str) {
        LogUtil.a("PrivacyWhiteListUtil", "getHostByJDK enter");
        try {
            return new URI(str).getHost();
        } catch (URISyntaxException unused) {
            LogUtil.a("PrivacyWhiteListUtil", "getHost error!");
            return null;
        }
    }
}
