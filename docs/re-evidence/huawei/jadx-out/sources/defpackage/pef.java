package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.util.LogUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes41.dex */
public final class pef {
    public static byte[] e(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest != null) {
                return bArrDigest;
            }
        } catch (UnsupportedEncodingException e) {
            LogUtil.c("Sha256", "UnsupportedEncodingException", ExceptionUtils.c(e));
        } catch (NoSuchAlgorithmException e2) {
            LogUtil.c("Sha256", "NoSuchAlgorithmException", ExceptionUtils.c(e2));
        }
        return new byte[0];
    }

    public static byte[] d(InputStream inputStream) {
        if (inputStream == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[4096];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i);
            }
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest != null) {
                return bArrDigest;
            }
        } catch (IOException e) {
            LogUtil.c("Sha256", "IOException", ExceptionUtils.c(e));
        } catch (NoSuchAlgorithmException e2) {
            LogUtil.c("Sha256", "NoSuchAlgorithmException", ExceptionUtils.c(e2));
        }
        return new byte[0];
    }

    public static String b(String str) {
        return peg.b(e(str));
    }

    public static String c(InputStream inputStream) {
        return peg.b(d(inputStream));
    }
}
