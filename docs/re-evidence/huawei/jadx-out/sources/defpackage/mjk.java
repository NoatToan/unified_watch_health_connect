package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Base64;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public final class mjk {
    public static String c(String str, String str2) {
        byte[] bArrC = Base64.c(a(str, str2), false);
        if (bArrC == null) {
            return null;
        }
        return new String(bArrC, Charset.forName("UTF-8"));
    }

    public static byte[] a(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            LogUtil.e("secretKey or data isEmpty", new Object[0]);
            return new byte[0];
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(Charset.forName("UTF-8")), "HmacSHA256");
        try {
            Mac mac = Mac.getInstance(secretKeySpec.getAlgorithm());
            mac.init(secretKeySpec);
            return mac.doFinal(bytes);
        } catch (NullPointerException e) {
            LogUtil.e("Hmac init failed: " + ExceptionUtils.c(e), new Object[0]);
            return new byte[0];
        } catch (InvalidKeyException e2) {
            LogUtil.e("InvalidKeyException, ", e2.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e3) {
            LogUtil.e("NoSuchAlgorithmException, ", e3.getMessage());
            return new byte[0];
        } catch (Exception e4) {
            LogUtil.e("Unexpected error: " + ExceptionUtils.c(e4), new Object[0]);
            return new byte[0];
        }
    }
}
