package defpackage;

import android.content.Context;
import com.xiaomi.account.privacy_data.master.PrivacyDataMaster;
import com.xiaomi.account.privacy_data.master.PrivacyDataType;

/* JADX INFO: loaded from: classes11.dex */
public class lno {
    public static int a(Context context, int i) {
        try {
            return Integer.parseInt(PrivacyDataMaster.forceGet(context, PrivacyDataType.SUB_ID, String.valueOf(i)));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
