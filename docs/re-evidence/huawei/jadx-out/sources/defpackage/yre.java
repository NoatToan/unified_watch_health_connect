package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.wisesecurity.kfs.crypto.cipher.CipherAlg;
import com.huawei.wisesecurity.ucs.credential.entity.EcKeyPair;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;

/* JADX INFO: loaded from: classes20.dex */
public class yre {
    public static EcKeyPair b(Context context) throws yqj {
        EcKeyPair.Builder builderNewBuilder = EcKeyPair.newBuilder();
        String strE = yqk.e("ucs_ec_credential_enc_sp_key", "", context);
        if (TextUtils.isEmpty(strE)) {
            throw new yqj(1022L, "no cache key");
        }
        String[] strArrSplit = strE.split(":");
        if (strArrSplit.length != 3) {
            throw new yqj(1022L, "invalid cache key");
        }
        if (yri.e == null) {
            yri.e = new ynj();
        }
        yri yriVar = (yri) yri.f53776a;
        yriVar.a("ucs_aes_alias_rootKey");
        yriVar.f53778b = yqo.a(strArrSplit[0], 2);
        byte[] bArrC = yriVar.c("ucs_aes_alias_rootKey", yqo.a(strArrSplit[1], 10));
        byte[] bArrC2 = yriVar.c("ucs_aes_alias_rootKey", yqo.a(strArrSplit[2], 10));
        builderNewBuilder.publicKey(bArrC);
        builderNewBuilder.privateKey(bArrC2);
        return builderNewBuilder.build();
    }

    public static EcKeyPair e(Context context) throws yqj {
        try {
            return b(context);
        } catch (yqj unused) {
            EcKeyPair ecKeyPairGenerateEcKeyPair = UcsLib.generateEcKeyPair(context);
            if (ecKeyPairGenerateEcKeyPair == null) {
                throw new yqj(1022L, "key is null");
            }
            if (yri.e == null) {
                yri.e = new ynj();
            }
            yri yriVar = (yri) yri.f53776a;
            yriVar.a("ucs_aes_alias_rootKey");
            byte[] bArrB = yol.b(CipherAlg.AES_GCM.getIvLen());
            yriVar.f53778b = bArrB;
            yqk.b("ucs_ec_credential_enc_sp_key", yqo.a(bArrB, 2) + ":" + yqo.a(yriVar.a("ucs_aes_alias_rootKey", ecKeyPairGenerateEcKeyPair.getPublicKey()), 10) + ":" + yqo.a(yriVar.a("ucs_aes_alias_rootKey", ecKeyPairGenerateEcKeyPair.getPrivateKey()), 10), context);
            return ecKeyPairGenerateEcKeyPair;
        }
    }

    public static void e(EcKeyPair ecKeyPair) {
        byte[] privateKey = ecKeyPair.getPrivateKey();
        if (privateKey == null) {
            return;
        }
        int length = privateKey.length;
        for (int i = 0; i < length; i++) {
            privateKey[i] = 0;
        }
    }
}
