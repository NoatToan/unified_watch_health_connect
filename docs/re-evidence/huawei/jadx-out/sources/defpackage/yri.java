package defpackage;

import com.huawei.wisesecurity.kfs.crypto.cipher.CipherAlg;
import com.huawei.wisesecurity.kfs.crypto.key.KfsKeyPurpose;
import com.huawei.wisesecurity.ucs_credential.n0;

/* JADX INFO: loaded from: classes20.dex */
public class yri implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f53776a = new yri();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f53777c = new Object();
    public static ynj e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f53778b;

    public void a(String str) throws yqf {
        try {
            if (e.hasAlias(str)) {
                yqi.a("KeyStoreManager", "the alias exists", new Object[0]);
                return;
            }
            try {
                e.generate(new ynn(str, 256, KfsKeyPurpose.PURPOSE_CRYPTO));
            } catch (yob e2) {
                yqi.e("KeyStoreManager", yrf.e(e2, yql.b("generateKeyPair failed, ")), new Object[0]);
                throw new yqf(yrf.e(e2, yql.b("generateKeyPair failed , exception ")));
            }
        } catch (yob e3) {
            yqi.e("KeyStoreManager", yrf.e(e3, yql.b("containsAlias failed, ")), new Object[0]);
            throw new yqf(yrf.e(e3, yql.b("containsAlias failed , exception ")));
        }
    }

    public byte[] a(String str, byte[] bArr) throws yqf {
        byte[] bArr2;
        synchronized (f53777c) {
            byte[] bArr3 = this.f53778b;
            if (bArr3 == null || bArr3.length <= 0) {
                throw new yqf("iv must be set before AES encrypt");
            }
            try {
                bArr2 = new ynk.e(e.getProvider()).a(CipherAlg.AES_GCM).c(e.getKey(str)).c(this.f53778b).b().getEncryptHandler().from(bArr).to();
            } catch (yob e2) {
                yqi.e("KeyStoreManager", "AES doEncrypt failed, " + e2.getMessage(), new Object[0]);
                throw new yqf("AES doEncrypt failed , exception " + e2.getMessage());
            }
        }
        return bArr2;
    }

    public byte[] c(String str, byte[] bArr) throws yqf {
        byte[] bArr2;
        synchronized (f53777c) {
            byte[] bArr3 = this.f53778b;
            if (bArr3 == null || bArr3.length <= 0) {
                throw new yqf("iv must be set before AES decrypt");
            }
            try {
                bArr2 = new ynk.e(e.getProvider()).a(CipherAlg.AES_GCM).c(e.getKey(str)).c(this.f53778b).b().getDecryptHandler().from(bArr).to();
            } catch (yob e2) {
                yqi.e("KeyStoreManager", "AES doDecrypt failed, " + e2.getMessage(), new Object[0]);
                throw new yqf("AES doDecrypt failed , exception " + e2.getMessage());
            }
        }
        return bArr2;
    }

    @Override // com.huawei.wisesecurity.ucs_credential.n0
    public byte[] a(String str, String str2) throws yqf {
        return new byte[0];
    }
}
