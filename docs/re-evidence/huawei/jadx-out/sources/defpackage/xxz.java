package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.secure.android.common.intent.IntentUtils;

/* JADX INFO: loaded from: classes46.dex */
public class xxz {
    public static void d(Context context, Intent intent) {
        e(context, intent, null, null);
    }

    public static void e(Context context, Intent intent, Bundle bundle, String str) {
        if (context == null) {
            xnd.d("CommonBase:SafeStartActivityUtil", "startActivity context ==  null .", false);
            return;
        }
        if (intent == null) {
            xnd.d("CommonBase:SafeStartActivityUtil", "startActivity intent ==  null .", false);
            return;
        }
        intent.addFlags(268435456);
        if (IntentUtils.safeStartActivity(context, intent, bundle)) {
            return;
        }
        xnd.d("CommonBase:SafeStartActivityUtil", "safeStartActivityForResultStatic fail", false);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        xnd.d("CommonBase:SafeStartActivityUtil", "startActivity err tag:" + str, false);
    }

    public static void e(Activity activity, Intent intent) {
        c(activity, intent, null, null);
    }

    public static void c(Activity activity, Intent intent, Bundle bundle, String str) {
        if (activity == null) {
            xnd.d("CommonBase:SafeStartActivityUtil", "startActivity activity ==  null .", false);
            return;
        }
        if (intent == null) {
            xnd.d("CommonBase:SafeStartActivityUtil", "startActivity intent ==  null .", false);
            return;
        }
        if (IntentUtils.safeStartActivity(activity, intent, bundle)) {
            return;
        }
        xnd.d("CommonBase:SafeStartActivityUtil", "safeStartActivityForResultStatic fail", false);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        xnd.d("CommonBase:SafeStartActivityUtil", "startActivity err tag:" + str, false);
    }
}
