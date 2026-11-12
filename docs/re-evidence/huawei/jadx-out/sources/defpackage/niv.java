package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HEXUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes11.dex */
public class niv {
    public static String e(String str) {
        return a("SHA-256", str);
    }

    private static String a(String str, String str2) {
        try {
            return HEXUtils.a(MessageDigest.getInstance(str).digest(str2.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("ShaCryptUtils", "encode UnsupportedEncodingException code:", str);
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            LogUtil.e("ShaCryptUtils", "encode NoSuchAlgorithmException code:", str);
            return null;
        }
    }
}
