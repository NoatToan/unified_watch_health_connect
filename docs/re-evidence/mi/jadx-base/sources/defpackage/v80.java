package defpackage;

import android.content.Context;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.phonenum.data.AccountCertification;
import com.xiaomi.phonenum.data.a;
import com.xiaomi.phonenum.procedure.cert.AccountCertificationFetchException;

/* JADX INFO: loaded from: classes11.dex */
public class v80 {
    public static AccountCertification[] a(Context context, qoc... qocVarArr) {
        int phoneCount = pth.g(context).getPhoneCount();
        AccountCertification[] accountCertificationArr = new AccountCertification[phoneCount];
        for (int i = 0; i < phoneCount; i++) {
            int iA = lno.a(context, i);
            if (iA == -1) {
                AccountLogger.log("AccountCertificationFetchHelper", "getAccountCertifications invalid subId for simIndex=" + i);
            } else if (ccm.a(context, iA)) {
                AccountCertification accountCertificationA = a.a(iA);
                if (accountCertificationA == null) {
                    for (qoc qocVar : qocVarArr) {
                        try {
                            accountCertificationA = qocVar.a(context, iA);
                            a.b(accountCertificationA);
                            break;
                        } catch (AccountCertificationFetchException e) {
                            AccountLogger.log("AccountCertificationFetchHelper", "get AccountCertification failed simIndex=" + i + ", subId=" + iA, e);
                        }
                    }
                }
                accountCertificationArr[i] = accountCertificationA;
            } else {
                AccountLogger.log("AccountCertificationFetchHelper", "getAccountCertifications sim not valid subId=" + iA);
            }
        }
        return accountCertificationArr;
    }
}
