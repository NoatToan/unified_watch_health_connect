package wx2;

import android.app.PendingIntent;
import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwx2/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "sms_release"}, k = 1, mv = {1, 4, 1})
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f188013a;

    public b(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f188013a = applicationContext;
    }

    public final a a(String str, String str2) {
        if (!PhoneNumberUtils.isGlobalPhoneNumber(str)) {
            return new a(false, 2, null, 4, null);
        }
        if (TextUtils.isEmpty(str2)) {
            return new a(false, 3, null, 4, null);
        }
        return a7.b.checkSelfPermission(this.f188013a, "android.permission.SEND_SMS") == 0 ? new a(false, null, null, 7, null) : new a(false, 5, null, 4, null);
    }

    public final a b(String str, String str2, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        a aVarA = a(str, str2);
        if (!aVarA.f188010a) {
            return aVarA;
        }
        SmsManager smsManager = SmsManager.getDefault();
        try {
            smsManager.sendMultipartTextMessage(str, null, smsManager.divideMessage(str2), arrayList, null);
            return aVarA;
        } catch (IllegalArgumentException unused) {
            return new a(false, 4, null, 4, null);
        }
    }

    public final a c(String str, String str2, PendingIntent pendingIntent) {
        str.getClass();
        str2.getClass();
        a aVarA = a(str, str2);
        if (!aVarA.f188010a) {
            return aVarA;
        }
        try {
            SmsManager.getDefault().sendTextMessage(str, null, str2, pendingIntent, null);
            return aVarA;
        } catch (IllegalArgumentException unused) {
            return new a(false, 4, null, 4, null);
        }
    }
}
