package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class p34 {
    public static byte[] a(String str) {
        return r12.e(str);
    }

    public static String b(byte[] bArr) {
        return String.valueOf(r12.i(bArr));
    }

    public static byte[] c(byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        MessageDigest messageDigest = MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM);
        messageDigest.update(bArr);
        return messageDigest.digest();
    }
}
