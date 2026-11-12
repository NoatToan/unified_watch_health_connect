package defpackage;

import android.content.Context;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.entity.UcsKeyStoreProvider;
import com.huawei.wisesecurity.ucs_credential.k;

/* JADX INFO: loaded from: classes20.dex */
public class yqp extends k {
    @Override // com.huawei.wisesecurity.ucs_credential.k
    public byte[] a(Credential credential, Context context) throws yqj {
        try {
            if (yrk.f53781a == null) {
                yrk.e.c((UcsKeyStoreProvider) null);
            }
            byte[] bArrB = yrk.e.b("ucs_alias_rootKey", credential.getKekBytes());
            if (bArrB != null && bArrB.length != 0) {
                return bArrB;
            }
            yqr.b(context);
            yqi.e("KeyStoreParseHandler", "KeyStore doDecrypt failure.", new Object[0]);
            throw new yqj(1020L, "KeyStore doDecrypt failure.");
        } catch (Throwable th) {
            yqr.b(context);
            String str = "decrypt kek get exception : " + th.getMessage();
            throw yra.e("KeyStoreParseHandler", str, new Object[0], 1020L, str);
        }
    }
}
