package defpackage;

import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import java.security.SecureRandom;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class npd {
    public static SecureRandom b() {
        nox.b("SecureRandomFactory", "getSecureRandom", true);
        return EncryptUtil.genSecureRandom();
    }

    public static String a() {
        try {
            byte[] bArr = new byte[18];
            EncryptUtil.genSecureRandom().nextBytes(bArr);
            return nop.a(bArr);
        } catch (Exception e) {
            nox.a("SecureRandomFactory", "Exception:" + e.getClass().getSimpleName(), true);
            return UUID.randomUUID().toString();
        }
    }
}
