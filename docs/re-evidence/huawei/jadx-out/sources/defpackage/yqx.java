package defpackage;

import android.content.Context;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import com.huawei.wisesecurity.ucs_credential.k;

/* JADX INFO: loaded from: classes20.dex */
public class yqx extends k {
    @Override // com.huawei.wisesecurity.ucs_credential.k
    public byte[] a(Credential credential, Context context) throws yqj {
        return UcsLib.decryptKek(credential.getKekBytes(), credential.getAlg());
    }
}
