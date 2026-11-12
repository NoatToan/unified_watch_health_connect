package defpackage;

import android.text.TextUtils;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.secure.android.common.encrypt.rsa.RSAEncrypt;
import com.huawei.secure.android.common.util.SafeBase64;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.californium.elements.util.JceNames;

/* JADX INFO: loaded from: classes13.dex */
public class oqz {
    private static final oqz e = new oqz();
    private volatile Map<String, Key> d = null;

    private oqz() {
    }

    public static oqz d() {
        return e;
    }

    public void a() {
        try {
            if (this.d == null) {
                synchronized (oqz.class) {
                    try {
                        if (this.d == null) {
                            this.d = RSAEncrypt.generateRSAKeyPair(HealthData.ECG);
                            ork.a("RSAEncryptHelper", "init success.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (NoSuchAlgorithmException e2) {
            ork.a("RSAEncryptHelper", "init NoSuchAlgorithmException : ", e2);
        }
    }

    public static PrivateKey c(String str) {
        if (TextUtils.isEmpty(str)) {
            ork.b("RSAEncryptHelper", "privateKeyStr is null !");
            return null;
        }
        try {
            return KeyFactory.getInstance(JceNames.RSA).generatePrivate(new PKCS8EncodedKeySpec(SafeBase64.decode(str, 0)));
        } catch (Exception e2) {
            ork.a("RSAEncryptHelper", "load Key Exception:", e2);
            return null;
        }
    }

    public Map<String, String> a(boolean z) {
        if (this.d == null) {
            a();
        }
        HashMap map = new HashMap();
        String strEncodeToString = SafeBase64.encodeToString(((PrivateKey) this.d.get("privateKey")).getEncoded(), 2);
        String strEncodeToString2 = SafeBase64.encodeToString(((PublicKey) this.d.get("publicKey")).getEncoded(), 2);
        map.put("privateKey", strEncodeToString);
        map.put("publicKey", strEncodeToString2);
        if (z) {
            this.d = null;
            orj.c(new Runnable() { // from class: orc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44398c.a();
                }
            });
        }
        return map;
    }
}
