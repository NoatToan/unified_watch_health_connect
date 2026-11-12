package defpackage;

import android.content.Context;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.entity.EcKeyPair;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import com.huawei.wisesecurity.ucs_credential.k;

/* JADX INFO: loaded from: classes20.dex */
public class yrv extends k {
    @Override // com.huawei.wisesecurity.ucs_credential.k
    public byte[] a(Credential credential, Context context) throws yqj {
        try {
            String[] strArrSplit = credential.getKekString().split(":");
            if (strArrSplit.length < 3) {
                yqi.e("KeyStoreECIESParseHandler", "EC kek doDecrypt failure. kek string invalid", new Object[0]);
                throw new yqj(1020L, "EC kek doDecrypt failure. kek string invalid");
            }
            byte[] bArrA = yqo.a(strArrSplit[0], 0);
            byte[] bArrA2 = yqo.a(strArrSplit[1], 0);
            byte[] bArrA3 = yqo.a(strArrSplit[2], 0);
            EcKeyPair ecKeyPairB = yre.b(context);
            byte[] bArrDecryptKekWithEc = UcsLib.decryptKekWithEc(bArrA3, 1, bArrA, bArrA2, ecKeyPairB.getPrivateKey());
            if (bArrDecryptKekWithEc == null || bArrDecryptKekWithEc.length == 0) {
                yqi.e("KeyStoreECIESParseHandler", "KeyStore doDecrypt failure.", new Object[0]);
                throw new yqj(1020L, "KeyStore doDecrypt failure.");
            }
            yre.e(ecKeyPairB);
            return bArrDecryptKekWithEc;
        } catch (yqj e) {
            if (credential.getKekVersion() == 6) {
                yqr.a(context);
            } else {
                yqk.e("ucs_ec_huks_sp_key_t", 0, context);
            }
            StringBuilder sbB = yql.b("decrypt kek get exception : ");
            sbB.append(e.getMessage());
            String string = sbB.toString();
            throw yra.e("KeyStoreECIESParseHandler", string, new Object[0], 1020L, string);
        }
    }
}
