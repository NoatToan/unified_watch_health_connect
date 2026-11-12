package defpackage;

import android.util.Base64;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes5.dex */
public final class o5s {
    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM);
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
