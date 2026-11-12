package defpackage;

import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.wisesecurity.kfs.crypto.cipher.CipherAlg;
import com.huawei.wisesecurity.kfs.crypto.key.KfsKeyPurpose;
import com.huawei.wisesecurity.kfs.crypto.signer.SignAlg;
import com.huawei.wisesecurity.ucs.credential.entity.UcsKeyStoreProvider;
import com.huawei.wisesecurity.ucs_credential.n0;
import java.security.cert.Certificate;

/* JADX INFO: loaded from: classes20.dex */
public class yrk implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ynq f53781a;
    public static final yrk e = new yrk();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f53782b = new Object();

    public void c(String str) throws yqf {
        try {
            if (f53781a.hasAlias(str)) {
                yqi.a("KeyStoreManager", "the alias exists", new Object[0]);
                return;
            }
            try {
                f53781a.generate(new ynn.e().d(str).b(KfsKeyPurpose.PURPOSE_ALL).b(HealthData.ECG).c());
                yqi.a("KeyStoreManager", "generateKeyPair OK", new Object[0]);
            } catch (yob e2) {
                yqi.e("KeyStoreManager", yrf.e(e2, yql.b("generateKeyPair failed, ")), new Object[0]);
                throw new yqf(yrf.e(e2, yql.b("generateKeyPair failed , exception ")));
            }
        } catch (yob e3) {
            yqi.e("KeyStoreManager", yrf.e(e3, yql.b("containsAlias failed, ")), new Object[0]);
            throw new yqf(yrf.e(e3, yql.b("containsAlias failed , exception ")));
        }
    }

    public Certificate[] e(String str) throws yqf {
        try {
            return f53781a.getCertificateChain(str);
        } catch (yob e2) {
            yqi.e("KeyStoreManager", yrf.e(e2, yql.b("getCertificateChain failed, ")), new Object[0]);
            throw new yqf(yrf.e(e2, yql.b("getCertificateChain failed , exception ")));
        }
    }

    public byte[] b(String str, byte[] bArr) throws yqf {
        byte[] bArr2;
        synchronized (f53782b) {
            try {
                try {
                    bArr2 = new yni.a(f53781a.getProvider()).b(CipherAlg.RSA_OAEP).withKeyStoreAlias(str).build().getDecryptHandler().from(bArr).to();
                } catch (yob e2) {
                    yqi.e("KeyStoreManager", "doDecrypt failed, " + e2.getMessage(), new Object[0]);
                    throw new yqf("doDecrypt failed , exception " + e2.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr2;
    }

    @Override // com.huawei.wisesecurity.ucs_credential.n0
    public byte[] a(String str, String str2) throws yqf {
        byte[] bArrSign;
        synchronized (f53782b) {
            try {
                try {
                    bArrSign = new yns.d(f53781a.getProvider()).withAlg(SignAlg.RSA_SHA256_PSS).withKeyStoreAlias(str).build().getSignHandler().from(str2).sign();
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

    public void c(UcsKeyStoreProvider ucsKeyStoreProvider) {
        f53781a = new ynq();
    }
}
