package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes6.dex */
public class mlb {
    public static String a(String str) {
        try {
            return al5.a(MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM).digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
