package defpackage;

import android.text.TextUtils;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public final class m0t {
    public static String a(String str) {
        FileInputStream fileInputStream;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            File file = new File(str);
            if (file.isFile() && file.exists()) {
                byte[] bArr = new byte[2048];
                MessageDigest messageDigest = MessageDigest.getInstance(p0t.t("ETUQ1"));
                fileInputStream = new FileInputStream(file);
                while (true) {
                    try {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i);
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                String strZ = p0t.z(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    j2t.e(e, Coder.KEY_MD5, "gfm");
                }
                return strZ;
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        try {
            j2t.e(th, Coder.KEY_MD5, "gfm");
            return null;
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e2) {
                    j2t.e(e2, Coder.KEY_MD5, "gfm");
                }
            }
        }
    }

    public static String b(byte[] bArr) {
        return p0t.z(c(bArr, p0t.t("ETUQ1")));
    }

    public static byte[] c(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Throwable th) {
            j2t.e(th, Coder.KEY_MD5, "gmb");
            return null;
        }
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        return p0t.z(f(str));
    }

    public static String e(String str) {
        return p0t.C(g(str));
    }

    public static byte[] f(String str) {
        try {
            return h(str);
        } catch (Throwable th) {
            j2t.e(th, Coder.KEY_MD5, "gmb");
            return new byte[0];
        }
    }

    public static byte[] g(String str) {
        try {
            return h(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return new byte[0];
        }
    }

    public static byte[] h(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance(p0t.t("ETUQ1"));
        messageDigest.update(p0t.n(str));
        return messageDigest.digest();
    }
}
