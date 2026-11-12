package defpackage;

import android.content.Context;
import com.xiaomi.passport.sim.SIMInfo;
import com.xiaomi.phonenum.data.AccountCertification;
import com.xiaomi.phonenum.procedure.AccountPhoneNumberSourceFlag;

/* JADX INFO: loaded from: classes11.dex */
public interface roc {
    AccountCertification[] a(Context context, String str, AccountPhoneNumberSourceFlag accountPhoneNumberSourceFlag);

    SIMInfo[] b(Context context, String str, String[] strArr);

    void c(Context context, String str, AccountCertification accountCertification);
}
