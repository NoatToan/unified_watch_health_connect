package defpackage;

import android.content.Context;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.passport.sim.SIMInfo;
import com.xiaomi.phonenum.data.AccountCertification;
import com.xiaomi.phonenum.procedure.AccountPhoneNumberSourceFlag;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class deh implements roc {

    public class a implements AccountCertification.Getter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15445a;

        public a(String str) {
            this.f15445a = str;
        }

        @Override // com.xiaomi.phonenum.data.AccountCertification.Getter
        public AccountCertification[] a(Context context, AccountPhoneNumberSourceFlag accountPhoneNumberSourceFlag) {
            return deh.this.a(context, this.f15445a, accountPhoneNumberSourceFlag);
        }
    }

    @Override // defpackage.roc
    public AccountCertification[] a(Context context, String str, AccountPhoneNumberSourceFlag accountPhoneNumberSourceFlag) {
        AccountLogger.log("OtherOsAccountPhoneNumberManager", "call getAccountCertifications sid=" + str + ", flag=" + Integer.toBinaryString(accountPhoneNumberSourceFlag.f14017a));
        ArrayList arrayList = new ArrayList();
        if (accountPhoneNumberSourceFlag.b(2)) {
            AccountLogger.log("OtherOsAccountPhoneNumberManager", "add OperatorAccountCertificationFetcher for flag=" + Integer.toBinaryString(accountPhoneNumberSourceFlag.f14017a));
            arrayList.add(new ibh(str, context.getPackageName()));
        }
        return v80.a(context, (qoc[]) arrayList.toArray(new qoc[0]));
    }

    @Override // defpackage.roc
    public SIMInfo[] b(Context context, String str, String[] strArr) {
        AccountLogger.log("OtherOsAccountPhoneNumberManager", "call getSIMInfos sid=" + str + ", simInfoTypes=" + String.join(",", strArr));
        return SIMInfo.build(context, strArr, new a(str), null);
    }

    @Override // defpackage.roc
    public void c(Context context, String str, AccountCertification accountCertification) {
        AccountLogger.log("OtherOsAccountPhoneNumberManager", "call invalidateAccountCertification sid=" + str + ", accountCertification=" + accountCertification);
        com.xiaomi.phonenum.data.a.c(accountCertification);
    }
}
