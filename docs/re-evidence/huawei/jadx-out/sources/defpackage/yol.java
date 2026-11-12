package defpackage;

import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes20.dex */
public final class yol {
    public static SecureRandom c() {
        EncryptUtil.setBouncycastleFlag(true);
        return EncryptUtil.genSecureRandom();
    }

    public static byte[] b(int i) {
        EncryptUtil.setBouncycastleFlag(true);
        return EncryptUtil.generateSecureRandom(i);
    }
}
