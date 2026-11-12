package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class lsp {
    public static String b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("Md5Utils", "encode null");
            return null;
        }
        try {
            byte[] bArrDigest = new byte[0];
            try {
                bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                LogUtil.e("Md5Utils", "encode UnsupportedEncodingException");
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    stringBuffer.append(0);
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused2) {
            LogUtil.e("Md5Utils", "encode NoSuchAlgorithmException");
            return "";
        }
    }
}
