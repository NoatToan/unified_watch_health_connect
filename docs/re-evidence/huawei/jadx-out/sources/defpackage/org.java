package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.aes.AesCbc;
import com.huawei.secure.android.common.encrypt.keystore.aes.AesCbcKS;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.util.SafeBase64;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes13.dex */
public class org {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static org f44400b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, ore> f44401a = new ConcurrentHashMap<>();

    private org() {
    }

    public static org e() {
        if (f44400b == null) {
            f44400b = new org();
        }
        return f44400b;
    }

    public void b(orh orhVar) {
        String strB = orhVar.b();
        if (this.f44401a.containsKey(strB)) {
            return;
        }
        byte[] bArrE = e(orhVar);
        ore oreVar = new ore();
        oreVar.c(orhVar);
        oreVar.e(bArrE);
        ork.a("WorkKeyManager", "applyWorkKey workKeyAlias: " + strB);
        this.f44401a.put(strB, oreVar);
    }

    public String d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            ork.b("WorkKeyManager", "encrypt content is empty");
            return "";
        }
        byte[] bArrE = e(str2);
        if (ord.d(bArrE)) {
            ork.b("WorkKeyManager", "encrypt WorkKey is empty");
            return "";
        }
        String strEncrypt = AesCbc.encrypt(str, bArrE);
        if (!TextUtils.isEmpty(strEncrypt)) {
            return strEncrypt;
        }
        ork.b("WorkKeyManager", "encrypt failed");
        return "";
    }

    public String c(String str, String str2) {
        String strDecrypt;
        if (TextUtils.isEmpty(str)) {
            ork.b("WorkKeyManager", "decrypt content is empty");
            return str;
        }
        byte[] bArrE = e(str2);
        if (ord.d(bArrE)) {
            ork.b("WorkKeyManager", "decrypt WorkKey is empty");
            return str;
        }
        try {
            strDecrypt = AesCbc.decrypt(str, bArrE);
        } catch (RuntimeException e) {
            ork.a("WorkKeyManager", "decrypt -- RuntimeException:", e);
            strDecrypt = null;
        }
        if (!TextUtils.isEmpty(strDecrypt)) {
            return strDecrypt;
        }
        ork.b("WorkKeyManager", "decrypt failed");
        return str;
    }

    private byte[] e(String str) {
        ore oreVar = this.f44401a.get(str);
        if (oreVar == null || oreVar.a() == null) {
            return null;
        }
        if (!ord.d(oreVar.d())) {
            return oreVar.d();
        }
        byte[] bArrE = e(oreVar.a());
        oreVar.e(bArrE);
        this.f44401a.put(str, oreVar);
        return bArrE;
    }

    private byte[] e(orh orhVar) {
        Context contextC = orhVar.c();
        String strB = orhVar.b();
        String strD = orhVar.d();
        String strA = orhVar.a();
        String strC = contextC != null ? orw.c(contextC, strB, "", strD) : null;
        boolean zIsEmpty = TextUtils.isEmpty(strC);
        ork.a("WorkKeyManager", "getWorkKeyFromSP cacheWorkKeyIsEmpty: " + zIsEmpty);
        if (!zIsEmpty) {
            try {
                String strA2 = a(strC, strA);
                boolean zIsEmpty2 = TextUtils.isEmpty(strA2);
                ork.a("WorkKeyManager", "getWorkKeyFromSP decryptWorkKeyIsEmpty: " + zIsEmpty2);
                if (!zIsEmpty2) {
                    byte[] bArrDecode = SafeBase64.decode(strA2, 0);
                    if (!ord.d(bArrDecode)) {
                        ork.a("WorkKeyManager", "getWorkKeyFromSP decode form cache succeed");
                        return bArrDecode;
                    }
                }
            } catch (Exception e) {
                ork.a("WorkKeyManager", "getWorkKeyFromSP error", e);
            }
        }
        byte[] bArrA = a();
        orw.d(contextC, strB, e(SafeBase64.encodeToString(bArrA, 0), strA), strD);
        ork.e("WorkKeyManager", "generate work key success");
        return bArrA;
    }

    private byte[] a() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128, EncryptUtil.genSecureRandom());
            return keyGenerator.generateKey().getEncoded();
        } catch (NoSuchAlgorithmException e) {
            ork.a("WorkKeyManager", "generate workkey fail.", e);
            return new byte[0];
        }
    }

    private String e(String str, String str2) {
        try {
            return AesCbcKS.encrypt(str2, str);
        } catch (ProviderException e) {
            ork.a("WorkKeyManager", "encryptWorkKey ProviderException: ", e);
            return "";
        }
    }

    private String a(String str, String str2) {
        try {
            return AesCbcKS.decrypt(str2, str);
        } catch (Exception e) {
            ork.a("WorkKeyManager", "decryptWorkKey Exception: ", e);
            return "";
        }
    }
}
