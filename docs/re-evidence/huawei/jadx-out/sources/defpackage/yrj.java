package defpackage;

import android.text.TextUtils;
import com.huawei.wisesecurity.kfs.crypto.key.KeyStoreKeyManager;
import com.huawei.wisesecurity.kfs.crypto.key.KeyStoreProvider;
import com.huawei.wisesecurity.kfs.crypto.key.KfsKeyPurpose;
import com.huawei.wisesecurity.kfs.crypto.signer.SignAlg;
import com.huawei.wisesecurity.ucs.credential.entity.UcsKeyStoreProvider;
import com.huawei.wisesecurity.ucs_credential.n0;
import java.security.cert.Certificate;

/* JADX INFO: loaded from: classes20.dex */
public class yrj implements n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static KeyStoreKeyManager f53780b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f53779a = new yrj();
    public static final Object e = new Object();

    public void d(UcsKeyStoreProvider ucsKeyStoreProvider) throws yqf {
        f53780b = new ynm(TextUtils.equals(ucsKeyStoreProvider.getName(), KeyStoreProvider.ANDROID_KEYSTORE.getName()) ? KeyStoreProvider.ANDROID_KEYSTORE : KeyStoreProvider.HUAWEI_KEYSTORE);
    }

    public void d(String str) throws yqf {
        try {
            if (f53780b.hasAlias(str)) {
                yqi.a("KeyStoreManager", "the alias exists", new Object[0]);
                return;
            }
            try {
                f53780b.generate(new ynn.e().d(str).b(KfsKeyPurpose.PURPOSE_SIGN).b(256).c());
            } catch (yob e2) {
                yqi.e("KeyStoreManager", yrf.e(e2, yql.b("generateKeyPair failed, ")), new Object[0]);
                throw new yqf(yrf.e(e2, yql.b("generateKeyPair failed , exception ")));
            }
        } catch (yob e3) {
            yqi.e("KeyStoreManager", yrf.e(e3, yql.b("containsAlias failed, ")), new Object[0]);
            throw new yqf(yrf.e(e3, yql.b("containsAlias failed , exception ")));
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public static n0 b(UcsKeyStoreProvider ucsKeyStoreProvider) throws yqf {
        KeyStoreKeyManager keyStoreKeyManager = f53780b;
        if (keyStoreKeyManager != null) {
            if (keyStoreKeyManager.getProvider() != (TextUtils.equals(ucsKeyStoreProvider.getName(), KeyStoreProvider.ANDROID_KEYSTORE.getName()) ? KeyStoreProvider.ANDROID_KEYSTORE : KeyStoreProvider.HUAWEI_KEYSTORE)) {
                ((yrj) f53779a).d(ucsKeyStoreProvider);
            }
        } else {
            ((yrj) f53779a).d(ucsKeyStoreProvider);
        }
        return f53779a;
    }

    public Certificate[] b(String str) throws yqf {
        try {
            return f53780b.getCertificateChain(str);
        } catch (yob e2) {
            yqi.e("KeyStoreManager", yrf.e(e2, yql.b("getCertificateChain failed, ")), new Object[0]);
            throw new yqf(yrf.e(e2, yql.b("getCertificateChain failed , exception ")));
        }
    }

    @Override // com.huawei.wisesecurity.ucs_credential.n0
    public byte[] a(String str, String str2) throws yqf {
        byte[] bArrSign;
        synchronized (e) {
            try {
                try {
                    bArrSign = new ynt.b(f53780b.getProvider()).withAlg(SignAlg.ECDSA).withKeyStoreAlias(str).build().getSignHandler().from(str2).sign();
                } catch (yob e2) {
                    yqi.e("KeyStoreManager", "doSign failed, " + e2.getMessage(), new Object[0]);
                    throw new yqf("doSign failed , exception " + e2.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrSign;
    }
}
